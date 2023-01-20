package edu.ucsd.cse110.lab2;

import android.widget.Button;
import android.widget.TextView;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import static org.junit.Assert.*;


@RunWith(RobolectricTestRunner.class)
public class BetterMainActivityTest {
    @Test
    public void test_one_plus_one_equals_two() {
        ActivityScenario<MainActivity> scenario = ActivityScenario.launch(MainActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.onActivity(activity -> {
            final Button button1 = activity.findViewById(R.id.btn_one);
            final Button buttonplus = activity.findViewById(R.id.btn_plus);
            final Button buttoneq = activity.findViewById(R.id.btn_equals);
            button1.performClick();
            buttonplus.performClick();
            button1.performClick();
            buttoneq.performClick();
            TextView nameView =  (TextView) activity.findViewById(R.id.display);
            assertEquals(nameView.getText(), "2");
        });
    }
}
