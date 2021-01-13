// ICallback.aidl
package com.jio.aidl_server.sdk;
import com.jio.aidl_server.sdk.OrientationModel;

// Declare any non-default types here with import statements
interface ICallback {
    void onResult(in OrientationModel vo);
}