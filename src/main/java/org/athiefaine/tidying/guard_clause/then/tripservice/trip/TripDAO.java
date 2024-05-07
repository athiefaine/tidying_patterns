package org.athiefaine.tidying.guard_clause.then.tripservice.trip;


import org.athiefaine.tidying.guard_clause.then.tripservice.exception.CollaboratorCallException;
import org.athiefaine.tidying.guard_clause.then.tripservice.user.User;

import java.util.List;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new CollaboratorCallException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}