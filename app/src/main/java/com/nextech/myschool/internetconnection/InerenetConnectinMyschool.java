package com.nextech.myschool.internetconnection;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by welcome on 8/6/2016.
 */
public class InerenetConnectinMyschool {
    public static int TYPE_WIFI = 1;
    public static int TYPE_MOBILE = 2;
    public static int TYPE_TYPE_WIMAX=3;
    public static int TYPE_NOT_CONNECTED = 0;


    public static int getConnectivityStatus(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context
                .getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo activeNetwork = cm.getActiveNetworkInfo();
        if (null != activeNetwork) {
            if(activeNetwork.getType() == ConnectivityManager.TYPE_WIFI)
                return TYPE_WIFI;

            if(activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE)
                return TYPE_MOBILE;

            if(activeNetwork.getType()==ConnectivityManager.TYPE_WIMAX)
                return TYPE_TYPE_WIMAX;
        }
        return TYPE_NOT_CONNECTED;
    }

    public static String getConnectivityStatusString(Context context) {
        int conn = InerenetConnectinMyschool.getConnectivityStatus(context);
        String status = null;
        if (conn == InerenetConnectinMyschool.TYPE_WIFI) {
            status = "Wifi enabled";
        } else if (conn == InerenetConnectinMyschool.TYPE_MOBILE) {
            status = "Mobile data enabled";
        } else if (conn == InerenetConnectinMyschool.TYPE_NOT_CONNECTED) {
            status = "Not connected to Internet";
        }
        return status;
    }
}