/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import uk.co.real_logic.artio.decoder.AbstractLogonDecoder;
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
import com.swiftalgo.ms.codecs.fix44.builder.LogonEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.LogonEncoder.MsgTypesGroupEncoder;


public class LogonDecoder extends CommonDecoderImpl implements MessageDecoder, AbstractLogonDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.ENCRYPT_METHOD);
            REQUIRED_FIELDS.add(Constants.HEART_BT_INT);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(20);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ENCRYPT_METHOD);
            GROUP_FIELDS.add(Constants.HEART_BT_INT);
            GROUP_FIELDS.add(Constants.RAW_DATA_LENGTH);
            GROUP_FIELDS.add(Constants.RAW_DATA);
            GROUP_FIELDS.add(Constants.RESET_SEQ_NUM_FLAG);
            GROUP_FIELDS.add(Constants.NEXT_EXPECTED_MSG_SEQ_NUM);
            GROUP_FIELDS.add(Constants.MAX_MESSAGE_SIZE);
            GROUP_FIELDS.add(Constants.TEST_MESSAGE_INDICATOR);
            GROUP_FIELDS.add(Constants.USERNAME);
            GROUP_FIELDS.add(Constants.PASSWORD);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(20);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !EncryptMethod.isValid(encryptMethod()))
        {
            invalidTagId = 98;
            rejectReason = 5;
            return false;
        }
        if (hasNoMsgTypesGroupCounter)
        {
            {
                int count = 0;
                final MsgTypesGroupIterator iterator = msgTypesGroupIterator.iterator();
                for (final MsgTypesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 384;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 65L;

    public static final String MESSAGE_TYPE_AS_STRING = "A";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(84);

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
        messageFields.add(Constants.ENCRYPT_METHOD);
        messageFields.add(Constants.HEART_BT_INT);
        messageFields.add(Constants.RAW_DATA_LENGTH);
        messageFields.add(Constants.RAW_DATA);
        messageFields.add(Constants.RESET_SEQ_NUM_FLAG);
        messageFields.add(Constants.NEXT_EXPECTED_MSG_SEQ_NUM);
        messageFields.add(Constants.MAX_MESSAGE_SIZE);
        messageFields.add(Constants.NO_MSG_TYPES_GROUP_COUNTER);
        messageFields.add(Constants.REF_MSG_TYPE);
        messageFields.add(Constants.MSG_DIRECTION);
        messageFields.add(Constants.TEST_MESSAGE_INDICATOR);
        messageFields.add(Constants.USERNAME);
        messageFields.add(Constants.PASSWORD);
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

    private int encryptMethod = MISSING_INT;

    public int encryptMethod()
    {
        return encryptMethod;
    }



    private final CharArrayWrapper encryptMethodWrapper = new CharArrayWrapper();
    public EncryptMethod encryptMethodAsEnum()
    {
        return EncryptMethod.decode(encryptMethod);
    }

    private int heartBtInt = MISSING_INT;

    public int heartBtInt()
    {
        return heartBtInt;
    }



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



    private boolean resetSeqNumFlag;

    private boolean hasResetSeqNumFlag;

    public boolean resetSeqNumFlag()
    {
        if (!hasResetSeqNumFlag)
        {
            throw new IllegalArgumentException("No value for optional field: ResetSeqNumFlag");
        }

        return resetSeqNumFlag;
    }

    public boolean hasResetSeqNumFlag()
    {
        return hasResetSeqNumFlag;
    }



    private int nextExpectedMsgSeqNum = MISSING_INT;

    private boolean hasNextExpectedMsgSeqNum;

    public int nextExpectedMsgSeqNum()
    {
        if (!hasNextExpectedMsgSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: NextExpectedMsgSeqNum");
        }

        return nextExpectedMsgSeqNum;
    }

    public boolean hasNextExpectedMsgSeqNum()
    {
        return hasNextExpectedMsgSeqNum;
    }



    private int maxMessageSize = MISSING_INT;

    private boolean hasMaxMessageSize;

    public int maxMessageSize()
    {
        if (!hasMaxMessageSize)
        {
            throw new IllegalArgumentException("No value for optional field: MaxMessageSize");
        }

        return maxMessageSize;
    }

    public boolean hasMaxMessageSize()
    {
        return hasMaxMessageSize;
    }





public class MsgTypesGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REF_MSG_TYPE);
            ALL_GROUP_FIELDS.add(Constants.MSG_DIRECTION);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasMsgDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MsgDirection.isValid(msgDirection()))
        {
            invalidTagId = 385;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MsgTypesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MsgTypesGroupDecoder next = null;

    public MsgTypesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] refMsgType = new char[1];

    private boolean hasRefMsgType;

    public char[] refMsgType()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgType;
    }

    public boolean hasRefMsgType()
    {
        return hasRefMsgType;
    }


    private int refMsgTypeOffset;

    private int refMsgTypeLength;

    public int refMsgTypeLength()
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        return refMsgTypeLength;
    }

    public String refMsgTypeAsString()
    {
        return hasRefMsgType ? new String(refMsgType, 0, refMsgTypeLength) : null;
    }

    public void refMsgType(final AsciiSequenceView view)
    {
        if (!hasRefMsgType)
        {
            throw new IllegalArgumentException("No value for optional field: RefMsgType");
        }

        view.wrap(buffer, refMsgTypeOffset, refMsgTypeLength);
    }


    private final CharArrayWrapper refMsgTypeWrapper = new CharArrayWrapper();
    private char msgDirection = MISSING_CHAR;

    private boolean hasMsgDirection;

    public char msgDirection()
    {
        if (!hasMsgDirection)
        {
            throw new IllegalArgumentException("No value for optional field: MsgDirection");
        }

        return msgDirection;
    }

    public boolean hasMsgDirection()
    {
        return hasMsgDirection;
    }



    private final CharArrayWrapper msgDirectionWrapper = new CharArrayWrapper();
    public MsgDirection msgDirectionAsEnum()
    {
        if (!hasMsgDirection)
 return MsgDirection.NULL_VAL;
        return MsgDirection.decode(msgDirection);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MsgTypesGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new MsgTypesGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
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
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.REF_MSG_TYPE:
                hasRefMsgType = true;
                refMsgType = buffer.getChars(refMsgType, valueOffset, valueLength);
                refMsgTypeOffset = valueOffset;
                refMsgTypeLength = valueLength;
                break;

            case Constants.MSG_DIRECTION:
                hasMsgDirection = true;
                msgDirection = buffer.getChar(valueOffset);
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetRefMsgType();
        this.resetMsgDirection();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefMsgType()
    {
        hasRefMsgType = false;
    }

    public void resetMsgDirection()
    {
        hasMsgDirection = false;
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
        builder.append("\"MessageName\": \"MsgTypesGroup\",\n");
        if (hasRefMsgType())
        {
            indent(builder, level);
            builder.append("\"RefMsgType\": \"");
            builder.append(this.refMsgType(), 0, refMsgTypeLength());
            builder.append("\",\n");
        }

        if (hasMsgDirection())
        {
            indent(builder, level);
            builder.append("\"MsgDirection\": \"");
            builder.append(msgDirection);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LogonEncoder.MsgTypesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LogonEncoder.MsgTypesGroupEncoder)encoder);
    }

    public LogonEncoder.MsgTypesGroupEncoder toEncoder(final LogonEncoder.MsgTypesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefMsgType())
        {
            encoder.refMsgType(this.refMsgType(), 0, refMsgTypeLength());
        }

        if (hasMsgDirection())
        {
            encoder.msgDirection(this.msgDirection());
        }
        return encoder;
    }

}
    public class MsgTypesGroupIterator implements Iterable<MsgTypesGroupDecoder>, java.util.Iterator<MsgTypesGroupDecoder>
    {
        private final LogonDecoder parent;
        private int remainder;
        private MsgTypesGroupDecoder current;

        public MsgTypesGroupIterator(final LogonDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MsgTypesGroupDecoder next()
        {
            remainder--;
            final MsgTypesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMsgTypesGroupCounter() ? parent.noMsgTypesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.msgTypesGroup();
        }

        public MsgTypesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }


    private MsgTypesGroupDecoder msgTypesGroup = null;
    public MsgTypesGroupDecoder msgTypesGroup()
    {
        return msgTypesGroup;
    }

    private int noMsgTypesGroupCounter = MISSING_INT;

    private boolean hasNoMsgTypesGroupCounter;

    public int noMsgTypesGroupCounter()
    {
        if (!hasNoMsgTypesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMsgTypesGroupCounter");
        }

        return noMsgTypesGroupCounter;
    }

    public boolean hasNoMsgTypesGroupCounter()
    {
        return hasNoMsgTypesGroupCounter;
    }




    private MsgTypesGroupIterator msgTypesGroupIterator = new MsgTypesGroupIterator(this);
    public MsgTypesGroupIterator msgTypesGroupIterator()
    {
        return msgTypesGroupIterator.iterator();
    }

    private boolean testMessageIndicator;

    private boolean hasTestMessageIndicator;

    public boolean testMessageIndicator()
    {
        if (!hasTestMessageIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: TestMessageIndicator");
        }

        return testMessageIndicator;
    }

    public boolean hasTestMessageIndicator()
    {
        return hasTestMessageIndicator;
    }



    private char[] username = new char[1];

    private boolean hasUsername;

    public char[] username()
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

        return username;
    }

    public boolean hasUsername()
    {
        return hasUsername;
    }


    private int usernameOffset;

    private int usernameLength;

    public int usernameLength()
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

        return usernameLength;
    }

    public String usernameAsString()
    {
        return hasUsername ? new String(username, 0, usernameLength) : null;
    }

    public void username(final AsciiSequenceView view)
    {
        if (!hasUsername)
        {
            throw new IllegalArgumentException("No value for optional field: Username");
        }

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
    public int cancelOnDisconnectType()
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasCancelOnDisconnectType()
    {
        throw new UnsupportedOperationException();
    }

    public int cODTimeoutWindow()
    {
        throw new UnsupportedOperationException();
    }

    public boolean hasCODTimeoutWindow()
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

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode Logon
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
            case Constants.ENCRYPT_METHOD:
                encryptMethod = getInt(buffer, valueOffset, endOfField, 98, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.HEART_BT_INT:
                heartBtInt = getInt(buffer, valueOffset, endOfField, 108, CODEC_VALIDATION_ENABLED);
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

            case Constants.RESET_SEQ_NUM_FLAG:
                hasResetSeqNumFlag = true;
                resetSeqNumFlag = buffer.getBoolean(valueOffset);
                break;

            case Constants.NEXT_EXPECTED_MSG_SEQ_NUM:
                hasNextExpectedMsgSeqNum = true;
                nextExpectedMsgSeqNum = getInt(buffer, valueOffset, endOfField, 789, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MAX_MESSAGE_SIZE:
                hasMaxMessageSize = true;
                maxMessageSize = getInt(buffer, valueOffset, endOfField, 383, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_MSG_TYPES_GROUP_COUNTER:
                hasNoMsgTypesGroupCounter = true;
                noMsgTypesGroupCounter = getInt(buffer, valueOffset, endOfField, 384, CODEC_VALIDATION_ENABLED);
                if (msgTypesGroup == null)
                {
                    msgTypesGroup = new MsgTypesGroupDecoder(trailer, messageFields);
                }
                MsgTypesGroupDecoder msgTypesGroupCurrent = msgTypesGroup;
                position = endOfField + 1;
                final int noMsgTypesGroupCounter = this.noMsgTypesGroupCounter;
                for (int i = 0; i < noMsgTypesGroupCounter && position < end; i++)
                {
                    if (msgTypesGroupCurrent != null)
                    {
                        position += msgTypesGroupCurrent.decode(buffer, position, end - position);
                        msgTypesGroupCurrent = msgTypesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (msgTypesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;

            case Constants.TEST_MESSAGE_INDICATOR:
                hasTestMessageIndicator = true;
                testMessageIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.USERNAME:
                hasUsername = true;
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
        this.resetMsgTypesGroup();
    }

    public void resetEncryptMethod()
    {
        encryptMethod = MISSING_INT;
    }

    public void resetHeartBtInt()
    {
        heartBtInt = MISSING_INT;
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
        hasUsername = false;
    }

    public void resetPassword()
    {
        hasPassword = false;
    }

    public void resetMsgTypesGroup()
    {
        for (final MsgTypesGroupDecoder msgTypesGroupDecoder : msgTypesGroupIterator.iterator())
        {
            msgTypesGroupDecoder.reset();
            if (msgTypesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMsgTypesGroupCounter = MISSING_INT;
        hasNoMsgTypesGroupCounter = false;
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
        indent(builder, level);
        builder.append("\"EncryptMethod\": \"");
        builder.append(encryptMethod);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"HeartBtInt\": \"");
        builder.append(heartBtInt);
        builder.append("\",\n");

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

        if (hasNoMsgTypesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MsgTypesGroup\": [\n");
            MsgTypesGroupDecoder msgTypesGroup = this.msgTypesGroup;
            for (int i = 0, size = this.noMsgTypesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                msgTypesGroup.appendTo(builder, level + 1);
                if (msgTypesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                msgTypesGroup = msgTypesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

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
            builder.append(this.username(), 0, usernameLength());
            builder.append("\",\n");
        }

        if (hasPassword())
        {
            indent(builder, level);
            builder.append("\"Password\": \"");
            builder.append(this.password(), 0, passwordLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LogonEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((LogonEncoder)encoder);
    }

    public LogonEncoder toEncoder(final LogonEncoder encoder)
    {
        encoder.reset();
        encoder.encryptMethod(this.encryptMethod());
        encoder.heartBtInt(this.heartBtInt());
        if (hasRawDataLength())
        {
            encoder.rawDataLength(this.rawDataLength());
        }

        if (hasRawData())
        {
            encoder.rawDataAsCopy(this.rawData(), 0, rawDataLength());
            encoder.rawDataLength(this.rawDataLength());
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

        if (hasNoMsgTypesGroupCounter)
        {
            final int size = this.noMsgTypesGroupCounter;
            MsgTypesGroupDecoder msgTypesGroup = this.msgTypesGroup;
            MsgTypesGroupEncoder msgTypesGroupEncoder = encoder.msgTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (msgTypesGroup != null)
                {
                    msgTypesGroup.toEncoder(msgTypesGroupEncoder);
                    msgTypesGroup = msgTypesGroup.next();
                    msgTypesGroupEncoder = msgTypesGroupEncoder.next();
                }
            }
        }

        if (hasTestMessageIndicator())
        {
            encoder.testMessageIndicator(this.testMessageIndicator());
        }

        if (hasUsername())
        {
            encoder.username(this.username(), 0, usernameLength());
        }

        if (hasPassword())
        {
            encoder.password(this.password(), 0, passwordLength());
        }
        return encoder;
    }

}
