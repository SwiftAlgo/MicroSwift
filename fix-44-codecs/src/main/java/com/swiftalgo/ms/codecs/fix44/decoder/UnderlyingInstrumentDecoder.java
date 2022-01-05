/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.UnderlyingInstrumentEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.UnderlyingInstrumentEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;

public interface UnderlyingInstrumentDecoder  extends UnderlyingStipulationsDecoder
{

    public char[] underlyingSymbol();
    public int underlyingSymbolLength();
    public void underlyingSymbol(AsciiSequenceView view);
    public char[] underlyingSymbolSfx();
    public boolean hasUnderlyingSymbolSfx();
    public int underlyingSymbolSfxLength();
    public void underlyingSymbolSfx(AsciiSequenceView view);
    public char[] underlyingSecurityID();
    public boolean hasUnderlyingSecurityID();
    public int underlyingSecurityIDLength();
    public void underlyingSecurityID(AsciiSequenceView view);
    public char[] underlyingSecurityIDSource();
    public boolean hasUnderlyingSecurityIDSource();
    public int underlyingSecurityIDSourceLength();
    public void underlyingSecurityIDSource(AsciiSequenceView view);


public class UnderlyingSecurityAltIDGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ALT_ID_SOURCE);
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
    public UnderlyingSecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingSecurityAltIDGroupDecoder next = null;

    public UnderlyingSecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] underlyingSecurityAltID = new char[1];

    private boolean hasUnderlyingSecurityAltID;

    public char[] underlyingSecurityAltID()
    {
        if (!hasUnderlyingSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltID");
        }

        return underlyingSecurityAltID;
    }

    public boolean hasUnderlyingSecurityAltID()
    {
        return hasUnderlyingSecurityAltID;
    }


    private int underlyingSecurityAltIDOffset;

    private int underlyingSecurityAltIDLength;

    public int underlyingSecurityAltIDLength()
    {
        if (!hasUnderlyingSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltID");
        }

        return underlyingSecurityAltIDLength;
    }

    public String underlyingSecurityAltIDAsString()
    {
        return hasUnderlyingSecurityAltID ? new String(underlyingSecurityAltID, 0, underlyingSecurityAltIDLength) : null;
    }

    public void underlyingSecurityAltID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltID");
        }

        view.wrap(buffer, underlyingSecurityAltIDOffset, underlyingSecurityAltIDLength);
    }


    private char[] underlyingSecurityAltIDSource = new char[1];

    private boolean hasUnderlyingSecurityAltIDSource;

    public char[] underlyingSecurityAltIDSource()
    {
        if (!hasUnderlyingSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltIDSource");
        }

        return underlyingSecurityAltIDSource;
    }

    public boolean hasUnderlyingSecurityAltIDSource()
    {
        return hasUnderlyingSecurityAltIDSource;
    }


    private int underlyingSecurityAltIDSourceOffset;

    private int underlyingSecurityAltIDSourceLength;

    public int underlyingSecurityAltIDSourceLength()
    {
        if (!hasUnderlyingSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltIDSource");
        }

        return underlyingSecurityAltIDSourceLength;
    }

    public String underlyingSecurityAltIDSourceAsString()
    {
        return hasUnderlyingSecurityAltIDSource ? new String(underlyingSecurityAltIDSource, 0, underlyingSecurityAltIDSourceLength) : null;
    }

    public void underlyingSecurityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityAltIDSource");
        }

        view.wrap(buffer, underlyingSecurityAltIDSourceOffset, underlyingSecurityAltIDSourceLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingSecurityAltIDGroup
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
                    next = new UnderlyingSecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_SECURITY_ALT_ID:
                hasUnderlyingSecurityAltID = true;
                underlyingSecurityAltID = buffer.getChars(underlyingSecurityAltID, valueOffset, valueLength);
                underlyingSecurityAltIDOffset = valueOffset;
                underlyingSecurityAltIDLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_ALT_ID_SOURCE:
                hasUnderlyingSecurityAltIDSource = true;
                underlyingSecurityAltIDSource = buffer.getChars(underlyingSecurityAltIDSource, valueOffset, valueLength);
                underlyingSecurityAltIDSourceOffset = valueOffset;
                underlyingSecurityAltIDSourceLength = valueLength;
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
        this.resetUnderlyingSecurityAltID();
        this.resetUnderlyingSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingSecurityAltID()
    {
        hasUnderlyingSecurityAltID = false;
    }

    public void resetUnderlyingSecurityAltIDSource()
    {
        hasUnderlyingSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"UnderlyingSecurityAltIDGroup\",\n");
        if (hasUnderlyingSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltID\": \"");
            builder.append(this.underlyingSecurityAltID(), 0, underlyingSecurityAltIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityAltIDSource\": \"");
            builder.append(this.underlyingSecurityAltIDSource(), 0, underlyingSecurityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingSecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UnderlyingSecurityAltIDGroupEncoder)encoder);
    }

    public UnderlyingSecurityAltIDGroupEncoder toEncoder(final UnderlyingSecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasUnderlyingSecurityAltID())
        {
            encoder.underlyingSecurityAltID(this.underlyingSecurityAltID(), 0, underlyingSecurityAltIDLength());
        }

        if (hasUnderlyingSecurityAltIDSource())
        {
            encoder.underlyingSecurityAltIDSource(this.underlyingSecurityAltIDSource(), 0, underlyingSecurityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class UnderlyingSecurityAltIDGroupIterator implements Iterable<UnderlyingSecurityAltIDGroupDecoder>, java.util.Iterator<UnderlyingSecurityAltIDGroupDecoder>
    {
        private final UnderlyingInstrumentDecoder parent;
        private int remainder;
        private UnderlyingSecurityAltIDGroupDecoder current;

        public UnderlyingSecurityAltIDGroupIterator(final UnderlyingInstrumentDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public UnderlyingSecurityAltIDGroupDecoder next()
        {
            remainder--;
            final UnderlyingSecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingSecurityAltIDGroupCounter() ? parent.noUnderlyingSecurityAltIDGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingSecurityAltIDGroup();
        }
        public UnderlyingSecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public UnderlyingSecurityAltIDGroupIterator underlyingSecurityAltIDGroupIterator();
    public int noUnderlyingSecurityAltIDGroupCounter();
    public boolean hasNoUnderlyingSecurityAltIDGroupCounter();
    public UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup();
    public int underlyingProduct();
    public boolean hasUnderlyingProduct();
    public char[] underlyingCFICode();
    public boolean hasUnderlyingCFICode();
    public int underlyingCFICodeLength();
    public void underlyingCFICode(AsciiSequenceView view);
    public char[] underlyingSecurityType();
    public boolean hasUnderlyingSecurityType();
    public int underlyingSecurityTypeLength();
    public void underlyingSecurityType(AsciiSequenceView view);
    public char[] underlyingSecuritySubType();
    public boolean hasUnderlyingSecuritySubType();
    public int underlyingSecuritySubTypeLength();
    public void underlyingSecuritySubType(AsciiSequenceView view);
    public byte[] underlyingMaturityMonthYear();
    public boolean hasUnderlyingMaturityMonthYear();
    public int underlyingMaturityMonthYearLength();
    public void underlyingMaturityMonthYear(AsciiSequenceView view);
    public byte[] underlyingMaturityDate();
    public boolean hasUnderlyingMaturityDate();
    public int underlyingMaturityDateLength();
    public void underlyingMaturityDate(AsciiSequenceView view);
    public int underlyingPutOrCall();
    public boolean hasUnderlyingPutOrCall();
    public UnderlyingPutOrCall underlyingPutOrCallAsEnum();
    public byte[] underlyingCouponPaymentDate();
    public boolean hasUnderlyingCouponPaymentDate();
    public int underlyingCouponPaymentDateLength();
    public void underlyingCouponPaymentDate(AsciiSequenceView view);
    public byte[] underlyingIssueDate();
    public boolean hasUnderlyingIssueDate();
    public int underlyingIssueDateLength();
    public void underlyingIssueDate(AsciiSequenceView view);
    public char[] underlyingRepoCollateralSecurityType();
    public boolean hasUnderlyingRepoCollateralSecurityType();
    public int underlyingRepoCollateralSecurityTypeLength();
    public void underlyingRepoCollateralSecurityType(AsciiSequenceView view);
    public int underlyingRepurchaseTerm();
    public boolean hasUnderlyingRepurchaseTerm();
    public DecimalFloat underlyingRepurchaseRate();
    public boolean hasUnderlyingRepurchaseRate();
    public DecimalFloat underlyingFactor();
    public boolean hasUnderlyingFactor();
    public char[] underlyingCreditRating();
    public boolean hasUnderlyingCreditRating();
    public int underlyingCreditRatingLength();
    public void underlyingCreditRating(AsciiSequenceView view);
    public char[] underlyingInstrRegistry();
    public boolean hasUnderlyingInstrRegistry();
    public int underlyingInstrRegistryLength();
    public void underlyingInstrRegistry(AsciiSequenceView view);
    public char[] underlyingCountryOfIssue();
    public boolean hasUnderlyingCountryOfIssue();
    public int underlyingCountryOfIssueLength();
    public void underlyingCountryOfIssue(AsciiSequenceView view);
    public char[] underlyingStateOrProvinceOfIssue();
    public boolean hasUnderlyingStateOrProvinceOfIssue();
    public int underlyingStateOrProvinceOfIssueLength();
    public void underlyingStateOrProvinceOfIssue(AsciiSequenceView view);
    public char[] underlyingLocaleOfIssue();
    public boolean hasUnderlyingLocaleOfIssue();
    public int underlyingLocaleOfIssueLength();
    public void underlyingLocaleOfIssue(AsciiSequenceView view);
    public byte[] underlyingRedemptionDate();
    public boolean hasUnderlyingRedemptionDate();
    public int underlyingRedemptionDateLength();
    public void underlyingRedemptionDate(AsciiSequenceView view);
    public DecimalFloat underlyingStrikePrice();
    public boolean hasUnderlyingStrikePrice();
    public char[] underlyingStrikeCurrency();
    public boolean hasUnderlyingStrikeCurrency();
    public int underlyingStrikeCurrencyLength();
    public void underlyingStrikeCurrency(AsciiSequenceView view);
    public char underlyingOptAttribute();
    public boolean hasUnderlyingOptAttribute();
    public DecimalFloat underlyingContractMultiplier();
    public boolean hasUnderlyingContractMultiplier();
    public DecimalFloat underlyingCouponRate();
    public boolean hasUnderlyingCouponRate();
    public char[] underlyingSecurityExchange();
    public boolean hasUnderlyingSecurityExchange();
    public int underlyingSecurityExchangeLength();
    public void underlyingSecurityExchange(AsciiSequenceView view);
    public char[] underlyingIssuer();
    public boolean hasUnderlyingIssuer();
    public int underlyingIssuerLength();
    public void underlyingIssuer(AsciiSequenceView view);
    public int encodedUnderlyingIssuerLen();
    public boolean hasEncodedUnderlyingIssuerLen();
    public byte[] encodedUnderlyingIssuer();
    public boolean hasEncodedUnderlyingIssuer();
    public char[] underlyingSecurityDesc();
    public boolean hasUnderlyingSecurityDesc();
    public int underlyingSecurityDescLength();
    public void underlyingSecurityDesc(AsciiSequenceView view);
    public int encodedUnderlyingSecurityDescLen();
    public boolean hasEncodedUnderlyingSecurityDescLen();
    public byte[] encodedUnderlyingSecurityDesc();
    public boolean hasEncodedUnderlyingSecurityDesc();
    public char[] underlyingCPProgram();
    public boolean hasUnderlyingCPProgram();
    public int underlyingCPProgramLength();
    public void underlyingCPProgram(AsciiSequenceView view);
    public char[] underlyingCPRegType();
    public boolean hasUnderlyingCPRegType();
    public int underlyingCPRegTypeLength();
    public void underlyingCPRegType(AsciiSequenceView view);
    public char[] underlyingCurrency();
    public boolean hasUnderlyingCurrency();
    public int underlyingCurrencyLength();
    public void underlyingCurrency(AsciiSequenceView view);
    public DecimalFloat underlyingQty();
    public boolean hasUnderlyingQty();
    public DecimalFloat underlyingPx();
    public boolean hasUnderlyingPx();
    public DecimalFloat underlyingDirtyPrice();
    public boolean hasUnderlyingDirtyPrice();
    public DecimalFloat underlyingEndPrice();
    public boolean hasUnderlyingEndPrice();
    public DecimalFloat underlyingStartValue();
    public boolean hasUnderlyingStartValue();
    public DecimalFloat underlyingCurrentValue();
    public boolean hasUnderlyingCurrentValue();
    public DecimalFloat underlyingEndValue();
    public boolean hasUnderlyingEndValue();

}
