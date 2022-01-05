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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDRequestGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDRequestGrpEncoder.ApplIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface ApplIDRequestGrpDecoder 
{



public class ApplIDsGroupDecoder extends CommonDecoderImpl implements NestedPartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.REF_APPL_ID);
            GROUP_FIELDS.add(Constants.REF_APPL_REQ_ID);
            GROUP_FIELDS.add(Constants.APPL_BEG_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_END_SEQ_NUM);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_REQ_ID);
            ALL_GROUP_FIELDS.add(Constants.APPL_BEG_SEQ_NUM);
            ALL_GROUP_FIELDS.add(Constants.APPL_END_SEQ_NUM);
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
    public ApplIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ApplIDsGroupDecoder next = null;

    public ApplIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);

    private char[] refApplID = new char[1];

    private boolean hasRefApplID;

    public char[] refApplID()
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        return refApplID;
    }

    public boolean hasRefApplID()
    {
        return hasRefApplID;
    }


    private int refApplIDOffset;

    private int refApplIDLength;

    public int refApplIDLength()
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        return refApplIDLength;
    }

    public String refApplIDAsString()
    {
        return hasRefApplID ? new String(refApplID, 0, refApplIDLength) : null;
    }

    public void refApplID(final AsciiSequenceView view)
    {
        if (!hasRefApplID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplID");
        }

        view.wrap(buffer, refApplIDOffset, refApplIDLength);
    }


    private char[] refApplReqID = new char[1];

    private boolean hasRefApplReqID;

    public char[] refApplReqID()
    {
        if (!hasRefApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplReqID");
        }

        return refApplReqID;
    }

    public boolean hasRefApplReqID()
    {
        return hasRefApplReqID;
    }


    private int refApplReqIDOffset;

    private int refApplReqIDLength;

    public int refApplReqIDLength()
    {
        if (!hasRefApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplReqID");
        }

        return refApplReqIDLength;
    }

    public String refApplReqIDAsString()
    {
        return hasRefApplReqID ? new String(refApplReqID, 0, refApplReqIDLength) : null;
    }

    public void refApplReqID(final AsciiSequenceView view)
    {
        if (!hasRefApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplReqID");
        }

        view.wrap(buffer, refApplReqIDOffset, refApplReqIDLength);
    }


    private int applBegSeqNum = MISSING_INT;

    private boolean hasApplBegSeqNum;

    public int applBegSeqNum()
    {
        if (!hasApplBegSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplBegSeqNum");
        }

        return applBegSeqNum;
    }

    public boolean hasApplBegSeqNum()
    {
        return hasApplBegSeqNum;
    }



    private int applEndSeqNum = MISSING_INT;

    private boolean hasApplEndSeqNum;

    public int applEndSeqNum()
    {
        if (!hasApplEndSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplEndSeqNum");
        }

        return applEndSeqNum;
    }

    public boolean hasApplEndSeqNum()
    {
        return hasApplEndSeqNum;
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
        // Decode ApplIDsGroup
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
                    next = new ApplIDsGroupDecoder(trailer, messageFields);
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
            case Constants.REF_APPL_ID:
                hasRefApplID = true;
                refApplID = buffer.getChars(refApplID, valueOffset, valueLength);
                refApplIDOffset = valueOffset;
                refApplIDLength = valueLength;
                break;

            case Constants.REF_APPL_REQ_ID:
                hasRefApplReqID = true;
                refApplReqID = buffer.getChars(refApplReqID, valueOffset, valueLength);
                refApplReqIDOffset = valueOffset;
                refApplReqIDLength = valueLength;
                break;

            case Constants.APPL_BEG_SEQ_NUM:
                hasApplBegSeqNum = true;
                applBegSeqNum = getInt(buffer, valueOffset, endOfField, 1182, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_END_SEQ_NUM:
                hasApplEndSeqNum = true;
                applEndSeqNum = getInt(buffer, valueOffset, endOfField, 1183, CODEC_VALIDATION_ENABLED);
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
        this.resetRefApplID();
        this.resetRefApplReqID();
        this.resetApplBegSeqNum();
        this.resetApplEndSeqNum();
        this.resetNestedPartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefApplID()
    {
        hasRefApplID = false;
    }

    public void resetRefApplReqID()
    {
        hasRefApplReqID = false;
    }

    public void resetApplBegSeqNum()
    {
        hasApplBegSeqNum = false;
    }

    public void resetApplEndSeqNum()
    {
        hasApplEndSeqNum = false;
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
        builder.append("\"MessageName\": \"ApplIDsGroup\",\n");
        if (hasRefApplID())
        {
            indent(builder, level);
            builder.append("\"RefApplID\": \"");
            builder.append(this.refApplID(), 0, refApplIDLength());
            builder.append("\",\n");
        }

        if (hasRefApplReqID())
        {
            indent(builder, level);
            builder.append("\"RefApplReqID\": \"");
            builder.append(this.refApplReqID(), 0, refApplReqIDLength());
            builder.append("\",\n");
        }

        if (hasApplBegSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplBegSeqNum\": \"");
            builder.append(applBegSeqNum);
            builder.append("\",\n");
        }

        if (hasApplEndSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplEndSeqNum\": \"");
            builder.append(applEndSeqNum);
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
    public ApplIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ApplIDsGroupEncoder)encoder);
    }

    public ApplIDsGroupEncoder toEncoder(final ApplIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefApplID())
        {
            encoder.refApplID(this.refApplID(), 0, refApplIDLength());
        }

        if (hasRefApplReqID())
        {
            encoder.refApplReqID(this.refApplReqID(), 0, refApplReqIDLength());
        }

        if (hasApplBegSeqNum())
        {
            encoder.applBegSeqNum(this.applBegSeqNum());
        }

        if (hasApplEndSeqNum())
        {
            encoder.applEndSeqNum(this.applEndSeqNum());
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
    public class ApplIDsGroupIterator implements Iterable<ApplIDsGroupDecoder>, java.util.Iterator<ApplIDsGroupDecoder>
    {
        private final ApplIDRequestGrpDecoder parent;
        private int remainder;
        private ApplIDsGroupDecoder current;

        public ApplIDsGroupIterator(final ApplIDRequestGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public ApplIDsGroupDecoder next()
        {
            remainder--;
            final ApplIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoApplIDsGroupCounter() ? parent.noApplIDsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.applIDsGroup();
        }
        public ApplIDsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public ApplIDsGroupIterator applIDsGroupIterator();
    public int noApplIDsGroupCounter();
    public boolean hasNoApplIDsGroupCounter();
    public ApplIDsGroupDecoder applIDsGroup();

}
