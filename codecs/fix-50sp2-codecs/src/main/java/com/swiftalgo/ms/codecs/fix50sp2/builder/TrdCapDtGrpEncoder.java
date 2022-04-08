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


public class TrdCapDtGrpEncoder
{
    private static final int noDatesGroupCounterHeaderLength = 4;
    private static final byte[] noDatesGroupCounterHeader = new byte[] {53, 56, 48, (byte) '='};



public static class DatesGroupEncoder
{
    private DatesGroupEncoder next = null;

    public DatesGroupEncoder next()
    {
        if (next == null)
        {
            next = new DatesGroupEncoder();
        }
        return next;
    }

    private static final int tradeDateHeaderLength = 3;
    private static final byte[] tradeDateHeader = new byte[] {55, 53, (byte) '='};

    private static final int lastUpdateTimeHeaderLength = 4;
    private static final byte[] lastUpdateTimeHeader = new byte[] {55, 55, 57, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private final MutableDirectBuffer tradeDate = new UnsafeBuffer();

    private int tradeDateOffset = 0;

    private int tradeDateLength = 0;

    public DatesGroupEncoder tradeDate(final DirectBuffer value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public DatesGroupEncoder tradeDate(final DirectBuffer value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public DatesGroupEncoder tradeDate(final DirectBuffer value)
    {
        return tradeDate(value, 0, value.capacity());
    }

    public DatesGroupEncoder tradeDate(final byte[] value, final int offset, final int length)
    {
        tradeDate.wrap(value);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public DatesGroupEncoder tradeDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradeDate, value, offset, length);
        tradeDateOffset = offset;
        tradeDateLength = length;
        return this;
    }

    public DatesGroupEncoder tradeDate(final byte[] value, final int length)
    {
        return tradeDate(value, 0, length);
    }

    public DatesGroupEncoder tradeDate(final byte[] value)
    {
        return tradeDate(value, 0, value.length);
    }

    public boolean hasTradeDate()
    {
        return tradeDateLength > 0;
    }

    public MutableDirectBuffer tradeDate()
    {
        return tradeDate;
    }

    public String tradeDateAsString()
    {
        return tradeDate.getStringWithoutLengthAscii(tradeDateOffset, tradeDateLength);
    }

    private final MutableDirectBuffer lastUpdateTime = new UnsafeBuffer();

    private int lastUpdateTimeOffset = 0;

    private int lastUpdateTimeLength = 0;

    public DatesGroupEncoder lastUpdateTime(final DirectBuffer value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public DatesGroupEncoder lastUpdateTime(final DirectBuffer value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public DatesGroupEncoder lastUpdateTime(final DirectBuffer value)
    {
        return lastUpdateTime(value, 0, value.capacity());
    }

    public DatesGroupEncoder lastUpdateTime(final byte[] value, final int offset, final int length)
    {
        lastUpdateTime.wrap(value);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public DatesGroupEncoder lastUpdateTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(lastUpdateTime, value, offset, length);
        lastUpdateTimeOffset = offset;
        lastUpdateTimeLength = length;
        return this;
    }

    public DatesGroupEncoder lastUpdateTime(final byte[] value, final int length)
    {
        return lastUpdateTime(value, 0, length);
    }

    public DatesGroupEncoder lastUpdateTime(final byte[] value)
    {
        return lastUpdateTime(value, 0, value.length);
    }

    public boolean hasLastUpdateTime()
    {
        return lastUpdateTimeLength > 0;
    }

    public MutableDirectBuffer lastUpdateTime()
    {
        return lastUpdateTime;
    }

    public String lastUpdateTimeAsString()
    {
        return lastUpdateTime.getStringWithoutLengthAscii(lastUpdateTimeOffset, lastUpdateTimeLength);
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public DatesGroupEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DatesGroupEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public DatesGroupEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public DatesGroupEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DatesGroupEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DatesGroupEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public DatesGroupEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (tradeDateLength > 0)
        {
            buffer.putBytes(position, tradeDateHeader, 0, tradeDateHeaderLength);
            position += tradeDateHeaderLength;
            buffer.putBytes(position, tradeDate, tradeDateOffset, tradeDateLength);
            position += tradeDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (lastUpdateTimeLength > 0)
        {
            buffer.putBytes(position, lastUpdateTimeHeader, 0, lastUpdateTimeHeaderLength);
            position += lastUpdateTimeHeaderLength;
            buffer.putBytes(position, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            position += lastUpdateTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
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
        this.resetTradeDate();
        this.resetLastUpdateTime();
        this.resetTransactTime();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetTradeDate()
    {
        tradeDateLength = 0;
    }

    public void resetLastUpdateTime()
    {
        lastUpdateTimeLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
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
        builder.append("\"MessageName\": \"DatesGroup\",\n");
        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendBuffer(builder, tradeDate, tradeDateOffset, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendBuffer(builder, lastUpdateTime, lastUpdateTimeOffset, lastUpdateTimeLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DatesGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DatesGroupEncoder)encoder);
    }

    public DatesGroupEncoder copyTo(final DatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(tradeDate.byteArray(), 0, tradeDateLength);
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(lastUpdateTime.byteArray(), 0, lastUpdateTimeLength);
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }
        return encoder;
    }

}
    private int noDatesGroupCounter;

    private boolean hasNoDatesGroupCounter;

    public boolean hasNoDatesGroupCounter()
    {
        return hasNoDatesGroupCounter;
    }

    public TrdCapDtGrpEncoder noDatesGroupCounter(int value)
    {
        noDatesGroupCounter = value;
        hasNoDatesGroupCounter = true;
        return this;
    }

    public int noDatesGroupCounter()
    {
        return noDatesGroupCounter;
    }


    private DatesGroupEncoder datesGroup = null;

    public DatesGroupEncoder datesGroup(final int numberOfElements)
    {
        hasNoDatesGroupCounter = true;
        noDatesGroupCounter = numberOfElements;
        if (datesGroup == null)
        {
            datesGroup = new DatesGroupEncoder();
        }
        return datesGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoDatesGroupCounter)
        {
            buffer.putBytes(position, noDatesGroupCounterHeader, 0, noDatesGroupCounterHeaderLength);
            position += noDatesGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDatesGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (datesGroup != null)
        {
            position += datesGroup.encode(buffer, position, noDatesGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetDatesGroup();
    }

    public void resetDatesGroup()
    {
        if (datesGroup != null)
        {
            datesGroup.reset();
        }
        noDatesGroupCounter = 0;
        hasNoDatesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TrdCapDtGrp\",\n");
        if (hasNoDatesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DatesGroup\": [\n");
            final int noDatesGroupCounter = this.noDatesGroupCounter;
            DatesGroupEncoder datesGroup = this.datesGroup;
            for (int i = 0; i < noDatesGroupCounter; i++)
            {
                indent(builder, level);
                datesGroup.appendTo(builder, level + 1);
                if (i < (noDatesGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                datesGroup = datesGroup.next();
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
    public TrdCapDtGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TrdCapDtGrpEncoder)encoder);
    }

    public TrdCapDtGrpEncoder copyTo(final TrdCapDtGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoDatesGroupCounter)
        {
            final int size = this.noDatesGroupCounter;
            DatesGroupEncoder datesGroup = this.datesGroup;
            DatesGroupEncoder datesGroupEncoder = encoder.datesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (datesGroup != null)
                {
                    datesGroup.copyTo(datesGroupEncoder);
                    datesGroup = datesGroup.next();
                    datesGroupEncoder = datesGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
