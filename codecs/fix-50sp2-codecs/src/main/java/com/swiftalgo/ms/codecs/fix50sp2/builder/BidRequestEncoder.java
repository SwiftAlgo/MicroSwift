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


public class BidRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 107L;
    }

    public BidRequestEncoder()
    {
        header.msgType("k");
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

    private static final int bidIDHeaderLength = 4;
    private static final byte[] bidIDHeader = new byte[] {51, 57, 48, (byte) '='};

    private static final int clientBidIDHeaderLength = 4;
    private static final byte[] clientBidIDHeader = new byte[] {51, 57, 49, (byte) '='};

    private static final int bidRequestTransTypeHeaderLength = 4;
    private static final byte[] bidRequestTransTypeHeader = new byte[] {51, 55, 52, (byte) '='};

    private static final int listNameHeaderLength = 4;
    private static final byte[] listNameHeader = new byte[] {51, 57, 50, (byte) '='};

    private static final int totNoRelatedSymHeaderLength = 4;
    private static final byte[] totNoRelatedSymHeader = new byte[] {51, 57, 51, (byte) '='};

    private static final int bidTypeHeaderLength = 4;
    private static final byte[] bidTypeHeader = new byte[] {51, 57, 52, (byte) '='};

    private static final int numTicketsHeaderLength = 4;
    private static final byte[] numTicketsHeader = new byte[] {51, 57, 53, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int sideValue1HeaderLength = 4;
    private static final byte[] sideValue1Header = new byte[] {51, 57, 54, (byte) '='};

    private static final int sideValue2HeaderLength = 4;
    private static final byte[] sideValue2Header = new byte[] {51, 57, 55, (byte) '='};

    private static final int liquidityIndTypeHeaderLength = 4;
    private static final byte[] liquidityIndTypeHeader = new byte[] {52, 48, 57, (byte) '='};

    private static final int wtAverageLiquidityHeaderLength = 4;
    private static final byte[] wtAverageLiquidityHeader = new byte[] {52, 49, 48, (byte) '='};

    private static final int exchangeForPhysicalHeaderLength = 4;
    private static final byte[] exchangeForPhysicalHeader = new byte[] {52, 49, 49, (byte) '='};

    private static final int outMainCntryUIndexHeaderLength = 4;
    private static final byte[] outMainCntryUIndexHeader = new byte[] {52, 49, 50, (byte) '='};

    private static final int crossPercentHeaderLength = 4;
    private static final byte[] crossPercentHeader = new byte[] {52, 49, 51, (byte) '='};

    private static final int progRptReqsHeaderLength = 4;
    private static final byte[] progRptReqsHeader = new byte[] {52, 49, 52, (byte) '='};

    private static final int progPeriodIntervalHeaderLength = 4;
    private static final byte[] progPeriodIntervalHeader = new byte[] {52, 49, 53, (byte) '='};

    private static final int incTaxIndHeaderLength = 4;
    private static final byte[] incTaxIndHeader = new byte[] {52, 49, 54, (byte) '='};

    private static final int forexReqHeaderLength = 4;
    private static final byte[] forexReqHeader = new byte[] {49, 50, 49, (byte) '='};

    private static final int numBiddersHeaderLength = 4;
    private static final byte[] numBiddersHeader = new byte[] {52, 49, 55, (byte) '='};

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int bidTradeTypeHeaderLength = 4;
    private static final byte[] bidTradeTypeHeader = new byte[] {52, 49, 56, (byte) '='};

    private static final int basisPxTypeHeaderLength = 4;
    private static final byte[] basisPxTypeHeader = new byte[] {52, 49, 57, (byte) '='};

    private static final int strikeTimeHeaderLength = 4;
    private static final byte[] strikeTimeHeader = new byte[] {52, 52, 51, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer bidID = new UnsafeBuffer();

    private int bidIDOffset = 0;

    private int bidIDLength = 0;

    public BidRequestEncoder bidID(final DirectBuffer value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidRequestEncoder bidID(final DirectBuffer value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidRequestEncoder bidID(final DirectBuffer value)
    {
        return bidID(value, 0, value.capacity());
    }

    public BidRequestEncoder bidID(final byte[] value, final int offset, final int length)
    {
        bidID.wrap(value);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidRequestEncoder bidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(bidID, value, offset, length);
        bidIDOffset = offset;
        bidIDLength = length;
        return this;
    }

    public BidRequestEncoder bidID(final byte[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidRequestEncoder bidID(final byte[] value)
    {
        return bidID(value, 0, value.length);
    }

    public boolean hasBidID()
    {
        return bidIDLength > 0;
    }

    public MutableDirectBuffer bidID()
    {
        return bidID;
    }

    public String bidIDAsString()
    {
        return bidID.getStringWithoutLengthAscii(bidIDOffset, bidIDLength);
    }

    public BidRequestEncoder bidID(final CharSequence value)
    {
        toBytes(value, bidID);
        bidIDOffset = 0;
        bidIDLength = value.length();
        return this;
    }

    public BidRequestEncoder bidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            bidID.wrap(buffer);
            bidIDOffset = value.offset();
            bidIDLength = value.length();
        }
        return this;
    }

    public BidRequestEncoder bidID(final char[] value)
    {
        return bidID(value, 0, value.length);
    }

    public BidRequestEncoder bidID(final char[] value, final int length)
    {
        return bidID(value, 0, length);
    }

    public BidRequestEncoder bidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, bidID, offset, length);
        bidIDOffset = 0;
        bidIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clientBidID = new UnsafeBuffer();

    private int clientBidIDOffset = 0;

    private int clientBidIDLength = 0;

    public BidRequestEncoder clientBidID(final DirectBuffer value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidRequestEncoder clientBidID(final DirectBuffer value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidRequestEncoder clientBidID(final DirectBuffer value)
    {
        return clientBidID(value, 0, value.capacity());
    }

    public BidRequestEncoder clientBidID(final byte[] value, final int offset, final int length)
    {
        clientBidID.wrap(value);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidRequestEncoder clientBidIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clientBidID, value, offset, length);
        clientBidIDOffset = offset;
        clientBidIDLength = length;
        return this;
    }

    public BidRequestEncoder clientBidID(final byte[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidRequestEncoder clientBidID(final byte[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public boolean hasClientBidID()
    {
        return clientBidIDLength > 0;
    }

    public MutableDirectBuffer clientBidID()
    {
        return clientBidID;
    }

    public String clientBidIDAsString()
    {
        return clientBidID.getStringWithoutLengthAscii(clientBidIDOffset, clientBidIDLength);
    }

    public BidRequestEncoder clientBidID(final CharSequence value)
    {
        toBytes(value, clientBidID);
        clientBidIDOffset = 0;
        clientBidIDLength = value.length();
        return this;
    }

    public BidRequestEncoder clientBidID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clientBidID.wrap(buffer);
            clientBidIDOffset = value.offset();
            clientBidIDLength = value.length();
        }
        return this;
    }

    public BidRequestEncoder clientBidID(final char[] value)
    {
        return clientBidID(value, 0, value.length);
    }

    public BidRequestEncoder clientBidID(final char[] value, final int length)
    {
        return clientBidID(value, 0, length);
    }

    public BidRequestEncoder clientBidID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clientBidID, offset, length);
        clientBidIDOffset = 0;
        clientBidIDLength = length;
        return this;
    }

    private char bidRequestTransType;

    private boolean hasBidRequestTransType;

    public boolean hasBidRequestTransType()
    {
        return hasBidRequestTransType;
    }

    public BidRequestEncoder bidRequestTransType(char value)
    {
        bidRequestTransType = value;
        hasBidRequestTransType = true;
        return this;
    }

    public char bidRequestTransType()
    {
        return bidRequestTransType;
    }

    public BidRequestEncoder bidRequestTransType(BidRequestTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BidRequestTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bidRequestTransType Value: " + value );
            }
            if (value == BidRequestTransType.NULL_VAL)
            {
                return this;
            }
        }
        return bidRequestTransType(value.representation());
    }

    private final MutableDirectBuffer listName = new UnsafeBuffer();

    private int listNameOffset = 0;

    private int listNameLength = 0;

    public BidRequestEncoder listName(final DirectBuffer value, final int offset, final int length)
    {
        listName.wrap(value);
        listNameOffset = offset;
        listNameLength = length;
        return this;
    }

    public BidRequestEncoder listName(final DirectBuffer value, final int length)
    {
        return listName(value, 0, length);
    }

    public BidRequestEncoder listName(final DirectBuffer value)
    {
        return listName(value, 0, value.capacity());
    }

    public BidRequestEncoder listName(final byte[] value, final int offset, final int length)
    {
        listName.wrap(value);
        listNameOffset = offset;
        listNameLength = length;
        return this;
    }

    public BidRequestEncoder listNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listName, value, offset, length);
        listNameOffset = offset;
        listNameLength = length;
        return this;
    }

    public BidRequestEncoder listName(final byte[] value, final int length)
    {
        return listName(value, 0, length);
    }

    public BidRequestEncoder listName(final byte[] value)
    {
        return listName(value, 0, value.length);
    }

    public boolean hasListName()
    {
        return listNameLength > 0;
    }

    public MutableDirectBuffer listName()
    {
        return listName;
    }

    public String listNameAsString()
    {
        return listName.getStringWithoutLengthAscii(listNameOffset, listNameLength);
    }

    public BidRequestEncoder listName(final CharSequence value)
    {
        toBytes(value, listName);
        listNameOffset = 0;
        listNameLength = value.length();
        return this;
    }

    public BidRequestEncoder listName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listName.wrap(buffer);
            listNameOffset = value.offset();
            listNameLength = value.length();
        }
        return this;
    }

    public BidRequestEncoder listName(final char[] value)
    {
        return listName(value, 0, value.length);
    }

    public BidRequestEncoder listName(final char[] value, final int length)
    {
        return listName(value, 0, length);
    }

    public BidRequestEncoder listName(final char[] value, final int offset, final int length)
    {
        toBytes(value, listName, offset, length);
        listNameOffset = 0;
        listNameLength = length;
        return this;
    }

    private int totNoRelatedSym;

    private boolean hasTotNoRelatedSym;

    public boolean hasTotNoRelatedSym()
    {
        return hasTotNoRelatedSym;
    }

    public BidRequestEncoder totNoRelatedSym(int value)
    {
        totNoRelatedSym = value;
        hasTotNoRelatedSym = true;
        return this;
    }

    public int totNoRelatedSym()
    {
        return totNoRelatedSym;
    }

    private int bidType;

    private boolean hasBidType;

    public boolean hasBidType()
    {
        return hasBidType;
    }

    public BidRequestEncoder bidType(int value)
    {
        bidType = value;
        hasBidType = true;
        return this;
    }

    public int bidType()
    {
        return bidType;
    }

    public BidRequestEncoder bidType(BidType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BidType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bidType Value: " + value );
            }
            if (value == BidType.NULL_VAL)
            {
                return this;
            }
        }
        return bidType(value.representation());
    }

    private int numTickets;

    private boolean hasNumTickets;

    public boolean hasNumTickets()
    {
        return hasNumTickets;
    }

    public BidRequestEncoder numTickets(int value)
    {
        numTickets = value;
        hasNumTickets = true;
        return this;
    }

    public int numTickets()
    {
        return numTickets;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public BidRequestEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public BidRequestEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public BidRequestEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public BidRequestEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public BidRequestEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public BidRequestEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public BidRequestEncoder currency(final byte[] value)
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

    public BidRequestEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public BidRequestEncoder currency(final AsciiSequenceView value)
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

    public BidRequestEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public BidRequestEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public BidRequestEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final DecimalFloat sideValue1 = new DecimalFloat();

    private boolean hasSideValue1;

    public boolean hasSideValue1()
    {
        return hasSideValue1;
    }

    public BidRequestEncoder sideValue1(DecimalFloat value)
    {
        sideValue1.set(value);
        hasSideValue1 = true;
        return this;
    }

    public BidRequestEncoder sideValue1(long value, int scale)
    {
        sideValue1.set(value, scale);
        hasSideValue1 = true;
        return this;
    }

    public DecimalFloat sideValue1()
    {
        return sideValue1;
    }

    private final DecimalFloat sideValue2 = new DecimalFloat();

    private boolean hasSideValue2;

    public boolean hasSideValue2()
    {
        return hasSideValue2;
    }

    public BidRequestEncoder sideValue2(DecimalFloat value)
    {
        sideValue2.set(value);
        hasSideValue2 = true;
        return this;
    }

    public BidRequestEncoder sideValue2(long value, int scale)
    {
        sideValue2.set(value, scale);
        hasSideValue2 = true;
        return this;
    }

    public DecimalFloat sideValue2()
    {
        return sideValue2;
    }

    private final BidDescReqGrpEncoder bidDescReqGrp = new BidDescReqGrpEncoder();
    public BidDescReqGrpEncoder bidDescReqGrp()
    {
        return bidDescReqGrp;
    }

    private final BidCompReqGrpEncoder bidCompReqGrp = new BidCompReqGrpEncoder();
    public BidCompReqGrpEncoder bidCompReqGrp()
    {
        return bidCompReqGrp;
    }

    private int liquidityIndType;

    private boolean hasLiquidityIndType;

    public boolean hasLiquidityIndType()
    {
        return hasLiquidityIndType;
    }

    public BidRequestEncoder liquidityIndType(int value)
    {
        liquidityIndType = value;
        hasLiquidityIndType = true;
        return this;
    }

    public int liquidityIndType()
    {
        return liquidityIndType;
    }

    public BidRequestEncoder liquidityIndType(LiquidityIndType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LiquidityIndType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: liquidityIndType Value: " + value );
            }
            if (value == LiquidityIndType.NULL_VAL)
            {
                return this;
            }
        }
        return liquidityIndType(value.representation());
    }

    private final DecimalFloat wtAverageLiquidity = new DecimalFloat();

    private boolean hasWtAverageLiquidity;

    public boolean hasWtAverageLiquidity()
    {
        return hasWtAverageLiquidity;
    }

    public BidRequestEncoder wtAverageLiquidity(DecimalFloat value)
    {
        wtAverageLiquidity.set(value);
        hasWtAverageLiquidity = true;
        return this;
    }

    public BidRequestEncoder wtAverageLiquidity(long value, int scale)
    {
        wtAverageLiquidity.set(value, scale);
        hasWtAverageLiquidity = true;
        return this;
    }

    public DecimalFloat wtAverageLiquidity()
    {
        return wtAverageLiquidity;
    }

    private boolean exchangeForPhysical;

    private boolean hasExchangeForPhysical;

    public boolean hasExchangeForPhysical()
    {
        return hasExchangeForPhysical;
    }

    public BidRequestEncoder exchangeForPhysical(boolean value)
    {
        exchangeForPhysical = value;
        hasExchangeForPhysical = true;
        return this;
    }

    public boolean exchangeForPhysical()
    {
        return exchangeForPhysical;
    }

    private final DecimalFloat outMainCntryUIndex = new DecimalFloat();

    private boolean hasOutMainCntryUIndex;

    public boolean hasOutMainCntryUIndex()
    {
        return hasOutMainCntryUIndex;
    }

    public BidRequestEncoder outMainCntryUIndex(DecimalFloat value)
    {
        outMainCntryUIndex.set(value);
        hasOutMainCntryUIndex = true;
        return this;
    }

    public BidRequestEncoder outMainCntryUIndex(long value, int scale)
    {
        outMainCntryUIndex.set(value, scale);
        hasOutMainCntryUIndex = true;
        return this;
    }

    public DecimalFloat outMainCntryUIndex()
    {
        return outMainCntryUIndex;
    }

    private final DecimalFloat crossPercent = new DecimalFloat();

    private boolean hasCrossPercent;

    public boolean hasCrossPercent()
    {
        return hasCrossPercent;
    }

    public BidRequestEncoder crossPercent(DecimalFloat value)
    {
        crossPercent.set(value);
        hasCrossPercent = true;
        return this;
    }

    public BidRequestEncoder crossPercent(long value, int scale)
    {
        crossPercent.set(value, scale);
        hasCrossPercent = true;
        return this;
    }

    public DecimalFloat crossPercent()
    {
        return crossPercent;
    }

    private int progRptReqs;

    private boolean hasProgRptReqs;

    public boolean hasProgRptReqs()
    {
        return hasProgRptReqs;
    }

    public BidRequestEncoder progRptReqs(int value)
    {
        progRptReqs = value;
        hasProgRptReqs = true;
        return this;
    }

    public int progRptReqs()
    {
        return progRptReqs;
    }

    public BidRequestEncoder progRptReqs(ProgRptReqs value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ProgRptReqs.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: progRptReqs Value: " + value );
            }
            if (value == ProgRptReqs.NULL_VAL)
            {
                return this;
            }
        }
        return progRptReqs(value.representation());
    }

    private int progPeriodInterval;

    private boolean hasProgPeriodInterval;

    public boolean hasProgPeriodInterval()
    {
        return hasProgPeriodInterval;
    }

    public BidRequestEncoder progPeriodInterval(int value)
    {
        progPeriodInterval = value;
        hasProgPeriodInterval = true;
        return this;
    }

    public int progPeriodInterval()
    {
        return progPeriodInterval;
    }

    private int incTaxInd;

    private boolean hasIncTaxInd;

    public boolean hasIncTaxInd()
    {
        return hasIncTaxInd;
    }

    public BidRequestEncoder incTaxInd(int value)
    {
        incTaxInd = value;
        hasIncTaxInd = true;
        return this;
    }

    public int incTaxInd()
    {
        return incTaxInd;
    }

    public BidRequestEncoder incTaxInd(IncTaxInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == IncTaxInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: incTaxInd Value: " + value );
            }
            if (value == IncTaxInd.NULL_VAL)
            {
                return this;
            }
        }
        return incTaxInd(value.representation());
    }

    private boolean forexReq;

    private boolean hasForexReq;

    public boolean hasForexReq()
    {
        return hasForexReq;
    }

    public BidRequestEncoder forexReq(boolean value)
    {
        forexReq = value;
        hasForexReq = true;
        return this;
    }

    public boolean forexReq()
    {
        return forexReq;
    }

    private int numBidders;

    private boolean hasNumBidders;

    public boolean hasNumBidders()
    {
        return hasNumBidders;
    }

    public BidRequestEncoder numBidders(int value)
    {
        numBidders = value;
        hasNumBidders = true;
        return this;
    }

    public int numBidders()
    {
        return numBidders;
    }

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public BidRequestEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public BidRequestEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public BidRequestEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public BidRequestEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public BidRequestEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public BidRequestEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public BidRequestEncoder tradeDate(final byte[] value)
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

    private char bidTradeType;

    private boolean hasBidTradeType;

    public boolean hasBidTradeType()
    {
        return hasBidTradeType;
    }

    public BidRequestEncoder bidTradeType(char value)
    {
        bidTradeType = value;
        hasBidTradeType = true;
        return this;
    }

    public char bidTradeType()
    {
        return bidTradeType;
    }

    public BidRequestEncoder bidTradeType(BidTradeType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BidTradeType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bidTradeType Value: " + value );
            }
            if (value == BidTradeType.NULL_VAL)
            {
                return this;
            }
        }
        return bidTradeType(value.representation());
    }

    private char basisPxType;

    private boolean hasBasisPxType;

    public boolean hasBasisPxType()
    {
        return hasBasisPxType;
    }

    public BidRequestEncoder basisPxType(char value)
    {
        basisPxType = value;
        hasBasisPxType = true;
        return this;
    }

    public char basisPxType()
    {
        return basisPxType;
    }

    public BidRequestEncoder basisPxType(BasisPxType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BasisPxType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: basisPxType Value: " + value );
            }
            if (value == BasisPxType.NULL_VAL)
            {
                return this;
            }
        }
        return basisPxType(value.representation());
    }

    private final MutableDirectBuffer strikeTime = new UnsafeBuffer();

    private int strikeTimeOffset = 0;

    private int strikeTimeLength = 0;

    public BidRequestEncoder strikeTime(final DirectBuffer value, final int offset, final int length)
    {
        strikeTime.wrap(value);
        strikeTimeOffset = offset;
        strikeTimeLength = length;
        return this;
    }

    public BidRequestEncoder strikeTime(final DirectBuffer value, final int length)
    {
        return strikeTime(value, 0, length);
    }

    public BidRequestEncoder strikeTime(final DirectBuffer value)
    {
        return strikeTime(value, 0, value.capacity());
    }

    public BidRequestEncoder strikeTime(final byte[] value, final int offset, final int length)
    {
        strikeTime.wrap(value);
        strikeTimeOffset = offset;
        strikeTimeLength = length;
        return this;
    }

    public BidRequestEncoder strikeTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(strikeTime, value, offset, length);
        strikeTimeOffset = offset;
        strikeTimeLength = length;
        return this;
    }

    public BidRequestEncoder strikeTime(final byte[] value, final int length)
    {
        return strikeTime(value, 0, length);
    }

    public BidRequestEncoder strikeTime(final byte[] value)
    {
        return strikeTime(value, 0, value.length);
    }

    public boolean hasStrikeTime()
    {
        return strikeTimeLength > 0;
    }

    public MutableDirectBuffer strikeTime()
    {
        return strikeTime;
    }

    public String strikeTimeAsString()
    {
        return strikeTime.getStringWithoutLengthAscii(strikeTimeOffset, strikeTimeLength);
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public BidRequestEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidRequestEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public BidRequestEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public BidRequestEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidRequestEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public BidRequestEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BidRequestEncoder text(final byte[] value)
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

    public BidRequestEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public BidRequestEncoder text(final AsciiSequenceView value)
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

    public BidRequestEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public BidRequestEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public BidRequestEncoder text(final char[] value, final int offset, final int length)
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

    public BidRequestEncoder encodedTextLen(int value)
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

    public BidRequestEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public BidRequestEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (bidIDLength > 0)
        {
            buffer.putBytes(position, bidIDHeader, 0, bidIDHeaderLength);
            position += bidIDHeaderLength;
            buffer.putBytes(position, bidID, bidIDOffset, bidIDLength);
            position += bidIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clientBidIDLength > 0)
        {
            buffer.putBytes(position, clientBidIDHeader, 0, clientBidIDHeaderLength);
            position += clientBidIDHeaderLength;
            buffer.putBytes(position, clientBidID, clientBidIDOffset, clientBidIDLength);
            position += clientBidIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClientBidID");
        }

        if (hasBidRequestTransType)
        {
            buffer.putBytes(position, bidRequestTransTypeHeader, 0, bidRequestTransTypeHeaderLength);
            position += bidRequestTransTypeHeaderLength;
            position += buffer.putCharAscii(position, bidRequestTransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BidRequestTransType");
        }

        if (listNameLength > 0)
        {
            buffer.putBytes(position, listNameHeader, 0, listNameHeaderLength);
            position += listNameHeaderLength;
            buffer.putBytes(position, listName, listNameOffset, listNameLength);
            position += listNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoRelatedSym)
        {
            buffer.putBytes(position, totNoRelatedSymHeader, 0, totNoRelatedSymHeaderLength);
            position += totNoRelatedSymHeaderLength;
            position += buffer.putIntAscii(position, totNoRelatedSym);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TotNoRelatedSym");
        }

        if (hasBidType)
        {
            buffer.putBytes(position, bidTypeHeader, 0, bidTypeHeaderLength);
            position += bidTypeHeaderLength;
            position += buffer.putIntAscii(position, bidType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BidType");
        }

        if (hasNumTickets)
        {
            buffer.putBytes(position, numTicketsHeader, 0, numTicketsHeaderLength);
            position += numTicketsHeaderLength;
            position += buffer.putIntAscii(position, numTickets);
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

        if (hasSideValue1)
        {
            buffer.putBytes(position, sideValue1Header, 0, sideValue1HeaderLength);
            position += sideValue1HeaderLength;
            position += buffer.putFloatAscii(position, sideValue1);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSideValue2)
        {
            buffer.putBytes(position, sideValue2Header, 0, sideValue2HeaderLength);
            position += sideValue2HeaderLength;
            position += buffer.putFloatAscii(position, sideValue2);
            buffer.putSeparator(position);
            position++;
        }

            position += bidDescReqGrp.encode(buffer, position);

            position += bidCompReqGrp.encode(buffer, position);

        if (hasLiquidityIndType)
        {
            buffer.putBytes(position, liquidityIndTypeHeader, 0, liquidityIndTypeHeaderLength);
            position += liquidityIndTypeHeaderLength;
            position += buffer.putIntAscii(position, liquidityIndType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasWtAverageLiquidity)
        {
            buffer.putBytes(position, wtAverageLiquidityHeader, 0, wtAverageLiquidityHeaderLength);
            position += wtAverageLiquidityHeaderLength;
            position += buffer.putFloatAscii(position, wtAverageLiquidity);
            buffer.putSeparator(position);
            position++;
        }

        if (hasExchangeForPhysical)
        {
            buffer.putBytes(position, exchangeForPhysicalHeader, 0, exchangeForPhysicalHeaderLength);
            position += exchangeForPhysicalHeaderLength;
            position += buffer.putBooleanAscii(position, exchangeForPhysical);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOutMainCntryUIndex)
        {
            buffer.putBytes(position, outMainCntryUIndexHeader, 0, outMainCntryUIndexHeaderLength);
            position += outMainCntryUIndexHeaderLength;
            position += buffer.putFloatAscii(position, outMainCntryUIndex);
            buffer.putSeparator(position);
            position++;
        }

        if (hasCrossPercent)
        {
            buffer.putBytes(position, crossPercentHeader, 0, crossPercentHeaderLength);
            position += crossPercentHeaderLength;
            position += buffer.putFloatAscii(position, crossPercent);
            buffer.putSeparator(position);
            position++;
        }

        if (hasProgRptReqs)
        {
            buffer.putBytes(position, progRptReqsHeader, 0, progRptReqsHeaderLength);
            position += progRptReqsHeaderLength;
            position += buffer.putIntAscii(position, progRptReqs);
            buffer.putSeparator(position);
            position++;
        }

        if (hasProgPeriodInterval)
        {
            buffer.putBytes(position, progPeriodIntervalHeader, 0, progPeriodIntervalHeaderLength);
            position += progPeriodIntervalHeaderLength;
            position += buffer.putIntAscii(position, progPeriodInterval);
            buffer.putSeparator(position);
            position++;
        }

        if (hasIncTaxInd)
        {
            buffer.putBytes(position, incTaxIndHeader, 0, incTaxIndHeaderLength);
            position += incTaxIndHeaderLength;
            position += buffer.putIntAscii(position, incTaxInd);
            buffer.putSeparator(position);
            position++;
        }

        if (hasForexReq)
        {
            buffer.putBytes(position, forexReqHeader, 0, forexReqHeaderLength);
            position += forexReqHeaderLength;
            position += buffer.putBooleanAscii(position, forexReq);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNumBidders)
        {
            buffer.putBytes(position, numBiddersHeader, 0, numBiddersHeaderLength);
            position += numBiddersHeaderLength;
            position += buffer.putIntAscii(position, numBidders);
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

        if (hasBidTradeType)
        {
            buffer.putBytes(position, bidTradeTypeHeader, 0, bidTradeTypeHeaderLength);
            position += bidTradeTypeHeaderLength;
            position += buffer.putCharAscii(position, bidTradeType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BidTradeType");
        }

        if (hasBasisPxType)
        {
            buffer.putBytes(position, basisPxTypeHeader, 0, basisPxTypeHeaderLength);
            position += basisPxTypeHeaderLength;
            position += buffer.putCharAscii(position, basisPxType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: BasisPxType");
        }

        if (strikeTimeLength > 0)
        {
            buffer.putBytes(position, strikeTimeHeader, 0, strikeTimeHeaderLength);
            position += strikeTimeHeaderLength;
            buffer.putBytes(position, strikeTime, strikeTimeOffset, strikeTimeLength);
            position += strikeTimeLength;
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
        this.resetBidID();
        this.resetClientBidID();
        this.resetBidRequestTransType();
        this.resetListName();
        this.resetTotNoRelatedSym();
        this.resetBidType();
        this.resetNumTickets();
        this.resetCurrency();
        this.resetSideValue1();
        this.resetSideValue2();
        this.resetLiquidityIndType();
        this.resetWtAverageLiquidity();
        this.resetExchangeForPhysical();
        this.resetOutMainCntryUIndex();
        this.resetCrossPercent();
        this.resetProgRptReqs();
        this.resetProgPeriodInterval();
        this.resetIncTaxInd();
        this.resetForexReq();
        this.resetNumBidders();
        this.resetTradeDate();
        this.resetBidTradeType();
        this.resetBasisPxType();
        this.resetStrikeTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        bidDescReqGrp.reset();
        bidCompReqGrp.reset();
    }

    public void resetBidID()
    {
        bidIDLength = 0;
    }

    public void resetClientBidID()
    {
        clientBidIDLength = 0;
    }

    public void resetBidRequestTransType()
    {
        bidRequestTransType = MISSING_CHAR;
    }

    public void resetListName()
    {
        listNameLength = 0;
    }

    public void resetTotNoRelatedSym()
    {
        hasTotNoRelatedSym = false;
    }

    public void resetBidType()
    {
        hasBidType = false;
    }

    public void resetNumTickets()
    {
        hasNumTickets = false;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetSideValue1()
    {
        hasSideValue1 = false;
    }

    public void resetSideValue2()
    {
        hasSideValue2 = false;
    }

    public void resetLiquidityIndType()
    {
        hasLiquidityIndType = false;
    }

    public void resetWtAverageLiquidity()
    {
        hasWtAverageLiquidity = false;
    }

    public void resetExchangeForPhysical()
    {
        hasExchangeForPhysical = false;
    }

    public void resetOutMainCntryUIndex()
    {
        hasOutMainCntryUIndex = false;
    }

    public void resetCrossPercent()
    {
        hasCrossPercent = false;
    }

    public void resetProgRptReqs()
    {
        hasProgRptReqs = false;
    }

    public void resetProgPeriodInterval()
    {
        hasProgPeriodInterval = false;
    }

    public void resetIncTaxInd()
    {
        hasIncTaxInd = false;
    }

    public void resetForexReq()
    {
        hasForexReq = false;
    }

    public void resetNumBidders()
    {
        hasNumBidders = false;
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetBidTradeType()
    {
        bidTradeType = MISSING_CHAR;
    }

    public void resetBasisPxType()
    {
        basisPxType = MISSING_CHAR;
    }

    public void resetStrikeTime()
    {
        strikeTimeLength = 0;
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
        builder.append("\"MessageName\": \"BidRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            appendBuffer(builder, bidID, bidIDOffset, bidIDLength);
            builder.append("\",\n");
        }

        if (hasClientBidID())
        {
            indent(builder, level);
            builder.append("\"ClientBidID\": \"");
            appendBuffer(builder, clientBidID, clientBidIDOffset, clientBidIDLength);
            builder.append("\",\n");
        }

        if (hasBidRequestTransType())
        {
            indent(builder, level);
            builder.append("\"BidRequestTransType\": \"");
            builder.append(bidRequestTransType);
            builder.append("\",\n");
        }

        if (hasListName())
        {
            indent(builder, level);
            builder.append("\"ListName\": \"");
            appendBuffer(builder, listName, listNameOffset, listNameLength);
            builder.append("\",\n");
        }

        if (hasTotNoRelatedSym())
        {
            indent(builder, level);
            builder.append("\"TotNoRelatedSym\": \"");
            builder.append(totNoRelatedSym);
            builder.append("\",\n");
        }

        if (hasBidType())
        {
            indent(builder, level);
            builder.append("\"BidType\": \"");
            builder.append(bidType);
            builder.append("\",\n");
        }

        if (hasNumTickets())
        {
            indent(builder, level);
            builder.append("\"NumTickets\": \"");
            builder.append(numTickets);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

        if (hasSideValue1())
        {
            indent(builder, level);
            builder.append("\"SideValue1\": \"");
            sideValue1.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSideValue2())
        {
            indent(builder, level);
            builder.append("\"SideValue2\": \"");
            sideValue2.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"BidDescReqGrp\": ");
    bidDescReqGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"BidCompReqGrp\": ");
    bidCompReqGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLiquidityIndType())
        {
            indent(builder, level);
            builder.append("\"LiquidityIndType\": \"");
            builder.append(liquidityIndType);
            builder.append("\",\n");
        }

        if (hasWtAverageLiquidity())
        {
            indent(builder, level);
            builder.append("\"WtAverageLiquidity\": \"");
            wtAverageLiquidity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExchangeForPhysical())
        {
            indent(builder, level);
            builder.append("\"ExchangeForPhysical\": \"");
            builder.append(exchangeForPhysical);
            builder.append("\",\n");
        }

        if (hasOutMainCntryUIndex())
        {
            indent(builder, level);
            builder.append("\"OutMainCntryUIndex\": \"");
            outMainCntryUIndex.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCrossPercent())
        {
            indent(builder, level);
            builder.append("\"CrossPercent\": \"");
            crossPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasProgRptReqs())
        {
            indent(builder, level);
            builder.append("\"ProgRptReqs\": \"");
            builder.append(progRptReqs);
            builder.append("\",\n");
        }

        if (hasProgPeriodInterval())
        {
            indent(builder, level);
            builder.append("\"ProgPeriodInterval\": \"");
            builder.append(progPeriodInterval);
            builder.append("\",\n");
        }

        if (hasIncTaxInd())
        {
            indent(builder, level);
            builder.append("\"IncTaxInd\": \"");
            builder.append(incTaxInd);
            builder.append("\",\n");
        }

        if (hasForexReq())
        {
            indent(builder, level);
            builder.append("\"ForexReq\": \"");
            builder.append(forexReq);
            builder.append("\",\n");
        }

        if (hasNumBidders())
        {
            indent(builder, level);
            builder.append("\"NumBidders\": \"");
            builder.append(numBidders);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasBidTradeType())
        {
            indent(builder, level);
            builder.append("\"BidTradeType\": \"");
            builder.append(bidTradeType);
            builder.append("\",\n");
        }

        if (hasBasisPxType())
        {
            indent(builder, level);
            builder.append("\"BasisPxType\": \"");
            builder.append(basisPxType);
            builder.append("\",\n");
        }

        if (hasStrikeTime())
        {
            indent(builder, level);
            builder.append("\"StrikeTime\": \"");
            appendBuffer(builder, strikeTime, strikeTimeOffset, strikeTimeLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidRequestEncoder)encoder);
    }

    public BidRequestEncoder copyTo(final BidRequestEncoder encoder)
    {
        encoder.reset();
        if (hasBidID())
        {
            encoder.bidIDAsCopy(bidID.byteArray(), 0, bidIDLength);
        }

        if (hasClientBidID())
        {
            encoder.clientBidIDAsCopy(clientBidID.byteArray(), 0, clientBidIDLength);
        }

        if (hasBidRequestTransType())
        {
            encoder.bidRequestTransType(this.bidRequestTransType());
        }

        if (hasListName())
        {
            encoder.listNameAsCopy(listName.byteArray(), 0, listNameLength);
        }

        if (hasTotNoRelatedSym())
        {
            encoder.totNoRelatedSym(this.totNoRelatedSym());
        }

        if (hasBidType())
        {
            encoder.bidType(this.bidType());
        }

        if (hasNumTickets())
        {
            encoder.numTickets(this.numTickets());
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }

        if (hasSideValue1())
        {
            encoder.sideValue1(this.sideValue1());
        }

        if (hasSideValue2())
        {
            encoder.sideValue2(this.sideValue2());
        }


        bidDescReqGrp.copyTo(encoder.bidDescReqGrp());

        bidCompReqGrp.copyTo(encoder.bidCompReqGrp());
        if (hasLiquidityIndType())
        {
            encoder.liquidityIndType(this.liquidityIndType());
        }

        if (hasWtAverageLiquidity())
        {
            encoder.wtAverageLiquidity(this.wtAverageLiquidity());
        }

        if (hasExchangeForPhysical())
        {
            encoder.exchangeForPhysical(this.exchangeForPhysical());
        }

        if (hasOutMainCntryUIndex())
        {
            encoder.outMainCntryUIndex(this.outMainCntryUIndex());
        }

        if (hasCrossPercent())
        {
            encoder.crossPercent(this.crossPercent());
        }

        if (hasProgRptReqs())
        {
            encoder.progRptReqs(this.progRptReqs());
        }

        if (hasProgPeriodInterval())
        {
            encoder.progPeriodInterval(this.progPeriodInterval());
        }

        if (hasIncTaxInd())
        {
            encoder.incTaxInd(this.incTaxInd());
        }

        if (hasForexReq())
        {
            encoder.forexReq(this.forexReq());
        }

        if (hasNumBidders())
        {
            encoder.numBidders(this.numBidders());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasBidTradeType())
        {
            encoder.bidTradeType(this.bidTradeType());
        }

        if (hasBasisPxType())
        {
            encoder.basisPxType(this.basisPxType());
        }

        if (hasStrikeTime())
        {
            encoder.strikeTimeAsCopy(strikeTime.byteArray(), 0, strikeTimeLength);
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
        return encoder;
    }

}
