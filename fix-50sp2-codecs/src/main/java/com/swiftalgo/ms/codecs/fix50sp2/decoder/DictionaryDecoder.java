/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import uk.co.real_logic.artio.util.AsciiBuffer;

public final class DictionaryDecoder
{

    private final DictionaryAcceptor acceptor;

    private final HeartbeatDecoder heartbeat = new HeartbeatDecoder();
    private final TestRequestDecoder testRequest = new TestRequestDecoder();
    private final ResendRequestDecoder resendRequest = new ResendRequestDecoder();
    private final RejectDecoder reject = new RejectDecoder();
    private final SequenceResetDecoder sequenceReset = new SequenceResetDecoder();
    private final LogoutDecoder logout = new LogoutDecoder();
    private final LogonDecoder logon = new LogonDecoder();
    private final IOIDecoder iOI = new IOIDecoder();
    private final AdvertisementDecoder advertisement = new AdvertisementDecoder();
    private final ExecutionReportDecoder executionReport = new ExecutionReportDecoder();
    private final OrderCancelRejectDecoder orderCancelReject = new OrderCancelRejectDecoder();
    private final DerivativeSecurityListDecoder derivativeSecurityList = new DerivativeSecurityListDecoder();
    private final NewOrderMultilegDecoder newOrderMultileg = new NewOrderMultilegDecoder();
    private final MultilegOrderCancelReplaceDecoder multilegOrderCancelReplace = new MultilegOrderCancelReplaceDecoder();
    private final TradeCaptureReportRequestDecoder tradeCaptureReportRequest = new TradeCaptureReportRequestDecoder();
    private final TradeCaptureReportDecoder tradeCaptureReport = new TradeCaptureReportDecoder();
    private final OrderMassStatusRequestDecoder orderMassStatusRequest = new OrderMassStatusRequestDecoder();
    private final QuoteRequestRejectDecoder quoteRequestReject = new QuoteRequestRejectDecoder();
    private final RFQRequestDecoder rFQRequest = new RFQRequestDecoder();
    private final QuoteStatusReportDecoder quoteStatusReport = new QuoteStatusReportDecoder();
    private final QuoteResponseDecoder quoteResponse = new QuoteResponseDecoder();
    private final ConfirmationDecoder confirmation = new ConfirmationDecoder();
    private final PositionMaintenanceRequestDecoder positionMaintenanceRequest = new PositionMaintenanceRequestDecoder();
    private final PositionMaintenanceReportDecoder positionMaintenanceReport = new PositionMaintenanceReportDecoder();
    private final RequestForPositionsDecoder requestForPositions = new RequestForPositionsDecoder();
    private final RequestForPositionsAckDecoder requestForPositionsAck = new RequestForPositionsAckDecoder();
    private final PositionReportDecoder positionReport = new PositionReportDecoder();
    private final TradeCaptureReportRequestAckDecoder tradeCaptureReportRequestAck = new TradeCaptureReportRequestAckDecoder();
    private final TradeCaptureReportAckDecoder tradeCaptureReportAck = new TradeCaptureReportAckDecoder();
    private final AllocationReportDecoder allocationReport = new AllocationReportDecoder();
    private final AllocationReportAckDecoder allocationReportAck = new AllocationReportAckDecoder();
    private final ConfirmationAckDecoder confirmationAck = new ConfirmationAckDecoder();
    private final SettlementInstructionRequestDecoder settlementInstructionRequest = new SettlementInstructionRequestDecoder();
    private final AssignmentReportDecoder assignmentReport = new AssignmentReportDecoder();
    private final CollateralRequestDecoder collateralRequest = new CollateralRequestDecoder();
    private final CollateralAssignmentDecoder collateralAssignment = new CollateralAssignmentDecoder();
    private final CollateralResponseDecoder collateralResponse = new CollateralResponseDecoder();
    private final NewsDecoder news = new NewsDecoder();
    private final CollateralReportDecoder collateralReport = new CollateralReportDecoder();
    private final CollateralInquiryDecoder collateralInquiry = new CollateralInquiryDecoder();
    private final NetworkCounterpartySystemStatusRequestDecoder networkCounterpartySystemStatusRequest = new NetworkCounterpartySystemStatusRequestDecoder();
    private final NetworkCounterpartySystemStatusResponseDecoder networkCounterpartySystemStatusResponse = new NetworkCounterpartySystemStatusResponseDecoder();
    private final UserRequestDecoder userRequest = new UserRequestDecoder();
    private final UserResponseDecoder userResponse = new UserResponseDecoder();
    private final CollateralInquiryAckDecoder collateralInquiryAck = new CollateralInquiryAckDecoder();
    private final ConfirmationRequestDecoder confirmationRequest = new ConfirmationRequestDecoder();
    private final TradingSessionListRequestDecoder tradingSessionListRequest = new TradingSessionListRequestDecoder();
    private final TradingSessionListDecoder tradingSessionList = new TradingSessionListDecoder();
    private final SecurityListUpdateReportDecoder securityListUpdateReport = new SecurityListUpdateReportDecoder();
    private final AdjustedPositionReportDecoder adjustedPositionReport = new AdjustedPositionReportDecoder();
    private final AllocationInstructionAlertDecoder allocationInstructionAlert = new AllocationInstructionAlertDecoder();
    private final ExecutionAcknowledgementDecoder executionAcknowledgement = new ExecutionAcknowledgementDecoder();
    private final ContraryIntentionReportDecoder contraryIntentionReport = new ContraryIntentionReportDecoder();
    private final SecurityDefinitionUpdateReportDecoder securityDefinitionUpdateReport = new SecurityDefinitionUpdateReportDecoder();
    private final SettlementObligationReportDecoder settlementObligationReport = new SettlementObligationReportDecoder();
    private final DerivativeSecurityListUpdateReportDecoder derivativeSecurityListUpdateReport = new DerivativeSecurityListUpdateReportDecoder();
    private final TradingSessionListUpdateReportDecoder tradingSessionListUpdateReport = new TradingSessionListUpdateReportDecoder();
    private final MarketDefinitionRequestDecoder marketDefinitionRequest = new MarketDefinitionRequestDecoder();
    private final MarketDefinitionDecoder marketDefinition = new MarketDefinitionDecoder();
    private final MarketDefinitionUpdateReportDecoder marketDefinitionUpdateReport = new MarketDefinitionUpdateReportDecoder();
    private final ApplicationMessageRequestDecoder applicationMessageRequest = new ApplicationMessageRequestDecoder();
    private final ApplicationMessageRequestAckDecoder applicationMessageRequestAck = new ApplicationMessageRequestAckDecoder();
    private final ApplicationMessageReportDecoder applicationMessageReport = new ApplicationMessageReportDecoder();
    private final OrderMassActionReportDecoder orderMassActionReport = new OrderMassActionReportDecoder();
    private final EmailDecoder email = new EmailDecoder();
    private final OrderMassActionRequestDecoder orderMassActionRequest = new OrderMassActionRequestDecoder();
    private final UserNotificationDecoder userNotification = new UserNotificationDecoder();
    private final StreamAssignmentRequestDecoder streamAssignmentRequest = new StreamAssignmentRequestDecoder();
    private final StreamAssignmentReportDecoder streamAssignmentReport = new StreamAssignmentReportDecoder();
    private final StreamAssignmentReportACKDecoder streamAssignmentReportACK = new StreamAssignmentReportACKDecoder();
    private final NewOrderSingleDecoder newOrderSingle = new NewOrderSingleDecoder();
    private final NewOrderListDecoder newOrderList = new NewOrderListDecoder();
    private final OrderCancelRequestDecoder orderCancelRequest = new OrderCancelRequestDecoder();
    private final OrderCancelReplaceRequestDecoder orderCancelReplaceRequest = new OrderCancelReplaceRequestDecoder();
    private final OrderStatusRequestDecoder orderStatusRequest = new OrderStatusRequestDecoder();
    private final AllocationInstructionDecoder allocationInstruction = new AllocationInstructionDecoder();
    private final ListCancelRequestDecoder listCancelRequest = new ListCancelRequestDecoder();
    private final ListExecuteDecoder listExecute = new ListExecuteDecoder();
    private final ListStatusRequestDecoder listStatusRequest = new ListStatusRequestDecoder();
    private final ListStatusDecoder listStatus = new ListStatusDecoder();
    private final AllocationInstructionAckDecoder allocationInstructionAck = new AllocationInstructionAckDecoder();
    private final DontKnowTradeDecoder dontKnowTrade = new DontKnowTradeDecoder();
    private final QuoteRequestDecoder quoteRequest = new QuoteRequestDecoder();
    private final QuoteDecoder quote = new QuoteDecoder();
    private final SettlementInstructionsDecoder settlementInstructions = new SettlementInstructionsDecoder();
    private final MarketDataRequestDecoder marketDataRequest = new MarketDataRequestDecoder();
    private final MarketDataSnapshotFullRefreshDecoder marketDataSnapshotFullRefresh = new MarketDataSnapshotFullRefreshDecoder();
    private final MarketDataIncrementalRefreshDecoder marketDataIncrementalRefresh = new MarketDataIncrementalRefreshDecoder();
    private final MarketDataRequestRejectDecoder marketDataRequestReject = new MarketDataRequestRejectDecoder();
    private final QuoteCancelDecoder quoteCancel = new QuoteCancelDecoder();
    private final QuoteStatusRequestDecoder quoteStatusRequest = new QuoteStatusRequestDecoder();
    private final MassQuoteAcknowledgementDecoder massQuoteAcknowledgement = new MassQuoteAcknowledgementDecoder();
    private final SecurityDefinitionRequestDecoder securityDefinitionRequest = new SecurityDefinitionRequestDecoder();
    private final SecurityDefinitionDecoder securityDefinition = new SecurityDefinitionDecoder();
    private final SecurityStatusRequestDecoder securityStatusRequest = new SecurityStatusRequestDecoder();
    private final SecurityStatusDecoder securityStatus = new SecurityStatusDecoder();
    private final TradingSessionStatusRequestDecoder tradingSessionStatusRequest = new TradingSessionStatusRequestDecoder();
    private final TradingSessionStatusDecoder tradingSessionStatus = new TradingSessionStatusDecoder();
    private final MassQuoteDecoder massQuote = new MassQuoteDecoder();
    private final BusinessMessageRejectDecoder businessMessageReject = new BusinessMessageRejectDecoder();
    private final BidRequestDecoder bidRequest = new BidRequestDecoder();
    private final BidResponseDecoder bidResponse = new BidResponseDecoder();
    private final ListStrikePriceDecoder listStrikePrice = new ListStrikePriceDecoder();
    private final RegistrationInstructionsDecoder registrationInstructions = new RegistrationInstructionsDecoder();
    private final RegistrationInstructionsResponseDecoder registrationInstructionsResponse = new RegistrationInstructionsResponseDecoder();
    private final OrderMassCancelRequestDecoder orderMassCancelRequest = new OrderMassCancelRequestDecoder();
    private final OrderMassCancelReportDecoder orderMassCancelReport = new OrderMassCancelReportDecoder();
    private final NewOrderCrossDecoder newOrderCross = new NewOrderCrossDecoder();
    private final CrossOrderCancelReplaceRequestDecoder crossOrderCancelReplaceRequest = new CrossOrderCancelReplaceRequestDecoder();
    private final CrossOrderCancelRequestDecoder crossOrderCancelRequest = new CrossOrderCancelRequestDecoder();
    private final SecurityTypeRequestDecoder securityTypeRequest = new SecurityTypeRequestDecoder();
    private final SecurityTypesDecoder securityTypes = new SecurityTypesDecoder();
    private final SecurityListRequestDecoder securityListRequest = new SecurityListRequestDecoder();
    private final SecurityListDecoder securityList = new SecurityListDecoder();
    private final DerivativeSecurityListRequestDecoder derivativeSecurityListRequest = new DerivativeSecurityListRequestDecoder();

