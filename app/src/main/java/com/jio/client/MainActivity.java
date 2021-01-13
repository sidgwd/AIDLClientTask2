package com.jio.client;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jio.server.sdk.OrientationModel;
import com.jio.server.sdk.ICallback;
import com.jio.server.sdk.ISdkOrientationProvider;

public class MainActivity extends AppCompatActivity {
    Button btnConnect, btnDisConnect;
    TextView tvData;
    private ISdkOrientationProvider iSdkProvider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    void init() {
        tvData = findViewById(R.id.tvData);
        btnConnect = findViewById(R.id.btnConnect);
        btnDisConnect = findViewById(R.id.btnDisConnect);

        btnConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bindAidlService();
            }
        });

        btnDisConnect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                unbindAIDLService();
                tvData.setText("AIDL Service Disconnected!");
            }
        });
    }

    public void unbindAIDLService() {
        try {
            unbindService(sdkServerConnection);
            try {
                iSdkProvider.unregisterCallback(callback);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bindAidlService() {
        if (sdkServerConnection != null) {
            Intent i = new Intent("com.jio.server.aidl.service.ISdkCallerService");
            i.setPackage("com.jio.server.aidl");
            if (!bindService(i, sdkServerConnection, Context.BIND_AUTO_CREATE)) {
                tvData.setText("Service Connection Failed!\nPlease install AIDL Server App.");
            }


        }
    }

    protected ICallback callback = new ICallback.Stub() {
        @Override
        public void onResult(OrientationModel vo) {

            tvData.setText("AIDL Service Connected\n\ncurrentOrientation: " + vo.getCurrentOrientation() + "\n" +
                    "accuracy: " + vo.getAccuracy() + "\n" +
                    "Sensory_timeStamp: " + vo.getTimeStamp() + "\n" +
                    "maxEventsCount: " + vo.getMaxEventsCount() + "\n" +
                    "reserverdEventsCount: " + vo.getReserverdEventsCount() + "\n" +
                    "id: " + vo.getId() + "\n" +
                    "maxDelay: " + vo.getMaxDelay() + "\n" +
                    "maxRange: " + vo.getMaxRange() + "\n" +
                    "minDelay: " + vo.getMinDelay() + "\n" +
                    "name: " + vo.getName() + "\n" +
                    "power: " + vo.getPower() + "\n" +
                    "reportingMode: " + vo.getReportingMode() + "\n" +
                    "resolution: " + vo.getResolution() + "\n" +
                    "stringType: " + vo.getStringType() + "\n" +
                    "vendor: " + vo.getVendor() + "\n" +
                    "version: " + vo.getVersion());
        }
    };


    ServiceConnection sdkServerConnection = new ServiceConnection() {
        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {

            try {
                iSdkProvider = ISdkOrientationProvider.Stub.asInterface(service);
                iSdkProvider.registerCallback(callback);
                iSdkProvider.getOrientationLogs("NA");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            try {
                tvData.setText("AIDL Service Disconnected!");
                iSdkProvider.unregisterCallback(callback);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
    };


}