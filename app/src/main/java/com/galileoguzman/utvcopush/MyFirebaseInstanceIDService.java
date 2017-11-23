package com.galileoguzman.utvcopush;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by galileoguzman on 11/23/17.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();

        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d("NOTIFICATIONS-APP", "Refreshed token: " + refreshedToken);


        // TODO: Implement this method to send any registration to your app's servers.
        sendRegistrationToServer(refreshedToken);

    }

    public void sendRegistrationToServer(String token){

    }
}
