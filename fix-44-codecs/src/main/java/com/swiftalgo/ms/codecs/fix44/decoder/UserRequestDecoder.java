/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import uk.co.real_logic.artio.decoder.AbstractUserRequestDecoder;
import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix44.builder.UserRequestEncoder;


public class UserRequestDecoder extends CommonDecoderImpl implements MessageDecoder, AbstractUserRequestDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.USER_REQUEST_ID);
            REQUIRED_FIELDS.add(Constants.USER_REQUEST_TYPE);
            REQUIRED_FIELDS.add(Constants.USERNAME);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(14);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(6);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        final IntIterator unknownFieldsIterator = unknownFields.iterator();
        if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED && unknownFieldsIterator.hasNext())
        {
            invalidTagId = unknownFieldsIterator.nextValue();
            rejectReason = Constants.ALL_FIELDS.contains(invalidTagId) ? 2 : 0;
            return false;
        }
        if (!header.validate())
        {
            invalidTagId = header.invalidTagId();
            rejectReason = header.rejectReason();
            return false;
        }
        else if (!trailer.validate())
        {
            invalidTagId = trailer.invalidTagId();
            rejectReason = trailer.rejectReason();
            return false;
        }
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UserRequestType.isValid(userRequestType()))
        {
            invalidTagId = 924;
            rejectReason = 5;
            return false;
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17730L;

    public static final String MESSAGE_TYPE_AS_STRING = "BE";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(72);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.SENDER_COMP_ID);
        messageFields.add(Constants.TARGET_COMP_ID);
        messageFields.add(Constants.ON_BEHALF_OF_COMP_ID);
        messageFields.add(Constants.DELIVER_TO_COMP_ID);
        messageFields.add(Constants.SECURE_DATA_LEN);
        messageFields.add(Constants.SECURE_DATA);
        messageFields.add(Constants.MSG_SEQ_NUM);
        messageFields.add(Constants.SENDER_SUB_ID);
        messageFields.add(Constants.SENDER_LOCATION_ID);
        messageFields.add(Constants.TARGET_SUB_ID);
        messageFields.add(Constants.TARGET_LOCATION_ID);
        messageFields.add(Constants.ON_BEHALF_OF_SUB_ID);
        messageFields.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        messageFields.add(Constants.DELIVER_TO_SUB_ID);
        messageFields.add(Constants.DELIVER_TO_LOCATION_ID);
        messageFields.add(Constants.POSS_DUP_FLAG);
        messageFields.add(Constants.POSS_RESEND);
        messageFields.add(Constants.SENDING_TIME);
        messageFields.add(Constants.ORIG_SENDING_TIME);
        messageFields.add(Constants.XML_DATA_LEN);
        messageFields.add(Constants.XML_DATA);
        messageFields.add(Constants.MESSAGE_ENCODING);
        messageFields.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        messageFields.add(Constants.USER_REQUEST_ID);
        messageFields.add(Constants.USER_REQUEST_TYPE);
        messageFields.add(Constants.USERNAME);
        messageFields.add(Constants.PASSWORD);
        messageFields.add(Constants.NEW_PASSWORD);
        messageFields.add(Constants.RAW_DATA_LENGTH);
        messageFields.add(Constants.RAW_DATA);
        messageFields.add(Constants.SIGNATURE_LENGTH);
        messageFields.add(Constants.SIGNATURE);
        messageFields.add(Constants.CHECK_SUM);
    }

    private final TrailerDecoder trailer = new TrailerDecoder();

    public TrailerDecoder trailer()
    {
        return trailer;
    }

    private final HeaderDecoder header = new HeaderDecoder(trailer);

    public HeaderDecoder header()
    {
        return header;
    }

    private char[] userRequestID = new char[1];

    public char[] userRequestID()
    {
        return userRequestID;
    }


    private int userRequestIDOffset;

    private int userRequestIDLength;

    public int userRequestIDLength()
    {
        return userRequestIDLength;
    }

    public String userRequestIDAsString()
    {
        return new String(userRequestID, 0, userRequestIDLength);
    }

    public void userRequestID(final AsciiSequenceView view)
    {
        view.wrap(buffer, userRequestIDOffset, userRequestIDLength);
    }


    private final CharArrayWrapper userRequestIDWrapper = new CharArrayWrapper();
    private int userRequestType = MISSING_INT;

    public int userRequestType()
    {
        return userRequestType;
    }



    private final CharArrayWrapper userRequestTypeWrapper = new CharArrayWrapper();
    public UserRequestType userRequestTypeAsEnum()
    {
        return UserRequestType.decode(userRequestType);
    }

    private char[] username = new char[1];

    public char[] username()
    {
        return username;
    }


    private int usernameOffset;

    private int usernameLength;

    public int usernameLength()
    {
        return usernameLength;
    }

    public String usernameAsString()
    {
        return new String(username, 0, usernameLength);
    }

    public void username(final AsciiSequenceView view)
    {
        view.wrap(buffer, usernameOffset, usernameLength);
    }


    private final CharArrayWrapper usernameWrapper = new CharArrayWrapper();
    private char[] password = new char[1];

    private boolean hasPassword;

    public char[] password()
    {
        if (!hasPassword)
        {
            throw new IllegalArgumentException("No value for optional field: Password");
        }

        return password;
    }

    public boolean hasPassword()
    {
        return hasPassword;
    }


    private int passwordOffset;

    private int passwordLength;

    public int passwordLength()
    {
        if (!hasPassword)
        {
            throw new IllegalArgumentException("No value for optional field: Password");
        }

        return passwordLength;
    }

    public String passwordAsString()
    {
        return hasPassword ? new String(password, 0, passwordLength) : null;
    }

    public void password(final AsciiSequenceView view)
    {
        if (!hasPassword)
        {
            throw new IllegalArgumentException("No value for optional field: Password");
        }

        view.wrap(buffer, passwordOffset, passwordLength);
    }


    private final CharArrayWrapper passwordWrapper = new CharArrayWrapper();
    private char[] newPassword = new char[1];

    private boolean hasNewPassword;

    public char[] newPassword()
    {
        if (!hasNewPassword)
        {
            throw new IllegalArgumentException("No value for optional field: NewPassword");
        }

        return newPassword;
    }

    public boolean hasNewPassword()
    {
        return hasNewPassword;
    }


    private int newPasswordOffset;

    private int newPasswordLength;

    public int newPasswordLength()
    {
        if (!hasNewPassword)
        {
            throw new IllegalArgumentException("No value for optional field: NewPassword");
        }

        return newPasswordLength;
    }

    public String newPasswordAsString()
    {
        return hasNewPassword ? new String(newPassword, 0, newPasswordLength) : null;
    }

    public void newPassword(final AsciiSequenceView view)
    {
        if (!hasNewPassword)
        {
            throw new IllegalArgumentException("No value for optional field: NewPassword");
        }

        view.wrap(buffer, newPasswordOffset, newPasswordLength);
    }


    private final CharArrayWrapper newPasswordWrapper = new CharArrayWrapper();
    private int rawDataLength = MISSING_INT;

    private boolean hasRawDataLength;

    public int rawDataLength()
    {
        if (!hasRawDataLength)
        {
            throw new IllegalArgumentException("No value for optional field: RawDataLength");
        }

        return rawDataLength;
    }

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }



    private byte[] rawData = new byte[1];

    private boolean hasRawData;

    public byte[] rawData()
    {
        if (!hasRawData)
        {
            throw new IllegalArgumentException("No value for optional field: RawData");
        }

        return rawData;
    }

    public boolean hasRawData()
    {
        return hasRawData;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UserRequest
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        position += header.decode(buffer, position, length);
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.USER_REQUEST_ID:
                userRequestID = buffer.getChars(userRequestID, valueOffset, valueLength);
                userRequestIDOffset = valueOffset;
                userRequestIDLength = valueLength;
                break;

            case Constants.USER_REQUEST_TYPE:
                userRequestType = getInt(buffer, valueOffset, endOfField, 924, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.USERNAME:
                username = buffer.getChars(username, valueOffset, valueLength);
                usernameOffset = valueOffset;
                usernameLength = valueLength;
                break;

            case Constants.PASSWORD:
                hasPassword = true;
                password = buffer.getChars(password, valueOffset, valueLength);
                passwordOffset = valueOffset;
                passwordLength = valueLength;
                break;

            case Constants.NEW_PASSWORD:
                hasNewPassword = true;
                newPassword = buffer.getChars(newPassword, valueOffset, valueLength);
                newPasswordOffset = valueOffset;
                newPasswordLength = valueLength;
                break;

            case Constants.RAW_DATA_LENGTH:
                hasRawDataLength = true;
                rawDataLength = getInt(buffer, valueOffset, endOfField, 95, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RAW_DATA:
                hasRawData = true;
                rawData = buffer.getBytes(rawData, valueOffset, rawDataLength);
                endOfField = valueOffset + rawDataLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!(trailer.REQUIRED_FIELDS.contains(tag)))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag)))
                {
                    position += trailer.decode(buffer, position, end - position);
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        position += trailer.decode(buffer, position, end - position);
        return position - offset;
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
    }

    public void resetMessage()
    {
        this.resetUserRequestID();
        this.resetUserRequestType();
        this.resetUsername();
        this.resetPassword();
        this.resetNewPassword();
        this.resetRawDataLength();
        this.resetRawData();
    }

    public void resetUserRequestID()
    {
        userRequestIDOffset = 0;
        userRequestIDLength = 0;
    }

    public void resetUserRequestType()
    {
        userRequestType = MISSING_INT;
    }

    public void resetUsername()
    {
        usernameOffset = 0;
        usernameLength = 0;
    }

    public void resetPassword()
    {
        hasPassword = false;
    }

    public void resetNewPassword()
    {
        hasNewPassword = false;
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
        indent(builder, level);
        builder.append("\"UserRequestID\": \"");
        builder.append(this.userRequestID(), 0, userRequestIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"UserRequestType\": \"");
        builder.append(userRequestType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"Username\": \"");
        builder.append(this.username(), 0, usernameLength());
        builder.append("\",\n");

        if (hasPassword())
        {
            indent(builder, level);
            builder.append("\"Password\": \"");
            builder.append(this.password(), 0, passwordLength());
            builder.append("\",\n");
        }

        if (hasNewPassword())
        {
            indent(builder, level);
            builder.append("\"NewPassword\": \"");
            builder.append(this.newPassword(), 0, newPasswordLength());
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
    public UserRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UserRequestEncoder)encoder);
    }

    public UserRequestEncoder toEncoder(final UserRequestEncoder encoder)
    {
        encoder.reset();
        encoder.userRequestID(this.userRequestID(), 0, userRequestIDLength());
        encoder.userRequestType(this.userRequestType());
        encoder.username(this.username(), 0, usernameLength());
        if (hasPassword())
        {
            encoder.password(this.password(), 0, passwordLength());
        }

        if (hasNewPassword())
        {
            encoder.newPassword(this.newPassword(), 0, newPasswordLength());
        }

        if (hasRawDataLength())
        {
            encoder.rawDataLength(this.rawDataLength());
        }

        if (hasRawData())
        {
            encoder.rawDataAsCopy(this.rawData(), 0, rawDataLength());
            encoder.rawDataLength(this.rawDataLength());
        }
        return encoder;
    }

}
