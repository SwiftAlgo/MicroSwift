/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import uk.co.real_logic.artio.builder.Printer;
import uk.co.real_logic.artio.util.AsciiBuffer;

public class PrinterImpl implements Printer
{

    private final HeartbeatDecoder heartbeat = new HeartbeatDecoder();
    private final LogonDecoder logon = new LogonDecoder();
    private final TestRequestDecoder testRequest = new TestRequestDecoder();
    private final ResendRequestDecoder resendRequest = new ResendRequestDecoder();
    private final RejectDecoder reject = new RejectDecoder();
    private final SequenceResetDecoder sequenceReset = new SequenceResetDecoder();
    private final LogoutDecoder logout = new LogoutDecoder();
    private final BusinessMessageRejectDecoder businessMessageReject = new BusinessMessageRejectDecoder();
    private final UserRequestDecoder userRequest = new UserRequestDecoder();
    private final UserResponseDecoder userResponse = new UserResponseDecoder();
    private final AdvertisementDecoder advertisement = new AdvertisementDecoder();
    private final IndicationOfInterestDecoder indicationOfInterest = new IndicationOfInterestDecoder();
    private final NewsDecoder news = new NewsDecoder();
    private final EmailDecoder email = new EmailDecoder();
    private final QuoteRequestDecoder quoteRequest = new QuoteRequestDecoder();
    private final QuoteResponseDecoder quoteResponse = new QuoteResponseDecoder();
    private final QuoteRequestRejectDecoder quoteRequestReject = new QuoteRequestRejectDecoder();
    private final RFQRequestDecoder rFQRequest = new RFQRequestDecoder();
    private final QuoteDecoder quote = new QuoteDecoder();
    private final QuoteCancelDecoder quoteCancel = new QuoteCancelDecoder();
    private final QuoteStatusRequestDecoder quoteStatusRequest = new QuoteStatusRequestDecoder();
    private final QuoteStatusReportDecoder quoteStatusReport = new QuoteStatusReportDecoder();
    private final MassQuoteDecoder massQuote = new MassQuoteDecoder();
    private final MassQuoteAcknowledgementDecoder massQuoteAcknowledgement = new MassQuoteAcknowledgementDecoder();
    private final MarketDataRequestDecoder marketDataRequest = new MarketDataRequestDecoder();
    private final MarketDataSnapshotFullRefreshDecoder marketDataSnapshotFullRefresh = new MarketDataSnapshotFullRefreshDecoder();
    private final MarketDataIncrementalRefreshDecoder marketDataIncrementalRefresh = new MarketDataIncrementalRefreshDecoder();
    private final MarketDataRequestRejectDecoder marketDataRequestReject = new MarketDataRequestRejectDecoder();
    private final SecurityDefinitionRequestDecoder securityDefinitionRequest = new SecurityDefinitionRequestDecoder();
    private final SecurityDefinitionDecoder securityDefinition = new SecurityDefinitionDecoder();
    private final SecurityTypeRequestDecoder securityTypeRequest = new SecurityTypeRequestDecoder();
    private final SecurityTypesDecoder securityTypes = new SecurityTypesDecoder();
    private final SecurityListRequestDecoder securityListRequest = new SecurityListRequestDecoder();
    private final SecurityListDecoder securityList = new SecurityListDecoder();
    private final DerivativeSecurityListRequestDecoder derivativeSecurityListRequest = new DerivativeSecurityListRequestDecoder();
    private final DerivativeSecurityListDecoder derivativeSecurityList = new DerivativeSecurityListDecoder();
    private final SecurityStatusRequestDecoder securityStatusRequest = new SecurityStatusRequestDecoder();
    private final SecurityStatusDecoder securityStatus = new SecurityStatusDecoder();
    private final TradingSessionStatusRequestDecoder tradingSessionStatusRequest = new TradingSessionStatusRequestDecoder();
    private final TradingSessionStatusDecoder tradingSessionStatus = new TradingSessionStatusDecoder();
    private final NewOrderSingleDecoder newOrderSingle = new NewOrderSingleDecoder();
    private final ExecutionReportDecoder executionReport = new ExecutionReportDecoder();
    private final DontKnowTradeDecoder dontKnowTrade = new DontKnowTradeDecoder();
    private final OrderCancelReplaceRequestDecoder orderCancelReplaceRequest = new OrderCancelReplaceRequestDecoder();
    private final OrderCancelRequestDecoder orderCancelRequest = new OrderCancelRequestDecoder();
    private final OrderCancelRejectDecoder orderCancelReject = new OrderCancelRejectDecoder();
    private final OrderStatusRequestDecoder orderStatusRequest = new OrderStatusRequestDecoder();
    private final OrderMassCancelRequestDecoder orderMassCancelRequest = new OrderMassCancelRequestDecoder();
    private final OrderMassCancelReportDecoder orderMassCancelReport = new OrderMassCancelReportDecoder();
    private final OrderMassStatusRequestDecoder orderMassStatusRequest = new OrderMassStatusRequestDecoder();
    private final NewOrderCrossDecoder newOrderCross = new NewOrderCrossDecoder();
    private final CrossOrderCancelReplaceRequestDecoder crossOrderCancelReplaceRequest = new CrossOrderCancelReplaceRequestDecoder();
    private final CrossOrderCancelRequestDecoder crossOrderCancelRequest = new CrossOrderCancelRequestDecoder();
    private final NewOrderMultilegDecoder newOrderMultileg = new NewOrderMultilegDecoder();
    private final MultilegOrderCancelReplaceRequestDecoder multilegOrderCancelReplaceRequest = new MultilegOrderCancelReplaceRequestDecoder();
    private final BidRequestDecoder bidRequest = new BidRequestDecoder();
    private final BidResponseDecoder bidResponse = new BidResponseDecoder();
    private final NewOrderListDecoder newOrderList = new NewOrderListDecoder();
    private final ListStrikePriceDecoder listStrikePrice = new ListStrikePriceDecoder();
    private final ListStatusDecoder listStatus = new ListStatusDecoder();
    private final ListExecuteDecoder listExecute = new ListExecuteDecoder();
    private final ListCancelRequestDecoder listCancelRequest = new ListCancelRequestDecoder();
    private final ListStatusRequestDecoder listStatusRequest = new ListStatusRequestDecoder();
    private final AllocationInstructionDecoder allocationInstruction = new AllocationInstructionDecoder();
    private final AllocationInstructionAckDecoder allocationInstructionAck = new AllocationInstructionAckDecoder();
    private final AllocationReportDecoder allocationReport = new AllocationReportDecoder();
    private final AllocationReportAckDecoder allocationReportAck = new AllocationReportAckDecoder();
    private final ConfirmationDecoder confirmation = new ConfirmationDecoder();
    private final ConfirmationAckDecoder confirmationAck = new ConfirmationAckDecoder();
    private final ConfirmationRequestDecoder confirmationRequest = new ConfirmationRequestDecoder();
    private final SettlementInstructionsDecoder settlementInstructions = new SettlementInstructionsDecoder();
    private final SettlementInstructionRequestDecoder settlementInstructionRequest = new SettlementInstructionRequestDecoder();
    private final TradeCaptureReportRequestDecoder tradeCaptureReportRequest = new TradeCaptureReportRequestDecoder();
    private final TradeCaptureReportRequestAckDecoder tradeCaptureReportRequestAck = new TradeCaptureReportRequestAckDecoder();
    private final TradeCaptureReportDecoder tradeCaptureReport = new TradeCaptureReportDecoder();
    private final TradeCaptureReportAckDecoder tradeCaptureReportAck = new TradeCaptureReportAckDecoder();
    private final RegistrationInstructionsDecoder registrationInstructions = new RegistrationInstructionsDecoder();
    private final RegistrationInstructionsResponseDecoder registrationInstructionsResponse = new RegistrationInstructionsResponseDecoder();
    private final PositionMaintenanceRequestDecoder positionMaintenanceRequest = new PositionMaintenanceRequestDecoder();
    private final PositionMaintenanceReportDecoder positionMaintenanceReport = new PositionMaintenanceReportDecoder();
    private final RequestForPositionsDecoder requestForPositions = new RequestForPositionsDecoder();
    private final RequestForPositionsAckDecoder requestForPositionsAck = new RequestForPositionsAckDecoder();
    private final PositionReportDecoder positionReport = new PositionReportDecoder();
    private final AssignmentReportDecoder assignmentReport = new AssignmentReportDecoder();
    private final CollateralRequestDecoder collateralRequest = new CollateralRequestDecoder();
    private final CollateralAssignmentDecoder collateralAssignment = new CollateralAssignmentDecoder();
    private final CollateralResponseDecoder collateralResponse = new CollateralResponseDecoder();
    private final CollateralReportDecoder collateralReport = new CollateralReportDecoder();
    private final CollateralInquiryDecoder collateralInquiry = new CollateralInquiryDecoder();
    private final NetworkStatusRequestDecoder networkStatusRequest = new NetworkStatusRequestDecoder();
    private final NetworkStatusResponseDecoder networkStatusResponse = new NetworkStatusResponseDecoder();
    private final CollateralInquiryAckDecoder collateralInquiryAck = new CollateralInquiryAckDecoder();

