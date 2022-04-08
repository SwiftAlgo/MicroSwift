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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionListRequestEncoder;


public class TradingSessionListRequestDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.TRAD_SES_REQ_ID);
            REQUIRED_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(18);

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
        if (hasTradingSessionID)
        {
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionSubID)
        {
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionSubID.isValid(tradingSessionSubIDWrapper))
        {
            invalidTagId = 625;
            rejectReason = 5;
            return false;
        }
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

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SubscriptionRequestType.isValid(subscriptionRequestType()))
        {
            invalidTagId = 263;
            rejectReason = 5;
            return false;
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 18754L;

    public static final String MESSAGE_TYPE_AS_STRING = "BI";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(82);

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
        messageFields.add(Constants.TRAD_SES_REQ_ID);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.SECURITY_EXCHANGE);
        messageFields.add(Constants.TRAD_SES_METHOD);
        messageFields.add(Constants.TRAD_SES_MODE);
        messageFields.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
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

    public char[] tradSesReqID()
    {
        return tradSesReqID;
    }


    private int tradSesReqIDOffset;

    private int tradSesReqIDLength;

    public int tradSesReqIDLength()
    {
        return tradSesReqIDLength;
    }

    public String tradSesReqIDAsString()
    {
        return new String(tradSesReqID, 0, tradSesReqIDLength);
    }

    public void tradSesReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, tradSesReqIDOffset, tradSesReqIDLength);
    }


    private final CharArrayWrapper tradSesReqIDWrapper = new CharArrayWrapper();
    private char[] marketID = new char[1];

    private boolean hasMarketID;

    public char[] marketID()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketID;
    }

    public boolean hasMarketID()
    {
        return hasMarketID;
    }


    private int marketIDOffset;

    private int marketIDLength;

    public int marketIDLength()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketIDLength;
    }

    public String marketIDAsString()
    {
        return hasMarketID ? new String(marketID, 0, marketIDLength) : null;
    }

    public void marketID(final AsciiSequenceView view)
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        view.wrap(buffer, marketIDOffset, marketIDLength);
    }


    private char[] marketSegmentID = new char[1];

    private boolean hasMarketSegmentID;

    public char[] marketSegmentID()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentID;
    }

    public boolean hasMarketSegmentID()
    {
        return hasMarketSegmentID;
    }


    private int marketSegmentIDOffset;

    private int marketSegmentIDLength;

    public int marketSegmentIDLength()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentIDLength;
    }

    public String marketSegmentIDAsString()
    {
        return hasMarketSegmentID ? new String(marketSegmentID, 0, marketSegmentIDLength) : null;
    }

    public void marketSegmentID(final AsciiSequenceView view)
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        view.wrap(buffer, marketSegmentIDOffset, marketSegmentIDLength);
    }


    private final CharArrayWrapper marketSegmentIDWrapper = new CharArrayWrapper();
    private char[] tradingSessionID = new char[1];

    private boolean hasTradingSessionID;

    public char[] tradingSessionID()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionID;
    }

    public boolean hasTradingSessionID()
    {
        return hasTradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return hasTradingSessionID ? new String(tradingSessionID, 0, tradingSessionIDLength) : null;
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
        if (!hasTradingSessionID)
 return TradingSessionID.NULL_VAL;
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        return TradingSessionID.decode(tradingSessionIDWrapper);
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


    private final CharArrayWrapper tradingSessionSubIDWrapper = new CharArrayWrapper();
    public TradingSessionSubID tradingSessionSubIDAsEnum()
    {
        if (!hasTradingSessionSubID)
 return TradingSessionSubID.NULL_VAL;
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        return TradingSessionSubID.decode(tradingSessionSubIDWrapper);
    }

    private char[] securityExchange = new char[1];

    private boolean hasSecurityExchange;

    public char[] securityExchange()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchange;
    }

    public boolean hasSecurityExchange()
    {
        return hasSecurityExchange;
    }


    private int securityExchangeOffset;

    private int securityExchangeLength;

    public int securityExchangeLength()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchangeLength;
    }

    public String securityExchangeAsString()
    {
        return hasSecurityExchange ? new String(securityExchange, 0, securityExchangeLength) : null;
    }

    public void securityExchange(final AsciiSequenceView view)
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        view.wrap(buffer, securityExchangeOffset, securityExchangeLength);
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

    private char subscriptionRequestType = MISSING_CHAR;

    public char subscriptionRequestType()
    {
        return subscriptionRequestType;
    }



    private final CharArrayWrapper subscriptionRequestTypeWrapper = new CharArrayWrapper();
    public SubscriptionRequestType subscriptionRequestTypeAsEnum()
    {
        return SubscriptionRequestType.decode(subscriptionRequestType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionListRequest
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
                tradSesReqID = buffer.getChars(tradSesReqID, valueOffset, valueLength);
                tradSesReqIDOffset = valueOffset;
                tradSesReqIDLength = valueLength;
                break;

            case Constants.MARKET_ID:
                hasMarketID = true;
                marketID = buffer.getChars(marketID, valueOffset, valueLength);
                marketIDOffset = valueOffset;
                marketIDLength = valueLength;
                break;

            case Constants.MARKET_SEGMENT_ID:
                hasMarketSegmentID = true;
                marketSegmentID = buffer.getChars(marketSegmentID, valueOffset, valueLength);
                marketSegmentIDOffset = valueOffset;
                marketSegmentIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_ID:
                hasTradingSessionID = true;
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

            case Constants.SECURITY_EXCHANGE:
                hasSecurityExchange = true;
                securityExchange = buffer.getChars(securityExchange, valueOffset, valueLength);
                securityExchangeOffset = valueOffset;
                securityExchangeLength = valueLength;
                break;

            case Constants.TRAD_SES_METHOD:
                hasTradSesMethod = true;
                tradSesMethod = getInt(buffer, valueOffset, endOfField, 338, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_MODE:
                hasTradSesMode = true;
                tradSesMode = getInt(buffer, valueOffset, endOfField, 339, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                subscriptionRequestType = buffer.getChar(valueOffset);
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
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSecurityExchange();
        this.resetTradSesMethod();
        this.resetTradSesMode();
        this.resetSubscriptionRequestType();
    }

    public void resetTradSesReqID()
    {
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = 0;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetSecurityExchange()
    {
        hasSecurityExchange = false;
    }

    public void resetTradSesMethod()
    {
        hasTradSesMethod = false;
    }

    public void resetTradSesMode()
    {
        hasTradSesMode = false;
    }

    public void resetSubscriptionRequestType()
    {
        subscriptionRequestType = MISSING_CHAR;
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
        builder.append("\"MessageName\": \"TradingSessionListRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"TradSesReqID\": \"");
        builder.append(this.tradSesReqID(), 0, tradSesReqIDLength());
        builder.append("\",\n");

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            builder.append(this.marketID(), 0, marketIDLength());
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            builder.append(this.marketSegmentID(), 0, marketSegmentIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"SecurityExchange\": \"");
            builder.append(this.securityExchange(), 0, securityExchangeLength());
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

        indent(builder, level);
        builder.append("\"SubscriptionRequestType\": \"");
        builder.append(subscriptionRequestType);
        builder.append("\",\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionListRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradingSessionListRequestEncoder)encoder);
    }

    public TradingSessionListRequestEncoder toEncoder(final TradingSessionListRequestEncoder encoder)
    {
        encoder.reset();
        encoder.tradSesReqID(this.tradSesReqID(), 0, tradSesReqIDLength());
        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasSecurityExchange())
        {
            encoder.securityExchange(this.securityExchange(), 0, securityExchangeLength());
        }

        if (hasTradSesMethod())
        {
            encoder.tradSesMethod(this.tradSesMethod());
        }

        if (hasTradSesMode())
        {
            encoder.tradSesMode(this.tradSesMode());
        }

        encoder.subscriptionRequestType(this.subscriptionRequestType());        return encoder;
    }

}
