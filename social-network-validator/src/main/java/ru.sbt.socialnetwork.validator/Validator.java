package ru.sbt.socialnetwork.validator;

import ru.sbt.socialnetwork.domain.Profile;

/**
 * Created by Никита on 15.08.2016.
 */
public interface Validator {
    void validate(Profile profile, String password);
}
