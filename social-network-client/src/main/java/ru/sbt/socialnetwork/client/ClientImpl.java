package ru.sbt.socialnetwork.client;

import ru.sbt.socialnetwork.domain.*;
import ru.sbt.socialnetwork.server.Server;
import ru.sbt.socialnetwork.validator.Validator;

/**
 * Created by Никита on 16.08.2016.
 */
public class ClientImpl implements Client {

    private final Validator validator;
    private final Server server;

    public ClientImpl(Validator validator, Server server) {
        this.validator = validator;
        this.server = server;
    }

    @Override
    public boolean addPhoto(Photo photo, String password) {
        if (photo == null) {
            validator.validate(null, password);
        } else {
            validator.validate(photo.getCreateBy(), password);
        }
        return server.loadPhoto(photo);
    }

    @Override
    public boolean addVideo(Video video, String password) {
        if (video == null) {
            validator.validate(null, password);
        } else {
            validator.validate(video.getCreateBy(), password);
        }
        return server.loadVideo(video);
    }

    @Override
    public boolean addAudio(Audio audio, String password) {
        validator.validate(audio.getCreateBy(), password);
        return server.loadAudio(audio);
    }

    @Override
    public boolean addFriend(Profile whom, Profile who, String password) {
        validator.validate(whom, password);
        return server.addFriend(whom, who);
    }

    @Override
    public boolean createMessage(Message message, String password) {
        validator.validate(message.getFrom(), password);
        return server.loadMessage(message);
    }

}
