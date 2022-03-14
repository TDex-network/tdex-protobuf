// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.BalancesReply}
 */
public final class BalancesReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.BalancesReply)
    BalancesReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BalancesReply.newBuilder() to construct.
  private BalancesReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BalancesReply() {
    balances_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BalancesReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BalancesReply(
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
              balances_ = new java.util.ArrayList<com.tdexswap.v1.BalanceWithFee>();
              mutable_bitField0_ |= 0x00000001;
            }
            balances_.add(
                input.readMessage(com.tdexswap.v1.BalanceWithFee.parser(), extensionRegistry));
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
        balances_ = java.util.Collections.unmodifiableList(balances_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_BalancesReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_BalancesReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdexswap.v1.BalancesReply.class, com.tdexswap.v1.BalancesReply.Builder.class);
  }

  public static final int BALANCES_FIELD_NUMBER = 1;
  private java.util.List<com.tdexswap.v1.BalanceWithFee> balances_;
  /**
   * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  @java.lang.Override
  public java.util.List<com.tdexswap.v1.BalanceWithFee> getBalancesList() {
    return balances_;
  }
  /**
   * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.tdexswap.v1.BalanceWithFeeOrBuilder> 
      getBalancesOrBuilderList() {
    return balances_;
  }
  /**
   * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  @java.lang.Override
  public int getBalancesCount() {
    return balances_.size();
  }
  /**
   * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.BalanceWithFee getBalances(int index) {
    return balances_.get(index);
  }
  /**
   * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
   */
  @java.lang.Override
  public com.tdexswap.v1.BalanceWithFeeOrBuilder getBalancesOrBuilder(
      int index) {
    return balances_.get(index);
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
    for (int i = 0; i < balances_.size(); i++) {
      output.writeMessage(1, balances_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < balances_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, balances_.get(i));
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
    if (!(obj instanceof com.tdexswap.v1.BalancesReply)) {
      return super.equals(obj);
    }
    com.tdexswap.v1.BalancesReply other = (com.tdexswap.v1.BalancesReply) obj;

    if (!getBalancesList()
        .equals(other.getBalancesList())) return false;
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
    if (getBalancesCount() > 0) {
      hash = (37 * hash) + BALANCES_FIELD_NUMBER;
      hash = (53 * hash) + getBalancesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdexswap.v1.BalancesReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.BalancesReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.BalancesReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.BalancesReply parseFrom(
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
  public static Builder newBuilder(com.tdexswap.v1.BalancesReply prototype) {
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
   * Protobuf type {@code tdexswap.v1.BalancesReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.BalancesReply)
      com.tdexswap.v1.BalancesReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_BalancesReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_BalancesReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdexswap.v1.BalancesReply.class, com.tdexswap.v1.BalancesReply.Builder.class);
    }

    // Construct using com.tdexswap.v1.BalancesReply.newBuilder()
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
        getBalancesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (balancesBuilder_ == null) {
        balances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        balancesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdexswap.v1.TradeProto.internal_static_tdexswap_v1_BalancesReply_descriptor;
    }

    @java.lang.Override
    public com.tdexswap.v1.BalancesReply getDefaultInstanceForType() {
      return com.tdexswap.v1.BalancesReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdexswap.v1.BalancesReply build() {
      com.tdexswap.v1.BalancesReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdexswap.v1.BalancesReply buildPartial() {
      com.tdexswap.v1.BalancesReply result = new com.tdexswap.v1.BalancesReply(this);
      int from_bitField0_ = bitField0_;
      if (balancesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          balances_ = java.util.Collections.unmodifiableList(balances_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.balances_ = balances_;
      } else {
        result.balances_ = balancesBuilder_.build();
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
      if (other instanceof com.tdexswap.v1.BalancesReply) {
        return mergeFrom((com.tdexswap.v1.BalancesReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdexswap.v1.BalancesReply other) {
      if (other == com.tdexswap.v1.BalancesReply.getDefaultInstance()) return this;
      if (balancesBuilder_ == null) {
        if (!other.balances_.isEmpty()) {
          if (balances_.isEmpty()) {
            balances_ = other.balances_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBalancesIsMutable();
            balances_.addAll(other.balances_);
          }
          onChanged();
        }
      } else {
        if (!other.balances_.isEmpty()) {
          if (balancesBuilder_.isEmpty()) {
            balancesBuilder_.dispose();
            balancesBuilder_ = null;
            balances_ = other.balances_;
            bitField0_ = (bitField0_ & ~0x00000001);
            balancesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBalancesFieldBuilder() : null;
          } else {
            balancesBuilder_.addAllMessages(other.balances_);
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
      com.tdexswap.v1.BalancesReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdexswap.v1.BalancesReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<com.tdexswap.v1.BalanceWithFee> balances_ =
      java.util.Collections.emptyList();
    private void ensureBalancesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        balances_ = new java.util.ArrayList<com.tdexswap.v1.BalanceWithFee>(balances_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tdexswap.v1.BalanceWithFee, com.tdexswap.v1.BalanceWithFee.Builder, com.tdexswap.v1.BalanceWithFeeOrBuilder> balancesBuilder_;

    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public java.util.List<com.tdexswap.v1.BalanceWithFee> getBalancesList() {
      if (balancesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(balances_);
      } else {
        return balancesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public int getBalancesCount() {
      if (balancesBuilder_ == null) {
        return balances_.size();
      } else {
        return balancesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public com.tdexswap.v1.BalanceWithFee getBalances(int index) {
      if (balancesBuilder_ == null) {
        return balances_.get(index);
      } else {
        return balancesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder setBalances(
        int index, com.tdexswap.v1.BalanceWithFee value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.set(index, value);
        onChanged();
      } else {
        balancesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder setBalances(
        int index, com.tdexswap.v1.BalanceWithFee.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.set(index, builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder addBalances(com.tdexswap.v1.BalanceWithFee value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.add(value);
        onChanged();
      } else {
        balancesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder addBalances(
        int index, com.tdexswap.v1.BalanceWithFee value) {
      if (balancesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBalancesIsMutable();
        balances_.add(index, value);
        onChanged();
      } else {
        balancesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder addBalances(
        com.tdexswap.v1.BalanceWithFee.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.add(builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder addBalances(
        int index, com.tdexswap.v1.BalanceWithFee.Builder builderForValue) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.add(index, builderForValue.build());
        onChanged();
      } else {
        balancesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder addAllBalances(
        java.lang.Iterable<? extends com.tdexswap.v1.BalanceWithFee> values) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, balances_);
        onChanged();
      } else {
        balancesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder clearBalances() {
      if (balancesBuilder_ == null) {
        balances_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        balancesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public Builder removeBalances(int index) {
      if (balancesBuilder_ == null) {
        ensureBalancesIsMutable();
        balances_.remove(index);
        onChanged();
      } else {
        balancesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public com.tdexswap.v1.BalanceWithFee.Builder getBalancesBuilder(
        int index) {
      return getBalancesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public com.tdexswap.v1.BalanceWithFeeOrBuilder getBalancesOrBuilder(
        int index) {
      if (balancesBuilder_ == null) {
        return balances_.get(index);  } else {
        return balancesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public java.util.List<? extends com.tdexswap.v1.BalanceWithFeeOrBuilder> 
         getBalancesOrBuilderList() {
      if (balancesBuilder_ != null) {
        return balancesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(balances_);
      }
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public com.tdexswap.v1.BalanceWithFee.Builder addBalancesBuilder() {
      return getBalancesFieldBuilder().addBuilder(
          com.tdexswap.v1.BalanceWithFee.getDefaultInstance());
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public com.tdexswap.v1.BalanceWithFee.Builder addBalancesBuilder(
        int index) {
      return getBalancesFieldBuilder().addBuilder(
          index, com.tdexswap.v1.BalanceWithFee.getDefaultInstance());
    }
    /**
     * <code>repeated .tdexswap.v1.BalanceWithFee balances = 1 [json_name = "balances"];</code>
     */
    public java.util.List<com.tdexswap.v1.BalanceWithFee.Builder> 
         getBalancesBuilderList() {
      return getBalancesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.tdexswap.v1.BalanceWithFee, com.tdexswap.v1.BalanceWithFee.Builder, com.tdexswap.v1.BalanceWithFeeOrBuilder> 
        getBalancesFieldBuilder() {
      if (balancesBuilder_ == null) {
        balancesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.tdexswap.v1.BalanceWithFee, com.tdexswap.v1.BalanceWithFee.Builder, com.tdexswap.v1.BalanceWithFeeOrBuilder>(
                balances_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        balances_ = null;
      }
      return balancesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:tdexswap.v1.BalancesReply)
  }

  // @@protoc_insertion_point(class_scope:tdexswap.v1.BalancesReply)
  private static final com.tdexswap.v1.BalancesReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdexswap.v1.BalancesReply();
  }

  public static com.tdexswap.v1.BalancesReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BalancesReply>
      PARSER = new com.google.protobuf.AbstractParser<BalancesReply>() {
    @java.lang.Override
    public BalancesReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BalancesReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BalancesReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BalancesReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdexswap.v1.BalancesReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

