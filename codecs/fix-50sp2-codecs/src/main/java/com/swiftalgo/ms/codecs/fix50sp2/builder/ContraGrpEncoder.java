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


public class ContraGrpEncoder
{
    private static final int noContraBrokersGroupCounterHeaderLength = 4;
    private static final byte[] noContraBrokersGroupCounterHeader = new byte[] {51, 56, 50, (byte) '='};



public static class ContraBrokersGroupEncoder
{
    private ContraBrokersGroupEncoder next = null;

    public ContraBrokersGroupEncoder next()
    {
        if (next == null)
        {
            next = new ContraBrokersGroupEncoder();
        }
        return next;
    }

    private static final int contraBrokerHeaderLength = 4;
    private static final byte[] contraBrokerHeader = new byte[] {51, 55, 53, (byte) '='};

    private static final int contraTraderHeaderLength = 4;
    private static final byte[] contraTraderHeader = new byte[] {51, 51, 55, (byte) '='};

    private static final int contraTradeQtyHeaderLength = 4;
    private static final byte[] contraTradeQtyHeader = new byte[] {52, 51, 55, (byte) '='};

    private static final int contraTradeTimeHeaderLength = 4;
    private static final byte[] contraTradeTimeHeader = new byte[] {52, 51, 56, (byte) '='};

    private static final int contraLegRefIDHeaderLength = 4;
    private static final byte[] contraLegRefIDHeader = new byte[] {54, 53, 53, (byte) '='};

    private final MutableDirectBuffer contraBroker = new UnsafeBuffer();

    private int contraBrokerOffset = 0;

    private int contraBrokerLength = 0;

