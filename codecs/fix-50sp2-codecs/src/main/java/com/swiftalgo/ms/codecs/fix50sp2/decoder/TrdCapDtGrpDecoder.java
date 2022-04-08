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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapDtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapDtGrpEncoder.DatesGroupEncoder;

public interface TrdCapDtGrpDecoder 
{



public class DatesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TRADE_DATE);
            ALL_GROUP_FIELDS.add(Constants.LAST_UPDATE_TIME);
            ALL_GROUP_FIELDS.add(Constants.TRANSACT_TIME);
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DatesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DatesGroupDecoder next = null;

    public DatesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private byte[] tradeDate = new byte[8];

    private boolean hasTradeDate;

    public byte[] tradeDate()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDate;
    }

    public boolean hasTradeDate()
    {
        return hasTradeDate;
    }


    private int tradeDateOffset;

    private int tradeDateLength;

    public int tradeDateLength()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDateLength;
    }

    public String tradeDateAsString()
    {
        return hasTradeDate ? new String(tradeDate, 0, tradeDateLength) : null;
    }

    public void tradeDate(final AsciiSequenceView view)
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        view.wrap(buffer, tradeDateOffset, tradeDateLength);
    }


    private byte[] lastUpdateTime = new byte[24];

    private boolean hasLastUpdateTime;

    public byte[] lastUpdateTime()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTime;
    }

    public boolean hasLastUpdateTime()
    {
        return hasLastUpdateTime;
    }


    private int lastUpdateTimeOffset;

    private int lastUpdateTimeLength;

    public int lastUpdateTimeLength()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTimeLength;
    }

    public String lastUpdateTimeAsString()
    {
        return hasLastUpdateTime ? new String(lastUpdateTime, 0, lastUpdateTimeLength) : null;
    }

    public void lastUpdateTime(final AsciiSequenceView view)
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        view.wrap(buffer, lastUpdateTimeOffset, lastUpdateTimeLength);
    }


    private byte[] transactTime = new byte[24];

    private boolean hasTransactTime;

    public byte[] transactTime()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTime;
    }

    public boolean hasTransactTime()
    {
        return hasTransactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return hasTransactTime ? new String(transactTime, 0, transactTimeLength) : null;
    }

    public void transactTime(final AsciiSequenceView view)
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DatesGroup
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
                    next = new DatesGroupDecoder(trailer, messageFields);
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
            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.LAST_UPDATE_TIME:
                hasLastUpdateTime = true;
                lastUpdateTime = buffer.getBytes(lastUpdateTime, valueOffset, valueLength);
                lastUpdateTimeOffset = valueOffset;
                lastUpdateTimeLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
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
        this.resetTradeDate();
        this.resetLastUpdateTime();
        this.resetTransactTime();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetLastUpdateTime()
    {
        hasLastUpdateTime = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
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
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendData(builder, lastUpdateTime, lastUpdateTimeLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdCapDtGrpEncoder.DatesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrdCapDtGrpEncoder.DatesGroupEncoder)encoder);
    }

    public TrdCapDtGrpEncoder.DatesGroupEncoder toEncoder(final TrdCapDtGrpEncoder.DatesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(this.lastUpdateTime(), 0, lastUpdateTimeLength());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }
        return encoder;
    }

}
    public class DatesGroupIterator implements Iterable<DatesGroupDecoder>, java.util.Iterator<DatesGroupDecoder>
    {
        private final TrdCapDtGrpDecoder parent;
        private int remainder;
        private DatesGroupDecoder current;

        public DatesGroupIterator(final TrdCapDtGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public DatesGroupDecoder next()
        {
            remainder--;
            final DatesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoDatesGroupCounter() ? parent.noDatesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.datesGroup();
        }

        public DatesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public DatesGroupIterator datesGroupIterator();
    public int noDatesGroupCounter();
    public boolean hasNoDatesGroupCounter();
    public DatesGroupDecoder datesGroup();

}
