package org.athiefaine.tidying.guard_clause.then.tripservice.trip;


import org.athiefaine.tidying.guard_clause.then.tripservice.exception.UserNotLoggedInException;
import org.athiefaine.tidying.guard_clause.then.tripservice.user.User;
import org.athiefaine.tidying.guard_clause.then.tripservice.user.UserSession;

import java.util.ArrayList;
import java.util.List;

public class TripService {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		User loggedUser = getLoggedInUser();
        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }

		boolean isFriend = isFriend(user, loggedUser);

		List<Trip> tripList = new ArrayList<>();
        if (isFriend) {
            tripList = tripsBy(user);
        }
        return tripList;
    }

	private boolean isFriend(User user, User loggedUser) {
		boolean isFriend = false;
		for (User friend : user.getFriends()) {
			if (friend.equals(loggedUser)) {
				isFriend = true;
				break;
			}
		}
		return isFriend;
	}

	protected List<Trip> tripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}

	protected User getLoggedInUser() {
		return UserSession.getInstance().getLoggedUser();
	}

}
