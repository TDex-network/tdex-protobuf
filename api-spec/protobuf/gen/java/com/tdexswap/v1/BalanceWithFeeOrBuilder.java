// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/types.proto

package com.tdexswap.v1;

public interface BalanceWithFeeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdexswap.v1.BalanceWithFee)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tdexswap.v1.Balance balance = 1 [json_name = "balance"];</code>
   * @return Whether the balance field is set.
   */
  boolean hasBalance();
  /**
   * <code>.tdexswap.v1.Balance balance = 1 [json_name = "balance"];</code>
   * @return The balance.
   */
  com.tdexswap.v1.Balance getBalance();
  /**
   * <code>.tdexswap.v1.Balance balance = 1 [json_name = "balance"];</code>
   */
  com.tdexswap.v1.BalanceOrBuilder getBalanceOrBuilder();

  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   * @return The fee.
   */
  com.tdexswap.v1.Fee getFee();
  /**
   * <code>.tdexswap.v1.Fee fee = 2 [json_name = "fee"];</code>
   */
  com.tdexswap.v1.FeeOrBuilder getFeeOrBuilder();
}
