package com.passkit.grpc.Raw;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: io/raw/a_rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RawGrpc {

  private RawGrpc() {}

  public static final String SERVICE_NAME = "raw.Raw";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject,
      com.passkit.grpc.CommonObjects.Id> getCreatePassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPassProject",
      requestType = com.passkit.grpc.Raw.Project.PassProject.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject,
      com.passkit.grpc.CommonObjects.Id> getCreatePassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject, com.passkit.grpc.CommonObjects.Id> getCreatePassProjectMethod;
    if ((getCreatePassProjectMethod = RawGrpc.getCreatePassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getCreatePassProjectMethod = RawGrpc.getCreatePassProjectMethod) == null) {
          RawGrpc.getCreatePassProjectMethod = getCreatePassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.Project.PassProject, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.Project.PassProject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("createPassProject"))
              .build();
        }
      }
    }
    return getCreatePassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject,
      com.passkit.grpc.Raw.Project.PassProject> getUpdatePassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePassProject",
      requestType = com.passkit.grpc.Raw.Project.PassProject.class,
      responseType = com.passkit.grpc.Raw.Project.PassProject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject,
      com.passkit.grpc.Raw.Project.PassProject> getUpdatePassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProject, com.passkit.grpc.Raw.Project.PassProject> getUpdatePassProjectMethod;
    if ((getUpdatePassProjectMethod = RawGrpc.getUpdatePassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getUpdatePassProjectMethod = RawGrpc.getUpdatePassProjectMethod) == null) {
          RawGrpc.getUpdatePassProjectMethod = getUpdatePassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.Project.PassProject, com.passkit.grpc.Raw.Project.PassProject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.Project.PassProject.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.Project.PassProject.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("updatePassProject"))
              .build();
        }
      }
    }
    return getUpdatePassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Raw.Project.PassProject> getGetPassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPassProject",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Raw.Project.PassProject.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Raw.Project.PassProject> getGetPassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Raw.Project.PassProject> getGetPassProjectMethod;
    if ((getGetPassProjectMethod = RawGrpc.getGetPassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getGetPassProjectMethod = RawGrpc.getGetPassProjectMethod) == null) {
          RawGrpc.getGetPassProjectMethod = getGetPassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Raw.Project.PassProject>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.Project.PassProject.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("getPassProject"))
              .build();
        }
      }
    }
    return getGetPassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProjectCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyPassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyPassProject",
      requestType = com.passkit.grpc.Raw.Project.PassProjectCopyRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProjectCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyPassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.Project.PassProjectCopyRequest, com.passkit.grpc.CommonObjects.Id> getCopyPassProjectMethod;
    if ((getCopyPassProjectMethod = RawGrpc.getCopyPassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getCopyPassProjectMethod = RawGrpc.getCopyPassProjectMethod) == null) {
          RawGrpc.getCopyPassProjectMethod = getCopyPassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.Project.PassProjectCopyRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyPassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.Project.PassProjectCopyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("copyPassProject"))
              .build();
        }
      }
    }
    return getCopyPassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeletePassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePassProject",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeletePassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeletePassProjectMethod;
    if ((getDeletePassProjectMethod = RawGrpc.getDeletePassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getDeletePassProjectMethod = RawGrpc.getDeletePassProjectMethod) == null) {
          RawGrpc.getDeletePassProjectMethod = getDeletePassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("deletePassProject"))
              .build();
        }
      }
    }
    return getDeletePassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getCreatePassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPass",
      requestType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getCreatePassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id> getCreatePassMethod;
    if ((getCreatePassMethod = RawGrpc.getCreatePassMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getCreatePassMethod = RawGrpc.getCreatePassMethod) == null) {
          RawGrpc.getCreatePassMethod = getCreatePassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("createPass"))
              .build();
        }
      }
    }
    return getCreatePassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getUpdatePassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePass",
      requestType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getUpdatePassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id> getUpdatePassMethod;
    if ((getUpdatePassMethod = RawGrpc.getUpdatePassMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getUpdatePassMethod = RawGrpc.getUpdatePassMethod) == null) {
          RawGrpc.getUpdatePassMethod = getUpdatePassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("updatePass"))
              .build();
        }
      }
    }
    return getUpdatePassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getStreamPassUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamPassUpdates",
      requestType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.passkit.grpc.CommonObjects.Id> getStreamPassUpdatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id> getStreamPassUpdatesMethod;
    if ((getStreamPassUpdatesMethod = RawGrpc.getStreamPassUpdatesMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getStreamPassUpdatesMethod = RawGrpc.getStreamPassUpdatesMethod) == null) {
          RawGrpc.getStreamPassUpdatesMethod = getStreamPassUpdatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.Pass, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamPassUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("streamPassUpdates"))
              .build();
        }
      }
    }
    return getStreamPassUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPassById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByIdMethod;
    if ((getGetPassByIdMethod = RawGrpc.getGetPassByIdMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getGetPassByIdMethod = RawGrpc.getGetPassByIdMethod) == null) {
          RawGrpc.getGetPassByIdMethod = getGetPassByIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Raw.PassOuterClass.Pass>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPassById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("getPassById"))
              .build();
        }
      }
    }
    return getGetPassByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByExternalIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPassByExternalId",
      requestType = com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest.class,
      responseType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByExternalIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest, com.passkit.grpc.Raw.PassOuterClass.Pass> getGetPassByExternalIdMethod;
    if ((getGetPassByExternalIdMethod = RawGrpc.getGetPassByExternalIdMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getGetPassByExternalIdMethod = RawGrpc.getGetPassByExternalIdMethod) == null) {
          RawGrpc.getGetPassByExternalIdMethod = getGetPassByExternalIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest, com.passkit.grpc.Raw.PassOuterClass.Pass>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPassByExternalId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("getPassByExternalId"))
              .build();
        }
      }
    }
    return getGetPassByExternalIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.google.protobuf.Empty> getDeletePassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePass",
      requestType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass,
      com.google.protobuf.Empty> getDeletePassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.Pass, com.google.protobuf.Empty> getDeletePassMethod;
    if ((getDeletePassMethod = RawGrpc.getDeletePassMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getDeletePassMethod = RawGrpc.getDeletePassMethod) == null) {
          RawGrpc.getDeletePassMethod = getDeletePassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.Pass, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("deletePass"))
              .build();
        }
      }
    }
    return getDeletePassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassProjectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listPassesByPassProject",
      requestType = com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest.class,
      responseType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassProjectMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest, com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassProjectMethod;
    if ((getListPassesByPassProjectMethod = RawGrpc.getListPassesByPassProjectMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getListPassesByPassProjectMethod = RawGrpc.getListPassesByPassProjectMethod) == null) {
          RawGrpc.getListPassesByPassProjectMethod = getListPassesByPassProjectMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest, com.passkit.grpc.Raw.PassOuterClass.Pass>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listPassesByPassProject"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("listPassesByPassProject"))
              .build();
        }
      }
    }
    return getListPassesByPassProjectMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listPassesByPassTemplate",
      requestType = com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest.class,
      responseType = com.passkit.grpc.Raw.PassOuterClass.Pass.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest,
      com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest, com.passkit.grpc.Raw.PassOuterClass.Pass> getListPassesByPassTemplateMethod;
    if ((getListPassesByPassTemplateMethod = RawGrpc.getListPassesByPassTemplateMethod) == null) {
      synchronized (RawGrpc.class) {
        if ((getListPassesByPassTemplateMethod = RawGrpc.getListPassesByPassTemplateMethod) == null) {
          RawGrpc.getListPassesByPassTemplateMethod = getListPassesByPassTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest, com.passkit.grpc.Raw.PassOuterClass.Pass>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listPassesByPassTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Raw.PassOuterClass.Pass.getDefaultInstance()))
              .setSchemaDescriptor(new RawMethodDescriptorSupplier("listPassesByPassTemplate"))
              .build();
        }
      }
    }
    return getListPassesByPassTemplateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RawStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawStub>() {
        @java.lang.Override
        public RawStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawStub(channel, callOptions);
        }
      };
    return RawStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RawBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawBlockingStub>() {
        @java.lang.Override
        public RawBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawBlockingStub(channel, callOptions);
        }
      };
    return RawBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RawFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RawFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RawFutureStub>() {
        @java.lang.Override
        public RawFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RawFutureStub(channel, callOptions);
        }
      };
    return RawFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPassProject(com.passkit.grpc.Raw.Project.PassProject request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePassProjectMethod(), responseObserver);
    }

    /**
     */
    default void updatePassProject(com.passkit.grpc.Raw.Project.PassProject request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePassProjectMethod(), responseObserver);
    }

    /**
     */
    default void getPassProject(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPassProjectMethod(), responseObserver);
    }

    /**
     */
    default void copyPassProject(com.passkit.grpc.Raw.Project.PassProjectCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyPassProjectMethod(), responseObserver);
    }

    /**
     */
    default void deletePassProject(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePassProjectMethod(), responseObserver);
    }

    /**
     */
    default void createPass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePassMethod(), responseObserver);
    }

    /**
     */
    default void updatePass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePassMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> streamPassUpdates(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getStreamPassUpdatesMethod(), responseObserver);
    }

    /**
     */
    default void getPassById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPassByIdMethod(), responseObserver);
    }

    /**
     */
    default void getPassByExternalId(com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPassByExternalIdMethod(), responseObserver);
    }

    /**
     */
    default void deletePass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePassMethod(), responseObserver);
    }

    /**
     */
    default void listPassesByPassProject(com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPassesByPassProjectMethod(), responseObserver);
    }

    /**
     */
    default void listPassesByPassTemplate(com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPassesByPassTemplateMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Raw.
   */
  public static abstract class RawImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return RawGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Raw.
   */
  public static final class RawStub
      extends io.grpc.stub.AbstractAsyncStub<RawStub> {
    private RawStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawStub(channel, callOptions);
    }

    /**
     */
    public void createPassProject(com.passkit.grpc.Raw.Project.PassProject request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePassProject(com.passkit.grpc.Raw.Project.PassProject request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPassProject(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyPassProject(com.passkit.grpc.Raw.Project.PassProjectCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyPassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePassProject(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatePass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> streamPassUpdates(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getStreamPassUpdatesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getPassById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPassByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPassByExternalId(com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPassByExternalIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deletePass(com.passkit.grpc.Raw.PassOuterClass.Pass request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPassesByPassProject(com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListPassesByPassProjectMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPassesByPassTemplate(com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListPassesByPassTemplateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Raw.
   */
  public static final class RawBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<RawBlockingStub> {
    private RawBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createPassProject(com.passkit.grpc.Raw.Project.PassProject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Raw.Project.PassProject updatePassProject(com.passkit.grpc.Raw.Project.PassProject request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Raw.Project.PassProject getPassProject(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyPassProject(com.passkit.grpc.Raw.Project.PassProjectCopyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyPassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePassProject(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createPass(com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updatePass(com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Raw.PassOuterClass.Pass getPassById(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPassByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Raw.PassOuterClass.Pass getPassByExternalId(com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPassByExternalIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deletePass(com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePassMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Raw.PassOuterClass.Pass> listPassesByPassProject(
        com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListPassesByPassProjectMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Raw.PassOuterClass.Pass> listPassesByPassTemplate(
        com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListPassesByPassTemplateMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Raw.
   */
  public static final class RawFutureStub
      extends io.grpc.stub.AbstractFutureStub<RawFutureStub> {
    private RawFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RawFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RawFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createPassProject(
        com.passkit.grpc.Raw.Project.PassProject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePassProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Raw.Project.PassProject> updatePassProject(
        com.passkit.grpc.Raw.Project.PassProject request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePassProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Raw.Project.PassProject> getPassProject(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPassProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyPassProject(
        com.passkit.grpc.Raw.Project.PassProjectCopyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyPassProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePassProject(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePassProjectMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createPass(
        com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updatePass(
        com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Raw.PassOuterClass.Pass> getPassById(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPassByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Raw.PassOuterClass.Pass> getPassByExternalId(
        com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPassByExternalIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePass(
        com.passkit.grpc.Raw.PassOuterClass.Pass request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePassMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PASS_PROJECT = 0;
  private static final int METHODID_UPDATE_PASS_PROJECT = 1;
  private static final int METHODID_GET_PASS_PROJECT = 2;
  private static final int METHODID_COPY_PASS_PROJECT = 3;
  private static final int METHODID_DELETE_PASS_PROJECT = 4;
  private static final int METHODID_CREATE_PASS = 5;
  private static final int METHODID_UPDATE_PASS = 6;
  private static final int METHODID_GET_PASS_BY_ID = 7;
  private static final int METHODID_GET_PASS_BY_EXTERNAL_ID = 8;
  private static final int METHODID_DELETE_PASS = 9;
  private static final int METHODID_LIST_PASSES_BY_PASS_PROJECT = 10;
  private static final int METHODID_LIST_PASSES_BY_PASS_TEMPLATE = 11;
  private static final int METHODID_STREAM_PASS_UPDATES = 12;

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
        case METHODID_CREATE_PASS_PROJECT:
          serviceImpl.createPassProject((com.passkit.grpc.Raw.Project.PassProject) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_PASS_PROJECT:
          serviceImpl.updatePassProject((com.passkit.grpc.Raw.Project.PassProject) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject>) responseObserver);
          break;
        case METHODID_GET_PASS_PROJECT:
          serviceImpl.getPassProject((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.Project.PassProject>) responseObserver);
          break;
        case METHODID_COPY_PASS_PROJECT:
          serviceImpl.copyPassProject((com.passkit.grpc.Raw.Project.PassProjectCopyRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_PASS_PROJECT:
          serviceImpl.deletePassProject((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_PASS:
          serviceImpl.createPass((com.passkit.grpc.Raw.PassOuterClass.Pass) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_PASS:
          serviceImpl.updatePass((com.passkit.grpc.Raw.PassOuterClass.Pass) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_PASS_BY_ID:
          serviceImpl.getPassById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass>) responseObserver);
          break;
        case METHODID_GET_PASS_BY_EXTERNAL_ID:
          serviceImpl.getPassByExternalId((com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass>) responseObserver);
          break;
        case METHODID_DELETE_PASS:
          serviceImpl.deletePass((com.passkit.grpc.Raw.PassOuterClass.Pass) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_PASSES_BY_PASS_PROJECT:
          serviceImpl.listPassesByPassProject((com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass>) responseObserver);
          break;
        case METHODID_LIST_PASSES_BY_PASS_TEMPLATE:
          serviceImpl.listPassesByPassTemplate((com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Raw.PassOuterClass.Pass>) responseObserver);
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
        case METHODID_STREAM_PASS_UPDATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamPassUpdates(
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.Project.PassProject,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_PASS_PROJECT)))
        .addMethod(
          getUpdatePassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.Project.PassProject,
              com.passkit.grpc.Raw.Project.PassProject>(
                service, METHODID_UPDATE_PASS_PROJECT)))
        .addMethod(
          getGetPassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Raw.Project.PassProject>(
                service, METHODID_GET_PASS_PROJECT)))
        .addMethod(
          getCopyPassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.Project.PassProjectCopyRequest,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_PASS_PROJECT)))
        .addMethod(
          getDeletePassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PASS_PROJECT)))
        .addMethod(
          getCreatePassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.Pass,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_PASS)))
        .addMethod(
          getUpdatePassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.Pass,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_PASS)))
        .addMethod(
          getStreamPassUpdatesMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.Pass,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_STREAM_PASS_UPDATES)))
        .addMethod(
          getGetPassByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Raw.PassOuterClass.Pass>(
                service, METHODID_GET_PASS_BY_ID)))
        .addMethod(
          getGetPassByExternalIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.PassRecordByExternalIdRequest,
              com.passkit.grpc.Raw.PassOuterClass.Pass>(
                service, METHODID_GET_PASS_BY_EXTERNAL_ID)))
        .addMethod(
          getDeletePassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.Pass,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PASS)))
        .addMethod(
          getListPassesByPassProjectMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassProjectRequest,
              com.passkit.grpc.Raw.PassOuterClass.Pass>(
                service, METHODID_LIST_PASSES_BY_PASS_PROJECT)))
        .addMethod(
          getListPassesByPassTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Raw.PassOuterClass.ListPassesByPassTemplateRequest,
              com.passkit.grpc.Raw.PassOuterClass.Pass>(
                service, METHODID_LIST_PASSES_BY_PASS_TEMPLATE)))
        .build();
  }

  private static abstract class RawBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RawBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.Raw.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Raw");
    }
  }

  private static final class RawFileDescriptorSupplier
      extends RawBaseDescriptorSupplier {
    RawFileDescriptorSupplier() {}
  }

  private static final class RawMethodDescriptorSupplier
      extends RawBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RawMethodDescriptorSupplier(String methodName) {
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
      synchronized (RawGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RawFileDescriptorSupplier())
              .addMethod(getCreatePassProjectMethod())
              .addMethod(getUpdatePassProjectMethod())
              .addMethod(getGetPassProjectMethod())
              .addMethod(getCopyPassProjectMethod())
              .addMethod(getDeletePassProjectMethod())
              .addMethod(getCreatePassMethod())
              .addMethod(getUpdatePassMethod())
              .addMethod(getStreamPassUpdatesMethod())
              .addMethod(getGetPassByIdMethod())
              .addMethod(getGetPassByExternalIdMethod())
              .addMethod(getDeletePassMethod())
              .addMethod(getListPassesByPassProjectMethod())
              .addMethod(getListPassesByPassTemplateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
