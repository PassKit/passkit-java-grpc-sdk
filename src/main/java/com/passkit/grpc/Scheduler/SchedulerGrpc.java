package com.passkit.grpc.Scheduler;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: io/scheduler/a_rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SchedulerGrpc {

  private SchedulerGrpc() {}

  public static final String SERVICE_NAME = "scheduler.Scheduler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getCreateSchedulingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSchedulingJob",
      requestType = ct.Scheduler.SchedulingJob.class,
      responseType = ct.Scheduler.SchedulingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getCreateSchedulingJobMethod() {
    io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse> getCreateSchedulingJobMethod;
    if ((getCreateSchedulingJobMethod = SchedulerGrpc.getCreateSchedulingJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getCreateSchedulingJobMethod = SchedulerGrpc.getCreateSchedulingJobMethod) == null) {
          SchedulerGrpc.getCreateSchedulingJobMethod = getCreateSchedulingJobMethod =
              io.grpc.MethodDescriptor.<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSchedulingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("createSchedulingJob"))
              .build();
        }
      }
    }
    return getCreateSchedulingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      ct.Scheduler.SchedulingJob> getGetSchedulingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSchedulingJob",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = ct.Scheduler.SchedulingJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      ct.Scheduler.SchedulingJob> getGetSchedulingJobMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, ct.Scheduler.SchedulingJob> getGetSchedulingJobMethod;
    if ((getGetSchedulingJobMethod = SchedulerGrpc.getGetSchedulingJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getGetSchedulingJobMethod = SchedulerGrpc.getGetSchedulingJobMethod) == null) {
          SchedulerGrpc.getGetSchedulingJobMethod = getGetSchedulingJobMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, ct.Scheduler.SchedulingJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSchedulingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJob.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("getSchedulingJob"))
              .build();
        }
      }
    }
    return getGetSchedulingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getUpdateSchedulingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSchedulingJob",
      requestType = ct.Scheduler.SchedulingJob.class,
      responseType = ct.Scheduler.SchedulingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getUpdateSchedulingJobMethod() {
    io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse> getUpdateSchedulingJobMethod;
    if ((getUpdateSchedulingJobMethod = SchedulerGrpc.getUpdateSchedulingJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getUpdateSchedulingJobMethod = SchedulerGrpc.getUpdateSchedulingJobMethod) == null) {
          SchedulerGrpc.getUpdateSchedulingJobMethod = getUpdateSchedulingJobMethod =
              io.grpc.MethodDescriptor.<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSchedulingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("updateSchedulingJob"))
              .build();
        }
      }
    }
    return getUpdateSchedulingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getPatchSchedulingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchSchedulingJob",
      requestType = ct.Scheduler.SchedulingJob.class,
      responseType = ct.Scheduler.SchedulingJobResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob,
      ct.Scheduler.SchedulingJobResponse> getPatchSchedulingJobMethod() {
    io.grpc.MethodDescriptor<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse> getPatchSchedulingJobMethod;
    if ((getPatchSchedulingJobMethod = SchedulerGrpc.getPatchSchedulingJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getPatchSchedulingJobMethod = SchedulerGrpc.getPatchSchedulingJobMethod) == null) {
          SchedulerGrpc.getPatchSchedulingJobMethod = getPatchSchedulingJobMethod =
              io.grpc.MethodDescriptor.<ct.Scheduler.SchedulingJob, ct.Scheduler.SchedulingJobResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "patchSchedulingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.SchedulingJobResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("patchSchedulingJob"))
              .build();
        }
      }
    }
    return getPatchSchedulingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteSchedulingJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSchedulingJob",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteSchedulingJobMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteSchedulingJobMethod;
    if ((getDeleteSchedulingJobMethod = SchedulerGrpc.getDeleteSchedulingJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDeleteSchedulingJobMethod = SchedulerGrpc.getDeleteSchedulingJobMethod) == null) {
          SchedulerGrpc.getDeleteSchedulingJobMethod = getDeleteSchedulingJobMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSchedulingJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("deleteSchedulingJob"))
              .build();
        }
      }
    }
    return getDeleteSchedulingJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      ct.Scheduler.JobHistory> getGetSchedulingJobHistoryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSchedulingJobHistory",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = ct.Scheduler.JobHistory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      ct.Scheduler.JobHistory> getGetSchedulingJobHistoryMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, ct.Scheduler.JobHistory> getGetSchedulingJobHistoryMethod;
    if ((getGetSchedulingJobHistoryMethod = SchedulerGrpc.getGetSchedulingJobHistoryMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getGetSchedulingJobHistoryMethod = SchedulerGrpc.getGetSchedulingJobHistoryMethod) == null) {
          SchedulerGrpc.getGetSchedulingJobHistoryMethod = getGetSchedulingJobHistoryMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, ct.Scheduler.JobHistory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSchedulingJobHistory"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.JobHistory.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("getSchedulingJobHistory"))
              .build();
        }
      }
    }
    return getGetSchedulingJobHistoryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Scheduler.Scheduler.ListRequest,
      ct.Scheduler.JobHistory> getListSchedulingJobHistoriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listSchedulingJobHistories",
      requestType = com.passkit.grpc.Scheduler.Scheduler.ListRequest.class,
      responseType = ct.Scheduler.JobHistory.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Scheduler.Scheduler.ListRequest,
      ct.Scheduler.JobHistory> getListSchedulingJobHistoriesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Scheduler.Scheduler.ListRequest, ct.Scheduler.JobHistory> getListSchedulingJobHistoriesMethod;
    if ((getListSchedulingJobHistoriesMethod = SchedulerGrpc.getListSchedulingJobHistoriesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getListSchedulingJobHistoriesMethod = SchedulerGrpc.getListSchedulingJobHistoriesMethod) == null) {
          SchedulerGrpc.getListSchedulingJobHistoriesMethod = getListSchedulingJobHistoriesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Scheduler.Scheduler.ListRequest, ct.Scheduler.JobHistory>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listSchedulingJobHistories"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Scheduler.Scheduler.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ct.Scheduler.JobHistory.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("listSchedulingJobHistories"))
              .build();
        }
      }
    }
    return getListSchedulingJobHistoriesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchedulerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerStub>() {
        @java.lang.Override
        public SchedulerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerStub(channel, callOptions);
        }
      };
    return SchedulerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchedulerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub>() {
        @java.lang.Override
        public SchedulerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerBlockingStub(channel, callOptions);
        }
      };
    return SchedulerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchedulerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub>() {
        @java.lang.Override
        public SchedulerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerFutureStub(channel, callOptions);
        }
      };
    return SchedulerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SchedulerImplBase implements io.grpc.BindableService {

    /**
     */
    public void createSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSchedulingJobMethod(), responseObserver);
    }

    /**
     */
    public void getSchedulingJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulingJobMethod(), responseObserver);
    }

    /**
     */
    public void updateSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSchedulingJobMethod(), responseObserver);
    }

    /**
     */
    public void patchSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchSchedulingJobMethod(), responseObserver);
    }

    /**
     */
    public void deleteSchedulingJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSchedulingJobMethod(), responseObserver);
    }

    /**
     */
    public void getSchedulingJobHistory(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSchedulingJobHistoryMethod(), responseObserver);
    }

    /**
     */
    public void listSchedulingJobHistories(com.passkit.grpc.Scheduler.Scheduler.ListRequest request,
        io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSchedulingJobHistoriesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateSchedulingJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ct.Scheduler.SchedulingJob,
                ct.Scheduler.SchedulingJobResponse>(
                  this, METHODID_CREATE_SCHEDULING_JOB)))
          .addMethod(
            getGetSchedulingJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                ct.Scheduler.SchedulingJob>(
                  this, METHODID_GET_SCHEDULING_JOB)))
          .addMethod(
            getUpdateSchedulingJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ct.Scheduler.SchedulingJob,
                ct.Scheduler.SchedulingJobResponse>(
                  this, METHODID_UPDATE_SCHEDULING_JOB)))
          .addMethod(
            getPatchSchedulingJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                ct.Scheduler.SchedulingJob,
                ct.Scheduler.SchedulingJobResponse>(
                  this, METHODID_PATCH_SCHEDULING_JOB)))
          .addMethod(
            getDeleteSchedulingJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_SCHEDULING_JOB)))
          .addMethod(
            getGetSchedulingJobHistoryMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                ct.Scheduler.JobHistory>(
                  this, METHODID_GET_SCHEDULING_JOB_HISTORY)))
          .addMethod(
            getListSchedulingJobHistoriesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Scheduler.Scheduler.ListRequest,
                ct.Scheduler.JobHistory>(
                  this, METHODID_LIST_SCHEDULING_JOB_HISTORIES)))
          .build();
    }
  }

  /**
   */
  public static final class SchedulerStub extends io.grpc.stub.AbstractAsyncStub<SchedulerStub> {
    private SchedulerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerStub(channel, callOptions);
    }

    /**
     */
    public void createSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSchedulingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchedulingJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSchedulingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchSchedulingJob(ct.Scheduler.SchedulingJob request,
        io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchSchedulingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSchedulingJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSchedulingJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSchedulingJobHistory(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSchedulingJobHistoryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSchedulingJobHistories(com.passkit.grpc.Scheduler.Scheduler.ListRequest request,
        io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListSchedulingJobHistoriesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SchedulerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SchedulerBlockingStub> {
    private SchedulerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerBlockingStub(channel, callOptions);
    }

    /**
     */
    public ct.Scheduler.SchedulingJobResponse createSchedulingJob(ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSchedulingJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public ct.Scheduler.SchedulingJob getSchedulingJob(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulingJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public ct.Scheduler.SchedulingJobResponse updateSchedulingJob(ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSchedulingJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public ct.Scheduler.SchedulingJobResponse patchSchedulingJob(ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchSchedulingJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSchedulingJob(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSchedulingJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public ct.Scheduler.JobHistory getSchedulingJobHistory(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSchedulingJobHistoryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<ct.Scheduler.JobHistory> listSchedulingJobHistories(
        com.passkit.grpc.Scheduler.Scheduler.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListSchedulingJobHistoriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SchedulerFutureStub extends io.grpc.stub.AbstractFutureStub<SchedulerFutureStub> {
    private SchedulerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ct.Scheduler.SchedulingJobResponse> createSchedulingJob(
        ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSchedulingJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ct.Scheduler.SchedulingJob> getSchedulingJob(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulingJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ct.Scheduler.SchedulingJobResponse> updateSchedulingJob(
        ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSchedulingJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ct.Scheduler.SchedulingJobResponse> patchSchedulingJob(
        ct.Scheduler.SchedulingJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchSchedulingJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSchedulingJob(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSchedulingJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<ct.Scheduler.JobHistory> getSchedulingJobHistory(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSchedulingJobHistoryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_SCHEDULING_JOB = 0;
  private static final int METHODID_GET_SCHEDULING_JOB = 1;
  private static final int METHODID_UPDATE_SCHEDULING_JOB = 2;
  private static final int METHODID_PATCH_SCHEDULING_JOB = 3;
  private static final int METHODID_DELETE_SCHEDULING_JOB = 4;
  private static final int METHODID_GET_SCHEDULING_JOB_HISTORY = 5;
  private static final int METHODID_LIST_SCHEDULING_JOB_HISTORIES = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SchedulerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SchedulerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_SCHEDULING_JOB:
          serviceImpl.createSchedulingJob((ct.Scheduler.SchedulingJob) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse>) responseObserver);
          break;
        case METHODID_GET_SCHEDULING_JOB:
          serviceImpl.getSchedulingJob((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJob>) responseObserver);
          break;
        case METHODID_UPDATE_SCHEDULING_JOB:
          serviceImpl.updateSchedulingJob((ct.Scheduler.SchedulingJob) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse>) responseObserver);
          break;
        case METHODID_PATCH_SCHEDULING_JOB:
          serviceImpl.patchSchedulingJob((ct.Scheduler.SchedulingJob) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.SchedulingJobResponse>) responseObserver);
          break;
        case METHODID_DELETE_SCHEDULING_JOB:
          serviceImpl.deleteSchedulingJob((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SCHEDULING_JOB_HISTORY:
          serviceImpl.getSchedulingJobHistory((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory>) responseObserver);
          break;
        case METHODID_LIST_SCHEDULING_JOB_HISTORIES:
          serviceImpl.listSchedulingJobHistories((com.passkit.grpc.Scheduler.Scheduler.ListRequest) request,
              (io.grpc.stub.StreamObserver<ct.Scheduler.JobHistory>) responseObserver);
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

  private static abstract class SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SchedulerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.Scheduler.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Scheduler");
    }
  }

  private static final class SchedulerFileDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier {
    SchedulerFileDescriptorSupplier() {}
  }

  private static final class SchedulerMethodDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SchedulerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SchedulerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchedulerFileDescriptorSupplier())
              .addMethod(getCreateSchedulingJobMethod())
              .addMethod(getGetSchedulingJobMethod())
              .addMethod(getUpdateSchedulingJobMethod())
              .addMethod(getPatchSchedulingJobMethod())
              .addMethod(getDeleteSchedulingJobMethod())
              .addMethod(getGetSchedulingJobHistoryMethod())
              .addMethod(getListSchedulingJobHistoriesMethod())
              .build();
        }
      }
    }
    return result;
  }
}