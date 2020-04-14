// package: 
// file: trade.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as trade_pb from "./trade_pb";
import * as swap_pb from "./swap_pb";

interface ITradeCompleteService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    markets: ITradeCompleteService_IMarkets;
    balances: ITradeCompleteService_IBalances;
    tradePropose: ITradeCompleteService_ITradePropose;
    tradeComplete: ITradeCompleteService_ITradeComplete;
}

interface ITradeCompleteService_IMarkets extends grpc.MethodDefinition<trade_pb.MarketsRequest, trade_pb.MarketsReply> {
    path: string; // "/.TradeComplete/Markets"
    requestStream: boolean; // false
    responseStream: boolean; // false
    requestSerialize: grpc.serialize<trade_pb.MarketsRequest>;
    requestDeserialize: grpc.deserialize<trade_pb.MarketsRequest>;
    responseSerialize: grpc.serialize<trade_pb.MarketsReply>;
    responseDeserialize: grpc.deserialize<trade_pb.MarketsReply>;
}
interface ITradeCompleteService_IBalances extends grpc.MethodDefinition<trade_pb.BalancesRequest, trade_pb.BalancesReply> {
    path: string; // "/.TradeComplete/Balances"
    requestStream: boolean; // false
    responseStream: boolean; // false
    requestSerialize: grpc.serialize<trade_pb.BalancesRequest>;
    requestDeserialize: grpc.deserialize<trade_pb.BalancesRequest>;
    responseSerialize: grpc.serialize<trade_pb.BalancesReply>;
    responseDeserialize: grpc.deserialize<trade_pb.BalancesReply>;
}
interface ITradeCompleteService_ITradePropose extends grpc.MethodDefinition<trade_pb.TradeRequest, trade_pb.TradeReply> {
    path: string; // "/.TradeComplete/TradePropose"
    requestStream: boolean; // false
    responseStream: boolean; // true
    requestSerialize: grpc.serialize<trade_pb.TradeRequest>;
    requestDeserialize: grpc.deserialize<trade_pb.TradeRequest>;
    responseSerialize: grpc.serialize<trade_pb.TradeReply>;
    responseDeserialize: grpc.deserialize<trade_pb.TradeReply>;
}
interface ITradeCompleteService_ITradeComplete extends grpc.MethodDefinition<trade_pb.TradeCompleteRequest, trade_pb.TradeCompleteReply> {
    path: string; // "/.TradeComplete/TradeComplete"
    requestStream: boolean; // false
    responseStream: boolean; // true
    requestSerialize: grpc.serialize<trade_pb.TradeCompleteRequest>;
    requestDeserialize: grpc.deserialize<trade_pb.TradeCompleteRequest>;
    responseSerialize: grpc.serialize<trade_pb.TradeCompleteReply>;
    responseDeserialize: grpc.deserialize<trade_pb.TradeCompleteReply>;
}

export const TradeCompleteService: ITradeCompleteService;

export interface ITradeCompleteServer {
    markets: grpc.handleUnaryCall<trade_pb.MarketsRequest, trade_pb.MarketsReply>;
    balances: grpc.handleUnaryCall<trade_pb.BalancesRequest, trade_pb.BalancesReply>;
    tradePropose: grpc.handleServerStreamingCall<trade_pb.TradeRequest, trade_pb.TradeReply>;
    tradeComplete: grpc.handleServerStreamingCall<trade_pb.TradeCompleteRequest, trade_pb.TradeCompleteReply>;
}

export interface ITradeCompleteClient {
    markets(request: trade_pb.MarketsRequest, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    markets(request: trade_pb.MarketsRequest, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    markets(request: trade_pb.MarketsRequest, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    balances(request: trade_pb.BalancesRequest, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    balances(request: trade_pb.BalancesRequest, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    balances(request: trade_pb.BalancesRequest, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    tradePropose(request: trade_pb.TradeRequest, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeReply>;
    tradePropose(request: trade_pb.TradeRequest, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeReply>;
    tradeComplete(request: trade_pb.TradeCompleteRequest, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeCompleteReply>;
    tradeComplete(request: trade_pb.TradeCompleteRequest, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeCompleteReply>;
}

export class TradeCompleteClient extends grpc.Client implements ITradeCompleteClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public markets(request: trade_pb.MarketsRequest, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    public markets(request: trade_pb.MarketsRequest, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    public markets(request: trade_pb.MarketsRequest, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: trade_pb.MarketsReply) => void): grpc.ClientUnaryCall;
    public balances(request: trade_pb.BalancesRequest, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    public balances(request: trade_pb.BalancesRequest, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    public balances(request: trade_pb.BalancesRequest, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: trade_pb.BalancesReply) => void): grpc.ClientUnaryCall;
    public tradePropose(request: trade_pb.TradeRequest, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeReply>;
    public tradePropose(request: trade_pb.TradeRequest, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeReply>;
    public tradeComplete(request: trade_pb.TradeCompleteRequest, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeCompleteReply>;
    public tradeComplete(request: trade_pb.TradeCompleteRequest, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<trade_pb.TradeCompleteReply>;
}
