package ru.sbt.socialnetwork.domain;

import java.util.Date;

/**
 * Created by Никита on 15.08.2016.
 */
public class Audio extends Resource {

    private String audioId;

    public Audio(String audioId, byte[] resource, Date dateCreate, Profile createBy, String info) {
        super(resource, dateCreate, createBy, info);
        this.audioId = audioId;
    }

    public String getAudioId() {
        return audioId;
    }
}
