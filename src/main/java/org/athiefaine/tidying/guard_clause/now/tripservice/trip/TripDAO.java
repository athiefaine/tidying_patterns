package org.athiefaine.tidying.guard_clause.now.tripservice.trip;


import org.athiefaine.tidying.guard_clause.now.tripservice.exception.CollaboratorCallException;
import org.athiefaine.tidying.guard_clause.now.tripservice.user.User;

import java.util.List;

public class TripDAO {

	public static List<Trip> findTripsByUser(User user) {
		throw new CollaboratorCallException(
				"TripDAO should not be invoked on an unit test.");
	}
	
}