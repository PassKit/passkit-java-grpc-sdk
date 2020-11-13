package com.passkit.grpc.EventTickets;

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
    comments = "Source: io/event_tickets/a_rpc.proto")
public final class EventTicketsGrpc {

  private EventTicketsGrpc() {}

  public static final String SERVICE_NAME = "event_tickets.EventTickets";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.CommonObjects.Id> getCreateProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createProduction",
      requestType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.CommonObjects.Id> getCreateProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.CommonObjects.Id> getCreateProductionMethod;
    if ((getCreateProductionMethod = EventTicketsGrpc.getCreateProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCreateProductionMethod = EventTicketsGrpc.getCreateProductionMethod) == null) {
          EventTicketsGrpc.getCreateProductionMethod = getCreateProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "createProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("createProduction"))
                  .build();
          }
        }
     }
     return getCreateProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getPatchProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchProduction",
      requestType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      responseType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getPatchProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getPatchProductionMethod;
    if ((getPatchProductionMethod = EventTicketsGrpc.getPatchProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getPatchProductionMethod = EventTicketsGrpc.getPatchProductionMethod) == null) {
          EventTicketsGrpc.getPatchProductionMethod = getPatchProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.EventTickets.ProductionOuterClass.Production>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "patchProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("patchProduction"))
                  .build();
          }
        }
     }
     return getPatchProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getUpdateProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateProduction",
      requestType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      responseType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getUpdateProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getUpdateProductionMethod;
    if ((getUpdateProductionMethod = EventTicketsGrpc.getUpdateProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getUpdateProductionMethod = EventTicketsGrpc.getUpdateProductionMethod) == null) {
          EventTicketsGrpc.getUpdateProductionMethod = getUpdateProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.passkit.grpc.EventTickets.ProductionOuterClass.Production>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "updateProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("updateProduction"))
                  .build();
          }
        }
     }
     return getUpdateProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getGetProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProduction",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getGetProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getGetProductionMethod;
    if ((getGetProductionMethod = EventTicketsGrpc.getGetProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetProductionMethod = EventTicketsGrpc.getGetProductionMethod) == null) {
          EventTicketsGrpc.getGetProductionMethod = getGetProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.ProductionOuterClass.Production>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getProduction"))
                  .build();
          }
        }
     }
     return getGetProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.google.protobuf.Empty> getDeleteProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteProduction",
      requestType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
      com.google.protobuf.Empty> getDeleteProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.google.protobuf.Empty> getDeleteProductionMethod;
    if ((getDeleteProductionMethod = EventTicketsGrpc.getDeleteProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteProductionMethod = EventTicketsGrpc.getDeleteProductionMethod) == null) {
          EventTicketsGrpc.getDeleteProductionMethod = getDeleteProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.ProductionOuterClass.Production, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteProduction"))
                  .build();
          }
        }
     }
     return getDeleteProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getListProductionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listProductions",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.EventTickets.ProductionOuterClass.Production.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getListProductionsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getListProductionsMethod;
    if ((getListProductionsMethod = EventTicketsGrpc.getListProductionsMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getListProductionsMethod = EventTicketsGrpc.getListProductionsMethod) == null) {
          EventTicketsGrpc.getListProductionsMethod = getListProductionsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.EventTickets.ProductionOuterClass.Production>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "listProductions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.Production.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("listProductions"))
                  .build();
          }
        }
     }
     return getListProductionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest,
      com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> getGetAnalyticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAnalytics",
      requestType = com.passkit.grpc.Reporting.AnalyticsRequest.class,
      responseType = com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest,
      com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> getGetAnalyticsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Reporting.AnalyticsRequest, com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> getGetAnalyticsMethod;
    if ((getGetAnalyticsMethod = EventTicketsGrpc.getGetAnalyticsMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetAnalyticsMethod = EventTicketsGrpc.getGetAnalyticsMethod) == null) {
          EventTicketsGrpc.getGetAnalyticsMethod = getGetAnalyticsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.Reporting.AnalyticsRequest, com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getAnalytics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Reporting.AnalyticsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getAnalytics"))
                  .build();
          }
        }
     }
     return getGetAnalyticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyProductionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "copyProduction",
      requestType = com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest,
      com.passkit.grpc.CommonObjects.Id> getCopyProductionMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest, com.passkit.grpc.CommonObjects.Id> getCopyProductionMethod;
    if ((getCopyProductionMethod = EventTicketsGrpc.getCopyProductionMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCopyProductionMethod = EventTicketsGrpc.getCopyProductionMethod) == null) {
          EventTicketsGrpc.getCopyProductionMethod = getCopyProductionMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "copyProduction"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("copyProduction"))
                  .build();
          }
        }
     }
     return getCopyProductionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.CommonObjects.Id> getCreateVenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createVenue",
      requestType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.CommonObjects.Id> getCreateVenueMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.CommonObjects.Id> getCreateVenueMethod;
    if ((getCreateVenueMethod = EventTicketsGrpc.getCreateVenueMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCreateVenueMethod = EventTicketsGrpc.getCreateVenueMethod) == null) {
          EventTicketsGrpc.getCreateVenueMethod = getCreateVenueMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "createVenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("createVenue"))
                  .build();
          }
        }
     }
     return getCreateVenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getUpdateVenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateVenue",
      requestType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      responseType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getUpdateVenueMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getUpdateVenueMethod;
    if ((getUpdateVenueMethod = EventTicketsGrpc.getUpdateVenueMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getUpdateVenueMethod = EventTicketsGrpc.getUpdateVenueMethod) == null) {
          EventTicketsGrpc.getUpdateVenueMethod = getUpdateVenueMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.EventTickets.VenueOuterClass.Venue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "updateVenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("updateVenue"))
                  .build();
          }
        }
     }
     return getUpdateVenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getPatchVenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchVenue",
      requestType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      responseType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getPatchVenueMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getPatchVenueMethod;
    if ((getPatchVenueMethod = EventTicketsGrpc.getPatchVenueMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getPatchVenueMethod = EventTicketsGrpc.getPatchVenueMethod) == null) {
          EventTicketsGrpc.getPatchVenueMethod = getPatchVenueMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.passkit.grpc.EventTickets.VenueOuterClass.Venue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "patchVenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("patchVenue"))
                  .build();
          }
        }
     }
     return getPatchVenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getGetVenueByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVenueById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getGetVenueByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getGetVenueByIdMethod;
    if ((getGetVenueByIdMethod = EventTicketsGrpc.getGetVenueByIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetVenueByIdMethod = EventTicketsGrpc.getGetVenueByIdMethod) == null) {
          EventTicketsGrpc.getGetVenueByIdMethod = getGetVenueByIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.VenueOuterClass.Venue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getVenueById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getVenueById"))
                  .build();
          }
        }
     }
     return getGetVenueByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.google.protobuf.Empty> getDeleteVenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteVenue",
      requestType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
      com.google.protobuf.Empty> getDeleteVenueMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.google.protobuf.Empty> getDeleteVenueMethod;
    if ((getDeleteVenueMethod = EventTicketsGrpc.getDeleteVenueMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteVenueMethod = EventTicketsGrpc.getDeleteVenueMethod) == null) {
          EventTicketsGrpc.getDeleteVenueMethod = getDeleteVenueMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.VenueOuterClass.Venue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteVenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteVenue"))
                  .build();
          }
        }
     }
     return getDeleteVenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getListVenuesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listVenues",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.EventTickets.VenueOuterClass.Venue.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getListVenuesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getListVenuesMethod;
    if ((getListVenuesMethod = EventTicketsGrpc.getListVenuesMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getListVenuesMethod = EventTicketsGrpc.getListVenuesMethod) == null) {
          EventTicketsGrpc.getListVenuesMethod = getListVenuesMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.EventTickets.VenueOuterClass.Venue>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "listVenues"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.VenueOuterClass.Venue.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("listVenues"))
                  .build();
          }
        }
     }
     return getListVenuesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.CommonObjects.Id> getCreateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createEvent",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.CommonObjects.Id> getCreateEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.CommonObjects.Id> getCreateEventMethod;
    if ((getCreateEventMethod = EventTicketsGrpc.getCreateEventMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCreateEventMethod = EventTicketsGrpc.getCreateEventMethod) == null) {
          EventTicketsGrpc.getCreateEventMethod = getCreateEventMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "createEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("createEvent"))
                  .build();
          }
        }
     }
     return getCreateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getUpdateEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateEvent",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      responseType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getUpdateEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.EventTickets.EventOuterClass.Event> getUpdateEventMethod;
    if ((getUpdateEventMethod = EventTicketsGrpc.getUpdateEventMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getUpdateEventMethod = EventTicketsGrpc.getUpdateEventMethod) == null) {
          EventTicketsGrpc.getUpdateEventMethod = getUpdateEventMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.EventTickets.EventOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "updateEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("updateEvent"))
                  .build();
          }
        }
     }
     return getUpdateEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getPatchEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchEvent",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      responseType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getPatchEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.EventTickets.EventOuterClass.Event> getPatchEventMethod;
    if ((getPatchEventMethod = EventTicketsGrpc.getPatchEventMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getPatchEventMethod = EventTicketsGrpc.getPatchEventMethod) == null) {
          EventTicketsGrpc.getPatchEventMethod = getPatchEventMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.passkit.grpc.EventTickets.EventOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "patchEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("patchEvent"))
                  .build();
          }
        }
     }
     return getPatchEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEventById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByIdMethod;
    if ((getGetEventByIdMethod = EventTicketsGrpc.getGetEventByIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetEventByIdMethod = EventTicketsGrpc.getGetEventByIdMethod) == null) {
          EventTicketsGrpc.getGetEventByIdMethod = getGetEventByIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.EventOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getEventById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getEventById"))
                  .build();
          }
        }
     }
     return getGetEventByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByStartDateAndVenueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEventByStartDateAndVenue",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest.class,
      responseType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest,
      com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByStartDateAndVenueMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest, com.passkit.grpc.EventTickets.EventOuterClass.Event> getGetEventByStartDateAndVenueMethod;
    if ((getGetEventByStartDateAndVenueMethod = EventTicketsGrpc.getGetEventByStartDateAndVenueMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetEventByStartDateAndVenueMethod = EventTicketsGrpc.getGetEventByStartDateAndVenueMethod) == null) {
          EventTicketsGrpc.getGetEventByStartDateAndVenueMethod = getGetEventByStartDateAndVenueMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest, com.passkit.grpc.EventTickets.EventOuterClass.Event>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getEventByStartDateAndVenue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getEventByStartDateAndVenue"))
                  .build();
          }
        }
     }
     return getGetEventByStartDateAndVenueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.google.protobuf.Empty> getDeleteEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteEvent",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.Event.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event,
      com.google.protobuf.Empty> getDeleteEventMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.google.protobuf.Empty> getDeleteEventMethod;
    if ((getDeleteEventMethod = EventTicketsGrpc.getDeleteEventMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteEventMethod = EventTicketsGrpc.getDeleteEventMethod) == null) {
          EventTicketsGrpc.getDeleteEventMethod = getDeleteEventMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.Event, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.Event.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteEvent"))
                  .build();
          }
        }
     }
     return getDeleteEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest,
      com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listEvents",
      requestType = com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest.class,
      responseType = com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest,
      com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest, com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> getListEventsMethod;
    if ((getListEventsMethod = EventTicketsGrpc.getListEventsMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getListEventsMethod = EventTicketsGrpc.getListEventsMethod) == null) {
          EventTicketsGrpc.getListEventsMethod = getListEventsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest, com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "listEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("listEvents"))
                  .build();
          }
        }
     }
     return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.CommonObjects.Id> getCreateTicketTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicketType",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.CommonObjects.Id> getCreateTicketTypeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.CommonObjects.Id> getCreateTicketTypeMethod;
    if ((getCreateTicketTypeMethod = EventTicketsGrpc.getCreateTicketTypeMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCreateTicketTypeMethod = EventTicketsGrpc.getCreateTicketTypeMethod) == null) {
          EventTicketsGrpc.getCreateTicketTypeMethod = getCreateTicketTypeMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "createTicketType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("createTicketType"))
                  .build();
          }
        }
     }
     return getCreateTicketTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getUpdateTicketTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTicketType",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      responseType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getUpdateTicketTypeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getUpdateTicketTypeMethod;
    if ((getUpdateTicketTypeMethod = EventTicketsGrpc.getUpdateTicketTypeMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getUpdateTicketTypeMethod = EventTicketsGrpc.getUpdateTicketTypeMethod) == null) {
          EventTicketsGrpc.getUpdateTicketTypeMethod = getUpdateTicketTypeMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "updateTicketType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("updateTicketType"))
                  .build();
          }
        }
     }
     return getUpdateTicketTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getPatchTicketTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "patchTicketType",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      responseType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getPatchTicketTypeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getPatchTicketTypeMethod;
    if ((getPatchTicketTypeMethod = EventTicketsGrpc.getPatchTicketTypeMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getPatchTicketTypeMethod = EventTicketsGrpc.getPatchTicketTypeMethod) == null) {
          EventTicketsGrpc.getPatchTicketTypeMethod = getPatchTicketTypeMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "patchTicketType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("patchTicketType"))
                  .build();
          }
        }
     }
     return getPatchTicketTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketTypeById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByIdMethod;
    if ((getGetTicketTypeByIdMethod = EventTicketsGrpc.getGetTicketTypeByIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetTicketTypeByIdMethod = EventTicketsGrpc.getGetTicketTypeByIdMethod) == null) {
          EventTicketsGrpc.getGetTicketTypeByIdMethod = getGetTicketTypeByIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getTicketTypeById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getTicketTypeById"))
                  .build();
          }
        }
     }
     return getGetTicketTypeByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByUserDefinedIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketTypeByUserDefinedId",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByUserDefinedIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getGetTicketTypeByUserDefinedIdMethod;
    if ((getGetTicketTypeByUserDefinedIdMethod = EventTicketsGrpc.getGetTicketTypeByUserDefinedIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetTicketTypeByUserDefinedIdMethod = EventTicketsGrpc.getGetTicketTypeByUserDefinedIdMethod) == null) {
          EventTicketsGrpc.getGetTicketTypeByUserDefinedIdMethod = getGetTicketTypeByUserDefinedIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getTicketTypeByUserDefinedId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getTicketTypeByUserDefinedId"))
                  .build();
          }
        }
     }
     return getGetTicketTypeByUserDefinedIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.google.protobuf.Empty> getDeleteTicketTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTicketType",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
      com.google.protobuf.Empty> getDeleteTicketTypeMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.google.protobuf.Empty> getDeleteTicketTypeMethod;
    if ((getDeleteTicketTypeMethod = EventTicketsGrpc.getDeleteTicketTypeMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteTicketTypeMethod = EventTicketsGrpc.getDeleteTicketTypeMethod) == null) {
          EventTicketsGrpc.getDeleteTicketTypeMethod = getDeleteTicketTypeMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteTicketType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteTicketType"))
                  .build();
          }
        }
     }
     return getDeleteTicketTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getListTicketTypesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTicketTypes",
      requestType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest,
      com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getListTicketTypesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getListTicketTypesMethod;
    if ((getListTicketTypesMethod = EventTicketsGrpc.getListTicketTypesMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getListTicketTypesMethod = EventTicketsGrpc.getListTicketTypesMethod) == null) {
          EventTicketsGrpc.getListTicketTypesMethod = getListTicketTypesMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest, com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "listTicketTypes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("listTicketTypes"))
                  .build();
          }
        }
     }
     return getListTicketTypesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest,
      com.passkit.grpc.CommonObjects.Id> getIssueTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "issueTicket",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest,
      com.passkit.grpc.CommonObjects.Id> getIssueTicketMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest, com.passkit.grpc.CommonObjects.Id> getIssueTicketMethod;
    if ((getIssueTicketMethod = EventTicketsGrpc.getIssueTicketMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getIssueTicketMethod = EventTicketsGrpc.getIssueTicketMethod) == null) {
          EventTicketsGrpc.getIssueTicketMethod = getIssueTicketMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "issueTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("issueTicket"))
                  .build();
          }
        }
     }
     return getIssueTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> getIssueTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "issueTicketById",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> getIssueTicketByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> getIssueTicketByIdMethod;
    if ((getIssueTicketByIdMethod = EventTicketsGrpc.getIssueTicketByIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getIssueTicketByIdMethod = EventTicketsGrpc.getIssueTicketByIdMethod) == null) {
          EventTicketsGrpc.getIssueTicketByIdMethod = getIssueTicketByIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "issueTicketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("issueTicketById"))
                  .build();
          }
        }
     }
     return getIssueTicketByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.CommonObjects.Id> getUpdateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateTicket",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.CommonObjects.Id> getUpdateTicketMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.CommonObjects.Id> getUpdateTicketMethod;
    if ((getUpdateTicketMethod = EventTicketsGrpc.getUpdateTicketMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getUpdateTicketMethod = EventTicketsGrpc.getUpdateTicketMethod) == null) {
          EventTicketsGrpc.getUpdateTicketMethod = getUpdateTicketMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "updateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("updateTicket"))
                  .build();
          }
        }
     }
     return getUpdateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> getValidateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateTicket",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> getValidateTicketMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest, com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> getValidateTicketMethod;
    if ((getValidateTicketMethod = EventTicketsGrpc.getValidateTicketMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getValidateTicketMethod = EventTicketsGrpc.getValidateTicketMethod) == null) {
          EventTicketsGrpc.getValidateTicketMethod = getValidateTicketMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest, com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "validateTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("validateTicket"))
                  .build();
          }
        }
     }
     return getValidateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.CommonObjects.Id> getRedeemTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redeemTicket",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.passkit.grpc.CommonObjects.Id> getRedeemTicketMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.CommonObjects.Id> getRedeemTicketMethod;
    if ((getRedeemTicketMethod = EventTicketsGrpc.getRedeemTicketMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getRedeemTicketMethod = EventTicketsGrpc.getRedeemTicketMethod) == null) {
          EventTicketsGrpc.getRedeemTicketMethod = getRedeemTicketMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "redeemTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("redeemTicket"))
                  .build();
          }
        }
     }
     return getRedeemTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber,
      com.passkit.grpc.CommonObjects.Ids> getRedeemTicketsByOrderNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "redeemTicketsByOrderNumber",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber.class,
      responseType = com.passkit.grpc.CommonObjects.Ids.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber,
      com.passkit.grpc.CommonObjects.Ids> getRedeemTicketsByOrderNumberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber, com.passkit.grpc.CommonObjects.Ids> getRedeemTicketsByOrderNumberMethod;
    if ((getRedeemTicketsByOrderNumberMethod = EventTicketsGrpc.getRedeemTicketsByOrderNumberMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getRedeemTicketsByOrderNumberMethod = EventTicketsGrpc.getRedeemTicketsByOrderNumberMethod) == null) {
          EventTicketsGrpc.getRedeemTicketsByOrderNumberMethod = getRedeemTicketsByOrderNumberMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber, com.passkit.grpc.CommonObjects.Ids>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "redeemTicketsByOrderNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Ids.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("redeemTicketsByOrderNumber"))
                  .build();
          }
        }
     }
     return getRedeemTicketsByOrderNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByIdMethod;
    if ((getGetTicketByIdMethod = EventTicketsGrpc.getGetTicketByIdMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetTicketByIdMethod = EventTicketsGrpc.getGetTicketByIdMethod) == null) {
          EventTicketsGrpc.getGetTicketByIdMethod = getGetTicketByIdMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getTicketById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getTicketById"))
                  .build();
          }
        }
     }
     return getGetTicketByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByTicketNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketByTicketNumber",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByTicketNumberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest, com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getGetTicketByTicketNumberMethod;
    if ((getGetTicketByTicketNumberMethod = EventTicketsGrpc.getGetTicketByTicketNumberMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetTicketByTicketNumberMethod = EventTicketsGrpc.getGetTicketByTicketNumberMethod) == null) {
          EventTicketsGrpc.getGetTicketByTicketNumberMethod = getGetTicketByTicketNumberMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest, com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getTicketByTicketNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getTicketByTicketNumber"))
                  .build();
          }
        }
     }
     return getGetTicketByTicketNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> getGetTicketsByOrderNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketsByOrderNumber",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.Tickets.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> getGetTicketsByOrderNumberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest, com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> getGetTicketsByOrderNumberMethod;
    if ((getGetTicketsByOrderNumberMethod = EventTicketsGrpc.getGetTicketsByOrderNumberMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetTicketsByOrderNumberMethod = EventTicketsGrpc.getGetTicketsByOrderNumberMethod) == null) {
          EventTicketsGrpc.getGetTicketsByOrderNumberMethod = getGetTicketsByOrderNumberMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest, com.passkit.grpc.EventTickets.TicketOuterClass.Tickets>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getTicketsByOrderNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Tickets.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getTicketsByOrderNumber"))
                  .build();
          }
        }
     }
     return getGetTicketsByOrderNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest,
      com.passkit.grpc.CommonObjects.PassBundles> getGetEventTicketPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getEventTicketPass",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest.class,
      responseType = com.passkit.grpc.CommonObjects.PassBundles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest,
      com.passkit.grpc.CommonObjects.PassBundles> getGetEventTicketPassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest, com.passkit.grpc.CommonObjects.PassBundles> getGetEventTicketPassMethod;
    if ((getGetEventTicketPassMethod = EventTicketsGrpc.getGetEventTicketPassMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getGetEventTicketPassMethod = EventTicketsGrpc.getGetEventTicketPassMethod) == null) {
          EventTicketsGrpc.getGetEventTicketPassMethod = getGetEventTicketPassMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest, com.passkit.grpc.CommonObjects.PassBundles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "getEventTicketPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.PassBundles.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("getEventTicketPass"))
                  .build();
          }
        }
     }
     return getGetEventTicketPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.google.protobuf.Empty> getDeleteTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTicket",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
      com.google.protobuf.Empty> getDeleteTicketMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.google.protobuf.Empty> getDeleteTicketMethod;
    if ((getDeleteTicketMethod = EventTicketsGrpc.getDeleteTicketMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteTicketMethod = EventTicketsGrpc.getDeleteTicketMethod) == null) {
          EventTicketsGrpc.getDeleteTicketMethod = getDeleteTicketMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.Ticket.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteTicket"))
                  .build();
          }
        }
     }
     return getDeleteTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
      com.google.protobuf.Empty> getDeleteTicketsByOrderNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteTicketsByOrderNumber",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
      com.google.protobuf.Empty> getDeleteTicketsByOrderNumberMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest, com.google.protobuf.Empty> getDeleteTicketsByOrderNumberMethod;
    if ((getDeleteTicketsByOrderNumberMethod = EventTicketsGrpc.getDeleteTicketsByOrderNumberMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getDeleteTicketsByOrderNumberMethod = EventTicketsGrpc.getDeleteTicketsByOrderNumberMethod) == null) {
          EventTicketsGrpc.getDeleteTicketsByOrderNumberMethod = getDeleteTicketsByOrderNumberMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "deleteTicketsByOrderNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("deleteTicketsByOrderNumber"))
                  .build();
          }
        }
     }
     return getDeleteTicketsByOrderNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> getListTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listTickets",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest.class,
      responseType = com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
      com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> getListTicketsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest, com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> getListTicketsMethod;
    if ((getListTicketsMethod = EventTicketsGrpc.getListTicketsMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getListTicketsMethod = EventTicketsGrpc.getListTicketsMethod) == null) {
          EventTicketsGrpc.getListTicketsMethod = getListTicketsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest, com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "listTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("listTickets"))
                  .build();
          }
        }
     }
     return getListTicketsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountTicketsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countTickets",
      requestType = com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
      com.passkit.grpc.CommonObjects.Count> getCountTicketsMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest, com.passkit.grpc.CommonObjects.Count> getCountTicketsMethod;
    if ((getCountTicketsMethod = EventTicketsGrpc.getCountTicketsMethod) == null) {
      synchronized (EventTicketsGrpc.class) {
        if ((getCountTicketsMethod = EventTicketsGrpc.getCountTicketsMethod) == null) {
          EventTicketsGrpc.getCountTicketsMethod = getCountTicketsMethod = 
              io.grpc.MethodDescriptor.<com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "event_tickets.EventTickets", "countTickets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
                  .setSchemaDescriptor(new EventTicketsMethodDescriptorSupplier("countTickets"))
                  .build();
          }
        }
     }
     return getCountTicketsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EventTicketsStub newStub(io.grpc.Channel channel) {
    return new EventTicketsStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EventTicketsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EventTicketsBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EventTicketsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EventTicketsFutureStub(channel);
  }

  /**
   */
  public static abstract class EventTicketsImplBase implements io.grpc.BindableService {

    /**
     */
    public void createProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateProductionMethod(), responseObserver);
    }

    /**
     */
    public void patchProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchProductionMethod(), responseObserver);
    }

    /**
     */
    public void updateProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateProductionMethod(), responseObserver);
    }

    /**
     */
    public void getProduction(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnimplementedUnaryCall(getGetProductionMethod(), responseObserver);
    }

    /**
     */
    public void deleteProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteProductionMethod(), responseObserver);
    }

    /**
     */
    public void listProductions(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnimplementedUnaryCall(getListProductionsMethod(), responseObserver);
    }

    /**
     */
    public void getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAnalyticsMethod(), responseObserver);
    }

    /**
     */
    public void copyProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCopyProductionMethod(), responseObserver);
    }

    /**
     */
    public void createVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateVenueMethod(), responseObserver);
    }

    /**
     */
    public void updateVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateVenueMethod(), responseObserver);
    }

    /**
     */
    public void patchVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchVenueMethod(), responseObserver);
    }

    /**
     */
    public void getVenueById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVenueByIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteVenueMethod(), responseObserver);
    }

    /**
     */
    public void listVenues(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnimplementedUnaryCall(getListVenuesMethod(), responseObserver);
    }

    /**
     */
    public void createEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateEventMethod(), responseObserver);
    }

    /**
     */
    public void updateEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateEventMethod(), responseObserver);
    }

    /**
     */
    public void patchEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchEventMethod(), responseObserver);
    }

    /**
     */
    public void getEventById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventByIdMethod(), responseObserver);
    }

    /**
     */
    public void getEventByStartDateAndVenue(com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventByStartDateAndVenueMethod(), responseObserver);
    }

    /**
     */
    public void deleteEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteEventMethod(), responseObserver);
    }

    /**
     */
    public void listEvents(com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     */
    public void createTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTicketTypeMethod(), responseObserver);
    }

    /**
     */
    public void updateTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketTypeMethod(), responseObserver);
    }

    /**
     */
    public void patchTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnimplementedUnaryCall(getPatchTicketTypeMethod(), responseObserver);
    }

    /**
     */
    public void getTicketTypeById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketTypeByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTicketTypeByUserDefinedId(com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketTypeByUserDefinedIdMethod(), responseObserver);
    }

    /**
     */
    public void deleteTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTicketTypeMethod(), responseObserver);
    }

    /**
     */
    public void listTicketTypes(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnimplementedUnaryCall(getListTicketTypesMethod(), responseObserver);
    }

    /**
     */
    public void issueTicket(com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueTicketMethod(), responseObserver);
    }

    /**
     */
    public void issueTicketById(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> responseObserver) {
      asyncUnimplementedUnaryCall(getIssueTicketByIdMethod(), responseObserver);
    }

    /**
     */
    public void updateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateTicketMethod(), responseObserver);
    }

    /**
     */
    public void validateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getValidateTicketMethod(), responseObserver);
    }

    /**
     */
    public void redeemTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnimplementedUnaryCall(getRedeemTicketMethod(), responseObserver);
    }

    /**
     */
    public void redeemTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Ids> responseObserver) {
      asyncUnimplementedUnaryCall(getRedeemTicketsByOrderNumberMethod(), responseObserver);
    }

    /**
     */
    public void getTicketById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketByIdMethod(), responseObserver);
    }

    /**
     */
    public void getTicketByTicketNumber(com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketByTicketNumberMethod(), responseObserver);
    }

    /**
     */
    public void getTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTicketsByOrderNumberMethod(), responseObserver);
    }

    /**
     */
    public void getEventTicketPass(com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.PassBundles> responseObserver) {
      asyncUnimplementedUnaryCall(getGetEventTicketPassMethod(), responseObserver);
    }

    /**
     */
    public void deleteTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTicketMethod(), responseObserver);
    }

    /**
     */
    public void deleteTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteTicketsByOrderNumberMethod(), responseObserver);
    }

    /**
     */
    public void listTickets(com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> responseObserver) {
      asyncUnimplementedUnaryCall(getListTicketsMethod(), responseObserver);
    }

    /**
     */
    public void countTickets(com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnimplementedUnaryCall(getCountTicketsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_PRODUCTION)))
          .addMethod(
            getPatchProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production>(
                  this, METHODID_PATCH_PRODUCTION)))
          .addMethod(
            getUpdateProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production>(
                  this, METHODID_UPDATE_PRODUCTION)))
          .addMethod(
            getGetProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production>(
                  this, METHODID_GET_PRODUCTION)))
          .addMethod(
            getDeleteProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_PRODUCTION)))
          .addMethod(
            getListProductionsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.EventTickets.ProductionOuterClass.Production>(
                  this, METHODID_LIST_PRODUCTIONS)))
          .addMethod(
            getGetAnalyticsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.Reporting.AnalyticsRequest,
                com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse>(
                  this, METHODID_GET_ANALYTICS)))
          .addMethod(
            getCopyProductionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_COPY_PRODUCTION)))
          .addMethod(
            getCreateVenueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_VENUE)))
          .addMethod(
            getUpdateVenueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue>(
                  this, METHODID_UPDATE_VENUE)))
          .addMethod(
            getPatchVenueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue>(
                  this, METHODID_PATCH_VENUE)))
          .addMethod(
            getGetVenueByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue>(
                  this, METHODID_GET_VENUE_BY_ID)))
          .addMethod(
            getDeleteVenueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_VENUE)))
          .addMethod(
            getListVenuesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.Filter.Filters,
                com.passkit.grpc.EventTickets.VenueOuterClass.Venue>(
                  this, METHODID_LIST_VENUES)))
          .addMethod(
            getCreateEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.Event,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_EVENT)))
          .addMethod(
            getUpdateEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.Event,
                com.passkit.grpc.EventTickets.EventOuterClass.Event>(
                  this, METHODID_UPDATE_EVENT)))
          .addMethod(
            getPatchEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.Event,
                com.passkit.grpc.EventTickets.EventOuterClass.Event>(
                  this, METHODID_PATCH_EVENT)))
          .addMethod(
            getGetEventByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.EventTickets.EventOuterClass.Event>(
                  this, METHODID_GET_EVENT_BY_ID)))
          .addMethod(
            getGetEventByStartDateAndVenueMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest,
                com.passkit.grpc.EventTickets.EventOuterClass.Event>(
                  this, METHODID_GET_EVENT_BY_START_DATE_AND_VENUE)))
          .addMethod(
            getDeleteEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.Event,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_EVENT)))
          .addMethod(
            getListEventsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest,
                com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse>(
                  this, METHODID_LIST_EVENTS)))
          .addMethod(
            getCreateTicketTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_CREATE_TICKET_TYPE)))
          .addMethod(
            getUpdateTicketTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>(
                  this, METHODID_UPDATE_TICKET_TYPE)))
          .addMethod(
            getPatchTicketTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>(
                  this, METHODID_PATCH_TICKET_TYPE)))
          .addMethod(
            getGetTicketTypeByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>(
                  this, METHODID_GET_TICKET_TYPE_BY_ID)))
          .addMethod(
            getGetTicketTypeByUserDefinedIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest,
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>(
                  this, METHODID_GET_TICKET_TYPE_BY_USER_DEFINED_ID)))
          .addMethod(
            getDeleteTicketTypeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TICKET_TYPE)))
          .addMethod(
            getListTicketTypesMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest,
                com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>(
                  this, METHODID_LIST_TICKET_TYPES)))
          .addMethod(
            getIssueTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_ISSUE_TICKET)))
          .addMethod(
            getIssueTicketByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
                com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds>(
                  this, METHODID_ISSUE_TICKET_BY_ID)))
          .addMethod(
            getUpdateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_UPDATE_TICKET)))
          .addMethod(
            getValidateTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest,
                com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse>(
                  this, METHODID_VALIDATE_TICKET)))
          .addMethod(
            getRedeemTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
                com.passkit.grpc.CommonObjects.Id>(
                  this, METHODID_REDEEM_TICKET)))
          .addMethod(
            getRedeemTicketsByOrderNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber,
                com.passkit.grpc.CommonObjects.Ids>(
                  this, METHODID_REDEEM_TICKETS_BY_ORDER_NUMBER)))
          .addMethod(
            getGetTicketByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.CommonObjects.Id,
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>(
                  this, METHODID_GET_TICKET_BY_ID)))
          .addMethod(
            getGetTicketByTicketNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest,
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>(
                  this, METHODID_GET_TICKET_BY_TICKET_NUMBER)))
          .addMethod(
            getGetTicketsByOrderNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
                com.passkit.grpc.EventTickets.TicketOuterClass.Tickets>(
                  this, METHODID_GET_TICKETS_BY_ORDER_NUMBER)))
          .addMethod(
            getGetEventTicketPassMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest,
                com.passkit.grpc.CommonObjects.PassBundles>(
                  this, METHODID_GET_EVENT_TICKET_PASS)))
          .addMethod(
            getDeleteTicketMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.Ticket,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TICKET)))
          .addMethod(
            getDeleteTicketsByOrderNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest,
                com.google.protobuf.Empty>(
                  this, METHODID_DELETE_TICKETS_BY_ORDER_NUMBER)))
          .addMethod(
            getListTicketsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
                com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields>(
                  this, METHODID_LIST_TICKETS)))
          .addMethod(
            getCountTicketsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest,
                com.passkit.grpc.CommonObjects.Count>(
                  this, METHODID_COUNT_TICKETS)))
          .build();
    }
  }

  /**
   */
  public static final class EventTicketsStub extends io.grpc.stub.AbstractStub<EventTicketsStub> {
    private EventTicketsStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTicketsStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTicketsStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTicketsStub(channel, callOptions);
    }

    /**
     */
    public void createProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProduction(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listProductions(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListProductionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAnalyticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void copyProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCopyProductionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateVenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateVenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchVenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVenueById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVenueByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteVenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listVenues(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListVenuesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventByStartDateAndVenue(com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventByStartDateAndVenueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listEvents(com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTicketTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void patchTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPatchTicketTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketTypeById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketTypeByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketTypeByUserDefinedId(com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketTypeByUserDefinedIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTicketTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTicketTypes(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListTicketTypesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void issueTicket(com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void issueTicketById(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIssueTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getValidateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeemTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedeemTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void redeemTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Ids> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRedeemTicketsByOrderNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketByTicketNumber(com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketByTicketNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTicketsByOrderNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getEventTicketPass(com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.PassBundles> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetEventTicketPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteTicketsByOrderNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTickets(com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getListTicketsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countTickets(com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountTicketsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EventTicketsBlockingStub extends io.grpc.stub.AbstractStub<EventTicketsBlockingStub> {
    private EventTicketsBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTicketsBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTicketsBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTicketsBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return blockingUnaryCall(
          getChannel(), getCreateProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.ProductionOuterClass.Production patchProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return blockingUnaryCall(
          getChannel(), getPatchProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.ProductionOuterClass.Production updateProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return blockingUnaryCall(
          getChannel(), getUpdateProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.ProductionOuterClass.Production getProduction(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return blockingUnaryCall(
          getChannel(), getDeleteProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> listProductions(
        com.passkit.grpc.Filter.Filters request) {
      return blockingServerStreamingCall(
          getChannel(), getListProductionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse getAnalytics(com.passkit.grpc.Reporting.AnalyticsRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAnalyticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id copyProduction(com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest request) {
      return blockingUnaryCall(
          getChannel(), getCopyProductionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return blockingUnaryCall(
          getChannel(), getCreateVenueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.VenueOuterClass.Venue updateVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return blockingUnaryCall(
          getChannel(), getUpdateVenueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.VenueOuterClass.Venue patchVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return blockingUnaryCall(
          getChannel(), getPatchVenueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.VenueOuterClass.Venue getVenueById(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetVenueByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteVenue(com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return blockingUnaryCall(
          getChannel(), getDeleteVenueMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> listVenues(
        com.passkit.grpc.Filter.Filters request) {
      return blockingServerStreamingCall(
          getChannel(), getListVenuesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return blockingUnaryCall(
          getChannel(), getCreateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.EventOuterClass.Event updateEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return blockingUnaryCall(
          getChannel(), getUpdateEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.EventOuterClass.Event patchEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return blockingUnaryCall(
          getChannel(), getPatchEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.EventOuterClass.Event getEventById(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetEventByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.EventOuterClass.Event getEventByStartDateAndVenue(com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventByStartDateAndVenueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteEvent(com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return blockingUnaryCall(
          getChannel(), getDeleteEventMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse> listEvents(
        com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id createTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return blockingUnaryCall(
          getChannel(), getCreateTicketTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType updateTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType patchTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return blockingUnaryCall(
          getChannel(), getPatchTicketTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType getTicketTypeById(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketTypeByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType getTicketTypeByUserDefinedId(com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketTypeByUserDefinedIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTicketType(com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTicketTypeMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> listTicketTypes(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListTicketTypesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id issueTicket(com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getIssueTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds issueTicketById(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getIssueTicketByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getUpdateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse validateTicket(com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest request) {
      return blockingUnaryCall(
          getChannel(), getValidateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id redeemTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getRedeemTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Ids redeemTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber request) {
      return blockingUnaryCall(
          getChannel(), getRedeemTicketsByOrderNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketOuterClass.Ticket getTicketById(com.passkit.grpc.CommonObjects.Id request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketOuterClass.Ticket getTicketByTicketNumber(com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketByTicketNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.EventTickets.TicketOuterClass.Tickets getTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTicketsByOrderNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.PassBundles getEventTicketPass(com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetEventTicketPassMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTicket(com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteTicketsByOrderNumber(com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteTicketsByOrderNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields> listTickets(
        com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getListTicketsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countTickets(com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountTicketsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EventTicketsFutureStub extends io.grpc.stub.AbstractStub<EventTicketsFutureStub> {
    private EventTicketsFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EventTicketsFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EventTicketsFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EventTicketsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createProduction(
        com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> patchProduction(
        com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> updateProduction(
        com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.ProductionOuterClass.Production> getProduction(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteProduction(
        com.passkit.grpc.EventTickets.ProductionOuterClass.Production request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse> getAnalytics(
        com.passkit.grpc.Reporting.AnalyticsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAnalyticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> copyProduction(
        com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCopyProductionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createVenue(
        com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateVenueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> updateVenue(
        com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateVenueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> patchVenue(
        com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchVenueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.VenueOuterClass.Venue> getVenueById(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVenueByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteVenue(
        com.passkit.grpc.EventTickets.VenueOuterClass.Venue request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteVenueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createEvent(
        com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.EventOuterClass.Event> updateEvent(
        com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.EventOuterClass.Event> patchEvent(
        com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.EventOuterClass.Event> getEventById(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.EventOuterClass.Event> getEventByStartDateAndVenue(
        com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventByStartDateAndVenueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteEvent(
        com.passkit.grpc.EventTickets.EventOuterClass.Event request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteEventMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> createTicketType(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTicketTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> updateTicketType(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> patchTicketType(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return futureUnaryCall(
          getChannel().newCall(getPatchTicketTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getTicketTypeById(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketTypeByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType> getTicketTypeByUserDefinedId(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketTypeByUserDefinedIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTicketType(
        com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTicketTypeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> issueTicket(
        com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds> issueTicketById(
        com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getIssueTicketByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateTicket(
        com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse> validateTicket(
        com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getValidateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> redeemTicket(
        com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getRedeemTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Ids> redeemTicketsByOrderNumber(
        com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber request) {
      return futureUnaryCall(
          getChannel().newCall(getRedeemTicketsByOrderNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getTicketById(
        com.passkit.grpc.CommonObjects.Id request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket> getTicketByTicketNumber(
        com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketByTicketNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.EventTickets.TicketOuterClass.Tickets> getTicketsByOrderNumber(
        com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTicketsByOrderNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.PassBundles> getEventTicketPass(
        com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetEventTicketPassMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTicket(
        com.passkit.grpc.EventTickets.TicketOuterClass.Ticket request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteTicketsByOrderNumber(
        com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteTicketsByOrderNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countTickets(
        com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountTicketsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRODUCTION = 0;
  private static final int METHODID_PATCH_PRODUCTION = 1;
  private static final int METHODID_UPDATE_PRODUCTION = 2;
  private static final int METHODID_GET_PRODUCTION = 3;
  private static final int METHODID_DELETE_PRODUCTION = 4;
  private static final int METHODID_LIST_PRODUCTIONS = 5;
  private static final int METHODID_GET_ANALYTICS = 6;
  private static final int METHODID_COPY_PRODUCTION = 7;
  private static final int METHODID_CREATE_VENUE = 8;
  private static final int METHODID_UPDATE_VENUE = 9;
  private static final int METHODID_PATCH_VENUE = 10;
  private static final int METHODID_GET_VENUE_BY_ID = 11;
  private static final int METHODID_DELETE_VENUE = 12;
  private static final int METHODID_LIST_VENUES = 13;
  private static final int METHODID_CREATE_EVENT = 14;
  private static final int METHODID_UPDATE_EVENT = 15;
  private static final int METHODID_PATCH_EVENT = 16;
  private static final int METHODID_GET_EVENT_BY_ID = 17;
  private static final int METHODID_GET_EVENT_BY_START_DATE_AND_VENUE = 18;
  private static final int METHODID_DELETE_EVENT = 19;
  private static final int METHODID_LIST_EVENTS = 20;
  private static final int METHODID_CREATE_TICKET_TYPE = 21;
  private static final int METHODID_UPDATE_TICKET_TYPE = 22;
  private static final int METHODID_PATCH_TICKET_TYPE = 23;
  private static final int METHODID_GET_TICKET_TYPE_BY_ID = 24;
  private static final int METHODID_GET_TICKET_TYPE_BY_USER_DEFINED_ID = 25;
  private static final int METHODID_DELETE_TICKET_TYPE = 26;
  private static final int METHODID_LIST_TICKET_TYPES = 27;
  private static final int METHODID_ISSUE_TICKET = 28;
  private static final int METHODID_ISSUE_TICKET_BY_ID = 29;
  private static final int METHODID_UPDATE_TICKET = 30;
  private static final int METHODID_VALIDATE_TICKET = 31;
  private static final int METHODID_REDEEM_TICKET = 32;
  private static final int METHODID_REDEEM_TICKETS_BY_ORDER_NUMBER = 33;
  private static final int METHODID_GET_TICKET_BY_ID = 34;
  private static final int METHODID_GET_TICKET_BY_TICKET_NUMBER = 35;
  private static final int METHODID_GET_TICKETS_BY_ORDER_NUMBER = 36;
  private static final int METHODID_GET_EVENT_TICKET_PASS = 37;
  private static final int METHODID_DELETE_TICKET = 38;
  private static final int METHODID_DELETE_TICKETS_BY_ORDER_NUMBER = 39;
  private static final int METHODID_LIST_TICKETS = 40;
  private static final int METHODID_COUNT_TICKETS = 41;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EventTicketsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EventTicketsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRODUCTION:
          serviceImpl.createProduction((com.passkit.grpc.EventTickets.ProductionOuterClass.Production) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_PATCH_PRODUCTION:
          serviceImpl.patchProduction((com.passkit.grpc.EventTickets.ProductionOuterClass.Production) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production>) responseObserver);
          break;
        case METHODID_UPDATE_PRODUCTION:
          serviceImpl.updateProduction((com.passkit.grpc.EventTickets.ProductionOuterClass.Production) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production>) responseObserver);
          break;
        case METHODID_GET_PRODUCTION:
          serviceImpl.getProduction((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production>) responseObserver);
          break;
        case METHODID_DELETE_PRODUCTION:
          serviceImpl.deleteProduction((com.passkit.grpc.EventTickets.ProductionOuterClass.Production) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_PRODUCTIONS:
          serviceImpl.listProductions((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.Production>) responseObserver);
          break;
        case METHODID_GET_ANALYTICS:
          serviceImpl.getAnalytics((com.passkit.grpc.Reporting.AnalyticsRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionAnalyticsResponse>) responseObserver);
          break;
        case METHODID_COPY_PRODUCTION:
          serviceImpl.copyProduction((com.passkit.grpc.EventTickets.ProductionOuterClass.ProductionCopyRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_CREATE_VENUE:
          serviceImpl.createVenue((com.passkit.grpc.EventTickets.VenueOuterClass.Venue) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_VENUE:
          serviceImpl.updateVenue((com.passkit.grpc.EventTickets.VenueOuterClass.Venue) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue>) responseObserver);
          break;
        case METHODID_PATCH_VENUE:
          serviceImpl.patchVenue((com.passkit.grpc.EventTickets.VenueOuterClass.Venue) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue>) responseObserver);
          break;
        case METHODID_GET_VENUE_BY_ID:
          serviceImpl.getVenueById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue>) responseObserver);
          break;
        case METHODID_DELETE_VENUE:
          serviceImpl.deleteVenue((com.passkit.grpc.EventTickets.VenueOuterClass.Venue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_VENUES:
          serviceImpl.listVenues((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.VenueOuterClass.Venue>) responseObserver);
          break;
        case METHODID_CREATE_EVENT:
          serviceImpl.createEvent((com.passkit.grpc.EventTickets.EventOuterClass.Event) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_EVENT:
          serviceImpl.updateEvent((com.passkit.grpc.EventTickets.EventOuterClass.Event) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event>) responseObserver);
          break;
        case METHODID_PATCH_EVENT:
          serviceImpl.patchEvent((com.passkit.grpc.EventTickets.EventOuterClass.Event) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event>) responseObserver);
          break;
        case METHODID_GET_EVENT_BY_ID:
          serviceImpl.getEventById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event>) responseObserver);
          break;
        case METHODID_GET_EVENT_BY_START_DATE_AND_VENUE:
          serviceImpl.getEventByStartDateAndVenue((com.passkit.grpc.EventTickets.EventOuterClass.GetEventRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.Event>) responseObserver);
          break;
        case METHODID_DELETE_EVENT:
          serviceImpl.deleteEvent((com.passkit.grpc.EventTickets.EventOuterClass.Event) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((com.passkit.grpc.EventTickets.EventOuterClass.EventListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.EventOuterClass.EventListResponse>) responseObserver);
          break;
        case METHODID_CREATE_TICKET_TYPE:
          serviceImpl.createTicketType((com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET_TYPE:
          serviceImpl.updateTicketType((com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>) responseObserver);
          break;
        case METHODID_PATCH_TICKET_TYPE:
          serviceImpl.patchTicketType((com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>) responseObserver);
          break;
        case METHODID_GET_TICKET_TYPE_BY_ID:
          serviceImpl.getTicketTypeById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>) responseObserver);
          break;
        case METHODID_GET_TICKET_TYPE_BY_USER_DEFINED_ID:
          serviceImpl.getTicketTypeByUserDefinedId((com.passkit.grpc.EventTickets.TicketTypeOuterClass.GetByUidRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>) responseObserver);
          break;
        case METHODID_DELETE_TICKET_TYPE:
          serviceImpl.deleteTicketType((com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TICKET_TYPES:
          serviceImpl.listTicketTypes((com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketTypeListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketTypeOuterClass.TicketType>) responseObserver);
          break;
        case METHODID_ISSUE_TICKET:
          serviceImpl.issueTicket((com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_ISSUE_TICKET_BY_ID:
          serviceImpl.issueTicketById((com.passkit.grpc.EventTickets.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.IssueTicketResponseIds>) responseObserver);
          break;
        case METHODID_UPDATE_TICKET:
          serviceImpl.updateTicket((com.passkit.grpc.EventTickets.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_VALIDATE_TICKET:
          serviceImpl.validateTicket((com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.ValidateTicketResponse>) responseObserver);
          break;
        case METHODID_REDEEM_TICKET:
          serviceImpl.redeemTicket((com.passkit.grpc.EventTickets.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_REDEEM_TICKETS_BY_ORDER_NUMBER:
          serviceImpl.redeemTicketsByOrderNumber((com.passkit.grpc.EventTickets.TicketOuterClass.RedeemByOrderNumber) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Ids>) responseObserver);
          break;
        case METHODID_GET_TICKET_BY_ID:
          serviceImpl.getTicketById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>) responseObserver);
          break;
        case METHODID_GET_TICKET_BY_TICKET_NUMBER:
          serviceImpl.getTicketByTicketNumber((com.passkit.grpc.EventTickets.TicketOuterClass.TicketNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Ticket>) responseObserver);
          break;
        case METHODID_GET_TICKETS_BY_ORDER_NUMBER:
          serviceImpl.getTicketsByOrderNumber((com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.Tickets>) responseObserver);
          break;
        case METHODID_GET_EVENT_TICKET_PASS:
          serviceImpl.getEventTicketPass((com.passkit.grpc.EventTickets.TicketOuterClass.EventTicketPassRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.PassBundles>) responseObserver);
          break;
        case METHODID_DELETE_TICKET:
          serviceImpl.deleteTicket((com.passkit.grpc.EventTickets.TicketOuterClass.Ticket) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_TICKETS_BY_ORDER_NUMBER:
          serviceImpl.deleteTicketsByOrderNumber((com.passkit.grpc.EventTickets.TicketOuterClass.OrderNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TICKETS:
          serviceImpl.listTickets((com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.EventTickets.TicketOuterClass.TicketLimitedFields>) responseObserver);
          break;
        case METHODID_COUNT_TICKETS:
          serviceImpl.countTickets((com.passkit.grpc.EventTickets.TicketOuterClass.TicketListRequest) request,
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

  private static abstract class EventTicketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EventTicketsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.EventTickets.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EventTickets");
    }
  }

  private static final class EventTicketsFileDescriptorSupplier
      extends EventTicketsBaseDescriptorSupplier {
    EventTicketsFileDescriptorSupplier() {}
  }

  private static final class EventTicketsMethodDescriptorSupplier
      extends EventTicketsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EventTicketsMethodDescriptorSupplier(String methodName) {
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
      synchronized (EventTicketsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EventTicketsFileDescriptorSupplier())
              .addMethod(getCreateProductionMethod())
              .addMethod(getPatchProductionMethod())
              .addMethod(getUpdateProductionMethod())
              .addMethod(getGetProductionMethod())
              .addMethod(getDeleteProductionMethod())
              .addMethod(getListProductionsMethod())
              .addMethod(getGetAnalyticsMethod())
              .addMethod(getCopyProductionMethod())
              .addMethod(getCreateVenueMethod())
              .addMethod(getUpdateVenueMethod())
              .addMethod(getPatchVenueMethod())
              .addMethod(getGetVenueByIdMethod())
              .addMethod(getDeleteVenueMethod())
              .addMethod(getListVenuesMethod())
              .addMethod(getCreateEventMethod())
              .addMethod(getUpdateEventMethod())
              .addMethod(getPatchEventMethod())
              .addMethod(getGetEventByIdMethod())
              .addMethod(getGetEventByStartDateAndVenueMethod())
              .addMethod(getDeleteEventMethod())
              .addMethod(getListEventsMethod())
              .addMethod(getCreateTicketTypeMethod())
              .addMethod(getUpdateTicketTypeMethod())
              .addMethod(getPatchTicketTypeMethod())
              .addMethod(getGetTicketTypeByIdMethod())
              .addMethod(getGetTicketTypeByUserDefinedIdMethod())
              .addMethod(getDeleteTicketTypeMethod())
              .addMethod(getListTicketTypesMethod())
              .addMethod(getIssueTicketMethod())
              .addMethod(getIssueTicketByIdMethod())
              .addMethod(getUpdateTicketMethod())
              .addMethod(getValidateTicketMethod())
              .addMethod(getRedeemTicketMethod())
              .addMethod(getRedeemTicketsByOrderNumberMethod())
              .addMethod(getGetTicketByIdMethod())
              .addMethod(getGetTicketByTicketNumberMethod())
              .addMethod(getGetTicketsByOrderNumberMethod())
              .addMethod(getGetEventTicketPassMethod())
              .addMethod(getDeleteTicketMethod())
              .addMethod(getDeleteTicketsByOrderNumberMethod())
              .addMethod(getListTicketsMethod())
              .addMethod(getCountTicketsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
