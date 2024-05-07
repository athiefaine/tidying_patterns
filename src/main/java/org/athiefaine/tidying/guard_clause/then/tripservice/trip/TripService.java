package org.athiefaine.tidying.guard_clause.then.tripservice.trip;


import org.athiefaine.tidying.guard_clause.then.tripservice.exception.UserNotLoggedInException;
import org.athiefaine.tidying.guard_clause.then.tripservice.user.User;
import org.athiefaine.tidying.guard_clause.then.tripservice.user.UserSession;

import java.util.ArrayList;
import java.util.List;

public class TripService {

	public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException {
		List<Trip> tripList = new ArrayList<Trip>();
		User loggedUser = getLoggedInUser();
		boolean isFriend = false;

        if (loggedUser == null) {
            throw new UserNotLoggedInException();
        }

        for (User friend : user.getFriends()) {
            if (friend.equals(loggedUser)) {
                isFriend = true;
                break;
            }
        }

        if (isFriend) {
            tripList = tripsBy(user);
        }
        return tripList;
    }

	protected List<Trip> tripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}

	protected User getLoggedInUser() {
		return UserSession.getInstance().getLoggedUser();
	}

}
