package com.udacity.gradle.builditbigger;


import androidx.test.espresso.IdlingRegistry;
import androidx.test.espresso.IdlingResource;
import androidx.test.espresso.ViewInteraction;
import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.AllOf.allOf;

@RunWith(JUnit4.class)
public class MainActivityTest {
    private IdlingResource mIdlingResource;

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void registerIdlingResource() {
        mIdlingResource = activityTestRule.getActivity().getIdlingResource();
        IdlingRegistry.getInstance().register(mIdlingResource);
    }


    // this method which runs before each test and will stub all external
    // intents so all external intents will be blocked
    /*@Before
    public void stubAllExternalIntents() {
        // By default Espresso Intents does not stub any Intents. Stubbing needs to be setup before
        // every test run. In this case all external Intents will be blocked.
        intending(not(isInternal())).respondWith(new Instrumentation.ActivityResult(Activity.RESULT_OK, null));
    }*/


    @Test
    public void mainActivityBasicTest()
    {
        ViewInteraction sendButton = onView(
                allOf(withId(R.id.tell_joke_button), withText("Tell Joke"), isDisplayed()));
        sendButton.perform(click());

        /* String joke;
        Context context = InstrumentationRegistry.getInstrumentation().getContext();
        new EndpointsAsyncTask().execute(context);
        try {
            joke =new EndpointsAsyncTask().execute(context).get();
            assertNotNull(joke);
            assertTrue(joke.length() > 0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }*/
    }

    @After
    public void unregisterIdlingResource() {
        if (mIdlingResource != null) {
            IdlingRegistry.getInstance().unregister(mIdlingResource);
        }
    }

    @After
    public void checkJokeReceivefromAsyncTask() {
       onView(withId(R.id.joke_title)).check(matches(withText("Joke for Today!")));
    }
}
