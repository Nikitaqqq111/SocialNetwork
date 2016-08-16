package ru.sbt.socialnetwork.messagestorage;

import ru.sbt.socialnetwork.domain.Message;

/**
 * Created by Никита on 16.08.2016.
 */
public interface MessageStorage {

    boolean loadMessage(Message message);

}
