// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.MarketPriceReply}
 */
public final class MarketPriceReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.MarketPriceReply)
    MarketPriceReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MarketPriceReply.newBuilder() to construct.
  private MarketPriceReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MarketPriceReply() {
    prices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MarketPriceReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MarketPriceReply(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              prices_ = new java.util.ArrayList<com.tdexswap.v1.PriceWithFee>();
              mutable_bitField0_ |= 0x00000001;
            }
            prices_.add(
                input.readMessage(com.tdexswap.v1.PriceWithFee.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        prices_ = java.util.Collections.unmodifiableList(prices_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_MarketPriceReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_MarketPriceReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdexswap.v1.MarketPriceReply.class, com.tdexswap.v1.MarketPriceReply.Builder.class);
  }

  public static final int PRICES_FIELD_NUMBER = 1;
  private java.util.List<com.tdexswap.v1.PriceWithFee> prices_;
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tdexswap.v1.PriceWithFee> getPricesList() {
    return prices_;
  }
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tdexswap.v1.PriceWithFeeOrBuilder> 
      getPricesOrBuilderList() {
    return prices_;
  }
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public int getPricesCount() {
    return prices_.size();
  }
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.PriceWithFee getPrices(int index) {
    return prices_.get(index);
  }
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.PriceWithFeeOrBuilder getPricesOrBuilder(
      int index) {
    return prices_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < prices_.size(); i++) {
      output.writeMessage(1, prices_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < prices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, prices_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.tdexswap.v1.MarketPriceReply)) {
      return super.equals(obj);
    }
    com.tdexswap.v1.MarketPriceReply other = (com.tdexswap.v1.MarketPriceReply) obj;

    if (!getPricesList()
        .equals(other.getPricesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPricesCount() > 0) {
      hash = (37 * hash) + PRICES_FIELD_NUMBER;
      hash = (53 * hash) + getPricesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketPriceReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.MarketPriceReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.MarketPriceReply parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.MarketPriceReply prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code tdexswap.v1.MarketPriceReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.MarketPriceReply)
      com.tdexswap.v1.MarketPriceReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_MarketPriceReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_MarketPriceReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdexswap.v1.MarketPriceReply.class, com.tdexswap.v1.MarketPriceReply.Builder.class);
    }

    // Construct using com.tdexswap.v1.MarketPriceReply.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getPricesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (pricesBuilder_ == null) {
        prices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        pricesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_MarketPriceReply_descriptor;
    }

    @java.lang.Override
    public com.tdexswap.v1.MarketPriceReply getDefaultInstanceForType() {
      return com.tdexswap.v1.MarketPriceReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdexswap.v1.MarketPriceReply build() {
      com.tdexswap.v1.MarketPriceReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdexswap.v1.MarketPriceReply buildPartial() {
      com.tdexswap.v1.MarketPriceReply result = new com.tdexswap.v1.MarketPriceReply(this);
      int from_bitField0_ = bitField0_;
      if (pricesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          prices_ = java.util.Collections.unmodifiableList(prices_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.prices_ = prices_;
      } else {
        result.prices_ = pricesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.tdexswap.v1.MarketPriceReply) {
        return mergeFrom((com.tdexswap.v1.MarketPriceReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdexswap.v1.MarketPriceReply other) {
      if (other == com.tdexswap.v1.MarketPriceReply.getDefaultInstance()) return this;
      if (pricesBuilder_ == null) {
        if (!other.prices_.isEmpty()) {
          if (prices_.isEmpty()) {
            prices_ = other.prices_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePricesIsMutable();
            prices_.addAll(other.prices_);
          }
          onChanged();
        }
      } else {
        if (!other.prices_.isEmpty()) {
          if (pricesBuilder_.isEmpty()) {
            pricesBuilder_.dispose();
            pricesBuilder_ = null;
            prices_ = other.prices_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pricesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPricesFieldBuilder() : null;
          } else {
            pricesBuilder_.addAllMessages(other.prices_);
          }
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.tdexswap.v1.MarketPriceReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdexswap.v1.MarketPriceReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.tdexswap.v1.PriceWithFee> prices_ =
      java.util.Collections.emptyList();
    private void ensurePricesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        prices_ = new java.util.ArrayList<com.tdexswap.v1.PriceWithFee>(prices_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tdexswap.v1.PriceWithFee, com.tdexswap.v1.PriceWithFee.Builder, com.tdexswap.v1.PriceWithFeeOrBuilder> pricesBuilder_;

    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public java.util.List<com.tdexswap.v1.PriceWithFee> getPricesList() {
      if (pricesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(prices_);
      } else {
        return pricesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public int getPricesCount() {
      if (pricesBuilder_ == null) {
        return prices_.size();
      } else {
        return pricesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public com.tdexswap.v1.PriceWithFee getPrices(int index) {
      if (pricesBuilder_ == null) {
        return prices_.get(index);
      } else {
        return pricesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder setPrices(
        int index, com.tdexswap.v1.PriceWithFee value) {
      if (pricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePricesIsMutable();
        prices_.set(index, value);
        onChanged();
      } else {
        pricesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder setPrices(
        int index, com.tdexswap.v1.PriceWithFee.Builder builderForValue) {
      if (pricesBuilder_ == null) {
        ensurePricesIsMutable();
        prices_.set(index, builderForValue.build());
        onChanged();
      } else {
        pricesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(com.tdexswap.v1.PriceWithFee value) {
      if (pricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePricesIsMutable();
        prices_.add(value);
        onChanged();
      } else {
        pricesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        int index, com.tdexswap.v1.PriceWithFee value) {
      if (pricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePricesIsMutable();
        prices_.add(index, value);
        onChanged();
      } else {
        pricesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        com.tdexswap.v1.PriceWithFee.Builder builderForValue) {
      if (pricesBuilder_ == null) {
        ensurePricesIsMutable();
        prices_.add(builderForValue.build());
        onChanged();
      } else {
        pricesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addPrices(
        int index, com.tdexswap.v1.PriceWithFee.Builder builderForValue) {
      if (pricesBuilder_ == null) {
        ensurePricesIsMutable();
        prices_.add(index, builderForValue.build());
        onChanged();
      } else {
        pricesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder addAllPrices(
        java.lang.Iterable<? extends com.tdexswap.v1.PriceWithFee> values) {
      if (pricesBuilder_ == null) {
        ensurePricesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, prices_);
        onChanged();
      } else {
        pricesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder clearPrices() {
      if (pricesBuilder_ == null) {
        prices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pricesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public Builder removePrices(int index) {
      if (pricesBuilder_ == null) {
        ensurePricesIsMutable();
        prices_.remove(index);
        onChanged();
      } else {
        pricesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public com.tdexswap.v1.PriceWithFee.Builder getPricesBuilder(
        int index) {
      return getPricesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public com.tdexswap.v1.PriceWithFeeOrBuilder getPricesOrBuilder(
        int index) {
      if (pricesBuilder_ == null) {
        return prices_.get(index);  } else {
        return pricesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public java.util.List<? extends com.tdexswap.v1.PriceWithFeeOrBuilder> 
         getPricesOrBuilderList() {
      if (pricesBuilder_ != null) {
        return pricesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(prices_);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public com.tdexswap.v1.PriceWithFee.Builder addPricesBuilder() {
      return getPricesFieldBuilder().addBuilder(
          com.tdexswap.v1.PriceWithFee.getDefaultInstance());
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public com.tdexswap.v1.PriceWithFee.Builder addPricesBuilder(
        int index) {
      return getPricesFieldBuilder().addBuilder(
          index, com.tdexswap.v1.PriceWithFee.getDefaultInstance());
    }
    /**
     * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
     */
    public java.util.List<com.tdexswap.v1.PriceWithFee.Builder> 
         getPricesBuilderList() {
      return getPricesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tdexswap.v1.PriceWithFee, com.tdexswap.v1.PriceWithFee.Builder, com.tdexswap.v1.PriceWithFeeOrBuilder> 
        getPricesFieldBuilder() {
      if (pricesBuilder_ == null) {
        pricesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tdexswap.v1.PriceWithFee, com.tdexswap.v1.PriceWithFee.Builder, com.tdexswap.v1.PriceWithFeeOrBuilder>(
                prices_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        prices_ = null;
      }
      return pricesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:tdexswap.v1.MarketPriceReply)
  }

  // @@protoc_insertion_point(class_scope:tdexswap.v1.MarketPriceReply)
  private static final com.tdexswap.v1.MarketPriceReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdexswap.v1.MarketPriceReply();
  }

  public static com.tdexswap.v1.MarketPriceReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MarketPriceReply>
      PARSER = new com.google.protobuf.AbstractParser<MarketPriceReply>() {
    @java.lang.Override
    public MarketPriceReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MarketPriceReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MarketPriceReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MarketPriceReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdexswap.v1.MarketPriceReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

