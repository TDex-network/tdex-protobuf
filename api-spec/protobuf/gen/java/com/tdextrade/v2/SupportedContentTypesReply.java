// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v2/transport.proto

package com.tdextrade.v2;

/**
 * Protobuf type {@code tdextrade.v2.SupportedContentTypesReply}
 */
public final class SupportedContentTypesReply extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdextrade.v2.SupportedContentTypesReply)
    SupportedContentTypesReplyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SupportedContentTypesReply.newBuilder() to construct.
  private SupportedContentTypesReply(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SupportedContentTypesReply() {
    acceptedTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SupportedContentTypesReply();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SupportedContentTypesReply(
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
          case 8: {
            int rawValue = input.readEnum();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              acceptedTypes_ = new java.util.ArrayList<java.lang.Integer>();
              mutable_bitField0_ |= 0x00000001;
            }
            acceptedTypes_.add(rawValue);
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int oldLimit = input.pushLimit(length);
            while(input.getBytesUntilLimit() > 0) {
              int rawValue = input.readEnum();
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                acceptedTypes_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000001;
              }
              acceptedTypes_.add(rawValue);
            }
            input.popLimit(oldLimit);
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
        acceptedTypes_ = java.util.Collections.unmodifiableList(acceptedTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tdextrade.v2.TransportProto.internal_static_tdextrade_v2_SupportedContentTypesReply_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdextrade.v2.TransportProto.internal_static_tdextrade_v2_SupportedContentTypesReply_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdextrade.v2.SupportedContentTypesReply.class, com.tdextrade.v2.SupportedContentTypesReply.Builder.class);
  }

  public static final int ACCEPTED_TYPES_FIELD_NUMBER = 1;
  private java.util.List<java.lang.Integer> acceptedTypes_;
  private static final com.google.protobuf.Internal.ListAdapter.Converter<
      java.lang.Integer, com.tdextrade.v2.ContentType> acceptedTypes_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.tdextrade.v2.ContentType>() {
            public com.tdextrade.v2.ContentType convert(java.lang.Integer from) {
              @SuppressWarnings("deprecation")
              com.tdextrade.v2.ContentType result = com.tdextrade.v2.ContentType.valueOf(from);
              return result == null ? com.tdextrade.v2.ContentType.UNRECOGNIZED : result;
            }
          };
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the acceptedTypes.
   */
  @java.lang.Override
  public java.util.List<com.tdextrade.v2.ContentType> getAcceptedTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.tdextrade.v2.ContentType>(acceptedTypes_, acceptedTypes_converter_);
  }
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return The count of acceptedTypes.
   */
  @java.lang.Override
  public int getAcceptedTypesCount() {
    return acceptedTypes_.size();
  }
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the element to return.
   * @return The acceptedTypes at the given index.
   */
  @java.lang.Override
  public com.tdextrade.v2.ContentType getAcceptedTypes(int index) {
    return acceptedTypes_converter_.convert(acceptedTypes_.get(index));
  }
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @return A list containing the enum numeric values on the wire for acceptedTypes.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
  getAcceptedTypesValueList() {
    return acceptedTypes_;
  }
  /**
   * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of acceptedTypes at the given index.
   */
  @java.lang.Override
  public int getAcceptedTypesValue(int index) {
    return acceptedTypes_.get(index);
  }
  private int acceptedTypesMemoizedSerializedSize;

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
    getSerializedSize();
    if (getAcceptedTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(acceptedTypesMemoizedSerializedSize);
    }
    for (int i = 0; i < acceptedTypes_.size(); i++) {
      output.writeEnumNoTag(acceptedTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < acceptedTypes_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeEnumSizeNoTag(acceptedTypes_.get(i));
      }
      size += dataSize;
      if (!getAcceptedTypesList().isEmpty()) {  size += 1;
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(dataSize);
      }acceptedTypesMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.tdextrade.v2.SupportedContentTypesReply)) {
      return super.equals(obj);
    }
    com.tdextrade.v2.SupportedContentTypesReply other = (com.tdextrade.v2.SupportedContentTypesReply) obj;

    if (!acceptedTypes_.equals(other.acceptedTypes_)) return false;
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
    if (getAcceptedTypesCount() > 0) {
      hash = (37 * hash) + ACCEPTED_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + acceptedTypes_.hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdextrade.v2.SupportedContentTypesReply parseFrom(
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
  public static Builder newBuilder(com.tdextrade.v2.SupportedContentTypesReply prototype) {
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
   * Protobuf type {@code tdextrade.v2.SupportedContentTypesReply}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdextrade.v2.SupportedContentTypesReply)
      com.tdextrade.v2.SupportedContentTypesReplyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdextrade.v2.TransportProto.internal_static_tdextrade_v2_SupportedContentTypesReply_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdextrade.v2.TransportProto.internal_static_tdextrade_v2_SupportedContentTypesReply_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdextrade.v2.SupportedContentTypesReply.class, com.tdextrade.v2.SupportedContentTypesReply.Builder.class);
    }

    // Construct using com.tdextrade.v2.SupportedContentTypesReply.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      acceptedTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdextrade.v2.TransportProto.internal_static_tdextrade_v2_SupportedContentTypesReply_descriptor;
    }

    @java.lang.Override
    public com.tdextrade.v2.SupportedContentTypesReply getDefaultInstanceForType() {
      return com.tdextrade.v2.SupportedContentTypesReply.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdextrade.v2.SupportedContentTypesReply build() {
      com.tdextrade.v2.SupportedContentTypesReply result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdextrade.v2.SupportedContentTypesReply buildPartial() {
      com.tdextrade.v2.SupportedContentTypesReply result = new com.tdextrade.v2.SupportedContentTypesReply(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        acceptedTypes_ = java.util.Collections.unmodifiableList(acceptedTypes_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.acceptedTypes_ = acceptedTypes_;
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
      if (other instanceof com.tdextrade.v2.SupportedContentTypesReply) {
        return mergeFrom((com.tdextrade.v2.SupportedContentTypesReply)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdextrade.v2.SupportedContentTypesReply other) {
      if (other == com.tdextrade.v2.SupportedContentTypesReply.getDefaultInstance()) return this;
      if (!other.acceptedTypes_.isEmpty()) {
        if (acceptedTypes_.isEmpty()) {
          acceptedTypes_ = other.acceptedTypes_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAcceptedTypesIsMutable();
          acceptedTypes_.addAll(other.acceptedTypes_);
        }
        onChanged();
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
      com.tdextrade.v2.SupportedContentTypesReply parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdextrade.v2.SupportedContentTypesReply) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<java.lang.Integer> acceptedTypes_ =
      java.util.Collections.emptyList();
    private void ensureAcceptedTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        acceptedTypes_ = new java.util.ArrayList<java.lang.Integer>(acceptedTypes_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return A list containing the acceptedTypes.
     */
    public java.util.List<com.tdextrade.v2.ContentType> getAcceptedTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.tdextrade.v2.ContentType>(acceptedTypes_, acceptedTypes_converter_);
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return The count of acceptedTypes.
     */
    public int getAcceptedTypesCount() {
      return acceptedTypes_.size();
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index of the element to return.
     * @return The acceptedTypes at the given index.
     */
    public com.tdextrade.v2.ContentType getAcceptedTypes(int index) {
      return acceptedTypes_converter_.convert(acceptedTypes_.get(index));
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index to set the value at.
     * @param value The acceptedTypes to set.
     * @return This builder for chaining.
     */
    public Builder setAcceptedTypes(
        int index, com.tdextrade.v2.ContentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAcceptedTypesIsMutable();
      acceptedTypes_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param value The acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTypes(com.tdextrade.v2.ContentType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAcceptedTypesIsMutable();
      acceptedTypes_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param values The acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceptedTypes(
        java.lang.Iterable<? extends com.tdextrade.v2.ContentType> values) {
      ensureAcceptedTypesIsMutable();
      for (com.tdextrade.v2.ContentType value : values) {
        acceptedTypes_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAcceptedTypes() {
      acceptedTypes_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @return A list containing the enum numeric values on the wire for acceptedTypes.
     */
    public java.util.List<java.lang.Integer>
    getAcceptedTypesValueList() {
      return java.util.Collections.unmodifiableList(acceptedTypes_);
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of acceptedTypes at the given index.
     */
    public int getAcceptedTypesValue(int index) {
      return acceptedTypes_.get(index);
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of acceptedTypes at the given index.
     * @return This builder for chaining.
     */
    public Builder setAcceptedTypesValue(
        int index, int value) {
      ensureAcceptedTypesIsMutable();
      acceptedTypes_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param value The enum numeric value on the wire for acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAcceptedTypesValue(int value) {
      ensureAcceptedTypesIsMutable();
      acceptedTypes_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated .tdextrade.v2.ContentType accepted_types = 1 [json_name = "acceptedTypes"];</code>
     * @param values The enum numeric values on the wire for acceptedTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllAcceptedTypesValue(
        java.lang.Iterable<java.lang.Integer> values) {
      ensureAcceptedTypesIsMutable();
      for (int value : values) {
        acceptedTypes_.add(value);
      }
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:tdextrade.v2.SupportedContentTypesReply)
  }

  // @@protoc_insertion_point(class_scope:tdextrade.v2.SupportedContentTypesReply)
  private static final com.tdextrade.v2.SupportedContentTypesReply DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdextrade.v2.SupportedContentTypesReply();
  }

  public static com.tdextrade.v2.SupportedContentTypesReply getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SupportedContentTypesReply>
      PARSER = new com.google.protobuf.AbstractParser<SupportedContentTypesReply>() {
    @java.lang.Override
    public SupportedContentTypesReply parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SupportedContentTypesReply(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SupportedContentTypesReply> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SupportedContentTypesReply> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdextrade.v2.SupportedContentTypesReply getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
