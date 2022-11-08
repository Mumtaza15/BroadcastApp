package com.example.broadcastapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class CustomReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String intentAction = intent.getAction();
        if (intentAction != null){

            String toastMessage = "unknown";

            switch (intentAction){
                case Intent.ACTION_POWER_CONNECTED:
                    toastMessage = "Power connnected";
                    break;
                case Intent.ACTION_POWER_DISCONNECTED:
                    toastMessage = "Power disconnected";
                    break;

//                case MainActivity.ACTION_CUSTOM_BROADCAST:
//                    toastMessage = "Berhasil BC";
//                    break;

                case "action-custom-broadcast":
                    toastMessage = "Berhasil BC";
                    break;

            }
            Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
        }
    }
}
