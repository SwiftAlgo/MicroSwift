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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdgSesGrpEncoder.TradingSessionsGroupEncoder;

public interface TrdgSesGrpDecoder 
{



public class TradingSessionsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
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
        if (hasTradingSessionID)
        {
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionSubID)
        {
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionSubID.isValid(tradingSessionSubIDWrapper))
        {
            invalidTagId = 625;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public TradingSessionsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TradingSessionsGroupDecoder next = null;

    public TradingSessionsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] tradingSessionID = new char[1];

    private boolean hasTradingSessionID;

    public char[] tradingSessionID()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionID;
    }

    public boolean hasTradingSessionID()
    {
        return hasTradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return hasTradingSessionID ? new String(tradingSessionID, 0, tradingSessionIDLength) : null;
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
        if (!hasTradingSessionID)
 return TradingSessionID.NULL_VAL;
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        return TradingSessionID.decode(tradingSessionIDWrapper);
    }

    private char[] tradingSessionSubID = new char[1];

    private boolean hasTradingSessionSubID;

    public char[] tradingSessionSubID()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubID;
    }

    public boolean hasTradingSessionSubID()
    {
        return hasTradingSessionSubID;
    }


    private int tradingSessionSubIDOffset;

    private int tradingSessionSubIDLength;

    public int tradingSessionSubIDLength()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubIDLength;
    }

    public String tradingSessionSubIDAsString()
    {
        return hasTradingSessionSubID ? new String(tradingSessionSubID, 0, tradingSessionSubIDLength) : null;
    }

    public void tradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        view.wrap(buffer, tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }


    private final CharArrayWrapper tradingSessionSubIDWrapper = new CharArrayWrapper();
    public TradingSessionSubID tradingSessionSubIDAsEnum()
    {
        if (!hasTradingSessionSubID)
 return TradingSessionSubID.NULL_VAL;
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        return TradingSessionSubID.decode(tradingSessionSubIDWrapper);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionsGroup
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
                    next = new TradingSessionsGroupDecoder(trailer, messageFields);
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
            case Constants.TRADING_SESSION_ID:
                hasTradingSessionID = true;
                tradingSessionID = buffer.getChars(tradingSessionID, valueOffset, valueLength);
                tradingSessionIDOffset = valueOffset;
                tradingSessionIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_SUB_ID:
                hasTradingSessionSubID = true;
                tradingSessionSubID = buffer.getChars(tradingSessionSubID, valueOffset, valueLength);
                tradingSessionSubIDOffset = valueOffset;
                tradingSessionSubIDLength = valueLength;
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
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TrdgSesGrpEncoder.TradingSessionsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrdgSesGrpEncoder.TradingSessionsGroupEncoder)encoder);
    }

    public TrdgSesGrpEncoder.TradingSessionsGroupEncoder toEncoder(final TrdgSesGrpEncoder.TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }
        return encoder;
    }

}
    public class TradingSessionsGroupIterator implements Iterable<TradingSessionsGroupDecoder>, java.util.Iterator<TradingSessionsGroupDecoder>
    {
        private final TrdgSesGrpDecoder parent;
        private int remainder;
        private TradingSessionsGroupDecoder current;

        public TradingSessionsGroupIterator(final TrdgSesGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public TradingSessionsGroupDecoder next()
        {
            remainder--;
            final TradingSessionsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoTradingSessionsGroupCounter() ? parent.noTradingSessionsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.tradingSessionsGroup();
        }

        public TradingSessionsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public TradingSessionsGroupIterator tradingSessionsGroupIterator();
    public int noTradingSessionsGroupCounter();
    public boolean hasNoTradingSessionsGroupCounter();
    public TradingSessionsGroupDecoder tradingSessionsGroup();

}
