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
import com.swiftalgo.ms.codecs.fix50sp2.builder.PositionQtyEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PositionQtyEncoder.PositionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface PositionQtyDecoder 
{



public class PositionsGroupDecoder extends CommonDecoderImpl implements NestedPartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.POS_TYPE);
            GROUP_FIELDS.add(Constants.LONG_QTY);
            GROUP_FIELDS.add(Constants.SHORT_QTY);
            GROUP_FIELDS.add(Constants.POS_QTY_STATUS);
            GROUP_FIELDS.add(Constants.QUANTITY_DATE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.POS_TYPE);
            ALL_GROUP_FIELDS.add(Constants.LONG_QTY);
            ALL_GROUP_FIELDS.add(Constants.SHORT_QTY);
            ALL_GROUP_FIELDS.add(Constants.POS_QTY_STATUS);
            ALL_GROUP_FIELDS.add(Constants.QUANTITY_DATE);
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
        if (hasPosType)
        {
        posTypeWrapper.wrap(this.posType(), posTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PosType.isValid(posTypeWrapper))
        {
            invalidTagId = 703;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPosQtyStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PosQtyStatus.isValid(posQtyStatus()))
        {
            invalidTagId = 706;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNestedPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final NestedPartyIDsGroupIterator iterator = nestedPartyIDsGroupIterator.iterator();
                for (final NestedPartyIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 539;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public PositionsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private PositionsGroupDecoder next = null;

    public PositionsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(12);

    private char[] posType = new char[1];

    private boolean hasPosType;

    public char[] posType()
    {
        if (!hasPosType)
        {
            throw new IllegalArgumentException("No value for optional field: PosType");
        }

        return posType;
    }

    public boolean hasPosType()
    {
        return hasPosType;
    }


    private int posTypeOffset;

    private int posTypeLength;

    public int posTypeLength()
    {
        if (!hasPosType)
        {
            throw new IllegalArgumentException("No value for optional field: PosType");
        }

        return posTypeLength;
    }

    public String posTypeAsString()
    {
        return hasPosType ? new String(posType, 0, posTypeLength) : null;
    }

    public void posType(final AsciiSequenceView view)
    {
        if (!hasPosType)
        {
            throw new IllegalArgumentException("No value for optional field: PosType");
        }

        view.wrap(buffer, posTypeOffset, posTypeLength);
    }


    private final CharArrayWrapper posTypeWrapper = new CharArrayWrapper();
    public PosType posTypeAsEnum()
    {
        if (!hasPosType)
 return PosType.NULL_VAL;
        posTypeWrapper.wrap(this.posType(), posTypeLength);
        return PosType.decode(posTypeWrapper);
    }

    private DecimalFloat longQty = DecimalFloat.newNaNValue();

    private boolean hasLongQty;

    public DecimalFloat longQty()
    {
        if (!hasLongQty)
        {
            throw new IllegalArgumentException("No value for optional field: LongQty");
        }

        return longQty;
    }

    public boolean hasLongQty()
    {
        return hasLongQty;
    }



    private DecimalFloat shortQty = DecimalFloat.newNaNValue();

    private boolean hasShortQty;

    public DecimalFloat shortQty()
    {
        if (!hasShortQty)
        {
            throw new IllegalArgumentException("No value for optional field: ShortQty");
        }

        return shortQty;
    }

    public boolean hasShortQty()
    {
        return hasShortQty;
    }



    private int posQtyStatus = MISSING_INT;

    private boolean hasPosQtyStatus;

    public int posQtyStatus()
    {
        if (!hasPosQtyStatus)
        {
            throw new IllegalArgumentException("No value for optional field: PosQtyStatus");
        }

        return posQtyStatus;
    }

    public boolean hasPosQtyStatus()
    {
        return hasPosQtyStatus;
    }



    private final CharArrayWrapper posQtyStatusWrapper = new CharArrayWrapper();
    public PosQtyStatus posQtyStatusAsEnum()
    {
        if (!hasPosQtyStatus)
 return PosQtyStatus.NULL_VAL;
        return PosQtyStatus.decode(posQtyStatus);
    }

    private byte[] quantityDate = new byte[8];

    private boolean hasQuantityDate;

    public byte[] quantityDate()
    {
        if (!hasQuantityDate)
        {
            throw new IllegalArgumentException("No value for optional field: QuantityDate");
        }

        return quantityDate;
    }

    public boolean hasQuantityDate()
    {
        return hasQuantityDate;
    }


    private int quantityDateOffset;

    private int quantityDateLength;

    public int quantityDateLength()
    {
        if (!hasQuantityDate)
        {
            throw new IllegalArgumentException("No value for optional field: QuantityDate");
        }

        return quantityDateLength;
    }

    public String quantityDateAsString()
    {
        return hasQuantityDate ? new String(quantityDate, 0, quantityDateLength) : null;
    }

    public void quantityDate(final AsciiSequenceView view)
    {
        if (!hasQuantityDate)
        {
            throw new IllegalArgumentException("No value for optional field: QuantityDate");
        }

        view.wrap(buffer, quantityDateOffset, quantityDateLength);
    }




    private NestedPartyIDsGroupDecoder nestedPartyIDsGroup = null;
    public NestedPartyIDsGroupDecoder nestedPartyIDsGroup()
    {
        return nestedPartyIDsGroup;
    }

    private int noNestedPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNestedPartyIDsGroupCounter;

    public int noNestedPartyIDsGroupCounter()
    {
        if (!hasNoNestedPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedPartyIDsGroupCounter");
        }

        return noNestedPartyIDsGroupCounter;
    }

    public boolean hasNoNestedPartyIDsGroupCounter()
    {
        return hasNoNestedPartyIDsGroupCounter;
    }




    private NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator = new NestedPartyIDsGroupIterator(this);
    public NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator()
    {
        return nestedPartyIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode PositionsGroup
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
                    next = new PositionsGroupDecoder(trailer, messageFields);
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
            case Constants.POS_TYPE:
                hasPosType = true;
                posType = buffer.getChars(posType, valueOffset, valueLength);
                posTypeOffset = valueOffset;
                posTypeLength = valueLength;
                break;

            case Constants.LONG_QTY:
                hasLongQty = true;
                longQty = getFloat(buffer, longQty, valueOffset, valueLength, 704, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SHORT_QTY:
                hasShortQty = true;
                shortQty = getFloat(buffer, shortQty, valueOffset, valueLength, 705, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.POS_QTY_STATUS:
                hasPosQtyStatus = true;
                posQtyStatus = getInt(buffer, valueOffset, endOfField, 706, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUANTITY_DATE:
                hasQuantityDate = true;
                quantityDate = buffer.getBytes(quantityDate, valueOffset, valueLength);
                quantityDateOffset = valueOffset;
                quantityDateLength = valueLength;
                break;

            case Constants.NO_NESTED_PARTY_IDS:
                hasNoNestedPartyIDsGroupCounter = true;
                noNestedPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 539, CODEC_VALIDATION_ENABLED);
                if (nestedPartyIDsGroup == null)
                {
                    nestedPartyIDsGroup = new NestedPartyIDsGroupDecoder(trailer, messageFields);
                }
                NestedPartyIDsGroupDecoder nestedPartyIDsGroupCurrent = nestedPartyIDsGroup;
                position = endOfField + 1;
                final int noNestedPartyIDsGroupCounter = this.noNestedPartyIDsGroupCounter;
                for (int i = 0; i < noNestedPartyIDsGroupCounter && position < end; i++)
                {
                    if (nestedPartyIDsGroupCurrent != null)
                    {
                        position += nestedPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nestedPartyIDsGroupCurrent = nestedPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetPosType();
        this.resetLongQty();
        this.resetShortQty();
        this.resetPosQtyStatus();
        this.resetQuantityDate();
        this.resetNestedPartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetPosType()
    {
        hasPosType = false;
    }

    public void resetLongQty()
    {
        hasLongQty = false;
    }

    public void resetShortQty()
    {
        hasShortQty = false;
    }

    public void resetPosQtyStatus()
    {
        hasPosQtyStatus = false;
    }

    public void resetQuantityDate()
    {
        hasQuantityDate = false;
    }

    public void resetNestedPartyIDsGroup()
    {
        for (final NestedPartyIDsGroupDecoder nestedPartyIDsGroupDecoder : nestedPartyIDsGroupIterator.iterator())
        {
            nestedPartyIDsGroupDecoder.reset();
            if (nestedPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedPartyIDsGroupCounter = MISSING_INT;
        hasNoNestedPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"PositionsGroup\",\n");
        if (hasPosType())
        {
            indent(builder, level);
            builder.append("\"PosType\": \"");
            builder.append(this.posType(), 0, posTypeLength());
            builder.append("\",\n");
        }

        if (hasLongQty())
        {
            indent(builder, level);
            builder.append("\"LongQty\": \"");
            longQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasShortQty())
        {
            indent(builder, level);
            builder.append("\"ShortQty\": \"");
            shortQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPosQtyStatus())
        {
            indent(builder, level);
            builder.append("\"PosQtyStatus\": \"");
            builder.append(posQtyStatus);
            builder.append("\",\n");
        }

        if (hasQuantityDate())
        {
            indent(builder, level);
            builder.append("\"QuantityDate\": \"");
            appendData(builder, quantityDate, quantityDateLength);
            builder.append("\",\n");
        }

    if (hasNoNestedPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"NestedPartyIDsGroup\": [\n");
        NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
        for (int i = 0, size = this.noNestedPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nestedPartyIDsGroup.appendTo(builder, level + 1);            if (nestedPartyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nestedPartyIDsGroup = nestedPartyIDsGroup.next();        }
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
    public PositionsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((PositionsGroupEncoder)encoder);
    }

    public PositionsGroupEncoder toEncoder(final PositionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasPosType())
        {
            encoder.posType(this.posType(), 0, posTypeLength());
        }

        if (hasLongQty())
        {
            encoder.longQty(this.longQty());
        }

        if (hasShortQty())
        {
            encoder.shortQty(this.shortQty());
        }

        if (hasPosQtyStatus())
        {
            encoder.posQtyStatus(this.posQtyStatus());
        }

        if (hasQuantityDate())
        {
            encoder.quantityDateAsCopy(this.quantityDate(), 0, quantityDateLength());
        }


        final NestedPartiesEncoder nestedParties = encoder.nestedParties();        if (hasNoNestedPartyIDsGroupCounter)
        {
            final int size = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroupEncoder = nestedParties.nestedPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartyIDsGroup != null)
                {
                    nestedPartyIDsGroup.toEncoder(nestedPartyIDsGroupEncoder);
                    nestedPartyIDsGroup = nestedPartyIDsGroup.next();
                    nestedPartyIDsGroupEncoder = nestedPartyIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class PositionsGroupIterator implements Iterable<PositionsGroupDecoder>, java.util.Iterator<PositionsGroupDecoder>
    {
        private final PositionQtyDecoder parent;
        private int remainder;
        private PositionsGroupDecoder current;

        public PositionsGroupIterator(final PositionQtyDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public PositionsGroupDecoder next()
        {
            remainder--;
            final PositionsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoPositionsGroupCounter() ? parent.noPositionsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.positionsGroup();
        }
        public PositionsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public PositionsGroupIterator positionsGroupIterator();
    public int noPositionsGroupCounter();
    public boolean hasNoPositionsGroupCounter();
    public PositionsGroupDecoder positionsGroup();

}
