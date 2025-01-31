package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/core/a_rpc_others.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersGrpc {

  private UsersGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.Users";

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

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.VerifyRequest,
      com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verify",
      requestType = com.passkit.grpc.User.VerifyRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Boolean.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.VerifyRequest,
      com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.VerifyRequest, com.passkit.grpc.CommonObjects.Boolean> getVerifyMethod;
    if ((getVerifyMethod = UsersGrpc.getVerifyMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getVerifyMethod = UsersGrpc.getVerifyMethod) == null) {
          UsersGrpc.getVerifyMethod = getVerifyMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.VerifyRequest, com.passkit.grpc.CommonObjects.Boolean>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.VerifyRequest.getDefaultInstance()))
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Url> getGet2faBarcodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "get2faBarcode",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Url> getGet2faBarcodeMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Url> getGet2faBarcodeMethod;
    if ((getGet2faBarcodeMethod = UsersGrpc.getGet2faBarcodeMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGet2faBarcodeMethod = UsersGrpc.getGet2faBarcodeMethod) == null) {
          UsersGrpc.getGet2faBarcodeMethod = getGet2faBarcodeMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "get2faBarcode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("get2faBarcode"))
              .build();
        }
      }
    }
    return getGet2faBarcodeMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.Email,
      com.google.protobuf.Empty> getChangeEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "changeEmail",
      requestType = com.passkit.grpc.User.Email.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.Email,
      com.google.protobuf.Empty> getChangeEmailMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.Email, com.google.protobuf.Empty> getChangeEmailMethod;
    if ((getChangeEmailMethod = UsersGrpc.getChangeEmailMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getChangeEmailMethod = UsersGrpc.getChangeEmailMethod) == null) {
          UsersGrpc.getChangeEmailMethod = getChangeEmailMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.Email, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "changeEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.Email.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("changeEmail"))
              .build();
        }
      }
    }
    return getChangeEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.ConfirmEmailChangeInput,
      com.google.protobuf.Empty> getConfirmEmailChangeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "confirmEmailChange",
      requestType = com.passkit.grpc.User.ConfirmEmailChangeInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.ConfirmEmailChangeInput,
      com.google.protobuf.Empty> getConfirmEmailChangeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.ConfirmEmailChangeInput, com.google.protobuf.Empty> getConfirmEmailChangeMethod;
    if ((getConfirmEmailChangeMethod = UsersGrpc.getConfirmEmailChangeMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getConfirmEmailChangeMethod = UsersGrpc.getConfirmEmailChangeMethod) == null) {
          UsersGrpc.getConfirmEmailChangeMethod = getConfirmEmailChangeMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.ConfirmEmailChangeInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "confirmEmailChange"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ConfirmEmailChangeInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("confirmEmailChange"))
              .build();
        }
      }
    }
    return getConfirmEmailChangeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.CompanyName,
      com.google.protobuf.Empty> getUpdateCompanyNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCompanyName",
      requestType = com.passkit.grpc.User.CompanyName.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.CompanyName,
      com.google.protobuf.Empty> getUpdateCompanyNameMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.CompanyName, com.google.protobuf.Empty> getUpdateCompanyNameMethod;
    if ((getUpdateCompanyNameMethod = UsersGrpc.getUpdateCompanyNameMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateCompanyNameMethod = UsersGrpc.getUpdateCompanyNameMethod) == null) {
          UsersGrpc.getUpdateCompanyNameMethod = getUpdateCompanyNameMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.CompanyName, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCompanyName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.CompanyName.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("updateCompanyName"))
              .build();
        }
      }
    }
    return getUpdateCompanyNameMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.ScannerConfiguration> getGetScannerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getScannerConfig",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.User.ScannerConfiguration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.ScannerConfiguration> getGetScannerConfigMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.User.ScannerConfiguration> getGetScannerConfigMethod;
    if ((getGetScannerConfigMethod = UsersGrpc.getGetScannerConfigMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetScannerConfigMethod = UsersGrpc.getGetScannerConfigMethod) == null) {
          UsersGrpc.getGetScannerConfigMethod = getGetScannerConfigMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.User.ScannerConfiguration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getScannerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ScannerConfiguration.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getScannerConfig"))
              .build();
        }
      }
    }
    return getGetScannerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration,
      com.google.protobuf.Empty> getCreateScannerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createScannerConfig",
      requestType = com.passkit.grpc.User.ScannerConfiguration.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration,
      com.google.protobuf.Empty> getCreateScannerConfigMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration, com.google.protobuf.Empty> getCreateScannerConfigMethod;
    if ((getCreateScannerConfigMethod = UsersGrpc.getCreateScannerConfigMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateScannerConfigMethod = UsersGrpc.getCreateScannerConfigMethod) == null) {
          UsersGrpc.getCreateScannerConfigMethod = getCreateScannerConfigMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.ScannerConfiguration, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createScannerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ScannerConfiguration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createScannerConfig"))
              .build();
        }
      }
    }
    return getCreateScannerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration,
      com.passkit.grpc.User.ScannerConfiguration> getUpdateScannerConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateScannerConfig",
      requestType = com.passkit.grpc.User.ScannerConfiguration.class,
      responseType = com.passkit.grpc.User.ScannerConfiguration.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration,
      com.passkit.grpc.User.ScannerConfiguration> getUpdateScannerConfigMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.ScannerConfiguration, com.passkit.grpc.User.ScannerConfiguration> getUpdateScannerConfigMethod;
    if ((getUpdateScannerConfigMethod = UsersGrpc.getUpdateScannerConfigMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateScannerConfigMethod = UsersGrpc.getUpdateScannerConfigMethod) == null) {
          UsersGrpc.getUpdateScannerConfigMethod = getUpdateScannerConfigMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.ScannerConfiguration, com.passkit.grpc.User.ScannerConfiguration>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateScannerConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ScannerConfiguration.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ScannerConfiguration.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("updateScannerConfig"))
              .build();
        }
      }
    }
    return getUpdateScannerConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.OAuth2AuthorizationRequest,
      com.passkit.grpc.CommonObjects.Id> getCreateAuthorizationResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createAuthorizationResource",
      requestType = com.passkit.grpc.User.OAuth2AuthorizationRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.OAuth2AuthorizationRequest,
      com.passkit.grpc.CommonObjects.Id> getCreateAuthorizationResourceMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.OAuth2AuthorizationRequest, com.passkit.grpc.CommonObjects.Id> getCreateAuthorizationResourceMethod;
    if ((getCreateAuthorizationResourceMethod = UsersGrpc.getCreateAuthorizationResourceMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateAuthorizationResourceMethod = UsersGrpc.getCreateAuthorizationResourceMethod) == null) {
          UsersGrpc.getCreateAuthorizationResourceMethod = getCreateAuthorizationResourceMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.OAuth2AuthorizationRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createAuthorizationResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.OAuth2AuthorizationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createAuthorizationResource"))
              .build();
        }
      }
    }
    return getCreateAuthorizationResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteAuthorizationResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAuthorizationResource",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteAuthorizationResourceMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteAuthorizationResourceMethod;
    if ((getDeleteAuthorizationResourceMethod = UsersGrpc.getDeleteAuthorizationResourceMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteAuthorizationResourceMethod = UsersGrpc.getDeleteAuthorizationResourceMethod) == null) {
          UsersGrpc.getDeleteAuthorizationResourceMethod = getDeleteAuthorizationResourceMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAuthorizationResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("deleteAuthorizationResource"))
              .build();
        }
      }
    }
    return getDeleteAuthorizationResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getRefreshApiSecretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refreshApiSecret",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getRefreshApiSecretMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getRefreshApiSecretMethod;
    if ((getRefreshApiSecretMethod = UsersGrpc.getRefreshApiSecretMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getRefreshApiSecretMethod = UsersGrpc.getRefreshApiSecretMethod) == null) {
          UsersGrpc.getRefreshApiSecretMethod = getRefreshApiSecretMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refreshApiSecret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("refreshApiSecret"))
              .build();
        }
      }
    }
    return getRefreshApiSecretMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.DeleteAccountRequest,
      com.google.protobuf.Empty> getDeleteAccountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteAccount",
      requestType = com.passkit.grpc.User.DeleteAccountRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.DeleteAccountRequest,
      com.google.protobuf.Empty> getDeleteAccountMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.DeleteAccountRequest, com.google.protobuf.Empty> getDeleteAccountMethod;
    if ((getDeleteAccountMethod = UsersGrpc.getDeleteAccountMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteAccountMethod = UsersGrpc.getDeleteAccountMethod) == null) {
          UsersGrpc.getDeleteAccountMethod = getDeleteAccountMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.DeleteAccountRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteAccount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.DeleteAccountRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("deleteAccount"))
              .build();
        }
      }
    }
    return getDeleteAccountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getRevokeLegacyCredentialsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "revokeLegacyCredentials",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.google.protobuf.Empty> getRevokeLegacyCredentialsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getRevokeLegacyCredentialsMethod;
    if ((getRevokeLegacyCredentialsMethod = UsersGrpc.getRevokeLegacyCredentialsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getRevokeLegacyCredentialsMethod = UsersGrpc.getRevokeLegacyCredentialsMethod) == null) {
          UsersGrpc.getRevokeLegacyCredentialsMethod = getRevokeLegacyCredentialsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "revokeLegacyCredentials"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("revokeLegacyCredentials"))
              .build();
        }
      }
    }
    return getRevokeLegacyCredentialsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.NewTeamMember,
      com.passkit.grpc.CommonObjects.Id> getCreateTeamMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTeamMember",
      requestType = com.passkit.grpc.User.NewTeamMember.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.NewTeamMember,
      com.passkit.grpc.CommonObjects.Id> getCreateTeamMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.NewTeamMember, com.passkit.grpc.CommonObjects.Id> getCreateTeamMemberMethod;
    if ((getCreateTeamMemberMethod = UsersGrpc.getCreateTeamMemberMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreateTeamMemberMethod = UsersGrpc.getCreateTeamMemberMethod) == null) {
          UsersGrpc.getCreateTeamMemberMethod = getCreateTeamMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.NewTeamMember, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTeamMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.NewTeamMember.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createTeamMember"))
              .build();
        }
      }
    }
    return getCreateTeamMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.CommonObjects.Id> getCreatePermissionsForTeamMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPermissionsForTeamMember",
      requestType = com.passkit.grpc.User.TeamMemberPermissions.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.CommonObjects.Id> getCreatePermissionsForTeamMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.CommonObjects.Id> getCreatePermissionsForTeamMemberMethod;
    if ((getCreatePermissionsForTeamMemberMethod = UsersGrpc.getCreatePermissionsForTeamMemberMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getCreatePermissionsForTeamMemberMethod = UsersGrpc.getCreatePermissionsForTeamMemberMethod) == null) {
          UsersGrpc.getCreatePermissionsForTeamMemberMethod = getCreatePermissionsForTeamMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPermissionsForTeamMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.TeamMemberPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("createPermissionsForTeamMember"))
              .build();
        }
      }
    }
    return getCreatePermissionsForTeamMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.User.TeamMemberPermissions> getUpdateTeamMemberPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTeamMemberPermissions",
      requestType = com.passkit.grpc.User.TeamMemberPermissions.class,
      responseType = com.passkit.grpc.User.TeamMemberPermissions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.User.TeamMemberPermissions> getUpdateTeamMemberPermissionsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.User.TeamMemberPermissions> getUpdateTeamMemberPermissionsMethod;
    if ((getUpdateTeamMemberPermissionsMethod = UsersGrpc.getUpdateTeamMemberPermissionsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getUpdateTeamMemberPermissionsMethod = UsersGrpc.getUpdateTeamMemberPermissionsMethod) == null) {
          UsersGrpc.getUpdateTeamMemberPermissionsMethod = getUpdateTeamMemberPermissionsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.User.TeamMemberPermissions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTeamMemberPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.TeamMemberPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.TeamMemberPermissions.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("updateTeamMemberPermissions"))
              .build();
        }
      }
    }
    return getUpdateTeamMemberPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.User.TeamMemberPermissions> getPatchTeamMemberPermissionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchTeamMemberPermissions",
      requestType = com.passkit.grpc.User.TeamMemberPermissions.class,
      responseType = com.passkit.grpc.User.TeamMemberPermissions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions,
      com.passkit.grpc.User.TeamMemberPermissions> getPatchTeamMemberPermissionsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.User.TeamMemberPermissions> getPatchTeamMemberPermissionsMethod;
    if ((getPatchTeamMemberPermissionsMethod = UsersGrpc.getPatchTeamMemberPermissionsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getPatchTeamMemberPermissionsMethod = UsersGrpc.getPatchTeamMemberPermissionsMethod) == null) {
          UsersGrpc.getPatchTeamMemberPermissionsMethod = getPatchTeamMemberPermissionsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.TeamMemberPermissions, com.passkit.grpc.User.TeamMemberPermissions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "patchTeamMemberPermissions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.TeamMemberPermissions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.TeamMemberPermissions.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("patchTeamMemberPermissions"))
              .build();
        }
      }
    }
    return getPatchTeamMemberPermissionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.User.GetTeamMemberResponse> getGetTeamMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamMember",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.User.GetTeamMemberResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.User.GetTeamMemberResponse> getGetTeamMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.User.GetTeamMemberResponse> getGetTeamMemberMethod;
    if ((getGetTeamMemberMethod = UsersGrpc.getGetTeamMemberMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetTeamMemberMethod = UsersGrpc.getGetTeamMemberMethod) == null) {
          UsersGrpc.getGetTeamMemberMethod = getGetTeamMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.User.GetTeamMemberResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.GetTeamMemberResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getTeamMember"))
              .build();
        }
      }
    }
    return getGetTeamMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.ListTeamMembersResponse> getGetTeamMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamMembers",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.User.ListTeamMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.User.ListTeamMembersResponse> getGetTeamMembersMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.User.ListTeamMembersResponse> getGetTeamMembersMethod;
    if ((getGetTeamMembersMethod = UsersGrpc.getGetTeamMembersMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetTeamMembersMethod = UsersGrpc.getGetTeamMembersMethod) == null) {
          UsersGrpc.getGetTeamMembersMethod = getGetTeamMembersMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.User.ListTeamMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.ListTeamMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getTeamMembers"))
              .build();
        }
      }
    }
    return getGetTeamMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteTeamMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTeamMember",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteTeamMemberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteTeamMemberMethod;
    if ((getDeleteTeamMemberMethod = UsersGrpc.getDeleteTeamMemberMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getDeleteTeamMemberMethod = UsersGrpc.getDeleteTeamMemberMethod) == null) {
          UsersGrpc.getDeleteTeamMemberMethod = getDeleteTeamMemberMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTeamMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("deleteTeamMember"))
              .build();
        }
      }
    }
    return getDeleteTeamMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.User.AuditLogRequest,
      com.passkit.grpc.User.AuditLog> getGetTeamMemberLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTeamMemberLogs",
      requestType = com.passkit.grpc.User.AuditLogRequest.class,
      responseType = com.passkit.grpc.User.AuditLog.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.User.AuditLogRequest,
      com.passkit.grpc.User.AuditLog> getGetTeamMemberLogsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.User.AuditLogRequest, com.passkit.grpc.User.AuditLog> getGetTeamMemberLogsMethod;
    if ((getGetTeamMemberLogsMethod = UsersGrpc.getGetTeamMemberLogsMethod) == null) {
      synchronized (UsersGrpc.class) {
        if ((getGetTeamMemberLogsMethod = UsersGrpc.getGetTeamMemberLogsMethod) == null) {
          UsersGrpc.getGetTeamMemberLogsMethod = getGetTeamMemberLogsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.User.AuditLogRequest, com.passkit.grpc.User.AuditLog>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTeamMemberLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.AuditLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.User.AuditLog.getDefaultInstance()))
              .setSchemaDescriptor(new UsersMethodDescriptorSupplier("getTeamMemberLogs"))
              .build();
        }
      }
    }
    return getGetTeamMemberLogsMethod;
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
  public interface AsyncService {

    /**
     */
    default void createUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.NewUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    default void newUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getNewUserMethod(), responseObserver);
    }

    /**
     */
    default void verify(com.passkit.grpc.User.VerifyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyMethod(), responseObserver);
    }

    /**
     */
    default void resendVerificationEmail(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResendVerificationEmailMethod(), responseObserver);
    }

    /**
     */
    default void getUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetUserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    /**
     */
    default void login(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    default void get2faBarcode(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGet2faBarcodeMethod(), responseObserver);
    }

    /**
     */
    default void resetPassword(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    default void sendPasswordResetLink(com.passkit.grpc.User.Username request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendPasswordResetLinkMethod(), responseObserver);
    }

    /**
     */
    default void changePassword(com.passkit.grpc.User.PasswordResetInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangePasswordMethod(), responseObserver);
    }

    /**
     */
    default void changeEmail(com.passkit.grpc.User.Email request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeEmailMethod(), responseObserver);
    }

    /**
     */
    default void confirmEmailChange(com.passkit.grpc.User.ConfirmEmailChangeInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConfirmEmailChangeMethod(), responseObserver);
    }

    /**
     */
    default void updateCompanyName(com.passkit.grpc.User.CompanyName request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCompanyNameMethod(), responseObserver);
    }

    /**
     */
    default void getProjectsForUserQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsForUserQueryDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void getProjectsQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsQueryDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void getProjectsForUserQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsForUserQueryMethod(), responseObserver);
    }

    /**
     */
    default void getProjectsQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsQueryMethod(), responseObserver);
    }

    /**
     */
    default void getProjectByUuid(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectByUuidMethod(), responseObserver);
    }

    /**
     */
    default void getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectAndTemplateByShortCodeMethod(), responseObserver);
    }

    /**
     */
    default void getProjectsForUser(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsForUserMethod(), responseObserver);
    }

    /**
     */
    default void getProjects(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProjectsMethod(), responseObserver);
    }

    /**
     */
    default void getScannerConfig(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetScannerConfigMethod(), responseObserver);
    }

    /**
     */
    default void createScannerConfig(com.passkit.grpc.User.ScannerConfiguration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateScannerConfigMethod(), responseObserver);
    }

    /**
     */
    default void updateScannerConfig(com.passkit.grpc.User.ScannerConfiguration request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateScannerConfigMethod(), responseObserver);
    }

    /**
     * <pre>
     * Creates a new oauth2 resource, the returned id is NOT the access token used to make requests on the users behalf.
     * </pre>
     */
    default void createAuthorizationResource(com.passkit.grpc.User.OAuth2AuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthorizationResourceMethod(), responseObserver);
    }

    /**
     */
    default void deleteAuthorizationResource(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthorizationResourceMethod(), responseObserver);
    }

    /**
     */
    default void refreshApiSecret(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshApiSecretMethod(), responseObserver);
    }

    /**
     */
    default void deleteAccount(com.passkit.grpc.User.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccountMethod(), responseObserver);
    }

    /**
     */
    default void revokeLegacyCredentials(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRevokeLegacyCredentialsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Team Members
     * </pre>
     */
    default void createTeamMember(com.passkit.grpc.User.NewTeamMember request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTeamMemberMethod(), responseObserver);
    }

    /**
     */
    default void createPermissionsForTeamMember(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePermissionsForTeamMemberMethod(), responseObserver);
    }

    /**
     */
    default void updateTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTeamMemberPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void patchTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPatchTeamMemberPermissionsMethod(), responseObserver);
    }

    /**
     */
    default void getTeamMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetTeamMemberResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMemberMethod(), responseObserver);
    }

    /**
     */
    default void getTeamMembers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ListTeamMembersResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMembersMethod(), responseObserver);
    }

    /**
     */
    default void deleteTeamMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTeamMemberMethod(), responseObserver);
    }

    /**
     */
    default void getTeamMemberLogs(com.passkit.grpc.User.AuditLogRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.AuditLog> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTeamMemberLogsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Users.
   */
  public static abstract class UsersImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Users.
   */
  public static final class UsersStub
      extends io.grpc.stub.AbstractAsyncStub<UsersStub> {
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
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void newUser(com.passkit.grpc.User.NewUser request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verify(com.passkit.grpc.User.VerifyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resendVerificationEmail(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Boolean> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResendVerificationEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUser(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetUserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void login(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get2faBarcode(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGet2faBarcodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.passkit.grpc.User.Credentials request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendPasswordResetLink(com.passkit.grpc.User.Username request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendPasswordResetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changePassword(com.passkit.grpc.User.PasswordResetInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeEmail(com.passkit.grpc.User.Email request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void confirmEmailChange(com.passkit.grpc.User.ConfirmEmailChangeInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConfirmEmailChangeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCompanyName(com.passkit.grpc.User.CompanyName request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCompanyNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUserQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserQueryDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsQueryDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsQueryDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUserQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsQuery(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsQueryMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectByUuid(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectByUuidMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProjectAndTemplateByShortCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjectsForUser(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProjects(com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.ProjectOuterClass.Project> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetProjectsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getScannerConfig(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetScannerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createScannerConfig(com.passkit.grpc.User.ScannerConfiguration request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateScannerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateScannerConfig(com.passkit.grpc.User.ScannerConfiguration request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateScannerConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Creates a new oauth2 resource, the returned id is NOT the access token used to make requests on the users behalf.
     * </pre>
     */
    public void createAuthorizationResource(com.passkit.grpc.User.OAuth2AuthorizationRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthorizationResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthorizationResource(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthorizationResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshApiSecret(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshApiSecretMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccount(com.passkit.grpc.User.DeleteAccountRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void revokeLegacyCredentials(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRevokeLegacyCredentialsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Team Members
     * </pre>
     */
    public void createTeamMember(com.passkit.grpc.User.NewTeamMember request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTeamMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createPermissionsForTeamMember(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePermissionsForTeamMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTeamMemberPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPatchTeamMemberPermissionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetTeamMemberResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTeamMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamMembers(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.ListTeamMembersResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetTeamMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTeamMember(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTeamMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTeamMemberLogs(com.passkit.grpc.User.AuditLogRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.User.AuditLog> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetTeamMemberLogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Users.
   */
  public static final class UsersBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersBlockingStub> {
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
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.JWT newUser(com.passkit.grpc.User.NewUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getNewUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Boolean verify(com.passkit.grpc.User.VerifyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Boolean resendVerificationEmail(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResendVerificationEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.GetUserResponse getUser(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.JWT login(com.passkit.grpc.User.Credentials request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url get2faBarcode(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGet2faBarcodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty resetPassword(com.passkit.grpc.User.Credentials request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty sendPasswordResetLink(com.passkit.grpc.User.Username request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendPasswordResetLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty changePassword(com.passkit.grpc.User.PasswordResetInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangePasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty changeEmail(com.passkit.grpc.User.Email request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty confirmEmailChange(com.passkit.grpc.User.ConfirmEmailChangeInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConfirmEmailChangeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateCompanyName(com.passkit.grpc.User.CompanyName request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCompanyNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUserQueryDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserQueryDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsQueryDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsQueryDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUserQuery(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsQuery(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsQueryMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.ProjectOuterClass.Project getProjectByUuid(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectByUuidMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult getProjectAndTemplateByShortCode(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProjectAndTemplateByShortCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjectsForUser(
        com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.ProjectOuterClass.Project> getProjects(
        com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetProjectsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.ScannerConfiguration getScannerConfig(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetScannerConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty createScannerConfig(com.passkit.grpc.User.ScannerConfiguration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateScannerConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.ScannerConfiguration updateScannerConfig(com.passkit.grpc.User.ScannerConfiguration request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateScannerConfigMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Creates a new oauth2 resource, the returned id is NOT the access token used to make requests on the users behalf.
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id createAuthorizationResource(com.passkit.grpc.User.OAuth2AuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthorizationResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAuthorizationResource(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthorizationResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty refreshApiSecret(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshApiSecretMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteAccount(com.passkit.grpc.User.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty revokeLegacyCredentials(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRevokeLegacyCredentialsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Team Members
     * </pre>
     */
    public com.passkit.grpc.CommonObjects.Id createTeamMember(com.passkit.grpc.User.NewTeamMember request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTeamMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createPermissionsForTeamMember(com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePermissionsForTeamMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.TeamMemberPermissions updateTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTeamMemberPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.TeamMemberPermissions patchTeamMemberPermissions(com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPatchTeamMemberPermissionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.User.GetTeamMemberResponse getTeamMember(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTeamMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.User.ListTeamMembersResponse> getTeamMembers(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetTeamMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTeamMember(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTeamMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.User.AuditLog> getTeamMemberLogs(
        com.passkit.grpc.User.AuditLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetTeamMemberLogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Users.
   */
  public static final class UsersFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersFutureStub> {
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
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.JWT> newUser(
        com.passkit.grpc.User.NewUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getNewUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Boolean> verify(
        com.passkit.grpc.User.VerifyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Boolean> resendVerificationEmail(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResendVerificationEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.GetUserResponse> getUser(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.JWT> login(
        com.passkit.grpc.User.Credentials request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> get2faBarcode(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGet2faBarcodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> resetPassword(
        com.passkit.grpc.User.Credentials request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> sendPasswordResetLink(
        com.passkit.grpc.User.Username request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendPasswordResetLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changePassword(
        com.passkit.grpc.User.PasswordResetInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangePasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> changeEmail(
        com.passkit.grpc.User.Email request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> confirmEmailChange(
        com.passkit.grpc.User.ConfirmEmailChangeInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConfirmEmailChangeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateCompanyName(
        com.passkit.grpc.User.CompanyName request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCompanyNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.ProjectOuterClass.Project> getProjectByUuid(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectByUuidMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult> getProjectAndTemplateByShortCode(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProjectAndTemplateByShortCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.ScannerConfiguration> getScannerConfig(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetScannerConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createScannerConfig(
        com.passkit.grpc.User.ScannerConfiguration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateScannerConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.ScannerConfiguration> updateScannerConfig(
        com.passkit.grpc.User.ScannerConfiguration request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateScannerConfigMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Creates a new oauth2 resource, the returned id is NOT the access token used to make requests on the users behalf.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createAuthorizationResource(
        com.passkit.grpc.User.OAuth2AuthorizationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthorizationResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAuthorizationResource(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthorizationResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> refreshApiSecret(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshApiSecretMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteAccount(
        com.passkit.grpc.User.DeleteAccountRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> revokeLegacyCredentials(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRevokeLegacyCredentialsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Team Members
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createTeamMember(
        com.passkit.grpc.User.NewTeamMember request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTeamMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createPermissionsForTeamMember(
        com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePermissionsForTeamMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.TeamMemberPermissions> updateTeamMemberPermissions(
        com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTeamMemberPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.TeamMemberPermissions> patchTeamMemberPermissions(
        com.passkit.grpc.User.TeamMemberPermissions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPatchTeamMemberPermissionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.User.GetTeamMemberResponse> getTeamMember(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTeamMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTeamMember(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTeamMemberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_NEW_USER = 1;
  private static final int METHODID_VERIFY = 2;
  private static final int METHODID_RESEND_VERIFICATION_EMAIL = 3;
  private static final int METHODID_GET_USER = 4;
  private static final int METHODID_LOGIN = 5;
  private static final int METHODID_GET2FA_BARCODE = 6;
  private static final int METHODID_RESET_PASSWORD = 7;
  private static final int METHODID_SEND_PASSWORD_RESET_LINK = 8;
  private static final int METHODID_CHANGE_PASSWORD = 9;
  private static final int METHODID_CHANGE_EMAIL = 10;
  private static final int METHODID_CONFIRM_EMAIL_CHANGE = 11;
  private static final int METHODID_UPDATE_COMPANY_NAME = 12;
  private static final int METHODID_GET_PROJECTS_FOR_USER_QUERY_DEPRECATED = 13;
  private static final int METHODID_GET_PROJECTS_QUERY_DEPRECATED = 14;
  private static final int METHODID_GET_PROJECTS_FOR_USER_QUERY = 15;
  private static final int METHODID_GET_PROJECTS_QUERY = 16;
  private static final int METHODID_GET_PROJECT_BY_UUID = 17;
  private static final int METHODID_GET_PROJECT_AND_TEMPLATE_BY_SHORT_CODE = 18;
  private static final int METHODID_GET_PROJECTS_FOR_USER = 19;
  private static final int METHODID_GET_PROJECTS = 20;
  private static final int METHODID_GET_SCANNER_CONFIG = 21;
  private static final int METHODID_CREATE_SCANNER_CONFIG = 22;
  private static final int METHODID_UPDATE_SCANNER_CONFIG = 23;
  private static final int METHODID_CREATE_AUTHORIZATION_RESOURCE = 24;
  private static final int METHODID_DELETE_AUTHORIZATION_RESOURCE = 25;
  private static final int METHODID_REFRESH_API_SECRET = 26;
  private static final int METHODID_DELETE_ACCOUNT = 27;
  private static final int METHODID_REVOKE_LEGACY_CREDENTIALS = 28;
  private static final int METHODID_CREATE_TEAM_MEMBER = 29;
  private static final int METHODID_CREATE_PERMISSIONS_FOR_TEAM_MEMBER = 30;
  private static final int METHODID_UPDATE_TEAM_MEMBER_PERMISSIONS = 31;
  private static final int METHODID_PATCH_TEAM_MEMBER_PERMISSIONS = 32;
  private static final int METHODID_GET_TEAM_MEMBER = 33;
  private static final int METHODID_GET_TEAM_MEMBERS = 34;
  private static final int METHODID_DELETE_TEAM_MEMBER = 35;
  private static final int METHODID_GET_TEAM_MEMBER_LOGS = 36;

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
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.passkit.grpc.User.NewUser) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.NewUserResponse>) responseObserver);
          break;
        case METHODID_NEW_USER:
          serviceImpl.newUser((com.passkit.grpc.User.NewUser) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.JWT>) responseObserver);
          break;
        case METHODID_VERIFY:
          serviceImpl.verify((com.passkit.grpc.User.VerifyRequest) request,
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
        case METHODID_GET2FA_BARCODE:
          serviceImpl.get2faBarcode((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
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
        case METHODID_CHANGE_EMAIL:
          serviceImpl.changeEmail((com.passkit.grpc.User.Email) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CONFIRM_EMAIL_CHANGE:
          serviceImpl.confirmEmailChange((com.passkit.grpc.User.ConfirmEmailChangeInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_COMPANY_NAME:
          serviceImpl.updateCompanyName((com.passkit.grpc.User.CompanyName) request,
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
        case METHODID_GET_SCANNER_CONFIG:
          serviceImpl.getScannerConfig((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration>) responseObserver);
          break;
        case METHODID_CREATE_SCANNER_CONFIG:
          serviceImpl.createScannerConfig((com.passkit.grpc.User.ScannerConfiguration) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_UPDATE_SCANNER_CONFIG:
          serviceImpl.updateScannerConfig((com.passkit.grpc.User.ScannerConfiguration) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.ScannerConfiguration>) responseObserver);
          break;
        case METHODID_CREATE_AUTHORIZATION_RESOURCE:
          serviceImpl.createAuthorizationResource((com.passkit.grpc.User.OAuth2AuthorizationRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_AUTHORIZATION_RESOURCE:
          serviceImpl.deleteAuthorizationResource((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REFRESH_API_SECRET:
          serviceImpl.refreshApiSecret((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_ACCOUNT:
          serviceImpl.deleteAccount((com.passkit.grpc.User.DeleteAccountRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REVOKE_LEGACY_CREDENTIALS:
          serviceImpl.revokeLegacyCredentials((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_TEAM_MEMBER:
          serviceImpl.createTeamMember((com.passkit.grpc.User.NewTeamMember) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_CREATE_PERMISSIONS_FOR_TEAM_MEMBER:
          serviceImpl.createPermissionsForTeamMember((com.passkit.grpc.User.TeamMemberPermissions) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_TEAM_MEMBER_PERMISSIONS:
          serviceImpl.updateTeamMemberPermissions((com.passkit.grpc.User.TeamMemberPermissions) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions>) responseObserver);
          break;
        case METHODID_PATCH_TEAM_MEMBER_PERMISSIONS:
          serviceImpl.patchTeamMemberPermissions((com.passkit.grpc.User.TeamMemberPermissions) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.TeamMemberPermissions>) responseObserver);
          break;
        case METHODID_GET_TEAM_MEMBER:
          serviceImpl.getTeamMember((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.GetTeamMemberResponse>) responseObserver);
          break;
        case METHODID_GET_TEAM_MEMBERS:
          serviceImpl.getTeamMembers((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.ListTeamMembersResponse>) responseObserver);
          break;
        case METHODID_DELETE_TEAM_MEMBER:
          serviceImpl.deleteTeamMember((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_TEAM_MEMBER_LOGS:
          serviceImpl.getTeamMemberLogs((com.passkit.grpc.User.AuditLogRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.User.AuditLog>) responseObserver);
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
          getCreateUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.NewUser,
              com.passkit.grpc.User.NewUserResponse>(
                service, METHODID_CREATE_USER)))
        .addMethod(
          getNewUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.NewUser,
              com.passkit.grpc.User.JWT>(
                service, METHODID_NEW_USER)))
        .addMethod(
          getVerifyMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.VerifyRequest,
              com.passkit.grpc.CommonObjects.Boolean>(
                service, METHODID_VERIFY)))
        .addMethod(
          getResendVerificationEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.CommonObjects.Boolean>(
                service, METHODID_RESEND_VERIFICATION_EMAIL)))
        .addMethod(
          getGetUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.User.GetUserResponse>(
                service, METHODID_GET_USER)))
        .addMethod(
          getLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.Credentials,
              com.passkit.grpc.User.JWT>(
                service, METHODID_LOGIN)))
        .addMethod(
          getGet2faBarcodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET2FA_BARCODE)))
        .addMethod(
          getResetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.Credentials,
              com.google.protobuf.Empty>(
                service, METHODID_RESET_PASSWORD)))
        .addMethod(
          getSendPasswordResetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.Username,
              com.google.protobuf.Empty>(
                service, METHODID_SEND_PASSWORD_RESET_LINK)))
        .addMethod(
          getChangePasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.PasswordResetInput,
              com.google.protobuf.Empty>(
                service, METHODID_CHANGE_PASSWORD)))
        .addMethod(
          getChangeEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.Email,
              com.google.protobuf.Empty>(
                service, METHODID_CHANGE_EMAIL)))
        .addMethod(
          getConfirmEmailChangeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.ConfirmEmailChangeInput,
              com.google.protobuf.Empty>(
                service, METHODID_CONFIRM_EMAIL_CHANGE)))
        .addMethod(
          getUpdateCompanyNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.CompanyName,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_COMPANY_NAME)))
        .addMethod(
          getGetProjectsForUserQueryDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS_FOR_USER_QUERY_DEPRECATED)))
        .addMethod(
          getGetProjectsQueryDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS_QUERY_DEPRECATED)))
        .addMethod(
          getGetProjectsForUserQueryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS_FOR_USER_QUERY)))
        .addMethod(
          getGetProjectsQueryMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS_QUERY)))
        .addMethod(
          getGetProjectByUuidMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECT_BY_UUID)))
        .addMethod(
          getGetProjectAndTemplateByShortCodeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.ProjectOuterClass.ProjectByShortCodeResult>(
                service, METHODID_GET_PROJECT_AND_TEMPLATE_BY_SHORT_CODE)))
        .addMethod(
          getGetProjectsForUserMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS_FOR_USER)))
        .addMethod(
          getGetProjectsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.ProjectOuterClass.ProjectStatusFilter,
              com.passkit.grpc.ProjectOuterClass.Project>(
                service, METHODID_GET_PROJECTS)))
        .addMethod(
          getGetScannerConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.User.ScannerConfiguration>(
                service, METHODID_GET_SCANNER_CONFIG)))
        .addMethod(
          getCreateScannerConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.ScannerConfiguration,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_SCANNER_CONFIG)))
        .addMethod(
          getUpdateScannerConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.ScannerConfiguration,
              com.passkit.grpc.User.ScannerConfiguration>(
                service, METHODID_UPDATE_SCANNER_CONFIG)))
        .addMethod(
          getCreateAuthorizationResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.OAuth2AuthorizationRequest,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_AUTHORIZATION_RESOURCE)))
        .addMethod(
          getDeleteAuthorizationResourceMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_AUTHORIZATION_RESOURCE)))
        .addMethod(
          getRefreshApiSecretMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_REFRESH_API_SECRET)))
        .addMethod(
          getDeleteAccountMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.DeleteAccountRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_ACCOUNT)))
        .addMethod(
          getRevokeLegacyCredentialsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.google.protobuf.Empty>(
                service, METHODID_REVOKE_LEGACY_CREDENTIALS)))
        .addMethod(
          getCreateTeamMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.NewTeamMember,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_TEAM_MEMBER)))
        .addMethod(
          getCreatePermissionsForTeamMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.TeamMemberPermissions,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_PERMISSIONS_FOR_TEAM_MEMBER)))
        .addMethod(
          getUpdateTeamMemberPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.TeamMemberPermissions,
              com.passkit.grpc.User.TeamMemberPermissions>(
                service, METHODID_UPDATE_TEAM_MEMBER_PERMISSIONS)))
        .addMethod(
          getPatchTeamMemberPermissionsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.User.TeamMemberPermissions,
              com.passkit.grpc.User.TeamMemberPermissions>(
                service, METHODID_PATCH_TEAM_MEMBER_PERMISSIONS)))
        .addMethod(
          getGetTeamMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.User.GetTeamMemberResponse>(
                service, METHODID_GET_TEAM_MEMBER)))
        .addMethod(
          getGetTeamMembersMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.User.ListTeamMembersResponse>(
                service, METHODID_GET_TEAM_MEMBERS)))
        .addMethod(
          getDeleteTeamMemberMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TEAM_MEMBER)))
        .addMethod(
          getGetTeamMemberLogsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.User.AuditLogRequest,
              com.passkit.grpc.User.AuditLog>(
                service, METHODID_GET_TEAM_MEMBER_LOGS)))
        .build();
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
    private final java.lang.String methodName;

    UsersMethodDescriptorSupplier(java.lang.String methodName) {
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
              .addMethod(getGet2faBarcodeMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getSendPasswordResetLinkMethod())
              .addMethod(getChangePasswordMethod())
              .addMethod(getChangeEmailMethod())
              .addMethod(getConfirmEmailChangeMethod())
              .addMethod(getUpdateCompanyNameMethod())
              .addMethod(getGetProjectsForUserQueryDeprecatedMethod())
              .addMethod(getGetProjectsQueryDeprecatedMethod())
              .addMethod(getGetProjectsForUserQueryMethod())
              .addMethod(getGetProjectsQueryMethod())
              .addMethod(getGetProjectByUuidMethod())
              .addMethod(getGetProjectAndTemplateByShortCodeMethod())
              .addMethod(getGetProjectsForUserMethod())
              .addMethod(getGetProjectsMethod())
              .addMethod(getGetScannerConfigMethod())
              .addMethod(getCreateScannerConfigMethod())
              .addMethod(getUpdateScannerConfigMethod())
              .addMethod(getCreateAuthorizationResourceMethod())
              .addMethod(getDeleteAuthorizationResourceMethod())
              .addMethod(getRefreshApiSecretMethod())
              .addMethod(getDeleteAccountMethod())
              .addMethod(getRevokeLegacyCredentialsMethod())
              .addMethod(getCreateTeamMemberMethod())
              .addMethod(getCreatePermissionsForTeamMemberMethod())
              .addMethod(getUpdateTeamMemberPermissionsMethod())
              .addMethod(getPatchTeamMemberPermissionsMethod())
              .addMethod(getGetTeamMemberMethod())
              .addMethod(getGetTeamMembersMethod())
              .addMethod(getDeleteTeamMemberMethod())
              .addMethod(getGetTeamMemberLogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