    public String toString(
        final AsciiBuffer input,
        final int offset,
        final int length,
        final long messageType)
    {
            if (messageType == 48L)
            {
                heartbeat.decode(input, offset, length);
                return heartbeat.toString();
            }

            if (messageType == 65L)
            {
                logon.decode(input, offset, length);
                return logon.toString();
            }

            if (messageType == 49L)
            {
                testRequest.decode(input, offset, length);
                return testRequest.toString();
            }

            if (messageType == 50L)
            {
                resendRequest.decode(input, offset, length);
                return resendRequest.toString();
            }

            if (messageType == 51L)
            {
                reject.decode(input, offset, length);
                return reject.toString();
            }

            if (messageType == 52L)
            {
                sequenceReset.decode(input, offset, length);
                return sequenceReset.toString();
            }

            if (messageType == 53L)
            {
                logout.decode(input, offset, length);
                return logout.toString();
            }

            if (messageType == 106L)
            {
                businessMessageReject.decode(input, offset, length);
                return businessMessageReject.toString();
            }

            if (messageType == 17730L)
            {
                userRequest.decode(input, offset, length);
                return userRequest.toString();
            }

            if (messageType == 17986L)
            {
                userResponse.decode(input, offset, length);
                return userResponse.toString();
            }

            if (messageType == 55L)
            {
                advertisement.decode(input, offset, length);
                return advertisement.toString();
            }

            if (messageType == 54L)
            {
                indicationOfInterest.decode(input, offset, length);
                return indicationOfInterest.toString();
            }

            if (messageType == 66L)
            {
                news.decode(input, offset, length);
                return news.toString();
            }

            if (messageType == 67L)
            {
                email.decode(input, offset, length);
                return email.toString();
            }

            if (messageType == 82L)
            {
                quoteRequest.decode(input, offset, length);
                return quoteRequest.toString();
            }

            if (messageType == 19009L)
            {
                quoteResponse.decode(input, offset, length);
                return quoteResponse.toString();
            }

            if (messageType == 18241L)
            {
                quoteRequestReject.decode(input, offset, length);
                return quoteRequestReject.toString();
            }

            if (messageType == 18497L)
            {
                rFQRequest.decode(input, offset, length);
                return rFQRequest.toString();
            }

            if (messageType == 83L)
            {
                quote.decode(input, offset, length);
                return quote.toString();
            }

            if (messageType == 90L)
            {
                quoteCancel.decode(input, offset, length);
                return quoteCancel.toString();
            }

            if (messageType == 97L)
            {
                quoteStatusRequest.decode(input, offset, length);
                return quoteStatusRequest.toString();
            }

            if (messageType == 18753L)
            {
                quoteStatusReport.decode(input, offset, length);
                return quoteStatusReport.toString();
            }

            if (messageType == 105L)
            {
                massQuote.decode(input, offset, length);
                return massQuote.toString();
            }

            if (messageType == 98L)
            {
                massQuoteAcknowledgement.decode(input, offset, length);
                return massQuoteAcknowledgement.toString();
            }

            if (messageType == 86L)
            {
                marketDataRequest.decode(input, offset, length);
                return marketDataRequest.toString();
            }

            if (messageType == 87L)
            {
                marketDataSnapshotFullRefresh.decode(input, offset, length);
                return marketDataSnapshotFullRefresh.toString();
            }

            if (messageType == 88L)
            {
                marketDataIncrementalRefresh.decode(input, offset, length);
                return marketDataIncrementalRefresh.toString();
            }

            if (messageType == 89L)
            {
                marketDataRequestReject.decode(input, offset, length);
                return marketDataRequestReject.toString();
            }

            if (messageType == 99L)
            {
                securityDefinitionRequest.decode(input, offset, length);
                return securityDefinitionRequest.toString();
            }

            if (messageType == 100L)
            {
                securityDefinition.decode(input, offset, length);
                return securityDefinition.toString();
            }

            if (messageType == 118L)
            {
                securityTypeRequest.decode(input, offset, length);
                return securityTypeRequest.toString();
            }

            if (messageType == 119L)
            {
                securityTypes.decode(input, offset, length);
                return securityTypes.toString();
            }

            if (messageType == 120L)
            {
                securityListRequest.decode(input, offset, length);
                return securityListRequest.toString();
            }

            if (messageType == 121L)
            {
                securityList.decode(input, offset, length);
                return securityList.toString();
            }

            if (messageType == 122L)
            {
                derivativeSecurityListRequest.decode(input, offset, length);
                return derivativeSecurityListRequest.toString();
            }

            if (messageType == 16705L)
            {
                derivativeSecurityList.decode(input, offset, length);
                return derivativeSecurityList.toString();
            }

            if (messageType == 101L)
            {
                securityStatusRequest.decode(input, offset, length);
                return securityStatusRequest.toString();
            }

            if (messageType == 102L)
            {
                securityStatus.decode(input, offset, length);
                return securityStatus.toString();
            }

            if (messageType == 103L)
            {
                tradingSessionStatusRequest.decode(input, offset, length);
                return tradingSessionStatusRequest.toString();
            }

            if (messageType == 104L)
            {
                tradingSessionStatus.decode(input, offset, length);
                return tradingSessionStatus.toString();
            }

            if (messageType == 68L)
            {
                newOrderSingle.decode(input, offset, length);
                return newOrderSingle.toString();
            }

            if (messageType == 56L)
            {
                executionReport.decode(input, offset, length);
                return executionReport.toString();
            }

            if (messageType == 81L)
            {
                dontKnowTrade.decode(input, offset, length);
                return dontKnowTrade.toString();
            }

            if (messageType == 71L)
            {
                orderCancelReplaceRequest.decode(input, offset, length);
                return orderCancelReplaceRequest.toString();
            }

            if (messageType == 70L)
            {
                orderCancelRequest.decode(input, offset, length);
                return orderCancelRequest.toString();
            }

            if (messageType == 57L)
            {
                orderCancelReject.decode(input, offset, length);
                return orderCancelReject.toString();
            }

            if (messageType == 72L)
            {
                orderStatusRequest.decode(input, offset, length);
                return orderStatusRequest.toString();
            }

            if (messageType == 113L)
            {
                orderMassCancelRequest.decode(input, offset, length);
                return orderMassCancelRequest.toString();
            }

            if (messageType == 114L)
            {
                orderMassCancelReport.decode(input, offset, length);
                return orderMassCancelReport.toString();
            }

            if (messageType == 17985L)
            {
                orderMassStatusRequest.decode(input, offset, length);
                return orderMassStatusRequest.toString();
            }

            if (messageType == 115L)
            {
                newOrderCross.decode(input, offset, length);
                return newOrderCross.toString();
            }

            if (messageType == 116L)
            {
                crossOrderCancelReplaceRequest.decode(input, offset, length);
                return crossOrderCancelReplaceRequest.toString();
            }

            if (messageType == 117L)
            {
                crossOrderCancelRequest.decode(input, offset, length);
                return crossOrderCancelRequest.toString();
            }

            if (messageType == 16961L)
            {
                newOrderMultileg.decode(input, offset, length);
                return newOrderMultileg.toString();
            }

            if (messageType == 17217L)
            {
                multilegOrderCancelReplaceRequest.decode(input, offset, length);
                return multilegOrderCancelReplaceRequest.toString();
            }

            if (messageType == 107L)
            {
                bidRequest.decode(input, offset, length);
                return bidRequest.toString();
            }

            if (messageType == 108L)
            {
                bidResponse.decode(input, offset, length);
                return bidResponse.toString();
            }

            if (messageType == 69L)
            {
                newOrderList.decode(input, offset, length);
                return newOrderList.toString();
            }

            if (messageType == 109L)
            {
                listStrikePrice.decode(input, offset, length);
                return listStrikePrice.toString();
            }

            if (messageType == 78L)
            {
                listStatus.decode(input, offset, length);
                return listStatus.toString();
            }

            if (messageType == 76L)
            {
                listExecute.decode(input, offset, length);
                return listExecute.toString();
            }

            if (messageType == 75L)
            {
                listCancelRequest.decode(input, offset, length);
                return listCancelRequest.toString();
            }

            if (messageType == 77L)
            {
                listStatusRequest.decode(input, offset, length);
                return listStatusRequest.toString();
            }

            if (messageType == 74L)
            {
                allocationInstruction.decode(input, offset, length);
                return allocationInstruction.toString();
            }

            if (messageType == 80L)
            {
                allocationInstructionAck.decode(input, offset, length);
                return allocationInstructionAck.toString();
            }

            if (messageType == 21313L)
            {
                allocationReport.decode(input, offset, length);
                return allocationReport.toString();
            }

            if (messageType == 21569L)
            {
                allocationReportAck.decode(input, offset, length);
                return allocationReportAck.toString();
            }

            if (messageType == 19265L)
            {
                confirmation.decode(input, offset, length);
                return confirmation.toString();
            }

            if (messageType == 21825L)
            {
                confirmationAck.decode(input, offset, length);
                return confirmationAck.toString();
            }

            if (messageType == 18498L)
            {
                confirmationRequest.decode(input, offset, length);
                return confirmationRequest.toString();
            }

            if (messageType == 84L)
            {
                settlementInstructions.decode(input, offset, length);
                return settlementInstructions.toString();
            }

            if (messageType == 22081L)
            {
                settlementInstructionRequest.decode(input, offset, length);
                return settlementInstructionRequest.toString();
            }

            if (messageType == 17473L)
            {
                tradeCaptureReportRequest.decode(input, offset, length);
                return tradeCaptureReportRequest.toString();
            }

            if (messageType == 20801L)
            {
                tradeCaptureReportRequestAck.decode(input, offset, length);
                return tradeCaptureReportRequestAck.toString();
            }

            if (messageType == 17729L)
            {
                tradeCaptureReport.decode(input, offset, length);
                return tradeCaptureReport.toString();
            }

            if (messageType == 21057L)
            {
                tradeCaptureReportAck.decode(input, offset, length);
                return tradeCaptureReportAck.toString();
            }

            if (messageType == 111L)
            {
                registrationInstructions.decode(input, offset, length);
                return registrationInstructions.toString();
            }

            if (messageType == 112L)
            {
                registrationInstructionsResponse.decode(input, offset, length);
                return registrationInstructionsResponse.toString();
            }

            if (messageType == 19521L)
            {
                positionMaintenanceRequest.decode(input, offset, length);
                return positionMaintenanceRequest.toString();
            }

            if (messageType == 19777L)
            {
                positionMaintenanceReport.decode(input, offset, length);
                return positionMaintenanceReport.toString();
            }

            if (messageType == 20033L)
            {
                requestForPositions.decode(input, offset, length);
                return requestForPositions.toString();
            }

            if (messageType == 20289L)
            {
                requestForPositionsAck.decode(input, offset, length);
                return requestForPositionsAck.toString();
            }

            if (messageType == 20545L)
            {
                positionReport.decode(input, offset, length);
                return positionReport.toString();
            }

            if (messageType == 22337L)
            {
                assignmentReport.decode(input, offset, length);
                return assignmentReport.toString();
            }

            if (messageType == 22593L)
            {
                collateralRequest.decode(input, offset, length);
                return collateralRequest.toString();
            }

            if (messageType == 22849L)
            {
                collateralAssignment.decode(input, offset, length);
                return collateralAssignment.toString();
            }

            if (messageType == 23105L)
            {
                collateralResponse.decode(input, offset, length);
                return collateralResponse.toString();
            }

            if (messageType == 16706L)
            {
                collateralReport.decode(input, offset, length);
                return collateralReport.toString();
            }

            if (messageType == 16962L)
            {
                collateralInquiry.decode(input, offset, length);
                return collateralInquiry.toString();
            }

            if (messageType == 17218L)
            {
                networkStatusRequest.decode(input, offset, length);
                return networkStatusRequest.toString();
            }

            if (messageType == 17474L)
            {
                networkStatusResponse.decode(input, offset, length);
                return networkStatusResponse.toString();
            }

            if (messageType == 18242L)
            {
                collateralInquiryAck.decode(input, offset, length);
                return collateralInquiryAck.toString();
            }

            else
            {
                throw new IllegalArgumentException("Unknown Message Type: " + messageType);
            }
    }

}
