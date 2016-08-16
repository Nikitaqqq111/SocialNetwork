package ru.sbt.socialnetwork.messagestorage;

import ru.sbt.socialnetwork.domain.Message;

import java.util.List;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class MessageStorageImpl implements MessageStorage {

    private final Map<String, List<Message>> messages;

    public MessageStorageImpl(Map<String, List<Message>> messages) {
        this.messages = messages;
    }

    @Override
    public boolean loadMessage(Message message) {
        return messages.get(message.getFrom().getProfileId()).add(message);
    }

}
