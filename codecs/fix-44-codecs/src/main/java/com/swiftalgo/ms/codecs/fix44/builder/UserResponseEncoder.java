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


public class UserResponseEncoder implements Encoder
{
    public long messageType()
    {
        return 17986L;
    }

    public UserResponseEncoder()
    {
        header.msgType("BF");
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

    private static final int userRequestIDHeaderLength = 4;
    private static final byte[] userRequestIDHeader = new byte[] {57, 50, 51, (byte) '='};

    private static final int usernameHeaderLength = 4;
    private static final byte[] usernameHeader = new byte[] {53, 53, 51, (byte) '='};

    private static final int userStatusHeaderLength = 4;
    private static final byte[] userStatusHeader = new byte[] {57, 50, 54, (byte) '='};

    private static final int userStatusTextHeaderLength = 4;
    private static final byte[] userStatusTextHeader = new byte[] {57, 50, 55, (byte) '='};

    private final MutableDirectBuffer userRequestID = new UnsafeBuffer();

    private int userRequestIDOffset = 0;

    private int userRequestIDLength = 0;

    public UserResponseEncoder userRequestID(final DirectBuffer value, final int offset, final int length)
    {
        userRequestID.wrap(value);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserResponseEncoder userRequestID(final DirectBuffer value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserResponseEncoder userRequestID(final DirectBuffer value)
    {
        return userRequestID(value, 0, value.capacity());
    }

    public UserResponseEncoder userRequestID(final byte[] value, final int offset, final int length)
    {
        userRequestID.wrap(value);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserResponseEncoder userRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(userRequestID, value, offset, length);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserResponseEncoder userRequestID(final byte[] value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserResponseEncoder userRequestID(final byte[] value)
    {
        return userRequestID(value, 0, value.length);
    }

    public boolean hasUserRequestID()
    {
        return userRequestIDLength > 0;
    }

    public MutableDirectBuffer userRequestID()
    {
        return userRequestID;
    }

    public String userRequestIDAsString()
    {
        return userRequestID.getStringWithoutLengthAscii(userRequestIDOffset, userRequestIDLength);
    }

    public UserResponseEncoder userRequestID(final CharSequence value)
    {
        toBytes(value, userRequestID);
        userRequestIDOffset = 0;
        userRequestIDLength = value.length();
        return this;
    }

    public UserResponseEncoder userRequestID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            userRequestID.wrap(buffer);
            userRequestIDOffset = value.offset();
            userRequestIDLength = value.length();
        }
        return this;
    }

    public UserResponseEncoder userRequestID(final char[] value)
    {
        return userRequestID(value, 0, value.length);
    }

    public UserResponseEncoder userRequestID(final char[] value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserResponseEncoder userRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, userRequestID, offset, length);
        userRequestIDOffset = 0;
        userRequestIDLength = length;
        return this;
    }

    private final MutableDirectBuffer username = new UnsafeBuffer();

    private int usernameOffset = 0;

    private int usernameLength = 0;

    public UserResponseEncoder username(final DirectBuffer value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserResponseEncoder username(final DirectBuffer value, final int length)
    {
        return username(value, 0, length);
    }

    public UserResponseEncoder username(final DirectBuffer value)
    {
        return username(value, 0, value.capacity());
    }

    public UserResponseEncoder username(final byte[] value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserResponseEncoder usernameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(username, value, offset, length);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserResponseEncoder username(final byte[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UserResponseEncoder username(final byte[] value)
    {
        return username(value, 0, value.length);
    }

    public boolean hasUsername()
    {
        return usernameLength > 0;
    }

    public MutableDirectBuffer username()
    {
        return username;
    }

    public String usernameAsString()
    {
        return username.getStringWithoutLengthAscii(usernameOffset, usernameLength);
    }

    public UserResponseEncoder username(final CharSequence value)
    {
        toBytes(value, username);
        usernameOffset = 0;
        usernameLength = value.length();
        return this;
    }

    public UserResponseEncoder username(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            username.wrap(buffer);
            usernameOffset = value.offset();
            usernameLength = value.length();
        }
        return this;
    }

    public UserResponseEncoder username(final char[] value)
    {
        return username(value, 0, value.length);
    }

    public UserResponseEncoder username(final char[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UserResponseEncoder username(final char[] value, final int offset, final int length)
    {
        toBytes(value, username, offset, length);
        usernameOffset = 0;
        usernameLength = length;
        return this;
    }

    private int userStatus;

    private boolean hasUserStatus;

    public boolean hasUserStatus()
    {
        return hasUserStatus;
    }

    public UserResponseEncoder userStatus(int value)
    {
        userStatus = value;
        hasUserStatus = true;
        return this;
    }

    public int userStatus()
    {
        return userStatus;
    }

    public UserResponseEncoder userStatus(UserStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == UserStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: userStatus Value: " + value );
            }
            if (value == UserStatus.NULL_VAL)
            {
                return this;
            }
        }
        return userStatus(value.representation());
    }

    private final MutableDirectBuffer userStatusText = new UnsafeBuffer();

    private int userStatusTextOffset = 0;

    private int userStatusTextLength = 0;

    public UserResponseEncoder userStatusText(final DirectBuffer value, final int offset, final int length)
    {
        userStatusText.wrap(value);
        userStatusTextOffset = offset;
        userStatusTextLength = length;
        return this;
    }

    public UserResponseEncoder userStatusText(final DirectBuffer value, final int length)
    {
        return userStatusText(value, 0, length);
    }

    public UserResponseEncoder userStatusText(final DirectBuffer value)
    {
        return userStatusText(value, 0, value.capacity());
    }

    public UserResponseEncoder userStatusText(final byte[] value, final int offset, final int length)
    {
        userStatusText.wrap(value);
        userStatusTextOffset = offset;
        userStatusTextLength = length;
        return this;
    }

    public UserResponseEncoder userStatusTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(userStatusText, value, offset, length);
        userStatusTextOffset = offset;
        userStatusTextLength = length;
        return this;
    }

    public UserResponseEncoder userStatusText(final byte[] value, final int length)
    {
        return userStatusText(value, 0, length);
    }

    public UserResponseEncoder userStatusText(final byte[] value)
    {
        return userStatusText(value, 0, value.length);
    }

    public boolean hasUserStatusText()
    {
        return userStatusTextLength > 0;
    }

    public MutableDirectBuffer userStatusText()
    {
        return userStatusText;
    }

    public String userStatusTextAsString()
    {
        return userStatusText.getStringWithoutLengthAscii(userStatusTextOffset, userStatusTextLength);
    }

    public UserResponseEncoder userStatusText(final CharSequence value)
    {
        toBytes(value, userStatusText);
        userStatusTextOffset = 0;
        userStatusTextLength = value.length();
        return this;
    }

    public UserResponseEncoder userStatusText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            userStatusText.wrap(buffer);
            userStatusTextOffset = value.offset();
            userStatusTextLength = value.length();
        }
        return this;
    }

    public UserResponseEncoder userStatusText(final char[] value)
    {
        return userStatusText(value, 0, value.length);
    }

    public UserResponseEncoder userStatusText(final char[] value, final int length)
    {
        return userStatusText(value, 0, length);
    }

    public UserResponseEncoder userStatusText(final char[] value, final int offset, final int length)
    {
        toBytes(value, userStatusText, offset, length);
        userStatusTextOffset = 0;
        userStatusTextLength = length;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (userRequestIDLength > 0)
        {
            buffer.putBytes(position, userRequestIDHeader, 0, userRequestIDHeaderLength);
            position += userRequestIDHeaderLength;
            buffer.putBytes(position, userRequestID, userRequestIDOffset, userRequestIDLength);
            position += userRequestIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UserRequestID");
        }

        if (usernameLength > 0)
        {
            buffer.putBytes(position, usernameHeader, 0, usernameHeaderLength);
            position += usernameHeaderLength;
            buffer.putBytes(position, username, usernameOffset, usernameLength);
            position += usernameLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Username");
        }

        if (hasUserStatus)
        {
            buffer.putBytes(position, userStatusHeader, 0, userStatusHeaderLength);
            position += userStatusHeaderLength;
            position += buffer.putIntAscii(position, userStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (userStatusTextLength > 0)
        {
            buffer.putBytes(position, userStatusTextHeader, 0, userStatusTextHeaderLength);
            position += userStatusTextHeaderLength;
            buffer.putBytes(position, userStatusText, userStatusTextOffset, userStatusTextLength);
            position += userStatusTextLength;
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
        this.resetUserRequestID();
        this.resetUsername();
        this.resetUserStatus();
        this.resetUserStatusText();
    }

    public void resetUserRequestID()
    {
        userRequestIDLength = 0;
    }

    public void resetUsername()
    {
        usernameLength = 0;
    }

    public void resetUserStatus()
    {
        hasUserStatus = false;
    }

    public void resetUserStatusText()
    {
        userStatusTextLength = 0;
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
        builder.append("\"MessageName\": \"UserResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasUserRequestID())
        {
            indent(builder, level);
            builder.append("\"UserRequestID\": \"");
            appendBuffer(builder, userRequestID, userRequestIDOffset, userRequestIDLength);
            builder.append("\",\n");
        }

        if (hasUsername())
        {
            indent(builder, level);
            builder.append("\"Username\": \"");
            appendBuffer(builder, username, usernameOffset, usernameLength);
            builder.append("\",\n");
        }

        if (hasUserStatus())
        {
            indent(builder, level);
            builder.append("\"UserStatus\": \"");
            builder.append(userStatus);
            builder.append("\",\n");
        }

        if (hasUserStatusText())
        {
            indent(builder, level);
            builder.append("\"UserStatusText\": \"");
            appendBuffer(builder, userStatusText, userStatusTextOffset, userStatusTextLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UserResponseEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UserResponseEncoder)encoder);
    }

    public UserResponseEncoder copyTo(final UserResponseEncoder encoder)
    {
        encoder.reset();
        if (hasUserRequestID())
        {
            encoder.userRequestIDAsCopy(userRequestID.byteArray(), 0, userRequestIDLength);
        }

        if (hasUsername())
        {
            encoder.usernameAsCopy(username.byteArray(), 0, usernameLength);
        }

        if (hasUserStatus())
        {
            encoder.userStatus(this.userStatus());
        }

        if (hasUserStatusText())
        {
            encoder.userStatusTextAsCopy(userStatusText.byteArray(), 0, userStatusTextLength);
        }
        return encoder;
    }

}
