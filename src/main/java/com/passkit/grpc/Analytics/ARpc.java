// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: io/analytics/a_rpc.proto
// Protobuf Java Version: 4.29.0

package com.passkit.grpc.Analytics;

public final class ARpc {
  private ARpc() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 0,
      /* suffix= */ "",
      ARpc.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030io/analytics/a_rpc.proto\022\tanalytics\032\034g" +
      "oogle/api/annotations.proto\032.protoc-gen-" +
      "openapiv2/options/annotations.proto\032\031io/" +
      "common/reporting.proto2\346\001\n\tAnalytics\022\330\001\n" +
      "\014getAnalytics\022\024.io.AnalyticsRequest\032\025.io" +
      ".AnalyticsResponse\"\232\001\222A{\n\tAnalytics\022\rGet" +
      " Analytics\032\033Retrieves an analytics dataJ" +
      "\"\n\003403\022\033\n\031User lacks authorization.J\036\n\0034" +
      "04\022\027\n\025Record was not found.\202\323\344\223\002\026\022\024/anal" +
      "ytics/{classId}B\241\007\n\032com.passkit.grpc.Ana" +
      "lyticsZ.stash.passkit.com/io/model/sdk/g" +
      "o/io/analytics\252\002\026PassKit.Grpc.Analytics\222" +
      "A\270\006\022\363\001\n\025PassKit Analytics API\022_The PassK" +
      "it Analytics API lets you track the perf" +
      "ormance of Apple Wallet and Google Pay p" +
      "asses.\0328https://passkit.com/legal/terms-" +
      "of-subscription-service/\"?\n\017PassKit Supp" +
      "ort\022\027https://docs.passkit.io\032\023support@pa" +
      "sskit.com*\001\0022\020application/json:\020applicat" +
      "ion/jsonR9\n\003200\0222\n(Returned when the req" +
      "uest is successful.\022\006\n\004\232\002\001\007R4\n\003400\022-\n+Re" +
      "turned when wrong user input is provided" +
      ".R0\n\003401\022)\n\'Returned when the user is un" +
      "authorized.RP\n\003403\022I\nGReturned when the " +
      "user does not have permission to access " +
      "the resource.R;\n\003404\0224\n*Returned when th" +
      "e resource does not exist.\022\006\n\004\232\002\001\007R<\n\00350" +
      "0\0225\n+Returned when there is an unexpecte" +
      "d error.\022\006\n\004\232\002\001\007RW\n\003503\022P\nNServer is una" +
      "vailable. Back off for 250ms and repeat " +
      "request until successful.Z>\n<\n\napiKeyAut" +
      "h\022.\010\002\022\031JWT Authentication token.\032\rAuthor" +
      "ization \002b\020\n\016\n\napiKeyAuth\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
          com.passkit.grpc.Reporting.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
    com.passkit.grpc.Reporting.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
