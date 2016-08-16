package ru.sbt.socialnetwork.domain;

import java.util.Date;

/**
 * Created by Никита on 15.08.2016.
 */
public class Video extends Resource {

    private final String videoId;

    public Video(String videoId, byte[] resource, Date dateCreate, Profile createBy, String info) {
        super(resource, dateCreate, createBy, info);
        this.videoId = videoId;
    }

    public String getVideoId() {
        return videoId;
    }
}
