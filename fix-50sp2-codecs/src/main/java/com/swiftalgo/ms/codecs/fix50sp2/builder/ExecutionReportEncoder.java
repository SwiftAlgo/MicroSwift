/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
import uk.co.real_logic.artio.fields.DecimalFloat;
import uk.co.real_logic.artio.util.MutableAsciiBuffer;
import uk.co.real_logic.artio.util.AsciiBuffer;
import uk.co.real_logic.artio.fields.LocalMktDateEncoder;
import uk.co.real_logic.artio.fields.UtcTimestampEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import uk.co.real_logic.artio.dictionary.CharArraySet;
import org.agrona.collections.IntHashSet;
import org.agrona.collections.IntHashSet.IntIterator;
import uk.co.real_logic.artio.EncodingException;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;


public class ExecutionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 56L;
    }

    public ExecutionReportEncoder()
    {
        header.msgType("8");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int secondaryOrderIDHeaderLength = 4;
    private static final byte[] secondaryOrderIDHeader = new byte[] {49, 57, 56, (byte) '='};

    private static final int secondaryClOrdIDHeaderLength = 4;
    private static final byte[] secondaryClOrdIDHeader = new byte[] {53, 50, 54, (byte) '='};

    private static final int secondaryExecIDHeaderLength = 4;
    private static final byte[] secondaryExecIDHeader = new byte[] {53, 50, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int origClOrdIDHeaderLength = 3;
    private static final byte[] origClOrdIDHeader = new byte[] {52, 49, (byte) '='};

    private static final int clOrdLinkIDHeaderLength = 4;
    private static final byte[] clOrdLinkIDHeader = new byte[] {53, 56, 51, (byte) '='};

    private static final int quoteRespIDHeaderLength = 4;
    private static final byte[] quoteRespIDHeader = new byte[] {54, 57, 51, (byte) '='};

    private static final int ordStatusReqIDHeaderLength = 4;
    private static final byte[] ordStatusReqIDHeader = new byte[] {55, 57, 48, (byte) '='};

    private static final int massStatusReqIDHeaderLength = 4;
    private static final byte[] massStatusReqIDHeader = new byte[] {53, 56, 52, (byte) '='};

    private static final int hostCrossIDHeaderLength = 4;
    private static final byte[] hostCrossIDHeader = new byte[] {57, 54, 49, (byte) '='};

    private static final int totNumReportsHeaderLength = 4;
    private static final byte[] totNumReportsHeader = new byte[] {57, 49, 49, (byte) '='};

    private static final int lastRptRequestedHeaderLength = 4;
    private static final byte[] lastRptRequestedHeader = new byte[] {57, 49, 50, (byte) '='};

    private static final int tradeOriginationDateHeaderLength = 4;
    private static final byte[] tradeOriginationDateHeader = new byte[] {50, 50, 57, (byte) '='};

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int crossIDHeaderLength = 4;
    private static final byte[] crossIDHeader = new byte[] {53, 52, 56, (byte) '='};

    private static final int origCrossIDHeaderLength = 4;
    private static final byte[] origCrossIDHeader = new byte[] {53, 53, 49, (byte) '='};

    private static final int crossTypeHeaderLength = 4;
    private static final byte[] crossTypeHeader = new byte[] {53, 52, 57, (byte) '='};

    private static final int trdMatchIDHeaderLength = 4;
    private static final byte[] trdMatchIDHeader = new byte[] {56, 56, 48, (byte) '='};

    private static final int execIDHeaderLength = 3;
    private static final byte[] execIDHeader = new byte[] {49, 55, (byte) '='};

    private static final int execRefIDHeaderLength = 3;
    private static final byte[] execRefIDHeader = new byte[] {49, 57, (byte) '='};

    private static final int execTypeHeaderLength = 4;
    private static final byte[] execTypeHeader = new byte[] {49, 53, 48, (byte) '='};

    private static final int ordStatusHeaderLength = 3;
    private static final byte[] ordStatusHeader = new byte[] {51, 57, (byte) '='};

    private static final int workingIndicatorHeaderLength = 4;
    private static final byte[] workingIndicatorHeader = new byte[] {54, 51, 54, (byte) '='};

    private static final int ordRejReasonHeaderLength = 4;
    private static final byte[] ordRejReasonHeader = new byte[] {49, 48, 51, (byte) '='};

    private static final int execRestatementReasonHeaderLength = 4;
    private static final byte[] execRestatementReasonHeader = new byte[] {51, 55, 56, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int dayBookingInstHeaderLength = 4;
    private static final byte[] dayBookingInstHeader = new byte[] {53, 56, 57, (byte) '='};

    private static final int bookingUnitHeaderLength = 4;
    private static final byte[] bookingUnitHeader = new byte[] {53, 57, 48, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int matchTypeHeaderLength = 4;
    private static final byte[] matchTypeHeader = new byte[] {53, 55, 52, (byte) '='};

    private static final int orderCategoryHeaderLength = 5;
    private static final byte[] orderCategoryHeader = new byte[] {49, 49, 49, 53, (byte) '='};

    private static final int cashMarginHeaderLength = 4;
    private static final byte[] cashMarginHeader = new byte[] {53, 52, 52, (byte) '='};

    private static final int clearingFeeIndicatorHeaderLength = 4;
    private static final byte[] clearingFeeIndicatorHeader = new byte[] {54, 51, 53, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int qtyTypeHeaderLength = 4;
    private static final byte[] qtyTypeHeader = new byte[] {56, 53, 52, (byte) '='};

    private static final int lotTypeHeaderLength = 5;
    private static final byte[] lotTypeHeader = new byte[] {49, 48, 57, 51, (byte) '='};

    private static final int ordTypeHeaderLength = 3;
    private static final byte[] ordTypeHeader = new byte[] {52, 48, (byte) '='};

    private static final int priceTypeHeaderLength = 4;
    private static final byte[] priceTypeHeader = new byte[] {52, 50, 51, (byte) '='};

    private static final int priceHeaderLength = 3;
    private static final byte[] priceHeader = new byte[] {52, 52, (byte) '='};

    private static final int priceProtectionScopeHeaderLength = 5;
    private static final byte[] priceProtectionScopeHeader = new byte[] {49, 48, 57, 50, (byte) '='};

    private static final int stopPxHeaderLength = 3;
    private static final byte[] stopPxHeader = new byte[] {57, 57, (byte) '='};

    private static final int peggedPriceHeaderLength = 4;
    private static final byte[] peggedPriceHeader = new byte[] {56, 51, 57, (byte) '='};

    private static final int peggedRefPriceHeaderLength = 5;
    private static final byte[] peggedRefPriceHeader = new byte[] {49, 48, 57, 53, (byte) '='};

    private static final int discretionPriceHeaderLength = 4;
    private static final byte[] discretionPriceHeader = new byte[] {56, 52, 53, (byte) '='};

    private static final int targetStrategyHeaderLength = 4;
    private static final byte[] targetStrategyHeader = new byte[] {56, 52, 55, (byte) '='};

    private static final int targetStrategyParametersHeaderLength = 4;
    private static final byte[] targetStrategyParametersHeader = new byte[] {56, 52, 56, (byte) '='};

    private static final int participationRateHeaderLength = 4;
    private static final byte[] participationRateHeader = new byte[] {56, 52, 57, (byte) '='};

    private static final int targetStrategyPerformanceHeaderLength = 4;
    private static final byte[] targetStrategyPerformanceHeader = new byte[] {56, 53, 48, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int solicitedFlagHeaderLength = 4;
    private static final byte[] solicitedFlagHeader = new byte[] {51, 55, 55, (byte) '='};

    private static final int timeInForceHeaderLength = 3;
    private static final byte[] timeInForceHeader = new byte[] {53, 57, (byte) '='};

    private static final int effectiveTimeHeaderLength = 4;
    private static final byte[] effectiveTimeHeader = new byte[] {49, 54, 56, (byte) '='};

    private static final int expireDateHeaderLength = 4;
    private static final byte[] expireDateHeader = new byte[] {52, 51, 50, (byte) '='};

    private static final int expireTimeHeaderLength = 4;
    private static final byte[] expireTimeHeader = new byte[] {49, 50, 54, (byte) '='};

    private static final int execInstHeaderLength = 3;
    private static final byte[] execInstHeader = new byte[] {49, 56, (byte) '='};

    private static final int aggressorIndicatorHeaderLength = 5;
    private static final byte[] aggressorIndicatorHeader = new byte[] {49, 48, 53, 55, (byte) '='};

    private static final int orderCapacityHeaderLength = 4;
    private static final byte[] orderCapacityHeader = new byte[] {53, 50, 56, (byte) '='};

    private static final int orderRestrictionsHeaderLength = 4;
    private static final byte[] orderRestrictionsHeader = new byte[] {53, 50, 57, (byte) '='};

    private static final int preTradeAnonymityHeaderLength = 5;
    private static final byte[] preTradeAnonymityHeader = new byte[] {49, 48, 57, 49, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int lastQtyHeaderLength = 3;
    private static final byte[] lastQtyHeader = new byte[] {51, 50, (byte) '='};

    private static final int calculatedCcyLastQtyHeaderLength = 5;
    private static final byte[] calculatedCcyLastQtyHeader = new byte[] {49, 48, 53, 54, (byte) '='};

    private static final int lastSwapPointsHeaderLength = 5;
    private static final byte[] lastSwapPointsHeader = new byte[] {49, 48, 55, 49, (byte) '='};

    private static final int underlyingLastQtyHeaderLength = 4;
    private static final byte[] underlyingLastQtyHeader = new byte[] {54, 53, 50, (byte) '='};

    private static final int lastPxHeaderLength = 3;
    private static final byte[] lastPxHeader = new byte[] {51, 49, (byte) '='};

    private static final int underlyingLastPxHeaderLength = 4;
    private static final byte[] underlyingLastPxHeader = new byte[] {54, 53, 49, (byte) '='};

    private static final int lastParPxHeaderLength = 4;
    private static final byte[] lastParPxHeader = new byte[] {54, 54, 57, (byte) '='};

    private static final int lastSpotRateHeaderLength = 4;
    private static final byte[] lastSpotRateHeader = new byte[] {49, 57, 52, (byte) '='};

    private static final int lastForwardPointsHeaderLength = 4;
    private static final byte[] lastForwardPointsHeader = new byte[] {49, 57, 53, (byte) '='};

    private static final int lastMktHeaderLength = 3;
    private static final byte[] lastMktHeader = new byte[] {51, 48, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int timeBracketHeaderLength = 4;
    private static final byte[] timeBracketHeader = new byte[] {57, 52, 51, (byte) '='};

    private static final int lastCapacityHeaderLength = 3;
    private static final byte[] lastCapacityHeader = new byte[] {50, 57, (byte) '='};

    private static final int leavesQtyHeaderLength = 4;
    private static final byte[] leavesQtyHeader = new byte[] {49, 53, 49, (byte) '='};

    private static final int cumQtyHeaderLength = 3;
    private static final byte[] cumQtyHeader = new byte[] {49, 52, (byte) '='};

    private static final int avgPxHeaderLength = 2;
    private static final byte[] avgPxHeader = new byte[] {54, (byte) '='};

    private static final int dayOrderQtyHeaderLength = 4;
    private static final byte[] dayOrderQtyHeader = new byte[] {52, 50, 52, (byte) '='};

    private static final int dayCumQtyHeaderLength = 4;
    private static final byte[] dayCumQtyHeader = new byte[] {52, 50, 53, (byte) '='};

    private static final int dayAvgPxHeaderLength = 4;
    private static final byte[] dayAvgPxHeader = new byte[] {52, 50, 54, (byte) '='};

    private static final int totNoFillsHeaderLength = 5;
    private static final byte[] totNoFillsHeader = new byte[] {49, 51, 54, 49, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int gTBookingInstHeaderLength = 4;
    private static final byte[] gTBookingInstHeader = new byte[] {52, 50, 55, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int reportToExchHeaderLength = 4;
    private static final byte[] reportToExchHeader = new byte[] {49, 49, 51, (byte) '='};

    private static final int grossTradeAmtHeaderLength = 4;
    private static final byte[] grossTradeAmtHeader = new byte[] {51, 56, 49, (byte) '='};

    private static final int numDaysInterestHeaderLength = 4;
    private static final byte[] numDaysInterestHeader = new byte[] {49, 53, 55, (byte) '='};

    private static final int exDateHeaderLength = 4;
    private static final byte[] exDateHeader = new byte[] {50, 51, 48, (byte) '='};

    private static final int accruedInterestRateHeaderLength = 4;
    private static final byte[] accruedInterestRateHeader = new byte[] {49, 53, 56, (byte) '='};

    private static final int accruedInterestAmtHeaderLength = 4;
    private static final byte[] accruedInterestAmtHeader = new byte[] {49, 53, 57, (byte) '='};

    private static final int interestAtMaturityHeaderLength = 4;
    private static final byte[] interestAtMaturityHeader = new byte[] {55, 51, 56, (byte) '='};

    private static final int endAccruedInterestAmtHeaderLength = 4;
    private static final byte[] endAccruedInterestAmtHeader = new byte[] {57, 50, 48, (byte) '='};

    private static final int startCashHeaderLength = 4;
    private static final byte[] startCashHeader = new byte[] {57, 50, 49, (byte) '='};

    private static final int endCashHeaderLength = 4;
    private static final byte[] endCashHeader = new byte[] {57, 50, 50, (byte) '='};

    private static final int tradedFlatSwitchHeaderLength = 4;
    private static final byte[] tradedFlatSwitchHeader = new byte[] {50, 53, 56, (byte) '='};

    private static final int basisFeatureDateHeaderLength = 4;
    private static final byte[] basisFeatureDateHeader = new byte[] {50, 53, 57, (byte) '='};

    private static final int basisFeaturePriceHeaderLength = 4;
    private static final byte[] basisFeaturePriceHeader = new byte[] {50, 54, 48, (byte) '='};

    private static final int concessionHeaderLength = 4;
    private static final byte[] concessionHeader = new byte[] {50, 51, 56, (byte) '='};

    private static final int totalTakedownHeaderLength = 4;
    private static final byte[] totalTakedownHeader = new byte[] {50, 51, 55, (byte) '='};

    private static final int netMoneyHeaderLength = 4;
    private static final byte[] netMoneyHeader = new byte[] {49, 49, 56, (byte) '='};

    private static final int settlCurrAmtHeaderLength = 4;
    private static final byte[] settlCurrAmtHeader = new byte[] {49, 49, 57, (byte) '='};

    private static final int settlCurrencyHeaderLength = 4;
    private static final byte[] settlCurrencyHeader = new byte[] {49, 50, 48, (byte) '='};

    private static final int settlCurrFxRateHeaderLength = 4;
    private static final byte[] settlCurrFxRateHeader = new byte[] {49, 53, 53, (byte) '='};

    private static final int settlCurrFxRateCalcHeaderLength = 4;
    private static final byte[] settlCurrFxRateCalcHeader = new byte[] {49, 53, 54, (byte) '='};

    private static final int handlInstHeaderLength = 3;
    private static final byte[] handlInstHeader = new byte[] {50, 49, (byte) '='};

    private static final int minQtyHeaderLength = 4;
    private static final byte[] minQtyHeader = new byte[] {49, 49, 48, (byte) '='};

    private static final int matchIncrementHeaderLength = 5;
    private static final byte[] matchIncrementHeader = new byte[] {49, 48, 56, 57, (byte) '='};

    private static final int maxPriceLevelsHeaderLength = 5;
    private static final byte[] maxPriceLevelsHeader = new byte[] {49, 48, 57, 48, (byte) '='};

    private static final int maxFloorHeaderLength = 4;
    private static final byte[] maxFloorHeader = new byte[] {49, 49, 49, (byte) '='};

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int maxShowHeaderLength = 4;
    private static final byte[] maxShowHeader = new byte[] {50, 49, 48, (byte) '='};

    private static final int bookingTypeHeaderLength = 4;
    private static final byte[] bookingTypeHeader = new byte[] {55, 55, 53, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int settlDate2HeaderLength = 4;
    private static final byte[] settlDate2Header = new byte[] {49, 57, 51, (byte) '='};

    private static final int orderQty2HeaderLength = 4;
    private static final byte[] orderQty2Header = new byte[] {49, 57, 50, (byte) '='};

    private static final int lastForwardPoints2HeaderLength = 4;
    private static final byte[] lastForwardPoints2Header = new byte[] {54, 52, 49, (byte) '='};

    private static final int multiLegReportingTypeHeaderLength = 4;
    private static final byte[] multiLegReportingTypeHeader = new byte[] {52, 52, 50, (byte) '='};

    private static final int cancellationRightsHeaderLength = 4;
    private static final byte[] cancellationRightsHeader = new byte[] {52, 56, 48, (byte) '='};

    private static final int moneyLaunderingStatusHeaderLength = 4;
    private static final byte[] moneyLaunderingStatusHeader = new byte[] {52, 56, 49, (byte) '='};

    private static final int registIDHeaderLength = 4;
    private static final byte[] registIDHeader = new byte[] {53, 49, 51, (byte) '='};

    private static final int designationHeaderLength = 4;
    private static final byte[] designationHeader = new byte[] {52, 57, 52, (byte) '='};

    private static final int transBkdTimeHeaderLength = 4;
    private static final byte[] transBkdTimeHeader = new byte[] {52, 56, 51, (byte) '='};

    private static final int execValuationPointHeaderLength = 4;
    private static final byte[] execValuationPointHeader = new byte[] {53, 49, 53, (byte) '='};

    private static final int execPriceTypeHeaderLength = 4;
    private static final byte[] execPriceTypeHeader = new byte[] {52, 56, 52, (byte) '='};

    private static final int execPriceAdjustmentHeaderLength = 4;
    private static final byte[] execPriceAdjustmentHeader = new byte[] {52, 56, 53, (byte) '='};

    private static final int priorityIndicatorHeaderLength = 4;
    private static final byte[] priorityIndicatorHeader = new byte[] {54, 51, 56, (byte) '='};

    private static final int priceImprovementHeaderLength = 4;
    private static final byte[] priceImprovementHeader = new byte[] {54, 51, 57, (byte) '='};

    private static final int lastLiquidityIndHeaderLength = 4;
    private static final byte[] lastLiquidityIndHeader = new byte[] {56, 53, 49, (byte) '='};

    private static final int copyMsgIndicatorHeaderLength = 4;
    private static final byte[] copyMsgIndicatorHeader = new byte[] {55, 57, 55, (byte) '='};

    private static final int dividendYieldHeaderLength = 5;
    private static final byte[] dividendYieldHeader = new byte[] {49, 51, 56, 48, (byte) '='};

    private static final int manualOrderIndicatorHeaderLength = 5;
    private static final byte[] manualOrderIndicatorHeader = new byte[] {49, 48, 50, 56, (byte) '='};

    private static final int custDirectedOrderHeaderLength = 5;
    private static final byte[] custDirectedOrderHeader = new byte[] {49, 48, 50, 57, (byte) '='};

    private static final int receivedDeptIDHeaderLength = 5;
    private static final byte[] receivedDeptIDHeader = new byte[] {49, 48, 51, 48, (byte) '='};

    private static final int custOrderHandlingInstHeaderLength = 5;
    private static final byte[] custOrderHandlingInstHeader = new byte[] {49, 48, 51, 49, (byte) '='};

    private static final int orderHandlingInstSourceHeaderLength = 5;
    private static final byte[] orderHandlingInstSourceHeader = new byte[] {49, 48, 51, 50, (byte) '='};

    private static final int volatilityHeaderLength = 5;
    private static final byte[] volatilityHeader = new byte[] {49, 49, 56, 56, (byte) '='};

    private static final int timeToExpirationHeaderLength = 5;
    private static final byte[] timeToExpirationHeader = new byte[] {49, 49, 56, 57, (byte) '='};

    private static final int riskFreeRateHeaderLength = 5;
    private static final byte[] riskFreeRateHeader = new byte[] {49, 49, 57, 48, (byte) '='};

    private static final int priceDeltaHeaderLength = 4;
    private static final byte[] priceDeltaHeader = new byte[] {56, 49, 49, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public ExecutionReportEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public ExecutionReportEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public ExecutionReportEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    public ExecutionReportEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public ExecutionReportEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public ExecutionReportEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryOrderID = new UnsafeBuffer();

    private int secondaryOrderIDOffset = 0;

    private int secondaryOrderIDLength = 0;

    public ExecutionReportEncoder secondaryOrderID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryOrderID(final DirectBuffer value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryOrderID(final DirectBuffer value)
    {
        return secondaryOrderID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder secondaryOrderID(final byte[] value, final int offset, final int length)
    {
        secondaryOrderID.wrap(value);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryOrderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryOrderID, value, offset, length);
        secondaryOrderIDOffset = offset;
        secondaryOrderIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryOrderID(final byte[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryOrderID(final byte[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public boolean hasSecondaryOrderID()
    {
        return secondaryOrderIDLength > 0;
    }

    public MutableDirectBuffer secondaryOrderID()
    {
        return secondaryOrderID;
    }

    public String secondaryOrderIDAsString()
    {
        return secondaryOrderID.getStringWithoutLengthAscii(secondaryOrderIDOffset, secondaryOrderIDLength);
    }

    public ExecutionReportEncoder secondaryOrderID(final CharSequence value)
    {
        toBytes(value, secondaryOrderID);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder secondaryOrderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryOrderID.wrap(buffer);
            secondaryOrderIDOffset = value.offset();
            secondaryOrderIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder secondaryOrderID(final char[] value)
    {
        return secondaryOrderID(value, 0, value.length);
    }

    public ExecutionReportEncoder secondaryOrderID(final char[] value, final int length)
    {
        return secondaryOrderID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryOrderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryOrderID, offset, length);
        secondaryOrderIDOffset = 0;
        secondaryOrderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryClOrdID = new UnsafeBuffer();

    private int secondaryClOrdIDOffset = 0;

    private int secondaryClOrdIDLength = 0;

    public ExecutionReportEncoder secondaryClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryClOrdID(final DirectBuffer value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryClOrdID(final DirectBuffer value)
    {
        return secondaryClOrdID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder secondaryClOrdID(final byte[] value, final int offset, final int length)
    {
        secondaryClOrdID.wrap(value);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryClOrdID, value, offset, length);
        secondaryClOrdIDOffset = offset;
        secondaryClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryClOrdID(final byte[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryClOrdID(final byte[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public boolean hasSecondaryClOrdID()
    {
        return secondaryClOrdIDLength > 0;
    }

    public MutableDirectBuffer secondaryClOrdID()
    {
        return secondaryClOrdID;
    }

    public String secondaryClOrdIDAsString()
    {
        return secondaryClOrdID.getStringWithoutLengthAscii(secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }

    public ExecutionReportEncoder secondaryClOrdID(final CharSequence value)
    {
        toBytes(value, secondaryClOrdID);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder secondaryClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryClOrdID.wrap(buffer);
            secondaryClOrdIDOffset = value.offset();
            secondaryClOrdIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder secondaryClOrdID(final char[] value)
    {
        return secondaryClOrdID(value, 0, value.length);
    }

    public ExecutionReportEncoder secondaryClOrdID(final char[] value, final int length)
    {
        return secondaryClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryClOrdID, offset, length);
        secondaryClOrdIDOffset = 0;
        secondaryClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer secondaryExecID = new UnsafeBuffer();

    private int secondaryExecIDOffset = 0;

    private int secondaryExecIDLength = 0;

    public ExecutionReportEncoder secondaryExecID(final DirectBuffer value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryExecID(final DirectBuffer value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryExecID(final DirectBuffer value)
    {
        return secondaryExecID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder secondaryExecID(final byte[] value, final int offset, final int length)
    {
        secondaryExecID.wrap(value);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(secondaryExecID, value, offset, length);
        secondaryExecIDOffset = offset;
        secondaryExecIDLength = length;
        return this;
    }

    public ExecutionReportEncoder secondaryExecID(final byte[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryExecID(final byte[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public boolean hasSecondaryExecID()
    {
        return secondaryExecIDLength > 0;
    }

    public MutableDirectBuffer secondaryExecID()
    {
        return secondaryExecID;
    }

    public String secondaryExecIDAsString()
    {
        return secondaryExecID.getStringWithoutLengthAscii(secondaryExecIDOffset, secondaryExecIDLength);
    }

    public ExecutionReportEncoder secondaryExecID(final CharSequence value)
    {
        toBytes(value, secondaryExecID);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder secondaryExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            secondaryExecID.wrap(buffer);
            secondaryExecIDOffset = value.offset();
            secondaryExecIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder secondaryExecID(final char[] value)
    {
        return secondaryExecID(value, 0, value.length);
    }

    public ExecutionReportEncoder secondaryExecID(final char[] value, final int length)
    {
        return secondaryExecID(value, 0, length);
    }

    public ExecutionReportEncoder secondaryExecID(final char[] value, final int offset, final int length)
    {
        toBytes(value, secondaryExecID, offset, length);
        secondaryExecIDOffset = 0;
        secondaryExecIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public ExecutionReportEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public ExecutionReportEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public ExecutionReportEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origClOrdID = new UnsafeBuffer();

    private int origClOrdIDOffset = 0;

    private int origClOrdIDLength = 0;

    public ExecutionReportEncoder origClOrdID(final DirectBuffer value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origClOrdID(final DirectBuffer value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder origClOrdID(final DirectBuffer value)
    {
        return origClOrdID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder origClOrdID(final byte[] value, final int offset, final int length)
    {
        origClOrdID.wrap(value);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origClOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origClOrdID, value, offset, length);
        origClOrdIDOffset = offset;
        origClOrdIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origClOrdID(final byte[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder origClOrdID(final byte[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public boolean hasOrigClOrdID()
    {
        return origClOrdIDLength > 0;
    }

    public MutableDirectBuffer origClOrdID()
    {
        return origClOrdID;
    }

    public String origClOrdIDAsString()
    {
        return origClOrdID.getStringWithoutLengthAscii(origClOrdIDOffset, origClOrdIDLength);
    }

    public ExecutionReportEncoder origClOrdID(final CharSequence value)
    {
        toBytes(value, origClOrdID);
        origClOrdIDOffset = 0;
        origClOrdIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder origClOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origClOrdID.wrap(buffer);
            origClOrdIDOffset = value.offset();
            origClOrdIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder origClOrdID(final char[] value)
    {
        return origClOrdID(value, 0, value.length);
    }

    public ExecutionReportEncoder origClOrdID(final char[] value, final int length)
    {
        return origClOrdID(value, 0, length);
    }

    public ExecutionReportEncoder origClOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origClOrdID, offset, length);
        origClOrdIDOffset = 0;
        origClOrdIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdLinkID = new UnsafeBuffer();

    private int clOrdLinkIDOffset = 0;

    private int clOrdLinkIDLength = 0;

    public ExecutionReportEncoder clOrdLinkID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdLinkID(final DirectBuffer value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdLinkID(final DirectBuffer value)
    {
        return clOrdLinkID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder clOrdLinkID(final byte[] value, final int offset, final int length)
    {
        clOrdLinkID.wrap(value);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdLinkIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdLinkID, value, offset, length);
        clOrdLinkIDOffset = offset;
        clOrdLinkIDLength = length;
        return this;
    }

    public ExecutionReportEncoder clOrdLinkID(final byte[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdLinkID(final byte[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public boolean hasClOrdLinkID()
    {
        return clOrdLinkIDLength > 0;
    }

    public MutableDirectBuffer clOrdLinkID()
    {
        return clOrdLinkID;
    }

    public String clOrdLinkIDAsString()
    {
        return clOrdLinkID.getStringWithoutLengthAscii(clOrdLinkIDOffset, clOrdLinkIDLength);
    }

    public ExecutionReportEncoder clOrdLinkID(final CharSequence value)
    {
        toBytes(value, clOrdLinkID);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder clOrdLinkID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdLinkID.wrap(buffer);
            clOrdLinkIDOffset = value.offset();
            clOrdLinkIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder clOrdLinkID(final char[] value)
    {
        return clOrdLinkID(value, 0, value.length);
    }

    public ExecutionReportEncoder clOrdLinkID(final char[] value, final int length)
    {
        return clOrdLinkID(value, 0, length);
    }

    public ExecutionReportEncoder clOrdLinkID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdLinkID, offset, length);
        clOrdLinkIDOffset = 0;
        clOrdLinkIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteRespID = new UnsafeBuffer();

    private int quoteRespIDOffset = 0;

    private int quoteRespIDLength = 0;

    public ExecutionReportEncoder quoteRespID(final DirectBuffer value, final int offset, final int length)
    {
        quoteRespID.wrap(value);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public ExecutionReportEncoder quoteRespID(final DirectBuffer value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public ExecutionReportEncoder quoteRespID(final DirectBuffer value)
    {
        return quoteRespID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder quoteRespID(final byte[] value, final int offset, final int length)
    {
        quoteRespID.wrap(value);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public ExecutionReportEncoder quoteRespIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteRespID, value, offset, length);
        quoteRespIDOffset = offset;
        quoteRespIDLength = length;
        return this;
    }

    public ExecutionReportEncoder quoteRespID(final byte[] value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public ExecutionReportEncoder quoteRespID(final byte[] value)
    {
        return quoteRespID(value, 0, value.length);
    }

    public boolean hasQuoteRespID()
    {
        return quoteRespIDLength > 0;
    }

    public MutableDirectBuffer quoteRespID()
    {
        return quoteRespID;
    }

    public String quoteRespIDAsString()
    {
        return quoteRespID.getStringWithoutLengthAscii(quoteRespIDOffset, quoteRespIDLength);
    }

    public ExecutionReportEncoder quoteRespID(final CharSequence value)
    {
        toBytes(value, quoteRespID);
        quoteRespIDOffset = 0;
        quoteRespIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder quoteRespID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteRespID.wrap(buffer);
            quoteRespIDOffset = value.offset();
            quoteRespIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder quoteRespID(final char[] value)
    {
        return quoteRespID(value, 0, value.length);
    }

    public ExecutionReportEncoder quoteRespID(final char[] value, final int length)
    {
        return quoteRespID(value, 0, length);
    }

    public ExecutionReportEncoder quoteRespID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteRespID, offset, length);
        quoteRespIDOffset = 0;
        quoteRespIDLength = length;
        return this;
    }

    private final MutableDirectBuffer ordStatusReqID = new UnsafeBuffer();

    private int ordStatusReqIDOffset = 0;

    private int ordStatusReqIDLength = 0;

    public ExecutionReportEncoder ordStatusReqID(final DirectBuffer value, final int offset, final int length)
    {
        ordStatusReqID.wrap(value);
        ordStatusReqIDOffset = offset;
        ordStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder ordStatusReqID(final DirectBuffer value, final int length)
    {
        return ordStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder ordStatusReqID(final DirectBuffer value)
    {
        return ordStatusReqID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder ordStatusReqID(final byte[] value, final int offset, final int length)
    {
        ordStatusReqID.wrap(value);
        ordStatusReqIDOffset = offset;
        ordStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder ordStatusReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(ordStatusReqID, value, offset, length);
        ordStatusReqIDOffset = offset;
        ordStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder ordStatusReqID(final byte[] value, final int length)
    {
        return ordStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder ordStatusReqID(final byte[] value)
    {
        return ordStatusReqID(value, 0, value.length);
    }

    public boolean hasOrdStatusReqID()
    {
        return ordStatusReqIDLength > 0;
    }

    public MutableDirectBuffer ordStatusReqID()
    {
        return ordStatusReqID;
    }

    public String ordStatusReqIDAsString()
    {
        return ordStatusReqID.getStringWithoutLengthAscii(ordStatusReqIDOffset, ordStatusReqIDLength);
    }

    public ExecutionReportEncoder ordStatusReqID(final CharSequence value)
    {
        toBytes(value, ordStatusReqID);
        ordStatusReqIDOffset = 0;
        ordStatusReqIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder ordStatusReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            ordStatusReqID.wrap(buffer);
            ordStatusReqIDOffset = value.offset();
            ordStatusReqIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder ordStatusReqID(final char[] value)
    {
        return ordStatusReqID(value, 0, value.length);
    }

    public ExecutionReportEncoder ordStatusReqID(final char[] value, final int length)
    {
        return ordStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder ordStatusReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, ordStatusReqID, offset, length);
        ordStatusReqIDOffset = 0;
        ordStatusReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer massStatusReqID = new UnsafeBuffer();

    private int massStatusReqIDOffset = 0;

    private int massStatusReqIDLength = 0;

    public ExecutionReportEncoder massStatusReqID(final DirectBuffer value, final int offset, final int length)
    {
        massStatusReqID.wrap(value);
        massStatusReqIDOffset = offset;
        massStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder massStatusReqID(final DirectBuffer value, final int length)
    {
        return massStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder massStatusReqID(final DirectBuffer value)
    {
        return massStatusReqID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder massStatusReqID(final byte[] value, final int offset, final int length)
    {
        massStatusReqID.wrap(value);
        massStatusReqIDOffset = offset;
        massStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder massStatusReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(massStatusReqID, value, offset, length);
        massStatusReqIDOffset = offset;
        massStatusReqIDLength = length;
        return this;
    }

    public ExecutionReportEncoder massStatusReqID(final byte[] value, final int length)
    {
        return massStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder massStatusReqID(final byte[] value)
    {
        return massStatusReqID(value, 0, value.length);
    }

    public boolean hasMassStatusReqID()
    {
        return massStatusReqIDLength > 0;
    }

    public MutableDirectBuffer massStatusReqID()
    {
        return massStatusReqID;
    }

    public String massStatusReqIDAsString()
    {
        return massStatusReqID.getStringWithoutLengthAscii(massStatusReqIDOffset, massStatusReqIDLength);
    }

    public ExecutionReportEncoder massStatusReqID(final CharSequence value)
    {
        toBytes(value, massStatusReqID);
        massStatusReqIDOffset = 0;
        massStatusReqIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder massStatusReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            massStatusReqID.wrap(buffer);
            massStatusReqIDOffset = value.offset();
            massStatusReqIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder massStatusReqID(final char[] value)
    {
        return massStatusReqID(value, 0, value.length);
    }

    public ExecutionReportEncoder massStatusReqID(final char[] value, final int length)
    {
        return massStatusReqID(value, 0, length);
    }

    public ExecutionReportEncoder massStatusReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, massStatusReqID, offset, length);
        massStatusReqIDOffset = 0;
        massStatusReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer hostCrossID = new UnsafeBuffer();

    private int hostCrossIDOffset = 0;

    private int hostCrossIDLength = 0;

    public ExecutionReportEncoder hostCrossID(final DirectBuffer value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder hostCrossID(final DirectBuffer value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public ExecutionReportEncoder hostCrossID(final DirectBuffer value)
    {
        return hostCrossID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder hostCrossID(final byte[] value, final int offset, final int length)
    {
        hostCrossID.wrap(value);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder hostCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(hostCrossID, value, offset, length);
        hostCrossIDOffset = offset;
        hostCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder hostCrossID(final byte[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public ExecutionReportEncoder hostCrossID(final byte[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public boolean hasHostCrossID()
    {
        return hostCrossIDLength > 0;
    }

    public MutableDirectBuffer hostCrossID()
    {
        return hostCrossID;
    }

    public String hostCrossIDAsString()
    {
        return hostCrossID.getStringWithoutLengthAscii(hostCrossIDOffset, hostCrossIDLength);
    }

    public ExecutionReportEncoder hostCrossID(final CharSequence value)
    {
        toBytes(value, hostCrossID);
        hostCrossIDOffset = 0;
        hostCrossIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder hostCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            hostCrossID.wrap(buffer);
            hostCrossIDOffset = value.offset();
            hostCrossIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder hostCrossID(final char[] value)
    {
        return hostCrossID(value, 0, value.length);
    }

    public ExecutionReportEncoder hostCrossID(final char[] value, final int length)
    {
        return hostCrossID(value, 0, length);
    }

    public ExecutionReportEncoder hostCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, hostCrossID, offset, length);
        hostCrossIDOffset = 0;
        hostCrossIDLength = length;
        return this;
    }

    private int totNumReports;

    private boolean hasTotNumReports;

    public boolean hasTotNumReports()
    {
        return hasTotNumReports;
    }

    public ExecutionReportEncoder totNumReports(int value)
    {
        totNumReports = value;
        hasTotNumReports = true;
        return this;
    }

    public int totNumReports()
    {
        return totNumReports;
    }

    private boolean lastRptRequested;

    private boolean hasLastRptRequested;

    public boolean hasLastRptRequested()
    {
        return hasLastRptRequested;
    }

    public ExecutionReportEncoder lastRptRequested(boolean value)
    {
        lastRptRequested = value;
        hasLastRptRequested = true;
        return this;
    }

    public boolean lastRptRequested()
    {
        return lastRptRequested;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer tradeOriginationDate = new UnsafeBuffer();

    private int tradeOriginationDateOffset = 0;

    private int tradeOriginationDateLength = 0;

    public ExecutionReportEncoder tradeOriginationDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeOriginationDate(final DirectBuffer value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public ExecutionReportEncoder tradeOriginationDate(final DirectBuffer value)
    {
        return tradeOriginationDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder tradeOriginationDate(final byte[] value, final int offset, final int length)
    {
        tradeOriginationDate.wrap(value);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeOriginationDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeOriginationDate, value, offset, length);
        tradeOriginationDateOffset = offset;
        tradeOriginationDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeOriginationDate(final byte[] value, final int length)
    {
        return tradeOriginationDate(value, 0, length);
    }

    public ExecutionReportEncoder tradeOriginationDate(final byte[] value)
    {
        return tradeOriginationDate(value, 0, value.length);
    }

    public boolean hasTradeOriginationDate()
    {
        return tradeOriginationDateLength > 0;
    }

    public MutableDirectBuffer tradeOriginationDate()
    {
        return tradeOriginationDate;
    }

    public String tradeOriginationDateAsString()
    {
        return tradeOriginationDate.getStringWithoutLengthAscii(tradeOriginationDateOffset, tradeOriginationDateLength);
    }

    private final ContraGrpEncoder contraGrp = new ContraGrpEncoder();
    public ContraGrpEncoder contraGrp()
    {
        return contraGrp;
    }

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public ExecutionReportEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ExecutionReportEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public ExecutionReportEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ExecutionReportEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ExecutionReportEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public ExecutionReportEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    public MutableDirectBuffer listID()
    {
        return listID;
    }

    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    public ExecutionReportEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public ExecutionReportEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public ExecutionReportEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private final MutableDirectBuffer crossID = new UnsafeBuffer();

    private int crossIDOffset = 0;

    private int crossIDLength = 0;

    public ExecutionReportEncoder crossID(final DirectBuffer value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder crossID(final DirectBuffer value, final int length)
    {
        return crossID(value, 0, length);
    }

    public ExecutionReportEncoder crossID(final DirectBuffer value)
    {
        return crossID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder crossID(final byte[] value, final int offset, final int length)
    {
        crossID.wrap(value);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder crossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(crossID, value, offset, length);
        crossIDOffset = offset;
        crossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder crossID(final byte[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public ExecutionReportEncoder crossID(final byte[] value)
    {
        return crossID(value, 0, value.length);
    }

    public boolean hasCrossID()
    {
        return crossIDLength > 0;
    }

    public MutableDirectBuffer crossID()
    {
        return crossID;
    }

    public String crossIDAsString()
    {
        return crossID.getStringWithoutLengthAscii(crossIDOffset, crossIDLength);
    }

    public ExecutionReportEncoder crossID(final CharSequence value)
    {
        toBytes(value, crossID);
        crossIDOffset = 0;
        crossIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder crossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            crossID.wrap(buffer);
            crossIDOffset = value.offset();
            crossIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder crossID(final char[] value)
    {
        return crossID(value, 0, value.length);
    }

    public ExecutionReportEncoder crossID(final char[] value, final int length)
    {
        return crossID(value, 0, length);
    }

    public ExecutionReportEncoder crossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, crossID, offset, length);
        crossIDOffset = 0;
        crossIDLength = length;
        return this;
    }

    private final MutableDirectBuffer origCrossID = new UnsafeBuffer();

    private int origCrossIDOffset = 0;

    private int origCrossIDLength = 0;

    public ExecutionReportEncoder origCrossID(final DirectBuffer value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origCrossID(final DirectBuffer value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public ExecutionReportEncoder origCrossID(final DirectBuffer value)
    {
        return origCrossID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder origCrossID(final byte[] value, final int offset, final int length)
    {
        origCrossID.wrap(value);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origCrossIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origCrossID, value, offset, length);
        origCrossIDOffset = offset;
        origCrossIDLength = length;
        return this;
    }

    public ExecutionReportEncoder origCrossID(final byte[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public ExecutionReportEncoder origCrossID(final byte[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public boolean hasOrigCrossID()
    {
        return origCrossIDLength > 0;
    }

    public MutableDirectBuffer origCrossID()
    {
        return origCrossID;
    }

    public String origCrossIDAsString()
    {
        return origCrossID.getStringWithoutLengthAscii(origCrossIDOffset, origCrossIDLength);
    }

    public ExecutionReportEncoder origCrossID(final CharSequence value)
    {
        toBytes(value, origCrossID);
        origCrossIDOffset = 0;
        origCrossIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder origCrossID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            origCrossID.wrap(buffer);
            origCrossIDOffset = value.offset();
            origCrossIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder origCrossID(final char[] value)
    {
        return origCrossID(value, 0, value.length);
    }

    public ExecutionReportEncoder origCrossID(final char[] value, final int length)
    {
        return origCrossID(value, 0, length);
    }

    public ExecutionReportEncoder origCrossID(final char[] value, final int offset, final int length)
    {
        toBytes(value, origCrossID, offset, length);
        origCrossIDOffset = 0;
        origCrossIDLength = length;
        return this;
    }

    private int crossType;

    private boolean hasCrossType;

    public boolean hasCrossType()
    {
        return hasCrossType;
    }

    public ExecutionReportEncoder crossType(int value)
    {
        crossType = value;
        hasCrossType = true;
        return this;
    }

    public int crossType()
    {
        return crossType;
    }

    public ExecutionReportEncoder crossType(CrossType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CrossType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: crossType Value: " + value );
            }
            if (value == CrossType.NULL_VAL)
            {
                return this;
            }
        }
        return crossType(value.representation());
    }

    private final MutableDirectBuffer trdMatchID = new UnsafeBuffer();

    private int trdMatchIDOffset = 0;

    private int trdMatchIDLength = 0;

    public ExecutionReportEncoder trdMatchID(final DirectBuffer value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public ExecutionReportEncoder trdMatchID(final DirectBuffer value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public ExecutionReportEncoder trdMatchID(final DirectBuffer value)
    {
        return trdMatchID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder trdMatchID(final byte[] value, final int offset, final int length)
    {
        trdMatchID.wrap(value);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public ExecutionReportEncoder trdMatchIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(trdMatchID, value, offset, length);
        trdMatchIDOffset = offset;
        trdMatchIDLength = length;
        return this;
    }

    public ExecutionReportEncoder trdMatchID(final byte[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public ExecutionReportEncoder trdMatchID(final byte[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public boolean hasTrdMatchID()
    {
        return trdMatchIDLength > 0;
    }

    public MutableDirectBuffer trdMatchID()
    {
        return trdMatchID;
    }

    public String trdMatchIDAsString()
    {
        return trdMatchID.getStringWithoutLengthAscii(trdMatchIDOffset, trdMatchIDLength);
    }

    public ExecutionReportEncoder trdMatchID(final CharSequence value)
    {
        toBytes(value, trdMatchID);
        trdMatchIDOffset = 0;
        trdMatchIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder trdMatchID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            trdMatchID.wrap(buffer);
            trdMatchIDOffset = value.offset();
            trdMatchIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder trdMatchID(final char[] value)
    {
        return trdMatchID(value, 0, value.length);
    }

    public ExecutionReportEncoder trdMatchID(final char[] value, final int length)
    {
        return trdMatchID(value, 0, length);
    }

    public ExecutionReportEncoder trdMatchID(final char[] value, final int offset, final int length)
    {
        toBytes(value, trdMatchID, offset, length);
        trdMatchIDOffset = 0;
        trdMatchIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execID = new UnsafeBuffer();

    private int execIDOffset = 0;

    private int execIDLength = 0;

    public ExecutionReportEncoder execID(final DirectBuffer value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execID(final DirectBuffer value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecutionReportEncoder execID(final DirectBuffer value)
    {
        return execID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder execID(final byte[] value, final int offset, final int length)
    {
        execID.wrap(value);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execID, value, offset, length);
        execIDOffset = offset;
        execIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execID(final byte[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecutionReportEncoder execID(final byte[] value)
    {
        return execID(value, 0, value.length);
    }

    public boolean hasExecID()
    {
        return execIDLength > 0;
    }

    public MutableDirectBuffer execID()
    {
        return execID;
    }

    public String execIDAsString()
    {
        return execID.getStringWithoutLengthAscii(execIDOffset, execIDLength);
    }

    public ExecutionReportEncoder execID(final CharSequence value)
    {
        toBytes(value, execID);
        execIDOffset = 0;
        execIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder execID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execID.wrap(buffer);
            execIDOffset = value.offset();
            execIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder execID(final char[] value)
    {
        return execID(value, 0, value.length);
    }

    public ExecutionReportEncoder execID(final char[] value, final int length)
    {
        return execID(value, 0, length);
    }

    public ExecutionReportEncoder execID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execID, offset, length);
        execIDOffset = 0;
        execIDLength = length;
        return this;
    }

    private final MutableDirectBuffer execRefID = new UnsafeBuffer();

    private int execRefIDOffset = 0;

    private int execRefIDLength = 0;

    public ExecutionReportEncoder execRefID(final DirectBuffer value, final int offset, final int length)
    {
        execRefID.wrap(value);
        execRefIDOffset = offset;
        execRefIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execRefID(final DirectBuffer value, final int length)
    {
        return execRefID(value, 0, length);
    }

    public ExecutionReportEncoder execRefID(final DirectBuffer value)
    {
        return execRefID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder execRefID(final byte[] value, final int offset, final int length)
    {
        execRefID.wrap(value);
        execRefIDOffset = offset;
        execRefIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execRefID, value, offset, length);
        execRefIDOffset = offset;
        execRefIDLength = length;
        return this;
    }

    public ExecutionReportEncoder execRefID(final byte[] value, final int length)
    {
        return execRefID(value, 0, length);
    }

    public ExecutionReportEncoder execRefID(final byte[] value)
    {
        return execRefID(value, 0, value.length);
    }

    public boolean hasExecRefID()
    {
        return execRefIDLength > 0;
    }

    public MutableDirectBuffer execRefID()
    {
        return execRefID;
    }

    public String execRefIDAsString()
    {
        return execRefID.getStringWithoutLengthAscii(execRefIDOffset, execRefIDLength);
    }

    public ExecutionReportEncoder execRefID(final CharSequence value)
    {
        toBytes(value, execRefID);
        execRefIDOffset = 0;
        execRefIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder execRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execRefID.wrap(buffer);
            execRefIDOffset = value.offset();
            execRefIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder execRefID(final char[] value)
    {
        return execRefID(value, 0, value.length);
    }

    public ExecutionReportEncoder execRefID(final char[] value, final int length)
    {
        return execRefID(value, 0, length);
    }

    public ExecutionReportEncoder execRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, execRefID, offset, length);
        execRefIDOffset = 0;
        execRefIDLength = length;
        return this;
    }

    private char execType;

    private boolean hasExecType;

    public boolean hasExecType()
    {
        return hasExecType;
    }

    public ExecutionReportEncoder execType(char value)
    {
        execType = value;
        hasExecType = true;
        return this;
    }

    public char execType()
    {
        return execType;
    }

    public ExecutionReportEncoder execType(ExecType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execType Value: " + value );
            }
            if (value == ExecType.NULL_VAL)
            {
                return this;
            }
        }
        return execType(value.representation());
    }

    private char ordStatus;

    private boolean hasOrdStatus;

    public boolean hasOrdStatus()
    {
        return hasOrdStatus;
    }

    public ExecutionReportEncoder ordStatus(char value)
    {
        ordStatus = value;
        hasOrdStatus = true;
        return this;
    }

    public char ordStatus()
    {
        return ordStatus;
    }

    public ExecutionReportEncoder ordStatus(OrdStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordStatus Value: " + value );
            }
            if (value == OrdStatus.NULL_VAL)
            {
                return this;
            }
        }
        return ordStatus(value.representation());
    }

    private boolean workingIndicator;

    private boolean hasWorkingIndicator;

    public boolean hasWorkingIndicator()
    {
        return hasWorkingIndicator;
    }

    public ExecutionReportEncoder workingIndicator(boolean value)
    {
        workingIndicator = value;
        hasWorkingIndicator = true;
        return this;
    }

    public boolean workingIndicator()
    {
        return workingIndicator;
    }

    private int ordRejReason;

    private boolean hasOrdRejReason;

    public boolean hasOrdRejReason()
    {
        return hasOrdRejReason;
    }

    public ExecutionReportEncoder ordRejReason(int value)
    {
        ordRejReason = value;
        hasOrdRejReason = true;
        return this;
    }

    public int ordRejReason()
    {
        return ordRejReason;
    }

    public ExecutionReportEncoder ordRejReason(OrdRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordRejReason Value: " + value );
            }
            if (value == OrdRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return ordRejReason(value.representation());
    }

    private int execRestatementReason;

    private boolean hasExecRestatementReason;

    public boolean hasExecRestatementReason()
    {
        return hasExecRestatementReason;
    }

    public ExecutionReportEncoder execRestatementReason(int value)
    {
        execRestatementReason = value;
        hasExecRestatementReason = true;
        return this;
    }

    public int execRestatementReason()
    {
        return execRestatementReason;
    }

    public ExecutionReportEncoder execRestatementReason(ExecRestatementReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecRestatementReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execRestatementReason Value: " + value );
            }
            if (value == ExecRestatementReason.NULL_VAL)
            {
                return this;
            }
        }
        return execRestatementReason(value.representation());
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public ExecutionReportEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public ExecutionReportEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public ExecutionReportEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public ExecutionReportEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public ExecutionReportEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public ExecutionReportEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public ExecutionReportEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    public MutableDirectBuffer account()
    {
        return account;
    }

    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    public ExecutionReportEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public ExecutionReportEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public ExecutionReportEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public ExecutionReportEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    public ExecutionReportEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public ExecutionReportEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public ExecutionReportEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public ExecutionReportEncoder accountType(AccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: accountType Value: " + value );
            }
            if (value == AccountType.NULL_VAL)
            {
                return this;
            }
        }
        return accountType(value.representation());
    }

    private char dayBookingInst;

    private boolean hasDayBookingInst;

    public boolean hasDayBookingInst()
    {
        return hasDayBookingInst;
    }

    public ExecutionReportEncoder dayBookingInst(char value)
    {
        dayBookingInst = value;
        hasDayBookingInst = true;
        return this;
    }

    public char dayBookingInst()
    {
        return dayBookingInst;
    }

    public ExecutionReportEncoder dayBookingInst(DayBookingInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DayBookingInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: dayBookingInst Value: " + value );
            }
            if (value == DayBookingInst.NULL_VAL)
            {
                return this;
            }
        }
        return dayBookingInst(value.representation());
    }

    private char bookingUnit;

    private boolean hasBookingUnit;

    public boolean hasBookingUnit()
    {
        return hasBookingUnit;
    }

    public ExecutionReportEncoder bookingUnit(char value)
    {
        bookingUnit = value;
        hasBookingUnit = true;
        return this;
    }

    public char bookingUnit()
    {
        return bookingUnit;
    }

    public ExecutionReportEncoder bookingUnit(BookingUnit value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BookingUnit.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bookingUnit Value: " + value );
            }
            if (value == BookingUnit.NULL_VAL)
            {
                return this;
            }
        }
        return bookingUnit(value.representation());
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    public ExecutionReportEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public ExecutionReportEncoder preallocMethod(PreallocMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PreallocMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: preallocMethod Value: " + value );
            }
            if (value == PreallocMethod.NULL_VAL)
            {
                return this;
            }
        }
        return preallocMethod(value.representation());
    }

    private final MutableDirectBuffer allocID = new UnsafeBuffer();

    private int allocIDOffset = 0;

    private int allocIDLength = 0;

    public ExecutionReportEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ExecutionReportEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ExecutionReportEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ExecutionReportEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public ExecutionReportEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ExecutionReportEncoder allocID(final byte[] value)
    {
        return allocID(value, 0, value.length);
    }

    public boolean hasAllocID()
    {
        return allocIDLength > 0;
    }

    public MutableDirectBuffer allocID()
    {
        return allocID;
    }

    public String allocIDAsString()
    {
        return allocID.getStringWithoutLengthAscii(allocIDOffset, allocIDLength);
    }

    public ExecutionReportEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder allocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            allocID.wrap(buffer);
            allocIDOffset = value.offset();
            allocIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public ExecutionReportEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public ExecutionReportEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final PreAllocGrpEncoder preAllocGrp = new PreAllocGrpEncoder();
    public PreAllocGrpEncoder preAllocGrp()
    {
        return preAllocGrp;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public ExecutionReportEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public ExecutionReportEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public ExecutionReportEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public ExecutionReportEncoder settlType(final byte[] value)
    {
        return settlType(value, 0, value.length);
    }

    public boolean hasSettlType()
    {
        return settlTypeLength > 0;
    }

    public MutableDirectBuffer settlType()
    {
        return settlType;
    }

    public String settlTypeAsString()
    {
        return settlType.getStringWithoutLengthAscii(settlTypeOffset, settlTypeLength);
    }

    public ExecutionReportEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public ExecutionReportEncoder settlType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlType.wrap(buffer);
            settlTypeOffset = value.offset();
            settlTypeLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public ExecutionReportEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public ExecutionReportEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public ExecutionReportEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public ExecutionReportEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public ExecutionReportEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public ExecutionReportEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public ExecutionReportEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public ExecutionReportEncoder settlDate(final byte[] value)
    {
        return settlDate(value, 0, value.length);
    }

    public boolean hasSettlDate()
    {
        return settlDateLength > 0;
    }

    public MutableDirectBuffer settlDate()
    {
        return settlDate;
    }

    public String settlDateAsString()
    {
        return settlDate.getStringWithoutLengthAscii(settlDateOffset, settlDateLength);
    }

    private final MutableDirectBuffer matchType = new UnsafeBuffer();

    private int matchTypeOffset = 0;

    private int matchTypeLength = 0;

    public ExecutionReportEncoder matchType(final DirectBuffer value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder matchType(final DirectBuffer value, final int length)
    {
        return matchType(value, 0, length);
    }

    public ExecutionReportEncoder matchType(final DirectBuffer value)
    {
        return matchType(value, 0, value.capacity());
    }

    public ExecutionReportEncoder matchType(final byte[] value, final int offset, final int length)
    {
        matchType.wrap(value);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder matchTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(matchType, value, offset, length);
        matchTypeOffset = offset;
        matchTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder matchType(final byte[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public ExecutionReportEncoder matchType(final byte[] value)
    {
        return matchType(value, 0, value.length);
    }

    public boolean hasMatchType()
    {
        return matchTypeLength > 0;
    }

    public MutableDirectBuffer matchType()
    {
        return matchType;
    }

    public String matchTypeAsString()
    {
        return matchType.getStringWithoutLengthAscii(matchTypeOffset, matchTypeLength);
    }

    public ExecutionReportEncoder matchType(final CharSequence value)
    {
        toBytes(value, matchType);
        matchTypeOffset = 0;
        matchTypeLength = value.length();
        return this;
    }

    public ExecutionReportEncoder matchType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            matchType.wrap(buffer);
            matchTypeOffset = value.offset();
            matchTypeLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder matchType(final char[] value)
    {
        return matchType(value, 0, value.length);
    }

    public ExecutionReportEncoder matchType(final char[] value, final int length)
    {
        return matchType(value, 0, length);
    }

    public ExecutionReportEncoder matchType(final char[] value, final int offset, final int length)
    {
        toBytes(value, matchType, offset, length);
        matchTypeOffset = 0;
        matchTypeLength = length;
        return this;
    }

    public ExecutionReportEncoder matchType(MatchType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MatchType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: matchType Value: " + value );
            }
            if (value == MatchType.NULL_VAL)
            {
                return this;
            }
        }
        return matchType(value.representation());
    }

    private char orderCategory;

    private boolean hasOrderCategory;

    public boolean hasOrderCategory()
    {
        return hasOrderCategory;
    }

    public ExecutionReportEncoder orderCategory(char value)
    {
        orderCategory = value;
        hasOrderCategory = true;
        return this;
    }

    public char orderCategory()
    {
        return orderCategory;
    }

    public ExecutionReportEncoder orderCategory(OrderCategory value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCategory.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCategory Value: " + value );
            }
            if (value == OrderCategory.NULL_VAL)
            {
                return this;
            }
        }
        return orderCategory(value.representation());
    }

    private char cashMargin;

    private boolean hasCashMargin;

    public boolean hasCashMargin()
    {
        return hasCashMargin;
    }

    public ExecutionReportEncoder cashMargin(char value)
    {
        cashMargin = value;
        hasCashMargin = true;
        return this;
    }

    public char cashMargin()
    {
        return cashMargin;
    }

    public ExecutionReportEncoder cashMargin(CashMargin value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CashMargin.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: cashMargin Value: " + value );
            }
            if (value == CashMargin.NULL_VAL)
            {
                return this;
            }
        }
        return cashMargin(value.representation());
    }

    private final MutableDirectBuffer clearingFeeIndicator = new UnsafeBuffer();

    private int clearingFeeIndicatorOffset = 0;

    private int clearingFeeIndicatorLength = 0;

    public ExecutionReportEncoder clearingFeeIndicator(final DirectBuffer value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicator(final DirectBuffer value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public ExecutionReportEncoder clearingFeeIndicator(final DirectBuffer value)
    {
        return clearingFeeIndicator(value, 0, value.capacity());
    }

    public ExecutionReportEncoder clearingFeeIndicator(final byte[] value, final int offset, final int length)
    {
        clearingFeeIndicator.wrap(value);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicatorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingFeeIndicator, value, offset, length);
        clearingFeeIndicatorOffset = offset;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicator(final byte[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public ExecutionReportEncoder clearingFeeIndicator(final byte[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public boolean hasClearingFeeIndicator()
    {
        return clearingFeeIndicatorLength > 0;
    }

    public MutableDirectBuffer clearingFeeIndicator()
    {
        return clearingFeeIndicator;
    }

    public String clearingFeeIndicatorAsString()
    {
        return clearingFeeIndicator.getStringWithoutLengthAscii(clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }

    public ExecutionReportEncoder clearingFeeIndicator(final CharSequence value)
    {
        toBytes(value, clearingFeeIndicator);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = value.length();
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicator(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clearingFeeIndicator.wrap(buffer);
            clearingFeeIndicatorOffset = value.offset();
            clearingFeeIndicatorLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicator(final char[] value)
    {
        return clearingFeeIndicator(value, 0, value.length);
    }

    public ExecutionReportEncoder clearingFeeIndicator(final char[] value, final int length)
    {
        return clearingFeeIndicator(value, 0, length);
    }

    public ExecutionReportEncoder clearingFeeIndicator(final char[] value, final int offset, final int length)
    {
        toBytes(value, clearingFeeIndicator, offset, length);
        clearingFeeIndicatorOffset = 0;
        clearingFeeIndicatorLength = length;
        return this;
    }

    public ExecutionReportEncoder clearingFeeIndicator(ClearingFeeIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ClearingFeeIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: clearingFeeIndicator Value: " + value );
            }
            if (value == ClearingFeeIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return clearingFeeIndicator(value.representation());
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public ExecutionReportEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public ExecutionReportEncoder side(Side value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Side.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: side Value: " + value );
            }
            if (value == Side.NULL_VAL)
            {
                return this;
            }
        }
        return side(value.representation());
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private int qtyType;

    private boolean hasQtyType;

    public boolean hasQtyType()
    {
        return hasQtyType;
    }

    public ExecutionReportEncoder qtyType(int value)
    {
        qtyType = value;
        hasQtyType = true;
        return this;
    }

    public int qtyType()
    {
        return qtyType;
    }

    public ExecutionReportEncoder qtyType(QtyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QtyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: qtyType Value: " + value );
            }
            if (value == QtyType.NULL_VAL)
            {
                return this;
            }
        }
        return qtyType(value.representation());
    }

    private final OrderQtyDataEncoder orderQtyData = new OrderQtyDataEncoder();
    public OrderQtyDataEncoder orderQtyData()
    {
        return orderQtyData;
    }

    private char lotType;

    private boolean hasLotType;

    public boolean hasLotType()
    {
        return hasLotType;
    }

    public ExecutionReportEncoder lotType(char value)
    {
        lotType = value;
        hasLotType = true;
        return this;
    }

    public char lotType()
    {
        return lotType;
    }

    public ExecutionReportEncoder lotType(LotType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LotType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lotType Value: " + value );
            }
            if (value == LotType.NULL_VAL)
            {
                return this;
            }
        }
        return lotType(value.representation());
    }

    private char ordType;

    private boolean hasOrdType;

    public boolean hasOrdType()
    {
        return hasOrdType;
    }

    public ExecutionReportEncoder ordType(char value)
    {
        ordType = value;
        hasOrdType = true;
        return this;
    }

    public char ordType()
    {
        return ordType;
    }

    public ExecutionReportEncoder ordType(OrdType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrdType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ordType Value: " + value );
            }
            if (value == OrdType.NULL_VAL)
            {
                return this;
            }
        }
        return ordType(value.representation());
    }

    private int priceType;

    private boolean hasPriceType;

    public boolean hasPriceType()
    {
        return hasPriceType;
    }

    public ExecutionReportEncoder priceType(int value)
    {
        priceType = value;
        hasPriceType = true;
        return this;
    }

    public int priceType()
    {
        return priceType;
    }

    public ExecutionReportEncoder priceType(PriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceType Value: " + value );
            }
            if (value == PriceType.NULL_VAL)
            {
                return this;
            }
        }
        return priceType(value.representation());
    }

    private final DecimalFloat price = new DecimalFloat();

    private boolean hasPrice;

    public boolean hasPrice()
    {
        return hasPrice;
    }

    public ExecutionReportEncoder price(DecimalFloat value)
    {
        price.set(value);
        hasPrice = true;
        return this;
    }

    public ExecutionReportEncoder price(long value, int scale)
    {
        price.set(value, scale);
        hasPrice = true;
        return this;
    }

    public DecimalFloat price()
    {
        return price;
    }

    private char priceProtectionScope;

    private boolean hasPriceProtectionScope;

    public boolean hasPriceProtectionScope()
    {
        return hasPriceProtectionScope;
    }

    public ExecutionReportEncoder priceProtectionScope(char value)
    {
        priceProtectionScope = value;
        hasPriceProtectionScope = true;
        return this;
    }

    public char priceProtectionScope()
    {
        return priceProtectionScope;
    }

    public ExecutionReportEncoder priceProtectionScope(PriceProtectionScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriceProtectionScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priceProtectionScope Value: " + value );
            }
            if (value == PriceProtectionScope.NULL_VAL)
            {
                return this;
            }
        }
        return priceProtectionScope(value.representation());
    }

    private final DecimalFloat stopPx = new DecimalFloat();

    private boolean hasStopPx;

    public boolean hasStopPx()
    {
        return hasStopPx;
    }

    public ExecutionReportEncoder stopPx(DecimalFloat value)
    {
        stopPx.set(value);
        hasStopPx = true;
        return this;
    }

    public ExecutionReportEncoder stopPx(long value, int scale)
    {
        stopPx.set(value, scale);
        hasStopPx = true;
        return this;
    }

    public DecimalFloat stopPx()
    {
        return stopPx;
    }

    private final TriggeringInstructionEncoder triggeringInstruction = new TriggeringInstructionEncoder();
    public TriggeringInstructionEncoder triggeringInstruction()
    {
        return triggeringInstruction;
    }

    private final PegInstructionsEncoder pegInstructions = new PegInstructionsEncoder();
    public PegInstructionsEncoder pegInstructions()
    {
        return pegInstructions;
    }

    private final DiscretionInstructionsEncoder discretionInstructions = new DiscretionInstructionsEncoder();
    public DiscretionInstructionsEncoder discretionInstructions()
    {
        return discretionInstructions;
    }

    private final DecimalFloat peggedPrice = new DecimalFloat();

    private boolean hasPeggedPrice;

    public boolean hasPeggedPrice()
    {
        return hasPeggedPrice;
    }

    public ExecutionReportEncoder peggedPrice(DecimalFloat value)
    {
        peggedPrice.set(value);
        hasPeggedPrice = true;
        return this;
    }

    public ExecutionReportEncoder peggedPrice(long value, int scale)
    {
        peggedPrice.set(value, scale);
        hasPeggedPrice = true;
        return this;
    }

    public DecimalFloat peggedPrice()
    {
        return peggedPrice;
    }

    private final DecimalFloat peggedRefPrice = new DecimalFloat();

    private boolean hasPeggedRefPrice;

    public boolean hasPeggedRefPrice()
    {
        return hasPeggedRefPrice;
    }

    public ExecutionReportEncoder peggedRefPrice(DecimalFloat value)
    {
        peggedRefPrice.set(value);
        hasPeggedRefPrice = true;
        return this;
    }

    public ExecutionReportEncoder peggedRefPrice(long value, int scale)
    {
        peggedRefPrice.set(value, scale);
        hasPeggedRefPrice = true;
        return this;
    }

    public DecimalFloat peggedRefPrice()
    {
        return peggedRefPrice;
    }

    private final DecimalFloat discretionPrice = new DecimalFloat();

    private boolean hasDiscretionPrice;

    public boolean hasDiscretionPrice()
    {
        return hasDiscretionPrice;
    }

    public ExecutionReportEncoder discretionPrice(DecimalFloat value)
    {
        discretionPrice.set(value);
        hasDiscretionPrice = true;
        return this;
    }

    public ExecutionReportEncoder discretionPrice(long value, int scale)
    {
        discretionPrice.set(value, scale);
        hasDiscretionPrice = true;
        return this;
    }

    public DecimalFloat discretionPrice()
    {
        return discretionPrice;
    }

    private int targetStrategy;

    private boolean hasTargetStrategy;

    public boolean hasTargetStrategy()
    {
        return hasTargetStrategy;
    }

    public ExecutionReportEncoder targetStrategy(int value)
    {
        targetStrategy = value;
        hasTargetStrategy = true;
        return this;
    }

    public int targetStrategy()
    {
        return targetStrategy;
    }

    public ExecutionReportEncoder targetStrategy(TargetStrategy value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TargetStrategy.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: targetStrategy Value: " + value );
            }
            if (value == TargetStrategy.NULL_VAL)
            {
                return this;
            }
        }
        return targetStrategy(value.representation());
    }

    private final StrategyParametersGrpEncoder strategyParametersGrp = new StrategyParametersGrpEncoder();
    public StrategyParametersGrpEncoder strategyParametersGrp()
    {
        return strategyParametersGrp;
    }

    private final MutableDirectBuffer targetStrategyParameters = new UnsafeBuffer();

    private int targetStrategyParametersOffset = 0;

    private int targetStrategyParametersLength = 0;

    public ExecutionReportEncoder targetStrategyParameters(final DirectBuffer value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public ExecutionReportEncoder targetStrategyParameters(final DirectBuffer value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public ExecutionReportEncoder targetStrategyParameters(final DirectBuffer value)
    {
        return targetStrategyParameters(value, 0, value.capacity());
    }

    public ExecutionReportEncoder targetStrategyParameters(final byte[] value, final int offset, final int length)
    {
        targetStrategyParameters.wrap(value);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public ExecutionReportEncoder targetStrategyParametersAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(targetStrategyParameters, value, offset, length);
        targetStrategyParametersOffset = offset;
        targetStrategyParametersLength = length;
        return this;
    }

    public ExecutionReportEncoder targetStrategyParameters(final byte[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public ExecutionReportEncoder targetStrategyParameters(final byte[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public boolean hasTargetStrategyParameters()
    {
        return targetStrategyParametersLength > 0;
    }

    public MutableDirectBuffer targetStrategyParameters()
    {
        return targetStrategyParameters;
    }

    public String targetStrategyParametersAsString()
    {
        return targetStrategyParameters.getStringWithoutLengthAscii(targetStrategyParametersOffset, targetStrategyParametersLength);
    }

    public ExecutionReportEncoder targetStrategyParameters(final CharSequence value)
    {
        toBytes(value, targetStrategyParameters);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = value.length();
        return this;
    }

    public ExecutionReportEncoder targetStrategyParameters(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            targetStrategyParameters.wrap(buffer);
            targetStrategyParametersOffset = value.offset();
            targetStrategyParametersLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder targetStrategyParameters(final char[] value)
    {
        return targetStrategyParameters(value, 0, value.length);
    }

    public ExecutionReportEncoder targetStrategyParameters(final char[] value, final int length)
    {
        return targetStrategyParameters(value, 0, length);
    }

    public ExecutionReportEncoder targetStrategyParameters(final char[] value, final int offset, final int length)
    {
        toBytes(value, targetStrategyParameters, offset, length);
        targetStrategyParametersOffset = 0;
        targetStrategyParametersLength = length;
        return this;
    }

    private final DecimalFloat participationRate = new DecimalFloat();

    private boolean hasParticipationRate;

    public boolean hasParticipationRate()
    {
        return hasParticipationRate;
    }

    public ExecutionReportEncoder participationRate(DecimalFloat value)
    {
        participationRate.set(value);
        hasParticipationRate = true;
        return this;
    }

    public ExecutionReportEncoder participationRate(long value, int scale)
    {
        participationRate.set(value, scale);
        hasParticipationRate = true;
        return this;
    }

    public DecimalFloat participationRate()
    {
        return participationRate;
    }

    private final DecimalFloat targetStrategyPerformance = new DecimalFloat();

    private boolean hasTargetStrategyPerformance;

    public boolean hasTargetStrategyPerformance()
    {
        return hasTargetStrategyPerformance;
    }

    public ExecutionReportEncoder targetStrategyPerformance(DecimalFloat value)
    {
        targetStrategyPerformance.set(value);
        hasTargetStrategyPerformance = true;
        return this;
    }

    public ExecutionReportEncoder targetStrategyPerformance(long value, int scale)
    {
        targetStrategyPerformance.set(value, scale);
        hasTargetStrategyPerformance = true;
        return this;
    }

    public DecimalFloat targetStrategyPerformance()
    {
        return targetStrategyPerformance;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public ExecutionReportEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public ExecutionReportEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public ExecutionReportEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public ExecutionReportEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public ExecutionReportEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public ExecutionReportEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public ExecutionReportEncoder currency(final byte[] value)
    {
        return currency(value, 0, value.length);
    }

    public boolean hasCurrency()
    {
        return currencyLength > 0;
    }

    public MutableDirectBuffer currency()
    {
        return currency;
    }

    public String currencyAsString()
    {
        return currency.getStringWithoutLengthAscii(currencyOffset, currencyLength);
    }

    public ExecutionReportEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public ExecutionReportEncoder currency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            currency.wrap(buffer);
            currencyOffset = value.offset();
            currencyLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public ExecutionReportEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public ExecutionReportEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public ExecutionReportEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public ExecutionReportEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public ExecutionReportEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public ExecutionReportEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public ExecutionReportEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public ExecutionReportEncoder complianceID(final byte[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public boolean hasComplianceID()
    {
        return complianceIDLength > 0;
    }

    public MutableDirectBuffer complianceID()
    {
        return complianceID;
    }

    public String complianceIDAsString()
    {
        return complianceID.getStringWithoutLengthAscii(complianceIDOffset, complianceIDLength);
    }

    public ExecutionReportEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder complianceID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            complianceID.wrap(buffer);
            complianceIDOffset = value.offset();
            complianceIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public ExecutionReportEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public ExecutionReportEncoder complianceID(final char[] value, final int offset, final int length)
    {
        toBytes(value, complianceID, offset, length);
        complianceIDOffset = 0;
        complianceIDLength = length;
        return this;
    }

    private boolean solicitedFlag;

    private boolean hasSolicitedFlag;

    public boolean hasSolicitedFlag()
    {
        return hasSolicitedFlag;
    }

    public ExecutionReportEncoder solicitedFlag(boolean value)
    {
        solicitedFlag = value;
        hasSolicitedFlag = true;
        return this;
    }

    public boolean solicitedFlag()
    {
        return solicitedFlag;
    }

    private char timeInForce;

    private boolean hasTimeInForce;

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }

    public ExecutionReportEncoder timeInForce(char value)
    {
        timeInForce = value;
        hasTimeInForce = true;
        return this;
    }

    public char timeInForce()
    {
        return timeInForce;
    }

    public ExecutionReportEncoder timeInForce(TimeInForce value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TimeInForce.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: timeInForce Value: " + value );
            }
            if (value == TimeInForce.NULL_VAL)
            {
                return this;
            }
        }
        return timeInForce(value.representation());
    }

    private final MutableDirectBuffer effectiveTime = new UnsafeBuffer();

    private int effectiveTimeOffset = 0;

    private int effectiveTimeLength = 0;

    public ExecutionReportEncoder effectiveTime(final DirectBuffer value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder effectiveTime(final DirectBuffer value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public ExecutionReportEncoder effectiveTime(final DirectBuffer value)
    {
        return effectiveTime(value, 0, value.capacity());
    }

    public ExecutionReportEncoder effectiveTime(final byte[] value, final int offset, final int length)
    {
        effectiveTime.wrap(value);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder effectiveTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(effectiveTime, value, offset, length);
        effectiveTimeOffset = offset;
        effectiveTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder effectiveTime(final byte[] value, final int length)
    {
        return effectiveTime(value, 0, length);
    }

    public ExecutionReportEncoder effectiveTime(final byte[] value)
    {
        return effectiveTime(value, 0, value.length);
    }

    public boolean hasEffectiveTime()
    {
        return effectiveTimeLength > 0;
    }

    public MutableDirectBuffer effectiveTime()
    {
        return effectiveTime;
    }

    public String effectiveTimeAsString()
    {
        return effectiveTime.getStringWithoutLengthAscii(effectiveTimeOffset, effectiveTimeLength);
    }

    private final MutableDirectBuffer expireDate = new UnsafeBuffer();

    private int expireDateOffset = 0;

    private int expireDateLength = 0;

    public ExecutionReportEncoder expireDate(final DirectBuffer value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public ExecutionReportEncoder expireDate(final DirectBuffer value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public ExecutionReportEncoder expireDate(final DirectBuffer value)
    {
        return expireDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder expireDate(final byte[] value, final int offset, final int length)
    {
        expireDate.wrap(value);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public ExecutionReportEncoder expireDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireDate, value, offset, length);
        expireDateOffset = offset;
        expireDateLength = length;
        return this;
    }

    public ExecutionReportEncoder expireDate(final byte[] value, final int length)
    {
        return expireDate(value, 0, length);
    }

    public ExecutionReportEncoder expireDate(final byte[] value)
    {
        return expireDate(value, 0, value.length);
    }

    public boolean hasExpireDate()
    {
        return expireDateLength > 0;
    }

    public MutableDirectBuffer expireDate()
    {
        return expireDate;
    }

    public String expireDateAsString()
    {
        return expireDate.getStringWithoutLengthAscii(expireDateOffset, expireDateLength);
    }

    private final MutableDirectBuffer expireTime = new UnsafeBuffer();

    private int expireTimeOffset = 0;

    private int expireTimeLength = 0;

    public ExecutionReportEncoder expireTime(final DirectBuffer value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder expireTime(final DirectBuffer value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public ExecutionReportEncoder expireTime(final DirectBuffer value)
    {
        return expireTime(value, 0, value.capacity());
    }

    public ExecutionReportEncoder expireTime(final byte[] value, final int offset, final int length)
    {
        expireTime.wrap(value);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder expireTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(expireTime, value, offset, length);
        expireTimeOffset = offset;
        expireTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder expireTime(final byte[] value, final int length)
    {
        return expireTime(value, 0, length);
    }

    public ExecutionReportEncoder expireTime(final byte[] value)
    {
        return expireTime(value, 0, value.length);
    }

    public boolean hasExpireTime()
    {
        return expireTimeLength > 0;
    }

    public MutableDirectBuffer expireTime()
    {
        return expireTime;
    }

    public String expireTimeAsString()
    {
        return expireTime.getStringWithoutLengthAscii(expireTimeOffset, expireTimeLength);
    }

    private final MutableDirectBuffer execInst = new UnsafeBuffer();

    private int execInstOffset = 0;

    private int execInstLength = 0;

    public ExecutionReportEncoder execInst(final DirectBuffer value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public ExecutionReportEncoder execInst(final DirectBuffer value, final int length)
    {
        return execInst(value, 0, length);
    }

    public ExecutionReportEncoder execInst(final DirectBuffer value)
    {
        return execInst(value, 0, value.capacity());
    }

    public ExecutionReportEncoder execInst(final byte[] value, final int offset, final int length)
    {
        execInst.wrap(value);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public ExecutionReportEncoder execInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execInst, value, offset, length);
        execInstOffset = offset;
        execInstLength = length;
        return this;
    }

    public ExecutionReportEncoder execInst(final byte[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public ExecutionReportEncoder execInst(final byte[] value)
    {
        return execInst(value, 0, value.length);
    }

    public boolean hasExecInst()
    {
        return execInstLength > 0;
    }

    public MutableDirectBuffer execInst()
    {
        return execInst;
    }

    public String execInstAsString()
    {
        return execInst.getStringWithoutLengthAscii(execInstOffset, execInstLength);
    }

    public ExecutionReportEncoder execInst(final CharSequence value)
    {
        toBytes(value, execInst);
        execInstOffset = 0;
        execInstLength = value.length();
        return this;
    }

    public ExecutionReportEncoder execInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            execInst.wrap(buffer);
            execInstOffset = value.offset();
            execInstLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder execInst(final char[] value)
    {
        return execInst(value, 0, value.length);
    }

    public ExecutionReportEncoder execInst(final char[] value, final int length)
    {
        return execInst(value, 0, length);
    }

    public ExecutionReportEncoder execInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, execInst, offset, length);
        execInstOffset = 0;
        execInstLength = length;
        return this;
    }

    private boolean aggressorIndicator;

    private boolean hasAggressorIndicator;

    public boolean hasAggressorIndicator()
    {
        return hasAggressorIndicator;
    }

    public ExecutionReportEncoder aggressorIndicator(boolean value)
    {
        aggressorIndicator = value;
        hasAggressorIndicator = true;
        return this;
    }

    public boolean aggressorIndicator()
    {
        return aggressorIndicator;
    }

    private char orderCapacity;

    private boolean hasOrderCapacity;

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }

    public ExecutionReportEncoder orderCapacity(char value)
    {
        orderCapacity = value;
        hasOrderCapacity = true;
        return this;
    }

    public char orderCapacity()
    {
        return orderCapacity;
    }

    public ExecutionReportEncoder orderCapacity(OrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderCapacity Value: " + value );
            }
            if (value == OrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return orderCapacity(value.representation());
    }

    private final MutableDirectBuffer orderRestrictions = new UnsafeBuffer();

    private int orderRestrictionsOffset = 0;

    private int orderRestrictionsLength = 0;

    public ExecutionReportEncoder orderRestrictions(final DirectBuffer value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public ExecutionReportEncoder orderRestrictions(final DirectBuffer value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public ExecutionReportEncoder orderRestrictions(final DirectBuffer value)
    {
        return orderRestrictions(value, 0, value.capacity());
    }

    public ExecutionReportEncoder orderRestrictions(final byte[] value, final int offset, final int length)
    {
        orderRestrictions.wrap(value);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public ExecutionReportEncoder orderRestrictionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderRestrictions, value, offset, length);
        orderRestrictionsOffset = offset;
        orderRestrictionsLength = length;
        return this;
    }

    public ExecutionReportEncoder orderRestrictions(final byte[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public ExecutionReportEncoder orderRestrictions(final byte[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public boolean hasOrderRestrictions()
    {
        return orderRestrictionsLength > 0;
    }

    public MutableDirectBuffer orderRestrictions()
    {
        return orderRestrictions;
    }

    public String orderRestrictionsAsString()
    {
        return orderRestrictions.getStringWithoutLengthAscii(orderRestrictionsOffset, orderRestrictionsLength);
    }

    public ExecutionReportEncoder orderRestrictions(final CharSequence value)
    {
        toBytes(value, orderRestrictions);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = value.length();
        return this;
    }

    public ExecutionReportEncoder orderRestrictions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderRestrictions.wrap(buffer);
            orderRestrictionsOffset = value.offset();
            orderRestrictionsLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder orderRestrictions(final char[] value)
    {
        return orderRestrictions(value, 0, value.length);
    }

    public ExecutionReportEncoder orderRestrictions(final char[] value, final int length)
    {
        return orderRestrictions(value, 0, length);
    }

    public ExecutionReportEncoder orderRestrictions(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderRestrictions, offset, length);
        orderRestrictionsOffset = 0;
        orderRestrictionsLength = length;
        return this;
    }

    private boolean preTradeAnonymity;

    private boolean hasPreTradeAnonymity;

    public boolean hasPreTradeAnonymity()
    {
        return hasPreTradeAnonymity;
    }

    public ExecutionReportEncoder preTradeAnonymity(boolean value)
    {
        preTradeAnonymity = value;
        hasPreTradeAnonymity = true;
        return this;
    }

    public boolean preTradeAnonymity()
    {
        return preTradeAnonymity;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public ExecutionReportEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public ExecutionReportEncoder custOrderCapacity(CustOrderCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CustOrderCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: custOrderCapacity Value: " + value );
            }
            if (value == CustOrderCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return custOrderCapacity(value.representation());
    }

    private final DecimalFloat lastQty = new DecimalFloat();

    private boolean hasLastQty;

    public boolean hasLastQty()
    {
        return hasLastQty;
    }

    public ExecutionReportEncoder lastQty(DecimalFloat value)
    {
        lastQty.set(value);
        hasLastQty = true;
        return this;
    }

    public ExecutionReportEncoder lastQty(long value, int scale)
    {
        lastQty.set(value, scale);
        hasLastQty = true;
        return this;
    }

    public DecimalFloat lastQty()
    {
        return lastQty;
    }

    private final DecimalFloat calculatedCcyLastQty = new DecimalFloat();

    private boolean hasCalculatedCcyLastQty;

    public boolean hasCalculatedCcyLastQty()
    {
        return hasCalculatedCcyLastQty;
    }

    public ExecutionReportEncoder calculatedCcyLastQty(DecimalFloat value)
    {
        calculatedCcyLastQty.set(value);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public ExecutionReportEncoder calculatedCcyLastQty(long value, int scale)
    {
        calculatedCcyLastQty.set(value, scale);
        hasCalculatedCcyLastQty = true;
        return this;
    }

    public DecimalFloat calculatedCcyLastQty()
    {
        return calculatedCcyLastQty;
    }

    private final DecimalFloat lastSwapPoints = new DecimalFloat();

    private boolean hasLastSwapPoints;

    public boolean hasLastSwapPoints()
    {
        return hasLastSwapPoints;
    }

    public ExecutionReportEncoder lastSwapPoints(DecimalFloat value)
    {
        lastSwapPoints.set(value);
        hasLastSwapPoints = true;
        return this;
    }

    public ExecutionReportEncoder lastSwapPoints(long value, int scale)
    {
        lastSwapPoints.set(value, scale);
        hasLastSwapPoints = true;
        return this;
    }

    public DecimalFloat lastSwapPoints()
    {
        return lastSwapPoints;
    }

    private final DecimalFloat underlyingLastQty = new DecimalFloat();

    private boolean hasUnderlyingLastQty;

    public boolean hasUnderlyingLastQty()
    {
        return hasUnderlyingLastQty;
    }

    public ExecutionReportEncoder underlyingLastQty(DecimalFloat value)
    {
        underlyingLastQty.set(value);
        hasUnderlyingLastQty = true;
        return this;
    }

    public ExecutionReportEncoder underlyingLastQty(long value, int scale)
    {
        underlyingLastQty.set(value, scale);
        hasUnderlyingLastQty = true;
        return this;
    }

    public DecimalFloat underlyingLastQty()
    {
        return underlyingLastQty;
    }

    private final DecimalFloat lastPx = new DecimalFloat();

    private boolean hasLastPx;

    public boolean hasLastPx()
    {
        return hasLastPx;
    }

    public ExecutionReportEncoder lastPx(DecimalFloat value)
    {
        lastPx.set(value);
        hasLastPx = true;
        return this;
    }

    public ExecutionReportEncoder lastPx(long value, int scale)
    {
        lastPx.set(value, scale);
        hasLastPx = true;
        return this;
    }

    public DecimalFloat lastPx()
    {
        return lastPx;
    }

    private final DecimalFloat underlyingLastPx = new DecimalFloat();

    private boolean hasUnderlyingLastPx;

    public boolean hasUnderlyingLastPx()
    {
        return hasUnderlyingLastPx;
    }

    public ExecutionReportEncoder underlyingLastPx(DecimalFloat value)
    {
        underlyingLastPx.set(value);
        hasUnderlyingLastPx = true;
        return this;
    }

    public ExecutionReportEncoder underlyingLastPx(long value, int scale)
    {
        underlyingLastPx.set(value, scale);
        hasUnderlyingLastPx = true;
        return this;
    }

    public DecimalFloat underlyingLastPx()
    {
        return underlyingLastPx;
    }

    private final DecimalFloat lastParPx = new DecimalFloat();

    private boolean hasLastParPx;

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }

    public ExecutionReportEncoder lastParPx(DecimalFloat value)
    {
        lastParPx.set(value);
        hasLastParPx = true;
        return this;
    }

    public ExecutionReportEncoder lastParPx(long value, int scale)
    {
        lastParPx.set(value, scale);
        hasLastParPx = true;
        return this;
    }

    public DecimalFloat lastParPx()
    {
        return lastParPx;
    }

    private final DecimalFloat lastSpotRate = new DecimalFloat();

    private boolean hasLastSpotRate;

    public boolean hasLastSpotRate()
    {
        return hasLastSpotRate;
    }

    public ExecutionReportEncoder lastSpotRate(DecimalFloat value)
    {
        lastSpotRate.set(value);
        hasLastSpotRate = true;
        return this;
    }

    public ExecutionReportEncoder lastSpotRate(long value, int scale)
    {
        lastSpotRate.set(value, scale);
        hasLastSpotRate = true;
        return this;
    }

    public DecimalFloat lastSpotRate()
    {
        return lastSpotRate;
    }

    private final DecimalFloat lastForwardPoints = new DecimalFloat();

    private boolean hasLastForwardPoints;

    public boolean hasLastForwardPoints()
    {
        return hasLastForwardPoints;
    }

    public ExecutionReportEncoder lastForwardPoints(DecimalFloat value)
    {
        lastForwardPoints.set(value);
        hasLastForwardPoints = true;
        return this;
    }

    public ExecutionReportEncoder lastForwardPoints(long value, int scale)
    {
        lastForwardPoints.set(value, scale);
        hasLastForwardPoints = true;
        return this;
    }

    public DecimalFloat lastForwardPoints()
    {
        return lastForwardPoints;
    }

    private final MutableDirectBuffer lastMkt = new UnsafeBuffer();

    private int lastMktOffset = 0;

    private int lastMktLength = 0;

    public ExecutionReportEncoder lastMkt(final DirectBuffer value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public ExecutionReportEncoder lastMkt(final DirectBuffer value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public ExecutionReportEncoder lastMkt(final DirectBuffer value)
    {
        return lastMkt(value, 0, value.capacity());
    }

    public ExecutionReportEncoder lastMkt(final byte[] value, final int offset, final int length)
    {
        lastMkt.wrap(value);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public ExecutionReportEncoder lastMktAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastMkt, value, offset, length);
        lastMktOffset = offset;
        lastMktLength = length;
        return this;
    }

    public ExecutionReportEncoder lastMkt(final byte[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public ExecutionReportEncoder lastMkt(final byte[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public boolean hasLastMkt()
    {
        return lastMktLength > 0;
    }

    public MutableDirectBuffer lastMkt()
    {
        return lastMkt;
    }

    public String lastMktAsString()
    {
        return lastMkt.getStringWithoutLengthAscii(lastMktOffset, lastMktLength);
    }

    public ExecutionReportEncoder lastMkt(final CharSequence value)
    {
        toBytes(value, lastMkt);
        lastMktOffset = 0;
        lastMktLength = value.length();
        return this;
    }

    public ExecutionReportEncoder lastMkt(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            lastMkt.wrap(buffer);
            lastMktOffset = value.offset();
            lastMktLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder lastMkt(final char[] value)
    {
        return lastMkt(value, 0, value.length);
    }

    public ExecutionReportEncoder lastMkt(final char[] value, final int length)
    {
        return lastMkt(value, 0, length);
    }

    public ExecutionReportEncoder lastMkt(final char[] value, final int offset, final int length)
    {
        toBytes(value, lastMkt, offset, length);
        lastMktOffset = 0;
        lastMktLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public ExecutionReportEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    public ExecutionReportEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public ExecutionReportEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionID(TradingSessionID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionID Value: " + value );
            }
            if (value == TradingSessionID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionID(value.representation());
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public ExecutionReportEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    public ExecutionReportEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public ExecutionReportEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public ExecutionReportEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public ExecutionReportEncoder tradingSessionSubID(TradingSessionSubID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionSubID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionSubID Value: " + value );
            }
            if (value == TradingSessionSubID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionSubID(value.representation());
    }

    private final MutableDirectBuffer timeBracket = new UnsafeBuffer();

    private int timeBracketOffset = 0;

    private int timeBracketLength = 0;

    public ExecutionReportEncoder timeBracket(final DirectBuffer value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public ExecutionReportEncoder timeBracket(final DirectBuffer value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public ExecutionReportEncoder timeBracket(final DirectBuffer value)
    {
        return timeBracket(value, 0, value.capacity());
    }

    public ExecutionReportEncoder timeBracket(final byte[] value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public ExecutionReportEncoder timeBracketAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(timeBracket, value, offset, length);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public ExecutionReportEncoder timeBracket(final byte[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public ExecutionReportEncoder timeBracket(final byte[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    public boolean hasTimeBracket()
    {
        return timeBracketLength > 0;
    }

    public MutableDirectBuffer timeBracket()
    {
        return timeBracket;
    }

    public String timeBracketAsString()
    {
        return timeBracket.getStringWithoutLengthAscii(timeBracketOffset, timeBracketLength);
    }

    public ExecutionReportEncoder timeBracket(final CharSequence value)
    {
        toBytes(value, timeBracket);
        timeBracketOffset = 0;
        timeBracketLength = value.length();
        return this;
    }

    public ExecutionReportEncoder timeBracket(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            timeBracket.wrap(buffer);
            timeBracketOffset = value.offset();
            timeBracketLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder timeBracket(final char[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    public ExecutionReportEncoder timeBracket(final char[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public ExecutionReportEncoder timeBracket(final char[] value, final int offset, final int length)
    {
        toBytes(value, timeBracket, offset, length);
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    private char lastCapacity;

    private boolean hasLastCapacity;

    public boolean hasLastCapacity()
    {
        return hasLastCapacity;
    }

    public ExecutionReportEncoder lastCapacity(char value)
    {
        lastCapacity = value;
        hasLastCapacity = true;
        return this;
    }

    public char lastCapacity()
    {
        return lastCapacity;
    }

    public ExecutionReportEncoder lastCapacity(LastCapacity value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LastCapacity.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lastCapacity Value: " + value );
            }
            if (value == LastCapacity.NULL_VAL)
            {
                return this;
            }
        }
        return lastCapacity(value.representation());
    }

    private final DecimalFloat leavesQty = new DecimalFloat();

    private boolean hasLeavesQty;

    public boolean hasLeavesQty()
    {
        return hasLeavesQty;
    }

    public ExecutionReportEncoder leavesQty(DecimalFloat value)
    {
        leavesQty.set(value);
        hasLeavesQty = true;
        return this;
    }

    public ExecutionReportEncoder leavesQty(long value, int scale)
    {
        leavesQty.set(value, scale);
        hasLeavesQty = true;
        return this;
    }

    public DecimalFloat leavesQty()
    {
        return leavesQty;
    }

    private final DecimalFloat cumQty = new DecimalFloat();

    private boolean hasCumQty;

    public boolean hasCumQty()
    {
        return hasCumQty;
    }

    public ExecutionReportEncoder cumQty(DecimalFloat value)
    {
        cumQty.set(value);
        hasCumQty = true;
        return this;
    }

    public ExecutionReportEncoder cumQty(long value, int scale)
    {
        cumQty.set(value, scale);
        hasCumQty = true;
        return this;
    }

    public DecimalFloat cumQty()
    {
        return cumQty;
    }

    private final DecimalFloat avgPx = new DecimalFloat();

    private boolean hasAvgPx;

    public boolean hasAvgPx()
    {
        return hasAvgPx;
    }

    public ExecutionReportEncoder avgPx(DecimalFloat value)
    {
        avgPx.set(value);
        hasAvgPx = true;
        return this;
    }

    public ExecutionReportEncoder avgPx(long value, int scale)
    {
        avgPx.set(value, scale);
        hasAvgPx = true;
        return this;
    }

    public DecimalFloat avgPx()
    {
        return avgPx;
    }

    private final DecimalFloat dayOrderQty = new DecimalFloat();

    private boolean hasDayOrderQty;

    public boolean hasDayOrderQty()
    {
        return hasDayOrderQty;
    }

    public ExecutionReportEncoder dayOrderQty(DecimalFloat value)
    {
        dayOrderQty.set(value);
        hasDayOrderQty = true;
        return this;
    }

    public ExecutionReportEncoder dayOrderQty(long value, int scale)
    {
        dayOrderQty.set(value, scale);
        hasDayOrderQty = true;
        return this;
    }

    public DecimalFloat dayOrderQty()
    {
        return dayOrderQty;
    }

    private final DecimalFloat dayCumQty = new DecimalFloat();

    private boolean hasDayCumQty;

    public boolean hasDayCumQty()
    {
        return hasDayCumQty;
    }

    public ExecutionReportEncoder dayCumQty(DecimalFloat value)
    {
        dayCumQty.set(value);
        hasDayCumQty = true;
        return this;
    }

    public ExecutionReportEncoder dayCumQty(long value, int scale)
    {
        dayCumQty.set(value, scale);
        hasDayCumQty = true;
        return this;
    }

    public DecimalFloat dayCumQty()
    {
        return dayCumQty;
    }

    private final DecimalFloat dayAvgPx = new DecimalFloat();

    private boolean hasDayAvgPx;

    public boolean hasDayAvgPx()
    {
        return hasDayAvgPx;
    }

    public ExecutionReportEncoder dayAvgPx(DecimalFloat value)
    {
        dayAvgPx.set(value);
        hasDayAvgPx = true;
        return this;
    }

    public ExecutionReportEncoder dayAvgPx(long value, int scale)
    {
        dayAvgPx.set(value, scale);
        hasDayAvgPx = true;
        return this;
    }

    public DecimalFloat dayAvgPx()
    {
        return dayAvgPx;
    }

    private int totNoFills;

    private boolean hasTotNoFills;

    public boolean hasTotNoFills()
    {
        return hasTotNoFills;
    }

    public ExecutionReportEncoder totNoFills(int value)
    {
        totNoFills = value;
        hasTotNoFills = true;
        return this;
    }

    public int totNoFills()
    {
        return totNoFills;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public ExecutionReportEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }

    private final FillsGrpEncoder fillsGrp = new FillsGrpEncoder();
    public FillsGrpEncoder fillsGrp()
    {
        return fillsGrp;
    }

    private int gTBookingInst;

    private boolean hasGTBookingInst;

    public boolean hasGTBookingInst()
    {
        return hasGTBookingInst;
    }

    public ExecutionReportEncoder gTBookingInst(int value)
    {
        gTBookingInst = value;
        hasGTBookingInst = true;
        return this;
    }

    public int gTBookingInst()
    {
        return gTBookingInst;
    }

    public ExecutionReportEncoder gTBookingInst(GTBookingInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == GTBookingInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: gTBookingInst Value: " + value );
            }
            if (value == GTBookingInst.NULL_VAL)
            {
                return this;
            }
        }
        return gTBookingInst(value.representation());
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public ExecutionReportEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public ExecutionReportEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public ExecutionReportEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public ExecutionReportEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public ExecutionReportEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ExecutionReportEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public ExecutionReportEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ExecutionReportEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    private boolean reportToExch;

    private boolean hasReportToExch;

    public boolean hasReportToExch()
    {
        return hasReportToExch;
    }

    public ExecutionReportEncoder reportToExch(boolean value)
    {
        reportToExch = value;
        hasReportToExch = true;
        return this;
    }

    public boolean reportToExch()
    {
        return reportToExch;
    }

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = new SpreadOrBenchmarkCurveDataEncoder();
    public SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData()
    {
        return spreadOrBenchmarkCurveData;
    }

    private final YieldDataEncoder yieldData = new YieldDataEncoder();
    public YieldDataEncoder yieldData()
    {
        return yieldData;
    }

    private final DecimalFloat grossTradeAmt = new DecimalFloat();

    private boolean hasGrossTradeAmt;

    public boolean hasGrossTradeAmt()
    {
        return hasGrossTradeAmt;
    }

    public ExecutionReportEncoder grossTradeAmt(DecimalFloat value)
    {
        grossTradeAmt.set(value);
        hasGrossTradeAmt = true;
        return this;
    }

    public ExecutionReportEncoder grossTradeAmt(long value, int scale)
    {
        grossTradeAmt.set(value, scale);
        hasGrossTradeAmt = true;
        return this;
    }

    public DecimalFloat grossTradeAmt()
    {
        return grossTradeAmt;
    }

    private int numDaysInterest;

    private boolean hasNumDaysInterest;

    public boolean hasNumDaysInterest()
    {
        return hasNumDaysInterest;
    }

    public ExecutionReportEncoder numDaysInterest(int value)
    {
        numDaysInterest = value;
        hasNumDaysInterest = true;
        return this;
    }

    public int numDaysInterest()
    {
        return numDaysInterest;
    }

    private final MutableDirectBuffer exDate = new UnsafeBuffer();

    private int exDateOffset = 0;

    private int exDateLength = 0;

    public ExecutionReportEncoder exDate(final DirectBuffer value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public ExecutionReportEncoder exDate(final DirectBuffer value, final int length)
    {
        return exDate(value, 0, length);
    }

    public ExecutionReportEncoder exDate(final DirectBuffer value)
    {
        return exDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder exDate(final byte[] value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public ExecutionReportEncoder exDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDate, value, offset, length);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public ExecutionReportEncoder exDate(final byte[] value, final int length)
    {
        return exDate(value, 0, length);
    }

    public ExecutionReportEncoder exDate(final byte[] value)
    {
        return exDate(value, 0, value.length);
    }

    public boolean hasExDate()
    {
        return exDateLength > 0;
    }

    public MutableDirectBuffer exDate()
    {
        return exDate;
    }

    public String exDateAsString()
    {
        return exDate.getStringWithoutLengthAscii(exDateOffset, exDateLength);
    }

    private final DecimalFloat accruedInterestRate = new DecimalFloat();

    private boolean hasAccruedInterestRate;

    public boolean hasAccruedInterestRate()
    {
        return hasAccruedInterestRate;
    }

    public ExecutionReportEncoder accruedInterestRate(DecimalFloat value)
    {
        accruedInterestRate.set(value);
        hasAccruedInterestRate = true;
        return this;
    }

    public ExecutionReportEncoder accruedInterestRate(long value, int scale)
    {
        accruedInterestRate.set(value, scale);
        hasAccruedInterestRate = true;
        return this;
    }

    public DecimalFloat accruedInterestRate()
    {
        return accruedInterestRate;
    }

    private final DecimalFloat accruedInterestAmt = new DecimalFloat();

    private boolean hasAccruedInterestAmt;

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }

    public ExecutionReportEncoder accruedInterestAmt(DecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    public ExecutionReportEncoder accruedInterestAmt(long value, int scale)
    {
        accruedInterestAmt.set(value, scale);
        hasAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat accruedInterestAmt()
    {
        return accruedInterestAmt;
    }

    private final DecimalFloat interestAtMaturity = new DecimalFloat();

    private boolean hasInterestAtMaturity;

    public boolean hasInterestAtMaturity()
    {
        return hasInterestAtMaturity;
    }

    public ExecutionReportEncoder interestAtMaturity(DecimalFloat value)
    {
        interestAtMaturity.set(value);
        hasInterestAtMaturity = true;
        return this;
    }

    public ExecutionReportEncoder interestAtMaturity(long value, int scale)
    {
        interestAtMaturity.set(value, scale);
        hasInterestAtMaturity = true;
        return this;
    }

    public DecimalFloat interestAtMaturity()
    {
        return interestAtMaturity;
    }

    private final DecimalFloat endAccruedInterestAmt = new DecimalFloat();

    private boolean hasEndAccruedInterestAmt;

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }

    public ExecutionReportEncoder endAccruedInterestAmt(DecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public ExecutionReportEncoder endAccruedInterestAmt(long value, int scale)
    {
        endAccruedInterestAmt.set(value, scale);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public DecimalFloat endAccruedInterestAmt()
    {
        return endAccruedInterestAmt;
    }

    private final DecimalFloat startCash = new DecimalFloat();

    private boolean hasStartCash;

    public boolean hasStartCash()
    {
        return hasStartCash;
    }

    public ExecutionReportEncoder startCash(DecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    public ExecutionReportEncoder startCash(long value, int scale)
    {
        startCash.set(value, scale);
        hasStartCash = true;
        return this;
    }

    public DecimalFloat startCash()
    {
        return startCash;
    }

    private final DecimalFloat endCash = new DecimalFloat();

    private boolean hasEndCash;

    public boolean hasEndCash()
    {
        return hasEndCash;
    }

    public ExecutionReportEncoder endCash(DecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    public ExecutionReportEncoder endCash(long value, int scale)
    {
        endCash.set(value, scale);
        hasEndCash = true;
        return this;
    }

    public DecimalFloat endCash()
    {
        return endCash;
    }

    private boolean tradedFlatSwitch;

    private boolean hasTradedFlatSwitch;

    public boolean hasTradedFlatSwitch()
    {
        return hasTradedFlatSwitch;
    }

    public ExecutionReportEncoder tradedFlatSwitch(boolean value)
    {
        tradedFlatSwitch = value;
        hasTradedFlatSwitch = true;
        return this;
    }

    public boolean tradedFlatSwitch()
    {
        return tradedFlatSwitch;
    }

    private final MutableDirectBuffer basisFeatureDate = new UnsafeBuffer();

    private int basisFeatureDateOffset = 0;

    private int basisFeatureDateLength = 0;

    public ExecutionReportEncoder basisFeatureDate(final DirectBuffer value, final int offset, final int length)
    {
        basisFeatureDate.wrap(value);
        basisFeatureDateOffset = offset;
        basisFeatureDateLength = length;
        return this;
    }

    public ExecutionReportEncoder basisFeatureDate(final DirectBuffer value, final int length)
    {
        return basisFeatureDate(value, 0, length);
    }

    public ExecutionReportEncoder basisFeatureDate(final DirectBuffer value)
    {
        return basisFeatureDate(value, 0, value.capacity());
    }

    public ExecutionReportEncoder basisFeatureDate(final byte[] value, final int offset, final int length)
    {
        basisFeatureDate.wrap(value);
        basisFeatureDateOffset = offset;
        basisFeatureDateLength = length;
        return this;
    }

    public ExecutionReportEncoder basisFeatureDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(basisFeatureDate, value, offset, length);
        basisFeatureDateOffset = offset;
        basisFeatureDateLength = length;
        return this;
    }

    public ExecutionReportEncoder basisFeatureDate(final byte[] value, final int length)
    {
        return basisFeatureDate(value, 0, length);
    }

    public ExecutionReportEncoder basisFeatureDate(final byte[] value)
    {
        return basisFeatureDate(value, 0, value.length);
    }

    public boolean hasBasisFeatureDate()
    {
        return basisFeatureDateLength > 0;
    }

    public MutableDirectBuffer basisFeatureDate()
    {
        return basisFeatureDate;
    }

    public String basisFeatureDateAsString()
    {
        return basisFeatureDate.getStringWithoutLengthAscii(basisFeatureDateOffset, basisFeatureDateLength);
    }

    private final DecimalFloat basisFeaturePrice = new DecimalFloat();

    private boolean hasBasisFeaturePrice;

    public boolean hasBasisFeaturePrice()
    {
        return hasBasisFeaturePrice;
    }

    public ExecutionReportEncoder basisFeaturePrice(DecimalFloat value)
    {
        basisFeaturePrice.set(value);
        hasBasisFeaturePrice = true;
        return this;
    }

    public ExecutionReportEncoder basisFeaturePrice(long value, int scale)
    {
        basisFeaturePrice.set(value, scale);
        hasBasisFeaturePrice = true;
        return this;
    }

    public DecimalFloat basisFeaturePrice()
    {
        return basisFeaturePrice;
    }

    private final DecimalFloat concession = new DecimalFloat();

    private boolean hasConcession;

    public boolean hasConcession()
    {
        return hasConcession;
    }

    public ExecutionReportEncoder concession(DecimalFloat value)
    {
        concession.set(value);
        hasConcession = true;
        return this;
    }

    public ExecutionReportEncoder concession(long value, int scale)
    {
        concession.set(value, scale);
        hasConcession = true;
        return this;
    }

    public DecimalFloat concession()
    {
        return concession;
    }

    private final DecimalFloat totalTakedown = new DecimalFloat();

    private boolean hasTotalTakedown;

    public boolean hasTotalTakedown()
    {
        return hasTotalTakedown;
    }

    public ExecutionReportEncoder totalTakedown(DecimalFloat value)
    {
        totalTakedown.set(value);
        hasTotalTakedown = true;
        return this;
    }

    public ExecutionReportEncoder totalTakedown(long value, int scale)
    {
        totalTakedown.set(value, scale);
        hasTotalTakedown = true;
        return this;
    }

    public DecimalFloat totalTakedown()
    {
        return totalTakedown;
    }

    private final DecimalFloat netMoney = new DecimalFloat();

    private boolean hasNetMoney;

    public boolean hasNetMoney()
    {
        return hasNetMoney;
    }

    public ExecutionReportEncoder netMoney(DecimalFloat value)
    {
        netMoney.set(value);
        hasNetMoney = true;
        return this;
    }

    public ExecutionReportEncoder netMoney(long value, int scale)
    {
        netMoney.set(value, scale);
        hasNetMoney = true;
        return this;
    }

    public DecimalFloat netMoney()
    {
        return netMoney;
    }

    private final DecimalFloat settlCurrAmt = new DecimalFloat();

    private boolean hasSettlCurrAmt;

    public boolean hasSettlCurrAmt()
    {
        return hasSettlCurrAmt;
    }

    public ExecutionReportEncoder settlCurrAmt(DecimalFloat value)
    {
        settlCurrAmt.set(value);
        hasSettlCurrAmt = true;
        return this;
    }

    public ExecutionReportEncoder settlCurrAmt(long value, int scale)
    {
        settlCurrAmt.set(value, scale);
        hasSettlCurrAmt = true;
        return this;
    }

    public DecimalFloat settlCurrAmt()
    {
        return settlCurrAmt;
    }

    private final MutableDirectBuffer settlCurrency = new UnsafeBuffer();

    private int settlCurrencyOffset = 0;

    private int settlCurrencyLength = 0;

    public ExecutionReportEncoder settlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public ExecutionReportEncoder settlCurrency(final DirectBuffer value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public ExecutionReportEncoder settlCurrency(final DirectBuffer value)
    {
        return settlCurrency(value, 0, value.capacity());
    }

    public ExecutionReportEncoder settlCurrency(final byte[] value, final int offset, final int length)
    {
        settlCurrency.wrap(value);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public ExecutionReportEncoder settlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlCurrency, value, offset, length);
        settlCurrencyOffset = offset;
        settlCurrencyLength = length;
        return this;
    }

    public ExecutionReportEncoder settlCurrency(final byte[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public ExecutionReportEncoder settlCurrency(final byte[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public boolean hasSettlCurrency()
    {
        return settlCurrencyLength > 0;
    }

    public MutableDirectBuffer settlCurrency()
    {
        return settlCurrency;
    }

    public String settlCurrencyAsString()
    {
        return settlCurrency.getStringWithoutLengthAscii(settlCurrencyOffset, settlCurrencyLength);
    }

    public ExecutionReportEncoder settlCurrency(final CharSequence value)
    {
        toBytes(value, settlCurrency);
        settlCurrencyOffset = 0;
        settlCurrencyLength = value.length();
        return this;
    }

    public ExecutionReportEncoder settlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlCurrency.wrap(buffer);
            settlCurrencyOffset = value.offset();
            settlCurrencyLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder settlCurrency(final char[] value)
    {
        return settlCurrency(value, 0, value.length);
    }

    public ExecutionReportEncoder settlCurrency(final char[] value, final int length)
    {
        return settlCurrency(value, 0, length);
    }

    public ExecutionReportEncoder settlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlCurrency, offset, length);
        settlCurrencyOffset = 0;
        settlCurrencyLength = length;
        return this;
    }

    private final RateSourceEncoder rateSource = new RateSourceEncoder();
    public RateSourceEncoder rateSource()
    {
        return rateSource;
    }

    private final DecimalFloat settlCurrFxRate = new DecimalFloat();

    private boolean hasSettlCurrFxRate;

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }

    public ExecutionReportEncoder settlCurrFxRate(DecimalFloat value)
    {
        settlCurrFxRate.set(value);
        hasSettlCurrFxRate = true;
        return this;
    }

    public ExecutionReportEncoder settlCurrFxRate(long value, int scale)
    {
        settlCurrFxRate.set(value, scale);
        hasSettlCurrFxRate = true;
        return this;
    }

    public DecimalFloat settlCurrFxRate()
    {
        return settlCurrFxRate;
    }

    private char settlCurrFxRateCalc;

    private boolean hasSettlCurrFxRateCalc;

    public boolean hasSettlCurrFxRateCalc()
    {
        return hasSettlCurrFxRateCalc;
    }

    public ExecutionReportEncoder settlCurrFxRateCalc(char value)
    {
        settlCurrFxRateCalc = value;
        hasSettlCurrFxRateCalc = true;
        return this;
    }

    public char settlCurrFxRateCalc()
    {
        return settlCurrFxRateCalc;
    }

    public ExecutionReportEncoder settlCurrFxRateCalc(SettlCurrFxRateCalc value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlCurrFxRateCalc.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlCurrFxRateCalc Value: " + value );
            }
            if (value == SettlCurrFxRateCalc.NULL_VAL)
            {
                return this;
            }
        }
        return settlCurrFxRateCalc(value.representation());
    }

    private char handlInst;

    private boolean hasHandlInst;

    public boolean hasHandlInst()
    {
        return hasHandlInst;
    }

    public ExecutionReportEncoder handlInst(char value)
    {
        handlInst = value;
        hasHandlInst = true;
        return this;
    }

    public char handlInst()
    {
        return handlInst;
    }

    public ExecutionReportEncoder handlInst(HandlInst value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == HandlInst.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: handlInst Value: " + value );
            }
            if (value == HandlInst.NULL_VAL)
            {
                return this;
            }
        }
        return handlInst(value.representation());
    }

    private final DecimalFloat minQty = new DecimalFloat();

    private boolean hasMinQty;

    public boolean hasMinQty()
    {
        return hasMinQty;
    }

    public ExecutionReportEncoder minQty(DecimalFloat value)
    {
        minQty.set(value);
        hasMinQty = true;
        return this;
    }

    public ExecutionReportEncoder minQty(long value, int scale)
    {
        minQty.set(value, scale);
        hasMinQty = true;
        return this;
    }

    public DecimalFloat minQty()
    {
        return minQty;
    }

    private final DecimalFloat matchIncrement = new DecimalFloat();

    private boolean hasMatchIncrement;

    public boolean hasMatchIncrement()
    {
        return hasMatchIncrement;
    }

    public ExecutionReportEncoder matchIncrement(DecimalFloat value)
    {
        matchIncrement.set(value);
        hasMatchIncrement = true;
        return this;
    }

    public ExecutionReportEncoder matchIncrement(long value, int scale)
    {
        matchIncrement.set(value, scale);
        hasMatchIncrement = true;
        return this;
    }

    public DecimalFloat matchIncrement()
    {
        return matchIncrement;
    }

    private int maxPriceLevels;

    private boolean hasMaxPriceLevels;

    public boolean hasMaxPriceLevels()
    {
        return hasMaxPriceLevels;
    }

    public ExecutionReportEncoder maxPriceLevels(int value)
    {
        maxPriceLevels = value;
        hasMaxPriceLevels = true;
        return this;
    }

    public int maxPriceLevels()
    {
        return maxPriceLevels;
    }

    private final DisplayInstructionEncoder displayInstruction = new DisplayInstructionEncoder();
    public DisplayInstructionEncoder displayInstruction()
    {
        return displayInstruction;
    }

    private final DecimalFloat maxFloor = new DecimalFloat();

    private boolean hasMaxFloor;

    public boolean hasMaxFloor()
    {
        return hasMaxFloor;
    }

    public ExecutionReportEncoder maxFloor(DecimalFloat value)
    {
        maxFloor.set(value);
        hasMaxFloor = true;
        return this;
    }

    public ExecutionReportEncoder maxFloor(long value, int scale)
    {
        maxFloor.set(value, scale);
        hasMaxFloor = true;
        return this;
    }

    public DecimalFloat maxFloor()
    {
        return maxFloor;
    }

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    public ExecutionReportEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public ExecutionReportEncoder positionEffect(PositionEffect value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PositionEffect.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: positionEffect Value: " + value );
            }
            if (value == PositionEffect.NULL_VAL)
            {
                return this;
            }
        }
        return positionEffect(value.representation());
    }

    private final DecimalFloat maxShow = new DecimalFloat();

    private boolean hasMaxShow;

    public boolean hasMaxShow()
    {
        return hasMaxShow;
    }

    public ExecutionReportEncoder maxShow(DecimalFloat value)
    {
        maxShow.set(value);
        hasMaxShow = true;
        return this;
    }

    public ExecutionReportEncoder maxShow(long value, int scale)
    {
        maxShow.set(value, scale);
        hasMaxShow = true;
        return this;
    }

    public DecimalFloat maxShow()
    {
        return maxShow;
    }

    private int bookingType;

    private boolean hasBookingType;

    public boolean hasBookingType()
    {
        return hasBookingType;
    }

    public ExecutionReportEncoder bookingType(int value)
    {
        bookingType = value;
        hasBookingType = true;
        return this;
    }

    public int bookingType()
    {
        return bookingType;
    }

    public ExecutionReportEncoder bookingType(BookingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BookingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bookingType Value: " + value );
            }
            if (value == BookingType.NULL_VAL)
            {
                return this;
            }
        }
        return bookingType(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public ExecutionReportEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ExecutionReportEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public ExecutionReportEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public ExecutionReportEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ExecutionReportEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public ExecutionReportEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ExecutionReportEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public ExecutionReportEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public ExecutionReportEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public ExecutionReportEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public ExecutionReportEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public ExecutionReportEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public ExecutionReportEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public ExecutionReportEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final MutableDirectBuffer settlDate2 = new UnsafeBuffer();

    private int settlDate2Offset = 0;

    private int settlDate2Length = 0;

    public ExecutionReportEncoder settlDate2(final DirectBuffer value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public ExecutionReportEncoder settlDate2(final DirectBuffer value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public ExecutionReportEncoder settlDate2(final DirectBuffer value)
    {
        return settlDate2(value, 0, value.capacity());
    }

    public ExecutionReportEncoder settlDate2(final byte[] value, final int offset, final int length)
    {
        settlDate2.wrap(value);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public ExecutionReportEncoder settlDate2AsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate2, value, offset, length);
        settlDate2Offset = offset;
        settlDate2Length = length;
        return this;
    }

    public ExecutionReportEncoder settlDate2(final byte[] value, final int length)
    {
        return settlDate2(value, 0, length);
    }

    public ExecutionReportEncoder settlDate2(final byte[] value)
    {
        return settlDate2(value, 0, value.length);
    }

    public boolean hasSettlDate2()
    {
        return settlDate2Length > 0;
    }

    public MutableDirectBuffer settlDate2()
    {
        return settlDate2;
    }

    public String settlDate2AsString()
    {
        return settlDate2.getStringWithoutLengthAscii(settlDate2Offset, settlDate2Length);
    }

    private final DecimalFloat orderQty2 = new DecimalFloat();

    private boolean hasOrderQty2;

    public boolean hasOrderQty2()
    {
        return hasOrderQty2;
    }

    public ExecutionReportEncoder orderQty2(DecimalFloat value)
    {
        orderQty2.set(value);
        hasOrderQty2 = true;
        return this;
    }

    public ExecutionReportEncoder orderQty2(long value, int scale)
    {
        orderQty2.set(value, scale);
        hasOrderQty2 = true;
        return this;
    }

    public DecimalFloat orderQty2()
    {
        return orderQty2;
    }

    private final DecimalFloat lastForwardPoints2 = new DecimalFloat();

    private boolean hasLastForwardPoints2;

    public boolean hasLastForwardPoints2()
    {
        return hasLastForwardPoints2;
    }

    public ExecutionReportEncoder lastForwardPoints2(DecimalFloat value)
    {
        lastForwardPoints2.set(value);
        hasLastForwardPoints2 = true;
        return this;
    }

    public ExecutionReportEncoder lastForwardPoints2(long value, int scale)
    {
        lastForwardPoints2.set(value, scale);
        hasLastForwardPoints2 = true;
        return this;
    }

    public DecimalFloat lastForwardPoints2()
    {
        return lastForwardPoints2;
    }

    private char multiLegReportingType;

    private boolean hasMultiLegReportingType;

    public boolean hasMultiLegReportingType()
    {
        return hasMultiLegReportingType;
    }

    public ExecutionReportEncoder multiLegReportingType(char value)
    {
        multiLegReportingType = value;
        hasMultiLegReportingType = true;
        return this;
    }

    public char multiLegReportingType()
    {
        return multiLegReportingType;
    }

    public ExecutionReportEncoder multiLegReportingType(MultiLegReportingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MultiLegReportingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: multiLegReportingType Value: " + value );
            }
            if (value == MultiLegReportingType.NULL_VAL)
            {
                return this;
            }
        }
        return multiLegReportingType(value.representation());
    }

    private char cancellationRights;

    private boolean hasCancellationRights;

    public boolean hasCancellationRights()
    {
        return hasCancellationRights;
    }

    public ExecutionReportEncoder cancellationRights(char value)
    {
        cancellationRights = value;
        hasCancellationRights = true;
        return this;
    }

    public char cancellationRights()
    {
        return cancellationRights;
    }

    public ExecutionReportEncoder cancellationRights(CancellationRights value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == CancellationRights.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: cancellationRights Value: " + value );
            }
            if (value == CancellationRights.NULL_VAL)
            {
                return this;
            }
        }
        return cancellationRights(value.representation());
    }

    private char moneyLaunderingStatus;

    private boolean hasMoneyLaunderingStatus;

    public boolean hasMoneyLaunderingStatus()
    {
        return hasMoneyLaunderingStatus;
    }

    public ExecutionReportEncoder moneyLaunderingStatus(char value)
    {
        moneyLaunderingStatus = value;
        hasMoneyLaunderingStatus = true;
        return this;
    }

    public char moneyLaunderingStatus()
    {
        return moneyLaunderingStatus;
    }

    public ExecutionReportEncoder moneyLaunderingStatus(MoneyLaunderingStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MoneyLaunderingStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: moneyLaunderingStatus Value: " + value );
            }
            if (value == MoneyLaunderingStatus.NULL_VAL)
            {
                return this;
            }
        }
        return moneyLaunderingStatus(value.representation());
    }

    private final MutableDirectBuffer registID = new UnsafeBuffer();

    private int registIDOffset = 0;

    private int registIDLength = 0;

    public ExecutionReportEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public ExecutionReportEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public ExecutionReportEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public ExecutionReportEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public ExecutionReportEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public ExecutionReportEncoder registID(final byte[] value)
    {
        return registID(value, 0, value.length);
    }

    public boolean hasRegistID()
    {
        return registIDLength > 0;
    }

    public MutableDirectBuffer registID()
    {
        return registID;
    }

    public String registIDAsString()
    {
        return registID.getStringWithoutLengthAscii(registIDOffset, registIDLength);
    }

    public ExecutionReportEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder registID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registID.wrap(buffer);
            registIDOffset = value.offset();
            registIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public ExecutionReportEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public ExecutionReportEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private final MutableDirectBuffer designation = new UnsafeBuffer();

    private int designationOffset = 0;

    private int designationLength = 0;

    public ExecutionReportEncoder designation(final DirectBuffer value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public ExecutionReportEncoder designation(final DirectBuffer value, final int length)
    {
        return designation(value, 0, length);
    }

    public ExecutionReportEncoder designation(final DirectBuffer value)
    {
        return designation(value, 0, value.capacity());
    }

    public ExecutionReportEncoder designation(final byte[] value, final int offset, final int length)
    {
        designation.wrap(value);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public ExecutionReportEncoder designationAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(designation, value, offset, length);
        designationOffset = offset;
        designationLength = length;
        return this;
    }

    public ExecutionReportEncoder designation(final byte[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public ExecutionReportEncoder designation(final byte[] value)
    {
        return designation(value, 0, value.length);
    }

    public boolean hasDesignation()
    {
        return designationLength > 0;
    }

    public MutableDirectBuffer designation()
    {
        return designation;
    }

    public String designationAsString()
    {
        return designation.getStringWithoutLengthAscii(designationOffset, designationLength);
    }

    public ExecutionReportEncoder designation(final CharSequence value)
    {
        toBytes(value, designation);
        designationOffset = 0;
        designationLength = value.length();
        return this;
    }

    public ExecutionReportEncoder designation(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            designation.wrap(buffer);
            designationOffset = value.offset();
            designationLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder designation(final char[] value)
    {
        return designation(value, 0, value.length);
    }

    public ExecutionReportEncoder designation(final char[] value, final int length)
    {
        return designation(value, 0, length);
    }

    public ExecutionReportEncoder designation(final char[] value, final int offset, final int length)
    {
        toBytes(value, designation, offset, length);
        designationOffset = 0;
        designationLength = length;
        return this;
    }

    private final MutableDirectBuffer transBkdTime = new UnsafeBuffer();

    private int transBkdTimeOffset = 0;

    private int transBkdTimeLength = 0;

    public ExecutionReportEncoder transBkdTime(final DirectBuffer value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transBkdTime(final DirectBuffer value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public ExecutionReportEncoder transBkdTime(final DirectBuffer value)
    {
        return transBkdTime(value, 0, value.capacity());
    }

    public ExecutionReportEncoder transBkdTime(final byte[] value, final int offset, final int length)
    {
        transBkdTime.wrap(value);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transBkdTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transBkdTime, value, offset, length);
        transBkdTimeOffset = offset;
        transBkdTimeLength = length;
        return this;
    }

    public ExecutionReportEncoder transBkdTime(final byte[] value, final int length)
    {
        return transBkdTime(value, 0, length);
    }

    public ExecutionReportEncoder transBkdTime(final byte[] value)
    {
        return transBkdTime(value, 0, value.length);
    }

    public boolean hasTransBkdTime()
    {
        return transBkdTimeLength > 0;
    }

    public MutableDirectBuffer transBkdTime()
    {
        return transBkdTime;
    }

    public String transBkdTimeAsString()
    {
        return transBkdTime.getStringWithoutLengthAscii(transBkdTimeOffset, transBkdTimeLength);
    }

    private final MutableDirectBuffer execValuationPoint = new UnsafeBuffer();

    private int execValuationPointOffset = 0;

    private int execValuationPointLength = 0;

    public ExecutionReportEncoder execValuationPoint(final DirectBuffer value, final int offset, final int length)
    {
        execValuationPoint.wrap(value);
        execValuationPointOffset = offset;
        execValuationPointLength = length;
        return this;
    }

    public ExecutionReportEncoder execValuationPoint(final DirectBuffer value, final int length)
    {
        return execValuationPoint(value, 0, length);
    }

    public ExecutionReportEncoder execValuationPoint(final DirectBuffer value)
    {
        return execValuationPoint(value, 0, value.capacity());
    }

    public ExecutionReportEncoder execValuationPoint(final byte[] value, final int offset, final int length)
    {
        execValuationPoint.wrap(value);
        execValuationPointOffset = offset;
        execValuationPointLength = length;
        return this;
    }

    public ExecutionReportEncoder execValuationPointAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(execValuationPoint, value, offset, length);
        execValuationPointOffset = offset;
        execValuationPointLength = length;
        return this;
    }

    public ExecutionReportEncoder execValuationPoint(final byte[] value, final int length)
    {
        return execValuationPoint(value, 0, length);
    }

    public ExecutionReportEncoder execValuationPoint(final byte[] value)
    {
        return execValuationPoint(value, 0, value.length);
    }

    public boolean hasExecValuationPoint()
    {
        return execValuationPointLength > 0;
    }

    public MutableDirectBuffer execValuationPoint()
    {
        return execValuationPoint;
    }

    public String execValuationPointAsString()
    {
        return execValuationPoint.getStringWithoutLengthAscii(execValuationPointOffset, execValuationPointLength);
    }

    private char execPriceType;

    private boolean hasExecPriceType;

    public boolean hasExecPriceType()
    {
        return hasExecPriceType;
    }

    public ExecutionReportEncoder execPriceType(char value)
    {
        execPriceType = value;
        hasExecPriceType = true;
        return this;
    }

    public char execPriceType()
    {
        return execPriceType;
    }

    public ExecutionReportEncoder execPriceType(ExecPriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExecPriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: execPriceType Value: " + value );
            }
            if (value == ExecPriceType.NULL_VAL)
            {
                return this;
            }
        }
        return execPriceType(value.representation());
    }

    private final DecimalFloat execPriceAdjustment = new DecimalFloat();

    private boolean hasExecPriceAdjustment;

    public boolean hasExecPriceAdjustment()
    {
        return hasExecPriceAdjustment;
    }

    public ExecutionReportEncoder execPriceAdjustment(DecimalFloat value)
    {
        execPriceAdjustment.set(value);
        hasExecPriceAdjustment = true;
        return this;
    }

    public ExecutionReportEncoder execPriceAdjustment(long value, int scale)
    {
        execPriceAdjustment.set(value, scale);
        hasExecPriceAdjustment = true;
        return this;
    }

    public DecimalFloat execPriceAdjustment()
    {
        return execPriceAdjustment;
    }

    private int priorityIndicator;

    private boolean hasPriorityIndicator;

    public boolean hasPriorityIndicator()
    {
        return hasPriorityIndicator;
    }

    public ExecutionReportEncoder priorityIndicator(int value)
    {
        priorityIndicator = value;
        hasPriorityIndicator = true;
        return this;
    }

    public int priorityIndicator()
    {
        return priorityIndicator;
    }

    public ExecutionReportEncoder priorityIndicator(PriorityIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PriorityIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: priorityIndicator Value: " + value );
            }
            if (value == PriorityIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return priorityIndicator(value.representation());
    }

    private final DecimalFloat priceImprovement = new DecimalFloat();

    private boolean hasPriceImprovement;

    public boolean hasPriceImprovement()
    {
        return hasPriceImprovement;
    }

    public ExecutionReportEncoder priceImprovement(DecimalFloat value)
    {
        priceImprovement.set(value);
        hasPriceImprovement = true;
        return this;
    }

    public ExecutionReportEncoder priceImprovement(long value, int scale)
    {
        priceImprovement.set(value, scale);
        hasPriceImprovement = true;
        return this;
    }

    public DecimalFloat priceImprovement()
    {
        return priceImprovement;
    }

    private int lastLiquidityInd;

    private boolean hasLastLiquidityInd;

    public boolean hasLastLiquidityInd()
    {
        return hasLastLiquidityInd;
    }

    public ExecutionReportEncoder lastLiquidityInd(int value)
    {
        lastLiquidityInd = value;
        hasLastLiquidityInd = true;
        return this;
    }

    public int lastLiquidityInd()
    {
        return lastLiquidityInd;
    }

    public ExecutionReportEncoder lastLiquidityInd(LastLiquidityInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LastLiquidityInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: lastLiquidityInd Value: " + value );
            }
            if (value == LastLiquidityInd.NULL_VAL)
            {
                return this;
            }
        }
        return lastLiquidityInd(value.representation());
    }

    private final ContAmtGrpEncoder contAmtGrp = new ContAmtGrpEncoder();
    public ContAmtGrpEncoder contAmtGrp()
    {
        return contAmtGrp;
    }

    private final InstrmtLegExecGrpEncoder instrmtLegExecGrp = new InstrmtLegExecGrpEncoder();
    public InstrmtLegExecGrpEncoder instrmtLegExecGrp()
    {
        return instrmtLegExecGrp;
    }

    private boolean copyMsgIndicator;

    private boolean hasCopyMsgIndicator;

    public boolean hasCopyMsgIndicator()
    {
        return hasCopyMsgIndicator;
    }

    public ExecutionReportEncoder copyMsgIndicator(boolean value)
    {
        copyMsgIndicator = value;
        hasCopyMsgIndicator = true;
        return this;
    }

    public boolean copyMsgIndicator()
    {
        return copyMsgIndicator;
    }

    private final MiscFeesGrpEncoder miscFeesGrp = new MiscFeesGrpEncoder();
    public MiscFeesGrpEncoder miscFeesGrp()
    {
        return miscFeesGrp;
    }

    private final DecimalFloat dividendYield = new DecimalFloat();

    private boolean hasDividendYield;

    public boolean hasDividendYield()
    {
        return hasDividendYield;
    }

    public ExecutionReportEncoder dividendYield(DecimalFloat value)
    {
        dividendYield.set(value);
        hasDividendYield = true;
        return this;
    }

    public ExecutionReportEncoder dividendYield(long value, int scale)
    {
        dividendYield.set(value, scale);
        hasDividendYield = true;
        return this;
    }

    public DecimalFloat dividendYield()
    {
        return dividendYield;
    }

    private boolean manualOrderIndicator;

    private boolean hasManualOrderIndicator;

    public boolean hasManualOrderIndicator()
    {
        return hasManualOrderIndicator;
    }

    public ExecutionReportEncoder manualOrderIndicator(boolean value)
    {
        manualOrderIndicator = value;
        hasManualOrderIndicator = true;
        return this;
    }

    public boolean manualOrderIndicator()
    {
        return manualOrderIndicator;
    }

    private boolean custDirectedOrder;

    private boolean hasCustDirectedOrder;

    public boolean hasCustDirectedOrder()
    {
        return hasCustDirectedOrder;
    }

    public ExecutionReportEncoder custDirectedOrder(boolean value)
    {
        custDirectedOrder = value;
        hasCustDirectedOrder = true;
        return this;
    }

    public boolean custDirectedOrder()
    {
        return custDirectedOrder;
    }

    private final MutableDirectBuffer receivedDeptID = new UnsafeBuffer();

    private int receivedDeptIDOffset = 0;

    private int receivedDeptIDLength = 0;

    public ExecutionReportEncoder receivedDeptID(final DirectBuffer value, final int offset, final int length)
    {
        receivedDeptID.wrap(value);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public ExecutionReportEncoder receivedDeptID(final DirectBuffer value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public ExecutionReportEncoder receivedDeptID(final DirectBuffer value)
    {
        return receivedDeptID(value, 0, value.capacity());
    }

    public ExecutionReportEncoder receivedDeptID(final byte[] value, final int offset, final int length)
    {
        receivedDeptID.wrap(value);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public ExecutionReportEncoder receivedDeptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(receivedDeptID, value, offset, length);
        receivedDeptIDOffset = offset;
        receivedDeptIDLength = length;
        return this;
    }

    public ExecutionReportEncoder receivedDeptID(final byte[] value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public ExecutionReportEncoder receivedDeptID(final byte[] value)
    {
        return receivedDeptID(value, 0, value.length);
    }

    public boolean hasReceivedDeptID()
    {
        return receivedDeptIDLength > 0;
    }

    public MutableDirectBuffer receivedDeptID()
    {
        return receivedDeptID;
    }

    public String receivedDeptIDAsString()
    {
        return receivedDeptID.getStringWithoutLengthAscii(receivedDeptIDOffset, receivedDeptIDLength);
    }

    public ExecutionReportEncoder receivedDeptID(final CharSequence value)
    {
        toBytes(value, receivedDeptID);
        receivedDeptIDOffset = 0;
        receivedDeptIDLength = value.length();
        return this;
    }

    public ExecutionReportEncoder receivedDeptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            receivedDeptID.wrap(buffer);
            receivedDeptIDOffset = value.offset();
            receivedDeptIDLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder receivedDeptID(final char[] value)
    {
        return receivedDeptID(value, 0, value.length);
    }

    public ExecutionReportEncoder receivedDeptID(final char[] value, final int length)
    {
        return receivedDeptID(value, 0, length);
    }

    public ExecutionReportEncoder receivedDeptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, receivedDeptID, offset, length);
        receivedDeptIDOffset = 0;
        receivedDeptIDLength = length;
        return this;
    }

    private final MutableDirectBuffer custOrderHandlingInst = new UnsafeBuffer();

    private int custOrderHandlingInstOffset = 0;

    private int custOrderHandlingInstLength = 0;

    public ExecutionReportEncoder custOrderHandlingInst(final DirectBuffer value, final int offset, final int length)
    {
        custOrderHandlingInst.wrap(value);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public ExecutionReportEncoder custOrderHandlingInst(final DirectBuffer value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public ExecutionReportEncoder custOrderHandlingInst(final DirectBuffer value)
    {
        return custOrderHandlingInst(value, 0, value.capacity());
    }

    public ExecutionReportEncoder custOrderHandlingInst(final byte[] value, final int offset, final int length)
    {
        custOrderHandlingInst.wrap(value);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public ExecutionReportEncoder custOrderHandlingInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(custOrderHandlingInst, value, offset, length);
        custOrderHandlingInstOffset = offset;
        custOrderHandlingInstLength = length;
        return this;
    }

    public ExecutionReportEncoder custOrderHandlingInst(final byte[] value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public ExecutionReportEncoder custOrderHandlingInst(final byte[] value)
    {
        return custOrderHandlingInst(value, 0, value.length);
    }

    public boolean hasCustOrderHandlingInst()
    {
        return custOrderHandlingInstLength > 0;
    }

    public MutableDirectBuffer custOrderHandlingInst()
    {
        return custOrderHandlingInst;
    }

    public String custOrderHandlingInstAsString()
    {
        return custOrderHandlingInst.getStringWithoutLengthAscii(custOrderHandlingInstOffset, custOrderHandlingInstLength);
    }

    public ExecutionReportEncoder custOrderHandlingInst(final CharSequence value)
    {
        toBytes(value, custOrderHandlingInst);
        custOrderHandlingInstOffset = 0;
        custOrderHandlingInstLength = value.length();
        return this;
    }

    public ExecutionReportEncoder custOrderHandlingInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            custOrderHandlingInst.wrap(buffer);
            custOrderHandlingInstOffset = value.offset();
            custOrderHandlingInstLength = value.length();
        }
        return this;
    }

    public ExecutionReportEncoder custOrderHandlingInst(final char[] value)
    {
        return custOrderHandlingInst(value, 0, value.length);
    }

    public ExecutionReportEncoder custOrderHandlingInst(final char[] value, final int length)
    {
        return custOrderHandlingInst(value, 0, length);
    }

    public ExecutionReportEncoder custOrderHandlingInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, custOrderHandlingInst, offset, length);
        custOrderHandlingInstOffset = 0;
        custOrderHandlingInstLength = length;
        return this;
    }

    private int orderHandlingInstSource;

    private boolean hasOrderHandlingInstSource;

    public boolean hasOrderHandlingInstSource()
    {
        return hasOrderHandlingInstSource;
    }

    public ExecutionReportEncoder orderHandlingInstSource(int value)
    {
        orderHandlingInstSource = value;
        hasOrderHandlingInstSource = true;
        return this;
    }

    public int orderHandlingInstSource()
    {
        return orderHandlingInstSource;
    }

    public ExecutionReportEncoder orderHandlingInstSource(OrderHandlingInstSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderHandlingInstSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderHandlingInstSource Value: " + value );
            }
            if (value == OrderHandlingInstSource.NULL_VAL)
            {
                return this;
            }
        }
        return orderHandlingInstSource(value.representation());
    }

    private final TrdRegTimestampsEncoder trdRegTimestamps = new TrdRegTimestampsEncoder();
    public TrdRegTimestampsEncoder trdRegTimestamps()
    {
        return trdRegTimestamps;
    }

    private final DecimalFloat volatility = new DecimalFloat();

    private boolean hasVolatility;

    public boolean hasVolatility()
    {
        return hasVolatility;
    }

    public ExecutionReportEncoder volatility(DecimalFloat value)
    {
        volatility.set(value);
        hasVolatility = true;
        return this;
    }

    public ExecutionReportEncoder volatility(long value, int scale)
    {
        volatility.set(value, scale);
        hasVolatility = true;
        return this;
    }

    public DecimalFloat volatility()
    {
        return volatility;
    }

    private final DecimalFloat timeToExpiration = new DecimalFloat();

    private boolean hasTimeToExpiration;

    public boolean hasTimeToExpiration()
    {
        return hasTimeToExpiration;
    }

    public ExecutionReportEncoder timeToExpiration(DecimalFloat value)
    {
        timeToExpiration.set(value);
        hasTimeToExpiration = true;
        return this;
    }

    public ExecutionReportEncoder timeToExpiration(long value, int scale)
    {
        timeToExpiration.set(value, scale);
        hasTimeToExpiration = true;
        return this;
    }

    public DecimalFloat timeToExpiration()
    {
        return timeToExpiration;
    }

    private final DecimalFloat riskFreeRate = new DecimalFloat();

    private boolean hasRiskFreeRate;

    public boolean hasRiskFreeRate()
    {
        return hasRiskFreeRate;
    }

    public ExecutionReportEncoder riskFreeRate(DecimalFloat value)
    {
        riskFreeRate.set(value);
        hasRiskFreeRate = true;
        return this;
    }

    public ExecutionReportEncoder riskFreeRate(long value, int scale)
    {
        riskFreeRate.set(value, scale);
        hasRiskFreeRate = true;
        return this;
    }

    public DecimalFloat riskFreeRate()
    {
        return riskFreeRate;
    }

    private final DecimalFloat priceDelta = new DecimalFloat();

    private boolean hasPriceDelta;

    public boolean hasPriceDelta()
    {
        return hasPriceDelta;
    }

    public ExecutionReportEncoder priceDelta(DecimalFloat value)
    {
        priceDelta.set(value);
        hasPriceDelta = true;
        return this;
    }

    public ExecutionReportEncoder priceDelta(long value, int scale)
    {
        priceDelta.set(value, scale);
        hasPriceDelta = true;
        return this;
    }

    public DecimalFloat priceDelta()
    {
        return priceDelta;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrderID");
        }

        if (secondaryOrderIDLength > 0)
        {
            buffer.putBytes(position, secondaryOrderIDHeader, 0, secondaryOrderIDHeaderLength);
            position += secondaryOrderIDHeaderLength;
            buffer.putBytes(position, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            position += secondaryOrderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryClOrdIDLength > 0)
        {
            buffer.putBytes(position, secondaryClOrdIDHeader, 0, secondaryClOrdIDHeaderLength);
            position += secondaryClOrdIDHeaderLength;
            buffer.putBytes(position, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            position += secondaryClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (secondaryExecIDLength > 0)
        {
            buffer.putBytes(position, secondaryExecIDHeader, 0, secondaryExecIDHeaderLength);
            position += secondaryExecIDHeaderLength;
            buffer.putBytes(position, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            position += secondaryExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origClOrdIDLength > 0)
        {
            buffer.putBytes(position, origClOrdIDHeader, 0, origClOrdIDHeaderLength);
            position += origClOrdIDHeaderLength;
            buffer.putBytes(position, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            position += origClOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clOrdLinkIDLength > 0)
        {
            buffer.putBytes(position, clOrdLinkIDHeader, 0, clOrdLinkIDHeaderLength);
            position += clOrdLinkIDHeaderLength;
            buffer.putBytes(position, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            position += clOrdLinkIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (quoteRespIDLength > 0)
        {
            buffer.putBytes(position, quoteRespIDHeader, 0, quoteRespIDHeaderLength);
            position += quoteRespIDHeaderLength;
            buffer.putBytes(position, quoteRespID, quoteRespIDOffset, quoteRespIDLength);
            position += quoteRespIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (ordStatusReqIDLength > 0)
        {
            buffer.putBytes(position, ordStatusReqIDHeader, 0, ordStatusReqIDHeaderLength);
            position += ordStatusReqIDHeaderLength;
            buffer.putBytes(position, ordStatusReqID, ordStatusReqIDOffset, ordStatusReqIDLength);
            position += ordStatusReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (massStatusReqIDLength > 0)
        {
            buffer.putBytes(position, massStatusReqIDHeader, 0, massStatusReqIDHeaderLength);
            position += massStatusReqIDHeaderLength;
            buffer.putBytes(position, massStatusReqID, massStatusReqIDOffset, massStatusReqIDLength);
            position += massStatusReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hostCrossIDLength > 0)
        {
            buffer.putBytes(position, hostCrossIDHeader, 0, hostCrossIDHeaderLength);
            position += hostCrossIDHeaderLength;
            buffer.putBytes(position, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            position += hostCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNumReports)
        {
            buffer.putBytes(position, totNumReportsHeader, 0, totNumReportsHeaderLength);
            position += totNumReportsHeaderLength;
            position += buffer.putIntAscii(position, totNumReports);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastRptRequested)
        {
            buffer.putBytes(position, lastRptRequestedHeader, 0, lastRptRequestedHeaderLength);
            position += lastRptRequestedHeaderLength;
            position += buffer.putBooleanAscii(position, lastRptRequested);
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (tradeOriginationDateLength > 0)
        {
            buffer.putBytes(position, tradeOriginationDateHeader, 0, tradeOriginationDateHeaderLength);
            position += tradeOriginationDateHeaderLength;
            buffer.putBytes(position, tradeOriginationDate, tradeOriginationDateOffset, tradeOriginationDateLength);
            position += tradeOriginationDateLength;
            buffer.putSeparator(position);
            position++;
        }

            position += contraGrp.encode(buffer, position);

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (crossIDLength > 0)
        {
            buffer.putBytes(position, crossIDHeader, 0, crossIDHeaderLength);
            position += crossIDHeaderLength;
            buffer.putBytes(position, crossID, crossIDOffset, crossIDLength);
            position += crossIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (origCrossIDLength > 0)
        {
            buffer.putBytes(position, origCrossIDHeader, 0, origCrossIDHeaderLength);
            position += origCrossIDHeaderLength;
            buffer.putBytes(position, origCrossID, origCrossIDOffset, origCrossIDLength);
            position += origCrossIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasCrossType)
        {
            buffer.putBytes(position, crossTypeHeader, 0, crossTypeHeaderLength);
            position += crossTypeHeaderLength;
            position += buffer.putIntAscii(position, crossType);
            buffer.putSeparator(position);
            position++;
        }

        if (trdMatchIDLength > 0)
        {
            buffer.putBytes(position, trdMatchIDHeader, 0, trdMatchIDHeaderLength);
            position += trdMatchIDHeaderLength;
            buffer.putBytes(position, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            position += trdMatchIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (execIDLength > 0)
        {
            buffer.putBytes(position, execIDHeader, 0, execIDHeaderLength);
            position += execIDHeaderLength;
            buffer.putBytes(position, execID, execIDOffset, execIDLength);
            position += execIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ExecID");
        }

        if (execRefIDLength > 0)
        {
            buffer.putBytes(position, execRefIDHeader, 0, execRefIDHeaderLength);
            position += execRefIDHeaderLength;
            buffer.putBytes(position, execRefID, execRefIDOffset, execRefIDLength);
            position += execRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecType)
        {
            buffer.putBytes(position, execTypeHeader, 0, execTypeHeaderLength);
            position += execTypeHeaderLength;
            position += buffer.putCharAscii(position, execType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ExecType");
        }

        if (hasOrdStatus)
        {
            buffer.putBytes(position, ordStatusHeader, 0, ordStatusHeaderLength);
            position += ordStatusHeaderLength;
            position += buffer.putCharAscii(position, ordStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: OrdStatus");
        }

        if (hasWorkingIndicator)
        {
            buffer.putBytes(position, workingIndicatorHeader, 0, workingIndicatorHeaderLength);
            position += workingIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, workingIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdRejReason)
        {
            buffer.putBytes(position, ordRejReasonHeader, 0, ordRejReasonHeaderLength);
            position += ordRejReasonHeaderLength;
            position += buffer.putIntAscii(position, ordRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecRestatementReason)
        {
            buffer.putBytes(position, execRestatementReasonHeader, 0, execRestatementReasonHeaderLength);
            position += execRestatementReasonHeaderLength;
            position += buffer.putIntAscii(position, execRestatementReason);
            buffer.putSeparator(position);
            position++;
        }

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDayBookingInst)
        {
            buffer.putBytes(position, dayBookingInstHeader, 0, dayBookingInstHeaderLength);
            position += dayBookingInstHeaderLength;
            position += buffer.putCharAscii(position, dayBookingInst);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBookingUnit)
        {
            buffer.putBytes(position, bookingUnitHeader, 0, bookingUnitHeaderLength);
            position += bookingUnitHeaderLength;
            position += buffer.putCharAscii(position, bookingUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreallocMethod)
        {
            buffer.putBytes(position, preallocMethodHeader, 0, preallocMethodHeaderLength);
            position += preallocMethodHeaderLength;
            position += buffer.putCharAscii(position, preallocMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (allocIDLength > 0)
        {
            buffer.putBytes(position, allocIDHeader, 0, allocIDHeaderLength);
            position += allocIDHeaderLength;
            buffer.putBytes(position, allocID, allocIDOffset, allocIDLength);
            position += allocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += preAllocGrp.encode(buffer, position);

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (matchTypeLength > 0)
        {
            buffer.putBytes(position, matchTypeHeader, 0, matchTypeHeaderLength);
            position += matchTypeHeaderLength;
            buffer.putBytes(position, matchType, matchTypeOffset, matchTypeLength);
            position += matchTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderCategory)
        {
            buffer.putBytes(position, orderCategoryHeader, 0, orderCategoryHeaderLength);
            position += orderCategoryHeaderLength;
            position += buffer.putCharAscii(position, orderCategory);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCashMargin)
        {
            buffer.putBytes(position, cashMarginHeader, 0, cashMarginHeaderLength);
            position += cashMarginHeaderLength;
            position += buffer.putCharAscii(position, cashMargin);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingFeeIndicatorLength > 0)
        {
            buffer.putBytes(position, clearingFeeIndicatorHeader, 0, clearingFeeIndicatorHeaderLength);
            position += clearingFeeIndicatorHeaderLength;
            buffer.putBytes(position, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            position += clearingFeeIndicatorLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrument.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Side");
        }

            position += stipulations.encode(buffer, position);

        if (hasQtyType)
        {
            buffer.putBytes(position, qtyTypeHeader, 0, qtyTypeHeaderLength);
            position += qtyTypeHeaderLength;
            position += buffer.putIntAscii(position, qtyType);
            buffer.putSeparator(position);
            position++;
        }

            position += orderQtyData.encode(buffer, position);

        if (hasLotType)
        {
            buffer.putBytes(position, lotTypeHeader, 0, lotTypeHeaderLength);
            position += lotTypeHeaderLength;
            position += buffer.putCharAscii(position, lotType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrdType)
        {
            buffer.putBytes(position, ordTypeHeader, 0, ordTypeHeaderLength);
            position += ordTypeHeaderLength;
            position += buffer.putCharAscii(position, ordType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceType)
        {
            buffer.putBytes(position, priceTypeHeader, 0, priceTypeHeaderLength);
            position += priceTypeHeaderLength;
            position += buffer.putIntAscii(position, priceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPrice)
        {
            buffer.putBytes(position, priceHeader, 0, priceHeaderLength);
            position += priceHeaderLength;
            position += buffer.putFloatAscii(position, price);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceProtectionScope)
        {
            buffer.putBytes(position, priceProtectionScopeHeader, 0, priceProtectionScopeHeaderLength);
            position += priceProtectionScopeHeaderLength;
            position += buffer.putCharAscii(position, priceProtectionScope);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStopPx)
        {
            buffer.putBytes(position, stopPxHeader, 0, stopPxHeaderLength);
            position += stopPxHeaderLength;
            position += buffer.putFloatAscii(position, stopPx);
            buffer.putSeparator(position);
            position++;
        }

            position += triggeringInstruction.encode(buffer, position);

            position += pegInstructions.encode(buffer, position);

            position += discretionInstructions.encode(buffer, position);

        if (hasPeggedPrice)
        {
            buffer.putBytes(position, peggedPriceHeader, 0, peggedPriceHeaderLength);
            position += peggedPriceHeaderLength;
            position += buffer.putFloatAscii(position, peggedPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPeggedRefPrice)
        {
            buffer.putBytes(position, peggedRefPriceHeader, 0, peggedRefPriceHeaderLength);
            position += peggedRefPriceHeaderLength;
            position += buffer.putFloatAscii(position, peggedRefPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDiscretionPrice)
        {
            buffer.putBytes(position, discretionPriceHeader, 0, discretionPriceHeaderLength);
            position += discretionPriceHeaderLength;
            position += buffer.putFloatAscii(position, discretionPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTargetStrategy)
        {
            buffer.putBytes(position, targetStrategyHeader, 0, targetStrategyHeaderLength);
            position += targetStrategyHeaderLength;
            position += buffer.putIntAscii(position, targetStrategy);
            buffer.putSeparator(position);
            position++;
        }

            position += strategyParametersGrp.encode(buffer, position);

        if (targetStrategyParametersLength > 0)
        {
            buffer.putBytes(position, targetStrategyParametersHeader, 0, targetStrategyParametersHeaderLength);
            position += targetStrategyParametersHeaderLength;
            buffer.putBytes(position, targetStrategyParameters, targetStrategyParametersOffset, targetStrategyParametersLength);
            position += targetStrategyParametersLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasParticipationRate)
        {
            buffer.putBytes(position, participationRateHeader, 0, participationRateHeaderLength);
            position += participationRateHeaderLength;
            position += buffer.putFloatAscii(position, participationRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTargetStrategyPerformance)
        {
            buffer.putBytes(position, targetStrategyPerformanceHeader, 0, targetStrategyPerformanceHeaderLength);
            position += targetStrategyPerformanceHeaderLength;
            position += buffer.putFloatAscii(position, targetStrategyPerformance);
            buffer.putSeparator(position);
            position++;
        }

        if (currencyLength > 0)
        {
            buffer.putBytes(position, currencyHeader, 0, currencyHeaderLength);
            position += currencyHeaderLength;
            buffer.putBytes(position, currency, currencyOffset, currencyLength);
            position += currencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (complianceIDLength > 0)
        {
            buffer.putBytes(position, complianceIDHeader, 0, complianceIDHeaderLength);
            position += complianceIDHeaderLength;
            buffer.putBytes(position, complianceID, complianceIDOffset, complianceIDLength);
            position += complianceIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSolicitedFlag)
        {
            buffer.putBytes(position, solicitedFlagHeader, 0, solicitedFlagHeaderLength);
            position += solicitedFlagHeaderLength;
            position += buffer.putBooleanAscii(position, solicitedFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTimeInForce)
        {
            buffer.putBytes(position, timeInForceHeader, 0, timeInForceHeaderLength);
            position += timeInForceHeaderLength;
            position += buffer.putCharAscii(position, timeInForce);
            buffer.putSeparator(position);
            position++;
        }

        if (effectiveTimeLength > 0)
        {
            buffer.putBytes(position, effectiveTimeHeader, 0, effectiveTimeHeaderLength);
            position += effectiveTimeHeaderLength;
            buffer.putBytes(position, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            position += effectiveTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (expireDateLength > 0)
        {
            buffer.putBytes(position, expireDateHeader, 0, expireDateHeaderLength);
            position += expireDateHeaderLength;
            buffer.putBytes(position, expireDate, expireDateOffset, expireDateLength);
            position += expireDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (expireTimeLength > 0)
        {
            buffer.putBytes(position, expireTimeHeader, 0, expireTimeHeaderLength);
            position += expireTimeHeaderLength;
            buffer.putBytes(position, expireTime, expireTimeOffset, expireTimeLength);
            position += expireTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (execInstLength > 0)
        {
            buffer.putBytes(position, execInstHeader, 0, execInstHeaderLength);
            position += execInstHeaderLength;
            buffer.putBytes(position, execInst, execInstOffset, execInstLength);
            position += execInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAggressorIndicator)
        {
            buffer.putBytes(position, aggressorIndicatorHeader, 0, aggressorIndicatorHeaderLength);
            position += aggressorIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, aggressorIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderCapacity)
        {
            buffer.putBytes(position, orderCapacityHeader, 0, orderCapacityHeaderLength);
            position += orderCapacityHeaderLength;
            position += buffer.putCharAscii(position, orderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (orderRestrictionsLength > 0)
        {
            buffer.putBytes(position, orderRestrictionsHeader, 0, orderRestrictionsHeaderLength);
            position += orderRestrictionsHeaderLength;
            buffer.putBytes(position, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            position += orderRestrictionsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasPreTradeAnonymity)
        {
            buffer.putBytes(position, preTradeAnonymityHeader, 0, preTradeAnonymityHeaderLength);
            position += preTradeAnonymityHeaderLength;
            position += buffer.putBooleanAscii(position, preTradeAnonymity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCustOrderCapacity)
        {
            buffer.putBytes(position, custOrderCapacityHeader, 0, custOrderCapacityHeaderLength);
            position += custOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, custOrderCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastQty)
        {
            buffer.putBytes(position, lastQtyHeader, 0, lastQtyHeaderLength);
            position += lastQtyHeaderLength;
            position += buffer.putFloatAscii(position, lastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCalculatedCcyLastQty)
        {
            buffer.putBytes(position, calculatedCcyLastQtyHeader, 0, calculatedCcyLastQtyHeaderLength);
            position += calculatedCcyLastQtyHeaderLength;
            position += buffer.putFloatAscii(position, calculatedCcyLastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastSwapPoints)
        {
            buffer.putBytes(position, lastSwapPointsHeader, 0, lastSwapPointsHeaderLength);
            position += lastSwapPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastSwapPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingLastQty)
        {
            buffer.putBytes(position, underlyingLastQtyHeader, 0, underlyingLastQtyHeaderLength);
            position += underlyingLastQtyHeaderLength;
            position += buffer.putFloatAscii(position, underlyingLastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastPx)
        {
            buffer.putBytes(position, lastPxHeader, 0, lastPxHeaderLength);
            position += lastPxHeaderLength;
            position += buffer.putFloatAscii(position, lastPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasUnderlyingLastPx)
        {
            buffer.putBytes(position, underlyingLastPxHeader, 0, underlyingLastPxHeaderLength);
            position += underlyingLastPxHeaderLength;
            position += buffer.putFloatAscii(position, underlyingLastPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastParPx)
        {
            buffer.putBytes(position, lastParPxHeader, 0, lastParPxHeaderLength);
            position += lastParPxHeaderLength;
            position += buffer.putFloatAscii(position, lastParPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastSpotRate)
        {
            buffer.putBytes(position, lastSpotRateHeader, 0, lastSpotRateHeaderLength);
            position += lastSpotRateHeaderLength;
            position += buffer.putFloatAscii(position, lastSpotRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastForwardPoints)
        {
            buffer.putBytes(position, lastForwardPointsHeader, 0, lastForwardPointsHeaderLength);
            position += lastForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, lastForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (lastMktLength > 0)
        {
            buffer.putBytes(position, lastMktHeader, 0, lastMktHeaderLength);
            position += lastMktHeaderLength;
            buffer.putBytes(position, lastMkt, lastMktOffset, lastMktLength);
            position += lastMktLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (timeBracketLength > 0)
        {
            buffer.putBytes(position, timeBracketHeader, 0, timeBracketHeaderLength);
            position += timeBracketHeaderLength;
            buffer.putBytes(position, timeBracket, timeBracketOffset, timeBracketLength);
            position += timeBracketLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastCapacity)
        {
            buffer.putBytes(position, lastCapacityHeader, 0, lastCapacityHeaderLength);
            position += lastCapacityHeaderLength;
            position += buffer.putCharAscii(position, lastCapacity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLeavesQty)
        {
            buffer.putBytes(position, leavesQtyHeader, 0, leavesQtyHeaderLength);
            position += leavesQtyHeaderLength;
            position += buffer.putFloatAscii(position, leavesQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: LeavesQty");
        }

        if (hasCumQty)
        {
            buffer.putBytes(position, cumQtyHeader, 0, cumQtyHeaderLength);
            position += cumQtyHeaderLength;
            position += buffer.putFloatAscii(position, cumQty);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: CumQty");
        }

        if (hasAvgPx)
        {
            buffer.putBytes(position, avgPxHeader, 0, avgPxHeaderLength);
            position += avgPxHeaderLength;
            position += buffer.putFloatAscii(position, avgPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDayOrderQty)
        {
            buffer.putBytes(position, dayOrderQtyHeader, 0, dayOrderQtyHeaderLength);
            position += dayOrderQtyHeaderLength;
            position += buffer.putFloatAscii(position, dayOrderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDayCumQty)
        {
            buffer.putBytes(position, dayCumQtyHeader, 0, dayCumQtyHeaderLength);
            position += dayCumQtyHeaderLength;
            position += buffer.putFloatAscii(position, dayCumQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDayAvgPx)
        {
            buffer.putBytes(position, dayAvgPxHeader, 0, dayAvgPxHeaderLength);
            position += dayAvgPxHeaderLength;
            position += buffer.putFloatAscii(position, dayAvgPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoFills)
        {
            buffer.putBytes(position, totNoFillsHeader, 0, totNoFillsHeaderLength);
            position += totNoFillsHeaderLength;
            position += buffer.putIntAscii(position, totNoFills);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

            position += fillsGrp.encode(buffer, position);

        if (hasGTBookingInst)
        {
            buffer.putBytes(position, gTBookingInstHeader, 0, gTBookingInstHeaderLength);
            position += gTBookingInstHeaderLength;
            position += buffer.putIntAscii(position, gTBookingInst);
            buffer.putSeparator(position);
            position++;
        }

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasReportToExch)
        {
            buffer.putBytes(position, reportToExchHeader, 0, reportToExchHeaderLength);
            position += reportToExchHeaderLength;
            position += buffer.putBooleanAscii(position, reportToExch);
            buffer.putSeparator(position);
            position++;
        }

            position += commissionData.encode(buffer, position);

            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += yieldData.encode(buffer, position);

        if (hasGrossTradeAmt)
        {
            buffer.putBytes(position, grossTradeAmtHeader, 0, grossTradeAmtHeaderLength);
            position += grossTradeAmtHeaderLength;
            position += buffer.putFloatAscii(position, grossTradeAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNumDaysInterest)
        {
            buffer.putBytes(position, numDaysInterestHeader, 0, numDaysInterestHeaderLength);
            position += numDaysInterestHeaderLength;
            position += buffer.putIntAscii(position, numDaysInterest);
            buffer.putSeparator(position);
            position++;
        }

        if (exDateLength > 0)
        {
            buffer.putBytes(position, exDateHeader, 0, exDateHeaderLength);
            position += exDateHeaderLength;
            buffer.putBytes(position, exDate, exDateOffset, exDateLength);
            position += exDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccruedInterestRate)
        {
            buffer.putBytes(position, accruedInterestRateHeader, 0, accruedInterestRateHeaderLength);
            position += accruedInterestRateHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasAccruedInterestAmt)
        {
            buffer.putBytes(position, accruedInterestAmtHeader, 0, accruedInterestAmtHeaderLength);
            position += accruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, accruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasInterestAtMaturity)
        {
            buffer.putBytes(position, interestAtMaturityHeader, 0, interestAtMaturityHeaderLength);
            position += interestAtMaturityHeaderLength;
            position += buffer.putFloatAscii(position, interestAtMaturity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndAccruedInterestAmt)
        {
            buffer.putBytes(position, endAccruedInterestAmtHeader, 0, endAccruedInterestAmtHeaderLength);
            position += endAccruedInterestAmtHeaderLength;
            position += buffer.putFloatAscii(position, endAccruedInterestAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStartCash)
        {
            buffer.putBytes(position, startCashHeader, 0, startCashHeaderLength);
            position += startCashHeaderLength;
            position += buffer.putFloatAscii(position, startCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEndCash)
        {
            buffer.putBytes(position, endCashHeader, 0, endCashHeaderLength);
            position += endCashHeaderLength;
            position += buffer.putFloatAscii(position, endCash);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradedFlatSwitch)
        {
            buffer.putBytes(position, tradedFlatSwitchHeader, 0, tradedFlatSwitchHeaderLength);
            position += tradedFlatSwitchHeaderLength;
            position += buffer.putBooleanAscii(position, tradedFlatSwitch);
            buffer.putSeparator(position);
            position++;
        }

        if (basisFeatureDateLength > 0)
        {
            buffer.putBytes(position, basisFeatureDateHeader, 0, basisFeatureDateHeaderLength);
            position += basisFeatureDateHeaderLength;
            buffer.putBytes(position, basisFeatureDate, basisFeatureDateOffset, basisFeatureDateLength);
            position += basisFeatureDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasBasisFeaturePrice)
        {
            buffer.putBytes(position, basisFeaturePriceHeader, 0, basisFeaturePriceHeaderLength);
            position += basisFeaturePriceHeaderLength;
            position += buffer.putFloatAscii(position, basisFeaturePrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasConcession)
        {
            buffer.putBytes(position, concessionHeader, 0, concessionHeaderLength);
            position += concessionHeaderLength;
            position += buffer.putFloatAscii(position, concession);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotalTakedown)
        {
            buffer.putBytes(position, totalTakedownHeader, 0, totalTakedownHeaderLength);
            position += totalTakedownHeaderLength;
            position += buffer.putFloatAscii(position, totalTakedown);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetMoney)
        {
            buffer.putBytes(position, netMoneyHeader, 0, netMoneyHeaderLength);
            position += netMoneyHeaderLength;
            position += buffer.putFloatAscii(position, netMoney);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrAmt)
        {
            buffer.putBytes(position, settlCurrAmtHeader, 0, settlCurrAmtHeaderLength);
            position += settlCurrAmtHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrAmt);
            buffer.putSeparator(position);
            position++;
        }

        if (settlCurrencyLength > 0)
        {
            buffer.putBytes(position, settlCurrencyHeader, 0, settlCurrencyHeaderLength);
            position += settlCurrencyHeaderLength;
            buffer.putBytes(position, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            position += settlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

            position += rateSource.encode(buffer, position);

        if (hasSettlCurrFxRate)
        {
            buffer.putBytes(position, settlCurrFxRateHeader, 0, settlCurrFxRateHeaderLength);
            position += settlCurrFxRateHeaderLength;
            position += buffer.putFloatAscii(position, settlCurrFxRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSettlCurrFxRateCalc)
        {
            buffer.putBytes(position, settlCurrFxRateCalcHeader, 0, settlCurrFxRateCalcHeaderLength);
            position += settlCurrFxRateCalcHeaderLength;
            position += buffer.putCharAscii(position, settlCurrFxRateCalc);
            buffer.putSeparator(position);
            position++;
        }

        if (hasHandlInst)
        {
            buffer.putBytes(position, handlInstHeader, 0, handlInstHeaderLength);
            position += handlInstHeaderLength;
            position += buffer.putCharAscii(position, handlInst);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinQty)
        {
            buffer.putBytes(position, minQtyHeader, 0, minQtyHeaderLength);
            position += minQtyHeaderLength;
            position += buffer.putFloatAscii(position, minQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMatchIncrement)
        {
            buffer.putBytes(position, matchIncrementHeader, 0, matchIncrementHeaderLength);
            position += matchIncrementHeaderLength;
            position += buffer.putFloatAscii(position, matchIncrement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxPriceLevels)
        {
            buffer.putBytes(position, maxPriceLevelsHeader, 0, maxPriceLevelsHeaderLength);
            position += maxPriceLevelsHeaderLength;
            position += buffer.putIntAscii(position, maxPriceLevels);
            buffer.putSeparator(position);
            position++;
        }

            position += displayInstruction.encode(buffer, position);

        if (hasMaxFloor)
        {
            buffer.putBytes(position, maxFloorHeader, 0, maxFloorHeaderLength);
            position += maxFloorHeaderLength;
            position += buffer.putFloatAscii(position, maxFloor);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPositionEffect)
        {
            buffer.putBytes(position, positionEffectHeader, 0, positionEffectHeaderLength);
            position += positionEffectHeaderLength;
            position += buffer.putCharAscii(position, positionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxShow)
        {
            buffer.putBytes(position, maxShowHeader, 0, maxShowHeaderLength);
            position += maxShowHeaderLength;
            position += buffer.putFloatAscii(position, maxShow);
            buffer.putSeparator(position);
            position++;
        }

        if (hasBookingType)
        {
            buffer.putBytes(position, bookingTypeHeader, 0, bookingTypeHeaderLength);
            position += bookingTypeHeaderLength;
            position += buffer.putIntAscii(position, bookingType);
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }

        if (settlDate2Length > 0)
        {
            buffer.putBytes(position, settlDate2Header, 0, settlDate2HeaderLength);
            position += settlDate2HeaderLength;
            buffer.putBytes(position, settlDate2, settlDate2Offset, settlDate2Length);
            position += settlDate2Length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderQty2)
        {
            buffer.putBytes(position, orderQty2Header, 0, orderQty2HeaderLength);
            position += orderQty2HeaderLength;
            position += buffer.putFloatAscii(position, orderQty2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastForwardPoints2)
        {
            buffer.putBytes(position, lastForwardPoints2Header, 0, lastForwardPoints2HeaderLength);
            position += lastForwardPoints2HeaderLength;
            position += buffer.putFloatAscii(position, lastForwardPoints2);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMultiLegReportingType)
        {
            buffer.putBytes(position, multiLegReportingTypeHeader, 0, multiLegReportingTypeHeaderLength);
            position += multiLegReportingTypeHeaderLength;
            position += buffer.putCharAscii(position, multiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCancellationRights)
        {
            buffer.putBytes(position, cancellationRightsHeader, 0, cancellationRightsHeaderLength);
            position += cancellationRightsHeaderLength;
            position += buffer.putCharAscii(position, cancellationRights);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMoneyLaunderingStatus)
        {
            buffer.putBytes(position, moneyLaunderingStatusHeader, 0, moneyLaunderingStatusHeaderLength);
            position += moneyLaunderingStatusHeaderLength;
            position += buffer.putCharAscii(position, moneyLaunderingStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (registIDLength > 0)
        {
            buffer.putBytes(position, registIDHeader, 0, registIDHeaderLength);
            position += registIDHeaderLength;
            buffer.putBytes(position, registID, registIDOffset, registIDLength);
            position += registIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (designationLength > 0)
        {
            buffer.putBytes(position, designationHeader, 0, designationHeaderLength);
            position += designationHeaderLength;
            buffer.putBytes(position, designation, designationOffset, designationLength);
            position += designationLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transBkdTimeLength > 0)
        {
            buffer.putBytes(position, transBkdTimeHeader, 0, transBkdTimeHeaderLength);
            position += transBkdTimeHeaderLength;
            buffer.putBytes(position, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            position += transBkdTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (execValuationPointLength > 0)
        {
            buffer.putBytes(position, execValuationPointHeader, 0, execValuationPointHeaderLength);
            position += execValuationPointHeaderLength;
            buffer.putBytes(position, execValuationPoint, execValuationPointOffset, execValuationPointLength);
            position += execValuationPointLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecPriceType)
        {
            buffer.putBytes(position, execPriceTypeHeader, 0, execPriceTypeHeaderLength);
            position += execPriceTypeHeaderLength;
            position += buffer.putCharAscii(position, execPriceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasExecPriceAdjustment)
        {
            buffer.putBytes(position, execPriceAdjustmentHeader, 0, execPriceAdjustmentHeaderLength);
            position += execPriceAdjustmentHeaderLength;
            position += buffer.putFloatAscii(position, execPriceAdjustment);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriorityIndicator)
        {
            buffer.putBytes(position, priorityIndicatorHeader, 0, priorityIndicatorHeaderLength);
            position += priorityIndicatorHeaderLength;
            position += buffer.putIntAscii(position, priorityIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceImprovement)
        {
            buffer.putBytes(position, priceImprovementHeader, 0, priceImprovementHeaderLength);
            position += priceImprovementHeaderLength;
            position += buffer.putFloatAscii(position, priceImprovement);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastLiquidityInd)
        {
            buffer.putBytes(position, lastLiquidityIndHeader, 0, lastLiquidityIndHeaderLength);
            position += lastLiquidityIndHeaderLength;
            position += buffer.putIntAscii(position, lastLiquidityInd);
            buffer.putSeparator(position);
            position++;
        }

            position += contAmtGrp.encode(buffer, position);

            position += instrmtLegExecGrp.encode(buffer, position);

        if (hasCopyMsgIndicator)
        {
            buffer.putBytes(position, copyMsgIndicatorHeader, 0, copyMsgIndicatorHeaderLength);
            position += copyMsgIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, copyMsgIndicator);
            buffer.putSeparator(position);
            position++;
        }

            position += miscFeesGrp.encode(buffer, position);

        if (hasDividendYield)
        {
            buffer.putBytes(position, dividendYieldHeader, 0, dividendYieldHeaderLength);
            position += dividendYieldHeaderLength;
            position += buffer.putFloatAscii(position, dividendYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasManualOrderIndicator)
        {
            buffer.putBytes(position, manualOrderIndicatorHeader, 0, manualOrderIndicatorHeaderLength);
            position += manualOrderIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, manualOrderIndicator);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCustDirectedOrder)
        {
            buffer.putBytes(position, custDirectedOrderHeader, 0, custDirectedOrderHeaderLength);
            position += custDirectedOrderHeaderLength;
            position += buffer.putBooleanAscii(position, custDirectedOrder);
            buffer.putSeparator(position);
            position++;
        }

        if (receivedDeptIDLength > 0)
        {
            buffer.putBytes(position, receivedDeptIDHeader, 0, receivedDeptIDHeaderLength);
            position += receivedDeptIDHeaderLength;
            buffer.putBytes(position, receivedDeptID, receivedDeptIDOffset, receivedDeptIDLength);
            position += receivedDeptIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (custOrderHandlingInstLength > 0)
        {
            buffer.putBytes(position, custOrderHandlingInstHeader, 0, custOrderHandlingInstHeaderLength);
            position += custOrderHandlingInstHeaderLength;
            buffer.putBytes(position, custOrderHandlingInst, custOrderHandlingInstOffset, custOrderHandlingInstLength);
            position += custOrderHandlingInstLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderHandlingInstSource)
        {
            buffer.putBytes(position, orderHandlingInstSourceHeader, 0, orderHandlingInstSourceHeaderLength);
            position += orderHandlingInstSourceHeaderLength;
            position += buffer.putIntAscii(position, orderHandlingInstSource);
            buffer.putSeparator(position);
            position++;
        }

            position += trdRegTimestamps.encode(buffer, position);

        if (hasVolatility)
        {
            buffer.putBytes(position, volatilityHeader, 0, volatilityHeaderLength);
            position += volatilityHeaderLength;
            position += buffer.putFloatAscii(position, volatility);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTimeToExpiration)
        {
            buffer.putBytes(position, timeToExpirationHeader, 0, timeToExpirationHeaderLength);
            position += timeToExpirationHeaderLength;
            position += buffer.putFloatAscii(position, timeToExpiration);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRiskFreeRate)
        {
            buffer.putBytes(position, riskFreeRateHeader, 0, riskFreeRateHeaderLength);
            position += riskFreeRateHeaderLength;
            position += buffer.putFloatAscii(position, riskFreeRate);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriceDelta)
        {
            buffer.putBytes(position, priceDeltaHeader, 0, priceDeltaHeaderLength);
            position += priceDeltaHeaderLength;
            position += buffer.putFloatAscii(position, priceDelta);
            buffer.putSeparator(position);
            position++;
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetSecondaryClOrdID();
        this.resetSecondaryExecID();
        this.resetClOrdID();
        this.resetOrigClOrdID();
        this.resetClOrdLinkID();
        this.resetQuoteRespID();
        this.resetOrdStatusReqID();
        this.resetMassStatusReqID();
        this.resetHostCrossID();
        this.resetTotNumReports();
        this.resetLastRptRequested();
        this.resetTradeOriginationDate();
        this.resetListID();
        this.resetCrossID();
        this.resetOrigCrossID();
        this.resetCrossType();
        this.resetTrdMatchID();
        this.resetExecID();
        this.resetExecRefID();
        this.resetExecType();
        this.resetOrdStatus();
        this.resetWorkingIndicator();
        this.resetOrdRejReason();
        this.resetExecRestatementReason();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDayBookingInst();
        this.resetBookingUnit();
        this.resetPreallocMethod();
        this.resetAllocID();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetMatchType();
        this.resetOrderCategory();
        this.resetCashMargin();
        this.resetClearingFeeIndicator();
        this.resetSide();
        this.resetQtyType();
        this.resetLotType();
        this.resetOrdType();
        this.resetPriceType();
        this.resetPrice();
        this.resetPriceProtectionScope();
        this.resetStopPx();
        this.resetPeggedPrice();
        this.resetPeggedRefPrice();
        this.resetDiscretionPrice();
        this.resetTargetStrategy();
        this.resetTargetStrategyParameters();
        this.resetParticipationRate();
        this.resetTargetStrategyPerformance();
        this.resetCurrency();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetTimeInForce();
        this.resetEffectiveTime();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetExecInst();
        this.resetAggressorIndicator();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetPreTradeAnonymity();
        this.resetCustOrderCapacity();
        this.resetLastQty();
        this.resetCalculatedCcyLastQty();
        this.resetLastSwapPoints();
        this.resetUnderlyingLastQty();
        this.resetLastPx();
        this.resetUnderlyingLastPx();
        this.resetLastParPx();
        this.resetLastSpotRate();
        this.resetLastForwardPoints();
        this.resetLastMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetLastCapacity();
        this.resetLeavesQty();
        this.resetCumQty();
        this.resetAvgPx();
        this.resetDayOrderQty();
        this.resetDayCumQty();
        this.resetDayAvgPx();
        this.resetTotNoFills();
        this.resetLastFragment();
        this.resetGTBookingInst();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetReportToExch();
        this.resetGrossTradeAmt();
        this.resetNumDaysInterest();
        this.resetExDate();
        this.resetAccruedInterestRate();
        this.resetAccruedInterestAmt();
        this.resetInterestAtMaturity();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetTradedFlatSwitch();
        this.resetBasisFeatureDate();
        this.resetBasisFeaturePrice();
        this.resetConcession();
        this.resetTotalTakedown();
        this.resetNetMoney();
        this.resetSettlCurrAmt();
        this.resetSettlCurrency();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetHandlInst();
        this.resetMinQty();
        this.resetMatchIncrement();
        this.resetMaxPriceLevels();
        this.resetMaxFloor();
        this.resetPositionEffect();
        this.resetMaxShow();
        this.resetBookingType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetSettlDate2();
        this.resetOrderQty2();
        this.resetLastForwardPoints2();
        this.resetMultiLegReportingType();
        this.resetCancellationRights();
        this.resetMoneyLaunderingStatus();
        this.resetRegistID();
        this.resetDesignation();
        this.resetTransBkdTime();
        this.resetExecValuationPoint();
        this.resetExecPriceType();
        this.resetExecPriceAdjustment();
        this.resetPriorityIndicator();
        this.resetPriceImprovement();
        this.resetLastLiquidityInd();
        this.resetCopyMsgIndicator();
        this.resetDividendYield();
        this.resetManualOrderIndicator();
        this.resetCustDirectedOrder();
        this.resetReceivedDeptID();
        this.resetCustOrderHandlingInst();
        this.resetOrderHandlingInstSource();
        this.resetVolatility();
        this.resetTimeToExpiration();
        this.resetRiskFreeRate();
        this.resetPriceDelta();
        applicationSequenceControl.reset();
        parties.reset();
        contraGrp.reset();
        preAllocGrp.reset();
        instrument.reset();
        financingDetails.reset();
        undInstrmtGrp.reset();
        stipulations.reset();
        orderQtyData.reset();
        triggeringInstruction.reset();
        pegInstructions.reset();
        discretionInstructions.reset();
        strategyParametersGrp.reset();
        fillsGrp.reset();
        commissionData.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        rateSource.reset();
        displayInstruction.reset();
        contAmtGrp.reset();
        instrmtLegExecGrp.reset();
        miscFeesGrp.reset();
        trdRegTimestamps.reset();
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetSecondaryOrderID()
    {
        secondaryOrderIDLength = 0;
    }

    public void resetSecondaryClOrdID()
    {
        secondaryClOrdIDLength = 0;
    }

    public void resetSecondaryExecID()
    {
        secondaryExecIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetOrigClOrdID()
    {
        origClOrdIDLength = 0;
    }

    public void resetClOrdLinkID()
    {
        clOrdLinkIDLength = 0;
    }

    public void resetQuoteRespID()
    {
        quoteRespIDLength = 0;
    }

    public void resetOrdStatusReqID()
    {
        ordStatusReqIDLength = 0;
    }

    public void resetMassStatusReqID()
    {
        massStatusReqIDLength = 0;
    }

    public void resetHostCrossID()
    {
        hostCrossIDLength = 0;
    }

    public void resetTotNumReports()
    {
        hasTotNumReports = false;
    }

    public void resetLastRptRequested()
    {
        hasLastRptRequested = false;
    }

    public void resetTradeOriginationDate()
    {
        tradeOriginationDateLength = 0;
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetCrossID()
    {
        crossIDLength = 0;
    }

    public void resetOrigCrossID()
    {
        origCrossIDLength = 0;
    }

    public void resetCrossType()
    {
        hasCrossType = false;
    }

    public void resetTrdMatchID()
    {
        trdMatchIDLength = 0;
    }

    public void resetExecID()
    {
        execIDLength = 0;
    }

    public void resetExecRefID()
    {
        execRefIDLength = 0;
    }

    public void resetExecType()
    {
        execType = MISSING_CHAR;
    }

    public void resetOrdStatus()
    {
        ordStatus = MISSING_CHAR;
    }

    public void resetWorkingIndicator()
    {
        hasWorkingIndicator = false;
    }

    public void resetOrdRejReason()
    {
        hasOrdRejReason = false;
    }

    public void resetExecRestatementReason()
    {
        hasExecRestatementReason = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetDayBookingInst()
    {
        hasDayBookingInst = false;
    }

    public void resetBookingUnit()
    {
        hasBookingUnit = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetMatchType()
    {
        matchTypeLength = 0;
    }

    public void resetOrderCategory()
    {
        hasOrderCategory = false;
    }

    public void resetCashMargin()
    {
        hasCashMargin = false;
    }

    public void resetClearingFeeIndicator()
    {
        clearingFeeIndicatorLength = 0;
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetQtyType()
    {
        hasQtyType = false;
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetPriceProtectionScope()
    {
        hasPriceProtectionScope = false;
    }

    public void resetStopPx()
    {
        hasStopPx = false;
    }

    public void resetPeggedPrice()
    {
        hasPeggedPrice = false;
    }

    public void resetPeggedRefPrice()
    {
        hasPeggedRefPrice = false;
    }

    public void resetDiscretionPrice()
    {
        hasDiscretionPrice = false;
    }

    public void resetTargetStrategy()
    {
        hasTargetStrategy = false;
    }

    public void resetTargetStrategyParameters()
    {
        targetStrategyParametersLength = 0;
    }

    public void resetParticipationRate()
    {
        hasParticipationRate = false;
    }

    public void resetTargetStrategyPerformance()
    {
        hasTargetStrategyPerformance = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetEffectiveTime()
    {
        effectiveTimeLength = 0;
    }

    public void resetExpireDate()
    {
        expireDateLength = 0;
    }

    public void resetExpireTime()
    {
        expireTimeLength = 0;
    }

    public void resetExecInst()
    {
        execInstLength = 0;
    }

    public void resetAggressorIndicator()
    {
        hasAggressorIndicator = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        orderRestrictionsLength = 0;
    }

    public void resetPreTradeAnonymity()
    {
        hasPreTradeAnonymity = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetCalculatedCcyLastQty()
    {
        hasCalculatedCcyLastQty = false;
    }

    public void resetLastSwapPoints()
    {
        hasLastSwapPoints = false;
    }

    public void resetUnderlyingLastQty()
    {
        hasUnderlyingLastQty = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetUnderlyingLastPx()
    {
        hasUnderlyingLastPx = false;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetLastSpotRate()
    {
        hasLastSpotRate = false;
    }

    public void resetLastForwardPoints()
    {
        hasLastForwardPoints = false;
    }

    public void resetLastMkt()
    {
        lastMktLength = 0;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetTimeBracket()
    {
        timeBracketLength = 0;
    }

    public void resetLastCapacity()
    {
        hasLastCapacity = false;
    }

    public void resetLeavesQty()
    {
        hasLeavesQty = false;
    }

    public void resetCumQty()
    {
        hasCumQty = false;
    }

    public void resetAvgPx()
    {
        hasAvgPx = false;
    }

    public void resetDayOrderQty()
    {
        hasDayOrderQty = false;
    }

    public void resetDayCumQty()
    {
        hasDayCumQty = false;
    }

    public void resetDayAvgPx()
    {
        hasDayAvgPx = false;
    }

    public void resetTotNoFills()
    {
        hasTotNoFills = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetGTBookingInst()
    {
        hasGTBookingInst = false;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetReportToExch()
    {
        hasReportToExch = false;
    }

    public void resetGrossTradeAmt()
    {
        hasGrossTradeAmt = false;
    }

    public void resetNumDaysInterest()
    {
        hasNumDaysInterest = false;
    }

    public void resetExDate()
    {
        exDateLength = 0;
    }

    public void resetAccruedInterestRate()
    {
        hasAccruedInterestRate = false;
    }

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetInterestAtMaturity()
    {
        hasInterestAtMaturity = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
    }

    public void resetTradedFlatSwitch()
    {
        hasTradedFlatSwitch = false;
    }

    public void resetBasisFeatureDate()
    {
        basisFeatureDateLength = 0;
    }

    public void resetBasisFeaturePrice()
    {
        hasBasisFeaturePrice = false;
    }

    public void resetConcession()
    {
        hasConcession = false;
    }

    public void resetTotalTakedown()
    {
        hasTotalTakedown = false;
    }

    public void resetNetMoney()
    {
        hasNetMoney = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetSettlCurrency()
    {
        settlCurrencyLength = 0;
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetHandlInst()
    {
        hasHandlInst = false;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetMatchIncrement()
    {
        hasMatchIncrement = false;
    }

    public void resetMaxPriceLevels()
    {
        hasMaxPriceLevels = false;
    }

    public void resetMaxFloor()
    {
        hasMaxFloor = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetMaxShow()
    {
        hasMaxShow = false;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetSettlDate2()
    {
        settlDate2Length = 0;
    }

    public void resetOrderQty2()
    {
        hasOrderQty2 = false;
    }

    public void resetLastForwardPoints2()
    {
        hasLastForwardPoints2 = false;
    }

    public void resetMultiLegReportingType()
    {
        hasMultiLegReportingType = false;
    }

    public void resetCancellationRights()
    {
        hasCancellationRights = false;
    }

    public void resetMoneyLaunderingStatus()
    {
        hasMoneyLaunderingStatus = false;
    }

    public void resetRegistID()
    {
        registIDLength = 0;
    }

    public void resetDesignation()
    {
        designationLength = 0;
    }

    public void resetTransBkdTime()
    {
        transBkdTimeLength = 0;
    }

    public void resetExecValuationPoint()
    {
        execValuationPointLength = 0;
    }

    public void resetExecPriceType()
    {
        hasExecPriceType = false;
    }

    public void resetExecPriceAdjustment()
    {
        hasExecPriceAdjustment = false;
    }

    public void resetPriorityIndicator()
    {
        hasPriorityIndicator = false;
    }

    public void resetPriceImprovement()
    {
        hasPriceImprovement = false;
    }

    public void resetLastLiquidityInd()
    {
        hasLastLiquidityInd = false;
    }

    public void resetCopyMsgIndicator()
    {
        hasCopyMsgIndicator = false;
    }

    public void resetDividendYield()
    {
        hasDividendYield = false;
    }

    public void resetManualOrderIndicator()
    {
        hasManualOrderIndicator = false;
    }

    public void resetCustDirectedOrder()
    {
        hasCustDirectedOrder = false;
    }

    public void resetReceivedDeptID()
    {
        receivedDeptIDLength = 0;
    }

    public void resetCustOrderHandlingInst()
    {
        custOrderHandlingInstLength = 0;
    }

    public void resetOrderHandlingInstSource()
    {
        hasOrderHandlingInstSource = false;
    }

    public void resetVolatility()
    {
        hasVolatility = false;
    }

    public void resetTimeToExpiration()
    {
        hasTimeToExpiration = false;
    }

    public void resetRiskFreeRate()
    {
        hasRiskFreeRate = false;
    }

    public void resetPriceDelta()
    {
        hasPriceDelta = false;
    }

    public String toString()
    {
        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        return appendTo(builder, 1);
    }

    public StringBuilder appendTo(final StringBuilder builder, final int level)
    {
        builder.append("{\n");        indent(builder, level);
        builder.append("\"MessageName\": \"ExecutionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            appendBuffer(builder, secondaryOrderID, secondaryOrderIDOffset, secondaryOrderIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            appendBuffer(builder, secondaryClOrdID, secondaryClOrdIDOffset, secondaryClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            appendBuffer(builder, secondaryExecID, secondaryExecIDOffset, secondaryExecIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

        if (hasOrigClOrdID())
        {
            indent(builder, level);
            builder.append("\"OrigClOrdID\": \"");
            appendBuffer(builder, origClOrdID, origClOrdIDOffset, origClOrdIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdLinkID())
        {
            indent(builder, level);
            builder.append("\"ClOrdLinkID\": \"");
            appendBuffer(builder, clOrdLinkID, clOrdLinkIDOffset, clOrdLinkIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteRespID())
        {
            indent(builder, level);
            builder.append("\"QuoteRespID\": \"");
            appendBuffer(builder, quoteRespID, quoteRespIDOffset, quoteRespIDLength);
            builder.append("\",\n");
        }

        if (hasOrdStatusReqID())
        {
            indent(builder, level);
            builder.append("\"OrdStatusReqID\": \"");
            appendBuffer(builder, ordStatusReqID, ordStatusReqIDOffset, ordStatusReqIDLength);
            builder.append("\",\n");
        }

        if (hasMassStatusReqID())
        {
            indent(builder, level);
            builder.append("\"MassStatusReqID\": \"");
            appendBuffer(builder, massStatusReqID, massStatusReqIDOffset, massStatusReqIDLength);
            builder.append("\",\n");
        }

        if (hasHostCrossID())
        {
            indent(builder, level);
            builder.append("\"HostCrossID\": \"");
            appendBuffer(builder, hostCrossID, hostCrossIDOffset, hostCrossIDLength);
            builder.append("\",\n");
        }

        if (hasTotNumReports())
        {
            indent(builder, level);
            builder.append("\"TotNumReports\": \"");
            builder.append(totNumReports);
            builder.append("\",\n");
        }

        if (hasLastRptRequested())
        {
            indent(builder, level);
            builder.append("\"LastRptRequested\": \"");
            builder.append(lastRptRequested);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTradeOriginationDate())
        {
            indent(builder, level);
            builder.append("\"TradeOriginationDate\": \"");
            appendBuffer(builder, tradeOriginationDate, tradeOriginationDateOffset, tradeOriginationDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ContraGrp\": ");
    contraGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasCrossID())
        {
            indent(builder, level);
            builder.append("\"CrossID\": \"");
            appendBuffer(builder, crossID, crossIDOffset, crossIDLength);
            builder.append("\",\n");
        }

        if (hasOrigCrossID())
        {
            indent(builder, level);
            builder.append("\"OrigCrossID\": \"");
            appendBuffer(builder, origCrossID, origCrossIDOffset, origCrossIDLength);
            builder.append("\",\n");
        }

        if (hasCrossType())
        {
            indent(builder, level);
            builder.append("\"CrossType\": \"");
            builder.append(crossType);
            builder.append("\",\n");
        }

        if (hasTrdMatchID())
        {
            indent(builder, level);
            builder.append("\"TrdMatchID\": \"");
            appendBuffer(builder, trdMatchID, trdMatchIDOffset, trdMatchIDLength);
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            appendBuffer(builder, execID, execIDOffset, execIDLength);
            builder.append("\",\n");
        }

        if (hasExecRefID())
        {
            indent(builder, level);
            builder.append("\"ExecRefID\": \"");
            appendBuffer(builder, execRefID, execRefIDOffset, execRefIDLength);
            builder.append("\",\n");
        }

        if (hasExecType())
        {
            indent(builder, level);
            builder.append("\"ExecType\": \"");
            builder.append(execType);
            builder.append("\",\n");
        }

        if (hasOrdStatus())
        {
            indent(builder, level);
            builder.append("\"OrdStatus\": \"");
            builder.append(ordStatus);
            builder.append("\",\n");
        }

        if (hasWorkingIndicator())
        {
            indent(builder, level);
            builder.append("\"WorkingIndicator\": \"");
            builder.append(workingIndicator);
            builder.append("\",\n");
        }

        if (hasOrdRejReason())
        {
            indent(builder, level);
            builder.append("\"OrdRejReason\": \"");
            builder.append(ordRejReason);
            builder.append("\",\n");
        }

        if (hasExecRestatementReason())
        {
            indent(builder, level);
            builder.append("\"ExecRestatementReason\": \"");
            builder.append(execRestatementReason);
            builder.append("\",\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasDayBookingInst())
        {
            indent(builder, level);
            builder.append("\"DayBookingInst\": \"");
            builder.append(dayBookingInst);
            builder.append("\",\n");
        }

        if (hasBookingUnit())
        {
            indent(builder, level);
            builder.append("\"BookingUnit\": \"");
            builder.append(bookingUnit);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            appendBuffer(builder, allocID, allocIDOffset, allocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"PreAllocGrp\": ");
    preAllocGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasMatchType())
        {
            indent(builder, level);
            builder.append("\"MatchType\": \"");
            appendBuffer(builder, matchType, matchTypeOffset, matchTypeLength);
            builder.append("\",\n");
        }

        if (hasOrderCategory())
        {
            indent(builder, level);
            builder.append("\"OrderCategory\": \"");
            builder.append(orderCategory);
            builder.append("\",\n");
        }

        if (hasCashMargin())
        {
            indent(builder, level);
            builder.append("\"CashMargin\": \"");
            builder.append(cashMargin);
            builder.append("\",\n");
        }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            appendBuffer(builder, clearingFeeIndicator, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasQtyType())
        {
            indent(builder, level);
            builder.append("\"QtyType\": \"");
            builder.append(qtyType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"OrderQtyData\": ");
    orderQtyData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceProtectionScope())
        {
            indent(builder, level);
            builder.append("\"PriceProtectionScope\": \"");
            builder.append(priceProtectionScope);
            builder.append("\",\n");
        }

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TriggeringInstruction\": ");
    triggeringInstruction.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PegInstructions\": ");
    pegInstructions.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DiscretionInstructions\": ");
    discretionInstructions.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasPeggedPrice())
        {
            indent(builder, level);
            builder.append("\"PeggedPrice\": \"");
            peggedPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPeggedRefPrice())
        {
            indent(builder, level);
            builder.append("\"PeggedRefPrice\": \"");
            peggedRefPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDiscretionPrice())
        {
            indent(builder, level);
            builder.append("\"DiscretionPrice\": \"");
            discretionPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTargetStrategy())
        {
            indent(builder, level);
            builder.append("\"TargetStrategy\": \"");
            builder.append(targetStrategy);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"StrategyParametersGrp\": ");
    strategyParametersGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTargetStrategyParameters())
        {
            indent(builder, level);
            builder.append("\"TargetStrategyParameters\": \"");
            appendBuffer(builder, targetStrategyParameters, targetStrategyParametersOffset, targetStrategyParametersLength);
            builder.append("\",\n");
        }

        if (hasParticipationRate())
        {
            indent(builder, level);
            builder.append("\"ParticipationRate\": \"");
            participationRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTargetStrategyPerformance())
        {
            indent(builder, level);
            builder.append("\"TargetStrategyPerformance\": \"");
            targetStrategyPerformance.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            appendBuffer(builder, complianceID, complianceIDOffset, complianceIDLength);
            builder.append("\",\n");
        }

        if (hasSolicitedFlag())
        {
            indent(builder, level);
            builder.append("\"SolicitedFlag\": \"");
            builder.append(solicitedFlag);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendBuffer(builder, effectiveTime, effectiveTimeOffset, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendBuffer(builder, expireDate, expireDateOffset, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendBuffer(builder, expireTime, expireTimeOffset, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            appendBuffer(builder, execInst, execInstOffset, execInstLength);
            builder.append("\",\n");
        }

        if (hasAggressorIndicator())
        {
            indent(builder, level);
            builder.append("\"AggressorIndicator\": \"");
            builder.append(aggressorIndicator);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            appendBuffer(builder, orderRestrictions, orderRestrictionsOffset, orderRestrictionsLength);
            builder.append("\",\n");
        }

        if (hasPreTradeAnonymity())
        {
            indent(builder, level);
            builder.append("\"PreTradeAnonymity\": \"");
            builder.append(preTradeAnonymity);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
            builder.append("\",\n");
        }

        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCalculatedCcyLastQty())
        {
            indent(builder, level);
            builder.append("\"CalculatedCcyLastQty\": \"");
            calculatedCcyLastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastSwapPoints())
        {
            indent(builder, level);
            builder.append("\"LastSwapPoints\": \"");
            lastSwapPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingLastQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLastQty\": \"");
            underlyingLastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingLastPx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLastPx\": \"");
            underlyingLastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastSpotRate())
        {
            indent(builder, level);
            builder.append("\"LastSpotRate\": \"");
            lastSpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LastForwardPoints\": \"");
            lastForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastMkt())
        {
            indent(builder, level);
            builder.append("\"LastMkt\": \"");
            appendBuffer(builder, lastMkt, lastMktOffset, lastMktLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }

        if (hasTimeBracket())
        {
            indent(builder, level);
            builder.append("\"TimeBracket\": \"");
            appendBuffer(builder, timeBracket, timeBracketOffset, timeBracketLength);
            builder.append("\",\n");
        }

        if (hasLastCapacity())
        {
            indent(builder, level);
            builder.append("\"LastCapacity\": \"");
            builder.append(lastCapacity);
            builder.append("\",\n");
        }

        if (hasLeavesQty())
        {
            indent(builder, level);
            builder.append("\"LeavesQty\": \"");
            leavesQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCumQty())
        {
            indent(builder, level);
            builder.append("\"CumQty\": \"");
            cumQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAvgPx())
        {
            indent(builder, level);
            builder.append("\"AvgPx\": \"");
            avgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDayOrderQty())
        {
            indent(builder, level);
            builder.append("\"DayOrderQty\": \"");
            dayOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDayCumQty())
        {
            indent(builder, level);
            builder.append("\"DayCumQty\": \"");
            dayCumQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDayAvgPx())
        {
            indent(builder, level);
            builder.append("\"DayAvgPx\": \"");
            dayAvgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotNoFills())
        {
            indent(builder, level);
            builder.append("\"TotNoFills\": \"");
            builder.append(totNoFills);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"FillsGrp\": ");
    fillsGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasGTBookingInst())
        {
            indent(builder, level);
            builder.append("\"GTBookingInst\": \"");
            builder.append(gTBookingInst);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasReportToExch())
        {
            indent(builder, level);
            builder.append("\"ReportToExch\": \"");
            builder.append(reportToExch);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"GrossTradeAmt\": \"");
            grossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNumDaysInterest())
        {
            indent(builder, level);
            builder.append("\"NumDaysInterest\": \"");
            builder.append(numDaysInterest);
            builder.append("\",\n");
        }

        if (hasExDate())
        {
            indent(builder, level);
            builder.append("\"ExDate\": \"");
            appendBuffer(builder, exDate, exDateOffset, exDateLength);
            builder.append("\",\n");
        }

        if (hasAccruedInterestRate())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestRate\": \"");
            accruedInterestRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"InterestAtMaturity\": \"");
            interestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTradedFlatSwitch())
        {
            indent(builder, level);
            builder.append("\"TradedFlatSwitch\": \"");
            builder.append(tradedFlatSwitch);
            builder.append("\",\n");
        }

        if (hasBasisFeatureDate())
        {
            indent(builder, level);
            builder.append("\"BasisFeatureDate\": \"");
            appendBuffer(builder, basisFeatureDate, basisFeatureDateOffset, basisFeatureDateLength);
            builder.append("\",\n");
        }

        if (hasBasisFeaturePrice())
        {
            indent(builder, level);
            builder.append("\"BasisFeaturePrice\": \"");
            basisFeaturePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasConcession())
        {
            indent(builder, level);
            builder.append("\"Concession\": \"");
            concession.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalTakedown())
        {
            indent(builder, level);
            builder.append("\"TotalTakedown\": \"");
            totalTakedown.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetMoney())
        {
            indent(builder, level);
            builder.append("\"NetMoney\": \"");
            netMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            appendBuffer(builder, settlCurrency, settlCurrencyOffset, settlCurrencyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"RateSource\": ");
    rateSource.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlCurrFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRate\": \"");
            settlCurrFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRateCalc())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRateCalc\": \"");
            builder.append(settlCurrFxRateCalc);
            builder.append("\",\n");
        }

        if (hasHandlInst())
        {
            indent(builder, level);
            builder.append("\"HandlInst\": \"");
            builder.append(handlInst);
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMatchIncrement())
        {
            indent(builder, level);
            builder.append("\"MatchIncrement\": \"");
            matchIncrement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxPriceLevels())
        {
            indent(builder, level);
            builder.append("\"MaxPriceLevels\": \"");
            builder.append(maxPriceLevels);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DisplayInstruction\": ");
    displayInstruction.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMaxFloor())
        {
            indent(builder, level);
            builder.append("\"MaxFloor\": \"");
            maxFloor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasMaxShow())
        {
            indent(builder, level);
            builder.append("\"MaxShow\": \"");
            maxShow.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

        if (hasSettlDate2())
        {
            indent(builder, level);
            builder.append("\"SettlDate2\": \"");
            appendBuffer(builder, settlDate2, settlDate2Offset, settlDate2Length);
            builder.append("\",\n");
        }

        if (hasOrderQty2())
        {
            indent(builder, level);
            builder.append("\"OrderQty2\": \"");
            orderQty2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastForwardPoints2())
        {
            indent(builder, level);
            builder.append("\"LastForwardPoints2\": \"");
            lastForwardPoints2.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"MultiLegReportingType\": \"");
            builder.append(multiLegReportingType);
            builder.append("\",\n");
        }

        if (hasCancellationRights())
        {
            indent(builder, level);
            builder.append("\"CancellationRights\": \"");
            builder.append(cancellationRights);
            builder.append("\",\n");
        }

        if (hasMoneyLaunderingStatus())
        {
            indent(builder, level);
            builder.append("\"MoneyLaunderingStatus\": \"");
            builder.append(moneyLaunderingStatus);
            builder.append("\",\n");
        }

        if (hasRegistID())
        {
            indent(builder, level);
            builder.append("\"RegistID\": \"");
            appendBuffer(builder, registID, registIDOffset, registIDLength);
            builder.append("\",\n");
        }

        if (hasDesignation())
        {
            indent(builder, level);
            builder.append("\"Designation\": \"");
            appendBuffer(builder, designation, designationOffset, designationLength);
            builder.append("\",\n");
        }

        if (hasTransBkdTime())
        {
            indent(builder, level);
            builder.append("\"TransBkdTime\": \"");
            appendBuffer(builder, transBkdTime, transBkdTimeOffset, transBkdTimeLength);
            builder.append("\",\n");
        }

        if (hasExecValuationPoint())
        {
            indent(builder, level);
            builder.append("\"ExecValuationPoint\": \"");
            appendBuffer(builder, execValuationPoint, execValuationPointOffset, execValuationPointLength);
            builder.append("\",\n");
        }

        if (hasExecPriceType())
        {
            indent(builder, level);
            builder.append("\"ExecPriceType\": \"");
            builder.append(execPriceType);
            builder.append("\",\n");
        }

        if (hasExecPriceAdjustment())
        {
            indent(builder, level);
            builder.append("\"ExecPriceAdjustment\": \"");
            execPriceAdjustment.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriorityIndicator())
        {
            indent(builder, level);
            builder.append("\"PriorityIndicator\": \"");
            builder.append(priorityIndicator);
            builder.append("\",\n");
        }

        if (hasPriceImprovement())
        {
            indent(builder, level);
            builder.append("\"PriceImprovement\": \"");
            priceImprovement.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastLiquidityInd())
        {
            indent(builder, level);
            builder.append("\"LastLiquidityInd\": \"");
            builder.append(lastLiquidityInd);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ContAmtGrp\": ");
    contAmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegExecGrp\": ");
    instrmtLegExecGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasCopyMsgIndicator())
        {
            indent(builder, level);
            builder.append("\"CopyMsgIndicator\": \"");
            builder.append(copyMsgIndicator);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MiscFeesGrp\": ");
    miscFeesGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasDividendYield())
        {
            indent(builder, level);
            builder.append("\"DividendYield\": \"");
            dividendYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasManualOrderIndicator())
        {
            indent(builder, level);
            builder.append("\"ManualOrderIndicator\": \"");
            builder.append(manualOrderIndicator);
            builder.append("\",\n");
        }

        if (hasCustDirectedOrder())
        {
            indent(builder, level);
            builder.append("\"CustDirectedOrder\": \"");
            builder.append(custDirectedOrder);
            builder.append("\",\n");
        }

        if (hasReceivedDeptID())
        {
            indent(builder, level);
            builder.append("\"ReceivedDeptID\": \"");
            appendBuffer(builder, receivedDeptID, receivedDeptIDOffset, receivedDeptIDLength);
            builder.append("\",\n");
        }

        if (hasCustOrderHandlingInst())
        {
            indent(builder, level);
            builder.append("\"CustOrderHandlingInst\": \"");
            appendBuffer(builder, custOrderHandlingInst, custOrderHandlingInstOffset, custOrderHandlingInstLength);
            builder.append("\",\n");
        }

        if (hasOrderHandlingInstSource())
        {
            indent(builder, level);
            builder.append("\"OrderHandlingInstSource\": \"");
            builder.append(orderHandlingInstSource);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdRegTimestamps\": ");
    trdRegTimestamps.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasVolatility())
        {
            indent(builder, level);
            builder.append("\"Volatility\": \"");
            volatility.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTimeToExpiration())
        {
            indent(builder, level);
            builder.append("\"TimeToExpiration\": \"");
            timeToExpiration.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRiskFreeRate())
        {
            indent(builder, level);
            builder.append("\"RiskFreeRate\": \"");
            riskFreeRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceDelta())
        {
            indent(builder, level);
            builder.append("\"PriceDelta\": \"");
            priceDelta.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecutionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ExecutionReportEncoder)encoder);
    }

    public ExecutionReportEncoder copyTo(final ExecutionReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderIDAsCopy(secondaryOrderID.byteArray(), 0, secondaryOrderIDLength);
        }

        if (hasSecondaryClOrdID())
        {
            encoder.secondaryClOrdIDAsCopy(secondaryClOrdID.byteArray(), 0, secondaryClOrdIDLength);
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecIDAsCopy(secondaryExecID.byteArray(), 0, secondaryExecIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }

        if (hasOrigClOrdID())
        {
            encoder.origClOrdIDAsCopy(origClOrdID.byteArray(), 0, origClOrdIDLength);
        }

        if (hasClOrdLinkID())
        {
            encoder.clOrdLinkIDAsCopy(clOrdLinkID.byteArray(), 0, clOrdLinkIDLength);
        }

        if (hasQuoteRespID())
        {
            encoder.quoteRespIDAsCopy(quoteRespID.byteArray(), 0, quoteRespIDLength);
        }

        if (hasOrdStatusReqID())
        {
            encoder.ordStatusReqIDAsCopy(ordStatusReqID.byteArray(), 0, ordStatusReqIDLength);
        }

        if (hasMassStatusReqID())
        {
            encoder.massStatusReqIDAsCopy(massStatusReqID.byteArray(), 0, massStatusReqIDLength);
        }

        if (hasHostCrossID())
        {
            encoder.hostCrossIDAsCopy(hostCrossID.byteArray(), 0, hostCrossIDLength);
        }

        if (hasTotNumReports())
        {
            encoder.totNumReports(this.totNumReports());
        }

        if (hasLastRptRequested())
        {
            encoder.lastRptRequested(this.lastRptRequested());
        }


        parties.copyTo(encoder.parties());
        if (hasTradeOriginationDate())
        {
            encoder.tradeOriginationDateAsCopy(tradeOriginationDate.byteArray(), 0, tradeOriginationDateLength);
        }


        contraGrp.copyTo(encoder.contraGrp());
        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasCrossID())
        {
            encoder.crossIDAsCopy(crossID.byteArray(), 0, crossIDLength);
        }

        if (hasOrigCrossID())
        {
            encoder.origCrossIDAsCopy(origCrossID.byteArray(), 0, origCrossIDLength);
        }

        if (hasCrossType())
        {
            encoder.crossType(this.crossType());
        }

        if (hasTrdMatchID())
        {
            encoder.trdMatchIDAsCopy(trdMatchID.byteArray(), 0, trdMatchIDLength);
        }

        if (hasExecID())
        {
            encoder.execIDAsCopy(execID.byteArray(), 0, execIDLength);
        }

        if (hasExecRefID())
        {
            encoder.execRefIDAsCopy(execRefID.byteArray(), 0, execRefIDLength);
        }

        if (hasExecType())
        {
            encoder.execType(this.execType());
        }

        if (hasOrdStatus())
        {
            encoder.ordStatus(this.ordStatus());
        }

        if (hasWorkingIndicator())
        {
            encoder.workingIndicator(this.workingIndicator());
        }

        if (hasOrdRejReason())
        {
            encoder.ordRejReason(this.ordRejReason());
        }

        if (hasExecRestatementReason())
        {
            encoder.execRestatementReason(this.execRestatementReason());
        }

        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasDayBookingInst())
        {
            encoder.dayBookingInst(this.dayBookingInst());
        }

        if (hasBookingUnit())
        {
            encoder.bookingUnit(this.bookingUnit());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }


        preAllocGrp.copyTo(encoder.preAllocGrp());
        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasMatchType())
        {
            encoder.matchTypeAsCopy(matchType.byteArray(), 0, matchTypeLength);
        }

        if (hasOrderCategory())
        {
            encoder.orderCategory(this.orderCategory());
        }

        if (hasCashMargin())
        {
            encoder.cashMargin(this.cashMargin());
        }

        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicatorAsCopy(clearingFeeIndicator.byteArray(), 0, clearingFeeIndicatorLength);
        }


        instrument.copyTo(encoder.instrument());

        financingDetails.copyTo(encoder.financingDetails());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());
        if (hasSide())
        {
            encoder.side(this.side());
        }


        stipulations.copyTo(encoder.stipulations());
        if (hasQtyType())
        {
            encoder.qtyType(this.qtyType());
        }


        orderQtyData.copyTo(encoder.orderQtyData());
        if (hasLotType())
        {
            encoder.lotType(this.lotType());
        }

        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }

        if (hasPrice())
        {
            encoder.price(this.price());
        }

        if (hasPriceProtectionScope())
        {
            encoder.priceProtectionScope(this.priceProtectionScope());
        }

        if (hasStopPx())
        {
            encoder.stopPx(this.stopPx());
        }


        triggeringInstruction.copyTo(encoder.triggeringInstruction());

        pegInstructions.copyTo(encoder.pegInstructions());

        discretionInstructions.copyTo(encoder.discretionInstructions());
        if (hasPeggedPrice())
        {
            encoder.peggedPrice(this.peggedPrice());
        }

        if (hasPeggedRefPrice())
        {
            encoder.peggedRefPrice(this.peggedRefPrice());
        }

        if (hasDiscretionPrice())
        {
            encoder.discretionPrice(this.discretionPrice());
        }

        if (hasTargetStrategy())
        {
            encoder.targetStrategy(this.targetStrategy());
        }


        strategyParametersGrp.copyTo(encoder.strategyParametersGrp());
        if (hasTargetStrategyParameters())
        {
            encoder.targetStrategyParametersAsCopy(targetStrategyParameters.byteArray(), 0, targetStrategyParametersLength);
        }

        if (hasParticipationRate())
        {
            encoder.participationRate(this.participationRate());
        }

        if (hasTargetStrategyPerformance())
        {
            encoder.targetStrategyPerformance(this.targetStrategyPerformance());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(effectiveTime.byteArray(), 0, effectiveTimeLength);
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(expireDate.byteArray(), 0, expireDateLength);
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(expireTime.byteArray(), 0, expireTimeLength);
        }

        if (hasExecInst())
        {
            encoder.execInstAsCopy(execInst.byteArray(), 0, execInstLength);
        }

        if (hasAggressorIndicator())
        {
            encoder.aggressorIndicator(this.aggressorIndicator());
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            encoder.orderRestrictionsAsCopy(orderRestrictions.byteArray(), 0, orderRestrictionsLength);
        }

        if (hasPreTradeAnonymity())
        {
            encoder.preTradeAnonymity(this.preTradeAnonymity());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasCalculatedCcyLastQty())
        {
            encoder.calculatedCcyLastQty(this.calculatedCcyLastQty());
        }

        if (hasLastSwapPoints())
        {
            encoder.lastSwapPoints(this.lastSwapPoints());
        }

        if (hasUnderlyingLastQty())
        {
            encoder.underlyingLastQty(this.underlyingLastQty());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasUnderlyingLastPx())
        {
            encoder.underlyingLastPx(this.underlyingLastPx());
        }

        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasLastSpotRate())
        {
            encoder.lastSpotRate(this.lastSpotRate());
        }

        if (hasLastForwardPoints())
        {
            encoder.lastForwardPoints(this.lastForwardPoints());
        }

        if (hasLastMkt())
        {
            encoder.lastMktAsCopy(lastMkt.byteArray(), 0, lastMktLength);
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasTimeBracket())
        {
            encoder.timeBracketAsCopy(timeBracket.byteArray(), 0, timeBracketLength);
        }

        if (hasLastCapacity())
        {
            encoder.lastCapacity(this.lastCapacity());
        }

        if (hasLeavesQty())
        {
            encoder.leavesQty(this.leavesQty());
        }

        if (hasCumQty())
        {
            encoder.cumQty(this.cumQty());
        }

        if (hasAvgPx())
        {
            encoder.avgPx(this.avgPx());
        }

        if (hasDayOrderQty())
        {
            encoder.dayOrderQty(this.dayOrderQty());
        }

        if (hasDayCumQty())
        {
            encoder.dayCumQty(this.dayCumQty());
        }

        if (hasDayAvgPx())
        {
            encoder.dayAvgPx(this.dayAvgPx());
        }

        if (hasTotNoFills())
        {
            encoder.totNoFills(this.totNoFills());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        fillsGrp.copyTo(encoder.fillsGrp());
        if (hasGTBookingInst())
        {
            encoder.gTBookingInst(this.gTBookingInst());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasReportToExch())
        {
            encoder.reportToExch(this.reportToExch());
        }


        commissionData.copyTo(encoder.commissionData());

        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());
        if (hasGrossTradeAmt())
        {
            encoder.grossTradeAmt(this.grossTradeAmt());
        }

        if (hasNumDaysInterest())
        {
            encoder.numDaysInterest(this.numDaysInterest());
        }

        if (hasExDate())
        {
            encoder.exDateAsCopy(exDate.byteArray(), 0, exDateLength);
        }

        if (hasAccruedInterestRate())
        {
            encoder.accruedInterestRate(this.accruedInterestRate());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasInterestAtMaturity())
        {
            encoder.interestAtMaturity(this.interestAtMaturity());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }

        if (hasTradedFlatSwitch())
        {
            encoder.tradedFlatSwitch(this.tradedFlatSwitch());
        }

        if (hasBasisFeatureDate())
        {
            encoder.basisFeatureDateAsCopy(basisFeatureDate.byteArray(), 0, basisFeatureDateLength);
        }

        if (hasBasisFeaturePrice())
        {
            encoder.basisFeaturePrice(this.basisFeaturePrice());
        }

        if (hasConcession())
        {
            encoder.concession(this.concession());
        }

        if (hasTotalTakedown())
        {
            encoder.totalTakedown(this.totalTakedown());
        }

        if (hasNetMoney())
        {
            encoder.netMoney(this.netMoney());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrencyAsCopy(settlCurrency.byteArray(), 0, settlCurrencyLength);
        }


        rateSource.copyTo(encoder.rateSource());
        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasHandlInst())
        {
            encoder.handlInst(this.handlInst());
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasMatchIncrement())
        {
            encoder.matchIncrement(this.matchIncrement());
        }

        if (hasMaxPriceLevels())
        {
            encoder.maxPriceLevels(this.maxPriceLevels());
        }


        displayInstruction.copyTo(encoder.displayInstruction());
        if (hasMaxFloor())
        {
            encoder.maxFloor(this.maxFloor());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasMaxShow())
        {
            encoder.maxShow(this.maxShow());
        }

        if (hasBookingType())
        {
            encoder.bookingType(this.bookingType());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }

        if (hasSettlDate2())
        {
            encoder.settlDate2AsCopy(settlDate2.byteArray(), 0, settlDate2Length);
        }

        if (hasOrderQty2())
        {
            encoder.orderQty2(this.orderQty2());
        }

        if (hasLastForwardPoints2())
        {
            encoder.lastForwardPoints2(this.lastForwardPoints2());
        }

        if (hasMultiLegReportingType())
        {
            encoder.multiLegReportingType(this.multiLegReportingType());
        }

        if (hasCancellationRights())
        {
            encoder.cancellationRights(this.cancellationRights());
        }

        if (hasMoneyLaunderingStatus())
        {
            encoder.moneyLaunderingStatus(this.moneyLaunderingStatus());
        }

        if (hasRegistID())
        {
            encoder.registIDAsCopy(registID.byteArray(), 0, registIDLength);
        }

        if (hasDesignation())
        {
            encoder.designationAsCopy(designation.byteArray(), 0, designationLength);
        }

        if (hasTransBkdTime())
        {
            encoder.transBkdTimeAsCopy(transBkdTime.byteArray(), 0, transBkdTimeLength);
        }

        if (hasExecValuationPoint())
        {
            encoder.execValuationPointAsCopy(execValuationPoint.byteArray(), 0, execValuationPointLength);
        }

        if (hasExecPriceType())
        {
            encoder.execPriceType(this.execPriceType());
        }

        if (hasExecPriceAdjustment())
        {
            encoder.execPriceAdjustment(this.execPriceAdjustment());
        }

        if (hasPriorityIndicator())
        {
            encoder.priorityIndicator(this.priorityIndicator());
        }

        if (hasPriceImprovement())
        {
            encoder.priceImprovement(this.priceImprovement());
        }

        if (hasLastLiquidityInd())
        {
            encoder.lastLiquidityInd(this.lastLiquidityInd());
        }


        contAmtGrp.copyTo(encoder.contAmtGrp());

        instrmtLegExecGrp.copyTo(encoder.instrmtLegExecGrp());
        if (hasCopyMsgIndicator())
        {
            encoder.copyMsgIndicator(this.copyMsgIndicator());
        }


        miscFeesGrp.copyTo(encoder.miscFeesGrp());
        if (hasDividendYield())
        {
            encoder.dividendYield(this.dividendYield());
        }

        if (hasManualOrderIndicator())
        {
            encoder.manualOrderIndicator(this.manualOrderIndicator());
        }

        if (hasCustDirectedOrder())
        {
            encoder.custDirectedOrder(this.custDirectedOrder());
        }

        if (hasReceivedDeptID())
        {
            encoder.receivedDeptIDAsCopy(receivedDeptID.byteArray(), 0, receivedDeptIDLength);
        }

        if (hasCustOrderHandlingInst())
        {
            encoder.custOrderHandlingInstAsCopy(custOrderHandlingInst.byteArray(), 0, custOrderHandlingInstLength);
        }

        if (hasOrderHandlingInstSource())
        {
            encoder.orderHandlingInstSource(this.orderHandlingInstSource());
        }


        trdRegTimestamps.copyTo(encoder.trdRegTimestamps());
        if (hasVolatility())
        {
            encoder.volatility(this.volatility());
        }

        if (hasTimeToExpiration())
        {
            encoder.timeToExpiration(this.timeToExpiration());
        }

        if (hasRiskFreeRate())
        {
            encoder.riskFreeRate(this.riskFreeRate());
        }

        if (hasPriceDelta())
        {
            encoder.priceDelta(this.priceDelta());
        }
        return encoder;
    }

}
