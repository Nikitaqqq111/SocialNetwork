package ru.sbt.socialnetwork.videostorage;

import ru.sbt.socialnetwork.domain.Video;

import java.util.List;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class VideoStorageImpl implements VideoStorage {

    private final Map<String, List<Video>> videos;

    public VideoStorageImpl(Map<String, List<Video>> videos) {
        this.videos = videos;
    }

    @Override
    public boolean loadVideo(Video video) {
        return videos.get(video.getCreateBy().getProfileId()).add(video);
    }

}
