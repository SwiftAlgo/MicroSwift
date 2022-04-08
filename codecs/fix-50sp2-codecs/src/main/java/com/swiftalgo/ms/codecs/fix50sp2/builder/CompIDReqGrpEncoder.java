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


public class CompIDReqGrpEncoder
{
    private static final int noCompIDsGroupCounterHeaderLength = 4;
    private static final byte[] noCompIDsGroupCounterHeader = new byte[] {57, 51, 54, (byte) '='};



public static class CompIDsGroupEncoder
{
    private CompIDsGroupEncoder next = null;

    public CompIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new CompIDsGroupEncoder();
        }
        return next;
    }

    private static final int refCompIDHeaderLength = 4;
    private static final byte[] refCompIDHeader = new byte[] {57, 51, 48, (byte) '='};

    private static final int refSubIDHeaderLength = 4;
    private static final byte[] refSubIDHeader = new byte[] {57, 51, 49, (byte) '='};

    private static final int locationIDHeaderLength = 4;
    private static final byte[] locationIDHeader = new byte[] {50, 56, 51, (byte) '='};

    private static final int deskIDHeaderLength = 4;
    private static final byte[] deskIDHeader = new byte[] {50, 56, 52, (byte) '='};

    private final MutableDirectBuffer refCompID = new UnsafeBuffer();

    private int refCompIDOffset = 0;

    private int refCompIDLength = 0;

    public CompIDsGroupEncoder refCompID(final DirectBuffer value, final int offset, final int length)
    {
        refCompID.wrap(value);
        refCompIDOffset = offset;
        refCompIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refCompID(final DirectBuffer value, final int length)
    {
        return refCompID(value, 0, length);
    }

    public CompIDsGroupEncoder refCompID(final DirectBuffer value)
    {
        return refCompID(value, 0, value.capacity());
    }

    public CompIDsGroupEncoder refCompID(final byte[] value, final int offset, final int length)
    {
        refCompID.wrap(value);
        refCompIDOffset = offset;
        refCompIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refCompIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refCompID, value, offset, length);
        refCompIDOffset = offset;
        refCompIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refCompID(final byte[] value, final int length)
    {
        return refCompID(value, 0, length);
    }

    public CompIDsGroupEncoder refCompID(final byte[] value)
    {
        return refCompID(value, 0, value.length);
    }

    public boolean hasRefCompID()
    {
        return refCompIDLength > 0;
    }

    public MutableDirectBuffer refCompID()
    {
        return refCompID;
    }

    public String refCompIDAsString()
    {
        return refCompID.getStringWithoutLengthAscii(refCompIDOffset, refCompIDLength);
    }

    public CompIDsGroupEncoder refCompID(final CharSequence value)
    {
        toBytes(value, refCompID);
        refCompIDOffset = 0;
        refCompIDLength = value.length();
        return this;
    }

    public CompIDsGroupEncoder refCompID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refCompID.wrap(buffer);
            refCompIDOffset = value.offset();
            refCompIDLength = value.length();
        }
        return this;
    }

    public CompIDsGroupEncoder refCompID(final char[] value)
    {
        return refCompID(value, 0, value.length);
    }

    public CompIDsGroupEncoder refCompID(final char[] value, final int length)
    {
        return refCompID(value, 0, length);
    }

    public CompIDsGroupEncoder refCompID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refCompID, offset, length);
        refCompIDOffset = 0;
        refCompIDLength = length;
        return this;
    }

    private final MutableDirectBuffer refSubID = new UnsafeBuffer();

    private int refSubIDOffset = 0;

    private int refSubIDLength = 0;

    public CompIDsGroupEncoder refSubID(final DirectBuffer value, final int offset, final int length)
    {
        refSubID.wrap(value);
        refSubIDOffset = offset;
        refSubIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refSubID(final DirectBuffer value, final int length)
    {
        return refSubID(value, 0, length);
    }

    public CompIDsGroupEncoder refSubID(final DirectBuffer value)
    {
        return refSubID(value, 0, value.capacity());
    }

    public CompIDsGroupEncoder refSubID(final byte[] value, final int offset, final int length)
    {
        refSubID.wrap(value);
        refSubIDOffset = offset;
        refSubIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refSubID, value, offset, length);
        refSubIDOffset = offset;
        refSubIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder refSubID(final byte[] value, final int length)
    {
        return refSubID(value, 0, length);
    }

    public CompIDsGroupEncoder refSubID(final byte[] value)
    {
        return refSubID(value, 0, value.length);
    }

    public boolean hasRefSubID()
    {
        return refSubIDLength > 0;
    }

    public MutableDirectBuffer refSubID()
    {
        return refSubID;
    }

    public String refSubIDAsString()
    {
        return refSubID.getStringWithoutLengthAscii(refSubIDOffset, refSubIDLength);
    }

    public CompIDsGroupEncoder refSubID(final CharSequence value)
    {
        toBytes(value, refSubID);
        refSubIDOffset = 0;
        refSubIDLength = value.length();
        return this;
    }

    public CompIDsGroupEncoder refSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refSubID.wrap(buffer);
            refSubIDOffset = value.offset();
            refSubIDLength = value.length();
        }
        return this;
    }

    public CompIDsGroupEncoder refSubID(final char[] value)
    {
        return refSubID(value, 0, value.length);
    }

    public CompIDsGroupEncoder refSubID(final char[] value, final int length)
    {
        return refSubID(value, 0, length);
    }

    public CompIDsGroupEncoder refSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refSubID, offset, length);
        refSubIDOffset = 0;
        refSubIDLength = length;
        return this;
    }

    private final MutableDirectBuffer locationID = new UnsafeBuffer();

    private int locationIDOffset = 0;

    private int locationIDLength = 0;

    public CompIDsGroupEncoder locationID(final DirectBuffer value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder locationID(final DirectBuffer value, final int length)
    {
        return locationID(value, 0, length);
    }

    public CompIDsGroupEncoder locationID(final DirectBuffer value)
    {
        return locationID(value, 0, value.capacity());
    }

    public CompIDsGroupEncoder locationID(final byte[] value, final int offset, final int length)
    {
        locationID.wrap(value);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder locationIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(locationID, value, offset, length);
        locationIDOffset = offset;
        locationIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder locationID(final byte[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    public CompIDsGroupEncoder locationID(final byte[] value)
    {
        return locationID(value, 0, value.length);
    }

    public boolean hasLocationID()
    {
        return locationIDLength > 0;
    }

    public MutableDirectBuffer locationID()
    {
        return locationID;
    }

    public String locationIDAsString()
    {
        return locationID.getStringWithoutLengthAscii(locationIDOffset, locationIDLength);
    }

    public CompIDsGroupEncoder locationID(final CharSequence value)
    {
        toBytes(value, locationID);
        locationIDOffset = 0;
        locationIDLength = value.length();
        return this;
    }

    public CompIDsGroupEncoder locationID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            locationID.wrap(buffer);
            locationIDOffset = value.offset();
            locationIDLength = value.length();
        }
        return this;
    }

    public CompIDsGroupEncoder locationID(final char[] value)
    {
        return locationID(value, 0, value.length);
    }

    public CompIDsGroupEncoder locationID(final char[] value, final int length)
    {
        return locationID(value, 0, length);
    }

    public CompIDsGroupEncoder locationID(final char[] value, final int offset, final int length)
    {
        toBytes(value, locationID, offset, length);
        locationIDOffset = 0;
        locationIDLength = length;
        return this;
    }

    private final MutableDirectBuffer deskID = new UnsafeBuffer();

    private int deskIDOffset = 0;

    private int deskIDLength = 0;

    public CompIDsGroupEncoder deskID(final DirectBuffer value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder deskID(final DirectBuffer value, final int length)
    {
        return deskID(value, 0, length);
    }

    public CompIDsGroupEncoder deskID(final DirectBuffer value)
    {
        return deskID(value, 0, value.capacity());
    }

    public CompIDsGroupEncoder deskID(final byte[] value, final int offset, final int length)
    {
        deskID.wrap(value);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder deskIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(deskID, value, offset, length);
        deskIDOffset = offset;
        deskIDLength = length;
        return this;
    }

    public CompIDsGroupEncoder deskID(final byte[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    public CompIDsGroupEncoder deskID(final byte[] value)
    {
        return deskID(value, 0, value.length);
    }

    public boolean hasDeskID()
    {
        return deskIDLength > 0;
    }

    public MutableDirectBuffer deskID()
    {
        return deskID;
    }

    public String deskIDAsString()
    {
        return deskID.getStringWithoutLengthAscii(deskIDOffset, deskIDLength);
    }

    public CompIDsGroupEncoder deskID(final CharSequence value)
    {
        toBytes(value, deskID);
        deskIDOffset = 0;
        deskIDLength = value.length();
        return this;
    }

    public CompIDsGroupEncoder deskID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            deskID.wrap(buffer);
            deskIDOffset = value.offset();
            deskIDLength = value.length();
        }
        return this;
    }

    public CompIDsGroupEncoder deskID(final char[] value)
    {
        return deskID(value, 0, value.length);
    }

    public CompIDsGroupEncoder deskID(final char[] value, final int length)
    {
        return deskID(value, 0, length);
    }

    public CompIDsGroupEncoder deskID(final char[] value, final int offset, final int length)
    {
        toBytes(value, deskID, offset, length);
        deskIDOffset = 0;
        deskIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (refCompIDLength > 0)
        {
            buffer.putBytes(position, refCompIDHeader, 0, refCompIDHeaderLength);
            position += refCompIDHeaderLength;
            buffer.putBytes(position, refCompID, refCompIDOffset, refCompIDLength);
            position += refCompIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (refSubIDLength > 0)
        {
            buffer.putBytes(position, refSubIDHeader, 0, refSubIDHeaderLength);
            position += refSubIDHeaderLength;
            buffer.putBytes(position, refSubID, refSubIDOffset, refSubIDLength);
            position += refSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (locationIDLength > 0)
        {
            buffer.putBytes(position, locationIDHeader, 0, locationIDHeaderLength);
            position += locationIDHeaderLength;
            buffer.putBytes(position, locationID, locationIDOffset, locationIDLength);
            position += locationIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (deskIDLength > 0)
        {
            buffer.putBytes(position, deskIDHeader, 0, deskIDHeaderLength);
            position += deskIDHeaderLength;
            buffer.putBytes(position, deskID, deskIDOffset, deskIDLength);
            position += deskIDLength;
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
        this.resetRefCompID();
        this.resetRefSubID();
        this.resetLocationID();
        this.resetDeskID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRefCompID()
    {
        refCompIDLength = 0;
    }

    public void resetRefSubID()
    {
        refSubIDLength = 0;
    }

    public void resetLocationID()
    {
        locationIDLength = 0;
    }

    public void resetDeskID()
    {
        deskIDLength = 0;
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
        builder.append("\"MessageName\": \"CompIDsGroup\",\n");
        if (hasRefCompID())
        {
            indent(builder, level);
            builder.append("\"RefCompID\": \"");
            appendBuffer(builder, refCompID, refCompIDOffset, refCompIDLength);
            builder.append("\",\n");
        }

        if (hasRefSubID())
        {
            indent(builder, level);
            builder.append("\"RefSubID\": \"");
            appendBuffer(builder, refSubID, refSubIDOffset, refSubIDLength);
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            appendBuffer(builder, locationID, locationIDOffset, locationIDLength);
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            appendBuffer(builder, deskID, deskIDOffset, deskIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public CompIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CompIDsGroupEncoder)encoder);
    }

    public CompIDsGroupEncoder copyTo(final CompIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefCompID())
        {
            encoder.refCompIDAsCopy(refCompID.byteArray(), 0, refCompIDLength);
        }

        if (hasRefSubID())
        {
            encoder.refSubIDAsCopy(refSubID.byteArray(), 0, refSubIDLength);
        }

        if (hasLocationID())
        {
            encoder.locationIDAsCopy(locationID.byteArray(), 0, locationIDLength);
        }

        if (hasDeskID())
        {
            encoder.deskIDAsCopy(deskID.byteArray(), 0, deskIDLength);
        }
        return encoder;
    }

}
    private int noCompIDsGroupCounter;

    private boolean hasNoCompIDsGroupCounter;

    public boolean hasNoCompIDsGroupCounter()
    {
        return hasNoCompIDsGroupCounter;
    }

    public CompIDReqGrpEncoder noCompIDsGroupCounter(int value)
    {
        noCompIDsGroupCounter = value;
        hasNoCompIDsGroupCounter = true;
        return this;
    }

    public int noCompIDsGroupCounter()
    {
        return noCompIDsGroupCounter;
    }


    private CompIDsGroupEncoder compIDsGroup = null;

    public CompIDsGroupEncoder compIDsGroup(final int numberOfElements)
    {
        hasNoCompIDsGroupCounter = true;
        noCompIDsGroupCounter = numberOfElements;
        if (compIDsGroup == null)
        {
            compIDsGroup = new CompIDsGroupEncoder();
        }
        return compIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoCompIDsGroupCounter)
        {
            buffer.putBytes(position, noCompIDsGroupCounterHeader, 0, noCompIDsGroupCounterHeaderLength);
            position += noCompIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noCompIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (compIDsGroup != null)
        {
            position += compIDsGroup.encode(buffer, position, noCompIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetCompIDsGroup();
    }

    public void resetCompIDsGroup()
    {
        if (compIDsGroup != null)
        {
            compIDsGroup.reset();
        }
        noCompIDsGroupCounter = 0;
        hasNoCompIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"CompIDReqGrp\",\n");
        if (hasNoCompIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CompIDsGroup\": [\n");
            final int noCompIDsGroupCounter = this.noCompIDsGroupCounter;
            CompIDsGroupEncoder compIDsGroup = this.compIDsGroup;
            for (int i = 0; i < noCompIDsGroupCounter; i++)
            {
                indent(builder, level);
                compIDsGroup.appendTo(builder, level + 1);
                if (i < (noCompIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                compIDsGroup = compIDsGroup.next();
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
    public CompIDReqGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((CompIDReqGrpEncoder)encoder);
    }

    public CompIDReqGrpEncoder copyTo(final CompIDReqGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoCompIDsGroupCounter)
        {
            final int size = this.noCompIDsGroupCounter;
            CompIDsGroupEncoder compIDsGroup = this.compIDsGroup;
            CompIDsGroupEncoder compIDsGroupEncoder = encoder.compIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (compIDsGroup != null)
                {
                    compIDsGroup.copyTo(compIDsGroupEncoder);
                    compIDsGroup = compIDsGroup.next();
                    compIDsGroupEncoder = compIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
