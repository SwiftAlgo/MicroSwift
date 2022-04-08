/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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


public class TrdCapRptSideGrpEncoder
{
    private static final int noSidesGroupCounterHeaderLength = 4;
    private static final byte[] noSidesGroupCounterHeader = new byte[] {53, 53, 50, (byte) '='};



public static class SidesGroupEncoder
{
    private SidesGroupEncoder next = null;

    public SidesGroupEncoder next()
    {
        if (next == null)
        {
            next = new SidesGroupEncoder();
        }
        return next;
    }

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int sideExecIDHeaderLength = 5;
    private static final byte[] sideExecIDHeader = new byte[] {49, 52, 50, 55, (byte) '='};

    private static final int orderDelayHeaderLength = 5;
    private static final byte[] orderDelayHeader = new byte[] {49, 52, 50, 56, (byte) '='};

    private static final int orderDelayUnitHeaderLength = 5;
    private static final byte[] orderDelayUnitHeader = new byte[] {49, 52, 50, 57, (byte) '='};

    private static final int sideLastQtyHeaderLength = 5;
    private static final byte[] sideLastQtyHeader = new byte[] {49, 48, 48, 57, (byte) '='};

    private static final int sideTradeReportIDHeaderLength = 5;
    private static final byte[] sideTradeReportIDHeader = new byte[] {49, 48, 48, 53, (byte) '='};

    private static final int sideFillStationCdHeaderLength = 5;
    private static final byte[] sideFillStationCdHeader = new byte[] {49, 48, 48, 54, (byte) '='};

    private static final int sideReasonCdHeaderLength = 5;
    private static final byte[] sideReasonCdHeader = new byte[] {49, 48, 48, 55, (byte) '='};

    private static final int rptSeqHeaderLength = 3;
    private static final byte[] rptSeqHeader = new byte[] {56, 51, (byte) '='};

    private static final int sideTrdSubTypHeaderLength = 5;
    private static final byte[] sideTrdSubTypHeader = new byte[] {49, 48, 48, 56, (byte) '='};

    private static final int netGrossIndHeaderLength = 4;
    private static final byte[] netGrossIndHeader = new byte[] {52, 51, 48, (byte) '='};

    private static final int sideCurrencyHeaderLength = 5;
    private static final byte[] sideCurrencyHeader = new byte[] {49, 49, 53, 52, (byte) '='};

