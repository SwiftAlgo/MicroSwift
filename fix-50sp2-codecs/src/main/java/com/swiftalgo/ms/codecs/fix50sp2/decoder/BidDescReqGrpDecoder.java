/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.BidDescReqGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.BidDescReqGrpEncoder.BidDescriptorsGroupEncoder;

public interface BidDescReqGrpDecoder 
{



public class BidDescriptorsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(22);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.BID_DESCRIPTOR_TYPE);
            ALL_GROUP_FIELDS.add(Constants.BID_DESCRIPTOR);
            ALL_GROUP_FIELDS.add(Constants.SIDE_VALUE_IND);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_VALUE);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_NUM_SECURITIES);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_PCT_LOW);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_PCT_HIGH);
            ALL_GROUP_FIELDS.add(Constants.E_F_P_TRACKING_ERROR);
            ALL_GROUP_FIELDS.add(Constants.FAIR_VALUE);
            ALL_GROUP_FIELDS.add(Constants.OUTSIDE_INDEX_PCT);
            ALL_GROUP_FIELDS.add(Constants.VALUE_OF_FUTURES);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasBidDescriptorType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidDescriptorType.isValid(bidDescriptorType()))
        {
            invalidTagId = 399;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSideValueInd)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SideValueInd.isValid(sideValueInd()))
        {
            invalidTagId = 401;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public BidDescriptorsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private BidDescriptorsGroupDecoder next = null;

    public BidDescriptorsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(22);

    private int bidDescriptorType = MISSING_INT;

    private boolean hasBidDescriptorType;

    public int bidDescriptorType()
    {
        if (!hasBidDescriptorType)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptorType");
        }

        return bidDescriptorType;
    }

    public boolean hasBidDescriptorType()
    {
        return hasBidDescriptorType;
    }



    private final CharArrayWrapper bidDescriptorTypeWrapper = new CharArrayWrapper();
    public BidDescriptorType bidDescriptorTypeAsEnum()
    {
        if (!hasBidDescriptorType)
 return BidDescriptorType.NULL_VAL;
        return BidDescriptorType.decode(bidDescriptorType);
    }

    private char[] bidDescriptor = new char[1];

    private boolean hasBidDescriptor;

    public char[] bidDescriptor()
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        return bidDescriptor;
    }

    public boolean hasBidDescriptor()
    {
        return hasBidDescriptor;
    }


    private int bidDescriptorOffset;

    private int bidDescriptorLength;

    public int bidDescriptorLength()
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        return bidDescriptorLength;
    }

    public String bidDescriptorAsString()
    {
        return hasBidDescriptor ? new String(bidDescriptor, 0, bidDescriptorLength) : null;
    }

    public void bidDescriptor(final AsciiSequenceView view)
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        view.wrap(buffer, bidDescriptorOffset, bidDescriptorLength);
    }


    private int sideValueInd = MISSING_INT;

    private boolean hasSideValueInd;

    public int sideValueInd()
    {
        if (!hasSideValueInd)
        {
            throw new IllegalArgumentException("No value for optional field: SideValueInd");
        }

        return sideValueInd;
    }

    public boolean hasSideValueInd()
    {
        return hasSideValueInd;
    }



    private final CharArrayWrapper sideValueIndWrapper = new CharArrayWrapper();
    public SideValueInd sideValueIndAsEnum()
    {
        if (!hasSideValueInd)
 return SideValueInd.NULL_VAL;
        return SideValueInd.decode(sideValueInd);
    }

    private DecimalFloat liquidityValue = DecimalFloat.newNaNValue();

    private boolean hasLiquidityValue;

    public DecimalFloat liquidityValue()
    {
        if (!hasLiquidityValue)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityValue");
        }

        return liquidityValue;
    }

    public boolean hasLiquidityValue()
    {
        return hasLiquidityValue;
    }



    private int liquidityNumSecurities = MISSING_INT;

    private boolean hasLiquidityNumSecurities;

    public int liquidityNumSecurities()
    {
        if (!hasLiquidityNumSecurities)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityNumSecurities");
        }

        return liquidityNumSecurities;
    }

    public boolean hasLiquidityNumSecurities()
    {
        return hasLiquidityNumSecurities;
    }



    private DecimalFloat liquidityPctLow = DecimalFloat.newNaNValue();

    private boolean hasLiquidityPctLow;

    public DecimalFloat liquidityPctLow()
    {
        if (!hasLiquidityPctLow)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityPctLow");
        }

        return liquidityPctLow;
    }

    public boolean hasLiquidityPctLow()
    {
        return hasLiquidityPctLow;
    }



    private DecimalFloat liquidityPctHigh = DecimalFloat.newNaNValue();

    private boolean hasLiquidityPctHigh;

    public DecimalFloat liquidityPctHigh()
    {
        if (!hasLiquidityPctHigh)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityPctHigh");
        }

        return liquidityPctHigh;
    }

    public boolean hasLiquidityPctHigh()
    {
        return hasLiquidityPctHigh;
    }



    private DecimalFloat eFPTrackingError = DecimalFloat.newNaNValue();

    private boolean hasEFPTrackingError;

    public DecimalFloat eFPTrackingError()
    {
        if (!hasEFPTrackingError)
        {
            throw new IllegalArgumentException("No value for optional field: EFPTrackingError");
        }

        return eFPTrackingError;
    }

    public boolean hasEFPTrackingError()
    {
        return hasEFPTrackingError;
    }



    private DecimalFloat fairValue = DecimalFloat.newNaNValue();

    private boolean hasFairValue;

    public DecimalFloat fairValue()
    {
        if (!hasFairValue)
        {
            throw new IllegalArgumentException("No value for optional field: FairValue");
        }

        return fairValue;
    }

    public boolean hasFairValue()
    {
        return hasFairValue;
    }



    private DecimalFloat outsideIndexPct = DecimalFloat.newNaNValue();

    private boolean hasOutsideIndexPct;

    public DecimalFloat outsideIndexPct()
    {
        if (!hasOutsideIndexPct)
        {
            throw new IllegalArgumentException("No value for optional field: OutsideIndexPct");
        }

        return outsideIndexPct;
    }

    public boolean hasOutsideIndexPct()
    {
        return hasOutsideIndexPct;
    }



    private DecimalFloat valueOfFutures = DecimalFloat.newNaNValue();

    private boolean hasValueOfFutures;

    public DecimalFloat valueOfFutures()
    {
        if (!hasValueOfFutures)
        {
            throw new IllegalArgumentException("No value for optional field: ValueOfFutures");
        }

        return valueOfFutures;
    }

    public boolean hasValueOfFutures()
    {
        return hasValueOfFutures;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode BidDescriptorsGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new BidDescriptorsGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.BID_DESCRIPTOR_TYPE:
                hasBidDescriptorType = true;
                bidDescriptorType = getInt(buffer, valueOffset, endOfField, 399, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BID_DESCRIPTOR:
                hasBidDescriptor = true;
                bidDescriptor = buffer.getChars(bidDescriptor, valueOffset, valueLength);
                bidDescriptorOffset = valueOffset;
                bidDescriptorLength = valueLength;
                break;

            case Constants.SIDE_VALUE_IND:
                hasSideValueInd = true;
                sideValueInd = getInt(buffer, valueOffset, endOfField, 401, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_VALUE:
                hasLiquidityValue = true;
                liquidityValue = getFloat(buffer, liquidityValue, valueOffset, valueLength, 404, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_NUM_SECURITIES:
                hasLiquidityNumSecurities = true;
                liquidityNumSecurities = getInt(buffer, valueOffset, endOfField, 441, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_PCT_LOW:
                hasLiquidityPctLow = true;
                liquidityPctLow = getFloat(buffer, liquidityPctLow, valueOffset, valueLength, 402, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_PCT_HIGH:
                hasLiquidityPctHigh = true;
                liquidityPctHigh = getFloat(buffer, liquidityPctHigh, valueOffset, valueLength, 403, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.E_F_P_TRACKING_ERROR:
                hasEFPTrackingError = true;
                eFPTrackingError = getFloat(buffer, eFPTrackingError, valueOffset, valueLength, 405, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FAIR_VALUE:
                hasFairValue = true;
                fairValue = getFloat(buffer, fairValue, valueOffset, valueLength, 406, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OUTSIDE_INDEX_PCT:
                hasOutsideIndexPct = true;
                outsideIndexPct = getFloat(buffer, outsideIndexPct, valueOffset, valueLength, 407, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.VALUE_OF_FUTURES:
                hasValueOfFutures = true;
                valueOfFutures = getFloat(buffer, valueOfFutures, valueOffset, valueLength, 408, CODEC_VALIDATION_ENABLED);
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
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
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetBidDescriptorType()
    {
        hasBidDescriptorType = false;
    }

    public void resetBidDescriptor()
    {
        hasBidDescriptor = false;
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
            builder.append(this.bidDescriptor(), 0, bidDescriptorLength());
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
    public BidDescriptorsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((BidDescriptorsGroupEncoder)encoder);
    }

    public BidDescriptorsGroupEncoder toEncoder(final BidDescriptorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasBidDescriptorType())
        {
            encoder.bidDescriptorType(this.bidDescriptorType());
        }

        if (hasBidDescriptor())
        {
            encoder.bidDescriptor(this.bidDescriptor(), 0, bidDescriptorLength());
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
    public class BidDescriptorsGroupIterator implements Iterable<BidDescriptorsGroupDecoder>, java.util.Iterator<BidDescriptorsGroupDecoder>
    {
        private final BidDescReqGrpDecoder parent;
        private int remainder;
        private BidDescriptorsGroupDecoder current;

        public BidDescriptorsGroupIterator(final BidDescReqGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public BidDescriptorsGroupDecoder next()
        {
            remainder--;
            final BidDescriptorsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoBidDescriptorsGroupCounter() ? parent.noBidDescriptorsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.bidDescriptorsGroup();
        }
        public BidDescriptorsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public BidDescriptorsGroupIterator bidDescriptorsGroupIterator();
    public int noBidDescriptorsGroupCounter();
    public boolean hasNoBidDescriptorsGroupCounter();
    public BidDescriptorsGroupDecoder bidDescriptorsGroup();

}
