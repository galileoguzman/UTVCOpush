package com.galileoguzman.utvcopush;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.messaging.FirebaseMessaging;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // REGISTER TO A TOPIC
        FirebaseMessaging.getInstance().subscribeToTopic("news");

    }
}
