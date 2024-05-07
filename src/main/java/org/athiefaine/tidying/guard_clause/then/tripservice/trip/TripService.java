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

        if (user.isFriendWith(loggedUser)) {
            return tripsBy(user);
        }
        return noTrips();
    }

	protected User getLoggedInUser() {
		return UserSession.getInstance().getLoggedUser();
	}

	protected List<Trip> tripsBy(User user) {
		return TripDAO.findTripsByUser(user);
	}

	private ArrayList<Trip> noTrips() {
		return new ArrayList<>();
	}

}
