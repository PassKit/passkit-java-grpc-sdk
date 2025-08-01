// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: io/flights/a_rpc.proto
// Protobuf Java Version: 4.31.0

package com.passkit.grpc.Flights;

@com.google.protobuf.Generated
public final class ARpc {
  private ARpc() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 31,
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
      "\n\026io/flights/a_rpc.proto\022\007flights\032\034googl" +
      "e/api/annotations.proto\032\033google/protobuf" +
      "/empty.proto\032.protoc-gen-openapiv2/optio" +
      "ns/annotations.proto\032\036io/flights/boardin" +
      "g_pass.proto\032\030io/flights/airport.proto\032\027" +
      "io/flights/flight.proto\032\"io/flights/flig" +
      "ht_designator.proto\032\030io/flights/carrier." +
      "proto\032\030io/flights/barcode.proto2\3268\n\007Flig" +
      "hts\022\362\001\n\ncreatePort\022\r.flights.Port\032\026.goog" +
      "le.protobuf.Empty\"\274\001\222A\235\001\n\010Airports\022\016Crea" +
      "te Airport\032\031Creates an airport recordJ0\n" +
      "\003400\022)\n\'There is a problem with the inpu" +
      "t data.J4\n\003403\022-\n+Returned when the user" +
      " lacks authorization.\202\323\344\223\002\025\"\020/flights/ai" +
      "rport:\001*\022\322\001\n\007getPort\022\024.flights.AirportCo" +
      "de\032\r.flights.Port\"\241\001\222Ax\n\010Airports\022\013Get A" +
      "irport\032\033Retrieves an airport recordJ\"\n\0034" +
      "03\022\033\n\031User lacks authorization.J\036\n\003404\022\027" +
      "\n\025Record was not found.\202\323\344\223\002 \022\036/flights/" +
      "airport/{airportCode}\022\320\002\n\nupdatePort\022\r.f" +
      "lights.Port\032\r.flights.Port\"\243\002\222A\204\002\n\010Airpo" +
      "rts\022\016Update Airport\032\031Updates an airport " +
      "recordJ0\n\003400\022)\n\'There is a problem with" +
      " the input data.J\"\n\003403\022\033\n\031User lacks au" +
      "thorization.J\036\n\003404\022\027\n\025Record was not fo" +
      "und.JW\n\003503\022P\nNServer is unavailable. Ba" +
      "ck off for 250ms and repeat request unti" +
      "l successful.\202\323\344\223\002\025\032\020/flights/airport:\001*" +
      "\022\347\001\n\ndeletePort\022\024.flights.AirportCode\032\026." +
      "google.protobuf.Empty\"\252\001\222A\213\001\n\010Airports\022\016" +
      "Delete Airport\032\031Deletes a airport record" +
      ".J4\n\003403\022-\n+Returned when the user lacks" +
      " authorization.J\036\n\003404\022\027\n\025Record was not" +
      " found.\202\323\344\223\002\025*\020/flights/airport:\001*\022\367\001\n\rc" +
      "reateCarrier\022\020.flights.Carrier\032\026.google." +
      "protobuf.Empty\"\273\001\222A\234\001\n\010Carriers\022\016Create " +
      "Carrier\032\030Creates a carrier recordJ0\n\003400" +
      "\022)\n\'There is a problem with the input da" +
      "ta.J4\n\003403\022-\n+Returned when the user lac" +
      "ks authorization.\202\323\344\223\002\025\"\020/flights/carrie" +
      "r:\001*\022\327\001\n\ngetCarrier\022\024.flights.CarrierCod" +
      "e\032\020.flights.Carrier\"\240\001\222Aw\n\010Carriers\022\013Get" +
      " Carrier\032\032Retrieves a carrier recordJ\"\n\003" +
      "403\022\033\n\031User lacks authorization.J\036\n\003404\022" +
      "\027\n\025Record was not found.\202\323\344\223\002 \022\036/flights" +
      "/carrier/{carrierCode}\022\330\002\n\rupdateCarrier" +
      "\022\020.flights.Carrier\032\020.flights.Carrier\"\242\002\222" +
      "A\203\002\n\010Carriers\022\016Update Carrier\032\030Updates a" +
      " carrier recordJ0\n\003400\022)\n\'There is a pro" +
      "blem with the input data.J\"\n\003403\022\033\n\031User" +
      " lacks authorization.J\036\n\003404\022\027\n\025Record w" +
      "as not found.JW\n\003503\022P\nNServer is unavai" +
      "lable. Back off for 250ms and repeat req" +
      "uest until successful.\202\323\344\223\002\025\032\020/flights/c" +
      "arrier:\001*\022\352\001\n\rdeleteCarrier\022\024.flights.Ca" +
      "rrierCode\032\026.google.protobuf.Empty\"\252\001\222A\213\001" +
      "\n\010Carriers\022\016Delete Carrier\032\031Deletes a ca" +
      "rrier record.J4\n\003403\022-\n+Returned when th" +
      "e user lacks authorization.J\036\n\003404\022\027\n\025Re" +
      "cord was not found.\202\323\344\223\002\025*\020/flights/carr" +
      "ier:\001*\022\221\003\n\026createFlightDesignator\022\031.flig" +
      "hts.FlightDesignator\032\026.google.protobuf.E" +
      "mpty\"\303\002\222A\241\002\n\022Flight Designators\022\030Create " +
      "Flight Designator\032\"Creates a flight desi" +
      "gnator recordJ0\n\003400\022)\n\'There is a probl" +
      "em with the input data.J\"\n\003403\022\033\n\031User l" +
      "acks authorization.J\036\n\003404\022\027\n\025Record was" +
      " not found.JW\n\003503\022P\nNServer is unavaila" +
      "ble. Back off for 250ms and repeat reque" +
      "st until successful.\202\323\344\223\002\030\"\023/flights/des" +
      "ignator:\001*\022\261\002\n\023getFlightDesignator\022 .fli" +
      "ghts.FlightDesignatorRequest\032\031.flights.F" +
      "lightDesignator\"\334\001\222A\225\001\n\022Flight Designato" +
      "rs\022\025Get Flight Designator\032$Retrieves a f" +
      "light designator recordJ\"\n\003403\022\033\n\031User l" +
      "acks authorization.J\036\n\003404\022\027\n\025Record was" +
      " not found.\202\323\344\223\002=\022;/flights/designator/{" +
      "carrierCode}/{flightNumber}/{revision}\022\224" +
      "\003\n\026updateFlightDesignator\022\031.flights.Flig" +
      "htDesignator\032\031.flights.FlightDesignator\"" +
      "\303\002\222A\241\002\n\022Flight Designators\022\030Update Fligh" +
      "t Designator\032\"Updates a flight designato" +
      "r recordJ0\n\003400\022)\n\'There is a problem wi" +
      "th the input data.J\"\n\003403\022\033\n\031User lacks " +
      "authorization.J\036\n\003404\022\027\n\025Record was not " +
      "found.JW\n\003503\022P\nNServer is unavailable. " +
      "Back off for 250ms and repeat request un" +
      "til successful.\202\323\344\223\002\030\032\023/flights/designat" +
      "or:\001*\022\216\002\n\026deleteFlightDesignator\022 .fligh" +
      "ts.FlightDesignatorRequest\032\026.google.prot" +
      "obuf.Empty\"\271\001\222A\227\001\n\022Flight Designators\022\030D" +
      "elete Flight Designator\032#Deletes a fligh" +
      "t designator record.J\"\n\003403\022\033\n\031User lack" +
      "s authorization.J\036\n\003404\022\027\n\025Record was no" +
      "t found.\202\323\344\223\002\030*\023/flights/designator:\001*\022\300" +
      "\003\n\014createFlight\022\017.flights.Flight\032\026.googl" +
      "e.protobuf.Empty\"\206\003\222A\350\002\n\007Flights\022\rCreate" +
      " Flight\032~Creates a flight record.  Note " +
      "that this method will often not be used," +
      " since new flight records can be automat" +
      "ically created.J0\n\003400\022)\n\'There is a pro" +
      "blem with the input data.J\"\n\003403\022\033\n\031User" +
      " lacks authorization.J\037\n\003409\022\030\n\026Record a" +
      "lready exists.JW\n\003503\022P\nNServer is unava" +
      "ilable. Back off for 250ms and repeat re" +
      "quest until successful.\202\323\344\223\002\024\"\017/flights/" +
      "flight:\001*\022\304\002\n\tgetFlight\022\026.flights.Flight" +
      "Request\032\017.flights.Flight\"\215\002\222At\n\007Flights\022" +
      "\nGet Flight\032\031Retrieves a flight recordJ\"" +
      "\n\003403\022\033\n\031User lacks authorization.J\036\n\00340" +
      "4\022\027\n\025Record was not found.\202\323\344\223\002\217\001\022\214\001/fli" +
      "ghts/flight/{carrierCode}/{flightNumber}" +
      "/{departureDate.year}/{departureDate.mon" +
      "th}/{departureDate.day}/{boardingPoint}/" +
      "{deplaningPoint}\022\211\004\n\014updateFlight\022\017.flig" +
      "hts.Flight\032\017.flights.Flight\"\326\003\222A\270\003\n\007Flig" +
      "hts\022\024Update Flight Number\032\307\001Updates a fl" +
      "ight number record.  Note that if the fl" +
      "ight number is subscribed to automatic f" +
      "light alerts, this method may not be req" +
      "uired and that changes made may be overw" +
      "ritten by automatic updatesJ0\n\003400\022)\n\'Th" +
      "ere is a problem with the input data.J\"\n" +
      "\003403\022\033\n\031User lacks authorization.J\036\n\003404" +
      "\022\027\n\025Record was not found.JW\n\003503\022P\nNServ" +
      "er is unavailable. Back off for 250ms an" +
      "d repeat request until successful.\202\323\344\223\002\024" +
      "\032\017/flights/flight:\001*\022\241\003\n\014deleteFlight\022\026." +
      "flights.FlightRequest\032\026.google.protobuf." +
      "Empty\"\340\002\222A\302\002\n\007Flights\022\rDelete Flight\032\343\001D" +
      "eletes a flight record. Note that a dele" +
      "ted flight record may be automatically r" +
      "ecreated, unless the [active] flag on th" +
      "e Flight Designator record is set to fal" +
      "se. Deleting a flight deletes all boardi" +
      "ng passes for that flight.J\"\n\003403\022\033\n\031Use" +
      "r lacks authorization.J\036\n\003404\022\027\n\025Record " +
      "was not found.\202\323\344\223\002\024*\017/flights/flight:\001*" +
      "\022\220\004\n\022createBoardingPass\022\033.flights.Boardi" +
      "ngPassRecord\032\037.flights.BoardingPassesRes" +
      "ponse\"\273\003\222A\227\003\n\017Boarding Passes\022\024Create Bo" +
      "arding Pass\032\235\001Creates a boarding pass re" +
      "cord. If flight record for the date does" +
      " not yet exist, it will be created using" +
      " the Flight Designator defaults. Returns" +
      " a pass id.J0\n\003400\022)\n\'There is a problem" +
      " with the input data.J\"\n\003403\022\033\n\031User lac" +
      "ks authorization.J\037\n\003409\022\030\n\026Record alrea" +
      "dy exists.JW\n\003503\022P\nNServer is unavailab" +
      "le. Back off for 250ms and repeat reques" +
      "t until successful.\202\323\344\223\002\032\"\025/flights/boar" +
      "dingPass:\001*\022\312\002\n\025getBoardingPassRecord\022\"." +
      "flights.BoardingPassRecordRequest\032\033.flig" +
      "hts.BoardingPassRecord\"\357\001\222A\311\001\n\017Boarding " +
      "Passes\022\030Get Boarding Pass Record\032XRetrie" +
      "ves a boarding pass record. One of ticke" +
      "tNumber, index or passId must be provide" +
      "d.J\"\n\003403\022\033\n\031User lacks authorization.J\036" +
      "\n\003404\022\027\n\025Record was not found.\202\323\344\223\002\034\"\027/f" +
      "lights/boardingRecord:\001*\022\351\002\n\017getBoarding" +
      "Pass\022\034.flights.BoardingPassRequest\032\037.fli" +
      "ghts.BoardingPassesResponse\"\226\002\222A\372\001\n\017Boar" +
      "ding Passes\022\021Get Boarding Pass\032\217\001Retriev" +
      "es digital boarding pass(es) in the requ" +
      "ested format based on the index provided" +
      ". Supply only one of ticketNumber, index" +
      ", pnr or passId.J\"\n\003403\022\033\n\031User lacks au" +
      "thorization.J\036\n\003404\022\027\n\025Record was not fo" +
      "und.\202\323\344\223\002\022\"\r/flights/pass:\001*\022\252\004\n\022updateB" +
      "oardingPass\022\033.flights.BoardingPassRecord" +
      "\032\033.flights.BoardingPassRecord\"\331\003\222A\263\003\n\017Bo" +
      "arding Passes\022\024Update Boarding Pass\032\272\001Up" +
      "dates a boarding pass record. Either tic" +
      "ketNumber and ticketLeg or carrier, flig" +
      "ht number, flightDate, boardingPoint and" +
      " sequenceNumber must be provided. All ot" +
      "her fields are optional.J0\n\003400\022)\n\'There" +
      " is a problem with the input data.J\"\n\00340" +
      "3\022\033\n\031User lacks authorization.J\036\n\003404\022\027\n" +
      "\025Record was not found.JW\n\003503\022P\nNServer " +
      "is unavailable. Back off for 250ms and r" +
      "epeat request until successful.\202\323\344\223\002\034\032\027/" +
      "flights/boardingRecord:\001*\022\204\002\n\022deleteBoar" +
      "dingPass\022\".flights.BoardingPassRecordReq" +
      "uest\032\026.google.protobuf.Empty\"\261\001\222A\213\001\n\017Boa" +
      "rding Passes\022\024Delete Boarding Pass\032\036Dele" +
      "tes a boarding pass recordJ\"\n\003403\022\033\n\031Use" +
      "r lacks authorization.J\036\n\003404\022\027\n\025Record " +
      "was not found.\202\323\344\223\002\034*\027/flights/boardingR" +
      "ecord:\001*B\215\003\n\030com.passkit.grpc.FlightsZ,s" +
      "tash.passkit.com/io/model/sdk/go/io/flig" +
      "hts\252\002\024PassKit.Grpc.Flights\222A\252\002\022\200\002\n\023PassK" +
      "it Flights API\022iThe PassKit Flights API " +
      "lets you manage your flights and boardin" +
      "g passes for Apple Wallet and Google Pay" +
      ".\0328https://passkit.com/legal/terms-of-su" +
      "bscription-service/\"?\n\017PassKit Support\022\027" +
      "https://docs.passkit.io\032\023support@passkit" +
      ".com2\0030.1*\001\0022\020application/json:\020applicat" +
      "ion/jsonb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor(),
          com.passkit.grpc.Flights.BoardingPass.getDescriptor(),
          com.passkit.grpc.Flights.Airport.getDescriptor(),
          com.passkit.grpc.Flights.FlightOuterClass.getDescriptor(),
          com.passkit.grpc.Flights.FlightDesignatorOuterClass.getDescriptor(),
          com.passkit.grpc.Flights.CarrierOuterClass.getDescriptor(),
          com.passkit.grpc.Flights.Barcode.getDescriptor(),
        });
    descriptor.resolveAllFeaturesImmutable();
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    grpc.gateway.protoc_gen_openapiv2.options.Annotations.getDescriptor();
    com.passkit.grpc.Flights.BoardingPass.getDescriptor();
    com.passkit.grpc.Flights.Airport.getDescriptor();
    com.passkit.grpc.Flights.FlightOuterClass.getDescriptor();
    com.passkit.grpc.Flights.FlightDesignatorOuterClass.getDescriptor();
    com.passkit.grpc.Flights.CarrierOuterClass.getDescriptor();
    com.passkit.grpc.Flights.Barcode.getDescriptor();
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
