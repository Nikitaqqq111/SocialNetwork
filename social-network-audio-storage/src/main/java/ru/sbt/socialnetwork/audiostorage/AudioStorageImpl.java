package ru.sbt.socialnetwork.audiostorage;

import ru.sbt.socialnetwork.domain.Audio;

import java.util.List;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class AudioStorageImpl implements AudioStorage {

    private final Map<String, List<Audio>> audios;

    public AudioStorageImpl(Map<String, List<Audio>> audios) {
        this.audios = audios;
    }

    @Override
    public boolean loadAudio(Audio audio) {
        return audios.get(audio.getCreateBy().getProfileId()).add(audio);
    }
}
