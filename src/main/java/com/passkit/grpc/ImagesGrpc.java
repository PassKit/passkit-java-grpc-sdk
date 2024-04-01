package com.passkit.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.60.0)",
    comments = "Source: io/core/a_rpc_images.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ImagesGrpc {

  private ImagesGrpc() {}

  public static final java.lang.String SERVICE_NAME = "io.Images";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.ProfileImageInput,
      com.google.protobuf.Empty> getSetProfileImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setProfileImage",
      requestType = com.passkit.grpc.Image.ProfileImageInput.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.ProfileImageInput,
      com.google.protobuf.Empty> getSetProfileImageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.ProfileImageInput, com.google.protobuf.Empty> getSetProfileImageMethod;
    if ((getSetProfileImageMethod = ImagesGrpc.getSetProfileImageMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getSetProfileImageMethod = ImagesGrpc.getSetProfileImageMethod) == null) {
          ImagesGrpc.getSetProfileImageMethod = getSetProfileImageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.ProfileImageInput, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setProfileImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ProfileImageInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("setProfileImage"))
              .build();
        }
      }
    }
    return getSetProfileImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Url> getGetProfileImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProfileImage",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.passkit.grpc.CommonObjects.Url> getGetProfileImageMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Url> getGetProfileImageMethod;
    if ((getGetProfileImageMethod = ImagesGrpc.getGetProfileImageMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetProfileImageMethod = ImagesGrpc.getGetProfileImageMethod) == null) {
          ImagesGrpc.getGetProfileImageMethod = getGetProfileImageMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProfileImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getProfileImage"))
              .build();
        }
      }
    }
    return getGetProfileImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.CreateImageInput,
      com.passkit.grpc.Image.ImageIds> getCreateImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createImages",
      requestType = com.passkit.grpc.Image.CreateImageInput.class,
      responseType = com.passkit.grpc.Image.ImageIds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.CreateImageInput,
      com.passkit.grpc.Image.ImageIds> getCreateImagesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.CreateImageInput, com.passkit.grpc.Image.ImageIds> getCreateImagesMethod;
    if ((getCreateImagesMethod = ImagesGrpc.getCreateImagesMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCreateImagesMethod = ImagesGrpc.getCreateImagesMethod) == null) {
          ImagesGrpc.getCreateImagesMethod = getCreateImagesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.CreateImageInput, com.passkit.grpc.Image.ImageIds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.CreateImageInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageIds.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("createImages"))
              .build();
        }
      }
    }
    return getCreateImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.UpdateImageInput,
      com.passkit.grpc.Image.ImageRecord> getUpdateImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateImage",
      requestType = com.passkit.grpc.Image.UpdateImageInput.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.UpdateImageInput,
      com.passkit.grpc.Image.ImageRecord> getUpdateImageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.UpdateImageInput, com.passkit.grpc.Image.ImageRecord> getUpdateImageMethod;
    if ((getUpdateImageMethod = ImagesGrpc.getUpdateImageMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getUpdateImageMethod = ImagesGrpc.getUpdateImageMethod) == null) {
          ImagesGrpc.getUpdateImageMethod = getUpdateImageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.UpdateImageInput, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.UpdateImageInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("updateImage"))
              .build();
        }
      }
    }
    return getUpdateImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Url> getGetImageURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getImageURL",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Url> getGetImageURLMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Url> getGetImageURLMethod;
    if ((getGetImageURLMethod = ImagesGrpc.getGetImageURLMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetImageURLMethod = ImagesGrpc.getGetImageURLMethod) == null) {
          ImagesGrpc.getGetImageURLMethod = getGetImageURLMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getImageURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getImageURL"))
              .build();
        }
      }
    }
    return getGetImageURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageRequest,
      com.passkit.grpc.CommonObjects.Url> getGetStampImageURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStampImageURL",
      requestType = com.passkit.grpc.Image.StampImageRequest.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageRequest,
      com.passkit.grpc.CommonObjects.Url> getGetStampImageURLMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageRequest, com.passkit.grpc.CommonObjects.Url> getGetStampImageURLMethod;
    if ((getGetStampImageURLMethod = ImagesGrpc.getGetStampImageURLMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetStampImageURLMethod = ImagesGrpc.getGetStampImageURLMethod) == null) {
          ImagesGrpc.getGetStampImageURLMethod = getGetStampImageURLMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.StampImageRequest, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStampImageURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.StampImageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getStampImageURL"))
              .build();
        }
      }
    }
    return getGetStampImageURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.StampImageConfig> getGetStampImageConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStampImageConfig",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Image.StampImageConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.StampImageConfig> getGetStampImageConfigMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.StampImageConfig> getGetStampImageConfigMethod;
    if ((getGetStampImageConfigMethod = ImagesGrpc.getGetStampImageConfigMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetStampImageConfigMethod = ImagesGrpc.getGetStampImageConfigMethod) == null) {
          ImagesGrpc.getGetStampImageConfigMethod = getGetStampImageConfigMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.StampImageConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStampImageConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.StampImageConfig.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getStampImageConfig"))
              .build();
        }
      }
    }
    return getGetStampImageConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageConfig,
      com.passkit.grpc.CommonObjects.Id> getUpdateStampImageConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateStampImageConfig",
      requestType = com.passkit.grpc.Image.StampImageConfig.class,
      responseType = com.passkit.grpc.CommonObjects.Id.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageConfig,
      com.passkit.grpc.CommonObjects.Id> getUpdateStampImageConfigMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImageConfig, com.passkit.grpc.CommonObjects.Id> getUpdateStampImageConfigMethod;
    if ((getUpdateStampImageConfigMethod = ImagesGrpc.getUpdateStampImageConfigMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getUpdateStampImageConfigMethod = ImagesGrpc.getUpdateStampImageConfigMethod) == null) {
          ImagesGrpc.getUpdateStampImageConfigMethod = getUpdateStampImageConfigMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.StampImageConfig, com.passkit.grpc.CommonObjects.Id>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateStampImageConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.StampImageConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("updateStampImageConfig"))
              .build();
        }
      }
    }
    return getUpdateStampImageConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImagePreviewRequest,
      com.passkit.grpc.Image.StampImagePreview> getGetStampImagePreviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStampImagePreview",
      requestType = com.passkit.grpc.Image.StampImagePreviewRequest.class,
      responseType = com.passkit.grpc.Image.StampImagePreview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImagePreviewRequest,
      com.passkit.grpc.Image.StampImagePreview> getGetStampImagePreviewMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.StampImagePreviewRequest, com.passkit.grpc.Image.StampImagePreview> getGetStampImagePreviewMethod;
    if ((getGetStampImagePreviewMethod = ImagesGrpc.getGetStampImagePreviewMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetStampImagePreviewMethod = ImagesGrpc.getGetStampImagePreviewMethod) == null) {
          ImagesGrpc.getGetStampImagePreviewMethod = getGetStampImagePreviewMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.StampImagePreviewRequest, com.passkit.grpc.Image.StampImagePreview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStampImagePreview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.StampImagePreviewRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.StampImagePreview.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getStampImagePreview"))
              .build();
        }
      }
    }
    return getGetStampImagePreviewMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput,
      com.passkit.grpc.CommonObjects.Url> getGetLocalizedImageURLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getLocalizedImageURL",
      requestType = com.passkit.grpc.Image.LocalizedImageInput.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput,
      com.passkit.grpc.CommonObjects.Url> getGetLocalizedImageURLMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput, com.passkit.grpc.CommonObjects.Url> getGetLocalizedImageURLMethod;
    if ((getGetLocalizedImageURLMethod = ImagesGrpc.getGetLocalizedImageURLMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetLocalizedImageURLMethod = ImagesGrpc.getGetLocalizedImageURLMethod) == null) {
          ImagesGrpc.getGetLocalizedImageURLMethod = getGetLocalizedImageURLMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.LocalizedImageInput, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getLocalizedImageURL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.LocalizedImageInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getLocalizedImageURL"))
              .build();
        }
      }
    }
    return getGetLocalizedImageURLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Url> getGetProfileImageByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProfileImageById",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.CommonObjects.Url.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.CommonObjects.Url> getGetProfileImageByIdMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Url> getGetProfileImageByIdMethod;
    if ((getGetProfileImageByIdMethod = ImagesGrpc.getGetProfileImageByIdMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetProfileImageByIdMethod = ImagesGrpc.getGetProfileImageByIdMethod) == null) {
          ImagesGrpc.getGetProfileImageByIdMethod = getGetProfileImageByIdMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.CommonObjects.Url>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProfileImageById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Url.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getProfileImageById"))
              .build();
        }
      }
    }
    return getGetProfileImageByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.ImageBundle> getGetImageBundleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getImageBundle",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Image.ImageBundle.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.ImageBundle> getGetImageBundleMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.ImageBundle> getGetImageBundleMethod;
    if ((getGetImageBundleMethod = ImagesGrpc.getGetImageBundleMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetImageBundleMethod = ImagesGrpc.getGetImageBundleMethod) == null) {
          ImagesGrpc.getGetImageBundleMethod = getGetImageBundleMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.ImageBundle>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getImageBundle"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageBundle.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getImageBundle"))
              .build();
        }
      }
    }
    return getGetImageBundleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.ImageRecord> getGetImageDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getImageData",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.passkit.grpc.Image.ImageRecord> getGetImageDataMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.ImageRecord> getGetImageDataMethod;
    if ((getGetImageDataMethod = ImagesGrpc.getGetImageDataMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getGetImageDataMethod = ImagesGrpc.getGetImageDataMethod) == null) {
          ImagesGrpc.getGetImageDataMethod = getGetImageDataMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getImageData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("getImageData"))
              .build();
        }
      }
    }
    return getGetImageDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteImage",
      requestType = com.passkit.grpc.CommonObjects.Id.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id,
      com.google.protobuf.Empty> getDeleteImageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty> getDeleteImageMethod;
    if ((getDeleteImageMethod = ImagesGrpc.getDeleteImageMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getDeleteImageMethod = ImagesGrpc.getDeleteImageMethod) == null) {
          ImagesGrpc.getDeleteImageMethod = getDeleteImageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.CommonObjects.Id, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Id.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("deleteImage"))
              .build();
        }
      }
    }
    return getDeleteImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput,
      com.passkit.grpc.Image.ImageRecord> getDeleteLocalizedImageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteLocalizedImage",
      requestType = com.passkit.grpc.Image.LocalizedImageInput.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput,
      com.passkit.grpc.Image.ImageRecord> getDeleteLocalizedImageMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Image.LocalizedImageInput, com.passkit.grpc.Image.ImageRecord> getDeleteLocalizedImageMethod;
    if ((getDeleteLocalizedImageMethod = ImagesGrpc.getDeleteLocalizedImageMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getDeleteLocalizedImageMethod = ImagesGrpc.getDeleteLocalizedImageMethod) == null) {
          ImagesGrpc.getDeleteLocalizedImageMethod = getDeleteLocalizedImageMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Image.LocalizedImageInput, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteLocalizedImage"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.LocalizedImageInput.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("deleteLocalizedImage"))
              .build();
        }
      }
    }
    return getDeleteLocalizedImageMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Image.ImageRecord> getListImagesForUserDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listImagesForUserDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Image.ImageRecord> getListImagesForUserDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Image.ImageRecord> getListImagesForUserDeprecatedMethod;
    if ((getListImagesForUserDeprecatedMethod = ImagesGrpc.getListImagesForUserDeprecatedMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getListImagesForUserDeprecatedMethod = ImagesGrpc.getListImagesForUserDeprecatedMethod) == null) {
          ImagesGrpc.getListImagesForUserDeprecatedMethod = getListImagesForUserDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listImagesForUserDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("listImagesForUserDeprecated"))
              .build();
        }
      }
    }
    return getListImagesForUserDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Image.ImageRecord> getListImagesForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listImagesForUser",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Image.ImageRecord> getListImagesForUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Image.ImageRecord> getListImagesForUserMethod;
    if ((getListImagesForUserMethod = ImagesGrpc.getListImagesForUserMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getListImagesForUserMethod = ImagesGrpc.getListImagesForUserMethod) == null) {
          ImagesGrpc.getListImagesForUserMethod = getListImagesForUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listImagesForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("listImagesForUser"))
              .build();
        }
      }
    }
    return getListImagesForUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Image.ImageRecord> getListImagesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listImagesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.Image.ImageRecord> getListImagesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Image.ImageRecord> getListImagesDeprecatedMethod;
    if ((getListImagesDeprecatedMethod = ImagesGrpc.getListImagesDeprecatedMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getListImagesDeprecatedMethod = ImagesGrpc.getListImagesDeprecatedMethod) == null) {
          ImagesGrpc.getListImagesDeprecatedMethod = getListImagesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listImagesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("listImagesDeprecated"))
              .build();
        }
      }
    }
    return getListImagesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Image.ImageRecord> getListImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listImages",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.Image.ImageRecord.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.Image.ImageRecord> getListImagesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Image.ImageRecord> getListImagesMethod;
    if ((getListImagesMethod = ImagesGrpc.getListImagesMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getListImagesMethod = ImagesGrpc.getListImagesMethod) == null) {
          ImagesGrpc.getListImagesMethod = getListImagesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.Image.ImageRecord>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Image.ImageRecord.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("listImages"))
              .build();
        }
      }
    }
    return getListImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountImagesDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countImagesDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountImagesDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountImagesDeprecatedMethod;
    if ((getCountImagesDeprecatedMethod = ImagesGrpc.getCountImagesDeprecatedMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCountImagesDeprecatedMethod = ImagesGrpc.getCountImagesDeprecatedMethod) == null) {
          ImagesGrpc.getCountImagesDeprecatedMethod = getCountImagesDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countImagesDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("countImagesDeprecated"))
              .build();
        }
      }
    }
    return getCountImagesDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountImagesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countImages",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountImagesMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountImagesMethod;
    if ((getCountImagesMethod = ImagesGrpc.getCountImagesMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCountImagesMethod = ImagesGrpc.getCountImagesMethod) == null) {
          ImagesGrpc.getCountImagesMethod = getCountImagesMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countImages"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("countImages"))
              .build();
        }
      }
    }
    return getCountImagesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountImagesForUserDeprecatedMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countImagesForUserDeprecated",
      requestType = com.passkit.grpc.PaginationOuterClass.Pagination.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination,
      com.passkit.grpc.CommonObjects.Count> getCountImagesForUserDeprecatedMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count> getCountImagesForUserDeprecatedMethod;
    if ((getCountImagesForUserDeprecatedMethod = ImagesGrpc.getCountImagesForUserDeprecatedMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCountImagesForUserDeprecatedMethod = ImagesGrpc.getCountImagesForUserDeprecatedMethod) == null) {
          ImagesGrpc.getCountImagesForUserDeprecatedMethod = getCountImagesForUserDeprecatedMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.PaginationOuterClass.Pagination, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countImagesForUserDeprecated"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.PaginationOuterClass.Pagination.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("countImagesForUserDeprecated"))
              .build();
        }
      }
    }
    return getCountImagesForUserDeprecatedMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountImagesForUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countImagesForUser",
      requestType = com.passkit.grpc.Filter.Filters.class,
      responseType = com.passkit.grpc.CommonObjects.Count.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters,
      com.passkit.grpc.CommonObjects.Count> getCountImagesForUserMethod() {
    io.grpc.MethodDescriptor<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count> getCountImagesForUserMethod;
    if ((getCountImagesForUserMethod = ImagesGrpc.getCountImagesForUserMethod) == null) {
      synchronized (ImagesGrpc.class) {
        if ((getCountImagesForUserMethod = ImagesGrpc.getCountImagesForUserMethod) == null) {
          ImagesGrpc.getCountImagesForUserMethod = getCountImagesForUserMethod =
              io.grpc.MethodDescriptor.<com.passkit.grpc.Filter.Filters, com.passkit.grpc.CommonObjects.Count>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countImagesForUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.Filter.Filters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.passkit.grpc.CommonObjects.Count.getDefaultInstance()))
              .setSchemaDescriptor(new ImagesMethodDescriptorSupplier("countImagesForUser"))
              .build();
        }
      }
    }
    return getCountImagesForUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ImagesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImagesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImagesStub>() {
        @java.lang.Override
        public ImagesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImagesStub(channel, callOptions);
        }
      };
    return ImagesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ImagesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImagesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImagesBlockingStub>() {
        @java.lang.Override
        public ImagesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImagesBlockingStub(channel, callOptions);
        }
      };
    return ImagesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ImagesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ImagesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ImagesFutureStub>() {
        @java.lang.Override
        public ImagesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ImagesFutureStub(channel, callOptions);
        }
      };
    return ImagesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void setProfileImage(com.passkit.grpc.Image.ProfileImageInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetProfileImageMethod(), responseObserver);
    }

    /**
     */
    default void getProfileImage(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileImageMethod(), responseObserver);
    }

    /**
     */
    default void createImages(com.passkit.grpc.Image.CreateImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageIds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateImagesMethod(), responseObserver);
    }

    /**
     */
    default void updateImage(com.passkit.grpc.Image.UpdateImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateImageMethod(), responseObserver);
    }

    /**
     */
    default void getImageURL(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageURLMethod(), responseObserver);
    }

    /**
     */
    default void getStampImageURL(com.passkit.grpc.Image.StampImageRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStampImageURLMethod(), responseObserver);
    }

    /**
     */
    default void getStampImageConfig(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImageConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStampImageConfigMethod(), responseObserver);
    }

    /**
     */
    default void updateStampImageConfig(com.passkit.grpc.Image.StampImageConfig request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStampImageConfigMethod(), responseObserver);
    }

    /**
     */
    default void getStampImagePreview(com.passkit.grpc.Image.StampImagePreviewRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImagePreview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStampImagePreviewMethod(), responseObserver);
    }

    /**
     */
    default void getLocalizedImageURL(com.passkit.grpc.Image.LocalizedImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLocalizedImageURLMethod(), responseObserver);
    }

    /**
     */
    default void getProfileImageById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileImageByIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * returns a zip bundle containing all images for that ID
     * </pre>
     */
    default void getImageBundle(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageBundle> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageBundleMethod(), responseObserver);
    }

    /**
     */
    default void getImageData(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetImageDataMethod(), responseObserver);
    }

    /**
     */
    default void deleteImage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteImageMethod(), responseObserver);
    }

    /**
     */
    default void deleteLocalizedImage(com.passkit.grpc.Image.LocalizedImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteLocalizedImageMethod(), responseObserver);
    }

    /**
     */
    default void listImagesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesForUserDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listImagesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesForUserMethod(), responseObserver);
    }

    /**
     */
    default void listImagesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void listImages(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListImagesMethod(), responseObserver);
    }

    /**
     */
    default void countImagesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountImagesDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countImages(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountImagesMethod(), responseObserver);
    }

    /**
     */
    default void countImagesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountImagesForUserDeprecatedMethod(), responseObserver);
    }

    /**
     */
    default void countImagesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCountImagesForUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Images.
   */
  public static abstract class ImagesImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ImagesGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Images.
   */
  public static final class ImagesStub
      extends io.grpc.stub.AbstractAsyncStub<ImagesStub> {
    private ImagesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImagesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImagesStub(channel, callOptions);
    }

    /**
     */
    public void setProfileImage(com.passkit.grpc.Image.ProfileImageInput request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetProfileImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfileImage(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createImages(com.passkit.grpc.Image.CreateImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageIds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateImage(com.passkit.grpc.Image.UpdateImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageURL(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStampImageURL(com.passkit.grpc.Image.StampImageRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStampImageURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStampImageConfig(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImageConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStampImageConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateStampImageConfig(com.passkit.grpc.Image.StampImageConfig request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStampImageConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStampImagePreview(com.passkit.grpc.Image.StampImagePreviewRequest request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImagePreview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStampImagePreviewMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLocalizedImageURL(com.passkit.grpc.Image.LocalizedImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLocalizedImageURLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfileImageById(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileImageByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * returns a zip bundle containing all images for that ID
     * </pre>
     */
    public void getImageBundle(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageBundle> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageBundleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getImageData(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetImageDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteImage(com.passkit.grpc.CommonObjects.Id request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteLocalizedImage(com.passkit.grpc.Image.LocalizedImageInput request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteLocalizedImageMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImagesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListImagesForUserDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImagesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListImagesForUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImagesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListImagesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listImages(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countImagesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountImagesDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countImages(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountImagesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countImagesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountImagesForUserDeprecatedMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void countImagesForUser(com.passkit.grpc.Filter.Filters request,
        io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCountImagesForUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Images.
   */
  public static final class ImagesBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ImagesBlockingStub> {
    private ImagesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImagesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImagesBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty setProfileImage(com.passkit.grpc.Image.ProfileImageInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetProfileImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getProfileImage(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.ImageIds createImages(com.passkit.grpc.Image.CreateImageInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.ImageRecord updateImage(com.passkit.grpc.Image.UpdateImageInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getImageURL(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getStampImageURL(com.passkit.grpc.Image.StampImageRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStampImageURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.StampImageConfig getStampImageConfig(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStampImageConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Id updateStampImageConfig(com.passkit.grpc.Image.StampImageConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStampImageConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.StampImagePreview getStampImagePreview(com.passkit.grpc.Image.StampImagePreviewRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStampImagePreviewMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getLocalizedImageURL(com.passkit.grpc.Image.LocalizedImageInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLocalizedImageURLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Url getProfileImageById(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileImageByIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * returns a zip bundle containing all images for that ID
     * </pre>
     */
    public com.passkit.grpc.Image.ImageBundle getImageBundle(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageBundleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.ImageRecord getImageData(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetImageDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteImage(com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.Image.ImageRecord deleteLocalizedImage(com.passkit.grpc.Image.LocalizedImageInput request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteLocalizedImageMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Image.ImageRecord> listImagesForUserDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListImagesForUserDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Image.ImageRecord> listImagesForUser(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListImagesForUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Image.ImageRecord> listImagesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListImagesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.passkit.grpc.Image.ImageRecord> listImages(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countImagesDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountImagesDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countImages(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountImagesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countImagesForUserDeprecated(com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountImagesForUserDeprecatedMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.passkit.grpc.CommonObjects.Count countImagesForUser(com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCountImagesForUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Images.
   */
  public static final class ImagesFutureStub
      extends io.grpc.stub.AbstractFutureStub<ImagesFutureStub> {
    private ImagesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ImagesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ImagesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> setProfileImage(
        com.passkit.grpc.Image.ProfileImageInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetProfileImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getProfileImage(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.ImageIds> createImages(
        com.passkit.grpc.Image.CreateImageInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateImagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.ImageRecord> updateImage(
        com.passkit.grpc.Image.UpdateImageInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getImageURL(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getStampImageURL(
        com.passkit.grpc.Image.StampImageRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStampImageURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.StampImageConfig> getStampImageConfig(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStampImageConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Id> updateStampImageConfig(
        com.passkit.grpc.Image.StampImageConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStampImageConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.StampImagePreview> getStampImagePreview(
        com.passkit.grpc.Image.StampImagePreviewRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStampImagePreviewMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getLocalizedImageURL(
        com.passkit.grpc.Image.LocalizedImageInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLocalizedImageURLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Url> getProfileImageById(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileImageByIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * returns a zip bundle containing all images for that ID
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.ImageBundle> getImageBundle(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageBundleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.ImageRecord> getImageData(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetImageDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteImage(
        com.passkit.grpc.CommonObjects.Id request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.Image.ImageRecord> deleteLocalizedImage(
        com.passkit.grpc.Image.LocalizedImageInput request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteLocalizedImageMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countImagesDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountImagesDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countImages(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountImagesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countImagesForUserDeprecated(
        com.passkit.grpc.PaginationOuterClass.Pagination request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountImagesForUserDeprecatedMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.passkit.grpc.CommonObjects.Count> countImagesForUser(
        com.passkit.grpc.Filter.Filters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCountImagesForUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SET_PROFILE_IMAGE = 0;
  private static final int METHODID_GET_PROFILE_IMAGE = 1;
  private static final int METHODID_CREATE_IMAGES = 2;
  private static final int METHODID_UPDATE_IMAGE = 3;
  private static final int METHODID_GET_IMAGE_URL = 4;
  private static final int METHODID_GET_STAMP_IMAGE_URL = 5;
  private static final int METHODID_GET_STAMP_IMAGE_CONFIG = 6;
  private static final int METHODID_UPDATE_STAMP_IMAGE_CONFIG = 7;
  private static final int METHODID_GET_STAMP_IMAGE_PREVIEW = 8;
  private static final int METHODID_GET_LOCALIZED_IMAGE_URL = 9;
  private static final int METHODID_GET_PROFILE_IMAGE_BY_ID = 10;
  private static final int METHODID_GET_IMAGE_BUNDLE = 11;
  private static final int METHODID_GET_IMAGE_DATA = 12;
  private static final int METHODID_DELETE_IMAGE = 13;
  private static final int METHODID_DELETE_LOCALIZED_IMAGE = 14;
  private static final int METHODID_LIST_IMAGES_FOR_USER_DEPRECATED = 15;
  private static final int METHODID_LIST_IMAGES_FOR_USER = 16;
  private static final int METHODID_LIST_IMAGES_DEPRECATED = 17;
  private static final int METHODID_LIST_IMAGES = 18;
  private static final int METHODID_COUNT_IMAGES_DEPRECATED = 19;
  private static final int METHODID_COUNT_IMAGES = 20;
  private static final int METHODID_COUNT_IMAGES_FOR_USER_DEPRECATED = 21;
  private static final int METHODID_COUNT_IMAGES_FOR_USER = 22;

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
        case METHODID_SET_PROFILE_IMAGE:
          serviceImpl.setProfileImage((com.passkit.grpc.Image.ProfileImageInput) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_PROFILE_IMAGE:
          serviceImpl.getProfileImage((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_CREATE_IMAGES:
          serviceImpl.createImages((com.passkit.grpc.Image.CreateImageInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageIds>) responseObserver);
          break;
        case METHODID_UPDATE_IMAGE:
          serviceImpl.updateImage((com.passkit.grpc.Image.UpdateImageInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_GET_IMAGE_URL:
          serviceImpl.getImageURL((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_GET_STAMP_IMAGE_URL:
          serviceImpl.getStampImageURL((com.passkit.grpc.Image.StampImageRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_GET_STAMP_IMAGE_CONFIG:
          serviceImpl.getStampImageConfig((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImageConfig>) responseObserver);
          break;
        case METHODID_UPDATE_STAMP_IMAGE_CONFIG:
          serviceImpl.updateStampImageConfig((com.passkit.grpc.Image.StampImageConfig) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Id>) responseObserver);
          break;
        case METHODID_GET_STAMP_IMAGE_PREVIEW:
          serviceImpl.getStampImagePreview((com.passkit.grpc.Image.StampImagePreviewRequest) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.StampImagePreview>) responseObserver);
          break;
        case METHODID_GET_LOCALIZED_IMAGE_URL:
          serviceImpl.getLocalizedImageURL((com.passkit.grpc.Image.LocalizedImageInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_GET_PROFILE_IMAGE_BY_ID:
          serviceImpl.getProfileImageById((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Url>) responseObserver);
          break;
        case METHODID_GET_IMAGE_BUNDLE:
          serviceImpl.getImageBundle((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageBundle>) responseObserver);
          break;
        case METHODID_GET_IMAGE_DATA:
          serviceImpl.getImageData((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_DELETE_IMAGE:
          serviceImpl.deleteImage((com.passkit.grpc.CommonObjects.Id) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_LOCALIZED_IMAGE:
          serviceImpl.deleteLocalizedImage((com.passkit.grpc.Image.LocalizedImageInput) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_LIST_IMAGES_FOR_USER_DEPRECATED:
          serviceImpl.listImagesForUserDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_LIST_IMAGES_FOR_USER:
          serviceImpl.listImagesForUser((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_LIST_IMAGES_DEPRECATED:
          serviceImpl.listImagesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_LIST_IMAGES:
          serviceImpl.listImages((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.Image.ImageRecord>) responseObserver);
          break;
        case METHODID_COUNT_IMAGES_DEPRECATED:
          serviceImpl.countImagesDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_IMAGES:
          serviceImpl.countImages((com.passkit.grpc.Filter.Filters) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_IMAGES_FOR_USER_DEPRECATED:
          serviceImpl.countImagesForUserDeprecated((com.passkit.grpc.PaginationOuterClass.Pagination) request,
              (io.grpc.stub.StreamObserver<com.passkit.grpc.CommonObjects.Count>) responseObserver);
          break;
        case METHODID_COUNT_IMAGES_FOR_USER:
          serviceImpl.countImagesForUser((com.passkit.grpc.Filter.Filters) request,
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
          getSetProfileImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.ProfileImageInput,
              com.google.protobuf.Empty>(
                service, METHODID_SET_PROFILE_IMAGE)))
        .addMethod(
          getGetProfileImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_PROFILE_IMAGE)))
        .addMethod(
          getCreateImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.CreateImageInput,
              com.passkit.grpc.Image.ImageIds>(
                service, METHODID_CREATE_IMAGES)))
        .addMethod(
          getUpdateImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.UpdateImageInput,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_UPDATE_IMAGE)))
        .addMethod(
          getGetImageURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_IMAGE_URL)))
        .addMethod(
          getGetStampImageURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.StampImageRequest,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_STAMP_IMAGE_URL)))
        .addMethod(
          getGetStampImageConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Image.StampImageConfig>(
                service, METHODID_GET_STAMP_IMAGE_CONFIG)))
        .addMethod(
          getUpdateStampImageConfigMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.StampImageConfig,
              com.passkit.grpc.CommonObjects.Id>(
                service, METHODID_UPDATE_STAMP_IMAGE_CONFIG)))
        .addMethod(
          getGetStampImagePreviewMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.StampImagePreviewRequest,
              com.passkit.grpc.Image.StampImagePreview>(
                service, METHODID_GET_STAMP_IMAGE_PREVIEW)))
        .addMethod(
          getGetLocalizedImageURLMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.LocalizedImageInput,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_LOCALIZED_IMAGE_URL)))
        .addMethod(
          getGetProfileImageByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.CommonObjects.Url>(
                service, METHODID_GET_PROFILE_IMAGE_BY_ID)))
        .addMethod(
          getGetImageBundleMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Image.ImageBundle>(
                service, METHODID_GET_IMAGE_BUNDLE)))
        .addMethod(
          getGetImageDataMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_GET_IMAGE_DATA)))
        .addMethod(
          getDeleteImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.CommonObjects.Id,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_IMAGE)))
        .addMethod(
          getDeleteLocalizedImageMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Image.LocalizedImageInput,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_DELETE_LOCALIZED_IMAGE)))
        .addMethod(
          getListImagesForUserDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_LIST_IMAGES_FOR_USER_DEPRECATED)))
        .addMethod(
          getListImagesForUserMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_LIST_IMAGES_FOR_USER)))
        .addMethod(
          getListImagesDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_LIST_IMAGES_DEPRECATED)))
        .addMethod(
          getListImagesMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.Image.ImageRecord>(
                service, METHODID_LIST_IMAGES)))
        .addMethod(
          getCountImagesDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_IMAGES_DEPRECATED)))
        .addMethod(
          getCountImagesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_IMAGES)))
        .addMethod(
          getCountImagesForUserDeprecatedMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.PaginationOuterClass.Pagination,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_IMAGES_FOR_USER_DEPRECATED)))
        .addMethod(
          getCountImagesForUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.passkit.grpc.Filter.Filters,
              com.passkit.grpc.CommonObjects.Count>(
                service, METHODID_COUNT_IMAGES_FOR_USER)))
        .build();
  }

  private static abstract class ImagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ImagesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.passkit.grpc.ARpcImages.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Images");
    }
  }

  private static final class ImagesFileDescriptorSupplier
      extends ImagesBaseDescriptorSupplier {
    ImagesFileDescriptorSupplier() {}
  }

  private static final class ImagesMethodDescriptorSupplier
      extends ImagesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ImagesMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ImagesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ImagesFileDescriptorSupplier())
              .addMethod(getSetProfileImageMethod())
              .addMethod(getGetProfileImageMethod())
              .addMethod(getCreateImagesMethod())
              .addMethod(getUpdateImageMethod())
              .addMethod(getGetImageURLMethod())
              .addMethod(getGetStampImageURLMethod())
              .addMethod(getGetStampImageConfigMethod())
              .addMethod(getUpdateStampImageConfigMethod())
              .addMethod(getGetStampImagePreviewMethod())
              .addMethod(getGetLocalizedImageURLMethod())
              .addMethod(getGetProfileImageByIdMethod())
              .addMethod(getGetImageBundleMethod())
              .addMethod(getGetImageDataMethod())
              .addMethod(getDeleteImageMethod())
              .addMethod(getDeleteLocalizedImageMethod())
              .addMethod(getListImagesForUserDeprecatedMethod())
              .addMethod(getListImagesForUserMethod())
              .addMethod(getListImagesDeprecatedMethod())
              .addMethod(getListImagesMethod())
              .addMethod(getCountImagesDeprecatedMethod())
              .addMethod(getCountImagesMethod())
              .addMethod(getCountImagesForUserDeprecatedMethod())
              .addMethod(getCountImagesForUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
