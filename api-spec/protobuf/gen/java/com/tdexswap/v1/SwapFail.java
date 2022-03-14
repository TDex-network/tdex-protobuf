// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/swap.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.SwapFail}
 */
public final class SwapFail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.SwapFail)
    SwapFailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SwapFail.newBuilder() to construct.
  private SwapFail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SwapFail() {
    id_ = "";
    messageId_ = "";
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SwapFail();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private SwapFail(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
            java.lang.String s = input.readStringRequireUtf8();

            id_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            messageId_ = s;
            break;
          }
          case 24: {

            failureCode_ = input.readUInt32();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            failureMessage_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.tdexswap.v1.SwapProto.internal_static_tdexswap_v1_SwapFail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.tdexswap.v1.SwapProto.internal_static_tdexswap_v1_SwapFail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.tdexswap.v1.SwapFail.class, com.tdexswap.v1.SwapFail.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object id_;
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object messageId_;
  /**
   * <pre>
   * indetifier of either SwapRequest or SwapAccept message. It can be empty
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The messageId.
   */
  @java.lang.Override
  public java.lang.String getMessageId() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      messageId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * indetifier of either SwapRequest or SwapAccept message. It can be empty
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @return The bytes for messageId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageIdBytes() {
    java.lang.Object ref = messageId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      messageId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_CODE_FIELD_NUMBER = 3;
  private int failureCode_;
  /**
   * <pre>
   * The failure code. It can be empty
   * </pre>
   *
   * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
   * @return The failureCode.
   */
  @java.lang.Override
  public int getFailureCode() {
    return failureCode_;
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 4;
  private volatile java.lang.Object failureMessage_;
  /**
   * <pre>
   * The failure reason messaged
   * </pre>
   *
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureMessage_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * The failure reason messaged
   * </pre>
   *
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      failureMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, messageId_);
    }
    if (failureCode_ != 0) {
      output.writeUInt32(3, failureCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, failureMessage_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(messageId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, messageId_);
    }
    if (failureCode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, failureCode_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, failureMessage_);
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
    if (!(obj instanceof com.tdexswap.v1.SwapFail)) {
      return super.equals(obj);
    }
    com.tdexswap.v1.SwapFail other = (com.tdexswap.v1.SwapFail) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (!getMessageId()
        .equals(other.getMessageId())) return false;
    if (getFailureCode()
        != other.getFailureCode()) return false;
    if (!getFailureMessage()
        .equals(other.getFailureMessage())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + MESSAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getMessageId().hashCode();
    hash = (37 * hash) + FAILURE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureCode();
    hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.tdexswap.v1.SwapFail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.SwapFail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
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
  public static Builder newBuilder(com.tdexswap.v1.SwapFail prototype) {
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
   * Protobuf type {@code tdexswap.v1.SwapFail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.SwapFail)
      com.tdexswap.v1.SwapFailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.tdexswap.v1.SwapProto.internal_static_tdexswap_v1_SwapFail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.tdexswap.v1.SwapProto.internal_static_tdexswap_v1_SwapFail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.tdexswap.v1.SwapFail.class, com.tdexswap.v1.SwapFail.Builder.class);
    }

    // Construct using com.tdexswap.v1.SwapFail.newBuilder()
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
      id_ = "";

      messageId_ = "";

      failureCode_ = 0;

      failureMessage_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.tdexswap.v1.SwapProto.internal_static_tdexswap_v1_SwapFail_descriptor;
    }

    @java.lang.Override
    public com.tdexswap.v1.SwapFail getDefaultInstanceForType() {
      return com.tdexswap.v1.SwapFail.getDefaultInstance();
    }

    @java.lang.Override
    public com.tdexswap.v1.SwapFail build() {
      com.tdexswap.v1.SwapFail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.tdexswap.v1.SwapFail buildPartial() {
      com.tdexswap.v1.SwapFail result = new com.tdexswap.v1.SwapFail(this);
      result.id_ = id_;
      result.messageId_ = messageId_;
      result.failureCode_ = failureCode_;
      result.failureMessage_ = failureMessage_;
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
      if (other instanceof com.tdexswap.v1.SwapFail) {
        return mergeFrom((com.tdexswap.v1.SwapFail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.tdexswap.v1.SwapFail other) {
      if (other == com.tdexswap.v1.SwapFail.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        onChanged();
      }
      if (!other.getMessageId().isEmpty()) {
        messageId_ = other.messageId_;
        onChanged();
      }
      if (other.getFailureCode() != 0) {
        setFailureCode(other.getFailureCode());
      }
      if (!other.getFailureMessage().isEmpty()) {
        failureMessage_ = other.failureMessage_;
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
      com.tdexswap.v1.SwapFail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.tdexswap.v1.SwapFail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object id_ = "";
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = getDefaultInstance().getId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Random unique identifier for the current message
     * </pre>
     *
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object messageId_ = "";
    /**
     * <pre>
     * indetifier of either SwapRequest or SwapAccept message. It can be empty
     * </pre>
     *
     * <code>string message_id = 2 [json_name = "messageId"];</code>
     * @return The messageId.
     */
    public java.lang.String getMessageId() {
      java.lang.Object ref = messageId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        messageId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * indetifier of either SwapRequest or SwapAccept message. It can be empty
     * </pre>
     *
     * <code>string message_id = 2 [json_name = "messageId"];</code>
     * @return The bytes for messageId.
     */
    public com.google.protobuf.ByteString
        getMessageIdBytes() {
      java.lang.Object ref = messageId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        messageId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * indetifier of either SwapRequest or SwapAccept message. It can be empty
     * </pre>
     *
     * <code>string message_id = 2 [json_name = "messageId"];</code>
     * @param value The messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      messageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indetifier of either SwapRequest or SwapAccept message. It can be empty
     * </pre>
     *
     * <code>string message_id = 2 [json_name = "messageId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMessageId() {
      
      messageId_ = getDefaultInstance().getMessageId();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * indetifier of either SwapRequest or SwapAccept message. It can be empty
     * </pre>
     *
     * <code>string message_id = 2 [json_name = "messageId"];</code>
     * @param value The bytes for messageId to set.
     * @return This builder for chaining.
     */
    public Builder setMessageIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      messageId_ = value;
      onChanged();
      return this;
    }

    private int failureCode_ ;
    /**
     * <pre>
     * The failure code. It can be empty
     * </pre>
     *
     * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
     * @return The failureCode.
     */
    @java.lang.Override
    public int getFailureCode() {
      return failureCode_;
    }
    /**
     * <pre>
     * The failure code. It can be empty
     * </pre>
     *
     * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
     * @param value The failureCode to set.
     * @return This builder for chaining.
     */
    public Builder setFailureCode(int value) {
      
      failureCode_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The failure code. It can be empty
     * </pre>
     *
     * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureCode() {
      
      failureCode_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object failureMessage_ = "";
    /**
     * <pre>
     * The failure reason messaged
     * </pre>
     *
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * The failure reason messaged
     * </pre>
     *
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString
        getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * The failure reason messaged
     * </pre>
     *
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      failureMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The failure reason messaged
     * </pre>
     *
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      
      failureMessage_ = getDefaultInstance().getFailureMessage();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * The failure reason messaged
     * </pre>
     *
     * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      failureMessage_ = value;
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


    // @@protoc_insertion_point(builder_scope:tdexswap.v1.SwapFail)
  }

  // @@protoc_insertion_point(class_scope:tdexswap.v1.SwapFail)
  private static final com.tdexswap.v1.SwapFail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.tdexswap.v1.SwapFail();
  }

  public static com.tdexswap.v1.SwapFail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SwapFail>
      PARSER = new com.google.protobuf.AbstractParser<SwapFail>() {
    @java.lang.Override
    public SwapFail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new SwapFail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SwapFail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SwapFail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.tdexswap.v1.SwapFail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

