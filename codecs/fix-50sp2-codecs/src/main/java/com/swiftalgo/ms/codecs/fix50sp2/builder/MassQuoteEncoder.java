/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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


public class MassQuoteEncoder implements Encoder
{
    public long messageType()
    {
        return 105L;
    }

    public MassQuoteEncoder()
    {
        header.msgType("i");
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

    private static final int quoteReqIDHeaderLength = 4;
    private static final byte[] quoteReqIDHeader = new byte[] {49, 51, 49, (byte) '='};

    private static final int quoteIDHeaderLength = 4;
    private static final byte[] quoteIDHeader = new byte[] {49, 49, 55, (byte) '='};

    private static final int quoteTypeHeaderLength = 4;
    private static final byte[] quoteTypeHeader = new byte[] {53, 51, 55, (byte) '='};

    private static final int quoteResponseLevelHeaderLength = 4;
    private static final byte[] quoteResponseLevelHeader = new byte[] {51, 48, 49, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int defBidSizeHeaderLength = 4;
    private static final byte[] defBidSizeHeader = new byte[] {50, 57, 51, (byte) '='};

    private static final int defOfferSizeHeaderLength = 4;
    private static final byte[] defOfferSizeHeader = new byte[] {50, 57, 52, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();

    private int quoteReqIDOffset = 0;

    private int quoteReqIDLength = 0;

    public MassQuoteEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    public MassQuoteEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteReqID, value, offset, length);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final byte[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public boolean hasQuoteReqID()
    {
        return quoteReqIDLength > 0;
    }

    public MutableDirectBuffer quoteReqID()
    {
        return quoteReqID;
    }

    public String quoteReqIDAsString()
    {
        return quoteReqID.getStringWithoutLengthAscii(quoteReqIDOffset, quoteReqIDLength);
    }

    public MassQuoteEncoder quoteReqID(final CharSequence value)
    {
        toBytes(value, quoteReqID);
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    public MassQuoteEncoder quoteReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteReqID.wrap(buffer);
            quoteReqIDOffset = value.offset();
            quoteReqIDLength = value.length();
        }
        return this;
    }

    public MassQuoteEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public MassQuoteEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteReqID, offset, length);
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public MassQuoteEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public MassQuoteEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final byte[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public boolean hasQuoteID()
    {
        return quoteIDLength > 0;
    }

    public MutableDirectBuffer quoteID()
    {
        return quoteID;
    }

    public String quoteIDAsString()
    {
        return quoteID.getStringWithoutLengthAscii(quoteIDOffset, quoteIDLength);
    }

    public MassQuoteEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public MassQuoteEncoder quoteID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            quoteID.wrap(buffer);
            quoteIDOffset = value.offset();
            quoteIDLength = value.length();
        }
        return this;
    }

    public MassQuoteEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public MassQuoteEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    public MassQuoteEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    public int quoteType()
    {
        return quoteType;
    }

    public MassQuoteEncoder quoteType(QuoteType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteType Value: " + value );
            }
            if (value == QuoteType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteType(value.representation());
    }

    private int quoteResponseLevel;

    private boolean hasQuoteResponseLevel;

    public boolean hasQuoteResponseLevel()
    {
        return hasQuoteResponseLevel;
    }

    public MassQuoteEncoder quoteResponseLevel(int value)
    {
        quoteResponseLevel = value;
        hasQuoteResponseLevel = true;
        return this;
    }

    public int quoteResponseLevel()
    {
        return quoteResponseLevel;
    }

