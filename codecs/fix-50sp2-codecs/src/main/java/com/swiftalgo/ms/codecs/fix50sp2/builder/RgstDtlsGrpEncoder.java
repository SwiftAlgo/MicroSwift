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


public class RgstDtlsGrpEncoder
{
    private static final int noRegistDtlsGroupCounterHeaderLength = 4;
    private static final byte[] noRegistDtlsGroupCounterHeader = new byte[] {52, 55, 51, (byte) '='};



public static class RegistDtlsGroupEncoder
{
    private RegistDtlsGroupEncoder next = null;

    public RegistDtlsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RegistDtlsGroupEncoder();
        }
        return next;
    }

    private static final int registDtlsHeaderLength = 4;
    private static final byte[] registDtlsHeader = new byte[] {53, 48, 57, (byte) '='};

    private static final int registEmailHeaderLength = 4;
    private static final byte[] registEmailHeader = new byte[] {53, 49, 49, (byte) '='};

    private static final int mailingDtlsHeaderLength = 4;
    private static final byte[] mailingDtlsHeader = new byte[] {52, 55, 52, (byte) '='};

    private static final int mailingInstHeaderLength = 4;
    private static final byte[] mailingInstHeader = new byte[] {52, 56, 50, (byte) '='};

    private static final int ownerTypeHeaderLength = 4;
    private static final byte[] ownerTypeHeader = new byte[] {53, 50, 50, (byte) '='};

    private static final int dateOfBirthHeaderLength = 4;
    private static final byte[] dateOfBirthHeader = new byte[] {52, 56, 54, (byte) '='};

    private static final int investorCountryOfResidenceHeaderLength = 4;
    private static final byte[] investorCountryOfResidenceHeader = new byte[] {52, 55, 53, (byte) '='};

    private final MutableDirectBuffer registDtls = new UnsafeBuffer();

    private int registDtlsOffset = 0;

    private int registDtlsLength = 0;

    public RegistDtlsGroupEncoder registDtls(final DirectBuffer value, final int offset, final int length)
    {
        registDtls.wrap(value);
        registDtlsOffset = offset;
        registDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registDtls(final DirectBuffer value, final int length)
    {
        return registDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder registDtls(final DirectBuffer value)
    {
        return registDtls(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder registDtls(final byte[] value, final int offset, final int length)
    {
        registDtls.wrap(value);
        registDtlsOffset = offset;
        registDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registDtlsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registDtls, value, offset, length);
        registDtlsOffset = offset;
        registDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registDtls(final byte[] value, final int length)
    {
        return registDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder registDtls(final byte[] value)
    {
        return registDtls(value, 0, value.length);
    }

    public boolean hasRegistDtls()
    {
        return registDtlsLength > 0;
    }

    public MutableDirectBuffer registDtls()
    {
        return registDtls;
    }

    public String registDtlsAsString()
    {
        return registDtls.getStringWithoutLengthAscii(registDtlsOffset, registDtlsLength);
    }

    public RegistDtlsGroupEncoder registDtls(final CharSequence value)
    {
        toBytes(value, registDtls);
        registDtlsOffset = 0;
        registDtlsLength = value.length();
        return this;
    }

    public RegistDtlsGroupEncoder registDtls(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registDtls.wrap(buffer);
            registDtlsOffset = value.offset();
            registDtlsLength = value.length();
        }
        return this;
    }

    public RegistDtlsGroupEncoder registDtls(final char[] value)
    {
        return registDtls(value, 0, value.length);
    }

    public RegistDtlsGroupEncoder registDtls(final char[] value, final int length)
    {
        return registDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder registDtls(final char[] value, final int offset, final int length)
    {
        toBytes(value, registDtls, offset, length);
        registDtlsOffset = 0;
        registDtlsLength = length;
        return this;
    }

    private final MutableDirectBuffer registEmail = new UnsafeBuffer();

    private int registEmailOffset = 0;

    private int registEmailLength = 0;

    public RegistDtlsGroupEncoder registEmail(final DirectBuffer value, final int offset, final int length)
    {
        registEmail.wrap(value);
        registEmailOffset = offset;
        registEmailLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registEmail(final DirectBuffer value, final int length)
    {
        return registEmail(value, 0, length);
    }

    public RegistDtlsGroupEncoder registEmail(final DirectBuffer value)
    {
        return registEmail(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder registEmail(final byte[] value, final int offset, final int length)
    {
        registEmail.wrap(value);
        registEmailOffset = offset;
        registEmailLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registEmailAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registEmail, value, offset, length);
        registEmailOffset = offset;
        registEmailLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder registEmail(final byte[] value, final int length)
    {
        return registEmail(value, 0, length);
    }

    public RegistDtlsGroupEncoder registEmail(final byte[] value)
    {
        return registEmail(value, 0, value.length);
    }

    public boolean hasRegistEmail()
    {
        return registEmailLength > 0;
    }

    public MutableDirectBuffer registEmail()
    {
        return registEmail;
    }

    public String registEmailAsString()
    {
        return registEmail.getStringWithoutLengthAscii(registEmailOffset, registEmailLength);
    }

    public RegistDtlsGroupEncoder registEmail(final CharSequence value)
    {
        toBytes(value, registEmail);
        registEmailOffset = 0;
        registEmailLength = value.length();
        return this;
    }

    public RegistDtlsGroupEncoder registEmail(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registEmail.wrap(buffer);
            registEmailOffset = value.offset();
            registEmailLength = value.length();
        }
        return this;
    }

    public RegistDtlsGroupEncoder registEmail(final char[] value)
    {
        return registEmail(value, 0, value.length);
    }

    public RegistDtlsGroupEncoder registEmail(final char[] value, final int length)
    {
        return registEmail(value, 0, length);
    }

    public RegistDtlsGroupEncoder registEmail(final char[] value, final int offset, final int length)
    {
        toBytes(value, registEmail, offset, length);
        registEmailOffset = 0;
        registEmailLength = length;
        return this;
    }

    private final MutableDirectBuffer mailingDtls = new UnsafeBuffer();

    private int mailingDtlsOffset = 0;

    private int mailingDtlsLength = 0;

    public RegistDtlsGroupEncoder mailingDtls(final DirectBuffer value, final int offset, final int length)
    {
        mailingDtls.wrap(value);
        mailingDtlsOffset = offset;
        mailingDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingDtls(final DirectBuffer value, final int length)
    {
        return mailingDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingDtls(final DirectBuffer value)
    {
        return mailingDtls(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder mailingDtls(final byte[] value, final int offset, final int length)
    {
        mailingDtls.wrap(value);
        mailingDtlsOffset = offset;
        mailingDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingDtlsAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mailingDtls, value, offset, length);
        mailingDtlsOffset = offset;
        mailingDtlsLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingDtls(final byte[] value, final int length)
    {
        return mailingDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingDtls(final byte[] value)
    {
        return mailingDtls(value, 0, value.length);
    }

    public boolean hasMailingDtls()
    {
        return mailingDtlsLength > 0;
    }

    public MutableDirectBuffer mailingDtls()
    {
        return mailingDtls;
    }

    public String mailingDtlsAsString()
    {
        return mailingDtls.getStringWithoutLengthAscii(mailingDtlsOffset, mailingDtlsLength);
    }

    public RegistDtlsGroupEncoder mailingDtls(final CharSequence value)
    {
        toBytes(value, mailingDtls);
        mailingDtlsOffset = 0;
        mailingDtlsLength = value.length();
        return this;
    }

    public RegistDtlsGroupEncoder mailingDtls(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mailingDtls.wrap(buffer);
            mailingDtlsOffset = value.offset();
            mailingDtlsLength = value.length();
        }
        return this;
    }

    public RegistDtlsGroupEncoder mailingDtls(final char[] value)
    {
        return mailingDtls(value, 0, value.length);
    }

    public RegistDtlsGroupEncoder mailingDtls(final char[] value, final int length)
    {
        return mailingDtls(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingDtls(final char[] value, final int offset, final int length)
    {
        toBytes(value, mailingDtls, offset, length);
        mailingDtlsOffset = 0;
        mailingDtlsLength = length;
        return this;
    }

    private final MutableDirectBuffer mailingInst = new UnsafeBuffer();

    private int mailingInstOffset = 0;

    private int mailingInstLength = 0;

    public RegistDtlsGroupEncoder mailingInst(final DirectBuffer value, final int offset, final int length)
    {
        mailingInst.wrap(value);
        mailingInstOffset = offset;
        mailingInstLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingInst(final DirectBuffer value, final int length)
    {
        return mailingInst(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingInst(final DirectBuffer value)
    {
        return mailingInst(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder mailingInst(final byte[] value, final int offset, final int length)
    {
        mailingInst.wrap(value);
        mailingInstOffset = offset;
        mailingInstLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingInstAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(mailingInst, value, offset, length);
        mailingInstOffset = offset;
        mailingInstLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder mailingInst(final byte[] value, final int length)
    {
        return mailingInst(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingInst(final byte[] value)
    {
        return mailingInst(value, 0, value.length);
    }

    public boolean hasMailingInst()
    {
        return mailingInstLength > 0;
    }

    public MutableDirectBuffer mailingInst()
    {
        return mailingInst;
    }

    public String mailingInstAsString()
    {
        return mailingInst.getStringWithoutLengthAscii(mailingInstOffset, mailingInstLength);
    }

    public RegistDtlsGroupEncoder mailingInst(final CharSequence value)
    {
        toBytes(value, mailingInst);
        mailingInstOffset = 0;
        mailingInstLength = value.length();
        return this;
    }

    public RegistDtlsGroupEncoder mailingInst(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            mailingInst.wrap(buffer);
            mailingInstOffset = value.offset();
            mailingInstLength = value.length();
        }
        return this;
    }

    public RegistDtlsGroupEncoder mailingInst(final char[] value)
    {
        return mailingInst(value, 0, value.length);
    }

    public RegistDtlsGroupEncoder mailingInst(final char[] value, final int length)
    {
        return mailingInst(value, 0, length);
    }

    public RegistDtlsGroupEncoder mailingInst(final char[] value, final int offset, final int length)
    {
        toBytes(value, mailingInst, offset, length);
        mailingInstOffset = 0;
        mailingInstLength = length;
        return this;
    }

    private final NestedPartiesEncoder nestedParties = new NestedPartiesEncoder();
    public NestedPartiesEncoder nestedParties()
    {
        return nestedParties;
    }

    private int ownerType;

    private boolean hasOwnerType;

    public boolean hasOwnerType()
    {
        return hasOwnerType;
    }

    public RegistDtlsGroupEncoder ownerType(int value)
    {
        ownerType = value;
        hasOwnerType = true;
        return this;
    }

    public int ownerType()
    {
        return ownerType;
    }

    public RegistDtlsGroupEncoder ownerType(OwnerType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OwnerType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ownerType Value: " + value );
            }
            if (value == OwnerType.NULL_VAL)
            {
                return this;
            }
        }
        return ownerType(value.representation());
    }

    private final MutableDirectBuffer dateOfBirth = new UnsafeBuffer();

    private int dateOfBirthOffset = 0;

    private int dateOfBirthLength = 0;

    public RegistDtlsGroupEncoder dateOfBirth(final DirectBuffer value, final int offset, final int length)
    {
        dateOfBirth.wrap(value);
        dateOfBirthOffset = offset;
        dateOfBirthLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder dateOfBirth(final DirectBuffer value, final int length)
    {
        return dateOfBirth(value, 0, length);
    }

    public RegistDtlsGroupEncoder dateOfBirth(final DirectBuffer value)
    {
        return dateOfBirth(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder dateOfBirth(final byte[] value, final int offset, final int length)
    {
        dateOfBirth.wrap(value);
        dateOfBirthOffset = offset;
        dateOfBirthLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder dateOfBirthAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(dateOfBirth, value, offset, length);
        dateOfBirthOffset = offset;
        dateOfBirthLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder dateOfBirth(final byte[] value, final int length)
    {
        return dateOfBirth(value, 0, length);
    }

    public RegistDtlsGroupEncoder dateOfBirth(final byte[] value)
    {
        return dateOfBirth(value, 0, value.length);
    }

    public boolean hasDateOfBirth()
    {
        return dateOfBirthLength > 0;
    }

    public MutableDirectBuffer dateOfBirth()
    {
        return dateOfBirth;
    }

    public String dateOfBirthAsString()
    {
        return dateOfBirth.getStringWithoutLengthAscii(dateOfBirthOffset, dateOfBirthLength);
    }

    private final MutableDirectBuffer investorCountryOfResidence = new UnsafeBuffer();

    private int investorCountryOfResidenceOffset = 0;

    private int investorCountryOfResidenceLength = 0;

    public RegistDtlsGroupEncoder investorCountryOfResidence(final DirectBuffer value, final int offset, final int length)
    {
        investorCountryOfResidence.wrap(value);
        investorCountryOfResidenceOffset = offset;
        investorCountryOfResidenceLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final DirectBuffer value, final int length)
    {
        return investorCountryOfResidence(value, 0, length);
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final DirectBuffer value)
    {
        return investorCountryOfResidence(value, 0, value.capacity());
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final byte[] value, final int offset, final int length)
    {
        investorCountryOfResidence.wrap(value);
        investorCountryOfResidenceOffset = offset;
        investorCountryOfResidenceLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder investorCountryOfResidenceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(investorCountryOfResidence, value, offset, length);
        investorCountryOfResidenceOffset = offset;
        investorCountryOfResidenceLength = length;
        return this;
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final byte[] value, final int length)
    {
        return investorCountryOfResidence(value, 0, length);
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final byte[] value)
    {
        return investorCountryOfResidence(value, 0, value.length);
    }

    public boolean hasInvestorCountryOfResidence()
    {
        return investorCountryOfResidenceLength > 0;
    }

    public MutableDirectBuffer investorCountryOfResidence()
    {
        return investorCountryOfResidence;
    }

    public String investorCountryOfResidenceAsString()
    {
        return investorCountryOfResidence.getStringWithoutLengthAscii(investorCountryOfResidenceOffset, investorCountryOfResidenceLength);
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final CharSequence value)
    {
        toBytes(value, investorCountryOfResidence);
        investorCountryOfResidenceOffset = 0;
        investorCountryOfResidenceLength = value.length();
        return this;
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            investorCountryOfResidence.wrap(buffer);
            investorCountryOfResidenceOffset = value.offset();
            investorCountryOfResidenceLength = value.length();
        }
        return this;
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final char[] value)
    {
        return investorCountryOfResidence(value, 0, value.length);
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final char[] value, final int length)
    {
        return investorCountryOfResidence(value, 0, length);
    }

    public RegistDtlsGroupEncoder investorCountryOfResidence(final char[] value, final int offset, final int length)
    {
        toBytes(value, investorCountryOfResidence, offset, length);
        investorCountryOfResidenceOffset = 0;
        investorCountryOfResidenceLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (registDtlsLength > 0)
        {
            buffer.putBytes(position, registDtlsHeader, 0, registDtlsHeaderLength);
            position += registDtlsHeaderLength;
            buffer.putBytes(position, registDtls, registDtlsOffset, registDtlsLength);
            position += registDtlsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (registEmailLength > 0)
        {
            buffer.putBytes(position, registEmailHeader, 0, registEmailHeaderLength);
            position += registEmailHeaderLength;
            buffer.putBytes(position, registEmail, registEmailOffset, registEmailLength);
            position += registEmailLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mailingDtlsLength > 0)
        {
            buffer.putBytes(position, mailingDtlsHeader, 0, mailingDtlsHeaderLength);
            position += mailingDtlsHeaderLength;
            buffer.putBytes(position, mailingDtls, mailingDtlsOffset, mailingDtlsLength);
            position += mailingDtlsLength;
            buffer.putSeparator(position);
            position++;
        }

        if (mailingInstLength > 0)
        {
            buffer.putBytes(position, mailingInstHeader, 0, mailingInstHeaderLength);
            position += mailingInstHeaderLength;
            buffer.putBytes(position, mailingInst, mailingInstOffset, mailingInstLength);
            position += mailingInstLength;
            buffer.putSeparator(position);
            position++;
        }

            position += nestedParties.encode(buffer, position);

        if (hasOwnerType)
        {
            buffer.putBytes(position, ownerTypeHeader, 0, ownerTypeHeaderLength);
            position += ownerTypeHeaderLength;
            position += buffer.putIntAscii(position, ownerType);
            buffer.putSeparator(position);
            position++;
        }

        if (dateOfBirthLength > 0)
        {
            buffer.putBytes(position, dateOfBirthHeader, 0, dateOfBirthHeaderLength);
            position += dateOfBirthHeaderLength;
            buffer.putBytes(position, dateOfBirth, dateOfBirthOffset, dateOfBirthLength);
            position += dateOfBirthLength;
            buffer.putSeparator(position);
            position++;
        }

        if (investorCountryOfResidenceLength > 0)
        {
            buffer.putBytes(position, investorCountryOfResidenceHeader, 0, investorCountryOfResidenceHeaderLength);
            position += investorCountryOfResidenceHeaderLength;
            buffer.putBytes(position, investorCountryOfResidence, investorCountryOfResidenceOffset, investorCountryOfResidenceLength);
            position += investorCountryOfResidenceLength;
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
        this.resetRegistDtls();
        this.resetRegistEmail();
        this.resetMailingDtls();
        this.resetMailingInst();
        this.resetOwnerType();
        this.resetDateOfBirth();
        this.resetInvestorCountryOfResidence();
        nestedParties.reset();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRegistDtls()
    {
        registDtlsLength = 0;
    }

    public void resetRegistEmail()
    {
        registEmailLength = 0;
    }

    public void resetMailingDtls()
    {
        mailingDtlsLength = 0;
    }

    public void resetMailingInst()
    {
        mailingInstLength = 0;
    }

    public void resetOwnerType()
    {
        hasOwnerType = false;
    }

    public void resetDateOfBirth()
    {
        dateOfBirthLength = 0;
    }

    public void resetInvestorCountryOfResidence()
    {
        investorCountryOfResidenceLength = 0;
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
            appendBuffer(builder, registDtls, registDtlsOffset, registDtlsLength);
            builder.append("\",\n");
        }

        if (hasRegistEmail())
        {
            indent(builder, level);
            builder.append("\"RegistEmail\": \"");
            appendBuffer(builder, registEmail, registEmailOffset, registEmailLength);
            builder.append("\",\n");
        }

        if (hasMailingDtls())
        {
            indent(builder, level);
            builder.append("\"MailingDtls\": \"");
            appendBuffer(builder, mailingDtls, mailingDtlsOffset, mailingDtlsLength);
            builder.append("\",\n");
        }

        if (hasMailingInst())
        {
            indent(builder, level);
            builder.append("\"MailingInst\": \"");
            appendBuffer(builder, mailingInst, mailingInstOffset, mailingInstLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NestedParties\": ");
    nestedParties.appendTo(builder, level + 1);
    builder.append("\n");

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
            appendBuffer(builder, dateOfBirth, dateOfBirthOffset, dateOfBirthLength);
            builder.append("\",\n");
        }

        if (hasInvestorCountryOfResidence())
        {
            indent(builder, level);
            builder.append("\"InvestorCountryOfResidence\": \"");
            appendBuffer(builder, investorCountryOfResidence, investorCountryOfResidenceOffset, investorCountryOfResidenceLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RegistDtlsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RegistDtlsGroupEncoder)encoder);
    }

    public RegistDtlsGroupEncoder copyTo(final RegistDtlsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRegistDtls())
        {
            encoder.registDtlsAsCopy(registDtls.byteArray(), 0, registDtlsLength);
        }

        if (hasRegistEmail())
        {
            encoder.registEmailAsCopy(registEmail.byteArray(), 0, registEmailLength);
        }

        if (hasMailingDtls())
        {
            encoder.mailingDtlsAsCopy(mailingDtls.byteArray(), 0, mailingDtlsLength);
        }

        if (hasMailingInst())
        {
            encoder.mailingInstAsCopy(mailingInst.byteArray(), 0, mailingInstLength);
        }


        nestedParties.copyTo(encoder.nestedParties());
        if (hasOwnerType())
        {
            encoder.ownerType(this.ownerType());
        }

        if (hasDateOfBirth())
        {
            encoder.dateOfBirthAsCopy(dateOfBirth.byteArray(), 0, dateOfBirthLength);
        }

        if (hasInvestorCountryOfResidence())
        {
            encoder.investorCountryOfResidenceAsCopy(investorCountryOfResidence.byteArray(), 0, investorCountryOfResidenceLength);
        }
        return encoder;
    }

}
    private int noRegistDtlsGroupCounter;

    private boolean hasNoRegistDtlsGroupCounter;

    public boolean hasNoRegistDtlsGroupCounter()
    {
        return hasNoRegistDtlsGroupCounter;
    }

    public RgstDtlsGrpEncoder noRegistDtlsGroupCounter(int value)
    {
        noRegistDtlsGroupCounter = value;
        hasNoRegistDtlsGroupCounter = true;
        return this;
    }

    public int noRegistDtlsGroupCounter()
    {
        return noRegistDtlsGroupCounter;
    }


    private RegistDtlsGroupEncoder registDtlsGroup = null;

    public RegistDtlsGroupEncoder registDtlsGroup(final int numberOfElements)
    {
        hasNoRegistDtlsGroupCounter = true;
        noRegistDtlsGroupCounter = numberOfElements;
        if (registDtlsGroup == null)
        {
            registDtlsGroup = new RegistDtlsGroupEncoder();
        }
        return registDtlsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoRegistDtlsGroupCounter)
        {
            buffer.putBytes(position, noRegistDtlsGroupCounterHeader, 0, noRegistDtlsGroupCounterHeaderLength);
            position += noRegistDtlsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRegistDtlsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (registDtlsGroup != null)
        {
            position += registDtlsGroup.encode(buffer, position, noRegistDtlsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetRegistDtlsGroup();
    }

    public void resetRegistDtlsGroup()
    {
        if (registDtlsGroup != null)
        {
            registDtlsGroup.reset();
        }
        noRegistDtlsGroupCounter = 0;
        hasNoRegistDtlsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RgstDtlsGrp\",\n");
        if (hasNoRegistDtlsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RegistDtlsGroup\": [\n");
            final int noRegistDtlsGroupCounter = this.noRegistDtlsGroupCounter;
            RegistDtlsGroupEncoder registDtlsGroup = this.registDtlsGroup;
            for (int i = 0; i < noRegistDtlsGroupCounter; i++)
            {
                indent(builder, level);
                registDtlsGroup.appendTo(builder, level + 1);
                if (i < (noRegistDtlsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                registDtlsGroup = registDtlsGroup.next();
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
    public RgstDtlsGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RgstDtlsGrpEncoder)encoder);
    }

    public RgstDtlsGrpEncoder copyTo(final RgstDtlsGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoRegistDtlsGroupCounter)
        {
            final int size = this.noRegistDtlsGroupCounter;
            RegistDtlsGroupEncoder registDtlsGroup = this.registDtlsGroup;
            RegistDtlsGroupEncoder registDtlsGroupEncoder = encoder.registDtlsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (registDtlsGroup != null)
                {
                    registDtlsGroup.copyTo(registDtlsGroupEncoder);
                    registDtlsGroup = registDtlsGroup.next();
                    registDtlsGroupEncoder = registDtlsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
