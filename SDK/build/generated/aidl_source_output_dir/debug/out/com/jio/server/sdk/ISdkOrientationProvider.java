/*
 * This file is auto-generated.  DO NOT MODIFY.
 */
package com.jio.server.sdk;
public interface ISdkOrientationProvider extends android.os.IInterface
{
  /** Default implementation for ISdkOrientationProvider. */
  public static class Default implements com.jio.server.sdk.ISdkOrientationProvider
  {
    @Override public void getOrientationLogs(java.lang.String deviceId) throws android.os.RemoteException
    {
    }
    @Override public void registerCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException
    {
    }
    @Override public void unregisterCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException
    {
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements com.jio.server.sdk.ISdkOrientationProvider
  {
    private static final java.lang.String DESCRIPTOR = "com.jio.server.sdk.ISdkOrientationProvider";
    /** Construct the stub at attach it to the interface. */
    public Stub()
    {
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an com.jio.server.sdk.ISdkOrientationProvider interface,
     * generating a proxy if needed.
     */
    public static com.jio.server.sdk.ISdkOrientationProvider asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof com.jio.server.sdk.ISdkOrientationProvider))) {
        return ((com.jio.server.sdk.ISdkOrientationProvider)iin);
      }
      return new com.jio.server.sdk.ISdkOrientationProvider.Stub.Proxy(obj);
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
        case TRANSACTION_getOrientationLogs:
        {
          data.enforceInterface(descriptor);
          java.lang.String _arg0;
          _arg0 = data.readString();
          this.getOrientationLogs(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_registerCallback:
        {
          data.enforceInterface(descriptor);
          com.jio.server.sdk.ICallback _arg0;
          _arg0 = com.jio.server.sdk.ICallback.Stub.asInterface(data.readStrongBinder());
          this.registerCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        case TRANSACTION_unregisterCallback:
        {
          data.enforceInterface(descriptor);
          com.jio.server.sdk.ICallback _arg0;
          _arg0 = com.jio.server.sdk.ICallback.Stub.asInterface(data.readStrongBinder());
          this.unregisterCallback(_arg0);
          reply.writeNoException();
          return true;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
    }
    private static class Proxy implements com.jio.server.sdk.ISdkOrientationProvider
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
      @Override public void getOrientationLogs(java.lang.String deviceId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeString(deviceId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOrientationLogs, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().getOrientationLogs(deviceId);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void registerCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().registerCallback(cb);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      @Override public void unregisterCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain();
        android.os.Parcel _reply = android.os.Parcel.obtain();
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongBinder((((cb!=null))?(cb.asBinder()):(null)));
          boolean _status = mRemote.transact(Stub.TRANSACTION_unregisterCallback, _data, _reply, 0);
          if (!_status && getDefaultImpl() != null) {
            getDefaultImpl().unregisterCallback(cb);
            return;
          }
          _reply.readException();
        }
        finally {
          _reply.recycle();
          _data.recycle();
        }
      }
      public static com.jio.server.sdk.ISdkOrientationProvider sDefaultImpl;
    }
    static final int TRANSACTION_getOrientationLogs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_unregisterCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    public static boolean setDefaultImpl(com.jio.server.sdk.ISdkOrientationProvider impl) {
      if (Stub.Proxy.sDefaultImpl == null && impl != null) {
        Stub.Proxy.sDefaultImpl = impl;
        return true;
      }
      return false;
    }
    public static com.jio.server.sdk.ISdkOrientationProvider getDefaultImpl() {
      return Stub.Proxy.sDefaultImpl;
    }
  }
  public void getOrientationLogs(java.lang.String deviceId) throws android.os.RemoteException;
  public void registerCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException;
  public void unregisterCallback(com.jio.server.sdk.ICallback cb) throws android.os.RemoteException;
}