    public ContraBrokersGroupEncoder contraBroker(final DirectBuffer value, final int offset, final int length)
    {
        contraBroker.wrap(value);
        contraBrokerOffset = offset;
        contraBrokerLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraBroker(final DirectBuffer value, final int length)
    {
        return contraBroker(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraBroker(final DirectBuffer value)
    {
        return contraBroker(value, 0, value.capacity());
    }

    public ContraBrokersGroupEncoder contraBroker(final byte[] value, final int offset, final int length)
    {
        contraBroker.wrap(value);
        contraBrokerOffset = offset;
        contraBrokerLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraBrokerAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contraBroker, value, offset, length);
        contraBrokerOffset = offset;
        contraBrokerLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraBroker(final byte[] value, final int length)
    {
        return contraBroker(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraBroker(final byte[] value)
    {
        return contraBroker(value, 0, value.length);
    }

    public boolean hasContraBroker()
    {
        return contraBrokerLength > 0;
    }

    public MutableDirectBuffer contraBroker()
    {
        return contraBroker;
    }

    public String contraBrokerAsString()
    {
        return contraBroker.getStringWithoutLengthAscii(contraBrokerOffset, contraBrokerLength);
    }

    public ContraBrokersGroupEncoder contraBroker(final CharSequence value)
    {
        toBytes(value, contraBroker);
        contraBrokerOffset = 0;
        contraBrokerLength = value.length();
        return this;
    }

    public ContraBrokersGroupEncoder contraBroker(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contraBroker.wrap(buffer);
            contraBrokerOffset = value.offset();
            contraBrokerLength = value.length();
        }
        return this;
    }

    public ContraBrokersGroupEncoder contraBroker(final char[] value)
    {
        return contraBroker(value, 0, value.length);
    }

    public ContraBrokersGroupEncoder contraBroker(final char[] value, final int length)
    {
        return contraBroker(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraBroker(final char[] value, final int offset, final int length)
    {
        toBytes(value, contraBroker, offset, length);
        contraBrokerOffset = 0;
        contraBrokerLength = length;
        return this;
    }

    private final MutableDirectBuffer contraTrader = new UnsafeBuffer();

    private int contraTraderOffset = 0;

    private int contraTraderLength = 0;

    public ContraBrokersGroupEncoder contraTrader(final DirectBuffer value, final int offset, final int length)
    {
        contraTrader.wrap(value);
        contraTraderOffset = offset;
        contraTraderLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTrader(final DirectBuffer value, final int length)
    {
        return contraTrader(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraTrader(final DirectBuffer value)
    {
        return contraTrader(value, 0, value.capacity());
    }

    public ContraBrokersGroupEncoder contraTrader(final byte[] value, final int offset, final int length)
    {
        contraTrader.wrap(value);
        contraTraderOffset = offset;
        contraTraderLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTraderAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contraTrader, value, offset, length);
        contraTraderOffset = offset;
        contraTraderLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTrader(final byte[] value, final int length)
    {
        return contraTrader(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraTrader(final byte[] value)
    {
        return contraTrader(value, 0, value.length);
    }

    public boolean hasContraTrader()
    {
        return contraTraderLength > 0;
    }

    public MutableDirectBuffer contraTrader()
    {
        return contraTrader;
    }

    public String contraTraderAsString()
    {
        return contraTrader.getStringWithoutLengthAscii(contraTraderOffset, contraTraderLength);
    }

    public ContraBrokersGroupEncoder contraTrader(final CharSequence value)
    {
        toBytes(value, contraTrader);
        contraTraderOffset = 0;
        contraTraderLength = value.length();
        return this;
    }

    public ContraBrokersGroupEncoder contraTrader(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contraTrader.wrap(buffer);
            contraTraderOffset = value.offset();
            contraTraderLength = value.length();
        }
        return this;
    }

    public ContraBrokersGroupEncoder contraTrader(final char[] value)
    {
        return contraTrader(value, 0, value.length);
    }

    public ContraBrokersGroupEncoder contraTrader(final char[] value, final int length)
    {
        return contraTrader(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraTrader(final char[] value, final int offset, final int length)
    {
        toBytes(value, contraTrader, offset, length);
        contraTraderOffset = 0;
        contraTraderLength = length;
        return this;
    }

    private final DecimalFloat contraTradeQty = new DecimalFloat();

    private boolean hasContraTradeQty;

    public boolean hasContraTradeQty()
    {
        return hasContraTradeQty;
    }

    public ContraBrokersGroupEncoder contraTradeQty(DecimalFloat value)
    {
        contraTradeQty.set(value);
        hasContraTradeQty = true;
        return this;
    }

    public ContraBrokersGroupEncoder contraTradeQty(long value, int scale)
    {
        contraTradeQty.set(value, scale);
        hasContraTradeQty = true;
        return this;
    }

    public DecimalFloat contraTradeQty()
    {
        return contraTradeQty;
    }

    private final MutableDirectBuffer contraTradeTime = new UnsafeBuffer();

    private int contraTradeTimeOffset = 0;

    private int contraTradeTimeLength = 0;

    public ContraBrokersGroupEncoder contraTradeTime(final DirectBuffer value, final int offset, final int length)
    {
        contraTradeTime.wrap(value);
        contraTradeTimeOffset = offset;
        contraTradeTimeLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTradeTime(final DirectBuffer value, final int length)
    {
        return contraTradeTime(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraTradeTime(final DirectBuffer value)
    {
        return contraTradeTime(value, 0, value.capacity());
    }

    public ContraBrokersGroupEncoder contraTradeTime(final byte[] value, final int offset, final int length)
    {
        contraTradeTime.wrap(value);
        contraTradeTimeOffset = offset;
        contraTradeTimeLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTradeTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contraTradeTime, value, offset, length);
        contraTradeTimeOffset = offset;
        contraTradeTimeLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraTradeTime(final byte[] value, final int length)
    {
        return contraTradeTime(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraTradeTime(final byte[] value)
    {
        return contraTradeTime(value, 0, value.length);
    }

    public boolean hasContraTradeTime()
    {
        return contraTradeTimeLength > 0;
    }

    public MutableDirectBuffer contraTradeTime()
    {
        return contraTradeTime;
    }

    public String contraTradeTimeAsString()
    {
        return contraTradeTime.getStringWithoutLengthAscii(contraTradeTimeOffset, contraTradeTimeLength);
    }

    private final MutableDirectBuffer contraLegRefID = new UnsafeBuffer();

    private int contraLegRefIDOffset = 0;

    private int contraLegRefIDLength = 0;

    public ContraBrokersGroupEncoder contraLegRefID(final DirectBuffer value, final int offset, final int length)
    {
        contraLegRefID.wrap(value);
        contraLegRefIDOffset = offset;
        contraLegRefIDLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraLegRefID(final DirectBuffer value, final int length)
    {
        return contraLegRefID(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraLegRefID(final DirectBuffer value)
    {
        return contraLegRefID(value, 0, value.capacity());
    }

    public ContraBrokersGroupEncoder contraLegRefID(final byte[] value, final int offset, final int length)
    {
        contraLegRefID.wrap(value);
        contraLegRefIDOffset = offset;
        contraLegRefIDLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraLegRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(contraLegRefID, value, offset, length);
        contraLegRefIDOffset = offset;
        contraLegRefIDLength = length;
        return this;
    }

    public ContraBrokersGroupEncoder contraLegRefID(final byte[] value, final int length)
    {
        return contraLegRefID(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraLegRefID(final byte[] value)
    {
        return contraLegRefID(value, 0, value.length);
    }

    public boolean hasContraLegRefID()
    {
        return contraLegRefIDLength > 0;
    }

    public MutableDirectBuffer contraLegRefID()
    {
        return contraLegRefID;
    }

    public String contraLegRefIDAsString()
    {
        return contraLegRefID.getStringWithoutLengthAscii(contraLegRefIDOffset, contraLegRefIDLength);
    }

    public ContraBrokersGroupEncoder contraLegRefID(final CharSequence value)
    {
        toBytes(value, contraLegRefID);
        contraLegRefIDOffset = 0;
        contraLegRefIDLength = value.length();
        return this;
    }

    public ContraBrokersGroupEncoder contraLegRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            contraLegRefID.wrap(buffer);
            contraLegRefIDOffset = value.offset();
            contraLegRefIDLength = value.length();
        }
        return this;
    }

    public ContraBrokersGroupEncoder contraLegRefID(final char[] value)
    {
        return contraLegRefID(value, 0, value.length);
    }

    public ContraBrokersGroupEncoder contraLegRefID(final char[] value, final int length)
    {
        return contraLegRefID(value, 0, length);
    }

    public ContraBrokersGroupEncoder contraLegRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, contraLegRefID, offset, length);
        contraLegRefIDOffset = 0;
        contraLegRefIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (contraBrokerLength > 0)
        {
            buffer.putBytes(position, contraBrokerHeader, 0, contraBrokerHeaderLength);
            position += contraBrokerHeaderLength;
            buffer.putBytes(position, contraBroker, contraBrokerOffset, contraBrokerLength);
            position += contraBrokerLength;
            buffer.putSeparator(position);
            position++;
        }

        if (contraTraderLength > 0)
        {
            buffer.putBytes(position, contraTraderHeader, 0, contraTraderHeaderLength);
            position += contraTraderHeaderLength;
            buffer.putBytes(position, contraTrader, contraTraderOffset, contraTraderLength);
            position += contraTraderLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasContraTradeQty)
        {
            buffer.putBytes(position, contraTradeQtyHeader, 0, contraTradeQtyHeaderLength);
            position += contraTradeQtyHeaderLength;
            position += buffer.putFloatAscii(position, contraTradeQty);
            buffer.putSeparator(position);
            position++;
        }

        if (contraTradeTimeLength > 0)
        {
            buffer.putBytes(position, contraTradeTimeHeader, 0, contraTradeTimeHeaderLength);
            position += contraTradeTimeHeaderLength;
            buffer.putBytes(position, contraTradeTime, contraTradeTimeOffset, contraTradeTimeLength);
            position += contraTradeTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (contraLegRefIDLength > 0)
        {
            buffer.putBytes(position, contraLegRefIDHeader, 0, contraLegRefIDHeaderLength);
            position += contraLegRefIDHeaderLength;
            buffer.putBytes(position, contraLegRefID, contraLegRefIDOffset, contraLegRefIDLength);
            position += contraLegRefIDLength;
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
        this.resetContraBroker();
        this.resetContraTrader();
        this.resetContraTradeQty();
        this.resetContraTradeTime();
        this.resetContraLegRefID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetContraBroker()
    {
        contraBrokerLength = 0;
    }

    public void resetContraTrader()
    {
        contraTraderLength = 0;
    }

    public void resetContraTradeQty()
    {
        hasContraTradeQty = false;
    }

    public void resetContraTradeTime()
    {
        contraTradeTimeLength = 0;
    }

    public void resetContraLegRefID()
    {
        contraLegRefIDLength = 0;
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
            appendBuffer(builder, contraBroker, contraBrokerOffset, contraBrokerLength);
            builder.append("\",\n");
        }

        if (hasContraTrader())
        {
            indent(builder, level);
            builder.append("\"ContraTrader\": \"");
            appendBuffer(builder, contraTrader, contraTraderOffset, contraTraderLength);
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
            appendBuffer(builder, contraTradeTime, contraTradeTimeOffset, contraTradeTimeLength);
            builder.append("\",\n");
        }

        if (hasContraLegRefID())
        {
            indent(builder, level);
            builder.append("\"ContraLegRefID\": \"");
            appendBuffer(builder, contraLegRefID, contraLegRefIDOffset, contraLegRefIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ContraBrokersGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContraBrokersGroupEncoder)encoder);
    }

    public ContraBrokersGroupEncoder copyTo(final ContraBrokersGroupEncoder encoder)
    {
        encoder.reset();
        if (hasContraBroker())
        {
            encoder.contraBrokerAsCopy(contraBroker.byteArray(), 0, contraBrokerLength);
        }

        if (hasContraTrader())
        {
            encoder.contraTraderAsCopy(contraTrader.byteArray(), 0, contraTraderLength);
        }

        if (hasContraTradeQty())
        {
            encoder.contraTradeQty(this.contraTradeQty());
        }

        if (hasContraTradeTime())
        {
            encoder.contraTradeTimeAsCopy(contraTradeTime.byteArray(), 0, contraTradeTimeLength);
        }

        if (hasContraLegRefID())
        {
            encoder.contraLegRefIDAsCopy(contraLegRefID.byteArray(), 0, contraLegRefIDLength);
        }
        return encoder;
    }

}
    private int noContraBrokersGroupCounter;

    private boolean hasNoContraBrokersGroupCounter;

    public boolean hasNoContraBrokersGroupCounter()
    {
        return hasNoContraBrokersGroupCounter;
    }

    public ContraGrpEncoder noContraBrokersGroupCounter(int value)
    {
        noContraBrokersGroupCounter = value;
        hasNoContraBrokersGroupCounter = true;
        return this;
    }

    public int noContraBrokersGroupCounter()
    {
        return noContraBrokersGroupCounter;
    }


    private ContraBrokersGroupEncoder contraBrokersGroup = null;

    public ContraBrokersGroupEncoder contraBrokersGroup(final int numberOfElements)
    {
        hasNoContraBrokersGroupCounter = true;
        noContraBrokersGroupCounter = numberOfElements;
        if (contraBrokersGroup == null)
        {
            contraBrokersGroup = new ContraBrokersGroupEncoder();
        }
        return contraBrokersGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoContraBrokersGroupCounter)
        {
            buffer.putBytes(position, noContraBrokersGroupCounterHeader, 0, noContraBrokersGroupCounterHeaderLength);
            position += noContraBrokersGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noContraBrokersGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (contraBrokersGroup != null)
        {
            position += contraBrokersGroup.encode(buffer, position, noContraBrokersGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetContraBrokersGroup();
    }

    public void resetContraBrokersGroup()
    {
        if (contraBrokersGroup != null)
        {
            contraBrokersGroup.reset();
        }
        noContraBrokersGroupCounter = 0;
        hasNoContraBrokersGroupCounter = false;
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
        builder.append("\"MessageName\": \"ContraGrp\",\n");
        if (hasNoContraBrokersGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ContraBrokersGroup\": [\n");
            final int noContraBrokersGroupCounter = this.noContraBrokersGroupCounter;
            ContraBrokersGroupEncoder contraBrokersGroup = this.contraBrokersGroup;
            for (int i = 0; i < noContraBrokersGroupCounter; i++)
            {
                indent(builder, level);
                contraBrokersGroup.appendTo(builder, level + 1);
                if (i < (noContraBrokersGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                contraBrokersGroup = contraBrokersGroup.next();
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
    public ContraGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ContraGrpEncoder)encoder);
    }

    public ContraGrpEncoder copyTo(final ContraGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoContraBrokersGroupCounter)
        {
            final int size = this.noContraBrokersGroupCounter;
            ContraBrokersGroupEncoder contraBrokersGroup = this.contraBrokersGroup;
            ContraBrokersGroupEncoder contraBrokersGroupEncoder = encoder.contraBrokersGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (contraBrokersGroup != null)
                {
                    contraBrokersGroup.copyTo(contraBrokersGroupEncoder);
                    contraBrokersGroup = contraBrokersGroup.next();
                    contraBrokersGroupEncoder = contraBrokersGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
