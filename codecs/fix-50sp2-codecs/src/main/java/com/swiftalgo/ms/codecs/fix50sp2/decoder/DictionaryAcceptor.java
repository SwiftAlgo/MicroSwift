/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;


public interface DictionaryAcceptor
{
    void onHeartbeat(final HeartbeatDecoder decoder);

    void onTestRequest(final TestRequestDecoder decoder);

    void onResendRequest(final ResendRequestDecoder decoder);

    void onReject(final RejectDecoder decoder);

    void onSequenceReset(final SequenceResetDecoder decoder);

    void onLogout(final LogoutDecoder decoder);

    void onLogon(final LogonDecoder decoder);

    void onIOI(final IOIDecoder decoder);

    void onAdvertisement(final AdvertisementDecoder decoder);

    void onExecutionReport(final ExecutionReportDecoder decoder);

    void onOrderCancelReject(final OrderCancelRejectDecoder decoder);

    void onDerivativeSecurityList(final DerivativeSecurityListDecoder decoder);

    void onNewOrderMultileg(final NewOrderMultilegDecoder decoder);

    void onMultilegOrderCancelReplace(final MultilegOrderCancelReplaceDecoder decoder);

    void onTradeCaptureReportRequest(final TradeCaptureReportRequestDecoder decoder);

    void onTradeCaptureReport(final TradeCaptureReportDecoder decoder);

    void onOrderMassStatusRequest(final OrderMassStatusRequestDecoder decoder);

    void onQuoteRequestReject(final QuoteRequestRejectDecoder decoder);

    void onRFQRequest(final RFQRequestDecoder decoder);

    void onQuoteStatusReport(final QuoteStatusReportDecoder decoder);

    void onQuoteResponse(final QuoteResponseDecoder decoder);

    void onConfirmation(final ConfirmationDecoder decoder);

    void onPositionMaintenanceRequest(final PositionMaintenanceRequestDecoder decoder);

    void onPositionMaintenanceReport(final PositionMaintenanceReportDecoder decoder);

    void onRequestForPositions(final RequestForPositionsDecoder decoder);

    void onRequestForPositionsAck(final RequestForPositionsAckDecoder decoder);

    void onPositionReport(final PositionReportDecoder decoder);

    void onTradeCaptureReportRequestAck(final TradeCaptureReportRequestAckDecoder decoder);

    void onTradeCaptureReportAck(final TradeCaptureReportAckDecoder decoder);

    void onAllocationReport(final AllocationReportDecoder decoder);

    void onAllocationReportAck(final AllocationReportAckDecoder decoder);

    void onConfirmationAck(final ConfirmationAckDecoder decoder);

    void onSettlementInstructionRequest(final SettlementInstructionRequestDecoder decoder);

    void onAssignmentReport(final AssignmentReportDecoder decoder);

    void onCollateralRequest(final CollateralRequestDecoder decoder);

    void onCollateralAssignment(final CollateralAssignmentDecoder decoder);

    void onCollateralResponse(final CollateralResponseDecoder decoder);

    void onNews(final NewsDecoder decoder);

    void onCollateralReport(final CollateralReportDecoder decoder);

    void onCollateralInquiry(final CollateralInquiryDecoder decoder);

    void onNetworkCounterpartySystemStatusRequest(final NetworkCounterpartySystemStatusRequestDecoder decoder);

    void onNetworkCounterpartySystemStatusResponse(final NetworkCounterpartySystemStatusResponseDecoder decoder);

    void onUserRequest(final UserRequestDecoder decoder);

    void onUserResponse(final UserResponseDecoder decoder);

    void onCollateralInquiryAck(final CollateralInquiryAckDecoder decoder);

    void onConfirmationRequest(final ConfirmationRequestDecoder decoder);

    void onTradingSessionListRequest(final TradingSessionListRequestDecoder decoder);

    void onTradingSessionList(final TradingSessionListDecoder decoder);

    void onSecurityListUpdateReport(final SecurityListUpdateReportDecoder decoder);

    void onAdjustedPositionReport(final AdjustedPositionReportDecoder decoder);

    void onAllocationInstructionAlert(final AllocationInstructionAlertDecoder decoder);

    void onExecutionAcknowledgement(final ExecutionAcknowledgementDecoder decoder);

    void onContraryIntentionReport(final ContraryIntentionReportDecoder decoder);

    void onSecurityDefinitionUpdateReport(final SecurityDefinitionUpdateReportDecoder decoder);

    void onSettlementObligationReport(final SettlementObligationReportDecoder decoder);

    void onDerivativeSecurityListUpdateReport(final DerivativeSecurityListUpdateReportDecoder decoder);

    void onTradingSessionListUpdateReport(final TradingSessionListUpdateReportDecoder decoder);

