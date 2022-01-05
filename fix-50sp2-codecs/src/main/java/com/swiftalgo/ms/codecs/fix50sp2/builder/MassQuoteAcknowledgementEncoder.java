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


public class MassQuoteAcknowledgementEncoder implements Encoder
{
    public long messageType()
    {
        return 98L;
    }

    public MassQuoteAcknowledgementEncoder()
    {
        header.msgType("b");
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

    private static final int quoteStatusHeaderLength = 4;
    private static final byte[] quoteStatusHeader = new byte[] {50, 57, 55, (byte) '='};

    private static final int quoteRejectReasonHeaderLength = 4;
    private static final byte[] quoteRejectReasonHeader = new byte[] {51, 48, 48, (byte) '='};

    private static final int quoteResponseLevelHeaderLength = 4;
    private static final byte[] quoteResponseLevelHeader = new byte[] {51, 48, 49, (byte) '='};

    private static final int quoteTypeHeaderLength = 4;
    private static final byte[] quoteTypeHeader = new byte[] {53, 51, 55, (byte) '='};

    private static final int quoteCancelTypeHeaderLength = 4;
    private static final byte[] quoteCancelTypeHeader = new byte[] {50, 57, 56, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private static final int accountTypeHeaderLength = 4;
    private static final byte[] accountTypeHeader = new byte[] {53, 56, 49, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer quoteReqID = new UnsafeBuffer();

    private int quoteReqIDOffset = 0;

    private int quoteReqIDLength = 0;

    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final DirectBuffer value)
    {
        return quoteReqID(value, 0, value.capacity());
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value, final int offset, final int length)
    {
        quoteReqID.wrap(value);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteReqID, value, offset, length);
        quoteReqIDOffset = offset;
        quoteReqIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final byte[] value)
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

    public MassQuoteAcknowledgementEncoder quoteReqID(final CharSequence value)
    {
        toBytes(value, quoteReqID);
        quoteReqIDOffset = 0;
        quoteReqIDLength = value.length();
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final AsciiSequenceView value)
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

    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value)
    {
        return quoteReqID(value, 0, value.length);
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value, final int length)
    {
        return quoteReqID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteReqID, offset, length);
        quoteReqIDOffset = 0;
        quoteReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer quoteID = new UnsafeBuffer();

    private int quoteIDOffset = 0;

