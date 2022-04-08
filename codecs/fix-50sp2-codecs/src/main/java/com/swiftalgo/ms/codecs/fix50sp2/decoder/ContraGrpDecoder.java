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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ContraGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ContraGrpEncoder.ContraBrokersGroupEncoder;

public interface ContraGrpDecoder 
{



public class ContraBrokersGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.CONTRA_BROKER);
            ALL_GROUP_FIELDS.add(Constants.CONTRA_TRADER);
            ALL_GROUP_FIELDS.add(Constants.CONTRA_TRADE_QTY);
            ALL_GROUP_FIELDS.add(Constants.CONTRA_TRADE_TIME);
            ALL_GROUP_FIELDS.add(Constants.CONTRA_LEG_REF_ID);
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
    public ContraBrokersGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ContraBrokersGroupDecoder next = null;

    public ContraBrokersGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);

    private char[] contraBroker = new char[1];

    private boolean hasContraBroker;

    public char[] contraBroker()
    {
        if (!hasContraBroker)
        {
            throw new IllegalArgumentException("No value for optional field: ContraBroker");
        }

        return contraBroker;
    }

    public boolean hasContraBroker()
    {
        return hasContraBroker;
    }


    private int contraBrokerOffset;

    private int contraBrokerLength;

    public int contraBrokerLength()
    {
        if (!hasContraBroker)
        {
            throw new IllegalArgumentException("No value for optional field: ContraBroker");
        }

        return contraBrokerLength;
    }

    public String contraBrokerAsString()
    {
        return hasContraBroker ? new String(contraBroker, 0, contraBrokerLength) : null;
    }

    public void contraBroker(final AsciiSequenceView view)
    {
        if (!hasContraBroker)
        {
            throw new IllegalArgumentException("No value for optional field: ContraBroker");
        }

        view.wrap(buffer, contraBrokerOffset, contraBrokerLength);
    }


    private final CharArrayWrapper contraBrokerWrapper = new CharArrayWrapper();
    private char[] contraTrader = new char[1];

    private boolean hasContraTrader;

    public char[] contraTrader()
    {
        if (!hasContraTrader)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTrader");
        }

        return contraTrader;
    }

    public boolean hasContraTrader()
    {
        return hasContraTrader;
    }


    private int contraTraderOffset;

    private int contraTraderLength;

    public int contraTraderLength()
    {
        if (!hasContraTrader)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTrader");
        }

        return contraTraderLength;
    }

    public String contraTraderAsString()
    {
        return hasContraTrader ? new String(contraTrader, 0, contraTraderLength) : null;
    }

    public void contraTrader(final AsciiSequenceView view)
    {
        if (!hasContraTrader)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTrader");
        }

        view.wrap(buffer, contraTraderOffset, contraTraderLength);
    }


    private final CharArrayWrapper contraTraderWrapper = new CharArrayWrapper();
    private DecimalFloat contraTradeQty = DecimalFloat.newNaNValue();

    private boolean hasContraTradeQty;

    public DecimalFloat contraTradeQty()
    {
        if (!hasContraTradeQty)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTradeQty");
        }

        return contraTradeQty;
    }

    public boolean hasContraTradeQty()
    {
        return hasContraTradeQty;
    }



    private byte[] contraTradeTime = new byte[24];

    private boolean hasContraTradeTime;

    public byte[] contraTradeTime()
    {
        if (!hasContraTradeTime)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTradeTime");
        }

        return contraTradeTime;
    }

    public boolean hasContraTradeTime()
    {
        return hasContraTradeTime;
    }


    private int contraTradeTimeOffset;

    private int contraTradeTimeLength;

    public int contraTradeTimeLength()
    {
        if (!hasContraTradeTime)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTradeTime");
        }

        return contraTradeTimeLength;
    }

    public String contraTradeTimeAsString()
    {
        return hasContraTradeTime ? new String(contraTradeTime, 0, contraTradeTimeLength) : null;
    }

    public void contraTradeTime(final AsciiSequenceView view)
    {
        if (!hasContraTradeTime)
        {
            throw new IllegalArgumentException("No value for optional field: ContraTradeTime");
        }

        view.wrap(buffer, contraTradeTimeOffset, contraTradeTimeLength);
    }


    private char[] contraLegRefID = new char[1];

    private boolean hasContraLegRefID;

    public char[] contraLegRefID()
    {
        if (!hasContraLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: ContraLegRefID");
        }

        return contraLegRefID;
    }

    public boolean hasContraLegRefID()
    {
        return hasContraLegRefID;
    }


    private int contraLegRefIDOffset;

    private int contraLegRefIDLength;

    public int contraLegRefIDLength()
    {
        if (!hasContraLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: ContraLegRefID");
        }

        return contraLegRefIDLength;
    }

    public String contraLegRefIDAsString()
    {
        return hasContraLegRefID ? new String(contraLegRefID, 0, contraLegRefIDLength) : null;
    }

    public void contraLegRefID(final AsciiSequenceView view)
    {
        if (!hasContraLegRefID)
        {
            throw new IllegalArgumentException("No value for optional field: ContraLegRefID");
        }

        view.wrap(buffer, contraLegRefIDOffset, contraLegRefIDLength);
    }


    private final CharArrayWrapper contraLegRefIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ContraBrokersGroup
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
                    next = new ContraBrokersGroupDecoder(trailer, messageFields);
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
            case Constants.CONTRA_BROKER:
                hasContraBroker = true;
                contraBroker = buffer.getChars(contraBroker, valueOffset, valueLength);
                contraBrokerOffset = valueOffset;
                contraBrokerLength = valueLength;
                break;

            case Constants.CONTRA_TRADER:
                hasContraTrader = true;
                contraTrader = buffer.getChars(contraTrader, valueOffset, valueLength);
                contraTraderOffset = valueOffset;
                contraTraderLength = valueLength;
                break;

            case Constants.CONTRA_TRADE_QTY:
                hasContraTradeQty = true;
                contraTradeQty = getFloat(buffer, contraTradeQty, valueOffset, valueLength, 437, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONTRA_TRADE_TIME:
                hasContraTradeTime = true;
                contraTradeTime = buffer.getBytes(contraTradeTime, valueOffset, valueLength);
                contraTradeTimeOffset = valueOffset;
                contraTradeTimeLength = valueLength;
                break;

            case Constants.CONTRA_LEG_REF_ID:
                hasContraLegRefID = true;
                contraLegRefID = buffer.getChars(contraLegRefID, valueOffset, valueLength);
                contraLegRefIDOffset = valueOffset;
                contraLegRefIDLength = valueLength;
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
        this.resetContraBroker();
        this.resetContraTrader();
        this.resetContraTradeQty();
        this.resetContraTradeTime();
        this.resetContraLegRefID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetContraBroker()
    {
        hasContraBroker = false;
    }

    public void resetContraTrader()
    {
        hasContraTrader = false;
    }

    public void resetContraTradeQty()
    {
        hasContraTradeQty = false;
    }

    public void resetContraTradeTime()
    {
        hasContraTradeTime = false;
    }

    public void resetContraLegRefID()
    {
        hasContraLegRefID = false;
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
        builder.append("\"MessageName\": \"ContraBrokersGroup\",\n");
        if (hasContraBroker())
        {
            indent(builder, level);
            builder.append("\"ContraBroker\": \"");
            builder.append(this.contraBroker(), 0, contraBrokerLength());
            builder.append("\",\n");
        }

        if (hasContraTrader())
        {
            indent(builder, level);
            builder.append("\"ContraTrader\": \"");
            builder.append(this.contraTrader(), 0, contraTraderLength());
            builder.append("\",\n");
        }

        if (hasContraTradeQty())
        {
            indent(builder, level);
            builder.append("\"ContraTradeQty\": \"");
            contraTradeQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasContraTradeTime())
        {
            indent(builder, level);
            builder.append("\"ContraTradeTime\": \"");
            appendData(builder, contraTradeTime, contraTradeTimeLength);
            builder.append("\",\n");
        }

        if (hasContraLegRefID())
        {
            indent(builder, level);
            builder.append("\"ContraLegRefID\": \"");
            builder.append(this.contraLegRefID(), 0, contraLegRefIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ContraGrpEncoder.ContraBrokersGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ContraGrpEncoder.ContraBrokersGroupEncoder)encoder);
    }

    public ContraGrpEncoder.ContraBrokersGroupEncoder toEncoder(final ContraGrpEncoder.ContraBrokersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasContraBroker())
        {
            encoder.contraBroker(this.contraBroker(), 0, contraBrokerLength());
        }

        if (hasContraTrader())
        {
            encoder.contraTrader(this.contraTrader(), 0, contraTraderLength());
        }

        if (hasContraTradeQty())
        {
            encoder.contraTradeQty(this.contraTradeQty());
        }

        if (hasContraTradeTime())
        {
            encoder.contraTradeTimeAsCopy(this.contraTradeTime(), 0, contraTradeTimeLength());
        }

        if (hasContraLegRefID())
        {
            encoder.contraLegRefID(this.contraLegRefID(), 0, contraLegRefIDLength());
        }
        return encoder;
    }

}
    public class ContraBrokersGroupIterator implements Iterable<ContraBrokersGroupDecoder>, java.util.Iterator<ContraBrokersGroupDecoder>
    {
        private final ContraGrpDecoder parent;
        private int remainder;
        private ContraBrokersGroupDecoder current;

        public ContraBrokersGroupIterator(final ContraGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public ContraBrokersGroupDecoder next()
        {
            remainder--;
            final ContraBrokersGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoContraBrokersGroupCounter() ? parent.noContraBrokersGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.contraBrokersGroup();
        }

        public ContraBrokersGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public ContraBrokersGroupIterator contraBrokersGroupIterator();
    public int noContraBrokersGroupCounter();
    public boolean hasNoContraBrokersGroupCounter();
    public ContraBrokersGroupDecoder contraBrokersGroup();

}
