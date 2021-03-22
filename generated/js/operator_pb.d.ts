// package: 
// file: operator.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";
import * as types_pb from "./types_pb";

export class ListUtxosRequest extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListUtxosRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ListUtxosRequest): ListUtxosRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListUtxosRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListUtxosRequest;
    static deserializeBinaryFromReader(message: ListUtxosRequest, reader: jspb.BinaryReader): ListUtxosRequest;
}

export namespace ListUtxosRequest {
    export type AsObject = {
    }
}

export class ListUtxosReply extends jspb.Message { 
    clearUnspentsList(): void;
    getUnspentsList(): Array<TxOutpoint>;
    setUnspentsList(value: Array<TxOutpoint>): ListUtxosReply;
    addUnspents(value?: TxOutpoint, index?: number): TxOutpoint;

    clearLocksList(): void;
    getLocksList(): Array<TxOutpoint>;
    setLocksList(value: Array<TxOutpoint>): ListUtxosReply;
    addLocks(value?: TxOutpoint, index?: number): TxOutpoint;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListUtxosReply.AsObject;
    static toObject(includeInstance: boolean, msg: ListUtxosReply): ListUtxosReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListUtxosReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListUtxosReply;
    static deserializeBinaryFromReader(message: ListUtxosReply, reader: jspb.BinaryReader): ListUtxosReply;
}

export namespace ListUtxosReply {
    export type AsObject = {
        unspentsList: Array<TxOutpoint.AsObject>,
        locksList: Array<TxOutpoint.AsObject>,
    }
}

export class ReloadUtxosRequest extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ReloadUtxosRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ReloadUtxosRequest): ReloadUtxosRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ReloadUtxosRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ReloadUtxosRequest;
    static deserializeBinaryFromReader(message: ReloadUtxosRequest, reader: jspb.BinaryReader): ReloadUtxosRequest;
}

export namespace ReloadUtxosRequest {
    export type AsObject = {
    }
}

export class ReloadUtxosReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ReloadUtxosReply.AsObject;
    static toObject(includeInstance: boolean, msg: ReloadUtxosReply): ReloadUtxosReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ReloadUtxosReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ReloadUtxosReply;
    static deserializeBinaryFromReader(message: ReloadUtxosReply, reader: jspb.BinaryReader): ReloadUtxosReply;
}

export namespace ReloadUtxosReply {
    export type AsObject = {
    }
}

export class DepositMarketRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): DepositMarketRequest;

    getNumOfAddresses(): number;
    setNumOfAddresses(value: number): DepositMarketRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DepositMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: DepositMarketRequest): DepositMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DepositMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DepositMarketRequest;
    static deserializeBinaryFromReader(message: DepositMarketRequest, reader: jspb.BinaryReader): DepositMarketRequest;
}

export namespace DepositMarketRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        numOfAddresses: number,
    }
}

export class DepositMarketReply extends jspb.Message { 
    clearAddressesList(): void;
    getAddressesList(): Array<string>;
    setAddressesList(value: Array<string>): DepositMarketReply;
    addAddresses(value: string, index?: number): string;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DepositMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: DepositMarketReply): DepositMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DepositMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DepositMarketReply;
    static deserializeBinaryFromReader(message: DepositMarketReply, reader: jspb.BinaryReader): DepositMarketReply;
}

export namespace DepositMarketReply {
    export type AsObject = {
        addressesList: Array<string>,
    }
}

export class ListDepositMarketRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): ListDepositMarketRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListDepositMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ListDepositMarketRequest): ListDepositMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListDepositMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListDepositMarketRequest;
    static deserializeBinaryFromReader(message: ListDepositMarketRequest, reader: jspb.BinaryReader): ListDepositMarketRequest;
}

export namespace ListDepositMarketRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
    }
}

export class ListDepositMarketReply extends jspb.Message { 
    clearAddressList(): void;
    getAddressList(): Array<string>;
    setAddressList(value: Array<string>): ListDepositMarketReply;
    addAddress(value: string, index?: number): string;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListDepositMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: ListDepositMarketReply): ListDepositMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListDepositMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListDepositMarketReply;
    static deserializeBinaryFromReader(message: ListDepositMarketReply, reader: jspb.BinaryReader): ListDepositMarketReply;
}

