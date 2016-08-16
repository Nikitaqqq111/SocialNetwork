package ru.sbt.socialnetwork.domain;

import java.util.Date;
import java.util.List;

/**
 * Created by Никита on 15.08.2016.
 */
public class Profile {
    private final String profileId;
    private final Date openDate;
    private final String info;

    public Profile(String profileId, Date openDate, String info) {
        this.profileId = profileId;
        this.openDate = openDate;
        this.info = info;
    }

    public String getProfileId() {
        return profileId;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public String getInfo() {
        return info;
    }

}
