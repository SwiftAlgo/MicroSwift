/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;


public class DefaultDictionaryAcceptor implements DictionaryAcceptor
{
    @Override
    public void onHeartbeat(final HeartbeatDecoder decoder) {};

    @Override
    public void onLogon(final LogonDecoder decoder) {};

    @Override
    public void onTestRequest(final TestRequestDecoder decoder) {};

    @Override
    public void onResendRequest(final ResendRequestDecoder decoder) {};

    @Override
    public void onReject(final RejectDecoder decoder) {};

    @Override
    public void onSequenceReset(final SequenceResetDecoder decoder) {};

    @Override
    public void onLogout(final LogoutDecoder decoder) {};

    @Override
    public void onBusinessMessageReject(final BusinessMessageRejectDecoder decoder) {};

    @Override
    public void onUserRequest(final UserRequestDecoder decoder) {};

    @Override
    public void onUserResponse(final UserResponseDecoder decoder) {};

    @Override
    public void onAdvertisement(final AdvertisementDecoder decoder) {};

    @Override
    public void onIndicationOfInterest(final IndicationOfInterestDecoder decoder) {};

    @Override
    public void onNews(final NewsDecoder decoder) {};

    @Override
    public void onEmail(final EmailDecoder decoder) {};

    @Override
    public void onQuoteRequest(final QuoteRequestDecoder decoder) {};

    @Override
    public void onQuoteResponse(final QuoteResponseDecoder decoder) {};

    @Override
    public void onQuoteRequestReject(final QuoteRequestRejectDecoder decoder) {};

    @Override
    public void onRFQRequest(final RFQRequestDecoder decoder) {};

    @Override
    public void onQuote(final QuoteDecoder decoder) {};

    @Override
    public void onQuoteCancel(final QuoteCancelDecoder decoder) {};

    @Override
    public void onQuoteStatusRequest(final QuoteStatusRequestDecoder decoder) {};

    @Override
    public void onQuoteStatusReport(final QuoteStatusReportDecoder decoder) {};

    @Override
    public void onMassQuote(final MassQuoteDecoder decoder) {};

    @Override
    public void onMassQuoteAcknowledgement(final MassQuoteAcknowledgementDecoder decoder) {};

    @Override
    public void onMarketDataRequest(final MarketDataRequestDecoder decoder) {};

    @Override
    public void onMarketDataSnapshotFullRefresh(final MarketDataSnapshotFullRefreshDecoder decoder) {};

    @Override
    public void onMarketDataIncrementalRefresh(final MarketDataIncrementalRefreshDecoder decoder) {};

    @Override
    public void onMarketDataRequestReject(final MarketDataRequestRejectDecoder decoder) {};

    @Override
    public void onSecurityDefinitionRequest(final SecurityDefinitionRequestDecoder decoder) {};

    @Override
    public void onSecurityDefinition(final SecurityDefinitionDecoder decoder) {};

    @Override
    public void onSecurityTypeRequest(final SecurityTypeRequestDecoder decoder) {};

    @Override
    public void onSecurityTypes(final SecurityTypesDecoder decoder) {};

    @Override
    public void onSecurityListRequest(final SecurityListRequestDecoder decoder) {};

    @Override
    public void onSecurityList(final SecurityListDecoder decoder) {};

    @Override
    public void onDerivativeSecurityListRequest(final DerivativeSecurityListRequestDecoder decoder) {};

    @Override
    public void onDerivativeSecurityList(final DerivativeSecurityListDecoder decoder) {};

    @Override
    public void onSecurityStatusRequest(final SecurityStatusRequestDecoder decoder) {};

    @Override
    public void onSecurityStatus(final SecurityStatusDecoder decoder) {};

    @Override
    public void onTradingSessionStatusRequest(final TradingSessionStatusRequestDecoder decoder) {};

    @Override
    public void onTradingSessionStatus(final TradingSessionStatusDecoder decoder) {};

    @Override
    public void onNewOrderSingle(final NewOrderSingleDecoder decoder) {};

    @Override
    public void onExecutionReport(final ExecutionReportDecoder decoder) {};

    @Override
    public void onDontKnowTrade(final DontKnowTradeDecoder decoder) {};

    @Override
    public void onOrderCancelReplaceRequest(final OrderCancelReplaceRequestDecoder decoder) {};

    @Override
    public void onOrderCancelRequest(final OrderCancelRequestDecoder decoder) {};

    @Override
    public void onOrderCancelReject(final OrderCancelRejectDecoder decoder) {};

    @Override
    public void onOrderStatusRequest(final OrderStatusRequestDecoder decoder) {};

