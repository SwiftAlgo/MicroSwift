/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import com.swiftalgo.ms.codecs.fix44.*;


public class RegistrationInstructionsEncoder implements Encoder
{
    public long messageType()
    {
        return 111L;
    }

    public RegistrationInstructionsEncoder()
    {
        header.msgType("o");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int registIDHeaderLength = 4;
    private static final byte[] registIDHeader = new byte[] {53, 49, 51, (byte) '='};

    private static final int registTransTypeHeaderLength = 4;
    private static final byte[] registTransTypeHeader = new byte[] {53, 49, 52, (byte) '='};

    private static final int registRefIDHeaderLength = 4;
    private static final byte[] registRefIDHeader = new byte[] {53, 48, 56, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int registAcctTypeHeaderLength = 4;
    private static final byte[] registAcctTypeHeader = new byte[] {52, 57, 51, (byte) '='};

    private static final int taxAdvantageTypeHeaderLength = 4;
    private static final byte[] taxAdvantageTypeHeader = new byte[] {52, 57, 53, (byte) '='};

    private static final int ownershipTypeHeaderLength = 4;
    private static final byte[] ownershipTypeHeader = new byte[] {53, 49, 55, (byte) '='};

    private static final int noRegistDtlsGroupCounterHeaderLength = 4;
    private static final byte[] noRegistDtlsGroupCounterHeader = new byte[] {52, 55, 51, (byte) '='};

    private static final int noDistribInstsGroupCounterHeaderLength = 4;
    private static final byte[] noDistribInstsGroupCounterHeader = new byte[] {53, 49, 48, (byte) '='};

    private final MutableDirectBuffer registID = new UnsafeBuffer();

    private int registIDOffset = 0;

    private int registIDLength = 0;

    public RegistrationInstructionsEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public RegistrationInstructionsEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registID(final byte[] value)
    {
        return registID(value, 0, value.length);
    }

    public boolean hasRegistID()
    {
        return registIDLength > 0;
    }

    public MutableDirectBuffer registID()
    {
        return registID;
    }

    public String registIDAsString()
    {
        return registID.getStringWithoutLengthAscii(registIDOffset, registIDLength);
    }

    public RegistrationInstructionsEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsEncoder registID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registID.wrap(buffer);
            registIDOffset = value.offset();
            registIDLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public RegistrationInstructionsEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registID, offset, length);
        registIDOffset = 0;
        registIDLength = length;
        return this;
    }

    private char registTransType;

    private boolean hasRegistTransType;

    public boolean hasRegistTransType()
    {
        return hasRegistTransType;
    }

    public RegistrationInstructionsEncoder registTransType(char value)
    {
        registTransType = value;
        hasRegistTransType = true;
        return this;
    }

    public char registTransType()
    {
        return registTransType;
    }