export namespace ListDepositMarketReply {
    export type AsObject = {
        addressList: Array<string>,
    }
}

export class DepositFeeAccountRequest extends jspb.Message { 
    getNumOfAddresses(): number;
    setNumOfAddresses(value: number): DepositFeeAccountRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DepositFeeAccountRequest.AsObject;
    static toObject(includeInstance: boolean, msg: DepositFeeAccountRequest): DepositFeeAccountRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DepositFeeAccountRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DepositFeeAccountRequest;
    static deserializeBinaryFromReader(message: DepositFeeAccountRequest, reader: jspb.BinaryReader): DepositFeeAccountRequest;
}

export namespace DepositFeeAccountRequest {
    export type AsObject = {
        numOfAddresses: number,
    }
}

export class DepositFeeAccountReply extends jspb.Message { 
    clearAddressWithBlindingKeyList(): void;
    getAddressWithBlindingKeyList(): Array<types_pb.AddressWithBlindingKey>;
    setAddressWithBlindingKeyList(value: Array<types_pb.AddressWithBlindingKey>): DepositFeeAccountReply;
    addAddressWithBlindingKey(value?: types_pb.AddressWithBlindingKey, index?: number): types_pb.AddressWithBlindingKey;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DepositFeeAccountReply.AsObject;
    static toObject(includeInstance: boolean, msg: DepositFeeAccountReply): DepositFeeAccountReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DepositFeeAccountReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DepositFeeAccountReply;
    static deserializeBinaryFromReader(message: DepositFeeAccountReply, reader: jspb.BinaryReader): DepositFeeAccountReply;
}

export namespace DepositFeeAccountReply {
    export type AsObject = {
        addressWithBlindingKeyList: Array<types_pb.AddressWithBlindingKey.AsObject>,
    }
}

export class BalanceFeeAccountRequest extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): BalanceFeeAccountRequest.AsObject;
    static toObject(includeInstance: boolean, msg: BalanceFeeAccountRequest): BalanceFeeAccountRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: BalanceFeeAccountRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): BalanceFeeAccountRequest;
    static deserializeBinaryFromReader(message: BalanceFeeAccountRequest, reader: jspb.BinaryReader): BalanceFeeAccountRequest;
}

export namespace BalanceFeeAccountRequest {
    export type AsObject = {
    }
}

export class BalanceFeeAccountReply extends jspb.Message { 
    getBalance(): number;
    setBalance(value: number): BalanceFeeAccountReply;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): BalanceFeeAccountReply.AsObject;
    static toObject(includeInstance: boolean, msg: BalanceFeeAccountReply): BalanceFeeAccountReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: BalanceFeeAccountReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): BalanceFeeAccountReply;
    static deserializeBinaryFromReader(message: BalanceFeeAccountReply, reader: jspb.BinaryReader): BalanceFeeAccountReply;
}

export namespace BalanceFeeAccountReply {
    export type AsObject = {
        balance: number,
    }
}

export class ListMarketRequest extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ListMarketRequest): ListMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListMarketRequest;
    static deserializeBinaryFromReader(message: ListMarketRequest, reader: jspb.BinaryReader): ListMarketRequest;
}

export namespace ListMarketRequest {
    export type AsObject = {
    }
}

export class ListMarketReply extends jspb.Message { 
    clearMarketsList(): void;
    getMarketsList(): Array<MarketInfo>;
    setMarketsList(value: Array<MarketInfo>): ListMarketReply;
    addMarkets(value?: MarketInfo, index?: number): MarketInfo;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: ListMarketReply): ListMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListMarketReply;
    static deserializeBinaryFromReader(message: ListMarketReply, reader: jspb.BinaryReader): ListMarketReply;
}

export namespace ListMarketReply {
    export type AsObject = {
        marketsList: Array<MarketInfo.AsObject>,
    }
}

