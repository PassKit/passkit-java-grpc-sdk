// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: io/common/attributes.proto
// Protobuf Java Version: 4.27.2

package com.passkit.grpc;

public final class Attributes {
  private Attributes() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 2,
      /* suffix= */ "",
      Attributes.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code io.DeviceAttributes}
   */
  public enum DeviceAttributes
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>NoAttributes = 0;</code>
     */
    NoAttributes(0),
    /**
     * <code>Ios = 1;</code>
     */
    Ios(1),
    /**
     * <code>Android = 2;</code>
     */
    Android(2),
    /**
     * <code>SupportWallet = 4;</code>
     */
    SupportWallet(4),
    /**
     * <code>WalletScanner = 8;</code>
     */
    WalletScanner(8),
    /**
     * <code>WalletDaemon = 16;</code>
     */
    WalletDaemon(16),
    /**
     * <code>WalletPasses = 32;</code>
     */
    WalletPasses(32),
    /**
     * <code>Windows = 64;</code>
     */
    Windows(64),
    /**
     * <code>OSX = 128;</code>
     */
    OSX(128),
    /**
     * <code>Linux = 256;</code>
     */
    Linux(256),
    /**
     * <code>Mobile = 512;</code>
     */
    Mobile(512),
    /**
     * <code>Desktop = 1024;</code>
     */
    Desktop(1024),
    /**
     * <code>Tablet = 2048;</code>
     */
    Tablet(2048),
    /**
     * <code>UnsupportedIos = 4096;</code>
     */
    UnsupportedIos(4096),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        DeviceAttributes.class.getName());
    }
    /**
     * <code>NoAttributes = 0;</code>
     */
    public static final int NoAttributes_VALUE = 0;
    /**
     * <code>Ios = 1;</code>
     */
    public static final int Ios_VALUE = 1;
    /**
     * <code>Android = 2;</code>
     */
    public static final int Android_VALUE = 2;
    /**
     * <code>SupportWallet = 4;</code>
     */
    public static final int SupportWallet_VALUE = 4;
    /**
     * <code>WalletScanner = 8;</code>
     */
    public static final int WalletScanner_VALUE = 8;
    /**
     * <code>WalletDaemon = 16;</code>
     */
    public static final int WalletDaemon_VALUE = 16;
    /**
     * <code>WalletPasses = 32;</code>
     */
    public static final int WalletPasses_VALUE = 32;
    /**
     * <code>Windows = 64;</code>
     */
    public static final int Windows_VALUE = 64;
    /**
     * <code>OSX = 128;</code>
     */
    public static final int OSX_VALUE = 128;
    /**
     * <code>Linux = 256;</code>
     */
    public static final int Linux_VALUE = 256;
    /**
     * <code>Mobile = 512;</code>
     */
    public static final int Mobile_VALUE = 512;
    /**
     * <code>Desktop = 1024;</code>
     */
    public static final int Desktop_VALUE = 1024;
    /**
     * <code>Tablet = 2048;</code>
     */
    public static final int Tablet_VALUE = 2048;
    /**
     * <code>UnsupportedIos = 4096;</code>
     */
    public static final int UnsupportedIos_VALUE = 4096;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static DeviceAttributes valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static DeviceAttributes forNumber(int value) {
      switch (value) {
        case 0: return NoAttributes;
        case 1: return Ios;
        case 2: return Android;
        case 4: return SupportWallet;
        case 8: return WalletScanner;
        case 16: return WalletDaemon;
        case 32: return WalletPasses;
        case 64: return Windows;
        case 128: return OSX;
        case 256: return Linux;
        case 512: return Mobile;
        case 1024: return Desktop;
        case 2048: return Tablet;
        case 4096: return UnsupportedIos;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<DeviceAttributes>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        DeviceAttributes> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceAttributes>() {
            public DeviceAttributes findValueByNumber(int number) {
              return DeviceAttributes.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.Attributes.getDescriptor().getEnumTypes().get(0);
    }

    private static final DeviceAttributes[] VALUES = values();

    public static DeviceAttributes valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private DeviceAttributes(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.DeviceAttributes)
  }

  /**
   * Protobuf enum {@code io.Channel}
   */
  public enum Channel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownChannel = 0;</code>
     */
    UnknownChannel(0),
    /**
     * <code>Web = 1;</code>
     */
    Web(1),
    /**
     * <code>API = 2;</code>
     */
    API(2),
    /**
     * <code>App = 3;</code>
     */
    App(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Channel.class.getName());
    }
    /**
     * <code>UnknownChannel = 0;</code>
     */
    public static final int UnknownChannel_VALUE = 0;
    /**
     * <code>Web = 1;</code>
     */
    public static final int Web_VALUE = 1;
    /**
     * <code>API = 2;</code>
     */
    public static final int API_VALUE = 2;
    /**
     * <code>App = 3;</code>
     */
    public static final int App_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Channel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Channel forNumber(int value) {
      switch (value) {
        case 0: return UnknownChannel;
        case 1: return Web;
        case 2: return API;
        case 3: return App;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Channel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Channel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Channel>() {
            public Channel findValueByNumber(int number) {
              return Channel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.Attributes.getDescriptor().getEnumTypes().get(1);
    }

    private static final Channel[] VALUES = values();

    public static Channel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Channel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.Channel)
  }

  /**
   * Protobuf enum {@code io.Authentication}
   */
  public enum Authentication
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>Unauthenticated = 0;</code>
     */
    Unauthenticated(0),
    /**
     * <code>WebToken = 1;</code>
     */
    WebToken(1),
    /**
     * <code>BearerToken = 2;</code>
     */
    BearerToken(2),
    /**
     * <code>Certificate = 3;</code>
     */
    Certificate(3),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        Authentication.class.getName());
    }
    /**
     * <code>Unauthenticated = 0;</code>
     */
    public static final int Unauthenticated_VALUE = 0;
    /**
     * <code>WebToken = 1;</code>
     */
    public static final int WebToken_VALUE = 1;
    /**
     * <code>BearerToken = 2;</code>
     */
    public static final int BearerToken_VALUE = 2;
    /**
     * <code>Certificate = 3;</code>
     */
    public static final int Certificate_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Authentication valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Authentication forNumber(int value) {
      switch (value) {
        case 0: return Unauthenticated;
        case 1: return WebToken;
        case 2: return BearerToken;
        case 3: return Certificate;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Authentication>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Authentication> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Authentication>() {
            public Authentication findValueByNumber(int number) {
              return Authentication.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.Attributes.getDescriptor().getEnumTypes().get(2);
    }

    private static final Authentication[] VALUES = values();

    public static Authentication valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Authentication(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.Authentication)
  }

  /**
   * Protobuf enum {@code io.UserType}
   */
  public enum UserType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>UnknownUserType = 0;</code>
     */
    UnknownUserType(0),
    /**
     * <code>User = 1;</code>
     */
    User(1),
    /**
     * <code>TeamMember = 2;</code>
     */
    TeamMember(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 27,
        /* patch= */ 2,
        /* suffix= */ "",
        UserType.class.getName());
    }
    /**
     * <code>UnknownUserType = 0;</code>
     */
    public static final int UnknownUserType_VALUE = 0;
    /**
     * <code>User = 1;</code>
     */
    public static final int User_VALUE = 1;
    /**
     * <code>TeamMember = 2;</code>
     */
    public static final int TeamMember_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static UserType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static UserType forNumber(int value) {
      switch (value) {
        case 0: return UnknownUserType;
        case 1: return User;
        case 2: return TeamMember;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<UserType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        UserType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UserType>() {
            public UserType findValueByNumber(int number) {
              return UserType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.Attributes.getDescriptor().getEnumTypes().get(3);
    }

    private static final UserType[] VALUES = values();

    public static UserType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private UserType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.UserType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032io/common/attributes.proto\022\002io*\344\001\n\020Dev" +
      "iceAttributes\022\020\n\014NoAttributes\020\000\022\007\n\003Ios\020\001" +
      "\022\013\n\007Android\020\002\022\021\n\rSupportWallet\020\004\022\021\n\rWall" +
      "etScanner\020\010\022\020\n\014WalletDaemon\020\020\022\020\n\014WalletP" +
      "asses\020 \022\013\n\007Windows\020@\022\010\n\003OSX\020\200\001\022\n\n\005Linux\020" +
      "\200\002\022\013\n\006Mobile\020\200\004\022\014\n\007Desktop\020\200\010\022\013\n\006Tablet\020" +
      "\200\020\022\023\n\016UnsupportedIos\020\200 *8\n\007Channel\022\022\n\016Un" +
      "knownChannel\020\000\022\007\n\003Web\020\001\022\007\n\003API\020\002\022\007\n\003App\020" +
      "\003*U\n\016Authentication\022\023\n\017Unauthenticated\020\000" +
      "\022\014\n\010WebToken\020\001\022\017\n\013BearerToken\020\002\022\017\n\013Certi" +
      "ficate\020\003*9\n\010UserType\022\023\n\017UnknownUserType\020" +
      "\000\022\010\n\004User\020\001\022\016\n\nTeamMember\020\002BG\n\020com.passk" +
      "it.grpcZ$stash.passkit.com/io/model/sdk/" +
      "go/io\252\002\014PassKit.Grpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
