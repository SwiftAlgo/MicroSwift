/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

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
import com.swiftalgo.ms.codecs.fix44.builder.TradingSessionStatusEncoder;


public class TradingSessionStatusDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.TRADING_SESSION_ID);
            REQUIRED_FIELDS.add(Constants.TRAD_SES_STATUS);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(34);

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
        if (hasTradSesMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesMethod.isValid(tradSesMethod()))
        {
            invalidTagId = 338;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradSesMode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesMode.isValid(tradSesMode()))
        {
            invalidTagId = 339;
            rejectReason = 5;
            return false;
        }
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesStatus.isValid(tradSesStatus()))
        {
            invalidTagId = 340;
            rejectReason = 5;
            return false;
        }

        if (hasTradSesStatusRejReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesStatusRejReason.isValid(tradSesStatusRejReason()))
        {
            invalidTagId = 567;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 104L;

    public static final String MESSAGE_TYPE_AS_STRING = "h";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(92);

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
        messageFields.add(Constants.TRAD_SES_REQ_ID);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.TRAD_SES_METHOD);
        messageFields.add(Constants.TRAD_SES_MODE);
        messageFields.add(Constants.UNSOLICITED_INDICATOR);
        messageFields.add(Constants.TRAD_SES_STATUS);
        messageFields.add(Constants.TRAD_SES_STATUS_REJ_REASON);
        messageFields.add(Constants.TRAD_SES_START_TIME);
        messageFields.add(Constants.TRAD_SES_OPEN_TIME);
        messageFields.add(Constants.TRAD_SES_PRE_CLOSE_TIME);
        messageFields.add(Constants.TRAD_SES_CLOSE_TIME);
        messageFields.add(Constants.TRAD_SES_END_TIME);
        messageFields.add(Constants.TOTAL_VOLUME_TRADED);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
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

    private char[] tradSesReqID = new char[1];

    private boolean hasTradSesReqID;

    public char[] tradSesReqID()
    {
        if (!hasTradSesReqID)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesReqID");
        }

        return tradSesReqID;
    }

    public boolean hasTradSesReqID()
    {
        return hasTradSesReqID;
    }


    private int tradSesReqIDOffset;

    private int tradSesReqIDLength;

    public int tradSesReqIDLength()
    {
        if (!hasTradSesReqID)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesReqID");
        }

        return tradSesReqIDLength;
    }

    public String tradSesReqIDAsString()
    {
        return hasTradSesReqID ? new String(tradSesReqID, 0, tradSesReqIDLength) : null;
    }

    public void tradSesReqID(final AsciiSequenceView view)
    {
        if (!hasTradSesReqID)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesReqID");
        }

        view.wrap(buffer, tradSesReqIDOffset, tradSesReqIDLength);
    }


    private char[] tradingSessionID = new char[1];

    public char[] tradingSessionID()
    {
        return tradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return new String(tradingSessionID, 0, tradingSessionIDLength);
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private char[] tradingSessionSubID = new char[1];

    private boolean hasTradingSessionSubID;

    public char[] tradingSessionSubID()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubID;
    }

    public boolean hasTradingSessionSubID()
    {
        return hasTradingSessionSubID;
    }


    private int tradingSessionSubIDOffset;

    private int tradingSessionSubIDLength;

    public int tradingSessionSubIDLength()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubIDLength;
    }

    public String tradingSessionSubIDAsString()
    {
        return hasTradingSessionSubID ? new String(tradingSessionSubID, 0, tradingSessionSubIDLength) : null;
    }

    public void tradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        view.wrap(buffer, tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }


    private int tradSesMethod = MISSING_INT;

    private boolean hasTradSesMethod;

    public int tradSesMethod()
    {
        if (!hasTradSesMethod)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesMethod");
        }

        return tradSesMethod;
    }

    public boolean hasTradSesMethod()
    {
        return hasTradSesMethod;
    }



    private final CharArrayWrapper tradSesMethodWrapper = new CharArrayWrapper();
    public TradSesMethod tradSesMethodAsEnum()
    {
        if (!hasTradSesMethod)
 return TradSesMethod.NULL_VAL;
        return TradSesMethod.decode(tradSesMethod);
    }

    private int tradSesMode = MISSING_INT;

    private boolean hasTradSesMode;

    public int tradSesMode()
    {
        if (!hasTradSesMode)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesMode");
        }

        return tradSesMode;
    }

    public boolean hasTradSesMode()
    {
        return hasTradSesMode;
    }



    private final CharArrayWrapper tradSesModeWrapper = new CharArrayWrapper();
    public TradSesMode tradSesModeAsEnum()
    {
        if (!hasTradSesMode)
 return TradSesMode.NULL_VAL;
        return TradSesMode.decode(tradSesMode);
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean unsolicitedIndicator()
    {
        if (!hasUnsolicitedIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: UnsolicitedIndicator");
        }

        return unsolicitedIndicator;
    }

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }



    private int tradSesStatus = MISSING_INT;

    public int tradSesStatus()
    {
        return tradSesStatus;
    }



    private final CharArrayWrapper tradSesStatusWrapper = new CharArrayWrapper();
    public TradSesStatus tradSesStatusAsEnum()
    {
        return TradSesStatus.decode(tradSesStatus);
    }

    private int tradSesStatusRejReason = MISSING_INT;

    private boolean hasTradSesStatusRejReason;

    public int tradSesStatusRejReason()
    {
        if (!hasTradSesStatusRejReason)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStatusRejReason");
        }

        return tradSesStatusRejReason;
    }

    public boolean hasTradSesStatusRejReason()
    {
        return hasTradSesStatusRejReason;
    }



    private final CharArrayWrapper tradSesStatusRejReasonWrapper = new CharArrayWrapper();
    public TradSesStatusRejReason tradSesStatusRejReasonAsEnum()
    {
        if (!hasTradSesStatusRejReason)
 return TradSesStatusRejReason.NULL_VAL;
        return TradSesStatusRejReason.decode(tradSesStatusRejReason);
    }

    private byte[] tradSesStartTime = new byte[24];

    private boolean hasTradSesStartTime;

    public byte[] tradSesStartTime()
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        return tradSesStartTime;
    }

    public boolean hasTradSesStartTime()
    {
        return hasTradSesStartTime;
    }


    private int tradSesStartTimeOffset;

    private int tradSesStartTimeLength;

    public int tradSesStartTimeLength()
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        return tradSesStartTimeLength;
    }

    public String tradSesStartTimeAsString()
    {
        return hasTradSesStartTime ? new String(tradSesStartTime, 0, tradSesStartTimeLength) : null;
    }

    public void tradSesStartTime(final AsciiSequenceView view)
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        view.wrap(buffer, tradSesStartTimeOffset, tradSesStartTimeLength);
    }


    private byte[] tradSesOpenTime = new byte[24];

    private boolean hasTradSesOpenTime;

    public byte[] tradSesOpenTime()
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        return tradSesOpenTime;
    }

    public boolean hasTradSesOpenTime()
    {
        return hasTradSesOpenTime;
    }


    private int tradSesOpenTimeOffset;

    private int tradSesOpenTimeLength;

    public int tradSesOpenTimeLength()
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        return tradSesOpenTimeLength;
    }

    public String tradSesOpenTimeAsString()
    {
        return hasTradSesOpenTime ? new String(tradSesOpenTime, 0, tradSesOpenTimeLength) : null;
    }

    public void tradSesOpenTime(final AsciiSequenceView view)
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        view.wrap(buffer, tradSesOpenTimeOffset, tradSesOpenTimeLength);
    }


    private byte[] tradSesPreCloseTime = new byte[24];

    private boolean hasTradSesPreCloseTime;

    public byte[] tradSesPreCloseTime()
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        return tradSesPreCloseTime;
    }

    public boolean hasTradSesPreCloseTime()
    {
        return hasTradSesPreCloseTime;
    }


    private int tradSesPreCloseTimeOffset;

    private int tradSesPreCloseTimeLength;

    public int tradSesPreCloseTimeLength()
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        return tradSesPreCloseTimeLength;
    }

    public String tradSesPreCloseTimeAsString()
    {
        return hasTradSesPreCloseTime ? new String(tradSesPreCloseTime, 0, tradSesPreCloseTimeLength) : null;
    }

    public void tradSesPreCloseTime(final AsciiSequenceView view)
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        view.wrap(buffer, tradSesPreCloseTimeOffset, tradSesPreCloseTimeLength);
    }


    private byte[] tradSesCloseTime = new byte[24];

    private boolean hasTradSesCloseTime;

    public byte[] tradSesCloseTime()
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        return tradSesCloseTime;
    }

    public boolean hasTradSesCloseTime()
    {
        return hasTradSesCloseTime;
    }


    private int tradSesCloseTimeOffset;

    private int tradSesCloseTimeLength;

    public int tradSesCloseTimeLength()
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        return tradSesCloseTimeLength;
    }

    public String tradSesCloseTimeAsString()
    {
        return hasTradSesCloseTime ? new String(tradSesCloseTime, 0, tradSesCloseTimeLength) : null;
    }

    public void tradSesCloseTime(final AsciiSequenceView view)
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        view.wrap(buffer, tradSesCloseTimeOffset, tradSesCloseTimeLength);
    }


    private byte[] tradSesEndTime = new byte[24];

    private boolean hasTradSesEndTime;

    public byte[] tradSesEndTime()
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        return tradSesEndTime;
    }

    public boolean hasTradSesEndTime()
    {
        return hasTradSesEndTime;
    }


    private int tradSesEndTimeOffset;

    private int tradSesEndTimeLength;

    public int tradSesEndTimeLength()
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        return tradSesEndTimeLength;
    }

    public String tradSesEndTimeAsString()
    {
        return hasTradSesEndTime ? new String(tradSesEndTime, 0, tradSesEndTimeLength) : null;
    }

    public void tradSesEndTime(final AsciiSequenceView view)
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        view.wrap(buffer, tradSesEndTimeOffset, tradSesEndTimeLength);
    }


    private DecimalFloat totalVolumeTraded = DecimalFloat.newNaNValue();

    private boolean hasTotalVolumeTraded;

    public DecimalFloat totalVolumeTraded()
    {
        if (!hasTotalVolumeTraded)
        {
            throw new IllegalArgumentException("No value for optional field: TotalVolumeTraded");
        }

        return totalVolumeTraded;
    }

    public boolean hasTotalVolumeTraded()
    {
        return hasTotalVolumeTraded;
    }



    private char[] text = new char[1];

    private boolean hasText;

    public char[] text()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return text;
    }

    public boolean hasText()
    {
        return hasText;
    }


    private int textOffset;

    private int textLength;

    public int textLength()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return textLength;
    }

    public String textAsString()
    {
        return hasText ? new String(text, 0, textLength) : null;
    }

    public void text(final AsciiSequenceView view)
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        view.wrap(buffer, textOffset, textLength);
    }


    private int encodedTextLen = MISSING_INT;

    private boolean hasEncodedTextLen;

    public int encodedTextLen()
    {
        if (!hasEncodedTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedTextLen");
        }

        return encodedTextLen;
    }

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }



    private byte[] encodedText = new byte[1];

    private boolean hasEncodedText;

    public byte[] encodedText()
    {
        if (!hasEncodedText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedText");
        }

        return encodedText;
    }

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionStatus
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
            case Constants.TRAD_SES_REQ_ID:
                hasTradSesReqID = true;
                tradSesReqID = buffer.getChars(tradSesReqID, valueOffset, valueLength);
                tradSesReqIDOffset = valueOffset;
                tradSesReqIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_ID:
                tradingSessionID = buffer.getChars(tradingSessionID, valueOffset, valueLength);
                tradingSessionIDOffset = valueOffset;
                tradingSessionIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_SUB_ID:
                hasTradingSessionSubID = true;
                tradingSessionSubID = buffer.getChars(tradingSessionSubID, valueOffset, valueLength);
                tradingSessionSubIDOffset = valueOffset;
                tradingSessionSubIDLength = valueLength;
                break;

            case Constants.TRAD_SES_METHOD:
                hasTradSesMethod = true;
                tradSesMethod = getInt(buffer, valueOffset, endOfField, 338, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_MODE:
                hasTradSesMode = true;
                tradSesMode = getInt(buffer, valueOffset, endOfField, 339, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNSOLICITED_INDICATOR:
                hasUnsolicitedIndicator = true;
                unsolicitedIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.TRAD_SES_STATUS:
                tradSesStatus = getInt(buffer, valueOffset, endOfField, 340, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_STATUS_REJ_REASON:
                hasTradSesStatusRejReason = true;
                tradSesStatusRejReason = getInt(buffer, valueOffset, endOfField, 567, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_START_TIME:
                hasTradSesStartTime = true;
                tradSesStartTime = buffer.getBytes(tradSesStartTime, valueOffset, valueLength);
                tradSesStartTimeOffset = valueOffset;
                tradSesStartTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_OPEN_TIME:
                hasTradSesOpenTime = true;
                tradSesOpenTime = buffer.getBytes(tradSesOpenTime, valueOffset, valueLength);
                tradSesOpenTimeOffset = valueOffset;
                tradSesOpenTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_PRE_CLOSE_TIME:
                hasTradSesPreCloseTime = true;
                tradSesPreCloseTime = buffer.getBytes(tradSesPreCloseTime, valueOffset, valueLength);
                tradSesPreCloseTimeOffset = valueOffset;
                tradSesPreCloseTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_CLOSE_TIME:
                hasTradSesCloseTime = true;
                tradSesCloseTime = buffer.getBytes(tradSesCloseTime, valueOffset, valueLength);
                tradSesCloseTimeOffset = valueOffset;
                tradSesCloseTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_END_TIME:
                hasTradSesEndTime = true;
                tradSesEndTime = buffer.getBytes(tradSesEndTime, valueOffset, valueLength);
                tradSesEndTimeOffset = valueOffset;
                tradSesEndTimeLength = valueLength;
                break;

            case Constants.TOTAL_VOLUME_TRADED:
                hasTotalVolumeTraded = true;
                totalVolumeTraded = getFloat(buffer, totalVolumeTraded, valueOffset, valueLength, 387, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TEXT:
                hasText = true;
                text = buffer.getChars(text, valueOffset, valueLength);
                textOffset = valueOffset;
                textLength = valueLength;
                break;

            case Constants.ENCODED_TEXT_LEN:
                hasEncodedTextLen = true;
                encodedTextLen = getInt(buffer, valueOffset, endOfField, 354, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_TEXT:
                hasEncodedText = true;
                encodedText = buffer.getBytes(encodedText, valueOffset, encodedTextLen);
                endOfField = valueOffset + encodedTextLen;
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
        this.resetTradSesReqID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTradSesMethod();
        this.resetTradSesMode();
        this.resetUnsolicitedIndicator();
        this.resetTradSesStatus();
        this.resetTradSesStatusRejReason();
        this.resetTradSesStartTime();
        this.resetTradSesOpenTime();
        this.resetTradSesPreCloseTime();
        this.resetTradSesCloseTime();
        this.resetTradSesEndTime();
        this.resetTotalVolumeTraded();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
    }

    public void resetTradSesReqID()
    {
        hasTradSesReqID = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetTradSesMethod()
    {
        hasTradSesMethod = false;
    }

    public void resetTradSesMode()
    {
        hasTradSesMode = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetTradSesStatus()
    {
        tradSesStatus = MISSING_INT;
    }

    public void resetTradSesStatusRejReason()
    {
        hasTradSesStatusRejReason = false;
    }

    public void resetTradSesStartTime()
    {
        hasTradSesStartTime = false;
    }

    public void resetTradSesOpenTime()
    {
        hasTradSesOpenTime = false;
    }

    public void resetTradSesPreCloseTime()
    {
        hasTradSesPreCloseTime = false;
    }

    public void resetTradSesCloseTime()
    {
        hasTradSesCloseTime = false;
    }

    public void resetTradSesEndTime()
    {
        hasTradSesEndTime = false;
    }

    public void resetTotalVolumeTraded()
    {
        hasTotalVolumeTraded = false;
    }

    public void resetText()
    {
        hasText = false;
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
        builder.append("\"MessageName\": \"TradingSessionStatus\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasTradSesReqID())
        {
            indent(builder, level);
            builder.append("\"TradSesReqID\": \"");
            builder.append(this.tradSesReqID(), 0, tradSesReqIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TradingSessionID\": \"");
        builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
        builder.append("\",\n");

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasTradSesMethod())
        {
            indent(builder, level);
            builder.append("\"TradSesMethod\": \"");
            builder.append(tradSesMethod);
            builder.append("\",\n");
        }

        if (hasTradSesMode())
        {
            indent(builder, level);
            builder.append("\"TradSesMode\": \"");
            builder.append(tradSesMode);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TradSesStatus\": \"");
        builder.append(tradSesStatus);
        builder.append("\",\n");

        if (hasTradSesStatusRejReason())
        {
            indent(builder, level);
            builder.append("\"TradSesStatusRejReason\": \"");
            builder.append(tradSesStatusRejReason);
            builder.append("\",\n");
        }

        if (hasTradSesStartTime())
        {
            indent(builder, level);
            builder.append("\"TradSesStartTime\": \"");
            appendData(builder, tradSesStartTime, tradSesStartTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesOpenTime())
        {
            indent(builder, level);
            builder.append("\"TradSesOpenTime\": \"");
            appendData(builder, tradSesOpenTime, tradSesOpenTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesPreCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesPreCloseTime\": \"");
            appendData(builder, tradSesPreCloseTime, tradSesPreCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesCloseTime\": \"");
            appendData(builder, tradSesCloseTime, tradSesCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesEndTime())
        {
            indent(builder, level);
            builder.append("\"TradSesEndTime\": \"");
            appendData(builder, tradSesEndTime, tradSesEndTimeLength);
            builder.append("\",\n");
        }

        if (hasTotalVolumeTraded())
        {
            indent(builder, level);
            builder.append("\"TotalVolumeTraded\": \"");
            totalVolumeTraded.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            builder.append(this.text(), 0, textLength());
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
    public TradingSessionStatusEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradingSessionStatusEncoder)encoder);
    }

    public TradingSessionStatusEncoder toEncoder(final TradingSessionStatusEncoder encoder)
    {
        encoder.reset();
        if (hasTradSesReqID())
        {
            encoder.tradSesReqID(this.tradSesReqID(), 0, tradSesReqIDLength());
        }

        encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasTradSesMethod())
        {
            encoder.tradSesMethod(this.tradSesMethod());
        }

        if (hasTradSesMode())
        {
            encoder.tradSesMode(this.tradSesMode());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        encoder.tradSesStatus(this.tradSesStatus());
        if (hasTradSesStatusRejReason())
        {
            encoder.tradSesStatusRejReason(this.tradSesStatusRejReason());
        }

        if (hasTradSesStartTime())
        {
            encoder.tradSesStartTimeAsCopy(this.tradSesStartTime(), 0, tradSesStartTimeLength());
        }

        if (hasTradSesOpenTime())
        {
            encoder.tradSesOpenTimeAsCopy(this.tradSesOpenTime(), 0, tradSesOpenTimeLength());
        }

        if (hasTradSesPreCloseTime())
        {
            encoder.tradSesPreCloseTimeAsCopy(this.tradSesPreCloseTime(), 0, tradSesPreCloseTimeLength());
        }

        if (hasTradSesCloseTime())
        {
            encoder.tradSesCloseTimeAsCopy(this.tradSesCloseTime(), 0, tradSesCloseTimeLength());
        }

        if (hasTradSesEndTime())
        {
            encoder.tradSesEndTimeAsCopy(this.tradSesEndTime(), 0, tradSesEndTimeLength());
        }

        if (hasTotalVolumeTraded())
        {
            encoder.totalVolumeTraded(this.totalVolumeTraded());
        }

        if (hasText())
        {
            encoder.text(this.text(), 0, textLength());
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(this.encodedTextLen());
        }
        return encoder;
    }

}
