// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

public interface TradeCompleteRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdexswap.v1.TradeCompleteRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.tdexswap.v1.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
   * @return Whether the swapComplete field is set.
   */
  boolean hasSwapComplete();
  /**
   * <code>.tdexswap.v1.SwapComplete swap_complete = 1 [json_name = "swapComplete"];</code>
   * @return The swapComplete.
   */
  com.tdexswap.v1.SwapComplete getSwapComplete();

  /**
   * <code>.tdexswap.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   * @return Whether the swapFail field is set.
   */
  boolean hasSwapFail();
  /**
   * <code>.tdexswap.v1.SwapFail swap_fail = 2 [json_name = "swapFail"];</code>
   * @return The swapFail.
   */
  com.tdexswap.v1.SwapFail getSwapFail();
}
