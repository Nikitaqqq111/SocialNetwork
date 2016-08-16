package ru.sbt.socialnetwork.server;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.sbt.socialnetwork.audiostorage.AudioStorage;
import ru.sbt.socialnetwork.domain.*;
import ru.sbt.socialnetwork.friendsmodule.Friends;
import ru.sbt.socialnetwork.messagestorage.MessageStorage;
import ru.sbt.socialnetwork.photostorage.PhotoStorage;
import ru.sbt.socialnetwork.videostorage.VideoStorage;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Никита on 16.08.2016.
 */

@RunWith(MockitoJUnitRunner.class)
public class ServerImplTest {

    Server server;

    @Mock
    MessageStorage messageStorage;

    @Mock
    Friends friends;

    @Mock
    PhotoStorage photoStorage;

    @Mock
    VideoStorage videoStorage;

    @Mock
    AudioStorage audioStorage;

    @Before
    public void setUp() throws Exception {
        server = new ServerImpl(messageStorage, friends, photoStorage, videoStorage, audioStorage);
    }

    @Test
    public void loadMessage() throws Exception {
        when(messageStorage.loadMessage(null)).thenReturn(false);
        assertFalse(server.loadMessage(null));
        Message message = null;
        when(messageStorage.loadMessage(message)).thenReturn(true);
        assertTrue(server.loadMessage(message));
    }

    @Test(expected = IllegalArgumentException.class)
    public void loadAudio() throws Exception {
        doThrow(IllegalArgumentException.class).when(audioStorage).loadAudio(null);
        server.loadAudio(null);
        Audio audio = null;
        when(audioStorage.loadAudio(audio)).thenReturn(true).thenReturn(false);
        assertTrue(server.loadAudio(audio));
        assertFalse(server.loadAudio(audio));
    }

    @Test(expected = IllegalArgumentException.class)
    public void loadVideo() throws Exception {
        Video video = null;
        server.loadVideo(video);
        verify(videoStorage).loadVideo(video);
        doThrow(IllegalArgumentException.class).when(videoStorage).loadVideo(null);
        server.loadVideo(null);
    }

    @Test
    public void loadPhoto() throws Exception {
        when(photoStorage.loadPhoto(null)).thenReturn(false);
        assertFalse(server.loadPhoto(null));
        Photo photo = null;
        when(photoStorage.loadPhoto(photo)).thenReturn(true);
        assertTrue(server.loadPhoto(photo));
    }

    @Test
    public void addFriend() throws Exception {
        Profile whom = null, who = null;
        server.addFriend(whom, who);
        verify(friends).addFriends(whom, who);
    }

}