/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import uk.co.real_logic.artio.builder.AbstractSequenceResetEncoder;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import com.swiftalgo.ms.codecs.fix44.*;


public class SequenceResetEncoder implements AbstractSequenceResetEncoder
{
    public long messageType()
    {
        return 52L;
    }

    public SequenceResetEncoder()
    {
        header.msgType("4");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int gapFillFlagHeaderLength = 4;
    private static final byte[] gapFillFlagHeader = new byte[] {49, 50, 51, (byte) '='};

    private static final int newSeqNoHeaderLength = 3;
    private static final byte[] newSeqNoHeader = new byte[] {51, 54, (byte) '='};

    private boolean gapFillFlag;

    private boolean hasGapFillFlag;

    public boolean hasGapFillFlag()
    {
        return hasGapFillFlag;
    }

    public SequenceResetEncoder gapFillFlag(boolean value)
    {
        gapFillFlag = value;
        hasGapFillFlag = true;
        return this;
    }

    public boolean gapFillFlag()
    {
        return gapFillFlag;
    }

    private int newSeqNo;

    private boolean hasNewSeqNo;

    public boolean hasNewSeqNo()
    {
        return hasNewSeqNo;
    }

    public SequenceResetEncoder newSeqNo(int value)
    {
        newSeqNo = value;
        hasNewSeqNo = true;
        return this;
    }

    public int newSeqNo()
    {
        return newSeqNo;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasGapFillFlag)
        {
            buffer.putBytes(position, gapFillFlagHeader, 0, gapFillFlagHeaderLength);
            position += gapFillFlagHeaderLength;
            position += buffer.putBooleanAscii(position, gapFillFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNewSeqNo)
        {
            buffer.putBytes(position, newSeqNoHeader, 0, newSeqNoHeaderLength);
            position += newSeqNoHeaderLength;
            position += buffer.putIntAscii(position, newSeqNo);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NewSeqNo");
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetGapFillFlag();
        this.resetNewSeqNo();
    }

    public void resetGapFillFlag()
    {
        hasGapFillFlag = false;
    }

    public void resetNewSeqNo()
    {
        hasNewSeqNo = false;
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
        builder.append("\"MessageName\": \"SequenceReset\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasGapFillFlag())
        {
            indent(builder, level);
            builder.append("\"GapFillFlag\": \"");
            builder.append(gapFillFlag);
            builder.append("\",\n");
        }

        if (hasNewSeqNo())
        {
            indent(builder, level);
            builder.append("\"NewSeqNo\": \"");
            builder.append(newSeqNo);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SequenceResetEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SequenceResetEncoder)encoder);
    }

    public SequenceResetEncoder copyTo(final SequenceResetEncoder encoder)
    {
        encoder.reset();
        if (hasGapFillFlag())
        {
            encoder.gapFillFlag(this.gapFillFlag());
        }

        if (hasNewSeqNo())
        {
            encoder.newSeqNo(this.newSeqNo());
        }
        return encoder;
    }

}
