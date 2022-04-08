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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecAllocGrpEncoder.ExecsGroupEncoder;

public interface ExecAllocGrpDecoder 
{



public class ExecsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(16);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.LAST_QTY);
            ALL_GROUP_FIELDS.add(Constants.EXEC_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_EXEC_ID);
            ALL_GROUP_FIELDS.add(Constants.LAST_PX);
            ALL_GROUP_FIELDS.add(Constants.LAST_PAR_PX);
            ALL_GROUP_FIELDS.add(Constants.LAST_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.TRADE_ID);
            ALL_GROUP_FIELDS.add(Constants.FIRM_TRADE_ID);
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
        if (hasLastCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !LastCapacity.isValid(lastCapacity()))
        {
            invalidTagId = 29;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public ExecsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private ExecsGroupDecoder next = null;

    public ExecsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(16);

    private DecimalFloat lastQty = DecimalFloat.newNaNValue();

    private boolean hasLastQty;

    public DecimalFloat lastQty()
    {
        if (!hasLastQty)
        {
            throw new IllegalArgumentException("No value for optional field: LastQty");
        }

        return lastQty;
    }

    public boolean hasLastQty()
    {
        return hasLastQty;
    }



    private char[] execID = new char[1];

    private boolean hasExecID;

    public char[] execID()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execID;
    }

    public boolean hasExecID()
    {
        return hasExecID;
    }


    private int execIDOffset;

    private int execIDLength;

    public int execIDLength()
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        return execIDLength;
    }

    public String execIDAsString()
    {
        return hasExecID ? new String(execID, 0, execIDLength) : null;
    }

    public void execID(final AsciiSequenceView view)
    {
        if (!hasExecID)
        {
            throw new IllegalArgumentException("No value for optional field: ExecID");
        }

        view.wrap(buffer, execIDOffset, execIDLength);
    }


    private final CharArrayWrapper execIDWrapper = new CharArrayWrapper();
    private char[] secondaryExecID = new char[1];

    private boolean hasSecondaryExecID;

    public char[] secondaryExecID()
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        return secondaryExecID;
    }

    public boolean hasSecondaryExecID()
    {
        return hasSecondaryExecID;
    }


    private int secondaryExecIDOffset;

    private int secondaryExecIDLength;

    public int secondaryExecIDLength()
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        return secondaryExecIDLength;
    }

    public String secondaryExecIDAsString()
    {
        return hasSecondaryExecID ? new String(secondaryExecID, 0, secondaryExecIDLength) : null;
    }

    public void secondaryExecID(final AsciiSequenceView view)
    {
        if (!hasSecondaryExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryExecID");
        }

        view.wrap(buffer, secondaryExecIDOffset, secondaryExecIDLength);
    }


    private final CharArrayWrapper secondaryExecIDWrapper = new CharArrayWrapper();
    private DecimalFloat lastPx = DecimalFloat.newNaNValue();

    private boolean hasLastPx;

    public DecimalFloat lastPx()
    {
        if (!hasLastPx)
        {
            throw new IllegalArgumentException("No value for optional field: LastPx");
        }

        return lastPx;
    }

    public boolean hasLastPx()
    {
        return hasLastPx;
    }



    private DecimalFloat lastParPx = DecimalFloat.newNaNValue();

    private boolean hasLastParPx;

    public DecimalFloat lastParPx()
    {
        if (!hasLastParPx)
        {
            throw new IllegalArgumentException("No value for optional field: LastParPx");
        }

        return lastParPx;
    }

    public boolean hasLastParPx()
    {
        return hasLastParPx;
    }



    private char lastCapacity = MISSING_CHAR;

    private boolean hasLastCapacity;

    public char lastCapacity()
    {
        if (!hasLastCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: LastCapacity");
        }

        return lastCapacity;
    }

    public boolean hasLastCapacity()
    {
        return hasLastCapacity;
    }



    private final CharArrayWrapper lastCapacityWrapper = new CharArrayWrapper();
    public LastCapacity lastCapacityAsEnum()
    {
        if (!hasLastCapacity)
 return LastCapacity.NULL_VAL;
        return LastCapacity.decode(lastCapacity);
    }

    private char[] tradeID = new char[1];

    private boolean hasTradeID;

    public char[] tradeID()
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        return tradeID;
    }

    public boolean hasTradeID()
    {
        return hasTradeID;
    }


    private int tradeIDOffset;

    private int tradeIDLength;

    public int tradeIDLength()
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        return tradeIDLength;
    }

    public String tradeIDAsString()
    {
        return hasTradeID ? new String(tradeID, 0, tradeIDLength) : null;
    }

    public void tradeID(final AsciiSequenceView view)
    {
        if (!hasTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: TradeID");
        }

        view.wrap(buffer, tradeIDOffset, tradeIDLength);
    }


    private final CharArrayWrapper tradeIDWrapper = new CharArrayWrapper();
    private char[] firmTradeID = new char[1];

    private boolean hasFirmTradeID;

    public char[] firmTradeID()
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        return firmTradeID;
    }

    public boolean hasFirmTradeID()
    {
        return hasFirmTradeID;
    }


    private int firmTradeIDOffset;

    private int firmTradeIDLength;

    public int firmTradeIDLength()
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        return firmTradeIDLength;
    }

    public String firmTradeIDAsString()
    {
        return hasFirmTradeID ? new String(firmTradeID, 0, firmTradeIDLength) : null;
    }

    public void firmTradeID(final AsciiSequenceView view)
    {
        if (!hasFirmTradeID)
        {
            throw new IllegalArgumentException("No value for optional field: FirmTradeID");
        }

        view.wrap(buffer, firmTradeIDOffset, firmTradeIDLength);
    }


    private final CharArrayWrapper firmTradeIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ExecsGroup
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
                    next = new ExecsGroupDecoder(trailer, messageFields);
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
            case Constants.LAST_QTY:
                hasLastQty = true;
                lastQty = getFloat(buffer, lastQty, valueOffset, valueLength, 32, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EXEC_ID:
                hasExecID = true;
                execID = buffer.getChars(execID, valueOffset, valueLength);
                execIDOffset = valueOffset;
                execIDLength = valueLength;
                break;

            case Constants.SECONDARY_EXEC_ID:
                hasSecondaryExecID = true;
                secondaryExecID = buffer.getChars(secondaryExecID, valueOffset, valueLength);
                secondaryExecIDOffset = valueOffset;
                secondaryExecIDLength = valueLength;
                break;

            case Constants.LAST_PX:
                hasLastPx = true;
                lastPx = getFloat(buffer, lastPx, valueOffset, valueLength, 31, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_PAR_PX:
                hasLastParPx = true;
                lastParPx = getFloat(buffer, lastParPx, valueOffset, valueLength, 669, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_CAPACITY:
                hasLastCapacity = true;
                lastCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.TRADE_ID:
                hasTradeID = true;
                tradeID = buffer.getChars(tradeID, valueOffset, valueLength);
                tradeIDOffset = valueOffset;
                tradeIDLength = valueLength;
                break;

            case Constants.FIRM_TRADE_ID:
                hasFirmTradeID = true;
                firmTradeID = buffer.getChars(firmTradeID, valueOffset, valueLength);
                firmTradeIDOffset = valueOffset;
                firmTradeIDLength = valueLength;
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
        this.resetLastQty();
        this.resetExecID();
        this.resetSecondaryExecID();
        this.resetLastPx();
        this.resetLastParPx();
        this.resetLastCapacity();
        this.resetTradeID();
        this.resetFirmTradeID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLastQty()
    {
        hasLastQty = false;
    }

    public void resetExecID()
    {
        hasExecID = false;
    }

    public void resetSecondaryExecID()
    {
        hasSecondaryExecID = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetLastParPx()
    {
        hasLastParPx = false;
    }

    public void resetLastCapacity()
    {
        hasLastCapacity = false;
    }

    public void resetTradeID()
    {
        hasTradeID = false;
    }

    public void resetFirmTradeID()
    {
        hasFirmTradeID = false;
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
        builder.append("\"MessageName\": \"ExecsGroup\",\n");
        if (hasLastQty())
        {
            indent(builder, level);
            builder.append("\"LastQty\": \"");
            lastQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecID())
        {
            indent(builder, level);
            builder.append("\"ExecID\": \"");
            builder.append(this.execID(), 0, execIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryExecID())
        {
            indent(builder, level);
            builder.append("\"SecondaryExecID\": \"");
            builder.append(this.secondaryExecID(), 0, secondaryExecIDLength());
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastParPx())
        {
            indent(builder, level);
            builder.append("\"LastParPx\": \"");
            lastParPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastCapacity())
        {
            indent(builder, level);
            builder.append("\"LastCapacity\": \"");
            builder.append(lastCapacity);
            builder.append("\",\n");
        }

        if (hasTradeID())
        {
            indent(builder, level);
            builder.append("\"TradeID\": \"");
            builder.append(this.tradeID(), 0, tradeIDLength());
            builder.append("\",\n");
        }

        if (hasFirmTradeID())
        {
            indent(builder, level);
            builder.append("\"FirmTradeID\": \"");
            builder.append(this.firmTradeID(), 0, firmTradeIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ExecAllocGrpEncoder.ExecsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ExecAllocGrpEncoder.ExecsGroupEncoder)encoder);
    }

    public ExecAllocGrpEncoder.ExecsGroupEncoder toEncoder(final ExecAllocGrpEncoder.ExecsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLastQty())
        {
            encoder.lastQty(this.lastQty());
        }

        if (hasExecID())
        {
            encoder.execID(this.execID(), 0, execIDLength());
        }

        if (hasSecondaryExecID())
        {
            encoder.secondaryExecID(this.secondaryExecID(), 0, secondaryExecIDLength());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasLastParPx())
        {
            encoder.lastParPx(this.lastParPx());
        }

        if (hasLastCapacity())
        {
            encoder.lastCapacity(this.lastCapacity());
        }

        if (hasTradeID())
        {
            encoder.tradeID(this.tradeID(), 0, tradeIDLength());
        }

        if (hasFirmTradeID())
        {
            encoder.firmTradeID(this.firmTradeID(), 0, firmTradeIDLength());
        }
        return encoder;
    }

}
    public class ExecsGroupIterator implements Iterable<ExecsGroupDecoder>, java.util.Iterator<ExecsGroupDecoder>
    {
        private final ExecAllocGrpDecoder parent;
        private int remainder;
        private ExecsGroupDecoder current;

        public ExecsGroupIterator(final ExecAllocGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public ExecsGroupDecoder next()
        {
            remainder--;
            final ExecsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoExecsGroupCounter() ? parent.noExecsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.execsGroup();
        }

        public ExecsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public ExecsGroupIterator execsGroupIterator();
    public int noExecsGroupCounter();
    public boolean hasNoExecsGroupCounter();
    public ExecsGroupDecoder execsGroup();

}
