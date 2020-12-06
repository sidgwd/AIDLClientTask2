// ICallback.aidl
package com.jio.server.sdk;
import com.jio.server.sdk.OrientationModel;

// Declare any non-default types here with import statements
interface ICallback {
    void onResult(in OrientationModel vo);
}