    public MassQuoteEncoder quoteResponseLevel(QuoteResponseLevel value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteResponseLevel.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteResponseLevel Value: " + value );
            }
            if (value == QuoteResponseLevel.NULL_VAL)
            {
                return this;
            }
        }
        return quoteResponseLevel(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public MassQuoteEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public MassQuoteEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final byte[] value)
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

    public MassQuoteEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public MassQuoteEncoder account(final AsciiSequenceView value)
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

    public MassQuoteEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public MassQuoteEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteEncoder account(final char[] value, final int offset, final int length)
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

    public MassQuoteEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public MassQuoteEncoder acctIDSource(AcctIDSource value)
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

    private int accountType;

    private boolean hasAccountType;

    public boolean hasAccountType()
    {
        return hasAccountType;
    }

    public MassQuoteEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public MassQuoteEncoder accountType(AccountType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AccountType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: accountType Value: " + value );
            }
            if (value == AccountType.NULL_VAL)
            {
                return this;
            }
        }
        return accountType(value.representation());
    }

    private final DecimalFloat defBidSize = new DecimalFloat();

    private boolean hasDefBidSize;

    public boolean hasDefBidSize()
    {
        return hasDefBidSize;
    }

    public MassQuoteEncoder defBidSize(DecimalFloat value)
    {
        defBidSize.set(value);
        hasDefBidSize = true;
        return this;
    }

    public MassQuoteEncoder defBidSize(long value, int scale)
    {
        defBidSize.set(value, scale);
        hasDefBidSize = true;
        return this;
    }

    public DecimalFloat defBidSize()
    {
        return defBidSize;
    }

    private final DecimalFloat defOfferSize = new DecimalFloat();

    private boolean hasDefOfferSize;

    public boolean hasDefOfferSize()
    {
        return hasDefOfferSize;
    }

    public MassQuoteEncoder defOfferSize(DecimalFloat value)
    {
        defOfferSize.set(value);
        hasDefOfferSize = true;
        return this;
    }

    public MassQuoteEncoder defOfferSize(long value, int scale)
    {
        defOfferSize.set(value, scale);
        hasDefOfferSize = true;
        return this;
    }

    public DecimalFloat defOfferSize()
    {
        return defOfferSize;
    }

    private final QuotSetGrpEncoder quotSetGrp = new QuotSetGrpEncoder();
    public QuotSetGrpEncoder quotSetGrp()
    {
        return quotSetGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (quoteReqIDLength > 0)
        {
            buffer.putBytes(position, quoteReqIDHeader, 0, quoteReqIDHeaderLength);
            position += quoteReqIDHeaderLength;
            buffer.putBytes(position, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            position += quoteReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (quoteIDLength > 0)
        {
            buffer.putBytes(position, quoteIDHeader, 0, quoteIDHeaderLength);
            position += quoteIDHeaderLength;
            buffer.putBytes(position, quoteID, quoteIDOffset, quoteIDLength);
            position += quoteIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteID");
        }

        if (hasQuoteType)
        {
            buffer.putBytes(position, quoteTypeHeader, 0, quoteTypeHeaderLength);
            position += quoteTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteResponseLevel)
        {
            buffer.putBytes(position, quoteResponseLevelHeader, 0, quoteResponseLevelHeaderLength);
            position += quoteResponseLevelHeaderLength;
            position += buffer.putIntAscii(position, quoteResponseLevel);
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

        if (hasAccountType)
        {
            buffer.putBytes(position, accountTypeHeader, 0, accountTypeHeaderLength);
            position += accountTypeHeaderLength;
            position += buffer.putIntAscii(position, accountType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDefBidSize)
        {
            buffer.putBytes(position, defBidSizeHeader, 0, defBidSizeHeaderLength);
            position += defBidSizeHeaderLength;
            position += buffer.putFloatAscii(position, defBidSize);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDefOfferSize)
        {
            buffer.putBytes(position, defOfferSizeHeader, 0, defOfferSizeHeaderLength);
            position += defOfferSizeHeaderLength;
            position += buffer.putFloatAscii(position, defOfferSize);
            buffer.putSeparator(position);
            position++;
        }

            position += quotSetGrp.encode(buffer, position);
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
        this.resetQuoteReqID();
        this.resetQuoteID();
        this.resetQuoteType();
        this.resetQuoteResponseLevel();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetDefBidSize();
        this.resetDefOfferSize();
        parties.reset();
        quotSetGrp.reset();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
    }

    public void resetQuoteResponseLevel()
    {
        hasQuoteResponseLevel = false;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetDefBidSize()
    {
        hasDefBidSize = false;
    }

    public void resetDefOfferSize()
    {
        hasDefOfferSize = false;
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
        builder.append("\"MessageName\": \"MassQuote\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasQuoteReqID())
        {
            indent(builder, level);
            builder.append("\"QuoteReqID\": \"");
            appendBuffer(builder, quoteReqID, quoteReqIDOffset, quoteReqIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteID())
        {
            indent(builder, level);
            builder.append("\"QuoteID\": \"");
            appendBuffer(builder, quoteID, quoteIDOffset, quoteIDLength);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
            builder.append("\",\n");
        }

        if (hasQuoteResponseLevel())
        {
            indent(builder, level);
            builder.append("\"QuoteResponseLevel\": \"");
            builder.append(quoteResponseLevel);
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

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasDefBidSize())
        {
            indent(builder, level);
            builder.append("\"DefBidSize\": \"");
            defBidSize.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDefOfferSize())
        {
            indent(builder, level);
            builder.append("\"DefOfferSize\": \"");
            defOfferSize.appendTo(builder);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"QuotSetGrp\": ");
    quotSetGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MassQuoteEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MassQuoteEncoder)encoder);
    }

    public MassQuoteEncoder copyTo(final MassQuoteEncoder encoder)
    {
        encoder.reset();
        if (hasQuoteReqID())
        {
            encoder.quoteReqIDAsCopy(quoteReqID.byteArray(), 0, quoteReqIDLength);
        }

        if (hasQuoteID())
        {
            encoder.quoteIDAsCopy(quoteID.byteArray(), 0, quoteIDLength);
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
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

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasDefBidSize())
        {
            encoder.defBidSize(this.defBidSize());
        }

        if (hasDefOfferSize())
        {
            encoder.defOfferSize(this.defOfferSize());
        }


        quotSetGrp.copyTo(encoder.quotSetGrp());        return encoder;
    }

}
