/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;


public interface DictionaryAcceptor
{
    void onHeartbeat(final HeartbeatDecoder decoder);

    void onLogon(final LogonDecoder decoder);

    void onTestRequest(final TestRequestDecoder decoder);

    void onResendRequest(final ResendRequestDecoder decoder);

    void onReject(final RejectDecoder decoder);

    void onSequenceReset(final SequenceResetDecoder decoder);

    void onLogout(final LogoutDecoder decoder);

    void onBusinessMessageReject(final BusinessMessageRejectDecoder decoder);

    void onUserRequest(final UserRequestDecoder decoder);

    void onUserResponse(final UserResponseDecoder decoder);

    void onAdvertisement(final AdvertisementDecoder decoder);

    void onIndicationOfInterest(final IndicationOfInterestDecoder decoder);

    void onNews(final NewsDecoder decoder);

    void onEmail(final EmailDecoder decoder);

    void onQuoteRequest(final QuoteRequestDecoder decoder);

    void onQuoteResponse(final QuoteResponseDecoder decoder);

    void onQuoteRequestReject(final QuoteRequestRejectDecoder decoder);

    void onRFQRequest(final RFQRequestDecoder decoder);

    void onQuote(final QuoteDecoder decoder);

    void onQuoteCancel(final QuoteCancelDecoder decoder);

    void onQuoteStatusRequest(final QuoteStatusRequestDecoder decoder);

    void onQuoteStatusReport(final QuoteStatusReportDecoder decoder);

    void onMassQuote(final MassQuoteDecoder decoder);

    void onMassQuoteAcknowledgement(final MassQuoteAcknowledgementDecoder decoder);

    void onMarketDataRequest(final MarketDataRequestDecoder decoder);

    void onMarketDataSnapshotFullRefresh(final MarketDataSnapshotFullRefreshDecoder decoder);

    void onMarketDataIncrementalRefresh(final MarketDataIncrementalRefreshDecoder decoder);

    void onMarketDataRequestReject(final MarketDataRequestRejectDecoder decoder);

    void onSecurityDefinitionRequest(final SecurityDefinitionRequestDecoder decoder);

    void onSecurityDefinition(final SecurityDefinitionDecoder decoder);

    void onSecurityTypeRequest(final SecurityTypeRequestDecoder decoder);

    void onSecurityTypes(final SecurityTypesDecoder decoder);

    void onSecurityListRequest(final SecurityListRequestDecoder decoder);

    void onSecurityList(final SecurityListDecoder decoder);

    void onDerivativeSecurityListRequest(final DerivativeSecurityListRequestDecoder decoder);

    void onDerivativeSecurityList(final DerivativeSecurityListDecoder decoder);

    void onSecurityStatusRequest(final SecurityStatusRequestDecoder decoder);

    void onSecurityStatus(final SecurityStatusDecoder decoder);

    void onTradingSessionStatusRequest(final TradingSessionStatusRequestDecoder decoder);

    void onTradingSessionStatus(final TradingSessionStatusDecoder decoder);

    void onNewOrderSingle(final NewOrderSingleDecoder decoder);

    void onExecutionReport(final ExecutionReportDecoder decoder);

    void onDontKnowTrade(final DontKnowTradeDecoder decoder);

    void onOrderCancelReplaceRequest(final OrderCancelReplaceRequestDecoder decoder);

    void onOrderCancelRequest(final OrderCancelRequestDecoder decoder);

    void onOrderCancelReject(final OrderCancelRejectDecoder decoder);

    void onOrderStatusRequest(final OrderStatusRequestDecoder decoder);

    void onOrderMassCancelRequest(final OrderMassCancelRequestDecoder decoder);

    void onOrderMassCancelReport(final OrderMassCancelReportDecoder decoder);

    void onOrderMassStatusRequest(final OrderMassStatusRequestDecoder decoder);

    void onNewOrderCross(final NewOrderCrossDecoder decoder);

    void onCrossOrderCancelReplaceRequest(final CrossOrderCancelReplaceRequestDecoder decoder);

    void onCrossOrderCancelRequest(final CrossOrderCancelRequestDecoder decoder);

    void onNewOrderMultileg(final NewOrderMultilegDecoder decoder);

    void onMultilegOrderCancelReplaceRequest(final MultilegOrderCancelReplaceRequestDecoder decoder);

    void onBidRequest(final BidRequestDecoder decoder);

    void onBidResponse(final BidResponseDecoder decoder);

    void onNewOrderList(final NewOrderListDecoder decoder);

    void onListStrikePrice(final ListStrikePriceDecoder decoder);

    void onListStatus(final ListStatusDecoder decoder);

    void onListExecute(final ListExecuteDecoder decoder);

    void onListCancelRequest(final ListCancelRequestDecoder decoder);

    void onListStatusRequest(final ListStatusRequestDecoder decoder);

    void onAllocationInstruction(final AllocationInstructionDecoder decoder);

    void onAllocationInstructionAck(final AllocationInstructionAckDecoder decoder);

    void onAllocationReport(final AllocationReportDecoder decoder);

    void onAllocationReportAck(final AllocationReportAckDecoder decoder);

    void onConfirmation(final ConfirmationDecoder decoder);

    void onConfirmationAck(final ConfirmationAckDecoder decoder);

    void onConfirmationRequest(final ConfirmationRequestDecoder decoder);

    void onSettlementInstructions(final SettlementInstructionsDecoder decoder);

    void onSettlementInstructionRequest(final SettlementInstructionRequestDecoder decoder);

    void onTradeCaptureReportRequest(final TradeCaptureReportRequestDecoder decoder);

    void onTradeCaptureReportRequestAck(final TradeCaptureReportRequestAckDecoder decoder);

    void onTradeCaptureReport(final TradeCaptureReportDecoder decoder);

    void onTradeCaptureReportAck(final TradeCaptureReportAckDecoder decoder);

    void onRegistrationInstructions(final RegistrationInstructionsDecoder decoder);

    void onRegistrationInstructionsResponse(final RegistrationInstructionsResponseDecoder decoder);

    void onPositionMaintenanceRequest(final PositionMaintenanceRequestDecoder decoder);

    void onPositionMaintenanceReport(final PositionMaintenanceReportDecoder decoder);

    void onRequestForPositions(final RequestForPositionsDecoder decoder);

    void onRequestForPositionsAck(final RequestForPositionsAckDecoder decoder);

    void onPositionReport(final PositionReportDecoder decoder);

    void onAssignmentReport(final AssignmentReportDecoder decoder);

    void onCollateralRequest(final CollateralRequestDecoder decoder);

    void onCollateralAssignment(final CollateralAssignmentDecoder decoder);

    void onCollateralResponse(final CollateralResponseDecoder decoder);

    void onCollateralReport(final CollateralReportDecoder decoder);

    void onCollateralInquiry(final CollateralInquiryDecoder decoder);

    void onNetworkStatusRequest(final NetworkStatusRequestDecoder decoder);

    void onNetworkStatusResponse(final NetworkStatusResponseDecoder decoder);

    void onCollateralInquiryAck(final CollateralInquiryAckDecoder decoder);


}
