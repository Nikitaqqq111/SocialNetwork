package ru.sbt.socialnetwork.photostorage;

import ru.sbt.socialnetwork.domain.Photo;

import java.util.List;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class PhotoStorageImpl implements PhotoStorage {

    private final Map<String, List<Photo>> photos;

    public PhotoStorageImpl(Map<String, List<Photo>> photos) {
        this.photos = photos;
    }

    @Override
    public boolean loadPhoto(Photo photo) {
        return photos.get(photo.getCreateBy().getProfileId()).add(photo);
    }

}