    public RegistrationInstructionsEncoder registTransType(RegistTransType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RegistTransType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: registTransType Value: " + value );
            }
            if (value == RegistTransType.NULL_VAL)
            {
                return this;
            }
        }
        return registTransType(value.representation());
    }

    private final MutableDirectBuffer registRefID = new UnsafeBuffer();

    private int registRefIDOffset = 0;

    private int registRefIDLength = 0;

    public RegistrationInstructionsEncoder registRefID(final DirectBuffer value, final int offset, final int length)
    {
        registRefID.wrap(value);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registRefID(final DirectBuffer value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registRefID(final DirectBuffer value)
    {
        return registRefID(value, 0, value.capacity());
    }

    public RegistrationInstructionsEncoder registRefID(final byte[] value, final int offset, final int length)
    {
        registRefID.wrap(value);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registRefID, value, offset, length);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registRefID(final byte[] value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registRefID(final byte[] value)
    {
        return registRefID(value, 0, value.length);
    }

    public boolean hasRegistRefID()
    {
        return registRefIDLength > 0;
    }

    public MutableDirectBuffer registRefID()
    {
        return registRefID;
    }

    public String registRefIDAsString()
    {
        return registRefID.getStringWithoutLengthAscii(registRefIDOffset, registRefIDLength);
    }

    public RegistrationInstructionsEncoder registRefID(final CharSequence value)
    {
        toBytes(value, registRefID);
        registRefIDOffset = 0;
        registRefIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsEncoder registRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registRefID.wrap(buffer);
            registRefIDOffset = value.offset();
            registRefIDLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsEncoder registRefID(final char[] value)
    {
        return registRefID(value, 0, value.length);
    }

    public RegistrationInstructionsEncoder registRefID(final char[] value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsEncoder registRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registRefID, offset, length);
        registRefIDOffset = 0;
        registRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public RegistrationInstructionsEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public RegistrationInstructionsEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public RegistrationInstructionsEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public RegistrationInstructionsEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public RegistrationInstructionsEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public RegistrationInstructionsEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    public MutableDirectBuffer account()
    {
        return account;
    }

    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    public RegistrationInstructionsEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public RegistrationInstructionsEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public RegistrationInstructionsEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    public RegistrationInstructionsEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public RegistrationInstructionsEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    private final MutableDirectBuffer registAcctType = new UnsafeBuffer();

    private int registAcctTypeOffset = 0;

    private int registAcctTypeLength = 0;

    public RegistrationInstructionsEncoder registAcctType(final DirectBuffer value, final int offset, final int length)
    {
        registAcctType.wrap(value);
        registAcctTypeOffset = offset;
        registAcctTypeLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registAcctType(final DirectBuffer value, final int length)
    {
        return registAcctType(value, 0, length);
    }

    public RegistrationInstructionsEncoder registAcctType(final DirectBuffer value)
    {
        return registAcctType(value, 0, value.capacity());
    }

    public RegistrationInstructionsEncoder registAcctType(final byte[] value, final int offset, final int length)
    {
        registAcctType.wrap(value);
        registAcctTypeOffset = offset;
        registAcctTypeLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registAcctTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registAcctType, value, offset, length);
        registAcctTypeOffset = offset;
        registAcctTypeLength = length;
        return this;
    }

    public RegistrationInstructionsEncoder registAcctType(final byte[] value, final int length)
    {
        return registAcctType(value, 0, length);
    }

    public RegistrationInstructionsEncoder registAcctType(final byte[] value)
    {
        return registAcctType(value, 0, value.length);
    }

    public boolean hasRegistAcctType()
    {
        return registAcctTypeLength > 0;
    }

    public MutableDirectBuffer registAcctType()
    {
        return registAcctType;
    }

    public String registAcctTypeAsString()
    {
        return registAcctType.getStringWithoutLengthAscii(registAcctTypeOffset, registAcctTypeLength);
    }

    public RegistrationInstructionsEncoder registAcctType(final CharSequence value)
    {
        toBytes(value, registAcctType);
        registAcctTypeOffset = 0;
        registAcctTypeLength = value.length();
        return this;
    }

    public RegistrationInstructionsEncoder registAcctType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registAcctType.wrap(buffer);
            registAcctTypeOffset = value.offset();
            registAcctTypeLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsEncoder registAcctType(final char[] value)
    {
        return registAcctType(value, 0, value.length);
    }

    public RegistrationInstructionsEncoder registAcctType(final char[] value, final int length)
    {
        return registAcctType(value, 0, length);
    }

    public RegistrationInstructionsEncoder registAcctType(final char[] value, final int offset, final int length)
    {
        toBytes(value, registAcctType, offset, length);
        registAcctTypeOffset = 0;
        registAcctTypeLength = length;
        return this;
    }

    private int taxAdvantageType;

    private boolean hasTaxAdvantageType;

    public boolean hasTaxAdvantageType()
    {
        return hasTaxAdvantageType;
    }

    public RegistrationInstructionsEncoder taxAdvantageType(int value)
    {
        taxAdvantageType = value;
        hasTaxAdvantageType = true;
        return this;
    }

    public int taxAdvantageType()
    {
        return taxAdvantageType;
    }

    public RegistrationInstructionsEncoder taxAdvantageType(TaxAdvantageType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TaxAdvantageType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: taxAdvantageType Value: " + value );
            }
            if (value == TaxAdvantageType.NULL_VAL)
            {
                return this;
            }
        }
        return taxAdvantageType(value.representation());
    }

    private char ownershipType;

    private boolean hasOwnershipType;

    public boolean hasOwnershipType()
    {
        return hasOwnershipType;
    }

    public RegistrationInstructionsEncoder ownershipType(char value)
    {
        ownershipType = value;
        hasOwnershipType = true;
        return this;
    }

    public char ownershipType()
    {
        return ownershipType;
    }

    public RegistrationInstructionsEncoder ownershipType(OwnershipType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == OwnershipType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: ownershipType Value: " + value );
            }
            if (value == OwnershipType.NULL_VAL)
            {
                return this;
            }
        }
        return ownershipType(value.representation());
    }



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

    public RegistrationInstructionsEncoder noRegistDtlsGroupCounter(int value)
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



