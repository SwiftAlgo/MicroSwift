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
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationMessageRequestAckEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDRequestAckGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ApplIDRequestAckGrpEncoder.ApplIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;


public class ApplicationMessageRequestAckDecoder extends CommonDecoderImpl implements ApplIDRequestAckGrpDecoder, PartiesDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.APPL_RESPONSE_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(16);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_RESPONSE_ID);
            GROUP_FIELDS.add(Constants.APPL_REQ_ID);
            GROUP_FIELDS.add(Constants.APPL_REQ_TYPE);
            GROUP_FIELDS.add(Constants.APPL_RESPONSE_TYPE);
            GROUP_FIELDS.add(Constants.APPL_TOTAL_MESSAGE_COUNT);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(16);

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
        if (hasApplReqType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ApplReqType.isValid(applReqType()))
        {
            invalidTagId = 1347;
            rejectReason = 5;
            return false;
        }
        }

        if (hasApplResponseType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ApplResponseType.isValid(applResponseType()))
        {
            invalidTagId = 1348;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoApplIDsGroupCounter)
        {
            {
                int count = 0;
                final ApplIDsGroupIterator iterator = applIDsGroupIterator.iterator();
                for (final ApplIDsGroupDecoder group : iterator)
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
                    invalidTagId = 1351;
                    rejectReason = 16;
                    return false;
                }
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
        return true;
    }

    public static final long MESSAGE_TYPE = 22594L;

    public static final String MESSAGE_TYPE_AS_STRING = "BX";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(122);

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
        messageFields.add(Constants.APPL_RESPONSE_ID);
        messageFields.add(Constants.APPL_REQ_ID);
        messageFields.add(Constants.APPL_REQ_TYPE);
        messageFields.add(Constants.APPL_RESPONSE_TYPE);
        messageFields.add(Constants.APPL_TOTAL_MESSAGE_COUNT);
        messageFields.add(Constants.NO_APPL_IDS_GROUP_COUNTER);
        messageFields.add(Constants.REF_APPL_ID);
        messageFields.add(Constants.REF_APPL_REQ_ID);
        messageFields.add(Constants.APPL_BEG_SEQ_NUM);
        messageFields.add(Constants.APPL_END_SEQ_NUM);
        messageFields.add(Constants.REF_APPL_LAST_SEQ_NUM);
        messageFields.add(Constants.APPL_RESPONSE_ERROR);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
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

    private char[] applResponseID = new char[1];

    public char[] applResponseID()
    {
        return applResponseID;
    }


    private int applResponseIDOffset;

    private int applResponseIDLength;

    public int applResponseIDLength()
    {
        return applResponseIDLength;
    }

    public String applResponseIDAsString()
    {
        return new String(applResponseID, 0, applResponseIDLength);
    }

    public void applResponseID(final AsciiSequenceView view)
    {
        view.wrap(buffer, applResponseIDOffset, applResponseIDLength);
    }


    private final CharArrayWrapper applResponseIDWrapper = new CharArrayWrapper();
    private char[] applReqID = new char[1];

    private boolean hasApplReqID;

    public char[] applReqID()
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        return applReqID;
    }

    public boolean hasApplReqID()
    {
        return hasApplReqID;
    }


    private int applReqIDOffset;

    private int applReqIDLength;

    public int applReqIDLength()
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        return applReqIDLength;
    }

    public String applReqIDAsString()
    {
        return hasApplReqID ? new String(applReqID, 0, applReqIDLength) : null;
    }

    public void applReqID(final AsciiSequenceView view)
    {
        if (!hasApplReqID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqID");
        }

        view.wrap(buffer, applReqIDOffset, applReqIDLength);
    }


    private final CharArrayWrapper applReqIDWrapper = new CharArrayWrapper();
    private int applReqType = MISSING_INT;

    private boolean hasApplReqType;

    public int applReqType()
    {
        if (!hasApplReqType)
        {
            throw new IllegalArgumentException("No value for optional field: ApplReqType");
        }

        return applReqType;
    }

    public boolean hasApplReqType()
    {
        return hasApplReqType;
    }



    private final CharArrayWrapper applReqTypeWrapper = new CharArrayWrapper();
    public ApplReqType applReqTypeAsEnum()
    {
        if (!hasApplReqType)
 return ApplReqType.NULL_VAL;
        return ApplReqType.decode(applReqType);
    }

    private int applResponseType = MISSING_INT;

    private boolean hasApplResponseType;

    public int applResponseType()
    {
        if (!hasApplResponseType)
        {
            throw new IllegalArgumentException("No value for optional field: ApplResponseType");
        }

        return applResponseType;
    }

    public boolean hasApplResponseType()
    {
        return hasApplResponseType;
    }



    private final CharArrayWrapper applResponseTypeWrapper = new CharArrayWrapper();
    public ApplResponseType applResponseTypeAsEnum()
    {
        if (!hasApplResponseType)
 return ApplResponseType.NULL_VAL;
        return ApplResponseType.decode(applResponseType);
    }

    private int applTotalMessageCount = MISSING_INT;

    private boolean hasApplTotalMessageCount;

    public int applTotalMessageCount()
    {
        if (!hasApplTotalMessageCount)
        {
            throw new IllegalArgumentException("No value for optional field: ApplTotalMessageCount");
        }

        return applTotalMessageCount;
    }

    public boolean hasApplTotalMessageCount()
    {
        return hasApplTotalMessageCount;
    }





    private ApplIDsGroupDecoder applIDsGroup = null;
    public ApplIDsGroupDecoder applIDsGroup()
    {
        return applIDsGroup;
    }

    private int noApplIDsGroupCounter = MISSING_INT;

    private boolean hasNoApplIDsGroupCounter;

    public int noApplIDsGroupCounter()
    {
        if (!hasNoApplIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoApplIDsGroupCounter");
        }

        return noApplIDsGroupCounter;
    }

    public boolean hasNoApplIDsGroupCounter()
    {
        return hasNoApplIDsGroupCounter;
    }




    private ApplIDsGroupIterator applIDsGroupIterator = new ApplIDsGroupIterator(this);
    public ApplIDsGroupIterator applIDsGroupIterator()
    {
        return applIDsGroupIterator.iterator();
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode ApplicationMessageRequestAck
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
            case Constants.APPL_RESPONSE_ID:
                applResponseID = buffer.getChars(applResponseID, valueOffset, valueLength);
                applResponseIDOffset = valueOffset;
                applResponseIDLength = valueLength;
                break;

            case Constants.APPL_REQ_ID:
                hasApplReqID = true;
                applReqID = buffer.getChars(applReqID, valueOffset, valueLength);
                applReqIDOffset = valueOffset;
                applReqIDLength = valueLength;
                break;

            case Constants.APPL_REQ_TYPE:
                hasApplReqType = true;
                applReqType = getInt(buffer, valueOffset, endOfField, 1347, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_RESPONSE_TYPE:
                hasApplResponseType = true;
                applResponseType = getInt(buffer, valueOffset, endOfField, 1348, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_TOTAL_MESSAGE_COUNT:
                hasApplTotalMessageCount = true;
                applTotalMessageCount = getInt(buffer, valueOffset, endOfField, 1349, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_APPL_IDS_GROUP_COUNTER:
                hasNoApplIDsGroupCounter = true;
                noApplIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 1351, CODEC_VALIDATION_ENABLED);
                if (applIDsGroup == null)
                {
                    applIDsGroup = new ApplIDsGroupDecoder(trailer, messageFields);
                }
                ApplIDsGroupDecoder applIDsGroupCurrent = applIDsGroup;
                position = endOfField + 1;
                final int noApplIDsGroupCounter = this.noApplIDsGroupCounter;
                for (int i = 0; i < noApplIDsGroupCounter && position < end; i++)
                {
                    if (applIDsGroupCurrent != null)
                    {
                        position += applIDsGroupCurrent.decode(buffer, position, end - position);
                        applIDsGroupCurrent = applIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (applIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_PARTY_IDS_GROUP_COUNTER:
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
        this.resetApplResponseID();
        this.resetApplReqID();
        this.resetApplReqType();
        this.resetApplResponseType();
        this.resetApplTotalMessageCount();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetApplIDsGroup();
        this.resetPartyIDsGroup();
    }

    public void resetApplResponseID()
    {
        applResponseIDOffset = 0;
        applResponseIDLength = 0;
    }

    public void resetApplReqID()
    {
        hasApplReqID = false;
    }

    public void resetApplReqType()
    {
        hasApplReqType = false;
    }

    public void resetApplResponseType()
    {
        hasApplResponseType = false;
    }

    public void resetApplTotalMessageCount()
    {
        hasApplTotalMessageCount = false;
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

    public void resetApplIDsGroup()
    {
        for (final ApplIDsGroupDecoder applIDsGroupDecoder : applIDsGroupIterator.iterator())
        {
            applIDsGroupDecoder.reset();
            if (applIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noApplIDsGroupCounter = MISSING_INT;
        hasNoApplIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"ApplicationMessageRequestAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"ApplResponseID\": \"");
        builder.append(this.applResponseID(), 0, applResponseIDLength());
        builder.append("\",\n");

        if (hasApplReqID())
        {
            indent(builder, level);
            builder.append("\"ApplReqID\": \"");
            builder.append(this.applReqID(), 0, applReqIDLength());
            builder.append("\",\n");
        }

        if (hasApplReqType())
        {
            indent(builder, level);
            builder.append("\"ApplReqType\": \"");
            builder.append(applReqType);
            builder.append("\",\n");
        }

        if (hasApplResponseType())
        {
            indent(builder, level);
            builder.append("\"ApplResponseType\": \"");
            builder.append(applResponseType);
            builder.append("\",\n");
        }

        if (hasApplTotalMessageCount())
        {
            indent(builder, level);
            builder.append("\"ApplTotalMessageCount\": \"");
            builder.append(applTotalMessageCount);
            builder.append("\",\n");
        }

        if (hasNoApplIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ApplIDsGroup\": [\n");
            ApplIDsGroupDecoder applIDsGroup = this.applIDsGroup;
            for (int i = 0, size = this.noApplIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                applIDsGroup.appendTo(builder, level + 1);
                if (applIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                applIDsGroup = applIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoPartyIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PartyIDsGroup\": [\n");
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                partyIDsGroup.appendTo(builder, level + 1);
                if (partyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                partyIDsGroup = partyIDsGroup.next();            }
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ApplicationMessageRequestAckEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((ApplicationMessageRequestAckEncoder)encoder);
    }

    public ApplicationMessageRequestAckEncoder toEncoder(final ApplicationMessageRequestAckEncoder encoder)
    {
        encoder.reset();
        encoder.applResponseID(this.applResponseID(), 0, applResponseIDLength());
        if (hasApplReqID())
        {
            encoder.applReqID(this.applReqID(), 0, applReqIDLength());
        }

        if (hasApplReqType())
        {
            encoder.applReqType(this.applReqType());
        }

        if (hasApplResponseType())
        {
            encoder.applResponseType(this.applResponseType());
        }

        if (hasApplTotalMessageCount())
        {
            encoder.applTotalMessageCount(this.applTotalMessageCount());
        }


        final ApplIDRequestAckGrpEncoder applIDRequestAckGrp = encoder.applIDRequestAckGrp();        if (hasNoApplIDsGroupCounter)
        {
            final int size = this.noApplIDsGroupCounter;
            ApplIDsGroupDecoder applIDsGroup = this.applIDsGroup;
            ApplIDsGroupEncoder applIDsGroupEncoder = applIDRequestAckGrp.applIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (applIDsGroup != null)
                {
                    applIDsGroup.toEncoder(applIDsGroupEncoder);
                    applIDsGroup = applIDsGroup.next();
                    applIDsGroupEncoder = applIDsGroupEncoder.next();
                }
            }
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
