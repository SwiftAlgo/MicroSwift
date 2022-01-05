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


public class StrmAsgnReqInstrmtGrpEncoder
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

    private static final int mDEntrySizeHeaderLength = 4;
    private static final byte[] mDEntrySizeHeader = new byte[] {50, 55, 49, (byte) '='};

    private static final int mDStreamIDHeaderLength = 5;
    private static final byte[] mDStreamIDHeader = new byte[] {49, 53, 48, 48, (byte) '='};

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

    private final DecimalFloat mDEntrySize = new DecimalFloat();

    private boolean hasMDEntrySize;

    public boolean hasMDEntrySize()
    {
        return hasMDEntrySize;
    }

    public RelatedSymGroupEncoder mDEntrySize(DecimalFloat value)
    {
        mDEntrySize.set(value);
        hasMDEntrySize = true;
        return this;
    }

    public RelatedSymGroupEncoder mDEntrySize(long value, int scale)
    {
        mDEntrySize.set(value, scale);
        hasMDEntrySize = true;
        return this;
    }

    public DecimalFloat mDEntrySize()
    {
        return mDEntrySize;
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

        if (hasMDEntrySize)
        {
            buffer.putBytes(position, mDEntrySizeHeader, 0, mDEntrySizeHeaderLength);
            position += mDEntrySizeHeaderLength;
            position += buffer.putFloatAscii(position, mDEntrySize);
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
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlType();
        this.resetMDEntrySize();
        this.resetMDStreamID();
        instrument.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetMDEntrySize()
    {
        hasMDEntrySize = false;
    }

    public void resetMDStreamID()
    {
        mDStreamIDLength = 0;
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

        if (hasMDEntrySize())
        {
            indent(builder, level);
            builder.append("\"MDEntrySize\": \"");
            mDEntrySize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMDStreamID())
        {
            indent(builder, level);
            builder.append("\"MDStreamID\": \"");
            appendBuffer(builder, mDStreamID, mDStreamIDOffset, mDStreamIDLength);
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

        if (hasMDEntrySize())
        {
            encoder.mDEntrySize(this.mDEntrySize());
        }

        if (hasMDStreamID())
        {
            encoder.mDStreamIDAsCopy(mDStreamID.byteArray(), 0, mDStreamIDLength);
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

    public StrmAsgnReqInstrmtGrpEncoder noRelatedSymGroupCounter(int value)
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
        builder.append("\"MessageName\": \"StrmAsgnReqInstrmtGrp\",\n");
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
    public StrmAsgnReqInstrmtGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((StrmAsgnReqInstrmtGrpEncoder)encoder);
    }

    public StrmAsgnReqInstrmtGrpEncoder copyTo(final StrmAsgnReqInstrmtGrpEncoder encoder)
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
