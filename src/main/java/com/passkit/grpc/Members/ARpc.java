// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/member/a_rpc.proto

package com.passkit.grpc.Members;

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
      "\n\025io/member/a_rpc.proto\022\007members\032\034google" +
      "/api/annotations.proto\032\033google/protobuf/" +
      "empty.proto\032\036io/common/common_objects.pr" +
      "oto\032\034io/common/distribution.proto\032\027io/co" +
      "mmon/message.proto\032\032io/common/pagination" +
      ".proto\032\026io/common/filter.proto\032\030io/commo" +
      "n/personal.proto\032\035io/member/member_event" +
      "s.proto\032\026io/member/member.proto\032\027io/memb" +
      "er/program.proto\032\024io/member/tier.proto\032." +
      "protoc-gen-openapiv2/options/annotations" +
      ".proto2\337M\n\007Members\022}\n\rcreateProgram\022\020.me" +
      "mbers.Program\032\006.io.Id\"R\202\323\344\223\002\025\"\020/members/" +
      "program:\001*\222A4\n\010Programs\022\016Create Program\032" +
      "\030Creates a program record\022\221\001\n\rupdateProg" +
      "ram\022\020.members.Program\032\020.members.Program\"" +
      "\\\202\323\344\223\002\025\032\020/members/program:\001*\222A>\n\010Program" +
      "s\022\016Update Program\032\"Updates an existing p" +
      "rogram record\022\200\001\n\ngetProgram\022\006.io.Id\032\020.m" +
      "embers.Program\"X\202\323\344\223\002\027\022\025/members/program" +
      "/{id}\222A8\n\010Programs\022\013Get Program\032\037Gets an" +
      " existing program record\022\222\001\n\013copyProgram" +
      "\022\033.members.ProgramCopyRequest\032\006.io.Id\"^\202" +
      "\323\344\223\002\032\"\025/members/program/copy:\001*\222A;\n\010Prog" +
      "rams\022\014Copy Program\032!Copies an existing p" +
      "rogram record\022\224\002\n\rdeleteProgram\022\006.io.Id\032" +
      "\026.google.protobuf.Empty\"\342\001\202\323\344\223\002\032*\025/membe" +
      "rs/program/{id}:\001*\222A\276\001\n\010Programs\022\016Delete" +
      " Program\032\241\001Deletes an existing program r" +
      "ecord. Deleting a program results in all" +
      " tiers, and members underneath it being " +
      "invalidated and removed. Needs to be use" +
      "d with care.\022\300\001\n\026listProgramsDeprecated\022" +
      "\016.io.Pagination\032\020.members.Program\"\201\001\202\323\344\223" +
      "\002\023\022\021/members/programs\222Ae\n\010Programs\022\032List" +
      " Programs [DEPRECATED]\032=[DEPRECATED: OR " +
      "operator is not supported] Lists all pro" +
      "grams0\001\022\361\003\n\014listPrograms\022\013.io.Filters\032\020." +
      "members.Program\"\277\003\202\323\344\223\002\033\"\026/members/progr" +
      "ams/list:\001*\222A\232\003\n\010Programs\022\rList Programs" +
      "\032\376\002Lists all programs\n\n<span style=\"font" +
      "-weight:bold\">About filter field names, " +
      "operators and sample payloads:</span> <a" +
      " target=\"_blank\" href=\"https://help.pass" +
      "kit.com/en/articles/4133757-membership-p" +
      "rotocol-filtering-listing-and-counting-b" +
      "y-api#filter-programs\">https://help.pass" +
      "kit.com/en/articles/4133757-membership-p" +
      "rotocol-filtering-listing-and-counting-b" +
      "y-api#filter-programs</a>0\001\022h\n\ncreateTie" +
      "r\022\r.members.Tier\032\006.io.Id\"C\202\323\344\223\002\022\"\r/membe" +
      "rs/tier:\001*\222A(\n\005Tiers\022\013Create Tier\032\022Creat" +
      "es a new tier\022v\n\nupdateTier\022\r.members.Ti" +
      "er\032\r.members.Tier\"J\202\323\344\223\002\022\032\r/members/tier" +
      ":\001*\222A/\n\005Tiers\022\013Update Tier\032\031Updates a ti" +
      "er by tier id\022\227\001\n\007getTier\022\031.members.Tier" +
      "RequestInput\032\r.members.Tier\"b\202\323\344\223\002$\022\"/me" +
      "mbers/tier/{programId}/{tierId}\222A5\n\005Tier" +
      "s\022\010Get Tier\032\"Get a tier by program and t" +
      "ier ids\022\326\001\n\ndeleteTier\022\031.members.TierReq" +
      "uestInput\032\026.google.protobuf.Empty\"\224\001\202\323\344\223" +
      "\002\'*\"/members/tier/{programId}/{tierId}:\001" +
      "*\222Ad\n\005Tiers\022\013Delete Tier\032NDeletes a tier" +
      " and members who belong to the tier. Nee" +
      "ds to be used with care.\022\275\001\n\023listTiersDe" +
      "precated\022\036.members.ListRequestDeprecated" +
      "\032\r.members.Tier\"u\202\323\344\223\002\020\022\016/members/tiers\222" +
      "A\\\n\005Tiers\022\027List Tiers [DEPRECATED]\032:[DEP" +
      "RECATED: OR operator is not supported] L" +
      "ists all tiers0\001\022\342\003\n\tlistTiers\022\024.members" +
      ".ListRequest\032\r.members.Tier\"\255\003\202\323\344\223\002\030\"\023/m" +
      "embers/tiers/list:\001*\222A\213\003\n\005Tiers\022\nList Ti" +
      "ers\032\365\002Lists all tiers\n\n<span style=\"font" +
      "-weight:bold\">About filter field names, " +
      "operators and sample payloads:</span> <a" +
      " target=\"_blank\" href=\"https://help.pass" +
      "kit.com/en/articles/4133757-membership-p" +
      "rotocol-filtering-listing-and-counting-b" +
      "y-api#filter-tiers\">https://help.passkit" +
      ".com/en/articles/4133757-membership-prot" +
      "ocol-filtering-listing-and-counting-by-a" +
      "pi#filter-tiers</a>0\001\022u\n\013enrolMember\022\017.m" +
      "embers.Member\032\006.io.Id\"M\202\323\344\223\002\024\"\017/members/" +
      "member:\001*\222A0\n\007Members\022\020Enrol new Member\032" +
      "\023Enrols a new member\022\276\001\n\021enrolMemberPubl" +
      "ic\022\017.members.Member\032\006.io.Id\"\217\001\202\323\344\223\002\033\"\026/m" +
      "embers/member/public:\001*\222Ak\n\007Members\022\031Enr" +
      "ol new Member (public)\032EEnrols a new mem" +
      "ber into the default tier of a program t" +
      "hat is public\022\236\001\n\023getMemberRecordById\022\006." +
      "io.Id\032\017.members.Member\"n\202\323\344\223\002\031\022\027/members" +
      "/member/id/{id}\222AL\n\007Members\022\037Get member " +
      "record by PassKit ID\032 Gets member record" +
      " by PassKit ID\022\347\001\n\033getMemberRecordByExte" +
      "rnalId\022(.members.MemberRecordByExternalI" +
      "dRequest\032\017.members.Member\"\214\001\202\323\344\223\0025\0223/mem" +
      "bers/member/externalId/{programId}/{exte" +
      "rnalId}\222AN\n\007Members\022 Get member record b" +
      "y External ID\032!Gets member record by Ext" +
      "ernal ID\022\313\001\n\rcheckInMember\022 .members.Mem" +
      "berCheckInOutRequest\032\024.members.MemberEve" +
      "nt\"\201\001\202\323\344\223\002\034\"\027/members/member/checkIn:\001*\222" +
      "A\\\n\007Members\022\017Check in member\032@Checks in " +
      "a member by either internal PassKit ID o" +
      "r External ID.\022\317\001\n\016checkOutMember\022 .memb" +
      "ers.MemberCheckInOutRequest\032\024.members.Me" +
      "mberEvent\"\204\001\202\323\344\223\002\035\"\030/members/member/chec" +
      "kOut:\001*\222A^\n\007Members\022\020Check out member\032AC" +
      "hecks out a member by either internal Pa" +
      "ssKit ID or External ID.\022\204\002\n\025listMembers" +
      "Deprecated\022\036.members.ListRequestDeprecat" +
      "ed\032\017.members.Member\"\267\001\202\323\344\223\002\"\022 /members/m" +
      "ember/list/{programId}\222A\213\001\n\007Members\022\031Lis" +
      "t members [DEPRECATED]\032e[DEPRECATED: OR " +
      "operator is not supported] List all memb" +
      "ers for a given segment. Supports pagina" +
      "tion.0\001\022\246\004\n\013listMembers\022\024.members.ListRe" +
      "quest\032\017.members.Member\"\355\003\202\323\344\223\002%\" /member" +
      "s/member/list/{programId}:\001*\222A\276\003\n\007Member" +
      "s\022\014List members\032\244\003List all members for a" +
      " given segment. Supports pagination.\n\n<s" +
      "pan style=\"font-weight:bold\">About filte" +
      "r field names, operators and sample payl" +
      "oads:</span> <a target=\"_blank\" href=\"ht" +
      "tps://help.passkit.com/en/articles/41337" +
      "57-membership-protocol-filtering-listing" +
      "-and-counting-by-api#filter-members\">htt" +
      "ps://help.passkit.com/en/articles/413375" +
      "7-membership-protocol-filtering-listing-" +
      "and-counting-by-api#filter-members</a>0\001" +
      "\022\233\001\n\014updateMember\022\017.members.Member\032\006.io." +
      "Id\"r\202\323\344\223\002\024\032\017/members/member:\001*\222AU\n\007Membe" +
      "rs\022\rUpdate member\032;Updates member by eit" +
      "her internal PassKit ID or External ID\022\346" +
      "\001\n\nearnPoints\022\036.members.EarnBurnPointsRe" +
      "quest\032\025.members.MemberPoints\"\240\001\202\323\344\223\002 \032\033/" +
      "members/member/points/earn:\001*\222Aw\n\007Member" +
      "s\022\013Earn points\032_Earns points for a membe" +
      "r (identified by PassKit ID or External " +
      "ID). Adds the amounts provided.\022\350\001\n\nburn" +
      "Points\022\036.members.EarnBurnPointsRequest\032\025" +
      ".members.MemberPoints\"\242\001\202\323\344\223\002 \032\033/members" +
      "/member/points/burn:\001*\222Ay\n\007Members\022\013Burn" +
      " points\032aBurn points for a member (ident" +
      "ified by PassKit ID or External ID). Ded" +
      "ucts the amounts provided.\022\334\001\n\tsetPoints" +
      "\022\031.members.SetPointsRequest\032\025.members.Me" +
      "mberPoints\"\234\001\202\323\344\223\002\037\032\032/members/member/poi" +
      "nts/set:\001*\222At\n\007Members\022\nSet points\032]Set " +
      "points for a member (identified by PassK" +
      "it ID or External ID). Sets the amounts " +
      "provided.\022\303\001\n\020changeMemberTier\022\032.members" +
      ".ChangeTierRequest\032\024.members.MemberEvent" +
      "\"}\202\323\344\223\002\031\032\024/members/member/tier:\001*\222A[\n\007Me" +
      "mbers\022\013Change tier\032CChange tier for a me" +
      "mber (identified by PassKit ID or Extern" +
      "al ID).\022\266\001\n\026updateMembersBySegment\022\035.mem" +
      "bers.MemberSegmentRequest\032\026.google.proto" +
      "buf.Empty\"e\202\323\344\223\002\034\032\027/members/member/segme" +
      "nt:\001*\222A@\n\007Members\022\031Update members by seg" +
      "ment\032\032Updates members by segment\022\266\001\n\026del" +
      "eteMembersBySegment\022\035.members.MemberSegm" +
      "entRequest\032\026.google.protobuf.Empty\"e\202\323\344\223" +
      "\002\034*\027/members/member/segment:\001*\222A@\n\007Membe" +
      "rs\022\031Delete members by segment\032\032Deletes m" +
      "embers by segment\022\253\001\n\014deleteMember\022\017.mem" +
      "bers.Member\032\026.google.protobuf.Empty\"r\202\323\344" +
      "\223\002\024*\017/members/member:\001*\222AU\n\007Members\022\rDel" +
      "ete member\032;Deletes member by either int" +
      "ernal PassKit ID or External ID\022\261\002\n\026coun" +
      "tMembersDeprecated\022\036.members.ListRequest" +
      "Deprecated\032\t.io.Count\"\353\001\202\323\344\223\002\034\022\032/members" +
      "/count/{programId}\222A\305\001\n\007Members\022#Count F" +
      "iltered Members [DEPRECATED]\032Q[DEPRECATE" +
      "D: OR operator is not supported] Retriev" +
      "es a count of filtered members.J\"\n\003403\022\033" +
      "\n\031User lacks authorization.J\036\n\003404\022\027\n\025Re" +
      "cord was not found.\022\323\004\n\014countMembers\022\024.m" +
      "embers.ListRequest\032\t.io.Count\"\241\004\202\323\344\223\002\037\"\032" +
      "/members/count/{programId}:\001*\222A\370\003\n\007Membe" +
      "rs\022\026Count Filtered Members\032\220\003Retrieves a" +
      " count of filtered members.\n\n<span style" +
      "=\"font-weight:bold\">About filter field n" +
      "ames, operators and sample payloads:</sp" +
      "an> <a target=\"_blank\" href=\"https://hel" +
      "p.passkit.com/en/articles/4133757-member" +
      "ship-protocol-filtering-listing-and-coun" +
      "ting-by-api#filter-members\">https://help" +
      ".passkit.com/en/articles/4133757-members" +
      "hip-protocol-filtering-listing-and-count" +
      "ing-by-api#filter-members</a>J\"\n\003403\022\033\n\031" +
      "User lacks authorization.J\036\n\003404\022\027\n\025Reco" +
      "rd was not found.\022\322\001\n\032getMessageHistoryF" +
      "orMember\022\016.io.Pagination\032\013.io.Message\"\224\001" +
      "\202\323\344\223\002\032\022\030/members/member/messages\222Aq\n\007Mem" +
      "bers\022\033Get members message history\032IGet a" +
      "ll the message that have been sent to a " +
      "member. Supports pagination.0\001\022\332\001\n\025getMe" +
      "taKeysForProgram\022\006.io.Id\032\013.io.Strings\"\253\001" +
      "\202\323\344\223\002\033\022\031/members/member/meta/{id}\222A\206\001\n\007M" +
      "embers\022\033Get Meta Keys for a Program\032^Ret" +
      "urns a list of distinct meta field keys." +
      " Can be used for building filters / tabl" +
      "e headings.\022\263\002\n\022renewMembersExpiry\022\034.mem" +
      "bers.UpdateExpiryRequest\032\t.io.Count\"\363\001\202\323" +
      "\344\223\002\033\032\026/members/member/expiry:\001*\222A\316\001\n\007Mem" +
      "bers\022\032Batch update member expiry\032\246\001Batch" +
      " updates expiry of ALL active members be" +
      "long to the tier. Should only be used wh" +
      "en you want to update ALL the expiry dat" +
      "e for all member records in a given tier" +
      ".\022\242\001\n\022updateMemberExpiry\022\025.members.Membe" +
      "rExpiry\032\006.io.Id\"m\202\323\344\223\002!\032\034/members/member" +
      "/updateExpiry:\001*\222AC\n\007Members\022\024Update mem" +
      "ber expiry\032\"Updates expiry of a single m" +
      "ember.\022\253\001\n\013patchPerson\022\021.io.PersonReques" +
      "t\032\006.io.Id\"\200\001\202\323\344\223\002\0332\026/members/member/pers" +
      "on:\001*\222A\\\n\007Members\022\033Update Personal Infor" +
      "mation\0324Updates personal information of " +
      "a member pass holder\022\265\001\n\021countMemberEven" +
      "ts\022\024.members.ListRequest\032\t.io.Count\"\177\202\323\344" +
      "\223\002.\")/members/program/count/events/{prog" +
      "ramId}:\001*\222AH\n\010Programs\022\023Count member eve" +
      "nts\032\'Counts all members events for a pro" +
      "gram\022\275\001\n\020listMemberEvents\022\024.members.List" +
      "Request\032\024.members.MemberEvent\"{\202\323\344\223\002-\"(/" +
      "members/program/list/events/{programId}:" +
      "\001*\222AE\n\010Programs\022\022List member events\032%Lis" +
      "t all members events for a program0\001\022\220\002\n" +
      " getMemberEventMetaKeysForProgram\022\006.io.I" +
      "d\032\013.io.Strings\"\326\001\202\323\344\223\002\"\022 /members/member" +
      "/events/meta/{id}\222A\252\001\n\010Programs\022(Get Mem" +
      "ber Event Meta Keys for a Program\032tRetur" +
      "ns a list of distinct meta field keys fo" +
      "r the member events. Can be used for bui" +
      "lding filters / table headings.\022\250\001\n\023list" +
      "EventsForMember\022\006.io.Id\032\024.members.Member" +
      "Event\"q\202\323\344\223\002%\" /members/member/list/even" +
      "ts/{id}:\001*\222AC\n\007Members\022\022List member even" +
      "ts\032$List all members events for a member" +
      "0\001\022\314\001\n\022deleteMemberEvents\022\024.members.List" +
      "Request\032\026.google.protobuf.Empty\"\207\001\202\323\344\223\002(" +
      "*#/members/program/events/{programId}:\001*" +
      "\222AV\n\010Programs\022\025Deletes member events\0323De" +
      "letes all members events for a program a" +
      "nd filter\022\264\001\n\025deleteEventsForMember\022\006.io" +
      ".Id\032\026.google.protobuf.Empty\"{\202\323\344\223\002 *\033/me" +
      "mbers/member/events/{id}:\001*\222AR\n\007Members\022" +
      "\037Delete member events for member\032&Delete" +
      " all members events for a member\022\262\001\n\021del" +
      "eteMemberEvent\022\006.io.Id\032\026.google.protobuf" +
      ".Empty\"}\202\323\344\223\002#*\036/members/member/events/i" +
      "d/{id}:\001*\222AQ\n\007Members\022\"Deletes an indivi" +
      "dual member event\032\"Deletes an individual" +
      " member event\022\340\001\n\023getProgramEnrolment\022\006." +
      "io.Id\032\021.io.EnrolmentUrls\"\255\001\202\323\344\223\002!\022\037/memb" +
      "ers/enrol/url/program/{id}\222A\202\001\n\016Enrolmen" +
      "t Urls\022\036Get Program Enrolment Page URL\032P" +
      "Retrieves enrolment page URL of the base" +
      " tier and enrolment URLs for each tier ." +
      "B\256\007\n\030com.passkit.grpc.MembersZ,stash.pas" +
      "skit.com/io/model/sdk/go/io/members\252\002\024Pa" +
      "ssKit.Grpc.Members\222A\313\006\022\206\002\n\023PassKit Membe" +
      "rs API\022lThe PassKit Members API lets you" +
      " manage your membership programs and pas" +
      "ses for Apple Wallet and Google Pay.\0328ht" +
      "tps://passkit.com/legal/terms-of-subscri" +
      "ption-service/\"?\n\017PassKit Support\022\027https" +
      "://docs.passkit.io\032\023support@passkit.com2" +
      "\0061.0-rc*\001\0022\020application/json:\020applicatio" +
      "n/jsonR9\n\003200\0222\n(Returned when the reque" +
      "st is successful.\022\006\n\004\232\002\001\007R4\n\003400\022-\n+Retu" +
      "rned when wrong user input is provided.R" +
      "0\n\003401\022)\n\'Returned when the user is unau" +
      "thorized.RP\n\003403\022I\nGReturned when the us" +
      "er does not have permission to access th" +
      "e resource.R;\n\003404\0224\n*Returned when the " +
      "resource does not exist.\022\006\n\004\232\002\001\007R<\n\003500\022" +
      "5\n+Returned when there is an unexpected " +
      "error.\022\006\n\004\232\002\001\007RW\n\003503\022P\nNServer is unava" +
      "ilable. Back off for 250ms and repeat re" +
      "quest until successful.Z>\n<\n\napiKeyAuth\022" +
      ".\010\002\022\031JWT Authentication token.\032\rAuthoriz" +
      "ation \002b\020\n\016\n\napiKeyAuth\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.Distribution.getDescriptor(),
          com.passkit.grpc.MessageOuterClass.getDescriptor(),
          com.passkit.grpc.PaginationOuterClass.getDescriptor(),
          com.passkit.grpc.Filter.getDescriptor(),
          com.passkit.grpc.Personal.getDescriptor(),
          com.passkit.grpc.Members.MemberEventsOuterClass.getDescriptor(),
          com.passkit.grpc.Members.MemberOuterClass.getDescriptor(),
          com.passkit.grpc.Members.ProgramOuterClass.getDescriptor(),
          com.passkit.grpc.Members.TierOuterClass.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
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
    com.passkit.grpc.CommonObjects.getDescriptor();
    com.passkit.grpc.Distribution.getDescriptor();
    com.passkit.grpc.MessageOuterClass.getDescriptor();
    com.passkit.grpc.PaginationOuterClass.getDescriptor();
    com.passkit.grpc.Filter.getDescriptor();
    com.passkit.grpc.Personal.getDescriptor();
    com.passkit.grpc.Members.MemberEventsOuterClass.getDescriptor();
    com.passkit.grpc.Members.MemberOuterClass.getDescriptor();
    com.passkit.grpc.Members.ProgramOuterClass.getDescriptor();
    com.passkit.grpc.Members.TierOuterClass.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
