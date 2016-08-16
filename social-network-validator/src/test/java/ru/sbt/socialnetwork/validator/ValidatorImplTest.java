package ru.sbt.socialnetwork.validator;

import org.junit.Before;
import org.junit.Test;
import ru.sbt.socialnetwork.domain.Profile;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Никита on 16.08.2016.
 */
public class ValidatorImplTest {
    Validator validator;
    Profile profile;

    @Before
    public void setUp() throws Exception {
        profile = new Profile("1", new Date(), "first profile");
        Map<String, String> passwords = new HashMap<>();
        passwords.put(profile.getProfileId(), "qqqq");
        validator = new ValidatorImpl(passwords);
    }

    @Test(expected = NoSuchProfileException.class)
    public void validateNoSuchProfile() throws Exception {
        validator.validate(new Profile("2", new Date(), "info"), "qqq");
    }

    @Test(expected = IllegalPasswordException.class)
    public void validateIllegalPassword() throws Exception {
        validator.validate(profile, "qqqqq");
    }

    @Test
    public void validate() throws Exception {
        validator.validate(profile, "qqqq");
    }

}