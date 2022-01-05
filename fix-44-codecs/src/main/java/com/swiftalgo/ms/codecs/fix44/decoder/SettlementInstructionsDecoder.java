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
import com.swiftalgo.ms.codecs.fix44.builder.SettlementInstructionsEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.SettlementInstructionsEncoder.SettlInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.SettlInstructionsDataEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.SettlInstructionsDataEncoder.DlvyInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder.SettlPartySubIDsGroupEncoder;


public class SettlementInstructionsDecoder extends CommonDecoderImpl implements MessageDecoder
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

    public final IntHashSet messageFields = new IntHashSet(158);

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
        messageFields.add(Constants.SETTL_INST_MSG_ID);
        messageFields.add(Constants.SETTL_INST_REQ_ID);
        messageFields.add(Constants.SETTL_INST_MODE);
        messageFields.add(Constants.SETTL_INST_REQ_REJ_CODE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.NO_SETTL_INST);
        messageFields.add(Constants.SETTL_INST_ID);
        messageFields.add(Constants.SETTL_INST_TRANS_TYPE);
        messageFields.add(Constants.SETTL_INST_REF_ID);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.EFFECTIVE_TIME);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.LAST_UPDATE_TIME);
        messageFields.add(Constants.SETTL_DELIVERY_TYPE);
        messageFields.add(Constants.STAND_INST_DB_TYPE);
        messageFields.add(Constants.STAND_INST_DB_NAME);
        messageFields.add(Constants.STAND_INST_DB_ID);
        messageFields.add(Constants.NO_DLVY_INST);
        messageFields.add(Constants.SETTL_INST_SOURCE);
        messageFields.add(Constants.DLVY_INST_TYPE);
        messageFields.add(Constants.NO_SETTL_PARTY_IDS);
        messageFields.add(Constants.SETTL_PARTY_ID);
        messageFields.add(Constants.SETTL_PARTY_ID_SOURCE);
        messageFields.add(Constants.SETTL_PARTY_ROLE);
        messageFields.add(Constants.NO_SETTL_PARTY_SUB_IDS);
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




