/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.jio.server.sdk;
// Declare any non-default types here with import statements

public interface ICallback extends android.os.IInterface
{
  /** Default implementation for ICallback. */
  public static class Default implements com.jio.server.sdk.ICallback
  {
    @Override public void onResult(com.jio.server.sdk.OrientationModel vo) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.jio.server.sdk.ICallback
  {
    private static final java.lang.String DESCRIPTOR = "com.jio.server.sdk.ICallback";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.jio.server.sdk.ICallback interface,
     * generating a proxy if needed.
     */
    public static com.jio.server.sdk.ICallback asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.jio.server.sdk.ICallback))) {
        return ((com.jio.server.sdk.ICallback)iin);
      }
      return new com.jio.server.sdk.ICallback.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      switch (code)
      {
        case INTERFACE_TRANSACTION:
        {
          reply.writeString(descriptor);
          return true;
        }
        case TRANSACTION_onResult:
        {
          data.enforceInterface(descriptor);
          com.jio.server.sdk.OrientationModel _arg0;
          if ((0!=data.readInt())) {
            _arg0 = com.jio.server.sdk.OrientationModel.CREATOR.createFromParcel(data);
          }
          else {
            _arg0 = null;
          }
          this.onResult(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.jio.server.sdk.ICallback
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      @Override public void onResult(com.jio.server.sdk.OrientationModel vo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          if ((vo!=null)) {
            _data.writeInt(1);
            vo.writeToParcel(_data, 0);
          }
          else {
            _data.writeInt(0);
          }
          boolean _status = mRemote.transact(Stub.TRANSACTION_onResult, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().onResult(vo);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.jio.server.sdk.ICallback sDefaultImpl;
    }
    static final int TRANSACTION_onResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    public static boolean setDefaultImpl(com.jio.server.sdk.ICallback impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.jio.server.sdk.ICallback getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void onResult(com.jio.server.sdk.OrientationModel vo) throws android.os.RemoteException;
}
