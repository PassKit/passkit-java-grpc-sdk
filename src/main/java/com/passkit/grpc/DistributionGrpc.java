package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.19.0)",
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
              .setFullMethodName(generateFullMethodName(
                  "io.Distribution", "sendWelcomeEmail"))
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
      com.passkit.grpc.CommonObjects.Url> getGetSmartPasssLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSmartPasssLink",
      requestType = com.passkit.grpc.Distribution.SmartPassLinkRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassLinkRequest,
      com.passkit.grpc.CommonObjects.Url> getGetSmartPasssLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Distribution.SmartPassLinkRequest, com.passkit.grpc.CommonObjects.Url> getGetSmartPasssLinkMethod;
    if ((getGetSmartPasssLinkMethod = DistributionGrpc.getGetSmartPasssLinkMethod) == null) {
      synchronized (DistributionGrpc.class) {
        if ((getGetSmartPasssLinkMethod = DistributionGrpc.getGetSmartPasssLinkMethod) == null) {
          DistributionGrpc.getGetSmartPasssLinkMethod = getGetSmartPasssLinkMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.Distribution.SmartPassLinkRequest, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.Distribution", "getSmartPasssLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.SmartPassLinkRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
                  .setSchemaDescriptor(new DistributionMethodDescriptorSupplier("getSmartPasssLink"))
                  .build();
          }
        }
     }
     return getGetSmartPasssLinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DistributionStub newStub(io.grpc.Channel channel) {
    return new DistributionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DistributionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DistributionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DistributionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DistributionFutureStub(channel);
  }

  /**
   */
  public static abstract class DistributionImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendWelcomeEmailMethod(), responseObserver);
    }

    /**
     */
    public void getSmartPasssLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      asyncUnimplementedUnaryCall(getGetSmartPasssLinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendWelcomeEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Distribution.EmailDistributionRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_WELCOME_EMAIL)))
          .addMethod(
            getGetSmartPasssLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Distribution.SmartPassLinkRequest,
                com.passkit.grpc.CommonObjects.Url>(
                  this, METHODID_GET_SMART_PASSS_LINK)))
          .build();
    }
  }

  /**
   */
  public static final class DistributionStub extends io.grpc.stub.AbstractStub<DistributionStub> {
    private DistributionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistributionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistributionStub(channel, callOptions);
    }

    /**
     */
    public void sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSmartPasssLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetSmartPasssLinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DistributionBlockingStub extends io.grpc.stub.AbstractStub<DistributionBlockingStub> {
    private DistributionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistributionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistributionBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty sendWelcomeEmail(com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendWelcomeEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getSmartPasssLink(com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetSmartPasssLinkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DistributionFutureStub extends io.grpc.stub.AbstractStub<DistributionFutureStub> {
    private DistributionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DistributionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DistributionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DistributionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendWelcomeEmail(
        com.passkit.grpc.Distribution.EmailDistributionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendWelcomeEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getSmartPasssLink(
        com.passkit.grpc.Distribution.SmartPassLinkRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetSmartPasssLinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_WELCOME_EMAIL = 0;
  private static final int METHODID_GET_SMART_PASSS_LINK = 1;

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
        case METHODID_GET_SMART_PASSS_LINK:
          serviceImpl.getSmartPasssLink((com.passkit.grpc.Distribution.SmartPassLinkRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
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
              .addMethod(getGetSmartPasssLinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