export class ClaimMarketDepositRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): ClaimMarketDepositRequest;

    clearOutpointsList(): void;
    getOutpointsList(): Array<TxOutpoint>;
    setOutpointsList(value: Array<TxOutpoint>): ClaimMarketDepositRequest;
    addOutpoints(value?: TxOutpoint, index?: number): TxOutpoint;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ClaimMarketDepositRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ClaimMarketDepositRequest): ClaimMarketDepositRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ClaimMarketDepositRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ClaimMarketDepositRequest;
    static deserializeBinaryFromReader(message: ClaimMarketDepositRequest, reader: jspb.BinaryReader): ClaimMarketDepositRequest;
}

export namespace ClaimMarketDepositRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        outpointsList: Array<TxOutpoint.AsObject>,
    }
}

export class ClaimMarketDepositReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ClaimMarketDepositReply.AsObject;
    static toObject(includeInstance: boolean, msg: ClaimMarketDepositReply): ClaimMarketDepositReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ClaimMarketDepositReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ClaimMarketDepositReply;
    static deserializeBinaryFromReader(message: ClaimMarketDepositReply, reader: jspb.BinaryReader): ClaimMarketDepositReply;
}

export namespace ClaimMarketDepositReply {
    export type AsObject = {
    }
}

export class ClaimFeeDepositRequest extends jspb.Message { 
    clearOutpointsList(): void;
    getOutpointsList(): Array<TxOutpoint>;
    setOutpointsList(value: Array<TxOutpoint>): ClaimFeeDepositRequest;
    addOutpoints(value?: TxOutpoint, index?: number): TxOutpoint;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ClaimFeeDepositRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ClaimFeeDepositRequest): ClaimFeeDepositRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ClaimFeeDepositRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ClaimFeeDepositRequest;
    static deserializeBinaryFromReader(message: ClaimFeeDepositRequest, reader: jspb.BinaryReader): ClaimFeeDepositRequest;
}

export namespace ClaimFeeDepositRequest {
    export type AsObject = {
        outpointsList: Array<TxOutpoint.AsObject>,
    }
}

export class ClaimFeeDepositReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ClaimFeeDepositReply.AsObject;
    static toObject(includeInstance: boolean, msg: ClaimFeeDepositReply): ClaimFeeDepositReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ClaimFeeDepositReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ClaimFeeDepositReply;
    static deserializeBinaryFromReader(message: ClaimFeeDepositReply, reader: jspb.BinaryReader): ClaimFeeDepositReply;
}

export namespace ClaimFeeDepositReply {
    export type AsObject = {
    }
}

export class OpenMarketRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): OpenMarketRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): OpenMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: OpenMarketRequest): OpenMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: OpenMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): OpenMarketRequest;
    static deserializeBinaryFromReader(message: OpenMarketRequest, reader: jspb.BinaryReader): OpenMarketRequest;
}

export namespace OpenMarketRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
    }
}

export class OpenMarketReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): OpenMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: OpenMarketReply): OpenMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: OpenMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): OpenMarketReply;
    static deserializeBinaryFromReader(message: OpenMarketReply, reader: jspb.BinaryReader): OpenMarketReply;
}

export namespace OpenMarketReply {
    export type AsObject = {
    }
}

export class CloseMarketRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): CloseMarketRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): CloseMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: CloseMarketRequest): CloseMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: CloseMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): CloseMarketRequest;
    static deserializeBinaryFromReader(message: CloseMarketRequest, reader: jspb.BinaryReader): CloseMarketRequest;
}

export namespace CloseMarketRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
    }
}

export class CloseMarketReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): CloseMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: CloseMarketReply): CloseMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: CloseMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): CloseMarketReply;
    static deserializeBinaryFromReader(message: CloseMarketReply, reader: jspb.BinaryReader): CloseMarketReply;
}

export namespace CloseMarketReply {
    export type AsObject = {
    }
}

export class UpdateMarketStrategyRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): UpdateMarketStrategyRequest;

    getStrategyType(): StrategyType;
    setStrategyType(value: StrategyType): UpdateMarketStrategyRequest;

    getMetadata(): string;
    setMetadata(value: string): UpdateMarketStrategyRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketStrategyRequest.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketStrategyRequest): UpdateMarketStrategyRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketStrategyRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketStrategyRequest;
    static deserializeBinaryFromReader(message: UpdateMarketStrategyRequest, reader: jspb.BinaryReader): UpdateMarketStrategyRequest;
}

