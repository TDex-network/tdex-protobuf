# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: v1/transport.proto
"""Generated protocol buffer code."""
from google.protobuf.internal import enum_type_wrapper
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x12v1/transport.proto\x12\x0btdexswap.v1\x1a\x1cgoogle/api/annotations.proto\"\x1e\n\x1cSupportedContentTypesRequest\"]\n\x1aSupportedContentTypesReply\x12?\n\x0e\x61\x63\x63\x65pted_types\x18\x01 \x03(\x0e\x32\x18.tdexswap.v1.ContentTypeR\racceptedTypes*?\n\x0b\x43ontentType\x12\x08\n\x04JSON\x10\x00\x12\x08\n\x04GRPC\x10\x01\x12\x0b\n\x07GRPCWEB\x10\x02\x12\x0f\n\x0bGRPCWEBTEXT\x10\x03\x32\x90\x01\n\tTransport\x12\x82\x01\n\x15SupportedContentTypes\x12).tdexswap.v1.SupportedContentTypesRequest\x1a\'.tdexswap.v1.SupportedContentTypesReply\"\x15\x82\xd3\xe4\x93\x02\x0f\x12\r/v1/transportB\xba\x01\n\x0f\x63om.tdexswap.v1B\x0eTransportProtoP\x01ZJgithub.com/tdex-network/tdex-prototbuf/api-spec/protobuf/gen/v1;tdexswapv1\xa2\x02\x03TXX\xaa\x02\x0bTdexswap.V1\xca\x02\x0bTdexswap\\V1\xe2\x02\x17Tdexswap\\V1\\GPBMetadata\xea\x02\x0cTdexswap::V1b\x06proto3')

_CONTENTTYPE = DESCRIPTOR.enum_types_by_name['ContentType']
ContentType = enum_type_wrapper.EnumTypeWrapper(_CONTENTTYPE)
JSON = 0
GRPC = 1
GRPCWEB = 2
GRPCWEBTEXT = 3


_SUPPORTEDCONTENTTYPESREQUEST = DESCRIPTOR.message_types_by_name['SupportedContentTypesRequest']
_SUPPORTEDCONTENTTYPESREPLY = DESCRIPTOR.message_types_by_name['SupportedContentTypesReply']
SupportedContentTypesRequest = _reflection.GeneratedProtocolMessageType('SupportedContentTypesRequest', (_message.Message,), {
  'DESCRIPTOR' : _SUPPORTEDCONTENTTYPESREQUEST,
  '__module__' : 'v1.transport_pb2'
  # @@protoc_insertion_point(class_scope:tdexswap.v1.SupportedContentTypesRequest)
  })
_sym_db.RegisterMessage(SupportedContentTypesRequest)

SupportedContentTypesReply = _reflection.GeneratedProtocolMessageType('SupportedContentTypesReply', (_message.Message,), {
  'DESCRIPTOR' : _SUPPORTEDCONTENTTYPESREPLY,
  '__module__' : 'v1.transport_pb2'
  # @@protoc_insertion_point(class_scope:tdexswap.v1.SupportedContentTypesReply)
  })
_sym_db.RegisterMessage(SupportedContentTypesReply)

_TRANSPORT = DESCRIPTOR.services_by_name['Transport']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'\n\017com.tdexswap.v1B\016TransportProtoP\001ZJgithub.com/tdex-network/tdex-prototbuf/api-spec/protobuf/gen/v1;tdexswapv1\242\002\003TXX\252\002\013Tdexswap.V1\312\002\013Tdexswap\\V1\342\002\027Tdexswap\\V1\\GPBMetadata\352\002\014Tdexswap::V1'
  _TRANSPORT.methods_by_name['SupportedContentTypes']._options = None
  _TRANSPORT.methods_by_name['SupportedContentTypes']._serialized_options = b'\202\323\344\223\002\017\022\r/v1/transport'
  _CONTENTTYPE._serialized_start=192
  _CONTENTTYPE._serialized_end=255
  _SUPPORTEDCONTENTTYPESREQUEST._serialized_start=65
  _SUPPORTEDCONTENTTYPESREQUEST._serialized_end=95
  _SUPPORTEDCONTENTTYPESREPLY._serialized_start=97
  _SUPPORTEDCONTENTTYPESREPLY._serialized_end=190
  _TRANSPORT._serialized_start=258
  _TRANSPORT._serialized_end=402
# @@protoc_insertion_point(module_scope)