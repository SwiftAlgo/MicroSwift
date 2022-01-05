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


public class StrmAsgnRptInstrmtGrpEncoder
{
    private static final int noRelatedSymGroupCounterHeaderLength = 4;
    private static final byte[] noRelatedSymGroupCounterHeader = new byte[] {49, 52, 54, (byte) '='};



public static class RelatedSymGroupEncoder
{
    private RelatedSymGroupEncoder next = null;

    public RelatedSymGroupEncoder next()
    {
        if (next == null)
        {
            next = new RelatedSymGroupEncoder();
        }
        return next;
    }

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int streamAsgnTypeHeaderLength = 5;
    private static final byte[] streamAsgnTypeHeader = new byte[] {49, 54, 49, 55, (byte) '='};

    private static final int mDStreamIDHeaderLength = 5;
    private static final byte[] mDStreamIDHeader = new byte[] {49, 53, 48, 48, (byte) '='};

    private static final int streamAsgnRejReasonHeaderLength = 5;
    private static final byte[] streamAsgnRejReasonHeader = new byte[] {49, 53, 48, 50, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public RelatedSymGroupEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public RelatedSymGroupEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public RelatedSymGroupEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public RelatedSymGroupEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public RelatedSymGroupEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public RelatedSymGroupEncoder settlType(final byte[] value)
    {
        return settlType(value, 0, value.length);
    }

    public boolean hasSettlType()
    {
        return settlTypeLength > 0;
    }

    public MutableDirectBuffer settlType()
    {
        return settlType;
    }

    public String settlTypeAsString()
    {
        return settlType.getStringWithoutLengthAscii(settlTypeOffset, settlTypeLength);
    }

    public RelatedSymGroupEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder settlType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlType.wrap(buffer);
            settlTypeOffset = value.offset();
            settlTypeLength = value.length();
        }
        return this;
    }

    public RelatedSymGroupEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public RelatedSymGroupEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public RelatedSymGroupEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public RelatedSymGroupEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private int streamAsgnType;

    private boolean hasStreamAsgnType;

    public boolean hasStreamAsgnType()
    {
        return hasStreamAsgnType;
    }

    public RelatedSymGroupEncoder streamAsgnType(int value)
    {
        streamAsgnType = value;
        hasStreamAsgnType = true;
        return this;
    }

    public int streamAsgnType()
    {
        return streamAsgnType;
    }

