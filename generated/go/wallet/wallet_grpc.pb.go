// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package wallet

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// WalletClient is the client API for Wallet service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type WalletClient interface {
	//
	//GenSeed is the first method that should be used to instantiate a new tdexd
	//instance. This method allows a caller to generate a new HD Wallet.
	//Once the seed is obtained and verified by the user, the InitWallet
	//method should be used to commit the newly generated seed, and create the
	//wallet.
	GenSeed(ctx context.Context, in *GenSeedRequest, opts ...grpc.CallOption) (*GenSeedReply, error)
	//
	//InitWallet is used when tdexd is starting up for the first time to fully
	//initialize the daemon and its internal wallet. At the very least a mnemonic
	//and a wallet password must be provided. This will be used to encrypt sensitive
	//material on disk. Alternatively, this can be used along with the GenSeed RPC
	//to obtain a seed, then present it to the user. Once it has been verified by
	//the user, the seed can be fed into this RPC in order to commit the new wallet.
	InitWallet(ctx context.Context, in *InitWalletRequest, opts ...grpc.CallOption) (*InitWalletReply, error)
	//
	//UnlockWallet is used at startup of tdexd to provide a password to unlock
	//the wallet database.
	UnlockWallet(ctx context.Context, in *UnlockWalletRequest, opts ...grpc.CallOption) (*UnlockWalletReply, error)
	//
	//ChangePassword changes the password of the encrypted wallet. This will
	//automatically unlock the wallet database if successful.
	ChangePassword(ctx context.Context, in *ChangePasswordRequest, opts ...grpc.CallOption) (*ChangePasswordReply, error)
	//
	//WalletAddress returns a Liquid confidential p2wpkh address (BLECH32)
	WalletAddress(ctx context.Context, in *WalletAddressRequest, opts ...grpc.CallOption) (*WalletAddressReply, error)
	//
	//WalletBalance returns total unspent outputs(confirmed and unconfirmed), all
	//confirmed unspent outputs and all unconfirmed unspent outputs under control
	//of the wallet.
	WalletBalance(ctx context.Context, in *WalletBalanceRequest, opts ...grpc.CallOption) (*WalletBalanceReply, error)
	//SendToMany sends funds to many outputs
	SendToMany(ctx context.Context, in *SendToManyRequest, opts ...grpc.CallOption) (*SendToManyReply, error)
}

type walletClient struct {
	cc grpc.ClientConnInterface
}

func NewWalletClient(cc grpc.ClientConnInterface) WalletClient {
	return &walletClient{cc}
}

var walletGenSeedStreamDesc = &grpc.StreamDesc{
	StreamName: "GenSeed",
}

