package com.codepath.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2T3tFJbHhtILaEQB3fhmiuxoan8smO6eQG6hFsgK")
                .clientKey("KejrYz0qwzrVwQDpE3y8NmtPSV1S0qzHmOuyR9up")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
