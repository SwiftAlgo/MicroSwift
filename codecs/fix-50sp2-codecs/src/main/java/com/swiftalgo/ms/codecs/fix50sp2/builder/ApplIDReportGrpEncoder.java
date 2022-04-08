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


public class ApplIDReportGrpEncoder
{
    private static final int noApplIDsGroupCounterHeaderLength = 5;
    private static final byte[] noApplIDsGroupCounterHeader = new byte[] {49, 51, 53, 49, (byte) '='};



public static class ApplIDsGroupEncoder
{
    private ApplIDsGroupEncoder next = null;

    public ApplIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new ApplIDsGroupEncoder();
        }
        return next;
    }

    private static final int refApplIDHeaderLength = 5;
    private static final byte[] refApplIDHeader = new byte[] {49, 51, 53, 53, (byte) '='};

    private static final int applNewSeqNumHeaderLength = 5;
    private static final byte[] applNewSeqNumHeader = new byte[] {49, 51, 57, 57, (byte) '='};

    private static final int refApplLastSeqNumHeaderLength = 5;
    private static final byte[] refApplLastSeqNumHeader = new byte[] {49, 51, 53, 55, (byte) '='};

    private final MutableDirectBuffer refApplID = new UnsafeBuffer();

    private int refApplIDOffset = 0;

    private int refApplIDLength = 0;

    public ApplIDsGroupEncoder refApplID(final DirectBuffer value, final int offset, final int length)
    {
        refApplID.wrap(value);
        refApplIDOffset = offset;
        refApplIDLength = length;
        return this;
    }

    public ApplIDsGroupEncoder refApplID(final DirectBuffer value, final int length)
    {
        return refApplID(value, 0, length);
    }

    public ApplIDsGroupEncoder refApplID(final DirectBuffer value)
    {
        return refApplID(value, 0, value.capacity());
    }

    public ApplIDsGroupEncoder refApplID(final byte[] value, final int offset, final int length)
    {
        refApplID.wrap(value);
        refApplIDOffset = offset;
        refApplIDLength = length;
        return this;
    }

    public ApplIDsGroupEncoder refApplIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(refApplID, value, offset, length);
        refApplIDOffset = offset;
        refApplIDLength = length;
        return this;
    }

    public ApplIDsGroupEncoder refApplID(final byte[] value, final int length)
    {
        return refApplID(value, 0, length);
    }

    public ApplIDsGroupEncoder refApplID(final byte[] value)
    {
        return refApplID(value, 0, value.length);
    }

    public boolean hasRefApplID()
    {
        return refApplIDLength > 0;
    }

    public MutableDirectBuffer refApplID()
    {
        return refApplID;
    }

    public String refApplIDAsString()
    {
        return refApplID.getStringWithoutLengthAscii(refApplIDOffset, refApplIDLength);
    }

    public ApplIDsGroupEncoder refApplID(final CharSequence value)
    {
        toBytes(value, refApplID);
        refApplIDOffset = 0;
        refApplIDLength = value.length();
        return this;
    }

    public ApplIDsGroupEncoder refApplID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            refApplID.wrap(buffer);
            refApplIDOffset = value.offset();
            refApplIDLength = value.length();
        }
        return this;
    }

    public ApplIDsGroupEncoder refApplID(final char[] value)
    {
        return refApplID(value, 0, value.length);
    }

    public ApplIDsGroupEncoder refApplID(final char[] value, final int length)
    {
        return refApplID(value, 0, length);
    }

    public ApplIDsGroupEncoder refApplID(final char[] value, final int offset, final int length)
    {
        toBytes(value, refApplID, offset, length);
        refApplIDOffset = 0;
        refApplIDLength = length;
        return this;
    }

    private int applNewSeqNum;

    private boolean hasApplNewSeqNum;

    public boolean hasApplNewSeqNum()
    {
        return hasApplNewSeqNum;
    }

    public ApplIDsGroupEncoder applNewSeqNum(int value)
    {
        applNewSeqNum = value;
        hasApplNewSeqNum = true;
        return this;
    }

    public int applNewSeqNum()
    {
        return applNewSeqNum;
    }

    private int refApplLastSeqNum;

    private boolean hasRefApplLastSeqNum;

    public boolean hasRefApplLastSeqNum()
    {
        return hasRefApplLastSeqNum;
    }

    public ApplIDsGroupEncoder refApplLastSeqNum(int value)
    {
        refApplLastSeqNum = value;
        hasRefApplLastSeqNum = true;
        return this;
    }

    public int refApplLastSeqNum()
    {
        return refApplLastSeqNum;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (refApplIDLength > 0)
        {
            buffer.putBytes(position, refApplIDHeader, 0, refApplIDHeaderLength);
            position += refApplIDHeaderLength;
            buffer.putBytes(position, refApplID, refApplIDOffset, refApplIDLength);
            position += refApplIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplNewSeqNum)
        {
            buffer.putBytes(position, applNewSeqNumHeader, 0, applNewSeqNumHeaderLength);
            position += applNewSeqNumHeaderLength;
            position += buffer.putIntAscii(position, applNewSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefApplLastSeqNum)
        {
            buffer.putBytes(position, refApplLastSeqNumHeader, 0, refApplLastSeqNumHeaderLength);
            position += refApplLastSeqNumHeaderLength;
            position += buffer.putIntAscii(position, refApplLastSeqNum);
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
        this.resetRefApplID();
        this.resetApplNewSeqNum();
        this.resetRefApplLastSeqNum();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRefApplID()
    {
        refApplIDLength = 0;
    }

    public void resetApplNewSeqNum()
    {
        hasApplNewSeqNum = false;
    }

    public void resetRefApplLastSeqNum()
    {
        hasRefApplLastSeqNum = false;
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
            appendBuffer(builder, refApplID, refApplIDOffset, refApplIDLength);
            builder.append("\",\n");
        }

        if (hasApplNewSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplNewSeqNum\": \"");
            builder.append(applNewSeqNum);
            builder.append("\",\n");
        }

        if (hasRefApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"RefApplLastSeqNum\": \"");
            builder.append(refApplLastSeqNum);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ApplIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplIDsGroupEncoder)encoder);
    }

    public ApplIDsGroupEncoder copyTo(final ApplIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefApplID())
        {
            encoder.refApplIDAsCopy(refApplID.byteArray(), 0, refApplIDLength);
        }

        if (hasApplNewSeqNum())
        {
            encoder.applNewSeqNum(this.applNewSeqNum());
        }

        if (hasRefApplLastSeqNum())
        {
            encoder.refApplLastSeqNum(this.refApplLastSeqNum());
        }
        return encoder;
    }

}
    private int noApplIDsGroupCounter;

    private boolean hasNoApplIDsGroupCounter;

    public boolean hasNoApplIDsGroupCounter()
    {
        return hasNoApplIDsGroupCounter;
    }

    public ApplIDReportGrpEncoder noApplIDsGroupCounter(int value)
    {
        noApplIDsGroupCounter = value;
        hasNoApplIDsGroupCounter = true;
        return this;
    }

    public int noApplIDsGroupCounter()
    {
        return noApplIDsGroupCounter;
    }


    private ApplIDsGroupEncoder applIDsGroup = null;

    public ApplIDsGroupEncoder applIDsGroup(final int numberOfElements)
    {
        hasNoApplIDsGroupCounter = true;
        noApplIDsGroupCounter = numberOfElements;
        if (applIDsGroup == null)
        {
            applIDsGroup = new ApplIDsGroupEncoder();
        }
        return applIDsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoApplIDsGroupCounter)
        {
            buffer.putBytes(position, noApplIDsGroupCounterHeader, 0, noApplIDsGroupCounterHeaderLength);
            position += noApplIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noApplIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (applIDsGroup != null)
        {
            position += applIDsGroup.encode(buffer, position, noApplIDsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetApplIDsGroup();
    }

    public void resetApplIDsGroup()
    {
        if (applIDsGroup != null)
        {
            applIDsGroup.reset();
        }
        noApplIDsGroupCounter = 0;
        hasNoApplIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ApplIDReportGrp\",\n");
        if (hasNoApplIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ApplIDsGroup\": [\n");
            final int noApplIDsGroupCounter = this.noApplIDsGroupCounter;
            ApplIDsGroupEncoder applIDsGroup = this.applIDsGroup;
            for (int i = 0; i < noApplIDsGroupCounter; i++)
            {
                indent(builder, level);
                applIDsGroup.appendTo(builder, level + 1);
                if (i < (noApplIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                applIDsGroup = applIDsGroup.next();
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
    public ApplIDReportGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplIDReportGrpEncoder)encoder);
    }

    public ApplIDReportGrpEncoder copyTo(final ApplIDReportGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoApplIDsGroupCounter)
        {
            final int size = this.noApplIDsGroupCounter;
            ApplIDsGroupEncoder applIDsGroup = this.applIDsGroup;
            ApplIDsGroupEncoder applIDsGroupEncoder = encoder.applIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (applIDsGroup != null)
                {
                    applIDsGroup.copyTo(applIDsGroupEncoder);
                    applIDsGroup = applIDsGroup.next();
                    applIDsGroupEncoder = applIDsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
