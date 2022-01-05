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


public class RegistrationInstructionsResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 112L;
    }

    public RegistrationInstructionsResponseEncoder()
    {
        header.msgType("p");
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

    private static final int registStatusHeaderLength = 4;
    private static final byte[] registStatusHeader = new byte[] {53, 48, 54, (byte) '='};

    private static final int registRejReasonCodeHeaderLength = 4;
    private static final byte[] registRejReasonCodeHeader = new byte[] {53, 48, 55, (byte) '='};

    private static final int registRejReasonTextHeaderLength = 4;
    private static final byte[] registRejReasonTextHeader = new byte[] {52, 57, 54, (byte) '='};

    private final MutableDirectBuffer registID = new UnsafeBuffer();

    private int registIDOffset = 0;

    private int registIDLength = 0;

    public RegistrationInstructionsResponseEncoder registID(final DirectBuffer value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registID(final DirectBuffer value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registID(final DirectBuffer value)
    {
        return registID(value, 0, value.capacity());
    }

    public RegistrationInstructionsResponseEncoder registID(final byte[] value, final int offset, final int length)
    {
        registID.wrap(value);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registID, value, offset, length);
        registIDOffset = offset;
        registIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registID(final byte[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registID(final byte[] value)
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

    public RegistrationInstructionsResponseEncoder registID(final CharSequence value)
    {
        toBytes(value, registID);
        registIDOffset = 0;
        registIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsResponseEncoder registID(final AsciiSequenceView value)
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

    public RegistrationInstructionsResponseEncoder registID(final char[] value)
    {
        return registID(value, 0, value.length);
    }

    public RegistrationInstructionsResponseEncoder registID(final char[] value, final int length)
    {
        return registID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registID(final char[] value, final int offset, final int length)
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

    public RegistrationInstructionsResponseEncoder registTransType(char value)
    {
        registTransType = value;
        hasRegistTransType = true;
        return this;
    }

    public char registTransType()
    {
        return registTransType;
    }

    public RegistrationInstructionsResponseEncoder registTransType(RegistTransType value)
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

    public RegistrationInstructionsResponseEncoder registRefID(final DirectBuffer value, final int offset, final int length)
    {
        registRefID.wrap(value);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRefID(final DirectBuffer value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRefID(final DirectBuffer value)
    {
        return registRefID(value, 0, value.capacity());
    }

    public RegistrationInstructionsResponseEncoder registRefID(final byte[] value, final int offset, final int length)
    {
        registRefID.wrap(value);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registRefID, value, offset, length);
        registRefIDOffset = offset;
        registRefIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRefID(final byte[] value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRefID(final byte[] value)
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

    public RegistrationInstructionsResponseEncoder registRefID(final CharSequence value)
    {
        toBytes(value, registRefID);
        registRefIDOffset = 0;
        registRefIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRefID(final AsciiSequenceView value)
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

    public RegistrationInstructionsResponseEncoder registRefID(final char[] value)
    {
        return registRefID(value, 0, value.length);
    }

    public RegistrationInstructionsResponseEncoder registRefID(final char[] value, final int length)
    {
        return registRefID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, registRefID, offset, length);
        registRefIDOffset = 0;
        registRefIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public RegistrationInstructionsResponseEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final byte[] value)
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

    public RegistrationInstructionsResponseEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final AsciiSequenceView value)
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

    public RegistrationInstructionsResponseEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder clOrdID(final char[] value, final int offset, final int length)
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

    public RegistrationInstructionsResponseEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public RegistrationInstructionsResponseEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder account(final byte[] value)
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

    public RegistrationInstructionsResponseEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public RegistrationInstructionsResponseEncoder account(final AsciiSequenceView value)
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

    public RegistrationInstructionsResponseEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public RegistrationInstructionsResponseEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder account(final char[] value, final int offset, final int length)
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

    public RegistrationInstructionsResponseEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public RegistrationInstructionsResponseEncoder acctIDSource(AcctIDSource value)
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

    private char registStatus;

    private boolean hasRegistStatus;

    public boolean hasRegistStatus()
    {
        return hasRegistStatus;
    }

    public RegistrationInstructionsResponseEncoder registStatus(char value)
    {
        registStatus = value;
        hasRegistStatus = true;
        return this;
    }

    public char registStatus()
    {
        return registStatus;
    }

    public RegistrationInstructionsResponseEncoder registStatus(RegistStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RegistStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: registStatus Value: " + value );
            }
            if (value == RegistStatus.NULL_VAL)
            {
                return this;
            }
        }
        return registStatus(value.representation());
    }

    private int registRejReasonCode;

    private boolean hasRegistRejReasonCode;

    public boolean hasRegistRejReasonCode()
    {
        return hasRegistRejReasonCode;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonCode(int value)
    {
        registRejReasonCode = value;
        hasRegistRejReasonCode = true;
        return this;
    }

    public int registRejReasonCode()
    {
        return registRejReasonCode;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonCode(RegistRejReasonCode value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RegistRejReasonCode.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: registRejReasonCode Value: " + value );
            }
            if (value == RegistRejReasonCode.NULL_VAL)
            {
                return this;
            }
        }
        return registRejReasonCode(value.representation());
    }

    private final MutableDirectBuffer registRejReasonText = new UnsafeBuffer();

    private int registRejReasonTextOffset = 0;

    private int registRejReasonTextLength = 0;

    public RegistrationInstructionsResponseEncoder registRejReasonText(final DirectBuffer value, final int offset, final int length)
    {
        registRejReasonText.wrap(value);
        registRejReasonTextOffset = offset;
        registRejReasonTextLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final DirectBuffer value, final int length)
    {
        return registRejReasonText(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final DirectBuffer value)
    {
        return registRejReasonText(value, 0, value.capacity());
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final byte[] value, final int offset, final int length)
    {
        registRejReasonText.wrap(value);
        registRejReasonTextOffset = offset;
        registRejReasonTextLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(registRejReasonText, value, offset, length);
        registRejReasonTextOffset = offset;
        registRejReasonTextLength = length;
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final byte[] value, final int length)
    {
        return registRejReasonText(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final byte[] value)
    {
        return registRejReasonText(value, 0, value.length);
    }

    public boolean hasRegistRejReasonText()
    {
        return registRejReasonTextLength > 0;
    }

    public MutableDirectBuffer registRejReasonText()
    {
        return registRejReasonText;
    }

    public String registRejReasonTextAsString()
    {
        return registRejReasonText.getStringWithoutLengthAscii(registRejReasonTextOffset, registRejReasonTextLength);
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final CharSequence value)
    {
        toBytes(value, registRejReasonText);
        registRejReasonTextOffset = 0;
        registRejReasonTextLength = value.length();
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            registRejReasonText.wrap(buffer);
            registRejReasonTextOffset = value.offset();
            registRejReasonTextLength = value.length();
        }
        return this;
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final char[] value)
    {
        return registRejReasonText(value, 0, value.length);
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final char[] value, final int length)
    {
        return registRejReasonText(value, 0, length);
    }

    public RegistrationInstructionsResponseEncoder registRejReasonText(final char[] value, final int offset, final int length)
    {
        toBytes(value, registRejReasonText, offset, length);
        registRejReasonTextOffset = 0;
        registRejReasonTextLength = length;
        return this;
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

        if (hasRegistStatus)
        {
            buffer.putBytes(position, registStatusHeader, 0, registStatusHeaderLength);
            position += registStatusHeaderLength;
            position += buffer.putCharAscii(position, registStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RegistStatus");
        }

        if (hasRegistRejReasonCode)
        {
            buffer.putBytes(position, registRejReasonCodeHeader, 0, registRejReasonCodeHeaderLength);
            position += registRejReasonCodeHeaderLength;
            position += buffer.putIntAscii(position, registRejReasonCode);
            buffer.putSeparator(position);
            position++;
        }

        if (registRejReasonTextLength > 0)
        {
            buffer.putBytes(position, registRejReasonTextHeader, 0, registRejReasonTextHeaderLength);
            position += registRejReasonTextHeaderLength;
            buffer.putBytes(position, registRejReasonText, registRejReasonTextOffset, registRejReasonTextLength);
            position += registRejReasonTextLength;
            buffer.putSeparator(position);
            position++;
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
        this.resetRegistStatus();
        this.resetRegistRejReasonCode();
        this.resetRegistRejReasonText();
        parties.reset();
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

    public void resetRegistStatus()
    {
        registStatus = MISSING_CHAR;
    }

    public void resetRegistRejReasonCode()
    {
        hasRegistRejReasonCode = false;
    }

    public void resetRegistRejReasonText()
    {
        registRejReasonTextLength = 0;
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
        builder.append("\"MessageName\": \"RegistrationInstructionsResponse\",\n");
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

        if (hasRegistStatus())
        {
            indent(builder, level);
            builder.append("\"RegistStatus\": \"");
            builder.append(registStatus);
            builder.append("\",\n");
        }

        if (hasRegistRejReasonCode())
        {
            indent(builder, level);
            builder.append("\"RegistRejReasonCode\": \"");
            builder.append(registRejReasonCode);
            builder.append("\",\n");
        }

        if (hasRegistRejReasonText())
        {
            indent(builder, level);
            builder.append("\"RegistRejReasonText\": \"");
            appendBuffer(builder, registRejReasonText, registRejReasonTextOffset, registRejReasonTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RegistrationInstructionsResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RegistrationInstructionsResponseEncoder)encoder);
    }

    public RegistrationInstructionsResponseEncoder copyTo(final RegistrationInstructionsResponseEncoder encoder)
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

        if (hasRegistStatus())
        {
            encoder.registStatus(this.registStatus());
        }

        if (hasRegistRejReasonCode())
        {
            encoder.registRejReasonCode(this.registRejReasonCode());
        }

        if (hasRegistRejReasonText())
        {
            encoder.registRejReasonTextAsCopy(registRejReasonText.byteArray(), 0, registRejReasonTextLength);
        }
        return encoder;
    }

}
