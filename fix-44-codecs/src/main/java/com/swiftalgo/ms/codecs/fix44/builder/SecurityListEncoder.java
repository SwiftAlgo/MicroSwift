/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import com.swiftalgo.ms.codecs.fix44.*;


public class SecurityListEncoder implements Encoder
{
    public long messageType()
    {
        return 121L;
    }

    public SecurityListEncoder()
    {
        header.msgType("y");
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

    private static final int securityReqIDHeaderLength = 4;
    private static final byte[] securityReqIDHeader = new byte[] {51, 50, 48, (byte) '='};

    private static final int securityResponseIDHeaderLength = 4;
    private static final byte[] securityResponseIDHeader = new byte[] {51, 50, 50, (byte) '='};

    private static final int securityRequestResultHeaderLength = 4;
    private static final byte[] securityRequestResultHeader = new byte[] {53, 54, 48, (byte) '='};

    private static final int totNoRelatedSymHeaderLength = 4;
    private static final byte[] totNoRelatedSymHeader = new byte[] {51, 57, 51, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private static final int noRelatedSymGroupCounterHeaderLength = 4;
    private static final byte[] noRelatedSymGroupCounterHeader = new byte[] {49, 52, 54, (byte) '='};

    private final MutableDirectBuffer securityReqID = new UnsafeBuffer();

    private int securityReqIDOffset = 0;

    private int securityReqIDLength = 0;

    public SecurityListEncoder securityReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqID(final DirectBuffer value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final DirectBuffer value)
    {
        return securityReqID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityReqID(final byte[] value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityReqID, value, offset, length);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public SecurityListEncoder securityReqID(final byte[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final byte[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public boolean hasSecurityReqID()
    {
        return securityReqIDLength > 0;
    }

    public MutableDirectBuffer securityReqID()
    {
        return securityReqID;
    }

    public String securityReqIDAsString()
    {
        return securityReqID.getStringWithoutLengthAscii(securityReqIDOffset, securityReqIDLength);
    }

    public SecurityListEncoder securityReqID(final CharSequence value)
    {
        toBytes(value, securityReqID);
        securityReqIDOffset = 0;
        securityReqIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityReqID.wrap(buffer);
            securityReqIDOffset = value.offset();
            securityReqIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityReqID(final char[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public SecurityListEncoder securityReqID(final char[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public SecurityListEncoder securityReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityReqID, offset, length);
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityResponseID = new UnsafeBuffer();

    private int securityResponseIDOffset = 0;

    private int securityResponseIDLength = 0;

    public SecurityListEncoder securityResponseID(final DirectBuffer value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseID(final DirectBuffer value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final DirectBuffer value)
    {
        return securityResponseID(value, 0, value.capacity());
    }

    public SecurityListEncoder securityResponseID(final byte[] value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityResponseID, value, offset, length);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public SecurityListEncoder securityResponseID(final byte[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final byte[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public boolean hasSecurityResponseID()
    {
        return securityResponseIDLength > 0;
    }

    public MutableDirectBuffer securityResponseID()
    {
        return securityResponseID;
    }

    public String securityResponseIDAsString()
    {
        return securityResponseID.getStringWithoutLengthAscii(securityResponseIDOffset, securityResponseIDLength);
    }

    public SecurityListEncoder securityResponseID(final CharSequence value)
    {
        toBytes(value, securityResponseID);
        securityResponseIDOffset = 0;
        securityResponseIDLength = value.length();
        return this;
    }

    public SecurityListEncoder securityResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityResponseID.wrap(buffer);
            securityResponseIDOffset = value.offset();
            securityResponseIDLength = value.length();
        }
        return this;
    }

    public SecurityListEncoder securityResponseID(final char[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public SecurityListEncoder securityResponseID(final char[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public SecurityListEncoder securityResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityResponseID, offset, length);
        securityResponseIDOffset = 0;
        securityResponseIDLength = length;
        return this;
    }

    private int securityRequestResult;

    private boolean hasSecurityRequestResult;

    public boolean hasSecurityRequestResult()
    {
        return hasSecurityRequestResult;
    }

    public SecurityListEncoder securityRequestResult(int value)
    {
        securityRequestResult = value;
        hasSecurityRequestResult = true;
        return this;
    }

    public int securityRequestResult()
    {
        return securityRequestResult;
    }

    public SecurityListEncoder securityRequestResult(SecurityRequestResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityRequestResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityRequestResult Value: " + value );
            }
            if (value == SecurityRequestResult.NULL_VAL)
            {
                return this;
            }
        }
        return securityRequestResult(value.representation());
    }

    private int totNoRelatedSym;

    private boolean hasTotNoRelatedSym;

    public boolean hasTotNoRelatedSym()
    {
        return hasTotNoRelatedSym;
    }

    public SecurityListEncoder totNoRelatedSym(int value)
    {
        totNoRelatedSym = value;
        hasTotNoRelatedSym = true;
        return this;
    }

    public int totNoRelatedSym()
    {
        return totNoRelatedSym;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public SecurityListEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }



public static class RelatedSymGroupEncoder
{
    private RelatedSymGroupEncoder next = null;

    public RelatedSymGroupEncoder next()
    {
        if (next == null)
        {
            next = new RelatedSymGroupEncoder();
        }
        return next;
    }

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int currencyHeaderLength = 3;
    private static final byte[] currencyHeader = new byte[] {49, 53, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int roundLotHeaderLength = 4;
    private static final byte[] roundLotHeader = new byte[] {53, 54, 49, (byte) '='};

    private static final int minTradeVolHeaderLength = 4;
    private static final byte[] minTradeVolHeader = new byte[] {53, 54, 50, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int expirationCycleHeaderLength = 4;
    private static final byte[] expirationCycleHeader = new byte[] {56, 50, 55, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final InstrumentExtensionEncoder instrumentExtension = new InstrumentExtensionEncoder();
    public InstrumentExtensionEncoder instrumentExtension()
    {
        return instrumentExtension;
    }

    private final FinancingDetailsEncoder financingDetails = new FinancingDetailsEncoder();
    public FinancingDetailsEncoder financingDetails()
    {
        return financingDetails;
    }



public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public RelatedSymGroupEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
    }

    private final MutableDirectBuffer currency = new UnsafeBuffer();

    private int currencyOffset = 0;

    private int currencyLength = 0;

    public RelatedSymGroupEncoder currency(final DirectBuffer value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RelatedSymGroupEncoder currency(final DirectBuffer value, final int length)
    {
        return currency(value, 0, length);
    }

    public RelatedSymGroupEncoder currency(final DirectBuffer value)
    {
        return currency(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder currency(final byte[] value, final int offset, final int length)
    {
        currency.wrap(value);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RelatedSymGroupEncoder currencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(currency, value, offset, length);
        currencyOffset = offset;
        currencyLength = length;
        return this;
    }

    public RelatedSymGroupEncoder currency(final byte[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public RelatedSymGroupEncoder currency(final byte[] value)
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

    public RelatedSymGroupEncoder currency(final CharSequence value)
    {
        toBytes(value, currency);
        currencyOffset = 0;
        currencyLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder currency(final AsciiSequenceView value)
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

    public RelatedSymGroupEncoder currency(final char[] value)
    {
        return currency(value, 0, value.length);
    }

    public RelatedSymGroupEncoder currency(final char[] value, final int length)
    {
        return currency(value, 0, length);
    }

    public RelatedSymGroupEncoder currency(final char[] value, final int offset, final int length)
    {
        toBytes(value, currency, offset, length);
        currencyOffset = 0;
        currencyLength = length;
        return this;
    }

    private final StipulationsEncoder stipulations = new StipulationsEncoder();
    public StipulationsEncoder stipulations()
    {
        return stipulations;
    }



public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private int legSwapType;

    private boolean hasLegSwapType;

    public boolean hasLegSwapType()
    {
        return hasLegSwapType;
    }

    public LegsGroupEncoder legSwapType(int value)
    {
        legSwapType = value;
        hasLegSwapType = true;
        return this;
    }

    public int legSwapType()
    {
        return legSwapType;
    }

    public LegsGroupEncoder legSwapType(LegSwapType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == LegSwapType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: legSwapType Value: " + value );
            }
            if (value == LegSwapType.NULL_VAL)
            {
                return this;
            }
        }
        return legSwapType(value.representation());
    }

    private char legSettlType;

    private boolean hasLegSettlType;

    public boolean hasLegSettlType()
    {
        return hasLegSettlType;
    }

    public LegsGroupEncoder legSettlType(char value)
    {
        legSettlType = value;
        hasLegSettlType = true;
        return this;
    }

    public char legSettlType()
    {
        return legSettlType;
    }

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    private final LegBenchmarkCurveDataEncoder legBenchmarkCurveData = new LegBenchmarkCurveDataEncoder();
    public LegBenchmarkCurveDataEncoder legBenchmarkCurveData()
    {
        return legBenchmarkCurveData;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (hasLegSwapType)
        {
            buffer.putBytes(position, legSwapTypeHeader, 0, legSwapTypeHeaderLength);
            position += legSwapTypeHeaderLength;
            position += buffer.putIntAscii(position, legSwapType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSettlType)
        {
            buffer.putBytes(position, legSettlTypeHeader, 0, legSettlTypeHeaderLength);
            position += legSettlTypeHeaderLength;
            position += buffer.putCharAscii(position, legSettlType);
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);

            position += legBenchmarkCurveData.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetLegSwapType();
        this.resetLegSettlType();
        instrumentLeg.reset();
        legStipulations.reset();
        legBenchmarkCurveData.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegSwapType())
        {
            indent(builder, level);
            builder.append("\"LegSwapType\": \"");
            builder.append(legSwapType);
            builder.append("\",\n");
        }

        if (hasLegSettlType())
        {
            indent(builder, level);
            builder.append("\"LegSettlType\": \"");
            builder.append(legSettlType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"LegBenchmarkCurveData\": ");
    legBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());
        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }


        legStipulations.copyTo(encoder.legStipulations());

        legBenchmarkCurveData.copyTo(encoder.legBenchmarkCurveData());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public RelatedSymGroupEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
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

    private final DecimalFloat roundLot = new DecimalFloat();

    private boolean hasRoundLot;

    public boolean hasRoundLot()
    {
        return hasRoundLot;
    }

    public RelatedSymGroupEncoder roundLot(DecimalFloat value)
    {
        roundLot.set(value);
        hasRoundLot = true;
        return this;
    }

    public RelatedSymGroupEncoder roundLot(long value, int scale)
    {
        roundLot.set(value, scale);
        hasRoundLot = true;
        return this;
    }

    public DecimalFloat roundLot()
    {
        return roundLot;
    }

    private final DecimalFloat minTradeVol = new DecimalFloat();

    private boolean hasMinTradeVol;

    public boolean hasMinTradeVol()
    {
        return hasMinTradeVol;
    }

    public RelatedSymGroupEncoder minTradeVol(DecimalFloat value)
    {
        minTradeVol.set(value);
        hasMinTradeVol = true;
        return this;
    }

    public RelatedSymGroupEncoder minTradeVol(long value, int scale)
    {
        minTradeVol.set(value, scale);
        hasMinTradeVol = true;
        return this;
    }

    public DecimalFloat minTradeVol()
    {
        return minTradeVol;
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public RelatedSymGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionID(final byte[] value)
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

    public RelatedSymGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionID(final AsciiSequenceView value)
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

    public RelatedSymGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public RelatedSymGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public RelatedSymGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final byte[] value)
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

    public RelatedSymGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
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

    public RelatedSymGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public RelatedSymGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    private int expirationCycle;

    private boolean hasExpirationCycle;

    public boolean hasExpirationCycle()
    {
        return hasExpirationCycle;
    }

    public RelatedSymGroupEncoder expirationCycle(int value)
    {
        expirationCycle = value;
        hasExpirationCycle = true;
        return this;
    }

    public int expirationCycle()
    {
        return expirationCycle;
    }

    public RelatedSymGroupEncoder expirationCycle(ExpirationCycle value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ExpirationCycle.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: expirationCycle Value: " + value );
            }
            if (value == ExpirationCycle.NULL_VAL)
            {
                return this;
            }
        }
        return expirationCycle(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public RelatedSymGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final byte[] value)
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

    public RelatedSymGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder text(final AsciiSequenceView value)
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

    public RelatedSymGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public RelatedSymGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final char[] value, final int offset, final int length)
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

    public RelatedSymGroupEncoder encodedTextLen(int value)
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

    public RelatedSymGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public RelatedSymGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrument.encode(buffer, position);

            position += instrumentExtension.encode(buffer, position);

            position += financingDetails.encode(buffer, position);

        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
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

            position += stipulations.encode(buffer, position);

        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }


            position += spreadOrBenchmarkCurveData.encode(buffer, position);

            position += yieldData.encode(buffer, position);

        if (hasRoundLot)
        {
            buffer.putBytes(position, roundLotHeader, 0, roundLotHeaderLength);
            position += roundLotHeaderLength;
            position += buffer.putFloatAscii(position, roundLot);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMinTradeVol)
        {
            buffer.putBytes(position, minTradeVolHeader, 0, minTradeVolHeaderLength);
            position += minTradeVolHeaderLength;
            position += buffer.putFloatAscii(position, minTradeVol);
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

        if (hasExpirationCycle)
        {
            buffer.putBytes(position, expirationCycleHeader, 0, expirationCycleHeaderLength);
            position += expirationCycleHeaderLength;
            position += buffer.putIntAscii(position, expirationCycle);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetCurrency();
        this.resetRoundLot();
        this.resetMinTradeVol();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetExpirationCycle();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        instrumentExtension.reset();
        financingDetails.reset();
        stipulations.reset();
        spreadOrBenchmarkCurveData.reset();
        yieldData.reset();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetCurrency()
    {
        currencyLength = 0;
    }

    public void resetRoundLot()
    {
        hasRoundLot = false;
    }

    public void resetMinTradeVol()
    {
        hasMinTradeVol = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetExpirationCycle()
    {
        hasExpirationCycle = false;
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

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RelatedSymGroup\",\n");
    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrumentExtension\": ");
    instrumentExtension.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"FinancingDetails\": ");
    financingDetails.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            appendBuffer(builder, currency, currencyOffset, currencyLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Stipulations\": ");
    stipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

    indent(builder, level);
    builder.append("\"SpreadOrBenchmarkCurveData\": ");
    spreadOrBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"YieldData\": ");
    yieldData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasRoundLot())
        {
            indent(builder, level);
            builder.append("\"RoundLot\": \"");
            roundLot.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMinTradeVol())
        {
            indent(builder, level);
            builder.append("\"MinTradeVol\": \"");
            minTradeVol.appendTo(builder);
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

        if (hasExpirationCycle())
        {
            indent(builder, level);
            builder.append("\"ExpirationCycle\": \"");
            builder.append(expirationCycle);
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
    public RelatedSymGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RelatedSymGroupEncoder)encoder);
    }

    public RelatedSymGroupEncoder copyTo(final RelatedSymGroupEncoder encoder)
    {
        encoder.reset();

        instrument.copyTo(encoder.instrument());

        instrumentExtension.copyTo(encoder.instrumentExtension());

        financingDetails.copyTo(encoder.financingDetails());
        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }

        if (hasCurrency())
        {
            encoder.currencyAsCopy(currency.byteArray(), 0, currencyLength);
        }


        stipulations.copyTo(encoder.stipulations());
        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }


        spreadOrBenchmarkCurveData.copyTo(encoder.spreadOrBenchmarkCurveData());

        yieldData.copyTo(encoder.yieldData());
        if (hasRoundLot())
        {
            encoder.roundLot(this.roundLot());
        }

        if (hasMinTradeVol())
        {
            encoder.minTradeVol(this.minTradeVol());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasExpirationCycle())
        {
            encoder.expirationCycle(this.expirationCycle());
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
    private int noRelatedSymGroupCounter;

    private boolean hasNoRelatedSymGroupCounter;

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }

    public SecurityListEncoder noRelatedSymGroupCounter(int value)
    {
        noRelatedSymGroupCounter = value;
        hasNoRelatedSymGroupCounter = true;
        return this;
    }

    public int noRelatedSymGroupCounter()
    {
        return noRelatedSymGroupCounter;
    }


    private RelatedSymGroupEncoder relatedSymGroup = null;

    public RelatedSymGroupEncoder relatedSymGroup(final int numberOfElements)
    {
        hasNoRelatedSymGroupCounter = true;
        noRelatedSymGroupCounter = numberOfElements;
        if (relatedSymGroup == null)
        {
            relatedSymGroup = new RelatedSymGroupEncoder();
        }
        return relatedSymGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (securityReqIDLength > 0)
        {
            buffer.putBytes(position, securityReqIDHeader, 0, securityReqIDHeaderLength);
            position += securityReqIDHeaderLength;
            buffer.putBytes(position, securityReqID, securityReqIDOffset, securityReqIDLength);
            position += securityReqIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityReqID");
        }

        if (securityResponseIDLength > 0)
        {
            buffer.putBytes(position, securityResponseIDHeader, 0, securityResponseIDHeaderLength);
            position += securityResponseIDHeaderLength;
            buffer.putBytes(position, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            position += securityResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityResponseID");
        }

        if (hasSecurityRequestResult)
        {
            buffer.putBytes(position, securityRequestResultHeader, 0, securityRequestResultHeaderLength);
            position += securityRequestResultHeaderLength;
            position += buffer.putIntAscii(position, securityRequestResult);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: SecurityRequestResult");
        }

        if (hasTotNoRelatedSym)
        {
            buffer.putBytes(position, totNoRelatedSymHeader, 0, totNoRelatedSymHeaderLength);
            position += totNoRelatedSymHeaderLength;
            position += buffer.putIntAscii(position, totNoRelatedSym);
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

        if (hasNoRelatedSymGroupCounter)
        {
            buffer.putBytes(position, noRelatedSymGroupCounterHeader, 0, noRelatedSymGroupCounterHeaderLength);
            position += noRelatedSymGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRelatedSymGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (relatedSymGroup != null)
        {
            position += relatedSymGroup.encode(buffer, position, noRelatedSymGroupCounter);
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
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityRequestResult();
        this.resetTotNoRelatedSym();
        this.resetLastFragment();
        this.resetRelatedSymGroup();
    }

    public void resetSecurityReqID()
    {
        securityReqIDLength = 0;
    }

    public void resetSecurityResponseID()
    {
        securityResponseIDLength = 0;
    }

    public void resetSecurityRequestResult()
    {
        hasSecurityRequestResult = false;
    }

    public void resetTotNoRelatedSym()
    {
        hasTotNoRelatedSym = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
    }

    public void resetRelatedSymGroup()
    {
        if (relatedSymGroup != null)
        {
            relatedSymGroup.reset();
        }
        noRelatedSymGroupCounter = 0;
        hasNoRelatedSymGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecurityList\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            appendBuffer(builder, securityReqID, securityReqIDOffset, securityReqIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityResponseID())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseID\": \"");
            appendBuffer(builder, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityRequestResult())
        {
            indent(builder, level);
            builder.append("\"SecurityRequestResult\": \"");
            builder.append(securityRequestResult);
            builder.append("\",\n");
        }

        if (hasTotNoRelatedSym())
        {
            indent(builder, level);
            builder.append("\"TotNoRelatedSym\": \"");
            builder.append(totNoRelatedSym);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

        if (hasNoRelatedSymGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RelatedSymGroup\": [\n");
            final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            for (int i = 0; i < noRelatedSymGroupCounter; i++)
            {
                indent(builder, level);
                relatedSymGroup.appendTo(builder, level + 1);
                if (i < (noRelatedSymGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                relatedSymGroup = relatedSymGroup.next();
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
    public SecurityListEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityListEncoder)encoder);
    }

    public SecurityListEncoder copyTo(final SecurityListEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityReqID())
        {
            encoder.securityReqIDAsCopy(securityReqID.byteArray(), 0, securityReqIDLength);
        }

        if (hasSecurityResponseID())
        {
            encoder.securityResponseIDAsCopy(securityResponseID.byteArray(), 0, securityResponseIDLength);
        }

        if (hasSecurityRequestResult())
        {
            encoder.securityRequestResult(this.securityRequestResult());
        }

        if (hasTotNoRelatedSym())
        {
            encoder.totNoRelatedSym(this.totNoRelatedSym());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }

        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = encoder.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.copyTo(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