    public DictionaryDecoder(final DictionaryAcceptor acceptor)
    {
        this.acceptor = acceptor;
    }

    public void onMessage(
        final AsciiBuffer buffer,
        final int offset,
        final int length,
        final long messageType)
    {
        if (messageType == HeartbeatDecoder.MESSAGE_TYPE)
        {
            heartbeat.decode(buffer, offset, length);
            acceptor.onHeartbeat(heartbeat);
            heartbeat.reset();
        }

        else if (messageType == TestRequestDecoder.MESSAGE_TYPE)
        {
            testRequest.decode(buffer, offset, length);
            acceptor.onTestRequest(testRequest);
            testRequest.reset();
        }

        else if (messageType == ResendRequestDecoder.MESSAGE_TYPE)
        {
            resendRequest.decode(buffer, offset, length);
            acceptor.onResendRequest(resendRequest);
            resendRequest.reset();
        }

        else if (messageType == RejectDecoder.MESSAGE_TYPE)
        {
            reject.decode(buffer, offset, length);
            acceptor.onReject(reject);
            reject.reset();
        }

        else if (messageType == SequenceResetDecoder.MESSAGE_TYPE)
        {
            sequenceReset.decode(buffer, offset, length);
            acceptor.onSequenceReset(sequenceReset);
            sequenceReset.reset();
        }

        else if (messageType == LogoutDecoder.MESSAGE_TYPE)
        {
            logout.decode(buffer, offset, length);
            acceptor.onLogout(logout);
            logout.reset();
        }

        else if (messageType == LogonDecoder.MESSAGE_TYPE)
        {
            logon.decode(buffer, offset, length);
            acceptor.onLogon(logon);
            logon.reset();
        }

        else if (messageType == IOIDecoder.MESSAGE_TYPE)
        {
            iOI.decode(buffer, offset, length);
            acceptor.onIOI(iOI);
            iOI.reset();
        }

        else if (messageType == AdvertisementDecoder.MESSAGE_TYPE)
        {
            advertisement.decode(buffer, offset, length);
            acceptor.onAdvertisement(advertisement);
            advertisement.reset();
        }

        else if (messageType == ExecutionReportDecoder.MESSAGE_TYPE)
        {
            executionReport.decode(buffer, offset, length);
            acceptor.onExecutionReport(executionReport);
            executionReport.reset();
        }

        else if (messageType == OrderCancelRejectDecoder.MESSAGE_TYPE)
        {
            orderCancelReject.decode(buffer, offset, length);
            acceptor.onOrderCancelReject(orderCancelReject);
            orderCancelReject.reset();
        }

        else if (messageType == DerivativeSecurityListDecoder.MESSAGE_TYPE)
        {
            derivativeSecurityList.decode(buffer, offset, length);
            acceptor.onDerivativeSecurityList(derivativeSecurityList);
            derivativeSecurityList.reset();
        }

        else if (messageType == NewOrderMultilegDecoder.MESSAGE_TYPE)
        {
            newOrderMultileg.decode(buffer, offset, length);
            acceptor.onNewOrderMultileg(newOrderMultileg);
            newOrderMultileg.reset();
        }

        else if (messageType == MultilegOrderCancelReplaceDecoder.MESSAGE_TYPE)
        {
            multilegOrderCancelReplace.decode(buffer, offset, length);
            acceptor.onMultilegOrderCancelReplace(multilegOrderCancelReplace);
            multilegOrderCancelReplace.reset();
        }

        else if (messageType == TradeCaptureReportRequestDecoder.MESSAGE_TYPE)
        {
            tradeCaptureReportRequest.decode(buffer, offset, length);
            acceptor.onTradeCaptureReportRequest(tradeCaptureReportRequest);
            tradeCaptureReportRequest.reset();
        }

        else if (messageType == TradeCaptureReportDecoder.MESSAGE_TYPE)
        {
            tradeCaptureReport.decode(buffer, offset, length);
            acceptor.onTradeCaptureReport(tradeCaptureReport);
            tradeCaptureReport.reset();
        }

        else if (messageType == OrderMassStatusRequestDecoder.MESSAGE_TYPE)
        {
            orderMassStatusRequest.decode(buffer, offset, length);
            acceptor.onOrderMassStatusRequest(orderMassStatusRequest);
            orderMassStatusRequest.reset();
        }

        else if (messageType == QuoteRequestRejectDecoder.MESSAGE_TYPE)
        {
            quoteRequestReject.decode(buffer, offset, length);
            acceptor.onQuoteRequestReject(quoteRequestReject);
            quoteRequestReject.reset();
        }

        else if (messageType == RFQRequestDecoder.MESSAGE_TYPE)
        {
            rFQRequest.decode(buffer, offset, length);
            acceptor.onRFQRequest(rFQRequest);
            rFQRequest.reset();
        }

        else if (messageType == QuoteStatusReportDecoder.MESSAGE_TYPE)
        {
            quoteStatusReport.decode(buffer, offset, length);
            acceptor.onQuoteStatusReport(quoteStatusReport);
            quoteStatusReport.reset();
        }

        else if (messageType == QuoteResponseDecoder.MESSAGE_TYPE)
        {
            quoteResponse.decode(buffer, offset, length);
            acceptor.onQuoteResponse(quoteResponse);
            quoteResponse.reset();
        }

        else if (messageType == ConfirmationDecoder.MESSAGE_TYPE)
        {
            confirmation.decode(buffer, offset, length);
            acceptor.onConfirmation(confirmation);
            confirmation.reset();
        }

        else if (messageType == PositionMaintenanceRequestDecoder.MESSAGE_TYPE)
        {
            positionMaintenanceRequest.decode(buffer, offset, length);
            acceptor.onPositionMaintenanceRequest(positionMaintenanceRequest);
            positionMaintenanceRequest.reset();
        }

        else if (messageType == PositionMaintenanceReportDecoder.MESSAGE_TYPE)
        {
            positionMaintenanceReport.decode(buffer, offset, length);
            acceptor.onPositionMaintenanceReport(positionMaintenanceReport);
            positionMaintenanceReport.reset();
        }

        else if (messageType == RequestForPositionsDecoder.MESSAGE_TYPE)
        {
            requestForPositions.decode(buffer, offset, length);
            acceptor.onRequestForPositions(requestForPositions);
            requestForPositions.reset();
        }

        else if (messageType == RequestForPositionsAckDecoder.MESSAGE_TYPE)
        {
            requestForPositionsAck.decode(buffer, offset, length);
            acceptor.onRequestForPositionsAck(requestForPositionsAck);
            requestForPositionsAck.reset();
        }

        else if (messageType == PositionReportDecoder.MESSAGE_TYPE)
        {
            positionReport.decode(buffer, offset, length);
            acceptor.onPositionReport(positionReport);
            positionReport.reset();
        }

        else if (messageType == TradeCaptureReportRequestAckDecoder.MESSAGE_TYPE)
        {
            tradeCaptureReportRequestAck.decode(buffer, offset, length);
            acceptor.onTradeCaptureReportRequestAck(tradeCaptureReportRequestAck);
            tradeCaptureReportRequestAck.reset();
        }

        else if (messageType == TradeCaptureReportAckDecoder.MESSAGE_TYPE)
        {
            tradeCaptureReportAck.decode(buffer, offset, length);
            acceptor.onTradeCaptureReportAck(tradeCaptureReportAck);
            tradeCaptureReportAck.reset();
        }

        else if (messageType == AllocationReportDecoder.MESSAGE_TYPE)
        {
            allocationReport.decode(buffer, offset, length);
            acceptor.onAllocationReport(allocationReport);
            allocationReport.reset();
        }

        else if (messageType == AllocationReportAckDecoder.MESSAGE_TYPE)
        {
            allocationReportAck.decode(buffer, offset, length);
            acceptor.onAllocationReportAck(allocationReportAck);
            allocationReportAck.reset();
        }

        else if (messageType == ConfirmationAckDecoder.MESSAGE_TYPE)
        {
            confirmationAck.decode(buffer, offset, length);
            acceptor.onConfirmationAck(confirmationAck);
            confirmationAck.reset();
        }

        else if (messageType == SettlementInstructionRequestDecoder.MESSAGE_TYPE)
        {
            settlementInstructionRequest.decode(buffer, offset, length);
            acceptor.onSettlementInstructionRequest(settlementInstructionRequest);
            settlementInstructionRequest.reset();
        }

        else if (messageType == AssignmentReportDecoder.MESSAGE_TYPE)
        {
            assignmentReport.decode(buffer, offset, length);
            acceptor.onAssignmentReport(assignmentReport);
            assignmentReport.reset();
        }

        else if (messageType == CollateralRequestDecoder.MESSAGE_TYPE)
        {
            collateralRequest.decode(buffer, offset, length);
            acceptor.onCollateralRequest(collateralRequest);
            collateralRequest.reset();
        }

        else if (messageType == CollateralAssignmentDecoder.MESSAGE_TYPE)
        {
            collateralAssignment.decode(buffer, offset, length);
            acceptor.onCollateralAssignment(collateralAssignment);
            collateralAssignment.reset();
        }

        else if (messageType == CollateralResponseDecoder.MESSAGE_TYPE)
        {
            collateralResponse.decode(buffer, offset, length);
            acceptor.onCollateralResponse(collateralResponse);
            collateralResponse.reset();
        }

        else if (messageType == NewsDecoder.MESSAGE_TYPE)
        {
            news.decode(buffer, offset, length);
            acceptor.onNews(news);
            news.reset();
        }

        else if (messageType == CollateralReportDecoder.MESSAGE_TYPE)
        {
            collateralReport.decode(buffer, offset, length);
            acceptor.onCollateralReport(collateralReport);
            collateralReport.reset();
        }

        else if (messageType == CollateralInquiryDecoder.MESSAGE_TYPE)
        {
            collateralInquiry.decode(buffer, offset, length);
            acceptor.onCollateralInquiry(collateralInquiry);
            collateralInquiry.reset();
        }

        else if (messageType == NetworkCounterpartySystemStatusRequestDecoder.MESSAGE_TYPE)
        {
            networkCounterpartySystemStatusRequest.decode(buffer, offset, length);
            acceptor.onNetworkCounterpartySystemStatusRequest(networkCounterpartySystemStatusRequest);
            networkCounterpartySystemStatusRequest.reset();
        }

        else if (messageType == NetworkCounterpartySystemStatusResponseDecoder.MESSAGE_TYPE)
        {
            networkCounterpartySystemStatusResponse.decode(buffer, offset, length);
            acceptor.onNetworkCounterpartySystemStatusResponse(networkCounterpartySystemStatusResponse);
            networkCounterpartySystemStatusResponse.reset();
        }

        else if (messageType == UserRequestDecoder.MESSAGE_TYPE)
        {
            userRequest.decode(buffer, offset, length);
            acceptor.onUserRequest(userRequest);
            userRequest.reset();
        }

        else if (messageType == UserResponseDecoder.MESSAGE_TYPE)
        {
            userResponse.decode(buffer, offset, length);
            acceptor.onUserResponse(userResponse);
            userResponse.reset();
        }

        else if (messageType == CollateralInquiryAckDecoder.MESSAGE_TYPE)
        {
            collateralInquiryAck.decode(buffer, offset, length);
            acceptor.onCollateralInquiryAck(collateralInquiryAck);
            collateralInquiryAck.reset();
        }

        else if (messageType == ConfirmationRequestDecoder.MESSAGE_TYPE)
        {
            confirmationRequest.decode(buffer, offset, length);
            acceptor.onConfirmationRequest(confirmationRequest);
            confirmationRequest.reset();
        }

        else if (messageType == TradingSessionListRequestDecoder.MESSAGE_TYPE)
        {
            tradingSessionListRequest.decode(buffer, offset, length);
            acceptor.onTradingSessionListRequest(tradingSessionListRequest);
            tradingSessionListRequest.reset();
        }

        else if (messageType == TradingSessionListDecoder.MESSAGE_TYPE)
        {
            tradingSessionList.decode(buffer, offset, length);
            acceptor.onTradingSessionList(tradingSessionList);
            tradingSessionList.reset();
        }

        else if (messageType == SecurityListUpdateReportDecoder.MESSAGE_TYPE)
        {
            securityListUpdateReport.decode(buffer, offset, length);
            acceptor.onSecurityListUpdateReport(securityListUpdateReport);
            securityListUpdateReport.reset();
        }

        else if (messageType == AdjustedPositionReportDecoder.MESSAGE_TYPE)
        {
            adjustedPositionReport.decode(buffer, offset, length);
            acceptor.onAdjustedPositionReport(adjustedPositionReport);
            adjustedPositionReport.reset();
        }

        else if (messageType == AllocationInstructionAlertDecoder.MESSAGE_TYPE)
        {
            allocationInstructionAlert.decode(buffer, offset, length);
            acceptor.onAllocationInstructionAlert(allocationInstructionAlert);
            allocationInstructionAlert.reset();
        }

        else if (messageType == ExecutionAcknowledgementDecoder.MESSAGE_TYPE)
        {
            executionAcknowledgement.decode(buffer, offset, length);
            acceptor.onExecutionAcknowledgement(executionAcknowledgement);
            executionAcknowledgement.reset();
        }

        else if (messageType == ContraryIntentionReportDecoder.MESSAGE_TYPE)
        {
            contraryIntentionReport.decode(buffer, offset, length);
            acceptor.onContraryIntentionReport(contraryIntentionReport);
            contraryIntentionReport.reset();
        }

        else if (messageType == SecurityDefinitionUpdateReportDecoder.MESSAGE_TYPE)
        {
            securityDefinitionUpdateReport.decode(buffer, offset, length);
            acceptor.onSecurityDefinitionUpdateReport(securityDefinitionUpdateReport);
            securityDefinitionUpdateReport.reset();
        }

        else if (messageType == SettlementObligationReportDecoder.MESSAGE_TYPE)
        {
            settlementObligationReport.decode(buffer, offset, length);
            acceptor.onSettlementObligationReport(settlementObligationReport);
            settlementObligationReport.reset();
        }

        else if (messageType == DerivativeSecurityListUpdateReportDecoder.MESSAGE_TYPE)
        {
            derivativeSecurityListUpdateReport.decode(buffer, offset, length);
            acceptor.onDerivativeSecurityListUpdateReport(derivativeSecurityListUpdateReport);
            derivativeSecurityListUpdateReport.reset();
        }

        else if (messageType == TradingSessionListUpdateReportDecoder.MESSAGE_TYPE)
        {
            tradingSessionListUpdateReport.decode(buffer, offset, length);
            acceptor.onTradingSessionListUpdateReport(tradingSessionListUpdateReport);
            tradingSessionListUpdateReport.reset();
        }

        else if (messageType == MarketDefinitionRequestDecoder.MESSAGE_TYPE)
        {
            marketDefinitionRequest.decode(buffer, offset, length);
            acceptor.onMarketDefinitionRequest(marketDefinitionRequest);
            marketDefinitionRequest.reset();
        }

        else if (messageType == MarketDefinitionDecoder.MESSAGE_TYPE)
        {
            marketDefinition.decode(buffer, offset, length);
            acceptor.onMarketDefinition(marketDefinition);
            marketDefinition.reset();
        }

        else if (messageType == MarketDefinitionUpdateReportDecoder.MESSAGE_TYPE)
        {
            marketDefinitionUpdateReport.decode(buffer, offset, length);
            acceptor.onMarketDefinitionUpdateReport(marketDefinitionUpdateReport);
            marketDefinitionUpdateReport.reset();
        }

        else if (messageType == ApplicationMessageRequestDecoder.MESSAGE_TYPE)
        {
            applicationMessageRequest.decode(buffer, offset, length);
            acceptor.onApplicationMessageRequest(applicationMessageRequest);
            applicationMessageRequest.reset();
        }

        else if (messageType == ApplicationMessageRequestAckDecoder.MESSAGE_TYPE)
        {
            applicationMessageRequestAck.decode(buffer, offset, length);
            acceptor.onApplicationMessageRequestAck(applicationMessageRequestAck);
            applicationMessageRequestAck.reset();
        }

        else if (messageType == ApplicationMessageReportDecoder.MESSAGE_TYPE)
        {
            applicationMessageReport.decode(buffer, offset, length);
            acceptor.onApplicationMessageReport(applicationMessageReport);
            applicationMessageReport.reset();
        }

        else if (messageType == OrderMassActionReportDecoder.MESSAGE_TYPE)
        {
            orderMassActionReport.decode(buffer, offset, length);
            acceptor.onOrderMassActionReport(orderMassActionReport);
            orderMassActionReport.reset();
        }

        else if (messageType == EmailDecoder.MESSAGE_TYPE)
        {
            email.decode(buffer, offset, length);
            acceptor.onEmail(email);
            email.reset();
        }

        else if (messageType == OrderMassActionRequestDecoder.MESSAGE_TYPE)
        {
            orderMassActionRequest.decode(buffer, offset, length);
            acceptor.onOrderMassActionRequest(orderMassActionRequest);
            orderMassActionRequest.reset();
        }

        else if (messageType == UserNotificationDecoder.MESSAGE_TYPE)
        {
            userNotification.decode(buffer, offset, length);
            acceptor.onUserNotification(userNotification);
            userNotification.reset();
        }

        else if (messageType == StreamAssignmentRequestDecoder.MESSAGE_TYPE)
        {
            streamAssignmentRequest.decode(buffer, offset, length);
            acceptor.onStreamAssignmentRequest(streamAssignmentRequest);
            streamAssignmentRequest.reset();
        }

        else if (messageType == StreamAssignmentReportDecoder.MESSAGE_TYPE)
        {
            streamAssignmentReport.decode(buffer, offset, length);
            acceptor.onStreamAssignmentReport(streamAssignmentReport);
            streamAssignmentReport.reset();
        }

        else if (messageType == StreamAssignmentReportACKDecoder.MESSAGE_TYPE)
        {
            streamAssignmentReportACK.decode(buffer, offset, length);
            acceptor.onStreamAssignmentReportACK(streamAssignmentReportACK);
            streamAssignmentReportACK.reset();
        }

        else if (messageType == NewOrderSingleDecoder.MESSAGE_TYPE)
        {
            newOrderSingle.decode(buffer, offset, length);
            acceptor.onNewOrderSingle(newOrderSingle);
            newOrderSingle.reset();
        }

        else if (messageType == NewOrderListDecoder.MESSAGE_TYPE)
        {
            newOrderList.decode(buffer, offset, length);
            acceptor.onNewOrderList(newOrderList);
            newOrderList.reset();
        }

        else if (messageType == OrderCancelRequestDecoder.MESSAGE_TYPE)
        {
            orderCancelRequest.decode(buffer, offset, length);
            acceptor.onOrderCancelRequest(orderCancelRequest);
            orderCancelRequest.reset();
        }

        else if (messageType == OrderCancelReplaceRequestDecoder.MESSAGE_TYPE)
        {
            orderCancelReplaceRequest.decode(buffer, offset, length);
            acceptor.onOrderCancelReplaceRequest(orderCancelReplaceRequest);
            orderCancelReplaceRequest.reset();
        }

        else if (messageType == OrderStatusRequestDecoder.MESSAGE_TYPE)
        {
            orderStatusRequest.decode(buffer, offset, length);
            acceptor.onOrderStatusRequest(orderStatusRequest);
            orderStatusRequest.reset();
        }

        else if (messageType == AllocationInstructionDecoder.MESSAGE_TYPE)
        {
            allocationInstruction.decode(buffer, offset, length);
            acceptor.onAllocationInstruction(allocationInstruction);
            allocationInstruction.reset();
        }

        else if (messageType == ListCancelRequestDecoder.MESSAGE_TYPE)
        {
            listCancelRequest.decode(buffer, offset, length);
            acceptor.onListCancelRequest(listCancelRequest);
            listCancelRequest.reset();
        }

        else if (messageType == ListExecuteDecoder.MESSAGE_TYPE)
        {
            listExecute.decode(buffer, offset, length);
            acceptor.onListExecute(listExecute);
            listExecute.reset();
        }

        else if (messageType == ListStatusRequestDecoder.MESSAGE_TYPE)
        {
            listStatusRequest.decode(buffer, offset, length);
            acceptor.onListStatusRequest(listStatusRequest);
            listStatusRequest.reset();
        }

        else if (messageType == ListStatusDecoder.MESSAGE_TYPE)
        {
            listStatus.decode(buffer, offset, length);
            acceptor.onListStatus(listStatus);
            listStatus.reset();
        }

        else if (messageType == AllocationInstructionAckDecoder.MESSAGE_TYPE)
        {
            allocationInstructionAck.decode(buffer, offset, length);
            acceptor.onAllocationInstructionAck(allocationInstructionAck);
            allocationInstructionAck.reset();
        }

        else if (messageType == DontKnowTradeDecoder.MESSAGE_TYPE)
        {
            dontKnowTrade.decode(buffer, offset, length);
            acceptor.onDontKnowTrade(dontKnowTrade);
            dontKnowTrade.reset();
        }

        else if (messageType == QuoteRequestDecoder.MESSAGE_TYPE)
        {
            quoteRequest.decode(buffer, offset, length);
            acceptor.onQuoteRequest(quoteRequest);
            quoteRequest.reset();
        }

        else if (messageType == QuoteDecoder.MESSAGE_TYPE)
        {
            quote.decode(buffer, offset, length);
            acceptor.onQuote(quote);
            quote.reset();
        }

        else if (messageType == SettlementInstructionsDecoder.MESSAGE_TYPE)
        {
            settlementInstructions.decode(buffer, offset, length);
            acceptor.onSettlementInstructions(settlementInstructions);
            settlementInstructions.reset();
        }

        else if (messageType == MarketDataRequestDecoder.MESSAGE_TYPE)
        {
            marketDataRequest.decode(buffer, offset, length);
            acceptor.onMarketDataRequest(marketDataRequest);
            marketDataRequest.reset();
        }

        else if (messageType == MarketDataSnapshotFullRefreshDecoder.MESSAGE_TYPE)
        {
            marketDataSnapshotFullRefresh.decode(buffer, offset, length);
            acceptor.onMarketDataSnapshotFullRefresh(marketDataSnapshotFullRefresh);
            marketDataSnapshotFullRefresh.reset();
        }

        else if (messageType == MarketDataIncrementalRefreshDecoder.MESSAGE_TYPE)
        {
            marketDataIncrementalRefresh.decode(buffer, offset, length);
            acceptor.onMarketDataIncrementalRefresh(marketDataIncrementalRefresh);
            marketDataIncrementalRefresh.reset();
        }

        else if (messageType == MarketDataRequestRejectDecoder.MESSAGE_TYPE)
        {
            marketDataRequestReject.decode(buffer, offset, length);
            acceptor.onMarketDataRequestReject(marketDataRequestReject);
            marketDataRequestReject.reset();
        }

        else if (messageType == QuoteCancelDecoder.MESSAGE_TYPE)
        {
            quoteCancel.decode(buffer, offset, length);
            acceptor.onQuoteCancel(quoteCancel);
            quoteCancel.reset();
        }

        else if (messageType == QuoteStatusRequestDecoder.MESSAGE_TYPE)
        {
            quoteStatusRequest.decode(buffer, offset, length);
            acceptor.onQuoteStatusRequest(quoteStatusRequest);
            quoteStatusRequest.reset();
        }

        else if (messageType == MassQuoteAcknowledgementDecoder.MESSAGE_TYPE)
        {
            massQuoteAcknowledgement.decode(buffer, offset, length);
            acceptor.onMassQuoteAcknowledgement(massQuoteAcknowledgement);
            massQuoteAcknowledgement.reset();
        }

        else if (messageType == SecurityDefinitionRequestDecoder.MESSAGE_TYPE)
        {
            securityDefinitionRequest.decode(buffer, offset, length);
            acceptor.onSecurityDefinitionRequest(securityDefinitionRequest);
            securityDefinitionRequest.reset();
        }

        else if (messageType == SecurityDefinitionDecoder.MESSAGE_TYPE)
        {
            securityDefinition.decode(buffer, offset, length);
            acceptor.onSecurityDefinition(securityDefinition);
            securityDefinition.reset();
        }

        else if (messageType == SecurityStatusRequestDecoder.MESSAGE_TYPE)
        {
            securityStatusRequest.decode(buffer, offset, length);
            acceptor.onSecurityStatusRequest(securityStatusRequest);
            securityStatusRequest.reset();
        }

        else if (messageType == SecurityStatusDecoder.MESSAGE_TYPE)
        {
            securityStatus.decode(buffer, offset, length);
            acceptor.onSecurityStatus(securityStatus);
            securityStatus.reset();
        }

        else if (messageType == TradingSessionStatusRequestDecoder.MESSAGE_TYPE)
        {
            tradingSessionStatusRequest.decode(buffer, offset, length);
            acceptor.onTradingSessionStatusRequest(tradingSessionStatusRequest);
            tradingSessionStatusRequest.reset();
        }

        else if (messageType == TradingSessionStatusDecoder.MESSAGE_TYPE)
        {
            tradingSessionStatus.decode(buffer, offset, length);
            acceptor.onTradingSessionStatus(tradingSessionStatus);
            tradingSessionStatus.reset();
        }

        else if (messageType == MassQuoteDecoder.MESSAGE_TYPE)
        {
            massQuote.decode(buffer, offset, length);
            acceptor.onMassQuote(massQuote);
            massQuote.reset();
        }

        else if (messageType == BusinessMessageRejectDecoder.MESSAGE_TYPE)
        {
            businessMessageReject.decode(buffer, offset, length);
            acceptor.onBusinessMessageReject(businessMessageReject);
            businessMessageReject.reset();
        }

        else if (messageType == BidRequestDecoder.MESSAGE_TYPE)
        {
            bidRequest.decode(buffer, offset, length);
            acceptor.onBidRequest(bidRequest);
            bidRequest.reset();
        }

        else if (messageType == BidResponseDecoder.MESSAGE_TYPE)
        {
            bidResponse.decode(buffer, offset, length);
            acceptor.onBidResponse(bidResponse);
            bidResponse.reset();
        }

        else if (messageType == ListStrikePriceDecoder.MESSAGE_TYPE)
        {
            listStrikePrice.decode(buffer, offset, length);
            acceptor.onListStrikePrice(listStrikePrice);
            listStrikePrice.reset();
        }

        else if (messageType == RegistrationInstructionsDecoder.MESSAGE_TYPE)
        {
            registrationInstructions.decode(buffer, offset, length);
            acceptor.onRegistrationInstructions(registrationInstructions);
            registrationInstructions.reset();
        }

        else if (messageType == RegistrationInstructionsResponseDecoder.MESSAGE_TYPE)
        {
            registrationInstructionsResponse.decode(buffer, offset, length);
            acceptor.onRegistrationInstructionsResponse(registrationInstructionsResponse);
            registrationInstructionsResponse.reset();
        }

        else if (messageType == OrderMassCancelRequestDecoder.MESSAGE_TYPE)
        {
            orderMassCancelRequest.decode(buffer, offset, length);
            acceptor.onOrderMassCancelRequest(orderMassCancelRequest);
            orderMassCancelRequest.reset();
        }

        else if (messageType == OrderMassCancelReportDecoder.MESSAGE_TYPE)
        {
            orderMassCancelReport.decode(buffer, offset, length);
            acceptor.onOrderMassCancelReport(orderMassCancelReport);
            orderMassCancelReport.reset();
        }

        else if (messageType == NewOrderCrossDecoder.MESSAGE_TYPE)
        {
            newOrderCross.decode(buffer, offset, length);
            acceptor.onNewOrderCross(newOrderCross);
            newOrderCross.reset();
        }

        else if (messageType == CrossOrderCancelReplaceRequestDecoder.MESSAGE_TYPE)
        {
            crossOrderCancelReplaceRequest.decode(buffer, offset, length);
            acceptor.onCrossOrderCancelReplaceRequest(crossOrderCancelReplaceRequest);
            crossOrderCancelReplaceRequest.reset();
        }

        else if (messageType == CrossOrderCancelRequestDecoder.MESSAGE_TYPE)
        {
            crossOrderCancelRequest.decode(buffer, offset, length);
            acceptor.onCrossOrderCancelRequest(crossOrderCancelRequest);
            crossOrderCancelRequest.reset();
        }

        else if (messageType == SecurityTypeRequestDecoder.MESSAGE_TYPE)
        {
            securityTypeRequest.decode(buffer, offset, length);
            acceptor.onSecurityTypeRequest(securityTypeRequest);
            securityTypeRequest.reset();
        }

        else if (messageType == SecurityTypesDecoder.MESSAGE_TYPE)
        {
            securityTypes.decode(buffer, offset, length);
            acceptor.onSecurityTypes(securityTypes);
            securityTypes.reset();
        }

        else if (messageType == SecurityListRequestDecoder.MESSAGE_TYPE)
        {
            securityListRequest.decode(buffer, offset, length);
            acceptor.onSecurityListRequest(securityListRequest);
            securityListRequest.reset();
        }

        else if (messageType == SecurityListDecoder.MESSAGE_TYPE)
        {
            securityList.decode(buffer, offset, length);
            acceptor.onSecurityList(securityList);
            securityList.reset();
        }

        else if (messageType == DerivativeSecurityListRequestDecoder.MESSAGE_TYPE)
        {
            derivativeSecurityListRequest.decode(buffer, offset, length);
            acceptor.onDerivativeSecurityListRequest(derivativeSecurityListRequest);
            derivativeSecurityListRequest.reset();
        }

    }

}
