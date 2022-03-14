// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/transport.proto

package com.tdexswap.v1;

/**
 * Protobuf type {@code tdexswap.v1.SupportedContentTypesRequest}
 */
public  final class SupportedContentTypesRequest extends
    com.google.protobuf.GeneratedMessageLite<
        SupportedContentTypesRequest, SupportedContentTypesRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:tdexswap.v1.SupportedContentTypesRequest)
    SupportedContentTypesRequestOrBuilder {
  private SupportedContentTypesRequest() {
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.tdexswap.v1.SupportedContentTypesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.tdexswap.v1.SupportedContentTypesRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code tdexswap.v1.SupportedContentTypesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.tdexswap.v1.SupportedContentTypesRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:tdexswap.v1.SupportedContentTypesRequest)
      com.tdexswap.v1.SupportedContentTypesRequestOrBuilder {
    // Construct using com.tdexswap.v1.SupportedContentTypesRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    // @@protoc_insertion_point(builder_scope:tdexswap.v1.SupportedContentTypesRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.tdexswap.v1.SupportedContentTypesRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = null;java.lang.String info =
              "\u0000\u0000";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.tdexswap.v1.SupportedContentTypesRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.tdexswap.v1.SupportedContentTypesRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.tdexswap.v1.SupportedContentTypesRequest>(
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


  // @@protoc_insertion_point(class_scope:tdexswap.v1.SupportedContentTypesRequest)
  private static final com.tdexswap.v1.SupportedContentTypesRequest DEFAULT_INSTANCE;
  static {
    SupportedContentTypesRequest defaultInstance = new SupportedContentTypesRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      SupportedContentTypesRequest.class, defaultInstance);
  }

  public static com.tdexswap.v1.SupportedContentTypesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<SupportedContentTypesRequest> PARSER;

  public static com.google.protobuf.Parser<SupportedContentTypesRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

