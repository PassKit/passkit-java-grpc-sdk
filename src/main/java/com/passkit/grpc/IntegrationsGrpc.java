package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/core/a_rpc_others.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IntegrationsGrpc {

  private IntegrationsGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.Integrations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs,
      com.passkit.grpc.CommonObjects.Id> getCreateIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createIntegrations",
      requestType = com.passkit.grpc.Integration.IntegrationConfigs.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs,
      com.passkit.grpc.CommonObjects.Id> getCreateIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs, com.passkit.grpc.CommonObjects.Id> getCreateIntegrationsMethod;
    if ((getCreateIntegrationsMethod = IntegrationsGrpc.getCreateIntegrationsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCreateIntegrationsMethod = IntegrationsGrpc.getCreateIntegrationsMethod) == null) {
          IntegrationsGrpc.getCreateIntegrationsMethod = getCreateIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.IntegrationConfigs, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.IntegrationConfigs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("createIntegrations"))
              .build();
        }
      }
    }
    return getCreateIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput,
      com.passkit.grpc.Integration.IntegrationConfigs> getGetIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getIntegrations",
      requestType = com.passkit.grpc.Integration.ProtocolIdInput.class,
      responseType = com.passkit.grpc.Integration.IntegrationConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput,
      com.passkit.grpc.Integration.IntegrationConfigs> getGetIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput, com.passkit.grpc.Integration.IntegrationConfigs> getGetIntegrationsMethod;
    if ((getGetIntegrationsMethod = IntegrationsGrpc.getGetIntegrationsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetIntegrationsMethod = IntegrationsGrpc.getGetIntegrationsMethod) == null) {
          IntegrationsGrpc.getGetIntegrationsMethod = getGetIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.ProtocolIdInput, com.passkit.grpc.Integration.IntegrationConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.ProtocolIdInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.IntegrationConfigs.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("getIntegrations"))
              .build();
        }
      }
    }
    return getGetIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs,
      com.passkit.grpc.CommonObjects.Id> getUpdateIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateIntegrations",
      requestType = com.passkit.grpc.Integration.IntegrationConfigs.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs,
      com.passkit.grpc.CommonObjects.Id> getUpdateIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.IntegrationConfigs, com.passkit.grpc.CommonObjects.Id> getUpdateIntegrationsMethod;
    if ((getUpdateIntegrationsMethod = IntegrationsGrpc.getUpdateIntegrationsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getUpdateIntegrationsMethod = IntegrationsGrpc.getUpdateIntegrationsMethod) == null) {
          IntegrationsGrpc.getUpdateIntegrationsMethod = getUpdateIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.IntegrationConfigs, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.IntegrationConfigs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("updateIntegrations"))
              .build();
        }
      }
    }
    return getUpdateIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput,
      com.google.protobuf.Empty> getDeleteIntegrationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteIntegrations",
      requestType = com.passkit.grpc.Integration.ProtocolIdInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput,
      com.google.protobuf.Empty> getDeleteIntegrationsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.ProtocolIdInput, com.google.protobuf.Empty> getDeleteIntegrationsMethod;
    if ((getDeleteIntegrationsMethod = IntegrationsGrpc.getDeleteIntegrationsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getDeleteIntegrationsMethod = IntegrationsGrpc.getDeleteIntegrationsMethod) == null) {
          IntegrationsGrpc.getDeleteIntegrationsMethod = getDeleteIntegrationsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.ProtocolIdInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteIntegrations"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.ProtocolIdInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("deleteIntegrations"))
              .build();
        }
      }
    }
    return getDeleteIntegrationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription,
      com.passkit.grpc.CommonObjects.Id> getCreateSinkSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createSinkSubscription",
      requestType = com.passkit.grpc.Integration.SinkSubscription.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription,
      com.passkit.grpc.CommonObjects.Id> getCreateSinkSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription, com.passkit.grpc.CommonObjects.Id> getCreateSinkSubscriptionMethod;
    if ((getCreateSinkSubscriptionMethod = IntegrationsGrpc.getCreateSinkSubscriptionMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCreateSinkSubscriptionMethod = IntegrationsGrpc.getCreateSinkSubscriptionMethod) == null) {
          IntegrationsGrpc.getCreateSinkSubscriptionMethod = getCreateSinkSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.SinkSubscription, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createSinkSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("createSinkSubscription"))
              .build();
        }
      }
    }
    return getCreateSinkSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest,
      com.passkit.grpc.Integration.SinkSubscription> getGetSinkSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSinkSubscription",
      requestType = com.passkit.grpc.Integration.SubscriptionRequest.class,
      responseType = com.passkit.grpc.Integration.SinkSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest,
      com.passkit.grpc.Integration.SinkSubscription> getGetSinkSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest, com.passkit.grpc.Integration.SinkSubscription> getGetSinkSubscriptionMethod;
    if ((getGetSinkSubscriptionMethod = IntegrationsGrpc.getGetSinkSubscriptionMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetSinkSubscriptionMethod = IntegrationsGrpc.getGetSinkSubscriptionMethod) == null) {
          IntegrationsGrpc.getGetSinkSubscriptionMethod = getGetSinkSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.SubscriptionRequest, com.passkit.grpc.Integration.SinkSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSinkSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("getSinkSubscription"))
              .build();
        }
      }
    }
    return getGetSinkSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequestDeprecated,
      com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listSinkSubscriptionsDeprecated",
      requestType = com.passkit.grpc.CommonObjects.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.Integration.SinkSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequestDeprecated,
      com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequestDeprecated, com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsDeprecatedMethod;
    if ((getListSinkSubscriptionsDeprecatedMethod = IntegrationsGrpc.getListSinkSubscriptionsDeprecatedMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListSinkSubscriptionsDeprecatedMethod = IntegrationsGrpc.getListSinkSubscriptionsDeprecatedMethod) == null) {
          IntegrationsGrpc.getListSinkSubscriptionsDeprecatedMethod = getListSinkSubscriptionsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.ListRequestDeprecated, com.passkit.grpc.Integration.SinkSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listSinkSubscriptionsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("listSinkSubscriptionsDeprecated"))
              .build();
        }
      }
    }
    return getListSinkSubscriptionsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequest,
      com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listSinkSubscriptions",
      requestType = com.passkit.grpc.CommonObjects.ListRequest.class,
      responseType = com.passkit.grpc.Integration.SinkSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequest,
      com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.ListRequest, com.passkit.grpc.Integration.SinkSubscription> getListSinkSubscriptionsMethod;
    if ((getListSinkSubscriptionsMethod = IntegrationsGrpc.getListSinkSubscriptionsMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getListSinkSubscriptionsMethod = IntegrationsGrpc.getListSinkSubscriptionsMethod) == null) {
          IntegrationsGrpc.getListSinkSubscriptionsMethod = getListSinkSubscriptionsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.ListRequest, com.passkit.grpc.Integration.SinkSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listSinkSubscriptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("listSinkSubscriptions"))
              .build();
        }
      }
    }
    return getListSinkSubscriptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription,
      com.passkit.grpc.CommonObjects.Id> getUpdateSinkSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateSinkSubscription",
      requestType = com.passkit.grpc.Integration.SinkSubscription.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription,
      com.passkit.grpc.CommonObjects.Id> getUpdateSinkSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SinkSubscription, com.passkit.grpc.CommonObjects.Id> getUpdateSinkSubscriptionMethod;
    if ((getUpdateSinkSubscriptionMethod = IntegrationsGrpc.getUpdateSinkSubscriptionMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getUpdateSinkSubscriptionMethod = IntegrationsGrpc.getUpdateSinkSubscriptionMethod) == null) {
          IntegrationsGrpc.getUpdateSinkSubscriptionMethod = getUpdateSinkSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.SinkSubscription, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateSinkSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("updateSinkSubscription"))
              .build();
        }
      }
    }
    return getUpdateSinkSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest,
      com.google.protobuf.Empty> getDeleteSinkSubscriptionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteSinkSubscription",
      requestType = com.passkit.grpc.Integration.SubscriptionRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest,
      com.google.protobuf.Empty> getDeleteSinkSubscriptionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.SubscriptionRequest, com.google.protobuf.Empty> getDeleteSinkSubscriptionMethod;
    if ((getDeleteSinkSubscriptionMethod = IntegrationsGrpc.getDeleteSinkSubscriptionMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getDeleteSinkSubscriptionMethod = IntegrationsGrpc.getDeleteSinkSubscriptionMethod) == null) {
          IntegrationsGrpc.getDeleteSinkSubscriptionMethod = getDeleteSinkSubscriptionMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.SubscriptionRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteSinkSubscription"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SubscriptionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("deleteSinkSubscription"))
              .build();
        }
      }
    }
    return getDeleteSinkSubscriptionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Integration.SinkSubscription> getGetSampleSubscriptionEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getSampleSubscriptionEvent",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Integration.SinkSubscription.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Integration.SinkSubscription> getGetSampleSubscriptionEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Integration.SinkSubscription> getGetSampleSubscriptionEventMethod;
    if ((getGetSampleSubscriptionEventMethod = IntegrationsGrpc.getGetSampleSubscriptionEventMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getGetSampleSubscriptionEventMethod = IntegrationsGrpc.getGetSampleSubscriptionEventMethod) == null) {
          IntegrationsGrpc.getGetSampleSubscriptionEventMethod = getGetSampleSubscriptionEventMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Integration.SinkSubscription>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getSampleSubscriptionEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.SinkSubscription.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("getSampleSubscriptionEvent"))
              .build();
        }
      }
    }
    return getGetSampleSubscriptionEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Integration.DynamicApiInput,
      com.passkit.grpc.Integration.DynamicApiResponse> getCallDynamicApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "callDynamicApi",
      requestType = com.passkit.grpc.Integration.DynamicApiInput.class,
      responseType = com.passkit.grpc.Integration.DynamicApiResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Integration.DynamicApiInput,
      com.passkit.grpc.Integration.DynamicApiResponse> getCallDynamicApiMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Integration.DynamicApiInput, com.passkit.grpc.Integration.DynamicApiResponse> getCallDynamicApiMethod;
    if ((getCallDynamicApiMethod = IntegrationsGrpc.getCallDynamicApiMethod) == null) {
      synchronized (IntegrationsGrpc.class) {
        if ((getCallDynamicApiMethod = IntegrationsGrpc.getCallDynamicApiMethod) == null) {
          IntegrationsGrpc.getCallDynamicApiMethod = getCallDynamicApiMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Integration.DynamicApiInput, com.passkit.grpc.Integration.DynamicApiResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "callDynamicApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.DynamicApiInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Integration.DynamicApiResponse.getDefaultInstance()))
              .setSchemaDescriptor(new IntegrationsMethodDescriptorSupplier("callDynamicApi"))
              .build();
        }
      }
    }
    return getCallDynamicApiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IntegrationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsStub>() {
        @java.lang.Override
        public IntegrationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsStub(channel, callOptions);
        }
      };
    return IntegrationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IntegrationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsBlockingStub>() {
        @java.lang.Override
        public IntegrationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsBlockingStub(channel, callOptions);
        }
      };
    return IntegrationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IntegrationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IntegrationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IntegrationsFutureStub>() {
        @java.lang.Override
        public IntegrationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IntegrationsFutureStub(channel, callOptions);
        }
      };
    return IntegrationsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void getIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void updateIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void deleteIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteIntegrationsMethod(), responseObserver);
    }

    /**
     */
    default void createSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSinkSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void getSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSinkSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void listSinkSubscriptionsDeprecated(com.passkit.grpc.CommonObjects.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSinkSubscriptionsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listSinkSubscriptions(com.passkit.grpc.CommonObjects.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSinkSubscriptionsMethod(), responseObserver);
    }

    /**
     */
    default void updateSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSinkSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void deleteSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSinkSubscriptionMethod(), responseObserver);
    }

    /**
     */
    default void getSampleSubscriptionEvent(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSampleSubscriptionEventMethod(), responseObserver);
    }

    /**
     */
    default void callDynamicApi(com.passkit.grpc.Integration.DynamicApiInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.DynamicApiResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallDynamicApiMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Integrations.
   */
  public static abstract class IntegrationsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return IntegrationsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Integrations.
   */
  public static final class IntegrationsStub
      extends io.grpc.stub.AbstractAsyncStub<IntegrationsStub> {
    private IntegrationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsStub(channel, callOptions);
    }

    /**
     */
    public void createIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.IntegrationConfigs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteIntegrationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSinkSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSinkSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSinkSubscriptionsDeprecated(com.passkit.grpc.CommonObjects.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListSinkSubscriptionsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSinkSubscriptions(com.passkit.grpc.CommonObjects.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListSinkSubscriptionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSinkSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSinkSubscriptionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSampleSubscriptionEvent(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSampleSubscriptionEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callDynamicApi(com.passkit.grpc.Integration.DynamicApiInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.DynamicApiResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallDynamicApiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Integrations.
   */
  public static final class IntegrationsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<IntegrationsBlockingStub> {
    private IntegrationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Integration.IntegrationConfigs getIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updateIntegrations(com.passkit.grpc.Integration.IntegrationConfigs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteIntegrations(com.passkit.grpc.Integration.ProtocolIdInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteIntegrationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSinkSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Integration.SinkSubscription getSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSinkSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Integration.SinkSubscription> listSinkSubscriptionsDeprecated(
        com.passkit.grpc.CommonObjects.ListRequestDeprecated request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListSinkSubscriptionsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Integration.SinkSubscription> listSinkSubscriptions(
        com.passkit.grpc.CommonObjects.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListSinkSubscriptionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updateSinkSubscription(com.passkit.grpc.Integration.SinkSubscription request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSinkSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteSinkSubscription(com.passkit.grpc.Integration.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSinkSubscriptionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Integration.SinkSubscription getSampleSubscriptionEvent(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSampleSubscriptionEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Integration.DynamicApiResponse callDynamicApi(com.passkit.grpc.Integration.DynamicApiInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallDynamicApiMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Integrations.
   */
  public static final class IntegrationsFutureStub
      extends io.grpc.stub.AbstractFutureStub<IntegrationsFutureStub> {
    private IntegrationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IntegrationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IntegrationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createIntegrations(
        com.passkit.grpc.Integration.IntegrationConfigs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Integration.IntegrationConfigs> getIntegrations(
        com.passkit.grpc.Integration.ProtocolIdInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateIntegrations(
        com.passkit.grpc.Integration.IntegrationConfigs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteIntegrations(
        com.passkit.grpc.Integration.ProtocolIdInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteIntegrationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createSinkSubscription(
        com.passkit.grpc.Integration.SinkSubscription request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSinkSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Integration.SinkSubscription> getSinkSubscription(
        com.passkit.grpc.Integration.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSinkSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateSinkSubscription(
        com.passkit.grpc.Integration.SinkSubscription request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSinkSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteSinkSubscription(
        com.passkit.grpc.Integration.SubscriptionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSinkSubscriptionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Integration.SinkSubscription> getSampleSubscriptionEvent(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSampleSubscriptionEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Integration.DynamicApiResponse> callDynamicApi(
        com.passkit.grpc.Integration.DynamicApiInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallDynamicApiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_INTEGRATIONS = 0;
  private static final int METHODID_GET_INTEGRATIONS = 1;
  private static final int METHODID_UPDATE_INTEGRATIONS = 2;
  private static final int METHODID_DELETE_INTEGRATIONS = 3;
  private static final int METHODID_CREATE_SINK_SUBSCRIPTION = 4;
  private static final int METHODID_GET_SINK_SUBSCRIPTION = 5;
  private static final int METHODID_LIST_SINK_SUBSCRIPTIONS_DEPRECATED = 6;
  private static final int METHODID_LIST_SINK_SUBSCRIPTIONS = 7;
  private static final int METHODID_UPDATE_SINK_SUBSCRIPTION = 8;
  private static final int METHODID_DELETE_SINK_SUBSCRIPTION = 9;
  private static final int METHODID_GET_SAMPLE_SUBSCRIPTION_EVENT = 10;
  private static final int METHODID_CALL_DYNAMIC_API = 11;

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
        case METHODID_CREATE_INTEGRATIONS:
          serviceImpl.createIntegrations((com.passkit.grpc.Integration.IntegrationConfigs) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_INTEGRATIONS:
          serviceImpl.getIntegrations((com.passkit.grpc.Integration.ProtocolIdInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.IntegrationConfigs>) responseObserver);
          break;
        case METHODID_UPDATE_INTEGRATIONS:
          serviceImpl.updateIntegrations((com.passkit.grpc.Integration.IntegrationConfigs) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_INTEGRATIONS:
          serviceImpl.deleteIntegrations((com.passkit.grpc.Integration.ProtocolIdInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_SINK_SUBSCRIPTION:
          serviceImpl.createSinkSubscription((com.passkit.grpc.Integration.SinkSubscription) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_SINK_SUBSCRIPTION:
          serviceImpl.getSinkSubscription((com.passkit.grpc.Integration.SubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription>) responseObserver);
          break;
        case METHODID_LIST_SINK_SUBSCRIPTIONS_DEPRECATED:
          serviceImpl.listSinkSubscriptionsDeprecated((com.passkit.grpc.CommonObjects.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription>) responseObserver);
          break;
        case METHODID_LIST_SINK_SUBSCRIPTIONS:
          serviceImpl.listSinkSubscriptions((com.passkit.grpc.CommonObjects.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription>) responseObserver);
          break;
        case METHODID_UPDATE_SINK_SUBSCRIPTION:
          serviceImpl.updateSinkSubscription((com.passkit.grpc.Integration.SinkSubscription) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_DELETE_SINK_SUBSCRIPTION:
          serviceImpl.deleteSinkSubscription((com.passkit.grpc.Integration.SubscriptionRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_SAMPLE_SUBSCRIPTION_EVENT:
          serviceImpl.getSampleSubscriptionEvent((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.SinkSubscription>) responseObserver);
          break;
        case METHODID_CALL_DYNAMIC_API:
          serviceImpl.callDynamicApi((com.passkit.grpc.Integration.DynamicApiInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Integration.DynamicApiResponse>) responseObserver);
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
          getCreateIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.IntegrationConfigs,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_INTEGRATIONS)))
        .addMethod(
          getGetIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.ProtocolIdInput,
              com.passkit.grpc.Integration.IntegrationConfigs>(
                service, METHODID_GET_INTEGRATIONS)))
        .addMethod(
          getUpdateIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.IntegrationConfigs,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_INTEGRATIONS)))
        .addMethod(
          getDeleteIntegrationsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.ProtocolIdInput,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_INTEGRATIONS)))
        .addMethod(
          getCreateSinkSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.SinkSubscription,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_CREATE_SINK_SUBSCRIPTION)))
        .addMethod(
          getGetSinkSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.SubscriptionRequest,
              com.passkit.grpc.Integration.SinkSubscription>(
                service, METHODID_GET_SINK_SUBSCRIPTION)))
        .addMethod(
          getListSinkSubscriptionsDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.ListRequestDeprecated,
              com.passkit.grpc.Integration.SinkSubscription>(
                service, METHODID_LIST_SINK_SUBSCRIPTIONS_DEPRECATED)))
        .addMethod(
          getListSinkSubscriptionsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.ListRequest,
              com.passkit.grpc.Integration.SinkSubscription>(
                service, METHODID_LIST_SINK_SUBSCRIPTIONS)))
        .addMethod(
          getUpdateSinkSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.SinkSubscription,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_SINK_SUBSCRIPTION)))
        .addMethod(
          getDeleteSinkSubscriptionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.SubscriptionRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_SINK_SUBSCRIPTION)))
        .addMethod(
          getGetSampleSubscriptionEventMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Integration.SinkSubscription>(
                service, METHODID_GET_SAMPLE_SUBSCRIPTION_EVENT)))
        .addMethod(
          getCallDynamicApiMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Integration.DynamicApiInput,
              com.passkit.grpc.Integration.DynamicApiResponse>(
                service, METHODID_CALL_DYNAMIC_API)))
        .build();
  }

  private static abstract class IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IntegrationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcOthers.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Integrations");
    }
  }

  private static final class IntegrationsFileDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier {
    IntegrationsFileDescriptorSupplier() {}
  }

  private static final class IntegrationsMethodDescriptorSupplier
      extends IntegrationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    IntegrationsMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (IntegrationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IntegrationsFileDescriptorSupplier())
              .addMethod(getCreateIntegrationsMethod())
              .addMethod(getGetIntegrationsMethod())
              .addMethod(getUpdateIntegrationsMethod())
              .addMethod(getDeleteIntegrationsMethod())
              .addMethod(getCreateSinkSubscriptionMethod())
              .addMethod(getGetSinkSubscriptionMethod())
              .addMethod(getListSinkSubscriptionsDeprecatedMethod())
              .addMethod(getListSinkSubscriptionsMethod())
              .addMethod(getUpdateSinkSubscriptionMethod())
              .addMethod(getDeleteSinkSubscriptionMethod())
              .addMethod(getGetSampleSubscriptionEventMethod())
              .addMethod(getCallDynamicApiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
