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


public class LegPreAllocGrpEncoder
{
    private static final int noLegAllocsGroupCounterHeaderLength = 4;
    private static final byte[] noLegAllocsGroupCounterHeader = new byte[] {54, 55, 48, (byte) '='};



public static class LegAllocsGroupEncoder
{
    private LegAllocsGroupEncoder next = null;

    public LegAllocsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegAllocsGroupEncoder();
        }
        return next;
    }

    private static final int legAllocAccountHeaderLength = 4;
    private static final byte[] legAllocAccountHeader = new byte[] {54, 55, 49, (byte) '='};

    private static final int legIndividualAllocIDHeaderLength = 4;
    private static final byte[] legIndividualAllocIDHeader = new byte[] {54, 55, 50, (byte) '='};

    private static final int legAllocQtyHeaderLength = 4;
    private static final byte[] legAllocQtyHeader = new byte[] {54, 55, 51, (byte) '='};

    private static final int legAllocAcctIDSourceHeaderLength = 4;
    private static final byte[] legAllocAcctIDSourceHeader = new byte[] {54, 55, 52, (byte) '='};

    private static final int legAllocSettlCurrencyHeaderLength = 5;
    private static final byte[] legAllocSettlCurrencyHeader = new byte[] {49, 51, 54, 55, (byte) '='};

    private final MutableDirectBuffer legAllocAccount = new UnsafeBuffer();

    private int legAllocAccountOffset = 0;

    private int legAllocAccountLength = 0;

    public LegAllocsGroupEncoder legAllocAccount(final DirectBuffer value, final int offset, final int length)
    {
        legAllocAccount.wrap(value);
        legAllocAccountOffset = offset;
        legAllocAccountLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAccount(final DirectBuffer value, final int length)
    {
        return legAllocAccount(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAccount(final DirectBuffer value)
    {
        return legAllocAccount(value, 0, value.capacity());
    }

    public LegAllocsGroupEncoder legAllocAccount(final byte[] value, final int offset, final int length)
    {
        legAllocAccount.wrap(value);
        legAllocAccountOffset = offset;
        legAllocAccountLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAccountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legAllocAccount, value, offset, length);
        legAllocAccountOffset = offset;
        legAllocAccountLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAccount(final byte[] value, final int length)
    {
        return legAllocAccount(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAccount(final byte[] value)
    {
        return legAllocAccount(value, 0, value.length);
    }

    public boolean hasLegAllocAccount()
    {
        return legAllocAccountLength > 0;
    }

    public MutableDirectBuffer legAllocAccount()
    {
        return legAllocAccount;
    }

    public String legAllocAccountAsString()
    {
        return legAllocAccount.getStringWithoutLengthAscii(legAllocAccountOffset, legAllocAccountLength);
    }

    public LegAllocsGroupEncoder legAllocAccount(final CharSequence value)
    {
        toBytes(value, legAllocAccount);
        legAllocAccountOffset = 0;
        legAllocAccountLength = value.length();
        return this;
    }

    public LegAllocsGroupEncoder legAllocAccount(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legAllocAccount.wrap(buffer);
            legAllocAccountOffset = value.offset();
            legAllocAccountLength = value.length();
        }
        return this;
    }

    public LegAllocsGroupEncoder legAllocAccount(final char[] value)
    {
        return legAllocAccount(value, 0, value.length);
    }

    public LegAllocsGroupEncoder legAllocAccount(final char[] value, final int length)
    {
        return legAllocAccount(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAccount(final char[] value, final int offset, final int length)
    {
        toBytes(value, legAllocAccount, offset, length);
        legAllocAccountOffset = 0;
        legAllocAccountLength = length;
        return this;
    }

    private final MutableDirectBuffer legIndividualAllocID = new UnsafeBuffer();

    private int legIndividualAllocIDOffset = 0;

    private int legIndividualAllocIDLength = 0;

    public LegAllocsGroupEncoder legIndividualAllocID(final DirectBuffer value, final int offset, final int length)
    {
        legIndividualAllocID.wrap(value);
        legIndividualAllocIDOffset = offset;
        legIndividualAllocIDLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final DirectBuffer value, final int length)
    {
        return legIndividualAllocID(value, 0, length);
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final DirectBuffer value)
    {
        return legIndividualAllocID(value, 0, value.capacity());
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final byte[] value, final int offset, final int length)
    {
        legIndividualAllocID.wrap(value);
        legIndividualAllocIDOffset = offset;
        legIndividualAllocIDLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legIndividualAllocIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legIndividualAllocID, value, offset, length);
        legIndividualAllocIDOffset = offset;
        legIndividualAllocIDLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final byte[] value, final int length)
    {
        return legIndividualAllocID(value, 0, length);
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final byte[] value)
    {
        return legIndividualAllocID(value, 0, value.length);
    }

    public boolean hasLegIndividualAllocID()
    {
        return legIndividualAllocIDLength > 0;
    }

    public MutableDirectBuffer legIndividualAllocID()
    {
        return legIndividualAllocID;
    }

    public String legIndividualAllocIDAsString()
    {
        return legIndividualAllocID.getStringWithoutLengthAscii(legIndividualAllocIDOffset, legIndividualAllocIDLength);
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final CharSequence value)
    {
        toBytes(value, legIndividualAllocID);
        legIndividualAllocIDOffset = 0;
        legIndividualAllocIDLength = value.length();
        return this;
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legIndividualAllocID.wrap(buffer);
            legIndividualAllocIDOffset = value.offset();
            legIndividualAllocIDLength = value.length();
        }
        return this;
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final char[] value)
    {
        return legIndividualAllocID(value, 0, value.length);
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final char[] value, final int length)
    {
        return legIndividualAllocID(value, 0, length);
    }

    public LegAllocsGroupEncoder legIndividualAllocID(final char[] value, final int offset, final int length)
    {
        toBytes(value, legIndividualAllocID, offset, length);
        legIndividualAllocIDOffset = 0;
        legIndividualAllocIDLength = length;
        return this;
    }

    private final NestedParties2Encoder nestedParties2 = new NestedParties2Encoder();
    public NestedParties2Encoder nestedParties2()
    {
        return nestedParties2;
    }

    private final DecimalFloat legAllocQty = new DecimalFloat();

    private boolean hasLegAllocQty;

    public boolean hasLegAllocQty()
    {
        return hasLegAllocQty;
    }

    public LegAllocsGroupEncoder legAllocQty(DecimalFloat value)
    {
        legAllocQty.set(value);
        hasLegAllocQty = true;
        return this;
    }

    public LegAllocsGroupEncoder legAllocQty(long value, int scale)
    {
        legAllocQty.set(value, scale);
        hasLegAllocQty = true;
        return this;
    }

    public DecimalFloat legAllocQty()
    {
        return legAllocQty;
    }

    private final MutableDirectBuffer legAllocAcctIDSource = new UnsafeBuffer();

    private int legAllocAcctIDSourceOffset = 0;

    private int legAllocAcctIDSourceLength = 0;

    public LegAllocsGroupEncoder legAllocAcctIDSource(final DirectBuffer value, final int offset, final int length)
    {
        legAllocAcctIDSource.wrap(value);
        legAllocAcctIDSourceOffset = offset;
        legAllocAcctIDSourceLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final DirectBuffer value, final int length)
    {
        return legAllocAcctIDSource(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final DirectBuffer value)
    {
        return legAllocAcctIDSource(value, 0, value.capacity());
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final byte[] value, final int offset, final int length)
    {
        legAllocAcctIDSource.wrap(value);
        legAllocAcctIDSourceOffset = offset;
        legAllocAcctIDSourceLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAcctIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legAllocAcctIDSource, value, offset, length);
        legAllocAcctIDSourceOffset = offset;
        legAllocAcctIDSourceLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final byte[] value, final int length)
    {
        return legAllocAcctIDSource(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final byte[] value)
    {
        return legAllocAcctIDSource(value, 0, value.length);
    }

    public boolean hasLegAllocAcctIDSource()
    {
        return legAllocAcctIDSourceLength > 0;
    }

    public MutableDirectBuffer legAllocAcctIDSource()
    {
        return legAllocAcctIDSource;
    }

    public String legAllocAcctIDSourceAsString()
    {
        return legAllocAcctIDSource.getStringWithoutLengthAscii(legAllocAcctIDSourceOffset, legAllocAcctIDSourceLength);
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final CharSequence value)
    {
        toBytes(value, legAllocAcctIDSource);
        legAllocAcctIDSourceOffset = 0;
        legAllocAcctIDSourceLength = value.length();
        return this;
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legAllocAcctIDSource.wrap(buffer);
            legAllocAcctIDSourceOffset = value.offset();
            legAllocAcctIDSourceLength = value.length();
        }
        return this;
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final char[] value)
    {
        return legAllocAcctIDSource(value, 0, value.length);
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final char[] value, final int length)
    {
        return legAllocAcctIDSource(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocAcctIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, legAllocAcctIDSource, offset, length);
        legAllocAcctIDSourceOffset = 0;
        legAllocAcctIDSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer legAllocSettlCurrency = new UnsafeBuffer();

    private int legAllocSettlCurrencyOffset = 0;

    private int legAllocSettlCurrencyLength = 0;

    public LegAllocsGroupEncoder legAllocSettlCurrency(final DirectBuffer value, final int offset, final int length)
    {
        legAllocSettlCurrency.wrap(value);
        legAllocSettlCurrencyOffset = offset;
        legAllocSettlCurrencyLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final DirectBuffer value, final int length)
    {
        return legAllocSettlCurrency(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final DirectBuffer value)
    {
        return legAllocSettlCurrency(value, 0, value.capacity());
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final byte[] value, final int offset, final int length)
    {
        legAllocSettlCurrency.wrap(value);
        legAllocSettlCurrencyOffset = offset;
        legAllocSettlCurrencyLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocSettlCurrencyAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(legAllocSettlCurrency, value, offset, length);
        legAllocSettlCurrencyOffset = offset;
        legAllocSettlCurrencyLength = length;
        return this;
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final byte[] value, final int length)
    {
        return legAllocSettlCurrency(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final byte[] value)
    {
        return legAllocSettlCurrency(value, 0, value.length);
    }

    public boolean hasLegAllocSettlCurrency()
    {
        return legAllocSettlCurrencyLength > 0;
    }

    public MutableDirectBuffer legAllocSettlCurrency()
    {
        return legAllocSettlCurrency;
    }

    public String legAllocSettlCurrencyAsString()
    {
        return legAllocSettlCurrency.getStringWithoutLengthAscii(legAllocSettlCurrencyOffset, legAllocSettlCurrencyLength);
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final CharSequence value)
    {
        toBytes(value, legAllocSettlCurrency);
        legAllocSettlCurrencyOffset = 0;
        legAllocSettlCurrencyLength = value.length();
        return this;
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            legAllocSettlCurrency.wrap(buffer);
            legAllocSettlCurrencyOffset = value.offset();
            legAllocSettlCurrencyLength = value.length();
        }
        return this;
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final char[] value)
    {
        return legAllocSettlCurrency(value, 0, value.length);
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final char[] value, final int length)
    {
        return legAllocSettlCurrency(value, 0, length);
    }

    public LegAllocsGroupEncoder legAllocSettlCurrency(final char[] value, final int offset, final int length)
    {
        toBytes(value, legAllocSettlCurrency, offset, length);
        legAllocSettlCurrencyOffset = 0;
        legAllocSettlCurrencyLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (legAllocAccountLength > 0)
        {
            buffer.putBytes(position, legAllocAccountHeader, 0, legAllocAccountHeaderLength);
            position += legAllocAccountHeaderLength;
            buffer.putBytes(position, legAllocAccount, legAllocAccountOffset, legAllocAccountLength);
            position += legAllocAccountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legIndividualAllocIDLength > 0)
        {
            buffer.putBytes(position, legIndividualAllocIDHeader, 0, legIndividualAllocIDHeaderLength);
            position += legIndividualAllocIDHeaderLength;
            buffer.putBytes(position, legIndividualAllocID, legIndividualAllocIDOffset, legIndividualAllocIDLength);
            position += legIndividualAllocIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties2.encode(buffer, position);

        if (hasLegAllocQty)
        {
            buffer.putBytes(position, legAllocQtyHeader, 0, legAllocQtyHeaderLength);
            position += legAllocQtyHeaderLength;
            position += buffer.putFloatAscii(position, legAllocQty);
            buffer.putSeparator(position);
            position++;
        }

        if (legAllocAcctIDSourceLength > 0)
        {
            buffer.putBytes(position, legAllocAcctIDSourceHeader, 0, legAllocAcctIDSourceHeaderLength);
            position += legAllocAcctIDSourceHeaderLength;
            buffer.putBytes(position, legAllocAcctIDSource, legAllocAcctIDSourceOffset, legAllocAcctIDSourceLength);
            position += legAllocAcctIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (legAllocSettlCurrencyLength > 0)
        {
            buffer.putBytes(position, legAllocSettlCurrencyHeader, 0, legAllocSettlCurrencyHeaderLength);
            position += legAllocSettlCurrencyHeaderLength;
            buffer.putBytes(position, legAllocSettlCurrency, legAllocSettlCurrencyOffset, legAllocSettlCurrencyLength);
            position += legAllocSettlCurrencyLength;
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
        this.resetLegAllocAccount();
        this.resetLegIndividualAllocID();
        this.resetLegAllocQty();
        this.resetLegAllocAcctIDSource();
        this.resetLegAllocSettlCurrency();
        nestedParties2.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetLegAllocAccount()
    {
        legAllocAccountLength = 0;
    }

    public void resetLegIndividualAllocID()
    {
        legIndividualAllocIDLength = 0;
    }

    public void resetLegAllocQty()
    {
        hasLegAllocQty = false;
    }

    public void resetLegAllocAcctIDSource()
    {
        legAllocAcctIDSourceLength = 0;
    }

    public void resetLegAllocSettlCurrency()
    {
        legAllocSettlCurrencyLength = 0;
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
        builder.append("\"MessageName\": \"LegAllocsGroup\",\n");
        if (hasLegAllocAccount())
        {
            indent(builder, level);
            builder.append("\"LegAllocAccount\": \"");
            appendBuffer(builder, legAllocAccount, legAllocAccountOffset, legAllocAccountLength);
            builder.append("\",\n");
        }

        if (hasLegIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"LegIndividualAllocID\": \"");
            appendBuffer(builder, legIndividualAllocID, legIndividualAllocIDOffset, legIndividualAllocIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties2\": ");
    nestedParties2.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasLegAllocQty())
        {
            indent(builder, level);
            builder.append("\"LegAllocQty\": \"");
            legAllocQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLegAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"LegAllocAcctIDSource\": \"");
            appendBuffer(builder, legAllocAcctIDSource, legAllocAcctIDSourceOffset, legAllocAcctIDSourceLength);
            builder.append("\",\n");
        }

        if (hasLegAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"LegAllocSettlCurrency\": \"");
            appendBuffer(builder, legAllocSettlCurrency, legAllocSettlCurrencyOffset, legAllocSettlCurrencyLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegAllocsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegAllocsGroupEncoder)encoder);
    }

    public LegAllocsGroupEncoder copyTo(final LegAllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegAllocAccount())
        {
            encoder.legAllocAccountAsCopy(legAllocAccount.byteArray(), 0, legAllocAccountLength);
        }

        if (hasLegIndividualAllocID())
        {
            encoder.legIndividualAllocIDAsCopy(legIndividualAllocID.byteArray(), 0, legIndividualAllocIDLength);
        }


        nestedParties2.copyTo(encoder.nestedParties2());
        if (hasLegAllocQty())
        {
            encoder.legAllocQty(this.legAllocQty());
        }

        if (hasLegAllocAcctIDSource())
        {
            encoder.legAllocAcctIDSourceAsCopy(legAllocAcctIDSource.byteArray(), 0, legAllocAcctIDSourceLength);
        }

        if (hasLegAllocSettlCurrency())
        {
            encoder.legAllocSettlCurrencyAsCopy(legAllocSettlCurrency.byteArray(), 0, legAllocSettlCurrencyLength);
        }
        return encoder;
    }

}
    private int noLegAllocsGroupCounter;

    private boolean hasNoLegAllocsGroupCounter;

    public boolean hasNoLegAllocsGroupCounter()
    {
        return hasNoLegAllocsGroupCounter;
    }

    public LegPreAllocGrpEncoder noLegAllocsGroupCounter(int value)
    {
        noLegAllocsGroupCounter = value;
        hasNoLegAllocsGroupCounter = true;
        return this;
    }

    public int noLegAllocsGroupCounter()
    {
        return noLegAllocsGroupCounter;
    }


    private LegAllocsGroupEncoder legAllocsGroup = null;

    public LegAllocsGroupEncoder legAllocsGroup(final int numberOfElements)
    {
        hasNoLegAllocsGroupCounter = true;
        noLegAllocsGroupCounter = numberOfElements;
        if (legAllocsGroup == null)
        {
            legAllocsGroup = new LegAllocsGroupEncoder();
        }
        return legAllocsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoLegAllocsGroupCounter)
        {
            buffer.putBytes(position, noLegAllocsGroupCounterHeader, 0, noLegAllocsGroupCounterHeaderLength);
            position += noLegAllocsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegAllocsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legAllocsGroup != null)
        {
            position += legAllocsGroup.encode(buffer, position, noLegAllocsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetLegAllocsGroup();
    }

    public void resetLegAllocsGroup()
    {
        if (legAllocsGroup != null)
        {
            legAllocsGroup.reset();
        }
        noLegAllocsGroupCounter = 0;
        hasNoLegAllocsGroupCounter = false;
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
        builder.append("\"MessageName\": \"LegPreAllocGrp\",\n");
        if (hasNoLegAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegAllocsGroup\": [\n");
            final int noLegAllocsGroupCounter = this.noLegAllocsGroupCounter;
            LegAllocsGroupEncoder legAllocsGroup = this.legAllocsGroup;
            for (int i = 0; i < noLegAllocsGroupCounter; i++)
            {
                indent(builder, level);
                legAllocsGroup.appendTo(builder, level + 1);
                if (i < (noLegAllocsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legAllocsGroup = legAllocsGroup.next();
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
    public LegPreAllocGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegPreAllocGrpEncoder)encoder);
    }

    public LegPreAllocGrpEncoder copyTo(final LegPreAllocGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoLegAllocsGroupCounter)
        {
            final int size = this.noLegAllocsGroupCounter;
            LegAllocsGroupEncoder legAllocsGroup = this.legAllocsGroup;
            LegAllocsGroupEncoder legAllocsGroupEncoder = encoder.legAllocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legAllocsGroup != null)
                {
                    legAllocsGroup.copyTo(legAllocsGroupEncoder);
                    legAllocsGroup = legAllocsGroup.next();
                    legAllocsGroupEncoder = legAllocsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