public static class DistribInstsGroupEncoder
{
    private DistribInstsGroupEncoder next = null;

    public DistribInstsGroupEncoder next()
    {
        if (next == null)
        {
            next = new DistribInstsGroupEncoder();
        }
        return next;
    }

    private static final int distribPaymentMethodHeaderLength = 4;
    private static final byte[] distribPaymentMethodHeader = new byte[] {52, 55, 55, (byte) '='};

    private static final int distribPercentageHeaderLength = 4;
    private static final byte[] distribPercentageHeader = new byte[] {53, 49, 50, (byte) '='};

    private static final int cashDistribCurrHeaderLength = 4;
    private static final byte[] cashDistribCurrHeader = new byte[] {52, 55, 56, (byte) '='};

    private static final int cashDistribAgentNameHeaderLength = 4;
    private static final byte[] cashDistribAgentNameHeader = new byte[] {52, 57, 56, (byte) '='};

    private static final int cashDistribAgentCodeHeaderLength = 4;
    private static final byte[] cashDistribAgentCodeHeader = new byte[] {52, 57, 57, (byte) '='};

    private static final int cashDistribAgentAcctNumberHeaderLength = 4;
    private static final byte[] cashDistribAgentAcctNumberHeader = new byte[] {53, 48, 48, (byte) '='};

    private static final int cashDistribPayRefHeaderLength = 4;
    private static final byte[] cashDistribPayRefHeader = new byte[] {53, 48, 49, (byte) '='};

    private static final int cashDistribAgentAcctNameHeaderLength = 4;
    private static final byte[] cashDistribAgentAcctNameHeader = new byte[] {53, 48, 50, (byte) '='};

    private int distribPaymentMethod;

    private boolean hasDistribPaymentMethod;

    public boolean hasDistribPaymentMethod()
    {
        return hasDistribPaymentMethod;
    }

    public DistribInstsGroupEncoder distribPaymentMethod(int value)
    {
        distribPaymentMethod = value;
        hasDistribPaymentMethod = true;
        return this;
    }

    public int distribPaymentMethod()
    {
        return distribPaymentMethod;
    }

