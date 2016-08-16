package ru.sbt.socialnetwork.server;

import ru.sbt.socialnetwork.domain.*;

/**
 * Created by Никита on 16.08.2016.
 */
public interface Server {

    boolean loadMessage(Message message);

    boolean loadAudio(Audio audio);

    boolean loadVideo(Video video);

    boolean loadPhoto(Photo photo);

    boolean addFriend(Profile whom, Profile who);

}
