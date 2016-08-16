package ru.sbt.socialnetwork.photostorage;

import ru.sbt.socialnetwork.domain.Photo;

/**
 * Created by Никита on 16.08.2016.
 */
public interface PhotoStorage {

    boolean loadPhoto(Photo photo);

}
