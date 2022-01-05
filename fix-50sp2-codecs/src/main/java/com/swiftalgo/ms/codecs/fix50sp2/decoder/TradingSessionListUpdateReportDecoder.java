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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionListUpdateReportEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdSessLstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdSessLstGrpEncoder.TradingSessionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder.OrdTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder.TimeInForceRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder.ExecInstRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder.MatchRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder.MDFeedTypesGroupEncoder;


public class TradingSessionListUpdateReportDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, TrdSessLstGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.NO_TRADING_SESSIONS);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(10);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.TRAD_SES_REQ_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(10);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(2);

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
        {
            int count = 0;
            final TradingSessionsGroupIterator iterator = tradingSessionsGroupIterator.iterator();
            for (final TradingSessionsGroupDecoder group : iterator)
            {
                count++;                if (!group.validate())
                {
                    invalidTagId = group.invalidTagId();
                    rejectReason = group.rejectReason();
                    return false;
                }
            }
            if (count != iterator.numberFieldValue())
            {
                invalidTagId = 386;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 21314L;

    public static final String MESSAGE_TYPE_AS_STRING = "BS";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(146);

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
        messageFields.add(Constants.TRAD_SES_REQ_ID);
        messageFields.add(Constants.NO_TRADING_SESSIONS);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.TRAD_SES_UPDATE_ACTION);
        messageFields.add(Constants.SECURITY_EXCHANGE);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.TRADING_SESSION_DESC);
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
        messageFields.add(Constants.NO_ORD_TYPE_RULES);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.NO_TIME_IN_FORCE_RULES);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.NO_EXEC_INST_RULES);
        messageFields.add(Constants.EXEC_INST_VALUE);
        messageFields.add(Constants.NO_MATCH_RULES);
        messageFields.add(Constants.MATCH_ALGORITHM);
        messageFields.add(Constants.MATCH_TYPE);
        messageFields.add(Constants.NO_M_D_FEED_TYPES);
        messageFields.add(Constants.M_D_FEED_TYPE);
        messageFields.add(Constants.MARKET_DEPTH);
        messageFields.add(Constants.M_D_BOOK_TYPE);
        messageFields.add(Constants.TRANSACT_TIME);
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




    private TradingSessionsGroupDecoder tradingSessionsGroup = null;
    public TradingSessionsGroupDecoder tradingSessionsGroup()
    {
        return tradingSessionsGroup;
    }

    private int noTradingSessionsGroupCounter = MISSING_INT;

    private boolean hasNoTradingSessionsGroupCounter;

    public int noTradingSessionsGroupCounter()
    {
        if (!hasNoTradingSessionsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTradingSessionsGroupCounter");
        }

        return noTradingSessionsGroupCounter;
    }

    public boolean hasNoTradingSessionsGroupCounter()
    {
        return hasNoTradingSessionsGroupCounter;
    }




    private TradingSessionsGroupIterator tradingSessionsGroupIterator = new TradingSessionsGroupIterator(this);
    public TradingSessionsGroupIterator tradingSessionsGroupIterator()
    {
        return tradingSessionsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionListUpdateReport
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


            case Constants.TRAD_SES_REQ_ID:
                hasTradSesReqID = true;
                tradSesReqID = buffer.getChars(tradSesReqID, valueOffset, valueLength);
                tradSesReqIDOffset = valueOffset;
                tradSesReqIDLength = valueLength;
                break;

            case Constants.NO_TRADING_SESSIONS:
                hasNoTradingSessionsGroupCounter = true;
                noTradingSessionsGroupCounter = getInt(buffer, valueOffset, endOfField, 386, CODEC_VALIDATION_ENABLED);
                if (tradingSessionsGroup == null)
                {
                    tradingSessionsGroup = new TradingSessionsGroupDecoder(trailer, messageFields);
                }
                TradingSessionsGroupDecoder tradingSessionsGroupCurrent = tradingSessionsGroup;
                position = endOfField + 1;
                final int noTradingSessionsGroupCounter = this.noTradingSessionsGroupCounter;
                for (int i = 0; i < noTradingSessionsGroupCounter && position < end; i++)
                {
                    if (tradingSessionsGroupCurrent != null)
                    {
                        position += tradingSessionsGroupCurrent.decode(buffer, position, end - position);
                        tradingSessionsGroupCurrent = tradingSessionsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (tradingSessionsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
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
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
        this.resetTradingSessionsGroup();
    }

    public void resetTradSesReqID()
    {
        hasTradSesReqID = false;
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

    public void resetTradingSessionsGroup()
    {
        for (final TradingSessionsGroupDecoder tradingSessionsGroupDecoder : tradingSessionsGroupIterator.iterator())
        {
            tradingSessionsGroupDecoder.reset();
            if (tradingSessionsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTradingSessionsGroupCounter = MISSING_INT;
        hasNoTradingSessionsGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradingSessionListUpdateReport\",\n");
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

        if (hasTradSesReqID())
        {
            indent(builder, level);
            builder.append("\"TradSesReqID\": \"");
            builder.append(this.tradSesReqID(), 0, tradSesReqIDLength());
            builder.append("\",\n");
        }

    if (hasNoTradingSessionsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"TradingSessionsGroup\": [\n");
        TradingSessionsGroupDecoder tradingSessionsGroup = this.tradingSessionsGroup;
        for (int i = 0, size = this.noTradingSessionsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            tradingSessionsGroup.appendTo(builder, level + 1);            if (tradingSessionsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            tradingSessionsGroup = tradingSessionsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionListUpdateReportEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradingSessionListUpdateReportEncoder)encoder);
    }

    public TradingSessionListUpdateReportEncoder toEncoder(final TradingSessionListUpdateReportEncoder encoder)
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


        if (hasTradSesReqID())
        {
            encoder.tradSesReqID(this.tradSesReqID(), 0, tradSesReqIDLength());
        }


        final TrdSessLstGrpEncoder trdSessLstGrp = encoder.trdSessLstGrp();        if (hasNoTradingSessionsGroupCounter)
        {
            final int size = this.noTradingSessionsGroupCounter;
            TradingSessionsGroupDecoder tradingSessionsGroup = this.tradingSessionsGroup;
            TradingSessionsGroupEncoder tradingSessionsGroupEncoder = trdSessLstGrp.tradingSessionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionsGroup != null)
                {
                    tradingSessionsGroup.toEncoder(tradingSessionsGroupEncoder);
                    tradingSessionsGroup = tradingSessionsGroup.next();
                    tradingSessionsGroupEncoder = tradingSessionsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
