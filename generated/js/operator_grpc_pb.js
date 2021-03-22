// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('@grpc/grpc-js');
var operator_pb = require('./operator_pb.js');
var types_pb = require('./types_pb.js');

function serialize_BalanceFeeAccountReply(arg) {
  if (!(arg instanceof operator_pb.BalanceFeeAccountReply)) {
    throw new Error('Expected argument of type BalanceFeeAccountReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_BalanceFeeAccountReply(buffer_arg) {
  return operator_pb.BalanceFeeAccountReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_BalanceFeeAccountRequest(arg) {
  if (!(arg instanceof operator_pb.BalanceFeeAccountRequest)) {
    throw new Error('Expected argument of type BalanceFeeAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_BalanceFeeAccountRequest(buffer_arg) {
  return operator_pb.BalanceFeeAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ClaimFeeDepositReply(arg) {
  if (!(arg instanceof operator_pb.ClaimFeeDepositReply)) {
    throw new Error('Expected argument of type ClaimFeeDepositReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ClaimFeeDepositReply(buffer_arg) {
  return operator_pb.ClaimFeeDepositReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ClaimFeeDepositRequest(arg) {
  if (!(arg instanceof operator_pb.ClaimFeeDepositRequest)) {
    throw new Error('Expected argument of type ClaimFeeDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ClaimFeeDepositRequest(buffer_arg) {
  return operator_pb.ClaimFeeDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ClaimMarketDepositReply(arg) {
  if (!(arg instanceof operator_pb.ClaimMarketDepositReply)) {
    throw new Error('Expected argument of type ClaimMarketDepositReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ClaimMarketDepositReply(buffer_arg) {
  return operator_pb.ClaimMarketDepositReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ClaimMarketDepositRequest(arg) {
  if (!(arg instanceof operator_pb.ClaimMarketDepositRequest)) {
    throw new Error('Expected argument of type ClaimMarketDepositRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ClaimMarketDepositRequest(buffer_arg) {
  return operator_pb.ClaimMarketDepositRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_CloseMarketReply(arg) {
  if (!(arg instanceof operator_pb.CloseMarketReply)) {
    throw new Error('Expected argument of type CloseMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_CloseMarketReply(buffer_arg) {
  return operator_pb.CloseMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_CloseMarketRequest(arg) {
  if (!(arg instanceof operator_pb.CloseMarketRequest)) {
    throw new Error('Expected argument of type CloseMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_CloseMarketRequest(buffer_arg) {
  return operator_pb.CloseMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DepositFeeAccountReply(arg) {
  if (!(arg instanceof operator_pb.DepositFeeAccountReply)) {
    throw new Error('Expected argument of type DepositFeeAccountReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DepositFeeAccountReply(buffer_arg) {
  return operator_pb.DepositFeeAccountReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DepositFeeAccountRequest(arg) {
  if (!(arg instanceof operator_pb.DepositFeeAccountRequest)) {
    throw new Error('Expected argument of type DepositFeeAccountRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DepositFeeAccountRequest(buffer_arg) {
  return operator_pb.DepositFeeAccountRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DepositMarketReply(arg) {
  if (!(arg instanceof operator_pb.DepositMarketReply)) {
    throw new Error('Expected argument of type DepositMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DepositMarketReply(buffer_arg) {
  return operator_pb.DepositMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_DepositMarketRequest(arg) {
  if (!(arg instanceof operator_pb.DepositMarketRequest)) {
    throw new Error('Expected argument of type DepositMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_DepositMarketRequest(buffer_arg) {
  return operator_pb.DepositMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListDepositMarketReply(arg) {
  if (!(arg instanceof operator_pb.ListDepositMarketReply)) {
    throw new Error('Expected argument of type ListDepositMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListDepositMarketReply(buffer_arg) {
  return operator_pb.ListDepositMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListDepositMarketRequest(arg) {
  if (!(arg instanceof operator_pb.ListDepositMarketRequest)) {
    throw new Error('Expected argument of type ListDepositMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListDepositMarketRequest(buffer_arg) {
  return operator_pb.ListDepositMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListMarketReply(arg) {
  if (!(arg instanceof operator_pb.ListMarketReply)) {
    throw new Error('Expected argument of type ListMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListMarketReply(buffer_arg) {
  return operator_pb.ListMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListMarketRequest(arg) {
  if (!(arg instanceof operator_pb.ListMarketRequest)) {
    throw new Error('Expected argument of type ListMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListMarketRequest(buffer_arg) {
  return operator_pb.ListMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListSwapsReply(arg) {
  if (!(arg instanceof operator_pb.ListSwapsReply)) {
    throw new Error('Expected argument of type ListSwapsReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListSwapsReply(buffer_arg) {
  return operator_pb.ListSwapsReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListSwapsRequest(arg) {
  if (!(arg instanceof operator_pb.ListSwapsRequest)) {
    throw new Error('Expected argument of type ListSwapsRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListSwapsRequest(buffer_arg) {
  return operator_pb.ListSwapsRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListUtxosReply(arg) {
  if (!(arg instanceof operator_pb.ListUtxosReply)) {
    throw new Error('Expected argument of type ListUtxosReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListUtxosReply(buffer_arg) {
  return operator_pb.ListUtxosReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ListUtxosRequest(arg) {
  if (!(arg instanceof operator_pb.ListUtxosRequest)) {
    throw new Error('Expected argument of type ListUtxosRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ListUtxosRequest(buffer_arg) {
  return operator_pb.ListUtxosRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OpenMarketReply(arg) {
  if (!(arg instanceof operator_pb.OpenMarketReply)) {
    throw new Error('Expected argument of type OpenMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OpenMarketReply(buffer_arg) {
  return operator_pb.OpenMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_OpenMarketRequest(arg) {
  if (!(arg instanceof operator_pb.OpenMarketRequest)) {
    throw new Error('Expected argument of type OpenMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_OpenMarketRequest(buffer_arg) {
  return operator_pb.OpenMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReloadUtxosReply(arg) {
  if (!(arg instanceof operator_pb.ReloadUtxosReply)) {
    throw new Error('Expected argument of type ReloadUtxosReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReloadUtxosReply(buffer_arg) {
  return operator_pb.ReloadUtxosReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReloadUtxosRequest(arg) {
  if (!(arg instanceof operator_pb.ReloadUtxosRequest)) {
    throw new Error('Expected argument of type ReloadUtxosRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReloadUtxosRequest(buffer_arg) {
  return operator_pb.ReloadUtxosRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReportMarketFeeReply(arg) {
  if (!(arg instanceof operator_pb.ReportMarketFeeReply)) {
    throw new Error('Expected argument of type ReportMarketFeeReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReportMarketFeeReply(buffer_arg) {
  return operator_pb.ReportMarketFeeReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_ReportMarketFeeRequest(arg) {
  if (!(arg instanceof operator_pb.ReportMarketFeeRequest)) {
    throw new Error('Expected argument of type ReportMarketFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_ReportMarketFeeRequest(buffer_arg) {
  return operator_pb.ReportMarketFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketFeeReply(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketFeeReply)) {
    throw new Error('Expected argument of type UpdateMarketFeeReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketFeeReply(buffer_arg) {
  return operator_pb.UpdateMarketFeeReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketFeeRequest(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketFeeRequest)) {
    throw new Error('Expected argument of type UpdateMarketFeeRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketFeeRequest(buffer_arg) {
  return operator_pb.UpdateMarketFeeRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketPriceReply(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketPriceReply)) {
    throw new Error('Expected argument of type UpdateMarketPriceReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketPriceReply(buffer_arg) {
  return operator_pb.UpdateMarketPriceReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketPriceRequest(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketPriceRequest)) {
    throw new Error('Expected argument of type UpdateMarketPriceRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketPriceRequest(buffer_arg) {
  return operator_pb.UpdateMarketPriceRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketStrategyReply(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketStrategyReply)) {
    throw new Error('Expected argument of type UpdateMarketStrategyReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketStrategyReply(buffer_arg) {
  return operator_pb.UpdateMarketStrategyReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_UpdateMarketStrategyRequest(arg) {
  if (!(arg instanceof operator_pb.UpdateMarketStrategyRequest)) {
    throw new Error('Expected argument of type UpdateMarketStrategyRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_UpdateMarketStrategyRequest(buffer_arg) {
  return operator_pb.UpdateMarketStrategyRequest.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_WithdrawMarketReply(arg) {
  if (!(arg instanceof operator_pb.WithdrawMarketReply)) {
    throw new Error('Expected argument of type WithdrawMarketReply');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_WithdrawMarketReply(buffer_arg) {
  return operator_pb.WithdrawMarketReply.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_WithdrawMarketRequest(arg) {
  if (!(arg instanceof operator_pb.WithdrawMarketRequest)) {
    throw new Error('Expected argument of type WithdrawMarketRequest');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_WithdrawMarketRequest(buffer_arg) {
  return operator_pb.WithdrawMarketRequest.deserializeBinary(new Uint8Array(buffer_arg));
}


// *
// Service for operators to configure and manage a TDEX daemon
var OperatorService = exports.OperatorService = {
  // Returns a new derived address for the given market.
// If market field is empty, a new Market is created and MUST be initialized.
depositMarket: {
    path: '/Operator/DepositMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.DepositMarketRequest,
    responseType: operator_pb.DepositMarketReply,
    requestSerialize: serialize_DepositMarketRequest,
    requestDeserialize: deserialize_DepositMarketRequest,
    responseSerialize: serialize_DepositMarketReply,
    responseDeserialize: deserialize_DepositMarketReply,
  },
  // Returns the list of previously generated addresses for the given market.
listDepositMarket: {
    path: '/Operator/ListDepositMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ListDepositMarketRequest,
    responseType: operator_pb.ListDepositMarketReply,
    requestSerialize: serialize_ListDepositMarketRequest,
    requestDeserialize: deserialize_ListDepositMarketRequest,
    responseSerialize: serialize_ListDepositMarketReply,
    responseDeserialize: deserialize_ListDepositMarketReply,
  },
  // Returns a new derived address from the fee account.
// This is only used to deposit some LBTC to subsidize blockchain fees.
depositFeeAccount: {
    path: '/Operator/DepositFeeAccount',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.DepositFeeAccountRequest,
    responseType: operator_pb.DepositFeeAccountReply,
    requestSerialize: serialize_DepositFeeAccountRequest,
    requestDeserialize: deserialize_DepositFeeAccountRequest,
    responseSerialize: serialize_DepositFeeAccountReply,
    responseDeserialize: deserialize_DepositFeeAccountReply,
  },
  // Returns the aggregated balance of LBTC held in the fee account.
balanceFeeAccount: {
    path: '/Operator/BalanceFeeAccount',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.BalanceFeeAccountRequest,
    responseType: operator_pb.BalanceFeeAccountReply,
    requestSerialize: serialize_BalanceFeeAccountRequest,
    requestDeserialize: deserialize_BalanceFeeAccountRequest,
    responseSerialize: serialize_BalanceFeeAccountReply,
    responseDeserialize: deserialize_BalanceFeeAccountReply,
  },
  // Operator can provide transaction(s) outpoints of deposits made to fund a new market.
// The transaction must be visible and confirmed, otherwise an error will be returned,
// inviting the operator to retry again
claimMarketDeposit: {
    path: '/Operator/ClaimMarketDeposit',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ClaimMarketDepositRequest,
    responseType: operator_pb.ClaimMarketDepositReply,
    requestSerialize: serialize_ClaimMarketDepositRequest,
    requestDeserialize: deserialize_ClaimMarketDepositRequest,
    responseSerialize: serialize_ClaimMarketDepositReply,
    responseDeserialize: deserialize_ClaimMarketDepositReply,
  },
  // Operator can provide transaction(s) outpoints of deposits made to fund the fee account.
// The transaction must be visible and confirmed, otherwise an error will be returned,
// inviting the operator to retry again
claimFeeDeposit: {
    path: '/Operator/ClaimFeeDeposit',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ClaimFeeDepositRequest,
    responseType: operator_pb.ClaimFeeDepositReply,
    requestSerialize: serialize_ClaimFeeDepositRequest,
    requestDeserialize: deserialize_ClaimFeeDepositRequest,
    responseSerialize: serialize_ClaimFeeDepositReply,
    responseDeserialize: deserialize_ClaimFeeDepositReply,
  },
  // Makes the given market tradable
openMarket: {
    path: '/Operator/OpenMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.OpenMarketRequest,
    responseType: operator_pb.OpenMarketReply,
    requestSerialize: serialize_OpenMarketRequest,
    requestDeserialize: deserialize_OpenMarketRequest,
    responseSerialize: serialize_OpenMarketReply,
    responseDeserialize: deserialize_OpenMarketReply,
  },
  // Makes the given market NOT tradabale
closeMarket: {
    path: '/Operator/CloseMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.CloseMarketRequest,
    responseType: operator_pb.CloseMarketReply,
    requestSerialize: serialize_CloseMarketRequest,
    requestDeserialize: deserialize_CloseMarketRequest,
    responseSerialize: serialize_CloseMarketReply,
    responseDeserialize: deserialize_CloseMarketReply,
  },
  // Get extended details for each markets either open, closed or to be funded.
listMarket: {
    path: '/Operator/ListMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ListMarketRequest,
    responseType: operator_pb.ListMarketReply,
    requestSerialize: serialize_ListMarketRequest,
    requestDeserialize: deserialize_ListMarketRequest,
    responseSerialize: serialize_ListMarketReply,
    responseDeserialize: deserialize_ListMarketReply,
  },
  // Changes the Liquidity Provider fee for the given market. I thsould be
// express in basis point. To change the fee on each swap from (current) 0.25%
// to 1% you need to pass down 100 The Market MUST be closed before doing this
// change.
updateMarketFee: {
    path: '/Operator/UpdateMarketFee',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.UpdateMarketFeeRequest,
    responseType: operator_pb.UpdateMarketFeeReply,
    requestSerialize: serialize_UpdateMarketFeeRequest,
    requestDeserialize: deserialize_UpdateMarketFeeRequest,
    responseSerialize: serialize_UpdateMarketFeeReply,
    responseDeserialize: deserialize_UpdateMarketFeeReply,
  },
  // Manually updates the price for the given market
updateMarketPrice: {
    path: '/Operator/UpdateMarketPrice',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.UpdateMarketPriceRequest,
    responseType: operator_pb.UpdateMarketPriceReply,
    requestSerialize: serialize_UpdateMarketPriceRequest,
    requestDeserialize: deserialize_UpdateMarketPriceRequest,
    responseSerialize: serialize_UpdateMarketPriceReply,
    responseDeserialize: deserialize_UpdateMarketPriceReply,
  },
  // Updates the current market making strategy, either using an automated
// market making formula or a pluggable price feed
updateMarketStrategy: {
    path: '/Operator/UpdateMarketStrategy',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.UpdateMarketStrategyRequest,
    responseType: operator_pb.UpdateMarketStrategyReply,
    requestSerialize: serialize_UpdateMarketStrategyRequest,
    requestDeserialize: deserialize_UpdateMarketStrategyRequest,
    responseSerialize: serialize_UpdateMarketStrategyReply,
    responseDeserialize: deserialize_UpdateMarketStrategyReply,
  },
  // WithdrawMarket allows the operator to withdraw to external wallet funds
// from a specific market. The Market MUST be closed before doing this change.
withdrawMarket: {
    path: '/Operator/WithdrawMarket',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.WithdrawMarketRequest,
    responseType: operator_pb.WithdrawMarketReply,
    requestSerialize: serialize_WithdrawMarketRequest,
    requestDeserialize: deserialize_WithdrawMarketRequest,
    responseSerialize: serialize_WithdrawMarketReply,
    responseDeserialize: deserialize_WithdrawMarketReply,
  },
  // Returs all the swaps processed by the daemon (both attempted and completed)
listSwaps: {
    path: '/Operator/ListSwaps',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ListSwapsRequest,
    responseType: operator_pb.ListSwapsReply,
    requestSerialize: serialize_ListSwapsRequest,
    requestDeserialize: deserialize_ListSwapsRequest,
    responseSerialize: serialize_ListSwapsReply,
    responseDeserialize: deserialize_ListSwapsReply,
  },
  // Displays a report on how much the given market is collecting in Liquidity
// Provider fees
reportMarketFee: {
    path: '/Operator/ReportMarketFee',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ReportMarketFeeRequest,
    responseType: operator_pb.ReportMarketFeeReply,
    requestSerialize: serialize_ReportMarketFeeRequest,
    requestDeserialize: deserialize_ReportMarketFeeRequest,
    responseSerialize: serialize_ReportMarketFeeReply,
    responseDeserialize: deserialize_ReportMarketFeeReply,
  },
  // Triggers reloading of unspents for stored addresses from blockchain
reloadUtxos: {
    path: '/Operator/ReloadUtxos',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ReloadUtxosRequest,
    responseType: operator_pb.ReloadUtxosReply,
    requestSerialize: serialize_ReloadUtxosRequest,
    requestDeserialize: deserialize_ReloadUtxosRequest,
    responseSerialize: serialize_ReloadUtxosReply,
    responseDeserialize: deserialize_ReloadUtxosReply,
  },
  // Returns all the unspents and locks
listUtxos: {
    path: '/Operator/ListUtxos',
    requestStream: false,
    responseStream: false,
    requestType: operator_pb.ListUtxosRequest,
    responseType: operator_pb.ListUtxosReply,
    requestSerialize: serialize_ListUtxosRequest,
    requestDeserialize: deserialize_ListUtxosRequest,
    responseSerialize: serialize_ListUtxosReply,
    responseDeserialize: deserialize_ListUtxosReply,
  },
};

exports.OperatorClient = grpc.makeGenericClientConstructor(OperatorService);
