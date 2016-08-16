package ru.sbt.socialnetwork.audiostorage;

import ru.sbt.socialnetwork.domain.Audio;

/**
 * Created by Никита on 16.08.2016.
 */
public interface AudioStorage {

    boolean loadAudio(Audio audio);

}
