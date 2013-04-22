
package ca.liquidlabs.android.speedtestmapper.util;

public interface AppConstants {
    /**
     * Boolean flat to trun ON or OFF application debugging
     */
    boolean DEBUG_MODE = true;

    String TAG_TRACE = "[STM]";

    /**
     * Package name for SpeedTest(tm) app
     */
    String PACKAGE_SPEEDTEST_APP = "org.zwanoo.android.speedtest";

    /**
     * Since this app is targeted for newer API, we do not need to worry about
     * old market package name 'com.google.market'. <br/>
     * 
     * UPDATE: Unable to use this package name, since for some reason Play Store
     * was not found by this package name.
     */
    String PACKAGE_GOOGLE_PLAY_STORE = "com.google.vending";
}