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


public class BidDescReqGrpEncoder
{
    private static final int noBidDescriptorsGroupCounterHeaderLength = 4;
    private static final byte[] noBidDescriptorsGroupCounterHeader = new byte[] {51, 57, 56, (byte) '='};



public static class BidDescriptorsGroupEncoder
{
    private BidDescriptorsGroupEncoder next = null;

    public BidDescriptorsGroupEncoder next()
    {
        if (next == null)
        {
            next = new BidDescriptorsGroupEncoder();
        }
        return next;
    }

    private static final int bidDescriptorTypeHeaderLength = 4;
    private static final byte[] bidDescriptorTypeHeader = new byte[] {51, 57, 57, (byte) '='};

    private static final int bidDescriptorHeaderLength = 4;
    private static final byte[] bidDescriptorHeader = new byte[] {52, 48, 48, (byte) '='};

    private static final int sideValueIndHeaderLength = 4;
    private static final byte[] sideValueIndHeader = new byte[] {52, 48, 49, (byte) '='};

    private static final int liquidityValueHeaderLength = 4;
    private static final byte[] liquidityValueHeader = new byte[] {52, 48, 52, (byte) '='};

    private static final int liquidityNumSecuritiesHeaderLength = 4;
    private static final byte[] liquidityNumSecuritiesHeader = new byte[] {52, 52, 49, (byte) '='};

    private static final int liquidityPctLowHeaderLength = 4;
    private static final byte[] liquidityPctLowHeader = new byte[] {52, 48, 50, (byte) '='};

    private static final int liquidityPctHighHeaderLength = 4;
    private static final byte[] liquidityPctHighHeader = new byte[] {52, 48, 51, (byte) '='};

    private static final int eFPTrackingErrorHeaderLength = 4;
    private static final byte[] eFPTrackingErrorHeader = new byte[] {52, 48, 53, (byte) '='};

    private static final int fairValueHeaderLength = 4;
    private static final byte[] fairValueHeader = new byte[] {52, 48, 54, (byte) '='};

    private static final int outsideIndexPctHeaderLength = 4;
    private static final byte[] outsideIndexPctHeader = new byte[] {52, 48, 55, (byte) '='};

    private static final int valueOfFuturesHeaderLength = 4;
    private static final byte[] valueOfFuturesHeader = new byte[] {52, 48, 56, (byte) '='};

    private int bidDescriptorType;

    private boolean hasBidDescriptorType;

    public boolean hasBidDescriptorType()
    {
        return hasBidDescriptorType;
    }

    public BidDescriptorsGroupEncoder bidDescriptorType(int value)
    {
        bidDescriptorType = value;
        hasBidDescriptorType = true;
        return this;
    }

    public int bidDescriptorType()
    {
        return bidDescriptorType;
    }

