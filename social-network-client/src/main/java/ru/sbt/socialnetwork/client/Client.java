package ru.sbt.socialnetwork.client;

import ru.sbt.socialnetwork.domain.*;

/**
 * Created by Никита on 16.08.2016.
 */
public interface Client {

    boolean addPhoto(Photo photo, String password);

    boolean addVideo(Video video, String password);

    boolean addAudio(Audio audio, String password);

    boolean addFriend(Profile whom, Profile who, String password);

    boolean createMessage(Message message, String password);

}
