package com.udacity.gradle.builditbigger;

import android.content.Context;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import java.util.concurrent.ExecutionException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class EndpointsAsyncTaskTest {
    private static final String TAG = EndpointsAsyncTask.class.getSimpleName();

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void verifyAtleastOneJokePresent() {
        String randomJoke;
        Context context =  InstrumentationRegistry.getInstrumentation().getTargetContext();
        try {
            randomJoke = new EndpointsAsyncTask().execute(context).get();
            assertNotNull(randomJoke);
            assertTrue(randomJoke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
