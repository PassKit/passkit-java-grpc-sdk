// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/core/a_rpc_images.proto

// Protobuf Java Version: 3.25.0
package com.passkit.grpc;

public final class ARpcImages {
  private ARpcImages() {}
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
      "\n\032io/core/a_rpc_images.proto\022\002io\032\034google" +
      "/api/annotations.proto\032\033google/protobuf/" +
      "empty.proto\032.protoc-gen-openapiv2/option" +
      "s/annotations.proto\032\036io/common/common_ob" +
      "jects.proto\032\032io/common/pagination.proto\032" +
      "\024io/image/image.proto\032\026io/common/filter." +
      "proto2\304\033\n\006Images\022\240\001\n\017setProfileImage\022\025.i" +
      "o.ProfileImageInput\032\026.google.protobuf.Em" +
      "pty\"^\222AB\022\021Set profile image\032-Set the pro" +
      "file image for the logged in user.\202\323\344\223\002\023" +
      "\"\016/image/profile:\001*\022\224\001\n\017getProfileImage\022" +
      "\026.google.protobuf.Empty\032\007.io.Url\"`\222AG\022\021G" +
      "et profile image\0322Gets the profile image" +
      " URL for the logged in user.\202\323\344\223\002\020\022\016/ima" +
      "ge/profile\022o\n\014createImages\022\024.io.CreateIm" +
      "ageInput\032\014.io.ImageIds\";\222A&\022\rCreate Imag" +
      "es\032\025Creates image record.\202\323\344\223\002\014\"\007/images" +
      ":\001*\022r\n\013updateImage\022\024.io.UpdateImageInput" +
      "\032\017.io.ImageRecord\"<\222A(\022\014Update Image\032\030Up" +
      "dates an image record.\202\323\344\223\002\013\032\006/image:\001*\022" +
      "^\n\013getImageURL\022\006.io.Id\032\007.io.Url\">\222A(\022\rGe" +
      "t Image URL\032\027Retrieves an image url.\202\323\344\223" +
      "\002\r\022\013/image/{id}\022\361\001\n\020getStampImageURL\022\025.i" +
      "o.StampImageRequest\032\007.io.Url\"\274\001\222A\226\001\022\023Get" +
      " Stamp Image URL\032;Retrieves a stamp imag" +
      "e url with the supplied stamp status.J\"\n" +
      "\003403\022\033\n\031User lacks authorization.J\036\n\003404" +
      "\022\027\n\025Record was not found.\202\323\344\223\002\034\022\032/image/" +
      "stamp/{id}/{status}\022\205\001\n\023getStampImageCon" +
      "fig\022\006.io.Id\032\024.io.StampImageConfig\"P\222A-\022\020" +
      "Get Stamp Config\032\031Retrieves a stamp conf" +
      "ig.\202\323\344\223\002\032\022\030/image/stamp/config/{id}\022\226\001\n\026" +
      "updateStampImageConfig\022\024.io.StampImageCo" +
      "nfig\032\006.io.Id\"^\222A=\022\023Update Stamp Config\032&" +
      "Updates a provided stamp image config.\202\323" +
      "\344\223\002\030\032\023/image/stamp/config:\001*\022\300\001\n\024getStam" +
      "pImagePreview\022\034.io.StampImagePreviewRequ" +
      "est\032\025.io.StampImagePreview\"s\222AQ\022\027Get Sta" +
      "mp Image Preview\0326Gets a preview image o" +
      "f the provided stampImageConfig.\202\323\344\223\002\031\"\024" +
      "/image/stamp/preview:\001*\022\232\001\n\024getLocalized" +
      "ImageURL\022\027.io.LocalizedImageInput\032\007.io.U" +
      "rl\"`\222A;\022\027Get Localized Image URL\032 Retrie" +
      "ves a localized image URL.\202\323\344\223\002\034\022\032/image" +
      "/{id}/{languageCode}\022C\n\023getProfileImageB" +
      "yId\022\006.io.Id\032\007.io.Url\"\033\202\323\344\223\002\025\022\023/image/pro" +
      "file/{id}\022v\n\016getImageBundle\022\006.io.Id\032\017.io" +
      ".ImageBundle\"K\222A.\022\020Get Image Bundle\032\032Ret" +
      "rieves an image bundle.\202\323\344\223\002\024\022\022/image/bu" +
      "ndle/{id}\022p\n\014getImageData\022\006.io.Id\032\017.io.I" +
      "mageRecord\"G\222A,\022\016Get Image Data\032\032Retriev" +
      "es an image record.\202\323\344\223\002\022\022\020/image/data/{" +
      "id}\022l\n\013deleteImage\022\006.io.Id\032\026.google.prot" +
      "obuf.Empty\"=\222A\'\022\014Delete Image\032\027Deletes a" +
      "n image record\202\323\344\223\002\r*\013/image/{id}\022\241\001\n\024de" +
      "leteLocalizedImage\022\027.io.LocalizedImageIn" +
      "put\032\017.io.ImageRecord\"_\222A:\022\026Delete Locali" +
      "zed Image\032 Deletes a localized image rec" +
      "ord\202\323\344\223\002\034*\032/image/{id}/{languageCode}\022\247\001" +
      "\n\033listImagesForUserDeprecated\022\016.io.Pagin" +
      "ation\032\017.io.ImageRecord\"e\222AN\022\027Get All Ima" +
      "ges For User\0323Retrieves all images store" +
      "d under the user account.\202\323\344\223\002\016\022\014/images" +
      "/user0\001\022\242\001\n\021listImagesForUser\022\013.io.Filte" +
      "rs\032\017.io.ImageRecord\"m\222AN\022\027Get All Images" +
      " For User\0323Retrieves all images stored u" +
      "nder the user account.\202\323\344\223\002\026\"\021/images/us" +
      "er/list:\001*0\001\022\227\001\n\024listImagesDeprecated\022\016." +
      "io.Pagination\032\017.io.ImageRecord\"\\\222AJ\022\030Get" +
      " All Available Images\032.Retrieves all ima" +
      "ges stored under the company.\202\323\344\223\002\t\022\007/im" +
      "ages0\001\022\222\001\n\nlistImages\022\013.io.Filters\032\017.io." +
      "ImageRecord\"d\222AJ\022\030Get All Available Imag" +
      "es\032.Retrieves all images stored under th" +
      "e company.\202\323\344\223\002\021\"\014/images/list:\001*0\001\022\262\001\n\025" +
      "countImagesDeprecated\022\016.io.Pagination\032\t." +
      "io.Count\"~\222Af\022&Count All Images Availabl" +
      "e to The User\032<Retrieves a count of imag" +
      "es stored under the user\'s company.\202\323\344\223\002" +
      "\017\022\r/images/count\022\251\001\n\013countImages\022\013.io.Fi" +
      "lters\032\t.io.Count\"\201\001\222Af\022&Count All Images" +
      " Available to The User\032<Retrieves a coun" +
      "t of images stored under the user\'s comp" +
      "any.\202\323\344\223\002\022\"\r/images/count:\001*\022\371\001\n\034countIm" +
      "agesForUserDeprecated\022\016.io.Pagination\032\t." +
      "io.Count\"\275\001\222A\237\001\022\"Count All Images Owned " +
      "by The User\0325Retrieves all images stored" +
      " under the user\'s account.J\"\n\003403\022\033\n\031Use" +
      "r lacks authorization.J\036\n\003404\022\027\n\025Record " +
      "was not found.\202\323\344\223\002\024\022\022/images/user/count" +
      "\022\251\001\n\022countImagesForUser\022\013.io.Filters\032\t.i" +
      "o.Count\"{\222A[\022\"Count All Images Owned by " +
      "The User\0325Retrieves all images stored un" +
      "der the user\'s account.\202\323\344\223\002\027\"\022/images/u" +
      "ser/count:\001*B\344\006\n\020com.passkit.grpcZ$stash" +
      ".passkit.com/io/model/sdk/go/io\252\002\014PassKi" +
      "t.Grpc\222A\231\006\022\324\001\n\022PassKit Images API\022CAPI f" +
      "or managing image assets for Pass Templa" +
      "tes & Wallet Projects.\0328https://passkit." +
      "com/legal/terms-of-subscription-service/" +
      "\"?\n\017PassKit Support\022\027https://docs.passki" +
      "t.io\032\023support@passkit.com*\001\0022\020applicatio" +
      "n/json:\020application/jsonR9\n\003200\0222\n(Retur" +
      "ned when the request is successful.\022\006\n\004\232" +
      "\002\001\007R4\n\003400\022-\n+Returned when wrong user i" +
      "nput is provided.R0\n\003401\022)\n\'Returned whe" +
      "n the user is unauthorized.RP\n\003403\022I\nGRe" +
      "turned when the user does not have permi" +
      "ssion to access the resource.R;\n\003404\0224\n*" +
      "Returned when the resource does not exis" +
      "t.\022\006\n\004\232\002\001\007R<\n\003500\0225\n+Returned when there" +
      " is an unexpected error.\022\006\n\004\232\002\001\007RW\n\003503\022" +
      "P\nNServer is unavailable. Back off for 2" +
      "50ms and repeat request until successful" +
      ".Z>\n<\n\napiKeyAuth\022.\010\002\022\031JWT Authenticatio" +
      "n token.\032\rAuthorization \002b\020\n\016\n\napiKeyAut" +
      "h\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.PaginationOuterClass.getDescriptor(),
          com.passkit.grpc.Image.getDescriptor(),
          com.passkit.grpc.Filter.getDescriptor(),
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
    com.passkit.grpc.PaginationOuterClass.getDescriptor();
    com.passkit.grpc.Image.getDescriptor();
    com.passkit.grpc.Filter.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
