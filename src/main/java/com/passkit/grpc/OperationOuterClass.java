// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: io/common/operation.proto
// Protobuf Java Version: 4.31.0

package com.passkit.grpc;

@com.google.protobuf.Generated
public final class OperationOuterClass {
  private OperationOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
      /* patch= */ 0,
      /* suffix= */ "",
      OperationOuterClass.class.getName());
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
   * <pre>
   * Specifies the type of update operation to perform.
   * </pre>
   *
   * Protobuf enum {@code io.Operation}
   */
  public enum Operation
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Will use the default operator PATCH.
     * </pre>
     *
     * <code>OPERATION_DO_NOT_USE = 0;</code>
     */
    OPERATION_DO_NOT_USE(0),
    /**
     * <pre>
     * PUT will replace all values provided in the request.
     * </pre>
     *
     * <code>OPERATION_PUT = 1;</code>
     */
    OPERATION_PUT(1),
    /**
     * <pre>
     * PATCH will ignore missing or falsey values.
     * </pre>
     *
     * <code>OPERATION_PATCH = 2;</code>
     */
    OPERATION_PATCH(2),
    UNRECOGNIZED(-1),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 31,
        /* patch= */ 0,
        /* suffix= */ "",
        Operation.class.getName());
    }
    /**
     * <pre>
     * Will use the default operator PATCH.
     * </pre>
     *
     * <code>OPERATION_DO_NOT_USE = 0;</code>
     */
    public static final int OPERATION_DO_NOT_USE_VALUE = 0;
    /**
     * <pre>
     * PUT will replace all values provided in the request.
     * </pre>
     *
     * <code>OPERATION_PUT = 1;</code>
     */
    public static final int OPERATION_PUT_VALUE = 1;
    /**
     * <pre>
     * PATCH will ignore missing or falsey values.
     * </pre>
     *
     * <code>OPERATION_PATCH = 2;</code>
     */
    public static final int OPERATION_PATCH_VALUE = 2;


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
    public static Operation valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Operation forNumber(int value) {
      switch (value) {
        case 0: return OPERATION_DO_NOT_USE;
        case 1: return OPERATION_PUT;
        case 2: return OPERATION_PATCH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Operation>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Operation> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Operation>() {
            public Operation findValueByNumber(int number) {
              return Operation.forNumber(number);
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
    public static com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.passkit.grpc.OperationOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final Operation[] VALUES = values();

    public static Operation valueOf(
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

    private Operation(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:io.Operation)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031io/common/operation.proto\022\002io*M\n\tOpera" +
      "tion\022\030\n\024OPERATION_DO_NOT_USE\020\000\022\021\n\rOPERAT" +
      "ION_PUT\020\001\022\023\n\017OPERATION_PATCH\020\002BG\n\020com.pa" +
      "sskit.grpcZ$stash.passkit.com/io/model/s" +
      "dk/go/io\252\002\014PassKit.Grpcb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