    private int quoteIDLength = 0;

    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteID(final DirectBuffer value)
    {
        return quoteID(value, 0, value.capacity());
    }

    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value, final int offset, final int length)
    {
        quoteID.wrap(value);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(quoteID, value, offset, length);
        quoteIDOffset = offset;
        quoteIDLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteID(final byte[] value)
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

    public MassQuoteAcknowledgementEncoder quoteID(final CharSequence value)
    {
        toBytes(value, quoteID);
        quoteIDOffset = 0;
        quoteIDLength = value.length();
        return this;
    }

    public MassQuoteAcknowledgementEncoder quoteID(final AsciiSequenceView value)
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

    public MassQuoteAcknowledgementEncoder quoteID(final char[] value)
    {
        return quoteID(value, 0, value.length);
    }

    public MassQuoteAcknowledgementEncoder quoteID(final char[] value, final int length)
    {
        return quoteID(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder quoteID(final char[] value, final int offset, final int length)
    {
        toBytes(value, quoteID, offset, length);
        quoteIDOffset = 0;
        quoteIDLength = length;
        return this;
    }

    private int quoteStatus;

    private boolean hasQuoteStatus;

    public boolean hasQuoteStatus()
    {
        return hasQuoteStatus;
    }

    public MassQuoteAcknowledgementEncoder quoteStatus(int value)
    {
        quoteStatus = value;
        hasQuoteStatus = true;
        return this;
    }

    public int quoteStatus()
    {
        return quoteStatus;
    }

    public MassQuoteAcknowledgementEncoder quoteStatus(QuoteStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteStatus Value: " + value );
            }
            if (value == QuoteStatus.NULL_VAL)
            {
                return this;
            }
        }
        return quoteStatus(value.representation());
    }

    private int quoteRejectReason;

    private boolean hasQuoteRejectReason;

    public boolean hasQuoteRejectReason()
    {
        return hasQuoteRejectReason;
    }

    public MassQuoteAcknowledgementEncoder quoteRejectReason(int value)
    {
        quoteRejectReason = value;
        hasQuoteRejectReason = true;
        return this;
    }

    public int quoteRejectReason()
    {
        return quoteRejectReason;
    }

    public MassQuoteAcknowledgementEncoder quoteRejectReason(QuoteRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteRejectReason Value: " + value );
            }
            if (value == QuoteRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return quoteRejectReason(value.representation());
    }

    private int quoteResponseLevel;

    private boolean hasQuoteResponseLevel;

    public boolean hasQuoteResponseLevel()
    {
        return hasQuoteResponseLevel;
    }

    public MassQuoteAcknowledgementEncoder quoteResponseLevel(int value)
    {
        quoteResponseLevel = value;
        hasQuoteResponseLevel = true;
        return this;
    }

    public int quoteResponseLevel()
    {
        return quoteResponseLevel;
    }

    public MassQuoteAcknowledgementEncoder quoteResponseLevel(QuoteResponseLevel value)
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

    private int quoteType;

    private boolean hasQuoteType;

    public boolean hasQuoteType()
    {
        return hasQuoteType;
    }

    public MassQuoteAcknowledgementEncoder quoteType(int value)
    {
        quoteType = value;
        hasQuoteType = true;
        return this;
    }

    public int quoteType()
    {
        return quoteType;
    }

    public MassQuoteAcknowledgementEncoder quoteType(QuoteType value)
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

    private int quoteCancelType;

    private boolean hasQuoteCancelType;

    public boolean hasQuoteCancelType()
    {
        return hasQuoteCancelType;
    }

    public MassQuoteAcknowledgementEncoder quoteCancelType(int value)
    {
        quoteCancelType = value;
        hasQuoteCancelType = true;
        return this;
    }

    public int quoteCancelType()
    {
        return quoteCancelType;
    }

    public MassQuoteAcknowledgementEncoder quoteCancelType(QuoteCancelType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == QuoteCancelType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: quoteCancelType Value: " + value );
            }
            if (value == QuoteCancelType.NULL_VAL)
            {
                return this;
            }
        }
        return quoteCancelType(value.representation());
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final TargetPartiesEncoder targetParties = new TargetPartiesEncoder();
    public TargetPartiesEncoder targetParties()
    {
        return targetParties;
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public MassQuoteAcknowledgementEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder account(final byte[] value)
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

    public MassQuoteAcknowledgementEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public MassQuoteAcknowledgementEncoder account(final AsciiSequenceView value)
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

    public MassQuoteAcknowledgementEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public MassQuoteAcknowledgementEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder account(final char[] value, final int offset, final int length)
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

    public MassQuoteAcknowledgementEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public MassQuoteAcknowledgementEncoder acctIDSource(AcctIDSource value)
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

    public MassQuoteAcknowledgementEncoder accountType(int value)
    {
        accountType = value;
        hasAccountType = true;
        return this;
    }

    public int accountType()
    {
        return accountType;
    }

    public MassQuoteAcknowledgementEncoder accountType(AccountType value)
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

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public MassQuoteAcknowledgementEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public MassQuoteAcknowledgementEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public MassQuoteAcknowledgementEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public MassQuoteAcknowledgementEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public MassQuoteAcknowledgementEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public MassQuoteAcknowledgementEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public MassQuoteAcknowledgementEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public MassQuoteAcknowledgementEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public MassQuoteAcknowledgementEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public MassQuoteAcknowledgementEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    private final QuotSetAckGrpEncoder quotSetAckGrp = new QuotSetAckGrpEncoder();
    public QuotSetAckGrpEncoder quotSetAckGrp()
    {
        return quotSetAckGrp;
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

        if (hasQuoteStatus)
        {
            buffer.putBytes(position, quoteStatusHeader, 0, quoteStatusHeaderLength);
            position += quoteStatusHeaderLength;
            position += buffer.putIntAscii(position, quoteStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: QuoteStatus");
        }

        if (hasQuoteRejectReason)
        {
            buffer.putBytes(position, quoteRejectReasonHeader, 0, quoteRejectReasonHeaderLength);
            position += quoteRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, quoteRejectReason);
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

        if (hasQuoteType)
        {
            buffer.putBytes(position, quoteTypeHeader, 0, quoteTypeHeaderLength);
            position += quoteTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasQuoteCancelType)
        {
            buffer.putBytes(position, quoteCancelTypeHeader, 0, quoteCancelTypeHeaderLength);
            position += quoteCancelTypeHeaderLength;
            position += buffer.putIntAscii(position, quoteCancelType);
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

            position += targetParties.encode(buffer, position);

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

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }

            position += quotSetAckGrp.encode(buffer, position);
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
        this.resetQuoteStatus();
        this.resetQuoteRejectReason();
        this.resetQuoteResponseLevel();
        this.resetQuoteType();
        this.resetQuoteCancelType();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        parties.reset();
        targetParties.reset();
        quotSetAckGrp.reset();
    }

    public void resetQuoteReqID()
    {
        quoteReqIDLength = 0;
    }

    public void resetQuoteID()
    {
        quoteIDLength = 0;
    }

    public void resetQuoteStatus()
    {
        hasQuoteStatus = false;
    }

    public void resetQuoteRejectReason()
    {
        hasQuoteRejectReason = false;
    }

    public void resetQuoteResponseLevel()
    {
        hasQuoteResponseLevel = false;
    }

    public void resetQuoteType()
    {
        hasQuoteType = false;
    }

    public void resetQuoteCancelType()
    {
        hasQuoteCancelType = false;
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

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
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
        builder.append("\"MessageName\": \"MassQuoteAcknowledgement\",\n");
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

        if (hasQuoteStatus())
        {
            indent(builder, level);
            builder.append("\"QuoteStatus\": \"");
            builder.append(quoteStatus);
            builder.append("\",\n");
        }

        if (hasQuoteRejectReason())
        {
            indent(builder, level);
            builder.append("\"QuoteRejectReason\": \"");
            builder.append(quoteRejectReason);
            builder.append("\",\n");
        }

        if (hasQuoteResponseLevel())
        {
            indent(builder, level);
            builder.append("\"QuoteResponseLevel\": \"");
            builder.append(quoteResponseLevel);
            builder.append("\",\n");
        }

        if (hasQuoteType())
        {
            indent(builder, level);
            builder.append("\"QuoteType\": \"");
            builder.append(quoteType);
            builder.append("\",\n");
        }

        if (hasQuoteCancelType())
        {
            indent(builder, level);
            builder.append("\"QuoteCancelType\": \"");
            builder.append(quoteCancelType);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TargetParties\": ");
    targetParties.appendTo(builder, level + 1);
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

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"QuotSetAckGrp\": ");
    quotSetAckGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MassQuoteAcknowledgementEncoder copyTo(final Encoder encoder)
    {
        return copyTo((MassQuoteAcknowledgementEncoder)encoder);
    }

    public MassQuoteAcknowledgementEncoder copyTo(final MassQuoteAcknowledgementEncoder encoder)
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

        if (hasQuoteStatus())
        {
            encoder.quoteStatus(this.quoteStatus());
        }

        if (hasQuoteRejectReason())
        {
            encoder.quoteRejectReason(this.quoteRejectReason());
        }

        if (hasQuoteResponseLevel())
        {
            encoder.quoteResponseLevel(this.quoteResponseLevel());
        }

        if (hasQuoteType())
        {
            encoder.quoteType(this.quoteType());
        }

        if (hasQuoteCancelType())
        {
            encoder.quoteCancelType(this.quoteCancelType());
        }


        parties.copyTo(encoder.parties());

        targetParties.copyTo(encoder.targetParties());
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

        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }


        quotSetAckGrp.copyTo(encoder.quotSetAckGrp());        return encoder;
    }

}
