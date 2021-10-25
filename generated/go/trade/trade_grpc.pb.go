// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package trade

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion6

// TradeClient is the client API for Trade service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type TradeClient interface {
	// Markets: List all the markets open for trading.
	Markets(ctx context.Context, in *MarketsRequest, opts ...grpc.CallOption) (*MarketsReply, error)
	// Balances: Gets the balances of the two current reserves in the given
	// market.
	Balances(ctx context.Context, in *BalancesRequest, opts ...grpc.CallOption) (*BalancesReply, error)
	// MarketPrice: Gets the current market price. In case of AMM startegy, the
	// trade type and
	// the amount of asset to be either sent or received.
	//
	// BUY = quote asset as input
	// SELL = base asset as input
	//
	// If the type of the trade is BUY it means the base asset will be received by
	// the trader.
	//
	// If the type of the trade is SELL it means the base asset will be sent by
	// the trader.
	MarketPrice(ctx context.Context, in *MarketPriceRequest, opts ...grpc.CallOption) (*MarketPriceReply, error)
	// TradePropose: Sends a swap request message containing a partial signed
	// transaction.
	//
	// BUY = quote asset as input
	// SELL = base asset as input
	//
	//
	// If the type of the trade is BUY it means the base asset will be received by
	// the trader.
	//
	// If the type of the trade is SELL it means the base asset will be sent by
	// the trader.
	TradePropose(ctx context.Context, in *TradeProposeRequest, opts ...grpc.CallOption) (Trade_TradeProposeClient, error)
	// Unary RPC for TradePropose.
	TradeProposeUnary(ctx context.Context, in *TradeProposeRequest, opts ...grpc.CallOption) (*TradeProposeReply, error)
	// TradeComplete: Sends the trader's counter-signed transaction to the
	// provider. If something wrong, a swap fail message is sent. It returns the
	// transaction hash of the broadcasted transaction.
	TradeComplete(ctx context.Context, in *TradeCompleteRequest, opts ...grpc.CallOption) (Trade_TradeCompleteClient, error)
	// Unary RPC for TradeComplete.
	TradeCompleteUnary(ctx context.Context, in *TradeCompleteRequest, opts ...grpc.CallOption) (*TradeCompleteReply, error)
}

type tradeClient struct {
	cc grpc.ClientConnInterface
}

func NewTradeClient(cc grpc.ClientConnInterface) TradeClient {
	return &tradeClient{cc}
}

