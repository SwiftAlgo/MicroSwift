/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UserResponseEncoder;


public class UserResponseDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.USER_REQUEST_ID);
            REQUIRED_FIELDS.add(Constants.USERNAME);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(8);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

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
        if (hasUserStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UserStatus.isValid(userStatus()))
        {
            invalidTagId = 926;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17986L;

    public static final String MESSAGE_TYPE_AS_STRING = "BF";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(72);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.APPL_VER_ID);
        messageFields.add(Constants.APPL_EXT_ID);
        messageFields.add(Constants.CSTM_APPL_VER_ID);
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
        messageFields.add(Constants.USERNAME);
        messageFields.add(Constants.USER_STATUS);
        messageFields.add(Constants.USER_STATUS_TEXT);
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
    private int userStatus = MISSING_INT;

    private boolean hasUserStatus;

    public int userStatus()
    {
        if (!hasUserStatus)
        {
            throw new IllegalArgumentException("No value for optional field: UserStatus");
        }

        return userStatus;
    }

    public boolean hasUserStatus()
    {
        return hasUserStatus;
    }



    private final CharArrayWrapper userStatusWrapper = new CharArrayWrapper();
    public UserStatus userStatusAsEnum()
    {
        if (!hasUserStatus)
 return UserStatus.NULL_VAL;
        return UserStatus.decode(userStatus);
    }

    private char[] userStatusText = new char[1];

    private boolean hasUserStatusText;

    public char[] userStatusText()
    {
        if (!hasUserStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: UserStatusText");
        }

        return userStatusText;
    }

    public boolean hasUserStatusText()
    {
        return hasUserStatusText;
    }


    private int userStatusTextOffset;

    private int userStatusTextLength;

    public int userStatusTextLength()
    {
        if (!hasUserStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: UserStatusText");
        }

        return userStatusTextLength;
    }

    public String userStatusTextAsString()
    {
        return hasUserStatusText ? new String(userStatusText, 0, userStatusTextLength) : null;
    }

    public void userStatusText(final AsciiSequenceView view)
    {
        if (!hasUserStatusText)
        {
            throw new IllegalArgumentException("No value for optional field: UserStatusText");
        }

        view.wrap(buffer, userStatusTextOffset, userStatusTextLength);
    }


    private final CharArrayWrapper userStatusTextWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UserResponse
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

            case Constants.USERNAME:
                username = buffer.getChars(username, valueOffset, valueLength);
                usernameOffset = valueOffset;
                usernameLength = valueLength;
                break;

            case Constants.USER_STATUS:
                hasUserStatus = true;
                userStatus = getInt(buffer, valueOffset, endOfField, 926, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.USER_STATUS_TEXT:
                hasUserStatusText = true;
                userStatusText = buffer.getChars(userStatusText, valueOffset, valueLength);
                userStatusTextOffset = valueOffset;
                userStatusTextLength = valueLength;
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
        this.resetUsername();
        this.resetUserStatus();
        this.resetUserStatusText();
    }

    public void resetUserRequestID()
    {
        userRequestIDOffset = 0;
        userRequestIDLength = 0;
    }

    public void resetUsername()
    {
        usernameOffset = 0;
        usernameLength = 0;
    }

    public void resetUserStatus()
    {
        hasUserStatus = false;
    }

    public void resetUserStatusText()
    {
        hasUserStatusText = false;
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
        indent(builder, level);
        builder.append("\"UserRequestID\": \"");
        builder.append(this.userRequestID(), 0, userRequestIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"Username\": \"");
        builder.append(this.username(), 0, usernameLength());
        builder.append("\",\n");

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
            builder.append(this.userStatusText(), 0, userStatusTextLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UserResponseEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UserResponseEncoder)encoder);
    }

    public UserResponseEncoder toEncoder(final UserResponseEncoder encoder)
    {
        encoder.reset();
        encoder.userRequestID(this.userRequestID(), 0, userRequestIDLength());
        encoder.username(this.username(), 0, usernameLength());
        if (hasUserStatus())
        {
            encoder.userStatus(this.userStatus());
        }

        if (hasUserStatusText())
        {
            encoder.userStatusText(this.userStatusText(), 0, userStatusTextLength());
        }
        return encoder;
    }

}
