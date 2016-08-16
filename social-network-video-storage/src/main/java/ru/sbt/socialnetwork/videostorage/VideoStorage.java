package ru.sbt.socialnetwork.videostorage;

import ru.sbt.socialnetwork.domain.Video;

/**
 * Created by Никита on 16.08.2016.
 */
public interface VideoStorage {

    boolean loadVideo(Video video);

}
