// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: io/common/protocols.proto
// Protobuf Java Version: 4.29.0

package com.passkit.grpc;

public final class Protocols {
  private Protocols() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      Protocols.class.getName());
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
   * Protobuf enum {@code io.PassProtocol}
   */
  public enum PassProtocol
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PASS_PROTOCOL_DO_NOT_USE = 0;</code>
     */
    PASS_PROTOCOL_DO_NOT_USE(0),
    /**
     * <pre>
     * Reserved for raw pass protocol.
     * </pre>
     *
     * <code>RAW_PROTOCOL = 1;</code>
     */
    RAW_PROTOCOL(1),
    /**
     * <pre>
     * Reserved for migrating legacy v1 passes.
     * </pre>
     *
     * <code>V1_PROTOCOL = 2;</code>
     */
    V1_PROTOCOL(2),
    /**
     * <pre>
     * Flights protocol: https://docs.passkit.io/protocols/boarding/
     * </pre>
     *
     * <code>FLIGHT_PROTOCOL = 3;</code>
     */
    FLIGHT_PROTOCOL(3),
    /**
     * <pre>
     * Values 100 onwards are for PassKit generic protocols.
     * Generic Membership protocol: https://docs.passkit.io/protocols/member/
     * </pre>
     *
     * <code>MEMBERSHIP = 100;</code>
     */
    MEMBERSHIP(100),
    /**
     * <pre>
     * Single Use Coupon protocol: https://docs.passkit.io/protocols/coupon/
     * </pre>
     *
     * <code>SINGLE_USE_COUPON = 101;</code>
     */
    SINGLE_USE_COUPON(101),
    /**
     * <pre>
     * Event Ticket protocol: https://docs.passkit.io/protocols/event/
     * </pre>
     *
     * <code>EVENT_TICKETING = 102;</code>
     */
    EVENT_TICKETING(102),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 0,
        /* suffix= */ "",
        PassProtocol.class.getName());
    }
    /**
     * <code>PASS_PROTOCOL_DO_NOT_USE = 0;</code>
     */
    public static final int PASS_PROTOCOL_DO_NOT_USE_VALUE = 0;
    /**
     * <pre>
     * Reserved for raw pass protocol.
     * </pre>
     *
     * <code>RAW_PROTOCOL = 1;</code>
     */
    public static final int RAW_PROTOCOL_VALUE = 1;
    /**
     * <pre>
     * Reserved for migrating legacy v1 passes.
     * </pre>
     *
     * <code>V1_PROTOCOL = 2;</code>
     */
    public static final int V1_PROTOCOL_VALUE = 2;
    /**
     * <pre>
     * Flights protocol: https://docs.passkit.io/protocols/boarding/
     * </pre>
     *
     * <code>FLIGHT_PROTOCOL = 3;</code>
     */
    public static final int FLIGHT_PROTOCOL_VALUE = 3;
    /**
     * <pre>
     * Values 100 onwards are for PassKit generic protocols.
     * Generic Membership protocol: https://docs.passkit.io/protocols/member/
     * </pre>
     *
     * <code>MEMBERSHIP = 100;</code>
     */
    public static final int MEMBERSHIP_VALUE = 100;
    /**
     * <pre>
     * Single Use Coupon protocol: https://docs.passkit.io/protocols/coupon/
     * </pre>
     *
     * <code>SINGLE_USE_COUPON = 101;</code>
     */
    public static final int SINGLE_USE_COUPON_VALUE = 101;
    /**
     * <pre>
     * Event Ticket protocol: https://docs.passkit.io/protocols/event/
     * </pre>
     *
     * <code>EVENT_TICKETING = 102;</code>
     */
    public static final int EVENT_TICKETING_VALUE = 102;


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
    public static PassProtocol valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PassProtocol forNumber(int value) {
      switch (value) {
        case 0: return PASS_PROTOCOL_DO_NOT_USE;
        case 1: return RAW_PROTOCOL;
        case 2: return V1_PROTOCOL;
        case 3: return FLIGHT_PROTOCOL;
        case 100: return MEMBERSHIP;
        case 101: return SINGLE_USE_COUPON;
        case 102: return EVENT_TICKETING;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PassProtocol>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        PassProtocol> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PassProtocol>() {
            public PassProtocol findValueByNumber(int number) {
              return PassProtocol.forNumber(number);
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
      return com.passkit.grpc.Protocols.getDescriptor().getEnumTypes().get(0);
    }

    private static final PassProtocol[] VALUES = values();

    public static PassProtocol valueOf(
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

    private PassProtocol(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.PassProtocol)
  }

  /**
   * Protobuf enum {@code io.ProtocolCommonEvents}
   */
  public enum ProtocolCommonEvents
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROTOCOL_COMMON_EVENTS_DO_NOT_USE = 0;</code>
     */
    PROTOCOL_COMMON_EVENTS_DO_NOT_USE(0),
    /**
     * <pre>
     * Values 0-100 onwards are for PassKit events
     * </pre>
     *
     * <code>EVENT_OBJECT_CREATED = 1;</code>
     */
    EVENT_OBJECT_CREATED(1),
    /**
     * <pre>
     * Set to when the object was updated
     * </pre>
     *
     * <code>EVENT_OBJECT_UPDATED = 2;</code>
     */
    EVENT_OBJECT_UPDATED(2),
    /**
     * <pre>
     * Set to when the object was expired
     * </pre>
     *
     * <code>EVENT_OBJECT_EXPIRED = 3;</code>
     */
    EVENT_OBJECT_EXPIRED(3),
    /**
     * <pre>
     * Set to when the object was deleted
     * </pre>
     *
     * <code>EVENT_OBJECT_DELETED = 4;</code>
     */
    EVENT_OBJECT_DELETED(4),
    /**
     * <pre>
     * Pass has been issued.
     * </pre>
     *
     * <code>EVENT_PASS_ISSUED = 5;</code>
     */
    EVENT_PASS_ISSUED(5),
    /**
     * <pre>
     * Pass has been installed in a wallet.
     * </pre>
     *
     * <code>EVENT_PASS_INSTALLED = 6;</code>
     */
    EVENT_PASS_INSTALLED(6),
    /**
     * <pre>
     * Pass has been uninstalled (possibly deleted) from a wallet.
     * </pre>
     *
     * <code>EVENT_PASS_UNINSTALLED = 7;</code>
     */
    EVENT_PASS_UNINSTALLED(7),
    /**
     * <pre>
     * Pass has been invalidated.
     * </pre>
     *
     * <code>EVENT_PASS_INVALIDATED = 8;</code>
     */
    EVENT_PASS_INVALIDATED(8),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 0,
        /* suffix= */ "",
        ProtocolCommonEvents.class.getName());
    }
    /**
     * <code>PROTOCOL_COMMON_EVENTS_DO_NOT_USE = 0;</code>
     */
    public static final int PROTOCOL_COMMON_EVENTS_DO_NOT_USE_VALUE = 0;
    /**
     * <pre>
     * Values 0-100 onwards are for PassKit events
     * </pre>
     *
     * <code>EVENT_OBJECT_CREATED = 1;</code>
     */
    public static final int EVENT_OBJECT_CREATED_VALUE = 1;
    /**
     * <pre>
     * Set to when the object was updated
     * </pre>
     *
     * <code>EVENT_OBJECT_UPDATED = 2;</code>
     */
    public static final int EVENT_OBJECT_UPDATED_VALUE = 2;
    /**
     * <pre>
     * Set to when the object was expired
     * </pre>
     *
     * <code>EVENT_OBJECT_EXPIRED = 3;</code>
     */
    public static final int EVENT_OBJECT_EXPIRED_VALUE = 3;
    /**
     * <pre>
     * Set to when the object was deleted
     * </pre>
     *
     * <code>EVENT_OBJECT_DELETED = 4;</code>
     */
    public static final int EVENT_OBJECT_DELETED_VALUE = 4;
    /**
     * <pre>
     * Pass has been issued.
     * </pre>
     *
     * <code>EVENT_PASS_ISSUED = 5;</code>
     */
    public static final int EVENT_PASS_ISSUED_VALUE = 5;
    /**
     * <pre>
     * Pass has been installed in a wallet.
     * </pre>
     *
     * <code>EVENT_PASS_INSTALLED = 6;</code>
     */
    public static final int EVENT_PASS_INSTALLED_VALUE = 6;
    /**
     * <pre>
     * Pass has been uninstalled (possibly deleted) from a wallet.
     * </pre>
     *
     * <code>EVENT_PASS_UNINSTALLED = 7;</code>
     */
    public static final int EVENT_PASS_UNINSTALLED_VALUE = 7;
    /**
     * <pre>
     * Pass has been invalidated.
     * </pre>
     *
     * <code>EVENT_PASS_INVALIDATED = 8;</code>
     */
    public static final int EVENT_PASS_INVALIDATED_VALUE = 8;


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
    public static ProtocolCommonEvents valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtocolCommonEvents forNumber(int value) {
      switch (value) {
        case 0: return PROTOCOL_COMMON_EVENTS_DO_NOT_USE;
        case 1: return EVENT_OBJECT_CREATED;
        case 2: return EVENT_OBJECT_UPDATED;
        case 3: return EVENT_OBJECT_EXPIRED;
        case 4: return EVENT_OBJECT_DELETED;
        case 5: return EVENT_PASS_ISSUED;
        case 6: return EVENT_PASS_INSTALLED;
        case 7: return EVENT_PASS_UNINSTALLED;
        case 8: return EVENT_PASS_INVALIDATED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtocolCommonEvents>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtocolCommonEvents> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtocolCommonEvents>() {
            public ProtocolCommonEvents findValueByNumber(int number) {
              return ProtocolCommonEvents.forNumber(number);
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
      return com.passkit.grpc.Protocols.getDescriptor().getEnumTypes().get(1);
    }

    private static final ProtocolCommonEvents[] VALUES = values();

    public static ProtocolCommonEvents valueOf(
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

    private ProtocolCommonEvents(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.ProtocolCommonEvents)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031io/common/protocols.proto\022\002io*\240\001\n\014Pass" +
      "Protocol\022\034\n\030PASS_PROTOCOL_DO_NOT_USE\020\000\022\020" +
      "\n\014RAW_PROTOCOL\020\001\022\017\n\013V1_PROTOCOL\020\002\022\023\n\017FLI" +
      "GHT_PROTOCOL\020\003\022\016\n\nMEMBERSHIP\020d\022\025\n\021SINGLE" +
      "_USE_COUPON\020e\022\023\n\017EVENT_TICKETING\020f*\216\002\n\024P" +
      "rotocolCommonEvents\022%\n!PROTOCOL_COMMON_E" +
      "VENTS_DO_NOT_USE\020\000\022\030\n\024EVENT_OBJECT_CREAT" +
      "ED\020\001\022\030\n\024EVENT_OBJECT_UPDATED\020\002\022\030\n\024EVENT_" +
      "OBJECT_EXPIRED\020\003\022\030\n\024EVENT_OBJECT_DELETED" +
      "\020\004\022\025\n\021EVENT_PASS_ISSUED\020\005\022\030\n\024EVENT_PASS_" +
      "INSTALLED\020\006\022\032\n\026EVENT_PASS_UNINSTALLED\020\007\022" +
      "\032\n\026EVENT_PASS_INVALIDATED\020\010BG\n\020com.passk" +
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