    public RelatedSymGroupEncoder streamAsgnType(StreamAsgnType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StreamAsgnType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: streamAsgnType Value: " + value );
            }
            if (value == StreamAsgnType.NULL_VAL)
            {
                return this;
            }
        }
        return streamAsgnType(value.representation());
    }

    private final MutableDirectBuffer mDStreamID = new UnsafeBuffer();

    private int mDStreamIDOffset = 0;

    private int mDStreamIDLength = 0;

    public RelatedSymGroupEncoder mDStreamID(final DirectBuffer value, final int offset, final int length)
    {
        mDStreamID.wrap(value);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder mDStreamID(final DirectBuffer value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public RelatedSymGroupEncoder mDStreamID(final DirectBuffer value)
    {
        return mDStreamID(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder mDStreamID(final byte[] value, final int offset, final int length)
    {
        mDStreamID.wrap(value);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder mDStreamIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mDStreamID, value, offset, length);
        mDStreamIDOffset = offset;
        mDStreamIDLength = length;
        return this;
    }

    public RelatedSymGroupEncoder mDStreamID(final byte[] value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public RelatedSymGroupEncoder mDStreamID(final byte[] value)
    {
        return mDStreamID(value, 0, value.length);
    }

    public boolean hasMDStreamID()
    {
        return mDStreamIDLength > 0;
    }

    public MutableDirectBuffer mDStreamID()
    {
        return mDStreamID;
    }

    public String mDStreamIDAsString()
    {
        return mDStreamID.getStringWithoutLengthAscii(mDStreamIDOffset, mDStreamIDLength);
    }

    public RelatedSymGroupEncoder mDStreamID(final CharSequence value)
    {
        toBytes(value, mDStreamID);
        mDStreamIDOffset = 0;
        mDStreamIDLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder mDStreamID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mDStreamID.wrap(buffer);
            mDStreamIDOffset = value.offset();
            mDStreamIDLength = value.length();
        }
        return this;
    }

    public RelatedSymGroupEncoder mDStreamID(final char[] value)
    {
        return mDStreamID(value, 0, value.length);
    }

    public RelatedSymGroupEncoder mDStreamID(final char[] value, final int length)
    {
        return mDStreamID(value, 0, length);
    }

    public RelatedSymGroupEncoder mDStreamID(final char[] value, final int offset, final int length)
    {
        toBytes(value, mDStreamID, offset, length);
        mDStreamIDOffset = 0;
        mDStreamIDLength = length;
        return this;
    }

    private int streamAsgnRejReason;

    private boolean hasStreamAsgnRejReason;

    public boolean hasStreamAsgnRejReason()
    {
        return hasStreamAsgnRejReason;
    }

    public RelatedSymGroupEncoder streamAsgnRejReason(int value)
    {
        streamAsgnRejReason = value;
        hasStreamAsgnRejReason = true;
        return this;
    }

    public int streamAsgnRejReason()
    {
        return streamAsgnRejReason;
    }

    public RelatedSymGroupEncoder streamAsgnRejReason(StreamAsgnRejReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StreamAsgnRejReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: streamAsgnRejReason Value: " + value );
            }
            if (value == StreamAsgnRejReason.NULL_VAL)
            {
                return this;
            }
        }
        return streamAsgnRejReason(value.representation());
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public RelatedSymGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public RelatedSymGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public RelatedSymGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public RelatedSymGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public RelatedSymGroupEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public RelatedSymGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public RelatedSymGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public RelatedSymGroupEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public RelatedSymGroupEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public RelatedSymGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public RelatedSymGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrument.encode(buffer, position);

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStreamAsgnType)
        {
            buffer.putBytes(position, streamAsgnTypeHeader, 0, streamAsgnTypeHeaderLength);
            position += streamAsgnTypeHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnType);
            buffer.putSeparator(position);
            position++;
        }

        if (mDStreamIDLength > 0)
        {
            buffer.putBytes(position, mDStreamIDHeader, 0, mDStreamIDHeaderLength);
            position += mDStreamIDHeaderLength;
            buffer.putBytes(position, mDStreamID, mDStreamIDOffset, mDStreamIDLength);
            position += mDStreamIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasStreamAsgnRejReason)
        {
            buffer.putBytes(position, streamAsgnRejReasonHeader, 0, streamAsgnRejReasonHeaderLength);
            position += streamAsgnRejReasonHeaderLength;
            position += buffer.putIntAscii(position, streamAsgnRejReason);
            buffer.putSeparator(position);
            position++;
        }

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
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
        this.resetSettlType();
        this.resetStreamAsgnType();
        this.resetMDStreamID();
        this.resetStreamAsgnRejReason();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        instrument.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetStreamAsgnType()
    {
        hasStreamAsgnType = false;
    }

    public void resetMDStreamID()
    {
        mDStreamIDLength = 0;
    }

    public void resetStreamAsgnRejReason()
    {
        hasStreamAsgnRejReason = false;
    }

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
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
        builder.append("\"MessageName\": \"RelatedSymGroup\",\n");
    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

        if (hasStreamAsgnType())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnType\": \"");
            builder.append(streamAsgnType);
            builder.append("\",\n");
        }

        if (hasMDStreamID())
        {
            indent(builder, level);
            builder.append("\"MDStreamID\": \"");
            appendBuffer(builder, mDStreamID, mDStreamIDOffset, mDStreamIDLength);
            builder.append("\",\n");
        }

        if (hasStreamAsgnRejReason())
        {
            indent(builder, level);
            builder.append("\"StreamAsgnRejReason\": \"");
            builder.append(streamAsgnRejReason);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RelatedSymGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RelatedSymGroupEncoder)encoder);
    }

    public RelatedSymGroupEncoder copyTo(final RelatedSymGroupEncoder encoder)
    {
        encoder.reset();

        instrument.copyTo(encoder.instrument());
        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasStreamAsgnType())
        {
            encoder.streamAsgnType(this.streamAsgnType());
        }

        if (hasMDStreamID())
        {
            encoder.mDStreamIDAsCopy(mDStreamID.byteArray(), 0, mDStreamIDLength);
        }

        if (hasStreamAsgnRejReason())
        {
            encoder.streamAsgnRejReason(this.streamAsgnRejReason());
        }

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }
        return encoder;
    }

}
    private int noRelatedSymGroupCounter;

    private boolean hasNoRelatedSymGroupCounter;

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }

    public StrmAsgnRptInstrmtGrpEncoder noRelatedSymGroupCounter(int value)
    {
        noRelatedSymGroupCounter = value;
        hasNoRelatedSymGroupCounter = true;
        return this;
    }

    public int noRelatedSymGroupCounter()
    {
        return noRelatedSymGroupCounter;
    }


    private RelatedSymGroupEncoder relatedSymGroup = null;

    public RelatedSymGroupEncoder relatedSymGroup(final int numberOfElements)
    {
        hasNoRelatedSymGroupCounter = true;
        noRelatedSymGroupCounter = numberOfElements;
        if (relatedSymGroup == null)
        {
            relatedSymGroup = new RelatedSymGroupEncoder();
        }
        return relatedSymGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRelatedSymGroupCounter)
        {
            buffer.putBytes(position, noRelatedSymGroupCounterHeader, 0, noRelatedSymGroupCounterHeaderLength);
            position += noRelatedSymGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRelatedSymGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (relatedSymGroup != null)
        {
            position += relatedSymGroup.encode(buffer, position, noRelatedSymGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRelatedSymGroup();
    }

    public void resetRelatedSymGroup()
    {
        if (relatedSymGroup != null)
        {
            relatedSymGroup.reset();
        }
        noRelatedSymGroupCounter = 0;
        hasNoRelatedSymGroupCounter = false;
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
        builder.append("\"MessageName\": \"StrmAsgnRptInstrmtGrp\",\n");
        if (hasNoRelatedSymGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RelatedSymGroup\": [\n");
            final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            for (int i = 0; i < noRelatedSymGroupCounter; i++)
            {
                indent(builder, level);
                relatedSymGroup.appendTo(builder, level + 1);
                if (i < (noRelatedSymGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                relatedSymGroup = relatedSymGroup.next();
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
    public StrmAsgnRptInstrmtGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrmAsgnRptInstrmtGrpEncoder)encoder);
    }

    public StrmAsgnRptInstrmtGrpEncoder copyTo(final StrmAsgnRptInstrmtGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = encoder.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.copyTo(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
