package ru.sbt.socialnetwork.server;

import ru.sbt.socialnetwork.audiostorage.AudioStorage;
import ru.sbt.socialnetwork.domain.*;
import ru.sbt.socialnetwork.friendsmodule.Friends;
import ru.sbt.socialnetwork.messagestorage.MessageStorage;
import ru.sbt.socialnetwork.photostorage.PhotoStorage;
import ru.sbt.socialnetwork.videostorage.VideoStorage;

/**
 * Created by Никита on 16.08.2016.
 */
public class ServerImpl implements Server {

    private final MessageStorage messageStorage;
    private final Friends friends;
    private final PhotoStorage photoStorage;
    private final VideoStorage videoStorage;
    private final AudioStorage audioStorage;

    public ServerImpl(MessageStorage messageStorage, Friends friends, PhotoStorage photoStorage, VideoStorage videoStorage, AudioStorage audioStorage) {
        this.messageStorage = messageStorage;
        this.friends = friends;
        this.photoStorage = photoStorage;
        this.videoStorage = videoStorage;
        this.audioStorage = audioStorage;
    }

    @Override
    public boolean loadMessage(Message message) {
        return messageStorage.loadMessage(message);
    }

    @Override
    public boolean loadAudio(Audio audio) {
        return audioStorage.loadAudio(audio);
    }

    @Override
    public boolean loadVideo(Video video) {
        return videoStorage.loadVideo(video);
    }

    @Override
    public boolean loadPhoto(Photo photo) {
        return photoStorage.loadPhoto(photo);
    }

    @Override
    public boolean addFriend(Profile whom, Profile who) {
        return friends.addFriends(whom, who);
    }

}
