// ISdkOrientationProvider.aidl
package com.jio.aidl_server.sdk;
import com.jio.aidl_server.sdk.ICallback;
import com.jio.aidl_server.sdk.OrientationModel;

interface ISdkOrientationProvider {
   void getOrientationLogs(in String deviceId);
   void registerCallback(in ICallback cb);
   void unregisterCallback(in ICallback cb);
}
