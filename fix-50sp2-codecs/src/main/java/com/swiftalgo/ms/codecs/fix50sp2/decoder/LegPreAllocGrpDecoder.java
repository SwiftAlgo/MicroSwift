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
import com.swiftalgo.ms.codecs.fix50sp2.builder.LegPreAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LegPreAllocGrpEncoder.LegAllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;

public interface LegPreAllocGrpDecoder 
{



public class LegAllocsGroupDecoder extends CommonDecoderImpl implements NestedParties2Decoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.LEG_ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.LEG_INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.LEG_ALLOC_QTY);
            GROUP_FIELDS.add(Constants.LEG_ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.LEG_ALLOC_SETTL_CURRENCY);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.LEG_ALLOC_ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.LEG_INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.LEG_ALLOC_QTY);
            ALL_GROUP_FIELDS.add(Constants.LEG_ALLOC_ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.LEG_ALLOC_SETTL_CURRENCY);
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
        if (hasNoNested2PartyIDsGroupCounter)
        {
            {
                int count = 0;
                final Nested2PartyIDsGroupIterator iterator = nested2PartyIDsGroupIterator.iterator();
                for (final Nested2PartyIDsGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 756;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public LegAllocsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private LegAllocsGroupDecoder next = null;

    public LegAllocsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(12);

    private char[] legAllocAccount = new char[1];

    private boolean hasLegAllocAccount;

    public char[] legAllocAccount()
    {
        if (!hasLegAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAccount");
        }

        return legAllocAccount;
    }

    public boolean hasLegAllocAccount()
    {
        return hasLegAllocAccount;
    }


    private int legAllocAccountOffset;

    private int legAllocAccountLength;

    public int legAllocAccountLength()
    {
        if (!hasLegAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAccount");
        }

        return legAllocAccountLength;
    }

    public String legAllocAccountAsString()
    {
        return hasLegAllocAccount ? new String(legAllocAccount, 0, legAllocAccountLength) : null;
    }

    public void legAllocAccount(final AsciiSequenceView view)
    {
        if (!hasLegAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAccount");
        }

        view.wrap(buffer, legAllocAccountOffset, legAllocAccountLength);
    }


    private final CharArrayWrapper legAllocAccountWrapper = new CharArrayWrapper();
    private char[] legIndividualAllocID = new char[1];

    private boolean hasLegIndividualAllocID;

    public char[] legIndividualAllocID()
    {
        if (!hasLegIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: LegIndividualAllocID");
        }

        return legIndividualAllocID;
    }

    public boolean hasLegIndividualAllocID()
    {
        return hasLegIndividualAllocID;
    }


    private int legIndividualAllocIDOffset;

    private int legIndividualAllocIDLength;

    public int legIndividualAllocIDLength()
    {
        if (!hasLegIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: LegIndividualAllocID");
        }

        return legIndividualAllocIDLength;
    }

    public String legIndividualAllocIDAsString()
    {
        return hasLegIndividualAllocID ? new String(legIndividualAllocID, 0, legIndividualAllocIDLength) : null;
    }

    public void legIndividualAllocID(final AsciiSequenceView view)
    {
        if (!hasLegIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: LegIndividualAllocID");
        }

        view.wrap(buffer, legIndividualAllocIDOffset, legIndividualAllocIDLength);
    }


    private final CharArrayWrapper legIndividualAllocIDWrapper = new CharArrayWrapper();


    private Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = null;
    public Nested2PartyIDsGroupDecoder nested2PartyIDsGroup()
    {
        return nested2PartyIDsGroup;
    }

    private int noNested2PartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNested2PartyIDsGroupCounter;

    public int noNested2PartyIDsGroupCounter()
    {
        if (!hasNoNested2PartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNested2PartyIDsGroupCounter");
        }

        return noNested2PartyIDsGroupCounter;
    }

    public boolean hasNoNested2PartyIDsGroupCounter()
    {
        return hasNoNested2PartyIDsGroupCounter;
    }




    private Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator = new Nested2PartyIDsGroupIterator(this);
    public Nested2PartyIDsGroupIterator nested2PartyIDsGroupIterator()
    {
        return nested2PartyIDsGroupIterator.iterator();
    }


    private DecimalFloat legAllocQty = DecimalFloat.newNaNValue();

    private boolean hasLegAllocQty;

    public DecimalFloat legAllocQty()
    {
        if (!hasLegAllocQty)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocQty");
        }

        return legAllocQty;
    }

    public boolean hasLegAllocQty()
    {
        return hasLegAllocQty;
    }



    private char[] legAllocAcctIDSource = new char[1];

    private boolean hasLegAllocAcctIDSource;

    public char[] legAllocAcctIDSource()
    {
        if (!hasLegAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAcctIDSource");
        }

        return legAllocAcctIDSource;
    }

    public boolean hasLegAllocAcctIDSource()
    {
        return hasLegAllocAcctIDSource;
    }


    private int legAllocAcctIDSourceOffset;

    private int legAllocAcctIDSourceLength;

    public int legAllocAcctIDSourceLength()
    {
        if (!hasLegAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAcctIDSource");
        }

        return legAllocAcctIDSourceLength;
    }

    public String legAllocAcctIDSourceAsString()
    {
        return hasLegAllocAcctIDSource ? new String(legAllocAcctIDSource, 0, legAllocAcctIDSourceLength) : null;
    }

    public void legAllocAcctIDSource(final AsciiSequenceView view)
    {
        if (!hasLegAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocAcctIDSource");
        }

        view.wrap(buffer, legAllocAcctIDSourceOffset, legAllocAcctIDSourceLength);
    }


    private final CharArrayWrapper legAllocAcctIDSourceWrapper = new CharArrayWrapper();
    private char[] legAllocSettlCurrency = new char[1];

    private boolean hasLegAllocSettlCurrency;

    public char[] legAllocSettlCurrency()
    {
        if (!hasLegAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocSettlCurrency");
        }

        return legAllocSettlCurrency;
    }

    public boolean hasLegAllocSettlCurrency()
    {
        return hasLegAllocSettlCurrency;
    }


    private int legAllocSettlCurrencyOffset;

    private int legAllocSettlCurrencyLength;

    public int legAllocSettlCurrencyLength()
    {
        if (!hasLegAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocSettlCurrency");
        }

        return legAllocSettlCurrencyLength;
    }

    public String legAllocSettlCurrencyAsString()
    {
        return hasLegAllocSettlCurrency ? new String(legAllocSettlCurrency, 0, legAllocSettlCurrencyLength) : null;
    }

    public void legAllocSettlCurrency(final AsciiSequenceView view)
    {
        if (!hasLegAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: LegAllocSettlCurrency");
        }

        view.wrap(buffer, legAllocSettlCurrencyOffset, legAllocSettlCurrencyLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode LegAllocsGroup
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
                    next = new LegAllocsGroupDecoder(trailer, messageFields);
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
            case Constants.LEG_ALLOC_ACCOUNT:
                hasLegAllocAccount = true;
                legAllocAccount = buffer.getChars(legAllocAccount, valueOffset, valueLength);
                legAllocAccountOffset = valueOffset;
                legAllocAccountLength = valueLength;
                break;

            case Constants.LEG_INDIVIDUAL_ALLOC_ID:
                hasLegIndividualAllocID = true;
                legIndividualAllocID = buffer.getChars(legIndividualAllocID, valueOffset, valueLength);
                legIndividualAllocIDOffset = valueOffset;
                legIndividualAllocIDLength = valueLength;
                break;

            case Constants.NO_NESTED2_PARTY_IDS_GROUP_COUNTER:
                hasNoNested2PartyIDsGroupCounter = true;
                noNested2PartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 756, CODEC_VALIDATION_ENABLED);
                if (nested2PartyIDsGroup == null)
                {
                    nested2PartyIDsGroup = new Nested2PartyIDsGroupDecoder(trailer, messageFields);
                }
                Nested2PartyIDsGroupDecoder nested2PartyIDsGroupCurrent = nested2PartyIDsGroup;
                position = endOfField + 1;
                final int noNested2PartyIDsGroupCounter = this.noNested2PartyIDsGroupCounter;
                for (int i = 0; i < noNested2PartyIDsGroupCounter && position < end; i++)
                {
                    if (nested2PartyIDsGroupCurrent != null)
                    {
                        position += nested2PartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nested2PartyIDsGroupCurrent = nested2PartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nested2PartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.LEG_ALLOC_QTY:
                hasLegAllocQty = true;
                legAllocQty = getFloat(buffer, legAllocQty, valueOffset, valueLength, 673, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LEG_ALLOC_ACCT_ID_SOURCE:
                hasLegAllocAcctIDSource = true;
                legAllocAcctIDSource = buffer.getChars(legAllocAcctIDSource, valueOffset, valueLength);
                legAllocAcctIDSourceOffset = valueOffset;
                legAllocAcctIDSourceLength = valueLength;
                break;

            case Constants.LEG_ALLOC_SETTL_CURRENCY:
                hasLegAllocSettlCurrency = true;
                legAllocSettlCurrency = buffer.getChars(legAllocSettlCurrency, valueOffset, valueLength);
                legAllocSettlCurrencyOffset = valueOffset;
                legAllocSettlCurrencyLength = valueLength;
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
        this.resetLegAllocAccount();
        this.resetLegIndividualAllocID();
        this.resetLegAllocQty();
        this.resetLegAllocAcctIDSource();
        this.resetLegAllocSettlCurrency();
        this.resetNested2PartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetLegAllocAccount()
    {
        hasLegAllocAccount = false;
    }

    public void resetLegIndividualAllocID()
    {
        hasLegIndividualAllocID = false;
    }

    public void resetLegAllocQty()
    {
        hasLegAllocQty = false;
    }

    public void resetLegAllocAcctIDSource()
    {
        hasLegAllocAcctIDSource = false;
    }

    public void resetLegAllocSettlCurrency()
    {
        hasLegAllocSettlCurrency = false;
    }

    public void resetNested2PartyIDsGroup()
    {
        for (final Nested2PartyIDsGroupDecoder nested2PartyIDsGroupDecoder : nested2PartyIDsGroupIterator.iterator())
        {
            nested2PartyIDsGroupDecoder.reset();
            if (nested2PartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNested2PartyIDsGroupCounter = MISSING_INT;
        hasNoNested2PartyIDsGroupCounter = false;
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
            builder.append(this.legAllocAccount(), 0, legAllocAccountLength());
            builder.append("\",\n");
        }

        if (hasLegIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"LegIndividualAllocID\": \"");
            builder.append(this.legIndividualAllocID(), 0, legIndividualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasNoNested2PartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"Nested2PartyIDsGroup\": [\n");
            Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            for (int i = 0, size = this.noNested2PartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nested2PartyIDsGroup.appendTo(builder, level + 1);
                if (nested2PartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nested2PartyIDsGroup = nested2PartyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

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
            builder.append(this.legAllocAcctIDSource(), 0, legAllocAcctIDSourceLength());
            builder.append("\",\n");
        }

        if (hasLegAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"LegAllocSettlCurrency\": \"");
            builder.append(this.legAllocSettlCurrency(), 0, legAllocSettlCurrencyLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegPreAllocGrpEncoder.LegAllocsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LegPreAllocGrpEncoder.LegAllocsGroupEncoder)encoder);
    }

    public LegPreAllocGrpEncoder.LegAllocsGroupEncoder toEncoder(final LegPreAllocGrpEncoder.LegAllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasLegAllocAccount())
        {
            encoder.legAllocAccount(this.legAllocAccount(), 0, legAllocAccountLength());
        }

        if (hasLegIndividualAllocID())
        {
            encoder.legIndividualAllocID(this.legIndividualAllocID(), 0, legIndividualAllocIDLength());
        }


        final NestedParties2Encoder nestedParties2 = encoder.nestedParties2();        if (hasNoNested2PartyIDsGroupCounter)
        {
            final int size = this.noNested2PartyIDsGroupCounter;
            Nested2PartyIDsGroupDecoder nested2PartyIDsGroup = this.nested2PartyIDsGroup;
            Nested2PartyIDsGroupEncoder nested2PartyIDsGroupEncoder = nestedParties2.nested2PartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nested2PartyIDsGroup != null)
                {
                    nested2PartyIDsGroup.toEncoder(nested2PartyIDsGroupEncoder);
                    nested2PartyIDsGroup = nested2PartyIDsGroup.next();
                    nested2PartyIDsGroupEncoder = nested2PartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasLegAllocQty())
        {
            encoder.legAllocQty(this.legAllocQty());
        }

        if (hasLegAllocAcctIDSource())
        {
            encoder.legAllocAcctIDSource(this.legAllocAcctIDSource(), 0, legAllocAcctIDSourceLength());
        }

        if (hasLegAllocSettlCurrency())
        {
            encoder.legAllocSettlCurrency(this.legAllocSettlCurrency(), 0, legAllocSettlCurrencyLength());
        }
        return encoder;
    }

}
    public class LegAllocsGroupIterator implements Iterable<LegAllocsGroupDecoder>, java.util.Iterator<LegAllocsGroupDecoder>
    {
        private final LegPreAllocGrpDecoder parent;
        private int remainder;
        private LegAllocsGroupDecoder current;

        public LegAllocsGroupIterator(final LegPreAllocGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public LegAllocsGroupDecoder next()
        {
            remainder--;
            final LegAllocsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoLegAllocsGroupCounter() ? parent.noLegAllocsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.legAllocsGroup();
        }

        public LegAllocsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public LegAllocsGroupIterator legAllocsGroupIterator();
    public int noLegAllocsGroupCounter();
    public boolean hasNoLegAllocsGroupCounter();
    public LegAllocsGroupDecoder legAllocsGroup();

}
