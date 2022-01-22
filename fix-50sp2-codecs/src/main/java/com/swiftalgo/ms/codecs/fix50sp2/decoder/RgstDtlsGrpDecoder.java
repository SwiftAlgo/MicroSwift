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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDtlsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDtlsGrpEncoder.RegistDtlsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;

public interface RgstDtlsGrpDecoder 
{



public class RegistDtlsGroupDecoder extends CommonDecoderImpl implements NestedPartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.REGIST_DTLS);
            GROUP_FIELDS.add(Constants.REGIST_EMAIL);
            GROUP_FIELDS.add(Constants.MAILING_DTLS);
            GROUP_FIELDS.add(Constants.MAILING_INST);
            GROUP_FIELDS.add(Constants.OWNER_TYPE);
            GROUP_FIELDS.add(Constants.DATE_OF_BIRTH);
            GROUP_FIELDS.add(Constants.INVESTOR_COUNTRY_OF_RESIDENCE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REGIST_DTLS);
            ALL_GROUP_FIELDS.add(Constants.REGIST_EMAIL);
            ALL_GROUP_FIELDS.add(Constants.MAILING_DTLS);
            ALL_GROUP_FIELDS.add(Constants.MAILING_INST);
            ALL_GROUP_FIELDS.add(Constants.OWNER_TYPE);
            ALL_GROUP_FIELDS.add(Constants.DATE_OF_BIRTH);
            ALL_GROUP_FIELDS.add(Constants.INVESTOR_COUNTRY_OF_RESIDENCE);
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
        if (hasOwnerType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OwnerType.isValid(ownerType()))
        {
            invalidTagId = 522;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNestedPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final NestedPartyIDsGroupIterator iterator = nestedPartyIDsGroupIterator.iterator();
                for (final NestedPartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 539;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public RegistDtlsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private RegistDtlsGroupDecoder next = null;

    public RegistDtlsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(16);

    private char[] registDtls = new char[1];

    private boolean hasRegistDtls;

    public char[] registDtls()
    {
        if (!hasRegistDtls)
        {
            throw new IllegalArgumentException("No value for optional field: RegistDtls");
        }

        return registDtls;
    }

    public boolean hasRegistDtls()
    {
        return hasRegistDtls;
    }


    private int registDtlsOffset;

    private int registDtlsLength;

    public int registDtlsLength()
    {
        if (!hasRegistDtls)
        {
            throw new IllegalArgumentException("No value for optional field: RegistDtls");
        }

        return registDtlsLength;
    }

    public String registDtlsAsString()
    {
        return hasRegistDtls ? new String(registDtls, 0, registDtlsLength) : null;
    }

    public void registDtls(final AsciiSequenceView view)
    {
        if (!hasRegistDtls)
        {
            throw new IllegalArgumentException("No value for optional field: RegistDtls");
        }

        view.wrap(buffer, registDtlsOffset, registDtlsLength);
    }


    private final CharArrayWrapper registDtlsWrapper = new CharArrayWrapper();
    private char[] registEmail = new char[1];

    private boolean hasRegistEmail;

    public char[] registEmail()
    {
        if (!hasRegistEmail)
        {
            throw new IllegalArgumentException("No value for optional field: RegistEmail");
        }

        return registEmail;
    }

    public boolean hasRegistEmail()
    {
        return hasRegistEmail;
    }


    private int registEmailOffset;

    private int registEmailLength;

    public int registEmailLength()
    {
        if (!hasRegistEmail)
        {
            throw new IllegalArgumentException("No value for optional field: RegistEmail");
        }

        return registEmailLength;
    }

    public String registEmailAsString()
    {
        return hasRegistEmail ? new String(registEmail, 0, registEmailLength) : null;
    }

    public void registEmail(final AsciiSequenceView view)
    {
        if (!hasRegistEmail)
        {
            throw new IllegalArgumentException("No value for optional field: RegistEmail");
        }

        view.wrap(buffer, registEmailOffset, registEmailLength);
    }


    private final CharArrayWrapper registEmailWrapper = new CharArrayWrapper();
    private char[] mailingDtls = new char[1];

    private boolean hasMailingDtls;

    public char[] mailingDtls()
    {
        if (!hasMailingDtls)
        {
            throw new IllegalArgumentException("No value for optional field: MailingDtls");
        }

        return mailingDtls;
    }

    public boolean hasMailingDtls()
    {
        return hasMailingDtls;
    }


    private int mailingDtlsOffset;

    private int mailingDtlsLength;

    public int mailingDtlsLength()
    {
        if (!hasMailingDtls)
        {
            throw new IllegalArgumentException("No value for optional field: MailingDtls");
        }

        return mailingDtlsLength;
    }

    public String mailingDtlsAsString()
    {
        return hasMailingDtls ? new String(mailingDtls, 0, mailingDtlsLength) : null;
    }

    public void mailingDtls(final AsciiSequenceView view)
    {
        if (!hasMailingDtls)
        {
            throw new IllegalArgumentException("No value for optional field: MailingDtls");
        }

        view.wrap(buffer, mailingDtlsOffset, mailingDtlsLength);
    }


    private final CharArrayWrapper mailingDtlsWrapper = new CharArrayWrapper();
    private char[] mailingInst = new char[1];

    private boolean hasMailingInst;

    public char[] mailingInst()
    {
        if (!hasMailingInst)
        {
            throw new IllegalArgumentException("No value for optional field: MailingInst");
        }

        return mailingInst;
    }

    public boolean hasMailingInst()
    {
        return hasMailingInst;
    }


    private int mailingInstOffset;

    private int mailingInstLength;

    public int mailingInstLength()
    {
        if (!hasMailingInst)
        {
            throw new IllegalArgumentException("No value for optional field: MailingInst");
        }

        return mailingInstLength;
    }

    public String mailingInstAsString()
    {
        return hasMailingInst ? new String(mailingInst, 0, mailingInstLength) : null;
    }

    public void mailingInst(final AsciiSequenceView view)
    {
        if (!hasMailingInst)
        {
            throw new IllegalArgumentException("No value for optional field: MailingInst");
        }

        view.wrap(buffer, mailingInstOffset, mailingInstLength);
    }


    private final CharArrayWrapper mailingInstWrapper = new CharArrayWrapper();


    private NestedPartyIDsGroupDecoder nestedPartyIDsGroup = null;
    public NestedPartyIDsGroupDecoder nestedPartyIDsGroup()
    {
        return nestedPartyIDsGroup;
    }

    private int noNestedPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNestedPartyIDsGroupCounter;

    public int noNestedPartyIDsGroupCounter()
    {
        if (!hasNoNestedPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedPartyIDsGroupCounter");
        }

        return noNestedPartyIDsGroupCounter;
    }

    public boolean hasNoNestedPartyIDsGroupCounter()
    {
        return hasNoNestedPartyIDsGroupCounter;
    }




    private NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator = new NestedPartyIDsGroupIterator(this);
    public NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator()
    {
        return nestedPartyIDsGroupIterator.iterator();
    }


    private int ownerType = MISSING_INT;

    private boolean hasOwnerType;

    public int ownerType()
    {
        if (!hasOwnerType)
        {
            throw new IllegalArgumentException("No value for optional field: OwnerType");
        }

        return ownerType;
    }

    public boolean hasOwnerType()
    {
        return hasOwnerType;
    }



    private final CharArrayWrapper ownerTypeWrapper = new CharArrayWrapper();
    public OwnerType ownerTypeAsEnum()
    {
        if (!hasOwnerType)
 return OwnerType.NULL_VAL;
        return OwnerType.decode(ownerType);
    }

    private byte[] dateOfBirth = new byte[8];

    private boolean hasDateOfBirth;

    public byte[] dateOfBirth()
    {
        if (!hasDateOfBirth)
        {
            throw new IllegalArgumentException("No value for optional field: DateOfBirth");
        }

        return dateOfBirth;
    }

    public boolean hasDateOfBirth()
    {
        return hasDateOfBirth;
    }


    private int dateOfBirthOffset;

    private int dateOfBirthLength;

    public int dateOfBirthLength()
    {
        if (!hasDateOfBirth)
        {
            throw new IllegalArgumentException("No value for optional field: DateOfBirth");
        }

        return dateOfBirthLength;
    }

    public String dateOfBirthAsString()
    {
        return hasDateOfBirth ? new String(dateOfBirth, 0, dateOfBirthLength) : null;
    }

    public void dateOfBirth(final AsciiSequenceView view)
    {
        if (!hasDateOfBirth)
        {
            throw new IllegalArgumentException("No value for optional field: DateOfBirth");
        }

        view.wrap(buffer, dateOfBirthOffset, dateOfBirthLength);
    }


    private char[] investorCountryOfResidence = new char[1];

    private boolean hasInvestorCountryOfResidence;

    public char[] investorCountryOfResidence()
    {
        if (!hasInvestorCountryOfResidence)
        {
            throw new IllegalArgumentException("No value for optional field: InvestorCountryOfResidence");
        }

        return investorCountryOfResidence;
    }

    public boolean hasInvestorCountryOfResidence()
    {
        return hasInvestorCountryOfResidence;
    }


    private int investorCountryOfResidenceOffset;

    private int investorCountryOfResidenceLength;

    public int investorCountryOfResidenceLength()
    {
        if (!hasInvestorCountryOfResidence)
        {
            throw new IllegalArgumentException("No value for optional field: InvestorCountryOfResidence");
        }

        return investorCountryOfResidenceLength;
    }

    public String investorCountryOfResidenceAsString()
    {
        return hasInvestorCountryOfResidence ? new String(investorCountryOfResidence, 0, investorCountryOfResidenceLength) : null;
    }

    public void investorCountryOfResidence(final AsciiSequenceView view)
    {
        if (!hasInvestorCountryOfResidence)
        {
            throw new IllegalArgumentException("No value for optional field: InvestorCountryOfResidence");
        }

        view.wrap(buffer, investorCountryOfResidenceOffset, investorCountryOfResidenceLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode RegistDtlsGroup
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
                    next = new RegistDtlsGroupDecoder(trailer, messageFields);
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
            case Constants.REGIST_DTLS:
                hasRegistDtls = true;
                registDtls = buffer.getChars(registDtls, valueOffset, valueLength);
                registDtlsOffset = valueOffset;
                registDtlsLength = valueLength;
                break;

            case Constants.REGIST_EMAIL:
                hasRegistEmail = true;
                registEmail = buffer.getChars(registEmail, valueOffset, valueLength);
                registEmailOffset = valueOffset;
                registEmailLength = valueLength;
                break;

            case Constants.MAILING_DTLS:
                hasMailingDtls = true;
                mailingDtls = buffer.getChars(mailingDtls, valueOffset, valueLength);
                mailingDtlsOffset = valueOffset;
                mailingDtlsLength = valueLength;
                break;

            case Constants.MAILING_INST:
                hasMailingInst = true;
                mailingInst = buffer.getChars(mailingInst, valueOffset, valueLength);
                mailingInstOffset = valueOffset;
                mailingInstLength = valueLength;
                break;

            case Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER:
                hasNoNestedPartyIDsGroupCounter = true;
                noNestedPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 539, CODEC_VALIDATION_ENABLED);
                if (nestedPartyIDsGroup == null)
                {
                    nestedPartyIDsGroup = new NestedPartyIDsGroupDecoder(trailer, messageFields);
                }
                NestedPartyIDsGroupDecoder nestedPartyIDsGroupCurrent = nestedPartyIDsGroup;
                position = endOfField + 1;
                final int noNestedPartyIDsGroupCounter = this.noNestedPartyIDsGroupCounter;
                for (int i = 0; i < noNestedPartyIDsGroupCounter && position < end; i++)
                {
                    if (nestedPartyIDsGroupCurrent != null)
                    {
                        position += nestedPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nestedPartyIDsGroupCurrent = nestedPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.OWNER_TYPE:
                hasOwnerType = true;
                ownerType = getInt(buffer, valueOffset, endOfField, 522, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DATE_OF_BIRTH:
                hasDateOfBirth = true;
                dateOfBirth = buffer.getBytes(dateOfBirth, valueOffset, valueLength);
                dateOfBirthOffset = valueOffset;
                dateOfBirthLength = valueLength;
                break;

            case Constants.INVESTOR_COUNTRY_OF_RESIDENCE:
                hasInvestorCountryOfResidence = true;
                investorCountryOfResidence = buffer.getChars(investorCountryOfResidence, valueOffset, valueLength);
                investorCountryOfResidenceOffset = valueOffset;
                investorCountryOfResidenceLength = valueLength;
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
        this.resetRegistDtls();
        this.resetRegistEmail();
        this.resetMailingDtls();
        this.resetMailingInst();
        this.resetOwnerType();
        this.resetDateOfBirth();
        this.resetInvestorCountryOfResidence();
        this.resetNestedPartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRegistDtls()
    {
        hasRegistDtls = false;
    }

    public void resetRegistEmail()
    {
        hasRegistEmail = false;
    }

    public void resetMailingDtls()
    {
        hasMailingDtls = false;
    }

    public void resetMailingInst()
    {
        hasMailingInst = false;
    }

    public void resetOwnerType()
    {
        hasOwnerType = false;
    }

    public void resetDateOfBirth()
    {
        hasDateOfBirth = false;
    }

    public void resetInvestorCountryOfResidence()
    {
        hasInvestorCountryOfResidence = false;
    }

    public void resetNestedPartyIDsGroup()
    {
        for (final NestedPartyIDsGroupDecoder nestedPartyIDsGroupDecoder : nestedPartyIDsGroupIterator.iterator())
        {
            nestedPartyIDsGroupDecoder.reset();
            if (nestedPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedPartyIDsGroupCounter = MISSING_INT;
        hasNoNestedPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RegistDtlsGroup\",\n");
        if (hasRegistDtls())
        {
            indent(builder, level);
            builder.append("\"RegistDtls\": \"");
            builder.append(this.registDtls(), 0, registDtlsLength());
            builder.append("\",\n");
        }

        if (hasRegistEmail())
        {
            indent(builder, level);
            builder.append("\"RegistEmail\": \"");
            builder.append(this.registEmail(), 0, registEmailLength());
            builder.append("\",\n");
        }

        if (hasMailingDtls())
        {
            indent(builder, level);
            builder.append("\"MailingDtls\": \"");
            builder.append(this.mailingDtls(), 0, mailingDtlsLength());
            builder.append("\",\n");
        }

        if (hasMailingInst())
        {
            indent(builder, level);
            builder.append("\"MailingInst\": \"");
            builder.append(this.mailingInst(), 0, mailingInstLength());
            builder.append("\",\n");
        }

        if (hasNoNestedPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedPartyIDsGroup\": [\n");
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            for (int i = 0, size = this.noNestedPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nestedPartyIDsGroup.appendTo(builder, level + 1);
                if (nestedPartyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedPartyIDsGroup = nestedPartyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasOwnerType())
        {
            indent(builder, level);
            builder.append("\"OwnerType\": \"");
            builder.append(ownerType);
            builder.append("\",\n");
        }

        if (hasDateOfBirth())
        {
            indent(builder, level);
            builder.append("\"DateOfBirth\": \"");
            appendData(builder, dateOfBirth, dateOfBirthLength);
            builder.append("\",\n");
        }

        if (hasInvestorCountryOfResidence())
        {
            indent(builder, level);
            builder.append("\"InvestorCountryOfResidence\": \"");
            builder.append(this.investorCountryOfResidence(), 0, investorCountryOfResidenceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RgstDtlsGrpEncoder.RegistDtlsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RgstDtlsGrpEncoder.RegistDtlsGroupEncoder)encoder);
    }

    public RgstDtlsGrpEncoder.RegistDtlsGroupEncoder toEncoder(final RgstDtlsGrpEncoder.RegistDtlsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRegistDtls())
        {
            encoder.registDtls(this.registDtls(), 0, registDtlsLength());
        }

        if (hasRegistEmail())
        {
            encoder.registEmail(this.registEmail(), 0, registEmailLength());
        }

        if (hasMailingDtls())
        {
            encoder.mailingDtls(this.mailingDtls(), 0, mailingDtlsLength());
        }

        if (hasMailingInst())
        {
            encoder.mailingInst(this.mailingInst(), 0, mailingInstLength());
        }


        final NestedPartiesEncoder nestedParties = encoder.nestedParties();        if (hasNoNestedPartyIDsGroupCounter)
        {
            final int size = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroupEncoder = nestedParties.nestedPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartyIDsGroup != null)
                {
                    nestedPartyIDsGroup.toEncoder(nestedPartyIDsGroupEncoder);
                    nestedPartyIDsGroup = nestedPartyIDsGroup.next();
                    nestedPartyIDsGroupEncoder = nestedPartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasOwnerType())
        {
            encoder.ownerType(this.ownerType());
        }

        if (hasDateOfBirth())
        {
            encoder.dateOfBirthAsCopy(this.dateOfBirth(), 0, dateOfBirthLength());
        }

        if (hasInvestorCountryOfResidence())
        {
            encoder.investorCountryOfResidence(this.investorCountryOfResidence(), 0, investorCountryOfResidenceLength());
        }
        return encoder;
    }

}
    public class RegistDtlsGroupIterator implements Iterable<RegistDtlsGroupDecoder>, java.util.Iterator<RegistDtlsGroupDecoder>
    {
        private final RgstDtlsGrpDecoder parent;
        private int remainder;
        private RegistDtlsGroupDecoder current;

        public RegistDtlsGroupIterator(final RgstDtlsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public RegistDtlsGroupDecoder next()
        {
            remainder--;
            final RegistDtlsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoRegistDtlsGroupCounter() ? parent.noRegistDtlsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.registDtlsGroup();
        }

        public RegistDtlsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public RegistDtlsGroupIterator registDtlsGroupIterator();
    public int noRegistDtlsGroupCounter();
    public boolean hasNoRegistDtlsGroupCounter();
    public RegistDtlsGroupDecoder registDtlsGroup();

}
