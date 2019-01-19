package com.example.android.clickcounter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class ClickActivityTest {

    private String countToCheckFor;

    @Rule
    public ActivityTestRule<ClickActivity> activityTestRule =
            new ActivityTestRule<>(ClickActivity.class);

    @Before
    public void initValidString() {
        countToCheckFor = "1";
    }

    @Test
    public void clickingIncreasesCount() {
        // arrange

        // act
        onView(withId(R.id.click_button))
                .perform(click());

        // assert
        onView(withId(R.id.click_count_text_view))
                .check(matches(withText(countToCheckFor)));
    }

}