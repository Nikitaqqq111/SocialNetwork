package ru.sbt.socialnetwork.domain;

import java.util.Date;

/**
 * Created by Никита on 15.08.2016.
 */
public class Resource {

    private final byte[] resource;
    private final Date dateCreate;
    private final Profile createBy;
    private final String info;

    public Resource(byte[] resource, Date dateCreate, Profile createBy, String info) {
        this.resource = resource;
        this.dateCreate = dateCreate;
        this.createBy = createBy;
        this.info = info;
    }

    public byte[] getResource() {
        return resource;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public Profile getCreateBy() {
        return createBy;
    }

    public String getInfo() {
        return info;
    }

}
