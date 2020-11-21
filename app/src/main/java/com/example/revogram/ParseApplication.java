package com.example.revogram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("jbkjVkcS4zsFCVk05vlVB718PwqAisSPzVGCOj0Q")
                .clientKey("socSnrcsrYAOmXtF3O9Mp4eSxhwsezT5o0bukhlI")
                .server("https://parseapi.back4app.com")
                .build()
        );

    }
}
