package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: io/core/a_rpc_certificates.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class CertificatesGrpc {

  private CertificatesGrpc() {}

  public static final String SERVICE_NAME = "io.Certificates";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.PassTypeIdentifier,
      com.passkit.grpc.Certificate.CertificateData> getGetAppleCertificateDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAppleCertificateData",
      requestType = com.passkit.grpc.Certificate.PassTypeIdentifier.class,
      responseType = com.passkit.grpc.Certificate.CertificateData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.PassTypeIdentifier,
      com.passkit.grpc.Certificate.CertificateData> getGetAppleCertificateDataMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.PassTypeIdentifier, com.passkit.grpc.Certificate.CertificateData> getGetAppleCertificateDataMethod;
    if ((getGetAppleCertificateDataMethod = CertificatesGrpc.getGetAppleCertificateDataMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getGetAppleCertificateDataMethod = CertificatesGrpc.getGetAppleCertificateDataMethod) == null) {
          CertificatesGrpc.getGetAppleCertificateDataMethod = getGetAppleCertificateDataMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Certificate.PassTypeIdentifier, com.passkit.grpc.Certificate.CertificateData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAppleCertificateData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.PassTypeIdentifier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateData.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("getAppleCertificateData"))
              .build();
        }
      }
    }
    return getGetAppleCertificateDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.Certificate.CertificateSigningRequest> getGetCertificateSigningRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCertificateSigningRequest",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.Certificate.CertificateSigningRequest.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.Certificate.CertificateSigningRequest> getGetCertificateSigningRequestMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.Certificate.CertificateSigningRequest> getGetCertificateSigningRequestMethod;
    if ((getGetCertificateSigningRequestMethod = CertificatesGrpc.getGetCertificateSigningRequestMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getGetCertificateSigningRequestMethod = CertificatesGrpc.getGetCertificateSigningRequestMethod) == null) {
          CertificatesGrpc.getGetCertificateSigningRequestMethod = getGetCertificateSigningRequestMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.Certificate.CertificateSigningRequest>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCertificateSigningRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateSigningRequest.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("getCertificateSigningRequest"))
              .build();
        }
      }
    }
    return getGetCertificateSigningRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes,
      com.passkit.grpc.Certificate.CertificateData> getAddAppleCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addAppleCertificate",
      requestType = com.passkit.grpc.CommonObjects.FileBytes.class,
      responseType = com.passkit.grpc.Certificate.CertificateData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes,
      com.passkit.grpc.Certificate.CertificateData> getAddAppleCertificateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes, com.passkit.grpc.Certificate.CertificateData> getAddAppleCertificateMethod;
    if ((getAddAppleCertificateMethod = CertificatesGrpc.getAddAppleCertificateMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getAddAppleCertificateMethod = CertificatesGrpc.getAddAppleCertificateMethod) == null) {
          CertificatesGrpc.getAddAppleCertificateMethod = getAddAppleCertificateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.FileBytes, com.passkit.grpc.Certificate.CertificateData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addAppleCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.FileBytes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateData.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("addAppleCertificate"))
              .build();
        }
      }
    }
    return getAddAppleCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes,
      com.passkit.grpc.Certificate.CertificateData> getUpdateAppleCertificateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateAppleCertificate",
      requestType = com.passkit.grpc.CommonObjects.FileBytes.class,
      responseType = com.passkit.grpc.Certificate.CertificateData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes,
      com.passkit.grpc.Certificate.CertificateData> getUpdateAppleCertificateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.FileBytes, com.passkit.grpc.Certificate.CertificateData> getUpdateAppleCertificateMethod;
    if ((getUpdateAppleCertificateMethod = CertificatesGrpc.getUpdateAppleCertificateMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getUpdateAppleCertificateMethod = CertificatesGrpc.getUpdateAppleCertificateMethod) == null) {
          CertificatesGrpc.getUpdateAppleCertificateMethod = getUpdateAppleCertificateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.FileBytes, com.passkit.grpc.Certificate.CertificateData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateAppleCertificate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.FileBytes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateData.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("updateAppleCertificate"))
              .build();
        }
      }
    }
    return getUpdateAppleCertificateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAppleCertificatesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Certificate.CertificateData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesDeprecatedMethod;
    if ((getListAppleCertificatesDeprecatedMethod = CertificatesGrpc.getListAppleCertificatesDeprecatedMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getListAppleCertificatesDeprecatedMethod = CertificatesGrpc.getListAppleCertificatesDeprecatedMethod) == null) {
          CertificatesGrpc.getListAppleCertificatesDeprecatedMethod = getListAppleCertificatesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Certificate.CertificateData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listAppleCertificatesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateData.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("listAppleCertificatesDeprecated"))
              .build();
        }
      }
    }
    return getListAppleCertificatesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAppleCertificates",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Certificate.CertificateData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Certificate.CertificateData> getListAppleCertificatesMethod;
    if ((getListAppleCertificatesMethod = CertificatesGrpc.getListAppleCertificatesMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getListAppleCertificatesMethod = CertificatesGrpc.getListAppleCertificatesMethod) == null) {
          CertificatesGrpc.getListAppleCertificatesMethod = getListAppleCertificatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Certificate.CertificateData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listAppleCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.CertificateData.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("listAppleCertificates"))
              .build();
        }
      }
    }
    return getListAppleCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countAppleCertificatesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesDeprecatedMethod;
    if ((getCountAppleCertificatesDeprecatedMethod = CertificatesGrpc.getCountAppleCertificatesDeprecatedMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getCountAppleCertificatesDeprecatedMethod = CertificatesGrpc.getCountAppleCertificatesDeprecatedMethod) == null) {
          CertificatesGrpc.getCountAppleCertificatesDeprecatedMethod = getCountAppleCertificatesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countAppleCertificatesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("countAppleCertificatesDeprecated"))
              .build();
        }
      }
    }
    return getCountAppleCertificatesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countAppleCertificates",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountAppleCertificatesMethod;
    if ((getCountAppleCertificatesMethod = CertificatesGrpc.getCountAppleCertificatesMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getCountAppleCertificatesMethod = CertificatesGrpc.getCountAppleCertificatesMethod) == null) {
          CertificatesGrpc.getCountAppleCertificatesMethod = getCountAppleCertificatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countAppleCertificates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("countAppleCertificates"))
              .build();
        }
      }
    }
    return getCountAppleCertificatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.NFCSigningCredentialsRequest,
      com.google.protobuf.Empty> getSendNFCSigningCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendNFCSigningCredentials",
      requestType = com.passkit.grpc.Certificate.NFCSigningCredentialsRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.NFCSigningCredentialsRequest,
      com.google.protobuf.Empty> getSendNFCSigningCredentialsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Certificate.NFCSigningCredentialsRequest, com.google.protobuf.Empty> getSendNFCSigningCredentialsMethod;
    if ((getSendNFCSigningCredentialsMethod = CertificatesGrpc.getSendNFCSigningCredentialsMethod) == null) {
      synchronized (CertificatesGrpc.class) {
        if ((getSendNFCSigningCredentialsMethod = CertificatesGrpc.getSendNFCSigningCredentialsMethod) == null) {
          CertificatesGrpc.getSendNFCSigningCredentialsMethod = getSendNFCSigningCredentialsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Certificate.NFCSigningCredentialsRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendNFCSigningCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Certificate.NFCSigningCredentialsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new CertificatesMethodDescriptorSupplier("sendNFCSigningCredentials"))
              .build();
        }
      }
    }
    return getSendNFCSigningCredentialsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CertificatesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificatesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificatesStub>() {
        @java.lang.Override
        public CertificatesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificatesStub(channel, callOptions);
        }
      };
    return CertificatesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CertificatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificatesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificatesBlockingStub>() {
        @java.lang.Override
        public CertificatesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificatesBlockingStub(channel, callOptions);
        }
      };
    return CertificatesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CertificatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CertificatesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CertificatesFutureStub>() {
        @java.lang.Override
        public CertificatesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CertificatesFutureStub(channel, callOptions);
        }
      };
    return CertificatesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CertificatesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAppleCertificateData(com.passkit.grpc.Certificate.PassTypeIdentifier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAppleCertificateDataMethod(), responseObserver);
    }

    /**
     */
    public void getCertificateSigningRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateSigningRequest> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCertificateSigningRequestMethod(), responseObserver);
    }

    /**
     */
    public void addAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAppleCertificateMethod(), responseObserver);
    }

    /**
     */
    public void updateAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAppleCertificateMethod(), responseObserver);
    }

    /**
     */
    public void listAppleCertificatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppleCertificatesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void listAppleCertificates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAppleCertificatesMethod(), responseObserver);
    }

    /**
     */
    public void countAppleCertificatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountAppleCertificatesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void countAppleCertificates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountAppleCertificatesMethod(), responseObserver);
    }

    /**
     */
    public void sendNFCSigningCredentials(com.passkit.grpc.Certificate.NFCSigningCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNFCSigningCredentialsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAppleCertificateDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Certificate.PassTypeIdentifier,
                com.passkit.grpc.Certificate.CertificateData>(
                  this, METHODID_GET_APPLE_CERTIFICATE_DATA)))
          .addMethod(
            getGetCertificateSigningRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.passkit.grpc.Certificate.CertificateSigningRequest>(
                  this, METHODID_GET_CERTIFICATE_SIGNING_REQUEST)))
          .addMethod(
            getAddAppleCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.FileBytes,
                com.passkit.grpc.Certificate.CertificateData>(
                  this, METHODID_ADD_APPLE_CERTIFICATE)))
          .addMethod(
            getUpdateAppleCertificateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.FileBytes,
                com.passkit.grpc.Certificate.CertificateData>(
                  this, METHODID_UPDATE_APPLE_CERTIFICATE)))
          .addMethod(
            getListAppleCertificatesDeprecatedMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.Certificate.CertificateData>(
                  this, METHODID_LIST_APPLE_CERTIFICATES_DEPRECATED)))
          .addMethod(
            getListAppleCertificatesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.Certificate.CertificateData>(
                  this, METHODID_LIST_APPLE_CERTIFICATES)))
          .addMethod(
            getCountAppleCertificatesDeprecatedMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.CommonObjects.Count>(
                  this, METHODID_COUNT_APPLE_CERTIFICATES_DEPRECATED)))
          .addMethod(
            getCountAppleCertificatesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.CommonObjects.Count>(
                  this, METHODID_COUNT_APPLE_CERTIFICATES)))
          .addMethod(
            getSendNFCSigningCredentialsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Certificate.NFCSigningCredentialsRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_NFCSIGNING_CREDENTIALS)))
          .build();
    }
  }

  /**
   */
  public static final class CertificatesStub extends io.grpc.stub.AbstractAsyncStub<CertificatesStub> {
    private CertificatesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificatesStub(channel, callOptions);
    }

    /**
     */
    public void getAppleCertificateData(com.passkit.grpc.Certificate.PassTypeIdentifier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAppleCertificateDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCertificateSigningRequest(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateSigningRequest> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCertificateSigningRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAppleCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAppleCertificateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAppleCertificatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAppleCertificatesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAppleCertificates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListAppleCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countAppleCertificatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountAppleCertificatesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countAppleCertificates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountAppleCertificatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendNFCSigningCredentials(com.passkit.grpc.Certificate.NFCSigningCredentialsRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNFCSigningCredentialsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CertificatesBlockingStub extends io.grpc.stub.AbstractBlockingStub<CertificatesBlockingStub> {
    private CertificatesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.Certificate.CertificateData getAppleCertificateData(com.passkit.grpc.Certificate.PassTypeIdentifier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAppleCertificateDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Certificate.CertificateSigningRequest getCertificateSigningRequest(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCertificateSigningRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Certificate.CertificateData addAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAppleCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Certificate.CertificateData updateAppleCertificate(com.passkit.grpc.CommonObjects.FileBytes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAppleCertificateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Certificate.CertificateData> listAppleCertificatesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAppleCertificatesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Certificate.CertificateData> listAppleCertificates(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListAppleCertificatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countAppleCertificatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountAppleCertificatesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countAppleCertificates(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountAppleCertificatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendNFCSigningCredentials(com.passkit.grpc.Certificate.NFCSigningCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNFCSigningCredentialsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CertificatesFutureStub extends io.grpc.stub.AbstractFutureStub<CertificatesFutureStub> {
    private CertificatesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CertificatesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CertificatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Certificate.CertificateData> getAppleCertificateData(
        com.passkit.grpc.Certificate.PassTypeIdentifier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAppleCertificateDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Certificate.CertificateSigningRequest> getCertificateSigningRequest(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCertificateSigningRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Certificate.CertificateData> addAppleCertificate(
        com.passkit.grpc.CommonObjects.FileBytes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAppleCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Certificate.CertificateData> updateAppleCertificate(
        com.passkit.grpc.CommonObjects.FileBytes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAppleCertificateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countAppleCertificatesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountAppleCertificatesDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countAppleCertificates(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountAppleCertificatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendNFCSigningCredentials(
        com.passkit.grpc.Certificate.NFCSigningCredentialsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNFCSigningCredentialsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_APPLE_CERTIFICATE_DATA = 0;
  private static final int METHODID_GET_CERTIFICATE_SIGNING_REQUEST = 1;
  private static final int METHODID_ADD_APPLE_CERTIFICATE = 2;
  private static final int METHODID_UPDATE_APPLE_CERTIFICATE = 3;
  private static final int METHODID_LIST_APPLE_CERTIFICATES_DEPRECATED = 4;
  private static final int METHODID_LIST_APPLE_CERTIFICATES = 5;
  private static final int METHODID_COUNT_APPLE_CERTIFICATES_DEPRECATED = 6;
  private static final int METHODID_COUNT_APPLE_CERTIFICATES = 7;
  private static final int METHODID_SEND_NFCSIGNING_CREDENTIALS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CertificatesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CertificatesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_APPLE_CERTIFICATE_DATA:
          serviceImpl.getAppleCertificateData((com.passkit.grpc.Certificate.PassTypeIdentifier) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData>) responseObserver);
          break;
        case METHODID_GET_CERTIFICATE_SIGNING_REQUEST:
          serviceImpl.getCertificateSigningRequest((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateSigningRequest>) responseObserver);
          break;
        case METHODID_ADD_APPLE_CERTIFICATE:
          serviceImpl.addAppleCertificate((com.passkit.grpc.CommonObjects.FileBytes) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData>) responseObserver);
          break;
        case METHODID_UPDATE_APPLE_CERTIFICATE:
          serviceImpl.updateAppleCertificate((com.passkit.grpc.CommonObjects.FileBytes) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData>) responseObserver);
          break;
        case METHODID_LIST_APPLE_CERTIFICATES_DEPRECATED:
          serviceImpl.listAppleCertificatesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData>) responseObserver);
          break;
        case METHODID_LIST_APPLE_CERTIFICATES:
          serviceImpl.listAppleCertificates((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Certificate.CertificateData>) responseObserver);
          break;
        case METHODID_COUNT_APPLE_CERTIFICATES_DEPRECATED:
          serviceImpl.countAppleCertificatesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_APPLE_CERTIFICATES:
          serviceImpl.countAppleCertificates((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_SEND_NFCSIGNING_CREDENTIALS:
          serviceImpl.sendNFCSigningCredentials((com.passkit.grpc.Certificate.NFCSigningCredentialsRequest) request,
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

  private static abstract class CertificatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CertificatesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcCertificates.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Certificates");
    }
  }

  private static final class CertificatesFileDescriptorSupplier
      extends CertificatesBaseDescriptorSupplier {
    CertificatesFileDescriptorSupplier() {}
  }

  private static final class CertificatesMethodDescriptorSupplier
      extends CertificatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CertificatesMethodDescriptorSupplier(String methodName) {
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
      synchronized (CertificatesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CertificatesFileDescriptorSupplier())
              .addMethod(getGetAppleCertificateDataMethod())
              .addMethod(getGetCertificateSigningRequestMethod())
              .addMethod(getAddAppleCertificateMethod())
              .addMethod(getUpdateAppleCertificateMethod())
              .addMethod(getListAppleCertificatesDeprecatedMethod())
              .addMethod(getListAppleCertificatesMethod())
              .addMethod(getCountAppleCertificatesDeprecatedMethod())
              .addMethod(getCountAppleCertificatesMethod())
              .addMethod(getSendNFCSigningCredentialsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
