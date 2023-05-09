// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/single_use_coupons/a_rpc.proto

package com.passkit.grpc.SingleUseCoupons;

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
      "\n!io/single_use_coupons/a_rpc.proto\022\022sin" +
      "gle_use_coupons\032\033google/protobuf/empty.p" +
      "roto\032\034google/api/annotations.proto\032\036io/c" +
      "ommon/common_objects.proto\032\032io/common/pa" +
      "gination.proto\032\026io/common/filter.proto\032\031" +
      "io/common/reporting.proto\032\030io/common/per" +
      "sonal.proto\032$io/single_use_coupons/campa" +
      "ign.proto\032!io/single_use_coupons/offer.p" +
      "roto\032\"io/single_use_coupons/coupon.proto" +
      "\032.protoc-gen-openapiv2/options/annotatio" +
      "ns.proto2\345@\n\020SingleUseCoupons\022\300\001\n\024create" +
      "CouponCampaign\022\".single_use_coupons.Coup" +
      "onCampaign\032\006.io.Id\"|\222AT\n\020Coupon Campaign" +
      "s\022\026Create Coupon Campaign\032(Creates a new" +
      " Single Use Coupon Campaign\202\323\344\223\002\037\"\032/coup" +
      "on/singleUse/campaign:\001*\022\324\001\n\024updateCoupo" +
      "nCampaign\022\".single_use_coupons.CouponCam" +
      "paign\032\".single_use_coupons.CouponCampaig" +
      "n\"t\222AL\n\020Coupon Campaigns\022\026Update Coupon " +
      "Campaign\032 Updates an existing Pass Proje" +
      "ct\202\323\344\223\002\037\032\032/coupon/singleUse/campaign:\001*\022" +
      "\264\001\n\021getCouponCampaign\022\006.io.Id\032\".single_u" +
      "se_coupons.CouponCampaign\"s\222AI\n\020Coupon C" +
      "ampaigns\022\023Get Coupon Campaign\032 Gets an e" +
      "xisting Coupon Campaign\202\323\344\223\002!\022\037/coupon/s" +
      "ingleUse/campaign/{id}\022\233\003\n\024deleteCouponC" +
      "ampaign\022\006.io.Id\032\026.google.protobuf.Empty\"" +
      "\342\002\222A\267\002\n\020Coupon Campaigns\022\026Delete Coupon " +
      "Campaign\032\212\002Deletes an existing Coupon Ca" +
      "mpaign by id. Deleting a Coupon Campaign" +
      " results in the related offer being dele" +
      "ted, and all coupons being invalidated i" +
      "n the customers Mobile Wallet; rendering" +
      " them unusable. This method needs to be " +
      "used with care, this is irreversible.\202\323\344" +
      "\223\002!*\037/coupon/singleUse/campaign/{id}\022\224\002\n" +
      "\035listCouponCampaignsDeprecated\022\016.io.Pagi" +
      "nation\032\".single_use_coupons.CouponCampai" +
      "gn\"\274\001\222A\225\001\n\020Coupon Campaigns\022\"List Coupon" +
      " Campaigns [DEPRECATED]\032][DEPRECATED: OR" +
      " operator is not supported] Lists all Co" +
      "upon Campaigns for the logged in user.\202\323" +
      "\344\223\002\035\022\033/coupon/singleUse/campaigns0\001\022\276\004\n\023" +
      "listCouponCampaigns\022\013.io.Filters\032\".singl" +
      "e_use_coupons.CouponCampaign\"\363\003\222A\304\003\n\020Cou" +
      "pon Campaigns\022\025List Coupon Campaigns\032\230\003L" +
      "ists all Coupon Campaigns for the logged" +
      " in user.\n\n<span style=\"font-weight:bold" +
      "\">About filter field names, operators an" +
      "d sample payloads:</span> <a target=\"_bl" +
      "ank\" href=\"https://help.passkit.com/en/a" +
      "rticles/4130967-coupon-protocol-filterin" +
      "g-listing-and-counting-by-api#filter-cam" +
      "paigns\">https://help.passkit.com/en/arti" +
      "cles/4130967-coupon-protocol-filtering-l" +
      "isting-and-counting-by-api#filter-campai" +
      "gns</a>\202\323\344\223\002%\" /coupon/singleUse/campaig" +
      "ns/list:\001*0\001\022\362\001\n\014getAnalytics\022\024.io.Analy" +
      "ticsRequest\0323.single_use_coupons.CouponC" +
      "ampaignAnalyticsResponse\"\226\001\222A]\n\020Coupon C" +
      "ampaigns\022\035Get Coupon Campaign Analytics\032" +
      "*Retrieves protocol specific analytics d" +
      "ata\202\323\344\223\0020\022./coupon/singleUse/campaign/{c" +
      "lassId}/analytics\022\243\001\n\021createCouponOffer\022" +
      "\037.single_use_coupons.CouponOffer\032\006.io.Id" +
      "\"e\222A@\n\rCoupon Offers\022\023Create Coupon Offe" +
      "r\032\032Creates a new Coupon Offer\202\323\344\223\002\034\"\027/co" +
      "upon/singleUse/offer:\001*\022\302\001\n\021updateCoupon" +
      "Offer\022\037.single_use_coupons.CouponOffer\032\037" +
      ".single_use_coupons.CouponOffer\"k\222AF\n\rCo" +
      "upon Offers\022\023Update Coupon Offer\032 Update" +
      "s an existing Coupon Offer\202\323\344\223\002\034\032\027/coupo" +
      "n/singleUse/offer:\001*\022\242\001\n\016getCouponOffer\022" +
      "\006.io.Id\032\037.single_use_coupons.CouponOffer" +
      "\"g\222A@\n\rCoupon Offers\022\020Get Coupon Offer\032\035" +
      "Gets an existing Coupon Offer\202\323\344\223\002\036\022\034/co" +
      "upon/singleUse/offer/{id}\022\330\002\n\021deleteCoup" +
      "onOffer\022\006.io.Id\032\026.google.protobuf.Empty\"" +
      "\242\002\222A\372\001\n\rCoupon Offers\022\023Delete Coupon Off" +
      "er\032\323\001Deletes an existing Coupon Offer by" +
      " id. Deleting a Coupon Offer results in " +
      "all coupons being invalidated in the cus" +
      "tomers Mobile Wallet; rendering them unu" +
      "sable. Needs to be used with care, this " +
      "is irreversible.\202\323\344\223\002\036*\034/coupon/singleUs" +
      "e/offer/{id}\022\241\002\n\032listCouponOffersDepreca" +
      "ted\0225.single_use_coupons.CouponOffersLis" +
      "tRequestDeprecated\032\037.single_use_coupons." +
      "CouponOffer\"\250\001\222A\204\001\n\rCoupon Offers\022\037List " +
      "Coupon Offers [DEPRECATED]\032R[DEPRECATED:" +
      " OR operator is not supported] Lists all" +
      " Coupon Offers for a campaign.\202\323\344\223\002\032\022\030/c" +
      "oupon/singleUse/offers0\001\022\276\004\n\020listCouponO" +
      "ffers\022+.single_use_coupons.CouponOffersL" +
      "istRequest\032\037.single_use_coupons.CouponOf" +
      "fer\"\331\003\222A\255\003\n\rCoupon Offers\022\022List Coupon O" +
      "ffers\032\207\003Lists all Coupon Offers for a ca" +
      "mpaign.\n\n<span style=\"font-weight:bold\">" +
      "About filter field names, operators and " +
      "sample payloads:</span> <a target=\"_blan" +
      "k\" href=\"https://help.passkit.com/en/art" +
      "icles/4130967-coupon-protocol-filtering-" +
      "listing-and-counting-by-api#filter-offer" +
      "s\">https://help.passkit.com/en/articles/" +
      "4130967-coupon-protocol-filtering-listin" +
      "g-and-counting-by-api#filter-offers</a>\202" +
      "\323\344\223\002\"\"\035/coupon/singleUse/offers/list:\001*0" +
      "\001\022\217\001\n\014createCoupon\022\032.single_use_coupons." +
      "Coupon\032\006.io.Id\"[\222A5\n\007Coupons\022\rCreate Cou" +
      "pon\032\033Creates a new unique Coupon\202\323\344\223\002\035\"\030" +
      "/coupon/singleUse/coupon:\001*\022\216\001\n\014updateCo" +
      "upon\022\032.single_use_coupons.Coupon\032\006.io.Id" +
      "\"Z\222A4\n\007Coupons\022\rUpdate Coupon\032\032Updates a" +
      "n existing Coupon\202\323\344\223\002\035\032\030/coupon/singleU" +
      "se/coupon:\001*\022\276\001\n\023streamCouponUpdates\022\032.s" +
      "ingle_use_coupons.Coupon\032\006.io.Id\"\177\222A|\n\007C" +
      "oupons\022\'Stream Coupon Updates (gRPC SDKs" +
      "s only)\032HUpdates existing Coupon records" +
      " via stream. To be used for batch update" +
      ".(\0010\001\022\353\002\n\014redeemCoupon\022\032.single_use_coup" +
      "ons.Coupon\032\006.io.Id\"\266\002\222A\210\002\n\007Coupons\022\rRede" +
      "em Coupon\032\355\001Redeems an existing Coupon. " +
      "Use this endpoint when you want to captu" +
      "re redemption data and trigger the switc" +
      "h to the redemption design of the coupon" +
      ". The coupon cannot be used again after " +
      "calling this endpoint, and is marked as " +
      "redeemed.\202\323\344\223\002$\032\037/coupon/singleUse/coupo" +
      "n/redeem:\001*\022\213\002\n\026updateCouponExternalId\022." +
      ".single_use_coupons.CouponNewExternalIdR" +
      "equest\032\006.io.Id\"\270\001\222A\206\001\n\007Coupons\022\031Update C" +
      "oupon External Id\032`Updates an external i" +
      "d of an existing coupon. Extenal id need" +
      "s to be unique within the campaign.\202\323\344\223\002" +
      "(\032#/coupon/singleUse/coupon/externalId:\001" +
      "*\022\313\001\n\027streamCouponRedemptions\022\032.single_u" +
      "se_coupons.Coupon\032\006.io.Id\"\207\001\222A\203\001\n\007Coupon" +
      "s\022*Stream Coupon Redemptions (gRPC SDKs " +
      "only)\032LRedeems existing Coupon records v" +
      "ia stream. To be used for batch redempti" +
      "on.(\0010\001\022\216\001\n\rgetCouponById\022\006.io.Id\032\032.sing" +
      "le_use_coupons.Coupon\"Y\222A1\n\007Coupons\022\020Get" +
      " Coupon by ID\032\024Gets a Coupon record\202\323\344\223\002" +
      "\037\022\035/coupon/singleUse/coupon/{id}\022\364\001\n\025get" +
      "CouponByExternalId\022%.single_use_coupons." +
      "ExternalIdRequest\032\032.single_use_coupons.C" +
      "oupon\"\227\001\222AI\n\007Coupons\022\031Get Coupon by Exte" +
      "rnal ID\032#Gets a Coupon record by Externa" +
      "l ID\202\323\344\223\002E\022C/coupon/singleUse/coupon/ext" +
      "ernalId/{couponCampaignId}/{externalId}\022" +
      "\302\002\n\nvoidCoupon\022\032.single_use_coupons.Coup" +
      "on\032\026.google.protobuf.Empty\"\377\001\222A\330\001\n\007Coupo" +
      "ns\022\013Void Coupon\032\277\001Voids (deletes) an exi" +
      "sting Coupon by ID or External ID. Inval" +
      "idates the coupon in the customers Mobil" +
      "e Wallet; rendering it useless. This met" +
      "hod is irreversible and should be used w" +
      "ith care.\202\323\344\223\002\035*\030/coupon/singleUse/coupo" +
      "n:\001*\022\270\002\n%listCouponsByCouponCampaignDepr" +
      "ecated\022).single_use_coupons.ListRequestD" +
      "eprecated\032\032.single_use_coupons.Coupon\"\305\001" +
      "\222A\215\001\n\007Coupons\022\031List Coupons [DEPRECATED]" +
      "\032g[DEPRECATED: OR operator is not suppor" +
      "ted] List all coupons for a Coupon Campa" +
      "ign. Supports pagination.\202\323\344\223\002.\022,/coupon" +
      "/singleUse/coupons/{couponCampaignId}0\001\022" +
      "\327\004\n\033listCouponsByCouponCampaign\022\037.single" +
      "_use_coupons.ListRequest\032\032.single_use_co" +
      "upons.Coupon\"\370\003\222A\270\003\n\007Coupons\022\014List Coupo" +
      "ns\032\236\003List all coupons for a Coupon Campa" +
      "ign. Supports pagination.\n\n<span style=\"" +
      "font-weight:bold\">About filter field nam" +
      "es, operators and sample payloads:</span" +
      "> <a target=\"_blank\" href=\"https://help." +
      "passkit.com/en/articles/4130967-coupon-p" +
      "rotocol-filtering-listing-and-counting-b" +
      "y-api#filter-coupons\">https://help.passk" +
      "it.com/en/articles/4130967-coupon-protoc" +
      "ol-filtering-listing-and-counting-by-api" +
      "#filter-coupons</a>\202\323\344\223\0026\"1/coupon/singl" +
      "eUse/coupons/list/{couponCampaignId}:\001*0" +
      "\001\022\230\002\n&countCouponsByCouponCampaignDeprec" +
      "ated\022).single_use_coupons.ListRequestDep" +
      "recated\032\t.io.Count\"\267\001\222Az\n\007Coupons\022\032Count" +
      " Coupons [DEPRECATED]\032S[DEPRECATED: OR o" +
      "perator is not supported] Count all coup" +
      "ons for a Coupon Campaign.\202\323\344\223\0024\0222/coupo" +
      "n/singleUse/coupons/count/{couponCampaig" +
      "nId}\022\263\004\n\034countCouponsByCouponCampaign\022\037." +
      "single_use_coupons.ListRequest\032\t.io.Coun" +
      "t\"\346\003\222A\245\003\n\007Coupons\022\rCount Coupons\032\212\003Count" +
      " all coupons for a Coupon Campaign.\n\n<sp" +
      "an style=\"font-weight:bold\">About filter" +
      " field names, operators and sample paylo" +
      "ads:</span> <a target=\"_blank\" href=\"htt" +
      "ps://help.passkit.com/en/articles/413096" +
      "7-coupon-protocol-filtering-listing-and-" +
      "counting-by-api#filter-coupons\">https://" +
      "help.passkit.com/en/articles/4130967-cou" +
      "pon-protocol-filtering-listing-and-count" +
      "ing-by-api#filter-coupons</a>\202\323\344\223\0027\"2/co" +
      "upon/singleUse/coupons/count/{couponCamp" +
      "aignId}:\001*\022\264\001\n\013patchPerson\022\021.io.PersonRe" +
      "quest\032\006.io.Id\"\211\001\222A\\\n\007Coupons\022\033Update Per" +
      "sonal Information\0324Updates personal info" +
      "rmation of a coupon pass holder\202\323\344\223\002$2\037/" +
      "coupon/singleUse/coupon/person:\001*\022\271\001\n\022co" +
      "pyCouponCampaign\022\'.single_use_coupons.Ca" +
      "mpaignCopyRequest\032\006.io.Id\"r\222AE\n\020Coupon C" +
      "ampaigns\022\rCopy Campaign\032\"Copies an exist" +
      "ing campaign record\202\323\344\223\002$\"\037/coupon/singl" +
      "eUse/campaign/copy:\001*\022\360\001\n\026getMetaKeysFor" +
      "Campaign\022\006.io.Id\032\013.io.Strings\"\300\001\222A\220\001\n\020Co" +
      "upon Campaigns\022\034Get Meta Keys for a Camp" +
      "aign\032^Returns a list of distinct meta fi" +
      "eld keys. Can be used for building filte" +
      "rs / table headings.\202\323\344\223\002&\022$/coupon/sing" +
      "leUse/campaign/meta/{id}B\203\010\n!com.passkit" +
      ".grpc.SingleUseCouponsZ7stash.passkit.co" +
      "m/io/model/sdk/go/io/single_use_coupons\252" +
      "\002\035PassKit.Grpc.SingleUseCoupons\222A\203\007\022\276\002\n\035" +
      "PassKit Single Use Coupon API\022\234\001This pro" +
      "tocol is suit for cases where the user r" +
      "equires a clean and simple single use co" +
      "upon for short term coupon campaigns in " +
      "Apple Wallet and Google Pay.\0328https://pa" +
      "sskit.com/legal/terms-of-subscription-se" +
      "rvice/\"?\n\017PassKit Support\022\027https://docs." +
      "passkit.io\032\023support@passkit.com2\0031.0*\001\0022" +
      "\020application/json:\020application/jsonR9\n\0032" +
      "00\0222\n(Returned when the request is succe" +
      "ssful.\022\006\n\004\232\002\001\007R4\n\003400\022-\n+Returned when w" +
      "rong user input is provided.R0\n\003401\022)\n\'R" +
      "eturned when the user is unauthorized.RP" +
      "\n\003403\022I\nGReturned when the user does not" +
      " have permission to access the resource." +
      "R;\n\003404\0224\n*Returned when the resource do" +
      "es not exist.\022\006\n\004\232\002\001\007R<\n\003500\0225\n+Returned" +
      " when there is an unexpected error.\022\006\n\004\232" +
      "\002\001\007RW\n\003503\022P\nNServer is unavailable. Bac" +
      "k off for 250ms and repeat request until" +
      " successful.Z>\n<\n\napiKeyAuth\022.\010\002\022\031JWT Au" +
      "thentication token.\032\rAuthorization \002b\020\n\016" +
      "\n\napiKeyAuth\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.PaginationOuterClass.getDescriptor(),
          com.passkit.grpc.Filter.getDescriptor(),
          com.passkit.grpc.Reporting.getDescriptor(),
          com.passkit.grpc.Personal.getDescriptor(),
          com.passkit.grpc.SingleUseCoupons.Campaign.getDescriptor(),
          com.passkit.grpc.SingleUseCoupons.Offer.getDescriptor(),
          com.passkit.grpc.SingleUseCoupons.CouponOuterClass.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
        });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Operation);
    registry.add(grpc.gateway.protoc_gen_openapiv2.options.Annotations.openapiv2Swagger);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
    com.passkit.grpc.CommonObjects.getDescriptor();
    com.passkit.grpc.PaginationOuterClass.getDescriptor();
    com.passkit.grpc.Filter.getDescriptor();
    com.passkit.grpc.Reporting.getDescriptor();
    com.passkit.grpc.Personal.getDescriptor();
    com.passkit.grpc.SingleUseCoupons.Campaign.getDescriptor();
    com.passkit.grpc.SingleUseCoupons.Offer.getDescriptor();
    com.passkit.grpc.SingleUseCoupons.CouponOuterClass.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
