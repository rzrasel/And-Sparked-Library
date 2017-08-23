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
/*


Map<String, String> map = ...
for (Map.Entry<String, String> entry : map.entrySet())
{
    System.out.println(entry.getKey() + "/" + entry.getValue());
}



Map<Integer, Integer> map = new HashMap<Integer, Integer>();
Iterator<Map.Entry<Integer, Integer>> entries = map.entrySet().iterator();
while (entries.hasNext()) {
    Map.Entry<Integer, Integer> entry = entries.next();
    System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
}


Iterator it = mp.entrySet().iterator();
while (it.hasNext()) {
    Map.Entry pair = (Map.Entry)it.next();
    System.out.println(pair.getKey() + " = " + pair.getValue());
    it.remove(); // avoids a ConcurrentModificationException
}


Map<Integer, Integer> map = new HashMap<Integer, Integer>();
for (Integer key : map.keySet()) {
    Integer value = map.get(key);
    System.out.println("Key = " + key + ", Value = " + value);
}
*/