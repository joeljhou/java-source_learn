package org.omg.IOP;


/**
* org/omg/IOP/Encoding.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-Xcode12.4-sans-NAS/jdk8u401/683/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, December 19, 2023 12:41:08 PM GMT
*/

public final class Encoding implements org.omg.CORBA.portable.IDLEntity
{

  /**
       * The encoding format.
       */
  public short format = (short)0;

  /**
       * The major version of this Encoding format.
       */
  public byte major_version = (byte)0;

  /**
       * The minor version of this Encoding format.
       */
  public byte minor_version = (byte)0;

  public Encoding ()
  {
  } // ctor

  public Encoding (short _format, byte _major_version, byte _minor_version)
  {
    format = _format;
    major_version = _major_version;
    minor_version = _minor_version;
  } // ctor

} // class Encoding