    @Override
    public void onOrderMassCancelRequest(final OrderMassCancelRequestDecoder decoder) {};

    @Override
    public void onOrderMassCancelReport(final OrderMassCancelReportDecoder decoder) {};

    @Override
    public void onOrderMassStatusRequest(final OrderMassStatusRequestDecoder decoder) {};

    @Override
    public void onNewOrderCross(final NewOrderCrossDecoder decoder) {};

    @Override
    public void onCrossOrderCancelReplaceRequest(final CrossOrderCancelReplaceRequestDecoder decoder) {};

    @Override
    public void onCrossOrderCancelRequest(final CrossOrderCancelRequestDecoder decoder) {};

    @Override
    public void onNewOrderMultileg(final NewOrderMultilegDecoder decoder) {};

    @Override
    public void onMultilegOrderCancelReplaceRequest(final MultilegOrderCancelReplaceRequestDecoder decoder) {};

    @Override
    public void onBidRequest(final BidRequestDecoder decoder) {};

    @Override
    public void onBidResponse(final BidResponseDecoder decoder) {};

    @Override
    public void onNewOrderList(final NewOrderListDecoder decoder) {};

    @Override
    public void onListStrikePrice(final ListStrikePriceDecoder decoder) {};

    @Override
    public void onListStatus(final ListStatusDecoder decoder) {};

    @Override
    public void onListExecute(final ListExecuteDecoder decoder) {};

    @Override
    public void onListCancelRequest(final ListCancelRequestDecoder decoder) {};

    @Override
    public void onListStatusRequest(final ListStatusRequestDecoder decoder) {};

    @Override
    public void onAllocationInstruction(final AllocationInstructionDecoder decoder) {};

    @Override
    public void onAllocationInstructionAck(final AllocationInstructionAckDecoder decoder) {};

    @Override
    public void onAllocationReport(final AllocationReportDecoder decoder) {};

    @Override
    public void onAllocationReportAck(final AllocationReportAckDecoder decoder) {};

    @Override
    public void onConfirmation(final ConfirmationDecoder decoder) {};

    @Override
    public void onConfirmationAck(final ConfirmationAckDecoder decoder) {};

    @Override
    public void onConfirmationRequest(final ConfirmationRequestDecoder decoder) {};

    @Override
    public void onSettlementInstructions(final SettlementInstructionsDecoder decoder) {};

    @Override
    public void onSettlementInstructionRequest(final SettlementInstructionRequestDecoder decoder) {};

    @Override
    public void onTradeCaptureReportRequest(final TradeCaptureReportRequestDecoder decoder) {};

    @Override
    public void onTradeCaptureReportRequestAck(final TradeCaptureReportRequestAckDecoder decoder) {};

    @Override
    public void onTradeCaptureReport(final TradeCaptureReportDecoder decoder) {};

    @Override
    public void onTradeCaptureReportAck(final TradeCaptureReportAckDecoder decoder) {};

    @Override
    public void onRegistrationInstructions(final RegistrationInstructionsDecoder decoder) {};

    @Override
    public void onRegistrationInstructionsResponse(final RegistrationInstructionsResponseDecoder decoder) {};

    @Override
    public void onPositionMaintenanceRequest(final PositionMaintenanceRequestDecoder decoder) {};

    @Override
    public void onPositionMaintenanceReport(final PositionMaintenanceReportDecoder decoder) {};

    @Override
    public void onRequestForPositions(final RequestForPositionsDecoder decoder) {};

    @Override
    public void onRequestForPositionsAck(final RequestForPositionsAckDecoder decoder) {};

    @Override
    public void onPositionReport(final PositionReportDecoder decoder) {};

    @Override
    public void onAssignmentReport(final AssignmentReportDecoder decoder) {};

    @Override
    public void onCollateralRequest(final CollateralRequestDecoder decoder) {};

    @Override
    public void onCollateralAssignment(final CollateralAssignmentDecoder decoder) {};

    @Override
    public void onCollateralResponse(final CollateralResponseDecoder decoder) {};

    @Override
    public void onCollateralReport(final CollateralReportDecoder decoder) {};

    @Override
    public void onCollateralInquiry(final CollateralInquiryDecoder decoder) {};

    @Override
    public void onNetworkStatusRequest(final NetworkStatusRequestDecoder decoder) {};

    @Override
    public void onNetworkStatusResponse(final NetworkStatusResponseDecoder decoder) {};

    @Override
    public void onCollateralInquiryAck(final CollateralInquiryAckDecoder decoder) {};


}
