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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityTypesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecTypesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecTypesGrpEncoder.SecurityTypesGroupEncoder;


public class SecurityTypesDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, SecTypesGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.SECURITY_REQ_ID);
            REQUIRED_FIELDS.add(Constants.SECURITY_RESPONSE_ID);
            REQUIRED_FIELDS.add(Constants.SECURITY_RESPONSE_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(34);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.SECURITY_REQ_ID);
            GROUP_FIELDS.add(Constants.SECURITY_RESPONSE_ID);
            GROUP_FIELDS.add(Constants.SECURITY_RESPONSE_TYPE);
            GROUP_FIELDS.add(Constants.TOT_NO_SECURITY_TYPES);
            GROUP_FIELDS.add(Constants.LAST_FRAGMENT);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.SUBSCRIPTION_REQUEST_TYPE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(34);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityResponseType.isValid(securityResponseType()))
        {
            invalidTagId = 323;
            rejectReason = 5;
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

        if (hasSubscriptionRequestType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SubscriptionRequestType.isValid(subscriptionRequestType()))
        {
            invalidTagId = 263;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoSecurityTypesGroupCounter)
        {
            {
                int count = 0;
                final SecurityTypesGroupIterator iterator = securityTypesGroupIterator.iterator();
                for (final SecurityTypesGroupDecoder group : iterator)
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
                    invalidTagId = 558;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 119L;

    public static final String MESSAGE_TYPE_AS_STRING = "w";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(110);

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
        messageFields.add(Constants.APPL_ID);
        messageFields.add(Constants.APPL_SEQ_NUM);
        messageFields.add(Constants.APPL_LAST_SEQ_NUM);
        messageFields.add(Constants.APPL_RESEND_FLAG);
        messageFields.add(Constants.SECURITY_REQ_ID);
        messageFields.add(Constants.SECURITY_RESPONSE_ID);
        messageFields.add(Constants.SECURITY_RESPONSE_TYPE);
        messageFields.add(Constants.TOT_NO_SECURITY_TYPES);
        messageFields.add(Constants.LAST_FRAGMENT);
        messageFields.add(Constants.NO_SECURITY_TYPES);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.SECURITY_SUB_TYPE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
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


    private char[] applID = new char[1];

    private boolean hasApplID;

    public char[] applID()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applID;
    }

    public boolean hasApplID()
    {
        return hasApplID;
    }


    private int applIDOffset;

    private int applIDLength;

    public int applIDLength()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applIDLength;
    }

    public String applIDAsString()
    {
        return hasApplID ? new String(applID, 0, applIDLength) : null;
    }

    public void applID(final AsciiSequenceView view)
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        view.wrap(buffer, applIDOffset, applIDLength);
    }


    private int applSeqNum = MISSING_INT;

    private boolean hasApplSeqNum;

    public int applSeqNum()
    {
        if (!hasApplSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplSeqNum");
        }

        return applSeqNum;
    }

    public boolean hasApplSeqNum()
    {
        return hasApplSeqNum;
    }



    private int applLastSeqNum = MISSING_INT;

    private boolean hasApplLastSeqNum;

    public int applLastSeqNum()
    {
        if (!hasApplLastSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplLastSeqNum");
        }

        return applLastSeqNum;
    }

    public boolean hasApplLastSeqNum()
    {
        return hasApplLastSeqNum;
    }



    private boolean applResendFlag;

    private boolean hasApplResendFlag;

    public boolean applResendFlag()
    {
        if (!hasApplResendFlag)
        {
            throw new IllegalArgumentException("No value for optional field: ApplResendFlag");
        }

        return applResendFlag;
    }

    public boolean hasApplResendFlag()
    {
        return hasApplResendFlag;
    }




    private char[] securityReqID = new char[1];

    public char[] securityReqID()
    {
        return securityReqID;
    }


    private int securityReqIDOffset;

    private int securityReqIDLength;

    public int securityReqIDLength()
    {
        return securityReqIDLength;
    }

    public String securityReqIDAsString()
    {
        return new String(securityReqID, 0, securityReqIDLength);
    }

    public void securityReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, securityReqIDOffset, securityReqIDLength);
    }


    private char[] securityResponseID = new char[1];

    public char[] securityResponseID()
    {
        return securityResponseID;
    }


    private int securityResponseIDOffset;

    private int securityResponseIDLength;

    public int securityResponseIDLength()
    {
        return securityResponseIDLength;
    }

    public String securityResponseIDAsString()
    {
        return new String(securityResponseID, 0, securityResponseIDLength);
    }

    public void securityResponseID(final AsciiSequenceView view)
    {
        view.wrap(buffer, securityResponseIDOffset, securityResponseIDLength);
    }


    private int securityResponseType = MISSING_INT;

    public int securityResponseType()
    {
        return securityResponseType;
    }



    private final CharArrayWrapper securityResponseTypeWrapper = new CharArrayWrapper();
    public SecurityResponseType securityResponseTypeAsEnum()
    {
        return SecurityResponseType.decode(securityResponseType);
    }

    private int totNoSecurityTypes = MISSING_INT;

    private boolean hasTotNoSecurityTypes;

    public int totNoSecurityTypes()
    {
        if (!hasTotNoSecurityTypes)
        {
            throw new IllegalArgumentException("No value for optional field: TotNoSecurityTypes");
        }

        return totNoSecurityTypes;
    }

    public boolean hasTotNoSecurityTypes()
    {
        return hasTotNoSecurityTypes;
    }



    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean lastFragment()
    {
        if (!hasLastFragment)
        {
            throw new IllegalArgumentException("No value for optional field: LastFragment");
        }

        return lastFragment;
    }

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }





    private SecurityTypesGroupDecoder securityTypesGroup = null;
    public SecurityTypesGroupDecoder securityTypesGroup()
    {
        return securityTypesGroup;
    }

    private int noSecurityTypesGroupCounter = MISSING_INT;

    private boolean hasNoSecurityTypesGroupCounter;

    public int noSecurityTypesGroupCounter()
    {
        if (!hasNoSecurityTypesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSecurityTypesGroupCounter");
        }

        return noSecurityTypesGroupCounter;
    }

    public boolean hasNoSecurityTypesGroupCounter()
    {
        return hasNoSecurityTypesGroupCounter;
    }




    private SecurityTypesGroupIterator securityTypesGroupIterator = new SecurityTypesGroupIterator(this);
    public SecurityTypesGroupIterator securityTypesGroupIterator()
    {
        return securityTypesGroupIterator.iterator();
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

    private char subscriptionRequestType = MISSING_CHAR;

    private boolean hasSubscriptionRequestType;

    public char subscriptionRequestType()
    {
        if (!hasSubscriptionRequestType)
        {
            throw new IllegalArgumentException("No value for optional field: SubscriptionRequestType");
        }

        return subscriptionRequestType;
    }

    public boolean hasSubscriptionRequestType()
    {
        return hasSubscriptionRequestType;
    }



    private final CharArrayWrapper subscriptionRequestTypeWrapper = new CharArrayWrapper();
    public SubscriptionRequestType subscriptionRequestTypeAsEnum()
    {
        if (!hasSubscriptionRequestType)
 return SubscriptionRequestType.NULL_VAL;
        return SubscriptionRequestType.decode(subscriptionRequestType);
    }

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SecurityTypes
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
            case Constants.APPL_ID:
                hasApplID = true;
                applID = buffer.getChars(applID, valueOffset, valueLength);
                applIDOffset = valueOffset;
                applIDLength = valueLength;
                break;

            case Constants.APPL_SEQ_NUM:
                hasApplSeqNum = true;
                applSeqNum = getInt(buffer, valueOffset, endOfField, 1181, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_LAST_SEQ_NUM:
                hasApplLastSeqNum = true;
                applLastSeqNum = getInt(buffer, valueOffset, endOfField, 1350, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_RESEND_FLAG:
                hasApplResendFlag = true;
                applResendFlag = buffer.getBoolean(valueOffset);
                break;


            case Constants.SECURITY_REQ_ID:
                securityReqID = buffer.getChars(securityReqID, valueOffset, valueLength);
                securityReqIDOffset = valueOffset;
                securityReqIDLength = valueLength;
                break;

            case Constants.SECURITY_RESPONSE_ID:
                securityResponseID = buffer.getChars(securityResponseID, valueOffset, valueLength);
                securityResponseIDOffset = valueOffset;
                securityResponseIDLength = valueLength;
                break;

            case Constants.SECURITY_RESPONSE_TYPE:
                securityResponseType = getInt(buffer, valueOffset, endOfField, 323, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TOT_NO_SECURITY_TYPES:
                hasTotNoSecurityTypes = true;
                totNoSecurityTypes = getInt(buffer, valueOffset, endOfField, 557, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_FRAGMENT:
                hasLastFragment = true;
                lastFragment = buffer.getBoolean(valueOffset);
                break;

            case Constants.NO_SECURITY_TYPES:
                hasNoSecurityTypesGroupCounter = true;
                noSecurityTypesGroupCounter = getInt(buffer, valueOffset, endOfField, 558, CODEC_VALIDATION_ENABLED);
                if (securityTypesGroup == null)
                {
                    securityTypesGroup = new SecurityTypesGroupDecoder(trailer, messageFields);
                }
                SecurityTypesGroupDecoder securityTypesGroupCurrent = securityTypesGroup;
                position = endOfField + 1;
                final int noSecurityTypesGroupCounter = this.noSecurityTypesGroupCounter;
                for (int i = 0; i < noSecurityTypesGroupCounter && position < end; i++)
                {
                    if (securityTypesGroupCurrent != null)
                    {
                        position += securityTypesGroupCurrent.decode(buffer, position, end - position);
                        securityTypesGroupCurrent = securityTypesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (securityTypesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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

            case Constants.SUBSCRIPTION_REQUEST_TYPE:
                hasSubscriptionRequestType = true;
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
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityResponseType();
        this.resetTotNoSecurityTypes();
        this.resetLastFragment();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSubscriptionRequestType();
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
        this.resetSecurityTypesGroup();
    }

    public void resetSecurityReqID()
    {
        securityReqIDOffset = 0;
        securityReqIDLength = 0;
    }

    public void resetSecurityResponseID()
    {
        securityResponseIDOffset = 0;
        securityResponseIDLength = 0;
    }

    public void resetSecurityResponseType()
    {
        securityResponseType = MISSING_INT;
    }

    public void resetTotNoSecurityTypes()
    {
        hasTotNoSecurityTypes = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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

    public void resetSubscriptionRequestType()
    {
        hasSubscriptionRequestType = false;
    }

    public void resetApplID()
    {
        hasApplID = false;
    }

    public void resetApplSeqNum()
    {
        hasApplSeqNum = false;
    }

    public void resetApplLastSeqNum()
    {
        hasApplLastSeqNum = false;
    }

    public void resetApplResendFlag()
    {
        hasApplResendFlag = false;
    }

    public void resetSecurityTypesGroup()
    {
        for (final SecurityTypesGroupDecoder securityTypesGroupDecoder : securityTypesGroupIterator.iterator())
        {
            securityTypesGroupDecoder.reset();
            if (securityTypesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSecurityTypesGroupCounter = MISSING_INT;
        hasNoSecurityTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"SecurityTypes\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasApplID())
        {
            indent(builder, level);
            builder.append("\"ApplID\": \"");
            builder.append(this.applID(), 0, applIDLength());
            builder.append("\",\n");
        }

        if (hasApplSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplSeqNum\": \"");
            builder.append(applSeqNum);
            builder.append("\",\n");
        }

        if (hasApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplLastSeqNum\": \"");
            builder.append(applLastSeqNum);
            builder.append("\",\n");
        }

        if (hasApplResendFlag())
        {
            indent(builder, level);
            builder.append("\"ApplResendFlag\": \"");
            builder.append(applResendFlag);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"SecurityReqID\": \"");
        builder.append(this.securityReqID(), 0, securityReqIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"SecurityResponseID\": \"");
        builder.append(this.securityResponseID(), 0, securityResponseIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"SecurityResponseType\": \"");
        builder.append(securityResponseType);
        builder.append("\",\n");

        if (hasTotNoSecurityTypes())
        {
            indent(builder, level);
            builder.append("\"TotNoSecurityTypes\": \"");
            builder.append(totNoSecurityTypes);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

    if (hasNoSecurityTypesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"SecurityTypesGroup\": [\n");
        SecurityTypesGroupDecoder securityTypesGroup = this.securityTypesGroup;
        for (int i = 0, size = this.noSecurityTypesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            securityTypesGroup.appendTo(builder, level + 1);            if (securityTypesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            securityTypesGroup = securityTypesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
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

        if (hasSubscriptionRequestType())
        {
            indent(builder, level);
            builder.append("\"SubscriptionRequestType\": \"");
            builder.append(subscriptionRequestType);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityTypesEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SecurityTypesEncoder)encoder);
    }

    public SecurityTypesEncoder toEncoder(final SecurityTypesEncoder encoder)
    {
        encoder.reset();

        final ApplicationSequenceControlEncoder applicationSequenceControl = encoder.applicationSequenceControl();        if (hasApplID())
        {
            applicationSequenceControl.applID(this.applID(), 0, applIDLength());
        }

        if (hasApplSeqNum())
        {
            applicationSequenceControl.applSeqNum(this.applSeqNum());
        }

        if (hasApplLastSeqNum())
        {
            applicationSequenceControl.applLastSeqNum(this.applLastSeqNum());
        }

        if (hasApplResendFlag())
        {
            applicationSequenceControl.applResendFlag(this.applResendFlag());
        }


        encoder.securityReqID(this.securityReqID(), 0, securityReqIDLength());
        encoder.securityResponseID(this.securityResponseID(), 0, securityResponseIDLength());
        encoder.securityResponseType(this.securityResponseType());
        if (hasTotNoSecurityTypes())
        {
            encoder.totNoSecurityTypes(this.totNoSecurityTypes());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        final SecTypesGrpEncoder secTypesGrp = encoder.secTypesGrp();        if (hasNoSecurityTypesGroupCounter)
        {
            final int size = this.noSecurityTypesGroupCounter;
            SecurityTypesGroupDecoder securityTypesGroup = this.securityTypesGroup;
            SecurityTypesGroupEncoder securityTypesGroupEncoder = secTypesGrp.securityTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (securityTypesGroup != null)
                {
                    securityTypesGroup.toEncoder(securityTypesGroupEncoder);
                    securityTypesGroup = securityTypesGroup.next();
                    securityTypesGroupEncoder = securityTypesGroupEncoder.next();
                }
            }
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

        if (hasSubscriptionRequestType())
        {
            encoder.subscriptionRequestType(this.subscriptionRequestType());
        }
        return encoder;
    }

}
