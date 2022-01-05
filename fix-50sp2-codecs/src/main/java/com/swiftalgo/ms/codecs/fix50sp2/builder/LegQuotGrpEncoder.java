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


public class LegQuotGrpEncoder
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

    private static final int legOrderQtyHeaderLength = 4;
    private static final byte[] legOrderQtyHeader = new byte[] {54, 56, 53, (byte) '='};

    private static final int legSwapTypeHeaderLength = 4;
    private static final byte[] legSwapTypeHeader = new byte[] {54, 57, 48, (byte) '='};

    private static final int legSettlTypeHeaderLength = 4;
    private static final byte[] legSettlTypeHeader = new byte[] {53, 56, 55, (byte) '='};

    private static final int legSettlDateHeaderLength = 4;
    private static final byte[] legSettlDateHeader = new byte[] {53, 56, 56, (byte) '='};

    private static final int legPriceTypeHeaderLength = 4;
    private static final byte[] legPriceTypeHeader = new byte[] {54, 56, 54, (byte) '='};

    private static final int legBidPxHeaderLength = 4;
    private static final byte[] legBidPxHeader = new byte[] {54, 56, 49, (byte) '='};

    private static final int legOfferPxHeaderLength = 4;
    private static final byte[] legOfferPxHeader = new byte[] {54, 56, 52, (byte) '='};

    private static final int legRefIDHeaderLength = 4;
    private static final byte[] legRefIDHeader = new byte[] {54, 53, 52, (byte) '='};

    private static final int legBidForwardPointsHeaderLength = 5;
    private static final byte[] legBidForwardPointsHeader = new byte[] {49, 48, 54, 55, (byte) '='};

    private static final int legOfferForwardPointsHeaderLength = 5;
    private static final byte[] legOfferForwardPointsHeader = new byte[] {49, 48, 54, 56, (byte) '='};

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

    private final LegStipulationsEncoder legStipulations = new LegStipulationsEncoder();
    public LegStipulationsEncoder legStipulations()
    {
        return legStipulations;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private int legPriceType;

    private boolean hasLegPriceType;

    public boolean hasLegPriceType()
    {
        return hasLegPriceType;
    }

    public LegsGroupEncoder legPriceType(int value)
    {
        legPriceType = value;
        hasLegPriceType = true;
        return this;
    }

    public int legPriceType()
    {
        return legPriceType;
    }

    private final DecimalFloat legBidPx = new DecimalFloat();

    private boolean hasLegBidPx;

    public boolean hasLegBidPx()
    {
        return hasLegBidPx;
    }

    public LegsGroupEncoder legBidPx(DecimalFloat value)
    {
        legBidPx.set(value);
        hasLegBidPx = true;
        return this;
    }

    public LegsGroupEncoder legBidPx(long value, int scale)
    {
        legBidPx.set(value, scale);
        hasLegBidPx = true;
        return this;
    }

    public DecimalFloat legBidPx()
    {
        return legBidPx;
    }

    private final DecimalFloat legOfferPx = new DecimalFloat();

    private boolean hasLegOfferPx;

    public boolean hasLegOfferPx()
    {
        return hasLegOfferPx;
    }

    public LegsGroupEncoder legOfferPx(DecimalFloat value)
    {
        legOfferPx.set(value);
        hasLegOfferPx = true;
        return this;
    }

    public LegsGroupEncoder legOfferPx(long value, int scale)
    {
        legOfferPx.set(value, scale);
        hasLegOfferPx = true;
        return this;
    }

    public DecimalFloat legOfferPx()
    {
        return legOfferPx;
    }

    private final LegBenchmarkCurveDataEncoder legBenchmarkCurveData = new LegBenchmarkCurveDataEncoder();
    public LegBenchmarkCurveDataEncoder legBenchmarkCurveData()
    {
        return legBenchmarkCurveData;
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

    private final DecimalFloat legBidForwardPoints = new DecimalFloat();

    private boolean hasLegBidForwardPoints;

    public boolean hasLegBidForwardPoints()
    {
        return hasLegBidForwardPoints;
    }

    public LegsGroupEncoder legBidForwardPoints(DecimalFloat value)
    {
        legBidForwardPoints.set(value);
        hasLegBidForwardPoints = true;
        return this;
    }

    public LegsGroupEncoder legBidForwardPoints(long value, int scale)
    {
        legBidForwardPoints.set(value, scale);
        hasLegBidForwardPoints = true;
        return this;
    }

    public DecimalFloat legBidForwardPoints()
    {
        return legBidForwardPoints;
    }

    private final DecimalFloat legOfferForwardPoints = new DecimalFloat();

    private boolean hasLegOfferForwardPoints;

    public boolean hasLegOfferForwardPoints()
    {
        return hasLegOfferForwardPoints;
    }

    public LegsGroupEncoder legOfferForwardPoints(DecimalFloat value)
    {
        legOfferForwardPoints.set(value);
        hasLegOfferForwardPoints = true;
        return this;
    }

    public LegsGroupEncoder legOfferForwardPoints(long value, int scale)
    {
        legOfferForwardPoints.set(value, scale);
        hasLegOfferForwardPoints = true;
        return this;
    }

    public DecimalFloat legOfferForwardPoints()
    {
        return legOfferForwardPoints;
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

        if (hasLegOrderQty)
        {
            buffer.putBytes(position, legOrderQtyHeader, 0, legOrderQtyHeaderLength);
            position += legOrderQtyHeaderLength;
            position += buffer.putFloatAscii(position, legOrderQty);
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

            position += legStipulations.encode(buffer, position);

            position += nestedParties.encode(buffer, position);

        if (hasLegPriceType)
        {
            buffer.putBytes(position, legPriceTypeHeader, 0, legPriceTypeHeaderLength);
            position += legPriceTypeHeaderLength;
            position += buffer.putIntAscii(position, legPriceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegBidPx)
        {
            buffer.putBytes(position, legBidPxHeader, 0, legBidPxHeaderLength);
            position += legBidPxHeaderLength;
            position += buffer.putFloatAscii(position, legBidPx);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOfferPx)
        {
            buffer.putBytes(position, legOfferPxHeader, 0, legOfferPxHeaderLength);
            position += legOfferPxHeaderLength;
            position += buffer.putFloatAscii(position, legOfferPx);
            buffer.putSeparator(position);
            position++;
        }

            position += legBenchmarkCurveData.encode(buffer, position);

        if (legRefIDLength > 0)
        {
            buffer.putBytes(position, legRefIDHeader, 0, legRefIDHeaderLength);
            position += legRefIDHeaderLength;
            buffer.putBytes(position, legRefID, legRefIDOffset, legRefIDLength);
            position += legRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegBidForwardPoints)
        {
            buffer.putBytes(position, legBidForwardPointsHeader, 0, legBidForwardPointsHeaderLength);
            position += legBidForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, legBidForwardPoints);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLegOfferForwardPoints)
        {
            buffer.putBytes(position, legOfferForwardPointsHeader, 0, legOfferForwardPointsHeaderLength);
            position += legOfferForwardPointsHeaderLength;
            position += buffer.putFloatAscii(position, legOfferForwardPoints);
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
        this.resetLegOrderQty();
        this.resetLegSwapType();
        this.resetLegSettlType();
        this.resetLegSettlDate();
        this.resetLegPriceType();
        this.resetLegBidPx();
        this.resetLegOfferPx();
        this.resetLegRefID();
        this.resetLegBidForwardPoints();
        this.resetLegOfferForwardPoints();
        instrumentLeg.reset();
        legStipulations.reset();
        nestedParties.reset();
        legBenchmarkCurveData.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegQty()
    {
        hasLegQty = false;
    }

    public void resetLegOrderQty()
    {
        hasLegOrderQty = false;
    }

    public void resetLegSwapType()
    {
        hasLegSwapType = false;
    }

    public void resetLegSettlType()
    {
        hasLegSettlType = false;
    }

    public void resetLegSettlDate()
    {
        legSettlDateLength = 0;
    }

    public void resetLegPriceType()
    {
        hasLegPriceType = false;
    }

    public void resetLegBidPx()
    {
        hasLegBidPx = false;
    }

    public void resetLegOfferPx()
    {
        hasLegOfferPx = false;
    }

    public void resetLegRefID()
    {
        legRefIDLength = 0;
    }

    public void resetLegBidForwardPoints()
    {
        hasLegBidForwardPoints = false;
    }

    public void resetLegOfferForwardPoints()
    {
        hasLegOfferForwardPoints = false;
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

        if (hasLegOrderQty())
        {
            indent(builder, level);
            builder.append("\"LegOrderQty\": \"");
            legOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

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

        if (hasLegSettlDate())
        {
            indent(builder, level);
            builder.append("\"LegSettlDate\": \"");
            appendBuffer(builder, legSettlDate, legSettlDateOffset, legSettlDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegStipulations\": ");
    legStipulations.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegPriceType())
        {
            indent(builder, level);
            builder.append("\"LegPriceType\": \"");
            builder.append(legPriceType);
            builder.append("\",\n");
        }

        if (hasLegBidPx())
        {
            indent(builder, level);
            builder.append("\"LegBidPx\": \"");
            legBidPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegOfferPx())
        {
            indent(builder, level);
            builder.append("\"LegOfferPx\": \"");
            legOfferPx.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"LegBenchmarkCurveData\": ");
    legBenchmarkCurveData.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegRefID())
        {
            indent(builder, level);
            builder.append("\"LegRefID\": \"");
            appendBuffer(builder, legRefID, legRefIDOffset, legRefIDLength);
            builder.append("\",\n");
        }

        if (hasLegBidForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LegBidForwardPoints\": \"");
            legBidForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegOfferForwardPoints())
        {
            indent(builder, level);
            builder.append("\"LegOfferForwardPoints\": \"");
            legOfferForwardPoints.appendTo(builder);
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

        if (hasLegOrderQty())
        {
            encoder.legOrderQty(this.legOrderQty());
        }

        if (hasLegSwapType())
        {
            encoder.legSwapType(this.legSwapType());
        }

        if (hasLegSettlType())
        {
            encoder.legSettlType(this.legSettlType());
        }

        if (hasLegSettlDate())
        {
            encoder.legSettlDateAsCopy(legSettlDate.byteArray(), 0, legSettlDateLength);
        }


        legStipulations.copyTo(encoder.legStipulations());

        nestedParties.copyTo(encoder.nestedParties());
        if (hasLegPriceType())
        {
            encoder.legPriceType(this.legPriceType());
        }

        if (hasLegBidPx())
        {
            encoder.legBidPx(this.legBidPx());
        }

        if (hasLegOfferPx())
        {
            encoder.legOfferPx(this.legOfferPx());
        }


        legBenchmarkCurveData.copyTo(encoder.legBenchmarkCurveData());
        if (hasLegRefID())
        {
            encoder.legRefIDAsCopy(legRefID.byteArray(), 0, legRefIDLength);
        }

        if (hasLegBidForwardPoints())
        {
            encoder.legBidForwardPoints(this.legBidForwardPoints());
        }

        if (hasLegOfferForwardPoints())
        {
            encoder.legOfferForwardPoints(this.legOfferForwardPoints());
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

    public LegQuotGrpEncoder noLegsGroupCounter(int value)
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
        builder.append("\"MessageName\": \"LegQuotGrp\",\n");
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
    public LegQuotGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegQuotGrpEncoder)encoder);
    }

    public LegQuotGrpEncoder copyTo(final LegQuotGrpEncoder encoder)
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
