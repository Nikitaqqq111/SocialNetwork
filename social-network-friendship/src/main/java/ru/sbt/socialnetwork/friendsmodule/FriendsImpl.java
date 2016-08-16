package ru.sbt.socialnetwork.friendsmodule;

import ru.sbt.socialnetwork.domain.Profile;

import java.util.List;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class FriendsImpl implements Friends{

    public FriendsImpl(Map<String, List<Profile>> friends) {
        this.friends = friends;
    }

    private final Map<String, List<Profile>> friends;

    @Override
    public boolean addFriends(Profile whom, Profile who) {
        return false;
    }

}
