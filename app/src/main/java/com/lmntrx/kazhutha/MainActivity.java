package com.lmntrx.kazhutha;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        if (BluetoothManager.isBluetoothAvailable()) {
            Toast.makeText(MainActivity.this, "Welcome", Toast.LENGTH_SHORT).show();
            enableBlu();
        }


    }

    public void host(View view) {
        BluetoothManager bluetoothManager = new BluetoothManager(this);
        if (!bluetoothManager.send("Hello"))
            Toast.makeText(MainActivity.this, "Oh Boy!", Toast.LENGTH_SHORT).show();
        else Toast.makeText(MainActivity.this, "yahoooo", Toast.LENGTH_SHORT).show();
    }

    public void enableBlu(){
        Intent discoveryIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE);
        discoveryIntent.putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300 );
        startActivityForResult(discoveryIntent, 1);
    }


}
