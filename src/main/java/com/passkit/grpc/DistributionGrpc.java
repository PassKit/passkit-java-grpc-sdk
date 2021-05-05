package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.37.0)",
    comments = "Source: io/core/a_rpc_distribution.proto")
public final class DistributionGrpc {

  private DistributionGrpc() {}

  public static final String SERVICE_NAME = "io.Distribution";

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
   */
  public static abstract class DistributionImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendWelcomeEmailMethod(), responseObserver);
    }

    /**
     */
    public void getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSmartPassLinkMethod(), responseObserver);
    }

    /**
     */
    public void getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.DataCollectionFields> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDataCollectionPageFieldsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendWelcomeEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Distribution.EmailDistributionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_WELCOME_EMAIL)))
          .addMethod(
            getGetSmartPassLinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Distribution.SmartPassLinkRequest,
                com.passkit.grpc.CommonObjects.Url>(
                  this, METHODID_GET_SMART_PASS_LINK)))
          .addMethod(
            getGetDataCollectionPageFieldsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.ClassObjectInput,
                com.passkit.grpc.Distribution.DataCollectionFields>(
                  this, METHODID_GET_DATA_COLLECTION_PAGE_FIELDS)))
          .build();
    }
  }

  /**
   */
  public static final class DistributionStub extends io.grpc.stub.AbstractAsyncStub<DistributionStub> {
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
     */
    public void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSmartPassLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.DataCollectionFields> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDataCollectionPageFieldsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DistributionBlockingStub extends io.grpc.stub.AbstractBlockingStub<DistributionBlockingStub> {
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
     */
    public com.google.protobuf.Empty sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendWelcomeEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getSmartPassLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSmartPassLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Distribution.DataCollectionFields getDataCollectionPageFields(com.passkit.grpc.CommonObjects.ClassObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDataCollectionPageFieldsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DistributionFutureStub extends io.grpc.stub.AbstractFutureStub<DistributionFutureStub> {
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendWelcomeEmail(
        com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getSmartPassLink(
        com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSmartPassLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Distribution.DataCollectionFields> getDataCollectionPageFields(
        com.passkit.grpc.CommonObjects.ClassObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDataCollectionPageFieldsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_WELCOME_EMAIL = 0;
  private static final int METHODID_GET_SMART_PASS_LINK = 1;
  private static final int METHODID_GET_DATA_COLLECTION_PAGE_FIELDS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DistributionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DistributionImplBase serviceImpl, int methodId) {
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
    private final String methodName;

    DistributionMethodDescriptorSupplier(String methodName) {
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
              .build();
        }
      }
    }
    return result;
  }
}
