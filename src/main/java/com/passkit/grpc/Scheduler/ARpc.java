// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/scheduler/a_rpc.proto

// Protobuf Java Version: 3.25.0
package com.passkit.grpc.Scheduler;

public final class ARpc {
  private ARpc() {}
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
      "\n\030io/scheduler/a_rpc.proto\022\tscheduler\032\034g" +
      "oogle/api/annotations.proto\032\033google/prot" +
      "obuf/empty.proto\032.protoc-gen-openapiv2/o" +
      "ptions/annotations.proto\032\036io/common/comm" +
      "on_objects.proto\032\034io/scheduler/scheduler" +
      ".proto\032\034ct/scheduler/scheduler.proto2\254\021\n" +
      "\tScheduler\022\217\002\n\023createSchedulingJob\022\021.ct." +
      "SchedulingJob\032\031.ct.SchedulingJobResponse" +
      "\"\311\001\222A\253\001\n\017Scheduling Jobs\022\025Create Schedul" +
      "ing Job\032\031Creates a scheduling job.J0\n\00340" +
      "0\022)\n\'There is a problem with the input d" +
      "ata.J4\n\003403\022-\n+Returned when the user la" +
      "cks authorization.\202\323\344\223\002\024\"\017/scheduling/jo" +
      "b:\001*\022\210\002\n\020getSchedulingJob\022\006.io.Id\032\021.ct.S" +
      "chedulingJob\"\330\001\222A\270\001\n\017Scheduling Jobs\022\022Ge" +
      "t Scheduling Job\032MRetrieves a scheduling" +
      " job. Deleted job will return history lo" +
      "gs only if any.J\"\n\003403\022\033\n\031User lacks aut" +
      "horization.J\036\n\003404\022\027\n\025Record was not fou" +
      "nd.\202\323\344\223\002\026\022\024/scheduling/job/{id}\022\325\003\n\023upda" +
      "teSchedulingJob\022\021.ct.SchedulingJob\032\031.ct." +
      "SchedulingJobResponse\"\217\003\222A\361\002\n\017Scheduling" +
      " Jobs\022\025Update Scheduling Job\032xUpdates a " +
      "scheduling job. Full SchedulerJob object" +
      " is required. An empty or null value wil" +
      "l override any existing value.J0\n\003400\022)\n" +
      "\'There is a problem with the input data." +
      "J\"\n\003403\022\033\n\031User lacks authorization.J\036\n\003" +
      "404\022\027\n\025Record was not found.JW\n\003503\022P\nNS" +
      "erver is unavailable. Back off for 250ms" +
      " and repeat request until successful.\202\323\344" +
      "\223\002\024\032\017/scheduling/job:\001*\022\372\002\n\022patchSchedul" +
      "ingJob\022\021.ct.SchedulingJob\032\031.ct.Schedulin" +
      "gJobResponse\"\265\002\222A\227\002\n\017Scheduling Jobs\022\024Pa" +
      "tch Scheduling Job\032\037Patch updates a sche" +
      "duling job.J0\n\003400\022)\n\'There is a problem" +
      " with the input data.J\"\n\003403\022\033\n\031User lac" +
      "ks authorization.J\036\n\003404\022\027\n\025Record was n" +
      "ot found.JW\n\003503\022P\nNServer is unavailabl" +
      "e. Back off for 250ms and repeat request" +
      " until successful.\202\323\344\223\002\0242\017/scheduling/jo" +
      "b:\001*\022\252\002\n\023deleteSchedulingJob\022\006.io.Id\032\026.g" +
      "oogle.protobuf.Empty\"\362\001\222A\322\001\n\017Scheduling " +
      "Jobs\022\025Delete Scheduling Job\032RDeletes a s" +
      "cheduling job. History logs are still av" +
      "ailable after deleting the job.J4\n\003403\022-" +
      "\n+Returned when the user lacks authoriza" +
      "tion.J\036\n\003404\022\027\n\025Record was not found.\202\323\344" +
      "\223\002\026*\024/scheduling/job/{id}\022\372\001\n\027getSchedul" +
      "ingJobHistory\022\006.io.Id\032\016.ct.JobHistory\"\306\001" +
      "\222A\242\001\n\rJob Histories\022\032Get Scheduling Job " +
      "History\0321Retrieves a scheduling job hist" +
      "ory by the log id.J\"\n\003403\022\033\n\031User lacks " +
      "authorization.J\036\n\003404\022\027\n\025Record was not " +
      "found.\202\323\344\223\002\032\022\030/scheduling/history/{id}\022\202" +
      "\002\n\032listSchedulingJobHistories\022\026.schedule" +
      "r.ListRequest\032\016.ct.JobHistory\"\271\001\222A\222\001\n\rJo" +
      "b Histories\022\035List Scheduling Job Histori" +
      "es\032\036List scheduling job histories.J\"\n\00340" +
      "3\022\033\n\031User lacks authorization.J\036\n\003404\022\027\n" +
      "\025Record was not found.\202\323\344\223\002\035\"\030/schedulin" +
      "g/history/list:\001*0\001B\335\002\n\032com.passkit.grpc" +
      ".SchedulerZ.stash.passkit.com/io/model/s" +
      "dk/go/io/scheduler\252\002\026PassKit.Grpc.Schedu" +
      "ler\222A\364\001\022\312\001\n\025PassKit Scheduler API\0221This " +
      "protocol schedule recursive or one-off j" +
      "obs.\0328https://passkit.com/legal/terms-of" +
      "-subscription-service/\"?\n\017PassKit Suppor" +
      "t\022\027https://docs.passkit.io\032\023support@pass" +
      "kit.com2\0031.0*\001\0022\020application/json:\020appli" +
      "cation/jsonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.Scheduler.Scheduler.getDescriptor(),
          com.passkit.grpc.ct.Scheduler.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
    com.passkit.grpc.CommonObjects.getDescriptor();
    com.passkit.grpc.Scheduler.Scheduler.getDescriptor();
    com.passkit.grpc.ct.Scheduler.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
