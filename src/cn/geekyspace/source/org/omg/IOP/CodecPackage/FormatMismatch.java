package org.omg.IOP.CodecPackage;


/**
* org/omg/IOP/CodecPackage/FormatMismatch.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from /System/Volumes/Data/jenkins/workspace/8-2-build-macosx-aarch64-Xcode12.4-sans-NAS/jdk8u401/683/corba/src/share/classes/org/omg/PortableInterceptor/IOP.idl
* Tuesday, December 19, 2023 12:41:08 PM GMT
*/

public final class FormatMismatch extends org.omg.CORBA.UserException
{

  public FormatMismatch ()
  {
    super(FormatMismatchHelper.id());
  } // ctor


  public FormatMismatch (String $reason)
  {
    super(FormatMismatchHelper.id() + "  " + $reason);
  } // ctor

} // class FormatMismatch
