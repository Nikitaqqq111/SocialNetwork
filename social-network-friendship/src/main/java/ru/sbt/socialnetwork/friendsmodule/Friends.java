package ru.sbt.socialnetwork.friendsmodule;

import ru.sbt.socialnetwork.domain.Profile;

/**
 * Created by Никита on 16.08.2016.
 */
public interface Friends {
    boolean addFriends(Profile whom, Profile who);
}