func (c *tradeClient) Markets(ctx context.Context, in *MarketsRequest, opts ...grpc.CallOption) (*MarketsReply, error) {
	out := new(MarketsReply)
	err := c.cc.Invoke(ctx, "/Trade/Markets", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tradeClient) Balances(ctx context.Context, in *BalancesRequest, opts ...grpc.CallOption) (*BalancesReply, error) {
	out := new(BalancesReply)
	err := c.cc.Invoke(ctx, "/Trade/Balances", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tradeClient) MarketPrice(ctx context.Context, in *MarketPriceRequest, opts ...grpc.CallOption) (*MarketPriceReply, error) {
	out := new(MarketPriceReply)
	err := c.cc.Invoke(ctx, "/Trade/MarketPrice", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tradeClient) TradePropose(ctx context.Context, in *TradeProposeRequest, opts ...grpc.CallOption) (Trade_TradeProposeClient, error) {
	stream, err := c.cc.NewStream(ctx, &_Trade_serviceDesc.Streams[0], "/Trade/TradePropose", opts...)
	if err != nil {
		return nil, err
	}
	x := &tradeTradeProposeClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type Trade_TradeProposeClient interface {
	Recv() (*TradeProposeReply, error)
	grpc.ClientStream
}

type tradeTradeProposeClient struct {
	grpc.ClientStream
}

func (x *tradeTradeProposeClient) Recv() (*TradeProposeReply, error) {
	m := new(TradeProposeReply)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *tradeClient) TradeProposeUnary(ctx context.Context, in *TradeProposeRequest, opts ...grpc.CallOption) (*TradeProposeReply, error) {
	out := new(TradeProposeReply)
	err := c.cc.Invoke(ctx, "/Trade/TradeProposeUnary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tradeClient) TradeComplete(ctx context.Context, in *TradeCompleteRequest, opts ...grpc.CallOption) (Trade_TradeCompleteClient, error) {
	stream, err := c.cc.NewStream(ctx, &_Trade_serviceDesc.Streams[1], "/Trade/TradeComplete", opts...)
	if err != nil {
		return nil, err
	}
	x := &tradeTradeCompleteClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type Trade_TradeCompleteClient interface {
	Recv() (*TradeCompleteReply, error)
	grpc.ClientStream
}

type tradeTradeCompleteClient struct {
	grpc.ClientStream
}

func (x *tradeTradeCompleteClient) Recv() (*TradeCompleteReply, error) {
	m := new(TradeCompleteReply)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *tradeClient) TradeCompleteUnary(ctx context.Context, in *TradeCompleteRequest, opts ...grpc.CallOption) (*TradeCompleteReply, error) {
	out := new(TradeCompleteReply)
	err := c.cc.Invoke(ctx, "/Trade/TradeCompleteUnary", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// TradeServer is the server API for Trade service.
// All implementations must embed UnimplementedTradeServer
// for forward compatibility
type TradeServer interface {
	// Markets: List all the markets open for trading.
	Markets(context.Context, *MarketsRequest) (*MarketsReply, error)
	// Balances: Gets the balances of the two current reserves in the given
	// market.
	Balances(context.Context, *BalancesRequest) (*BalancesReply, error)
	// MarketPrice: Gets the current market price. In case of AMM startegy, the
	// trade type and
	// the amount of asset to be either sent or received.
	//
	// BUY = quote asset as input
	// SELL = base asset as input
	//
	// If the type of the trade is BUY it means the base asset will be received by
	// the trader.
	//
	// If the type of the trade is SELL it means the base asset will be sent by
	// the trader.
	MarketPrice(context.Context, *MarketPriceRequest) (*MarketPriceReply, error)
	// TradePropose: Sends a swap request message containing a partial signed
	// transaction.
	//
	// BUY = quote asset as input
	// SELL = base asset as input
	//
	//
	// If the type of the trade is BUY it means the base asset will be received by
	// the trader.
	//
	// If the type of the trade is SELL it means the base asset will be sent by
	// the trader.
	TradePropose(*TradeProposeRequest, Trade_TradeProposeServer) error
	// Unary RPC for TradePropose.
	TradeProposeUnary(context.Context, *TradeProposeRequest) (*TradeProposeReply, error)
	// TradeComplete: Sends the trader's counter-signed transaction to the
	// provider. If something wrong, a swap fail message is sent. It returns the
	// transaction hash of the broadcasted transaction.
	TradeComplete(*TradeCompleteRequest, Trade_TradeCompleteServer) error
	// Unary RPC for TradeComplete.
	TradeCompleteUnary(context.Context, *TradeCompleteRequest) (*TradeCompleteReply, error)
	mustEmbedUnimplementedTradeServer()
}

// UnimplementedTradeServer must be embedded to have forward compatible implementations.
type UnimplementedTradeServer struct {
}

func (*UnimplementedTradeServer) Markets(context.Context, *MarketsRequest) (*MarketsReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Markets not implemented")
}
func (*UnimplementedTradeServer) Balances(context.Context, *BalancesRequest) (*BalancesReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Balances not implemented")
}
func (*UnimplementedTradeServer) MarketPrice(context.Context, *MarketPriceRequest) (*MarketPriceReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method MarketPrice not implemented")
}
func (*UnimplementedTradeServer) TradePropose(*TradeProposeRequest, Trade_TradeProposeServer) error {
	return status.Errorf(codes.Unimplemented, "method TradePropose not implemented")
}
func (*UnimplementedTradeServer) TradeProposeUnary(context.Context, *TradeProposeRequest) (*TradeProposeReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TradeProposeUnary not implemented")
}
func (*UnimplementedTradeServer) TradeComplete(*TradeCompleteRequest, Trade_TradeCompleteServer) error {
	return status.Errorf(codes.Unimplemented, "method TradeComplete not implemented")
}
func (*UnimplementedTradeServer) TradeCompleteUnary(context.Context, *TradeCompleteRequest) (*TradeCompleteReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TradeCompleteUnary not implemented")
}
func (*UnimplementedTradeServer) mustEmbedUnimplementedTradeServer() {}

func RegisterTradeServer(s *grpc.Server, srv TradeServer) {
	s.RegisterService(&_Trade_serviceDesc, srv)
}

func _Trade_Markets_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(MarketsRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TradeServer).Markets(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Trade/Markets",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TradeServer).Markets(ctx, req.(*MarketsRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Trade_Balances_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(BalancesRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TradeServer).Balances(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Trade/Balances",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TradeServer).Balances(ctx, req.(*BalancesRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Trade_MarketPrice_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(MarketPriceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TradeServer).MarketPrice(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Trade/MarketPrice",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TradeServer).MarketPrice(ctx, req.(*MarketPriceRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Trade_TradePropose_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(TradeProposeRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(TradeServer).TradePropose(m, &tradeTradeProposeServer{stream})
}

type Trade_TradeProposeServer interface {
	Send(*TradeProposeReply) error
	grpc.ServerStream
}

type tradeTradeProposeServer struct {
	grpc.ServerStream
}

func (x *tradeTradeProposeServer) Send(m *TradeProposeReply) error {
	return x.ServerStream.SendMsg(m)
}

func _Trade_TradeProposeUnary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(TradeProposeRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TradeServer).TradeProposeUnary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Trade/TradeProposeUnary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TradeServer).TradeProposeUnary(ctx, req.(*TradeProposeRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Trade_TradeComplete_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(TradeCompleteRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(TradeServer).TradeComplete(m, &tradeTradeCompleteServer{stream})
}

type Trade_TradeCompleteServer interface {
	Send(*TradeCompleteReply) error
	grpc.ServerStream
}

type tradeTradeCompleteServer struct {
	grpc.ServerStream
}

func (x *tradeTradeCompleteServer) Send(m *TradeCompleteReply) error {
	return x.ServerStream.SendMsg(m)
}

func _Trade_TradeCompleteUnary_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(TradeCompleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TradeServer).TradeCompleteUnary(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Trade/TradeCompleteUnary",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TradeServer).TradeCompleteUnary(ctx, req.(*TradeCompleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Trade_serviceDesc = grpc.ServiceDesc{
	ServiceName: "Trade",
	HandlerType: (*TradeServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Markets",
			Handler:    _Trade_Markets_Handler,
		},
		{
			MethodName: "Balances",
			Handler:    _Trade_Balances_Handler,
		},
		{
			MethodName: "MarketPrice",
			Handler:    _Trade_MarketPrice_Handler,
		},
		{
			MethodName: "TradeProposeUnary",
			Handler:    _Trade_TradeProposeUnary_Handler,
		},
		{
			MethodName: "TradeCompleteUnary",
			Handler:    _Trade_TradeCompleteUnary_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "TradePropose",
			Handler:       _Trade_TradePropose_Handler,
			ServerStreams: true,
		},
		{
			StreamName:    "TradeComplete",
			Handler:       _Trade_TradeComplete_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "trade.proto",
}
