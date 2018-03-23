package devops.aoifehorgan.me.devopsproject;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

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
public class CalcActivityUITest {
    @Rule
    public ActivityTestRule<CalcActivity> mActivityRule =
            new ActivityTestRule<>(CalcActivity.class);

    @Test
    public void testAddition() {
        // Type text and then press the button.
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.buttonAdd)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("2+2")));
        onView(withId(R.id.buttonEqual)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("1.0")));

    }
    @Test
    public void clear() {
        onView(withId(R.id.buttonClearText)).perform(click());
        onView(withId(R.id.textView1)).check(matches(withText("")));
    }
    }

