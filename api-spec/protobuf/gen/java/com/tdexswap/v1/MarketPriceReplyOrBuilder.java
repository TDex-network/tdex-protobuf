// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: v1/trade.proto

package com.tdexswap.v1;

public interface MarketPriceReplyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tdexswap.v1.MarketPriceReply)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  java.util.List<com.tdexswap.v1.PriceWithFee> 
      getPricesList();
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  com.tdexswap.v1.PriceWithFee getPrices(int index);
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  int getPricesCount();
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  java.util.List<? extends com.tdexswap.v1.PriceWithFeeOrBuilder> 
      getPricesOrBuilderList();
  /**
   * <code>repeated .tdexswap.v1.PriceWithFee prices = 1 [json_name = "prices"];</code>
   */
  com.tdexswap.v1.PriceWithFeeOrBuilder getPricesOrBuilder(
      int index);
}