export namespace UpdateMarketStrategyRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        strategyType: StrategyType,
        metadata: string,
    }
}

export class UpdateMarketStrategyReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketStrategyReply.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketStrategyReply): UpdateMarketStrategyReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketStrategyReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketStrategyReply;
    static deserializeBinaryFromReader(message: UpdateMarketStrategyReply, reader: jspb.BinaryReader): UpdateMarketStrategyReply;
}

export namespace UpdateMarketStrategyReply {
    export type AsObject = {
    }
}

export class UpdateMarketFeeRequest extends jspb.Message { 

    hasMarketWithFee(): boolean;
    clearMarketWithFee(): void;
    getMarketWithFee(): types_pb.MarketWithFee | undefined;
    setMarketWithFee(value?: types_pb.MarketWithFee): UpdateMarketFeeRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketFeeRequest.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketFeeRequest): UpdateMarketFeeRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketFeeRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketFeeRequest;
    static deserializeBinaryFromReader(message: UpdateMarketFeeRequest, reader: jspb.BinaryReader): UpdateMarketFeeRequest;
}

export namespace UpdateMarketFeeRequest {
    export type AsObject = {
        marketWithFee?: types_pb.MarketWithFee.AsObject,
    }
}

export class UpdateMarketFeeReply extends jspb.Message { 

    hasMarketWithFee(): boolean;
    clearMarketWithFee(): void;
    getMarketWithFee(): types_pb.MarketWithFee | undefined;
    setMarketWithFee(value?: types_pb.MarketWithFee): UpdateMarketFeeReply;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketFeeReply.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketFeeReply): UpdateMarketFeeReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketFeeReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketFeeReply;
    static deserializeBinaryFromReader(message: UpdateMarketFeeReply, reader: jspb.BinaryReader): UpdateMarketFeeReply;
}

export namespace UpdateMarketFeeReply {
    export type AsObject = {
        marketWithFee?: types_pb.MarketWithFee.AsObject,
    }
}

export class UpdateMarketPriceRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): UpdateMarketPriceRequest;


    hasPrice(): boolean;
    clearPrice(): void;
    getPrice(): types_pb.Price | undefined;
    setPrice(value?: types_pb.Price): UpdateMarketPriceRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketPriceRequest.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketPriceRequest): UpdateMarketPriceRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketPriceRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketPriceRequest;
    static deserializeBinaryFromReader(message: UpdateMarketPriceRequest, reader: jspb.BinaryReader): UpdateMarketPriceRequest;
}

export namespace UpdateMarketPriceRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        price?: types_pb.Price.AsObject,
    }
}

export class UpdateMarketPriceReply extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): UpdateMarketPriceReply.AsObject;
    static toObject(includeInstance: boolean, msg: UpdateMarketPriceReply): UpdateMarketPriceReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: UpdateMarketPriceReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): UpdateMarketPriceReply;
    static deserializeBinaryFromReader(message: UpdateMarketPriceReply, reader: jspb.BinaryReader): UpdateMarketPriceReply;
}

export namespace UpdateMarketPriceReply {
    export type AsObject = {
    }
}

export class WithdrawMarketRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): WithdrawMarketRequest;


    hasBalanceToWithdraw(): boolean;
    clearBalanceToWithdraw(): void;
    getBalanceToWithdraw(): types_pb.Balance | undefined;
    setBalanceToWithdraw(value?: types_pb.Balance): WithdrawMarketRequest;

    getMillisatPerByte(): number;
    setMillisatPerByte(value: number): WithdrawMarketRequest;

    getAddress(): string;
    setAddress(value: string): WithdrawMarketRequest;

    getPush(): boolean;
    setPush(value: boolean): WithdrawMarketRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): WithdrawMarketRequest.AsObject;
    static toObject(includeInstance: boolean, msg: WithdrawMarketRequest): WithdrawMarketRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: WithdrawMarketRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): WithdrawMarketRequest;
    static deserializeBinaryFromReader(message: WithdrawMarketRequest, reader: jspb.BinaryReader): WithdrawMarketRequest;
}

