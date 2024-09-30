package com.parsely.react_native_example

import android.util.Log
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class ParselyNativeModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext) {

    // Note: The name and all the method signatures must be the same as the Swift implementation.

    override fun getName() = "ParselyNativeModule"

    @ReactMethod
    fun configureWithSiteId(siteId: String) {
        Log.d("ParselyNativeModule", "Stub for configuration method. Input: $siteId")
    }

    @ReactMethod
    fun startEngagementWithURL(urlString: String) {
        Log.d("ParselyNativeModule", "Stub for start engagement method. Input: $urlString")
    }

    @ReactMethod
    fun trackPageViewWithURL(urlString: String) {
        Log.d("ParselyNativeModule", "Stub for track page view method. Input: $urlString")
    }

    @ReactMethod
    fun stopEngagement() {
        Log.d("ParselyNativeModule", "Stub for stop method")
    }
}
