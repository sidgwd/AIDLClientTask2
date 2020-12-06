// ISdkOrientationProvider.aidl
package com.jio.server.sdk;
import com.jio.server.sdk.ICallback;
import com.jio.server.sdk.OrientationModel;

interface ISdkOrientationProvider {
   void getOrientationLogs(in String deviceId);
   void registerCallback(in ICallback cb);
   void unregisterCallback(in ICallback cb);
}
