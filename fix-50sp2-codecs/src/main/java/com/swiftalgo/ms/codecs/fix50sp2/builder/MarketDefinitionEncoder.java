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


public class MarketDefinitionEncoder implements Encoder
{
    public long messageType()
    {
        return 21826L;
    }

    public MarketDefinitionEncoder()
    {
        header.msgType("BU");
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

    private static final int marketReportIDHeaderLength = 5;
    private static final byte[] marketReportIDHeader = new byte[] {49, 51, 57, 52, (byte) '='};

    private static final int marketReqIDHeaderLength = 5;
    private static final byte[] marketReqIDHeader = new byte[] {49, 51, 57, 51, (byte) '='};

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int marketSegmentDescHeaderLength = 5;
    private static final byte[] marketSegmentDescHeader = new byte[] {49, 51, 57, 54, (byte) '='};

    private static final int encodedMktSegmDescLenHeaderLength = 5;
    private static final byte[] encodedMktSegmDescLenHeader = new byte[] {49, 51, 57, 55, (byte) '='};

    private static final int encodedMktSegmDescHeaderLength = 5;
    private static final byte[] encodedMktSegmDescHeader = new byte[] {49, 51, 57, 56, (byte) '='};

    private static final int parentMktSegmIDHeaderLength = 5;
    private static final byte[] parentMktSegmIDHeader = new byte[] {49, 51, 50, 53, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer marketReportID = new UnsafeBuffer();

    private int marketReportIDOffset = 0;

    private int marketReportIDLength = 0;

    public MarketDefinitionEncoder marketReportID(final DirectBuffer value, final int offset, final int length)
    {
        marketReportID.wrap(value);
        marketReportIDOffset = offset;
        marketReportIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReportID(final DirectBuffer value, final int length)
    {
        return marketReportID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReportID(final DirectBuffer value)
    {
        return marketReportID(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder marketReportID(final byte[] value, final int offset, final int length)
    {
        marketReportID.wrap(value);
        marketReportIDOffset = offset;
        marketReportIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReportIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketReportID, value, offset, length);
        marketReportIDOffset = offset;
        marketReportIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReportID(final byte[] value, final int length)
    {
        return marketReportID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReportID(final byte[] value)
    {
        return marketReportID(value, 0, value.length);
    }

    public boolean hasMarketReportID()
    {
        return marketReportIDLength > 0;
    }

    public MutableDirectBuffer marketReportID()
    {
        return marketReportID;
    }

    public String marketReportIDAsString()
    {
        return marketReportID.getStringWithoutLengthAscii(marketReportIDOffset, marketReportIDLength);
    }

    public MarketDefinitionEncoder marketReportID(final CharSequence value)
    {
        toBytes(value, marketReportID);
        marketReportIDOffset = 0;
        marketReportIDLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder marketReportID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketReportID.wrap(buffer);
            marketReportIDOffset = value.offset();
            marketReportIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder marketReportID(final char[] value)
    {
        return marketReportID(value, 0, value.length);
    }

    public MarketDefinitionEncoder marketReportID(final char[] value, final int length)
    {
        return marketReportID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReportID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketReportID, offset, length);
        marketReportIDOffset = 0;
        marketReportIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketReqID = new UnsafeBuffer();

    private int marketReqIDOffset = 0;

    private int marketReqIDLength = 0;

    public MarketDefinitionEncoder marketReqID(final DirectBuffer value, final int offset, final int length)
    {
        marketReqID.wrap(value);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReqID(final DirectBuffer value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReqID(final DirectBuffer value)
    {
        return marketReqID(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder marketReqID(final byte[] value, final int offset, final int length)
    {
        marketReqID.wrap(value);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketReqID, value, offset, length);
        marketReqIDOffset = offset;
        marketReqIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketReqID(final byte[] value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReqID(final byte[] value)
    {
        return marketReqID(value, 0, value.length);
    }

    public boolean hasMarketReqID()
    {
        return marketReqIDLength > 0;
    }

    public MutableDirectBuffer marketReqID()
    {
        return marketReqID;
    }

    public String marketReqIDAsString()
    {
        return marketReqID.getStringWithoutLengthAscii(marketReqIDOffset, marketReqIDLength);
    }

    public MarketDefinitionEncoder marketReqID(final CharSequence value)
    {
        toBytes(value, marketReqID);
        marketReqIDOffset = 0;
        marketReqIDLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder marketReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketReqID.wrap(buffer);
            marketReqIDOffset = value.offset();
            marketReqIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder marketReqID(final char[] value)
    {
        return marketReqID(value, 0, value.length);
    }

    public MarketDefinitionEncoder marketReqID(final char[] value, final int length)
    {
        return marketReqID(value, 0, length);
    }

    public MarketDefinitionEncoder marketReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketReqID, offset, length);
        marketReqIDOffset = 0;
        marketReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public MarketDefinitionEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public MarketDefinitionEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public MarketDefinitionEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public MarketDefinitionEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public MarketDefinitionEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public MarketDefinitionEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public MarketDefinitionEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentDesc = new UnsafeBuffer();

    private int marketSegmentDescOffset = 0;

    private int marketSegmentDescLength = 0;

    public MarketDefinitionEncoder marketSegmentDesc(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentDesc.wrap(value);
        marketSegmentDescOffset = offset;
        marketSegmentDescLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentDesc(final DirectBuffer value, final int length)
    {
        return marketSegmentDesc(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentDesc(final DirectBuffer value)
    {
        return marketSegmentDesc(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder marketSegmentDesc(final byte[] value, final int offset, final int length)
    {
        marketSegmentDesc.wrap(value);
        marketSegmentDescOffset = offset;
        marketSegmentDescLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentDesc, value, offset, length);
        marketSegmentDescOffset = offset;
        marketSegmentDescLength = length;
        return this;
    }

    public MarketDefinitionEncoder marketSegmentDesc(final byte[] value, final int length)
    {
        return marketSegmentDesc(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentDesc(final byte[] value)
    {
        return marketSegmentDesc(value, 0, value.length);
    }

    public boolean hasMarketSegmentDesc()
    {
        return marketSegmentDescLength > 0;
    }

    public MutableDirectBuffer marketSegmentDesc()
    {
        return marketSegmentDesc;
    }

    public String marketSegmentDescAsString()
    {
        return marketSegmentDesc.getStringWithoutLengthAscii(marketSegmentDescOffset, marketSegmentDescLength);
    }

    public MarketDefinitionEncoder marketSegmentDesc(final CharSequence value)
    {
        toBytes(value, marketSegmentDesc);
        marketSegmentDescOffset = 0;
        marketSegmentDescLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder marketSegmentDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentDesc.wrap(buffer);
            marketSegmentDescOffset = value.offset();
            marketSegmentDescLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder marketSegmentDesc(final char[] value)
    {
        return marketSegmentDesc(value, 0, value.length);
    }

    public MarketDefinitionEncoder marketSegmentDesc(final char[] value, final int length)
    {
        return marketSegmentDesc(value, 0, length);
    }

    public MarketDefinitionEncoder marketSegmentDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentDesc, offset, length);
        marketSegmentDescOffset = 0;
        marketSegmentDescLength = length;
        return this;
    }

    private int encodedMktSegmDescLen;

    private boolean hasEncodedMktSegmDescLen;

    public boolean hasEncodedMktSegmDescLen()
    {
        return hasEncodedMktSegmDescLen;
    }

    public MarketDefinitionEncoder encodedMktSegmDescLen(int value)
    {
        encodedMktSegmDescLen = value;
        hasEncodedMktSegmDescLen = true;
        return this;
    }

    public int encodedMktSegmDescLen()
    {
        return encodedMktSegmDescLen;
    }

    private byte[] encodedMktSegmDesc;

    private boolean hasEncodedMktSegmDesc;

    public boolean hasEncodedMktSegmDesc()
    {
        return hasEncodedMktSegmDesc;
    }

    public MarketDefinitionEncoder encodedMktSegmDesc(byte[] value)
    {
        encodedMktSegmDesc = value;
        hasEncodedMktSegmDesc = true;
        return this;
    }

    public byte[] encodedMktSegmDesc()
    {
        return encodedMktSegmDesc;
    }

    public MarketDefinitionEncoder encodedMktSegmDescAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedMktSegmDesc = copyInto(encodedMktSegmDesc, value, offset, length);
        hasEncodedMktSegmDesc = true;
        return this;
    }

    private final MutableDirectBuffer parentMktSegmID = new UnsafeBuffer();

    private int parentMktSegmIDOffset = 0;

    private int parentMktSegmIDLength = 0;

    public MarketDefinitionEncoder parentMktSegmID(final DirectBuffer value, final int offset, final int length)
    {
        parentMktSegmID.wrap(value);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder parentMktSegmID(final DirectBuffer value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionEncoder parentMktSegmID(final DirectBuffer value)
    {
        return parentMktSegmID(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder parentMktSegmID(final byte[] value, final int offset, final int length)
    {
        parentMktSegmID.wrap(value);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder parentMktSegmIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(parentMktSegmID, value, offset, length);
        parentMktSegmIDOffset = offset;
        parentMktSegmIDLength = length;
        return this;
    }

    public MarketDefinitionEncoder parentMktSegmID(final byte[] value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionEncoder parentMktSegmID(final byte[] value)
    {
        return parentMktSegmID(value, 0, value.length);
    }

    public boolean hasParentMktSegmID()
    {
        return parentMktSegmIDLength > 0;
    }

    public MutableDirectBuffer parentMktSegmID()
    {
        return parentMktSegmID;
    }

    public String parentMktSegmIDAsString()
    {
        return parentMktSegmID.getStringWithoutLengthAscii(parentMktSegmIDOffset, parentMktSegmIDLength);
    }

    public MarketDefinitionEncoder parentMktSegmID(final CharSequence value)
    {
        toBytes(value, parentMktSegmID);
        parentMktSegmIDOffset = 0;
        parentMktSegmIDLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder parentMktSegmID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            parentMktSegmID.wrap(buffer);
            parentMktSegmIDOffset = value.offset();
            parentMktSegmIDLength = value.length();
        }
        return this;
    }

    public MarketDefinitionEncoder parentMktSegmID(final char[] value)
    {
        return parentMktSegmID(value, 0, value.length);
    }

    public MarketDefinitionEncoder parentMktSegmID(final char[] value, final int length)
    {
        return parentMktSegmID(value, 0, length);
    }

    public MarketDefinitionEncoder parentMktSegmID(final char[] value, final int offset, final int length)
    {
        toBytes(value, parentMktSegmID, offset, length);
        parentMktSegmIDOffset = 0;
        parentMktSegmIDLength = length;
        return this;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public MarketDefinitionEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MarketDefinitionEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public MarketDefinitionEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MarketDefinitionEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public MarketDefinitionEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MarketDefinitionEncoder currency(final byte[] value)
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

    public MarketDefinitionEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder currency(final AsciiSequenceView value)
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

    public MarketDefinitionEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public MarketDefinitionEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public MarketDefinitionEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final BaseTradingRulesEncoder baseTradingRules = new BaseTradingRulesEncoder();
    public BaseTradingRulesEncoder baseTradingRules()
    {
        return baseTradingRules;
    }

    private final OrdTypeRulesEncoder ordTypeRules = new OrdTypeRulesEncoder();
    public OrdTypeRulesEncoder ordTypeRules()
    {
        return ordTypeRules;
    }

    private final TimeInForceRulesEncoder timeInForceRules = new TimeInForceRulesEncoder();
    public TimeInForceRulesEncoder timeInForceRules()
    {
        return timeInForceRules;
    }

    private final ExecInstRulesEncoder execInstRules = new ExecInstRulesEncoder();
    public ExecInstRulesEncoder execInstRules()
    {
        return execInstRules;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public MarketDefinitionEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MarketDefinitionEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public MarketDefinitionEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MarketDefinitionEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public MarketDefinitionEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public MarketDefinitionEncoder transactTime(final byte[] value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public MarketDefinitionEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MarketDefinitionEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public MarketDefinitionEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public MarketDefinitionEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MarketDefinitionEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MarketDefinitionEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MarketDefinitionEncoder text(final byte[] value)
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

    public MarketDefinitionEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public MarketDefinitionEncoder text(final AsciiSequenceView value)
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

    public MarketDefinitionEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public MarketDefinitionEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MarketDefinitionEncoder text(final char[] value, final int offset, final int length)
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

    public MarketDefinitionEncoder encodedTextLen(int value)
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

    public MarketDefinitionEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public MarketDefinitionEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
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

            position += applicationSequenceControl.encode(buffer, position);

        if (marketReportIDLength > 0)
        {
            buffer.putBytes(position, marketReportIDHeader, 0, marketReportIDHeaderLength);
            position += marketReportIDHeaderLength;
            buffer.putBytes(position, marketReportID, marketReportIDOffset, marketReportIDLength);
            position += marketReportIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MarketReportID");
        }

        if (marketReqIDLength > 0)
        {
            buffer.putBytes(position, marketReqIDHeader, 0, marketReqIDHeaderLength);
            position += marketReqIDHeaderLength;
            buffer.putBytes(position, marketReqID, marketReqIDOffset, marketReqIDLength);
            position += marketReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: MarketID");
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentDescLength > 0)
        {
            buffer.putBytes(position, marketSegmentDescHeader, 0, marketSegmentDescHeaderLength);
            position += marketSegmentDescHeaderLength;
            buffer.putBytes(position, marketSegmentDesc, marketSegmentDescOffset, marketSegmentDescLength);
            position += marketSegmentDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedMktSegmDescLen)
        {
            buffer.putBytes(position, encodedMktSegmDescLenHeader, 0, encodedMktSegmDescLenHeaderLength);
            position += encodedMktSegmDescLenHeaderLength;
            position += buffer.putIntAscii(position, encodedMktSegmDescLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedMktSegmDesc)
        {
            buffer.putBytes(position, encodedMktSegmDescHeader, 0, encodedMktSegmDescHeaderLength);
            position += encodedMktSegmDescHeaderLength;
            buffer.putBytes(position, encodedMktSegmDesc);
            position += encodedMktSegmDesc.length;
            buffer.putSeparator(position);
            position++;
        }

        if (parentMktSegmIDLength > 0)
        {
            buffer.putBytes(position, parentMktSegmIDHeader, 0, parentMktSegmIDHeaderLength);
            position += parentMktSegmIDHeaderLength;
            buffer.putBytes(position, parentMktSegmID, parentMktSegmIDOffset, parentMktSegmIDLength);
            position += parentMktSegmIDLength;
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

            position += baseTradingRules.encode(buffer, position);

            position += ordTypeRules.encode(buffer, position);

            position += timeInForceRules.encode(buffer, position);

            position += execInstRules.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
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
        this.resetMarketReportID();
        this.resetMarketReqID();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetMarketSegmentDesc();
        this.resetEncodedMktSegmDescLen();
        this.resetEncodedMktSegmDesc();
        this.resetParentMktSegmID();
        this.resetCurrency();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        applicationSequenceControl.reset();
        baseTradingRules.reset();
        ordTypeRules.reset();
        timeInForceRules.reset();
        execInstRules.reset();
    }

    public void resetMarketReportID()
    {
        marketReportIDLength = 0;
    }

    public void resetMarketReqID()
    {
        marketReqIDLength = 0;
    }

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
    }

    public void resetMarketSegmentDesc()
    {
        marketSegmentDescLength = 0;
    }

    public void resetEncodedMktSegmDescLen()
    {
        hasEncodedMktSegmDescLen = false;
    }

    public void resetEncodedMktSegmDesc()
    {
        hasEncodedMktSegmDesc = false;
    }

    public void resetParentMktSegmID()
    {
        parentMktSegmIDLength = 0;
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"MarketDefinition\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMarketReportID())
        {
            indent(builder, level);
            builder.append("\"MarketReportID\": \"");
            appendBuffer(builder, marketReportID, marketReportIDOffset, marketReportIDLength);
            builder.append("\",\n");
        }

        if (hasMarketReqID())
        {
            indent(builder, level);
            builder.append("\"MarketReqID\": \"");
            appendBuffer(builder, marketReqID, marketReqIDOffset, marketReqIDLength);
            builder.append("\",\n");
        }

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentDesc())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentDesc\": \"");
            appendBuffer(builder, marketSegmentDesc, marketSegmentDescOffset, marketSegmentDescLength);
            builder.append("\",\n");
        }

        if (hasEncodedMktSegmDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedMktSegmDescLen\": \"");
            builder.append(encodedMktSegmDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedMktSegmDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedMktSegmDesc\": \"");
            appendData(builder, encodedMktSegmDesc, encodedMktSegmDescLen);
            builder.append("\",\n");
        }

        if (hasParentMktSegmID())
        {
            indent(builder, level);
            builder.append("\"ParentMktSegmID\": \"");
            appendBuffer(builder, parentMktSegmID, parentMktSegmIDOffset, parentMktSegmIDLength);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"BaseTradingRules\": ");
    baseTradingRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"OrdTypeRules\": ");
    ordTypeRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TimeInForceRules\": ");
    timeInForceRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ExecInstRules\": ");
    execInstRules.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
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
    public MarketDefinitionEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MarketDefinitionEncoder)encoder);
    }

    public MarketDefinitionEncoder copyTo(final MarketDefinitionEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasMarketReportID())
        {
            encoder.marketReportIDAsCopy(marketReportID.byteArray(), 0, marketReportIDLength);
        }

        if (hasMarketReqID())
        {
            encoder.marketReqIDAsCopy(marketReqID.byteArray(), 0, marketReqIDLength);
        }

        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }

        if (hasMarketSegmentDesc())
        {
            encoder.marketSegmentDescAsCopy(marketSegmentDesc.byteArray(), 0, marketSegmentDescLength);
        }

        if (hasEncodedMktSegmDescLen())
        {
            encoder.encodedMktSegmDescLen(this.encodedMktSegmDescLen());
        }

        if (hasEncodedMktSegmDesc())
        {
            encoder.encodedMktSegmDescAsCopy(this.encodedMktSegmDesc(), 0, encodedMktSegmDescLen());
            encoder.encodedMktSegmDescLen(encodedMktSegmDescLen());
        }

        if (hasParentMktSegmID())
        {
            encoder.parentMktSegmIDAsCopy(parentMktSegmID.byteArray(), 0, parentMktSegmIDLength);
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }


        baseTradingRules.copyTo(encoder.baseTradingRules());

        ordTypeRules.copyTo(encoder.ordTypeRules());

        timeInForceRules.copyTo(encoder.timeInForceRules());

        execInstRules.copyTo(encoder.execInstRules());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
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