    void onMarketDefinitionRequest(final MarketDefinitionRequestDecoder decoder);

    void onMarketDefinition(final MarketDefinitionDecoder decoder);

    void onMarketDefinitionUpdateReport(final MarketDefinitionUpdateReportDecoder decoder);

    void onApplicationMessageRequest(final ApplicationMessageRequestDecoder decoder);

    void onApplicationMessageRequestAck(final ApplicationMessageRequestAckDecoder decoder);

    void onApplicationMessageReport(final ApplicationMessageReportDecoder decoder);

    void onOrderMassActionReport(final OrderMassActionReportDecoder decoder);

    void onEmail(final EmailDecoder decoder);

    void onOrderMassActionRequest(final OrderMassActionRequestDecoder decoder);

    void onUserNotification(final UserNotificationDecoder decoder);

    void onStreamAssignmentRequest(final StreamAssignmentRequestDecoder decoder);

    void onStreamAssignmentReport(final StreamAssignmentReportDecoder decoder);

    void onStreamAssignmentReportACK(final StreamAssignmentReportACKDecoder decoder);

    void onNewOrderSingle(final NewOrderSingleDecoder decoder);

    void onNewOrderList(final NewOrderListDecoder decoder);

    void onOrderCancelRequest(final OrderCancelRequestDecoder decoder);

    void onOrderCancelReplaceRequest(final OrderCancelReplaceRequestDecoder decoder);

    void onOrderStatusRequest(final OrderStatusRequestDecoder decoder);

    void onAllocationInstruction(final AllocationInstructionDecoder decoder);

    void onListCancelRequest(final ListCancelRequestDecoder decoder);

    void onListExecute(final ListExecuteDecoder decoder);

    void onListStatusRequest(final ListStatusRequestDecoder decoder);

    void onListStatus(final ListStatusDecoder decoder);

    void onAllocationInstructionAck(final AllocationInstructionAckDecoder decoder);

    void onDontKnowTrade(final DontKnowTradeDecoder decoder);

    void onQuoteRequest(final QuoteRequestDecoder decoder);

    void onQuote(final QuoteDecoder decoder);

    void onSettlementInstructions(final SettlementInstructionsDecoder decoder);

    void onMarketDataRequest(final MarketDataRequestDecoder decoder);

    void onMarketDataSnapshotFullRefresh(final MarketDataSnapshotFullRefreshDecoder decoder);

    void onMarketDataIncrementalRefresh(final MarketDataIncrementalRefreshDecoder decoder);

    void onMarketDataRequestReject(final MarketDataRequestRejectDecoder decoder);

    void onQuoteCancel(final QuoteCancelDecoder decoder);

    void onQuoteStatusRequest(final QuoteStatusRequestDecoder decoder);

    void onMassQuoteAcknowledgement(final MassQuoteAcknowledgementDecoder decoder);

    void onSecurityDefinitionRequest(final SecurityDefinitionRequestDecoder decoder);

    void onSecurityDefinition(final SecurityDefinitionDecoder decoder);

    void onSecurityStatusRequest(final SecurityStatusRequestDecoder decoder);

    void onSecurityStatus(final SecurityStatusDecoder decoder);

    void onTradingSessionStatusRequest(final TradingSessionStatusRequestDecoder decoder);

    void onTradingSessionStatus(final TradingSessionStatusDecoder decoder);

    void onMassQuote(final MassQuoteDecoder decoder);

    void onBusinessMessageReject(final BusinessMessageRejectDecoder decoder);

    void onBidRequest(final BidRequestDecoder decoder);

    void onBidResponse(final BidResponseDecoder decoder);

    void onListStrikePrice(final ListStrikePriceDecoder decoder);

    void onRegistrationInstructions(final RegistrationInstructionsDecoder decoder);

    void onRegistrationInstructionsResponse(final RegistrationInstructionsResponseDecoder decoder);

    void onOrderMassCancelRequest(final OrderMassCancelRequestDecoder decoder);

    void onOrderMassCancelReport(final OrderMassCancelReportDecoder decoder);

    void onNewOrderCross(final NewOrderCrossDecoder decoder);

    void onCrossOrderCancelReplaceRequest(final CrossOrderCancelReplaceRequestDecoder decoder);

    void onCrossOrderCancelRequest(final CrossOrderCancelRequestDecoder decoder);

    void onSecurityTypeRequest(final SecurityTypeRequestDecoder decoder);

    void onSecurityTypes(final SecurityTypesDecoder decoder);

    void onSecurityListRequest(final SecurityListRequestDecoder decoder);

    void onSecurityList(final SecurityListDecoder decoder);

    void onDerivativeSecurityListRequest(final DerivativeSecurityListRequestDecoder decoder);


}
