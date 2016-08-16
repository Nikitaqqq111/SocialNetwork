package ru.sbt.socialnetwork.validator;

import ru.sbt.socialnetwork.domain.Profile;

import java.util.Map;

/**
 * Created by Никита on 15.08.2016.
 */
public class ValidatorImpl implements Validator {
    private final Map<String, String> passwords;

    public ValidatorImpl(Map<String, String> passwords) {
        this.passwords = passwords;
    }

    @Override
    public void validate(Profile profile, String password) {
        if (profile == null && password == null) {
            return;
        }
        if (profile == null || !passwords.containsKey(profile.getProfileId())) {
            throw new NoSuchProfileException();
        }
        if (!passwords.get(profile.getProfileId()).equals(password)) {
            throw new IllegalPasswordException();
        }
    }
}
