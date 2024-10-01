package com.parsely.react_native_example

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

import com.parsely.parselyandroid.ParselyTracker;

class ParselyNativeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    // Note: The name and all the method signatures must be the same as the Swift implementation.

    override fun getName() = "ParselyNativeModule"

    @ReactMethod
    fun configureWithSiteId(siteId: String) {
        val context = this.reactApplicationContext
        val activity = currentActivity

        if (activity == null) {
            Log.e("ParselyNativeModule", "Unable to initialize ParselyTracker: currentActivity is null!")
            // TODO: Should we fail or throw an error here to avoid giving the user the impression the SDK started successfully?
            return
        }

        activity.runOnUiThread {
            ParselyTracker.init(siteId, 30, this.reactApplicationContext, false)
            Log.d("ParselyNativeModule", "ParselyTracker configured with: $siteId")
        }
    }

    @ReactMethod
    fun startEngagementWithURL(urlString: String) {
        // "Engagement session cannot start without calling trackPageview first"
        trackPageViewWithURL(urlString)
        ParselyTracker.sharedInstance().startEngagement(urlString)
        Log.d("ParselyNativeModule", "Engagement started with: $urlString")
    }

    @ReactMethod
    fun trackPageViewWithURL(urlString: String) {
        ParselyTracker.sharedInstance().trackPageview(urlString)
        Log.d("ParselyNativeModule", "Page view tracked with: $urlString")
    }

    @ReactMethod
    fun stopEngagement() {
        ParselyTracker.sharedInstance().stopEngagement()
        Log.d("ParselyNativeModule", "Engagement stopped")
    }
}
