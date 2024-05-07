package org.athiefaine.tidying.guard_clause.then.tripservice.user;

import org.athiefaine.tidying.guard_clause.then.tripservice.trip.Trip;

import java.util.ArrayList;
import java.util.List;

public class User {

	private final List<Trip> trips = new ArrayList<>();
	private final List<User> friends = new ArrayList<>();
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void addFriend(User user) {
		friends.add(user);
	}

	public void addTrip(Trip trip) {
		trips.add(trip);
	}
	
	public List<Trip> trips() {
		return trips;
	}

    public boolean isFriendWith(User loggedUser) {
        boolean isFriend = false;
        for (User friend : getFriends()) {
            if (friend.equals(loggedUser)) {
                isFriend = true;
                break;
            }
        }
        return isFriend;
    }
}
