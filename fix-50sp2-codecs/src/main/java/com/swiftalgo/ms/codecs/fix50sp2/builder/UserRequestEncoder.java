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


public class UserRequestEncoder implements Encoder
{
    public long messageType()
    {
        return 17730L;
    }

    public UserRequestEncoder()
    {
        header.msgType("BE");
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

    private static final int userRequestTypeHeaderLength = 4;
    private static final byte[] userRequestTypeHeader = new byte[] {57, 50, 52, (byte) '='};

    private static final int usernameHeaderLength = 4;
    private static final byte[] usernameHeader = new byte[] {53, 53, 51, (byte) '='};

    private static final int passwordHeaderLength = 4;
    private static final byte[] passwordHeader = new byte[] {53, 53, 52, (byte) '='};

    private static final int newPasswordHeaderLength = 4;
    private static final byte[] newPasswordHeader = new byte[] {57, 50, 53, (byte) '='};

    private static final int encryptedPasswordMethodHeaderLength = 5;
    private static final byte[] encryptedPasswordMethodHeader = new byte[] {49, 52, 48, 48, (byte) '='};

    private static final int encryptedPasswordLenHeaderLength = 5;
    private static final byte[] encryptedPasswordLenHeader = new byte[] {49, 52, 48, 49, (byte) '='};

    private static final int encryptedPasswordHeaderLength = 5;
    private static final byte[] encryptedPasswordHeader = new byte[] {49, 52, 48, 50, (byte) '='};

    private static final int encryptedNewPasswordLenHeaderLength = 5;
    private static final byte[] encryptedNewPasswordLenHeader = new byte[] {49, 52, 48, 51, (byte) '='};

    private static final int encryptedNewPasswordHeaderLength = 5;
    private static final byte[] encryptedNewPasswordHeader = new byte[] {49, 52, 48, 52, (byte) '='};

    private static final int rawDataLengthHeaderLength = 3;
    private static final byte[] rawDataLengthHeader = new byte[] {57, 53, (byte) '='};

    private static final int rawDataHeaderLength = 3;
    private static final byte[] rawDataHeader = new byte[] {57, 54, (byte) '='};

    private final MutableDirectBuffer userRequestID = new UnsafeBuffer();

    private int userRequestIDOffset = 0;

    private int userRequestIDLength = 0;

    public UserRequestEncoder userRequestID(final DirectBuffer value, final int offset, final int length)
    {
        userRequestID.wrap(value);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserRequestEncoder userRequestID(final DirectBuffer value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserRequestEncoder userRequestID(final DirectBuffer value)
    {
        return userRequestID(value, 0, value.capacity());
    }

    public UserRequestEncoder userRequestID(final byte[] value, final int offset, final int length)
    {
        userRequestID.wrap(value);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserRequestEncoder userRequestIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(userRequestID, value, offset, length);
        userRequestIDOffset = offset;
        userRequestIDLength = length;
        return this;
    }

    public UserRequestEncoder userRequestID(final byte[] value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserRequestEncoder userRequestID(final byte[] value)
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

    public UserRequestEncoder userRequestID(final CharSequence value)
    {
        toBytes(value, userRequestID);
        userRequestIDOffset = 0;
        userRequestIDLength = value.length();
        return this;
    }

    public UserRequestEncoder userRequestID(final AsciiSequenceView value)
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

    public UserRequestEncoder userRequestID(final char[] value)
    {
        return userRequestID(value, 0, value.length);
    }

    public UserRequestEncoder userRequestID(final char[] value, final int length)
    {
        return userRequestID(value, 0, length);
    }

    public UserRequestEncoder userRequestID(final char[] value, final int offset, final int length)
    {
        toBytes(value, userRequestID, offset, length);
        userRequestIDOffset = 0;
        userRequestIDLength = length;
        return this;
    }

    private int userRequestType;

    private boolean hasUserRequestType;

    public boolean hasUserRequestType()
    {
        return hasUserRequestType;
    }

    public UserRequestEncoder userRequestType(int value)
    {
        userRequestType = value;
        hasUserRequestType = true;
        return this;
    }

    public int userRequestType()
    {
        return userRequestType;
    }

    public UserRequestEncoder userRequestType(UserRequestType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == UserRequestType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: userRequestType Value: " + value );
            }
            if (value == UserRequestType.NULL_VAL)
            {
                return this;
            }
        }
        return userRequestType(value.representation());
    }

    private final MutableDirectBuffer username = new UnsafeBuffer();

    private int usernameOffset = 0;

    private int usernameLength = 0;

    public UserRequestEncoder username(final DirectBuffer value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserRequestEncoder username(final DirectBuffer value, final int length)
    {
        return username(value, 0, length);
    }

    public UserRequestEncoder username(final DirectBuffer value)
    {
        return username(value, 0, value.capacity());
    }

    public UserRequestEncoder username(final byte[] value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserRequestEncoder usernameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(username, value, offset, length);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public UserRequestEncoder username(final byte[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UserRequestEncoder username(final byte[] value)
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

    public UserRequestEncoder username(final CharSequence value)
    {
        toBytes(value, username);
        usernameOffset = 0;
        usernameLength = value.length();
        return this;
    }

    public UserRequestEncoder username(final AsciiSequenceView value)
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

    public UserRequestEncoder username(final char[] value)
    {
        return username(value, 0, value.length);
    }

    public UserRequestEncoder username(final char[] value, final int length)
    {
        return username(value, 0, length);
    }

    public UserRequestEncoder username(final char[] value, final int offset, final int length)
    {
        toBytes(value, username, offset, length);
        usernameOffset = 0;
        usernameLength = length;
        return this;
    }

    private final MutableDirectBuffer password = new UnsafeBuffer();

    private int passwordOffset = 0;

    private int passwordLength = 0;

    public UserRequestEncoder password(final DirectBuffer value, final int offset, final int length)
    {
        password.wrap(value);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public UserRequestEncoder password(final DirectBuffer value, final int length)
    {
        return password(value, 0, length);
    }

    public UserRequestEncoder password(final DirectBuffer value)
    {
        return password(value, 0, value.capacity());
    }

    public UserRequestEncoder password(final byte[] value, final int offset, final int length)
    {
        password.wrap(value);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public UserRequestEncoder passwordAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(password, value, offset, length);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public UserRequestEncoder password(final byte[] value, final int length)
    {
        return password(value, 0, length);
    }

    public UserRequestEncoder password(final byte[] value)
    {
        return password(value, 0, value.length);
    }

    public boolean hasPassword()
    {
        return passwordLength > 0;
    }

    public MutableDirectBuffer password()
    {
        return password;
    }

    public String passwordAsString()
    {
        return password.getStringWithoutLengthAscii(passwordOffset, passwordLength);
    }

    public UserRequestEncoder password(final CharSequence value)
    {
        toBytes(value, password);
        passwordOffset = 0;
        passwordLength = value.length();
        return this;
    }

    public UserRequestEncoder password(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            password.wrap(buffer);
            passwordOffset = value.offset();
            passwordLength = value.length();
        }
        return this;
    }

    public UserRequestEncoder password(final char[] value)
    {
        return password(value, 0, value.length);
    }

    public UserRequestEncoder password(final char[] value, final int length)
    {
        return password(value, 0, length);
    }

    public UserRequestEncoder password(final char[] value, final int offset, final int length)
    {
        toBytes(value, password, offset, length);
        passwordOffset = 0;
        passwordLength = length;
        return this;
    }

    private final MutableDirectBuffer newPassword = new UnsafeBuffer();

    private int newPasswordOffset = 0;

    private int newPasswordLength = 0;

    public UserRequestEncoder newPassword(final DirectBuffer value, final int offset, final int length)
    {
        newPassword.wrap(value);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public UserRequestEncoder newPassword(final DirectBuffer value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public UserRequestEncoder newPassword(final DirectBuffer value)
    {
        return newPassword(value, 0, value.capacity());
    }

    public UserRequestEncoder newPassword(final byte[] value, final int offset, final int length)
    {
        newPassword.wrap(value);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public UserRequestEncoder newPasswordAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(newPassword, value, offset, length);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public UserRequestEncoder newPassword(final byte[] value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public UserRequestEncoder newPassword(final byte[] value)
    {
        return newPassword(value, 0, value.length);
    }

    public boolean hasNewPassword()
    {
        return newPasswordLength > 0;
    }

    public MutableDirectBuffer newPassword()
    {
        return newPassword;
    }

    public String newPasswordAsString()
    {
        return newPassword.getStringWithoutLengthAscii(newPasswordOffset, newPasswordLength);
    }

    public UserRequestEncoder newPassword(final CharSequence value)
    {
        toBytes(value, newPassword);
        newPasswordOffset = 0;
        newPasswordLength = value.length();
        return this;
    }

    public UserRequestEncoder newPassword(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            newPassword.wrap(buffer);
            newPasswordOffset = value.offset();
            newPasswordLength = value.length();
        }
        return this;
    }

    public UserRequestEncoder newPassword(final char[] value)
    {
        return newPassword(value, 0, value.length);
    }

    public UserRequestEncoder newPassword(final char[] value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public UserRequestEncoder newPassword(final char[] value, final int offset, final int length)
    {
        toBytes(value, newPassword, offset, length);
        newPasswordOffset = 0;
        newPasswordLength = length;
        return this;
    }

    private int encryptedPasswordMethod;

    private boolean hasEncryptedPasswordMethod;

    public boolean hasEncryptedPasswordMethod()
    {
        return hasEncryptedPasswordMethod;
    }

    public UserRequestEncoder encryptedPasswordMethod(int value)
    {
        encryptedPasswordMethod = value;
        hasEncryptedPasswordMethod = true;
        return this;
    }

    public int encryptedPasswordMethod()
    {
        return encryptedPasswordMethod;
    }

    private int encryptedPasswordLen;

    private boolean hasEncryptedPasswordLen;

    public boolean hasEncryptedPasswordLen()
    {
        return hasEncryptedPasswordLen;
    }

    public UserRequestEncoder encryptedPasswordLen(int value)
    {
        encryptedPasswordLen = value;
        hasEncryptedPasswordLen = true;
        return this;
    }

    public int encryptedPasswordLen()
    {
        return encryptedPasswordLen;
    }

    private byte[] encryptedPassword;

    private boolean hasEncryptedPassword;

    public boolean hasEncryptedPassword()
    {
        return hasEncryptedPassword;
    }

    public UserRequestEncoder encryptedPassword(byte[] value)
    {
        encryptedPassword = value;
        hasEncryptedPassword = true;
        return this;
    }

    public byte[] encryptedPassword()
    {
        return encryptedPassword;
    }

    public UserRequestEncoder encryptedPasswordAsCopy(final byte[] value, final int offset, final int length)
    {
        encryptedPassword = copyInto(encryptedPassword, value, offset, length);
        hasEncryptedPassword = true;
        return this;
    }

    private int encryptedNewPasswordLen;

    private boolean hasEncryptedNewPasswordLen;

    public boolean hasEncryptedNewPasswordLen()
    {
        return hasEncryptedNewPasswordLen;
    }

    public UserRequestEncoder encryptedNewPasswordLen(int value)
    {
        encryptedNewPasswordLen = value;
        hasEncryptedNewPasswordLen = true;
        return this;
    }

    public int encryptedNewPasswordLen()
    {
        return encryptedNewPasswordLen;
    }

    private byte[] encryptedNewPassword;

    private boolean hasEncryptedNewPassword;

    public boolean hasEncryptedNewPassword()
    {
        return hasEncryptedNewPassword;
    }

    public UserRequestEncoder encryptedNewPassword(byte[] value)
    {
        encryptedNewPassword = value;
        hasEncryptedNewPassword = true;
        return this;
    }

    public byte[] encryptedNewPassword()
    {
        return encryptedNewPassword;
    }

    public UserRequestEncoder encryptedNewPasswordAsCopy(final byte[] value, final int offset, final int length)
    {
        encryptedNewPassword = copyInto(encryptedNewPassword, value, offset, length);
        hasEncryptedNewPassword = true;
        return this;
    }

    private int rawDataLength;

    private boolean hasRawDataLength;

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }

    public UserRequestEncoder rawDataLength(int value)
    {
        rawDataLength = value;
        hasRawDataLength = true;
        return this;
    }

    public int rawDataLength()
    {
        return rawDataLength;
    }

    private byte[] rawData;

    private boolean hasRawData;

    public boolean hasRawData()
    {
        return hasRawData;
    }

    public UserRequestEncoder rawData(byte[] value)
    {
        rawData = value;
        hasRawData = true;
        return this;
    }

    public byte[] rawData()
    {
        return rawData;
    }

    public UserRequestEncoder rawDataAsCopy(final byte[] value, final int offset, final int length)
    {
        rawData = copyInto(rawData, value, offset, length);
        hasRawData = true;
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

        if (hasUserRequestType)
        {
            buffer.putBytes(position, userRequestTypeHeader, 0, userRequestTypeHeaderLength);
            position += userRequestTypeHeaderLength;
            position += buffer.putIntAscii(position, userRequestType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: UserRequestType");
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

        if (passwordLength > 0)
        {
            buffer.putBytes(position, passwordHeader, 0, passwordHeaderLength);
            position += passwordHeaderLength;
            buffer.putBytes(position, password, passwordOffset, passwordLength);
            position += passwordLength;
            buffer.putSeparator(position);
            position++;
        }

        if (newPasswordLength > 0)
        {
            buffer.putBytes(position, newPasswordHeader, 0, newPasswordHeaderLength);
            position += newPasswordHeaderLength;
            buffer.putBytes(position, newPassword, newPasswordOffset, newPasswordLength);
            position += newPasswordLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncryptedPasswordMethod)
        {
            buffer.putBytes(position, encryptedPasswordMethodHeader, 0, encryptedPasswordMethodHeaderLength);
            position += encryptedPasswordMethodHeaderLength;
            position += buffer.putIntAscii(position, encryptedPasswordMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncryptedPasswordLen)
        {
            buffer.putBytes(position, encryptedPasswordLenHeader, 0, encryptedPasswordLenHeaderLength);
            position += encryptedPasswordLenHeaderLength;
            position += buffer.putIntAscii(position, encryptedPasswordLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncryptedPassword)
        {
            buffer.putBytes(position, encryptedPasswordHeader, 0, encryptedPasswordHeaderLength);
            position += encryptedPasswordHeaderLength;
            buffer.putBytes(position, encryptedPassword);
            position += encryptedPassword.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncryptedNewPasswordLen)
        {
            buffer.putBytes(position, encryptedNewPasswordLenHeader, 0, encryptedNewPasswordLenHeaderLength);
            position += encryptedNewPasswordLenHeaderLength;
            position += buffer.putIntAscii(position, encryptedNewPasswordLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncryptedNewPassword)
        {
            buffer.putBytes(position, encryptedNewPasswordHeader, 0, encryptedNewPasswordHeaderLength);
            position += encryptedNewPasswordHeaderLength;
            buffer.putBytes(position, encryptedNewPassword);
            position += encryptedNewPassword.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRawDataLength)
        {
            buffer.putBytes(position, rawDataLengthHeader, 0, rawDataLengthHeaderLength);
            position += rawDataLengthHeaderLength;
            position += buffer.putIntAscii(position, rawDataLength);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRawData)
        {
            buffer.putBytes(position, rawDataHeader, 0, rawDataHeaderLength);
            position += rawDataHeaderLength;
            buffer.putBytes(position, rawData);
            position += rawData.length;
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
        this.resetUserRequestType();
        this.resetUsername();
        this.resetPassword();
        this.resetNewPassword();
        this.resetEncryptedPasswordMethod();
        this.resetEncryptedPasswordLen();
        this.resetEncryptedPassword();
        this.resetEncryptedNewPasswordLen();
        this.resetEncryptedNewPassword();
        this.resetRawDataLength();
        this.resetRawData();
    }

    public void resetUserRequestID()
    {
        userRequestIDLength = 0;
    }

    public void resetUserRequestType()
    {
        hasUserRequestType = false;
    }

    public void resetUsername()
    {
        usernameLength = 0;
    }

    public void resetPassword()
    {
        passwordLength = 0;
    }

    public void resetNewPassword()
    {
        newPasswordLength = 0;
    }

    public void resetEncryptedPasswordMethod()
    {
        hasEncryptedPasswordMethod = false;
    }

    public void resetEncryptedPasswordLen()
    {
        hasEncryptedPasswordLen = false;
    }

    public void resetEncryptedPassword()
    {
        hasEncryptedPassword = false;
    }

    public void resetEncryptedNewPasswordLen()
    {
        hasEncryptedNewPasswordLen = false;
    }

    public void resetEncryptedNewPassword()
    {
        hasEncryptedNewPassword = false;
    }

    public void resetRawDataLength()
    {
        hasRawDataLength = false;
    }

    public void resetRawData()
    {
        hasRawData = false;
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
        builder.append("\"MessageName\": \"UserRequest\",\n");
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

        if (hasUserRequestType())
        {
            indent(builder, level);
            builder.append("\"UserRequestType\": \"");
            builder.append(userRequestType);
            builder.append("\",\n");
        }

        if (hasUsername())
        {
            indent(builder, level);
            builder.append("\"Username\": \"");
            appendBuffer(builder, username, usernameOffset, usernameLength);
            builder.append("\",\n");
        }

        if (hasPassword())
        {
            indent(builder, level);
            builder.append("\"Password\": \"");
            appendBuffer(builder, password, passwordOffset, passwordLength);
            builder.append("\",\n");
        }

        if (hasNewPassword())
        {
            indent(builder, level);
            builder.append("\"NewPassword\": \"");
            appendBuffer(builder, newPassword, newPasswordOffset, newPasswordLength);
            builder.append("\",\n");
        }

        if (hasEncryptedPasswordMethod())
        {
            indent(builder, level);
            builder.append("\"EncryptedPasswordMethod\": \"");
            builder.append(encryptedPasswordMethod);
            builder.append("\",\n");
        }

        if (hasEncryptedPasswordLen())
        {
            indent(builder, level);
            builder.append("\"EncryptedPasswordLen\": \"");
            builder.append(encryptedPasswordLen);
            builder.append("\",\n");
        }

        if (hasEncryptedPassword())
        {
            indent(builder, level);
            builder.append("\"EncryptedPassword\": \"");
            appendData(builder, encryptedPassword, encryptedPasswordLen);
            builder.append("\",\n");
        }

        if (hasEncryptedNewPasswordLen())
        {
            indent(builder, level);
            builder.append("\"EncryptedNewPasswordLen\": \"");
            builder.append(encryptedNewPasswordLen);
            builder.append("\",\n");
        }

        if (hasEncryptedNewPassword())
        {
            indent(builder, level);
            builder.append("\"EncryptedNewPassword\": \"");
            appendData(builder, encryptedNewPassword, encryptedNewPasswordLen);
            builder.append("\",\n");
        }

        if (hasRawDataLength())
        {
            indent(builder, level);
            builder.append("\"RawDataLength\": \"");
            builder.append(rawDataLength);
            builder.append("\",\n");
        }

        if (hasRawData())
        {
            indent(builder, level);
            builder.append("\"RawData\": \"");
            appendData(builder, rawData, rawDataLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UserRequestEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UserRequestEncoder)encoder);
    }

    public UserRequestEncoder copyTo(final UserRequestEncoder encoder)
    {
        encoder.reset();
        if (hasUserRequestID())
        {
            encoder.userRequestIDAsCopy(userRequestID.byteArray(), 0, userRequestIDLength);
        }

        if (hasUserRequestType())
        {
            encoder.userRequestType(this.userRequestType());
        }

        if (hasUsername())
        {
            encoder.usernameAsCopy(username.byteArray(), 0, usernameLength);
        }

        if (hasPassword())
        {
            encoder.passwordAsCopy(password.byteArray(), 0, passwordLength);
        }

        if (hasNewPassword())
        {
            encoder.newPasswordAsCopy(newPassword.byteArray(), 0, newPasswordLength);
        }

        if (hasEncryptedPasswordMethod())
        {
            encoder.encryptedPasswordMethod(this.encryptedPasswordMethod());
        }

        if (hasEncryptedPasswordLen())
        {
            encoder.encryptedPasswordLen(this.encryptedPasswordLen());
        }

        if (hasEncryptedPassword())
        {
            encoder.encryptedPasswordAsCopy(this.encryptedPassword(), 0, encryptedPasswordLen());
            encoder.encryptedPasswordLen(encryptedPasswordLen());
        }

        if (hasEncryptedNewPasswordLen())
        {
            encoder.encryptedNewPasswordLen(this.encryptedNewPasswordLen());
        }

        if (hasEncryptedNewPassword())
        {
            encoder.encryptedNewPasswordAsCopy(this.encryptedNewPassword(), 0, encryptedNewPasswordLen());
            encoder.encryptedNewPasswordLen(encryptedNewPasswordLen());
        }

        if (hasRawDataLength())
        {
            encoder.rawDataLength(this.rawDataLength());
        }

        if (hasRawData())
        {
            encoder.rawDataAsCopy(this.rawData(), 0, rawDataLength());
            encoder.rawDataLength(rawDataLength());
        }
        return encoder;
    }

}
