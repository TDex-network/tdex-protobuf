// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

public final class TradeProto {
  private TradeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_MarketsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_MarketsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_MarketsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_MarketsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_BalancesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_BalancesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_BalancesReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_BalancesReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_MarketPriceRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_MarketPriceRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_MarketPriceReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_MarketPriceReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_TradeProposeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_TradeProposeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_TradeProposeReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_TradeProposeReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_TradeCompleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_TradeCompleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_TradeCompleteReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_TradeCompleteReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_ProposeTradeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_ProposeTradeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_ProposeTradeReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_ProposeTradeReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_CompleteTradeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_CompleteTradeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_CompleteTradeReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_CompleteTradeReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016v1/trade.proto\022\013tdexswap.v1\032\rv1/swap.p" +
      "roto\032\016v1/types.proto\032\034google/api/annotat" +
      "ions.proto\"\020\n\016MarketsRequest\"D\n\014MarketsR" +
      "eply\0224\n\007markets\030\001 \003(\0132\032.tdexswap.v1.Mark" +
      "etWithFeeR\007markets\"Q\n\017BalancesRequest\022\035\n" +
      "\nbase_asset\030\001 \001(\tR\tbaseAsset\022\037\n\013quote_as" +
      "set\030\002 \001(\tR\nquoteAsset\"H\n\rBalancesReply\0227" +
      "\n\010balances\030\001 \003(\0132\033.tdexswap.v1.BalanceWi" +
      "thFeeR\010balances\"\233\001\n\022MarketPriceRequest\022+" +
      "\n\006market\030\001 \001(\0132\023.tdexswap.v1.MarketR\006mar" +
      "ket\022*\n\004type\030\002 \001(\0162\026.tdexswap.v1.TradeTyp" +
      "eR\004type\022\026\n\006amount\030\003 \001(\004R\006amount\022\024\n\005asset" +
      "\030\004 \001(\tR\005asset\"E\n\020MarketPriceReply\0221\n\006pri" +
      "ces\030\001 \003(\0132\031.tdexswap.v1.PriceWithFeeR\006pr" +
      "ices\"\253\001\n\023TradeProposeRequest\022+\n\006market\030\001" +
      " \001(\0132\023.tdexswap.v1.MarketR\006market\022*\n\004typ" +
      "e\030\002 \001(\0162\026.tdexswap.v1.TradeTypeR\004type\022;\n" +
      "\014swap_request\030\003 \001(\0132\030.tdexswap.v1.SwapRe" +
      "questR\013swapRequest\"\253\001\n\021TradeProposeReply" +
      "\0228\n\013swap_accept\030\001 \001(\0132\027.tdexswap.v1.Swap" +
      "AcceptR\nswapAccept\0222\n\tswap_fail\030\002 \001(\0132\025." +
      "tdexswap.v1.SwapFailR\010swapFail\022(\n\020expiry" +
      "_time_unix\030\003 \001(\004R\016expiryTimeUnix\"\212\001\n\024Tra" +
      "deCompleteRequest\022>\n\rswap_complete\030\001 \001(\013" +
      "2\031.tdexswap.v1.SwapCompleteR\014swapComplet" +
      "e\0222\n\tswap_fail\030\002 \001(\0132\025.tdexswap.v1.SwapF" +
      "ailR\010swapFail\"\\\n\022TradeCompleteReply\022\022\n\004t" +
      "xid\030\001 \001(\tR\004txid\0222\n\tswap_fail\030\002 \001(\0132\025.tde" +
      "xswap.v1.SwapFailR\010swapFail\"\253\001\n\023ProposeT" +
      "radeRequest\022+\n\006market\030\001 \001(\0132\023.tdexswap.v" +
      "1.MarketR\006market\022*\n\004type\030\002 \001(\0162\026.tdexswa" +
      "p.v1.TradeTypeR\004type\022;\n\014swap_request\030\003 \001" +
      "(\0132\030.tdexswap.v1.SwapRequestR\013swapReques" +
      "t\"\253\001\n\021ProposeTradeReply\0228\n\013swap_accept\030\001" +
      " \001(\0132\027.tdexswap.v1.SwapAcceptR\nswapAccep" +
      "t\0222\n\tswap_fail\030\002 \001(\0132\025.tdexswap.v1.SwapF" +
      "ailR\010swapFail\022(\n\020expiry_time_unix\030\003 \001(\004R" +
      "\016expiryTimeUnix\"\212\001\n\024CompleteTradeRequest" +
      "\022>\n\rswap_complete\030\001 \001(\0132\031.tdexswap.v1.Sw" +
      "apCompleteR\014swapComplete\0222\n\tswap_fail\030\002 " +
      "\001(\0132\025.tdexswap.v1.SwapFailR\010swapFail\"\\\n\022" +
      "CompleteTradeReply\022\022\n\004txid\030\001 \001(\tR\004txid\0222" +
      "\n\tswap_fail\030\002 \001(\0132\025.tdexswap.v1.SwapFail" +
      "R\010swapFail*\036\n\tTradeType\022\007\n\003BUY\020\000\022\010\n\004SELL" +
      "\020\0012\257\006\n\005Trade\022\\\n\007Markets\022\033.tdexswap.v1.Ma" +
      "rketsRequest\032\031.tdexswap.v1.MarketsReply\"" +
      "\031\202\323\344\223\002\023\022\021/v1/trade/markets\022z\n\010Balances\022\034" +
      ".tdexswap.v1.BalancesRequest\032\032.tdexswap." +
      "v1.BalancesReply\"4\202\323\344\223\002.\022,/v1/trade/bala" +
      "nce/{base_asset}/{quote_asset}\022f\n\013Market" +
      "Price\022\037.tdexswap.v1.MarketPriceRequest\032\035" +
      ".tdexswap.v1.MarketPriceReply\"\027\202\323\344\223\002\021\"\017/" +
      "v1/trade/price\022w\n\014TradePropose\022 .tdexswa" +
      "p.v1.TradeProposeRequest\032\036.tdexswap.v1.T" +
      "radeProposeReply\"#\202\323\344\223\002\035:\001*\"\030/v1/trade/s" +
      "tream/propose0\001\022t\n\014ProposeTrade\022 .tdexsw" +
      "ap.v1.ProposeTradeRequest\032\036.tdexswap.v1." +
      "ProposeTradeReply\"\"\202\323\344\223\002\034:\001*\"\027/v1/trade/" +
      "unary/propose\022{\n\rTradeComplete\022!.tdexswa" +
      "p.v1.TradeCompleteRequest\032\037.tdexswap.v1." +
      "TradeCompleteReply\"$\202\323\344\223\002\036:\001*\"\031/v1/trade" +
      "/stream/complete0\001\022x\n\rCompleteTrade\022!.td" +
      "exswap.v1.CompleteTradeRequest\032\037.tdexswa" +
      "p.v1.CompleteTradeReply\"#\202\323\344\223\002\035:\001*\"\030/v1/" +
      "trade/unary/completeB\266\001\n\017com.tdexswap.v1" +
      "B\nTradeProtoP\001ZJgithub.com/tdex-network/" +
      "tdex-prototbuf/api-spec/protobuf/gen/v1;" +
      "tdexswapv1\242\002\003TXX\252\002\013Tdexswap.V1\312\002\013Tdexswa" +
      "p\\V1\342\002\027Tdexswap\\V1\\GPBMetadata\352\002\014Tdexswa" +
      "p::V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.tdexswap.v1.SwapProto.getDescriptor(),
          com.tdexswap.v1.TypesProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_tdexswap_v1_MarketsRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tdexswap_v1_MarketsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_MarketsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_tdexswap_v1_MarketsReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tdexswap_v1_MarketsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_MarketsReply_descriptor,
        new java.lang.String[] { "Markets", });
    internal_static_tdexswap_v1_BalancesRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tdexswap_v1_BalancesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_BalancesRequest_descriptor,
        new java.lang.String[] { "BaseAsset", "QuoteAsset", });
    internal_static_tdexswap_v1_BalancesReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tdexswap_v1_BalancesReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_BalancesReply_descriptor,
        new java.lang.String[] { "Balances", });
    internal_static_tdexswap_v1_MarketPriceRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tdexswap_v1_MarketPriceRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_MarketPriceRequest_descriptor,
        new java.lang.String[] { "Market", "Type", "Amount", "Asset", });
    internal_static_tdexswap_v1_MarketPriceReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tdexswap_v1_MarketPriceReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_MarketPriceReply_descriptor,
        new java.lang.String[] { "Prices", });
    internal_static_tdexswap_v1_TradeProposeRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tdexswap_v1_TradeProposeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_TradeProposeRequest_descriptor,
        new java.lang.String[] { "Market", "Type", "SwapRequest", });
    internal_static_tdexswap_v1_TradeProposeReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tdexswap_v1_TradeProposeReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_TradeProposeReply_descriptor,
        new java.lang.String[] { "SwapAccept", "SwapFail", "ExpiryTimeUnix", });
    internal_static_tdexswap_v1_TradeCompleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tdexswap_v1_TradeCompleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_TradeCompleteRequest_descriptor,
        new java.lang.String[] { "SwapComplete", "SwapFail", });
    internal_static_tdexswap_v1_TradeCompleteReply_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tdexswap_v1_TradeCompleteReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_TradeCompleteReply_descriptor,
        new java.lang.String[] { "Txid", "SwapFail", });
    internal_static_tdexswap_v1_ProposeTradeRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_tdexswap_v1_ProposeTradeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_ProposeTradeRequest_descriptor,
        new java.lang.String[] { "Market", "Type", "SwapRequest", });
    internal_static_tdexswap_v1_ProposeTradeReply_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_tdexswap_v1_ProposeTradeReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_ProposeTradeReply_descriptor,
        new java.lang.String[] { "SwapAccept", "SwapFail", "ExpiryTimeUnix", });
    internal_static_tdexswap_v1_CompleteTradeRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_tdexswap_v1_CompleteTradeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_CompleteTradeRequest_descriptor,
        new java.lang.String[] { "SwapComplete", "SwapFail", });
    internal_static_tdexswap_v1_CompleteTradeReply_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_tdexswap_v1_CompleteTradeReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_CompleteTradeReply_descriptor,
        new java.lang.String[] { "Txid", "SwapFail", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.tdexswap.v1.SwapProto.getDescriptor();
    com.tdexswap.v1.TypesProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
