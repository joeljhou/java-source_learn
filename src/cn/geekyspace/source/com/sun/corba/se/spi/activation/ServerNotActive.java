package com.sun.corba.se.spi.activation;


/**
* com/sun/corba/se/spi/activation/ServerNotActive.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-Xcode12.4-sans-NAS/jdk8u401/683/corba/src/share/classes/com/sun/corba/se/spi/activation/activation.idl
* Tuesday, December 19, 2023 12:41:08 PM GMT
*/

public final class ServerNotActive extends org.omg.CORBA.UserException
{
  public int serverId = (int)0;

  public ServerNotActive ()
  {
    super(ServerNotActiveHelper.id());
  } // ctor

  public ServerNotActive (int _serverId)
  {
    super(ServerNotActiveHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerNotActive (String $reason, int _serverId)
  {
    super(ServerNotActiveHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerNotActive
