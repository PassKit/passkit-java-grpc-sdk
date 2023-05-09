// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: io/event_tickets/a_rpc.proto

package com.passkit.grpc.EventTickets;

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
      "\n\034io/event_tickets/a_rpc.proto\022\revent_ti" +
      "ckets\032\033google/protobuf/empty.proto\032\034goog" +
      "le/api/annotations.proto\032\036io/common/comm" +
      "on_objects.proto\032\026io/common/filter.proto" +
      "\032\031io/common/reporting.proto\032\034io/event_ti" +
      "ckets/event.proto\032!io/event_tickets/prod" +
      "uction.proto\032\"io/event_tickets/ticket_ty" +
      "pe.proto\032\035io/event_tickets/ticket.proto\032" +
      "\034io/event_tickets/venue.proto\032.protoc-ge" +
      "n-openapiv2/options/annotations.proto2\346W" +
      "\n\014EventTickets\022\230\001\n\020createProduction\022\031.ev" +
      "ent_tickets.Production\032\006.io.Id\"a\222A;\n\013Pro" +
      "ductions\022\021Create Production\032\031Creates a n" +
      "ew Production.\202\323\344\223\002\035\"\030/eventTickets/prod" +
      "uction:\001*\022\311\002\n\017patchProduction\022\031.event_ti" +
      "ckets.Production\032\031.event_tickets.Product" +
      "ion\"\377\001\222A\330\001\n\013Productions\022\020Patch Productio" +
      "n\032\266\001Partially updates an existing Produc" +
      "tion. Only id/uid and updating fields ar" +
      "e required. Note: changes will update an" +
      "d affect all existing Events & Tickets r" +
      "elated to this Production.\202\323\344\223\002\0352\030/event" +
      "Tickets/production:\001*\022\273\002\n\020updateProducti" +
      "on\022\031.event_tickets.Production\032\031.event_ti" +
      "ckets.Production\"\360\001\222A\311\001\n\013Productions\022\021Up" +
      "date Production\032\246\001Fully updates an exist" +
      "ing Production. All required fields are " +
      "required. Note: changes will update and " +
      "affect all existing Events & Tickets rel" +
      "ated to this Production.\202\323\344\223\002\035\032\030/eventTi" +
      "ckets/production:\001*\022\227\001\n\rgetProduction\022\006." +
      "io.Id\032\031.event_tickets.Production\"c\222A;\n\013P" +
      "roductions\022\016Get Production\032\034Gets an exis" +
      "ting Production.\202\323\344\223\002\037\022\035/eventTickets/pr" +
      "oduction/{id}\022\231\003\n\020deleteProduction\022\031.eve" +
      "nt_tickets.Production\032\026.google.protobuf." +
      "Empty\"\321\002\222A\252\002\n\013Productions\022\021Delete Produc" +
      "tion\032\207\002Deletes an existing Production. D" +
      "eleting a Production results in all Tick" +
      "et Types, Events & Tickets for the Produ" +
      "ction being deleted and invalidated in t" +
      "he customers Mobile Wallet; rendering th" +
      "em unusable. This method is irreversible" +
      " and should be used with care.\202\323\344\223\002\035*\030/e" +
      "ventTickets/production:\001*\022\262\001\n\017listProduc" +
      "tions\022\013.io.Filters\032\031.event_tickets.Produ" +
      "ction\"u\222AN\n\013Productions\022\020List Production" +
      "s\032-Lists all Productions for the logged " +
      "in user.\202\323\344\223\002\036\"\031/eventTickets/production" +
      "s:\001*0\001\022\340\001\n\014getAnalytics\022\024.io.AnalyticsRe" +
      "quest\032*.event_tickets.ProductionAnalytic" +
      "sResponse\"\215\001\222AV\n\013Productions\022\030Get Produc" +
      "tion Analytics\032-Retrieves Production spe" +
      "cific analytics data.\202\323\344\223\002.\022,/eventTicke" +
      "ts/production/{classId}/analytics\022\251\001\n\016co" +
      "pyProduction\022$.event_tickets.ProductionC" +
      "opyRequest\032\006.io.Id\"i\222A>\n\013Productions\022\017Co" +
      "py Production\032\036Copies an existing Produc" +
      "tion.\202\323\344\223\002\"\"\035/eventTickets/production/co" +
      "py:\001*\022z\n\013createVenue\022\024.event_tickets.Ven" +
      "ue\032\006.io.Id\"M\222A,\n\006Venues\022\014Create Venue\032\024C" +
      "reates a new Venue.\202\323\344\223\002\030\"\023/eventTickets" +
      "/venue:\001*\022\225\002\n\013updateVenue\022\024.event_ticket" +
      "s.Venue\032\024.event_tickets.Venue\"\331\001\222A\267\001\n\006Ve" +
      "nues\022\014Update Venue\032\236\001Updates an existing" +
      " Venue. Requires ID or User Defined ID t" +
      "o be set. Note: changes will update and " +
      "affect all existing Events & Tickets rel" +
      "ated to this Venue.\202\323\344\223\002\030\032\023/eventTickets" +
      "/venue:\001*\022\235\002\n\npatchVenue\022\024.event_tickets" +
      ".Venue\032\024.event_tickets.Venue\"\342\001\222A\300\001\n\006Ven" +
      "ues\022\013Patch Venue\032\250\001Partially updates an " +
      "existing Venue. Requires ID or User Defi" +
      "ned ID to be set. Note: changes will upd" +
      "ate and affect all existing Events & Tic" +
      "kets related to this Venue.\202\323\344\223\002\0302\023/even" +
      "tTickets/venue:\001*\022\236\001\n\014getVenueById\022\006.io." +
      "Id\032\024.event_tickets.Venue\"p\222AM\n\006Venues\022\tG" +
      "et Venue\0328Gets an existing Venue by Pass" +
      "Kit ID or User Defined ID.\202\323\344\223\002\032\022\030/event" +
      "Tickets/venue/{id}\022\325\002\n\013deleteVenue\022\024.eve" +
      "nt_tickets.Venue\032\026.google.protobuf.Empty" +
      "\"\227\002\222A\365\001\n\006Venues\022\014Delete Venue\032\334\001Deletes " +
      "an existing Venue. Deleting a Venue, Eve" +
      "nts & Tickets for the Venue being delete" +
      "d and invalidated in the customers Mobil" +
      "e Wallet; rendering them unusable. This " +
      "method is irreversible and should be use" +
      "d with care.\202\323\344\223\002\030*\023/eventTickets/venue:" +
      "\001*\022\224\001\n\nlistVenues\022\013.io.Filters\032\024.event_t" +
      "ickets.Venue\"a\222A?\n\006Venues\022\013List Venues\032(" +
      "Lists all Venues for the logged in user." +
      "\202\323\344\223\002\031\"\024/eventTickets/venues:\001*0\001\022\241\002\n\013cr" +
      "eateEvent\022\024.event_tickets.Event\032\006.io.Id\"" +
      "\363\001\222A\321\001\n\006Events\022\014Create Event\032\270\001Creates a" +
      " new Event instance for a Production. Yo" +
      "u don\'t need to pass in the full Product" +
      "ion and Venue objects if they already ex" +
      "ist, you can provide just the id and it " +
      "will work fine.\202\323\344\223\002\030\"\023/eventTickets/eve" +
      "nt:\001*\022\300\002\n\013updateEvent\022\024.event_tickets.Ev" +
      "ent\032\024.event_tickets.Event\"\204\002\222A\342\001\n\006Events" +
      "\022\014Update Event\032\311\001Fully updates an existi" +
      "ng Event. Requires ID to be set. Note1: " +
      "changes will update & affect all existin" +
      "g tickets related to this event. Note2: " +
      "Production and Venue cannot be changed f" +
      "rom this endpoint.\202\323\344\223\002\030\032\023/eventTickets/" +
      "event:\001*\022\377\001\n\npatchEvent\022\024.event_tickets." +
      "Event\032\024.event_tickets.Event\"\304\001\222A\242\001\n\006Even" +
      "ts\022\013Patch Event\032\212\001Partially updates an e" +
      "xisting Event. Requires ID to be set. No" +
      "te: changes will update & affect all exi" +
      "sting tickets related to this event.\202\323\344\223" +
      "\002\0302\023/eventTickets/event:\001*\022\214\001\n\014getEventB" +
      "yId\022\006.io.Id\032\024.event_tickets.Event\"^\222A8\n\006" +
      "Events\022\017Get Event by ID\032\035Gets an existin" +
      "g Event by ID.\202\323\344\223\002\035\022\033/eventTickets/even" +
      "t/id/{id}\022\316\001\n\033getEventByStartDateAndVenu" +
      "e\022\036.event_tickets.GetEventRequest\032\024.even" +
      "t_tickets.Event\"y\222AS\n\006Events\022\037Get Event " +
      "by Start Date & Venue\032(Gets an existing " +
      "Event by event details.\202\323\344\223\002\035\022\033/eventTic" +
      "kets/event/details\022\362\002\n\013deleteEvent\022\024.eve" +
      "nt_tickets.Event\032\026.google.protobuf.Empty" +
      "\"\264\002\222A\222\002\n\006Events\022\014Delete Event\032\371\001Deletes " +
      "an existing Event. Requires ID to be set" +
      ". Deleting an Event results in all ticke" +
      "ts for the Event being deleted and inval" +
      "idated in the customers Mobile Wallet; r" +
      "endering them unusable. This method is i" +
      "rreversible and should be used with care" +
      ".\202\323\344\223\002\030*\023/eventTickets/event:\001*\022\263\001\n\nlist" +
      "Events\022\037.event_tickets.EventListRequest\032" +
      " .event_tickets.EventListResponse\"`\222A9\n\006" +
      "Events\022\013List Events\032\"Lists all Events fo" +
      "r a Production.\202\323\344\223\002\036\"\031/eventTickets/eve" +
      "nts/list:\001*0\001\022\224\001\n\020createTicketType\022\031.eve" +
      "nt_tickets.TicketType\032\006.io.Id\"]\222A7\n\014Tick" +
      "et Types\022\013Ticket Type\032\032Creates a new Tic" +
      "ket Type.\202\323\344\223\002\035\"\030/eventTickets/ticketTyp" +
      "e:\001*\022\213\002\n\020updateTicketType\022\031.event_ticket" +
      "s.TicketType\032\031.event_tickets.TicketType\"" +
      "\300\001\222A\231\001\n\014Ticket Types\022\022Update Ticket Type" +
      "\032uUpdates an existing Ticket Type. Note:" +
      " changes will update & affect all existi" +
      "ng Tickets related to this Ticket Type.\202" +
      "\323\344\223\002\035\032\030/eventTickets/ticketType:\001*\022\223\002\n\017p" +
      "atchTicketType\022\031.event_tickets.TicketTyp" +
      "e\032\031.event_tickets.TicketType\"\311\001\222A\242\001\n\014Tic" +
      "ket Types\022\021Patch Ticket Type\032\177Partially " +
      "updates an existing Ticket Type. Note: c" +
      "hanges will update & affect all existing" +
      " Tickets related to this Ticket Type.\202\323\344" +
      "\223\002\0352\030/eventTickets/ticketType:\001*\022\265\001\n\021get" +
      "TicketTypeById\022\006.io.Id\032\031.event_tickets.T" +
      "icketType\"}\222AR\n\014Ticket Types\022\035Get Ticket" +
      " Type by PassKit ID\032#Gets an existing Ti" +
      "cket Type by ID.\202\323\344\223\002\"\022 /eventTickets/ti" +
      "cketType/id/{id}\022\220\002\n\034getTicketTypeByUser" +
      "DefinedId\022\036.event_tickets.GetByUidReques" +
      "t\032\031.event_tickets.TicketType\"\264\001\222Ax\n\014Tick" +
      "et Types\022\"Get Ticket Type by User Define" +
      "d ID\032DGets an existing Ticket Type by Us" +
      "er Defined ID (and Production ID).\202\323\344\223\0023" +
      "\0221/eventTickets/ticketType/uid/{producti" +
      "onId}/{uid}\022\265\003\n\020deleteTicketType\022\031.event" +
      "_tickets.TicketType\032\026.google.protobuf.Em" +
      "pty\"\355\002\222A\306\002\n\014Ticket Types\022\022Delete Ticket " +
      "Type\032\241\002Deletes an existing Ticket Type b" +
      "y ID, or User Defined ID (and Production" +
      " ID). Deleting a Ticket Type results in " +
      "the tickets for the Ticket Type being de" +
      "leted and invalidated in the customers M" +
      "obile Wallet; rendering them unusable. T" +
      "his method is irreversible and should be" +
      " used with care.\202\323\344\223\002\035*\030/eventTickets/ti" +
      "cketType:\001*\022\330\001\n\017listTicketTypes\022$.event_" +
      "tickets.TicketTypeListRequest\032\031.event_ti" +
      "ckets.TicketType\"\201\001\222AK\n\014Ticket Types\022\021Li" +
      "st Ticket Types\032(Lists all Ticket Types " +
      "for a Production.\202\323\344\223\002-\"(/eventTickets/t" +
      "icketTypes/{productionId}:\001*0\001\022\356\002\n\013issue" +
      "Ticket\022!.event_tickets.IssueTicketReques" +
      "t\032\006.io.Id\"\263\002\222A\220\002\n\007Tickets\022\014Issue Ticket\032" +
      "\366\001Creates a new unique Ticket record by " +
      "PassKit IDs. If the Event does not yet e" +
      "xist, it will automatically be created. " +
      "The combination of event.production.id, " +
      "event.startDate, event.venue.id & ticket" +
      ".ticketTypeUid is enforced as unique for" +
      " Events.\202\323\344\223\002\031\"\024/eventTickets/ticket:\001*\022" +
      "\321\003\n\017issueTicketById\022\025.event_tickets.Tick" +
      "et\032%.event_tickets.IssueTicketResponseId" +
      "s\"\377\002\222A\331\002\n\007Tickets\022\014Issue Ticket\032\277\002Create" +
      "s a new unique Ticket record by User Def" +
      "ined IDs. User Defined IDs for Productio" +
      "n, Venue and TicketType are required. If" +
      " the Event does not yet exist, it will a" +
      "utomatically be created. The combination" +
      " of event.production.id, event.startDate" +
      ", event.venue.id & ticket.ticketTypeUid " +
      "is enforced as unique for Events.\202\323\344\223\002\034\"" +
      "\027/eventTickets/ticket/id:\001*\022\345\001\n\014updateTi" +
      "cket\022\025.event_tickets.Ticket\032\006.io.Id\"\265\001\222A" +
      "\222\001\n\007Tickets\022\rUpdate Ticket\032xUpdates an e" +
      "xisting Ticket. Requires ticket.ID to be" +
      " set, or ticket.ticketNumber + ticket.ev" +
      "ent.production.id to be set.\202\323\344\223\002\031\032\024/eve" +
      "ntTickets/ticket:\001*\022\300\001\n\013patchPerson\022 .ev" +
      "ent_tickets.EventTicketPerson\032\006.io.Id\"\206\001" +
      "\222A]\n\007Tickets\022\033Update Personal Informatio" +
      "n\0325Updates personal information of a eve" +
      "nt ticket holder\202\323\344\223\002 2\033/eventTickets/ti" +
      "cket/person:\001*\022\213\003\n\016validateTicket\022$.even" +
      "t_tickets.ValidateTicketRequest\032%.event_" +
      "tickets.ValidateTicketResponse\"\253\002\222A\377\001\n\007T" +
      "ickets\022\017Validate Ticket\032\342\001Validates an e" +
      "xisting Ticket. Use this endpoint when y" +
      "ou want to check validity of a ticket. T" +
      "ickets can be validated multiple times. " +
      "Requires ticket.id to be set, or ticket." +
      "ticketNumber + ticket.event.production.i" +
      "d to be set.\202\323\344\223\002\"\032\035/eventTickets/ticket" +
      "/validate:\001*\022\225\002\n\014redeemTicket\022\".event_ti" +
      "ckets.RedeemTicketRequest\032\006.io.Id\"\330\001\222A\256\001" +
      "\n\007Tickets\022\rRedeem Ticket\032\223\001Redeems an ex" +
      "isting Ticket. Use this endpoint when yo" +
      "u want to capture redemption data and tr" +
      "igger the switch to the redeemed design " +
      "of the Ticket.\202\323\344\223\002 \032\033/eventTickets/tick" +
      "et/redeem:\001*\022\320\002\n\032redeemTicketsByOrderNum" +
      "ber\022\".event_tickets.RedeemByOrderNumber\032" +
      "\007.io.Ids\"\204\002\222A\315\001\n\007Tickets\022\036Redeem Tickets" +
      " by Order Number\032\241\001Redeems existing Tick" +
      "ets by Order Number. Use this endpoint w" +
      "hen you want to capture redemption data " +
      "and trigger the switch to the redeemed d" +
      "esign of the Ticket.\202\323\344\223\002-\032(/eventTicket" +
      "s/tickets/orderNumber/redeem:\001*\022\217\001\n\rgetT" +
      "icketById\022\006.io.Id\032\025.event_tickets.Ticket" +
      "\"_\222A8\n\007Tickets\022\020Get Ticket by ID\032\033Gets a" +
      " Ticket record by ID.\202\323\344\223\002\036\022\034/eventTicke" +
      "ts/ticket/id/{id}\022\320\001\n\027getTicketByTicketN" +
      "umber\022\".event_tickets.TicketNumberReques" +
      "t\032\025.event_tickets.Ticket\"z\222AN\n\007Tickets\022\033" +
      "Get Ticket by Ticket Number\032&Gets a Tick" +
      "et record by Ticket Number.\202\323\344\223\002#\022!/even" +
      "tTickets/ticket/ticketNumber\022\316\001\n\027getTick" +
      "etsByOrderNumber\022!.event_tickets.OrderNu" +
      "mberRequest\032\026.event_tickets.Tickets\"x\222AL" +
      "\n\007Tickets\022\033Get Tickets by Order Number\032$" +
      "Gets Ticket records by Order Number.\202\323\344\223" +
      "\002#\022!/eventTickets/tickets/orderNumber\022\256\002" +
      "\n\022getEventTicketPass\022%.event_tickets.Eve" +
      "ntTicketPassRequest\032\017.io.PassBundles\"\337\001\222" +
      "A\276\001\n\007Tickets\022\025Get Event Ticket Pass\032\233\001Re" +
      "trieves digital event ticket pass(es) in" +
      " the requested format based on the index" +
      " provided. Only one of ticketId, ticketN" +
      "umber or orderNumber is required.\202\323\344\223\002\027\"" +
      "\022/eventTickets/pass:\001*\022\225\003\n\014deleteTicket\022" +
      "\027.event_tickets.TicketId\032\026.google.protob" +
      "uf.Empty\"\323\002\222A\260\002\n\007Tickets\022\rDelete Ticket\032" +
      "\225\002Delete an existing Ticket by Id or Tic" +
      "ket Number. Invalidates the ticket in th" +
      "e customers Mobile Wallet; rendering it " +
      "useless. This method is irreversible and" +
      " should be used with care. Requires tick" +
      "et.ID to be set, or ticket.ticketNumber " +
      "+ ticket.event.production.id to be set.\202" +
      "\323\344\223\002\031*\024/eventTickets/ticket:\001*\022\335\002\n\032delet" +
      "eTicketsByOrderNumber\022!.event_tickets.Or" +
      "derNumberRequest\032\026.google.protobuf.Empty" +
      "\"\203\002\222A\333\001\n\007Tickets\022\036Delete Tickets by Orde" +
      "r Number\032\257\001Delete existing Ticketd by Or" +
      "der Number. Invalidates the ticket in th" +
      "e customers Mobile Wallet; rendering it " +
      "useless. This method is irreversible and" +
      " should be used with care.\202\323\344\223\002\036*\031/event" +
      "Tickets/orderNumber:\001*\022\317\001\n\013listTickets\022 " +
      ".event_tickets.TicketListRequest\032\".event" +
      "_tickets.TicketLimitedFields\"x\222AP\n\007Ticke" +
      "ts\022\014List Tickets\0327List all tickets for a" +
      " Production. Supports pagination.\202\323\344\223\002\037\"" +
      "\032/eventTickets/tickets/list:\001*0\001\022\313\001\n\014cou" +
      "ntTickets\022 .event_tickets.TicketListRequ" +
      "est\032\t.io.Count\"\215\001\222Ad\n\007Tickets\022\rCount Tic" +
      "kets\032JCount all tickets for a Production" +
      ", Event, Ticket Type and / or Start Date" +
      "\202\323\344\223\002 \"\033/eventTickets/tickets/count:\001*B\354" +
      "\007\n\035com.passkit.grpc.EventTicketsZ2stash." +
      "passkit.com/io/model/sdk/go/io/event_tic" +
      "kets\252\002\031PassKit.Grpc.EventTickets\222A\371\006\022\264\002\n" +
      "\031PassKit Event Tickets API\022\221\001This API en" +
      "ables you to get all your Digital Event " +
      "Tickets into Apple Wallet & Google Pay, " +
      "from theatre and cinema, to sport events" +
      " and concerts.\0328https://passkit.com/lega" +
      "l/terms-of-subscription-service/\"?\n\017Pass" +
      "Kit Support\022\027https://docs.passkit.io\032\023su" +
      "pport@passkit.com2\0100.1-spec*\001\0022\020applicat" +
      "ion/json:\020application/jsonR9\n\003200\0222\n(Ret" +
      "urned when the request is successful.\022\006\n" +
      "\004\232\002\001\007R4\n\003400\022-\n+Returned when wrong user" +
      " input is provided.R0\n\003401\022)\n\'Returned w" +
      "hen the user is unauthorized.RP\n\003403\022I\nG" +
      "Returned when the user does not have per" +
      "mission to access the resource.R;\n\003404\0224" +
      "\n*Returned when the resource does not ex" +
      "ist.\022\006\n\004\232\002\001\007R<\n\003500\0225\n+Returned when the" +
      "re is an unexpected error.\022\006\n\004\232\002\001\007RW\n\00350" +
      "3\022P\nNServer is unavailable. Back off for" +
      " 250ms and repeat request until successf" +
      "ul.Z>\n<\n\napiKeyAuth\022.\010\002\022\031JWT Authenticat" +
      "ion token.\032\rAuthorization \002b\020\n\016\n\napiKeyA" +
      "uth\022\000b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
          com.passkit.grpc.CommonObjects.getDescriptor(),
          com.passkit.grpc.Filter.getDescriptor(),
          com.passkit.grpc.Reporting.getDescriptor(),
          com.passkit.grpc.EventTickets.EventOuterClass.getDescriptor(),
          com.passkit.grpc.EventTickets.ProductionOuterClass.getDescriptor(),
          com.passkit.grpc.EventTickets.TicketTypeOuterClass.getDescriptor(),
          com.passkit.grpc.EventTickets.TicketOuterClass.getDescriptor(),
          com.passkit.grpc.EventTickets.VenueOuterClass.getDescriptor(),
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
    com.passkit.grpc.Filter.getDescriptor();
    com.passkit.grpc.Reporting.getDescriptor();
    com.passkit.grpc.EventTickets.EventOuterClass.getDescriptor();
    com.passkit.grpc.EventTickets.ProductionOuterClass.getDescriptor();
    com.passkit.grpc.EventTickets.TicketTypeOuterClass.getDescriptor();
    com.passkit.grpc.EventTickets.TicketOuterClass.getDescriptor();
    com.passkit.grpc.EventTickets.VenueOuterClass.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
