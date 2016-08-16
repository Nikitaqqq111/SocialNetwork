package ru.sbt.socialnetwork.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by Никита on 15.08.2016.
 */
public class Message {
    private final String messageId;
    private final String message;
    private final Profile from;
    private final Profile to;
    private final List<? extends Resource> attachments;
    private final Date dateCreate;

    public Message(String messageId, String message, Profile from, Profile to, List<? extends Resource> attachments, Date dateCreate) {
        this.messageId = messageId;
        this.message = message;
        this.from = from;
        this.to = to;
        this.attachments = attachments;
        this.dateCreate = dateCreate;
    }

    public String getMessageId() {
        return messageId;
    }

    public String getMessage() {
        return message;
    }

    public Profile getFrom() {
        return from;
    }

    public Profile getTo() {
        return to;
    }

    public List<? extends Resource> getAttachments() {
        return attachments;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
}
