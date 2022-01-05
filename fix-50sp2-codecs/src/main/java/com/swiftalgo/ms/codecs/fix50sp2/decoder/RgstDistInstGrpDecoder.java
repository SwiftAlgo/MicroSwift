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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDistInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDistInstGrpEncoder.DistribInstsGroupEncoder;

public interface RgstDistInstGrpDecoder 
{



public class DistribInstsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.DISTRIB_PAYMENT_METHOD);
            ALL_GROUP_FIELDS.add(Constants.DISTRIB_PERCENTAGE);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_CURR);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_AGENT_NAME);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_AGENT_CODE);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NUMBER);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_PAY_REF);
            ALL_GROUP_FIELDS.add(Constants.CASH_DISTRIB_AGENT_ACCT_NAME);
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
        if (hasDistribPaymentMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DistribPaymentMethod.isValid(distribPaymentMethod()))
        {
            invalidTagId = 477;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public DistribInstsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private DistribInstsGroupDecoder next = null;

    public DistribInstsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(16);

    private int distribPaymentMethod = MISSING_INT;

    private boolean hasDistribPaymentMethod;

    public int distribPaymentMethod()
    {
        if (!hasDistribPaymentMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DistribPaymentMethod");
        }

        return distribPaymentMethod;
    }

    public boolean hasDistribPaymentMethod()
    {
        return hasDistribPaymentMethod;
    }



    private final CharArrayWrapper distribPaymentMethodWrapper = new CharArrayWrapper();
    public DistribPaymentMethod distribPaymentMethodAsEnum()
    {
        if (!hasDistribPaymentMethod)
 return DistribPaymentMethod.NULL_VAL;
        return DistribPaymentMethod.decode(distribPaymentMethod);
    }

    private DecimalFloat distribPercentage = DecimalFloat.newNaNValue();

    private boolean hasDistribPercentage;

    public DecimalFloat distribPercentage()
    {
        if (!hasDistribPercentage)
        {
            throw new IllegalArgumentException("No value for optional field: DistribPercentage");
        }

        return distribPercentage;
    }

    public boolean hasDistribPercentage()
    {
        return hasDistribPercentage;
    }



    private char[] cashDistribCurr = new char[1];

    private boolean hasCashDistribCurr;

    public char[] cashDistribCurr()
    {
        if (!hasCashDistribCurr)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribCurr");
        }

        return cashDistribCurr;
    }

    public boolean hasCashDistribCurr()
    {
        return hasCashDistribCurr;
    }


    private int cashDistribCurrOffset;

    private int cashDistribCurrLength;

    public int cashDistribCurrLength()
    {
        if (!hasCashDistribCurr)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribCurr");
        }

        return cashDistribCurrLength;
    }

    public String cashDistribCurrAsString()
    {
        return hasCashDistribCurr ? new String(cashDistribCurr, 0, cashDistribCurrLength) : null;
    }

    public void cashDistribCurr(final AsciiSequenceView view)
    {
        if (!hasCashDistribCurr)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribCurr");
        }

        view.wrap(buffer, cashDistribCurrOffset, cashDistribCurrLength);
    }


    private char[] cashDistribAgentName = new char[1];

    private boolean hasCashDistribAgentName;

    public char[] cashDistribAgentName()
    {
        if (!hasCashDistribAgentName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentName");
        }

        return cashDistribAgentName;
    }

    public boolean hasCashDistribAgentName()
    {
        return hasCashDistribAgentName;
    }


    private int cashDistribAgentNameOffset;

    private int cashDistribAgentNameLength;

    public int cashDistribAgentNameLength()
    {
        if (!hasCashDistribAgentName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentName");
        }

        return cashDistribAgentNameLength;
    }

    public String cashDistribAgentNameAsString()
    {
        return hasCashDistribAgentName ? new String(cashDistribAgentName, 0, cashDistribAgentNameLength) : null;
    }

    public void cashDistribAgentName(final AsciiSequenceView view)
    {
        if (!hasCashDistribAgentName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentName");
        }

        view.wrap(buffer, cashDistribAgentNameOffset, cashDistribAgentNameLength);
    }


    private char[] cashDistribAgentCode = new char[1];

    private boolean hasCashDistribAgentCode;

    public char[] cashDistribAgentCode()
    {
        if (!hasCashDistribAgentCode)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentCode");
        }

        return cashDistribAgentCode;
    }

    public boolean hasCashDistribAgentCode()
    {
        return hasCashDistribAgentCode;
    }


    private int cashDistribAgentCodeOffset;

    private int cashDistribAgentCodeLength;

    public int cashDistribAgentCodeLength()
    {
        if (!hasCashDistribAgentCode)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentCode");
        }

        return cashDistribAgentCodeLength;
    }

    public String cashDistribAgentCodeAsString()
    {
        return hasCashDistribAgentCode ? new String(cashDistribAgentCode, 0, cashDistribAgentCodeLength) : null;
    }

    public void cashDistribAgentCode(final AsciiSequenceView view)
    {
        if (!hasCashDistribAgentCode)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentCode");
        }

        view.wrap(buffer, cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
    }


    private char[] cashDistribAgentAcctNumber = new char[1];

    private boolean hasCashDistribAgentAcctNumber;

    public char[] cashDistribAgentAcctNumber()
    {
        if (!hasCashDistribAgentAcctNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctNumber");
        }

        return cashDistribAgentAcctNumber;
    }

    public boolean hasCashDistribAgentAcctNumber()
    {
        return hasCashDistribAgentAcctNumber;
    }


    private int cashDistribAgentAcctNumberOffset;

    private int cashDistribAgentAcctNumberLength;

    public int cashDistribAgentAcctNumberLength()
    {
        if (!hasCashDistribAgentAcctNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctNumber");
        }

        return cashDistribAgentAcctNumberLength;
    }

    public String cashDistribAgentAcctNumberAsString()
    {
        return hasCashDistribAgentAcctNumber ? new String(cashDistribAgentAcctNumber, 0, cashDistribAgentAcctNumberLength) : null;
    }

    public void cashDistribAgentAcctNumber(final AsciiSequenceView view)
    {
        if (!hasCashDistribAgentAcctNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctNumber");
        }

        view.wrap(buffer, cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
    }


    private char[] cashDistribPayRef = new char[1];

    private boolean hasCashDistribPayRef;

    public char[] cashDistribPayRef()
    {
        if (!hasCashDistribPayRef)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribPayRef");
        }

        return cashDistribPayRef;
    }

    public boolean hasCashDistribPayRef()
    {
        return hasCashDistribPayRef;
    }


    private int cashDistribPayRefOffset;

    private int cashDistribPayRefLength;

    public int cashDistribPayRefLength()
    {
        if (!hasCashDistribPayRef)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribPayRef");
        }

        return cashDistribPayRefLength;
    }

    public String cashDistribPayRefAsString()
    {
        return hasCashDistribPayRef ? new String(cashDistribPayRef, 0, cashDistribPayRefLength) : null;
    }

    public void cashDistribPayRef(final AsciiSequenceView view)
    {
        if (!hasCashDistribPayRef)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribPayRef");
        }

        view.wrap(buffer, cashDistribPayRefOffset, cashDistribPayRefLength);
    }


    private char[] cashDistribAgentAcctName = new char[1];

    private boolean hasCashDistribAgentAcctName;

    public char[] cashDistribAgentAcctName()
    {
        if (!hasCashDistribAgentAcctName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctName");
        }

        return cashDistribAgentAcctName;
    }

    public boolean hasCashDistribAgentAcctName()
    {
        return hasCashDistribAgentAcctName;
    }


    private int cashDistribAgentAcctNameOffset;

    private int cashDistribAgentAcctNameLength;

    public int cashDistribAgentAcctNameLength()
    {
        if (!hasCashDistribAgentAcctName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctName");
        }

        return cashDistribAgentAcctNameLength;
    }

    public String cashDistribAgentAcctNameAsString()
    {
        return hasCashDistribAgentAcctName ? new String(cashDistribAgentAcctName, 0, cashDistribAgentAcctNameLength) : null;
    }

    public void cashDistribAgentAcctName(final AsciiSequenceView view)
    {
        if (!hasCashDistribAgentAcctName)
        {
            throw new IllegalArgumentException("No value for optional field: CashDistribAgentAcctName");
        }

        view.wrap(buffer, cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode DistribInstsGroup
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
                    next = new DistribInstsGroupDecoder(trailer, messageFields);
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
            case Constants.DISTRIB_PAYMENT_METHOD:
                hasDistribPaymentMethod = true;
                distribPaymentMethod = getInt(buffer, valueOffset, endOfField, 477, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISTRIB_PERCENTAGE:
                hasDistribPercentage = true;
                distribPercentage = getFloat(buffer, distribPercentage, valueOffset, valueLength, 512, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CASH_DISTRIB_CURR:
                hasCashDistribCurr = true;
                cashDistribCurr = buffer.getChars(cashDistribCurr, valueOffset, valueLength);
                cashDistribCurrOffset = valueOffset;
                cashDistribCurrLength = valueLength;
                break;

            case Constants.CASH_DISTRIB_AGENT_NAME:
                hasCashDistribAgentName = true;
                cashDistribAgentName = buffer.getChars(cashDistribAgentName, valueOffset, valueLength);
                cashDistribAgentNameOffset = valueOffset;
                cashDistribAgentNameLength = valueLength;
                break;

            case Constants.CASH_DISTRIB_AGENT_CODE:
                hasCashDistribAgentCode = true;
                cashDistribAgentCode = buffer.getChars(cashDistribAgentCode, valueOffset, valueLength);
                cashDistribAgentCodeOffset = valueOffset;
                cashDistribAgentCodeLength = valueLength;
                break;

            case Constants.CASH_DISTRIB_AGENT_ACCT_NUMBER:
                hasCashDistribAgentAcctNumber = true;
                cashDistribAgentAcctNumber = buffer.getChars(cashDistribAgentAcctNumber, valueOffset, valueLength);
                cashDistribAgentAcctNumberOffset = valueOffset;
                cashDistribAgentAcctNumberLength = valueLength;
                break;

            case Constants.CASH_DISTRIB_PAY_REF:
                hasCashDistribPayRef = true;
                cashDistribPayRef = buffer.getChars(cashDistribPayRef, valueOffset, valueLength);
                cashDistribPayRefOffset = valueOffset;
                cashDistribPayRefLength = valueLength;
                break;

            case Constants.CASH_DISTRIB_AGENT_ACCT_NAME:
                hasCashDistribAgentAcctName = true;
                cashDistribAgentAcctName = buffer.getChars(cashDistribAgentAcctName, valueOffset, valueLength);
                cashDistribAgentAcctNameOffset = valueOffset;
                cashDistribAgentAcctNameLength = valueLength;
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
        this.resetDistribPaymentMethod();
        this.resetDistribPercentage();
        this.resetCashDistribCurr();
        this.resetCashDistribAgentName();
        this.resetCashDistribAgentCode();
        this.resetCashDistribAgentAcctNumber();
        this.resetCashDistribPayRef();
        this.resetCashDistribAgentAcctName();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetDistribPaymentMethod()
    {
        hasDistribPaymentMethod = false;
    }

    public void resetDistribPercentage()
    {
        hasDistribPercentage = false;
    }

    public void resetCashDistribCurr()
    {
        hasCashDistribCurr = false;
    }

    public void resetCashDistribAgentName()
    {
        hasCashDistribAgentName = false;
    }

    public void resetCashDistribAgentCode()
    {
        hasCashDistribAgentCode = false;
    }

    public void resetCashDistribAgentAcctNumber()
    {
        hasCashDistribAgentAcctNumber = false;
    }

    public void resetCashDistribPayRef()
    {
        hasCashDistribPayRef = false;
    }

    public void resetCashDistribAgentAcctName()
    {
        hasCashDistribAgentAcctName = false;
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
        builder.append("\"MessageName\": \"DistribInstsGroup\",\n");
        if (hasDistribPaymentMethod())
        {
            indent(builder, level);
            builder.append("\"DistribPaymentMethod\": \"");
            builder.append(distribPaymentMethod);
            builder.append("\",\n");
        }

        if (hasDistribPercentage())
        {
            indent(builder, level);
            builder.append("\"DistribPercentage\": \"");
            distribPercentage.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashDistribCurr())
        {
            indent(builder, level);
            builder.append("\"CashDistribCurr\": \"");
            builder.append(this.cashDistribCurr(), 0, cashDistribCurrLength());
            builder.append("\",\n");
        }

        if (hasCashDistribAgentName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentName\": \"");
            builder.append(this.cashDistribAgentName(), 0, cashDistribAgentNameLength());
            builder.append("\",\n");
        }

        if (hasCashDistribAgentCode())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentCode\": \"");
            builder.append(this.cashDistribAgentCode(), 0, cashDistribAgentCodeLength());
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctNumber())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctNumber\": \"");
            builder.append(this.cashDistribAgentAcctNumber(), 0, cashDistribAgentAcctNumberLength());
            builder.append("\",\n");
        }

        if (hasCashDistribPayRef())
        {
            indent(builder, level);
            builder.append("\"CashDistribPayRef\": \"");
            builder.append(this.cashDistribPayRef(), 0, cashDistribPayRefLength());
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctName\": \"");
            builder.append(this.cashDistribAgentAcctName(), 0, cashDistribAgentAcctNameLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DistribInstsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((DistribInstsGroupEncoder)encoder);
    }

    public DistribInstsGroupEncoder toEncoder(final DistribInstsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasDistribPaymentMethod())
        {
            encoder.distribPaymentMethod(this.distribPaymentMethod());
        }

        if (hasDistribPercentage())
        {
            encoder.distribPercentage(this.distribPercentage());
        }

        if (hasCashDistribCurr())
        {
            encoder.cashDistribCurr(this.cashDistribCurr(), 0, cashDistribCurrLength());
        }

        if (hasCashDistribAgentName())
        {
            encoder.cashDistribAgentName(this.cashDistribAgentName(), 0, cashDistribAgentNameLength());
        }

        if (hasCashDistribAgentCode())
        {
            encoder.cashDistribAgentCode(this.cashDistribAgentCode(), 0, cashDistribAgentCodeLength());
        }

        if (hasCashDistribAgentAcctNumber())
        {
            encoder.cashDistribAgentAcctNumber(this.cashDistribAgentAcctNumber(), 0, cashDistribAgentAcctNumberLength());
        }

        if (hasCashDistribPayRef())
        {
            encoder.cashDistribPayRef(this.cashDistribPayRef(), 0, cashDistribPayRefLength());
        }

        if (hasCashDistribAgentAcctName())
        {
            encoder.cashDistribAgentAcctName(this.cashDistribAgentAcctName(), 0, cashDistribAgentAcctNameLength());
        }
        return encoder;
    }

}
    public class DistribInstsGroupIterator implements Iterable<DistribInstsGroupDecoder>, java.util.Iterator<DistribInstsGroupDecoder>
    {
        private final RgstDistInstGrpDecoder parent;
        private int remainder;
        private DistribInstsGroupDecoder current;

        public DistribInstsGroupIterator(final RgstDistInstGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public DistribInstsGroupDecoder next()
        {
            remainder--;
            final DistribInstsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoDistribInstsGroupCounter() ? parent.noDistribInstsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.distribInstsGroup();
        }
        public DistribInstsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public DistribInstsGroupIterator distribInstsGroupIterator();
    public int noDistribInstsGroupCounter();
    public boolean hasNoDistribInstsGroupCounter();
    public DistribInstsGroupDecoder distribInstsGroup();

}
