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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCollGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCollGrpEncoder.TradesGroupEncoder;

public interface TrdCollGrpDecoder 
{



public class TradesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TRADE_REPORT_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_TRADE_REPORT_ID);
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
    public TradesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TradesGroupDecoder next = null;

    public TradesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] tradeReportID = new char[1];

    private boolean hasTradeReportID;

    public char[] tradeReportID()
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        return tradeReportID;
    }

    public boolean hasTradeReportID()
    {
        return hasTradeReportID;
    }


    private int tradeReportIDOffset;

    private int tradeReportIDLength;

    public int tradeReportIDLength()
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        return tradeReportIDLength;
    }

    public String tradeReportIDAsString()
    {
        return hasTradeReportID ? new String(tradeReportID, 0, tradeReportIDLength) : null;
    }

    public void tradeReportID(final AsciiSequenceView view)
    {
        if (!hasTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeReportID");
        }

        view.wrap(buffer, tradeReportIDOffset, tradeReportIDLength);
    }


    private char[] secondaryTradeReportID = new char[1];

    private boolean hasSecondaryTradeReportID;

    public char[] secondaryTradeReportID()
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        return secondaryTradeReportID;
    }

    public boolean hasSecondaryTradeReportID()
    {
        return hasSecondaryTradeReportID;
    }


    private int secondaryTradeReportIDOffset;

    private int secondaryTradeReportIDLength;

    public int secondaryTradeReportIDLength()
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        return secondaryTradeReportIDLength;
    }

    public String secondaryTradeReportIDAsString()
    {
        return hasSecondaryTradeReportID ? new String(secondaryTradeReportID, 0, secondaryTradeReportIDLength) : null;
    }

    public void secondaryTradeReportID(final AsciiSequenceView view)
    {
        if (!hasSecondaryTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryTradeReportID");
        }

        view.wrap(buffer, secondaryTradeReportIDOffset, secondaryTradeReportIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradesGroup
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
                    next = new TradesGroupDecoder(trailer, messageFields);
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
            case Constants.TRADE_REPORT_ID:
                hasTradeReportID = true;
                tradeReportID = buffer.getChars(tradeReportID, valueOffset, valueLength);
                tradeReportIDOffset = valueOffset;
                tradeReportIDLength = valueLength;
                break;

            case Constants.SECONDARY_TRADE_REPORT_ID:
                hasSecondaryTradeReportID = true;
                secondaryTradeReportID = buffer.getChars(secondaryTradeReportID, valueOffset, valueLength);
                secondaryTradeReportIDOffset = valueOffset;
                secondaryTradeReportIDLength = valueLength;
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
        this.resetTradeReportID();
        this.resetSecondaryTradeReportID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradeReportID()
    {
        hasTradeReportID = false;
    }

    public void resetSecondaryTradeReportID()
    {
        hasSecondaryTradeReportID = false;
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
        builder.append("\"MessageName\": \"TradesGroup\",\n");
        if (hasTradeReportID())
        {
            indent(builder, level);
            builder.append("\"TradeReportID\": \"");
            builder.append(this.tradeReportID(), 0, tradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SecondaryTradeReportID\": \"");
            builder.append(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradesGroupEncoder)encoder);
    }

    public TradesGroupEncoder toEncoder(final TradesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradeReportID())
        {
            encoder.tradeReportID(this.tradeReportID(), 0, tradeReportIDLength());
        }

        if (hasSecondaryTradeReportID())
        {
            encoder.secondaryTradeReportID(this.secondaryTradeReportID(), 0, secondaryTradeReportIDLength());
        }
        return encoder;
    }

}
    public class TradesGroupIterator implements Iterable<TradesGroupDecoder>, java.util.Iterator<TradesGroupDecoder>
    {
        private final TrdCollGrpDecoder parent;
        private int remainder;
        private TradesGroupDecoder current;

        public TradesGroupIterator(final TrdCollGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public TradesGroupDecoder next()
        {
            remainder--;
            final TradesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoTradesGroupCounter() ? parent.noTradesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.tradesGroup();
        }
        public TradesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public TradesGroupIterator tradesGroupIterator();
    public int noTradesGroupCounter();
    public boolean hasNoTradesGroupCounter();
    public TradesGroupDecoder tradesGroup();

}
