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
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: io/core/a_rpc_others.proto")
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final String SERVICE_NAME = "io.Users";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser,
      com.passkit.grpc.User.NewUserResponse> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = com.passkit.grpc.User.NewUser.class,
      responseType = com.passkit.grpc.User.NewUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser,
      com.passkit.grpc.User.NewUserResponse> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser, com.passkit.grpc.User.NewUserResponse> getCreateUserMethod;
    if ((getCreateUserMethod = UsersGrpc.getCreateUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateUserMethod = UsersGrpc.getCreateUserMethod) == null) {
          UsersGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.NewUser, com.passkit.grpc.User.NewUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.NewUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.NewUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser,
      com.passkit.grpc.User.JWT> getNewUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "newUser",
      requestType = com.passkit.grpc.User.NewUser.class,
      responseType = com.passkit.grpc.User.JWT.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser,
      com.passkit.grpc.User.JWT> getNewUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.NewUser, com.passkit.grpc.User.JWT> getNewUserMethod;
    if ((getNewUserMethod = UsersGrpc.getNewUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getNewUserMethod = UsersGrpc.getNewUserMethod) == null) {
          UsersGrpc.getNewUserMethod = getNewUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.NewUser, com.passkit.grpc.User.JWT>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "newUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.NewUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.JWT.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("newUser"))
              .build();
        }
      }
    }
    return getNewUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verify",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Boolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod;
    if ((getVerifyMethod = UsersGrpc.getVerifyMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getVerifyMethod = UsersGrpc.getVerifyMethod) == null) {
          UsersGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Boolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Boolean.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("verify"))
              .build();
        }
      }
    }
    return getVerifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Boolean> getResendVerificationEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resendVerificationEmail",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.CommonObjects.Boolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Boolean> getResendVerificationEmailMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Boolean> getResendVerificationEmailMethod;
    if ((getResendVerificationEmailMethod = UsersGrpc.getResendVerificationEmailMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getResendVerificationEmailMethod = UsersGrpc.getResendVerificationEmailMethod) == null) {
          UsersGrpc.getResendVerificationEmailMethod = getResendVerificationEmailMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Boolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resendVerificationEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Boolean.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("resendVerificationEmail"))
              .build();
        }
      }
    }
    return getResendVerificationEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.GetUserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getUser",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.User.GetUserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.GetUserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.User.GetUserResponse> getGetUserMethod;
    if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetUserMethod = UsersGrpc.getGetUserMethod) == null) {
          UsersGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.User.GetUserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.GetUserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials,
      com.passkit.grpc.User.JWT> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.passkit.grpc.User.Credentials.class,
      responseType = com.passkit.grpc.User.JWT.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials,
      com.passkit.grpc.User.JWT> getLoginMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials, com.passkit.grpc.User.JWT> getLoginMethod;
    if ((getLoginMethod = UsersGrpc.getLoginMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getLoginMethod = UsersGrpc.getLoginMethod) == null) {
          UsersGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.Credentials, com.passkit.grpc.User.JWT>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.JWT.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials,
      com.google.protobuf.Empty> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.passkit.grpc.User.Credentials.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials,
      com.google.protobuf.Empty> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.Credentials, com.google.protobuf.Empty> getResetPasswordMethod;
    if ((getResetPasswordMethod = UsersGrpc.getResetPasswordMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getResetPasswordMethod = UsersGrpc.getResetPasswordMethod) == null) {
          UsersGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.Credentials, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.Credentials.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("resetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.Username,
      com.google.protobuf.Empty> getSendPasswordResetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendPasswordResetLink",
      requestType = com.passkit.grpc.User.Username.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.Username,
      com.google.protobuf.Empty> getSendPasswordResetLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.Username, com.google.protobuf.Empty> getSendPasswordResetLinkMethod;
    if ((getSendPasswordResetLinkMethod = UsersGrpc.getSendPasswordResetLinkMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getSendPasswordResetLinkMethod = UsersGrpc.getSendPasswordResetLinkMethod) == null) {
          UsersGrpc.getSendPasswordResetLinkMethod = getSendPasswordResetLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.Username, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendPasswordResetLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.Username.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("sendPasswordResetLink"))
              .build();
        }
      }
    }
    return getSendPasswordResetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.PasswordResetInput,
      com.google.protobuf.Empty> getChangePasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changePassword",
      requestType = com.passkit.grpc.User.PasswordResetInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.PasswordResetInput,
      com.google.protobuf.Empty> getChangePasswordMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.PasswordResetInput, com.google.protobuf.Empty> getChangePasswordMethod;
    if ((getChangePasswordMethod = UsersGrpc.getChangePasswordMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getChangePasswordMethod = UsersGrpc.getChangePasswordMethod) == null) {
          UsersGrpc.getChangePasswordMethod = getChangePasswordMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.PasswordResetInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changePassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.PasswordResetInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("changePassword"))
              .build();
        }
      }
    }
    return getChangePasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectsForUserQueryDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryDeprecatedMethod;
    if ((getGetProjectsForUserQueryDeprecatedMethod = UsersGrpc.getGetProjectsForUserQueryDeprecatedMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsForUserQueryDeprecatedMethod = UsersGrpc.getGetProjectsForUserQueryDeprecatedMethod) == null) {
          UsersGrpc.getGetProjectsForUserQueryDeprecatedMethod = getGetProjectsForUserQueryDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectsForUserQueryDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectsForUserQueryDeprecated"))
              .build();
        }
      }
    }
    return getGetProjectsForUserQueryDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectsQueryDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryDeprecatedMethod;
    if ((getGetProjectsQueryDeprecatedMethod = UsersGrpc.getGetProjectsQueryDeprecatedMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsQueryDeprecatedMethod = UsersGrpc.getGetProjectsQueryDeprecatedMethod) == null) {
          UsersGrpc.getGetProjectsQueryDeprecatedMethod = getGetProjectsQueryDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectsQueryDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectsQueryDeprecated"))
              .build();
        }
      }
    }
    return getGetProjectsQueryDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectsForUserQuery",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserQueryMethod;
    if ((getGetProjectsForUserQueryMethod = UsersGrpc.getGetProjectsForUserQueryMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsForUserQueryMethod = UsersGrpc.getGetProjectsForUserQueryMethod) == null) {
          UsersGrpc.getGetProjectsForUserQueryMethod = getGetProjectsForUserQueryMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectsForUserQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectsForUserQuery"))
              .build();
        }
      }
    }
    return getGetProjectsForUserQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectsQuery",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsQueryMethod;
    if ((getGetProjectsQueryMethod = UsersGrpc.getGetProjectsQueryMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsQueryMethod = UsersGrpc.getGetProjectsQueryMethod) == null) {
          UsersGrpc.getGetProjectsQueryMethod = getGetProjectsQueryMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectsQuery"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectsQuery"))
              .build();
        }
      }
    }
    return getGetProjectsQueryMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectByUuidMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectByUuid",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectByUuidMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectByUuidMethod;
    if ((getGetProjectByUuidMethod = UsersGrpc.getGetProjectByUuidMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectByUuidMethod = UsersGrpc.getGetProjectByUuidMethod) == null) {
          UsersGrpc.getGetProjectByUuidMethod = getGetProjectByUuidMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectByUuid"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectByUuid"))
              .build();
        }
      }
    }
    return getGetProjectByUuidMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> getGetProjectAndTemplateByShortCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectAndTemplateByShortCode",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> getGetProjectAndTemplateByShortCodeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> getGetProjectAndTemplateByShortCodeMethod;
    if ((getGetProjectAndTemplateByShortCodeMethod = UsersGrpc.getGetProjectAndTemplateByShortCodeMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectAndTemplateByShortCodeMethod = UsersGrpc.getGetProjectAndTemplateByShortCodeMethod) == null) {
          UsersGrpc.getGetProjectAndTemplateByShortCodeMethod = getGetProjectAndTemplateByShortCodeMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectAndTemplateByShortCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectAndTemplateByShortCode"))
              .build();
        }
      }
    }
    return getGetProjectAndTemplateByShortCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjectsForUser",
      requestType = com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsForUserMethod;
    if ((getGetProjectsForUserMethod = UsersGrpc.getGetProjectsForUserMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsForUserMethod = UsersGrpc.getGetProjectsForUserMethod) == null) {
          UsersGrpc.getGetProjectsForUserMethod = getGetProjectsForUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjectsForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjectsForUser"))
              .build();
        }
      }
    }
    return getGetProjectsForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProjects",
      requestType = com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter.class,
      responseType = com.passkit.grpc.ProjectOuterClass.Project.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
      com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter, com.passkit.grpc.ProjectOuterClass.Project> getGetProjectsMethod;
    if ((getGetProjectsMethod = UsersGrpc.getGetProjectsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetProjectsMethod = UsersGrpc.getGetProjectsMethod) == null) {
          UsersGrpc.getGetProjectsMethod = getGetProjectsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter, com.passkit.grpc.ProjectOuterClass.Project>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProjects"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.ProjectOuterClass.Project.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getProjects"))
              .build();
        }
      }
    }
    return getGetProjectsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersStub>() {
        @java.lang.Override
        public UsersStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersStub(channel, callOptions);
        }
      };
    return UsersStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersBlockingStub>() {
        @java.lang.Override
        public UsersBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersBlockingStub(channel, callOptions);
        }
      };
    return UsersBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersFutureStub>() {
        @java.lang.Override
        public UsersFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersFutureStub(channel, callOptions);
        }
      };
    return UsersFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UsersImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.NewUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void newUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      asyncUnimplementedUnaryCall(getNewUserMethod(), responseObserver);
    }

    /**
     */
    public void verify(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    /**
     */
    public void resendVerificationEmail(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      asyncUnimplementedUnaryCall(getResendVerificationEmailMethod(), responseObserver);
    }

    /**
     */
    public void getUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetUserResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    public void login(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void resetPassword(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    public void sendPasswordResetLink(com.passkit.grpc.User.Username request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getSendPasswordResetLinkMethod(), responseObserver);
    }

    /**
     */
    public void changePassword(com.passkit.grpc.User.PasswordResetInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsForUserQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsForUserQueryDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsQueryDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsForUserQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsForUserQueryMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsQueryMethod(), responseObserver);
    }

    /**
     */
    public void getProjectByUuid(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectByUuidMethod(), responseObserver);
    }

    /**
     */
    public void getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectAndTemplateByShortCodeMethod(), responseObserver);
    }

    /**
     */
    public void getProjectsForUser(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsForUserMethod(), responseObserver);
    }

    /**
     */
    public void getProjects(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.NewUser,
                com.passkit.grpc.User.NewUserResponse>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getNewUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.NewUser,
                com.passkit.grpc.User.JWT>(
                  this, METHODID_NEW_USER)))
          .addMethod(
            getVerifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.CommonObjects.Boolean>(
                  this, METHODID_VERIFY)))
          .addMethod(
            getResendVerificationEmailMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.passkit.grpc.CommonObjects.Boolean>(
                  this, METHODID_RESEND_VERIFICATION_EMAIL)))
          .addMethod(
            getGetUserMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.passkit.grpc.User.GetUserResponse>(
                  this, METHODID_GET_USER)))
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.Credentials,
                com.passkit.grpc.User.JWT>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getResetPasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.Credentials,
                com.google.protobuf.Empty>(
                  this, METHODID_RESET_PASSWORD)))
          .addMethod(
            getSendPasswordResetLinkMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.Username,
                com.google.protobuf.Empty>(
                  this, METHODID_SEND_PASSWORD_RESET_LINK)))
          .addMethod(
            getChangePasswordMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.User.PasswordResetInput,
                com.google.protobuf.Empty>(
                  this, METHODID_CHANGE_PASSWORD)))
          .addMethod(
            getGetProjectsForUserQueryDeprecatedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS_FOR_USER_QUERY_DEPRECATED)))
          .addMethod(
            getGetProjectsQueryDeprecatedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS_QUERY_DEPRECATED)))
          .addMethod(
            getGetProjectsForUserQueryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS_FOR_USER_QUERY)))
          .addMethod(
            getGetProjectsQueryMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS_QUERY)))
          .addMethod(
            getGetProjectByUuidMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECT_BY_UUID)))
          .addMethod(
            getGetProjectAndTemplateByShortCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult>(
                  this, METHODID_GET_PROJECT_AND_TEMPLATE_BY_SHORT_CODE)))
          .addMethod(
            getGetProjectsForUserMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS_FOR_USER)))
          .addMethod(
            getGetProjectsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
                com.passkit.grpc.ProjectOuterClass.Project>(
                  this, METHODID_GET_PROJECTS)))
          .build();
    }
  }

  /**
   */
  public static final class UsersStub extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
    private UsersStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersStub(channel, callOptions);
    }

    /**
     */
    public void createUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.NewUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verify(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendVerificationEmail(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResendVerificationEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetUserResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPasswordResetLink(com.passkit.grpc.User.Username request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(com.passkit.grpc.User.PasswordResetInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUserQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserQueryDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsQueryDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUserQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectByUuid(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProjectAndTemplateByShortCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUser(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjects(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UsersBlockingStub extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
    private UsersBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.User.NewUserResponse createUser(com.passkit.grpc.User.NewUser request) {
      return blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.JWT newUser(com.passkit.grpc.User.NewUser request) {
      return blockingUnaryCall(
          getChannel(), getNewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Boolean verify(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Boolean resendVerificationEmail(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getResendVerificationEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.GetUserResponse getUser(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.JWT login(com.passkit.grpc.User.Credentials request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetPassword(com.passkit.grpc.User.Credentials request) {
      return blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendPasswordResetLink(com.passkit.grpc.User.Username request) {
      return blockingUnaryCall(
          getChannel(), getSendPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty changePassword(com.passkit.grpc.User.PasswordResetInput request) {
      return blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUserQueryDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserQueryDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsQueryDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsQueryDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUserQuery(
        com.passkit.grpc.Filter.Filters request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsQuery(
        com.passkit.grpc.Filter.Filters request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.ProjectOuterClass.Project getProjectByUuid(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectByUuidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetProjectAndTemplateByShortCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUser(
        com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjects(
        com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request) {
      return blockingServerStreamingCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UsersFutureStub extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
    private UsersFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.NewUserResponse> createUser(
        com.passkit.grpc.User.NewUser request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.JWT> newUser(
        com.passkit.grpc.User.NewUser request) {
      return futureUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Boolean> verify(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Boolean> resendVerificationEmail(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getResendVerificationEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.GetUserResponse> getUser(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.JWT> login(
        com.passkit.grpc.User.Credentials request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetPassword(
        com.passkit.grpc.User.Credentials request) {
      return futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendPasswordResetLink(
        com.passkit.grpc.User.Username request) {
      return futureUnaryCall(
          getChannel().newCall(getSendPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changePassword(
        com.passkit.grpc.User.PasswordResetInput request) {
      return futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.ProjectOuterClass.Project> getProjectByUuid(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectByUuidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> getProjectAndTemplateByShortCode(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProjectAndTemplateByShortCodeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_NEW_USER = 1;
  private static final int METHODID_VERIFY = 2;
  private static final int METHODID_RESEND_VERIFICATION_EMAIL = 3;
  private static final int METHODID_GET_USER = 4;
  private static final int METHODID_LOGIN = 5;
  private static final int METHODID_RESET_PASSWORD = 6;
  private static final int METHODID_SEND_PASSWORD_RESET_LINK = 7;
  private static final int METHODID_CHANGE_PASSWORD = 8;
  private static final int METHODID_GET_PROJECTS_FOR_USER_QUERY_DEPRECATED = 9;
  private static final int METHODID_GET_PROJECTS_QUERY_DEPRECATED = 10;
  private static final int METHODID_GET_PROJECTS_FOR_USER_QUERY = 11;
  private static final int METHODID_GET_PROJECTS_QUERY = 12;
  private static final int METHODID_GET_PROJECT_BY_UUID = 13;
  private static final int METHODID_GET_PROJECT_AND_TEMPLATE_BY_SHORT_CODE = 14;
  private static final int METHODID_GET_PROJECTS_FOR_USER = 15;
  private static final int METHODID_GET_PROJECTS = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UsersImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UsersImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.passkit.grpc.User.NewUser) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.NewUserResponse>) responseObserver);
          break;
        case METHODID_NEW_USER:
          serviceImpl.newUser((com.passkit.grpc.User.NewUser) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean>) responseObserver);
          break;
        case METHODID_RESEND_VERIFICATION_EMAIL:
          serviceImpl.resendVerificationEmail((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean>) responseObserver);
          break;
        case METHODID_GET_USER:
          serviceImpl.getUser((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetUserResponse>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((com.passkit.grpc.User.Credentials) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.passkit.grpc.User.Credentials) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_PASSWORD_RESET_LINK:
          serviceImpl.sendPasswordResetLink((com.passkit.grpc.User.Username) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CHANGE_PASSWORD:
          serviceImpl.changePassword((com.passkit.grpc.User.PasswordResetInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_FOR_USER_QUERY_DEPRECATED:
          serviceImpl.getProjectsForUserQueryDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_QUERY_DEPRECATED:
          serviceImpl.getProjectsQueryDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_FOR_USER_QUERY:
          serviceImpl.getProjectsForUserQuery((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_QUERY:
          serviceImpl.getProjectsQuery((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECT_BY_UUID:
          serviceImpl.getProjectByUuid((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECT_AND_TEMPLATE_BY_SHORT_CODE:
          serviceImpl.getProjectAndTemplateByShortCode((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult>) responseObserver);
          break;
        case METHODID_GET_PROJECTS_FOR_USER:
          serviceImpl.getProjectsForUser((com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
          break;
        case METHODID_GET_PROJECTS:
          serviceImpl.getProjects((com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project>) responseObserver);
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

  private static abstract class UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcOthers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Users");
    }
  }

  private static final class UsersFileDescriptorSupplier
      extends UsersBaseDescriptorSupplier {
    UsersFileDescriptorSupplier() {}
  }

  private static final class UsersMethodDescriptorSupplier
      extends UsersBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UsersMethodDescriptorSupplier(String methodName) {
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
      synchronized (UsersGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getNewUserMethod())
              .addMethod(getVerifyMethod())
              .addMethod(getResendVerificationEmailMethod())
              .addMethod(getGetUserMethod())
              .addMethod(getLoginMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getSendPasswordResetLinkMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getGetProjectsForUserQueryDeprecatedMethod())
              .addMethod(getGetProjectsQueryDeprecatedMethod())
              .addMethod(getGetProjectsForUserQueryMethod())
              .addMethod(getGetProjectsQueryMethod())
              .addMethod(getGetProjectByUuidMethod())
              .addMethod(getGetProjectAndTemplateByShortCodeMethod())
              .addMethod(getGetProjectsForUserMethod())
              .addMethod(getGetProjectsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
