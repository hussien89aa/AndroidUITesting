package com.example.hussienalrubaye.testmyapp;

import android.os.RemoteException;
        import android.support.test.InstrumentationRegistry;
        import android.support.test.rule.ActivityTestRule;
        import android.support.test.runner.AndroidJUnit4;
        import android.support.test.uiautomator.UiDevice;
        import android.support.test.uiautomator.UiObject;
        import android.support.test.uiautomator.UiObjectNotFoundException;
        import android.support.test.uiautomator.UiSelector;

        import org.junit.Ignore;
        import org.junit.Rule;
        import org.junit.Test;
        import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class MainTest {


    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void testUiDevice() throws RemoteException {
        UiDevice device = UiDevice.getInstance(
                InstrumentationRegistry.getInstrumentation());
        if (device.isScreenOn()) {
            device.setOrientationLeft();
            device.openNotification();
        }
    }

    @Test
    public void testUiAutomatorAPI() throws UiObjectNotFoundException, InterruptedException {
        UiDevice device = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());

    //enter username
    UiSelector usernameSelector = new UiSelector().className("android.widget.EditText").instance(0);
    UiObject usernameWidget = device.findObject(usernameSelector);
    usernameWidget.setText("admin");
    Thread.sleep(2000);

    //enter Password
    UiSelector PasswordSelector = new UiSelector().className("android.widget.EditText").instance(1);
    UiObject PasswordWidget = device.findObject(PasswordSelector);
    PasswordWidget.setText("admin");
    Thread.sleep(2000);

    UiSelector buLoginSelector = new UiSelector().className("android.widget.Button").text("LOGIN").clickable(true);
    UiObject buLoginWidget = device.findObject(buLoginSelector);
        buLoginWidget.click();

    Thread.sleep(2000);


    }


}