func (c *walletClient) GenSeed(ctx context.Context, in *GenSeedRequest, opts ...grpc.CallOption) (*GenSeedReply, error) {
	out := new(GenSeedReply)
	err := c.cc.Invoke(ctx, "/Wallet/GenSeed", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletInitWalletStreamDesc = &grpc.StreamDesc{
	StreamName: "InitWallet",
}

func (c *walletClient) InitWallet(ctx context.Context, in *InitWalletRequest, opts ...grpc.CallOption) (*InitWalletReply, error) {
	out := new(InitWalletReply)
	err := c.cc.Invoke(ctx, "/Wallet/InitWallet", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletUnlockWalletStreamDesc = &grpc.StreamDesc{
	StreamName: "UnlockWallet",
}

func (c *walletClient) UnlockWallet(ctx context.Context, in *UnlockWalletRequest, opts ...grpc.CallOption) (*UnlockWalletReply, error) {
	out := new(UnlockWalletReply)
	err := c.cc.Invoke(ctx, "/Wallet/UnlockWallet", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletChangePasswordStreamDesc = &grpc.StreamDesc{
	StreamName: "ChangePassword",
}

func (c *walletClient) ChangePassword(ctx context.Context, in *ChangePasswordRequest, opts ...grpc.CallOption) (*ChangePasswordReply, error) {
	out := new(ChangePasswordReply)
	err := c.cc.Invoke(ctx, "/Wallet/ChangePassword", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletWalletAddressStreamDesc = &grpc.StreamDesc{
	StreamName: "WalletAddress",
}

func (c *walletClient) WalletAddress(ctx context.Context, in *WalletAddressRequest, opts ...grpc.CallOption) (*WalletAddressReply, error) {
	out := new(WalletAddressReply)
	err := c.cc.Invoke(ctx, "/Wallet/WalletAddress", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletWalletBalanceStreamDesc = &grpc.StreamDesc{
	StreamName: "WalletBalance",
}

func (c *walletClient) WalletBalance(ctx context.Context, in *WalletBalanceRequest, opts ...grpc.CallOption) (*WalletBalanceReply, error) {
	out := new(WalletBalanceReply)
	err := c.cc.Invoke(ctx, "/Wallet/WalletBalance", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

var walletSendToManyStreamDesc = &grpc.StreamDesc{
	StreamName: "SendToMany",
}

func (c *walletClient) SendToMany(ctx context.Context, in *SendToManyRequest, opts ...grpc.CallOption) (*SendToManyReply, error) {
	out := new(SendToManyReply)
	err := c.cc.Invoke(ctx, "/Wallet/SendToMany", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// WalletService is the service API for Wallet service.
// Fields should be assigned to their respective handler implementations only before
// RegisterWalletService is called.  Any unassigned fields will result in the
// handler for that method returning an Unimplemented error.
type WalletService struct {
	//
	//GenSeed is the first method that should be used to instantiate a new tdexd
	//instance. This method allows a caller to generate a new HD Wallet.
	//Once the seed is obtained and verified by the user, the InitWallet
	//method should be used to commit the newly generated seed, and create the
	//wallet.
	GenSeed func(context.Context, *GenSeedRequest) (*GenSeedReply, error)
	//
	//InitWallet is used when tdexd is starting up for the first time to fully
	//initialize the daemon and its internal wallet. At the very least a mnemonic
	//and a wallet password must be provided. This will be used to encrypt sensitive
	//material on disk. Alternatively, this can be used along with the GenSeed RPC
	//to obtain a seed, then present it to the user. Once it has been verified by
	//the user, the seed can be fed into this RPC in order to commit the new wallet.
	InitWallet func(context.Context, *InitWalletRequest) (*InitWalletReply, error)
	//
	//UnlockWallet is used at startup of tdexd to provide a password to unlock
	//the wallet database.
	UnlockWallet func(context.Context, *UnlockWalletRequest) (*UnlockWalletReply, error)
	//
	//ChangePassword changes the password of the encrypted wallet. This will
	//automatically unlock the wallet database if successful.
	ChangePassword func(context.Context, *ChangePasswordRequest) (*ChangePasswordReply, error)
	//
	//WalletAddress returns a Liquid confidential p2wpkh address (BLECH32)
	WalletAddress func(context.Context, *WalletAddressRequest) (*WalletAddressReply, error)
	//
	//WalletBalance returns total unspent outputs(confirmed and unconfirmed), all
	//confirmed unspent outputs and all unconfirmed unspent outputs under control
	//of the wallet.
	WalletBalance func(context.Context, *WalletBalanceRequest) (*WalletBalanceReply, error)
	//SendToMany sends funds to many outputs
	SendToMany func(context.Context, *SendToManyRequest) (*SendToManyReply, error)
}

func (s *WalletService) genSeed(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(GenSeedRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.GenSeed(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/GenSeed",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.GenSeed(ctx, req.(*GenSeedRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) initWallet(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(InitWalletRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.InitWallet(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/InitWallet",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.InitWallet(ctx, req.(*InitWalletRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) unlockWallet(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UnlockWalletRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.UnlockWallet(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/UnlockWallet",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.UnlockWallet(ctx, req.(*UnlockWalletRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) changePassword(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ChangePasswordRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.ChangePassword(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/ChangePassword",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.ChangePassword(ctx, req.(*ChangePasswordRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) walletAddress(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(WalletAddressRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.WalletAddress(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/WalletAddress",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.WalletAddress(ctx, req.(*WalletAddressRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) walletBalance(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(WalletBalanceRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.WalletBalance(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/WalletBalance",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.WalletBalance(ctx, req.(*WalletBalanceRequest))
	}
	return interceptor(ctx, in, info, handler)
}
func (s *WalletService) sendToMany(_ interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(SendToManyRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return s.SendToMany(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     s,
		FullMethod: "/Wallet/SendToMany",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return s.SendToMany(ctx, req.(*SendToManyRequest))
	}
	return interceptor(ctx, in, info, handler)
}

// RegisterWalletService registers a service implementation with a gRPC server.
func RegisterWalletService(s grpc.ServiceRegistrar, srv *WalletService) {
	srvCopy := *srv
	if srvCopy.GenSeed == nil {
		srvCopy.GenSeed = func(context.Context, *GenSeedRequest) (*GenSeedReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method GenSeed not implemented")
		}
	}
	if srvCopy.InitWallet == nil {
		srvCopy.InitWallet = func(context.Context, *InitWalletRequest) (*InitWalletReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method InitWallet not implemented")
		}
	}
	if srvCopy.UnlockWallet == nil {
		srvCopy.UnlockWallet = func(context.Context, *UnlockWalletRequest) (*UnlockWalletReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method UnlockWallet not implemented")
		}
	}
	if srvCopy.ChangePassword == nil {
		srvCopy.ChangePassword = func(context.Context, *ChangePasswordRequest) (*ChangePasswordReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method ChangePassword not implemented")
		}
	}
	if srvCopy.WalletAddress == nil {
		srvCopy.WalletAddress = func(context.Context, *WalletAddressRequest) (*WalletAddressReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method WalletAddress not implemented")
		}
	}
	if srvCopy.WalletBalance == nil {
		srvCopy.WalletBalance = func(context.Context, *WalletBalanceRequest) (*WalletBalanceReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method WalletBalance not implemented")
		}
	}
	if srvCopy.SendToMany == nil {
		srvCopy.SendToMany = func(context.Context, *SendToManyRequest) (*SendToManyReply, error) {
			return nil, status.Errorf(codes.Unimplemented, "method SendToMany not implemented")
		}
	}
	sd := grpc.ServiceDesc{
		ServiceName: "Wallet",
		Methods: []grpc.MethodDesc{
			{
				MethodName: "GenSeed",
				Handler:    srvCopy.genSeed,
			},
			{
				MethodName: "InitWallet",
				Handler:    srvCopy.initWallet,
			},
			{
				MethodName: "UnlockWallet",
				Handler:    srvCopy.unlockWallet,
			},
			{
				MethodName: "ChangePassword",
				Handler:    srvCopy.changePassword,
			},
			{
				MethodName: "WalletAddress",
				Handler:    srvCopy.walletAddress,
			},
			{
				MethodName: "WalletBalance",
				Handler:    srvCopy.walletBalance,
			},
			{
				MethodName: "SendToMany",
				Handler:    srvCopy.sendToMany,
			},
		},
		Streams:  []grpc.StreamDesc{},
		Metadata: "wallet.proto",
	}

	s.RegisterService(&sd, nil)
}

// NewWalletService creates a new WalletService containing the
// implemented methods of the Wallet service in s.  Any unimplemented
// methods will result in the gRPC server returning an UNIMPLEMENTED status to the client.
// This includes situations where the method handler is misspelled or has the wrong
// signature.  For this reason, this function should be used with great care and
// is not recommended to be used by most users.
func NewWalletService(s interface{}) *WalletService {
	ns := &WalletService{}
	if h, ok := s.(interface {
		GenSeed(context.Context, *GenSeedRequest) (*GenSeedReply, error)
	}); ok {
		ns.GenSeed = h.GenSeed
	}
	if h, ok := s.(interface {
		InitWallet(context.Context, *InitWalletRequest) (*InitWalletReply, error)
	}); ok {
		ns.InitWallet = h.InitWallet
	}
	if h, ok := s.(interface {
		UnlockWallet(context.Context, *UnlockWalletRequest) (*UnlockWalletReply, error)
	}); ok {
		ns.UnlockWallet = h.UnlockWallet
	}
	if h, ok := s.(interface {
		ChangePassword(context.Context, *ChangePasswordRequest) (*ChangePasswordReply, error)
	}); ok {
		ns.ChangePassword = h.ChangePassword
	}
	if h, ok := s.(interface {
		WalletAddress(context.Context, *WalletAddressRequest) (*WalletAddressReply, error)
	}); ok {
		ns.WalletAddress = h.WalletAddress
	}
	if h, ok := s.(interface {
		WalletBalance(context.Context, *WalletBalanceRequest) (*WalletBalanceReply, error)
	}); ok {
		ns.WalletBalance = h.WalletBalance
	}
	if h, ok := s.(interface {
		SendToMany(context.Context, *SendToManyRequest) (*SendToManyReply, error)
	}); ok {
		ns.SendToMany = h.SendToMany
	}
	return ns
}

// UnstableWalletService is the service API for Wallet service.
// New methods may be added to this interface if they are added to the service
// definition, which is not a backward-compatible change.  For this reason,
// use of this type is not recommended.
type UnstableWalletService interface {
	//
	//GenSeed is the first method that should be used to instantiate a new tdexd
	//instance. This method allows a caller to generate a new HD Wallet.
	//Once the seed is obtained and verified by the user, the InitWallet
	//method should be used to commit the newly generated seed, and create the
	//wallet.
	GenSeed(context.Context, *GenSeedRequest) (*GenSeedReply, error)
	//
	//InitWallet is used when tdexd is starting up for the first time to fully
	//initialize the daemon and its internal wallet. At the very least a mnemonic
	//and a wallet password must be provided. This will be used to encrypt sensitive
	//material on disk. Alternatively, this can be used along with the GenSeed RPC
	//to obtain a seed, then present it to the user. Once it has been verified by
	//the user, the seed can be fed into this RPC in order to commit the new wallet.
	InitWallet(context.Context, *InitWalletRequest) (*InitWalletReply, error)
	//
	//UnlockWallet is used at startup of tdexd to provide a password to unlock
	//the wallet database.
	UnlockWallet(context.Context, *UnlockWalletRequest) (*UnlockWalletReply, error)
	//
	//ChangePassword changes the password of the encrypted wallet. This will
	//automatically unlock the wallet database if successful.
	ChangePassword(context.Context, *ChangePasswordRequest) (*ChangePasswordReply, error)
	//
	//WalletAddress returns a Liquid confidential p2wpkh address (BLECH32)
	WalletAddress(context.Context, *WalletAddressRequest) (*WalletAddressReply, error)
	//
	//WalletBalance returns total unspent outputs(confirmed and unconfirmed), all
	//confirmed unspent outputs and all unconfirmed unspent outputs under control
	//of the wallet.
	WalletBalance(context.Context, *WalletBalanceRequest) (*WalletBalanceReply, error)
	//SendToMany sends funds to many outputs
	SendToMany(context.Context, *SendToManyRequest) (*SendToManyReply, error)
}
