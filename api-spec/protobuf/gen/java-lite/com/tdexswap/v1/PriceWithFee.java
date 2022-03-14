// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.PriceWithFee}
 */
public  final class PriceWithFee extends
    com.google.protobuf.GeneratedMessageLite<
        PriceWithFee, PriceWithFee.Builder> implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.PriceWithFee)
    PriceWithFeeOrBuilder {
  private PriceWithFee() {
    asset_ = "";
  }
  public static final int PRICE_FIELD_NUMBER = 1;
  private com.tdexswap.v1.Price price_;
  /**
   * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
   */
  @java.lang.Override
  public boolean hasPrice() {
    return price_ != null;
  }
  /**
   * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.Price getPrice() {
    return price_ == null ? com.tdexswap.v1.Price.getDefaultInstance() : price_;
  }
  /**
   * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
   */
  private void setPrice(com.tdexswap.v1.Price value) {
    value.getClass();
  price_ = value;
    
    }
  /**
   * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergePrice(com.tdexswap.v1.Price value) {
    value.getClass();
  if (price_ != null &&
        price_ != com.tdexswap.v1.Price.getDefaultInstance()) {
      price_ =
        com.tdexswap.v1.Price.newBuilder(price_).mergeFrom(value).buildPartial();
    } else {
      price_ = value;
    }
    
  }
  /**
   * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
   */
  private void clearPrice() {  price_ = null;
    
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

  public static final int AMOUNT_FIELD_NUMBER = 3;
  private long amount_;
  /**
   * <code>uint64 amount = 3 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
  }
  /**
   * <code>uint64 amount = 3 [json_name = "amount"];</code>
   * @param value The amount to set.
   */
  private void setAmount(long value) {
    
    amount_ = value;
  }
  /**
   * <code>uint64 amount = 3 [json_name = "amount"];</code>
   */
  private void clearAmount() {
    
    amount_ = 0L;
  }

  public static final int ASSET_FIELD_NUMBER = 4;
  private java.lang.String asset_;
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @return The asset.
   */
  @java.lang.Override
  public java.lang.String getAsset() {
    return asset_;
  }
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @return The bytes for asset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(asset_);
  }
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @param value The asset to set.
   */
  private void setAsset(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    asset_ = value;
  }
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   */
  private void clearAsset() {
    
    asset_ = getDefaultInstance().getAsset();
  }
  /**
   * <code>string asset = 4 [json_name = "asset"];</code>
   * @param value The bytes for asset to set.
   */
  private void setAssetBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    asset_ = value.toStringUtf8();
    
  }

  public static final int BALANCE_FIELD_NUMBER = 5;
  private com.tdexswap.v1.Balance balance_;
  /**
   * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
   */
  @java.lang.Override
  public boolean hasBalance() {
    return balance_ != null;
  }
  /**
   * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.Balance getBalance() {
    return balance_ == null ? com.tdexswap.v1.Balance.getDefaultInstance() : balance_;
  }
  /**
   * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
   */
  private void setBalance(com.tdexswap.v1.Balance value) {
    value.getClass();
  balance_ = value;
    
    }
  /**
   * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeBalance(com.tdexswap.v1.Balance value) {
    value.getClass();
  if (balance_ != null &&
        balance_ != com.tdexswap.v1.Balance.getDefaultInstance()) {
      balance_ =
        com.tdexswap.v1.Balance.newBuilder(balance_).mergeFrom(value).buildPartial();
    } else {
      balance_ = value;
    }
    
  }
  /**
   * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
   */
  private void clearBalance() {  balance_ = null;
    
  }

  public static com.tdexswap.v1.PriceWithFee parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.PriceWithFee parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.PriceWithFee parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.PriceWithFee parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.PriceWithFee prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdexswap.v1.PriceWithFee}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdexswap.v1.PriceWithFee, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.PriceWithFee)
      com.tdexswap.v1.PriceWithFeeOrBuilder {
    // Construct using com.tdexswap.v1.PriceWithFee.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    @java.lang.Override
    public boolean hasPrice() {
      return instance.hasPrice();
    }
    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    @java.lang.Override
    public com.tdexswap.v1.Price getPrice() {
      return instance.getPrice();
    }
    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    public Builder setPrice(com.tdexswap.v1.Price value) {
      copyOnWrite();
      instance.setPrice(value);
      return this;
      }
    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    public Builder setPrice(
        com.tdexswap.v1.Price.Builder builderForValue) {
      copyOnWrite();
      instance.setPrice(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    public Builder mergePrice(com.tdexswap.v1.Price value) {
      copyOnWrite();
      instance.mergePrice(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.Price price = 1 [json_name = "price"];</code>
     */
    public Builder clearPrice() {  copyOnWrite();
      instance.clearPrice();
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

    /**
     * <code>uint64 amount = 3 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return instance.getAmount();
    }
    /**
     * <code>uint64 amount = 3 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {
      copyOnWrite();
      instance.setAmount(value);
      return this;
    }
    /**
     * <code>uint64 amount = 3 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      copyOnWrite();
      instance.clearAmount();
      return this;
    }

    /**
     * <code>string asset = 4 [json_name = "asset"];</code>
     * @return The asset.
     */
    @java.lang.Override
    public java.lang.String getAsset() {
      return instance.getAsset();
    }
    /**
     * <code>string asset = 4 [json_name = "asset"];</code>
     * @return The bytes for asset.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getAssetBytes() {
      return instance.getAssetBytes();
    }
    /**
     * <code>string asset = 4 [json_name = "asset"];</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      copyOnWrite();
      instance.setAsset(value);
      return this;
    }
    /**
     * <code>string asset = 4 [json_name = "asset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      copyOnWrite();
      instance.clearAsset();
      return this;
    }
    /**
     * <code>string asset = 4 [json_name = "asset"];</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setAssetBytes(value);
      return this;
    }

    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    @java.lang.Override
    public boolean hasBalance() {
      return instance.hasBalance();
    }
    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    @java.lang.Override
    public com.tdexswap.v1.Balance getBalance() {
      return instance.getBalance();
    }
    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    public Builder setBalance(com.tdexswap.v1.Balance value) {
      copyOnWrite();
      instance.setBalance(value);
      return this;
      }
    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    public Builder setBalance(
        com.tdexswap.v1.Balance.Builder builderForValue) {
      copyOnWrite();
      instance.setBalance(builderForValue.build());
      return this;
    }
    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    public Builder mergeBalance(com.tdexswap.v1.Balance value) {
      copyOnWrite();
      instance.mergeBalance(value);
      return this;
    }
    /**
     * <code>.tdexswap.v1.Balance balance = 5 [json_name = "balance"];</code>
     */
    public Builder clearBalance() {  copyOnWrite();
      instance.clearBalance();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdexswap.v1.PriceWithFee)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdexswap.v1.PriceWithFee();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "price_",
            "fee_",
            "amount_",
            "asset_",
            "balance_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\t\u0002\t\u0003" +
              "\u0003\u0004\u0208\u0005\t";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdexswap.v1.PriceWithFee> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdexswap.v1.PriceWithFee.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdexswap.v1.PriceWithFee>(
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


  // @@protoc_insertion_point(class_scope:tdexswap.v1.PriceWithFee)
  private static final com.tdexswap.v1.PriceWithFee DEFAULT_INSTANCE;
  static {
    PriceWithFee defaultInstance = new PriceWithFee();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      PriceWithFee.class, defaultInstance);
  }

  public static com.tdexswap.v1.PriceWithFee getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<PriceWithFee> PARSER;

  public static com.google.protobuf.Parser<PriceWithFee> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

