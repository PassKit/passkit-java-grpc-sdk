package com.passkit.grpc.Flights;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.1)",
    comments = "Source: io/flights/a_rpc.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlightsGrpc {

  private FlightsGrpc() {}

  public static final String SERVICE_NAME = "flights.Flights";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port,
      com.google.protobuf.Empty> getCreatePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPort",
      requestType = com.passkit.grpc.Flights.Airport.Port.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port,
      com.google.protobuf.Empty> getCreatePortMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port, com.google.protobuf.Empty> getCreatePortMethod;
    if ((getCreatePortMethod = FlightsGrpc.getCreatePortMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getCreatePortMethod = FlightsGrpc.getCreatePortMethod) == null) {
          FlightsGrpc.getCreatePortMethod = getCreatePortMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.Airport.Port, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.Port.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("createPort"))
              .build();
        }
      }
    }
    return getCreatePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode,
      com.passkit.grpc.Flights.Airport.Port> getGetPortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getPort",
      requestType = com.passkit.grpc.Flights.Airport.AirportCode.class,
      responseType = com.passkit.grpc.Flights.Airport.Port.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode,
      com.passkit.grpc.Flights.Airport.Port> getGetPortMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode, com.passkit.grpc.Flights.Airport.Port> getGetPortMethod;
    if ((getGetPortMethod = FlightsGrpc.getGetPortMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetPortMethod = FlightsGrpc.getGetPortMethod) == null) {
          FlightsGrpc.getGetPortMethod = getGetPortMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.Airport.AirportCode, com.passkit.grpc.Flights.Airport.Port>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getPort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.AirportCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.Port.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getPort"))
              .build();
        }
      }
    }
    return getGetPortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port,
      com.passkit.grpc.Flights.Airport.Port> getUpdatePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updatePort",
      requestType = com.passkit.grpc.Flights.Airport.Port.class,
      responseType = com.passkit.grpc.Flights.Airport.Port.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port,
      com.passkit.grpc.Flights.Airport.Port> getUpdatePortMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.Port, com.passkit.grpc.Flights.Airport.Port> getUpdatePortMethod;
    if ((getUpdatePortMethod = FlightsGrpc.getUpdatePortMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getUpdatePortMethod = FlightsGrpc.getUpdatePortMethod) == null) {
          FlightsGrpc.getUpdatePortMethod = getUpdatePortMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.Airport.Port, com.passkit.grpc.Flights.Airport.Port>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updatePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.Port.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.Port.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("updatePort"))
              .build();
        }
      }
    }
    return getUpdatePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode,
      com.google.protobuf.Empty> getDeletePortMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deletePort",
      requestType = com.passkit.grpc.Flights.Airport.AirportCode.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode,
      com.google.protobuf.Empty> getDeletePortMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.Airport.AirportCode, com.google.protobuf.Empty> getDeletePortMethod;
    if ((getDeletePortMethod = FlightsGrpc.getDeletePortMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getDeletePortMethod = FlightsGrpc.getDeletePortMethod) == null) {
          FlightsGrpc.getDeletePortMethod = getDeletePortMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.Airport.AirportCode, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deletePort"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.Airport.AirportCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("deletePort"))
              .build();
        }
      }
    }
    return getDeletePortMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
      com.google.protobuf.Empty> getCreateCarrierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCarrier",
      requestType = com.passkit.grpc.Flights.CarrierOuterClass.Carrier.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
      com.google.protobuf.Empty> getCreateCarrierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier, com.google.protobuf.Empty> getCreateCarrierMethod;
    if ((getCreateCarrierMethod = FlightsGrpc.getCreateCarrierMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getCreateCarrierMethod = FlightsGrpc.getCreateCarrierMethod) == null) {
          FlightsGrpc.getCreateCarrierMethod = getCreateCarrierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.CarrierOuterClass.Carrier, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCarrier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.Carrier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("createCarrier"))
              .build();
        }
      }
    }
    return getCreateCarrierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
      com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getGetCarrierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCarrier",
      requestType = com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode.class,
      responseType = com.passkit.grpc.Flights.CarrierOuterClass.Carrier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
      com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getGetCarrierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode, com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getGetCarrierMethod;
    if ((getGetCarrierMethod = FlightsGrpc.getGetCarrierMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetCarrierMethod = FlightsGrpc.getGetCarrierMethod) == null) {
          FlightsGrpc.getGetCarrierMethod = getGetCarrierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode, com.passkit.grpc.Flights.CarrierOuterClass.Carrier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCarrier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.Carrier.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getCarrier"))
              .build();
        }
      }
    }
    return getGetCarrierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
      com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getUpdateCarrierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCarrier",
      requestType = com.passkit.grpc.Flights.CarrierOuterClass.Carrier.class,
      responseType = com.passkit.grpc.Flights.CarrierOuterClass.Carrier.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
      com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getUpdateCarrierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.Carrier, com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getUpdateCarrierMethod;
    if ((getUpdateCarrierMethod = FlightsGrpc.getUpdateCarrierMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getUpdateCarrierMethod = FlightsGrpc.getUpdateCarrierMethod) == null) {
          FlightsGrpc.getUpdateCarrierMethod = getUpdateCarrierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.CarrierOuterClass.Carrier, com.passkit.grpc.Flights.CarrierOuterClass.Carrier>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCarrier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.Carrier.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.Carrier.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("updateCarrier"))
              .build();
        }
      }
    }
    return getUpdateCarrierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
      com.google.protobuf.Empty> getDeleteCarrierMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCarrier",
      requestType = com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
      com.google.protobuf.Empty> getDeleteCarrierMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode, com.google.protobuf.Empty> getDeleteCarrierMethod;
    if ((getDeleteCarrierMethod = FlightsGrpc.getDeleteCarrierMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getDeleteCarrierMethod = FlightsGrpc.getDeleteCarrierMethod) == null) {
          FlightsGrpc.getDeleteCarrierMethod = getDeleteCarrierMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCarrier"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("deleteCarrier"))
              .build();
        }
      }
    }
    return getDeleteCarrierMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
      com.google.protobuf.Empty> getCreateFlightDesignatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createFlightDesignator",
      requestType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
      com.google.protobuf.Empty> getCreateFlightDesignatorMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator, com.google.protobuf.Empty> getCreateFlightDesignatorMethod;
    if ((getCreateFlightDesignatorMethod = FlightsGrpc.getCreateFlightDesignatorMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getCreateFlightDesignatorMethod = FlightsGrpc.getCreateFlightDesignatorMethod) == null) {
          FlightsGrpc.getCreateFlightDesignatorMethod = getCreateFlightDesignatorMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createFlightDesignator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("createFlightDesignator"))
              .build();
        }
      }
    }
    return getCreateFlightDesignatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
      com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getGetFlightDesignatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFlightDesignator",
      requestType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest.class,
      responseType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
      com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getGetFlightDesignatorMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest, com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getGetFlightDesignatorMethod;
    if ((getGetFlightDesignatorMethod = FlightsGrpc.getGetFlightDesignatorMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetFlightDesignatorMethod = FlightsGrpc.getGetFlightDesignatorMethod) == null) {
          FlightsGrpc.getGetFlightDesignatorMethod = getGetFlightDesignatorMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest, com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFlightDesignator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getFlightDesignator"))
              .build();
        }
      }
    }
    return getGetFlightDesignatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
      com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getUpdateFlightDesignatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFlightDesignator",
      requestType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.class,
      responseType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
      com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getUpdateFlightDesignatorMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator, com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getUpdateFlightDesignatorMethod;
    if ((getUpdateFlightDesignatorMethod = FlightsGrpc.getUpdateFlightDesignatorMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getUpdateFlightDesignatorMethod = FlightsGrpc.getUpdateFlightDesignatorMethod) == null) {
          FlightsGrpc.getUpdateFlightDesignatorMethod = getUpdateFlightDesignatorMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator, com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateFlightDesignator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("updateFlightDesignator"))
              .build();
        }
      }
    }
    return getUpdateFlightDesignatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
      com.google.protobuf.Empty> getDeleteFlightDesignatorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFlightDesignator",
      requestType = com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
      com.google.protobuf.Empty> getDeleteFlightDesignatorMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest, com.google.protobuf.Empty> getDeleteFlightDesignatorMethod;
    if ((getDeleteFlightDesignatorMethod = FlightsGrpc.getDeleteFlightDesignatorMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getDeleteFlightDesignatorMethod = FlightsGrpc.getDeleteFlightDesignatorMethod) == null) {
          FlightsGrpc.getDeleteFlightDesignatorMethod = getDeleteFlightDesignatorMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFlightDesignator"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("deleteFlightDesignator"))
              .build();
        }
      }
    }
    return getDeleteFlightDesignatorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight,
      com.google.protobuf.Empty> getCreateFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createFlight",
      requestType = com.passkit.grpc.Flights.FlightOuterClass.Flight.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight,
      com.google.protobuf.Empty> getCreateFlightMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight, com.google.protobuf.Empty> getCreateFlightMethod;
    if ((getCreateFlightMethod = FlightsGrpc.getCreateFlightMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getCreateFlightMethod = FlightsGrpc.getCreateFlightMethod) == null) {
          FlightsGrpc.getCreateFlightMethod = getCreateFlightMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightOuterClass.Flight, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.Flight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("createFlight"))
              .build();
        }
      }
    }
    return getCreateFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
      com.passkit.grpc.Flights.FlightOuterClass.Flight> getGetFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getFlight",
      requestType = com.passkit.grpc.Flights.FlightOuterClass.FlightRequest.class,
      responseType = com.passkit.grpc.Flights.FlightOuterClass.Flight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
      com.passkit.grpc.Flights.FlightOuterClass.Flight> getGetFlightMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest, com.passkit.grpc.Flights.FlightOuterClass.Flight> getGetFlightMethod;
    if ((getGetFlightMethod = FlightsGrpc.getGetFlightMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetFlightMethod = FlightsGrpc.getGetFlightMethod) == null) {
          FlightsGrpc.getGetFlightMethod = getGetFlightMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest, com.passkit.grpc.Flights.FlightOuterClass.Flight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.FlightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.Flight.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getFlight"))
              .build();
        }
      }
    }
    return getGetFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight,
      com.passkit.grpc.Flights.FlightOuterClass.Flight> getUpdateFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateFlight",
      requestType = com.passkit.grpc.Flights.FlightOuterClass.Flight.class,
      responseType = com.passkit.grpc.Flights.FlightOuterClass.Flight.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight,
      com.passkit.grpc.Flights.FlightOuterClass.Flight> getUpdateFlightMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.Flight, com.passkit.grpc.Flights.FlightOuterClass.Flight> getUpdateFlightMethod;
    if ((getUpdateFlightMethod = FlightsGrpc.getUpdateFlightMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getUpdateFlightMethod = FlightsGrpc.getUpdateFlightMethod) == null) {
          FlightsGrpc.getUpdateFlightMethod = getUpdateFlightMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightOuterClass.Flight, com.passkit.grpc.Flights.FlightOuterClass.Flight>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.Flight.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.Flight.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("updateFlight"))
              .build();
        }
      }
    }
    return getUpdateFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
      com.google.protobuf.Empty> getDeleteFlightMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteFlight",
      requestType = com.passkit.grpc.Flights.FlightOuterClass.FlightRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
      com.google.protobuf.Empty> getDeleteFlightMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest, com.google.protobuf.Empty> getDeleteFlightMethod;
    if ((getDeleteFlightMethod = FlightsGrpc.getDeleteFlightMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getDeleteFlightMethod = FlightsGrpc.getDeleteFlightMethod) == null) {
          FlightsGrpc.getDeleteFlightMethod = getDeleteFlightMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.FlightOuterClass.FlightRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteFlight"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.FlightOuterClass.FlightRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("deleteFlight"))
              .build();
        }
      }
    }
    return getDeleteFlightMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getCreateBoardingPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createBoardingPass",
      requestType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.class,
      responseType = com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getCreateBoardingPassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord, com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getCreateBoardingPassMethod;
    if ((getCreateBoardingPassMethod = FlightsGrpc.getCreateBoardingPassMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getCreateBoardingPassMethod = FlightsGrpc.getCreateBoardingPassMethod) == null) {
          FlightsGrpc.getCreateBoardingPassMethod = getCreateBoardingPassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord, com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createBoardingPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("createBoardingPass"))
              .build();
        }
      }
    }
    return getCreateBoardingPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getGetBoardingPassRecordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBoardingPassRecord",
      requestType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest.class,
      responseType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getGetBoardingPassRecordMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest, com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getGetBoardingPassRecordMethod;
    if ((getGetBoardingPassRecordMethod = FlightsGrpc.getGetBoardingPassRecordMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetBoardingPassRecordMethod = FlightsGrpc.getGetBoardingPassRecordMethod) == null) {
          FlightsGrpc.getGetBoardingPassRecordMethod = getGetBoardingPassRecordMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest, com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBoardingPassRecord"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getBoardingPassRecord"))
              .build();
        }
      }
    }
    return getGetBoardingPassRecordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getGetBoardingPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBoardingPass",
      requestType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest.class,
      responseType = com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getGetBoardingPassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest, com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getGetBoardingPassMethod;
    if ((getGetBoardingPassMethod = FlightsGrpc.getGetBoardingPassMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getGetBoardingPassMethod = FlightsGrpc.getGetBoardingPassMethod) == null) {
          FlightsGrpc.getGetBoardingPassMethod = getGetBoardingPassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest, com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBoardingPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("getBoardingPass"))
              .build();
        }
      }
    }
    return getGetBoardingPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getUpdateBoardingPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateBoardingPass",
      requestType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.class,
      responseType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
      com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getUpdateBoardingPassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord, com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getUpdateBoardingPassMethod;
    if ((getUpdateBoardingPassMethod = FlightsGrpc.getUpdateBoardingPassMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getUpdateBoardingPassMethod = FlightsGrpc.getUpdateBoardingPassMethod) == null) {
          FlightsGrpc.getUpdateBoardingPassMethod = getUpdateBoardingPassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord, com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateBoardingPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("updateBoardingPass"))
              .build();
        }
      }
    }
    return getUpdateBoardingPassMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
      com.google.protobuf.Empty> getDeleteBoardingPassMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteBoardingPass",
      requestType = com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
      com.google.protobuf.Empty> getDeleteBoardingPassMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest, com.google.protobuf.Empty> getDeleteBoardingPassMethod;
    if ((getDeleteBoardingPassMethod = FlightsGrpc.getDeleteBoardingPassMethod) == null) {
      synchronized (FlightsGrpc.class) {
        if ((getDeleteBoardingPassMethod = FlightsGrpc.getDeleteBoardingPassMethod) == null) {
          FlightsGrpc.getDeleteBoardingPassMethod = getDeleteBoardingPassMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteBoardingPass"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new FlightsMethodDescriptorSupplier("deleteBoardingPass"))
              .build();
        }
      }
    }
    return getDeleteBoardingPassMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlightsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightsStub>() {
        @java.lang.Override
        public FlightsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightsStub(channel, callOptions);
        }
      };
    return FlightsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlightsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightsBlockingStub>() {
        @java.lang.Override
        public FlightsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightsBlockingStub(channel, callOptions);
        }
      };
    return FlightsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlightsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlightsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlightsFutureStub>() {
        @java.lang.Override
        public FlightsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlightsFutureStub(channel, callOptions);
        }
      };
    return FlightsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     * <pre>
     * Create an airport record. Optional method allowing the carrier to specify how the airport name is rendered in the pass and the GPS location that will trigger a lock-screen alert.
     * </pre>
     */
    default void createPort(com.passkit.grpc.Flights.Airport.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve an airport record. The AirportCode is the three character IATA code or 4 character ICAO code.
     * </pre>
     */
    default void getPort(com.passkit.grpc.Flights.Airport.AirportCode request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update an airport record.
     * </pre>
     */
    default void updatePort(com.passkit.grpc.Flights.Airport.Port request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete an airport record. Deleting a record will remove any custom data provided. A new Airport record may be automatically created for a flight departing, arriving or transiting an airport which does not have a record, using publicly available data.
     * </pre>
     */
    default void deletePort(com.passkit.grpc.Flights.Airport.AirportCode request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeletePortMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a carrier record. All Flight Designations and Flights must have a carrier record.
     * </pre>
     */
    default void createCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCarrierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a carrier record.
     * </pre>
     */
    default void getCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarrierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a carrier record
     * </pre>
     */
    default void updateCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCarrierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a carrier record.
     * </pre>
     */
    default void deleteCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCarrierMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a flight designator record. As much default information as possible should be provided to facilitate the automatic generation of flight records.
     * </pre>
     */
    default void createFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlightDesignatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a flight designation record.
     * </pre>
     */
    default void getFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightDesignatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a flight designation record.
     * </pre>
     */
    default void updateFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlightDesignatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a flight designation record.
     * </pre>
     */
    default void deleteFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlightDesignatorMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a flight record. In practice, this method is not often used, since flight records can be automatically generated. Any information in the flight record will override information in the carrier and flight designation records.
     * </pre>
     */
    default void createFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a flight record.
     * </pre>
     */
    default void getFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a flight record.
     * </pre>
     */
    default void updateFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a flight record.
     * </pre>
     */
    default void deleteFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlightMethod(), responseObserver);
    }

    /**
     * <pre>
     * Create a boarding pass record. Flight related information not present in the boarding pass record will be populated from the flight, flight designator or carrier records.
     * </pre>
     */
    default void createBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBoardingPassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve a boarding pass record.
     * </pre>
     */
    default void getBoardingPassRecord(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardingPassRecordMethod(), responseObserver);
    }

    /**
     * <pre>
     * Retrieve digital boarding pass(es) in the requested format by ticket number, index, PNR or id.
     * </pre>
     */
    default void getBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoardingPassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Update a boarding pass record.
     * </pre>
     */
    default void updateBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBoardingPassMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete a boarding pass record.
     * </pre>
     */
    default void deleteBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBoardingPassMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Flights.
   */
  public static abstract class FlightsImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return FlightsGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Flights.
   */
  public static final class FlightsStub
      extends io.grpc.stub.AbstractAsyncStub<FlightsStub> {
    private FlightsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightsStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an airport record. Optional method allowing the carrier to specify how the airport name is rendered in the pass and the GPS location that will trigger a lock-screen alert.
     * </pre>
     */
    public void createPort(com.passkit.grpc.Flights.Airport.Port request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve an airport record. The AirportCode is the three character IATA code or 4 character ICAO code.
     * </pre>
     */
    public void getPort(com.passkit.grpc.Flights.Airport.AirportCode request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update an airport record.
     * </pre>
     */
    public void updatePort(com.passkit.grpc.Flights.Airport.Port request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete an airport record. Deleting a record will remove any custom data provided. A new Airport record may be automatically created for a flight departing, arriving or transiting an airport which does not have a record, using publicly available data.
     * </pre>
     */
    public void deletePort(com.passkit.grpc.Flights.Airport.AirportCode request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a carrier record. All Flight Designations and Flights must have a carrier record.
     * </pre>
     */
    public void createCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCarrierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a carrier record.
     * </pre>
     */
    public void getCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarrierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a carrier record
     * </pre>
     */
    public void updateCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCarrierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a carrier record.
     * </pre>
     */
    public void deleteCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCarrierMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a flight designator record. As much default information as possible should be provided to facilitate the automatic generation of flight records.
     * </pre>
     */
    public void createFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlightDesignatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a flight designation record.
     * </pre>
     */
    public void getFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightDesignatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a flight designation record.
     * </pre>
     */
    public void updateFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlightDesignatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a flight designation record.
     * </pre>
     */
    public void deleteFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlightDesignatorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a flight record. In practice, this method is not often used, since flight records can be automatically generated. Any information in the flight record will override information in the carrier and flight designation records.
     * </pre>
     */
    public void createFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a flight record.
     * </pre>
     */
    public void getFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a flight record.
     * </pre>
     */
    public void updateFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a flight record.
     * </pre>
     */
    public void deleteFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlightMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Create a boarding pass record. Flight related information not present in the boarding pass record will be populated from the flight, flight designator or carrier records.
     * </pre>
     */
    public void createBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBoardingPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve a boarding pass record.
     * </pre>
     */
    public void getBoardingPassRecord(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardingPassRecordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Retrieve digital boarding pass(es) in the requested format by ticket number, index, PNR or id.
     * </pre>
     */
    public void getBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoardingPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Update a boarding pass record.
     * </pre>
     */
    public void updateBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBoardingPassMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete a boarding pass record.
     * </pre>
     */
    public void deleteBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBoardingPassMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Flights.
   */
  public static final class FlightsBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<FlightsBlockingStub> {
    private FlightsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightsBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an airport record. Optional method allowing the carrier to specify how the airport name is rendered in the pass and the GPS location that will trigger a lock-screen alert.
     * </pre>
     */
    public com.google.protobuf.Empty createPort(com.passkit.grpc.Flights.Airport.Port request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve an airport record. The AirportCode is the three character IATA code or 4 character ICAO code.
     * </pre>
     */
    public com.passkit.grpc.Flights.Airport.Port getPort(com.passkit.grpc.Flights.Airport.AirportCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update an airport record.
     * </pre>
     */
    public com.passkit.grpc.Flights.Airport.Port updatePort(com.passkit.grpc.Flights.Airport.Port request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete an airport record. Deleting a record will remove any custom data provided. A new Airport record may be automatically created for a flight departing, arriving or transiting an airport which does not have a record, using publicly available data.
     * </pre>
     */
    public com.google.protobuf.Empty deletePort(com.passkit.grpc.Flights.Airport.AirportCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeletePortMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a carrier record. All Flight Designations and Flights must have a carrier record.
     * </pre>
     */
    public com.google.protobuf.Empty createCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCarrierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a carrier record.
     * </pre>
     */
    public com.passkit.grpc.Flights.CarrierOuterClass.Carrier getCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarrierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a carrier record
     * </pre>
     */
    public com.passkit.grpc.Flights.CarrierOuterClass.Carrier updateCarrier(com.passkit.grpc.Flights.CarrierOuterClass.Carrier request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCarrierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a carrier record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteCarrier(com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCarrierMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a flight designator record. As much default information as possible should be provided to facilitate the automatic generation of flight records.
     * </pre>
     */
    public com.google.protobuf.Empty createFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlightDesignatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a flight designation record.
     * </pre>
     */
    public com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator getFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightDesignatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a flight designation record.
     * </pre>
     */
    public com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator updateFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlightDesignatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a flight designation record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteFlightDesignator(com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlightDesignatorMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a flight record. In practice, this method is not often used, since flight records can be automatically generated. Any information in the flight record will override information in the carrier and flight designation records.
     * </pre>
     */
    public com.google.protobuf.Empty createFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a flight record.
     * </pre>
     */
    public com.passkit.grpc.Flights.FlightOuterClass.Flight getFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a flight record.
     * </pre>
     */
    public com.passkit.grpc.Flights.FlightOuterClass.Flight updateFlight(com.passkit.grpc.Flights.FlightOuterClass.Flight request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a flight record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteFlight(com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlightMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Create a boarding pass record. Flight related information not present in the boarding pass record will be populated from the flight, flight designator or carrier records.
     * </pre>
     */
    public com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse createBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBoardingPassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve a boarding pass record.
     * </pre>
     */
    public com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord getBoardingPassRecord(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardingPassRecordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Retrieve digital boarding pass(es) in the requested format by ticket number, index, PNR or id.
     * </pre>
     */
    public com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse getBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoardingPassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Update a boarding pass record.
     * </pre>
     */
    public com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord updateBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBoardingPassMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete a boarding pass record.
     * </pre>
     */
    public com.google.protobuf.Empty deleteBoardingPass(com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBoardingPassMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Flights.
   */
  public static final class FlightsFutureStub
      extends io.grpc.stub.AbstractFutureStub<FlightsFutureStub> {
    private FlightsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlightsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlightsFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Create an airport record. Optional method allowing the carrier to specify how the airport name is rendered in the pass and the GPS location that will trigger a lock-screen alert.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createPort(
        com.passkit.grpc.Flights.Airport.Port request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve an airport record. The AirportCode is the three character IATA code or 4 character ICAO code.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.Airport.Port> getPort(
        com.passkit.grpc.Flights.Airport.AirportCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update an airport record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.Airport.Port> updatePort(
        com.passkit.grpc.Flights.Airport.Port request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete an airport record. Deleting a record will remove any custom data provided. A new Airport record may be automatically created for a flight departing, arriving or transiting an airport which does not have a record, using publicly available data.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deletePort(
        com.passkit.grpc.Flights.Airport.AirportCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeletePortMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a carrier record. All Flight Designations and Flights must have a carrier record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createCarrier(
        com.passkit.grpc.Flights.CarrierOuterClass.Carrier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCarrierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a carrier record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> getCarrier(
        com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarrierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a carrier record
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.CarrierOuterClass.Carrier> updateCarrier(
        com.passkit.grpc.Flights.CarrierOuterClass.Carrier request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCarrierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a carrier record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteCarrier(
        com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCarrierMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a flight designator record. As much default information as possible should be provided to facilitate the automatic generation of flight records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createFlightDesignator(
        com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlightDesignatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a flight designation record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> getFlightDesignator(
        com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightDesignatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a flight designation record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator> updateFlightDesignator(
        com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlightDesignatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a flight designation record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteFlightDesignator(
        com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlightDesignatorMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a flight record. In practice, this method is not often used, since flight records can be automatically generated. Any information in the flight record will override information in the carrier and flight designation records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> createFlight(
        com.passkit.grpc.Flights.FlightOuterClass.Flight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a flight record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.FlightOuterClass.Flight> getFlight(
        com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a flight record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.FlightOuterClass.Flight> updateFlight(
        com.passkit.grpc.Flights.FlightOuterClass.Flight request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a flight record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteFlight(
        com.passkit.grpc.Flights.FlightOuterClass.FlightRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlightMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Create a boarding pass record. Flight related information not present in the boarding pass record will be populated from the flight, flight designator or carrier records.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> createBoardingPass(
        com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBoardingPassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve a boarding pass record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> getBoardingPassRecord(
        com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardingPassRecordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Retrieve digital boarding pass(es) in the requested format by ticket number, index, PNR or id.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse> getBoardingPass(
        com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoardingPassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Update a boarding pass record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord> updateBoardingPass(
        com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBoardingPassMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete a boarding pass record.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteBoardingPass(
        com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBoardingPassMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PORT = 0;
  private static final int METHODID_GET_PORT = 1;
  private static final int METHODID_UPDATE_PORT = 2;
  private static final int METHODID_DELETE_PORT = 3;
  private static final int METHODID_CREATE_CARRIER = 4;
  private static final int METHODID_GET_CARRIER = 5;
  private static final int METHODID_UPDATE_CARRIER = 6;
  private static final int METHODID_DELETE_CARRIER = 7;
  private static final int METHODID_CREATE_FLIGHT_DESIGNATOR = 8;
  private static final int METHODID_GET_FLIGHT_DESIGNATOR = 9;
  private static final int METHODID_UPDATE_FLIGHT_DESIGNATOR = 10;
  private static final int METHODID_DELETE_FLIGHT_DESIGNATOR = 11;
  private static final int METHODID_CREATE_FLIGHT = 12;
  private static final int METHODID_GET_FLIGHT = 13;
  private static final int METHODID_UPDATE_FLIGHT = 14;
  private static final int METHODID_DELETE_FLIGHT = 15;
  private static final int METHODID_CREATE_BOARDING_PASS = 16;
  private static final int METHODID_GET_BOARDING_PASS_RECORD = 17;
  private static final int METHODID_GET_BOARDING_PASS = 18;
  private static final int METHODID_UPDATE_BOARDING_PASS = 19;
  private static final int METHODID_DELETE_BOARDING_PASS = 20;

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
        case METHODID_CREATE_PORT:
          serviceImpl.createPort((com.passkit.grpc.Flights.Airport.Port) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PORT:
          serviceImpl.getPort((com.passkit.grpc.Flights.Airport.AirportCode) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port>) responseObserver);
          break;
        case METHODID_UPDATE_PORT:
          serviceImpl.updatePort((com.passkit.grpc.Flights.Airport.Port) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.Airport.Port>) responseObserver);
          break;
        case METHODID_DELETE_PORT:
          serviceImpl.deletePort((com.passkit.grpc.Flights.Airport.AirportCode) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_CARRIER:
          serviceImpl.createCarrier((com.passkit.grpc.Flights.CarrierOuterClass.Carrier) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_CARRIER:
          serviceImpl.getCarrier((com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier>) responseObserver);
          break;
        case METHODID_UPDATE_CARRIER:
          serviceImpl.updateCarrier((com.passkit.grpc.Flights.CarrierOuterClass.Carrier) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.CarrierOuterClass.Carrier>) responseObserver);
          break;
        case METHODID_DELETE_CARRIER:
          serviceImpl.deleteCarrier((com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_FLIGHT_DESIGNATOR:
          serviceImpl.createFlightDesignator((com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FLIGHT_DESIGNATOR:
          serviceImpl.getFlightDesignator((com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>) responseObserver);
          break;
        case METHODID_UPDATE_FLIGHT_DESIGNATOR:
          serviceImpl.updateFlightDesignator((com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>) responseObserver);
          break;
        case METHODID_DELETE_FLIGHT_DESIGNATOR:
          serviceImpl.deleteFlightDesignator((com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_FLIGHT:
          serviceImpl.createFlight((com.passkit.grpc.Flights.FlightOuterClass.Flight) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_FLIGHT:
          serviceImpl.getFlight((com.passkit.grpc.Flights.FlightOuterClass.FlightRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight>) responseObserver);
          break;
        case METHODID_UPDATE_FLIGHT:
          serviceImpl.updateFlight((com.passkit.grpc.Flights.FlightOuterClass.Flight) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.FlightOuterClass.Flight>) responseObserver);
          break;
        case METHODID_DELETE_FLIGHT:
          serviceImpl.deleteFlight((com.passkit.grpc.Flights.FlightOuterClass.FlightRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_CREATE_BOARDING_PASS:
          serviceImpl.createBoardingPass((com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>) responseObserver);
          break;
        case METHODID_GET_BOARDING_PASS_RECORD:
          serviceImpl.getBoardingPassRecord((com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>) responseObserver);
          break;
        case METHODID_GET_BOARDING_PASS:
          serviceImpl.getBoardingPass((com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BOARDING_PASS:
          serviceImpl.updateBoardingPass((com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>) responseObserver);
          break;
        case METHODID_DELETE_BOARDING_PASS:
          serviceImpl.deleteBoardingPass((com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest) request,
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePortMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.Airport.Port,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_PORT)))
        .addMethod(
          getGetPortMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.Airport.AirportCode,
              com.passkit.grpc.Flights.Airport.Port>(
                service, METHODID_GET_PORT)))
        .addMethod(
          getUpdatePortMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.Airport.Port,
              com.passkit.grpc.Flights.Airport.Port>(
                service, METHODID_UPDATE_PORT)))
        .addMethod(
          getDeletePortMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.Airport.AirportCode,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_PORT)))
        .addMethod(
          getCreateCarrierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_CARRIER)))
        .addMethod(
          getGetCarrierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
              com.passkit.grpc.Flights.CarrierOuterClass.Carrier>(
                service, METHODID_GET_CARRIER)))
        .addMethod(
          getUpdateCarrierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.CarrierOuterClass.Carrier,
              com.passkit.grpc.Flights.CarrierOuterClass.Carrier>(
                service, METHODID_UPDATE_CARRIER)))
        .addMethod(
          getDeleteCarrierMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.CarrierOuterClass.CarrierCode,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_CARRIER)))
        .addMethod(
          getCreateFlightDesignatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_FLIGHT_DESIGNATOR)))
        .addMethod(
          getGetFlightDesignatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>(
                service, METHODID_GET_FLIGHT_DESIGNATOR)))
        .addMethod(
          getUpdateFlightDesignatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator,
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignator>(
                service, METHODID_UPDATE_FLIGHT_DESIGNATOR)))
        .addMethod(
          getDeleteFlightDesignatorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightDesignatorOuterClass.FlightDesignatorRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_FLIGHT_DESIGNATOR)))
        .addMethod(
          getCreateFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightOuterClass.Flight,
              com.google.protobuf.Empty>(
                service, METHODID_CREATE_FLIGHT)))
        .addMethod(
          getGetFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
              com.passkit.grpc.Flights.FlightOuterClass.Flight>(
                service, METHODID_GET_FLIGHT)))
        .addMethod(
          getUpdateFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightOuterClass.Flight,
              com.passkit.grpc.Flights.FlightOuterClass.Flight>(
                service, METHODID_UPDATE_FLIGHT)))
        .addMethod(
          getDeleteFlightMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.FlightOuterClass.FlightRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_FLIGHT)))
        .addMethod(
          getCreateBoardingPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
              com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>(
                service, METHODID_CREATE_BOARDING_PASS)))
        .addMethod(
          getGetBoardingPassRecordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>(
                service, METHODID_GET_BOARDING_PASS_RECORD)))
        .addMethod(
          getGetBoardingPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRequest,
              com.passkit.grpc.Flights.BoardingPass.BoardingPassesResponse>(
                service, METHODID_GET_BOARDING_PASS)))
        .addMethod(
          getUpdateBoardingPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord,
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecord>(
                service, METHODID_UPDATE_BOARDING_PASS)))
        .addMethod(
          getDeleteBoardingPassMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Flights.BoardingPass.BoardingPassRecordRequest,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_BOARDING_PASS)))
        .build();
  }

  private static abstract class FlightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlightsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.Flights.ARpc.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Flights");
    }
  }

  private static final class FlightsFileDescriptorSupplier
      extends FlightsBaseDescriptorSupplier {
    FlightsFileDescriptorSupplier() {}
  }

  private static final class FlightsMethodDescriptorSupplier
      extends FlightsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlightsMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlightsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlightsFileDescriptorSupplier())
              .addMethod(getCreatePortMethod())
              .addMethod(getGetPortMethod())
              .addMethod(getUpdatePortMethod())
              .addMethod(getDeletePortMethod())
              .addMethod(getCreateCarrierMethod())
              .addMethod(getGetCarrierMethod())
              .addMethod(getUpdateCarrierMethod())
              .addMethod(getDeleteCarrierMethod())
              .addMethod(getCreateFlightDesignatorMethod())
              .addMethod(getGetFlightDesignatorMethod())
              .addMethod(getUpdateFlightDesignatorMethod())
              .addMethod(getDeleteFlightDesignatorMethod())
              .addMethod(getCreateFlightMethod())
              .addMethod(getGetFlightMethod())
              .addMethod(getUpdateFlightMethod())
              .addMethod(getDeleteFlightMethod())
              .addMethod(getCreateBoardingPassMethod())
              .addMethod(getGetBoardingPassRecordMethod())
              .addMethod(getGetBoardingPassMethod())
              .addMethod(getUpdateBoardingPassMethod())
              .addMethod(getDeleteBoardingPassMethod())
              .build();
        }
      }
    }
    return result;
  }
}
