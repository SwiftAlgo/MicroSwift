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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MsgTypeGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MsgTypeGrpEncoder.MsgTypesGroupEncoder;

public interface MsgTypeGrpDecoder 
{



public class MsgTypesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REF_MSG_TYPE);
            ALL_GROUP_FIELDS.add(Constants.MSG_DIRECTION);
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_VER_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_APPL_EXT_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_CSTM_APPL_VER_ID);
            ALL_GROUP_FIELDS.add(Constants.DEFAULT_VER_INDICATOR);
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
        if (hasMsgDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MsgDirection.isValid(msgDirection()))
        {
            invalidTagId = 385;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MsgTypesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MsgTypesGroupDecoder next = null;

    public MsgTypesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(12);

    private char[] refMsgType = new char[1];

    private boolean hasRefMsgType;

    public char[] refMsgType()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgType;
    }

    public boolean hasRefMsgType()
    {
        return hasRefMsgType;
    }


    private int refMsgTypeOffset;

    private int refMsgTypeLength;

    public int refMsgTypeLength()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgTypeLength;
    }

    public String refMsgTypeAsString()
    {
        return hasRefMsgType ? new String(refMsgType, 0, refMsgTypeLength) : null;
    }

    public void refMsgType(final AsciiSequenceView view)
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        view.wrap(buffer, refMsgTypeOffset, refMsgTypeLength);
    }


    private final CharArrayWrapper refMsgTypeWrapper = new CharArrayWrapper();
    private char msgDirection = MISSING_CHAR;

    private boolean hasMsgDirection;

    public char msgDirection()
    {
        if (!hasMsgDirection)
        {
            throw new IllegalArgumentException("No value for optional field: MsgDirection");
        }

        return msgDirection;
    }

    public boolean hasMsgDirection()
    {
        return hasMsgDirection;
    }



    private final CharArrayWrapper msgDirectionWrapper = new CharArrayWrapper();
    public MsgDirection msgDirectionAsEnum()
    {
        if (!hasMsgDirection)
 return MsgDirection.NULL_VAL;
        return MsgDirection.decode(msgDirection);
    }

    private char[] refApplVerID = new char[1];

    private boolean hasRefApplVerID;

    public char[] refApplVerID()
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        return refApplVerID;
    }

    public boolean hasRefApplVerID()
    {
        return hasRefApplVerID;
    }


    private int refApplVerIDOffset;

    private int refApplVerIDLength;

    public int refApplVerIDLength()
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        return refApplVerIDLength;
    }

    public String refApplVerIDAsString()
    {
        return hasRefApplVerID ? new String(refApplVerID, 0, refApplVerIDLength) : null;
    }

    public void refApplVerID(final AsciiSequenceView view)
    {
        if (!hasRefApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplVerID");
        }

        view.wrap(buffer, refApplVerIDOffset, refApplVerIDLength);
    }


    private final CharArrayWrapper refApplVerIDWrapper = new CharArrayWrapper();
    private int refApplExtID = MISSING_INT;

    private boolean hasRefApplExtID;

    public int refApplExtID()
    {
        if (!hasRefApplExtID)
        {
            throw new IllegalArgumentException("No value for optional field: RefApplExtID");
        }

        return refApplExtID;
    }

    public boolean hasRefApplExtID()
    {
        return hasRefApplExtID;
    }



    private char[] refCstmApplVerID = new char[1];

    private boolean hasRefCstmApplVerID;

    public char[] refCstmApplVerID()
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        return refCstmApplVerID;
    }

    public boolean hasRefCstmApplVerID()
    {
        return hasRefCstmApplVerID;
    }


    private int refCstmApplVerIDOffset;

    private int refCstmApplVerIDLength;

    public int refCstmApplVerIDLength()
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        return refCstmApplVerIDLength;
    }

    public String refCstmApplVerIDAsString()
    {
        return hasRefCstmApplVerID ? new String(refCstmApplVerID, 0, refCstmApplVerIDLength) : null;
    }

    public void refCstmApplVerID(final AsciiSequenceView view)
    {
        if (!hasRefCstmApplVerID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCstmApplVerID");
        }

        view.wrap(buffer, refCstmApplVerIDOffset, refCstmApplVerIDLength);
    }


    private final CharArrayWrapper refCstmApplVerIDWrapper = new CharArrayWrapper();
    private boolean defaultVerIndicator;

    private boolean hasDefaultVerIndicator;

    public boolean defaultVerIndicator()
    {
        if (!hasDefaultVerIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: DefaultVerIndicator");
        }

        return defaultVerIndicator;
    }

    public boolean hasDefaultVerIndicator()
    {
        return hasDefaultVerIndicator;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MsgTypesGroup
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
                    next = new MsgTypesGroupDecoder(trailer, messageFields);
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
            case Constants.REF_MSG_TYPE:
                hasRefMsgType = true;
                refMsgType = buffer.getChars(refMsgType, valueOffset, valueLength);
                refMsgTypeOffset = valueOffset;
                refMsgTypeLength = valueLength;
                break;

            case Constants.MSG_DIRECTION:
                hasMsgDirection = true;
                msgDirection = buffer.getChar(valueOffset);
                break;

            case Constants.REF_APPL_VER_ID:
                hasRefApplVerID = true;
                refApplVerID = buffer.getChars(refApplVerID, valueOffset, valueLength);
                refApplVerIDOffset = valueOffset;
                refApplVerIDLength = valueLength;
                break;

            case Constants.REF_APPL_EXT_ID:
                hasRefApplExtID = true;
                refApplExtID = getInt(buffer, valueOffset, endOfField, 1406, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REF_CSTM_APPL_VER_ID:
                hasRefCstmApplVerID = true;
                refCstmApplVerID = buffer.getChars(refCstmApplVerID, valueOffset, valueLength);
                refCstmApplVerIDOffset = valueOffset;
                refCstmApplVerIDLength = valueLength;
                break;

            case Constants.DEFAULT_VER_INDICATOR:
                hasDefaultVerIndicator = true;
                defaultVerIndicator = buffer.getBoolean(valueOffset);
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
        this.resetRefMsgType();
        this.resetMsgDirection();
        this.resetRefApplVerID();
        this.resetRefApplExtID();
        this.resetRefCstmApplVerID();
        this.resetDefaultVerIndicator();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefMsgType()
    {
        hasRefMsgType = false;
    }

    public void resetMsgDirection()
    {
        hasMsgDirection = false;
    }

    public void resetRefApplVerID()
    {
        hasRefApplVerID = false;
    }

    public void resetRefApplExtID()
    {
        hasRefApplExtID = false;
    }

    public void resetRefCstmApplVerID()
    {
        hasRefCstmApplVerID = false;
    }

    public void resetDefaultVerIndicator()
    {
        hasDefaultVerIndicator = false;
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
        builder.append("\"MessageName\": \"MsgTypesGroup\",\n");
        if (hasRefMsgType())
        {
            indent(builder, level);
            builder.append("\"RefMsgType\": \"");
            builder.append(this.refMsgType(), 0, refMsgTypeLength());
            builder.append("\",\n");
        }

        if (hasMsgDirection())
        {
            indent(builder, level);
            builder.append("\"MsgDirection\": \"");
            builder.append(msgDirection);
            builder.append("\",\n");
        }

        if (hasRefApplVerID())
        {
            indent(builder, level);
            builder.append("\"RefApplVerID\": \"");
            builder.append(this.refApplVerID(), 0, refApplVerIDLength());
            builder.append("\",\n");
        }

        if (hasRefApplExtID())
        {
            indent(builder, level);
            builder.append("\"RefApplExtID\": \"");
            builder.append(refApplExtID);
            builder.append("\",\n");
        }

        if (hasRefCstmApplVerID())
        {
            indent(builder, level);
            builder.append("\"RefCstmApplVerID\": \"");
            builder.append(this.refCstmApplVerID(), 0, refCstmApplVerIDLength());
            builder.append("\",\n");
        }

        if (hasDefaultVerIndicator())
        {
            indent(builder, level);
            builder.append("\"DefaultVerIndicator\": \"");
            builder.append(defaultVerIndicator);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MsgTypeGrpEncoder.MsgTypesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MsgTypeGrpEncoder.MsgTypesGroupEncoder)encoder);
    }

    public MsgTypeGrpEncoder.MsgTypesGroupEncoder toEncoder(final MsgTypeGrpEncoder.MsgTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefMsgType())
        {
            encoder.refMsgType(this.refMsgType(), 0, refMsgTypeLength());
        }

        if (hasMsgDirection())
        {
            encoder.msgDirection(this.msgDirection());
        }

        if (hasRefApplVerID())
        {
            encoder.refApplVerID(this.refApplVerID(), 0, refApplVerIDLength());
        }

        if (hasRefApplExtID())
        {
            encoder.refApplExtID(this.refApplExtID());
        }

        if (hasRefCstmApplVerID())
        {
            encoder.refCstmApplVerID(this.refCstmApplVerID(), 0, refCstmApplVerIDLength());
        }

        if (hasDefaultVerIndicator())
        {
            encoder.defaultVerIndicator(this.defaultVerIndicator());
        }
        return encoder;
    }

}
    public class MsgTypesGroupIterator implements Iterable<MsgTypesGroupDecoder>, java.util.Iterator<MsgTypesGroupDecoder>
    {
        private final MsgTypeGrpDecoder parent;
        private int remainder;
        private MsgTypesGroupDecoder current;

        public MsgTypesGroupIterator(final MsgTypeGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MsgTypesGroupDecoder next()
        {
            remainder--;
            final MsgTypesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMsgTypesGroupCounter() ? parent.noMsgTypesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.msgTypesGroup();
        }

        public MsgTypesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public MsgTypesGroupIterator msgTypesGroupIterator();
    public int noMsgTypesGroupCounter();
    public boolean hasNoMsgTypesGroupCounter();
    public MsgTypesGroupDecoder msgTypesGroup();

}
