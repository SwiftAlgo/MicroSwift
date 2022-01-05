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


public class MsgTypeGrpEncoder
{
    private static final int noMsgTypesGroupCounterHeaderLength = 4;
    private static final byte[] noMsgTypesGroupCounterHeader = new byte[] {51, 56, 52, (byte) '='};



public static class MsgTypesGroupEncoder
{
    private MsgTypesGroupEncoder next = null;

    public MsgTypesGroupEncoder next()
    {
        if (next == null)
        {
            next = new MsgTypesGroupEncoder();
        }
        return next;
    }

    private static final int refMsgTypeHeaderLength = 4;
    private static final byte[] refMsgTypeHeader = new byte[] {51, 55, 50, (byte) '='};

    private static final int msgDirectionHeaderLength = 4;
    private static final byte[] msgDirectionHeader = new byte[] {51, 56, 53, (byte) '='};

    private static final int refApplVerIDHeaderLength = 5;
    private static final byte[] refApplVerIDHeader = new byte[] {49, 49, 51, 48, (byte) '='};

    private static final int refApplExtIDHeaderLength = 5;
    private static final byte[] refApplExtIDHeader = new byte[] {49, 52, 48, 54, (byte) '='};

    private static final int refCstmApplVerIDHeaderLength = 5;
    private static final byte[] refCstmApplVerIDHeader = new byte[] {49, 49, 51, 49, (byte) '='};

    private static final int defaultVerIndicatorHeaderLength = 5;
    private static final byte[] defaultVerIndicatorHeader = new byte[] {49, 52, 49, 48, (byte) '='};

    private final MutableDirectBuffer refMsgType = new UnsafeBuffer();

    private int refMsgTypeOffset = 0;

    private int refMsgTypeLength = 0;

    public MsgTypesGroupEncoder refMsgType(final DirectBuffer value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refMsgType(final DirectBuffer value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public MsgTypesGroupEncoder refMsgType(final DirectBuffer value)
    {
        return refMsgType(value, 0, value.capacity());
    }

    public MsgTypesGroupEncoder refMsgType(final byte[] value, final int offset, final int length)
    {
        refMsgType.wrap(value);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refMsgTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refMsgType, value, offset, length);
        refMsgTypeOffset = offset;
        refMsgTypeLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refMsgType(final byte[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public MsgTypesGroupEncoder refMsgType(final byte[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    public boolean hasRefMsgType()
    {
        return refMsgTypeLength > 0;
    }

    public MutableDirectBuffer refMsgType()
    {
        return refMsgType;
    }

    public String refMsgTypeAsString()
    {
        return refMsgType.getStringWithoutLengthAscii(refMsgTypeOffset, refMsgTypeLength);
    }

    public MsgTypesGroupEncoder refMsgType(final CharSequence value)
    {
        toBytes(value, refMsgType);
        refMsgTypeOffset = 0;
        refMsgTypeLength = value.length();
        return this;
    }

    public MsgTypesGroupEncoder refMsgType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refMsgType.wrap(buffer);
            refMsgTypeOffset = value.offset();
            refMsgTypeLength = value.length();
        }
        return this;
    }

    public MsgTypesGroupEncoder refMsgType(final char[] value)
    {
        return refMsgType(value, 0, value.length);
    }

    public MsgTypesGroupEncoder refMsgType(final char[] value, final int length)
    {
        return refMsgType(value, 0, length);
    }

    public MsgTypesGroupEncoder refMsgType(final char[] value, final int offset, final int length)
    {
        toBytes(value, refMsgType, offset, length);
        refMsgTypeOffset = 0;
        refMsgTypeLength = length;
        return this;
    }

    private char msgDirection;

    private boolean hasMsgDirection;

    public boolean hasMsgDirection()
    {
        return hasMsgDirection;
    }

    public MsgTypesGroupEncoder msgDirection(char value)
    {
        msgDirection = value;
        hasMsgDirection = true;
        return this;
    }

    public char msgDirection()
    {
        return msgDirection;
    }

    public MsgTypesGroupEncoder msgDirection(MsgDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == MsgDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: msgDirection Value: " + value );
            }
            if (value == MsgDirection.NULL_VAL)
            {
                return this;
            }
        }
        return msgDirection(value.representation());
    }

    private final MutableDirectBuffer refApplVerID = new UnsafeBuffer();

    private int refApplVerIDOffset = 0;

    private int refApplVerIDLength = 0;

    public MsgTypesGroupEncoder refApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        refApplVerID.wrap(value);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refApplVerID(final DirectBuffer value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refApplVerID(final DirectBuffer value)
    {
        return refApplVerID(value, 0, value.capacity());
    }

    public MsgTypesGroupEncoder refApplVerID(final byte[] value, final int offset, final int length)
    {
        refApplVerID.wrap(value);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refApplVerID, value, offset, length);
        refApplVerIDOffset = offset;
        refApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refApplVerID(final byte[] value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refApplVerID(final byte[] value)
    {
        return refApplVerID(value, 0, value.length);
    }

    public boolean hasRefApplVerID()
    {
        return refApplVerIDLength > 0;
    }

    public MutableDirectBuffer refApplVerID()
    {
        return refApplVerID;
    }

    public String refApplVerIDAsString()
    {
        return refApplVerID.getStringWithoutLengthAscii(refApplVerIDOffset, refApplVerIDLength);
    }

    public MsgTypesGroupEncoder refApplVerID(final CharSequence value)
    {
        toBytes(value, refApplVerID);
        refApplVerIDOffset = 0;
        refApplVerIDLength = value.length();
        return this;
    }

    public MsgTypesGroupEncoder refApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refApplVerID.wrap(buffer);
            refApplVerIDOffset = value.offset();
            refApplVerIDLength = value.length();
        }
        return this;
    }

    public MsgTypesGroupEncoder refApplVerID(final char[] value)
    {
        return refApplVerID(value, 0, value.length);
    }

    public MsgTypesGroupEncoder refApplVerID(final char[] value, final int length)
    {
        return refApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refApplVerID, offset, length);
        refApplVerIDOffset = 0;
        refApplVerIDLength = length;
        return this;
    }

    private int refApplExtID;

    private boolean hasRefApplExtID;

    public boolean hasRefApplExtID()
    {
        return hasRefApplExtID;
    }

    public MsgTypesGroupEncoder refApplExtID(int value)
    {
        refApplExtID = value;
        hasRefApplExtID = true;
        return this;
    }

    public int refApplExtID()
    {
        return refApplExtID;
    }

    private final MutableDirectBuffer refCstmApplVerID = new UnsafeBuffer();

    private int refCstmApplVerIDOffset = 0;

    private int refCstmApplVerIDLength = 0;

    public MsgTypesGroupEncoder refCstmApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        refCstmApplVerID.wrap(value);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final DirectBuffer value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final DirectBuffer value)
    {
        return refCstmApplVerID(value, 0, value.capacity());
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final byte[] value, final int offset, final int length)
    {
        refCstmApplVerID.wrap(value);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refCstmApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refCstmApplVerID, value, offset, length);
        refCstmApplVerIDOffset = offset;
        refCstmApplVerIDLength = length;
        return this;
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final byte[] value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final byte[] value)
    {
        return refCstmApplVerID(value, 0, value.length);
    }

