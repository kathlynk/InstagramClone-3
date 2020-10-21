package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initialize Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        // Register parse models
        ParseObject.registerSubclass(Post.class);


        // set applicationId, and server based on the values in the Heroku settings.
        // clientKey is not needed unless explicitly configured
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("WWJOXq9a3eFwSJ8uvCqXRj1a6MWEPFGcCKEelwsu")
                .clientKey("QkDyzl095UDqBJbdRK8h9LIKOWTrNMOKgdRHSIZ9")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
