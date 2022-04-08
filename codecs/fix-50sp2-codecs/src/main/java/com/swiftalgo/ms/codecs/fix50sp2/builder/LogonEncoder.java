/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import uk.co.real_logic.artio.builder.AbstractLogonEncoder;
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


public class LogonEncoder implements AbstractLogonEncoder
{
    public long messageType()
    {
        return 65L;
    }

    public LogonEncoder()
    {
        header.msgType("A");
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

    private static final int encryptMethodHeaderLength = 3;
    private static final byte[] encryptMethodHeader = new byte[] {57, 56, (byte) '='};

    private static final int heartBtIntHeaderLength = 4;
    private static final byte[] heartBtIntHeader = new byte[] {49, 48, 56, (byte) '='};

    private static final int rawDataLengthHeaderLength = 3;
    private static final byte[] rawDataLengthHeader = new byte[] {57, 53, (byte) '='};

    private static final int rawDataHeaderLength = 3;
    private static final byte[] rawDataHeader = new byte[] {57, 54, (byte) '='};

    private static final int resetSeqNumFlagHeaderLength = 4;
    private static final byte[] resetSeqNumFlagHeader = new byte[] {49, 52, 49, (byte) '='};

    private static final int nextExpectedMsgSeqNumHeaderLength = 4;
    private static final byte[] nextExpectedMsgSeqNumHeader = new byte[] {55, 56, 57, (byte) '='};

    private static final int maxMessageSizeHeaderLength = 4;
    private static final byte[] maxMessageSizeHeader = new byte[] {51, 56, 51, (byte) '='};

    private static final int testMessageIndicatorHeaderLength = 4;
    private static final byte[] testMessageIndicatorHeader = new byte[] {52, 54, 52, (byte) '='};

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

    private static final int sessionStatusHeaderLength = 5;
    private static final byte[] sessionStatusHeader = new byte[] {49, 52, 48, 57, (byte) '='};

    private static final int defaultApplVerIDHeaderLength = 5;
    private static final byte[] defaultApplVerIDHeader = new byte[] {49, 49, 51, 55, (byte) '='};

    private static final int defaultApplExtIDHeaderLength = 5;
    private static final byte[] defaultApplExtIDHeader = new byte[] {49, 52, 48, 55, (byte) '='};

    private static final int defaultCstmApplVerIDHeaderLength = 5;
    private static final byte[] defaultCstmApplVerIDHeader = new byte[] {49, 52, 48, 56, (byte) '='};

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private int encryptMethod;

    private boolean hasEncryptMethod;

    public boolean hasEncryptMethod()
    {
        return hasEncryptMethod;
    }

    public LogonEncoder encryptMethod(int value)
    {
        encryptMethod = value;
        hasEncryptMethod = true;
        return this;
    }

    public int encryptMethod()
    {
        return encryptMethod;
    }

    public LogonEncoder encryptMethod(EncryptMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == EncryptMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: encryptMethod Value: " + value );
            }
            if (value == EncryptMethod.NULL_VAL)
            {
                return this;
            }
        }
        return encryptMethod(value.representation());
    }

    private int heartBtInt;

    private boolean hasHeartBtInt;

    public boolean hasHeartBtInt()
    {
        return hasHeartBtInt;
    }

    public LogonEncoder heartBtInt(int value)
    {
        heartBtInt = value;
        hasHeartBtInt = true;
        return this;
    }

    public int heartBtInt()
    {
        return heartBtInt;
    }

    private int rawDataLength;

    private boolean hasRawDataLength;

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }

    public LogonEncoder rawDataLength(int value)
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

    public LogonEncoder rawData(byte[] value)
    {
        rawData = value;
        hasRawData = true;
        return this;
    }

    public byte[] rawData()
    {
        return rawData;
    }

    public LogonEncoder rawDataAsCopy(final byte[] value, final int offset, final int length)
    {
        rawData = copyInto(rawData, value, offset, length);
        hasRawData = true;
        return this;
    }

    private boolean resetSeqNumFlag;

    private boolean hasResetSeqNumFlag;

    public boolean hasResetSeqNumFlag()
    {
        return hasResetSeqNumFlag;
    }

    public LogonEncoder resetSeqNumFlag(boolean value)
    {
        resetSeqNumFlag = value;
        hasResetSeqNumFlag = true;
        return this;
    }

    public boolean resetSeqNumFlag()
    {
        return resetSeqNumFlag;
    }

    private int nextExpectedMsgSeqNum;

    private boolean hasNextExpectedMsgSeqNum;

    public boolean hasNextExpectedMsgSeqNum()
    {
        return hasNextExpectedMsgSeqNum;
    }

    public LogonEncoder nextExpectedMsgSeqNum(int value)
    {
        nextExpectedMsgSeqNum = value;
        hasNextExpectedMsgSeqNum = true;
        return this;
    }

    public int nextExpectedMsgSeqNum()
    {
        return nextExpectedMsgSeqNum;
    }

    private int maxMessageSize;

    private boolean hasMaxMessageSize;

    public boolean hasMaxMessageSize()
    {
        return hasMaxMessageSize;
    }

    public LogonEncoder maxMessageSize(int value)
    {
        maxMessageSize = value;
        hasMaxMessageSize = true;
        return this;
    }

    public int maxMessageSize()
    {
        return maxMessageSize;
    }

    private final MsgTypeGrpEncoder msgTypeGrp = new MsgTypeGrpEncoder();
    public MsgTypeGrpEncoder msgTypeGrp()
    {
        return msgTypeGrp;
    }

    private boolean testMessageIndicator;

    private boolean hasTestMessageIndicator;

    public boolean hasTestMessageIndicator()
    {
        return hasTestMessageIndicator;
    }

    public LogonEncoder testMessageIndicator(boolean value)
    {
        testMessageIndicator = value;
        hasTestMessageIndicator = true;
        return this;
    }

    public boolean testMessageIndicator()
    {
        return testMessageIndicator;
    }

    private final MutableDirectBuffer username = new UnsafeBuffer();

    private int usernameOffset = 0;

    private int usernameLength = 0;

    public LogonEncoder username(final DirectBuffer value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public LogonEncoder username(final DirectBuffer value, final int length)
    {
        return username(value, 0, length);
    }

    public LogonEncoder username(final DirectBuffer value)
    {
        return username(value, 0, value.capacity());
    }

    public LogonEncoder username(final byte[] value, final int offset, final int length)
    {
        username.wrap(value);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public LogonEncoder usernameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(username, value, offset, length);
        usernameOffset = offset;
        usernameLength = length;
        return this;
    }

    public LogonEncoder username(final byte[] value, final int length)
    {
        return username(value, 0, length);
    }

    public LogonEncoder username(final byte[] value)
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

    public LogonEncoder username(final CharSequence value)
    {
        toBytes(value, username);
        usernameOffset = 0;
        usernameLength = value.length();
        return this;
    }

    public LogonEncoder username(final AsciiSequenceView value)
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

    public LogonEncoder username(final char[] value)
    {
        return username(value, 0, value.length);
    }

    public LogonEncoder username(final char[] value, final int length)
    {
        return username(value, 0, length);
    }

    public LogonEncoder username(final char[] value, final int offset, final int length)
    {
        toBytes(value, username, offset, length);
        usernameOffset = 0;
        usernameLength = length;
        return this;
    }

    private final MutableDirectBuffer password = new UnsafeBuffer();

    private int passwordOffset = 0;

    private int passwordLength = 0;

    public LogonEncoder password(final DirectBuffer value, final int offset, final int length)
    {
        password.wrap(value);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public LogonEncoder password(final DirectBuffer value, final int length)
    {
        return password(value, 0, length);
    }

    public LogonEncoder password(final DirectBuffer value)
    {
        return password(value, 0, value.capacity());
    }

    public LogonEncoder password(final byte[] value, final int offset, final int length)
    {
        password.wrap(value);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public LogonEncoder passwordAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(password, value, offset, length);
        passwordOffset = offset;
        passwordLength = length;
        return this;
    }

    public LogonEncoder password(final byte[] value, final int length)
    {
        return password(value, 0, length);
    }

    public LogonEncoder password(final byte[] value)
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

    public LogonEncoder password(final CharSequence value)
    {
        toBytes(value, password);
        passwordOffset = 0;
        passwordLength = value.length();
        return this;
    }

    public LogonEncoder password(final AsciiSequenceView value)
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

    public LogonEncoder password(final char[] value)
    {
        return password(value, 0, value.length);
    }

    public LogonEncoder password(final char[] value, final int length)
    {
        return password(value, 0, length);
    }

    public LogonEncoder password(final char[] value, final int offset, final int length)
    {
        toBytes(value, password, offset, length);
        passwordOffset = 0;
        passwordLength = length;
        return this;
    }

    private final MutableDirectBuffer newPassword = new UnsafeBuffer();

    private int newPasswordOffset = 0;

    private int newPasswordLength = 0;

    public LogonEncoder newPassword(final DirectBuffer value, final int offset, final int length)
    {
        newPassword.wrap(value);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public LogonEncoder newPassword(final DirectBuffer value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public LogonEncoder newPassword(final DirectBuffer value)
    {
        return newPassword(value, 0, value.capacity());
    }

    public LogonEncoder newPassword(final byte[] value, final int offset, final int length)
    {
        newPassword.wrap(value);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public LogonEncoder newPasswordAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(newPassword, value, offset, length);
        newPasswordOffset = offset;
        newPasswordLength = length;
        return this;
    }

    public LogonEncoder newPassword(final byte[] value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public LogonEncoder newPassword(final byte[] value)
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

    public LogonEncoder newPassword(final CharSequence value)
    {
        toBytes(value, newPassword);
        newPasswordOffset = 0;
        newPasswordLength = value.length();
        return this;
    }

    public LogonEncoder newPassword(final AsciiSequenceView value)
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

    public LogonEncoder newPassword(final char[] value)
    {
        return newPassword(value, 0, value.length);
    }

    public LogonEncoder newPassword(final char[] value, final int length)
    {
        return newPassword(value, 0, length);
    }

    public LogonEncoder newPassword(final char[] value, final int offset, final int length)
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

    public LogonEncoder encryptedPasswordMethod(int value)
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

    public LogonEncoder encryptedPasswordLen(int value)
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

    public LogonEncoder encryptedPassword(byte[] value)
    {
        encryptedPassword = value;
        hasEncryptedPassword = true;
        return this;
    }

    public byte[] encryptedPassword()
    {
        return encryptedPassword;
    }

    public LogonEncoder encryptedPasswordAsCopy(final byte[] value, final int offset, final int length)
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

    public LogonEncoder encryptedNewPasswordLen(int value)
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

    public LogonEncoder encryptedNewPassword(byte[] value)
    {
        encryptedNewPassword = value;
        hasEncryptedNewPassword = true;
        return this;
    }

    public byte[] encryptedNewPassword()
    {
        return encryptedNewPassword;
    }

    public LogonEncoder encryptedNewPasswordAsCopy(final byte[] value, final int offset, final int length)
    {
        encryptedNewPassword = copyInto(encryptedNewPassword, value, offset, length);
        hasEncryptedNewPassword = true;
        return this;
    }

    private int sessionStatus;

    private boolean hasSessionStatus;

    public boolean hasSessionStatus()
    {
        return hasSessionStatus;
    }

    public LogonEncoder sessionStatus(int value)
    {
        sessionStatus = value;
        hasSessionStatus = true;
        return this;
    }

    public int sessionStatus()
    {
        return sessionStatus;
    }

    public LogonEncoder sessionStatus(SessionStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SessionStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: sessionStatus Value: " + value );
            }
            if (value == SessionStatus.NULL_VAL)
            {
                return this;
            }
        }
        return sessionStatus(value.representation());
    }

    private final MutableDirectBuffer defaultApplVerID = new UnsafeBuffer();

    private int defaultApplVerIDOffset = 0;

    private int defaultApplVerIDLength = 0;

    public LogonEncoder defaultApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        defaultApplVerID.wrap(value);
        defaultApplVerIDOffset = offset;
        defaultApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultApplVerID(final DirectBuffer value, final int length)
    {
        return defaultApplVerID(value, 0, length);
    }

    public LogonEncoder defaultApplVerID(final DirectBuffer value)
    {
        return defaultApplVerID(value, 0, value.capacity());
    }

    public LogonEncoder defaultApplVerID(final byte[] value, final int offset, final int length)
    {
        defaultApplVerID.wrap(value);
        defaultApplVerIDOffset = offset;
        defaultApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(defaultApplVerID, value, offset, length);
        defaultApplVerIDOffset = offset;
        defaultApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultApplVerID(final byte[] value, final int length)
    {
        return defaultApplVerID(value, 0, length);
    }

    public LogonEncoder defaultApplVerID(final byte[] value)
    {
        return defaultApplVerID(value, 0, value.length);
    }

    public boolean hasDefaultApplVerID()
    {
        return defaultApplVerIDLength > 0;
    }

    public MutableDirectBuffer defaultApplVerID()
    {
        return defaultApplVerID;
    }

    public String defaultApplVerIDAsString()
    {
        return defaultApplVerID.getStringWithoutLengthAscii(defaultApplVerIDOffset, defaultApplVerIDLength);
    }

    public LogonEncoder defaultApplVerID(final CharSequence value)
    {
        toBytes(value, defaultApplVerID);
        defaultApplVerIDOffset = 0;
        defaultApplVerIDLength = value.length();
        return this;
    }

    public LogonEncoder defaultApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            defaultApplVerID.wrap(buffer);
            defaultApplVerIDOffset = value.offset();
            defaultApplVerIDLength = value.length();
        }
        return this;
    }

    public LogonEncoder defaultApplVerID(final char[] value)
    {
        return defaultApplVerID(value, 0, value.length);
    }

    public LogonEncoder defaultApplVerID(final char[] value, final int length)
    {
        return defaultApplVerID(value, 0, length);
    }

    public LogonEncoder defaultApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, defaultApplVerID, offset, length);
        defaultApplVerIDOffset = 0;
        defaultApplVerIDLength = length;
        return this;
    }

    private int defaultApplExtID;

    private boolean hasDefaultApplExtID;

    public boolean hasDefaultApplExtID()
    {
        return hasDefaultApplExtID;
    }

    public LogonEncoder defaultApplExtID(int value)
    {
        defaultApplExtID = value;
        hasDefaultApplExtID = true;
        return this;
    }

    public int defaultApplExtID()
    {
        return defaultApplExtID;
    }

    private final MutableDirectBuffer defaultCstmApplVerID = new UnsafeBuffer();

    private int defaultCstmApplVerIDOffset = 0;

    private int defaultCstmApplVerIDLength = 0;

    public LogonEncoder defaultCstmApplVerID(final DirectBuffer value, final int offset, final int length)
    {
        defaultCstmApplVerID.wrap(value);
        defaultCstmApplVerIDOffset = offset;
        defaultCstmApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultCstmApplVerID(final DirectBuffer value, final int length)
    {
        return defaultCstmApplVerID(value, 0, length);
    }

    public LogonEncoder defaultCstmApplVerID(final DirectBuffer value)
    {
        return defaultCstmApplVerID(value, 0, value.capacity());
    }

    public LogonEncoder defaultCstmApplVerID(final byte[] value, final int offset, final int length)
    {
        defaultCstmApplVerID.wrap(value);
        defaultCstmApplVerIDOffset = offset;
        defaultCstmApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultCstmApplVerIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(defaultCstmApplVerID, value, offset, length);
        defaultCstmApplVerIDOffset = offset;
        defaultCstmApplVerIDLength = length;
        return this;
    }

    public LogonEncoder defaultCstmApplVerID(final byte[] value, final int length)
    {
        return defaultCstmApplVerID(value, 0, length);
    }

    public LogonEncoder defaultCstmApplVerID(final byte[] value)
    {
        return defaultCstmApplVerID(value, 0, value.length);
    }

    public boolean hasDefaultCstmApplVerID()
    {
        return defaultCstmApplVerIDLength > 0;
    }

    public MutableDirectBuffer defaultCstmApplVerID()
    {
        return defaultCstmApplVerID;
    }

    public String defaultCstmApplVerIDAsString()
    {
        return defaultCstmApplVerID.getStringWithoutLengthAscii(defaultCstmApplVerIDOffset, defaultCstmApplVerIDLength);
    }

    public LogonEncoder defaultCstmApplVerID(final CharSequence value)
    {
        toBytes(value, defaultCstmApplVerID);
        defaultCstmApplVerIDOffset = 0;
        defaultCstmApplVerIDLength = value.length();
        return this;
    }

    public LogonEncoder defaultCstmApplVerID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            defaultCstmApplVerID.wrap(buffer);
            defaultCstmApplVerIDOffset = value.offset();
            defaultCstmApplVerIDLength = value.length();
        }
        return this;
    }

    public LogonEncoder defaultCstmApplVerID(final char[] value)
    {
        return defaultCstmApplVerID(value, 0, value.length);
    }

    public LogonEncoder defaultCstmApplVerID(final char[] value, final int length)
    {
        return defaultCstmApplVerID(value, 0, length);
    }

    public LogonEncoder defaultCstmApplVerID(final char[] value, final int offset, final int length)
    {
        toBytes(value, defaultCstmApplVerID, offset, length);
        defaultCstmApplVerIDOffset = 0;
        defaultCstmApplVerIDLength = length;
        return this;
    }

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public LogonEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LogonEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public LogonEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public LogonEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LogonEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LogonEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LogonEncoder text(final byte[] value)
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

    public LogonEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public LogonEncoder text(final AsciiSequenceView value)
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

    public LogonEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public LogonEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LogonEncoder text(final char[] value, final int offset, final int length)
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

    public LogonEncoder encodedTextLen(int value)
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

    public LogonEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public LogonEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public LogonEncoder cancelOnDisconnectType(final int value)
    {
        throw new UnsupportedOperationException();
    }
    public LogonEncoder cODTimeoutWindow(final int value)
    {
        throw new UnsupportedOperationException();
    }
    public boolean supportsUsername()
    {
        return true;
    }

    public boolean supportsPassword()
    {
        return true;
    }

    public boolean supportsCancelOnDisconnectType()
    {
        return false;
    }

    public boolean supportsCODTimeoutWindow()
    {
        return false;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (hasEncryptMethod)
        {
            buffer.putBytes(position, encryptMethodHeader, 0, encryptMethodHeaderLength);
            position += encryptMethodHeaderLength;
            position += buffer.putIntAscii(position, encryptMethod);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: EncryptMethod");
        }

        if (hasHeartBtInt)
        {
            buffer.putBytes(position, heartBtIntHeader, 0, heartBtIntHeaderLength);
            position += heartBtIntHeaderLength;
            position += buffer.putIntAscii(position, heartBtInt);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: HeartBtInt");
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

        if (hasResetSeqNumFlag)
        {
            buffer.putBytes(position, resetSeqNumFlagHeader, 0, resetSeqNumFlagHeaderLength);
            position += resetSeqNumFlagHeaderLength;
            position += buffer.putBooleanAscii(position, resetSeqNumFlag);
            buffer.putSeparator(position);
            position++;
        }

        if (hasNextExpectedMsgSeqNum)
        {
            buffer.putBytes(position, nextExpectedMsgSeqNumHeader, 0, nextExpectedMsgSeqNumHeaderLength);
            position += nextExpectedMsgSeqNumHeaderLength;
            position += buffer.putIntAscii(position, nextExpectedMsgSeqNum);
            buffer.putSeparator(position);
            position++;
        }

        if (hasMaxMessageSize)
        {
            buffer.putBytes(position, maxMessageSizeHeader, 0, maxMessageSizeHeaderLength);
            position += maxMessageSizeHeaderLength;
            position += buffer.putIntAscii(position, maxMessageSize);
            buffer.putSeparator(position);
            position++;
        }

            position += msgTypeGrp.encode(buffer, position);

        if (hasTestMessageIndicator)
        {
            buffer.putBytes(position, testMessageIndicatorHeader, 0, testMessageIndicatorHeaderLength);
            position += testMessageIndicatorHeaderLength;
            position += buffer.putBooleanAscii(position, testMessageIndicator);
            buffer.putSeparator(position);
            position++;
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

        if (hasSessionStatus)
        {
            buffer.putBytes(position, sessionStatusHeader, 0, sessionStatusHeaderLength);
            position += sessionStatusHeaderLength;
            position += buffer.putIntAscii(position, sessionStatus);
            buffer.putSeparator(position);
            position++;
        }

        if (defaultApplVerIDLength > 0)
        {
            buffer.putBytes(position, defaultApplVerIDHeader, 0, defaultApplVerIDHeaderLength);
            position += defaultApplVerIDHeaderLength;
            buffer.putBytes(position, defaultApplVerID, defaultApplVerIDOffset, defaultApplVerIDLength);
            position += defaultApplVerIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: DefaultApplVerID");
        }

        if (hasDefaultApplExtID)
        {
            buffer.putBytes(position, defaultApplExtIDHeader, 0, defaultApplExtIDHeaderLength);
            position += defaultApplExtIDHeaderLength;
            position += buffer.putIntAscii(position, defaultApplExtID);
            buffer.putSeparator(position);
            position++;
        }

        if (defaultCstmApplVerIDLength > 0)
        {
            buffer.putBytes(position, defaultCstmApplVerIDHeader, 0, defaultCstmApplVerIDHeaderLength);
            position += defaultCstmApplVerIDHeaderLength;
            buffer.putBytes(position, defaultCstmApplVerID, defaultCstmApplVerIDOffset, defaultCstmApplVerIDLength);
            position += defaultCstmApplVerIDLength;
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
        this.resetEncryptMethod();
        this.resetHeartBtInt();
        this.resetRawDataLength();
        this.resetRawData();
        this.resetResetSeqNumFlag();
        this.resetNextExpectedMsgSeqNum();
        this.resetMaxMessageSize();
        this.resetTestMessageIndicator();
        this.resetUsername();
        this.resetPassword();
        this.resetNewPassword();
        this.resetEncryptedPasswordMethod();
        this.resetEncryptedPasswordLen();
        this.resetEncryptedPassword();
        this.resetEncryptedNewPasswordLen();
        this.resetEncryptedNewPassword();
        this.resetSessionStatus();
        this.resetDefaultApplVerID();
        this.resetDefaultApplExtID();
        this.resetDefaultCstmApplVerID();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        msgTypeGrp.reset();
    }

    public void resetEncryptMethod()
    {
        hasEncryptMethod = false;
    }

    public void resetHeartBtInt()
    {
        hasHeartBtInt = false;
    }

    public void resetRawDataLength()
    {
        hasRawDataLength = false;
    }

    public void resetRawData()
    {
        hasRawData = false;
    }

    public void resetResetSeqNumFlag()
    {
        hasResetSeqNumFlag = false;
    }

    public void resetNextExpectedMsgSeqNum()
    {
        hasNextExpectedMsgSeqNum = false;
    }

    public void resetMaxMessageSize()
    {
        hasMaxMessageSize = false;
    }

    public void resetTestMessageIndicator()
    {
        hasTestMessageIndicator = false;
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

    public void resetSessionStatus()
    {
        hasSessionStatus = false;
    }

    public void resetDefaultApplVerID()
    {
        defaultApplVerIDLength = 0;
    }

    public void resetDefaultApplExtID()
    {
        hasDefaultApplExtID = false;
    }

    public void resetDefaultCstmApplVerID()
    {
        defaultCstmApplVerIDLength = 0;
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
        builder.append("\"MessageName\": \"Logon\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasEncryptMethod())
        {
            indent(builder, level);
            builder.append("\"EncryptMethod\": \"");
            builder.append(encryptMethod);
            builder.append("\",\n");
        }

        if (hasHeartBtInt())
        {
            indent(builder, level);
            builder.append("\"HeartBtInt\": \"");
            builder.append(heartBtInt);
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

        if (hasResetSeqNumFlag())
        {
            indent(builder, level);
            builder.append("\"ResetSeqNumFlag\": \"");
            builder.append(resetSeqNumFlag);
            builder.append("\",\n");
        }

        if (hasNextExpectedMsgSeqNum())
        {
            indent(builder, level);
            builder.append("\"NextExpectedMsgSeqNum\": \"");
            builder.append(nextExpectedMsgSeqNum);
            builder.append("\",\n");
        }

        if (hasMaxMessageSize())
        {
            indent(builder, level);
            builder.append("\"MaxMessageSize\": \"");
            builder.append(maxMessageSize);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"MsgTypeGrp\": ");
    msgTypeGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTestMessageIndicator())
        {
            indent(builder, level);
            builder.append("\"TestMessageIndicator\": \"");
            builder.append(testMessageIndicator);
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

        if (hasSessionStatus())
        {
            indent(builder, level);
            builder.append("\"SessionStatus\": \"");
            builder.append(sessionStatus);
            builder.append("\",\n");
        }

        if (hasDefaultApplVerID())
        {
            indent(builder, level);
            builder.append("\"DefaultApplVerID\": \"");
            appendBuffer(builder, defaultApplVerID, defaultApplVerIDOffset, defaultApplVerIDLength);
            builder.append("\",\n");
        }

        if (hasDefaultApplExtID())
        {
            indent(builder, level);
            builder.append("\"DefaultApplExtID\": \"");
            builder.append(defaultApplExtID);
            builder.append("\",\n");
        }

        if (hasDefaultCstmApplVerID())
        {
            indent(builder, level);
            builder.append("\"DefaultCstmApplVerID\": \"");
            appendBuffer(builder, defaultCstmApplVerID, defaultCstmApplVerIDOffset, defaultCstmApplVerIDLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LogonEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LogonEncoder)encoder);
    }

    public LogonEncoder copyTo(final LogonEncoder encoder)
    {
        encoder.reset();
        if (hasEncryptMethod())
        {
            encoder.encryptMethod(this.encryptMethod());
        }

        if (hasHeartBtInt())
        {
            encoder.heartBtInt(this.heartBtInt());
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

        if (hasResetSeqNumFlag())
        {
            encoder.resetSeqNumFlag(this.resetSeqNumFlag());
        }

        if (hasNextExpectedMsgSeqNum())
        {
            encoder.nextExpectedMsgSeqNum(this.nextExpectedMsgSeqNum());
        }

        if (hasMaxMessageSize())
        {
            encoder.maxMessageSize(this.maxMessageSize());
        }


        msgTypeGrp.copyTo(encoder.msgTypeGrp());
        if (hasTestMessageIndicator())
        {
            encoder.testMessageIndicator(this.testMessageIndicator());
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

        if (hasSessionStatus())
        {
            encoder.sessionStatus(this.sessionStatus());
        }

        if (hasDefaultApplVerID())
        {
            encoder.defaultApplVerIDAsCopy(defaultApplVerID.byteArray(), 0, defaultApplVerIDLength);
        }

        if (hasDefaultApplExtID())
        {
            encoder.defaultApplExtID(this.defaultApplExtID());
        }

        if (hasDefaultCstmApplVerID())
        {
            encoder.defaultCstmApplVerIDAsCopy(defaultCstmApplVerID.byteArray(), 0, defaultCstmApplVerIDLength);
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
        return encoder;
    }

}