    public boolean hasRefCstmApplVerID()
    {
        return refCstmApplVerIDLength > 0;
    }

    public MutableDirectBuffer refCstmApplVerID()
    {
        return refCstmApplVerID;
    }

    public String refCstmApplVerIDAsString()
    {
        return refCstmApplVerID.getStringWithoutLengthAscii(refCstmApplVerIDOffset, refCstmApplVerIDLength);
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final CharSequence value)
    {
        toBytes(value, refCstmApplVerID);
        refCstmApplVerIDOffset = 0;
        refCstmApplVerIDLength = value.length();
        return this;
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refCstmApplVerID.wrap(buffer);
            refCstmApplVerIDOffset = value.offset();
            refCstmApplVerIDLength = value.length();
        }
        return this;
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final char[] value)
    {
        return refCstmApplVerID(value, 0, value.length);
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final char[] value, final int length)
    {
        return refCstmApplVerID(value, 0, length);
    }

    public MsgTypesGroupEncoder refCstmApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refCstmApplVerID, offset, length);
        refCstmApplVerIDOffset = 0;
        refCstmApplVerIDLength = length;
        return this;
    }

    private boolean defaultVerIndicator;

    private boolean hasDefaultVerIndicator;

    public boolean hasDefaultVerIndicator()
    {
        return hasDefaultVerIndicator;
    }

    public MsgTypesGroupEncoder defaultVerIndicator(boolean value)
    {
        defaultVerIndicator = value;
        hasDefaultVerIndicator = true;
        return this;
    }

    public boolean defaultVerIndicator()
    {
        return defaultVerIndicator;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (refMsgTypeLength > 0)
        {
            buffer.putBytes(position, refMsgTypeHeader, 0, refMsgTypeHeaderLength);
            position += refMsgTypeHeaderLength;
            buffer.putBytes(position, refMsgType, refMsgTypeOffset, refMsgTypeLength);
            position += refMsgTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasMsgDirection)
        {
            buffer.putBytes(position, msgDirectionHeader, 0, msgDirectionHeaderLength);
            position += msgDirectionHeaderLength;
            position += buffer.putCharAscii(position, msgDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (refApplVerIDLength > 0)
        {
            buffer.putBytes(position, refApplVerIDHeader, 0, refApplVerIDHeaderLength);
            position += refApplVerIDHeaderLength;
            buffer.putBytes(position, refApplVerID, refApplVerIDOffset, refApplVerIDLength);
            position += refApplVerIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefApplExtID)
        {
            buffer.putBytes(position, refApplExtIDHeader, 0, refApplExtIDHeaderLength);
            position += refApplExtIDHeaderLength;
            position += buffer.putIntAscii(position, refApplExtID);
            buffer.putSeparator(position);
            position++;
        }

        if (refCstmApplVerIDLength > 0)
        {
            buffer.putBytes(position, refCstmApplVerIDHeader, 0, refCstmApplVerIDHeaderLength);
            position += refCstmApplVerIDHeaderLength;
            buffer.putBytes(position, refCstmApplVerID, refCstmApplVerIDOffset, refCstmApplVerIDLength);
            position += refCstmApplVerIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasDefaultVerIndicator)
        {
            buffer.putBytes(position, defaultVerIndicatorHeader, 0, defaultVerIndicatorHeaderLength);
            position += defaultVerIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, defaultVerIndicator);
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
        this.resetRefMsgType();
        this.resetMsgDirection();
        this.resetRefApplVerID();
        this.resetRefApplExtID();
        this.resetRefCstmApplVerID();
        this.resetDefaultVerIndicator();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRefMsgType()
    {
        refMsgTypeLength = 0;
    }

    public void resetMsgDirection()
    {
        hasMsgDirection = false;
    }

    public void resetRefApplVerID()
    {
        refApplVerIDLength = 0;
    }

    public void resetRefApplExtID()
    {
        hasRefApplExtID = false;
    }

    public void resetRefCstmApplVerID()
    {
        refCstmApplVerIDLength = 0;
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
            appendBuffer(builder, refMsgType, refMsgTypeOffset, refMsgTypeLength);
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
            appendBuffer(builder, refApplVerID, refApplVerIDOffset, refApplVerIDLength);
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
            appendBuffer(builder, refCstmApplVerID, refCstmApplVerIDOffset, refCstmApplVerIDLength);
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
    public MsgTypesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MsgTypesGroupEncoder)encoder);
    }

    public MsgTypesGroupEncoder copyTo(final MsgTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefMsgType())
        {
            encoder.refMsgTypeAsCopy(refMsgType.byteArray(), 0, refMsgTypeLength);
        }

        if (hasMsgDirection())
        {
            encoder.msgDirection(this.msgDirection());
        }

        if (hasRefApplVerID())
        {
            encoder.refApplVerIDAsCopy(refApplVerID.byteArray(), 0, refApplVerIDLength);
        }

        if (hasRefApplExtID())
        {
            encoder.refApplExtID(this.refApplExtID());
        }

        if (hasRefCstmApplVerID())
        {
            encoder.refCstmApplVerIDAsCopy(refCstmApplVerID.byteArray(), 0, refCstmApplVerIDLength);
        }

        if (hasDefaultVerIndicator())
        {
            encoder.defaultVerIndicator(this.defaultVerIndicator());
        }
        return encoder;
    }

}
    private int noMsgTypesGroupCounter;

    private boolean hasNoMsgTypesGroupCounter;

    public boolean hasNoMsgTypesGroupCounter()
    {
        return hasNoMsgTypesGroupCounter;
    }

    public MsgTypeGrpEncoder noMsgTypesGroupCounter(int value)
    {
        noMsgTypesGroupCounter = value;
        hasNoMsgTypesGroupCounter = true;
        return this;
    }

    public int noMsgTypesGroupCounter()
    {
        return noMsgTypesGroupCounter;
    }


    private MsgTypesGroupEncoder msgTypesGroup = null;

    public MsgTypesGroupEncoder msgTypesGroup(final int numberOfElements)
    {
        hasNoMsgTypesGroupCounter = true;
        noMsgTypesGroupCounter = numberOfElements;
        if (msgTypesGroup == null)
        {
            msgTypesGroup = new MsgTypesGroupEncoder();
        }
        return msgTypesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoMsgTypesGroupCounter)
        {
            buffer.putBytes(position, noMsgTypesGroupCounterHeader, 0, noMsgTypesGroupCounterHeaderLength);
            position += noMsgTypesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noMsgTypesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (msgTypesGroup != null)
        {
            position += msgTypesGroup.encode(buffer, position, noMsgTypesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetMsgTypesGroup();
    }

    public void resetMsgTypesGroup()
    {
        if (msgTypesGroup != null)
        {
            msgTypesGroup.reset();
        }
        noMsgTypesGroupCounter = 0;
        hasNoMsgTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MsgTypeGrp\",\n");
        if (hasNoMsgTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MsgTypesGroup\": [\n");
            final int noMsgTypesGroupCounter = this.noMsgTypesGroupCounter;
            MsgTypesGroupEncoder msgTypesGroup = this.msgTypesGroup;
            for (int i = 0; i < noMsgTypesGroupCounter; i++)
            {
                indent(builder, level);
                msgTypesGroup.appendTo(builder, level + 1);
                if (i < (noMsgTypesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                msgTypesGroup = msgTypesGroup.next();
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
    public MsgTypeGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MsgTypeGrpEncoder)encoder);
    }

    public MsgTypeGrpEncoder copyTo(final MsgTypeGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoMsgTypesGroupCounter)
        {
            final int size = this.noMsgTypesGroupCounter;
            MsgTypesGroupEncoder msgTypesGroup = this.msgTypesGroup;
            MsgTypesGroupEncoder msgTypesGroupEncoder = encoder.msgTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (msgTypesGroup != null)
                {
                    msgTypesGroup.copyTo(msgTypesGroupEncoder);
                    msgTypesGroup = msgTypesGroup.next();
                    msgTypesGroupEncoder = msgTypesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
