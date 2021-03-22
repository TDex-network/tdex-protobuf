# Protocol Documentation
<a name="top"></a>

## Table of Contents

- [operator.proto](#operator.proto)
    - [BalanceFeeAccountReply](#.BalanceFeeAccountReply)
    - [BalanceFeeAccountRequest](#.BalanceFeeAccountRequest)
    - [ClaimFeeDepositReply](#.ClaimFeeDepositReply)
    - [ClaimFeeDepositRequest](#.ClaimFeeDepositRequest)
    - [ClaimMarketDepositReply](#.ClaimMarketDepositReply)
    - [ClaimMarketDepositRequest](#.ClaimMarketDepositRequest)
    - [CloseMarketReply](#.CloseMarketReply)
    - [CloseMarketRequest](#.CloseMarketRequest)
    - [DepositFeeAccountReply](#.DepositFeeAccountReply)
    - [DepositFeeAccountRequest](#.DepositFeeAccountRequest)
    - [DepositMarketReply](#.DepositMarketReply)
    - [DepositMarketRequest](#.DepositMarketRequest)
    - [FeeInfo](#.FeeInfo)
    - [ListDepositMarketReply](#.ListDepositMarketReply)
    - [ListDepositMarketRequest](#.ListDepositMarketRequest)
    - [ListMarketReply](#.ListMarketReply)
    - [ListMarketRequest](#.ListMarketRequest)
    - [ListSwapsReply](#.ListSwapsReply)
    - [ListSwapsRequest](#.ListSwapsRequest)
    - [ListUtxosReply](#.ListUtxosReply)
    - [ListUtxosRequest](#.ListUtxosRequest)
    - [MarketInfo](#.MarketInfo)
    - [OpenMarketReply](#.OpenMarketReply)
    - [OpenMarketRequest](#.OpenMarketRequest)
    - [ReloadUtxosReply](#.ReloadUtxosReply)
    - [ReloadUtxosRequest](#.ReloadUtxosRequest)
    - [ReportMarketFeeReply](#.ReportMarketFeeReply)
    - [ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry](#.ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry)
    - [ReportMarketFeeRequest](#.ReportMarketFeeRequest)
    - [SwapInfo](#.SwapInfo)
    - [TxOutpoint](#.TxOutpoint)
    - [UpdateMarketFeeReply](#.UpdateMarketFeeReply)
    - [UpdateMarketFeeRequest](#.UpdateMarketFeeRequest)
    - [UpdateMarketPriceReply](#.UpdateMarketPriceReply)
    - [UpdateMarketPriceRequest](#.UpdateMarketPriceRequest)
    - [UpdateMarketStrategyReply](#.UpdateMarketStrategyReply)
    - [UpdateMarketStrategyRequest](#.UpdateMarketStrategyRequest)
    - [WithdrawMarketReply](#.WithdrawMarketReply)
    - [WithdrawMarketRequest](#.WithdrawMarketRequest)
  
    - [StrategyType](#.StrategyType)
    - [SwapStatus](#.SwapStatus)
  
    - [Operator](#.Operator)
  
- [swap.proto](#swap.proto)
    - [SwapAccept](#.SwapAccept)
    - [SwapAccept.InputBlindingKeyEntry](#.SwapAccept.InputBlindingKeyEntry)
    - [SwapAccept.OutputBlindingKeyEntry](#.SwapAccept.OutputBlindingKeyEntry)
    - [SwapComplete](#.SwapComplete)
    - [SwapFail](#.SwapFail)
    - [SwapRequest](#.SwapRequest)
    - [SwapRequest.InputBlindingKeyEntry](#.SwapRequest.InputBlindingKeyEntry)
    - [SwapRequest.OutputBlindingKeyEntry](#.SwapRequest.OutputBlindingKeyEntry)
  
- [trade.proto](#trade.proto)
    - [BalancesReply](#.BalancesReply)
    - [BalancesRequest](#.BalancesRequest)
    - [MarketPriceReply](#.MarketPriceReply)
    - [MarketPriceRequest](#.MarketPriceRequest)
    - [MarketsReply](#.MarketsReply)
    - [MarketsRequest](#.MarketsRequest)
    - [TradeCompleteReply](#.TradeCompleteReply)
    - [TradeCompleteRequest](#.TradeCompleteRequest)
    - [TradeProposeReply](#.TradeProposeReply)
    - [TradeProposeRequest](#.TradeProposeRequest)
  
    - [TradeType](#.TradeType)
  
    - [Trade](#.Trade)
  
- [transport.proto](#transport.proto)
    - [AvailableTransport](#.AvailableTransport)
    - [Transport](#.Transport)
  
    - [TransportType](#.TransportType)
  
- [types.proto](#types.proto)
    - [AddressWithBlindingKey](#.AddressWithBlindingKey)
    - [Balance](#.Balance)
    - [BalanceWithFee](#.BalanceWithFee)
    - [Fee](#.Fee)
    - [Market](#.Market)
    - [MarketWithFee](#.MarketWithFee)
    - [Price](#.Price)
    - [PriceWithFee](#.PriceWithFee)
  
- [wallet.proto](#wallet.proto)
    - [BalanceInfo](#.BalanceInfo)
    - [ChangePasswordReply](#.ChangePasswordReply)
    - [ChangePasswordRequest](#.ChangePasswordRequest)
    - [GenSeedReply](#.GenSeedReply)
    - [GenSeedRequest](#.GenSeedRequest)
    - [InitWalletReply](#.InitWalletReply)
    - [InitWalletRequest](#.InitWalletRequest)
    - [SendToManyReply](#.SendToManyReply)
    - [SendToManyRequest](#.SendToManyRequest)
    - [TxOut](#.TxOut)
    - [UnlockWalletReply](#.UnlockWalletReply)
    - [UnlockWalletRequest](#.UnlockWalletRequest)
    - [WalletAddressReply](#.WalletAddressReply)
    - [WalletAddressRequest](#.WalletAddressRequest)
    - [WalletBalanceReply](#.WalletBalanceReply)
    - [WalletBalanceReply.BalanceEntry](#.WalletBalanceReply.BalanceEntry)
    - [WalletBalanceRequest](#.WalletBalanceRequest)
  
    - [Wallet](#.Wallet)
  
- [Scalar Value Types](#scalar-value-types)



<a name="operator.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## operator.proto



<a name=".BalanceFeeAccountReply"></a>

### BalanceFeeAccountReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| balance | [int64](#int64) |  |  |






<a name=".BalanceFeeAccountRequest"></a>

### BalanceFeeAccountRequest







<a name=".ClaimFeeDepositReply"></a>

### ClaimFeeDepositReply







<a name=".ClaimFeeDepositRequest"></a>

### ClaimFeeDepositRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| outpoints | [TxOutpoint](#TxOutpoint) | repeated |  |






<a name=".ClaimMarketDepositReply"></a>

### ClaimMarketDepositReply







<a name=".ClaimMarketDepositRequest"></a>

### ClaimMarketDepositRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |
| outpoints | [TxOutpoint](#TxOutpoint) | repeated |  |






<a name=".CloseMarketReply"></a>

### CloseMarketReply







<a name=".CloseMarketRequest"></a>

### CloseMarketRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to be made NOT tradable |






<a name=".DepositFeeAccountReply"></a>

### DepositFeeAccountReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address_with_blinding_key | [AddressWithBlindingKey](#AddressWithBlindingKey) | repeated | AddressInfo contains address and blinding key |






<a name=".DepositFeeAccountRequest"></a>

### DepositFeeAccountRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| num_of_addresses | [int64](#int64) |  | Number of addresses to be derived for Fee Account. |






<a name=".DepositMarketReply"></a>

### DepositMarketReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| addresses | [string](#string) | repeated |  |






<a name=".DepositMarketRequest"></a>

### DepositMarketRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to get an address from. Could be empty. |
| num_of_addresses | [int64](#int64) |  | Number of addresses to be derived for market. |






<a name=".FeeInfo"></a>

### FeeInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| trade_id | [string](#string) |  |  |
| basis_point | [int64](#int64) |  |  |
| asset | [string](#string) |  |  |
| amount | [uint64](#uint64) |  |  |
| market_price | [float](#float) |  |  |






<a name=".ListDepositMarketReply"></a>

### ListDepositMarketReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address | [string](#string) | repeated |  |






<a name=".ListDepositMarketRequest"></a>

### ListDepositMarketRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to get an address from. Could be empty. |






<a name=".ListMarketReply"></a>

### ListMarketReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| markets | [MarketInfo](#MarketInfo) | repeated |  |






<a name=".ListMarketRequest"></a>

### ListMarketRequest







<a name=".ListSwapsReply"></a>

### ListSwapsReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| swaps | [SwapInfo](#SwapInfo) | repeated |  |






<a name=".ListSwapsRequest"></a>

### ListSwapsRequest







<a name=".ListUtxosReply"></a>

### ListUtxosReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| unspents | [TxOutpoint](#TxOutpoint) | repeated |  |
| locks | [TxOutpoint](#TxOutpoint) | repeated |  |






<a name=".ListUtxosRequest"></a>

### ListUtxosRequest







<a name=".MarketInfo"></a>

### MarketInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |
| fee | [Fee](#Fee) |  |  |
| tradable | [bool](#bool) |  |  |
| strategy_type | [StrategyType](#StrategyType) |  |  |






<a name=".OpenMarketReply"></a>

### OpenMarketReply







<a name=".OpenMarketRequest"></a>

### OpenMarketRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to be made tradable |






<a name=".ReloadUtxosReply"></a>

### ReloadUtxosReply







<a name=".ReloadUtxosRequest"></a>

### ReloadUtxosRequest







<a name=".ReportMarketFeeReply"></a>

### ReportMarketFeeReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| collected_fees | [FeeInfo](#FeeInfo) | repeated | List of the all unique fee being collected on each swap. |
| total_collected_fees_per_asset | [ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry](#ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry) | repeated | Map of aggreagated fee count grouped by asset. There should be one unique entry for each asset and the amount should be the aggregated total. |






<a name=".ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry"></a>

### ReportMarketFeeReply.TotalCollectedFeesPerAssetEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [int64](#int64) |  |  |






<a name=".ReportMarketFeeRequest"></a>

### ReportMarketFeeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to be updated |






<a name=".SwapInfo"></a>

### SwapInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| status | [SwapStatus](#SwapStatus) |  |  |
| amount_p | [uint64](#uint64) |  | The proposer&#39;s quantity |
| asset_p | [string](#string) |  | The proposer&#39;s asset hash |
| amount_r | [uint64](#uint64) |  | The responder&#39;s quantity |
| asset_r | [string](#string) |  | The responder&#39;s asset hash |
| market_fee | [Fee](#Fee) |  | The collected fee on the current swap |
| request_time_unix | [uint64](#uint64) |  | SwapRequest timestamp |
| accept_time_unix | [uint64](#uint64) |  | SwapAccpet timestamp |
| complete_time_unix | [uint64](#uint64) |  | SwapComplete timestap |
| expiry_time_unix | [uint64](#uint64) |  | expiration timestamp for the current swap |






<a name=".TxOutpoint"></a>

### TxOutpoint



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| hash | [string](#string) |  |  |
| index | [int32](#int32) |  |  |






<a name=".UpdateMarketFeeReply"></a>

### UpdateMarketFeeReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market_with_fee | [MarketWithFee](#MarketWithFee) |  |  |






<a name=".UpdateMarketFeeRequest"></a>

### UpdateMarketFeeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market_with_fee | [MarketWithFee](#MarketWithFee) |  |  |






<a name=".UpdateMarketPriceReply"></a>

### UpdateMarketPriceReply







<a name=".UpdateMarketPriceRequest"></a>

### UpdateMarketPriceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to update the price of |
| price | [Price](#Price) |  | Price to be updated |






<a name=".UpdateMarketStrategyReply"></a>

### UpdateMarketStrategyReply







<a name=".UpdateMarketStrategyRequest"></a>

### UpdateMarketStrategyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market to change the strategy of |
| strategy_type | [StrategyType](#StrategyType) |  | Market making strategy to use |
| metadata | [string](#string) |  | JSON string representing additional metadata relative to the chosen strategy. |






<a name=".WithdrawMarketReply"></a>

### WithdrawMarketReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| raw_tx | [bytes](#bytes) |  | The serialized transaction |






<a name=".WithdrawMarketRequest"></a>

### WithdrawMarketRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  | Market from which funds need to be withdrawn |
| balance_to_withdraw | [Balance](#Balance) |  | Amount for base and quote asset to be withdrawn |
| millisat_per_byte | [int64](#int64) |  | The number of millisatoshis per byte that should be used when crafting this transaction. |
| address | [string](#string) |  | The address to send to the funds |
| push | [bool](#bool) |  | Optional: if true the transaction will be pushed to the network |





 


<a name=".StrategyType"></a>

### StrategyType
Custom types

| Name | Number | Description |
| ---- | ------ | ----------- |
| PLUGGABLE | 0 |  |
| BALANCED | 1 |  |
| UNBALANCED | 2 |  |



<a name=".SwapStatus"></a>

### SwapStatus


| Name | Number | Description |
| ---- | ------ | ----------- |
| UNDEFINED | 0 |  |
| REQUEST | 1 |  |
| ACCEPT | 2 |  |
| COMPLETE | 3 |  |


 

 


<a name=".Operator"></a>

### Operator
Service for operators to configure and manage a TDEX daemon

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| DepositMarket | [.DepositMarketRequest](#DepositMarketRequest) | [.DepositMarketReply](#DepositMarketReply) | Returns a new derived address for the given market. If market field is empty, a new Market is created and MUST be initialized. |
| ListDepositMarket | [.ListDepositMarketRequest](#ListDepositMarketRequest) | [.ListDepositMarketReply](#ListDepositMarketReply) | Returns the list of previously generated addresses for the given market. |
| DepositFeeAccount | [.DepositFeeAccountRequest](#DepositFeeAccountRequest) | [.DepositFeeAccountReply](#DepositFeeAccountReply) | Returns a new derived address from the fee account. This is only used to deposit some LBTC to subsidize blockchain fees. |
| BalanceFeeAccount | [.BalanceFeeAccountRequest](#BalanceFeeAccountRequest) | [.BalanceFeeAccountReply](#BalanceFeeAccountReply) | Returns the aggregated balance of LBTC held in the fee account. |
| ClaimMarketDeposit | [.ClaimMarketDepositRequest](#ClaimMarketDepositRequest) | [.ClaimMarketDepositReply](#ClaimMarketDepositReply) | Operator can provide transaction(s) outpoints of deposits made to fund a new market. The transaction must be visible and confirmed, otherwise an error will be returned, inviting the operator to retry again |
| ClaimFeeDeposit | [.ClaimFeeDepositRequest](#ClaimFeeDepositRequest) | [.ClaimFeeDepositReply](#ClaimFeeDepositReply) | Operator can provide transaction(s) outpoints of deposits made to fund the fee account. The transaction must be visible and confirmed, otherwise an error will be returned, inviting the operator to retry again |
| OpenMarket | [.OpenMarketRequest](#OpenMarketRequest) | [.OpenMarketReply](#OpenMarketReply) | Makes the given market tradable |
| CloseMarket | [.CloseMarketRequest](#CloseMarketRequest) | [.CloseMarketReply](#CloseMarketReply) | Makes the given market NOT tradabale |
| ListMarket | [.ListMarketRequest](#ListMarketRequest) | [.ListMarketReply](#ListMarketReply) | Get extended details for each markets either open, closed or to be funded. |
| UpdateMarketFee | [.UpdateMarketFeeRequest](#UpdateMarketFeeRequest) | [.UpdateMarketFeeReply](#UpdateMarketFeeReply) | Changes the Liquidity Provider fee for the given market. I thsould be express in basis point. To change the fee on each swap from (current) 0.25% to 1% you need to pass down 100 The Market MUST be closed before doing this change. |
| UpdateMarketPrice | [.UpdateMarketPriceRequest](#UpdateMarketPriceRequest) | [.UpdateMarketPriceReply](#UpdateMarketPriceReply) | Manually updates the price for the given market |
| UpdateMarketStrategy | [.UpdateMarketStrategyRequest](#UpdateMarketStrategyRequest) | [.UpdateMarketStrategyReply](#UpdateMarketStrategyReply) | Updates the current market making strategy, either using an automated market making formula or a pluggable price feed |
| WithdrawMarket | [.WithdrawMarketRequest](#WithdrawMarketRequest) | [.WithdrawMarketReply](#WithdrawMarketReply) | WithdrawMarket allows the operator to withdraw to external wallet funds from a specific market. The Market MUST be closed before doing this change. |
| ListSwaps | [.ListSwapsRequest](#ListSwapsRequest) | [.ListSwapsReply](#ListSwapsReply) | Returs all the swaps processed by the daemon (both attempted and completed) |
| ReportMarketFee | [.ReportMarketFeeRequest](#ReportMarketFeeRequest) | [.ReportMarketFeeReply](#ReportMarketFeeReply) | Displays a report on how much the given market is collecting in Liquidity Provider fees |
| ReloadUtxos | [.ReloadUtxosRequest](#ReloadUtxosRequest) | [.ReloadUtxosReply](#ReloadUtxosReply) | Triggers reloading of unspents for stored addresses from blockchain |
| ListUtxos | [.ListUtxosRequest](#ListUtxosRequest) | [.ListUtxosReply](#ListUtxosReply) | Returns all the unspents and locks |

 



<a name="swap.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## swap.proto



<a name=".SwapAccept"></a>

### SwapAccept



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Random unique identifier for the current message |
| request_id | [string](#string) |  | indetifier of the SwapRequest message |
| transaction | [string](#string) |  | The partial signed transaction base64 encoded containing the Responder&#39;s signed inputs in a PSBT format |
| input_blinding_key | [SwapAccept.InputBlindingKeyEntry](#SwapAccept.InputBlindingKeyEntry) | repeated | In case of a confidential transaction the blinding key of each confidential input is included. Each blinding key is identified by the prevout script hex encoded. |
| output_blinding_key | [SwapAccept.OutputBlindingKeyEntry](#SwapAccept.OutputBlindingKeyEntry) | repeated | In case of a confidential transaction the blinding key of each confidential output is included. Each blinding key is identified by the output script hex encoded. |






<a name=".SwapAccept.InputBlindingKeyEntry"></a>

### SwapAccept.InputBlindingKeyEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |






<a name=".SwapAccept.OutputBlindingKeyEntry"></a>

### SwapAccept.OutputBlindingKeyEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |






<a name=".SwapComplete"></a>

### SwapComplete



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Random unique identifier for the current message |
| accept_id | [string](#string) |  | indetifier of the SwapAccept message |
| transaction | [string](#string) |  | The signed transaction base64 encoded containing the Proposers&#39;s signed inputs in a PSBT format |






<a name=".SwapFail"></a>

### SwapFail



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Random unique identifier for the current message |
| message_id | [string](#string) |  | indetifier of either SwapRequest or SwapAccept message. It can be empty |
| failure_code | [uint32](#uint32) |  | The failure code. It can be empty |
| failure_message | [string](#string) |  | The failure reason messaged |






<a name=".SwapRequest"></a>

### SwapRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| id | [string](#string) |  | Random unique identifier for the current message |
| amount_p | [uint64](#uint64) |  | The proposer&#39;s quantity |
| asset_p | [string](#string) |  | The proposer&#39;s asset hash |
| amount_r | [uint64](#uint64) |  | The responder&#39;s quantity |
| asset_r | [string](#string) |  | The responder&#39;s asset hash |
| transaction | [string](#string) |  | The proposer&#39;s unsigned transaction in PSBT format (base64 string) |
| input_blinding_key | [SwapRequest.InputBlindingKeyEntry](#SwapRequest.InputBlindingKeyEntry) | repeated | In case of a confidential transaction the blinding key of each confidential input is included. Each blinding key is identified by the prevout script hex encoded. |
| output_blinding_key | [SwapRequest.OutputBlindingKeyEntry](#SwapRequest.OutputBlindingKeyEntry) | repeated | In case of a confidential transaction the blinding key of each confidential output is included. Each blinding key is identified by the output script hex encoded. |






<a name=".SwapRequest.InputBlindingKeyEntry"></a>

### SwapRequest.InputBlindingKeyEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |






<a name=".SwapRequest.OutputBlindingKeyEntry"></a>

### SwapRequest.OutputBlindingKeyEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [bytes](#bytes) |  |  |





 

 

 

 



<a name="trade.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## trade.proto



<a name=".BalancesReply"></a>

### BalancesReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| balances | [BalanceWithFee](#BalanceWithFee) | repeated |  |






<a name=".BalancesRequest"></a>

### BalancesRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |






<a name=".MarketPriceReply"></a>

### MarketPriceReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| prices | [PriceWithFee](#PriceWithFee) | repeated |  |






<a name=".MarketPriceRequest"></a>

### MarketPriceRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |
| type | [TradeType](#TradeType) |  |  |
| amount | [uint64](#uint64) |  |  |
| asset | [string](#string) |  |  |






<a name=".MarketsReply"></a>

### MarketsReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| markets | [MarketWithFee](#MarketWithFee) | repeated |  |






<a name=".MarketsRequest"></a>

### MarketsRequest
BOTD#4 Service&#39;s messages






<a name=".TradeCompleteReply"></a>

### TradeCompleteReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| txid | [string](#string) |  |  |
| swap_fail | [SwapFail](#SwapFail) |  |  |






<a name=".TradeCompleteRequest"></a>

### TradeCompleteRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| swap_complete | [SwapComplete](#SwapComplete) |  |  |
| swap_fail | [SwapFail](#SwapFail) |  |  |






<a name=".TradeProposeReply"></a>

### TradeProposeReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| swap_accept | [SwapAccept](#SwapAccept) |  |  |
| swap_fail | [SwapFail](#SwapFail) |  |  |
| expiry_time_unix | [uint64](#uint64) |  |  |






<a name=".TradeProposeRequest"></a>

### TradeProposeRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |
| type | [TradeType](#TradeType) |  |  |
| swap_request | [SwapRequest](#SwapRequest) |  |  |





 


<a name=".TradeType"></a>

### TradeType


| Name | Number | Description |
| ---- | ------ | ----------- |
| BUY | 0 |  |
| SELL | 1 |  |


 

 


<a name=".Trade"></a>

### Trade


| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| Markets | [.MarketsRequest](#MarketsRequest) | [.MarketsReply](#MarketsReply) | Markets: List all the markets open for trading. |
| Balances | [.BalancesRequest](#BalancesRequest) | [.BalancesReply](#BalancesReply) | Balances: Gets the balances of the two current reserves in the given market. |
| MarketPrice | [.MarketPriceRequest](#MarketPriceRequest) | [.MarketPriceReply](#MarketPriceReply) | MarketPrice: Gets the current market price. In case of AMM startegy, the trade type and the amount of asset to be either sent or received.

BUY = quote asset as input SELL = base asset as input

If the type of the trade is BUY it means the base asset will be received by the trader.

If the type of the trade is SELL it means the base asset will be sent by the trader. |
| TradePropose | [.TradeProposeRequest](#TradeProposeRequest) | [.TradeProposeReply](#TradeProposeReply) stream | TradePropose: Sends a swap request message containing a partial signed transaction.

BUY = quote asset as input SELL = base asset as input

If the type of the trade is BUY it means the base asset will be received by the trader.

If the type of the trade is SELL it means the base asset will be sent by the trader. |
| TradeComplete | [.TradeCompleteRequest](#TradeCompleteRequest) | [.TradeCompleteReply](#TradeCompleteReply) stream | TradeComplete: Sends the trader&#39;s counter-signed transaction to the provider. If something wrong, a swap fail message is sent. It returns the transaction hash of the broadcasted transaction. |

 



<a name="transport.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## transport.proto



<a name=".AvailableTransport"></a>

### AvailableTransport



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| transport | [TransportType](#TransportType) | repeated |  |






<a name=".Transport"></a>

### Transport



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| type | [TransportType](#TransportType) |  |  |
| name | [string](#string) |  |  |
| data | [bytes](#bytes) |  |  |





 


<a name=".TransportType"></a>

### TransportType


| Name | Number | Description |
| ---- | ------ | ----------- |
| INSECURE | 0 |  |
| ONION | 1 |  |
| TLS | 2 |  |
| MTLS | 3 |  |
| NOISE | 4 |  |


 

 

 



<a name="types.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## types.proto



<a name=".AddressWithBlindingKey"></a>

### AddressWithBlindingKey



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address | [string](#string) |  | The confidential address encoded using a blech32 format. |
| blinding | [string](#string) |  | The blinding private key for the given address encoded in hex format |






<a name=".Balance"></a>

### Balance



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| base_amount | [int64](#int64) |  |  |
| quote_amount | [int64](#int64) |  |  |






<a name=".BalanceWithFee"></a>

### BalanceWithFee



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| balance | [Balance](#Balance) |  |  |
| fee | [Fee](#Fee) |  |  |






<a name=".Fee"></a>

### Fee
Custom Types


| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| basis_point | [int64](#int64) |  |  |






<a name=".Market"></a>

### Market



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| base_asset | [string](#string) |  |  |
| quote_asset | [string](#string) |  |  |






<a name=".MarketWithFee"></a>

### MarketWithFee



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| market | [Market](#Market) |  |  |
| fee | [Fee](#Fee) |  |  |






<a name=".Price"></a>

### Price



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| base_price | [float](#float) |  |  |
| quote_price | [float](#float) |  |  |






<a name=".PriceWithFee"></a>

### PriceWithFee



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| price | [Price](#Price) |  |  |
| fee | [Fee](#Fee) |  |  |
| amount | [uint64](#uint64) |  |  |
| asset | [string](#string) |  |  |





 

 

 

 



<a name="wallet.proto"></a>
<p align="right"><a href="#top">Top</a></p>

## wallet.proto



<a name=".BalanceInfo"></a>

### BalanceInfo



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| total_balance | [uint64](#uint64) |  | The balance of the wallet |
| confirmed_balance | [uint64](#uint64) |  | The confirmed balance of a wallet(with &gt;= 1 confirmations) |
| unconfirmed_balance | [uint64](#uint64) |  | The unconfirmed balance of a wallet(with 0 confirmations) |






<a name=".ChangePasswordReply"></a>

### ChangePasswordReply







<a name=".ChangePasswordRequest"></a>

### ChangePasswordRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| current_password | [bytes](#bytes) |  | current_password should be the current valid passphrase used to unlock the daemon. |
| new_password | [bytes](#bytes) |  | new_password should be the new passphrase that will be needed to unlock the daemon. |






<a name=".GenSeedReply"></a>

### GenSeedReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| seed_mnemonic | [string](#string) | repeated |  |






<a name=".GenSeedRequest"></a>

### GenSeedRequest







<a name=".InitWalletReply"></a>

### InitWalletReply







<a name=".InitWalletRequest"></a>

### InitWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_password | [bytes](#bytes) |  | wallet_password is the passphrase that should be used to encrypt the wallet. This MUST be at least 8 chars in length. After creation, this password is required to unlock the daemon. |
| seed_mnemonic | [string](#string) | repeated | seed_mnemonic is a 24-word mnemonic that encodes a prior seed obtained by the user. This MUST be a generated by the GenSeed method |
| restore | [bool](#bool) |  | the flag to let the daemon restore existing funds for the wallet. |






<a name=".SendToManyReply"></a>

### SendToManyReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| raw_tx | [bytes](#bytes) |  | The serialized transaction sent out on the network. |






<a name=".SendToManyRequest"></a>

### SendToManyRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| outputs | [TxOut](#TxOut) | repeated | A slice of the outputs that should be created in the transaction produced. |
| millisat_per_byte | [int64](#int64) |  | The number of millisatoshis per byte that should be used when crafting this transaction. |
| push | [bool](#bool) |  | Optional: if true the transaction will be pushed to the network |






<a name=".TxOut"></a>

### TxOut



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| asset | [string](#string) |  | The asset being spent |
| value | [int64](#int64) |  | The value of the output being spent. |
| address | [string](#string) |  | The confidential address of the output being spent. |






<a name=".UnlockWalletReply"></a>

### UnlockWalletReply







<a name=".UnlockWalletRequest"></a>

### UnlockWalletRequest



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| wallet_password | [bytes](#bytes) |  | wallet_password should be the current valid passphrase for the daemon. This will be required to decrypt on-disk material that the daemon requires to function properly. |






<a name=".WalletAddressReply"></a>

### WalletAddressReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| address | [string](#string) |  | The confidential address encoded using a blech32 format. |
| blinding | [string](#string) |  | The blinding private key for the given address encoded in hex format |






<a name=".WalletAddressRequest"></a>

### WalletAddressRequest







<a name=".WalletBalanceReply"></a>

### WalletBalanceReply



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| balance | [WalletBalanceReply.BalanceEntry](#WalletBalanceReply.BalanceEntry) | repeated | The balance info (total, confirmed, unconfirmed) of the wallet grouped by asset |






<a name=".WalletBalanceReply.BalanceEntry"></a>

### WalletBalanceReply.BalanceEntry



| Field | Type | Label | Description |
| ----- | ---- | ----- | ----------- |
| key | [string](#string) |  |  |
| value | [BalanceInfo](#BalanceInfo) |  |  |






<a name=".WalletBalanceRequest"></a>

### WalletBalanceRequest






 

 

 


<a name=".Wallet"></a>

### Wallet
Service for Liquidity Providers to manage funds via wallet RPC

| Method Name | Request Type | Response Type | Description |
| ----------- | ------------ | ------------- | ------------|
| GenSeed | [.GenSeedRequest](#GenSeedRequest) | [.GenSeedReply](#GenSeedReply) | GenSeed is the first method that should be used to instantiate a new tdexd instance. This method allows a caller to generate a new HD Wallet. Once the seed is obtained and verified by the user, the InitWallet method should be used to commit the newly generated seed, and create the wallet. |
| InitWallet | [.InitWalletRequest](#InitWalletRequest) | [.InitWalletReply](#InitWalletReply) stream | InitWallet is used when tdexd is starting up for the first time to fully initialize the daemon and its internal wallet. At the very least a mnemonic and a wallet password must be provided. This will be used to encrypt sensitive material on disk. Alternatively, this can be used along with the GenSeed RPC to obtain a seed, then present it to the user. Once it has been verified by the user, the seed can be fed into this RPC in order to commit the new wallet. |
| UnlockWallet | [.UnlockWalletRequest](#UnlockWalletRequest) | [.UnlockWalletReply](#UnlockWalletReply) | UnlockWallet is used at startup of tdexd to provide a password to unlock the wallet database. |
| ChangePassword | [.ChangePasswordRequest](#ChangePasswordRequest) | [.ChangePasswordReply](#ChangePasswordReply) | ChangePassword changes the password of the encrypted wallet. This will automatically unlock the wallet database if successful. |
| WalletAddress | [.WalletAddressRequest](#WalletAddressRequest) | [.WalletAddressReply](#WalletAddressReply) | WalletAddress returns a Liquid confidential p2wpkh address (BLECH32) |
| WalletBalance | [.WalletBalanceRequest](#WalletBalanceRequest) | [.WalletBalanceReply](#WalletBalanceReply) | WalletBalance returns total unspent outputs (confirmed and unconfirmed), all confirmed unspent outputs and all unconfirmed unspent outputs under control of the wallet. |
| SendToMany | [.SendToManyRequest](#SendToManyRequest) | [.SendToManyReply](#SendToManyReply) | SendToMany sends funds to many outputs |

 



## Scalar Value Types

| .proto Type | Notes | C++ | Java | Python | Go | C# | PHP | Ruby |
| ----------- | ----- | --- | ---- | ------ | -- | -- | --- | ---- |
| <a name="double" /> double |  | double | double | float | float64 | double | float | Float |
| <a name="float" /> float |  | float | float | float | float32 | float | float | Float |
| <a name="int32" /> int32 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint32 instead. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="int64" /> int64 | Uses variable-length encoding. Inefficient for encoding negative numbers – if your field is likely to have negative values, use sint64 instead. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="uint32" /> uint32 | Uses variable-length encoding. | uint32 | int | int/long | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="uint64" /> uint64 | Uses variable-length encoding. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum or Fixnum (as required) |
| <a name="sint32" /> sint32 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int32s. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sint64" /> sint64 | Uses variable-length encoding. Signed int value. These more efficiently encode negative numbers than regular int64s. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="fixed32" /> fixed32 | Always four bytes. More efficient than uint32 if values are often greater than 2^28. | uint32 | int | int | uint32 | uint | integer | Bignum or Fixnum (as required) |
| <a name="fixed64" /> fixed64 | Always eight bytes. More efficient than uint64 if values are often greater than 2^56. | uint64 | long | int/long | uint64 | ulong | integer/string | Bignum |
| <a name="sfixed32" /> sfixed32 | Always four bytes. | int32 | int | int | int32 | int | integer | Bignum or Fixnum (as required) |
| <a name="sfixed64" /> sfixed64 | Always eight bytes. | int64 | long | int/long | int64 | long | integer/string | Bignum |
| <a name="bool" /> bool |  | bool | boolean | boolean | bool | bool | boolean | TrueClass/FalseClass |
| <a name="string" /> string | A string must always contain UTF-8 encoded or 7-bit ASCII text. | string | String | str/unicode | string | string | string | String (UTF-8) |
| <a name="bytes" /> bytes | May contain any arbitrary sequence of bytes. | string | ByteString | str | []byte | ByteString | string | String (ASCII-8BIT) |

