package com.passkit.grpc.SingleUseCoupons;

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
    comments = "Source: io/single_use_coupons/a_rpc.proto")
public final class SingleUseCouponsGrpc {

  private SingleUseCouponsGrpc() {}

  public static final String SERVICE_NAME = "single_use_coupons.SingleUseCoupons";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCouponCampaign",
      requestType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign, com.passkit.grpc.CommonObjects.Id> getCreateCouponCampaignMethod;
    if ((getCreateCouponCampaignMethod = SingleUseCouponsGrpc.getCreateCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCreateCouponCampaignMethod = SingleUseCouponsGrpc.getCreateCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getCreateCouponCampaignMethod = getCreateCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("createCouponCampaign"))
              .build();
        }
      }
    }
    return getCreateCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getUpdateCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCouponCampaign",
      requestType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getUpdateCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getUpdateCouponCampaignMethod;
    if ((getUpdateCouponCampaignMethod = SingleUseCouponsGrpc.getUpdateCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getUpdateCouponCampaignMethod = SingleUseCouponsGrpc.getUpdateCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getUpdateCouponCampaignMethod = getUpdateCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("updateCouponCampaign"))
              .build();
        }
      }
    }
    return getUpdateCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getGetCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCouponCampaign",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getGetCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getGetCouponCampaignMethod;
    if ((getGetCouponCampaignMethod = SingleUseCouponsGrpc.getGetCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetCouponCampaignMethod = SingleUseCouponsGrpc.getGetCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getGetCouponCampaignMethod = getGetCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getCouponCampaign"))
              .build();
        }
      }
    }
    return getGetCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCouponCampaign",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteCouponCampaignMethod;
    if ((getDeleteCouponCampaignMethod = SingleUseCouponsGrpc.getDeleteCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getDeleteCouponCampaignMethod = SingleUseCouponsGrpc.getDeleteCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getDeleteCouponCampaignMethod = getDeleteCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("deleteCouponCampaign"))
              .build();
        }
      }
    }
    return getDeleteCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponCampaignsDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsDeprecatedMethod;
    if ((getListCouponCampaignsDeprecatedMethod = SingleUseCouponsGrpc.getListCouponCampaignsDeprecatedMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponCampaignsDeprecatedMethod = SingleUseCouponsGrpc.getListCouponCampaignsDeprecatedMethod) == null) {
          SingleUseCouponsGrpc.getListCouponCampaignsDeprecatedMethod = getListCouponCampaignsDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponCampaignsDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponCampaignsDeprecated"))
              .build();
        }
      }
    }
    return getListCouponCampaignsDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponCampaigns",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getListCouponCampaignsMethod;
    if ((getListCouponCampaignsMethod = SingleUseCouponsGrpc.getListCouponCampaignsMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponCampaignsMethod = SingleUseCouponsGrpc.getListCouponCampaignsMethod) == null) {
          SingleUseCouponsGrpc.getListCouponCampaignsMethod = getListCouponCampaignsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponCampaigns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponCampaigns"))
              .build();
        }
      }
    }
    return getListCouponCampaignsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> getGetAnalyticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnalytics",
      requestType = com.passkit.grpc.Reporting.AnalyticsRequest.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest,
      com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> getGetAnalyticsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> getGetAnalyticsMethod;
    if ((getGetAnalyticsMethod = SingleUseCouponsGrpc.getGetAnalyticsMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetAnalyticsMethod = SingleUseCouponsGrpc.getGetAnalyticsMethod) == null) {
          SingleUseCouponsGrpc.getGetAnalyticsMethod = getGetAnalyticsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Reporting.AnalyticsRequest, com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAnalytics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Reporting.AnalyticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getAnalytics"))
              .build();
        }
      }
    }
    return getGetAnalyticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCouponOffer",
      requestType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponOfferMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer, com.passkit.grpc.CommonObjects.Id> getCreateCouponOfferMethod;
    if ((getCreateCouponOfferMethod = SingleUseCouponsGrpc.getCreateCouponOfferMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCreateCouponOfferMethod = SingleUseCouponsGrpc.getCreateCouponOfferMethod) == null) {
          SingleUseCouponsGrpc.getCreateCouponOfferMethod = getCreateCouponOfferMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCouponOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("createCouponOffer"))
              .build();
        }
      }
    }
    return getCreateCouponOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getUpdateCouponOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCouponOffer",
      requestType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getUpdateCouponOfferMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getUpdateCouponOfferMethod;
    if ((getUpdateCouponOfferMethod = SingleUseCouponsGrpc.getUpdateCouponOfferMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getUpdateCouponOfferMethod = SingleUseCouponsGrpc.getUpdateCouponOfferMethod) == null) {
          SingleUseCouponsGrpc.getUpdateCouponOfferMethod = getUpdateCouponOfferMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCouponOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("updateCouponOffer"))
              .build();
        }
      }
    }
    return getUpdateCouponOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getGetCouponOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCouponOffer",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getGetCouponOfferMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getGetCouponOfferMethod;
    if ((getGetCouponOfferMethod = SingleUseCouponsGrpc.getGetCouponOfferMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetCouponOfferMethod = SingleUseCouponsGrpc.getGetCouponOfferMethod) == null) {
          SingleUseCouponsGrpc.getGetCouponOfferMethod = getGetCouponOfferMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCouponOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getCouponOffer"))
              .build();
        }
      }
    }
    return getGetCouponOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteCouponOfferMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCouponOffer",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteCouponOfferMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteCouponOfferMethod;
    if ((getDeleteCouponOfferMethod = SingleUseCouponsGrpc.getDeleteCouponOfferMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getDeleteCouponOfferMethod = SingleUseCouponsGrpc.getDeleteCouponOfferMethod) == null) {
          SingleUseCouponsGrpc.getDeleteCouponOfferMethod = getDeleteCouponOfferMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCouponOffer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("deleteCouponOffer"))
              .build();
        }
      }
    }
    return getDeleteCouponOfferMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponOffersDeprecated",
      requestType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersDeprecatedMethod;
    if ((getListCouponOffersDeprecatedMethod = SingleUseCouponsGrpc.getListCouponOffersDeprecatedMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponOffersDeprecatedMethod = SingleUseCouponsGrpc.getListCouponOffersDeprecatedMethod) == null) {
          SingleUseCouponsGrpc.getListCouponOffersDeprecatedMethod = getListCouponOffersDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponOffersDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponOffersDeprecated"))
              .build();
        }
      }
    }
    return getListCouponOffersDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponOffers",
      requestType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest.class,
      responseType = com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest,
      com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getListCouponOffersMethod;
    if ((getListCouponOffersMethod = SingleUseCouponsGrpc.getListCouponOffersMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponOffersMethod = SingleUseCouponsGrpc.getListCouponOffersMethod) == null) {
          SingleUseCouponsGrpc.getListCouponOffersMethod = getListCouponOffersMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest, com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponOffers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponOffers"))
              .build();
        }
      }
    }
    return getListCouponOffersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCoupon",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getCreateCouponMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id> getCreateCouponMethod;
    if ((getCreateCouponMethod = SingleUseCouponsGrpc.getCreateCouponMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCreateCouponMethod = SingleUseCouponsGrpc.getCreateCouponMethod) == null) {
          SingleUseCouponsGrpc.getCreateCouponMethod = getCreateCouponMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("createCoupon"))
              .build();
        }
      }
    }
    return getCreateCouponMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getUpdateCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCoupon",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getUpdateCouponMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id> getUpdateCouponMethod;
    if ((getUpdateCouponMethod = SingleUseCouponsGrpc.getUpdateCouponMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getUpdateCouponMethod = SingleUseCouponsGrpc.getUpdateCouponMethod) == null) {
          SingleUseCouponsGrpc.getUpdateCouponMethod = getUpdateCouponMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("updateCoupon"))
              .build();
        }
      }
    }
    return getUpdateCouponMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getStreamCouponUpdatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamCouponUpdates",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getStreamCouponUpdatesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id> getStreamCouponUpdatesMethod;
    if ((getStreamCouponUpdatesMethod = SingleUseCouponsGrpc.getStreamCouponUpdatesMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getStreamCouponUpdatesMethod = SingleUseCouponsGrpc.getStreamCouponUpdatesMethod) == null) {
          SingleUseCouponsGrpc.getStreamCouponUpdatesMethod = getStreamCouponUpdatesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamCouponUpdates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("streamCouponUpdates"))
              .build();
        }
      }
    }
    return getStreamCouponUpdatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getRedeemCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redeemCoupon",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getRedeemCouponMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id> getRedeemCouponMethod;
    if ((getRedeemCouponMethod = SingleUseCouponsGrpc.getRedeemCouponMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getRedeemCouponMethod = SingleUseCouponsGrpc.getRedeemCouponMethod) == null) {
          SingleUseCouponsGrpc.getRedeemCouponMethod = getRedeemCouponMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "redeemCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("redeemCoupon"))
              .build();
        }
      }
    }
    return getRedeemCouponMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getStreamCouponRedemptionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "streamCouponRedemptions",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.passkit.grpc.CommonObjects.Id> getStreamCouponRedemptionsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id> getStreamCouponRedemptionsMethod;
    if ((getStreamCouponRedemptionsMethod = SingleUseCouponsGrpc.getStreamCouponRedemptionsMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getStreamCouponRedemptionsMethod = SingleUseCouponsGrpc.getStreamCouponRedemptionsMethod) == null) {
          SingleUseCouponsGrpc.getStreamCouponRedemptionsMethod = getStreamCouponRedemptionsMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "streamCouponRedemptions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("streamCouponRedemptions"))
              .build();
        }
      }
    }
    return getStreamCouponRedemptionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCouponById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByIdMethod;
    if ((getGetCouponByIdMethod = SingleUseCouponsGrpc.getGetCouponByIdMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetCouponByIdMethod = SingleUseCouponsGrpc.getGetCouponByIdMethod) == null) {
          SingleUseCouponsGrpc.getGetCouponByIdMethod = getGetCouponByIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCouponById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getCouponById"))
              .build();
        }
      }
    }
    return getGetCouponByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByExternalIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCouponByExternalId",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest.class,
      responseType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByExternalIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getGetCouponByExternalIdMethod;
    if ((getGetCouponByExternalIdMethod = SingleUseCouponsGrpc.getGetCouponByExternalIdMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetCouponByExternalIdMethod = SingleUseCouponsGrpc.getGetCouponByExternalIdMethod) == null) {
          SingleUseCouponsGrpc.getGetCouponByExternalIdMethod = getGetCouponByExternalIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCouponByExternalId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getCouponByExternalId"))
              .build();
        }
      }
    }
    return getGetCouponByExternalIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.google.protobuf.Empty> getVoidCouponMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "voidCoupon",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
      com.google.protobuf.Empty> getVoidCouponMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.google.protobuf.Empty> getVoidCouponMethod;
    if ((getVoidCouponMethod = SingleUseCouponsGrpc.getVoidCouponMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getVoidCouponMethod = SingleUseCouponsGrpc.getVoidCouponMethod) == null) {
          SingleUseCouponsGrpc.getVoidCouponMethod = getVoidCouponMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "voidCoupon"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("voidCoupon"))
              .build();
        }
      }
    }
    return getVoidCouponMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponsByCouponCampaignDeprecated",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignDeprecatedMethod;
    if ((getListCouponsByCouponCampaignDeprecatedMethod = SingleUseCouponsGrpc.getListCouponsByCouponCampaignDeprecatedMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponsByCouponCampaignDeprecatedMethod = SingleUseCouponsGrpc.getListCouponsByCouponCampaignDeprecatedMethod) == null) {
          SingleUseCouponsGrpc.getListCouponsByCouponCampaignDeprecatedMethod = getListCouponsByCouponCampaignDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponsByCouponCampaignDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponsByCouponCampaignDeprecated"))
              .build();
        }
      }
    }
    return getListCouponsByCouponCampaignDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCouponsByCouponCampaign",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
      com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getListCouponsByCouponCampaignMethod;
    if ((getListCouponsByCouponCampaignMethod = SingleUseCouponsGrpc.getListCouponsByCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getListCouponsByCouponCampaignMethod = SingleUseCouponsGrpc.getListCouponsByCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getListCouponsByCouponCampaignMethod = getListCouponsByCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest, com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCouponsByCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("listCouponsByCouponCampaign"))
              .build();
        }
      }
    }
    return getListCouponsByCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
      com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countCouponsByCouponCampaignDeprecated",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
      com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated, com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignDeprecatedMethod;
    if ((getCountCouponsByCouponCampaignDeprecatedMethod = SingleUseCouponsGrpc.getCountCouponsByCouponCampaignDeprecatedMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCountCouponsByCouponCampaignDeprecatedMethod = SingleUseCouponsGrpc.getCountCouponsByCouponCampaignDeprecatedMethod) == null) {
          SingleUseCouponsGrpc.getCountCouponsByCouponCampaignDeprecatedMethod = getCountCouponsByCouponCampaignDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countCouponsByCouponCampaignDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("countCouponsByCouponCampaignDeprecated"))
              .build();
        }
      }
    }
    return getCountCouponsByCouponCampaignDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countCouponsByCouponCampaign",
      requestType = com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count> getCountCouponsByCouponCampaignMethod;
    if ((getCountCouponsByCouponCampaignMethod = SingleUseCouponsGrpc.getCountCouponsByCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCountCouponsByCouponCampaignMethod = SingleUseCouponsGrpc.getCountCouponsByCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getCountCouponsByCouponCampaignMethod = getCountCouponsByCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countCouponsByCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("countCouponsByCouponCampaign"))
              .build();
        }
      }
    }
    return getCountCouponsByCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyCouponCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyCouponCampaign",
      requestType = com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyCouponCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest, com.passkit.grpc.CommonObjects.Id> getCopyCouponCampaignMethod;
    if ((getCopyCouponCampaignMethod = SingleUseCouponsGrpc.getCopyCouponCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getCopyCouponCampaignMethod = SingleUseCouponsGrpc.getCopyCouponCampaignMethod) == null) {
          SingleUseCouponsGrpc.getCopyCouponCampaignMethod = getCopyCouponCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "copyCouponCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("copyCouponCampaign"))
              .build();
        }
      }
    }
    return getCopyCouponCampaignMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForCampaignMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMetaKeysForCampaign",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Strings.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForCampaignMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings> getGetMetaKeysForCampaignMethod;
    if ((getGetMetaKeysForCampaignMethod = SingleUseCouponsGrpc.getGetMetaKeysForCampaignMethod) == null) {
      synchronized (SingleUseCouponsGrpc.class) {
        if ((getGetMetaKeysForCampaignMethod = SingleUseCouponsGrpc.getGetMetaKeysForCampaignMethod) == null) {
          SingleUseCouponsGrpc.getGetMetaKeysForCampaignMethod = getGetMetaKeysForCampaignMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Strings>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMetaKeysForCampaign"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Strings.getDefaultInstance()))
              .setSchemaDescriptor(new SingleUseCouponsMethodDescriptorSupplier("getMetaKeysForCampaign"))
              .build();
        }
      }
    }
    return getGetMetaKeysForCampaignMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SingleUseCouponsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsStub>() {
        @java.lang.Override
        public SingleUseCouponsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleUseCouponsStub(channel, callOptions);
        }
      };
    return SingleUseCouponsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SingleUseCouponsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsBlockingStub>() {
        @java.lang.Override
        public SingleUseCouponsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleUseCouponsBlockingStub(channel, callOptions);
        }
      };
    return SingleUseCouponsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SingleUseCouponsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SingleUseCouponsFutureStub>() {
        @java.lang.Override
        public SingleUseCouponsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SingleUseCouponsFutureStub(channel, callOptions);
        }
      };
    return SingleUseCouponsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SingleUseCouponsImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void updateCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void getCouponCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void deleteCouponCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void listCouponCampaignsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponCampaignsDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void listCouponCampaigns(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponCampaignsMethod(), responseObserver);
    }

    /**
     */
    public void getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnalyticsMethod(), responseObserver);
    }

    /**
     */
    public void createCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCouponOfferMethod(), responseObserver);
    }

    /**
     */
    public void updateCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCouponOfferMethod(), responseObserver);
    }

    /**
     */
    public void getCouponOffer(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCouponOfferMethod(), responseObserver);
    }

    /**
     */
    public void deleteCouponOffer(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteCouponOfferMethod(), responseObserver);
    }

    /**
     */
    public void listCouponOffersDeprecated(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponOffersDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void listCouponOffers(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponOffersMethod(), responseObserver);
    }

    /**
     */
    public void createCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateCouponMethod(), responseObserver);
    }

    /**
     */
    public void updateCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateCouponMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> streamCouponUpdates(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamCouponUpdatesMethod(), responseObserver);
    }

    /**
     */
    public void redeemCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getRedeemCouponMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> streamCouponRedemptions(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return asyncUnimplementedStreamingCall(getStreamCouponRedemptionsMethod(), responseObserver);
    }

    /**
     */
    public void getCouponById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCouponByIdMethod(), responseObserver);
    }

    /**
     */
    public void getCouponByExternalId(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCouponByExternalIdMethod(), responseObserver);
    }

    /**
     */
    public void voidCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getVoidCouponMethod(), responseObserver);
    }

    /**
     */
    public void listCouponsByCouponCampaignDeprecated(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponsByCouponCampaignDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void listCouponsByCouponCampaign(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnimplementedUnaryCall(getListCouponsByCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void countCouponsByCouponCampaignDeprecated(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnimplementedUnaryCall(getCountCouponsByCouponCampaignDeprecatedMethod(), responseObserver);
    }

    /**
     */
    public void countCouponsByCouponCampaign(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnimplementedUnaryCall(getCountCouponsByCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void copyCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyCouponCampaignMethod(), responseObserver);
    }

    /**
     */
    public void getMetaKeysForCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMetaKeysForCampaignMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_COUPON_CAMPAIGN)))
          .addMethod(
            getUpdateCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign,
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>(
                  this, METHODID_UPDATE_COUPON_CAMPAIGN)))
          .addMethod(
            getGetCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>(
                  this, METHODID_GET_COUPON_CAMPAIGN)))
          .addMethod(
            getDeleteCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COUPON_CAMPAIGN)))
          .addMethod(
            getListCouponCampaignsDeprecatedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.PaginationOuterClass.Pagination,
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>(
                  this, METHODID_LIST_COUPON_CAMPAIGNS_DEPRECATED)))
          .addMethod(
            getListCouponCampaignsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>(
                  this, METHODID_LIST_COUPON_CAMPAIGNS)))
          .addMethod(
            getGetAnalyticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Reporting.AnalyticsRequest,
                com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse>(
                  this, METHODID_GET_ANALYTICS)))
          .addMethod(
            getCreateCouponOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_COUPON_OFFER)))
          .addMethod(
            getUpdateCouponOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer,
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>(
                  this, METHODID_UPDATE_COUPON_OFFER)))
          .addMethod(
            getGetCouponOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>(
                  this, METHODID_GET_COUPON_OFFER)))
          .addMethod(
            getDeleteCouponOfferMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_COUPON_OFFER)))
          .addMethod(
            getListCouponOffersDeprecatedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated,
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>(
                  this, METHODID_LIST_COUPON_OFFERS_DEPRECATED)))
          .addMethod(
            getListCouponOffersMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest,
                com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>(
                  this, METHODID_LIST_COUPON_OFFERS)))
          .addMethod(
            getCreateCouponMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_COUPON)))
          .addMethod(
            getUpdateCouponMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_UPDATE_COUPON)))
          .addMethod(
            getStreamCouponUpdatesMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_STREAM_COUPON_UPDATES)))
          .addMethod(
            getRedeemCouponMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_REDEEM_COUPON)))
          .addMethod(
            getStreamCouponRedemptionsMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_STREAM_COUPON_REDEMPTIONS)))
          .addMethod(
            getGetCouponByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>(
                  this, METHODID_GET_COUPON_BY_ID)))
          .addMethod(
            getGetCouponByExternalIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest,
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>(
                  this, METHODID_GET_COUPON_BY_EXTERNAL_ID)))
          .addMethod(
            getVoidCouponMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon,
                com.google.protobuf.Empty>(
                  this, METHODID_VOID_COUPON)))
          .addMethod(
            getListCouponsByCouponCampaignDeprecatedMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>(
                  this, METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED)))
          .addMethod(
            getListCouponsByCouponCampaignMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>(
                  this, METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN)))
          .addMethod(
            getCountCouponsByCouponCampaignDeprecatedMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated,
                com.passkit.grpc.CommonObjects.Count>(
                  this, METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED)))
          .addMethod(
            getCountCouponsByCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest,
                com.passkit.grpc.CommonObjects.Count>(
                  this, METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN)))
          .addMethod(
            getCopyCouponCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_COPY_COUPON_CAMPAIGN)))
          .addMethod(
            getGetMetaKeysForCampaignMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.CommonObjects.Strings>(
                  this, METHODID_GET_META_KEYS_FOR_CAMPAIGN)))
          .build();
    }
  }

  /**
   */
  public static final class SingleUseCouponsStub extends io.grpc.stub.AbstractAsyncStub<SingleUseCouponsStub> {
    private SingleUseCouponsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleUseCouponsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleUseCouponsStub(channel, callOptions);
    }

    /**
     */
    public void createCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCouponCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCouponCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponCampaignsDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponCampaignsDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponCampaigns(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponCampaignsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnalyticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCouponOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCouponOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCouponOffer(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCouponOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCouponOffer(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteCouponOfferMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponOffersDeprecated(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponOffersDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponOffers(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponOffersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateCouponMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateCouponMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> streamCouponUpdates(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamCouponUpdatesMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void redeemCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedeemCouponMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> streamCouponRedemptions(
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getStreamCouponRedemptionsMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void getCouponById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCouponByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCouponByExternalId(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCouponByExternalIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void voidCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVoidCouponMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponsByCouponCampaignDeprecated(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponsByCouponCampaignDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCouponsByCouponCampaign(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListCouponsByCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countCouponsByCouponCampaignDeprecated(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountCouponsByCouponCampaignDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countCouponsByCouponCampaign(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountCouponsByCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyCouponCampaignMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMetaKeysForCampaign(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMetaKeysForCampaignMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SingleUseCouponsBlockingStub extends io.grpc.stub.AbstractBlockingStub<SingleUseCouponsBlockingStub> {
    private SingleUseCouponsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleUseCouponsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleUseCouponsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request) {
      return blockingUnaryCall(
          getChannel(), getCreateCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign updateCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign getCouponCampaign(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCouponCampaign(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> listCouponCampaignsDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponCampaignsDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> listCouponCampaigns(
        com.passkit.grpc.Filter.Filters request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponCampaignsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnalyticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request) {
      return blockingUnaryCall(
          getChannel(), getCreateCouponOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer updateCouponOffer(com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCouponOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer getCouponOffer(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetCouponOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteCouponOffer(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getDeleteCouponOfferMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> listCouponOffersDeprecated(
        com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponOffersDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> listCouponOffers(
        com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponOffersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return blockingUnaryCall(
          getChannel(), getCreateCouponMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updateCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return blockingUnaryCall(
          getChannel(), getUpdateCouponMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id redeemCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return blockingUnaryCall(
          getChannel(), getRedeemCouponMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon getCouponById(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetCouponByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon getCouponByExternalId(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCouponByExternalIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty voidCoupon(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return blockingUnaryCall(
          getChannel(), getVoidCouponMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> listCouponsByCouponCampaignDeprecated(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponsByCouponCampaignDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> listCouponsByCouponCampaign(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListCouponsByCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countCouponsByCouponCampaignDeprecated(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request) {
      return blockingUnaryCall(
          getChannel(), getCountCouponsByCouponCampaignDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countCouponsByCouponCampaign(com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountCouponsByCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyCouponCampaign(com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCopyCouponCampaignMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Strings getMetaKeysForCampaign(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetMetaKeysForCampaignMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SingleUseCouponsFutureStub extends io.grpc.stub.AbstractFutureStub<SingleUseCouponsFutureStub> {
    private SingleUseCouponsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SingleUseCouponsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SingleUseCouponsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createCouponCampaign(
        com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> updateCouponCampaign(
        com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign> getCouponCampaign(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCouponCampaign(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse> getAnalytics(
        com.passkit.grpc.Reporting.AnalyticsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnalyticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createCouponOffer(
        com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCouponOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> updateCouponOffer(
        com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCouponOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer> getCouponOffer(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCouponOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCouponOffer(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteCouponOfferMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createCoupon(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateCouponMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateCoupon(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateCouponMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> redeemCoupon(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return futureUnaryCall(
          getChannel().newCall(getRedeemCouponMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getCouponById(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCouponByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon> getCouponByExternalId(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCouponByExternalIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> voidCoupon(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon request) {
      return futureUnaryCall(
          getChannel().newCall(getVoidCouponMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countCouponsByCouponCampaignDeprecated(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated request) {
      return futureUnaryCall(
          getChannel().newCall(getCountCouponsByCouponCampaignDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countCouponsByCouponCampaign(
        com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountCouponsByCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyCouponCampaign(
        com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyCouponCampaignMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Strings> getMetaKeysForCampaign(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMetaKeysForCampaignMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_COUPON_CAMPAIGN = 0;
  private static final int METHODID_UPDATE_COUPON_CAMPAIGN = 1;
  private static final int METHODID_GET_COUPON_CAMPAIGN = 2;
  private static final int METHODID_DELETE_COUPON_CAMPAIGN = 3;
  private static final int METHODID_LIST_COUPON_CAMPAIGNS_DEPRECATED = 4;
  private static final int METHODID_LIST_COUPON_CAMPAIGNS = 5;
  private static final int METHODID_GET_ANALYTICS = 6;
  private static final int METHODID_CREATE_COUPON_OFFER = 7;
  private static final int METHODID_UPDATE_COUPON_OFFER = 8;
  private static final int METHODID_GET_COUPON_OFFER = 9;
  private static final int METHODID_DELETE_COUPON_OFFER = 10;
  private static final int METHODID_LIST_COUPON_OFFERS_DEPRECATED = 11;
  private static final int METHODID_LIST_COUPON_OFFERS = 12;
  private static final int METHODID_CREATE_COUPON = 13;
  private static final int METHODID_UPDATE_COUPON = 14;
  private static final int METHODID_REDEEM_COUPON = 15;
  private static final int METHODID_GET_COUPON_BY_ID = 16;
  private static final int METHODID_GET_COUPON_BY_EXTERNAL_ID = 17;
  private static final int METHODID_VOID_COUPON = 18;
  private static final int METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED = 19;
  private static final int METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN = 20;
  private static final int METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED = 21;
  private static final int METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN = 22;
  private static final int METHODID_COPY_COUPON_CAMPAIGN = 23;
  private static final int METHODID_GET_META_KEYS_FOR_CAMPAIGN = 24;
  private static final int METHODID_STREAM_COUPON_UPDATES = 25;
  private static final int METHODID_STREAM_COUPON_REDEMPTIONS = 26;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SingleUseCouponsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SingleUseCouponsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_COUPON_CAMPAIGN:
          serviceImpl.createCouponCampaign((com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_COUPON_CAMPAIGN:
          serviceImpl.updateCouponCampaign((com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>) responseObserver);
          break;
        case METHODID_GET_COUPON_CAMPAIGN:
          serviceImpl.getCouponCampaign((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>) responseObserver);
          break;
        case METHODID_DELETE_COUPON_CAMPAIGN:
          serviceImpl.deleteCouponCampaign((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COUPON_CAMPAIGNS_DEPRECATED:
          serviceImpl.listCouponCampaignsDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>) responseObserver);
          break;
        case METHODID_LIST_COUPON_CAMPAIGNS:
          serviceImpl.listCouponCampaigns((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaign>) responseObserver);
          break;
        case METHODID_GET_ANALYTICS:
          serviceImpl.getAnalytics((com.passkit.grpc.Reporting.AnalyticsRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Campaign.CouponCampaignAnalyticsResponse>) responseObserver);
          break;
        case METHODID_CREATE_COUPON_OFFER:
          serviceImpl.createCouponOffer((com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_COUPON_OFFER:
          serviceImpl.updateCouponOffer((com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>) responseObserver);
          break;
        case METHODID_GET_COUPON_OFFER:
          serviceImpl.getCouponOffer((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>) responseObserver);
          break;
        case METHODID_DELETE_COUPON_OFFER:
          serviceImpl.deleteCouponOffer((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COUPON_OFFERS_DEPRECATED:
          serviceImpl.listCouponOffersDeprecated((com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>) responseObserver);
          break;
        case METHODID_LIST_COUPON_OFFERS:
          serviceImpl.listCouponOffers((com.passkit.grpc.SingleUseCoupons.Offer.CouponOffersListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.Offer.CouponOffer>) responseObserver);
          break;
        case METHODID_CREATE_COUPON:
          serviceImpl.createCoupon((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_COUPON:
          serviceImpl.updateCoupon((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_REDEEM_COUPON:
          serviceImpl.redeemCoupon((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_COUPON_BY_ID:
          serviceImpl.getCouponById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>) responseObserver);
          break;
        case METHODID_GET_COUPON_BY_EXTERNAL_ID:
          serviceImpl.getCouponByExternalId((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ExternalIdRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>) responseObserver);
          break;
        case METHODID_VOID_COUPON:
          serviceImpl.voidCoupon((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED:
          serviceImpl.listCouponsByCouponCampaignDeprecated((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>) responseObserver);
          break;
        case METHODID_LIST_COUPONS_BY_COUPON_CAMPAIGN:
          serviceImpl.listCouponsByCouponCampaign((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.SingleUseCoupons.CouponOuterClass.Coupon>) responseObserver);
          break;
        case METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN_DEPRECATED:
          serviceImpl.countCouponsByCouponCampaignDeprecated((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequestDeprecated) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_COUPONS_BY_COUPON_CAMPAIGN:
          serviceImpl.countCouponsByCouponCampaign((com.passkit.grpc.SingleUseCoupons.CouponOuterClass.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COPY_COUPON_CAMPAIGN:
          serviceImpl.copyCouponCampaign((com.passkit.grpc.SingleUseCoupons.Campaign.CampaignCopyRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_META_KEYS_FOR_CAMPAIGN:
          serviceImpl.getMetaKeysForCampaign((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Strings>) responseObserver);
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
        case METHODID_STREAM_COUPON_UPDATES:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamCouponUpdates(
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
        case METHODID_STREAM_COUPON_REDEMPTIONS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.streamCouponRedemptions(
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SingleUseCouponsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SingleUseCouponsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.SingleUseCoupons.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SingleUseCoupons");
    }
  }

  private static final class SingleUseCouponsFileDescriptorSupplier
      extends SingleUseCouponsBaseDescriptorSupplier {
    SingleUseCouponsFileDescriptorSupplier() {}
  }

  private static final class SingleUseCouponsMethodDescriptorSupplier
      extends SingleUseCouponsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SingleUseCouponsMethodDescriptorSupplier(String methodName) {
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
      synchronized (SingleUseCouponsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SingleUseCouponsFileDescriptorSupplier())
              .addMethod(getCreateCouponCampaignMethod())
              .addMethod(getUpdateCouponCampaignMethod())
              .addMethod(getGetCouponCampaignMethod())
              .addMethod(getDeleteCouponCampaignMethod())
              .addMethod(getListCouponCampaignsDeprecatedMethod())
              .addMethod(getListCouponCampaignsMethod())
              .addMethod(getGetAnalyticsMethod())
              .addMethod(getCreateCouponOfferMethod())
              .addMethod(getUpdateCouponOfferMethod())
              .addMethod(getGetCouponOfferMethod())
              .addMethod(getDeleteCouponOfferMethod())
              .addMethod(getListCouponOffersDeprecatedMethod())
              .addMethod(getListCouponOffersMethod())
              .addMethod(getCreateCouponMethod())
              .addMethod(getUpdateCouponMethod())
              .addMethod(getStreamCouponUpdatesMethod())
              .addMethod(getRedeemCouponMethod())
              .addMethod(getStreamCouponRedemptionsMethod())
              .addMethod(getGetCouponByIdMethod())
              .addMethod(getGetCouponByExternalIdMethod())
              .addMethod(getVoidCouponMethod())
              .addMethod(getListCouponsByCouponCampaignDeprecatedMethod())
              .addMethod(getListCouponsByCouponCampaignMethod())
              .addMethod(getCountCouponsByCouponCampaignDeprecatedMethod())
              .addMethod(getCountCouponsByCouponCampaignMethod())
              .addMethod(getCopyCouponCampaignMethod())
              .addMethod(getGetMetaKeysForCampaignMethod())
              .build();
        }
      }
    }
    return result;
  }
}
