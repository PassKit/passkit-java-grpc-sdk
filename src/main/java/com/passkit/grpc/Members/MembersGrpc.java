package com.passkit.grpc.Members;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/member/a_rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MembersGrpc {

  private MembersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "members.Members";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program,
      com.passkit.grpc.CommonObjects.Id> getCreateProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProgram",
      requestType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program,
      com.passkit.grpc.CommonObjects.Id> getCreateProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program, com.passkit.grpc.CommonObjects.Id> getCreateProgramMethod;
    if ((getCreateProgramMethod = MembersGrpc.getCreateProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCreateProgramMethod = MembersGrpc.getCreateProgramMethod) == null) {
          MembersGrpc.getCreateProgramMethod = getCreateProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.ProgramOuterClass.Program, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("createProgram"))
              .build();
        }
      }
    }
    return getCreateProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getUpdateProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProgram",
      requestType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      responseType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getUpdateProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.Program, com.passkit.grpc.Members.ProgramOuterClass.Program> getUpdateProgramMethod;
    if ((getUpdateProgramMethod = MembersGrpc.getUpdateProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getUpdateProgramMethod = MembersGrpc.getUpdateProgramMethod) == null) {
          MembersGrpc.getUpdateProgramMethod = getUpdateProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.ProgramOuterClass.Program, com.passkit.grpc.Members.ProgramOuterClass.Program>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("updateProgram"))
              .build();
        }
      }
    }
    return getUpdateProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getGetProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProgram",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getGetProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.ProgramOuterClass.Program> getGetProgramMethod;
    if ((getGetProgramMethod = MembersGrpc.getGetProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetProgramMethod = MembersGrpc.getGetProgramMethod) == null) {
          MembersGrpc.getGetProgramMethod = getGetProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.ProgramOuterClass.Program>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getProgram"))
              .build();
        }
      }
    }
    return getGetProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyProgram",
      requestType = com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest, com.passkit.grpc.CommonObjects.Id> getCopyProgramMethod;
    if ((getCopyProgramMethod = MembersGrpc.getCopyProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCopyProgramMethod = MembersGrpc.getCopyProgramMethod) == null) {
          MembersGrpc.getCopyProgramMethod = getCopyProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("copyProgram"))
              .build();
        }
      }
    }
    return getCopyProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProgram",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteProgramMethod;
    if ((getDeleteProgramMethod = MembersGrpc.getDeleteProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteProgramMethod = MembersGrpc.getDeleteProgramMethod) == null) {
          MembersGrpc.getDeleteProgramMethod = getDeleteProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteProgram"))
              .build();
        }
      }
    }
    return getDeleteProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listProgramsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsDeprecatedMethod;
    if ((getListProgramsDeprecatedMethod = MembersGrpc.getListProgramsDeprecatedMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListProgramsDeprecatedMethod = MembersGrpc.getListProgramsDeprecatedMethod) == null) {
          MembersGrpc.getListProgramsDeprecatedMethod = getListProgramsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Members.ProgramOuterClass.Program>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listProgramsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listProgramsDeprecated"))
              .build();
        }
      }
    }
    return getListProgramsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listPrograms",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Members.ProgramOuterClass.Program.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Members.ProgramOuterClass.Program> getListProgramsMethod;
    if ((getListProgramsMethod = MembersGrpc.getListProgramsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListProgramsMethod = MembersGrpc.getListProgramsMethod) == null) {
          MembersGrpc.getListProgramsMethod = getListProgramsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Members.ProgramOuterClass.Program>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listPrograms"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.ProgramOuterClass.Program.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listPrograms"))
              .build();
        }
      }
    }
    return getListProgramsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier,
      com.passkit.grpc.CommonObjects.Id> getCreateTierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTier",
      requestType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier,
      com.passkit.grpc.CommonObjects.Id> getCreateTierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier, com.passkit.grpc.CommonObjects.Id> getCreateTierMethod;
    if ((getCreateTierMethod = MembersGrpc.getCreateTierMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCreateTierMethod = MembersGrpc.getCreateTierMethod) == null) {
          MembersGrpc.getCreateTierMethod = getCreateTierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.TierOuterClass.Tier, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("createTier"))
              .build();
        }
      }
    }
    return getCreateTierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier,
      com.passkit.grpc.Members.TierOuterClass.Tier> getUpdateTierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTier",
      requestType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      responseType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier,
      com.passkit.grpc.Members.TierOuterClass.Tier> getUpdateTierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.Tier, com.passkit.grpc.Members.TierOuterClass.Tier> getUpdateTierMethod;
    if ((getUpdateTierMethod = MembersGrpc.getUpdateTierMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getUpdateTierMethod = MembersGrpc.getUpdateTierMethod) == null) {
          MembersGrpc.getUpdateTierMethod = getUpdateTierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.TierOuterClass.Tier, com.passkit.grpc.Members.TierOuterClass.Tier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("updateTier"))
              .build();
        }
      }
    }
    return getUpdateTierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
      com.passkit.grpc.Members.TierOuterClass.Tier> getGetTierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTier",
      requestType = com.passkit.grpc.Members.TierOuterClass.TierRequestInput.class,
      responseType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
      com.passkit.grpc.Members.TierOuterClass.Tier> getGetTierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput, com.passkit.grpc.Members.TierOuterClass.Tier> getGetTierMethod;
    if ((getGetTierMethod = MembersGrpc.getGetTierMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetTierMethod = MembersGrpc.getGetTierMethod) == null) {
          MembersGrpc.getGetTierMethod = getGetTierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.TierOuterClass.TierRequestInput, com.passkit.grpc.Members.TierOuterClass.Tier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.TierRequestInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getTier"))
              .build();
        }
      }
    }
    return getGetTierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
      com.google.protobuf.Empty> getDeleteTierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTier",
      requestType = com.passkit.grpc.Members.TierOuterClass.TierRequestInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
      com.google.protobuf.Empty> getDeleteTierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.TierOuterClass.TierRequestInput, com.google.protobuf.Empty> getDeleteTierMethod;
    if ((getDeleteTierMethod = MembersGrpc.getDeleteTierMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteTierMethod = MembersGrpc.getDeleteTierMethod) == null) {
          MembersGrpc.getDeleteTierMethod = getDeleteTierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.TierOuterClass.TierRequestInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.TierRequestInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteTier"))
              .build();
        }
      }
    }
    return getDeleteTierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTiersDeprecated",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersDeprecatedMethod;
    if ((getListTiersDeprecatedMethod = MembersGrpc.getListTiersDeprecatedMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListTiersDeprecatedMethod = MembersGrpc.getListTiersDeprecatedMethod) == null) {
          MembersGrpc.getListTiersDeprecatedMethod = getListTiersDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.Members.TierOuterClass.Tier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTiersDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listTiersDeprecated"))
              .build();
        }
      }
    }
    return getListTiersDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTiers",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.Members.TierOuterClass.Tier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.TierOuterClass.Tier> getListTiersMethod;
    if ((getListTiersMethod = MembersGrpc.getListTiersMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListTiersMethod = MembersGrpc.getListTiersMethod) == null) {
          MembersGrpc.getListTiersMethod = getListTiersMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.TierOuterClass.Tier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTiers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.TierOuterClass.Tier.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listTiers"))
              .build();
        }
      }
    }
    return getListTiersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getEnrolMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enrolMember",
      requestType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getEnrolMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id> getEnrolMemberMethod;
    if ((getEnrolMemberMethod = MembersGrpc.getEnrolMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getEnrolMemberMethod = MembersGrpc.getEnrolMemberMethod) == null) {
          MembersGrpc.getEnrolMemberMethod = getEnrolMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enrolMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("enrolMember"))
              .build();
        }
      }
    }
    return getEnrolMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getEnrolMemberPublicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enrolMemberPublic",
      requestType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getEnrolMemberPublicMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id> getEnrolMemberPublicMethod;
    if ((getEnrolMemberPublicMethod = MembersGrpc.getEnrolMemberPublicMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getEnrolMemberPublicMethod = MembersGrpc.getEnrolMemberPublicMethod) == null) {
          MembersGrpc.getEnrolMemberPublicMethod = getEnrolMemberPublicMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enrolMemberPublic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("enrolMemberPublic"))
              .build();
        }
      }
    }
    return getEnrolMemberPublicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMemberRecordById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByIdMethod;
    if ((getGetMemberRecordByIdMethod = MembersGrpc.getGetMemberRecordByIdMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetMemberRecordByIdMethod = MembersGrpc.getGetMemberRecordByIdMethod) == null) {
          MembersGrpc.getGetMemberRecordByIdMethod = getGetMemberRecordByIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.MemberOuterClass.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMemberRecordById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getMemberRecordById"))
              .build();
        }
      }
    }
    return getGetMemberRecordByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest,
      com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByExternalIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMemberRecordByExternalId",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest,
      com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByExternalIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest, com.passkit.grpc.Members.MemberOuterClass.Member> getGetMemberRecordByExternalIdMethod;
    if ((getGetMemberRecordByExternalIdMethod = MembersGrpc.getGetMemberRecordByExternalIdMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetMemberRecordByExternalIdMethod = MembersGrpc.getGetMemberRecordByExternalIdMethod) == null) {
          MembersGrpc.getGetMemberRecordByExternalIdMethod = getGetMemberRecordByExternalIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest, com.passkit.grpc.Members.MemberOuterClass.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMemberRecordByExternalId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getMemberRecordByExternalId"))
              .build();
        }
      }
    }
    return getGetMemberRecordByExternalIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckInMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkInMember",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest.class,
      responseType = com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckInMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckInMemberMethod;
    if ((getCheckInMemberMethod = MembersGrpc.getCheckInMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCheckInMemberMethod = MembersGrpc.getCheckInMemberMethod) == null) {
          MembersGrpc.getCheckInMemberMethod = getCheckInMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkInMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("checkInMember"))
              .build();
        }
      }
    }
    return getCheckInMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckOutMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "checkOutMember",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest.class,
      responseType = com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckOutMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getCheckOutMemberMethod;
    if ((getCheckOutMemberMethod = MembersGrpc.getCheckOutMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCheckOutMemberMethod = MembersGrpc.getCheckOutMemberMethod) == null) {
          MembersGrpc.getCheckOutMemberMethod = getCheckOutMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "checkOutMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("checkOutMember"))
              .build();
        }
      }
    }
    return getCheckOutMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listMembersDeprecated",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersDeprecatedMethod;
    if ((getListMembersDeprecatedMethod = MembersGrpc.getListMembersDeprecatedMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListMembersDeprecatedMethod = MembersGrpc.getListMembersDeprecatedMethod) == null) {
          MembersGrpc.getListMembersDeprecatedMethod = getListMembersDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.Members.MemberOuterClass.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listMembersDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listMembersDeprecated"))
              .build();
        }
      }
    }
    return getListMembersDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listMembers",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.MemberOuterClass.Member> getListMembersMethod;
    if ((getListMembersMethod = MembersGrpc.getListMembersMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListMembersMethod = MembersGrpc.getListMembersMethod) == null) {
          MembersGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.MemberOuterClass.Member>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getUpdateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMember",
      requestType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.passkit.grpc.CommonObjects.Id> getUpdateMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id> getUpdateMemberMethod;
    if ((getUpdateMemberMethod = MembersGrpc.getUpdateMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getUpdateMemberMethod = MembersGrpc.getUpdateMemberMethod) == null) {
          MembersGrpc.getUpdateMemberMethod = getUpdateMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.Member, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("updateMember"))
              .build();
        }
      }
    }
    return getUpdateMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getEarnPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "earnPoints",
      requestType = com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.MemberPoints.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getEarnPointsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getEarnPointsMethod;
    if ((getEarnPointsMethod = MembersGrpc.getEarnPointsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getEarnPointsMethod = MembersGrpc.getEarnPointsMethod) == null) {
          MembersGrpc.getEarnPointsMethod = getEarnPointsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "earnPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberPoints.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("earnPoints"))
              .build();
        }
      }
    }
    return getEarnPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getBurnPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "burnPoints",
      requestType = com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.MemberPoints.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getBurnPointsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getBurnPointsMethod;
    if ((getBurnPointsMethod = MembersGrpc.getBurnPointsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getBurnPointsMethod = MembersGrpc.getBurnPointsMethod) == null) {
          MembersGrpc.getBurnPointsMethod = getBurnPointsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "burnPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberPoints.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("burnPoints"))
              .build();
        }
      }
    }
    return getBurnPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getSetPointsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setPoints",
      requestType = com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest.class,
      responseType = com.passkit.grpc.Members.MemberOuterClass.MemberPoints.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest,
      com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getSetPointsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints> getSetPointsMethod;
    if ((getSetPointsMethod = MembersGrpc.getSetPointsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getSetPointsMethod = MembersGrpc.getSetPointsMethod) == null) {
          MembersGrpc.getSetPointsMethod = getSetPointsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest, com.passkit.grpc.Members.MemberOuterClass.MemberPoints>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setPoints"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberPoints.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("setPoints"))
              .build();
        }
      }
    }
    return getSetPointsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getChangeMemberTierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeMemberTier",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest.class,
      responseType = com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getChangeMemberTierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getChangeMemberTierMethod;
    if ((getChangeMemberTierMethod = MembersGrpc.getChangeMemberTierMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getChangeMemberTierMethod = MembersGrpc.getChangeMemberTierMethod) == null) {
          MembersGrpc.getChangeMemberTierMethod = getChangeMemberTierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeMemberTier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("changeMemberTier"))
              .build();
        }
      }
    }
    return getChangeMemberTierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
      com.google.protobuf.Empty> getUpdateMembersBySegmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMembersBySegment",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
      com.google.protobuf.Empty> getUpdateMembersBySegmentMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest, com.google.protobuf.Empty> getUpdateMembersBySegmentMethod;
    if ((getUpdateMembersBySegmentMethod = MembersGrpc.getUpdateMembersBySegmentMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getUpdateMembersBySegmentMethod = MembersGrpc.getUpdateMembersBySegmentMethod) == null) {
          MembersGrpc.getUpdateMembersBySegmentMethod = getUpdateMembersBySegmentMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMembersBySegment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("updateMembersBySegment"))
              .build();
        }
      }
    }
    return getUpdateMembersBySegmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
      com.google.protobuf.Empty> getDeleteMembersBySegmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMembersBySegment",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
      com.google.protobuf.Empty> getDeleteMembersBySegmentMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest, com.google.protobuf.Empty> getDeleteMembersBySegmentMethod;
    if ((getDeleteMembersBySegmentMethod = MembersGrpc.getDeleteMembersBySegmentMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteMembersBySegmentMethod = MembersGrpc.getDeleteMembersBySegmentMethod) == null) {
          MembersGrpc.getDeleteMembersBySegmentMethod = getDeleteMembersBySegmentMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMembersBySegment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteMembersBySegment"))
              .build();
        }
      }
    }
    return getDeleteMembersBySegmentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.google.protobuf.Empty> getDeleteMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMember",
      requestType = com.passkit.grpc.Members.MemberOuterClass.Member.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member,
      com.google.protobuf.Empty> getDeleteMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.Member, com.google.protobuf.Empty> getDeleteMemberMethod;
    if ((getDeleteMemberMethod = MembersGrpc.getDeleteMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteMemberMethod = MembersGrpc.getDeleteMemberMethod) == null) {
          MembersGrpc.getDeleteMemberMethod = getDeleteMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.Member, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.Member.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteMember"))
              .build();
        }
      }
    }
    return getDeleteMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.BulkPassActionRequest,
      com.google.protobuf.Empty> getBulkDeleteMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bulkDeleteMembers",
      requestType = com.passkit.grpc.CommonObjects.BulkPassActionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.BulkPassActionRequest,
      com.google.protobuf.Empty> getBulkDeleteMembersMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.BulkPassActionRequest, com.google.protobuf.Empty> getBulkDeleteMembersMethod;
    if ((getBulkDeleteMembersMethod = MembersGrpc.getBulkDeleteMembersMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getBulkDeleteMembersMethod = MembersGrpc.getBulkDeleteMembersMethod) == null) {
          MembersGrpc.getBulkDeleteMembersMethod = getBulkDeleteMembersMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.BulkPassActionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bulkDeleteMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.BulkPassActionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("bulkDeleteMembers"))
              .build();
        }
      }
    }
    return getBulkDeleteMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.CommonObjects.Count> getCountMembersDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countMembersDeprecated",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
      com.passkit.grpc.CommonObjects.Count> getCountMembersDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.CommonObjects.Count> getCountMembersDeprecatedMethod;
    if ((getCountMembersDeprecatedMethod = MembersGrpc.getCountMembersDeprecatedMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCountMembersDeprecatedMethod = MembersGrpc.getCountMembersDeprecatedMethod) == null) {
          MembersGrpc.getCountMembersDeprecatedMethod = getCountMembersDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countMembersDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("countMembersDeprecated"))
              .build();
        }
      }
    }
    return getCountMembersDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countMembers",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountMembersMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count> getCountMembersMethod;
    if ((getCountMembersMethod = MembersGrpc.getCountMembersMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCountMembersMethod = MembersGrpc.getCountMembersMethod) == null) {
          MembersGrpc.getCountMembersMethod = getCountMembersMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("countMembers"))
              .build();
        }
      }
    }
    return getCountMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessageHistoryForMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMessageHistoryForMember",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.MessageOuterClass.Message.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.MessageOuterClass.Message> getGetMessageHistoryForMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.MessageOuterClass.Message> getGetMessageHistoryForMemberMethod;
    if ((getGetMessageHistoryForMemberMethod = MembersGrpc.getGetMessageHistoryForMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetMessageHistoryForMemberMethod = MembersGrpc.getGetMessageHistoryForMemberMethod) == null) {
          MembersGrpc.getGetMessageHistoryForMemberMethod = getGetMessageHistoryForMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.MessageOuterClass.Message>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMessageHistoryForMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.MessageOuterClass.Message.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getMessageHistoryForMember"))
              .build();
        }
      }
    }
    return getGetMessageHistoryForMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMetaKeysForProgram",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Strings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForProgramMethod;
    if ((getGetMetaKeysForProgramMethod = MembersGrpc.getGetMetaKeysForProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetMetaKeysForProgramMethod = MembersGrpc.getGetMetaKeysForProgramMethod) == null) {
          MembersGrpc.getGetMetaKeysForProgramMethod = getGetMetaKeysForProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMetaKeysForProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Strings.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getMetaKeysForProgram"))
              .build();
        }
      }
    }
    return getGetMetaKeysForProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest,
      com.passkit.grpc.CommonObjects.Count> getRenewMembersExpiryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "renewMembersExpiry",
      requestType = com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest,
      com.passkit.grpc.CommonObjects.Count> getRenewMembersExpiryMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest, com.passkit.grpc.CommonObjects.Count> getRenewMembersExpiryMethod;
    if ((getRenewMembersExpiryMethod = MembersGrpc.getRenewMembersExpiryMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getRenewMembersExpiryMethod = MembersGrpc.getRenewMembersExpiryMethod) == null) {
          MembersGrpc.getRenewMembersExpiryMethod = getRenewMembersExpiryMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "renewMembersExpiry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("renewMembersExpiry"))
              .build();
        }
      }
    }
    return getRenewMembersExpiryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberExpiry,
      com.passkit.grpc.CommonObjects.Id> getUpdateMemberExpiryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMemberExpiry",
      requestType = com.passkit.grpc.Members.MemberOuterClass.MemberExpiry.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberExpiry,
      com.passkit.grpc.CommonObjects.Id> getUpdateMemberExpiryMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.MemberExpiry, com.passkit.grpc.CommonObjects.Id> getUpdateMemberExpiryMethod;
    if ((getUpdateMemberExpiryMethod = MembersGrpc.getUpdateMemberExpiryMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getUpdateMemberExpiryMethod = MembersGrpc.getUpdateMemberExpiryMethod) == null) {
          MembersGrpc.getUpdateMemberExpiryMethod = getUpdateMemberExpiryMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.MemberExpiry, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMemberExpiry"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.MemberExpiry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("updateMemberExpiry"))
              .build();
        }
      }
    }
    return getUpdateMemberExpiryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Personal.PersonRequest,
      com.passkit.grpc.CommonObjects.Id> getPatchPersonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchPerson",
      requestType = com.passkit.grpc.Personal.PersonRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Personal.PersonRequest,
      com.passkit.grpc.CommonObjects.Id> getPatchPersonMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Personal.PersonRequest, com.passkit.grpc.CommonObjects.Id> getPatchPersonMethod;
    if ((getPatchPersonMethod = MembersGrpc.getPatchPersonMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getPatchPersonMethod = MembersGrpc.getPatchPersonMethod) == null) {
          MembersGrpc.getPatchPersonMethod = getPatchPersonMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Personal.PersonRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "patchPerson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Personal.PersonRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("patchPerson"))
              .build();
        }
      }
    }
    return getPatchPersonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountMemberEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countMemberEvents",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountMemberEventsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count> getCountMemberEventsMethod;
    if ((getCountMemberEventsMethod = MembersGrpc.getCountMemberEventsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getCountMemberEventsMethod = MembersGrpc.getCountMemberEventsMethod) == null) {
          MembersGrpc.getCountMemberEventsMethod = getCountMemberEventsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countMemberEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("countMemberEvents"))
              .build();
        }
      }
    }
    return getCountMemberEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListMemberEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listMemberEvents",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListMemberEventsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListMemberEventsMethod;
    if ((getListMemberEventsMethod = MembersGrpc.getListMemberEventsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListMemberEventsMethod = MembersGrpc.getListMemberEventsMethod) == null) {
          MembersGrpc.getListMemberEventsMethod = getListMemberEventsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listMemberEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listMemberEvents"))
              .build();
        }
      }
    }
    return getListMemberEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMemberEventMetaKeysForProgramMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMemberEventMetaKeysForProgram",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Strings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMemberEventMetaKeysForProgramMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings> getGetMemberEventMetaKeysForProgramMethod;
    if ((getGetMemberEventMetaKeysForProgramMethod = MembersGrpc.getGetMemberEventMetaKeysForProgramMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetMemberEventMetaKeysForProgramMethod = MembersGrpc.getGetMemberEventMetaKeysForProgramMethod) == null) {
          MembersGrpc.getGetMemberEventMetaKeysForProgramMethod = getGetMemberEventMetaKeysForProgramMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMemberEventMetaKeysForProgram"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Strings.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getMemberEventMetaKeysForProgram"))
              .build();
        }
      }
    }
    return getGetMemberEventMetaKeysForProgramMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListEventsForMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listEventsForMember",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListEventsForMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> getListEventsForMemberMethod;
    if ((getListEventsForMemberMethod = MembersGrpc.getListEventsForMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getListEventsForMemberMethod = MembersGrpc.getListEventsForMemberMethod) == null) {
          MembersGrpc.getListEventsForMemberMethod = getListEventsForMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listEventsForMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("listEventsForMember"))
              .build();
        }
      }
    }
    return getListEventsForMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.google.protobuf.Empty> getDeleteMemberEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMemberEvents",
      requestType = com.passkit.grpc.Members.MemberOuterClass.ListRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest,
      com.google.protobuf.Empty> getDeleteMemberEventsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.google.protobuf.Empty> getDeleteMemberEventsMethod;
    if ((getDeleteMemberEventsMethod = MembersGrpc.getDeleteMemberEventsMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteMemberEventsMethod = MembersGrpc.getDeleteMemberEventsMethod) == null) {
          MembersGrpc.getDeleteMemberEventsMethod = getDeleteMemberEventsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Members.MemberOuterClass.ListRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMemberEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Members.MemberOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteMemberEvents"))
              .build();
        }
      }
    }
    return getDeleteMemberEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteEventsForMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEventsForMember",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteEventsForMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteEventsForMemberMethod;
    if ((getDeleteEventsForMemberMethod = MembersGrpc.getDeleteEventsForMemberMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteEventsForMemberMethod = MembersGrpc.getDeleteEventsForMemberMethod) == null) {
          MembersGrpc.getDeleteEventsForMemberMethod = getDeleteEventsForMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteEventsForMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteEventsForMember"))
              .build();
        }
      }
    }
    return getDeleteEventsForMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteMemberEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteMemberEvent",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteMemberEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteMemberEventMethod;
    if ((getDeleteMemberEventMethod = MembersGrpc.getDeleteMemberEventMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getDeleteMemberEventMethod = MembersGrpc.getDeleteMemberEventMethod) == null) {
          MembersGrpc.getDeleteMemberEventMethod = getDeleteMemberEventMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteMemberEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("deleteMemberEvent"))
              .build();
        }
      }
    }
    return getDeleteMemberEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Distribution.EnrolmentUrls> getGetProgramEnrolmentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProgramEnrolment",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Distribution.EnrolmentUrls.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Distribution.EnrolmentUrls> getGetProgramEnrolmentMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Distribution.EnrolmentUrls> getGetProgramEnrolmentMethod;
    if ((getGetProgramEnrolmentMethod = MembersGrpc.getGetProgramEnrolmentMethod) == null) {
      synchronized (MembersGrpc.class) {
        if ((getGetProgramEnrolmentMethod = MembersGrpc.getGetProgramEnrolmentMethod) == null) {
          MembersGrpc.getGetProgramEnrolmentMethod = getGetProgramEnrolmentMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Distribution.EnrolmentUrls>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProgramEnrolment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Distribution.EnrolmentUrls.getDefaultInstance()))
              .setSchemaDescriptor(new MembersMethodDescriptorSupplier("getProgramEnrolment"))
              .build();
        }
      }
    }
    return getGetProgramEnrolmentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MembersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersStub>() {
        @java.lang.Override
        public MembersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersStub(channel, callOptions);
        }
      };
    return MembersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MembersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersBlockingStub>() {
        @java.lang.Override
        public MembersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersBlockingStub(channel, callOptions);
        }
      };
    return MembersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MembersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MembersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MembersFutureStub>() {
        @java.lang.Override
        public MembersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MembersFutureStub(channel, callOptions);
        }
      };
    return MembersFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Creates a new membership program with details about enrollment, renewal, and cancellation. Optionally configure GPS locations and Beacons to trigger lock-screen notifications. Required fields: program name.
     * </pre>
     */
    default void createProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing membership program with new details or settings. Required fields: program id.
     * </pre>
     */
    default void updateProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a membership program by its unique id. Required fields: program id.
     * </pre>
     */
    default void getProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new program by copying the configuration and design of an existing program. Required fields: source program id.
     * </pre>
     */
    default void copyProgram(com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permanently deletes a membership program and its associated data, including all passes. Required fields: program id. Use with caution, as this action is irreversible.
     * </pre>
     */
    default void deleteProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering and pagination. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use the updated listPrograms call instead.
     * </pre>
     */
    default void listProgramsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProgramsDeprecatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    default void listPrograms(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListProgramsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new membership tier within a program, specifying criteria, benefits, and settings. Required fields: program id, tier name.
     * </pre>
     */
    default void createTier(com.passkit.grpc.Members.TierOuterClass.Tier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing membership tier’s details such as benefits, qualifications, and rules. Required fields: tier id.
     * </pre>
     */
    default void updateTier(com.passkit.grpc.Members.TierOuterClass.Tier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves details of a specific membership tier by its id. Required fields: tier id.
     * </pre>
     */
    default void getTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a membership tier from a program. Required fields: tier id.
     * </pre>
     */
    default void deleteTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listTiers.
     * </pre>
     */
    default void listTiersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTiersDeprecatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    default void listTiers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTiersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Enrols a new member into a program and generates a pass. Required fields: program id and member data.
     * </pre>
     */
    default void enrolMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrolMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Public endpoint to enrol a new member into a program without authentication. Required fields: program id and member data.
     * </pre>
     */
    default void enrolMemberPublic(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnrolMemberPublicMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a member record using the PassKit id. Required fields: member id.
     * </pre>
     */
    default void getMemberRecordById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemberRecordByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a member record using the member's external id. Required fields: program id and external id.
     * </pre>
     */
    default void getMemberRecordByExternalId(com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemberRecordByExternalIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks in a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    default void checkInMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckInMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Checks out a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    default void checkOutMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckOutMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listMembers as OR operator is not supported.
     * </pre>
     */
    default void listMembersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersDeprecatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    default void listMembers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates an existing member’s personal details or status using PassKit Id or External Id. Required fields: member id or program id and external id. If updating personal information only use patchPerson.
     * </pre>
     */
    default void updateMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Adds (earns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to earn.
     * </pre>
     */
    default void earnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEarnPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Removes (burns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to burn.
     * </pre>
     */
    default void burnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBurnPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sets loyalty points balance to a specific value for a member using PassKit Id or External Id. Required fields: member id, or program id and external id, and new points balance.
     * </pre>
     */
    default void setPoints(com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetPointsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Changes a member’s tier within a program using PassKit Id or External Id. Required fields: member id, or program id and external id, and new tier id.
     * </pre>
     */
    default void changeMemberTier(com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeMemberTierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkUpdateMembers.
     * </pre>
     */
    default void updateMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMembersBySegmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkDeleteMembers.
     * </pre>
     */
    default void deleteMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMembersBySegmentMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a single member by their PassKit Id or External ID. Required fields: member id or program id and external id.
     * </pre>
     */
    default void deleteMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bulk deletes multiple members from a program based on provided criteria. Required fields: program id, protocol and filters criteria.
     * </pre>
     */
    default void bulkDeleteMembers(com.passkit.grpc.CommonObjects.BulkPassActionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBulkDeleteMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use countMembers as OR operator is not supported.
     * </pre>
     */
    default void countMembersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMembersDeprecatedMethod(), responseObserver);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id.
     * </pre>
     */
    default void countMembers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * [UNIMPLEMENTED] Retrieves the message history sent to a member. Required fields: member id.
     * </pre>
     */
    default void getMessageHistoryForMember(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMessageHistoryForMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves meta keys (custom fields) for a specific program. Required fields: program id.
     * </pre>
     */
    default void getMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMetaKeysForProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Batch updates the expiry dates for ALL members. Required fields: program id, tier id and new expiry settings.
     * </pre>
     */
    default void renewMembersExpiry(com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewMembersExpiryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates the expiry date for a member’s pass using the PassKit Id or External Id. Required fields: member id, or external id and program id, and new expiry date.
     * </pre>
     */
    default void updateMemberExpiry(com.passkit.grpc.Members.MemberOuterClass.MemberExpiry request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMemberExpiryMethod(), responseObserver);
    }

    /**
     * <pre>
     * Updates a member's personal information, such as name, address, or contact details. Required fields: member id, or external id and program id, and new member information.
     * </pre>
     */
    default void patchPerson(com.passkit.grpc.Personal.PersonRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchPersonMethod(), responseObserver);
    }

    /**
     * <pre>
     * Counts the number of member events for a specific program based on given filters. Required fields: program id.
     * </pre>
     */
    default void countMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountMemberEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists events related to members in a specific program, supporting filtering and pagination. Required fields: program id.
     * </pre>
     */
    default void listMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMemberEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of meta keys associated with member events for a specific program. Required fields: program id.
     * </pre>
     */
    default void getMemberEventMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMemberEventMetaKeysForProgramMethod(), responseObserver);
    }

    /**
     * <pre>
     * Lists events for a specific member, such as check-ins/outs, changes to points etc. Required fields: member id.
     * </pre>
     */
    default void listEventsForMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListEventsForMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes member event history for a program based on specified criteria. Required fields: program id.
     * </pre>
     */
    default void deleteMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMemberEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes all member events associated with a specific member. Required fields: member id.
     * </pre>
     */
    default void deleteEventsForMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteEventsForMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific individual member event. Required fields: member event id.
     * </pre>
     */
    default void deleteMemberEvent(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMemberEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieves enrolment URLs and QR codes for a membership program, including tier-specific links if applicable. Required fields: program id.
     * </pre>
     */
    default void getProgramEnrolment(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.EnrolmentUrls> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProgramEnrolmentMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Members.
   * <pre>
   *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
   * </pre>
   */
  public static abstract class MembersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MembersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Members.
   * <pre>
   *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
   * </pre>
   */
  public static final class MembersStub
      extends io.grpc.stub.AbstractAsyncStub<MembersStub> {
    private MembersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new membership program with details about enrollment, renewal, and cancellation. Optionally configure GPS locations and Beacons to trigger lock-screen notifications. Required fields: program name.
     * </pre>
     */
    public void createProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing membership program with new details or settings. Required fields: program id.
     * </pre>
     */
    public void updateProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a membership program by its unique id. Required fields: program id.
     * </pre>
     */
    public void getProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new program by copying the configuration and design of an existing program. Required fields: source program id.
     * </pre>
     */
    public void copyProgram(com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permanently deletes a membership program and its associated data, including all passes. Required fields: program id. Use with caution, as this action is irreversible.
     * </pre>
     */
    public void deleteProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering and pagination. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use the updated listPrograms call instead.
     * </pre>
     */
    public void listProgramsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListProgramsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public void listPrograms(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListProgramsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new membership tier within a program, specifying criteria, benefits, and settings. Required fields: program id, tier name.
     * </pre>
     */
    public void createTier(com.passkit.grpc.Members.TierOuterClass.Tier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing membership tier’s details such as benefits, qualifications, and rules. Required fields: tier id.
     * </pre>
     */
    public void updateTier(com.passkit.grpc.Members.TierOuterClass.Tier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves details of a specific membership tier by its id. Required fields: tier id.
     * </pre>
     */
    public void getTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a membership tier from a program. Required fields: tier id.
     * </pre>
     */
    public void deleteTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listTiers.
     * </pre>
     */
    public void listTiersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTiersDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public void listTiers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTiersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Enrols a new member into a program and generates a pass. Required fields: program id and member data.
     * </pre>
     */
    public void enrolMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnrolMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Public endpoint to enrol a new member into a program without authentication. Required fields: program id and member data.
     * </pre>
     */
    public void enrolMemberPublic(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnrolMemberPublicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a member record using the PassKit id. Required fields: member id.
     * </pre>
     */
    public void getMemberRecordById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemberRecordByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a member record using the member's external id. Required fields: program id and external id.
     * </pre>
     */
    public void getMemberRecordByExternalId(com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemberRecordByExternalIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks in a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public void checkInMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckInMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Checks out a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public void checkOutMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckOutMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listMembers as OR operator is not supported.
     * </pre>
     */
    public void listMembersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMembersDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public void listMembers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates an existing member’s personal details or status using PassKit Id or External Id. Required fields: member id or program id and external id. If updating personal information only use patchPerson.
     * </pre>
     */
    public void updateMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Adds (earns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to earn.
     * </pre>
     */
    public void earnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEarnPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Removes (burns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to burn.
     * </pre>
     */
    public void burnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBurnPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sets loyalty points balance to a specific value for a member using PassKit Id or External Id. Required fields: member id, or program id and external id, and new points balance.
     * </pre>
     */
    public void setPoints(com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetPointsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Changes a member’s tier within a program using PassKit Id or External Id. Required fields: member id, or program id and external id, and new tier id.
     * </pre>
     */
    public void changeMemberTier(com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeMemberTierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkUpdateMembers.
     * </pre>
     */
    public void updateMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMembersBySegmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkDeleteMembers.
     * </pre>
     */
    public void deleteMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMembersBySegmentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a single member by their PassKit Id or External ID. Required fields: member id or program id and external id.
     * </pre>
     */
    public void deleteMember(com.passkit.grpc.Members.MemberOuterClass.Member request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Bulk deletes multiple members from a program based on provided criteria. Required fields: program id, protocol and filters criteria.
     * </pre>
     */
    public void bulkDeleteMembers(com.passkit.grpc.CommonObjects.BulkPassActionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBulkDeleteMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use countMembers as OR operator is not supported.
     * </pre>
     */
    public void countMembersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMembersDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id.
     * </pre>
     */
    public void countMembers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * [UNIMPLEMENTED] Retrieves the message history sent to a member. Required fields: member id.
     * </pre>
     */
    public void getMessageHistoryForMember(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetMessageHistoryForMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves meta keys (custom fields) for a specific program. Required fields: program id.
     * </pre>
     */
    public void getMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMetaKeysForProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Batch updates the expiry dates for ALL members. Required fields: program id, tier id and new expiry settings.
     * </pre>
     */
    public void renewMembersExpiry(com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewMembersExpiryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates the expiry date for a member’s pass using the PassKit Id or External Id. Required fields: member id, or external id and program id, and new expiry date.
     * </pre>
     */
    public void updateMemberExpiry(com.passkit.grpc.Members.MemberOuterClass.MemberExpiry request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMemberExpiryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Updates a member's personal information, such as name, address, or contact details. Required fields: member id, or external id and program id, and new member information.
     * </pre>
     */
    public void patchPerson(com.passkit.grpc.Personal.PersonRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchPersonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Counts the number of member events for a specific program based on given filters. Required fields: program id.
     * </pre>
     */
    public void countMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountMemberEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists events related to members in a specific program, supporting filtering and pagination. Required fields: program id.
     * </pre>
     */
    public void listMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListMemberEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves the list of meta keys associated with member events for a specific program. Required fields: program id.
     * </pre>
     */
    public void getMemberEventMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMemberEventMetaKeysForProgramMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Lists events for a specific member, such as check-ins/outs, changes to points etc. Required fields: member id.
     * </pre>
     */
    public void listEventsForMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListEventsForMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes member event history for a program based on specified criteria. Required fields: program id.
     * </pre>
     */
    public void deleteMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMemberEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes all member events associated with a specific member. Required fields: member id.
     * </pre>
     */
    public void deleteEventsForMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteEventsForMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deletes a specific individual member event. Required fields: member event id.
     * </pre>
     */
    public void deleteMemberEvent(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMemberEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieves enrolment URLs and QR codes for a membership program, including tier-specific links if applicable. Required fields: program id.
     * </pre>
     */
    public void getProgramEnrolment(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.EnrolmentUrls> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProgramEnrolmentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Members.
   * <pre>
   *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
   * </pre>
   */
  public static final class MembersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MembersBlockingStub> {
    private MembersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new membership program with details about enrollment, renewal, and cancellation. Optionally configure GPS locations and Beacons to trigger lock-screen notifications. Required fields: program name.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id createProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing membership program with new details or settings. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.Members.ProgramOuterClass.Program updateProgram(com.passkit.grpc.Members.ProgramOuterClass.Program request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a membership program by its unique id. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.Members.ProgramOuterClass.Program getProgram(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new program by copying the configuration and design of an existing program. Required fields: source program id.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id copyProgram(com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permanently deletes a membership program and its associated data, including all passes. Required fields: program id. Use with caution, as this action is irreversible.
     * </pre>
     */
    public com.google.protobuf.Empty deleteProgram(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering and pagination. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use the updated listPrograms call instead.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.ProgramOuterClass.Program> listProgramsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListProgramsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists all membership programs associated with your project. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.ProgramOuterClass.Program> listPrograms(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListProgramsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new membership tier within a program, specifying criteria, benefits, and settings. Required fields: program id, tier name.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id createTier(com.passkit.grpc.Members.TierOuterClass.Tier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing membership tier’s details such as benefits, qualifications, and rules. Required fields: tier id.
     * </pre>
     */
    public com.passkit.grpc.Members.TierOuterClass.Tier updateTier(com.passkit.grpc.Members.TierOuterClass.Tier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves details of a specific membership tier by its id. Required fields: tier id.
     * </pre>
     */
    public com.passkit.grpc.Members.TierOuterClass.Tier getTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a membership tier from a program. Required fields: tier id.
     * </pre>
     */
    public com.google.protobuf.Empty deleteTier(com.passkit.grpc.Members.TierOuterClass.TierRequestInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listTiers.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.TierOuterClass.Tier> listTiersDeprecated(
        com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTiersDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of all membership tiers within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.TierOuterClass.Tier> listTiers(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTiersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Enrols a new member into a program and generates a pass. Required fields: program id and member data.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id enrolMember(com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnrolMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Public endpoint to enrol a new member into a program without authentication. Required fields: program id and member data.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id enrolMemberPublic(com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnrolMemberPublicMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a member record using the PassKit id. Required fields: member id.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberOuterClass.Member getMemberRecordById(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemberRecordByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a member record using the member's external id. Required fields: program id and external id.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberOuterClass.Member getMemberRecordByExternalId(com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemberRecordByExternalIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks in a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent checkInMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckInMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Checks out a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent checkOutMember(com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckOutMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use listMembers as OR operator is not supported.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.MemberOuterClass.Member> listMembersDeprecated(
        com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMembersDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves a list of all members within a membership program. Required fields: program id. Supports filtering options to narrow down the results based on specific criteria.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.MemberOuterClass.Member> listMembers(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates an existing member’s personal details or status using PassKit Id or External Id. Required fields: member id or program id and external id. If updating personal information only use patchPerson.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id updateMember(com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Adds (earns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to earn.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberOuterClass.MemberPoints earnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEarnPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Removes (burns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to burn.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberOuterClass.MemberPoints burnPoints(com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBurnPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sets loyalty points balance to a specific value for a member using PassKit Id or External Id. Required fields: member id, or program id and external id, and new points balance.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberOuterClass.MemberPoints setPoints(com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetPointsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Changes a member’s tier within a program using PassKit Id or External Id. Required fields: member id, or program id and external id, and new tier id.
     * </pre>
     */
    public com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent changeMemberTier(com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeMemberTierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkUpdateMembers.
     * </pre>
     */
    public com.google.protobuf.Empty updateMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMembersBySegmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkDeleteMembers.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMembersBySegment(com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMembersBySegmentMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a single member by their PassKit Id or External ID. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMember(com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Bulk deletes multiple members from a program based on provided criteria. Required fields: program id, protocol and filters criteria.
     * </pre>
     */
    public com.google.protobuf.Empty bulkDeleteMembers(com.passkit.grpc.CommonObjects.BulkPassActionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBulkDeleteMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use countMembers as OR operator is not supported.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Count countMembersDeprecated(com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMembersDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Count countMembers(com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * [UNIMPLEMENTED] Retrieves the message history sent to a member. Required fields: member id.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.MessageOuterClass.Message> getMessageHistoryForMember(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetMessageHistoryForMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves meta keys (custom fields) for a specific program. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Strings getMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMetaKeysForProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Batch updates the expiry dates for ALL members. Required fields: program id, tier id and new expiry settings.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Count renewMembersExpiry(com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewMembersExpiryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates the expiry date for a member’s pass using the PassKit Id or External Id. Required fields: member id, or external id and program id, and new expiry date.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id updateMemberExpiry(com.passkit.grpc.Members.MemberOuterClass.MemberExpiry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMemberExpiryMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Updates a member's personal information, such as name, address, or contact details. Required fields: member id, or external id and program id, and new member information.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id patchPerson(com.passkit.grpc.Personal.PersonRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchPersonMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Counts the number of member events for a specific program based on given filters. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Count countMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountMemberEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists events related to members in a specific program, supporting filtering and pagination. Required fields: program id.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> listMemberEvents(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListMemberEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves the list of meta keys associated with member events for a specific program. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Strings getMemberEventMetaKeysForProgram(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMemberEventMetaKeysForProgramMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Lists events for a specific member, such as check-ins/outs, changes to points etc. Required fields: member id.
     * </pre>
     */
    public java.util.Iterator<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> listEventsForMember(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListEventsForMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes member event history for a program based on specified criteria. Required fields: program id.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMemberEvents(com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMemberEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes all member events associated with a specific member. Required fields: member id.
     * </pre>
     */
    public com.google.protobuf.Empty deleteEventsForMember(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteEventsForMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deletes a specific individual member event. Required fields: member event id.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMemberEvent(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMemberEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieves enrolment URLs and QR codes for a membership program, including tier-specific links if applicable. Required fields: program id.
     * </pre>
     */
    public com.passkit.grpc.Distribution.EnrolmentUrls getProgramEnrolment(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProgramEnrolmentMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Members.
   * <pre>
   *The PassKit Members API provides a powerful and flexible way to manage your membership programs, including creating, updating, and maintaining digital membership passes for Apple Wallet and Google Wallet. Easily integrate membership functionality into your applications to deliver seamless, real-time experiences for your members.
   * </pre>
   */
  public static final class MembersFutureStub
      extends io.grpc.stub.AbstractFutureStub<MembersFutureStub> {
    private MembersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MembersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MembersFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Creates a new membership program with details about enrollment, renewal, and cancellation. Optionally configure GPS locations and Beacons to trigger lock-screen notifications. Required fields: program name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createProgram(
        com.passkit.grpc.Members.ProgramOuterClass.Program request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing membership program with new details or settings. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.ProgramOuterClass.Program> updateProgram(
        com.passkit.grpc.Members.ProgramOuterClass.Program request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a membership program by its unique id. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.ProgramOuterClass.Program> getProgram(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new program by copying the configuration and design of an existing program. Required fields: source program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyProgram(
        com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permanently deletes a membership program and its associated data, including all passes. Required fields: program id. Use with caution, as this action is irreversible.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProgram(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new membership tier within a program, specifying criteria, benefits, and settings. Required fields: program id, tier name.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createTier(
        com.passkit.grpc.Members.TierOuterClass.Tier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing membership tier’s details such as benefits, qualifications, and rules. Required fields: tier id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.TierOuterClass.Tier> updateTier(
        com.passkit.grpc.Members.TierOuterClass.Tier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves details of a specific membership tier by its id. Required fields: tier id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.TierOuterClass.Tier> getTier(
        com.passkit.grpc.Members.TierOuterClass.TierRequestInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a membership tier from a program. Required fields: tier id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTier(
        com.passkit.grpc.Members.TierOuterClass.TierRequestInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Enrols a new member into a program and generates a pass. Required fields: program id and member data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> enrolMember(
        com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnrolMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Public endpoint to enrol a new member into a program without authentication. Required fields: program id and member data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> enrolMemberPublic(
        com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnrolMemberPublicMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a member record using the PassKit id. Required fields: member id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberOuterClass.Member> getMemberRecordById(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemberRecordByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves a member record using the member's external id. Required fields: program id and external id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberOuterClass.Member> getMemberRecordByExternalId(
        com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemberRecordByExternalIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks in a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> checkInMember(
        com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckInMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Checks out a member in by PassKit Id or External Id. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> checkOutMember(
        com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckOutMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates an existing member’s personal details or status using PassKit Id or External Id. Required fields: member id or program id and external id. If updating personal information only use patchPerson.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateMember(
        com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Adds (earns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to earn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> earnPoints(
        com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEarnPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Removes (burns) loyalty points to a member's account using PassKit Id or External Id. Required fields: member id, or program id and external id, and number of points to burn.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> burnPoints(
        com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBurnPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Sets loyalty points balance to a specific value for a member using PassKit Id or External Id. Required fields: member id, or program id and external id, and new points balance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberOuterClass.MemberPoints> setPoints(
        com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetPointsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Changes a member’s tier within a program using PassKit Id or External Id. Required fields: member id, or program id and external id, and new tier id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent> changeMemberTier(
        com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeMemberTierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkUpdateMembers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateMembersBySegment(
        com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMembersBySegmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes multiple members based on filtering criteria. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use bulkDeleteMembers.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMembersBySegment(
        com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMembersBySegmentMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a single member by their PassKit Id or External ID. Required fields: member id or program id and external id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMember(
        com.passkit.grpc.Members.MemberOuterClass.Member request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Bulk deletes multiple members from a program based on provided criteria. Required fields: program id, protocol and filters criteria.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> bulkDeleteMembers(
        com.passkit.grpc.CommonObjects.BulkPassActionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBulkDeleteMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id. This version uses the legacy request format and is maintained for backward compatibility. New integrations should use countMembers as OR operator is not supported.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countMembersDeprecated(
        com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMembersDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Counts the number of members matching a filter. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countMembers(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves meta keys (custom fields) for a specific program. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Strings> getMetaKeysForProgram(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMetaKeysForProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Batch updates the expiry dates for ALL members. Required fields: program id, tier id and new expiry settings.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> renewMembersExpiry(
        com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewMembersExpiryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates the expiry date for a member’s pass using the PassKit Id or External Id. Required fields: member id, or external id and program id, and new expiry date.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateMemberExpiry(
        com.passkit.grpc.Members.MemberOuterClass.MemberExpiry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMemberExpiryMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Updates a member's personal information, such as name, address, or contact details. Required fields: member id, or external id and program id, and new member information.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> patchPerson(
        com.passkit.grpc.Personal.PersonRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchPersonMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Counts the number of member events for a specific program based on given filters. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countMemberEvents(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountMemberEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves the list of meta keys associated with member events for a specific program. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Strings> getMemberEventMetaKeysForProgram(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMemberEventMetaKeysForProgramMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes member event history for a program based on specified criteria. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMemberEvents(
        com.passkit.grpc.Members.MemberOuterClass.ListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMemberEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes all member events associated with a specific member. Required fields: member id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEventsForMember(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteEventsForMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deletes a specific individual member event. Required fields: member event id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteMemberEvent(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMemberEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieves enrolment URLs and QR codes for a membership program, including tier-specific links if applicable. Required fields: program id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Distribution.EnrolmentUrls> getProgramEnrolment(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProgramEnrolmentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PROGRAM = 0;
  private static final int METHODID_UPDATE_PROGRAM = 1;
  private static final int METHODID_GET_PROGRAM = 2;
  private static final int METHODID_COPY_PROGRAM = 3;
  private static final int METHODID_DELETE_PROGRAM = 4;
  private static final int METHODID_LIST_PROGRAMS_DEPRECATED = 5;
  private static final int METHODID_LIST_PROGRAMS = 6;
  private static final int METHODID_CREATE_TIER = 7;
  private static final int METHODID_UPDATE_TIER = 8;
  private static final int METHODID_GET_TIER = 9;
  private static final int METHODID_DELETE_TIER = 10;
  private static final int METHODID_LIST_TIERS_DEPRECATED = 11;
  private static final int METHODID_LIST_TIERS = 12;
  private static final int METHODID_ENROL_MEMBER = 13;
  private static final int METHODID_ENROL_MEMBER_PUBLIC = 14;
  private static final int METHODID_GET_MEMBER_RECORD_BY_ID = 15;
  private static final int METHODID_GET_MEMBER_RECORD_BY_EXTERNAL_ID = 16;
  private static final int METHODID_CHECK_IN_MEMBER = 17;
  private static final int METHODID_CHECK_OUT_MEMBER = 18;
  private static final int METHODID_LIST_MEMBERS_DEPRECATED = 19;
  private static final int METHODID_LIST_MEMBERS = 20;
  private static final int METHODID_UPDATE_MEMBER = 21;
  private static final int METHODID_EARN_POINTS = 22;
  private static final int METHODID_BURN_POINTS = 23;
  private static final int METHODID_SET_POINTS = 24;
  private static final int METHODID_CHANGE_MEMBER_TIER = 25;
  private static final int METHODID_UPDATE_MEMBERS_BY_SEGMENT = 26;
  private static final int METHODID_DELETE_MEMBERS_BY_SEGMENT = 27;
  private static final int METHODID_DELETE_MEMBER = 28;
  private static final int METHODID_BULK_DELETE_MEMBERS = 29;
  private static final int METHODID_COUNT_MEMBERS_DEPRECATED = 30;
  private static final int METHODID_COUNT_MEMBERS = 31;
  private static final int METHODID_GET_MESSAGE_HISTORY_FOR_MEMBER = 32;
  private static final int METHODID_GET_META_KEYS_FOR_PROGRAM = 33;
  private static final int METHODID_RENEW_MEMBERS_EXPIRY = 34;
  private static final int METHODID_UPDATE_MEMBER_EXPIRY = 35;
  private static final int METHODID_PATCH_PERSON = 36;
  private static final int METHODID_COUNT_MEMBER_EVENTS = 37;
  private static final int METHODID_LIST_MEMBER_EVENTS = 38;
  private static final int METHODID_GET_MEMBER_EVENT_META_KEYS_FOR_PROGRAM = 39;
  private static final int METHODID_LIST_EVENTS_FOR_MEMBER = 40;
  private static final int METHODID_DELETE_MEMBER_EVENTS = 41;
  private static final int METHODID_DELETE_EVENTS_FOR_MEMBER = 42;
  private static final int METHODID_DELETE_MEMBER_EVENT = 43;
  private static final int METHODID_GET_PROGRAM_ENROLMENT = 44;

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
        case METHODID_CREATE_PROGRAM:
          serviceImpl.createProgram((com.passkit.grpc.Members.ProgramOuterClass.Program) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_PROGRAM:
          serviceImpl.updateProgram((com.passkit.grpc.Members.ProgramOuterClass.Program) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program>) responseObserver);
          break;
        case METHODID_GET_PROGRAM:
          serviceImpl.getProgram((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program>) responseObserver);
          break;
        case METHODID_COPY_PROGRAM:
          serviceImpl.copyProgram((com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_PROGRAM:
          serviceImpl.deleteProgram((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_PROGRAMS_DEPRECATED:
          serviceImpl.listProgramsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program>) responseObserver);
          break;
        case METHODID_LIST_PROGRAMS:
          serviceImpl.listPrograms((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.ProgramOuterClass.Program>) responseObserver);
          break;
        case METHODID_CREATE_TIER:
          serviceImpl.createTier((com.passkit.grpc.Members.TierOuterClass.Tier) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_TIER:
          serviceImpl.updateTier((com.passkit.grpc.Members.TierOuterClass.Tier) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier>) responseObserver);
          break;
        case METHODID_GET_TIER:
          serviceImpl.getTier((com.passkit.grpc.Members.TierOuterClass.TierRequestInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier>) responseObserver);
          break;
        case METHODID_DELETE_TIER:
          serviceImpl.deleteTier((com.passkit.grpc.Members.TierOuterClass.TierRequestInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TIERS_DEPRECATED:
          serviceImpl.listTiersDeprecated((com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier>) responseObserver);
          break;
        case METHODID_LIST_TIERS:
          serviceImpl.listTiers((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.TierOuterClass.Tier>) responseObserver);
          break;
        case METHODID_ENROL_MEMBER:
          serviceImpl.enrolMember((com.passkit.grpc.Members.MemberOuterClass.Member) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_ENROL_MEMBER_PUBLIC:
          serviceImpl.enrolMemberPublic((com.passkit.grpc.Members.MemberOuterClass.Member) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_MEMBER_RECORD_BY_ID:
          serviceImpl.getMemberRecordById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member>) responseObserver);
          break;
        case METHODID_GET_MEMBER_RECORD_BY_EXTERNAL_ID:
          serviceImpl.getMemberRecordByExternalId((com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member>) responseObserver);
          break;
        case METHODID_CHECK_IN_MEMBER:
          serviceImpl.checkInMember((com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>) responseObserver);
          break;
        case METHODID_CHECK_OUT_MEMBER:
          serviceImpl.checkOutMember((com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS_DEPRECATED:
          serviceImpl.listMembersDeprecated((com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.Member>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBER:
          serviceImpl.updateMember((com.passkit.grpc.Members.MemberOuterClass.Member) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_EARN_POINTS:
          serviceImpl.earnPoints((com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints>) responseObserver);
          break;
        case METHODID_BURN_POINTS:
          serviceImpl.burnPoints((com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints>) responseObserver);
          break;
        case METHODID_SET_POINTS:
          serviceImpl.setPoints((com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberOuterClass.MemberPoints>) responseObserver);
          break;
        case METHODID_CHANGE_MEMBER_TIER:
          serviceImpl.changeMemberTier((com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBERS_BY_SEGMENT:
          serviceImpl.updateMembersBySegment((com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MEMBERS_BY_SEGMENT:
          serviceImpl.deleteMembersBySegment((com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MEMBER:
          serviceImpl.deleteMember((com.passkit.grpc.Members.MemberOuterClass.Member) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_BULK_DELETE_MEMBERS:
          serviceImpl.bulkDeleteMembers((com.passkit.grpc.CommonObjects.BulkPassActionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COUNT_MEMBERS_DEPRECATED:
          serviceImpl.countMembersDeprecated((com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_MEMBERS:
          serviceImpl.countMembers((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_GET_MESSAGE_HISTORY_FOR_MEMBER:
          serviceImpl.getMessageHistoryForMember((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.MessageOuterClass.Message>) responseObserver);
          break;
        case METHODID_GET_META_KEYS_FOR_PROGRAM:
          serviceImpl.getMetaKeysForProgram((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings>) responseObserver);
          break;
        case METHODID_RENEW_MEMBERS_EXPIRY:
          serviceImpl.renewMembersExpiry((com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBER_EXPIRY:
          serviceImpl.updateMemberExpiry((com.passkit.grpc.Members.MemberOuterClass.MemberExpiry) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_PATCH_PERSON:
          serviceImpl.patchPerson((com.passkit.grpc.Personal.PersonRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_COUNT_MEMBER_EVENTS:
          serviceImpl.countMemberEvents((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_EVENTS:
          serviceImpl.listMemberEvents((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>) responseObserver);
          break;
        case METHODID_GET_MEMBER_EVENT_META_KEYS_FOR_PROGRAM:
          serviceImpl.getMemberEventMetaKeysForProgram((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings>) responseObserver);
          break;
        case METHODID_LIST_EVENTS_FOR_MEMBER:
          serviceImpl.listEventsForMember((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>) responseObserver);
          break;
        case METHODID_DELETE_MEMBER_EVENTS:
          serviceImpl.deleteMemberEvents((com.passkit.grpc.Members.MemberOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_EVENTS_FOR_MEMBER:
          serviceImpl.deleteEventsForMember((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_MEMBER_EVENT:
          serviceImpl.deleteMemberEvent((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PROGRAM_ENROLMENT:
          serviceImpl.getProgramEnrolment((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Distribution.EnrolmentUrls>) responseObserver);
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
          getCreateProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.ProgramOuterClass.Program,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_PROGRAM)))
        .addMethod(
          getUpdateProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.ProgramOuterClass.Program,
              com.passkit.grpc.Members.ProgramOuterClass.Program>(
                service, METHODID_UPDATE_PROGRAM)))
        .addMethod(
          getGetProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Members.ProgramOuterClass.Program>(
                service, METHODID_GET_PROGRAM)))
        .addMethod(
          getCopyProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.ProgramOuterClass.ProgramCopyRequest,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_PROGRAM)))
        .addMethod(
          getDeleteProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PROGRAM)))
        .addMethod(
          getListProgramsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Members.ProgramOuterClass.Program>(
                service, METHODID_LIST_PROGRAMS_DEPRECATED)))
        .addMethod(
          getListProgramsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Members.ProgramOuterClass.Program>(
                service, METHODID_LIST_PROGRAMS)))
        .addMethod(
          getCreateTierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.TierOuterClass.Tier,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_TIER)))
        .addMethod(
          getUpdateTierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.TierOuterClass.Tier,
              com.passkit.grpc.Members.TierOuterClass.Tier>(
                service, METHODID_UPDATE_TIER)))
        .addMethod(
          getGetTierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
              com.passkit.grpc.Members.TierOuterClass.Tier>(
                service, METHODID_GET_TIER)))
        .addMethod(
          getDeleteTierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.TierOuterClass.TierRequestInput,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TIER)))
        .addMethod(
          getListTiersDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
              com.passkit.grpc.Members.TierOuterClass.Tier>(
                service, METHODID_LIST_TIERS_DEPRECATED)))
        .addMethod(
          getListTiersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.passkit.grpc.Members.TierOuterClass.Tier>(
                service, METHODID_LIST_TIERS)))
        .addMethod(
          getEnrolMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.Member,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_ENROL_MEMBER)))
        .addMethod(
          getEnrolMemberPublicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.Member,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_ENROL_MEMBER_PUBLIC)))
        .addMethod(
          getGetMemberRecordByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Members.MemberOuterClass.Member>(
                service, METHODID_GET_MEMBER_RECORD_BY_ID)))
        .addMethod(
          getGetMemberRecordByExternalIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberRecordByExternalIdRequest,
              com.passkit.grpc.Members.MemberOuterClass.Member>(
                service, METHODID_GET_MEMBER_RECORD_BY_EXTERNAL_ID)))
        .addMethod(
          getCheckInMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
              com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>(
                service, METHODID_CHECK_IN_MEMBER)))
        .addMethod(
          getCheckOutMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberCheckInOutRequest,
              com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>(
                service, METHODID_CHECK_OUT_MEMBER)))
        .addMethod(
          getListMembersDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
              com.passkit.grpc.Members.MemberOuterClass.Member>(
                service, METHODID_LIST_MEMBERS_DEPRECATED)))
        .addMethod(
          getListMembersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.passkit.grpc.Members.MemberOuterClass.Member>(
                service, METHODID_LIST_MEMBERS)))
        .addMethod(
          getUpdateMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.Member,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_MEMBER)))
        .addMethod(
          getEarnPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
              com.passkit.grpc.Members.MemberOuterClass.MemberPoints>(
                service, METHODID_EARN_POINTS)))
        .addMethod(
          getBurnPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.EarnBurnPointsRequest,
              com.passkit.grpc.Members.MemberOuterClass.MemberPoints>(
                service, METHODID_BURN_POINTS)))
        .addMethod(
          getSetPointsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.SetPointsRequest,
              com.passkit.grpc.Members.MemberOuterClass.MemberPoints>(
                service, METHODID_SET_POINTS)))
        .addMethod(
          getChangeMemberTierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ChangeTierRequest,
              com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>(
                service, METHODID_CHANGE_MEMBER_TIER)))
        .addMethod(
          getUpdateMembersBySegmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_MEMBERS_BY_SEGMENT)))
        .addMethod(
          getDeleteMembersBySegmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberSegmentRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBERS_BY_SEGMENT)))
        .addMethod(
          getDeleteMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.Member,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBER)))
        .addMethod(
          getBulkDeleteMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.BulkPassActionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_BULK_DELETE_MEMBERS)))
        .addMethod(
          getCountMembersDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequestDeprecated,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_MEMBERS_DEPRECATED)))
        .addMethod(
          getCountMembersMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_MEMBERS)))
        .addMethod(
          getGetMessageHistoryForMemberMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.MessageOuterClass.Message>(
                service, METHODID_GET_MESSAGE_HISTORY_FOR_MEMBER)))
        .addMethod(
          getGetMetaKeysForProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.CommonObjects.Strings>(
                service, METHODID_GET_META_KEYS_FOR_PROGRAM)))
        .addMethod(
          getRenewMembersExpiryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.UpdateExpiryRequest,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_RENEW_MEMBERS_EXPIRY)))
        .addMethod(
          getUpdateMemberExpiryMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.MemberExpiry,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_MEMBER_EXPIRY)))
        .addMethod(
          getPatchPersonMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Personal.PersonRequest,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_PATCH_PERSON)))
        .addMethod(
          getCountMemberEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_MEMBER_EVENTS)))
        .addMethod(
          getListMemberEventsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>(
                service, METHODID_LIST_MEMBER_EVENTS)))
        .addMethod(
          getGetMemberEventMetaKeysForProgramMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.CommonObjects.Strings>(
                service, METHODID_GET_MEMBER_EVENT_META_KEYS_FOR_PROGRAM)))
        .addMethod(
          getListEventsForMemberMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Members.MemberEventsOuterClass.MemberEvent>(
                service, METHODID_LIST_EVENTS_FOR_MEMBER)))
        .addMethod(
          getDeleteMemberEventsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Members.MemberOuterClass.ListRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBER_EVENTS)))
        .addMethod(
          getDeleteEventsForMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_EVENTS_FOR_MEMBER)))
        .addMethod(
          getDeleteMemberEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_MEMBER_EVENT)))
        .addMethod(
          getGetProgramEnrolmentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Distribution.EnrolmentUrls>(
                service, METHODID_GET_PROGRAM_ENROLMENT)))
        .build();
  }

  private static abstract class MembersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MembersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.Members.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Members");
    }
  }

  private static final class MembersFileDescriptorSupplier
      extends MembersBaseDescriptorSupplier {
    MembersFileDescriptorSupplier() {}
  }

  private static final class MembersMethodDescriptorSupplier
      extends MembersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MembersMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MembersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MembersFileDescriptorSupplier())
              .addMethod(getCreateProgramMethod())
              .addMethod(getUpdateProgramMethod())
              .addMethod(getGetProgramMethod())
              .addMethod(getCopyProgramMethod())
              .addMethod(getDeleteProgramMethod())
              .addMethod(getListProgramsDeprecatedMethod())
              .addMethod(getListProgramsMethod())
              .addMethod(getCreateTierMethod())
              .addMethod(getUpdateTierMethod())
              .addMethod(getGetTierMethod())
              .addMethod(getDeleteTierMethod())
              .addMethod(getListTiersDeprecatedMethod())
              .addMethod(getListTiersMethod())
              .addMethod(getEnrolMemberMethod())
              .addMethod(getEnrolMemberPublicMethod())
              .addMethod(getGetMemberRecordByIdMethod())
              .addMethod(getGetMemberRecordByExternalIdMethod())
              .addMethod(getCheckInMemberMethod())
              .addMethod(getCheckOutMemberMethod())
              .addMethod(getListMembersDeprecatedMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getUpdateMemberMethod())
              .addMethod(getEarnPointsMethod())
              .addMethod(getBurnPointsMethod())
              .addMethod(getSetPointsMethod())
              .addMethod(getChangeMemberTierMethod())
              .addMethod(getUpdateMembersBySegmentMethod())
              .addMethod(getDeleteMembersBySegmentMethod())
              .addMethod(getDeleteMemberMethod())
              .addMethod(getBulkDeleteMembersMethod())
              .addMethod(getCountMembersDeprecatedMethod())
              .addMethod(getCountMembersMethod())
              .addMethod(getGetMessageHistoryForMemberMethod())
              .addMethod(getGetMetaKeysForProgramMethod())
              .addMethod(getRenewMembersExpiryMethod())
              .addMethod(getUpdateMemberExpiryMethod())
              .addMethod(getPatchPersonMethod())
              .addMethod(getCountMemberEventsMethod())
              .addMethod(getListMemberEventsMethod())
              .addMethod(getGetMemberEventMetaKeysForProgramMethod())
              .addMethod(getListEventsForMemberMethod())
              .addMethod(getDeleteMemberEventsMethod())
              .addMethod(getDeleteEventsForMemberMethod())
              .addMethod(getDeleteMemberEventMethod())
              .addMethod(getGetProgramEnrolmentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
