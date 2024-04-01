package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/core/a_rpc_templates.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TemplatesGrpc {

  private TemplatesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.Templates";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate,
      com.passkit.grpc.CommonObjects.Id> getCreateTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTemplate",
      requestType = com.passkit.grpc.Template.PassTemplate.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate,
      com.passkit.grpc.CommonObjects.Id> getCreateTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate, com.passkit.grpc.CommonObjects.Id> getCreateTemplateMethod;
    if ((getCreateTemplateMethod = TemplatesGrpc.getCreateTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCreateTemplateMethod = TemplatesGrpc.getCreateTemplateMethod) == null) {
          TemplatesGrpc.getCreateTemplateMethod = getCreateTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.PassTemplate, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("createTemplate"))
              .build();
        }
      }
    }
    return getCreateTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate,
      com.passkit.grpc.Template.PassTemplate> getUpdateTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTemplate",
      requestType = com.passkit.grpc.Template.PassTemplate.class,
      responseType = com.passkit.grpc.Template.PassTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate,
      com.passkit.grpc.Template.PassTemplate> getUpdateTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.PassTemplate, com.passkit.grpc.Template.PassTemplate> getUpdateTemplateMethod;
    if ((getUpdateTemplateMethod = TemplatesGrpc.getUpdateTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getUpdateTemplateMethod = TemplatesGrpc.getUpdateTemplateMethod) == null) {
          TemplatesGrpc.getUpdateTemplateMethod = getUpdateTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.PassTemplate, com.passkit.grpc.Template.PassTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplate.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplate.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("updateTemplate"))
              .build();
        }
      }
    }
    return getUpdateTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Template.PassTemplateResponse> getGetTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTemplate",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Template.PassTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Template.PassTemplateResponse> getGetTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Template.PassTemplateResponse> getGetTemplateMethod;
    if ((getGetTemplateMethod = TemplatesGrpc.getGetTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getGetTemplateMethod = TemplatesGrpc.getGetTemplateMethod) == null) {
          TemplatesGrpc.getGetTemplateMethod = getGetTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Template.PassTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("getTemplate"))
              .build();
        }
      }
    }
    return getGetTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.DefaultTemplateRequest,
      com.passkit.grpc.Template.PassTemplate> getGetDefaultTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDefaultTemplate",
      requestType = com.passkit.grpc.Template.DefaultTemplateRequest.class,
      responseType = com.passkit.grpc.Template.PassTemplate.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.DefaultTemplateRequest,
      com.passkit.grpc.Template.PassTemplate> getGetDefaultTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.DefaultTemplateRequest, com.passkit.grpc.Template.PassTemplate> getGetDefaultTemplateMethod;
    if ((getGetDefaultTemplateMethod = TemplatesGrpc.getGetDefaultTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getGetDefaultTemplateMethod = TemplatesGrpc.getGetDefaultTemplateMethod) == null) {
          TemplatesGrpc.getGetDefaultTemplateMethod = getGetDefaultTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.DefaultTemplateRequest, com.passkit.grpc.Template.PassTemplate>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getDefaultTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.DefaultTemplateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplate.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("getDefaultTemplate"))
              .build();
        }
      }
    }
    return getGetDefaultTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyTemplate",
      requestType = com.passkit.grpc.Template.CopyObjectInput.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id> getCopyTemplateMethod;
    if ((getCopyTemplateMethod = TemplatesGrpc.getCopyTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCopyTemplateMethod = TemplatesGrpc.getCopyTemplateMethod) == null) {
          TemplatesGrpc.getCopyTemplateMethod = getCopyTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.CopyObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("copyTemplate"))
              .build();
        }
      }
    }
    return getCopyTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteTemplateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTemplate",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteTemplateMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteTemplateMethod;
    if ((getDeleteTemplateMethod = TemplatesGrpc.getDeleteTemplateMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getDeleteTemplateMethod = TemplatesGrpc.getDeleteTemplateMethod) == null) {
          TemplatesGrpc.getDeleteTemplateMethod = getDeleteTemplateMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteTemplate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("deleteTemplate"))
              .build();
        }
      }
    }
    return getDeleteTemplateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTemplatesForUserDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Template.PassTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserDeprecatedMethod;
    if ((getListTemplatesForUserDeprecatedMethod = TemplatesGrpc.getListTemplatesForUserDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListTemplatesForUserDeprecatedMethod = TemplatesGrpc.getListTemplatesForUserDeprecatedMethod) == null) {
          TemplatesGrpc.getListTemplatesForUserDeprecatedMethod = getListTemplatesForUserDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Template.PassTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTemplatesForUserDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listTemplatesForUserDeprecated"))
              .build();
        }
      }
    }
    return getListTemplatesForUserDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTemplatesForUser",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Template.PassTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesForUserMethod;
    if ((getListTemplatesForUserMethod = TemplatesGrpc.getListTemplatesForUserMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListTemplatesForUserMethod = TemplatesGrpc.getListTemplatesForUserMethod) == null) {
          TemplatesGrpc.getListTemplatesForUserMethod = getListTemplatesForUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Template.PassTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTemplatesForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listTemplatesForUser"))
              .build();
        }
      }
    }
    return getListTemplatesForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTemplatesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Template.PassTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesDeprecatedMethod;
    if ((getListTemplatesDeprecatedMethod = TemplatesGrpc.getListTemplatesDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListTemplatesDeprecatedMethod = TemplatesGrpc.getListTemplatesDeprecatedMethod) == null) {
          TemplatesGrpc.getListTemplatesDeprecatedMethod = getListTemplatesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Template.PassTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTemplatesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listTemplatesDeprecated"))
              .build();
        }
      }
    }
    return getListTemplatesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTemplates",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Template.PassTemplateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Template.PassTemplateResponse> getListTemplatesMethod;
    if ((getListTemplatesMethod = TemplatesGrpc.getListTemplatesMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListTemplatesMethod = TemplatesGrpc.getListTemplatesMethod) == null) {
          TemplatesGrpc.getListTemplatesMethod = getListTemplatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Template.PassTemplateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.PassTemplateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listTemplates"))
              .build();
        }
      }
    }
    return getListTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTemplatesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountTemplatesDeprecatedMethod;
    if ((getCountTemplatesDeprecatedMethod = TemplatesGrpc.getCountTemplatesDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountTemplatesDeprecatedMethod = TemplatesGrpc.getCountTemplatesDeprecatedMethod) == null) {
          TemplatesGrpc.getCountTemplatesDeprecatedMethod = getCountTemplatesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countTemplatesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countTemplatesDeprecated"))
              .build();
        }
      }
    }
    return getCountTemplatesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTemplates",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountTemplatesMethod;
    if ((getCountTemplatesMethod = TemplatesGrpc.getCountTemplatesMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountTemplatesMethod = TemplatesGrpc.getCountTemplatesMethod) == null) {
          TemplatesGrpc.getCountTemplatesMethod = getCountTemplatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countTemplates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countTemplates"))
              .build();
        }
      }
    }
    return getCountTemplatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTemplatesForUserDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserDeprecatedMethod;
    if ((getCountTemplatesForUserDeprecatedMethod = TemplatesGrpc.getCountTemplatesForUserDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountTemplatesForUserDeprecatedMethod = TemplatesGrpc.getCountTemplatesForUserDeprecatedMethod) == null) {
          TemplatesGrpc.getCountTemplatesForUserDeprecatedMethod = getCountTemplatesForUserDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countTemplatesForUserDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countTemplatesForUserDeprecated"))
              .build();
        }
      }
    }
    return getCountTemplatesForUserDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTemplatesForUser",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountTemplatesForUserMethod;
    if ((getCountTemplatesForUserMethod = TemplatesGrpc.getCountTemplatesForUserMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountTemplatesForUserMethod = TemplatesGrpc.getCountTemplatesForUserMethod) == null) {
          TemplatesGrpc.getCountTemplatesForUserMethod = getCountTemplatesForUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countTemplatesForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countTemplatesForUser"))
              .build();
        }
      }
    }
    return getCountTemplatesForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation,
      com.passkit.grpc.CommonObjects.Id> getCreateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createLocation",
      requestType = com.passkit.grpc.Proximity.GPSLocation.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation,
      com.passkit.grpc.CommonObjects.Id> getCreateLocationMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation, com.passkit.grpc.CommonObjects.Id> getCreateLocationMethod;
    if ((getCreateLocationMethod = TemplatesGrpc.getCreateLocationMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCreateLocationMethod = TemplatesGrpc.getCreateLocationMethod) == null) {
          TemplatesGrpc.getCreateLocationMethod = getCreateLocationMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Proximity.GPSLocation, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("createLocation"))
              .build();
        }
      }
    }
    return getCreateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation,
      com.passkit.grpc.Proximity.GPSLocation> getUpdateLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLocation",
      requestType = com.passkit.grpc.Proximity.GPSLocation.class,
      responseType = com.passkit.grpc.Proximity.GPSLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation,
      com.passkit.grpc.Proximity.GPSLocation> getUpdateLocationMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.GPSLocation, com.passkit.grpc.Proximity.GPSLocation> getUpdateLocationMethod;
    if ((getUpdateLocationMethod = TemplatesGrpc.getUpdateLocationMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getUpdateLocationMethod = TemplatesGrpc.getUpdateLocationMethod) == null) {
          TemplatesGrpc.getUpdateLocationMethod = getUpdateLocationMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Proximity.GPSLocation, com.passkit.grpc.Proximity.GPSLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("updateLocation"))
              .build();
        }
      }
    }
    return getUpdateLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Proximity.GPSLocation> getGetLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocation",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Proximity.GPSLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Proximity.GPSLocation> getGetLocationMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Proximity.GPSLocation> getGetLocationMethod;
    if ((getGetLocationMethod = TemplatesGrpc.getGetLocationMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getGetLocationMethod = TemplatesGrpc.getGetLocationMethod) == null) {
          TemplatesGrpc.getGetLocationMethod = getGetLocationMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Proximity.GPSLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("getLocation"))
              .build();
        }
      }
    }
    return getGetLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Proximity.GPSLocation> getListLocationsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listLocationsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Proximity.GPSLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Proximity.GPSLocation> getListLocationsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Proximity.GPSLocation> getListLocationsDeprecatedMethod;
    if ((getListLocationsDeprecatedMethod = TemplatesGrpc.getListLocationsDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListLocationsDeprecatedMethod = TemplatesGrpc.getListLocationsDeprecatedMethod) == null) {
          TemplatesGrpc.getListLocationsDeprecatedMethod = getListLocationsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Proximity.GPSLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listLocationsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listLocationsDeprecated"))
              .build();
        }
      }
    }
    return getListLocationsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Proximity.GPSLocation> getListLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listLocations",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Proximity.GPSLocation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Proximity.GPSLocation> getListLocationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Proximity.GPSLocation> getListLocationsMethod;
    if ((getListLocationsMethod = TemplatesGrpc.getListLocationsMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListLocationsMethod = TemplatesGrpc.getListLocationsMethod) == null) {
          TemplatesGrpc.getListLocationsMethod = getListLocationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Proximity.GPSLocation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.GPSLocation.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listLocations"))
              .build();
        }
      }
    }
    return getListLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyLocation",
      requestType = com.passkit.grpc.Template.CopyObjectInput.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyLocationMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id> getCopyLocationMethod;
    if ((getCopyLocationMethod = TemplatesGrpc.getCopyLocationMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCopyLocationMethod = TemplatesGrpc.getCopyLocationMethod) == null) {
          TemplatesGrpc.getCopyLocationMethod = getCopyLocationMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.CopyObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("copyLocation"))
              .build();
        }
      }
    }
    return getCopyLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLocation",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteLocationMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteLocationMethod;
    if ((getDeleteLocationMethod = TemplatesGrpc.getDeleteLocationMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getDeleteLocationMethod = TemplatesGrpc.getDeleteLocationMethod) == null) {
          TemplatesGrpc.getDeleteLocationMethod = getDeleteLocationMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("deleteLocation"))
              .build();
        }
      }
    }
    return getDeleteLocationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountLocationsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countLocationsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountLocationsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountLocationsDeprecatedMethod;
    if ((getCountLocationsDeprecatedMethod = TemplatesGrpc.getCountLocationsDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountLocationsDeprecatedMethod = TemplatesGrpc.getCountLocationsDeprecatedMethod) == null) {
          TemplatesGrpc.getCountLocationsDeprecatedMethod = getCountLocationsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countLocationsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countLocationsDeprecated"))
              .build();
        }
      }
    }
    return getCountLocationsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountLocationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countLocations",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountLocationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountLocationsMethod;
    if ((getCountLocationsMethod = TemplatesGrpc.getCountLocationsMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountLocationsMethod = TemplatesGrpc.getCountLocationsMethod) == null) {
          TemplatesGrpc.getCountLocationsMethod = getCountLocationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countLocations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countLocations"))
              .build();
        }
      }
    }
    return getCountLocationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon,
      com.passkit.grpc.CommonObjects.Id> getCreateBeaconMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createBeacon",
      requestType = com.passkit.grpc.Proximity.Beacon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon,
      com.passkit.grpc.CommonObjects.Id> getCreateBeaconMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon, com.passkit.grpc.CommonObjects.Id> getCreateBeaconMethod;
    if ((getCreateBeaconMethod = TemplatesGrpc.getCreateBeaconMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCreateBeaconMethod = TemplatesGrpc.getCreateBeaconMethod) == null) {
          TemplatesGrpc.getCreateBeaconMethod = getCreateBeaconMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Proximity.Beacon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createBeacon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("createBeacon"))
              .build();
        }
      }
    }
    return getCreateBeaconMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon,
      com.passkit.grpc.Proximity.Beacon> getUpdateBeaconMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBeacon",
      requestType = com.passkit.grpc.Proximity.Beacon.class,
      responseType = com.passkit.grpc.Proximity.Beacon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon,
      com.passkit.grpc.Proximity.Beacon> getUpdateBeaconMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Proximity.Beacon, com.passkit.grpc.Proximity.Beacon> getUpdateBeaconMethod;
    if ((getUpdateBeaconMethod = TemplatesGrpc.getUpdateBeaconMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getUpdateBeaconMethod = TemplatesGrpc.getUpdateBeaconMethod) == null) {
          TemplatesGrpc.getUpdateBeaconMethod = getUpdateBeaconMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Proximity.Beacon, com.passkit.grpc.Proximity.Beacon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateBeacon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("updateBeacon"))
              .build();
        }
      }
    }
    return getUpdateBeaconMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Proximity.Beacon> getGetBeaconMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBeacon",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Proximity.Beacon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Proximity.Beacon> getGetBeaconMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Proximity.Beacon> getGetBeaconMethod;
    if ((getGetBeaconMethod = TemplatesGrpc.getGetBeaconMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getGetBeaconMethod = TemplatesGrpc.getGetBeaconMethod) == null) {
          TemplatesGrpc.getGetBeaconMethod = getGetBeaconMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Proximity.Beacon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBeacon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("getBeacon"))
              .build();
        }
      }
    }
    return getGetBeaconMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Proximity.Beacon> getListBeaconsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listBeaconsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Proximity.Beacon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Proximity.Beacon> getListBeaconsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Proximity.Beacon> getListBeaconsDeprecatedMethod;
    if ((getListBeaconsDeprecatedMethod = TemplatesGrpc.getListBeaconsDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListBeaconsDeprecatedMethod = TemplatesGrpc.getListBeaconsDeprecatedMethod) == null) {
          TemplatesGrpc.getListBeaconsDeprecatedMethod = getListBeaconsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Proximity.Beacon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listBeaconsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listBeaconsDeprecated"))
              .build();
        }
      }
    }
    return getListBeaconsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Proximity.Beacon> getListBeaconsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listBeacons",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Proximity.Beacon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Proximity.Beacon> getListBeaconsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Proximity.Beacon> getListBeaconsMethod;
    if ((getListBeaconsMethod = TemplatesGrpc.getListBeaconsMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListBeaconsMethod = TemplatesGrpc.getListBeaconsMethod) == null) {
          TemplatesGrpc.getListBeaconsMethod = getListBeaconsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Proximity.Beacon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listBeacons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Proximity.Beacon.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listBeacons"))
              .build();
        }
      }
    }
    return getListBeaconsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyBeaconMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyBeacon",
      requestType = com.passkit.grpc.Template.CopyObjectInput.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyBeaconMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id> getCopyBeaconMethod;
    if ((getCopyBeaconMethod = TemplatesGrpc.getCopyBeaconMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCopyBeaconMethod = TemplatesGrpc.getCopyBeaconMethod) == null) {
          TemplatesGrpc.getCopyBeaconMethod = getCopyBeaconMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyBeacon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.CopyObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("copyBeacon"))
              .build();
        }
      }
    }
    return getCopyBeaconMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteBeaconMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBeacon",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteBeaconMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteBeaconMethod;
    if ((getDeleteBeaconMethod = TemplatesGrpc.getDeleteBeaconMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getDeleteBeaconMethod = TemplatesGrpc.getDeleteBeaconMethod) == null) {
          TemplatesGrpc.getDeleteBeaconMethod = getDeleteBeaconMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBeacon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("deleteBeacon"))
              .build();
        }
      }
    }
    return getDeleteBeaconMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountBeaconsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countBeaconsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountBeaconsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountBeaconsDeprecatedMethod;
    if ((getCountBeaconsDeprecatedMethod = TemplatesGrpc.getCountBeaconsDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountBeaconsDeprecatedMethod = TemplatesGrpc.getCountBeaconsDeprecatedMethod) == null) {
          TemplatesGrpc.getCountBeaconsDeprecatedMethod = getCountBeaconsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countBeaconsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countBeaconsDeprecated"))
              .build();
        }
      }
    }
    return getCountBeaconsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountBeaconsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countBeacons",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountBeaconsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountBeaconsMethod;
    if ((getCountBeaconsMethod = TemplatesGrpc.getCountBeaconsMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountBeaconsMethod = TemplatesGrpc.getCountBeaconsMethod) == null) {
          TemplatesGrpc.getCountBeaconsMethod = getCountBeaconsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countBeacons"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countBeacons"))
              .build();
        }
      }
    }
    return getCountBeaconsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link,
      com.passkit.grpc.CommonObjects.Id> getCreateLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createLink",
      requestType = com.passkit.grpc.Links.Link.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link,
      com.passkit.grpc.CommonObjects.Id> getCreateLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link, com.passkit.grpc.CommonObjects.Id> getCreateLinkMethod;
    if ((getCreateLinkMethod = TemplatesGrpc.getCreateLinkMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCreateLinkMethod = TemplatesGrpc.getCreateLinkMethod) == null) {
          TemplatesGrpc.getCreateLinkMethod = getCreateLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Links.Link, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("createLink"))
              .build();
        }
      }
    }
    return getCreateLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link,
      com.passkit.grpc.Links.Link> getUpdateLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateLink",
      requestType = com.passkit.grpc.Links.Link.class,
      responseType = com.passkit.grpc.Links.Link.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link,
      com.passkit.grpc.Links.Link> getUpdateLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Links.Link, com.passkit.grpc.Links.Link> getUpdateLinkMethod;
    if ((getUpdateLinkMethod = TemplatesGrpc.getUpdateLinkMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getUpdateLinkMethod = TemplatesGrpc.getUpdateLinkMethod) == null) {
          TemplatesGrpc.getUpdateLinkMethod = getUpdateLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Links.Link, com.passkit.grpc.Links.Link>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("updateLink"))
              .build();
        }
      }
    }
    return getUpdateLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Links.Link> getGetLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLink",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Links.Link.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Links.Link> getGetLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Links.Link> getGetLinkMethod;
    if ((getGetLinkMethod = TemplatesGrpc.getGetLinkMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getGetLinkMethod = TemplatesGrpc.getGetLinkMethod) == null) {
          TemplatesGrpc.getGetLinkMethod = getGetLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Links.Link>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("getLink"))
              .build();
        }
      }
    }
    return getGetLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Links.Link> getListLinksDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listLinksDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Links.Link.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Links.Link> getListLinksDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Links.Link> getListLinksDeprecatedMethod;
    if ((getListLinksDeprecatedMethod = TemplatesGrpc.getListLinksDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListLinksDeprecatedMethod = TemplatesGrpc.getListLinksDeprecatedMethod) == null) {
          TemplatesGrpc.getListLinksDeprecatedMethod = getListLinksDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Links.Link>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listLinksDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listLinksDeprecated"))
              .build();
        }
      }
    }
    return getListLinksDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Links.Link> getListLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listLinks",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Links.Link.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Links.Link> getListLinksMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Links.Link> getListLinksMethod;
    if ((getListLinksMethod = TemplatesGrpc.getListLinksMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getListLinksMethod = TemplatesGrpc.getListLinksMethod) == null) {
          TemplatesGrpc.getListLinksMethod = getListLinksMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Links.Link>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Links.Link.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("listLinks"))
              .build();
        }
      }
    }
    return getListLinksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyLink",
      requestType = com.passkit.grpc.Template.CopyObjectInput.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput,
      com.passkit.grpc.CommonObjects.Id> getCopyLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id> getCopyLinkMethod;
    if ((getCopyLinkMethod = TemplatesGrpc.getCopyLinkMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCopyLinkMethod = TemplatesGrpc.getCopyLinkMethod) == null) {
          TemplatesGrpc.getCopyLinkMethod = getCopyLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Template.CopyObjectInput, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Template.CopyObjectInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("copyLink"))
              .build();
        }
      }
    }
    return getCopyLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteLinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLink",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteLinkMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteLinkMethod;
    if ((getDeleteLinkMethod = TemplatesGrpc.getDeleteLinkMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getDeleteLinkMethod = TemplatesGrpc.getDeleteLinkMethod) == null) {
          TemplatesGrpc.getDeleteLinkMethod = getDeleteLinkMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("deleteLink"))
              .build();
        }
      }
    }
    return getDeleteLinkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountLinksDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countLinksDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountLinksDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountLinksDeprecatedMethod;
    if ((getCountLinksDeprecatedMethod = TemplatesGrpc.getCountLinksDeprecatedMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountLinksDeprecatedMethod = TemplatesGrpc.getCountLinksDeprecatedMethod) == null) {
          TemplatesGrpc.getCountLinksDeprecatedMethod = getCountLinksDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countLinksDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countLinksDeprecated"))
              .build();
        }
      }
    }
    return getCountLinksDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountLinksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countLinks",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountLinksMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountLinksMethod;
    if ((getCountLinksMethod = TemplatesGrpc.getCountLinksMethod) == null) {
      synchronized (TemplatesGrpc.class) {
        if ((getCountLinksMethod = TemplatesGrpc.getCountLinksMethod) == null) {
          TemplatesGrpc.getCountLinksMethod = getCountLinksMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countLinks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new TemplatesMethodDescriptorSupplier("countLinks"))
              .build();
        }
      }
    }
    return getCountLinksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TemplatesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemplatesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemplatesStub>() {
        @java.lang.Override
        public TemplatesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemplatesStub(channel, callOptions);
        }
      };
    return TemplatesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TemplatesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemplatesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemplatesBlockingStub>() {
        @java.lang.Override
        public TemplatesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemplatesBlockingStub(channel, callOptions);
        }
      };
    return TemplatesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TemplatesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TemplatesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TemplatesFutureStub>() {
        @java.lang.Override
        public TemplatesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TemplatesFutureStub(channel, callOptions);
        }
      };
    return TemplatesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createTemplate(com.passkit.grpc.Template.PassTemplate request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTemplateMethod(), responseObserver);
    }

    /**
     */
    default void updateTemplate(com.passkit.grpc.Template.PassTemplate request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getTemplate(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTemplateMethod(), responseObserver);
    }

    /**
     */
    default void getDefaultTemplate(com.passkit.grpc.Template.DefaultTemplateRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetDefaultTemplateMethod(), responseObserver);
    }

    /**
     */
    default void copyTemplate(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyTemplateMethod(), responseObserver);
    }

    /**
     */
    default void deleteTemplate(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTemplateMethod(), responseObserver);
    }

    /**
     */
    default void listTemplatesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplatesForUserDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listTemplatesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplatesForUserMethod(), responseObserver);
    }

    /**
     */
    default void listTemplatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplatesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listTemplates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void countTemplatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountTemplatesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countTemplates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountTemplatesMethod(), responseObserver);
    }

    /**
     */
    default void countTemplatesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountTemplatesForUserDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countTemplatesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountTemplatesForUserMethod(), responseObserver);
    }

    /**
     */
    default void createLocation(com.passkit.grpc.Proximity.GPSLocation request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLocationMethod(), responseObserver);
    }

    /**
     */
    default void updateLocation(com.passkit.grpc.Proximity.GPSLocation request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLocationMethod(), responseObserver);
    }

    /**
     */
    default void getLocation(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocationMethod(), responseObserver);
    }

    /**
     */
    default void listLocationsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listLocations(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLocationsMethod(), responseObserver);
    }

    /**
     */
    default void copyLocation(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyLocationMethod(), responseObserver);
    }

    /**
     */
    default void deleteLocation(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocationMethod(), responseObserver);
    }

    /**
     */
    default void countLocationsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountLocationsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countLocations(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountLocationsMethod(), responseObserver);
    }

    /**
     */
    default void createBeacon(com.passkit.grpc.Proximity.Beacon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBeaconMethod(), responseObserver);
    }

    /**
     */
    default void updateBeacon(com.passkit.grpc.Proximity.Beacon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBeaconMethod(), responseObserver);
    }

    /**
     */
    default void getBeacon(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBeaconMethod(), responseObserver);
    }

    /**
     */
    default void listBeaconsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBeaconsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listBeacons(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBeaconsMethod(), responseObserver);
    }

    /**
     */
    default void copyBeacon(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyBeaconMethod(), responseObserver);
    }

    /**
     */
    default void deleteBeacon(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBeaconMethod(), responseObserver);
    }

    /**
     */
    default void countBeaconsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountBeaconsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countBeacons(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountBeaconsMethod(), responseObserver);
    }

    /**
     */
    default void createLink(com.passkit.grpc.Links.Link request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateLinkMethod(), responseObserver);
    }

    /**
     */
    default void updateLink(com.passkit.grpc.Links.Link request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateLinkMethod(), responseObserver);
    }

    /**
     */
    default void getLink(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLinkMethod(), responseObserver);
    }

    /**
     */
    default void listLinksDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLinksDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listLinks(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListLinksMethod(), responseObserver);
    }

    /**
     */
    default void copyLink(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCopyLinkMethod(), responseObserver);
    }

    /**
     */
    default void deleteLink(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLinkMethod(), responseObserver);
    }

    /**
     */
    default void countLinksDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountLinksDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countLinks(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountLinksMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Templates.
   */
  public static abstract class TemplatesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return TemplatesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Templates.
   */
  public static final class TemplatesStub
      extends io.grpc.stub.AbstractAsyncStub<TemplatesStub> {
    private TemplatesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplatesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemplatesStub(channel, callOptions);
    }

    /**
     */
    public void createTemplate(com.passkit.grpc.Template.PassTemplate request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTemplate(com.passkit.grpc.Template.PassTemplate request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTemplate(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDefaultTemplate(com.passkit.grpc.Template.DefaultTemplateRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetDefaultTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyTemplate(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTemplate(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTemplatesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTemplatesForUserDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTemplatesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTemplatesForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTemplatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTemplatesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTemplates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countTemplatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountTemplatesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countTemplates(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountTemplatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countTemplatesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountTemplatesForUserDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countTemplatesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountTemplatesForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLocation(com.passkit.grpc.Proximity.GPSLocation request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLocation(com.passkit.grpc.Proximity.GPSLocation request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocation(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLocationsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListLocationsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLocations(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyLocation(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocation(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countLocationsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountLocationsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countLocations(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountLocationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBeacon(com.passkit.grpc.Proximity.Beacon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBeaconMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBeacon(com.passkit.grpc.Proximity.Beacon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBeaconMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBeacon(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBeaconMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBeaconsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListBeaconsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBeacons(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListBeaconsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyBeacon(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyBeaconMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBeacon(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBeaconMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countBeaconsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountBeaconsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countBeacons(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountBeaconsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createLink(com.passkit.grpc.Links.Link request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateLink(com.passkit.grpc.Links.Link request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLink(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLinksDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListLinksDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listLinks(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListLinksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyLink(com.passkit.grpc.Template.CopyObjectInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCopyLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLink(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLinkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countLinksDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountLinksDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countLinks(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountLinksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Templates.
   */
  public static final class TemplatesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<TemplatesBlockingStub> {
    private TemplatesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplatesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemplatesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createTemplate(com.passkit.grpc.Template.PassTemplate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Template.PassTemplate updateTemplate(com.passkit.grpc.Template.PassTemplate request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Template.PassTemplateResponse getTemplate(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Template.PassTemplate getDefaultTemplate(com.passkit.grpc.Template.DefaultTemplateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetDefaultTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyTemplate(com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTemplate(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTemplateMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Template.PassTemplateResponse> listTemplatesForUserDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTemplatesForUserDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Template.PassTemplateResponse> listTemplatesForUser(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTemplatesForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Template.PassTemplateResponse> listTemplatesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTemplatesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Template.PassTemplateResponse> listTemplates(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countTemplatesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountTemplatesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countTemplates(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountTemplatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countTemplatesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountTemplatesForUserDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countTemplatesForUser(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountTemplatesForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createLocation(com.passkit.grpc.Proximity.GPSLocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Proximity.GPSLocation updateLocation(com.passkit.grpc.Proximity.GPSLocation request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Proximity.GPSLocation getLocation(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Proximity.GPSLocation> listLocationsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListLocationsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Proximity.GPSLocation> listLocations(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyLocation(com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteLocation(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countLocationsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountLocationsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countLocations(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountLocationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createBeacon(com.passkit.grpc.Proximity.Beacon request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBeaconMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Proximity.Beacon updateBeacon(com.passkit.grpc.Proximity.Beacon request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBeaconMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Proximity.Beacon getBeacon(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBeaconMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Proximity.Beacon> listBeaconsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListBeaconsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Proximity.Beacon> listBeacons(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListBeaconsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyBeacon(com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyBeaconMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteBeacon(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBeaconMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countBeaconsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountBeaconsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countBeacons(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountBeaconsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createLink(com.passkit.grpc.Links.Link request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Links.Link updateLink(com.passkit.grpc.Links.Link request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Links.Link getLink(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Links.Link> listLinksDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListLinksDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Links.Link> listLinks(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListLinksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyLink(com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCopyLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteLink(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLinkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countLinksDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountLinksDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countLinks(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountLinksMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Templates.
   */
  public static final class TemplatesFutureStub
      extends io.grpc.stub.AbstractFutureStub<TemplatesFutureStub> {
    private TemplatesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TemplatesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TemplatesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createTemplate(
        com.passkit.grpc.Template.PassTemplate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Template.PassTemplate> updateTemplate(
        com.passkit.grpc.Template.PassTemplate request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Template.PassTemplateResponse> getTemplate(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Template.PassTemplate> getDefaultTemplate(
        com.passkit.grpc.Template.DefaultTemplateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetDefaultTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyTemplate(
        com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTemplate(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTemplateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countTemplatesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountTemplatesDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countTemplates(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountTemplatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countTemplatesForUserDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountTemplatesForUserDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countTemplatesForUser(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountTemplatesForUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createLocation(
        com.passkit.grpc.Proximity.GPSLocation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Proximity.GPSLocation> updateLocation(
        com.passkit.grpc.Proximity.GPSLocation request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Proximity.GPSLocation> getLocation(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyLocation(
        com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLocation(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countLocationsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountLocationsDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countLocations(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountLocationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createBeacon(
        com.passkit.grpc.Proximity.Beacon request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBeaconMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Proximity.Beacon> updateBeacon(
        com.passkit.grpc.Proximity.Beacon request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBeaconMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Proximity.Beacon> getBeacon(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBeaconMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyBeacon(
        com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyBeaconMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBeacon(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBeaconMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countBeaconsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountBeaconsDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countBeacons(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountBeaconsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createLink(
        com.passkit.grpc.Links.Link request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Links.Link> updateLink(
        com.passkit.grpc.Links.Link request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Links.Link> getLink(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyLink(
        com.passkit.grpc.Template.CopyObjectInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCopyLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteLink(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLinkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countLinksDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountLinksDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countLinks(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountLinksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TEMPLATE = 0;
  private static final int METHODID_UPDATE_TEMPLATE = 1;
  private static final int METHODID_GET_TEMPLATE = 2;
  private static final int METHODID_GET_DEFAULT_TEMPLATE = 3;
  private static final int METHODID_COPY_TEMPLATE = 4;
  private static final int METHODID_DELETE_TEMPLATE = 5;
  private static final int METHODID_LIST_TEMPLATES_FOR_USER_DEPRECATED = 6;
  private static final int METHODID_LIST_TEMPLATES_FOR_USER = 7;
  private static final int METHODID_LIST_TEMPLATES_DEPRECATED = 8;
  private static final int METHODID_LIST_TEMPLATES = 9;
  private static final int METHODID_COUNT_TEMPLATES_DEPRECATED = 10;
  private static final int METHODID_COUNT_TEMPLATES = 11;
  private static final int METHODID_COUNT_TEMPLATES_FOR_USER_DEPRECATED = 12;
  private static final int METHODID_COUNT_TEMPLATES_FOR_USER = 13;
  private static final int METHODID_CREATE_LOCATION = 14;
  private static final int METHODID_UPDATE_LOCATION = 15;
  private static final int METHODID_GET_LOCATION = 16;
  private static final int METHODID_LIST_LOCATIONS_DEPRECATED = 17;
  private static final int METHODID_LIST_LOCATIONS = 18;
  private static final int METHODID_COPY_LOCATION = 19;
  private static final int METHODID_DELETE_LOCATION = 20;
  private static final int METHODID_COUNT_LOCATIONS_DEPRECATED = 21;
  private static final int METHODID_COUNT_LOCATIONS = 22;
  private static final int METHODID_CREATE_BEACON = 23;
  private static final int METHODID_UPDATE_BEACON = 24;
  private static final int METHODID_GET_BEACON = 25;
  private static final int METHODID_LIST_BEACONS_DEPRECATED = 26;
  private static final int METHODID_LIST_BEACONS = 27;
  private static final int METHODID_COPY_BEACON = 28;
  private static final int METHODID_DELETE_BEACON = 29;
  private static final int METHODID_COUNT_BEACONS_DEPRECATED = 30;
  private static final int METHODID_COUNT_BEACONS = 31;
  private static final int METHODID_CREATE_LINK = 32;
  private static final int METHODID_UPDATE_LINK = 33;
  private static final int METHODID_GET_LINK = 34;
  private static final int METHODID_LIST_LINKS_DEPRECATED = 35;
  private static final int METHODID_LIST_LINKS = 36;
  private static final int METHODID_COPY_LINK = 37;
  private static final int METHODID_DELETE_LINK = 38;
  private static final int METHODID_COUNT_LINKS_DEPRECATED = 39;
  private static final int METHODID_COUNT_LINKS = 40;

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
        case METHODID_CREATE_TEMPLATE:
          serviceImpl.createTemplate((com.passkit.grpc.Template.PassTemplate) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_TEMPLATE:
          serviceImpl.updateTemplate((com.passkit.grpc.Template.PassTemplate) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate>) responseObserver);
          break;
        case METHODID_GET_TEMPLATE:
          serviceImpl.getTemplate((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse>) responseObserver);
          break;
        case METHODID_GET_DEFAULT_TEMPLATE:
          serviceImpl.getDefaultTemplate((com.passkit.grpc.Template.DefaultTemplateRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplate>) responseObserver);
          break;
        case METHODID_COPY_TEMPLATE:
          serviceImpl.copyTemplate((com.passkit.grpc.Template.CopyObjectInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_TEMPLATE:
          serviceImpl.deleteTemplate((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATES_FOR_USER_DEPRECATED:
          serviceImpl.listTemplatesForUserDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATES_FOR_USER:
          serviceImpl.listTemplatesForUser((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATES_DEPRECATED:
          serviceImpl.listTemplatesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse>) responseObserver);
          break;
        case METHODID_LIST_TEMPLATES:
          serviceImpl.listTemplates((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Template.PassTemplateResponse>) responseObserver);
          break;
        case METHODID_COUNT_TEMPLATES_DEPRECATED:
          serviceImpl.countTemplatesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_TEMPLATES:
          serviceImpl.countTemplates((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_TEMPLATES_FOR_USER_DEPRECATED:
          serviceImpl.countTemplatesForUserDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_TEMPLATES_FOR_USER:
          serviceImpl.countTemplatesForUser((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_CREATE_LOCATION:
          serviceImpl.createLocation((com.passkit.grpc.Proximity.GPSLocation) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_LOCATION:
          serviceImpl.updateLocation((com.passkit.grpc.Proximity.GPSLocation) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation>) responseObserver);
          break;
        case METHODID_GET_LOCATION:
          serviceImpl.getLocation((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation>) responseObserver);
          break;
        case METHODID_LIST_LOCATIONS_DEPRECATED:
          serviceImpl.listLocationsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation>) responseObserver);
          break;
        case METHODID_LIST_LOCATIONS:
          serviceImpl.listLocations((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.GPSLocation>) responseObserver);
          break;
        case METHODID_COPY_LOCATION:
          serviceImpl.copyLocation((com.passkit.grpc.Template.CopyObjectInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_LOCATION:
          serviceImpl.deleteLocation((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COUNT_LOCATIONS_DEPRECATED:
          serviceImpl.countLocationsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_LOCATIONS:
          serviceImpl.countLocations((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_CREATE_BEACON:
          serviceImpl.createBeacon((com.passkit.grpc.Proximity.Beacon) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_BEACON:
          serviceImpl.updateBeacon((com.passkit.grpc.Proximity.Beacon) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon>) responseObserver);
          break;
        case METHODID_GET_BEACON:
          serviceImpl.getBeacon((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon>) responseObserver);
          break;
        case METHODID_LIST_BEACONS_DEPRECATED:
          serviceImpl.listBeaconsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon>) responseObserver);
          break;
        case METHODID_LIST_BEACONS:
          serviceImpl.listBeacons((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Proximity.Beacon>) responseObserver);
          break;
        case METHODID_COPY_BEACON:
          serviceImpl.copyBeacon((com.passkit.grpc.Template.CopyObjectInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_BEACON:
          serviceImpl.deleteBeacon((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COUNT_BEACONS_DEPRECATED:
          serviceImpl.countBeaconsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_BEACONS:
          serviceImpl.countBeacons((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_CREATE_LINK:
          serviceImpl.createLink((com.passkit.grpc.Links.Link) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_LINK:
          serviceImpl.updateLink((com.passkit.grpc.Links.Link) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link>) responseObserver);
          break;
        case METHODID_GET_LINK:
          serviceImpl.getLink((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link>) responseObserver);
          break;
        case METHODID_LIST_LINKS_DEPRECATED:
          serviceImpl.listLinksDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link>) responseObserver);
          break;
        case METHODID_LIST_LINKS:
          serviceImpl.listLinks((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Links.Link>) responseObserver);
          break;
        case METHODID_COPY_LINK:
          serviceImpl.copyLink((com.passkit.grpc.Template.CopyObjectInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_LINK:
          serviceImpl.deleteLink((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_COUNT_LINKS_DEPRECATED:
          serviceImpl.countLinksDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_LINKS:
          serviceImpl.countLinks((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
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
          getCreateTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.PassTemplate,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_TEMPLATE)))
        .addMethod(
          getUpdateTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.PassTemplate,
              com.passkit.grpc.Template.PassTemplate>(
                service, METHODID_UPDATE_TEMPLATE)))
        .addMethod(
          getGetTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Template.PassTemplateResponse>(
                service, METHODID_GET_TEMPLATE)))
        .addMethod(
          getGetDefaultTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.DefaultTemplateRequest,
              com.passkit.grpc.Template.PassTemplate>(
                service, METHODID_GET_DEFAULT_TEMPLATE)))
        .addMethod(
          getCopyTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.CopyObjectInput,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_TEMPLATE)))
        .addMethod(
          getDeleteTemplateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_TEMPLATE)))
        .addMethod(
          getListTemplatesForUserDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Template.PassTemplateResponse>(
                service, METHODID_LIST_TEMPLATES_FOR_USER_DEPRECATED)))
        .addMethod(
          getListTemplatesForUserMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Template.PassTemplateResponse>(
                service, METHODID_LIST_TEMPLATES_FOR_USER)))
        .addMethod(
          getListTemplatesDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Template.PassTemplateResponse>(
                service, METHODID_LIST_TEMPLATES_DEPRECATED)))
        .addMethod(
          getListTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Template.PassTemplateResponse>(
                service, METHODID_LIST_TEMPLATES)))
        .addMethod(
          getCountTemplatesDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_TEMPLATES_DEPRECATED)))
        .addMethod(
          getCountTemplatesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_TEMPLATES)))
        .addMethod(
          getCountTemplatesForUserDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_TEMPLATES_FOR_USER_DEPRECATED)))
        .addMethod(
          getCountTemplatesForUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_TEMPLATES_FOR_USER)))
        .addMethod(
          getCreateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Proximity.GPSLocation,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_LOCATION)))
        .addMethod(
          getUpdateLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Proximity.GPSLocation,
              com.passkit.grpc.Proximity.GPSLocation>(
                service, METHODID_UPDATE_LOCATION)))
        .addMethod(
          getGetLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Proximity.GPSLocation>(
                service, METHODID_GET_LOCATION)))
        .addMethod(
          getListLocationsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Proximity.GPSLocation>(
                service, METHODID_LIST_LOCATIONS_DEPRECATED)))
        .addMethod(
          getListLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Proximity.GPSLocation>(
                service, METHODID_LIST_LOCATIONS)))
        .addMethod(
          getCopyLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.CopyObjectInput,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_LOCATION)))
        .addMethod(
          getDeleteLocationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_LOCATION)))
        .addMethod(
          getCountLocationsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_LOCATIONS_DEPRECATED)))
        .addMethod(
          getCountLocationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_LOCATIONS)))
        .addMethod(
          getCreateBeaconMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Proximity.Beacon,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_BEACON)))
        .addMethod(
          getUpdateBeaconMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Proximity.Beacon,
              com.passkit.grpc.Proximity.Beacon>(
                service, METHODID_UPDATE_BEACON)))
        .addMethod(
          getGetBeaconMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Proximity.Beacon>(
                service, METHODID_GET_BEACON)))
        .addMethod(
          getListBeaconsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Proximity.Beacon>(
                service, METHODID_LIST_BEACONS_DEPRECATED)))
        .addMethod(
          getListBeaconsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Proximity.Beacon>(
                service, METHODID_LIST_BEACONS)))
        .addMethod(
          getCopyBeaconMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.CopyObjectInput,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_BEACON)))
        .addMethod(
          getDeleteBeaconMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_BEACON)))
        .addMethod(
          getCountBeaconsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_BEACONS_DEPRECATED)))
        .addMethod(
          getCountBeaconsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_BEACONS)))
        .addMethod(
          getCreateLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Links.Link,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_LINK)))
        .addMethod(
          getUpdateLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Links.Link,
              com.passkit.grpc.Links.Link>(
                service, METHODID_UPDATE_LINK)))
        .addMethod(
          getGetLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Links.Link>(
                service, METHODID_GET_LINK)))
        .addMethod(
          getListLinksDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Links.Link>(
                service, METHODID_LIST_LINKS_DEPRECATED)))
        .addMethod(
          getListLinksMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Links.Link>(
                service, METHODID_LIST_LINKS)))
        .addMethod(
          getCopyLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Template.CopyObjectInput,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_COPY_LINK)))
        .addMethod(
          getDeleteLinkMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_LINK)))
        .addMethod(
          getCountLinksDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_LINKS_DEPRECATED)))
        .addMethod(
          getCountLinksMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_LINKS)))
        .build();
  }

  private static abstract class TemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TemplatesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcTemplates.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Templates");
    }
  }

  private static final class TemplatesFileDescriptorSupplier
      extends TemplatesBaseDescriptorSupplier {
    TemplatesFileDescriptorSupplier() {}
  }

  private static final class TemplatesMethodDescriptorSupplier
      extends TemplatesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    TemplatesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (TemplatesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TemplatesFileDescriptorSupplier())
              .addMethod(getCreateTemplateMethod())
              .addMethod(getUpdateTemplateMethod())
              .addMethod(getGetTemplateMethod())
              .addMethod(getGetDefaultTemplateMethod())
              .addMethod(getCopyTemplateMethod())
              .addMethod(getDeleteTemplateMethod())
              .addMethod(getListTemplatesForUserDeprecatedMethod())
              .addMethod(getListTemplatesForUserMethod())
              .addMethod(getListTemplatesDeprecatedMethod())
              .addMethod(getListTemplatesMethod())
              .addMethod(getCountTemplatesDeprecatedMethod())
              .addMethod(getCountTemplatesMethod())
              .addMethod(getCountTemplatesForUserDeprecatedMethod())
              .addMethod(getCountTemplatesForUserMethod())
              .addMethod(getCreateLocationMethod())
              .addMethod(getUpdateLocationMethod())
              .addMethod(getGetLocationMethod())
              .addMethod(getListLocationsDeprecatedMethod())
              .addMethod(getListLocationsMethod())
              .addMethod(getCopyLocationMethod())
              .addMethod(getDeleteLocationMethod())
              .addMethod(getCountLocationsDeprecatedMethod())
              .addMethod(getCountLocationsMethod())
              .addMethod(getCreateBeaconMethod())
              .addMethod(getUpdateBeaconMethod())
              .addMethod(getGetBeaconMethod())
              .addMethod(getListBeaconsDeprecatedMethod())
              .addMethod(getListBeaconsMethod())
              .addMethod(getCopyBeaconMethod())
              .addMethod(getDeleteBeaconMethod())
              .addMethod(getCountBeaconsDeprecatedMethod())
              .addMethod(getCountBeaconsMethod())
              .addMethod(getCreateLinkMethod())
              .addMethod(getUpdateLinkMethod())
              .addMethod(getGetLinkMethod())
              .addMethod(getListLinksDeprecatedMethod())
              .addMethod(getListLinksMethod())
              .addMethod(getCopyLinkMethod())
              .addMethod(getDeleteLinkMethod())
              .addMethod(getCountLinksDeprecatedMethod())
              .addMethod(getCountLinksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