    private static final int sideSettlCurrencyHeaderLength = 5;
    private static final byte[] sideSettlCurrencyHeader = new byte[] {49, 49, 53, 53, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int processCodeHeaderLength = 3;
    private static final byte[] processCodeHeader = new byte[] {56, 49, (byte) '='};

    private static final int oddLotHeaderLength = 4;
    private static final byte[] oddLotHeader = new byte[] {53, 55, 53, (byte) '='};

    private static final int tradeInputSourceHeaderLength = 4;
    private static final byte[] tradeInputSourceHeader = new byte[] {53, 55, 56, (byte) '='};

    private static final int tradeInputDeviceHeaderLength = 4;
    private static final byte[] tradeInputDeviceHeader = new byte[] {53, 55, 57, (byte) '='};

    private static final int complianceIDHeaderLength = 4;
    private static final byte[] complianceIDHeader = new byte[] {51, 55, 54, (byte) '='};

    private static final int solicitedFlagHeaderLength = 4;
    private static final byte[] solicitedFlagHeader = new byte[] {51, 55, 55, (byte) '='};

    private static final int custOrderCapacityHeaderLength = 4;
    private static final byte[] custOrderCapacityHeader = new byte[] {53, 56, 50, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int timeBracketHeaderLength = 4;
    private static final byte[] timeBracketHeader = new byte[] {57, 52, 51, (byte) '='};

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

    private static final int concessionHeaderLength = 4;
    private static final byte[] concessionHeader = new byte[] {50, 51, 56, (byte) '='};

    private static final int totalTakedownHeaderLength = 4;
    private static final byte[] totalTakedownHeader = new byte[] {50, 51, 55, (byte) '='};

    private static final int netMoneyHeaderLength = 4;
    private static final byte[] netMoneyHeader = new byte[] {49, 49, 56, (byte) '='};

    private static final int settlCurrAmtHeaderLength = 4;
    private static final byte[] settlCurrAmtHeader = new byte[] {49, 49, 57, (byte) '='};

    private static final int settlCurrFxRateHeaderLength = 4;
    private static final byte[] settlCurrFxRateHeader = new byte[] {49, 53, 53, (byte) '='};

    private static final int settlCurrFxRateCalcHeaderLength = 4;
    private static final byte[] settlCurrFxRateCalcHeader = new byte[] {49, 53, 54, (byte) '='};

    private static final int positionEffectHeaderLength = 3;
    private static final byte[] positionEffectHeader = new byte[] {55, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private static final int sideMultiLegReportingTypeHeaderLength = 4;
    private static final byte[] sideMultiLegReportingTypeHeader = new byte[] {55, 53, 50, (byte) '='};

    private static final int exchangeRuleHeaderLength = 4;
    private static final byte[] exchangeRuleHeader = new byte[] {56, 50, 53, (byte) '='};

    private static final int tradeAllocIndicatorHeaderLength = 4;
    private static final byte[] tradeAllocIndicatorHeader = new byte[] {56, 50, 54, (byte) '='};

    private static final int preallocMethodHeaderLength = 4;
    private static final byte[] preallocMethodHeader = new byte[] {53, 57, 49, (byte) '='};

    private static final int allocIDHeaderLength = 3;
    private static final byte[] allocIDHeader = new byte[] {55, 48, (byte) '='};

    private static final int sideGrossTradeAmtHeaderLength = 5;
    private static final byte[] sideGrossTradeAmtHeader = new byte[] {49, 48, 55, 50, (byte) '='};

    private static final int aggressorIndicatorHeaderLength = 5;
    private static final byte[] aggressorIndicatorHeader = new byte[] {49, 48, 53, 55, (byte) '='};

    private static final int exchangeSpecialInstructionsHeaderLength = 5;
    private static final byte[] exchangeSpecialInstructionsHeader = new byte[] {49, 49, 51, 57, (byte) '='};

    private static final int orderCategoryHeaderLength = 5;
    private static final byte[] orderCategoryHeader = new byte[] {49, 49, 49, 53, (byte) '='};

    private static final int sideLiquidityIndHeaderLength = 5;
    private static final byte[] sideLiquidityIndHeader = new byte[] {49, 52, 52, 52, (byte) '='};

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public SidesGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public SidesGroupEncoder side(Side value)
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

    private final MutableDirectBuffer sideExecID = new UnsafeBuffer();

    private int sideExecIDOffset = 0;

    private int sideExecIDLength = 0;

    public SidesGroupEncoder sideExecID(final DirectBuffer value, final int offset, final int length)
    {
        sideExecID.wrap(value);
        sideExecIDOffset = offset;
        sideExecIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideExecID(final DirectBuffer value, final int length)
    {
        return sideExecID(value, 0, length);
    }

    public SidesGroupEncoder sideExecID(final DirectBuffer value)
    {
        return sideExecID(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideExecID(final byte[] value, final int offset, final int length)
    {
        sideExecID.wrap(value);
        sideExecIDOffset = offset;
        sideExecIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideExecIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideExecID, value, offset, length);
        sideExecIDOffset = offset;
        sideExecIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideExecID(final byte[] value, final int length)
    {
        return sideExecID(value, 0, length);
    }

    public SidesGroupEncoder sideExecID(final byte[] value)
    {
        return sideExecID(value, 0, value.length);
    }

    public boolean hasSideExecID()
    {
        return sideExecIDLength > 0;
    }

    public MutableDirectBuffer sideExecID()
    {
        return sideExecID;
    }

    public String sideExecIDAsString()
    {
        return sideExecID.getStringWithoutLengthAscii(sideExecIDOffset, sideExecIDLength);
    }

    public SidesGroupEncoder sideExecID(final CharSequence value)
    {
        toBytes(value, sideExecID);
        sideExecIDOffset = 0;
        sideExecIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideExecID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideExecID.wrap(buffer);
            sideExecIDOffset = value.offset();
            sideExecIDLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideExecID(final char[] value)
    {
        return sideExecID(value, 0, value.length);
    }

    public SidesGroupEncoder sideExecID(final char[] value, final int length)
    {
        return sideExecID(value, 0, length);
    }

    public SidesGroupEncoder sideExecID(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideExecID, offset, length);
        sideExecIDOffset = 0;
        sideExecIDLength = length;
        return this;
    }

    private int orderDelay;

    private boolean hasOrderDelay;

    public boolean hasOrderDelay()
    {
        return hasOrderDelay;
    }

    public SidesGroupEncoder orderDelay(int value)
    {
        orderDelay = value;
        hasOrderDelay = true;
        return this;
    }

    public int orderDelay()
    {
        return orderDelay;
    }

    private int orderDelayUnit;

    private boolean hasOrderDelayUnit;

    public boolean hasOrderDelayUnit()
    {
        return hasOrderDelayUnit;
    }

    public SidesGroupEncoder orderDelayUnit(int value)
    {
        orderDelayUnit = value;
        hasOrderDelayUnit = true;
        return this;
    }

    public int orderDelayUnit()
    {
        return orderDelayUnit;
    }

    public SidesGroupEncoder orderDelayUnit(OrderDelayUnit value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OrderDelayUnit.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: orderDelayUnit Value: " + value );
            }
            if (value == OrderDelayUnit.NULL_VAL)
            {
                return this;
            }
        }
        return orderDelayUnit(value.representation());
    }

    private int sideLastQty;

    private boolean hasSideLastQty;

    public boolean hasSideLastQty()
    {
        return hasSideLastQty;
    }

    public SidesGroupEncoder sideLastQty(int value)
    {
        sideLastQty = value;
        hasSideLastQty = true;
        return this;
    }

    public int sideLastQty()
    {
        return sideLastQty;
    }

    private final MutableDirectBuffer sideTradeReportID = new UnsafeBuffer();

    private int sideTradeReportIDOffset = 0;

    private int sideTradeReportIDLength = 0;

    public SidesGroupEncoder sideTradeReportID(final DirectBuffer value, final int offset, final int length)
    {
        sideTradeReportID.wrap(value);
        sideTradeReportIDOffset = offset;
        sideTradeReportIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideTradeReportID(final DirectBuffer value, final int length)
    {
        return sideTradeReportID(value, 0, length);
    }

    public SidesGroupEncoder sideTradeReportID(final DirectBuffer value)
    {
        return sideTradeReportID(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideTradeReportID(final byte[] value, final int offset, final int length)
    {
        sideTradeReportID.wrap(value);
        sideTradeReportIDOffset = offset;
        sideTradeReportIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideTradeReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideTradeReportID, value, offset, length);
        sideTradeReportIDOffset = offset;
        sideTradeReportIDLength = length;
        return this;
    }

    public SidesGroupEncoder sideTradeReportID(final byte[] value, final int length)
    {
        return sideTradeReportID(value, 0, length);
    }

    public SidesGroupEncoder sideTradeReportID(final byte[] value)
    {
        return sideTradeReportID(value, 0, value.length);
    }

    public boolean hasSideTradeReportID()
    {
        return sideTradeReportIDLength > 0;
    }

    public MutableDirectBuffer sideTradeReportID()
    {
        return sideTradeReportID;
    }

    public String sideTradeReportIDAsString()
    {
        return sideTradeReportID.getStringWithoutLengthAscii(sideTradeReportIDOffset, sideTradeReportIDLength);
    }

    public SidesGroupEncoder sideTradeReportID(final CharSequence value)
    {
        toBytes(value, sideTradeReportID);
        sideTradeReportIDOffset = 0;
        sideTradeReportIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideTradeReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideTradeReportID.wrap(buffer);
            sideTradeReportIDOffset = value.offset();
            sideTradeReportIDLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideTradeReportID(final char[] value)
    {
        return sideTradeReportID(value, 0, value.length);
    }

    public SidesGroupEncoder sideTradeReportID(final char[] value, final int length)
    {
        return sideTradeReportID(value, 0, length);
    }

    public SidesGroupEncoder sideTradeReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideTradeReportID, offset, length);
        sideTradeReportIDOffset = 0;
        sideTradeReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer sideFillStationCd = new UnsafeBuffer();

    private int sideFillStationCdOffset = 0;

    private int sideFillStationCdLength = 0;

    public SidesGroupEncoder sideFillStationCd(final DirectBuffer value, final int offset, final int length)
    {
        sideFillStationCd.wrap(value);
        sideFillStationCdOffset = offset;
        sideFillStationCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideFillStationCd(final DirectBuffer value, final int length)
    {
        return sideFillStationCd(value, 0, length);
    }

    public SidesGroupEncoder sideFillStationCd(final DirectBuffer value)
    {
        return sideFillStationCd(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideFillStationCd(final byte[] value, final int offset, final int length)
    {
        sideFillStationCd.wrap(value);
        sideFillStationCdOffset = offset;
        sideFillStationCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideFillStationCdAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideFillStationCd, value, offset, length);
        sideFillStationCdOffset = offset;
        sideFillStationCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideFillStationCd(final byte[] value, final int length)
    {
        return sideFillStationCd(value, 0, length);
    }

    public SidesGroupEncoder sideFillStationCd(final byte[] value)
    {
        return sideFillStationCd(value, 0, value.length);
    }

    public boolean hasSideFillStationCd()
    {
        return sideFillStationCdLength > 0;
    }

    public MutableDirectBuffer sideFillStationCd()
    {
        return sideFillStationCd;
    }

    public String sideFillStationCdAsString()
    {
        return sideFillStationCd.getStringWithoutLengthAscii(sideFillStationCdOffset, sideFillStationCdLength);
    }

    public SidesGroupEncoder sideFillStationCd(final CharSequence value)
    {
        toBytes(value, sideFillStationCd);
        sideFillStationCdOffset = 0;
        sideFillStationCdLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideFillStationCd(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideFillStationCd.wrap(buffer);
            sideFillStationCdOffset = value.offset();
            sideFillStationCdLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideFillStationCd(final char[] value)
    {
        return sideFillStationCd(value, 0, value.length);
    }

    public SidesGroupEncoder sideFillStationCd(final char[] value, final int length)
    {
        return sideFillStationCd(value, 0, length);
    }

    public SidesGroupEncoder sideFillStationCd(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideFillStationCd, offset, length);
        sideFillStationCdOffset = 0;
        sideFillStationCdLength = length;
        return this;
    }

    private final MutableDirectBuffer sideReasonCd = new UnsafeBuffer();

    private int sideReasonCdOffset = 0;

    private int sideReasonCdLength = 0;

    public SidesGroupEncoder sideReasonCd(final DirectBuffer value, final int offset, final int length)
    {
        sideReasonCd.wrap(value);
        sideReasonCdOffset = offset;
        sideReasonCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideReasonCd(final DirectBuffer value, final int length)
    {
        return sideReasonCd(value, 0, length);
    }

    public SidesGroupEncoder sideReasonCd(final DirectBuffer value)
    {
        return sideReasonCd(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideReasonCd(final byte[] value, final int offset, final int length)
    {
        sideReasonCd.wrap(value);
        sideReasonCdOffset = offset;
        sideReasonCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideReasonCdAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideReasonCd, value, offset, length);
        sideReasonCdOffset = offset;
        sideReasonCdLength = length;
        return this;
    }

    public SidesGroupEncoder sideReasonCd(final byte[] value, final int length)
    {
        return sideReasonCd(value, 0, length);
    }

    public SidesGroupEncoder sideReasonCd(final byte[] value)
    {
        return sideReasonCd(value, 0, value.length);
    }

    public boolean hasSideReasonCd()
    {
        return sideReasonCdLength > 0;
    }

    public MutableDirectBuffer sideReasonCd()
    {
        return sideReasonCd;
    }

    public String sideReasonCdAsString()
    {
        return sideReasonCd.getStringWithoutLengthAscii(sideReasonCdOffset, sideReasonCdLength);
    }

    public SidesGroupEncoder sideReasonCd(final CharSequence value)
    {
        toBytes(value, sideReasonCd);
        sideReasonCdOffset = 0;
        sideReasonCdLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideReasonCd(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideReasonCd.wrap(buffer);
            sideReasonCdOffset = value.offset();
            sideReasonCdLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideReasonCd(final char[] value)
    {
        return sideReasonCd(value, 0, value.length);
    }

    public SidesGroupEncoder sideReasonCd(final char[] value, final int length)
    {
        return sideReasonCd(value, 0, length);
    }

    public SidesGroupEncoder sideReasonCd(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideReasonCd, offset, length);
        sideReasonCdOffset = 0;
        sideReasonCdLength = length;
        return this;
    }

    private int rptSeq;

    private boolean hasRptSeq;

    public boolean hasRptSeq()
    {
        return hasRptSeq;
    }

    public SidesGroupEncoder rptSeq(int value)
    {
        rptSeq = value;
        hasRptSeq = true;
        return this;
    }

    public int rptSeq()
    {
        return rptSeq;
    }

    private int sideTrdSubTyp;

    private boolean hasSideTrdSubTyp;

    public boolean hasSideTrdSubTyp()
    {
        return hasSideTrdSubTyp;
    }

    public SidesGroupEncoder sideTrdSubTyp(int value)
    {
        sideTrdSubTyp = value;
        hasSideTrdSubTyp = true;
        return this;
    }

    public int sideTrdSubTyp()
    {
        return sideTrdSubTyp;
    }

    private int netGrossInd;

    private boolean hasNetGrossInd;

    public boolean hasNetGrossInd()
    {
        return hasNetGrossInd;
    }

    public SidesGroupEncoder netGrossInd(int value)
    {
        netGrossInd = value;
        hasNetGrossInd = true;
        return this;
    }

    public int netGrossInd()
    {
        return netGrossInd;
    }

    public SidesGroupEncoder netGrossInd(NetGrossInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetGrossInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: netGrossInd Value: " + value );
            }
            if (value == NetGrossInd.NULL_VAL)
            {
                return this;
            }
        }
        return netGrossInd(value.representation());
    }

    private final MutableDirectBuffer sideCurrency = new UnsafeBuffer();

    private int sideCurrencyOffset = 0;

    private int sideCurrencyLength = 0;

    public SidesGroupEncoder sideCurrency(final DirectBuffer value, final int offset, final int length)
    {
        sideCurrency.wrap(value);
        sideCurrencyOffset = offset;
        sideCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideCurrency(final DirectBuffer value, final int length)
    {
        return sideCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideCurrency(final DirectBuffer value)
    {
        return sideCurrency(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideCurrency(final byte[] value, final int offset, final int length)
    {
        sideCurrency.wrap(value);
        sideCurrencyOffset = offset;
        sideCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideCurrency, value, offset, length);
        sideCurrencyOffset = offset;
        sideCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideCurrency(final byte[] value, final int length)
    {
        return sideCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideCurrency(final byte[] value)
    {
        return sideCurrency(value, 0, value.length);
    }

    public boolean hasSideCurrency()
    {
        return sideCurrencyLength > 0;
    }

    public MutableDirectBuffer sideCurrency()
    {
        return sideCurrency;
    }

    public String sideCurrencyAsString()
    {
        return sideCurrency.getStringWithoutLengthAscii(sideCurrencyOffset, sideCurrencyLength);
    }

    public SidesGroupEncoder sideCurrency(final CharSequence value)
    {
        toBytes(value, sideCurrency);
        sideCurrencyOffset = 0;
        sideCurrencyLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideCurrency.wrap(buffer);
            sideCurrencyOffset = value.offset();
            sideCurrencyLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideCurrency(final char[] value)
    {
        return sideCurrency(value, 0, value.length);
    }

    public SidesGroupEncoder sideCurrency(final char[] value, final int length)
    {
        return sideCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideCurrency, offset, length);
        sideCurrencyOffset = 0;
        sideCurrencyLength = length;
        return this;
    }

    private final MutableDirectBuffer sideSettlCurrency = new UnsafeBuffer();

    private int sideSettlCurrencyOffset = 0;

    private int sideSettlCurrencyLength = 0;

    public SidesGroupEncoder sideSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        sideSettlCurrency.wrap(value);
        sideSettlCurrencyOffset = offset;
        sideSettlCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideSettlCurrency(final DirectBuffer value, final int length)
    {
        return sideSettlCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideSettlCurrency(final DirectBuffer value)
    {
        return sideSettlCurrency(value, 0, value.capacity());
    }

    public SidesGroupEncoder sideSettlCurrency(final byte[] value, final int offset, final int length)
    {
        sideSettlCurrency.wrap(value);
        sideSettlCurrencyOffset = offset;
        sideSettlCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(sideSettlCurrency, value, offset, length);
        sideSettlCurrencyOffset = offset;
        sideSettlCurrencyLength = length;
        return this;
    }

    public SidesGroupEncoder sideSettlCurrency(final byte[] value, final int length)
    {
        return sideSettlCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideSettlCurrency(final byte[] value)
    {
        return sideSettlCurrency(value, 0, value.length);
    }

    public boolean hasSideSettlCurrency()
    {
        return sideSettlCurrencyLength > 0;
    }

    public MutableDirectBuffer sideSettlCurrency()
    {
        return sideSettlCurrency;
    }

    public String sideSettlCurrencyAsString()
    {
        return sideSettlCurrency.getStringWithoutLengthAscii(sideSettlCurrencyOffset, sideSettlCurrencyLength);
    }

    public SidesGroupEncoder sideSettlCurrency(final CharSequence value)
    {
        toBytes(value, sideSettlCurrency);
        sideSettlCurrencyOffset = 0;
        sideSettlCurrencyLength = value.length();
        return this;
    }

    public SidesGroupEncoder sideSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            sideSettlCurrency.wrap(buffer);
            sideSettlCurrencyOffset = value.offset();
            sideSettlCurrencyLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder sideSettlCurrency(final char[] value)
    {
        return sideSettlCurrency(value, 0, value.length);
    }

    public SidesGroupEncoder sideSettlCurrency(final char[] value, final int length)
    {
        return sideSettlCurrency(value, 0, length);
    }

    public SidesGroupEncoder sideSettlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, sideSettlCurrency, offset, length);
        sideSettlCurrencyOffset = 0;
        sideSettlCurrencyLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public SidesGroupEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public SidesGroupEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public SidesGroupEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public SidesGroupEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public SidesGroupEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public SidesGroupEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public SidesGroupEncoder account(final byte[] value)
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

    public SidesGroupEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public SidesGroupEncoder account(final AsciiSequenceView value)
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

    public SidesGroupEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public SidesGroupEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public SidesGroupEncoder account(final char[] value, final int offset, final int length)
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

    public SidesGroupEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public SidesGroupEncoder acctIDSource(AcctIDSource value)
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

    public SidesGroupEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public SidesGroupEncoder accountType(AccountType value)
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

    private char processCode;

    private boolean hasProcessCode;

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }

    public SidesGroupEncoder processCode(char value)
    {
        processCode = value;
        hasProcessCode = true;
        return this;
    }

    public char processCode()
    {
        return processCode;
    }

    public SidesGroupEncoder processCode(ProcessCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ProcessCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: processCode Value: " + value );
            }
            if (value == ProcessCode.NULL_VAL)
            {
                return this;
            }
        }
        return processCode(value.representation());
    }

    private boolean oddLot;

    private boolean hasOddLot;

    public boolean hasOddLot()
    {
        return hasOddLot;
    }

    public SidesGroupEncoder oddLot(boolean value)
    {
        oddLot = value;
        hasOddLot = true;
        return this;
    }

    public boolean oddLot()
    {
        return oddLot;
    }

    private final ClrInstGrpEncoder clrInstGrp = new ClrInstGrpEncoder();
    public ClrInstGrpEncoder clrInstGrp()
    {
        return clrInstGrp;
    }

    private final MutableDirectBuffer tradeInputSource = new UnsafeBuffer();

    private int tradeInputSourceOffset = 0;

    private int tradeInputSourceLength = 0;

    public SidesGroupEncoder tradeInputSource(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputSource(final DirectBuffer value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public SidesGroupEncoder tradeInputSource(final DirectBuffer value)
    {
        return tradeInputSource(value, 0, value.capacity());
    }

    public SidesGroupEncoder tradeInputSource(final byte[] value, final int offset, final int length)
    {
        tradeInputSource.wrap(value);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeInputSource, value, offset, length);
        tradeInputSourceOffset = offset;
        tradeInputSourceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputSource(final byte[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public SidesGroupEncoder tradeInputSource(final byte[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    public boolean hasTradeInputSource()
    {
        return tradeInputSourceLength > 0;
    }

    public MutableDirectBuffer tradeInputSource()
    {
        return tradeInputSource;
    }

    public String tradeInputSourceAsString()
    {
        return tradeInputSource.getStringWithoutLengthAscii(tradeInputSourceOffset, tradeInputSourceLength);
    }

    public SidesGroupEncoder tradeInputSource(final CharSequence value)
    {
        toBytes(value, tradeInputSource);
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = value.length();
        return this;
    }

    public SidesGroupEncoder tradeInputSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputSource.wrap(buffer);
            tradeInputSourceOffset = value.offset();
            tradeInputSourceLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder tradeInputSource(final char[] value)
    {
        return tradeInputSource(value, 0, value.length);
    }

    public SidesGroupEncoder tradeInputSource(final char[] value, final int length)
    {
        return tradeInputSource(value, 0, length);
    }

    public SidesGroupEncoder tradeInputSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeInputSource, offset, length);
        tradeInputSourceOffset = 0;
        tradeInputSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer tradeInputDevice = new UnsafeBuffer();

    private int tradeInputDeviceOffset = 0;

    private int tradeInputDeviceLength = 0;

    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public SidesGroupEncoder tradeInputDevice(final DirectBuffer value)
    {
        return tradeInputDevice(value, 0, value.capacity());
    }

    public SidesGroupEncoder tradeInputDevice(final byte[] value, final int offset, final int length)
    {
        tradeInputDevice.wrap(value);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputDeviceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeInputDevice, value, offset, length);
        tradeInputDeviceOffset = offset;
        tradeInputDeviceLength = length;
        return this;
    }

    public SidesGroupEncoder tradeInputDevice(final byte[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public SidesGroupEncoder tradeInputDevice(final byte[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    public boolean hasTradeInputDevice()
    {
        return tradeInputDeviceLength > 0;
    }

    public MutableDirectBuffer tradeInputDevice()
    {
        return tradeInputDevice;
    }

    public String tradeInputDeviceAsString()
    {
        return tradeInputDevice.getStringWithoutLengthAscii(tradeInputDeviceOffset, tradeInputDeviceLength);
    }

    public SidesGroupEncoder tradeInputDevice(final CharSequence value)
    {
        toBytes(value, tradeInputDevice);
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = value.length();
        return this;
    }

    public SidesGroupEncoder tradeInputDevice(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradeInputDevice.wrap(buffer);
            tradeInputDeviceOffset = value.offset();
            tradeInputDeviceLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder tradeInputDevice(final char[] value)
    {
        return tradeInputDevice(value, 0, value.length);
    }

    public SidesGroupEncoder tradeInputDevice(final char[] value, final int length)
    {
        return tradeInputDevice(value, 0, length);
    }

    public SidesGroupEncoder tradeInputDevice(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradeInputDevice, offset, length);
        tradeInputDeviceOffset = 0;
        tradeInputDeviceLength = length;
        return this;
    }

    private final MutableDirectBuffer complianceID = new UnsafeBuffer();

    private int complianceIDOffset = 0;

    private int complianceIDLength = 0;

    public SidesGroupEncoder complianceID(final DirectBuffer value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public SidesGroupEncoder complianceID(final DirectBuffer value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public SidesGroupEncoder complianceID(final DirectBuffer value)
    {
        return complianceID(value, 0, value.capacity());
    }

    public SidesGroupEncoder complianceID(final byte[] value, final int offset, final int length)
    {
        complianceID.wrap(value);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public SidesGroupEncoder complianceIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(complianceID, value, offset, length);
        complianceIDOffset = offset;
        complianceIDLength = length;
        return this;
    }

    public SidesGroupEncoder complianceID(final byte[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public SidesGroupEncoder complianceID(final byte[] value)
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

    public SidesGroupEncoder complianceID(final CharSequence value)
    {
        toBytes(value, complianceID);
        complianceIDOffset = 0;
        complianceIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder complianceID(final AsciiSequenceView value)
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

    public SidesGroupEncoder complianceID(final char[] value)
    {
        return complianceID(value, 0, value.length);
    }

    public SidesGroupEncoder complianceID(final char[] value, final int length)
    {
        return complianceID(value, 0, length);
    }

    public SidesGroupEncoder complianceID(final char[] value, final int offset, final int length)
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

    public SidesGroupEncoder solicitedFlag(boolean value)
    {
        solicitedFlag = value;
        hasSolicitedFlag = true;
        return this;
    }

    public boolean solicitedFlag()
    {
        return solicitedFlag;
    }

    private int custOrderCapacity;

    private boolean hasCustOrderCapacity;

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }

    public SidesGroupEncoder custOrderCapacity(int value)
    {
        custOrderCapacity = value;
        hasCustOrderCapacity = true;
        return this;
    }

    public int custOrderCapacity()
    {
        return custOrderCapacity;
    }

    public SidesGroupEncoder custOrderCapacity(CustOrderCapacity value)
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

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public SidesGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public SidesGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionID(final byte[] value)
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

    public SidesGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public SidesGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public SidesGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionID(TradingSessionID value)
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

    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public SidesGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionSubID(final byte[] value)
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

    public SidesGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public SidesGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public SidesGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public SidesGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public SidesGroupEncoder tradingSessionSubID(TradingSessionSubID value)
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

    public SidesGroupEncoder timeBracket(final DirectBuffer value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public SidesGroupEncoder timeBracket(final DirectBuffer value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public SidesGroupEncoder timeBracket(final DirectBuffer value)
    {
        return timeBracket(value, 0, value.capacity());
    }

    public SidesGroupEncoder timeBracket(final byte[] value, final int offset, final int length)
    {
        timeBracket.wrap(value);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public SidesGroupEncoder timeBracketAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(timeBracket, value, offset, length);
        timeBracketOffset = offset;
        timeBracketLength = length;
        return this;
    }

    public SidesGroupEncoder timeBracket(final byte[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public SidesGroupEncoder timeBracket(final byte[] value)
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

    public SidesGroupEncoder timeBracket(final CharSequence value)
    {
        toBytes(value, timeBracket);
        timeBracketOffset = 0;
        timeBracketLength = value.length();
        return this;
    }

    public SidesGroupEncoder timeBracket(final AsciiSequenceView value)
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

    public SidesGroupEncoder timeBracket(final char[] value)
    {
        return timeBracket(value, 0, value.length);
    }

    public SidesGroupEncoder timeBracket(final char[] value, final int length)
    {
        return timeBracket(value, 0, length);
    }

    public SidesGroupEncoder timeBracket(final char[] value, final int offset, final int length)
    {
        toBytes(value, timeBracket, offset, length);
        timeBracketOffset = 0;
        timeBracketLength = length;
        return this;
    }

    private final CommissionDataEncoder commissionData = new CommissionDataEncoder();
    public CommissionDataEncoder commissionData()
    {
        return commissionData;
    }

    private int numDaysInterest;

    private boolean hasNumDaysInterest;

    public boolean hasNumDaysInterest()
    {
        return hasNumDaysInterest;
    }

    public SidesGroupEncoder numDaysInterest(int value)
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

    public SidesGroupEncoder exDate(final DirectBuffer value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public SidesGroupEncoder exDate(final DirectBuffer value, final int length)
    {
        return exDate(value, 0, length);
    }

    public SidesGroupEncoder exDate(final DirectBuffer value)
    {
        return exDate(value, 0, value.capacity());
    }

    public SidesGroupEncoder exDate(final byte[] value, final int offset, final int length)
    {
        exDate.wrap(value);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public SidesGroupEncoder exDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exDate, value, offset, length);
        exDateOffset = offset;
        exDateLength = length;
        return this;
    }

    public SidesGroupEncoder exDate(final byte[] value, final int length)
    {
        return exDate(value, 0, length);
    }

    public SidesGroupEncoder exDate(final byte[] value)
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

    public SidesGroupEncoder accruedInterestRate(DecimalFloat value)
    {
        accruedInterestRate.set(value);
        hasAccruedInterestRate = true;
        return this;
    }

    public SidesGroupEncoder accruedInterestRate(long value, int scale)
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

    public SidesGroupEncoder accruedInterestAmt(DecimalFloat value)
    {
        accruedInterestAmt.set(value);
        hasAccruedInterestAmt = true;
        return this;
    }

    public SidesGroupEncoder accruedInterestAmt(long value, int scale)
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

    public SidesGroupEncoder interestAtMaturity(DecimalFloat value)
    {
        interestAtMaturity.set(value);
        hasInterestAtMaturity = true;
        return this;
    }

    public SidesGroupEncoder interestAtMaturity(long value, int scale)
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

    public SidesGroupEncoder endAccruedInterestAmt(DecimalFloat value)
    {
        endAccruedInterestAmt.set(value);
        hasEndAccruedInterestAmt = true;
        return this;
    }

    public SidesGroupEncoder endAccruedInterestAmt(long value, int scale)
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

    public SidesGroupEncoder startCash(DecimalFloat value)
    {
        startCash.set(value);
        hasStartCash = true;
        return this;
    }

    public SidesGroupEncoder startCash(long value, int scale)
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

    public SidesGroupEncoder endCash(DecimalFloat value)
    {
        endCash.set(value);
        hasEndCash = true;
        return this;
    }

    public SidesGroupEncoder endCash(long value, int scale)
    {
        endCash.set(value, scale);
        hasEndCash = true;
        return this;
    }

    public DecimalFloat endCash()
    {
        return endCash;
    }

    private final DecimalFloat concession = new DecimalFloat();

    private boolean hasConcession;

    public boolean hasConcession()
    {
        return hasConcession;
    }

    public SidesGroupEncoder concession(DecimalFloat value)
    {
        concession.set(value);
        hasConcession = true;
        return this;
    }

    public SidesGroupEncoder concession(long value, int scale)
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

    public SidesGroupEncoder totalTakedown(DecimalFloat value)
    {
        totalTakedown.set(value);
        hasTotalTakedown = true;
        return this;
    }

    public SidesGroupEncoder totalTakedown(long value, int scale)
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

    public SidesGroupEncoder netMoney(DecimalFloat value)
    {
        netMoney.set(value);
        hasNetMoney = true;
        return this;
    }

    public SidesGroupEncoder netMoney(long value, int scale)
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

    public SidesGroupEncoder settlCurrAmt(DecimalFloat value)
    {
        settlCurrAmt.set(value);
        hasSettlCurrAmt = true;
        return this;
    }

    public SidesGroupEncoder settlCurrAmt(long value, int scale)
    {
        settlCurrAmt.set(value, scale);
        hasSettlCurrAmt = true;
        return this;
    }

    public DecimalFloat settlCurrAmt()
    {
        return settlCurrAmt;
    }

    private final DecimalFloat settlCurrFxRate = new DecimalFloat();

    private boolean hasSettlCurrFxRate;

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }

    public SidesGroupEncoder settlCurrFxRate(DecimalFloat value)
    {
        settlCurrFxRate.set(value);
        hasSettlCurrFxRate = true;
        return this;
    }

    public SidesGroupEncoder settlCurrFxRate(long value, int scale)
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

    public SidesGroupEncoder settlCurrFxRateCalc(char value)
    {
        settlCurrFxRateCalc = value;
        hasSettlCurrFxRateCalc = true;
        return this;
    }

    public char settlCurrFxRateCalc()
    {
        return settlCurrFxRateCalc;
    }

    public SidesGroupEncoder settlCurrFxRateCalc(SettlCurrFxRateCalc value)
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

    private char positionEffect;

    private boolean hasPositionEffect;

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }

    public SidesGroupEncoder positionEffect(char value)
    {
        positionEffect = value;
        hasPositionEffect = true;
        return this;
    }

    public char positionEffect()
    {
        return positionEffect;
    }

    public SidesGroupEncoder positionEffect(PositionEffect value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public SidesGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SidesGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public SidesGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public SidesGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SidesGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public SidesGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SidesGroupEncoder text(final byte[] value)
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

    public SidesGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public SidesGroupEncoder text(final AsciiSequenceView value)
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

    public SidesGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public SidesGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public SidesGroupEncoder text(final char[] value, final int offset, final int length)
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

    public SidesGroupEncoder encodedTextLen(int value)
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

    public SidesGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public SidesGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private int sideMultiLegReportingType;

    private boolean hasSideMultiLegReportingType;

    public boolean hasSideMultiLegReportingType()
    {
        return hasSideMultiLegReportingType;
    }

    public SidesGroupEncoder sideMultiLegReportingType(int value)
    {
        sideMultiLegReportingType = value;
        hasSideMultiLegReportingType = true;
        return this;
    }

    public int sideMultiLegReportingType()
    {
        return sideMultiLegReportingType;
    }

    public SidesGroupEncoder sideMultiLegReportingType(SideMultiLegReportingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SideMultiLegReportingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sideMultiLegReportingType Value: " + value );
            }
            if (value == SideMultiLegReportingType.NULL_VAL)
            {
                return this;
            }
        }
        return sideMultiLegReportingType(value.representation());
    }

    private final ContAmtGrpEncoder contAmtGrp = new ContAmtGrpEncoder();
    public ContAmtGrpEncoder contAmtGrp()
    {
        return contAmtGrp;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }

    private final MiscFeesGrpEncoder miscFeesGrp = new MiscFeesGrpEncoder();
    public MiscFeesGrpEncoder miscFeesGrp()
    {
        return miscFeesGrp;
    }

    private final MutableDirectBuffer exchangeRule = new UnsafeBuffer();

    private int exchangeRuleOffset = 0;

    private int exchangeRuleLength = 0;

    public SidesGroupEncoder exchangeRule(final DirectBuffer value, final int offset, final int length)
    {
        exchangeRule.wrap(value);
        exchangeRuleOffset = offset;
        exchangeRuleLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeRule(final DirectBuffer value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    public SidesGroupEncoder exchangeRule(final DirectBuffer value)
    {
        return exchangeRule(value, 0, value.capacity());
    }

    public SidesGroupEncoder exchangeRule(final byte[] value, final int offset, final int length)
    {
        exchangeRule.wrap(value);
        exchangeRuleOffset = offset;
        exchangeRuleLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeRuleAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exchangeRule, value, offset, length);
        exchangeRuleOffset = offset;
        exchangeRuleLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeRule(final byte[] value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    public SidesGroupEncoder exchangeRule(final byte[] value)
    {
        return exchangeRule(value, 0, value.length);
    }

    public boolean hasExchangeRule()
    {
        return exchangeRuleLength > 0;
    }

    public MutableDirectBuffer exchangeRule()
    {
        return exchangeRule;
    }

    public String exchangeRuleAsString()
    {
        return exchangeRule.getStringWithoutLengthAscii(exchangeRuleOffset, exchangeRuleLength);
    }

    public SidesGroupEncoder exchangeRule(final CharSequence value)
    {
        toBytes(value, exchangeRule);
        exchangeRuleOffset = 0;
        exchangeRuleLength = value.length();
        return this;
    }

    public SidesGroupEncoder exchangeRule(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            exchangeRule.wrap(buffer);
            exchangeRuleOffset = value.offset();
            exchangeRuleLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder exchangeRule(final char[] value)
    {
        return exchangeRule(value, 0, value.length);
    }

    public SidesGroupEncoder exchangeRule(final char[] value, final int length)
    {
        return exchangeRule(value, 0, length);
    }

    public SidesGroupEncoder exchangeRule(final char[] value, final int offset, final int length)
    {
        toBytes(value, exchangeRule, offset, length);
        exchangeRuleOffset = 0;
        exchangeRuleLength = length;
        return this;
    }

    private int tradeAllocIndicator;

    private boolean hasTradeAllocIndicator;

    public boolean hasTradeAllocIndicator()
    {
        return hasTradeAllocIndicator;
    }

    public SidesGroupEncoder tradeAllocIndicator(int value)
    {
        tradeAllocIndicator = value;
        hasTradeAllocIndicator = true;
        return this;
    }

    public int tradeAllocIndicator()
    {
        return tradeAllocIndicator;
    }

    public SidesGroupEncoder tradeAllocIndicator(TradeAllocIndicator value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradeAllocIndicator.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradeAllocIndicator Value: " + value );
            }
            if (value == TradeAllocIndicator.NULL_VAL)
            {
                return this;
            }
        }
        return tradeAllocIndicator(value.representation());
    }

    private char preallocMethod;

    private boolean hasPreallocMethod;

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }

    public SidesGroupEncoder preallocMethod(char value)
    {
        preallocMethod = value;
        hasPreallocMethod = true;
        return this;
    }

    public char preallocMethod()
    {
        return preallocMethod;
    }

    public SidesGroupEncoder preallocMethod(PreallocMethod value)
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

    public SidesGroupEncoder allocID(final DirectBuffer value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public SidesGroupEncoder allocID(final DirectBuffer value, final int length)
    {
        return allocID(value, 0, length);
    }

    public SidesGroupEncoder allocID(final DirectBuffer value)
    {
        return allocID(value, 0, value.capacity());
    }

    public SidesGroupEncoder allocID(final byte[] value, final int offset, final int length)
    {
        allocID.wrap(value);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public SidesGroupEncoder allocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(allocID, value, offset, length);
        allocIDOffset = offset;
        allocIDLength = length;
        return this;
    }

    public SidesGroupEncoder allocID(final byte[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public SidesGroupEncoder allocID(final byte[] value)
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

    public SidesGroupEncoder allocID(final CharSequence value)
    {
        toBytes(value, allocID);
        allocIDOffset = 0;
        allocIDLength = value.length();
        return this;
    }

    public SidesGroupEncoder allocID(final AsciiSequenceView value)
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

    public SidesGroupEncoder allocID(final char[] value)
    {
        return allocID(value, 0, value.length);
    }

    public SidesGroupEncoder allocID(final char[] value, final int length)
    {
        return allocID(value, 0, length);
    }

    public SidesGroupEncoder allocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, allocID, offset, length);
        allocIDOffset = 0;
        allocIDLength = length;
        return this;
    }

    private final TrdAllocGrpEncoder trdAllocGrp = new TrdAllocGrpEncoder();
    public TrdAllocGrpEncoder trdAllocGrp()
    {
        return trdAllocGrp;
    }

    private final SideTrdRegTSEncoder sideTrdRegTS = new SideTrdRegTSEncoder();
    public SideTrdRegTSEncoder sideTrdRegTS()
    {
        return sideTrdRegTS;
    }

    private final SettlDetailsEncoder settlDetails = new SettlDetailsEncoder();
    public SettlDetailsEncoder settlDetails()
    {
        return settlDetails;
    }

    private final DecimalFloat sideGrossTradeAmt = new DecimalFloat();

    private boolean hasSideGrossTradeAmt;

    public boolean hasSideGrossTradeAmt()
    {
        return hasSideGrossTradeAmt;
    }

    public SidesGroupEncoder sideGrossTradeAmt(DecimalFloat value)
    {
        sideGrossTradeAmt.set(value);
        hasSideGrossTradeAmt = true;
        return this;
    }

    public SidesGroupEncoder sideGrossTradeAmt(long value, int scale)
    {
        sideGrossTradeAmt.set(value, scale);
        hasSideGrossTradeAmt = true;
        return this;
    }

    public DecimalFloat sideGrossTradeAmt()
    {
        return sideGrossTradeAmt;
    }

    private boolean aggressorIndicator;

    private boolean hasAggressorIndicator;

    public boolean hasAggressorIndicator()
    {
        return hasAggressorIndicator;
    }

    public SidesGroupEncoder aggressorIndicator(boolean value)
    {
        aggressorIndicator = value;
        hasAggressorIndicator = true;
        return this;
    }

    public boolean aggressorIndicator()
    {
        return aggressorIndicator;
    }

    private final MutableDirectBuffer exchangeSpecialInstructions = new UnsafeBuffer();

    private int exchangeSpecialInstructionsOffset = 0;

    private int exchangeSpecialInstructionsLength = 0;

    public SidesGroupEncoder exchangeSpecialInstructions(final DirectBuffer value, final int offset, final int length)
    {
        exchangeSpecialInstructions.wrap(value);
        exchangeSpecialInstructionsOffset = offset;
        exchangeSpecialInstructionsLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final DirectBuffer value, final int length)
    {
        return exchangeSpecialInstructions(value, 0, length);
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final DirectBuffer value)
    {
        return exchangeSpecialInstructions(value, 0, value.capacity());
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final byte[] value, final int offset, final int length)
    {
        exchangeSpecialInstructions.wrap(value);
        exchangeSpecialInstructionsOffset = offset;
        exchangeSpecialInstructionsLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeSpecialInstructionsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(exchangeSpecialInstructions, value, offset, length);
        exchangeSpecialInstructionsOffset = offset;
        exchangeSpecialInstructionsLength = length;
        return this;
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final byte[] value, final int length)
    {
        return exchangeSpecialInstructions(value, 0, length);
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final byte[] value)
    {
        return exchangeSpecialInstructions(value, 0, value.length);
    }

    public boolean hasExchangeSpecialInstructions()
    {
        return exchangeSpecialInstructionsLength > 0;
    }

    public MutableDirectBuffer exchangeSpecialInstructions()
    {
        return exchangeSpecialInstructions;
    }

    public String exchangeSpecialInstructionsAsString()
    {
        return exchangeSpecialInstructions.getStringWithoutLengthAscii(exchangeSpecialInstructionsOffset, exchangeSpecialInstructionsLength);
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final CharSequence value)
    {
        toBytes(value, exchangeSpecialInstructions);
        exchangeSpecialInstructionsOffset = 0;
        exchangeSpecialInstructionsLength = value.length();
        return this;
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            exchangeSpecialInstructions.wrap(buffer);
            exchangeSpecialInstructionsOffset = value.offset();
            exchangeSpecialInstructionsLength = value.length();
        }
        return this;
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final char[] value)
    {
        return exchangeSpecialInstructions(value, 0, value.length);
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final char[] value, final int length)
    {
        return exchangeSpecialInstructions(value, 0, length);
    }

    public SidesGroupEncoder exchangeSpecialInstructions(final char[] value, final int offset, final int length)
    {
        toBytes(value, exchangeSpecialInstructions, offset, length);
        exchangeSpecialInstructionsOffset = 0;
        exchangeSpecialInstructionsLength = length;
        return this;
    }

    private char orderCategory;

    private boolean hasOrderCategory;

    public boolean hasOrderCategory()
    {
        return hasOrderCategory;
    }

    public SidesGroupEncoder orderCategory(char value)
    {
        orderCategory = value;
        hasOrderCategory = true;
        return this;
    }

    public char orderCategory()
    {
        return orderCategory;
    }

    public SidesGroupEncoder orderCategory(OrderCategory value)
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

    private int sideLiquidityInd;

    private boolean hasSideLiquidityInd;

    public boolean hasSideLiquidityInd()
    {
        return hasSideLiquidityInd;
    }

    public SidesGroupEncoder sideLiquidityInd(int value)
    {
        sideLiquidityInd = value;
        hasSideLiquidityInd = true;
        return this;
    }

    public int sideLiquidityInd()
    {
        return sideLiquidityInd;
    }

    private final TradeReportOrderDetailEncoder tradeReportOrderDetail = new TradeReportOrderDetailEncoder();
    public TradeReportOrderDetailEncoder tradeReportOrderDetail()
    {
        return tradeReportOrderDetail;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

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

        if (sideExecIDLength > 0)
        {
            buffer.putBytes(position, sideExecIDHeader, 0, sideExecIDHeaderLength);
            position += sideExecIDHeaderLength;
            buffer.putBytes(position, sideExecID, sideExecIDOffset, sideExecIDLength);
            position += sideExecIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderDelay)
        {
            buffer.putBytes(position, orderDelayHeader, 0, orderDelayHeaderLength);
            position += orderDelayHeaderLength;
            position += buffer.putIntAscii(position, orderDelay);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOrderDelayUnit)
        {
            buffer.putBytes(position, orderDelayUnitHeader, 0, orderDelayUnitHeaderLength);
            position += orderDelayUnitHeaderLength;
            position += buffer.putIntAscii(position, orderDelayUnit);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSideLastQty)
        {
            buffer.putBytes(position, sideLastQtyHeader, 0, sideLastQtyHeaderLength);
            position += sideLastQtyHeaderLength;
            position += buffer.putIntAscii(position, sideLastQty);
            buffer.putSeparator(position);
            position++;
        }

        if (sideTradeReportIDLength > 0)
        {
            buffer.putBytes(position, sideTradeReportIDHeader, 0, sideTradeReportIDHeaderLength);
            position += sideTradeReportIDHeaderLength;
            buffer.putBytes(position, sideTradeReportID, sideTradeReportIDOffset, sideTradeReportIDLength);
            position += sideTradeReportIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (sideFillStationCdLength > 0)
        {
            buffer.putBytes(position, sideFillStationCdHeader, 0, sideFillStationCdHeaderLength);
            position += sideFillStationCdHeaderLength;
            buffer.putBytes(position, sideFillStationCd, sideFillStationCdOffset, sideFillStationCdLength);
            position += sideFillStationCdLength;
            buffer.putSeparator(position);
            position++;
        }

        if (sideReasonCdLength > 0)
        {
            buffer.putBytes(position, sideReasonCdHeader, 0, sideReasonCdHeaderLength);
            position += sideReasonCdHeaderLength;
            buffer.putBytes(position, sideReasonCd, sideReasonCdOffset, sideReasonCdLength);
            position += sideReasonCdLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRptSeq)
        {
            buffer.putBytes(position, rptSeqHeader, 0, rptSeqHeaderLength);
            position += rptSeqHeaderLength;
            position += buffer.putIntAscii(position, rptSeq);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSideTrdSubTyp)
        {
            buffer.putBytes(position, sideTrdSubTypHeader, 0, sideTrdSubTypHeaderLength);
            position += sideTrdSubTypHeaderLength;
            position += buffer.putIntAscii(position, sideTrdSubTyp);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetGrossInd)
        {
            buffer.putBytes(position, netGrossIndHeader, 0, netGrossIndHeaderLength);
            position += netGrossIndHeaderLength;
            position += buffer.putIntAscii(position, netGrossInd);
            buffer.putSeparator(position);
            position++;
        }

        if (sideCurrencyLength > 0)
        {
            buffer.putBytes(position, sideCurrencyHeader, 0, sideCurrencyHeaderLength);
            position += sideCurrencyHeaderLength;
            buffer.putBytes(position, sideCurrency, sideCurrencyOffset, sideCurrencyLength);
            position += sideCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (sideSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, sideSettlCurrencyHeader, 0, sideSettlCurrencyHeaderLength);
            position += sideSettlCurrencyHeaderLength;
            buffer.putBytes(position, sideSettlCurrency, sideSettlCurrencyOffset, sideSettlCurrencyLength);
            position += sideSettlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

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

        if (hasProcessCode)
        {
            buffer.putBytes(position, processCodeHeader, 0, processCodeHeaderLength);
            position += processCodeHeaderLength;
            position += buffer.putCharAscii(position, processCode);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOddLot)
        {
            buffer.putBytes(position, oddLotHeader, 0, oddLotHeaderLength);
            position += oddLotHeaderLength;
            position += buffer.putBooleanAscii(position, oddLot);
            buffer.putSeparator(position);
            position++;
        }

            position += clrInstGrp.encode(buffer, position);

        if (tradeInputSourceLength > 0)
        {
            buffer.putBytes(position, tradeInputSourceHeader, 0, tradeInputSourceHeaderLength);
            position += tradeInputSourceHeaderLength;
            buffer.putBytes(position, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            position += tradeInputSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradeInputDeviceLength > 0)
        {
            buffer.putBytes(position, tradeInputDeviceHeader, 0, tradeInputDeviceHeaderLength);
            position += tradeInputDeviceHeaderLength;
            buffer.putBytes(position, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
            position += tradeInputDeviceLength;
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

        if (hasCustOrderCapacity)
        {
            buffer.putBytes(position, custOrderCapacityHeader, 0, custOrderCapacityHeaderLength);
            position += custOrderCapacityHeaderLength;
            position += buffer.putIntAscii(position, custOrderCapacity);
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

            position += commissionData.encode(buffer, position);

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

        if (hasPositionEffect)
        {
            buffer.putBytes(position, positionEffectHeader, 0, positionEffectHeaderLength);
            position += positionEffectHeaderLength;
            position += buffer.putCharAscii(position, positionEffect);
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

        if (hasSideMultiLegReportingType)
        {
            buffer.putBytes(position, sideMultiLegReportingTypeHeader, 0, sideMultiLegReportingTypeHeaderLength);
            position += sideMultiLegReportingTypeHeaderLength;
            position += buffer.putIntAscii(position, sideMultiLegReportingType);
            buffer.putSeparator(position);
            position++;
        }

            position += contAmtGrp.encode(buffer, position);

            position += stipulations.encode(buffer, position);

            position += miscFeesGrp.encode(buffer, position);

        if (exchangeRuleLength > 0)
        {
            buffer.putBytes(position, exchangeRuleHeader, 0, exchangeRuleHeaderLength);
            position += exchangeRuleHeaderLength;
            buffer.putBytes(position, exchangeRule, exchangeRuleOffset, exchangeRuleLength);
            position += exchangeRuleLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTradeAllocIndicator)
        {
            buffer.putBytes(position, tradeAllocIndicatorHeader, 0, tradeAllocIndicatorHeaderLength);
            position += tradeAllocIndicatorHeaderLength;
            position += buffer.putIntAscii(position, tradeAllocIndicator);
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

            position += trdAllocGrp.encode(buffer, position);

            position += sideTrdRegTS.encode(buffer, position);

            position += settlDetails.encode(buffer, position);

        if (hasSideGrossTradeAmt)
        {
            buffer.putBytes(position, sideGrossTradeAmtHeader, 0, sideGrossTradeAmtHeaderLength);
            position += sideGrossTradeAmtHeaderLength;
            position += buffer.putFloatAscii(position, sideGrossTradeAmt);
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

        if (exchangeSpecialInstructionsLength > 0)
        {
            buffer.putBytes(position, exchangeSpecialInstructionsHeader, 0, exchangeSpecialInstructionsHeaderLength);
            position += exchangeSpecialInstructionsHeaderLength;
            buffer.putBytes(position, exchangeSpecialInstructions, exchangeSpecialInstructionsOffset, exchangeSpecialInstructionsLength);
            position += exchangeSpecialInstructionsLength;
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

        if (hasSideLiquidityInd)
        {
            buffer.putBytes(position, sideLiquidityIndHeader, 0, sideLiquidityIndHeaderLength);
            position += sideLiquidityIndHeaderLength;
            position += buffer.putIntAscii(position, sideLiquidityInd);
            buffer.putSeparator(position);
            position++;
        }

            position += tradeReportOrderDetail.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSide();
        this.resetSideExecID();
        this.resetOrderDelay();
        this.resetOrderDelayUnit();
        this.resetSideLastQty();
        this.resetSideTradeReportID();
        this.resetSideFillStationCd();
        this.resetSideReasonCd();
        this.resetRptSeq();
        this.resetSideTrdSubTyp();
        this.resetNetGrossInd();
        this.resetSideCurrency();
        this.resetSideSettlCurrency();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetProcessCode();
        this.resetOddLot();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetCustOrderCapacity();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetNumDaysInterest();
        this.resetExDate();
        this.resetAccruedInterestRate();
        this.resetAccruedInterestAmt();
        this.resetInterestAtMaturity();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetConcession();
        this.resetTotalTakedown();
        this.resetNetMoney();
        this.resetSettlCurrAmt();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetPositionEffect();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetSideMultiLegReportingType();
        this.resetExchangeRule();
        this.resetTradeAllocIndicator();
        this.resetPreallocMethod();
        this.resetAllocID();
        this.resetSideGrossTradeAmt();
        this.resetAggressorIndicator();
        this.resetExchangeSpecialInstructions();
        this.resetOrderCategory();
        this.resetSideLiquidityInd();
        parties.reset();
        clrInstGrp.reset();
        commissionData.reset();
        contAmtGrp.reset();
        stipulations.reset();
        miscFeesGrp.reset();
        trdAllocGrp.reset();
        sideTrdRegTS.reset();
        settlDetails.reset();
        tradeReportOrderDetail.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetSideExecID()
    {
        sideExecIDLength = 0;
    }

    public void resetOrderDelay()
    {
        hasOrderDelay = false;
    }

    public void resetOrderDelayUnit()
    {
        hasOrderDelayUnit = false;
    }

    public void resetSideLastQty()
    {
        hasSideLastQty = false;
    }

    public void resetSideTradeReportID()
    {
        sideTradeReportIDLength = 0;
    }

    public void resetSideFillStationCd()
    {
        sideFillStationCdLength = 0;
    }

    public void resetSideReasonCd()
    {
        sideReasonCdLength = 0;
    }

    public void resetRptSeq()
    {
        hasRptSeq = false;
    }

    public void resetSideTrdSubTyp()
    {
        hasSideTrdSubTyp = false;
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSideCurrency()
    {
        sideCurrencyLength = 0;
    }

    public void resetSideSettlCurrency()
    {
        sideSettlCurrencyLength = 0;
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

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetOddLot()
    {
        hasOddLot = false;
    }

    public void resetTradeInputSource()
    {
        tradeInputSourceLength = 0;
    }

    public void resetTradeInputDevice()
    {
        tradeInputDeviceLength = 0;
    }

    public void resetComplianceID()
    {
        complianceIDLength = 0;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
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

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
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

    public void resetSideMultiLegReportingType()
    {
        hasSideMultiLegReportingType = false;
    }

    public void resetExchangeRule()
    {
        exchangeRuleLength = 0;
    }

    public void resetTradeAllocIndicator()
    {
        hasTradeAllocIndicator = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetAllocID()
    {
        allocIDLength = 0;
    }

    public void resetSideGrossTradeAmt()
    {
        hasSideGrossTradeAmt = false;
    }

    public void resetAggressorIndicator()
    {
        hasAggressorIndicator = false;
    }

    public void resetExchangeSpecialInstructions()
    {
        exchangeSpecialInstructionsLength = 0;
    }

    public void resetOrderCategory()
    {
        hasOrderCategory = false;
    }

    public void resetSideLiquidityInd()
    {
        hasSideLiquidityInd = false;
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
        builder.append("\"MessageName\": \"SidesGroup\",\n");
        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasSideExecID())
        {
            indent(builder, level);
            builder.append("\"SideExecID\": \"");
            appendBuffer(builder, sideExecID, sideExecIDOffset, sideExecIDLength);
            builder.append("\",\n");
        }

        if (hasOrderDelay())
        {
            indent(builder, level);
            builder.append("\"OrderDelay\": \"");
            builder.append(orderDelay);
            builder.append("\",\n");
        }

        if (hasOrderDelayUnit())
        {
            indent(builder, level);
            builder.append("\"OrderDelayUnit\": \"");
            builder.append(orderDelayUnit);
            builder.append("\",\n");
        }

        if (hasSideLastQty())
        {
            indent(builder, level);
            builder.append("\"SideLastQty\": \"");
            builder.append(sideLastQty);
            builder.append("\",\n");
        }

        if (hasSideTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SideTradeReportID\": \"");
            appendBuffer(builder, sideTradeReportID, sideTradeReportIDOffset, sideTradeReportIDLength);
            builder.append("\",\n");
        }

        if (hasSideFillStationCd())
        {
            indent(builder, level);
            builder.append("\"SideFillStationCd\": \"");
            appendBuffer(builder, sideFillStationCd, sideFillStationCdOffset, sideFillStationCdLength);
            builder.append("\",\n");
        }

        if (hasSideReasonCd())
        {
            indent(builder, level);
            builder.append("\"SideReasonCd\": \"");
            appendBuffer(builder, sideReasonCd, sideReasonCdOffset, sideReasonCdLength);
            builder.append("\",\n");
        }

        if (hasRptSeq())
        {
            indent(builder, level);
            builder.append("\"RptSeq\": \"");
            builder.append(rptSeq);
            builder.append("\",\n");
        }

        if (hasSideTrdSubTyp())
        {
            indent(builder, level);
            builder.append("\"SideTrdSubTyp\": \"");
            builder.append(sideTrdSubTyp);
            builder.append("\",\n");
        }

        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSideCurrency())
        {
            indent(builder, level);
            builder.append("\"SideCurrency\": \"");
            appendBuffer(builder, sideCurrency, sideCurrencyOffset, sideCurrencyLength);
            builder.append("\",\n");
        }

        if (hasSideSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SideSettlCurrency\": \"");
            appendBuffer(builder, sideSettlCurrency, sideSettlCurrencyOffset, sideSettlCurrencyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasOddLot())
        {
            indent(builder, level);
            builder.append("\"OddLot\": \"");
            builder.append(oddLot);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ClrInstGrp\": ");
    clrInstGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            appendBuffer(builder, tradeInputSource, tradeInputSourceOffset, tradeInputSourceLength);
            builder.append("\",\n");
        }

        if (hasTradeInputDevice())
        {
            indent(builder, level);
            builder.append("\"TradeInputDevice\": \"");
            appendBuffer(builder, tradeInputDevice, tradeInputDeviceOffset, tradeInputDeviceLength);
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

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
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

    indent(builder, level);
    builder.append("\"CommissionData\": ");
    commissionData.appendTo(builder, level + 1);
    builder.append("\n");

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

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
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

        if (hasSideMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"SideMultiLegReportingType\": \"");
            builder.append(sideMultiLegReportingType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"ContAmtGrp\": ");
    contAmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"MiscFeesGrp\": ");
    miscFeesGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasExchangeRule())
        {
            indent(builder, level);
            builder.append("\"ExchangeRule\": \"");
            appendBuffer(builder, exchangeRule, exchangeRuleOffset, exchangeRuleLength);
            builder.append("\",\n");
        }

        if (hasTradeAllocIndicator())
        {
            indent(builder, level);
            builder.append("\"TradeAllocIndicator\": \"");
            builder.append(tradeAllocIndicator);
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
    builder.append("\"TrdAllocGrp\": ");
    trdAllocGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SideTrdRegTS\": ");
    sideTrdRegTS.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"SettlDetails\": ");
    settlDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSideGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"SideGrossTradeAmt\": \"");
            sideGrossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAggressorIndicator())
        {
            indent(builder, level);
            builder.append("\"AggressorIndicator\": \"");
            builder.append(aggressorIndicator);
            builder.append("\",\n");
        }

        if (hasExchangeSpecialInstructions())
        {
            indent(builder, level);
            builder.append("\"ExchangeSpecialInstructions\": \"");
            appendBuffer(builder, exchangeSpecialInstructions, exchangeSpecialInstructionsOffset, exchangeSpecialInstructionsLength);
            builder.append("\",\n");
        }

        if (hasOrderCategory())
        {
            indent(builder, level);
            builder.append("\"OrderCategory\": \"");
            builder.append(orderCategory);
            builder.append("\",\n");
        }

        if (hasSideLiquidityInd())
        {
            indent(builder, level);
            builder.append("\"SideLiquidityInd\": \"");
            builder.append(sideLiquidityInd);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TradeReportOrderDetail\": ");
    tradeReportOrderDetail.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SidesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SidesGroupEncoder)encoder);
    }

    public SidesGroupEncoder copyTo(final SidesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasSideExecID())
        {
            encoder.sideExecIDAsCopy(sideExecID.byteArray(), 0, sideExecIDLength);
        }

        if (hasOrderDelay())
        {
            encoder.orderDelay(this.orderDelay());
        }

        if (hasOrderDelayUnit())
        {
            encoder.orderDelayUnit(this.orderDelayUnit());
        }

        if (hasSideLastQty())
        {
            encoder.sideLastQty(this.sideLastQty());
        }

        if (hasSideTradeReportID())
        {
            encoder.sideTradeReportIDAsCopy(sideTradeReportID.byteArray(), 0, sideTradeReportIDLength);
        }

        if (hasSideFillStationCd())
        {
            encoder.sideFillStationCdAsCopy(sideFillStationCd.byteArray(), 0, sideFillStationCdLength);
        }

        if (hasSideReasonCd())
        {
            encoder.sideReasonCdAsCopy(sideReasonCd.byteArray(), 0, sideReasonCdLength);
        }

        if (hasRptSeq())
        {
            encoder.rptSeq(this.rptSeq());
        }

        if (hasSideTrdSubTyp())
        {
            encoder.sideTrdSubTyp(this.sideTrdSubTyp());
        }

        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSideCurrency())
        {
            encoder.sideCurrencyAsCopy(sideCurrency.byteArray(), 0, sideCurrencyLength);
        }

        if (hasSideSettlCurrency())
        {
            encoder.sideSettlCurrencyAsCopy(sideSettlCurrency.byteArray(), 0, sideSettlCurrencyLength);
        }


        parties.copyTo(encoder.parties());
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

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasOddLot())
        {
            encoder.oddLot(this.oddLot());
        }


        clrInstGrp.copyTo(encoder.clrInstGrp());
        if (hasTradeInputSource())
        {
            encoder.tradeInputSourceAsCopy(tradeInputSource.byteArray(), 0, tradeInputSourceLength);
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDeviceAsCopy(tradeInputDevice.byteArray(), 0, tradeInputDeviceLength);
        }

        if (hasComplianceID())
        {
            encoder.complianceIDAsCopy(complianceID.byteArray(), 0, complianceIDLength);
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
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


        commissionData.copyTo(encoder.commissionData());
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

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
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

        if (hasSideMultiLegReportingType())
        {
            encoder.sideMultiLegReportingType(this.sideMultiLegReportingType());
        }


        contAmtGrp.copyTo(encoder.contAmtGrp());

        stipulations.copyTo(encoder.stipulations());

        miscFeesGrp.copyTo(encoder.miscFeesGrp());
        if (hasExchangeRule())
        {
            encoder.exchangeRuleAsCopy(exchangeRule.byteArray(), 0, exchangeRuleLength);
        }

        if (hasTradeAllocIndicator())
        {
            encoder.tradeAllocIndicator(this.tradeAllocIndicator());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasAllocID())
        {
            encoder.allocIDAsCopy(allocID.byteArray(), 0, allocIDLength);
        }


        trdAllocGrp.copyTo(encoder.trdAllocGrp());

        sideTrdRegTS.copyTo(encoder.sideTrdRegTS());

        settlDetails.copyTo(encoder.settlDetails());
        if (hasSideGrossTradeAmt())
        {
            encoder.sideGrossTradeAmt(this.sideGrossTradeAmt());
        }

        if (hasAggressorIndicator())
        {
            encoder.aggressorIndicator(this.aggressorIndicator());
        }

        if (hasExchangeSpecialInstructions())
        {
            encoder.exchangeSpecialInstructionsAsCopy(exchangeSpecialInstructions.byteArray(), 0, exchangeSpecialInstructionsLength);
        }

        if (hasOrderCategory())
        {
            encoder.orderCategory(this.orderCategory());
        }

        if (hasSideLiquidityInd())
        {
            encoder.sideLiquidityInd(this.sideLiquidityInd());
        }


        tradeReportOrderDetail.copyTo(encoder.tradeReportOrderDetail());        return encoder;
    }

}
    private int noSidesGroupCounter;

    private boolean hasNoSidesGroupCounter;

    public boolean hasNoSidesGroupCounter()
    {
        return hasNoSidesGroupCounter;
    }

    public TrdCapRptSideGrpEncoder noSidesGroupCounter(int value)
    {
        noSidesGroupCounter = value;
        hasNoSidesGroupCounter = true;
        return this;
    }

    public int noSidesGroupCounter()
    {
        return noSidesGroupCounter;
    }


    private SidesGroupEncoder sidesGroup = null;

    public SidesGroupEncoder sidesGroup(final int numberOfElements)
    {
        hasNoSidesGroupCounter = true;
        noSidesGroupCounter = numberOfElements;
        if (sidesGroup == null)
        {
            sidesGroup = new SidesGroupEncoder();
        }
        return sidesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoSidesGroupCounter)
        {
            buffer.putBytes(position, noSidesGroupCounterHeader, 0, noSidesGroupCounterHeaderLength);
            position += noSidesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noSidesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (sidesGroup != null)
        {
            position += sidesGroup.encode(buffer, position, noSidesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetSidesGroup();
    }

    public void resetSidesGroup()
    {
        if (sidesGroup != null)
        {
            sidesGroup.reset();
        }
        noSidesGroupCounter = 0;
        hasNoSidesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TrdCapRptSideGrp\",\n");
        if (hasNoSidesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SidesGroup\": [\n");
            final int noSidesGroupCounter = this.noSidesGroupCounter;
            SidesGroupEncoder sidesGroup = this.sidesGroup;
            for (int i = 0; i < noSidesGroupCounter; i++)
            {
                indent(builder, level);
                sidesGroup.appendTo(builder, level + 1);
                if (i < (noSidesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                sidesGroup = sidesGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdCapRptSideGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdCapRptSideGrpEncoder)encoder);
    }

    public TrdCapRptSideGrpEncoder copyTo(final TrdCapRptSideGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoSidesGroupCounter)
        {
            final int size = this.noSidesGroupCounter;
            SidesGroupEncoder sidesGroup = this.sidesGroup;
            SidesGroupEncoder sidesGroupEncoder = encoder.sidesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (sidesGroup != null)
                {
                    sidesGroup.copyTo(sidesGroupEncoder);
                    sidesGroup = sidesGroup.next();
                    sidesGroupEncoder = sidesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
