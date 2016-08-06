package com.nextech.myschool.internetconnection;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by welcome on 8/6/2016.
 */
public class NetworkChangeReceiverMyschool extends BroadcastReceiver {
    @Override
    public void onReceive(final Context context, final Intent intent) {

        String status = InerenetConnectinMyschool.getConnectivityStatusString(context);

        Toast.makeText(context, status, Toast.LENGTH_LONG).show();
    }
}