export namespace WithdrawMarketRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        balanceToWithdraw?: types_pb.Balance.AsObject,
        millisatPerByte: number,
        address: string,
        push: boolean,
    }
}

export class WithdrawMarketReply extends jspb.Message { 
    getRawTx(): Uint8Array | string;
    getRawTx_asU8(): Uint8Array;
    getRawTx_asB64(): string;
    setRawTx(value: Uint8Array | string): WithdrawMarketReply;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): WithdrawMarketReply.AsObject;
    static toObject(includeInstance: boolean, msg: WithdrawMarketReply): WithdrawMarketReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: WithdrawMarketReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): WithdrawMarketReply;
    static deserializeBinaryFromReader(message: WithdrawMarketReply, reader: jspb.BinaryReader): WithdrawMarketReply;
}

export namespace WithdrawMarketReply {
    export type AsObject = {
        rawTx: Uint8Array | string,
    }
}

export class ListSwapsRequest extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListSwapsRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ListSwapsRequest): ListSwapsRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListSwapsRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListSwapsRequest;
    static deserializeBinaryFromReader(message: ListSwapsRequest, reader: jspb.BinaryReader): ListSwapsRequest;
}

export namespace ListSwapsRequest {
    export type AsObject = {
    }
}

export class ListSwapsReply extends jspb.Message { 
    clearSwapsList(): void;
    getSwapsList(): Array<SwapInfo>;
    setSwapsList(value: Array<SwapInfo>): ListSwapsReply;
    addSwaps(value?: SwapInfo, index?: number): SwapInfo;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ListSwapsReply.AsObject;
    static toObject(includeInstance: boolean, msg: ListSwapsReply): ListSwapsReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ListSwapsReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ListSwapsReply;
    static deserializeBinaryFromReader(message: ListSwapsReply, reader: jspb.BinaryReader): ListSwapsReply;
}

export namespace ListSwapsReply {
    export type AsObject = {
        swapsList: Array<SwapInfo.AsObject>,
    }
}

export class ReportMarketFeeRequest extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): ReportMarketFeeRequest;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ReportMarketFeeRequest.AsObject;
    static toObject(includeInstance: boolean, msg: ReportMarketFeeRequest): ReportMarketFeeRequest.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ReportMarketFeeRequest, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ReportMarketFeeRequest;
    static deserializeBinaryFromReader(message: ReportMarketFeeRequest, reader: jspb.BinaryReader): ReportMarketFeeRequest;
}

export namespace ReportMarketFeeRequest {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
    }
}

export class ReportMarketFeeReply extends jspb.Message { 
    clearCollectedFeesList(): void;
    getCollectedFeesList(): Array<FeeInfo>;
    setCollectedFeesList(value: Array<FeeInfo>): ReportMarketFeeReply;
    addCollectedFees(value?: FeeInfo, index?: number): FeeInfo;


    getTotalCollectedFeesPerAssetMap(): jspb.Map<string, number>;
    clearTotalCollectedFeesPerAssetMap(): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): ReportMarketFeeReply.AsObject;
    static toObject(includeInstance: boolean, msg: ReportMarketFeeReply): ReportMarketFeeReply.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: ReportMarketFeeReply, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): ReportMarketFeeReply;
    static deserializeBinaryFromReader(message: ReportMarketFeeReply, reader: jspb.BinaryReader): ReportMarketFeeReply;
}

export namespace ReportMarketFeeReply {
    export type AsObject = {
        collectedFeesList: Array<FeeInfo.AsObject>,

        totalCollectedFeesPerAssetMap: Array<[string, number]>,
    }
}

export class MarketInfo extends jspb.Message { 

    hasMarket(): boolean;
    clearMarket(): void;
    getMarket(): types_pb.Market | undefined;
    setMarket(value?: types_pb.Market): MarketInfo;


    hasFee(): boolean;
    clearFee(): void;
    getFee(): types_pb.Fee | undefined;
    setFee(value?: types_pb.Fee): MarketInfo;

