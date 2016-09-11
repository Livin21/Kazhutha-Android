package com.lmntrx.kazhutha;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;

import java.util.List;

/***
 * Created by livin on 11/9/16.
 */
public class BluetoothManager {

    Activity activity = null;

    public BluetoothManager(Activity activity){
        this.activity = activity;
    }

    public static boolean isBluetoothAvailable(){
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        return bluetoothAdapter != null;
    }

    public boolean send(String data){
        boolean status = false;
        Intent dataIntent = new Intent();
        dataIntent.setAction(Intent.ACTION_SEND)
                .setType("text/plain")
                .putExtra("data",data);
        PackageManager packageManager = activity.getPackageManager();
        List<ResolveInfo> apps = packageManager.queryIntentActivities(dataIntent,0);
        if (apps.size()>0){
            String packageName = null, className=null;
         for (ResolveInfo info : apps){
             packageName = info.activityInfo.packageName;
             if (packageName.equals("com.android.bluetooth")){
                 className = info.activityInfo.name;
                 status = true;
                 dataIntent.setClassName(packageName,className);
                 activity.startActivity(dataIntent);
                 break;
             }
         }
        }
        return status;
    }

}