    public DistribInstsGroupEncoder distribPaymentMethod(DistribPaymentMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DistribPaymentMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: distribPaymentMethod Value: " + value );
            }
            if (value == DistribPaymentMethod.NULL_VAL)
            {
                return this;
            }
        }
        return distribPaymentMethod(value.representation());
    }

    private final DecimalFloat distribPercentage = new DecimalFloat();

    private boolean hasDistribPercentage;

    public boolean hasDistribPercentage()
    {
        return hasDistribPercentage;
    }

    public DistribInstsGroupEncoder distribPercentage(DecimalFloat value)
    {
        distribPercentage.set(value);
        hasDistribPercentage = true;
        return this;
    }

    public DistribInstsGroupEncoder distribPercentage(long value, int scale)
    {
        distribPercentage.set(value, scale);
        hasDistribPercentage = true;
        return this;
    }

    public DecimalFloat distribPercentage()
    {
        return distribPercentage;
    }

    private final MutableDirectBuffer cashDistribCurr = new UnsafeBuffer();

    private int cashDistribCurrOffset = 0;

    private int cashDistribCurrLength = 0;

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribCurr.wrap(value);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final DirectBuffer value)
    {
        return cashDistribCurr(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value, final int offset, final int length)
    {
        cashDistribCurr.wrap(value);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurrAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribCurr, value, offset, length);
        cashDistribCurrOffset = offset;
        cashDistribCurrLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final byte[] value)
    {
        return cashDistribCurr(value, 0, value.length);
    }

    public boolean hasCashDistribCurr()
    {
        return cashDistribCurrLength > 0;
    }

    public MutableDirectBuffer cashDistribCurr()
    {
        return cashDistribCurr;
    }

    public String cashDistribCurrAsString()
    {
        return cashDistribCurr.getStringWithoutLengthAscii(cashDistribCurrOffset, cashDistribCurrLength);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final CharSequence value)
    {
        toBytes(value, cashDistribCurr);
        cashDistribCurrOffset = 0;
        cashDistribCurrLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribCurr.wrap(buffer);
            cashDistribCurrOffset = value.offset();
            cashDistribCurrLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value)
    {
        return cashDistribCurr(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value, final int length)
    {
        return cashDistribCurr(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribCurr(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribCurr, offset, length);
        cashDistribCurrOffset = 0;
        cashDistribCurrLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentName = new UnsafeBuffer();

    private int cashDistribAgentNameOffset = 0;

    private int cashDistribAgentNameLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentName.wrap(value);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final DirectBuffer value)
    {
        return cashDistribAgentName(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentName.wrap(value);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentName, value, offset, length);
        cashDistribAgentNameOffset = offset;
        cashDistribAgentNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final byte[] value)
    {
        return cashDistribAgentName(value, 0, value.length);
    }

    public boolean hasCashDistribAgentName()
    {
        return cashDistribAgentNameLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentName()
    {
        return cashDistribAgentName;
    }

    public String cashDistribAgentNameAsString()
    {
        return cashDistribAgentName.getStringWithoutLengthAscii(cashDistribAgentNameOffset, cashDistribAgentNameLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final CharSequence value)
    {
        toBytes(value, cashDistribAgentName);
        cashDistribAgentNameOffset = 0;
        cashDistribAgentNameLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentName.wrap(buffer);
            cashDistribAgentNameOffset = value.offset();
            cashDistribAgentNameLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value)
    {
        return cashDistribAgentName(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value, final int length)
    {
        return cashDistribAgentName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentName(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentName, offset, length);
        cashDistribAgentNameOffset = 0;
        cashDistribAgentNameLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentCode = new UnsafeBuffer();

    private int cashDistribAgentCodeOffset = 0;

    private int cashDistribAgentCodeLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentCode.wrap(value);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final DirectBuffer value)
    {
        return cashDistribAgentCode(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentCode.wrap(value);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentCode, value, offset, length);
        cashDistribAgentCodeOffset = offset;
        cashDistribAgentCodeLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final byte[] value)
    {
        return cashDistribAgentCode(value, 0, value.length);
    }

    public boolean hasCashDistribAgentCode()
    {
        return cashDistribAgentCodeLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentCode()
    {
        return cashDistribAgentCode;
    }

    public String cashDistribAgentCodeAsString()
    {
        return cashDistribAgentCode.getStringWithoutLengthAscii(cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final CharSequence value)
    {
        toBytes(value, cashDistribAgentCode);
        cashDistribAgentCodeOffset = 0;
        cashDistribAgentCodeLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentCode.wrap(buffer);
            cashDistribAgentCodeOffset = value.offset();
            cashDistribAgentCodeLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value)
    {
        return cashDistribAgentCode(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value, final int length)
    {
        return cashDistribAgentCode(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentCode(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentCode, offset, length);
        cashDistribAgentCodeOffset = 0;
        cashDistribAgentCodeLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentAcctNumber = new UnsafeBuffer();

    private int cashDistribAgentAcctNumberOffset = 0;

    private int cashDistribAgentAcctNumberLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentAcctNumber.wrap(value);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final DirectBuffer value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentAcctNumber.wrap(value);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumberAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentAcctNumber, value, offset, length);
        cashDistribAgentAcctNumberOffset = offset;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final byte[] value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.length);
    }

    public boolean hasCashDistribAgentAcctNumber()
    {
        return cashDistribAgentAcctNumberLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentAcctNumber()
    {
        return cashDistribAgentAcctNumber;
    }

    public String cashDistribAgentAcctNumberAsString()
    {
        return cashDistribAgentAcctNumber.getStringWithoutLengthAscii(cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final CharSequence value)
    {
        toBytes(value, cashDistribAgentAcctNumber);
        cashDistribAgentAcctNumberOffset = 0;
        cashDistribAgentAcctNumberLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentAcctNumber.wrap(buffer);
            cashDistribAgentAcctNumberOffset = value.offset();
            cashDistribAgentAcctNumberLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value)
    {
        return cashDistribAgentAcctNumber(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value, final int length)
    {
        return cashDistribAgentAcctNumber(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNumber(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentAcctNumber, offset, length);
        cashDistribAgentAcctNumberOffset = 0;
        cashDistribAgentAcctNumberLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribPayRef = new UnsafeBuffer();

    private int cashDistribPayRefOffset = 0;

    private int cashDistribPayRefLength = 0;

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribPayRef.wrap(value);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final DirectBuffer value)
    {
        return cashDistribPayRef(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value, final int offset, final int length)
    {
        cashDistribPayRef.wrap(value);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRefAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribPayRef, value, offset, length);
        cashDistribPayRefOffset = offset;
        cashDistribPayRefLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final byte[] value)
    {
        return cashDistribPayRef(value, 0, value.length);
    }

    public boolean hasCashDistribPayRef()
    {
        return cashDistribPayRefLength > 0;
    }

    public MutableDirectBuffer cashDistribPayRef()
    {
        return cashDistribPayRef;
    }

    public String cashDistribPayRefAsString()
    {
        return cashDistribPayRef.getStringWithoutLengthAscii(cashDistribPayRefOffset, cashDistribPayRefLength);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final CharSequence value)
    {
        toBytes(value, cashDistribPayRef);
        cashDistribPayRefOffset = 0;
        cashDistribPayRefLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribPayRef.wrap(buffer);
            cashDistribPayRefOffset = value.offset();
            cashDistribPayRefLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value)
    {
        return cashDistribPayRef(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value, final int length)
    {
        return cashDistribPayRef(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribPayRef(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribPayRef, offset, length);
        cashDistribPayRefOffset = 0;
        cashDistribPayRefLength = length;
        return this;
    }

    private final MutableDirectBuffer cashDistribAgentAcctName = new UnsafeBuffer();

    private int cashDistribAgentAcctNameOffset = 0;

    private int cashDistribAgentAcctNameLength = 0;

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value, final int offset, final int length)
    {
        cashDistribAgentAcctName.wrap(value);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final DirectBuffer value)
    {
        return cashDistribAgentAcctName(value, 0, value.capacity());
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value, final int offset, final int length)
    {
        cashDistribAgentAcctName.wrap(value);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(cashDistribAgentAcctName, value, offset, length);
        cashDistribAgentAcctNameOffset = offset;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final byte[] value)
    {
        return cashDistribAgentAcctName(value, 0, value.length);
    }

    public boolean hasCashDistribAgentAcctName()
    {
        return cashDistribAgentAcctNameLength > 0;
    }

    public MutableDirectBuffer cashDistribAgentAcctName()
    {
        return cashDistribAgentAcctName;
    }

    public String cashDistribAgentAcctNameAsString()
    {
        return cashDistribAgentAcctName.getStringWithoutLengthAscii(cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final CharSequence value)
    {
        toBytes(value, cashDistribAgentAcctName);
        cashDistribAgentAcctNameOffset = 0;
        cashDistribAgentAcctNameLength = value.length();
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            cashDistribAgentAcctName.wrap(buffer);
            cashDistribAgentAcctNameOffset = value.offset();
            cashDistribAgentAcctNameLength = value.length();
        }
        return this;
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value)
    {
        return cashDistribAgentAcctName(value, 0, value.length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value, final int length)
    {
        return cashDistribAgentAcctName(value, 0, length);
    }

    public DistribInstsGroupEncoder cashDistribAgentAcctName(final char[] value, final int offset, final int length)
    {
        toBytes(value, cashDistribAgentAcctName, offset, length);
        cashDistribAgentAcctNameOffset = 0;
        cashDistribAgentAcctNameLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasDistribPaymentMethod)
        {
            buffer.putBytes(position, distribPaymentMethodHeader, 0, distribPaymentMethodHeaderLength);
            position += distribPaymentMethodHeaderLength;
            position += buffer.putIntAscii(position, distribPaymentMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDistribPercentage)
        {
            buffer.putBytes(position, distribPercentageHeader, 0, distribPercentageHeaderLength);
            position += distribPercentageHeaderLength;
            position += buffer.putFloatAscii(position, distribPercentage);
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribCurrLength > 0)
        {
            buffer.putBytes(position, cashDistribCurrHeader, 0, cashDistribCurrHeaderLength);
            position += cashDistribCurrHeaderLength;
            buffer.putBytes(position, cashDistribCurr, cashDistribCurrOffset, cashDistribCurrLength);
            position += cashDistribCurrLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentNameLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentNameHeader, 0, cashDistribAgentNameHeaderLength);
            position += cashDistribAgentNameHeaderLength;
            buffer.putBytes(position, cashDistribAgentName, cashDistribAgentNameOffset, cashDistribAgentNameLength);
            position += cashDistribAgentNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentCodeLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentCodeHeader, 0, cashDistribAgentCodeHeaderLength);
            position += cashDistribAgentCodeHeaderLength;
            buffer.putBytes(position, cashDistribAgentCode, cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
            position += cashDistribAgentCodeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentAcctNumberLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentAcctNumberHeader, 0, cashDistribAgentAcctNumberHeaderLength);
            position += cashDistribAgentAcctNumberHeaderLength;
            buffer.putBytes(position, cashDistribAgentAcctNumber, cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
            position += cashDistribAgentAcctNumberLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribPayRefLength > 0)
        {
            buffer.putBytes(position, cashDistribPayRefHeader, 0, cashDistribPayRefHeaderLength);
            position += cashDistribPayRefHeaderLength;
            buffer.putBytes(position, cashDistribPayRef, cashDistribPayRefOffset, cashDistribPayRefLength);
            position += cashDistribPayRefLength;
            buffer.putSeparator(position);
            position++;
        }

        if (cashDistribAgentAcctNameLength > 0)
        {
            buffer.putBytes(position, cashDistribAgentAcctNameHeader, 0, cashDistribAgentAcctNameHeaderLength);
            position += cashDistribAgentAcctNameHeaderLength;
            buffer.putBytes(position, cashDistribAgentAcctName, cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
            position += cashDistribAgentAcctNameLength;
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
        this.resetDistribPaymentMethod();
        this.resetDistribPercentage();
        this.resetCashDistribCurr();
        this.resetCashDistribAgentName();
        this.resetCashDistribAgentCode();
        this.resetCashDistribAgentAcctNumber();
        this.resetCashDistribPayRef();
        this.resetCashDistribAgentAcctName();
        if (next != null)        {
            next.reset();
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
        cashDistribCurrLength = 0;
    }

    public void resetCashDistribAgentName()
    {
        cashDistribAgentNameLength = 0;
    }

    public void resetCashDistribAgentCode()
    {
        cashDistribAgentCodeLength = 0;
    }

    public void resetCashDistribAgentAcctNumber()
    {
        cashDistribAgentAcctNumberLength = 0;
    }

    public void resetCashDistribPayRef()
    {
        cashDistribPayRefLength = 0;
    }

    public void resetCashDistribAgentAcctName()
    {
        cashDistribAgentAcctNameLength = 0;
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
            appendBuffer(builder, cashDistribCurr, cashDistribCurrOffset, cashDistribCurrLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentName\": \"");
            appendBuffer(builder, cashDistribAgentName, cashDistribAgentNameOffset, cashDistribAgentNameLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentCode())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentCode\": \"");
            appendBuffer(builder, cashDistribAgentCode, cashDistribAgentCodeOffset, cashDistribAgentCodeLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctNumber())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctNumber\": \"");
            appendBuffer(builder, cashDistribAgentAcctNumber, cashDistribAgentAcctNumberOffset, cashDistribAgentAcctNumberLength);
            builder.append("\",\n");
        }

        if (hasCashDistribPayRef())
        {
            indent(builder, level);
            builder.append("\"CashDistribPayRef\": \"");
            appendBuffer(builder, cashDistribPayRef, cashDistribPayRefOffset, cashDistribPayRefLength);
            builder.append("\",\n");
        }

        if (hasCashDistribAgentAcctName())
        {
            indent(builder, level);
            builder.append("\"CashDistribAgentAcctName\": \"");
            appendBuffer(builder, cashDistribAgentAcctName, cashDistribAgentAcctNameOffset, cashDistribAgentAcctNameLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DistribInstsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DistribInstsGroupEncoder)encoder);
    }

    public DistribInstsGroupEncoder copyTo(final DistribInstsGroupEncoder encoder)
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
            encoder.cashDistribCurrAsCopy(cashDistribCurr.byteArray(), 0, cashDistribCurrLength);
        }

        if (hasCashDistribAgentName())
        {
            encoder.cashDistribAgentNameAsCopy(cashDistribAgentName.byteArray(), 0, cashDistribAgentNameLength);
        }

        if (hasCashDistribAgentCode())
        {
            encoder.cashDistribAgentCodeAsCopy(cashDistribAgentCode.byteArray(), 0, cashDistribAgentCodeLength);
        }

        if (hasCashDistribAgentAcctNumber())
        {
            encoder.cashDistribAgentAcctNumberAsCopy(cashDistribAgentAcctNumber.byteArray(), 0, cashDistribAgentAcctNumberLength);
        }

        if (hasCashDistribPayRef())
        {
            encoder.cashDistribPayRefAsCopy(cashDistribPayRef.byteArray(), 0, cashDistribPayRefLength);
        }

        if (hasCashDistribAgentAcctName())
        {
            encoder.cashDistribAgentAcctNameAsCopy(cashDistribAgentAcctName.byteArray(), 0, cashDistribAgentAcctNameLength);
        }
        return encoder;
    }

}
    private int noDistribInstsGroupCounter;

    private boolean hasNoDistribInstsGroupCounter;

    public boolean hasNoDistribInstsGroupCounter()
    {
        return hasNoDistribInstsGroupCounter;
    }

    public RegistrationInstructionsEncoder noDistribInstsGroupCounter(int value)
    {
        noDistribInstsGroupCounter = value;
        hasNoDistribInstsGroupCounter = true;
        return this;
    }

    public int noDistribInstsGroupCounter()
    {
        return noDistribInstsGroupCounter;
    }


    private DistribInstsGroupEncoder distribInstsGroup = null;

    public DistribInstsGroupEncoder distribInstsGroup(final int numberOfElements)
    {
        hasNoDistribInstsGroupCounter = true;
        noDistribInstsGroupCounter = numberOfElements;
        if (distribInstsGroup == null)
        {
            distribInstsGroup = new DistribInstsGroupEncoder();
        }
        return distribInstsGroup;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (registIDLength > 0)
        {
            buffer.putBytes(position, registIDHeader, 0, registIDHeaderLength);
            position += registIDHeaderLength;
            buffer.putBytes(position, registID, registIDOffset, registIDLength);
            position += registIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RegistID");
        }

        if (hasRegistTransType)
        {
            buffer.putBytes(position, registTransTypeHeader, 0, registTransTypeHeaderLength);
            position += registTransTypeHeaderLength;
            position += buffer.putCharAscii(position, registTransType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RegistTransType");
        }

        if (registRefIDLength > 0)
        {
            buffer.putBytes(position, registRefIDHeader, 0, registRefIDHeaderLength);
            position += registRefIDHeaderLength;
            buffer.putBytes(position, registRefID, registRefIDOffset, registRefIDLength);
            position += registRefIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RegistRefID");
        }

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
            buffer.putSeparator(position);
            position++;
        }

        if (registAcctTypeLength > 0)
        {
            buffer.putBytes(position, registAcctTypeHeader, 0, registAcctTypeHeaderLength);
            position += registAcctTypeHeaderLength;
            buffer.putBytes(position, registAcctType, registAcctTypeOffset, registAcctTypeLength);
            position += registAcctTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTaxAdvantageType)
        {
            buffer.putBytes(position, taxAdvantageTypeHeader, 0, taxAdvantageTypeHeaderLength);
            position += taxAdvantageTypeHeaderLength;
            position += buffer.putIntAscii(position, taxAdvantageType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasOwnershipType)
        {
            buffer.putBytes(position, ownershipTypeHeader, 0, ownershipTypeHeaderLength);
            position += ownershipTypeHeaderLength;
            position += buffer.putCharAscii(position, ownershipType);
            buffer.putSeparator(position);
            position++;
        }

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


        if (hasNoDistribInstsGroupCounter)
        {
            buffer.putBytes(position, noDistribInstsGroupCounterHeader, 0, noDistribInstsGroupCounterHeaderLength);
            position += noDistribInstsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noDistribInstsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (distribInstsGroup != null)
        {
            position += distribInstsGroup.encode(buffer, position, noDistribInstsGroupCounter);
        }

        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetRegistID();
        this.resetRegistTransType();
        this.resetRegistRefID();
        this.resetClOrdID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetRegistAcctType();
        this.resetTaxAdvantageType();
        this.resetOwnershipType();
        parties.reset();
        this.resetRegistDtlsGroup();
        this.resetDistribInstsGroup();
    }

    public void resetRegistID()
    {
        registIDLength = 0;
    }

    public void resetRegistTransType()
    {
        registTransType = MISSING_CHAR;
    }

    public void resetRegistRefID()
    {
        registRefIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetRegistAcctType()
    {
        registAcctTypeLength = 0;
    }

    public void resetTaxAdvantageType()
    {
        hasTaxAdvantageType = false;
    }

    public void resetOwnershipType()
    {
        hasOwnershipType = false;
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

    public void resetDistribInstsGroup()
    {
        if (distribInstsGroup != null)
        {
            distribInstsGroup.reset();
        }
        noDistribInstsGroupCounter = 0;
        hasNoDistribInstsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RegistrationInstructions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasRegistID())
        {
            indent(builder, level);
            builder.append("\"RegistID\": \"");
            appendBuffer(builder, registID, registIDOffset, registIDLength);
            builder.append("\",\n");
        }

        if (hasRegistTransType())
        {
            indent(builder, level);
            builder.append("\"RegistTransType\": \"");
            builder.append(registTransType);
            builder.append("\",\n");
        }

        if (hasRegistRefID())
        {
            indent(builder, level);
            builder.append("\"RegistRefID\": \"");
            appendBuffer(builder, registRefID, registRefIDOffset, registRefIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasRegistAcctType())
        {
            indent(builder, level);
            builder.append("\"RegistAcctType\": \"");
            appendBuffer(builder, registAcctType, registAcctTypeOffset, registAcctTypeLength);
            builder.append("\",\n");
        }

        if (hasTaxAdvantageType())
        {
            indent(builder, level);
            builder.append("\"TaxAdvantageType\": \"");
            builder.append(taxAdvantageType);
            builder.append("\",\n");
        }

        if (hasOwnershipType())
        {
            indent(builder, level);
            builder.append("\"OwnershipType\": \"");
            builder.append(ownershipType);
            builder.append("\",\n");
        }

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

        if (hasNoDistribInstsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"DistribInstsGroup\": [\n");
            final int noDistribInstsGroupCounter = this.noDistribInstsGroupCounter;
            DistribInstsGroupEncoder distribInstsGroup = this.distribInstsGroup;
            for (int i = 0; i < noDistribInstsGroupCounter; i++)
            {
                indent(builder, level);
                distribInstsGroup.appendTo(builder, level + 1);
                if (i < (noDistribInstsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                distribInstsGroup = distribInstsGroup.next();
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
    public RegistrationInstructionsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RegistrationInstructionsEncoder)encoder);
    }

    public RegistrationInstructionsEncoder copyTo(final RegistrationInstructionsEncoder encoder)
    {
        encoder.reset();
        if (hasRegistID())
        {
            encoder.registIDAsCopy(registID.byteArray(), 0, registIDLength);
        }

        if (hasRegistTransType())
        {
            encoder.registTransType(this.registTransType());
        }

        if (hasRegistRefID())
        {
            encoder.registRefIDAsCopy(registRefID.byteArray(), 0, registRefIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }


        parties.copyTo(encoder.parties());
        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasRegistAcctType())
        {
            encoder.registAcctTypeAsCopy(registAcctType.byteArray(), 0, registAcctTypeLength);
        }

        if (hasTaxAdvantageType())
        {
            encoder.taxAdvantageType(this.taxAdvantageType());
        }

        if (hasOwnershipType())
        {
            encoder.ownershipType(this.ownershipType());
        }

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

        if (hasNoDistribInstsGroupCounter)
        {
            final int size = this.noDistribInstsGroupCounter;
            DistribInstsGroupEncoder distribInstsGroup = this.distribInstsGroup;
            DistribInstsGroupEncoder distribInstsGroupEncoder = encoder.distribInstsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (distribInstsGroup != null)
                {
                    distribInstsGroup.copyTo(distribInstsGroupEncoder);
                    distribInstsGroup = distribInstsGroup.next();
                    distribInstsGroupEncoder = distribInstsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
