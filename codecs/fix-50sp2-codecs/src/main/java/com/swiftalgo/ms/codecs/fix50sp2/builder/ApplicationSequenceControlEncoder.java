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


public class ApplicationSequenceControlEncoder
{
    private static final int applIDHeaderLength = 5;
    private static final byte[] applIDHeader = new byte[] {49, 49, 56, 48, (byte) '='};

    private static final int applSeqNumHeaderLength = 5;
    private static final byte[] applSeqNumHeader = new byte[] {49, 49, 56, 49, (byte) '='};

    private static final int applLastSeqNumHeaderLength = 5;
    private static final byte[] applLastSeqNumHeader = new byte[] {49, 51, 53, 48, (byte) '='};

    private static final int applResendFlagHeaderLength = 5;
    private static final byte[] applResendFlagHeader = new byte[] {49, 51, 53, 50, (byte) '='};

    private final MutableDirectBuffer applID = new UnsafeBuffer();

    private int applIDOffset = 0;

    private int applIDLength = 0;

    public ApplicationSequenceControlEncoder applID(final DirectBuffer value, final int offset, final int length)
    {
        applID.wrap(value);
        applIDOffset = offset;
        applIDLength = length;
        return this;
    }

    public ApplicationSequenceControlEncoder applID(final DirectBuffer value, final int length)
    {
        return applID(value, 0, length);
    }

    public ApplicationSequenceControlEncoder applID(final DirectBuffer value)
    {
        return applID(value, 0, value.capacity());
    }

    public ApplicationSequenceControlEncoder applID(final byte[] value, final int offset, final int length)
    {
        applID.wrap(value);
        applIDOffset = offset;
        applIDLength = length;
        return this;
    }

    public ApplicationSequenceControlEncoder applIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(applID, value, offset, length);
        applIDOffset = offset;
        applIDLength = length;
        return this;
    }

    public ApplicationSequenceControlEncoder applID(final byte[] value, final int length)
    {
        return applID(value, 0, length);
    }

    public ApplicationSequenceControlEncoder applID(final byte[] value)
    {
        return applID(value, 0, value.length);
    }

    public boolean hasApplID()
    {
        return applIDLength > 0;
    }

    public MutableDirectBuffer applID()
    {
        return applID;
    }

    public String applIDAsString()
    {
        return applID.getStringWithoutLengthAscii(applIDOffset, applIDLength);
    }

    public ApplicationSequenceControlEncoder applID(final CharSequence value)
    {
        toBytes(value, applID);
        applIDOffset = 0;
        applIDLength = value.length();
        return this;
    }

    public ApplicationSequenceControlEncoder applID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            applID.wrap(buffer);
            applIDOffset = value.offset();
            applIDLength = value.length();
        }
        return this;
    }

    public ApplicationSequenceControlEncoder applID(final char[] value)
    {
        return applID(value, 0, value.length);
    }

    public ApplicationSequenceControlEncoder applID(final char[] value, final int length)
    {
        return applID(value, 0, length);
    }

    public ApplicationSequenceControlEncoder applID(final char[] value, final int offset, final int length)
    {
        toBytes(value, applID, offset, length);
        applIDOffset = 0;
        applIDLength = length;
        return this;
    }

    private int applSeqNum;

    private boolean hasApplSeqNum;

    public boolean hasApplSeqNum()
    {
        return hasApplSeqNum;
    }

    public ApplicationSequenceControlEncoder applSeqNum(int value)
    {
        applSeqNum = value;
        hasApplSeqNum = true;
        return this;
    }

    public int applSeqNum()
    {
        return applSeqNum;
    }

    private int applLastSeqNum;

    private boolean hasApplLastSeqNum;

    public boolean hasApplLastSeqNum()
    {
        return hasApplLastSeqNum;
    }

    public ApplicationSequenceControlEncoder applLastSeqNum(int value)
    {
        applLastSeqNum = value;
        hasApplLastSeqNum = true;
        return this;
    }

    public int applLastSeqNum()
    {
        return applLastSeqNum;
    }

    private boolean applResendFlag;

    private boolean hasApplResendFlag;

    public boolean hasApplResendFlag()
    {
        return hasApplResendFlag;
    }

    public ApplicationSequenceControlEncoder applResendFlag(boolean value)
    {
        applResendFlag = value;
        hasApplResendFlag = true;
        return this;
    }

    public boolean applResendFlag()
    {
        return applResendFlag;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (applIDLength > 0)
        {
            buffer.putBytes(position, applIDHeader, 0, applIDHeaderLength);
            position += applIDHeaderLength;
            buffer.putBytes(position, applID, applIDOffset, applIDLength);
            position += applIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplSeqNum)
        {
            buffer.putBytes(position, applSeqNumHeader, 0, applSeqNumHeaderLength);
            position += applSeqNumHeaderLength;
            position += buffer.putIntAscii(position, applSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplLastSeqNum)
        {
            buffer.putBytes(position, applLastSeqNumHeader, 0, applLastSeqNumHeaderLength);
            position += applLastSeqNumHeaderLength;
            position += buffer.putIntAscii(position, applLastSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (hasApplResendFlag)
        {
            buffer.putBytes(position, applResendFlagHeader, 0, applResendFlagHeaderLength);
            position += applResendFlagHeaderLength;
            position += buffer.putBooleanAscii(position, applResendFlag);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
    }

    public void resetApplID()
    {
        applIDLength = 0;
    }

    public void resetApplSeqNum()
    {
        hasApplSeqNum = false;
    }

    public void resetApplLastSeqNum()
    {
        hasApplLastSeqNum = false;
    }

    public void resetApplResendFlag()
    {
        hasApplResendFlag = false;
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
        builder.append("\"MessageName\": \"ApplicationSequenceControl\",\n");
        if (hasApplID())
        {
            indent(builder, level);
            builder.append("\"ApplID\": \"");
            appendBuffer(builder, applID, applIDOffset, applIDLength);
            builder.append("\",\n");
        }

        if (hasApplSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplSeqNum\": \"");
            builder.append(applSeqNum);
            builder.append("\",\n");
        }

        if (hasApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplLastSeqNum\": \"");
            builder.append(applLastSeqNum);
            builder.append("\",\n");
        }

        if (hasApplResendFlag())
        {
            indent(builder, level);
            builder.append("\"ApplResendFlag\": \"");
            builder.append(applResendFlag);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ApplicationSequenceControlEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ApplicationSequenceControlEncoder)encoder);
    }

    public ApplicationSequenceControlEncoder copyTo(final ApplicationSequenceControlEncoder encoder)
    {
        encoder.reset();
        if (hasApplID())
        {
            encoder.applIDAsCopy(applID.byteArray(), 0, applIDLength);
        }

        if (hasApplSeqNum())
        {
            encoder.applSeqNum(this.applSeqNum());
        }

        if (hasApplLastSeqNum())
        {
            encoder.applLastSeqNum(this.applLastSeqNum());
        }

        if (hasApplResendFlag())
        {
            encoder.applResendFlag(this.applResendFlag());
        }
        return encoder;
    }

}
