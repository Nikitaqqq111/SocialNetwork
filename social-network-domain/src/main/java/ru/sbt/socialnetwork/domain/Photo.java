package ru.sbt.socialnetwork.domain;

import java.util.Date;

/**
 * Created by Никита on 15.08.2016.
 */
public class Photo extends Resource {

    private final String photoId;

    public Photo(String photoId, byte[] resource, Date dateCreate, Profile createBy, String info) {
        super(resource, dateCreate, createBy, info);
        this.photoId = photoId;
    }

    public String getPhotoId() {
        return photoId;
    }
}