public class SettlInstGroupDecoder extends CommonDecoderImpl implements PartiesDecoder, SettlInstructionsDataDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(46);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SETTL_INST_ID);
            GROUP_FIELDS.add(Constants.SETTL_INST_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.SETTL_INST_REF_ID);
            GROUP_FIELDS.add(Constants.SIDE);
            GROUP_FIELDS.add(Constants.PRODUCT);
            GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.C_F_I_CODE);
            GROUP_FIELDS.add(Constants.EFFECTIVE_TIME);
            GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            GROUP_FIELDS.add(Constants.LAST_UPDATE_TIME);
            GROUP_FIELDS.add(Constants.SETTL_DELIVERY_TYPE);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_TYPE);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_NAME);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_ID);
            GROUP_FIELDS.add(Constants.PAYMENT_METHOD);
            GROUP_FIELDS.add(Constants.PAYMENT_REF);
            GROUP_FIELDS.add(Constants.CARD_HOLDER_NAME);
            GROUP_FIELDS.add(Constants.CARD_NUMBER);
            GROUP_FIELDS.add(Constants.CARD_START_DATE);
            GROUP_FIELDS.add(Constants.CARD_EXP_DATE);
            GROUP_FIELDS.add(Constants.CARD_ISS_NUM);
            GROUP_FIELDS.add(Constants.PAYMENT_DATE);
            GROUP_FIELDS.add(Constants.PAYMENT_REMITTER_ID);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(38);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.SETTL_INST_ID);
            ALL_GROUP_FIELDS.add(Constants.SETTL_INST_TRANS_TYPE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_INST_REF_ID);
            ALL_GROUP_FIELDS.add(Constants.SIDE);
            ALL_GROUP_FIELDS.add(Constants.PRODUCT);
            ALL_GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            ALL_GROUP_FIELDS.add(Constants.C_F_I_CODE);
            ALL_GROUP_FIELDS.add(Constants.EFFECTIVE_TIME);
            ALL_GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            ALL_GROUP_FIELDS.add(Constants.LAST_UPDATE_TIME);
            ALL_GROUP_FIELDS.add(Constants.PAYMENT_METHOD);
            ALL_GROUP_FIELDS.add(Constants.PAYMENT_REF);
            ALL_GROUP_FIELDS.add(Constants.CARD_HOLDER_NAME);
            ALL_GROUP_FIELDS.add(Constants.CARD_NUMBER);
            ALL_GROUP_FIELDS.add(Constants.CARD_START_DATE);
            ALL_GROUP_FIELDS.add(Constants.CARD_EXP_DATE);
            ALL_GROUP_FIELDS.add(Constants.CARD_ISS_NUM);
            ALL_GROUP_FIELDS.add(Constants.PAYMENT_DATE);
            ALL_GROUP_FIELDS.add(Constants.PAYMENT_REMITTER_ID);
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
        if (hasSettlInstTransType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlInstTransType.isValid(settlInstTransType()))
        {
            invalidTagId = 163;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSide)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProduct)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Product.isValid(product()))
        {
            invalidTagId = 460;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityType)
        {
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityType.isValid(securityTypeWrapper))
        {
            invalidTagId = 167;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlDeliveryType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlDeliveryType.isValid(settlDeliveryType()))
        {
            invalidTagId = 172;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStandInstDbType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StandInstDbType.isValid(standInstDbType()))
        {
            invalidTagId = 169;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPaymentMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PaymentMethod.isValid(paymentMethod()))
        {
            invalidTagId = 492;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final PartyIDsGroupIterator iterator = partyIDsGroupIterator.iterator();
                for (final PartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 453;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoDlvyInstGroupCounter)
        {
            {
                int count = 0;
                final DlvyInstGroupIterator iterator = dlvyInstGroupIterator.iterator();
                for (final DlvyInstGroupDecoder group : iterator)
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
                    invalidTagId = 85;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public SettlInstGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SettlInstGroupDecoder next = null;

    public SettlInstGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(42);

    private char[] settlInstID = new char[1];

    private boolean hasSettlInstID;

    public char[] settlInstID()
    {
        if (!hasSettlInstID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstID");
        }

        return settlInstID;
    }

    public boolean hasSettlInstID()
    {
        return hasSettlInstID;
    }


    private int settlInstIDOffset;

    private int settlInstIDLength;

    public int settlInstIDLength()
    {
        if (!hasSettlInstID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstID");
        }

        return settlInstIDLength;
    }

    public String settlInstIDAsString()
    {
        return hasSettlInstID ? new String(settlInstID, 0, settlInstIDLength) : null;
    }

    public void settlInstID(final AsciiSequenceView view)
    {
        if (!hasSettlInstID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstID");
        }

        view.wrap(buffer, settlInstIDOffset, settlInstIDLength);
    }


    private char settlInstTransType = MISSING_CHAR;

    private boolean hasSettlInstTransType;

    public char settlInstTransType()
    {
        if (!hasSettlInstTransType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstTransType");
        }

        return settlInstTransType;
    }

    public boolean hasSettlInstTransType()
    {
        return hasSettlInstTransType;
    }



    private final CharArrayWrapper settlInstTransTypeWrapper = new CharArrayWrapper();
    public SettlInstTransType settlInstTransTypeAsEnum()
    {
        if (!hasSettlInstTransType)
 return SettlInstTransType.NULL_VAL;
        return SettlInstTransType.decode(settlInstTransType);
    }

    private char[] settlInstRefID = new char[1];

    private boolean hasSettlInstRefID;

    public char[] settlInstRefID()
    {
        if (!hasSettlInstRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstRefID");
        }

        return settlInstRefID;
    }

    public boolean hasSettlInstRefID()
    {
        return hasSettlInstRefID;
    }


    private int settlInstRefIDOffset;

    private int settlInstRefIDLength;

    public int settlInstRefIDLength()
    {
        if (!hasSettlInstRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstRefID");
        }

        return settlInstRefIDLength;
    }

    public String settlInstRefIDAsString()
    {
        return hasSettlInstRefID ? new String(settlInstRefID, 0, settlInstRefIDLength) : null;
    }

    public void settlInstRefID(final AsciiSequenceView view)
    {
        if (!hasSettlInstRefID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlInstRefID");
        }

        view.wrap(buffer, settlInstRefIDOffset, settlInstRefIDLength);
    }




    private PartyIDsGroupDecoder partyIDsGroup = null;
    public PartyIDsGroupDecoder partyIDsGroup()
    {
        return partyIDsGroup;
    }

    private int noPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoPartyIDsGroupCounter;

    public int noPartyIDsGroupCounter()
    {
        if (!hasNoPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPartyIDsGroupCounter");
        }

        return noPartyIDsGroupCounter;
    }

    public boolean hasNoPartyIDsGroupCounter()
    {
        return hasNoPartyIDsGroupCounter;
    }




    private PartyIDsGroupIterator partyIDsGroupIterator = new PartyIDsGroupIterator(this);
    public PartyIDsGroupIterator partyIDsGroupIterator()
    {
        return partyIDsGroupIterator.iterator();
    }


    private char side = MISSING_CHAR;

    private boolean hasSide;

    public char side()
    {
        if (!hasSide)
        {
            throw new IllegalArgumentException("No value for optional field: Side");
        }

        return side;
    }

    public boolean hasSide()
    {
        return hasSide;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        if (!hasSide)
 return Side.NULL_VAL;
        return Side.decode(side);
    }

    private int product = MISSING_INT;

    private boolean hasProduct;

    public int product()
    {
        if (!hasProduct)
        {
            throw new IllegalArgumentException("No value for optional field: Product");
        }

        return product;
    }

    public boolean hasProduct()
    {
        return hasProduct;
    }



    private final CharArrayWrapper productWrapper = new CharArrayWrapper();
    public Product productAsEnum()
    {
        if (!hasProduct)
 return Product.NULL_VAL;
        return Product.decode(product);
    }

    private char[] securityType = new char[1];

    private boolean hasSecurityType;

    public char[] securityType()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityType;
    }

    public boolean hasSecurityType()
    {
        return hasSecurityType;
    }


    private int securityTypeOffset;

    private int securityTypeLength;

    public int securityTypeLength()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityTypeLength;
    }

    public String securityTypeAsString()
    {
        return hasSecurityType ? new String(securityType, 0, securityTypeLength) : null;
    }

    public void securityType(final AsciiSequenceView view)
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        view.wrap(buffer, securityTypeOffset, securityTypeLength);
    }


    private final CharArrayWrapper securityTypeWrapper = new CharArrayWrapper();
    public SecurityType securityTypeAsEnum()
    {
        if (!hasSecurityType)
 return SecurityType.NULL_VAL;
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        return SecurityType.decode(securityTypeWrapper);
    }

    private char[] cFICode = new char[1];

    private boolean hasCFICode;

    public char[] cFICode()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICode;
    }

    public boolean hasCFICode()
    {
        return hasCFICode;
    }


    private int cFICodeOffset;

    private int cFICodeLength;

    public int cFICodeLength()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICodeLength;
    }

    public String cFICodeAsString()
    {
        return hasCFICode ? new String(cFICode, 0, cFICodeLength) : null;
    }

    public void cFICode(final AsciiSequenceView view)
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        view.wrap(buffer, cFICodeOffset, cFICodeLength);
    }


    private byte[] effectiveTime = new byte[24];

    private boolean hasEffectiveTime;

    public byte[] effectiveTime()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTime;
    }

    public boolean hasEffectiveTime()
    {
        return hasEffectiveTime;
    }


    private int effectiveTimeOffset;

    private int effectiveTimeLength;

    public int effectiveTimeLength()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTimeLength;
    }

    public String effectiveTimeAsString()
    {
        return hasEffectiveTime ? new String(effectiveTime, 0, effectiveTimeLength) : null;
    }

    public void effectiveTime(final AsciiSequenceView view)
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        view.wrap(buffer, effectiveTimeOffset, effectiveTimeLength);
    }


    private byte[] expireTime = new byte[24];

    private boolean hasExpireTime;

    public byte[] expireTime()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTime;
    }

    public boolean hasExpireTime()
    {
        return hasExpireTime;
    }


    private int expireTimeOffset;

    private int expireTimeLength;

    public int expireTimeLength()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTimeLength;
    }

    public String expireTimeAsString()
    {
        return hasExpireTime ? new String(expireTime, 0, expireTimeLength) : null;
    }

    public void expireTime(final AsciiSequenceView view)
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        view.wrap(buffer, expireTimeOffset, expireTimeLength);
    }


    private byte[] lastUpdateTime = new byte[24];

    private boolean hasLastUpdateTime;

    public byte[] lastUpdateTime()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTime;
    }

    public boolean hasLastUpdateTime()
    {
        return hasLastUpdateTime;
    }


    private int lastUpdateTimeOffset;

    private int lastUpdateTimeLength;

    public int lastUpdateTimeLength()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTimeLength;
    }

    public String lastUpdateTimeAsString()
    {
        return hasLastUpdateTime ? new String(lastUpdateTime, 0, lastUpdateTimeLength) : null;
    }

    public void lastUpdateTime(final AsciiSequenceView view)
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        view.wrap(buffer, lastUpdateTimeOffset, lastUpdateTimeLength);
    }



    private int settlDeliveryType = MISSING_INT;

    private boolean hasSettlDeliveryType;

    public int settlDeliveryType()
    {
        if (!hasSettlDeliveryType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDeliveryType");
        }

        return settlDeliveryType;
    }

    public boolean hasSettlDeliveryType()
    {
        return hasSettlDeliveryType;
    }



    private final CharArrayWrapper settlDeliveryTypeWrapper = new CharArrayWrapper();
    public SettlDeliveryType settlDeliveryTypeAsEnum()
    {
        if (!hasSettlDeliveryType)
 return SettlDeliveryType.NULL_VAL;
        return SettlDeliveryType.decode(settlDeliveryType);
    }

    private int standInstDbType = MISSING_INT;

    private boolean hasStandInstDbType;

    public int standInstDbType()
    {
        if (!hasStandInstDbType)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbType");
        }

        return standInstDbType;
    }

    public boolean hasStandInstDbType()
    {
        return hasStandInstDbType;
    }



    private final CharArrayWrapper standInstDbTypeWrapper = new CharArrayWrapper();
    public StandInstDbType standInstDbTypeAsEnum()
    {
        if (!hasStandInstDbType)
 return StandInstDbType.NULL_VAL;
        return StandInstDbType.decode(standInstDbType);
    }

    private char[] standInstDbName = new char[1];

    private boolean hasStandInstDbName;

    public char[] standInstDbName()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbName;
    }

    public boolean hasStandInstDbName()
    {
        return hasStandInstDbName;
    }


    private int standInstDbNameOffset;

    private int standInstDbNameLength;

    public int standInstDbNameLength()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbNameLength;
    }

    public String standInstDbNameAsString()
    {
        return hasStandInstDbName ? new String(standInstDbName, 0, standInstDbNameLength) : null;
    }

    public void standInstDbName(final AsciiSequenceView view)
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        view.wrap(buffer, standInstDbNameOffset, standInstDbNameLength);
    }


    private char[] standInstDbID = new char[1];

    private boolean hasStandInstDbID;

    public char[] standInstDbID()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbID;
    }

    public boolean hasStandInstDbID()
    {
        return hasStandInstDbID;
    }


    private int standInstDbIDOffset;

    private int standInstDbIDLength;

    public int standInstDbIDLength()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbIDLength;
    }

    public String standInstDbIDAsString()
    {
        return hasStandInstDbID ? new String(standInstDbID, 0, standInstDbIDLength) : null;
    }

    public void standInstDbID(final AsciiSequenceView view)
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        view.wrap(buffer, standInstDbIDOffset, standInstDbIDLength);
    }



    private DlvyInstGroupDecoder dlvyInstGroup = null;
    public DlvyInstGroupDecoder dlvyInstGroup()
    {
        return dlvyInstGroup;
    }

    private int noDlvyInstGroupCounter = MISSING_INT;

    private boolean hasNoDlvyInstGroupCounter;

    public int noDlvyInstGroupCounter()
    {
        if (!hasNoDlvyInstGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDlvyInstGroupCounter");
        }

        return noDlvyInstGroupCounter;
    }

    public boolean hasNoDlvyInstGroupCounter()
    {
        return hasNoDlvyInstGroupCounter;
    }




    private DlvyInstGroupIterator dlvyInstGroupIterator = new DlvyInstGroupIterator(this);
    public DlvyInstGroupIterator dlvyInstGroupIterator()
    {
        return dlvyInstGroupIterator.iterator();
    }


    private int paymentMethod = MISSING_INT;

    private boolean hasPaymentMethod;

    public int paymentMethod()
    {
        if (!hasPaymentMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentMethod");
        }

        return paymentMethod;
    }

    public boolean hasPaymentMethod()
    {
        return hasPaymentMethod;
    }



    private final CharArrayWrapper paymentMethodWrapper = new CharArrayWrapper();
    public PaymentMethod paymentMethodAsEnum()
    {
        if (!hasPaymentMethod)
 return PaymentMethod.NULL_VAL;
        return PaymentMethod.decode(paymentMethod);
    }

    private char[] paymentRef = new char[1];

    private boolean hasPaymentRef;

    public char[] paymentRef()
    {
        if (!hasPaymentRef)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRef");
        }

        return paymentRef;
    }

    public boolean hasPaymentRef()
    {
        return hasPaymentRef;
    }


    private int paymentRefOffset;

    private int paymentRefLength;

    public int paymentRefLength()
    {
        if (!hasPaymentRef)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRef");
        }

        return paymentRefLength;
    }

    public String paymentRefAsString()
    {
        return hasPaymentRef ? new String(paymentRef, 0, paymentRefLength) : null;
    }

    public void paymentRef(final AsciiSequenceView view)
    {
        if (!hasPaymentRef)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRef");
        }

        view.wrap(buffer, paymentRefOffset, paymentRefLength);
    }


    private char[] cardHolderName = new char[1];

    private boolean hasCardHolderName;

    public char[] cardHolderName()
    {
        if (!hasCardHolderName)
        {
            throw new IllegalArgumentException("No value for optional field: CardHolderName");
        }

        return cardHolderName;
    }

    public boolean hasCardHolderName()
    {
        return hasCardHolderName;
    }


    private int cardHolderNameOffset;

    private int cardHolderNameLength;

    public int cardHolderNameLength()
    {
        if (!hasCardHolderName)
        {
            throw new IllegalArgumentException("No value for optional field: CardHolderName");
        }

        return cardHolderNameLength;
    }

    public String cardHolderNameAsString()
    {
        return hasCardHolderName ? new String(cardHolderName, 0, cardHolderNameLength) : null;
    }

    public void cardHolderName(final AsciiSequenceView view)
    {
        if (!hasCardHolderName)
        {
            throw new IllegalArgumentException("No value for optional field: CardHolderName");
        }

        view.wrap(buffer, cardHolderNameOffset, cardHolderNameLength);
    }


    private char[] cardNumber = new char[1];

    private boolean hasCardNumber;

    public char[] cardNumber()
    {
        if (!hasCardNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CardNumber");
        }

        return cardNumber;
    }

    public boolean hasCardNumber()
    {
        return hasCardNumber;
    }


    private int cardNumberOffset;

    private int cardNumberLength;

    public int cardNumberLength()
    {
        if (!hasCardNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CardNumber");
        }

        return cardNumberLength;
    }

    public String cardNumberAsString()
    {
        return hasCardNumber ? new String(cardNumber, 0, cardNumberLength) : null;
    }

    public void cardNumber(final AsciiSequenceView view)
    {
        if (!hasCardNumber)
        {
            throw new IllegalArgumentException("No value for optional field: CardNumber");
        }

        view.wrap(buffer, cardNumberOffset, cardNumberLength);
    }


    private byte[] cardStartDate = new byte[8];

    private boolean hasCardStartDate;

    public byte[] cardStartDate()
    {
        if (!hasCardStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardStartDate");
        }

        return cardStartDate;
    }

    public boolean hasCardStartDate()
    {
        return hasCardStartDate;
    }


    private int cardStartDateOffset;

    private int cardStartDateLength;

    public int cardStartDateLength()
    {
        if (!hasCardStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardStartDate");
        }

        return cardStartDateLength;
    }

    public String cardStartDateAsString()
    {
        return hasCardStartDate ? new String(cardStartDate, 0, cardStartDateLength) : null;
    }

    public void cardStartDate(final AsciiSequenceView view)
    {
        if (!hasCardStartDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardStartDate");
        }

        view.wrap(buffer, cardStartDateOffset, cardStartDateLength);
    }


    private byte[] cardExpDate = new byte[8];

    private boolean hasCardExpDate;

    public byte[] cardExpDate()
    {
        if (!hasCardExpDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardExpDate");
        }

        return cardExpDate;
    }

    public boolean hasCardExpDate()
    {
        return hasCardExpDate;
    }


    private int cardExpDateOffset;

    private int cardExpDateLength;

    public int cardExpDateLength()
    {
        if (!hasCardExpDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardExpDate");
        }

        return cardExpDateLength;
    }

    public String cardExpDateAsString()
    {
        return hasCardExpDate ? new String(cardExpDate, 0, cardExpDateLength) : null;
    }

    public void cardExpDate(final AsciiSequenceView view)
    {
        if (!hasCardExpDate)
        {
            throw new IllegalArgumentException("No value for optional field: CardExpDate");
        }

        view.wrap(buffer, cardExpDateOffset, cardExpDateLength);
    }


    private char[] cardIssNum = new char[1];

    private boolean hasCardIssNum;

    public char[] cardIssNum()
    {
        if (!hasCardIssNum)
        {
            throw new IllegalArgumentException("No value for optional field: CardIssNum");
        }

        return cardIssNum;
    }

    public boolean hasCardIssNum()
    {
        return hasCardIssNum;
    }


    private int cardIssNumOffset;

    private int cardIssNumLength;

    public int cardIssNumLength()
    {
        if (!hasCardIssNum)
        {
            throw new IllegalArgumentException("No value for optional field: CardIssNum");
        }

        return cardIssNumLength;
    }

    public String cardIssNumAsString()
    {
        return hasCardIssNum ? new String(cardIssNum, 0, cardIssNumLength) : null;
    }

    public void cardIssNum(final AsciiSequenceView view)
    {
        if (!hasCardIssNum)
        {
            throw new IllegalArgumentException("No value for optional field: CardIssNum");
        }

        view.wrap(buffer, cardIssNumOffset, cardIssNumLength);
    }


    private byte[] paymentDate = new byte[8];

    private boolean hasPaymentDate;

    public byte[] paymentDate()
    {
        if (!hasPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentDate");
        }

        return paymentDate;
    }

    public boolean hasPaymentDate()
    {
        return hasPaymentDate;
    }


    private int paymentDateOffset;

    private int paymentDateLength;

    public int paymentDateLength()
    {
        if (!hasPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentDate");
        }

        return paymentDateLength;
    }

    public String paymentDateAsString()
    {
        return hasPaymentDate ? new String(paymentDate, 0, paymentDateLength) : null;
    }

    public void paymentDate(final AsciiSequenceView view)
    {
        if (!hasPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentDate");
        }

        view.wrap(buffer, paymentDateOffset, paymentDateLength);
    }


    private char[] paymentRemitterID = new char[1];

    private boolean hasPaymentRemitterID;

    public char[] paymentRemitterID()
    {
        if (!hasPaymentRemitterID)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRemitterID");
        }

        return paymentRemitterID;
    }

    public boolean hasPaymentRemitterID()
    {
        return hasPaymentRemitterID;
    }


    private int paymentRemitterIDOffset;

    private int paymentRemitterIDLength;

    public int paymentRemitterIDLength()
    {
        if (!hasPaymentRemitterID)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRemitterID");
        }

        return paymentRemitterIDLength;
    }

    public String paymentRemitterIDAsString()
    {
        return hasPaymentRemitterID ? new String(paymentRemitterID, 0, paymentRemitterIDLength) : null;
    }

    public void paymentRemitterID(final AsciiSequenceView view)
    {
        if (!hasPaymentRemitterID)
        {
            throw new IllegalArgumentException("No value for optional field: PaymentRemitterID");
        }

        view.wrap(buffer, paymentRemitterIDOffset, paymentRemitterIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SettlInstGroup
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
                    next = new SettlInstGroupDecoder(trailer, messageFields);
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
            case Constants.SETTL_INST_ID:
                hasSettlInstID = true;
                settlInstID = buffer.getChars(settlInstID, valueOffset, valueLength);
                settlInstIDOffset = valueOffset;
                settlInstIDLength = valueLength;
                break;

            case Constants.SETTL_INST_TRANS_TYPE:
                hasSettlInstTransType = true;
                settlInstTransType = buffer.getChar(valueOffset);
                break;

            case Constants.SETTL_INST_REF_ID:
                hasSettlInstRefID = true;
                settlInstRefID = buffer.getChars(settlInstRefID, valueOffset, valueLength);
                settlInstRefIDOffset = valueOffset;
                settlInstRefIDLength = valueLength;
                break;

            case Constants.NO_PARTY_IDS:
                hasNoPartyIDsGroupCounter = true;
                noPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 453, CODEC_VALIDATION_ENABLED);
                if (partyIDsGroup == null)
                {
                    partyIDsGroup = new PartyIDsGroupDecoder(trailer, messageFields);
                }
                PartyIDsGroupDecoder partyIDsGroupCurrent = partyIDsGroup;
                position = endOfField + 1;
                final int noPartyIDsGroupCounter = this.noPartyIDsGroupCounter;
                for (int i = 0; i < noPartyIDsGroupCounter && position < end; i++)
                {
                    if (partyIDsGroupCurrent != null)
                    {
                        position += partyIDsGroupCurrent.decode(buffer, position, end - position);
                        partyIDsGroupCurrent = partyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (partyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.SIDE:
                hasSide = true;
                side = buffer.getChar(valueOffset);
                break;

            case Constants.PRODUCT:
                hasProduct = true;
                product = getInt(buffer, valueOffset, endOfField, 460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_TYPE:
                hasSecurityType = true;
                securityType = buffer.getChars(securityType, valueOffset, valueLength);
                securityTypeOffset = valueOffset;
                securityTypeLength = valueLength;
                break;

            case Constants.C_F_I_CODE:
                hasCFICode = true;
                cFICode = buffer.getChars(cFICode, valueOffset, valueLength);
                cFICodeOffset = valueOffset;
                cFICodeLength = valueLength;
                break;

            case Constants.EFFECTIVE_TIME:
                hasEffectiveTime = true;
                effectiveTime = buffer.getBytes(effectiveTime, valueOffset, valueLength);
                effectiveTimeOffset = valueOffset;
                effectiveTimeLength = valueLength;
                break;

            case Constants.EXPIRE_TIME:
                hasExpireTime = true;
                expireTime = buffer.getBytes(expireTime, valueOffset, valueLength);
                expireTimeOffset = valueOffset;
                expireTimeLength = valueLength;
                break;

            case Constants.LAST_UPDATE_TIME:
                hasLastUpdateTime = true;
                lastUpdateTime = buffer.getBytes(lastUpdateTime, valueOffset, valueLength);
                lastUpdateTimeOffset = valueOffset;
                lastUpdateTimeLength = valueLength;
                break;

            case Constants.SETTL_DELIVERY_TYPE:
                hasSettlDeliveryType = true;
                settlDeliveryType = getInt(buffer, valueOffset, endOfField, 172, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STAND_INST_DB_TYPE:
                hasStandInstDbType = true;
                standInstDbType = getInt(buffer, valueOffset, endOfField, 169, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STAND_INST_DB_NAME:
                hasStandInstDbName = true;
                standInstDbName = buffer.getChars(standInstDbName, valueOffset, valueLength);
                standInstDbNameOffset = valueOffset;
                standInstDbNameLength = valueLength;
                break;

            case Constants.STAND_INST_DB_ID:
                hasStandInstDbID = true;
                standInstDbID = buffer.getChars(standInstDbID, valueOffset, valueLength);
                standInstDbIDOffset = valueOffset;
                standInstDbIDLength = valueLength;
                break;

            case Constants.NO_DLVY_INST:
                hasNoDlvyInstGroupCounter = true;
                noDlvyInstGroupCounter = getInt(buffer, valueOffset, endOfField, 85, CODEC_VALIDATION_ENABLED);
                if (dlvyInstGroup == null)
                {
                    dlvyInstGroup = new DlvyInstGroupDecoder(trailer, messageFields);
                }
                DlvyInstGroupDecoder dlvyInstGroupCurrent = dlvyInstGroup;
                position = endOfField + 1;
                final int noDlvyInstGroupCounter = this.noDlvyInstGroupCounter;
                for (int i = 0; i < noDlvyInstGroupCounter && position < end; i++)
                {
                    if (dlvyInstGroupCurrent != null)
                    {
                        position += dlvyInstGroupCurrent.decode(buffer, position, end - position);
                        dlvyInstGroupCurrent = dlvyInstGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (dlvyInstGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PAYMENT_METHOD:
                hasPaymentMethod = true;
                paymentMethod = getInt(buffer, valueOffset, endOfField, 492, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PAYMENT_REF:
                hasPaymentRef = true;
                paymentRef = buffer.getChars(paymentRef, valueOffset, valueLength);
                paymentRefOffset = valueOffset;
                paymentRefLength = valueLength;
                break;

            case Constants.CARD_HOLDER_NAME:
                hasCardHolderName = true;
                cardHolderName = buffer.getChars(cardHolderName, valueOffset, valueLength);
                cardHolderNameOffset = valueOffset;
                cardHolderNameLength = valueLength;
                break;

            case Constants.CARD_NUMBER:
                hasCardNumber = true;
                cardNumber = buffer.getChars(cardNumber, valueOffset, valueLength);
                cardNumberOffset = valueOffset;
                cardNumberLength = valueLength;
                break;

            case Constants.CARD_START_DATE:
                hasCardStartDate = true;
                cardStartDate = buffer.getBytes(cardStartDate, valueOffset, valueLength);
                cardStartDateOffset = valueOffset;
                cardStartDateLength = valueLength;
                break;

            case Constants.CARD_EXP_DATE:
                hasCardExpDate = true;
                cardExpDate = buffer.getBytes(cardExpDate, valueOffset, valueLength);
                cardExpDateOffset = valueOffset;
                cardExpDateLength = valueLength;
                break;

            case Constants.CARD_ISS_NUM:
                hasCardIssNum = true;
                cardIssNum = buffer.getChars(cardIssNum, valueOffset, valueLength);
                cardIssNumOffset = valueOffset;
                cardIssNumLength = valueLength;
                break;

            case Constants.PAYMENT_DATE:
                hasPaymentDate = true;
                paymentDate = buffer.getBytes(paymentDate, valueOffset, valueLength);
                paymentDateOffset = valueOffset;
                paymentDateLength = valueLength;
                break;

            case Constants.PAYMENT_REMITTER_ID:
                hasPaymentRemitterID = true;
                paymentRemitterID = buffer.getChars(paymentRemitterID, valueOffset, valueLength);
                paymentRemitterIDOffset = valueOffset;
                paymentRemitterIDLength = valueLength;
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
        this.resetSettlInstID();
        this.resetSettlInstTransType();
        this.resetSettlInstRefID();
        this.resetSide();
        this.resetProduct();
        this.resetSecurityType();
        this.resetCFICode();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        this.resetPaymentMethod();
        this.resetPaymentRef();
        this.resetCardHolderName();
        this.resetCardNumber();
        this.resetCardStartDate();
        this.resetCardExpDate();
        this.resetCardIssNum();
        this.resetPaymentDate();
        this.resetPaymentRemitterID();
        this.resetPartyIDsGroup();
        this.resetSettlDeliveryType();
        this.resetStandInstDbType();
        this.resetStandInstDbName();
        this.resetStandInstDbID();
        this.resetDlvyInstGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSettlInstID()
    {
        hasSettlInstID = false;
    }

    public void resetSettlInstTransType()
    {
        hasSettlInstTransType = false;
    }

    public void resetSettlInstRefID()
    {
        hasSettlInstRefID = false;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        hasSecurityType = false;
    }

    public void resetCFICode()
    {
        hasCFICode = false;
    }

    public void resetEffectiveTime()
    {
        hasEffectiveTime = false;
    }

    public void resetExpireTime()
    {
        hasExpireTime = false;
    }

    public void resetLastUpdateTime()
    {
        hasLastUpdateTime = false;
    }

    public void resetPaymentMethod()
    {
        hasPaymentMethod = false;
    }

    public void resetPaymentRef()
    {
        hasPaymentRef = false;
    }

    public void resetCardHolderName()
    {
        hasCardHolderName = false;
    }

    public void resetCardNumber()
    {
        hasCardNumber = false;
    }

    public void resetCardStartDate()
    {
        hasCardStartDate = false;
    }

    public void resetCardExpDate()
    {
        hasCardExpDate = false;
    }

    public void resetCardIssNum()
    {
        hasCardIssNum = false;
    }

    public void resetPaymentDate()
    {
        hasPaymentDate = false;
    }

    public void resetPaymentRemitterID()
    {
        hasPaymentRemitterID = false;
    }

    public void resetPartyIDsGroup()
    {
        for (final PartyIDsGroupDecoder partyIDsGroupDecoder : partyIDsGroupIterator.iterator())
        {
            partyIDsGroupDecoder.reset();
            if (partyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPartyIDsGroupCounter = MISSING_INT;
        hasNoPartyIDsGroupCounter = false;
    }

    public void resetSettlDeliveryType()
    {
        hasSettlDeliveryType = false;
    }

    public void resetStandInstDbType()
    {
        hasStandInstDbType = false;
    }

    public void resetStandInstDbName()
    {
        hasStandInstDbName = false;
    }

    public void resetStandInstDbID()
    {
        hasStandInstDbID = false;
    }

    public void resetDlvyInstGroup()
    {
        for (final DlvyInstGroupDecoder dlvyInstGroupDecoder : dlvyInstGroupIterator.iterator())
        {
            dlvyInstGroupDecoder.reset();
            if (dlvyInstGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDlvyInstGroupCounter = MISSING_INT;
        hasNoDlvyInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlInstGroup\",\n");
        if (hasSettlInstID())
        {
            indent(builder, level);
            builder.append("\"SettlInstID\": \"");
            builder.append(this.settlInstID(), 0, settlInstIDLength());
            builder.append("\",\n");
        }

        if (hasSettlInstTransType())
        {
            indent(builder, level);
            builder.append("\"SettlInstTransType\": \"");
            builder.append(settlInstTransType);
            builder.append("\",\n");
        }

        if (hasSettlInstRefID())
        {
            indent(builder, level);
            builder.append("\"SettlInstRefID\": \"");
            builder.append(this.settlInstRefID(), 0, settlInstRefIDLength());
            builder.append("\",\n");
        }

    if (hasNoPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"PartyIDsGroup\": [\n");
        PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
        for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            partyIDsGroup.appendTo(builder, level + 1);            if (partyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            partyIDsGroup = partyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            builder.append(this.securityType(), 0, securityTypeLength());
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            builder.append(this.cFICode(), 0, cFICodeLength());
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendData(builder, effectiveTime, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendData(builder, expireTime, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendData(builder, lastUpdateTime, lastUpdateTimeLength);
            builder.append("\",\n");
        }

        if (hasSettlDeliveryType())
        {
            indent(builder, level);
            builder.append("\"SettlDeliveryType\": \"");
            builder.append(settlDeliveryType);
            builder.append("\",\n");
        }

        if (hasStandInstDbType())
        {
            indent(builder, level);
            builder.append("\"StandInstDbType\": \"");
            builder.append(standInstDbType);
            builder.append("\",\n");
        }

        if (hasStandInstDbName())
        {
            indent(builder, level);
            builder.append("\"StandInstDbName\": \"");
            builder.append(this.standInstDbName(), 0, standInstDbNameLength());
            builder.append("\",\n");
        }

        if (hasStandInstDbID())
        {
            indent(builder, level);
            builder.append("\"StandInstDbID\": \"");
            builder.append(this.standInstDbID(), 0, standInstDbIDLength());
            builder.append("\",\n");
        }

    if (hasNoDlvyInstGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DlvyInstGroup\": [\n");
        DlvyInstGroupDecoder dlvyInstGroup = this.dlvyInstGroup;
        for (int i = 0, size = this.noDlvyInstGroupCounter; i < size; i++)
        {
            indent(builder, level);
            dlvyInstGroup.appendTo(builder, level + 1);            if (dlvyInstGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            dlvyInstGroup = dlvyInstGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasPaymentMethod())
        {
            indent(builder, level);
            builder.append("\"PaymentMethod\": \"");
            builder.append(paymentMethod);
            builder.append("\",\n");
        }

        if (hasPaymentRef())
        {
            indent(builder, level);
            builder.append("\"PaymentRef\": \"");
            builder.append(this.paymentRef(), 0, paymentRefLength());
            builder.append("\",\n");
        }

        if (hasCardHolderName())
        {
            indent(builder, level);
            builder.append("\"CardHolderName\": \"");
            builder.append(this.cardHolderName(), 0, cardHolderNameLength());
            builder.append("\",\n");
        }

        if (hasCardNumber())
        {
            indent(builder, level);
            builder.append("\"CardNumber\": \"");
            builder.append(this.cardNumber(), 0, cardNumberLength());
            builder.append("\",\n");
        }

        if (hasCardStartDate())
        {
            indent(builder, level);
            builder.append("\"CardStartDate\": \"");
            appendData(builder, cardStartDate, cardStartDateLength);
            builder.append("\",\n");
        }

        if (hasCardExpDate())
        {
            indent(builder, level);
            builder.append("\"CardExpDate\": \"");
            appendData(builder, cardExpDate, cardExpDateLength);
            builder.append("\",\n");
        }

        if (hasCardIssNum())
        {
            indent(builder, level);
            builder.append("\"CardIssNum\": \"");
            builder.append(this.cardIssNum(), 0, cardIssNumLength());
            builder.append("\",\n");
        }

        if (hasPaymentDate())
        {
            indent(builder, level);
            builder.append("\"PaymentDate\": \"");
            appendData(builder, paymentDate, paymentDateLength);
            builder.append("\",\n");
        }

        if (hasPaymentRemitterID())
        {
            indent(builder, level);
            builder.append("\"PaymentRemitterID\": \"");
            builder.append(this.paymentRemitterID(), 0, paymentRemitterIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlInstGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlInstGroupEncoder)encoder);
    }

    public SettlInstGroupEncoder toEncoder(final SettlInstGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSettlInstID())
        {
            encoder.settlInstID(this.settlInstID(), 0, settlInstIDLength());
        }

        if (hasSettlInstTransType())
        {
            encoder.settlInstTransType(this.settlInstTransType());
        }

        if (hasSettlInstRefID())
        {
            encoder.settlInstRefID(this.settlInstRefID(), 0, settlInstRefIDLength());
        }


        final PartiesEncoder parties = encoder.parties();        if (hasNoPartyIDsGroupCounter)
        {
            final int size = this.noPartyIDsGroupCounter;
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            PartyIDsGroupEncoder partyIDsGroupEncoder = parties.partyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partyIDsGroup != null)
                {
                    partyIDsGroup.toEncoder(partyIDsGroupEncoder);
                    partyIDsGroup = partyIDsGroup.next();
                    partyIDsGroupEncoder = partyIDsGroupEncoder.next();
                }
            }
        }


        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityType(this.securityType(), 0, securityTypeLength());
        }

        if (hasCFICode())
        {
            encoder.cFICode(this.cFICode(), 0, cFICodeLength());
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(this.effectiveTime(), 0, effectiveTimeLength());
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(this.expireTime(), 0, expireTimeLength());
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(this.lastUpdateTime(), 0, lastUpdateTimeLength());
        }


        final SettlInstructionsDataEncoder settlInstructionsData = encoder.settlInstructionsData();        if (hasSettlDeliveryType())
        {
            settlInstructionsData.settlDeliveryType(this.settlDeliveryType());
        }

        if (hasStandInstDbType())
        {
            settlInstructionsData.standInstDbType(this.standInstDbType());
        }

        if (hasStandInstDbName())
        {
            settlInstructionsData.standInstDbName(this.standInstDbName(), 0, standInstDbNameLength());
        }

        if (hasStandInstDbID())
        {
            settlInstructionsData.standInstDbID(this.standInstDbID(), 0, standInstDbIDLength());
        }

        if (hasNoDlvyInstGroupCounter)
        {
            final int size = this.noDlvyInstGroupCounter;
            DlvyInstGroupDecoder dlvyInstGroup = this.dlvyInstGroup;
            DlvyInstGroupEncoder dlvyInstGroupEncoder = settlInstructionsData.dlvyInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (dlvyInstGroup != null)
                {
                    dlvyInstGroup.toEncoder(dlvyInstGroupEncoder);
                    dlvyInstGroup = dlvyInstGroup.next();
                    dlvyInstGroupEncoder = dlvyInstGroupEncoder.next();
                }
            }
        }


        if (hasPaymentMethod())
        {
            encoder.paymentMethod(this.paymentMethod());
        }

        if (hasPaymentRef())
        {
            encoder.paymentRef(this.paymentRef(), 0, paymentRefLength());
        }

        if (hasCardHolderName())
        {
            encoder.cardHolderName(this.cardHolderName(), 0, cardHolderNameLength());
        }

        if (hasCardNumber())
        {
            encoder.cardNumber(this.cardNumber(), 0, cardNumberLength());
        }

        if (hasCardStartDate())
        {
            encoder.cardStartDateAsCopy(this.cardStartDate(), 0, cardStartDateLength());
        }

        if (hasCardExpDate())
        {
            encoder.cardExpDateAsCopy(this.cardExpDate(), 0, cardExpDateLength());
        }

        if (hasCardIssNum())
        {
            encoder.cardIssNum(this.cardIssNum(), 0, cardIssNumLength());
        }

        if (hasPaymentDate())
        {
            encoder.paymentDateAsCopy(this.paymentDate(), 0, paymentDateLength());
        }

        if (hasPaymentRemitterID())
        {
            encoder.paymentRemitterID(this.paymentRemitterID(), 0, paymentRemitterIDLength());
        }
        return encoder;
    }

}
    public class SettlInstGroupIterator implements Iterable<SettlInstGroupDecoder>, java.util.Iterator<SettlInstGroupDecoder>
    {
        private final SettlementInstructionsDecoder parent;
        private int remainder;
        private SettlInstGroupDecoder current;

        public SettlInstGroupIterator(final SettlementInstructionsDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public SettlInstGroupDecoder next()
        {
            remainder--;
            final SettlInstGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoSettlInstGroupCounter() ? parent.noSettlInstGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.settlInstGroup();
        }
        public SettlInstGroupIterator iterator()
        {
            reset();
            return this;
        }
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

            case Constants.NO_SETTL_INST:
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
            settlInstGroup.appendTo(builder, level + 1);            if (settlInstGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            settlInstGroup = settlInstGroup.next();        }
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
        if (hasNoSettlInstGroupCounter)
        {
            final int size = this.noSettlInstGroupCounter;
            SettlInstGroupDecoder settlInstGroup = this.settlInstGroup;
            SettlInstGroupEncoder settlInstGroupEncoder = encoder.settlInstGroup(size);
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
