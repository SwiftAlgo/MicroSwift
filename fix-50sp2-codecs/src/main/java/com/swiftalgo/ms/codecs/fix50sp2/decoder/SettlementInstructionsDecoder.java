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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlementInstructionsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstGrpEncoder.SettlInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstructionsDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder.DlvyInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;


public class SettlementInstructionsDecoder extends CommonDecoderImpl implements SettlInstGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.SETTL_INST_MSG_ID);
            REQUIRED_FIELDS.add(Constants.SETTL_INST_MODE);
            REQUIRED_FIELDS.add(Constants.TRANSACT_TIME);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(18);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SETTL_INST_MSG_ID);
            GROUP_FIELDS.add(Constants.SETTL_INST_REQ_ID);
            GROUP_FIELDS.add(Constants.SETTL_INST_MODE);
            GROUP_FIELDS.add(Constants.SETTL_INST_REQ_REJ_CODE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(18);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlInstMode.isValid(settlInstMode()))
        {
            invalidTagId = 160;
            rejectReason = 5;
            return false;
        }

        if (hasSettlInstReqRejCode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlInstReqRejCode.isValid(settlInstReqRejCode()))
        {
            invalidTagId = 792;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoSettlInstGroupCounter)
        {
            {
                int count = 0;
                final SettlInstGroupIterator iterator = settlInstGroupIterator.iterator();
                for (final SettlInstGroupDecoder group : iterator)
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
                    invalidTagId = 778;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 84L;

    public static final String MESSAGE_TYPE_AS_STRING = "T";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(166);

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
        messageFields.add(Constants.SETTL_INST_MSG_ID);
        messageFields.add(Constants.SETTL_INST_REQ_ID);
        messageFields.add(Constants.SETTL_INST_MODE);
        messageFields.add(Constants.SETTL_INST_REQ_REJ_CODE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.NO_SETTL_INST_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_INST_ID);
        messageFields.add(Constants.SETTL_INST_TRANS_TYPE);
        messageFields.add(Constants.SETTL_INST_REF_ID);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.SETTL_CURRENCY);
        messageFields.add(Constants.EFFECTIVE_TIME);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.LAST_UPDATE_TIME);
        messageFields.add(Constants.SETTL_DELIVERY_TYPE);
        messageFields.add(Constants.STAND_INST_DB_TYPE);
        messageFields.add(Constants.STAND_INST_DB_NAME);
        messageFields.add(Constants.STAND_INST_DB_ID);
        messageFields.add(Constants.NO_DLVY_INST_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_INST_SOURCE);
        messageFields.add(Constants.DLVY_INST_TYPE);
        messageFields.add(Constants.NO_SETTL_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_ID);
        messageFields.add(Constants.SETTL_PARTY_ID_SOURCE);
        messageFields.add(Constants.SETTL_PARTY_ROLE);
        messageFields.add(Constants.NO_SETTL_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID);
        messageFields.add(Constants.SETTL_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.PAYMENT_METHOD);
        messageFields.add(Constants.PAYMENT_REF);
        messageFields.add(Constants.CARD_HOLDER_NAME);
        messageFields.add(Constants.CARD_NUMBER);
        messageFields.add(Constants.CARD_START_DATE);
        messageFields.add(Constants.CARD_EXP_DATE);
        messageFields.add(Constants.CARD_ISS_NUM);
        messageFields.add(Constants.PAYMENT_DATE);
        messageFields.add(Constants.PAYMENT_REMITTER_ID);
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

    private char[] settlInstMsgID = new char[1];

    public char[] settlInstMsgID()
    {
        return settlInstMsgID;
    }


    private int settlInstMsgIDOffset;

    private int settlInstMsgIDLength;

    public int settlInstMsgIDLength()
    {
        return settlInstMsgIDLength;
    }

    public String settlInstMsgIDAsString()
    {
        return new String(settlInstMsgID, 0, settlInstMsgIDLength);
    }

    public void settlInstMsgID(final AsciiSequenceView view)
    {
        view.wrap(buffer, settlInstMsgIDOffset, settlInstMsgIDLength);
    }


    private final CharArrayWrapper settlInstMsgIDWrapper = new CharArrayWrapper();
    private char[] settlInstReqID = new char[1];

    private boolean hasSettlInstReqID;

    public char[] settlInstReqID()
    {
        if (!hasSettlInstReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstReqID");
        }

        return settlInstReqID;
    }

    public boolean hasSettlInstReqID()
    {
        return hasSettlInstReqID;
    }


    private int settlInstReqIDOffset;

    private int settlInstReqIDLength;

    public int settlInstReqIDLength()
    {
        if (!hasSettlInstReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstReqID");
        }

        return settlInstReqIDLength;
    }

    public String settlInstReqIDAsString()
    {
        return hasSettlInstReqID ? new String(settlInstReqID, 0, settlInstReqIDLength) : null;
    }

    public void settlInstReqID(final AsciiSequenceView view)
    {
        if (!hasSettlInstReqID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstReqID");
        }

        view.wrap(buffer, settlInstReqIDOffset, settlInstReqIDLength);
    }


    private final CharArrayWrapper settlInstReqIDWrapper = new CharArrayWrapper();
    private char settlInstMode = MISSING_CHAR;

    public char settlInstMode()
    {
        return settlInstMode;
    }



    private final CharArrayWrapper settlInstModeWrapper = new CharArrayWrapper();
    public SettlInstMode settlInstModeAsEnum()
    {
        return SettlInstMode.decode(settlInstMode);
    }

    private int settlInstReqRejCode = MISSING_INT;

    private boolean hasSettlInstReqRejCode;

    public int settlInstReqRejCode()
    {
        if (!hasSettlInstReqRejCode)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstReqRejCode");
        }

        return settlInstReqRejCode;
    }

    public boolean hasSettlInstReqRejCode()
    {
        return hasSettlInstReqRejCode;
    }



    private final CharArrayWrapper settlInstReqRejCodeWrapper = new CharArrayWrapper();
    public SettlInstReqRejCode settlInstReqRejCodeAsEnum()
    {
        if (!hasSettlInstReqRejCode)
 return SettlInstReqRejCode.NULL_VAL;
        return SettlInstReqRejCode.decode(settlInstReqRejCode);
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


    private final CharArrayWrapper textWrapper = new CharArrayWrapper();
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



    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private final CharArrayWrapper clOrdIDWrapper = new CharArrayWrapper();
    private byte[] transactTime = new byte[24];

    public byte[] transactTime()
    {
        return transactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return new String(transactTime, 0, transactTimeLength);
    }

    public void transactTime(final AsciiSequenceView view)
    {
        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }




    private SettlInstGroupDecoder settlInstGroup = null;
    public SettlInstGroupDecoder settlInstGroup()
    {
        return settlInstGroup;
    }

    private int noSettlInstGroupCounter = MISSING_INT;

    private boolean hasNoSettlInstGroupCounter;

    public int noSettlInstGroupCounter()
    {
        if (!hasNoSettlInstGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSettlInstGroupCounter");
        }

        return noSettlInstGroupCounter;
    }

    public boolean hasNoSettlInstGroupCounter()
    {
        return hasNoSettlInstGroupCounter;
    }




    private SettlInstGroupIterator settlInstGroupIterator = new SettlInstGroupIterator(this);
    public SettlInstGroupIterator settlInstGroupIterator()
    {
        return settlInstGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SettlementInstructions
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
            case Constants.SETTL_INST_MSG_ID:
                settlInstMsgID = buffer.getChars(settlInstMsgID, valueOffset, valueLength);
                settlInstMsgIDOffset = valueOffset;
                settlInstMsgIDLength = valueLength;
                break;

            case Constants.SETTL_INST_REQ_ID:
                hasSettlInstReqID = true;
                settlInstReqID = buffer.getChars(settlInstReqID, valueOffset, valueLength);
                settlInstReqIDOffset = valueOffset;
                settlInstReqIDLength = valueLength;
                break;

            case Constants.SETTL_INST_MODE:
                settlInstMode = buffer.getChar(valueOffset);
                break;

            case Constants.SETTL_INST_REQ_REJ_CODE:
                hasSettlInstReqRejCode = true;
                settlInstReqRejCode = getInt(buffer, valueOffset, endOfField, 792, CODEC_VALIDATION_ENABLED);
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

            case Constants.CL_ORD_ID:
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.NO_SETTL_INST_GROUP_COUNTER:
                hasNoSettlInstGroupCounter = true;
                noSettlInstGroupCounter = getInt(buffer, valueOffset, endOfField, 778, CODEC_VALIDATION_ENABLED);
                if (settlInstGroup == null)
                {
                    settlInstGroup = new SettlInstGroupDecoder(trailer, messageFields);
                }
                SettlInstGroupDecoder settlInstGroupCurrent = settlInstGroup;
                position = endOfField + 1;
                final int noSettlInstGroupCounter = this.noSettlInstGroupCounter;
                for (int i = 0; i < noSettlInstGroupCounter && position < end; i++)
                {
                    if (settlInstGroupCurrent != null)
                    {
                        position += settlInstGroupCurrent.decode(buffer, position, end - position);
                        settlInstGroupCurrent = settlInstGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (settlInstGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetSettlInstMsgID();
        this.resetSettlInstReqID();
        this.resetSettlInstMode();
        this.resetSettlInstReqRejCode();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetClOrdID();
        this.resetTransactTime();
        this.resetSettlInstGroup();
    }

    public void resetSettlInstMsgID()
    {
        settlInstMsgIDOffset = 0;
        settlInstMsgIDLength = 0;
    }

    public void resetSettlInstReqID()
    {
        hasSettlInstReqID = false;
    }

    public void resetSettlInstMode()
    {
        settlInstMode = MISSING_CHAR;
    }

    public void resetSettlInstReqRejCode()
    {
        hasSettlInstReqRejCode = false;
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

    public void resetClOrdID()
    {
        hasClOrdID = false;
    }

    public void resetTransactTime()
    {
    }

    public void resetSettlInstGroup()
    {
        for (final SettlInstGroupDecoder settlInstGroupDecoder : settlInstGroupIterator.iterator())
        {
            settlInstGroupDecoder.reset();
            if (settlInstGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSettlInstGroupCounter = MISSING_INT;
        hasNoSettlInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlementInstructions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"SettlInstMsgID\": \"");
        builder.append(this.settlInstMsgID(), 0, settlInstMsgIDLength());
        builder.append("\",\n");

        if (hasSettlInstReqID())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqID\": \"");
            builder.append(this.settlInstReqID(), 0, settlInstReqIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"SettlInstMode\": \"");
        builder.append(settlInstMode);
        builder.append("\",\n");

        if (hasSettlInstReqRejCode())
        {
            indent(builder, level);
            builder.append("\"SettlInstReqRejCode\": \"");
            builder.append(settlInstReqRejCode);
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

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TransactTime\": \"");
        appendData(builder, transactTime, transactTimeLength);
        builder.append("\",\n");

        if (hasNoSettlInstGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlInstGroup\": [\n");
            SettlInstGroupDecoder settlInstGroup = this.settlInstGroup;
            for (int i = 0, size = this.noSettlInstGroupCounter; i < size; i++)
            {
                indent(builder, level);
                settlInstGroup.appendTo(builder, level + 1);
                if (settlInstGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlInstGroup = settlInstGroup.next();            }
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
    public SettlementInstructionsEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlementInstructionsEncoder)encoder);
    }

    public SettlementInstructionsEncoder toEncoder(final SettlementInstructionsEncoder encoder)
    {
        encoder.reset();
        encoder.settlInstMsgID(this.settlInstMsgID(), 0, settlInstMsgIDLength());
        if (hasSettlInstReqID())
        {
            encoder.settlInstReqID(this.settlInstReqID(), 0, settlInstReqIDLength());
        }

        encoder.settlInstMode(this.settlInstMode());
        if (hasSettlInstReqRejCode())
        {
            encoder.settlInstReqRejCode(this.settlInstReqRejCode());
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

        if (hasClOrdID())
        {
            encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }

        encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());

        final SettlInstGrpEncoder settlInstGrp = encoder.settlInstGrp();        if (hasNoSettlInstGroupCounter)
        {
            final int size = this.noSettlInstGroupCounter;
            SettlInstGroupDecoder settlInstGroup = this.settlInstGroup;
            SettlInstGroupEncoder settlInstGroupEncoder = settlInstGrp.settlInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlInstGroup != null)
                {
                    settlInstGroup.toEncoder(settlInstGroupEncoder);
                    settlInstGroup = settlInstGroup.next();
                    settlInstGroupEncoder = settlInstGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
