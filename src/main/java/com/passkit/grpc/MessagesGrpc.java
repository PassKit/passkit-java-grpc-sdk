package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: io/core/a_rpc_messages.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MessagesGrpc {

  private MessagesGrpc() {}

  public static final String SERVICE_NAME = "io.Messages";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetMessageMethod = MessagesGrpc.getGetMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getGetMessageMethod = MessagesGrpc.getGetMessageMethod) == null) {
          MessagesGrpc.getGetMessageMethod = getGetMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("getMessage"))
              .build();
        }
      }
    }
    return getGetMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.passkit.grpc.CommonObjects.Id> getCreateMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMessage",
      requestType = com.passkit.grpc.MessageOuterClass.Message.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message,
      com.passkit.grpc.CommonObjects.Id> getCreateMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.Message, com.passkit.grpc.CommonObjects.Id> getCreateMessageMethod;
    if ((getCreateMessageMethod = MessagesGrpc.getCreateMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getCreateMessageMethod = MessagesGrpc.getCreateMessageMethod) == null) {
          MessagesGrpc.getCreateMessageMethod = getCreateMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.MessageOuterClass.Message, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("createMessage"))
              .build();
        }
      }
    }
    return getCreateMessageMethod;
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
    if ((getUpdateMessageMethod = MessagesGrpc.getUpdateMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getUpdateMessageMethod = MessagesGrpc.getUpdateMessageMethod) == null) {
          MessagesGrpc.getUpdateMessageMethod = getUpdateMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.MessageOuterClass.Message, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("updateMessage"))
              .build();
        }
      }
    }
    return getUpdateMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMessage",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteMessageMethod;
    if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getDeleteMessageMethod = MessagesGrpc.getDeleteMessageMethod) == null) {
          MessagesGrpc.getDeleteMessageMethod = getDeleteMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("deleteMessage"))
              .build();
        }
      }
    }
    return getDeleteMessageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.SendMessageRequest,
      com.passkit.grpc.MessageOuterClass.SendMessageResponse> getSendMessageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendMessage",
      requestType = com.passkit.grpc.MessageOuterClass.SendMessageRequest.class,
      responseType = com.passkit.grpc.MessageOuterClass.SendMessageResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.SendMessageRequest,
      com.passkit.grpc.MessageOuterClass.SendMessageResponse> getSendMessageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.MessageOuterClass.SendMessageRequest, com.passkit.grpc.MessageOuterClass.SendMessageResponse> getSendMessageMethod;
    if ((getSendMessageMethod = MessagesGrpc.getSendMessageMethod) == null) {
      synchronized (MessagesGrpc.class) {
        if ((getSendMessageMethod = MessagesGrpc.getSendMessageMethod) == null) {
          MessagesGrpc.getSendMessageMethod = getSendMessageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.MessageOuterClass.SendMessageRequest, com.passkit.grpc.MessageOuterClass.SendMessageResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendMessage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.SendMessageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.SendMessageResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MessagesMethodDescriptorSupplier("sendMessage"))
              .build();
        }
      }
    }
    return getSendMessageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MessagesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesStub>() {
        @java.lang.Override
        public MessagesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesStub(channel, callOptions);
        }
      };
    return MessagesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MessagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesBlockingStub>() {
        @java.lang.Override
        public MessagesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesBlockingStub(channel, callOptions);
        }
      };
    return MessagesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MessagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MessagesFutureStub>() {
        @java.lang.Override
        public MessagesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MessagesFutureStub(channel, callOptions);
        }
      };
    return MessagesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MessagesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageMethod(), responseObserver);
    }

    /**
     */
    public void createMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMessageMethod(), responseObserver);
    }

    /**
     */
    public void updateMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMessageMethod(), responseObserver);
    }

    /**
     */
    public void deleteMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMessageMethod(), responseObserver);
    }

    /**
     */
    public void sendMessage(com.passkit.grpc.MessageOuterClass.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.SendMessageResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendMessageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.MessageOuterClass.Message>(
                  this, METHODID_GET_MESSAGE)))
          .addMethod(
            getCreateMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.MessageOuterClass.Message,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_MESSAGE)))
          .addMethod(
            getUpdateMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.MessageOuterClass.Message,
                com.google.protobuf.Empty>(
                  this, METHODID_UPDATE_MESSAGE)))
          .addMethod(
            getDeleteMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_MESSAGE)))
          .addMethod(
            getSendMessageMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.MessageOuterClass.SendMessageRequest,
                com.passkit.grpc.MessageOuterClass.SendMessageResponse>(
                  this, METHODID_SEND_MESSAGE)))
          .build();
    }
  }

  /**
   */
  public static final class MessagesStub extends io.grpc.stub.AbstractAsyncStub<MessagesStub> {
    private MessagesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesStub(channel, callOptions);
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
    public void createMessage(com.passkit.grpc.MessageOuterClass.Message request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request, responseObserver);
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
    public void deleteMessage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendMessage(com.passkit.grpc.MessageOuterClass.SendMessageRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.SendMessageResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MessagesBlockingStub extends io.grpc.stub.AbstractBlockingStub<MessagesBlockingStub> {
    private MessagesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.MessageOuterClass.Message getMessage(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createMessage(com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateMessage(com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteMessage(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMessageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.MessageOuterClass.SendMessageResponse sendMessage(com.passkit.grpc.MessageOuterClass.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendMessageMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MessagesFutureStub extends io.grpc.stub.AbstractFutureStub<MessagesFutureStub> {
    private MessagesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MessagesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MessagesFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createMessage(
        com.passkit.grpc.MessageOuterClass.Message request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMessageMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMessage(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMessageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.MessageOuterClass.SendMessageResponse> sendMessage(
        com.passkit.grpc.MessageOuterClass.SendMessageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendMessageMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_MESSAGE = 0;
  private static final int METHODID_CREATE_MESSAGE = 1;
  private static final int METHODID_UPDATE_MESSAGE = 2;
  private static final int METHODID_DELETE_MESSAGE = 3;
  private static final int METHODID_SEND_MESSAGE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MessagesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MessagesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_MESSAGE:
          serviceImpl.getMessage((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_CREATE_MESSAGE:
          serviceImpl.createMessage((com.passkit.grpc.MessageOuterClass.Message) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_MESSAGE:
          serviceImpl.updateMessage((com.passkit.grpc.MessageOuterClass.Message) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MESSAGE:
          serviceImpl.deleteMessage((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_MESSAGE:
          serviceImpl.sendMessage((com.passkit.grpc.MessageOuterClass.SendMessageRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.SendMessageResponse>) responseObserver);
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

  private static abstract class MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MessagesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcMessages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Messages");
    }
  }

  private static final class MessagesFileDescriptorSupplier
      extends MessagesBaseDescriptorSupplier {
    MessagesFileDescriptorSupplier() {}
  }

  private static final class MessagesMethodDescriptorSupplier
      extends MessagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MessagesMethodDescriptorSupplier(String methodName) {
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
      synchronized (MessagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MessagesFileDescriptorSupplier())
              .addMethod(getGetMessageMethod())
              .addMethod(getCreateMessageMethod())
              .addMethod(getUpdateMessageMethod())
              .addMethod(getDeleteMessageMethod())
              .addMethod(getSendMessageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
