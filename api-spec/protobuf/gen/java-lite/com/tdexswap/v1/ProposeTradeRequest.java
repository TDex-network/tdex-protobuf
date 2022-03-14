// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.ProposeTradeRequest}
 */
public  final class ProposeTradeRequest extends
    com.google.protobuf.GeneratedMessageLite<
        ProposeTradeRequest, ProposeTradeRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.ProposeTradeRequest)
    ProposeTradeRequestOrBuilder {
  private ProposeTradeRequest() {
  }
  public static final int MARKET_FIELD_NUMBER = 1;
  private com.tdexswap.v1.Market market_;
  /**
   * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
   */
  @java.lang.Override
  public boolean hasMarket() {
    return market_ != null;
  }
  /**
   * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.Market getMarket() {
    return market_ == null ? com.tdexswap.v1.Market.getDefaultInstance() : market_;
  }
  /**
   * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
   */
  private void setMarket(com.tdexswap.v1.Market value) {
    value.getClass();
  market_ = value;
    
    }
  /**
   * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeMarket(com.tdexswap.v1.Market value) {
    value.getClass();
  if (market_ != null &&
        market_ != com.tdexswap.v1.Market.getDefaultInstance()) {
      market_ =
        com.tdexswap.v1.Market.newBuilder(market_).mergeFrom(value).buildPartial();
    } else {
      market_ = value;
    }
    
  }
  /**
   * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
   */
  private void clearMarket() {  market_ = null;
    
  }

  public static final int TYPE_FIELD_NUMBER = 2;
  private int type_;
  /**
   * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
   * @return The enum numeric value on the wire for type.
   */
  @java.lang.Override
  public int getTypeValue() {
    return type_;
  }
  /**
   * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
   * @return The type.
   */
  @java.lang.Override
  public com.tdexswap.v1.TradeType getType() {
    com.tdexswap.v1.TradeType result = com.tdexswap.v1.TradeType.forNumber(type_);
    return result == null ? com.tdexswap.v1.TradeType.UNRECOGNIZED : result;
  }
  /**
   * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
   * @param value The enum numeric value on the wire for type to set.
   */
  private void setTypeValue(int value) {
      type_ = value;
  }
  /**
   * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
   * @param value The type to set.
   */
  private void setType(com.tdexswap.v1.TradeType value) {
    type_ = value.getNumber();
    
  }
  /**
   * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
   */
  private void clearType() {
    
    type_ = 0;
  }

  public static final int SWAP_REQUEST_FIELD_NUMBER = 3;
  private com.tdexswap.v1.SwapRequest swapRequest_;
  /**
   * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  @java.lang.Override
  public boolean hasSwapRequest() {
    return swapRequest_ != null;
  }
  /**
   * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.SwapRequest getSwapRequest() {
    return swapRequest_ == null ? com.tdexswap.v1.SwapRequest.getDefaultInstance() : swapRequest_;
  }
  /**
   * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  private void setSwapRequest(com.tdexswap.v1.SwapRequest value) {
    value.getClass();
  swapRequest_ = value;
    
    }
  /**
   * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeSwapRequest(com.tdexswap.v1.SwapRequest value) {
    value.getClass();
  if (swapRequest_ != null &&
        swapRequest_ != com.tdexswap.v1.SwapRequest.getDefaultInstance()) {
      swapRequest_ =
        com.tdexswap.v1.SwapRequest.newBuilder(swapRequest_).mergeFrom(value).buildPartial();
    } else {
      swapRequest_ = value;
    }
    
  }
  /**
   * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
   */
  private void clearSwapRequest() {  swapRequest_ = null;
    
  }

  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.ProposeTradeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.ProposeTradeRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdexswap.v1.ProposeTradeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdexswap.v1.ProposeTradeRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.ProposeTradeRequest)
      com.tdexswap.v1.ProposeTradeRequestOrBuilder {
    // Construct using com.tdexswap.v1.ProposeTradeRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    @java.lang.Override
    public boolean hasMarket() {
      return instance.hasMarket();
    }
    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    @java.lang.Override
    public com.tdexswap.v1.Market getMarket() {
      return instance.getMarket();
    }
    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(com.tdexswap.v1.Market value) {
      copyOnWrite();
      instance.setMarket(value);
      return this;
      }
    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder setMarket(
        com.tdexswap.v1.Market.Builder builderForValue) {
      copyOnWrite();
      instance.setMarket(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder mergeMarket(com.tdexswap.v1.Market value) {
      copyOnWrite();
      instance.mergeMarket(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.Market market = 1 [json_name = "market"];</code>
     */
    public Builder clearMarket() {  copyOnWrite();
      instance.clearMarket();
      return this;
    }

    /**
     * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
     * @return The enum numeric value on the wire for type.
     */
    @java.lang.Override
    public int getTypeValue() {
      return instance.getTypeValue();
    }
    /**
     * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeValue(int value) {
      copyOnWrite();
      instance.setTypeValue(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
     * @return The type.
     */
    @java.lang.Override
    public com.tdexswap.v1.TradeType getType() {
      return instance.getType();
    }
    /**
     * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
     * @param value The enum numeric value on the wire for type to set.
     * @return This builder for chaining.
     */
    public Builder setType(com.tdexswap.v1.TradeType value) {
      copyOnWrite();
      instance.setType(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.TradeType type = 2 [json_name = "type"];</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      copyOnWrite();
      instance.clearType();
      return this;
    }

    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    @java.lang.Override
    public boolean hasSwapRequest() {
      return instance.hasSwapRequest();
    }
    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    @java.lang.Override
    public com.tdexswap.v1.SwapRequest getSwapRequest() {
      return instance.getSwapRequest();
    }
    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder setSwapRequest(com.tdexswap.v1.SwapRequest value) {
      copyOnWrite();
      instance.setSwapRequest(value);
      return this;
      }
    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder setSwapRequest(
        com.tdexswap.v1.SwapRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setSwapRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder mergeSwapRequest(com.tdexswap.v1.SwapRequest value) {
      copyOnWrite();
      instance.mergeSwapRequest(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.SwapRequest swap_request = 3 [json_name = "swapRequest"];</code>
     */
    public Builder clearSwapRequest() {  copyOnWrite();
      instance.clearSwapRequest();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdexswap.v1.ProposeTradeRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdexswap.v1.ProposeTradeRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "market_",
            "type_",
            "swapRequest_",
          };
          java.lang.String info =
              "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\f\u0003" +
              "\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdexswap.v1.ProposeTradeRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdexswap.v1.ProposeTradeRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdexswap.v1.ProposeTradeRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:tdexswap.v1.ProposeTradeRequest)
  private static final com.tdexswap.v1.ProposeTradeRequest DEFAULT_INSTANCE;
  static {
    ProposeTradeRequest defaultInstance = new ProposeTradeRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      ProposeTradeRequest.class, defaultInstance);
  }

  public static com.tdexswap.v1.ProposeTradeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<ProposeTradeRequest> PARSER;

  public static com.google.protobuf.Parser<ProposeTradeRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

