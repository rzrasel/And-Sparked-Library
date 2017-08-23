package com.rz.sparkedandlibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.rz.core.DeviceInfo;

import java.util.HashMap;
import java.util.Map;

public class ActSplash extends AppCompatActivity {
    private TextView sysTvDeviceInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splahs);
        sysTvDeviceInfo = (TextView) findViewById(R.id.sysTvDeviceInfo);
        DeviceInfo deviceInfo = new DeviceInfo(this, this);
        System.out.println("D: " + deviceInfo.getAllMapedValue());
        HashMap<String, String> deviceInfoList = new HashMap<>();
        deviceInfoList = deviceInfo.getAllMapedValue();
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry : deviceInfoList.entrySet()) {
            stringBuilder.append(entry.getKey() + " - " + entry.getValue());
            stringBuilder.append("\n");
        }
        sysTvDeviceInfo.setText(stringBuilder.toString());
    }
}