    getTradable(): boolean;
    setTradable(value: boolean): MarketInfo;

    getStrategyType(): StrategyType;
    setStrategyType(value: StrategyType): MarketInfo;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): MarketInfo.AsObject;
    static toObject(includeInstance: boolean, msg: MarketInfo): MarketInfo.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: MarketInfo, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): MarketInfo;
    static deserializeBinaryFromReader(message: MarketInfo, reader: jspb.BinaryReader): MarketInfo;
}

export namespace MarketInfo {
    export type AsObject = {
        market?: types_pb.Market.AsObject,
        fee?: types_pb.Fee.AsObject,
        tradable: boolean,
        strategyType: StrategyType,
    }
}

export class SwapInfo extends jspb.Message { 
    getStatus(): SwapStatus;
    setStatus(value: SwapStatus): SwapInfo;

    getAmountP(): number;
    setAmountP(value: number): SwapInfo;

    getAssetP(): string;
    setAssetP(value: string): SwapInfo;

    getAmountR(): number;
    setAmountR(value: number): SwapInfo;

    getAssetR(): string;
    setAssetR(value: string): SwapInfo;


    hasMarketFee(): boolean;
    clearMarketFee(): void;
    getMarketFee(): types_pb.Fee | undefined;
    setMarketFee(value?: types_pb.Fee): SwapInfo;

    getRequestTimeUnix(): number;
    setRequestTimeUnix(value: number): SwapInfo;

    getAcceptTimeUnix(): number;
    setAcceptTimeUnix(value: number): SwapInfo;

    getCompleteTimeUnix(): number;
    setCompleteTimeUnix(value: number): SwapInfo;

    getExpiryTimeUnix(): number;
    setExpiryTimeUnix(value: number): SwapInfo;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SwapInfo.AsObject;
    static toObject(includeInstance: boolean, msg: SwapInfo): SwapInfo.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SwapInfo, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SwapInfo;
    static deserializeBinaryFromReader(message: SwapInfo, reader: jspb.BinaryReader): SwapInfo;
}

export namespace SwapInfo {
    export type AsObject = {
        status: SwapStatus,
        amountP: number,
        assetP: string,
        amountR: number,
        assetR: string,
        marketFee?: types_pb.Fee.AsObject,
        requestTimeUnix: number,
        acceptTimeUnix: number,
        completeTimeUnix: number,
        expiryTimeUnix: number,
    }
}

export class FeeInfo extends jspb.Message { 
    getTradeId(): string;
    setTradeId(value: string): FeeInfo;

    getBasisPoint(): number;
    setBasisPoint(value: number): FeeInfo;

    getAsset(): string;
    setAsset(value: string): FeeInfo;

    getAmount(): number;
    setAmount(value: number): FeeInfo;

    getMarketPrice(): number;
    setMarketPrice(value: number): FeeInfo;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): FeeInfo.AsObject;
    static toObject(includeInstance: boolean, msg: FeeInfo): FeeInfo.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: FeeInfo, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): FeeInfo;
    static deserializeBinaryFromReader(message: FeeInfo, reader: jspb.BinaryReader): FeeInfo;
}

export namespace FeeInfo {
    export type AsObject = {
        tradeId: string,
        basisPoint: number,
        asset: string,
        amount: number,
        marketPrice: number,
    }
}

export class TxOutpoint extends jspb.Message { 
    getHash(): string;
    setHash(value: string): TxOutpoint;

    getIndex(): number;
    setIndex(value: number): TxOutpoint;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): TxOutpoint.AsObject;
    static toObject(includeInstance: boolean, msg: TxOutpoint): TxOutpoint.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: TxOutpoint, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): TxOutpoint;
    static deserializeBinaryFromReader(message: TxOutpoint, reader: jspb.BinaryReader): TxOutpoint;
}

export namespace TxOutpoint {
    export type AsObject = {
        hash: string,
        index: number,
    }
}

export enum StrategyType {
    PLUGGABLE = 0,
    BALANCED = 1,
    UNBALANCED = 2,
}

export enum SwapStatus {
    UNDEFINED = 0,
    REQUEST = 1,
    ACCEPT = 2,
    COMPLETE = 3,
}
