package com.serenitydojo.datatypes;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class WhenWorkingWithWholeNumbers {
    @Test
    public void addingNumbersTogether() {
        int initialYear = 1985;

        int timeJump =30;
        int targetYear = initialYear + timeJump;

        assertThat(targetYear, equalTo(2015));
    }
}