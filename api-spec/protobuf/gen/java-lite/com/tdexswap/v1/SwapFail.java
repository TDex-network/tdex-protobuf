// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/swap.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.SwapFail}
 */
public  final class SwapFail extends
    com.google.protobuf.GeneratedMessageLite<
        SwapFail, SwapFail.Builder> implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.SwapFail)
    SwapFailOrBuilder {
  private SwapFail() {
    id_ = "";
    messageId_ = "";
    failureMessage_ = "";
  }
  public static final int ID_FIELD_NUMBER = 1;
  private java.lang.String id_;
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
    return id_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(id_);
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The id to set.
   */
  private void setId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    id_ = value;
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   */
  private void clearId() {
    
    id_ = getDefaultInstance().getId();
  }
  /**
   * <pre>
   * Random unique identifier for the current message
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @param value The bytes for id to set.
   */
  private void setIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    id_ = value.toStringUtf8();
    
  }

  public static final int MESSAGE_ID_FIELD_NUMBER = 2;
  private java.lang.String messageId_;
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
    return messageId_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(messageId_);
  }
  /**
   * <pre>
   * indetifier of either SwapRequest or SwapAccept message. It can be empty
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @param value The messageId to set.
   */
  private void setMessageId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    messageId_ = value;
  }
  /**
   * <pre>
   * indetifier of either SwapRequest or SwapAccept message. It can be empty
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   */
  private void clearMessageId() {
    
    messageId_ = getDefaultInstance().getMessageId();
  }
  /**
   * <pre>
   * indetifier of either SwapRequest or SwapAccept message. It can be empty
   * </pre>
   *
   * <code>string message_id = 2 [json_name = "messageId"];</code>
   * @param value The bytes for messageId to set.
   */
  private void setMessageIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    messageId_ = value.toStringUtf8();
    
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
  /**
   * <pre>
   * The failure code. It can be empty
   * </pre>
   *
   * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
   * @param value The failureCode to set.
   */
  private void setFailureCode(int value) {
    
    failureCode_ = value;
  }
  /**
   * <pre>
   * The failure code. It can be empty
   * </pre>
   *
   * <code>uint32 failure_code = 3 [json_name = "failureCode"];</code>
   */
  private void clearFailureCode() {
    
    failureCode_ = 0;
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 4;
  private java.lang.String failureMessage_;
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
    return failureMessage_;
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
    return com.google.protobuf.ByteString.copyFromUtf8(failureMessage_);
  }
  /**
   * <pre>
   * The failure reason messaged
   * </pre>
   *
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @param value The failureMessage to set.
   */
  private void setFailureMessage(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    failureMessage_ = value;
  }
  /**
   * <pre>
   * The failure reason messaged
   * </pre>
   *
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   */
  private void clearFailureMessage() {
    
    failureMessage_ = getDefaultInstance().getFailureMessage();
  }
  /**
   * <pre>
   * The failure reason messaged
   * </pre>
   *
   * <code>string failure_message = 4 [json_name = "failureMessage"];</code>
   * @param value The bytes for failureMessage to set.
   */
  private void setFailureMessageBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    failureMessage_ = value.toStringUtf8();
    
  }

  public static com.tdexswap.v1.SwapFail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SwapFail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SwapFail parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.SwapFail prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdexswap.v1.SwapFail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdexswap.v1.SwapFail, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.SwapFail)
      com.tdexswap.v1.SwapFailOrBuilder {
    // Construct using com.tdexswap.v1.SwapFail.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


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
      return instance.getId();
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
      return instance.getIdBytes();
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
      copyOnWrite();
      instance.setId(value);
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
      copyOnWrite();
      instance.clearId();
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
      copyOnWrite();
      instance.setIdBytes(value);
      return this;
    }

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
      return instance.getMessageId();
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
      return instance.getMessageIdBytes();
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
      copyOnWrite();
      instance.setMessageId(value);
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
      copyOnWrite();
      instance.clearMessageId();
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
      copyOnWrite();
      instance.setMessageIdBytes(value);
      return this;
    }

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
      return instance.getFailureCode();
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
      copyOnWrite();
      instance.setFailureCode(value);
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
      copyOnWrite();
      instance.clearFailureCode();
      return this;
    }

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
      return instance.getFailureMessage();
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
      return instance.getFailureMessageBytes();
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
      copyOnWrite();
      instance.setFailureMessage(value);
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
      copyOnWrite();
      instance.clearFailureMessage();
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
      copyOnWrite();
      instance.setFailureMessageBytes(value);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tdexswap.v1.SwapFail)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdexswap.v1.SwapFail();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "id_",
            "messageId_",
            "failureCode_",
            "failureMessage_",
          };
          java.lang.String info =
              "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0208\u0002\u0208" +
              "\u0003\u000b\u0004\u0208";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdexswap.v1.SwapFail> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdexswap.v1.SwapFail.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdexswap.v1.SwapFail>(
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


  // @@protoc_insertion_point(class_scope:tdexswap.v1.SwapFail)
  private static final com.tdexswap.v1.SwapFail DEFAULT_INSTANCE;
  static {
    SwapFail defaultInstance = new SwapFail();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SwapFail.class, defaultInstance);
  }

  public static com.tdexswap.v1.SwapFail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SwapFail> PARSER;

  public static com.google.protobuf.Parser<SwapFail> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