    public BidDescriptorsGroupEncoder bidDescriptorType(BidDescriptorType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == BidDescriptorType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: bidDescriptorType Value: " + value );
            }
            if (value == BidDescriptorType.NULL_VAL)
            {
                return this;
            }
        }
        return bidDescriptorType(value.representation());
    }

    private final MutableDirectBuffer bidDescriptor = new UnsafeBuffer();

    private int bidDescriptorOffset = 0;

    private int bidDescriptorLength = 0;

    public BidDescriptorsGroupEncoder bidDescriptor(final DirectBuffer value, final int offset, final int length)
    {
        bidDescriptor.wrap(value);
        bidDescriptorOffset = offset;
        bidDescriptorLength = length;
        return this;
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final DirectBuffer value, final int length)
    {
        return bidDescriptor(value, 0, length);
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final DirectBuffer value)
    {
        return bidDescriptor(value, 0, value.capacity());
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final byte[] value, final int offset, final int length)
    {
        bidDescriptor.wrap(value);
        bidDescriptorOffset = offset;
        bidDescriptorLength = length;
        return this;
    }

    public BidDescriptorsGroupEncoder bidDescriptorAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(bidDescriptor, value, offset, length);
        bidDescriptorOffset = offset;
        bidDescriptorLength = length;
        return this;
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final byte[] value, final int length)
    {
        return bidDescriptor(value, 0, length);
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final byte[] value)
    {
        return bidDescriptor(value, 0, value.length);
    }

    public boolean hasBidDescriptor()
    {
        return bidDescriptorLength > 0;
    }

    public MutableDirectBuffer bidDescriptor()
    {
        return bidDescriptor;
    }

    public String bidDescriptorAsString()
    {
        return bidDescriptor.getStringWithoutLengthAscii(bidDescriptorOffset, bidDescriptorLength);
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final CharSequence value)
    {
        toBytes(value, bidDescriptor);
        bidDescriptorOffset = 0;
        bidDescriptorLength = value.length();
        return this;
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            bidDescriptor.wrap(buffer);
            bidDescriptorOffset = value.offset();
            bidDescriptorLength = value.length();
        }
        return this;
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final char[] value)
    {
        return bidDescriptor(value, 0, value.length);
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final char[] value, final int length)
    {
        return bidDescriptor(value, 0, length);
    }

    public BidDescriptorsGroupEncoder bidDescriptor(final char[] value, final int offset, final int length)
    {
        toBytes(value, bidDescriptor, offset, length);
        bidDescriptorOffset = 0;
        bidDescriptorLength = length;
        return this;
    }

    private int sideValueInd;

    private boolean hasSideValueInd;

    public boolean hasSideValueInd()
    {
        return hasSideValueInd;
    }

    public BidDescriptorsGroupEncoder sideValueInd(int value)
    {
        sideValueInd = value;
        hasSideValueInd = true;
        return this;
    }

    public int sideValueInd()
    {
        return sideValueInd;
    }

    public BidDescriptorsGroupEncoder sideValueInd(SideValueInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SideValueInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sideValueInd Value: " + value );
            }
            if (value == SideValueInd.NULL_VAL)
            {
                return this;
            }
        }
        return sideValueInd(value.representation());
    }

    private final DecimalFloat liquidityValue = new DecimalFloat();

    private boolean hasLiquidityValue;

    public boolean hasLiquidityValue()
    {
        return hasLiquidityValue;
    }

    public BidDescriptorsGroupEncoder liquidityValue(DecimalFloat value)
    {
        liquidityValue.set(value);
        hasLiquidityValue = true;
        return this;
    }

    public BidDescriptorsGroupEncoder liquidityValue(long value, int scale)
    {
        liquidityValue.set(value, scale);
        hasLiquidityValue = true;
        return this;
    }

    public DecimalFloat liquidityValue()
    {
        return liquidityValue;
    }

    private int liquidityNumSecurities;

    private boolean hasLiquidityNumSecurities;

    public boolean hasLiquidityNumSecurities()
    {
        return hasLiquidityNumSecurities;
    }

    public BidDescriptorsGroupEncoder liquidityNumSecurities(int value)
    {
        liquidityNumSecurities = value;
        hasLiquidityNumSecurities = true;
        return this;
    }

    public int liquidityNumSecurities()
    {
        return liquidityNumSecurities;
    }

    private final DecimalFloat liquidityPctLow = new DecimalFloat();

    private boolean hasLiquidityPctLow;

    public boolean hasLiquidityPctLow()
    {
        return hasLiquidityPctLow;
    }

    public BidDescriptorsGroupEncoder liquidityPctLow(DecimalFloat value)
    {
        liquidityPctLow.set(value);
        hasLiquidityPctLow = true;
        return this;
    }

    public BidDescriptorsGroupEncoder liquidityPctLow(long value, int scale)
    {
        liquidityPctLow.set(value, scale);
        hasLiquidityPctLow = true;
        return this;
    }

    public DecimalFloat liquidityPctLow()
    {
        return liquidityPctLow;
    }

    private final DecimalFloat liquidityPctHigh = new DecimalFloat();

    private boolean hasLiquidityPctHigh;

    public boolean hasLiquidityPctHigh()
    {
        return hasLiquidityPctHigh;
    }

    public BidDescriptorsGroupEncoder liquidityPctHigh(DecimalFloat value)
    {
        liquidityPctHigh.set(value);
        hasLiquidityPctHigh = true;
        return this;
    }

    public BidDescriptorsGroupEncoder liquidityPctHigh(long value, int scale)
    {
        liquidityPctHigh.set(value, scale);
        hasLiquidityPctHigh = true;
        return this;
    }

    public DecimalFloat liquidityPctHigh()
    {
        return liquidityPctHigh;
    }

    private final DecimalFloat eFPTrackingError = new DecimalFloat();

    private boolean hasEFPTrackingError;

    public boolean hasEFPTrackingError()
    {
        return hasEFPTrackingError;
    }

    public BidDescriptorsGroupEncoder eFPTrackingError(DecimalFloat value)
    {
        eFPTrackingError.set(value);
        hasEFPTrackingError = true;
        return this;
    }

    public BidDescriptorsGroupEncoder eFPTrackingError(long value, int scale)
    {
        eFPTrackingError.set(value, scale);
        hasEFPTrackingError = true;
        return this;
    }

    public DecimalFloat eFPTrackingError()
    {
        return eFPTrackingError;
    }

    private final DecimalFloat fairValue = new DecimalFloat();

    private boolean hasFairValue;

    public boolean hasFairValue()
    {
        return hasFairValue;
    }

    public BidDescriptorsGroupEncoder fairValue(DecimalFloat value)
    {
        fairValue.set(value);
        hasFairValue = true;
        return this;
    }

    public BidDescriptorsGroupEncoder fairValue(long value, int scale)
    {
        fairValue.set(value, scale);
        hasFairValue = true;
        return this;
    }

    public DecimalFloat fairValue()
    {
        return fairValue;
    }

    private final DecimalFloat outsideIndexPct = new DecimalFloat();

    private boolean hasOutsideIndexPct;

    public boolean hasOutsideIndexPct()
    {
        return hasOutsideIndexPct;
    }

    public BidDescriptorsGroupEncoder outsideIndexPct(DecimalFloat value)
    {
        outsideIndexPct.set(value);
        hasOutsideIndexPct = true;
        return this;
    }

    public BidDescriptorsGroupEncoder outsideIndexPct(long value, int scale)
    {
        outsideIndexPct.set(value, scale);
        hasOutsideIndexPct = true;
        return this;
    }

    public DecimalFloat outsideIndexPct()
    {
        return outsideIndexPct;
    }

    private final DecimalFloat valueOfFutures = new DecimalFloat();

    private boolean hasValueOfFutures;

    public boolean hasValueOfFutures()
    {
        return hasValueOfFutures;
    }

    public BidDescriptorsGroupEncoder valueOfFutures(DecimalFloat value)
    {
        valueOfFutures.set(value);
        hasValueOfFutures = true;
        return this;
    }

    public BidDescriptorsGroupEncoder valueOfFutures(long value, int scale)
    {
        valueOfFutures.set(value, scale);
        hasValueOfFutures = true;
        return this;
    }

    public DecimalFloat valueOfFutures()
    {
        return valueOfFutures;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasBidDescriptorType)
        {
            buffer.putBytes(position, bidDescriptorTypeHeader, 0, bidDescriptorTypeHeaderLength);
            position += bidDescriptorTypeHeaderLength;
            position += buffer.putIntAscii(position, bidDescriptorType);
            buffer.putSeparator(position);
            position++;
        }

        if (bidDescriptorLength > 0)
        {
            buffer.putBytes(position, bidDescriptorHeader, 0, bidDescriptorHeaderLength);
            position += bidDescriptorHeaderLength;
            buffer.putBytes(position, bidDescriptor, bidDescriptorOffset, bidDescriptorLength);
            position += bidDescriptorLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSideValueInd)
        {
            buffer.putBytes(position, sideValueIndHeader, 0, sideValueIndHeaderLength);
            position += sideValueIndHeaderLength;
            position += buffer.putIntAscii(position, sideValueInd);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLiquidityValue)
        {
            buffer.putBytes(position, liquidityValueHeader, 0, liquidityValueHeaderLength);
            position += liquidityValueHeaderLength;
            position += buffer.putFloatAscii(position, liquidityValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLiquidityNumSecurities)
        {
            buffer.putBytes(position, liquidityNumSecuritiesHeader, 0, liquidityNumSecuritiesHeaderLength);
            position += liquidityNumSecuritiesHeaderLength;
            position += buffer.putIntAscii(position, liquidityNumSecurities);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLiquidityPctLow)
        {
            buffer.putBytes(position, liquidityPctLowHeader, 0, liquidityPctLowHeaderLength);
            position += liquidityPctLowHeaderLength;
            position += buffer.putFloatAscii(position, liquidityPctLow);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLiquidityPctHigh)
        {
            buffer.putBytes(position, liquidityPctHighHeader, 0, liquidityPctHighHeaderLength);
            position += liquidityPctHighHeaderLength;
            position += buffer.putFloatAscii(position, liquidityPctHigh);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEFPTrackingError)
        {
            buffer.putBytes(position, eFPTrackingErrorHeader, 0, eFPTrackingErrorHeaderLength);
            position += eFPTrackingErrorHeaderLength;
            position += buffer.putFloatAscii(position, eFPTrackingError);
            buffer.putSeparator(position);
            position++;
        }

        if (hasFairValue)
        {
            buffer.putBytes(position, fairValueHeader, 0, fairValueHeaderLength);
            position += fairValueHeaderLength;
            position += buffer.putFloatAscii(position, fairValue);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOutsideIndexPct)
        {
            buffer.putBytes(position, outsideIndexPctHeader, 0, outsideIndexPctHeaderLength);
            position += outsideIndexPctHeaderLength;
            position += buffer.putFloatAscii(position, outsideIndexPct);
            buffer.putSeparator(position);
            position++;
        }

        if (hasValueOfFutures)
        {
            buffer.putBytes(position, valueOfFuturesHeader, 0, valueOfFuturesHeaderLength);
            position += valueOfFuturesHeaderLength;
            position += buffer.putFloatAscii(position, valueOfFutures);
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
        this.resetBidDescriptorType();
        this.resetBidDescriptor();
        this.resetSideValueInd();
        this.resetLiquidityValue();
        this.resetLiquidityNumSecurities();
        this.resetLiquidityPctLow();
        this.resetLiquidityPctHigh();
        this.resetEFPTrackingError();
        this.resetFairValue();
        this.resetOutsideIndexPct();
        this.resetValueOfFutures();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetBidDescriptorType()
    {
        hasBidDescriptorType = false;
    }

    public void resetBidDescriptor()
    {
        bidDescriptorLength = 0;
    }

    public void resetSideValueInd()
    {
        hasSideValueInd = false;
    }

    public void resetLiquidityValue()
    {
        hasLiquidityValue = false;
    }

    public void resetLiquidityNumSecurities()
    {
        hasLiquidityNumSecurities = false;
    }

    public void resetLiquidityPctLow()
    {
        hasLiquidityPctLow = false;
    }

    public void resetLiquidityPctHigh()
    {
        hasLiquidityPctHigh = false;
    }

    public void resetEFPTrackingError()
    {
        hasEFPTrackingError = false;
    }

    public void resetFairValue()
    {
        hasFairValue = false;
    }

    public void resetOutsideIndexPct()
    {
        hasOutsideIndexPct = false;
    }

    public void resetValueOfFutures()
    {
        hasValueOfFutures = false;
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
        builder.append("\"MessageName\": \"BidDescriptorsGroup\",\n");
        if (hasBidDescriptorType())
        {
            indent(builder, level);
            builder.append("\"BidDescriptorType\": \"");
            builder.append(bidDescriptorType);
            builder.append("\",\n");
        }

        if (hasBidDescriptor())
        {
            indent(builder, level);
            builder.append("\"BidDescriptor\": \"");
            appendBuffer(builder, bidDescriptor, bidDescriptorOffset, bidDescriptorLength);
            builder.append("\",\n");
        }

        if (hasSideValueInd())
        {
            indent(builder, level);
            builder.append("\"SideValueInd\": \"");
            builder.append(sideValueInd);
            builder.append("\",\n");
        }

        if (hasLiquidityValue())
        {
            indent(builder, level);
            builder.append("\"LiquidityValue\": \"");
            liquidityValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLiquidityNumSecurities())
        {
            indent(builder, level);
            builder.append("\"LiquidityNumSecurities\": \"");
            builder.append(liquidityNumSecurities);
            builder.append("\",\n");
        }

        if (hasLiquidityPctLow())
        {
            indent(builder, level);
            builder.append("\"LiquidityPctLow\": \"");
            liquidityPctLow.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLiquidityPctHigh())
        {
            indent(builder, level);
            builder.append("\"LiquidityPctHigh\": \"");
            liquidityPctHigh.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEFPTrackingError())
        {
            indent(builder, level);
            builder.append("\"EFPTrackingError\": \"");
            eFPTrackingError.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFairValue())
        {
            indent(builder, level);
            builder.append("\"FairValue\": \"");
            fairValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOutsideIndexPct())
        {
            indent(builder, level);
            builder.append("\"OutsideIndexPct\": \"");
            outsideIndexPct.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValueOfFutures())
        {
            indent(builder, level);
            builder.append("\"ValueOfFutures\": \"");
            valueOfFutures.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidDescriptorsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidDescriptorsGroupEncoder)encoder);
    }

    public BidDescriptorsGroupEncoder copyTo(final BidDescriptorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasBidDescriptorType())
        {
            encoder.bidDescriptorType(this.bidDescriptorType());
        }

        if (hasBidDescriptor())
        {
            encoder.bidDescriptorAsCopy(bidDescriptor.byteArray(), 0, bidDescriptorLength);
        }

        if (hasSideValueInd())
        {
            encoder.sideValueInd(this.sideValueInd());
        }

        if (hasLiquidityValue())
        {
            encoder.liquidityValue(this.liquidityValue());
        }

        if (hasLiquidityNumSecurities())
        {
            encoder.liquidityNumSecurities(this.liquidityNumSecurities());
        }

        if (hasLiquidityPctLow())
        {
            encoder.liquidityPctLow(this.liquidityPctLow());
        }

        if (hasLiquidityPctHigh())
        {
            encoder.liquidityPctHigh(this.liquidityPctHigh());
        }

        if (hasEFPTrackingError())
        {
            encoder.eFPTrackingError(this.eFPTrackingError());
        }

        if (hasFairValue())
        {
            encoder.fairValue(this.fairValue());
        }

        if (hasOutsideIndexPct())
        {
            encoder.outsideIndexPct(this.outsideIndexPct());
        }

        if (hasValueOfFutures())
        {
            encoder.valueOfFutures(this.valueOfFutures());
        }
        return encoder;
    }

}
    private int noBidDescriptorsGroupCounter;

    private boolean hasNoBidDescriptorsGroupCounter;

    public boolean hasNoBidDescriptorsGroupCounter()
    {
        return hasNoBidDescriptorsGroupCounter;
    }

    public BidDescReqGrpEncoder noBidDescriptorsGroupCounter(int value)
    {
        noBidDescriptorsGroupCounter = value;
        hasNoBidDescriptorsGroupCounter = true;
        return this;
    }

    public int noBidDescriptorsGroupCounter()
    {
        return noBidDescriptorsGroupCounter;
    }


    private BidDescriptorsGroupEncoder bidDescriptorsGroup = null;

    public BidDescriptorsGroupEncoder bidDescriptorsGroup(final int numberOfElements)
    {
        hasNoBidDescriptorsGroupCounter = true;
        noBidDescriptorsGroupCounter = numberOfElements;
        if (bidDescriptorsGroup == null)
        {
            bidDescriptorsGroup = new BidDescriptorsGroupEncoder();
        }
        return bidDescriptorsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoBidDescriptorsGroupCounter)
        {
            buffer.putBytes(position, noBidDescriptorsGroupCounterHeader, 0, noBidDescriptorsGroupCounterHeaderLength);
            position += noBidDescriptorsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noBidDescriptorsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (bidDescriptorsGroup != null)
        {
            position += bidDescriptorsGroup.encode(buffer, position, noBidDescriptorsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetBidDescriptorsGroup();
    }

    public void resetBidDescriptorsGroup()
    {
        if (bidDescriptorsGroup != null)
        {
            bidDescriptorsGroup.reset();
        }
        noBidDescriptorsGroupCounter = 0;
        hasNoBidDescriptorsGroupCounter = false;
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
        builder.append("\"MessageName\": \"BidDescReqGrp\",\n");
        if (hasNoBidDescriptorsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"BidDescriptorsGroup\": [\n");
            final int noBidDescriptorsGroupCounter = this.noBidDescriptorsGroupCounter;
            BidDescriptorsGroupEncoder bidDescriptorsGroup = this.bidDescriptorsGroup;
            for (int i = 0; i < noBidDescriptorsGroupCounter; i++)
            {
                indent(builder, level);
                bidDescriptorsGroup.appendTo(builder, level + 1);
                if (i < (noBidDescriptorsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                bidDescriptorsGroup = bidDescriptorsGroup.next();
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
    public BidDescReqGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidDescReqGrpEncoder)encoder);
    }

    public BidDescReqGrpEncoder copyTo(final BidDescReqGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoBidDescriptorsGroupCounter)
        {
            final int size = this.noBidDescriptorsGroupCounter;
            BidDescriptorsGroupEncoder bidDescriptorsGroup = this.bidDescriptorsGroup;
            BidDescriptorsGroupEncoder bidDescriptorsGroupEncoder = encoder.bidDescriptorsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidDescriptorsGroup != null)
                {
                    bidDescriptorsGroup.copyTo(bidDescriptorsGroupEncoder);
                    bidDescriptorsGroup = bidDescriptorsGroup.next();
                    bidDescriptorsGroupEncoder = bidDescriptorsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
