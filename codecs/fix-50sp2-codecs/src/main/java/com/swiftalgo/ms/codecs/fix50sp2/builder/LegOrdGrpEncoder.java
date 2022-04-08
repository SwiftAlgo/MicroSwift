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


public class LegOrdGrpEncoder
{
    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};



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

    private static final int legQtyHeaderLength = 4;
    private static final byte[] legQtyHeader = new byte[] {54, 56, 55, (byte) '='};

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legAllocIDHeaderLength = 5;
    private static final byte[] legAllocIDHeader = new byte[] {49, 51, 54, 54, (byte) '='};

    private static final int legPositionEffectHeaderLength = 4;
    private static final byte[] legPositionEffectHeader = new byte[] {53, 54, 52, (byte) '='};

    private static final int legCoveredOrUncoveredHeaderLength = 4;
    private static final byte[] legCoveredOrUncoveredHeader = new byte[] {53, 54, 53, (byte) '='};

    private static final int legRefIDHeaderLength = 4;
    private static final byte[] legRefIDHeader = new byte[] {54, 53, 52, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private static final int legSettlDateHeaderLength = 4;
    private static final byte[] legSettlDateHeader = new byte[] {53, 56, 56, (byte) '='};

    private static final int legSettlCurrencyHeaderLength = 4;
    private static final byte[] legSettlCurrencyHeader = new byte[] {54, 55, 53, (byte) '='};

    private static final int legOrderQtyHeaderLength = 4;
    private static final byte[] legOrderQtyHeader = new byte[] {54, 56, 53, (byte) '='};

    private static final int legVolatilityHeaderLength = 5;
    private static final byte[] legVolatilityHeader = new byte[] {49, 51, 55, 57, (byte) '='};

    private static final int legDividendYieldHeaderLength = 5;
    private static final byte[] legDividendYieldHeader = new byte[] {49, 51, 56, 49, (byte) '='};

    private static final int legCurrencyRatioHeaderLength = 5;
    private static final byte[] legCurrencyRatioHeader = new byte[] {49, 51, 56, 51, (byte) '='};

    private static final int legExecInstHeaderLength = 5;
    private static final byte[] legExecInstHeader = new byte[] {49, 51, 56, 52, (byte) '='};

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    private final DecimalFloat legQty = new DecimalFloat();

    private boolean hasLegQty;

    public boolean hasLegQty()
    {
        return hasLegQty;
    }

    public LegsGroupEncoder legQty(DecimalFloat value)
    {
        legQty.set(value);
        hasLegQty = true;
        return this;
    }

    public LegsGroupEncoder legQty(long value, int scale)
    {
        legQty.set(value, scale);
        hasLegQty = true;
        return this;
    }

    public DecimalFloat legQty()
    {
        return legQty;
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

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    private final MutableDirectBuffer legAllocID = new UnsafeBuffer();

    private int legAllocIDOffset = 0;

    private int legAllocIDLength = 0;

    public LegsGroupEncoder legAllocID(final DirectBuffer value, final int offset, final int length)
    {
        legAllocID.wrap(value);
        legAllocIDOffset = offset;
        legAllocIDLength = length;
        return this;
    }

    public LegsGroupEncoder legAllocID(final DirectBuffer value, final int length)
    {
        return legAllocID(value, 0, length);
    }

    public LegsGroupEncoder legAllocID(final DirectBuffer value)
    {
        return legAllocID(value, 0, value.capacity());
    }

    public LegsGroupEncoder legAllocID(final byte[] value, final int offset, final int length)
    {
        legAllocID.wrap(value);
        legAllocIDOffset = offset;
        legAllocIDLength = length;
        return this;
    }

    public LegsGroupEncoder legAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legAllocID, value, offset, length);
        legAllocIDOffset = offset;
        legAllocIDLength = length;
        return this;
    }

    public LegsGroupEncoder legAllocID(final byte[] value, final int length)
    {
        return legAllocID(value, 0, length);
    }

    public LegsGroupEncoder legAllocID(final byte[] value)
    {
        return legAllocID(value, 0, value.length);
    }

    public boolean hasLegAllocID()
    {
        return legAllocIDLength > 0;
    }

    public MutableDirectBuffer legAllocID()
    {
        return legAllocID;
    }

    public String legAllocIDAsString()
    {
        return legAllocID.getStringWithoutLengthAscii(legAllocIDOffset, legAllocIDLength);
    }

    public LegsGroupEncoder legAllocID(final CharSequence value)
    {
        toBytes(value, legAllocID);
        legAllocIDOffset = 0;
        legAllocIDLength = value.length();
        return this;
    }

    public LegsGroupEncoder legAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legAllocID.wrap(buffer);
            legAllocIDOffset = value.offset();
            legAllocIDLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legAllocID(final char[] value)
    {
        return legAllocID(value, 0, value.length);
    }

    public LegsGroupEncoder legAllocID(final char[] value, final int length)
    {
        return legAllocID(value, 0, length);
    }

    public LegsGroupEncoder legAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legAllocID, offset, length);
        legAllocIDOffset = 0;
        legAllocIDLength = length;
        return this;
    }

    private final LegPreAllocGrpEncoder legPreAllocGrp = new LegPreAllocGrpEncoder();
    public LegPreAllocGrpEncoder legPreAllocGrp()
    {
        return legPreAllocGrp;
    }

    private char legPositionEffect;

    private boolean hasLegPositionEffect;

    public boolean hasLegPositionEffect()
    {
        return hasLegPositionEffect;
    }

    public LegsGroupEncoder legPositionEffect(char value)
    {
        legPositionEffect = value;
        hasLegPositionEffect = true;
        return this;
    }

    public char legPositionEffect()
    {
        return legPositionEffect;
    }

    private int legCoveredOrUncovered;

    private boolean hasLegCoveredOrUncovered;

    public boolean hasLegCoveredOrUncovered()
    {
        return hasLegCoveredOrUncovered;
    }

    public LegsGroupEncoder legCoveredOrUncovered(int value)
    {
        legCoveredOrUncovered = value;
        hasLegCoveredOrUncovered = true;
        return this;
    }

    public int legCoveredOrUncovered()
    {
        return legCoveredOrUncovered;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private final MutableDirectBuffer legRefID = new UnsafeBuffer();

    private int legRefIDOffset = 0;

    private int legRefIDLength = 0;

    public LegsGroupEncoder legRefID(final DirectBuffer value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefID(final DirectBuffer value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final DirectBuffer value)
    {
        return legRefID(value, 0, value.capacity());
    }

    public LegsGroupEncoder legRefID(final byte[] value, final int offset, final int length)
    {
        legRefID.wrap(value);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legRefID, value, offset, length);
        legRefIDOffset = offset;
        legRefIDLength = length;
        return this;
    }

    public LegsGroupEncoder legRefID(final byte[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final byte[] value)
    {
        return legRefID(value, 0, value.length);
    }

    public boolean hasLegRefID()
    {
        return legRefIDLength > 0;
    }

    public MutableDirectBuffer legRefID()
    {
        return legRefID;
    }

    public String legRefIDAsString()
    {
        return legRefID.getStringWithoutLengthAscii(legRefIDOffset, legRefIDLength);
    }

    public LegsGroupEncoder legRefID(final CharSequence value)
    {
        toBytes(value, legRefID);
        legRefIDOffset = 0;
        legRefIDLength = value.length();
        return this;
    }

    public LegsGroupEncoder legRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legRefID.wrap(buffer);
            legRefIDOffset = value.offset();
            legRefIDLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legRefID(final char[] value)
    {
        return legRefID(value, 0, value.length);
    }

    public LegsGroupEncoder legRefID(final char[] value, final int length)
    {
        return legRefID(value, 0, length);
    }

    public LegsGroupEncoder legRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legRefID, offset, length);
        legRefIDOffset = 0;
        legRefIDLength = length;
        return this;
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

    private final MutableDirectBuffer legSettlDate = new UnsafeBuffer();

    private int legSettlDateOffset = 0;

    private int legSettlDateLength = 0;

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final DirectBuffer value)
    {
        return legSettlDate(value, 0, value.capacity());
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int offset, final int length)
    {
        legSettlDate.wrap(value);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSettlDate, value, offset, length);
        legSettlDateOffset = offset;
        legSettlDateLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlDate(final byte[] value, final int length)
    {
        return legSettlDate(value, 0, length);
    }

    public LegsGroupEncoder legSettlDate(final byte[] value)
    {
        return legSettlDate(value, 0, value.length);
    }

    public boolean hasLegSettlDate()
    {
        return legSettlDateLength > 0;
    }

    public MutableDirectBuffer legSettlDate()
    {
        return legSettlDate;
    }

    public String legSettlDateAsString()
    {
        return legSettlDate.getStringWithoutLengthAscii(legSettlDateOffset, legSettlDateLength);
    }

    private final MutableDirectBuffer legSettlCurrency = new UnsafeBuffer();

    private int legSettlCurrencyOffset = 0;

    private int legSettlCurrencyLength = 0;

    public LegsGroupEncoder legSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        legSettlCurrency.wrap(value);
        legSettlCurrencyOffset = offset;
        legSettlCurrencyLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlCurrency(final DirectBuffer value, final int length)
    {
        return legSettlCurrency(value, 0, length);
    }

    public LegsGroupEncoder legSettlCurrency(final DirectBuffer value)
    {
        return legSettlCurrency(value, 0, value.capacity());
    }

    public LegsGroupEncoder legSettlCurrency(final byte[] value, final int offset, final int length)
    {
        legSettlCurrency.wrap(value);
        legSettlCurrencyOffset = offset;
        legSettlCurrencyLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legSettlCurrency, value, offset, length);
        legSettlCurrencyOffset = offset;
        legSettlCurrencyLength = length;
        return this;
    }

    public LegsGroupEncoder legSettlCurrency(final byte[] value, final int length)
    {
        return legSettlCurrency(value, 0, length);
    }

    public LegsGroupEncoder legSettlCurrency(final byte[] value)
    {
        return legSettlCurrency(value, 0, value.length);
    }

    public boolean hasLegSettlCurrency()
    {
        return legSettlCurrencyLength > 0;
    }

    public MutableDirectBuffer legSettlCurrency()
    {
        return legSettlCurrency;
    }

    public String legSettlCurrencyAsString()
    {
        return legSettlCurrency.getStringWithoutLengthAscii(legSettlCurrencyOffset, legSettlCurrencyLength);
    }

    public LegsGroupEncoder legSettlCurrency(final CharSequence value)
    {
        toBytes(value, legSettlCurrency);
        legSettlCurrencyOffset = 0;
        legSettlCurrencyLength = value.length();
        return this;
    }

    public LegsGroupEncoder legSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legSettlCurrency.wrap(buffer);
            legSettlCurrencyOffset = value.offset();
            legSettlCurrencyLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legSettlCurrency(final char[] value)
    {
        return legSettlCurrency(value, 0, value.length);
    }

    public LegsGroupEncoder legSettlCurrency(final char[] value, final int length)
    {
        return legSettlCurrency(value, 0, length);
    }

    public LegsGroupEncoder legSettlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, legSettlCurrency, offset, length);
        legSettlCurrencyOffset = 0;
        legSettlCurrencyLength = length;
        return this;
    }

    private final DecimalFloat legOrderQty = new DecimalFloat();

    private boolean hasLegOrderQty;

    public boolean hasLegOrderQty()
    {
        return hasLegOrderQty;
    }

    public LegsGroupEncoder legOrderQty(DecimalFloat value)
    {
        legOrderQty.set(value);
        hasLegOrderQty = true;
        return this;
    }

    public LegsGroupEncoder legOrderQty(long value, int scale)
    {
        legOrderQty.set(value, scale);
        hasLegOrderQty = true;
        return this;
    }

    public DecimalFloat legOrderQty()
    {
        return legOrderQty;
    }

    private final DecimalFloat legVolatility = new DecimalFloat();

    private boolean hasLegVolatility;

    public boolean hasLegVolatility()
    {
        return hasLegVolatility;
    }

    public LegsGroupEncoder legVolatility(DecimalFloat value)
    {
        legVolatility.set(value);
        hasLegVolatility = true;
        return this;
    }

    public LegsGroupEncoder legVolatility(long value, int scale)
    {
        legVolatility.set(value, scale);
        hasLegVolatility = true;
        return this;
    }

    public DecimalFloat legVolatility()
    {
        return legVolatility;
    }

    private final DecimalFloat legDividendYield = new DecimalFloat();

    private boolean hasLegDividendYield;

    public boolean hasLegDividendYield()
    {
        return hasLegDividendYield;
    }

    public LegsGroupEncoder legDividendYield(DecimalFloat value)
    {
        legDividendYield.set(value);
        hasLegDividendYield = true;
        return this;
    }

    public LegsGroupEncoder legDividendYield(long value, int scale)
    {
        legDividendYield.set(value, scale);
        hasLegDividendYield = true;
        return this;
    }

    public DecimalFloat legDividendYield()
    {
        return legDividendYield;
    }

    private final DecimalFloat legCurrencyRatio = new DecimalFloat();

    private boolean hasLegCurrencyRatio;

    public boolean hasLegCurrencyRatio()
    {
        return hasLegCurrencyRatio;
    }

    public LegsGroupEncoder legCurrencyRatio(DecimalFloat value)
    {
        legCurrencyRatio.set(value);
        hasLegCurrencyRatio = true;
        return this;
    }

    public LegsGroupEncoder legCurrencyRatio(long value, int scale)
    {
        legCurrencyRatio.set(value, scale);
        hasLegCurrencyRatio = true;
        return this;
    }

    public DecimalFloat legCurrencyRatio()
    {
        return legCurrencyRatio;
    }

    private final MutableDirectBuffer legExecInst = new UnsafeBuffer();

    private int legExecInstOffset = 0;

    private int legExecInstLength = 0;

    public LegsGroupEncoder legExecInst(final DirectBuffer value, final int offset, final int length)
    {
        legExecInst.wrap(value);
        legExecInstOffset = offset;
        legExecInstLength = length;
        return this;
    }

    public LegsGroupEncoder legExecInst(final DirectBuffer value, final int length)
    {
        return legExecInst(value, 0, length);
    }

    public LegsGroupEncoder legExecInst(final DirectBuffer value)
    {
        return legExecInst(value, 0, value.capacity());
    }

    public LegsGroupEncoder legExecInst(final byte[] value, final int offset, final int length)
    {
        legExecInst.wrap(value);
        legExecInstOffset = offset;
        legExecInstLength = length;
        return this;
    }

    public LegsGroupEncoder legExecInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legExecInst, value, offset, length);
        legExecInstOffset = offset;
        legExecInstLength = length;
        return this;
    }

    public LegsGroupEncoder legExecInst(final byte[] value, final int length)
    {
        return legExecInst(value, 0, length);
    }

    public LegsGroupEncoder legExecInst(final byte[] value)
    {
        return legExecInst(value, 0, value.length);
    }

    public boolean hasLegExecInst()
    {
        return legExecInstLength > 0;
    }

    public MutableDirectBuffer legExecInst()
    {
        return legExecInst;
    }

    public String legExecInstAsString()
    {
        return legExecInst.getStringWithoutLengthAscii(legExecInstOffset, legExecInstLength);
    }

    public LegsGroupEncoder legExecInst(final CharSequence value)
    {
        toBytes(value, legExecInst);
        legExecInstOffset = 0;
        legExecInstLength = value.length();
        return this;
    }

    public LegsGroupEncoder legExecInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legExecInst.wrap(buffer);
            legExecInstOffset = value.offset();
            legExecInstLength = value.length();
        }
        return this;
    }

    public LegsGroupEncoder legExecInst(final char[] value)
    {
        return legExecInst(value, 0, value.length);
    }

    public LegsGroupEncoder legExecInst(final char[] value, final int length)
    {
        return legExecInst(value, 0, length);
    }

    public LegsGroupEncoder legExecInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, legExecInst, offset, length);
        legExecInstOffset = 0;
        legExecInstLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);

        if (hasLegQty)
        {
            buffer.putBytes(position, legQtyHeader, 0, legQtyHeaderLength);
            position += legQtyHeaderLength;
            position += buffer.putFloatAscii(position, legQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegSwapType)
        {
            buffer.putBytes(position, legSwapTypeHeader, 0, legSwapTypeHeaderLength);
            position += legSwapTypeHeaderLength;
            position += buffer.putIntAscii(position, legSwapType);
            buffer.putSeparator(position);
            position++;
        }

            position += legStipulations.encode(buffer, position);

        if (legAllocIDLength > 0)
        {
            buffer.putBytes(position, legAllocIDHeader, 0, legAllocIDHeaderLength);
            position += legAllocIDHeaderLength;
            buffer.putBytes(position, legAllocID, legAllocIDOffset, legAllocIDLength);
            position += legAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += legPreAllocGrp.encode(buffer, position);

        if (hasLegPositionEffect)
        {
            buffer.putBytes(position, legPositionEffectHeader, 0, legPositionEffectHeaderLength);
            position += legPositionEffectHeaderLength;
            position += buffer.putCharAscii(position, legPositionEffect);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegCoveredOrUncovered)
        {
            buffer.putBytes(position, legCoveredOrUncoveredHeader, 0, legCoveredOrUncoveredHeaderLength);
            position += legCoveredOrUncoveredHeaderLength;
            position += buffer.putIntAscii(position, legCoveredOrUncovered);
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);

        if (legRefIDLength > 0)
        {
            buffer.putBytes(position, legRefIDHeader, 0, legRefIDHeaderLength);
            position += legRefIDHeaderLength;
            buffer.putBytes(position, legRefID, legRefIDOffset, legRefIDLength);
            position += legRefIDLength;
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

        if (legSettlDateLength > 0)
        {
            buffer.putBytes(position, legSettlDateHeader, 0, legSettlDateHeaderLength);
            position += legSettlDateHeaderLength;
            buffer.putBytes(position, legSettlDate, legSettlDateOffset, legSettlDateLength);
            position += legSettlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, legSettlCurrencyHeader, 0, legSettlCurrencyHeaderLength);
            position += legSettlCurrencyHeaderLength;
            buffer.putBytes(position, legSettlCurrency, legSettlCurrencyOffset, legSettlCurrencyLength);
            position += legSettlCurrencyLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOrderQty)
        {
            buffer.putBytes(position, legOrderQtyHeader, 0, legOrderQtyHeaderLength);
            position += legOrderQtyHeaderLength;
            position += buffer.putFloatAscii(position, legOrderQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegVolatility)
        {
            buffer.putBytes(position, legVolatilityHeader, 0, legVolatilityHeaderLength);
            position += legVolatilityHeaderLength;
            position += buffer.putFloatAscii(position, legVolatility);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegDividendYield)
        {
            buffer.putBytes(position, legDividendYieldHeader, 0, legDividendYieldHeaderLength);
            position += legDividendYieldHeaderLength;
            position += buffer.putFloatAscii(position, legDividendYield);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegCurrencyRatio)
        {
            buffer.putBytes(position, legCurrencyRatioHeader, 0, legCurrencyRatioHeaderLength);
            position += legCurrencyRatioHeaderLength;
            position += buffer.putFloatAscii(position, legCurrencyRatio);
            buffer.putSeparator(position);
            position++;
        }

        if (legExecInstLength > 0)
        {
            buffer.putBytes(position, legExecInstHeader, 0, legExecInstHeaderLength);
            position += legExecInstHeaderLength;
            buffer.putBytes(position, legExecInst, legExecInstOffset, legExecInstLength);
            position += legExecInstLength;
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
        this.resetLegQty();
        this.resetLegSwapType();
        this.resetLegAllocID();
        this.resetLegPositionEffect();
        this.resetLegCoveredOrUncovered();
        this.resetLegRefID();
        this.resetLegSettlType();
        this.resetLegSettlDate();
        this.resetLegSettlCurrency();
        this.resetLegOrderQty();
        this.resetLegVolatility();
        this.resetLegDividendYield();
        this.resetLegCurrencyRatio();
        this.resetLegExecInst();
        instrumentLeg.reset();
        legStipulations.reset();
        legPreAllocGrp.reset();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegQty()
    {
        hasLegQty = false;
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegAllocID()
    {
        legAllocIDLength = 0;
    }

    public void resetLegPositionEffect()
    {
        hasLegPositionEffect = false;
    }

    public void resetLegCoveredOrUncovered()
    {
        hasLegCoveredOrUncovered = false;
    }

    public void resetLegRefID()
    {
        legRefIDLength = 0;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
    }

    public void resetLegSettlDate()
    {
        legSettlDateLength = 0;
    }

    public void resetLegSettlCurrency()
    {
        legSettlCurrencyLength = 0;
    }

    public void resetLegOrderQty()
    {
        hasLegOrderQty = false;
    }

    public void resetLegVolatility()
    {
        hasLegVolatility = false;
    }

    public void resetLegDividendYield()
    {
        hasLegDividendYield = false;
    }

    public void resetLegCurrencyRatio()
    {
        hasLegCurrencyRatio = false;
    }

    public void resetLegExecInst()
    {
        legExecInstLength = 0;
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

        if (hasLegQty())
        {
            indent(builder, level);
            builder.append("\"LegQty\": \"");
            legQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegSwapType())
        {
            indent(builder, level);
            builder.append("\"LegSwapType\": \"");
            builder.append(legSwapType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegAllocID())
        {
            indent(builder, level);
            builder.append("\"LegAllocID\": \"");
            appendBuffer(builder, legAllocID, legAllocIDOffset, legAllocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegPreAllocGrp\": ");
    legPreAllocGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegPositionEffect())
        {
            indent(builder, level);
            builder.append("\"LegPositionEffect\": \"");
            builder.append(legPositionEffect);
            builder.append("\",\n");
        }

        if (hasLegCoveredOrUncovered())
        {
            indent(builder, level);
            builder.append("\"LegCoveredOrUncovered\": \"");
            builder.append(legCoveredOrUncovered);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegRefID())
        {
            indent(builder, level);
            builder.append("\"LegRefID\": \"");
            appendBuffer(builder, legRefID, legRefIDOffset, legRefIDLength);
            builder.append("\",\n");
        }

        if (hasLegSettlType())
        {
            indent(builder, level);
            builder.append("\"LegSettlType\": \"");
            builder.append(legSettlType);
            builder.append("\",\n");
        }

        if (hasLegSettlDate())
        {
            indent(builder, level);
            builder.append("\"LegSettlDate\": \"");
            appendBuffer(builder, legSettlDate, legSettlDateOffset, legSettlDateLength);
            builder.append("\",\n");
        }

        if (hasLegSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"LegSettlCurrency\": \"");
            appendBuffer(builder, legSettlCurrency, legSettlCurrencyOffset, legSettlCurrencyLength);
            builder.append("\",\n");
        }

        if (hasLegOrderQty())
        {
            indent(builder, level);
            builder.append("\"LegOrderQty\": \"");
            legOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegVolatility())
        {
            indent(builder, level);
            builder.append("\"LegVolatility\": \"");
            legVolatility.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegDividendYield())
        {
            indent(builder, level);
            builder.append("\"LegDividendYield\": \"");
            legDividendYield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegCurrencyRatio())
        {
            indent(builder, level);
            builder.append("\"LegCurrencyRatio\": \"");
            legCurrencyRatio.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegExecInst())
        {
            indent(builder, level);
            builder.append("\"LegExecInst\": \"");
            appendBuffer(builder, legExecInst, legExecInstOffset, legExecInstLength);
            builder.append("\",\n");
        }
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
        if (hasLegQty())
        {
            encoder.legQty(this.legQty());
        }

        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }


        legStipulations.copyTo(encoder.legStipulations());
        if (hasLegAllocID())
        {
            encoder.legAllocIDAsCopy(legAllocID.byteArray(), 0, legAllocIDLength);
        }


        legPreAllocGrp.copyTo(encoder.legPreAllocGrp());
        if (hasLegPositionEffect())
        {
            encoder.legPositionEffect(this.legPositionEffect());
        }

        if (hasLegCoveredOrUncovered())
        {
            encoder.legCoveredOrUncovered(this.legCoveredOrUncovered());
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasLegRefID())
        {
            encoder.legRefIDAsCopy(legRefID.byteArray(), 0, legRefIDLength);
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }

        if (hasLegSettlDate())
        {
            encoder.legSettlDateAsCopy(legSettlDate.byteArray(), 0, legSettlDateLength);
        }

        if (hasLegSettlCurrency())
        {
            encoder.legSettlCurrencyAsCopy(legSettlCurrency.byteArray(), 0, legSettlCurrencyLength);
        }

        if (hasLegOrderQty())
        {
            encoder.legOrderQty(this.legOrderQty());
        }

        if (hasLegVolatility())
        {
            encoder.legVolatility(this.legVolatility());
        }

        if (hasLegDividendYield())
        {
            encoder.legDividendYield(this.legDividendYield());
        }

        if (hasLegCurrencyRatio())
        {
            encoder.legCurrencyRatio(this.legCurrencyRatio());
        }

        if (hasLegExecInst())
        {
            encoder.legExecInstAsCopy(legExecInst.byteArray(), 0, legExecInstLength);
        }
        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public LegOrdGrpEncoder noLegsGroupCounter(int value)
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

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

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

        return position - offset;
    }

    public void reset()
    {
        this.resetLegsGroup();
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
        builder.append("\"MessageName\": \"LegOrdGrp\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegOrdGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegOrdGrpEncoder)encoder);
    }

    public LegOrdGrpEncoder copyTo(final LegOrdGrpEncoder encoder)
    {
        encoder.reset();
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
        return encoder;
    }

}
