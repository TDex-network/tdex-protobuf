// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.MarketWithFee}
 */
public  final class MarketWithFee extends
    com.google.protobuf.GeneratedMessageLite<
        MarketWithFee, MarketWithFee.Builder> implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.MarketWithFee)
    MarketWithFeeOrBuilder {
  private MarketWithFee() {
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

  public static final int FEE_FIELD_NUMBER = 2;
  private com.tdexswap.v1.Fee fee_;
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  @java.lang.Override
  public boolean hasFee() {
    return fee_ != null;
  }
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.Fee getFee() {
    return fee_ == null ? com.tdexswap.v1.Fee.getDefaultInstance() : fee_;
  }
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  private void setFee(com.tdexswap.v1.Fee value) {
    value.getClass();
  fee_ = value;
    
    }
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeFee(com.tdexswap.v1.Fee value) {
    value.getClass();
  if (fee_ != null &&
        fee_ != com.tdexswap.v1.Fee.getDefaultInstance()) {
      fee_ =
        com.tdexswap.v1.Fee.newBuilder(fee_).mergeFrom(value).buildPartial();
    } else {
      fee_ = value;
    }
    
  }
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  private void clearFee() {  fee_ = null;
    
  }

  public static com.tdexswap.v1.MarketWithFee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketWithFee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.MarketWithFee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.MarketWithFee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.MarketWithFee prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdexswap.v1.MarketWithFee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdexswap.v1.MarketWithFee, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.MarketWithFee)
      com.tdexswap.v1.MarketWithFeeOrBuilder {
    // Construct using com.tdexswap.v1.MarketWithFee.newBuilder()
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
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    @java.lang.Override
    public boolean hasFee() {
      return instance.hasFee();
    }
    /**
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    @java.lang.Override
    public com.tdexswap.v1.Fee getFee() {
      return instance.getFee();
    }
    /**
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder setFee(com.tdexswap.v1.Fee value) {
      copyOnWrite();
      instance.setFee(value);
      return this;
      }
    /**
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder setFee(
        com.tdexswap.v1.Fee.Builder builderForValue) {
      copyOnWrite();
      instance.setFee(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder mergeFee(com.tdexswap.v1.Fee value) {
      copyOnWrite();
      instance.mergeFee(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
     */
    public Builder clearFee() {  copyOnWrite();
      instance.clearFee();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdexswap.v1.MarketWithFee)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdexswap.v1.MarketWithFee();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "market_",
            "fee_",
          };
          java.lang.String info =
              "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdexswap.v1.MarketWithFee> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdexswap.v1.MarketWithFee.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdexswap.v1.MarketWithFee>(
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


  // @@protoc_insertion_point(class_scope:tdexswap.v1.MarketWithFee)
  private static final com.tdexswap.v1.MarketWithFee DEFAULT_INSTANCE;
  static {
    MarketWithFee defaultInstance = new MarketWithFee();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MarketWithFee.class, defaultInstance);
  }

  public static com.tdexswap.v1.MarketWithFee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MarketWithFee> PARSER;

  public static com.google.protobuf.Parser<MarketWithFee> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

