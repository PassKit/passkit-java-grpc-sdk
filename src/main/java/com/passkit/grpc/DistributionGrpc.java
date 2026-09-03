package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/core/a_rpc_distribution.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DistributionGrpc {

  private DistributionGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.Distribution";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.EmailDistributionRequest,
      com.google.protobuf.Empty> getSendWelcomeEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendWelcomeEmail",
      requestType = com.passkit.grpc.Distribution.EmailDistributionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.EmailDistributionRequest,
      com.google.protobuf.Empty> getSendWelcomeEmailMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.EmailDistributionRequest, com.google.protobuf.Empty> getSendWelcomeEmailMethod;
    if ((getSendWelcomeEmailMethod = DistributionGrpc.getSendWelcomeEmailMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getSendWelcomeEmailMethod = DistributionGrpc.getSendWelcomeEmailMethod) == null) {
          DistributionGrpc.getSendWelcomeEmailMethod = getSendWelcomeEmailMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Distribution.EmailDistributionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendWelcomeEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.EmailDistributionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("sendWelcomeEmail"))
              .build();
        }
      }
    }
    return getSendWelcomeEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassLinkRequest,
      com.passkit.grpc.CommonObjects.Url> getGetSmartPassLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSmartPassLink",
      requestType = com.passkit.grpc.Distribution.SmartPassLinkRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassLinkRequest,
      com.passkit.grpc.CommonObjects.Url> getGetSmartPassLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassLinkRequest, com.passkit.grpc.CommonObjects.Url> getGetSmartPassLinkMethod;
    if ((getGetSmartPassLinkMethod = DistributionGrpc.getGetSmartPassLinkMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetSmartPassLinkMethod = DistributionGrpc.getGetSmartPassLinkMethod) == null) {
          DistributionGrpc.getGetSmartPassLinkMethod = getGetSmartPassLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Distribution.SmartPassLinkRequest, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSmartPassLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.SmartPassLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("getSmartPassLink"))
              .build();
        }
      }
    }
    return getGetSmartPassLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ClassObjectInput,
      com.passkit.grpc.Distribution.DataCollectionFields> getGetDataCollectionPageFieldsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDataCollectionPageFields",
      requestType = com.passkit.grpc.CommonObjects.ClassObjectInput.class,
      responseType = com.passkit.grpc.Distribution.DataCollectionFields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ClassObjectInput,
      com.passkit.grpc.Distribution.DataCollectionFields> getGetDataCollectionPageFieldsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ClassObjectInput, com.passkit.grpc.Distribution.DataCollectionFields> getGetDataCollectionPageFieldsMethod;
    if ((getGetDataCollectionPageFieldsMethod = DistributionGrpc.getGetDataCollectionPageFieldsMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetDataCollectionPageFieldsMethod = DistributionGrpc.getGetDataCollectionPageFieldsMethod) == null) {
          DistributionGrpc.getGetDataCollectionPageFieldsMethod = getGetDataCollectionPageFieldsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.ClassObjectInput, com.passkit.grpc.Distribution.DataCollectionFields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDataCollectionPageFields"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.ClassObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.DataCollectionFields.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("getDataCollectionPageFields"))
              .build();
        }
      }
    }
    return getGetDataCollectionPageFieldsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassCsvUploadRequest,
      com.google.protobuf.Empty> getUploadSmartPassCsvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "uploadSmartPassCsv",
      requestType = com.passkit.grpc.Distribution.SmartPassCsvUploadRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassCsvUploadRequest,
      com.google.protobuf.Empty> getUploadSmartPassCsvMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassCsvUploadRequest, com.google.protobuf.Empty> getUploadSmartPassCsvMethod;
    if ((getUploadSmartPassCsvMethod = DistributionGrpc.getUploadSmartPassCsvMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getUploadSmartPassCsvMethod = DistributionGrpc.getUploadSmartPassCsvMethod) == null) {
          DistributionGrpc.getUploadSmartPassCsvMethod = getUploadSmartPassCsvMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Distribution.SmartPassCsvUploadRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "uploadSmartPassCsv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.SmartPassCsvUploadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("uploadSmartPassCsv"))
              .build();
        }
      }
    }
    return getUploadSmartPassCsvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.ImportProtocolRequest,
      com.google.protobuf.Empty> getImportProtocolCsvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "importProtocolCsv",
      requestType = com.passkit.grpc.Distribution.ImportProtocolRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.ImportProtocolRequest,
      com.google.protobuf.Empty> getImportProtocolCsvMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.ImportProtocolRequest, com.google.protobuf.Empty> getImportProtocolCsvMethod;
    if ((getImportProtocolCsvMethod = DistributionGrpc.getImportProtocolCsvMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getImportProtocolCsvMethod = DistributionGrpc.getImportProtocolCsvMethod) == null) {
          DistributionGrpc.getImportProtocolCsvMethod = getImportProtocolCsvMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Distribution.ImportProtocolRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "importProtocolCsv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.ImportProtocolRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("importProtocolCsv"))
              .build();
        }
      }
    }
    return getImportProtocolCsvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Payload,
      com.passkit.grpc.CommonObjects.Payload> getValidateBarcodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateBarcode",
      requestType = com.passkit.grpc.CommonObjects.Payload.class,
      responseType = com.passkit.grpc.CommonObjects.Payload.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Payload,
      com.passkit.grpc.CommonObjects.Payload> getValidateBarcodeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Payload, com.passkit.grpc.CommonObjects.Payload> getValidateBarcodeMethod;
    if ((getValidateBarcodeMethod = DistributionGrpc.getValidateBarcodeMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getValidateBarcodeMethod = DistributionGrpc.getValidateBarcodeMethod) == null) {
          DistributionGrpc.getValidateBarcodeMethod = getValidateBarcodeMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Payload, com.passkit.grpc.CommonObjects.Payload>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validateBarcode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Payload.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Payload.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("validateBarcode"))
              .build();
        }
      }
    }
    return getValidateBarcodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.google.protobuf.Empty> getAddMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addMessage",
      requestType = com.passkit.grpc.MessageOuterClass.Message.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.google.protobuf.Empty> getAddMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message, com.google.protobuf.Empty> getAddMessageMethod;
    if ((getAddMessageMethod = DistributionGrpc.getAddMessageMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getAddMessageMethod = DistributionGrpc.getAddMessageMethod) == null) {
          DistributionGrpc.getAddMessageMethod = getAddMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.MessageOuterClass.Message, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("addMessage"))
              .build();
        }
      }
    }
    return getAddMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessage",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.MessageOuterClass.Message> getGetMessageMethod;
    if ((getGetMessageMethod = DistributionGrpc.getGetMessageMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetMessageMethod = DistributionGrpc.getGetMessageMethod) == null) {
          DistributionGrpc.getGetMessageMethod = getGetMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("getMessage"))
              .build();
        }
      }
    }
    return getGetMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessages",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessagesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.MessageOuterClass.Message> getGetMessagesMethod;
    if ((getGetMessagesMethod = DistributionGrpc.getGetMessagesMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetMessagesMethod = DistributionGrpc.getGetMessagesMethod) == null) {
          DistributionGrpc.getGetMessagesMethod = getGetMessagesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("getMessages"))
              .build();
        }
      }
    }
    return getGetMessagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.google.protobuf.Empty> getUpdateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMessage",
      requestType = com.passkit.grpc.MessageOuterClass.Message.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.google.protobuf.Empty> getUpdateMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message, com.google.protobuf.Empty> getUpdateMessageMethod;
    if ((getUpdateMessageMethod = DistributionGrpc.getUpdateMessageMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getUpdateMessageMethod = DistributionGrpc.getUpdateMessageMethod) == null) {
          DistributionGrpc.getUpdateMessageMethod = getUpdateMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.MessageOuterClass.Message, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("updateMessage"))
              .build();
        }
      }
    }
    return getUpdateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getCancelMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "cancelMessage",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getCancelMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getCancelMessageMethod;
    if ((getCancelMessageMethod = DistributionGrpc.getCancelMessageMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getCancelMessageMethod = DistributionGrpc.getCancelMessageMethod) == null) {
          DistributionGrpc.getCancelMessageMethod = getCancelMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "cancelMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("cancelMessage"))
              .build();
        }
      }
    }
    return getCancelMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistributionStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionStub>() {
        @java.lang.Override
        public DistributionStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionStub(channel, callOptions);
        }
      };
    return DistributionStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistributionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionBlockingStub>() {
        @java.lang.Override
        public DistributionBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionBlockingStub(channel, callOptions);
        }
      };
    return DistributionBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistributionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DistributionFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DistributionFutureStub>() {
        @java.lang.Override
        public DistributionFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DistributionFutureStub(channel, callOptions);
        }
      };
    return DistributionFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Sends a welcome email to a single recipient using a valid pass protocol (e.g., membership, coupon, ticket). Required Fields: passId or externalId, classId, protocol.
     * </pre>
     */
    default void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendWelcomeEmailMethod(), responseObserver);
    }

    /**
     * <pre>
     * Generates and returns an encrypted SmartPass link for a member, coupon, or event ticket based on the request payload. Required Fields: passId or externalId, classId.
     * </pre>
     */
    default void getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmartPassLinkMethod(), responseObserver);
    }

    /**
     * <pre>
     * Returns a list of fields to be displayed on the data collection page. For the Member protocol, classId is required. Required Fields: classId (only for MEMBERSHIP protocol)
     * </pre>
     */
    default void getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.DataCollectionFields> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataCollectionPageFieldsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accepts a CSV file containing user data and a project short code, processes SmartPass creation, and sends results to the user via email. Required Fields: shortCode, csv contents.
     * </pre>
     */
    default void uploadSmartPassCsv(com.passkit.grpc.Distribution.SmartPassCsvUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadSmartPassCsvMethod(), responseObserver);
    }

    /**
     * <pre>
     * Imports and processes a formatted CSV file for a given protocol (e.g., member, coupon) and creates billable records. Required: classId, protocol, and valid csv contents.
     * </pre>
     */
    default void importProtocolCsv(com.passkit.grpc.Distribution.ImportProtocolRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getImportProtocolCsvMethod(), responseObserver);
    }

    /**
     * <pre>
     * Validates a time-based one-time password (TOTP) barcode string in the format {{payload}}||{{key}}||{{timestamp}}||{{totp}}. If valid, returns the cleaned payload without TOTP metadata. Required Fields: payload.
     * </pre>
     */
    default void validateBarcode(com.passkit.grpc.CommonObjects.Payload request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Payload> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateBarcodeMethod(), responseObserver);
    }

    /**
     */
    default void addMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMessageMethod(), responseObserver);
    }

    /**
     */
    default void getMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageMethod(), responseObserver);
    }

    /**
     */
    default void getMessages(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessagesMethod(), responseObserver);
    }

    /**
     */
    default void updateMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMessageMethod(), responseObserver);
    }

    /**
     */
    default void cancelMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelMessageMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Distribution.
   * <pre>
   * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
   * </pre>
   */
  public static abstract class DistributionImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return DistributionGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Distribution.
   * <pre>
   * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
   * </pre>
   */
  public static final class DistributionStub
      extends io.grpc.stub.AbstractAsyncStub<DistributionStub> {
    private DistributionStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a welcome email to a single recipient using a valid pass protocol (e.g., membership, coupon, ticket). Required Fields: passId or externalId, classId, protocol.
     * </pre>
     */
    public void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Generates and returns an encrypted SmartPass link for a member, coupon, or event ticket based on the request payload. Required Fields: passId or externalId, classId.
     * </pre>
     */
    public void getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSmartPassLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Returns a list of fields to be displayed on the data collection page. For the Member protocol, classId is required. Required Fields: classId (only for MEMBERSHIP protocol)
     * </pre>
     */
    public void getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.DataCollectionFields> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataCollectionPageFieldsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Accepts a CSV file containing user data and a project short code, processes SmartPass creation, and sends results to the user via email. Required Fields: shortCode, csv contents.
     * </pre>
     */
    public void uploadSmartPassCsv(com.passkit.grpc.Distribution.SmartPassCsvUploadRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadSmartPassCsvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Imports and processes a formatted CSV file for a given protocol (e.g., member, coupon) and creates billable records. Required: classId, protocol, and valid csv contents.
     * </pre>
     */
    public void importProtocolCsv(com.passkit.grpc.Distribution.ImportProtocolRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getImportProtocolCsvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Validates a time-based one-time password (TOTP) barcode string in the format {{payload}}||{{key}}||{{timestamp}}||{{totp}}. If valid, returns the cleaned payload without TOTP metadata. Required Fields: payload.
     * </pre>
     */
    public void validateBarcode(com.passkit.grpc.CommonObjects.Payload request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Payload> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateBarcodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMessages(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMessagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Distribution.
   * <pre>
   * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
   * </pre>
   */
  public static final class DistributionBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<DistributionBlockingStub> {
    private DistributionBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a welcome email to a single recipient using a valid pass protocol (e.g., membership, coupon, ticket). Required Fields: passId or externalId, classId, protocol.
     * </pre>
     */
    public com.google.protobuf.Empty sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWelcomeEmailMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Generates and returns an encrypted SmartPass link for a member, coupon, or event ticket based on the request payload. Required Fields: passId or externalId, classId.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Url getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSmartPassLinkMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Returns a list of fields to be displayed on the data collection page. For the Member protocol, classId is required. Required Fields: classId (only for MEMBERSHIP protocol)
     * </pre>
     */
    public com.passkit.grpc.Distribution.DataCollectionFields getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataCollectionPageFieldsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Accepts a CSV file containing user data and a project short code, processes SmartPass creation, and sends results to the user via email. Required Fields: shortCode, csv contents.
     * </pre>
     */
    public com.google.protobuf.Empty uploadSmartPassCsv(com.passkit.grpc.Distribution.SmartPassCsvUploadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadSmartPassCsvMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Imports and processes a formatted CSV file for a given protocol (e.g., member, coupon) and creates billable records. Required: classId, protocol, and valid csv contents.
     * </pre>
     */
    public com.google.protobuf.Empty importProtocolCsv(com.passkit.grpc.Distribution.ImportProtocolRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getImportProtocolCsvMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Validates a time-based one-time password (TOTP) barcode string in the format {{payload}}||{{key}}||{{timestamp}}||{{totp}}. If valid, returns the cleaned payload without TOTP metadata. Required Fields: payload.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Payload validateBarcode(com.passkit.grpc.CommonObjects.Payload request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateBarcodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty addMessage(com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.MessageOuterClass.Message getMessage(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.MessageOuterClass.Message> getMessages(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMessagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateMessage(com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty cancelMessage(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Distribution.
   * <pre>
   * The PassKit Distribution API allows you to create SmartPass links and manage the distribution of digital passes to your customers via email.
   * </pre>
   */
  public static final class DistributionFutureStub
      extends io.grpc.stub.AbstractFutureStub<DistributionFutureStub> {
    private DistributionFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DistributionFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Sends a welcome email to a single recipient using a valid pass protocol (e.g., membership, coupon, ticket). Required Fields: passId or externalId, classId, protocol.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendWelcomeEmail(
        com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Generates and returns an encrypted SmartPass link for a member, coupon, or event ticket based on the request payload. Required Fields: passId or externalId, classId.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getSmartPassLink(
        com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSmartPassLinkMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Returns a list of fields to be displayed on the data collection page. For the Member protocol, classId is required. Required Fields: classId (only for MEMBERSHIP protocol)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Distribution.DataCollectionFields> getDataCollectionPageFields(
        com.passkit.grpc.CommonObjects.ClassObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataCollectionPageFieldsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Accepts a CSV file containing user data and a project short code, processes SmartPass creation, and sends results to the user via email. Required Fields: shortCode, csv contents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> uploadSmartPassCsv(
        com.passkit.grpc.Distribution.SmartPassCsvUploadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadSmartPassCsvMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Imports and processes a formatted CSV file for a given protocol (e.g., member, coupon) and creates billable records. Required: classId, protocol, and valid csv contents.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> importProtocolCsv(
        com.passkit.grpc.Distribution.ImportProtocolRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getImportProtocolCsvMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Validates a time-based one-time password (TOTP) barcode string in the format {{payload}}||{{key}}||{{timestamp}}||{{totp}}. If valid, returns the cleaned payload without TOTP metadata. Required Fields: payload.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Payload> validateBarcode(
        com.passkit.grpc.CommonObjects.Payload request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateBarcodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> addMessage(
        com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.MessageOuterClass.Message> getMessage(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateMessage(
        com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> cancelMessage(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_WELCOME_EMAIL = 0;
  private static final int METHODID_GET_SMART_PASS_LINK = 1;
  private static final int METHODID_GET_DATA_COLLECTION_PAGE_FIELDS = 2;
  private static final int METHODID_UPLOAD_SMART_PASS_CSV = 3;
  private static final int METHODID_IMPORT_PROTOCOL_CSV = 4;
  private static final int METHODID_VALIDATE_BARCODE = 5;
  private static final int METHODID_ADD_MESSAGE = 6;
  private static final int METHODID_GET_MESSAGE = 7;
  private static final int METHODID_GET_MESSAGES = 8;
  private static final int METHODID_UPDATE_MESSAGE = 9;
  private static final int METHODID_CANCEL_MESSAGE = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_WELCOME_EMAIL:
          serviceImpl.sendWelcomeEmail((com.passkit.grpc.Distribution.EmailDistributionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SMART_PASS_LINK:
          serviceImpl.getSmartPassLink((com.passkit.grpc.Distribution.SmartPassLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_GET_DATA_COLLECTION_PAGE_FIELDS:
          serviceImpl.getDataCollectionPageFields((com.passkit.grpc.CommonObjects.ClassObjectInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.DataCollectionFields>) responseObserver);
          break;
        case METHODID_UPLOAD_SMART_PASS_CSV:
          serviceImpl.uploadSmartPassCsv((com.passkit.grpc.Distribution.SmartPassCsvUploadRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_IMPORT_PROTOCOL_CSV:
          serviceImpl.importProtocolCsv((com.passkit.grpc.Distribution.ImportProtocolRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_VALIDATE_BARCODE:
          serviceImpl.validateBarcode((com.passkit.grpc.CommonObjects.Payload) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Payload>) responseObserver);
          break;
        case METHODID_ADD_MESSAGE:
          serviceImpl.addMessage((com.passkit.grpc.MessageOuterClass.Message) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_GET_MESSAGES:
          serviceImpl.getMessages((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_UPDATE_MESSAGE:
          serviceImpl.updateMessage((com.passkit.grpc.MessageOuterClass.Message) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CANCEL_MESSAGE:
          serviceImpl.cancelMessage((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendWelcomeEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Distribution.EmailDistributionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_SEND_WELCOME_EMAIL)))
        .addMethod(
          getGetSmartPassLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Distribution.SmartPassLinkRequest,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_SMART_PASS_LINK)))
        .addMethod(
          getGetDataCollectionPageFieldsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.ClassObjectInput,
              com.passkit.grpc.Distribution.DataCollectionFields>(
                service, METHODID_GET_DATA_COLLECTION_PAGE_FIELDS)))
        .addMethod(
          getUploadSmartPassCsvMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Distribution.SmartPassCsvUploadRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPLOAD_SMART_PASS_CSV)))
        .addMethod(
          getImportProtocolCsvMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Distribution.ImportProtocolRequest,
              com.google.protobuf.Empty>(
                service, METHODID_IMPORT_PROTOCOL_CSV)))
        .addMethod(
          getValidateBarcodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Payload,
              com.passkit.grpc.CommonObjects.Payload>(
                service, METHODID_VALIDATE_BARCODE)))
        .addMethod(
          getAddMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.MessageOuterClass.Message,
              com.google.protobuf.Empty>(
                service, METHODID_ADD_MESSAGE)))
        .addMethod(
          getGetMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.MessageOuterClass.Message>(
                service, METHODID_GET_MESSAGE)))
        .addMethod(
          getGetMessagesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.MessageOuterClass.Message>(
                service, METHODID_GET_MESSAGES)))
        .addMethod(
          getUpdateMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.MessageOuterClass.Message,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_MESSAGE)))
        .addMethod(
          getCancelMessageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_CANCEL_MESSAGE)))
        .build();
  }

  private static abstract class DistributionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DistributionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcDistribution.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Distribution");
    }
  }

  private static final class DistributionFileDescriptorSupplier
      extends DistributionBaseDescriptorSupplier {
    DistributionFileDescriptorSupplier() {}
  }

  private static final class DistributionMethodDescriptorSupplier
      extends DistributionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    DistributionMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DistributionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DistributionFileDescriptorSupplier())
              .addMethod(getSendWelcomeEmailMethod())
              .addMethod(getGetSmartPassLinkMethod())
              .addMethod(getGetDataCollectionPageFieldsMethod())
              .addMethod(getUploadSmartPassCsvMethod())
              .addMethod(getImportProtocolCsvMethod())
              .addMethod(getValidateBarcodeMethod())
              .addMethod(getAddMessageMethod())
              .addMethod(getGetMessageMethod())
              .addMethod(getGetMessagesMethod())
              .addMethod(getUpdateMessageMethod())
              .addMethod(getCancelMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
