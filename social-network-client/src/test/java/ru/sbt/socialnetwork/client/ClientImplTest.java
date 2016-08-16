package ru.sbt.socialnetwork.client;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import ru.sbt.socialnetwork.domain.Photo;
import ru.sbt.socialnetwork.domain.Video;
import ru.sbt.socialnetwork.server.Server;
import ru.sbt.socialnetwork.validator.NoSuchProfileException;
import ru.sbt.socialnetwork.validator.Validator;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by Никита on 16.08.2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class ClientImplTest {

    Client client;

    @Mock
    Validator validator;

    @Mock
    Server server;

    @Before
    public void setUp() throws Exception {
        client = new ClientImpl(validator, server);
    }

    @Test
    public void addPhoto() throws Exception {
        client.addPhoto(null, "qqqq");
    }

    @Test(expected = NoSuchProfileException.class)
    public void addPhoto1() throws Exception {
        Photo photo = null;
        doThrow(NoSuchProfileException.class).when(validator).validate(null, null);
        client.addPhoto(photo, null);
    }

    @Test
    public void addVideo() throws Exception {
        Video video = null;
        when(server.loadVideo(null)).thenReturn(true).thenReturn(false).thenReturn(true);
        assertTrue(client.addVideo(video, null));
        assertFalse(client.addVideo(video, null));
        assertTrue(client.addVideo(video, null));
    }

}