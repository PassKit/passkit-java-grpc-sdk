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
    comments = "Source: io/core/a_rpc_others.proto")
public final class JobsGrpc {

  private JobsGrpc() {}

  public static final String SERVICE_NAME = "io.Jobs";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.JobOuterClass.CsvImportRequest,
      com.passkit.grpc.CommonObjects.Id> getImportCsvMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "importCsv",
      requestType = com.passkit.grpc.JobOuterClass.CsvImportRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.JobOuterClass.CsvImportRequest,
      com.passkit.grpc.CommonObjects.Id> getImportCsvMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.JobOuterClass.CsvImportRequest, com.passkit.grpc.CommonObjects.Id> getImportCsvMethod;
    if ((getImportCsvMethod = JobsGrpc.getImportCsvMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getImportCsvMethod = JobsGrpc.getImportCsvMethod) == null) {
          JobsGrpc.getImportCsvMethod = getImportCsvMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.JobOuterClass.CsvImportRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.Jobs", "importCsv"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.JobOuterClass.CsvImportRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new JobsMethodDescriptorSupplier("importCsv"))
                  .build();
          }
        }
     }
     return getImportCsvMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.JobOuterClass.Job> getGetJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJobs",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.JobOuterClass.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.JobOuterClass.Job> getGetJobsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.JobOuterClass.Job> getGetJobsMethod;
    if ((getGetJobsMethod = JobsGrpc.getGetJobsMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobsMethod = JobsGrpc.getGetJobsMethod) == null) {
          JobsGrpc.getGetJobsMethod = getGetJobsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.JobOuterClass.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "io.Jobs", "getJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.JobOuterClass.Job.getDefaultInstance()))
                  .setSchemaDescriptor(new JobsMethodDescriptorSupplier("getJobs"))
                  .build();
          }
        }
     }
     return getGetJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.JobOuterClass.Job> getGetJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJob",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.JobOuterClass.Job.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.JobOuterClass.Job> getGetJobMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.JobOuterClass.Job> getGetJobMethod;
    if ((getGetJobMethod = JobsGrpc.getGetJobMethod) == null) {
      synchronized (JobsGrpc.class) {
        if ((getGetJobMethod = JobsGrpc.getGetJobMethod) == null) {
          JobsGrpc.getGetJobMethod = getGetJobMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.JobOuterClass.Job>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "io.Jobs", "getJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.JobOuterClass.Job.getDefaultInstance()))
                  .setSchemaDescriptor(new JobsMethodDescriptorSupplier("getJob"))
                  .build();
          }
        }
     }
     return getGetJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobsStub newStub(io.grpc.Channel channel) {
    return new JobsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new JobsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new JobsFutureStub(channel);
  }

  /**
   */
  public static abstract class JobsImplBase implements io.grpc.BindableService {

    /**
     */
    public void importCsv(com.passkit.grpc.JobOuterClass.CsvImportRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getImportCsvMethod(), responseObserver);
    }

    /**
     */
    public void getJobs(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobsMethod(), responseObserver);
    }

    /**
     */
    public void getJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getImportCsvMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.JobOuterClass.CsvImportRequest,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_IMPORT_CSV)))
          .addMethod(
            getGetJobsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.JobOuterClass.Job>(
                  this, METHODID_GET_JOBS)))
          .addMethod(
            getGetJobMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.JobOuterClass.Job>(
                  this, METHODID_GET_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class JobsStub extends io.grpc.stub.AbstractStub<JobsStub> {
    private JobsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsStub(channel, callOptions);
    }

    /**
     */
    public void importCsv(com.passkit.grpc.JobOuterClass.CsvImportRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getImportCsvMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJobs(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getJob(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobsBlockingStub extends io.grpc.stub.AbstractStub<JobsBlockingStub> {
    private JobsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id importCsv(com.passkit.grpc.JobOuterClass.CsvImportRequest request) {
      return blockingUnaryCall(
          getChannel(), getImportCsvMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.JobOuterClass.Job> getJobs(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return blockingServerStreamingCall(
          getChannel(), getGetJobsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.JobOuterClass.Job getJob(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobsFutureStub extends io.grpc.stub.AbstractStub<JobsFutureStub> {
    private JobsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private JobsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new JobsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> importCsv(
        com.passkit.grpc.JobOuterClass.CsvImportRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getImportCsvMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.JobOuterClass.Job> getJob(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_IMPORT_CSV = 0;
  private static final int METHODID_GET_JOBS = 1;
  private static final int METHODID_GET_JOB = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_IMPORT_CSV:
          serviceImpl.importCsv((com.passkit.grpc.JobOuterClass.CsvImportRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_JOBS:
          serviceImpl.getJobs((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job>) responseObserver);
          break;
        case METHODID_GET_JOB:
          serviceImpl.getJob((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.JobOuterClass.Job>) responseObserver);
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

  private static abstract class JobsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcOthers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jobs");
    }
  }

  private static final class JobsFileDescriptorSupplier
      extends JobsBaseDescriptorSupplier {
    JobsFileDescriptorSupplier() {}
  }

  private static final class JobsMethodDescriptorSupplier
      extends JobsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobsMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobsFileDescriptorSupplier())
              .addMethod(getImportCsvMethod())
              .addMethod(getGetJobsMethod())
              .addMethod(getGetJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
