package com.example.testovoe7

import android.app.Application
import com.onesignal.OneSignal

const val ONESIGNAL_APP_ID = "57950e4f-ba39-4a9b-beb6-44ba9994a025"

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()

        // Logging set to help debug issues, remove before releasing your app.
        OneSignal.setLogLevel(OneSignal.LOG_LEVEL.VERBOSE, OneSignal.LOG_LEVEL.NONE)

        // OneSignal Initialization
        OneSignal.initWithContext(this)
        OneSignal.setAppId(ONESIGNAL_APP_ID)
    }
}