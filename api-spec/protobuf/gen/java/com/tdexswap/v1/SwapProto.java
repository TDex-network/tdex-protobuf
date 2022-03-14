// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/swap.proto

package com.tdexswap.v1;

public final class SwapProto {
  private SwapProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapRequest_InputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapRequest_InputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapRequest_OutputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapRequest_OutputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapAccept_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapAccept_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapAccept_InputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapAccept_InputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapAccept_OutputBlindingKeyEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapAccept_OutputBlindingKeyEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapComplete_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapComplete_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tdexswap_v1_SwapFail_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tdexswap_v1_SwapFail_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rv1/swap.proto\022\013tdexswap.v1\032\034google/api" +
      "/annotations.proto\"\361\003\n\013SwapRequest\022\016\n\002id" +
      "\030\001 \001(\tR\002id\022\031\n\010amount_p\030\002 \001(\004R\007amountP\022\027\n" +
      "\007asset_p\030\003 \001(\tR\006assetP\022\031\n\010amount_r\030\004 \001(\004" +
      "R\007amountR\022\027\n\007asset_r\030\005 \001(\tR\006assetR\022 \n\013tr" +
      "ansaction\030\006 \001(\tR\013transaction\022\\\n\022input_bl" +
      "inding_key\030\007 \003(\0132..tdexswap.v1.SwapReque" +
      "st.InputBlindingKeyEntryR\020inputBlindingK" +
      "ey\022_\n\023output_blinding_key\030\010 \003(\0132/.tdexsw" +
      "ap.v1.SwapRequest.OutputBlindingKeyEntry" +
      "R\021outputBlindingKey\032C\n\025InputBlindingKeyE" +
      "ntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\014R\005v" +
      "alue:\0028\001\032D\n\026OutputBlindingKeyEntry\022\020\n\003ke" +
      "y\030\001 \001(\tR\003key\022\024\n\005value\030\002 \001(\014R\005value:\0028\001\"\245" +
      "\003\n\nSwapAccept\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\nrequest" +
      "_id\030\002 \001(\tR\trequestId\022 \n\013transaction\030\003 \001(" +
      "\tR\013transaction\022[\n\022input_blinding_key\030\004 \003" +
      "(\0132-.tdexswap.v1.SwapAccept.InputBlindin" +
      "gKeyEntryR\020inputBlindingKey\022^\n\023output_bl" +
      "inding_key\030\005 \003(\0132..tdexswap.v1.SwapAccep" +
      "t.OutputBlindingKeyEntryR\021outputBlinding" +
      "Key\032C\n\025InputBlindingKeyEntry\022\020\n\003key\030\001 \001(" +
      "\tR\003key\022\024\n\005value\030\002 \001(\014R\005value:\0028\001\032D\n\026Outp" +
      "utBlindingKeyEntry\022\020\n\003key\030\001 \001(\tR\003key\022\024\n\005" +
      "value\030\002 \001(\014R\005value:\0028\001\"]\n\014SwapComplete\022\016" +
      "\n\002id\030\001 \001(\tR\002id\022\033\n\taccept_id\030\002 \001(\tR\010accep" +
      "tId\022 \n\013transaction\030\003 \001(\tR\013transaction\"\205\001" +
      "\n\010SwapFail\022\016\n\002id\030\001 \001(\tR\002id\022\035\n\nmessage_id" +
      "\030\002 \001(\tR\tmessageId\022!\n\014failure_code\030\003 \001(\rR" +
      "\013failureCode\022\'\n\017failure_message\030\004 \001(\tR\016f" +
      "ailureMessageB\265\001\n\017com.tdexswap.v1B\tSwapP" +
      "rotoP\001ZJgithub.com/tdex-network/tdex-pro" +
      "totbuf/api-spec/protobuf/gen/v1;tdexswap" +
      "v1\242\002\003TXX\252\002\013Tdexswap.V1\312\002\013Tdexswap\\V1\342\002\027T" +
      "dexswap\\V1\\GPBMetadata\352\002\014Tdexswap::V1b\006p" +
      "roto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_tdexswap_v1_SwapRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tdexswap_v1_SwapRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapRequest_descriptor,
        new java.lang.String[] { "Id", "AmountP", "AssetP", "AmountR", "AssetR", "Transaction", "InputBlindingKey", "OutputBlindingKey", });
    internal_static_tdexswap_v1_SwapRequest_InputBlindingKeyEntry_descriptor =
      internal_static_tdexswap_v1_SwapRequest_descriptor.getNestedTypes().get(0);
    internal_static_tdexswap_v1_SwapRequest_InputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapRequest_InputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdexswap_v1_SwapRequest_OutputBlindingKeyEntry_descriptor =
      internal_static_tdexswap_v1_SwapRequest_descriptor.getNestedTypes().get(1);
    internal_static_tdexswap_v1_SwapRequest_OutputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapRequest_OutputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdexswap_v1_SwapAccept_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tdexswap_v1_SwapAccept_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapAccept_descriptor,
        new java.lang.String[] { "Id", "RequestId", "Transaction", "InputBlindingKey", "OutputBlindingKey", });
    internal_static_tdexswap_v1_SwapAccept_InputBlindingKeyEntry_descriptor =
      internal_static_tdexswap_v1_SwapAccept_descriptor.getNestedTypes().get(0);
    internal_static_tdexswap_v1_SwapAccept_InputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapAccept_InputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdexswap_v1_SwapAccept_OutputBlindingKeyEntry_descriptor =
      internal_static_tdexswap_v1_SwapAccept_descriptor.getNestedTypes().get(1);
    internal_static_tdexswap_v1_SwapAccept_OutputBlindingKeyEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapAccept_OutputBlindingKeyEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tdexswap_v1_SwapComplete_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tdexswap_v1_SwapComplete_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapComplete_descriptor,
        new java.lang.String[] { "Id", "AcceptId", "Transaction", });
    internal_static_tdexswap_v1_SwapFail_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tdexswap_v1_SwapFail_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tdexswap_v1_SwapFail_descriptor,
        new java.lang.String[] { "Id", "MessageId", "FailureCode", "FailureMessage", });
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
