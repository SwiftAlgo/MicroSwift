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
import com.swiftalgo.ms.codecs.fix50sp2.builder.NetworkCounterpartySystemStatusResponseEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CompIDStatGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.CompIDStatGrpEncoder.CompIDsGroupEncoder;


public class NetworkCounterpartySystemStatusResponseDecoder extends CommonDecoderImpl implements CompIDStatGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.NETWORK_STATUS_RESPONSE_TYPE);
            REQUIRED_FIELDS.add(Constants.NETWORK_RESPONSE_ID);
            REQUIRED_FIELDS.add(Constants.NO_COMP_IDS_GROUP_COUNTER);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.NETWORK_STATUS_RESPONSE_TYPE);
            GROUP_FIELDS.add(Constants.NETWORK_REQUEST_ID);
            GROUP_FIELDS.add(Constants.NETWORK_RESPONSE_ID);
            GROUP_FIELDS.add(Constants.LAST_NETWORK_RESPONSE_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(8);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !NetworkStatusResponseType.isValid(networkStatusResponseType()))
        {
            invalidTagId = 937;
            rejectReason = 5;
            return false;
        }
        {
            int count = 0;
            final CompIDsGroupIterator iterator = compIDsGroupIterator.iterator();
            for (final CompIDsGroupDecoder group : iterator)
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
                invalidTagId = 936;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17474L;

    public static final String MESSAGE_TYPE_AS_STRING = "BD";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(86);

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
        messageFields.add(Constants.NETWORK_STATUS_RESPONSE_TYPE);
        messageFields.add(Constants.NETWORK_REQUEST_ID);
        messageFields.add(Constants.NETWORK_RESPONSE_ID);
        messageFields.add(Constants.LAST_NETWORK_RESPONSE_ID);
        messageFields.add(Constants.NO_COMP_IDS_GROUP_COUNTER);
        messageFields.add(Constants.REF_COMP_ID);
        messageFields.add(Constants.REF_SUB_ID);
        messageFields.add(Constants.LOCATION_ID);
        messageFields.add(Constants.DESK_ID);
        messageFields.add(Constants.STATUS_VALUE);
        messageFields.add(Constants.STATUS_TEXT);
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

    private int networkStatusResponseType = MISSING_INT;

    public int networkStatusResponseType()
    {
        return networkStatusResponseType;
    }



    private final CharArrayWrapper networkStatusResponseTypeWrapper = new CharArrayWrapper();
    public NetworkStatusResponseType networkStatusResponseTypeAsEnum()
    {
        return NetworkStatusResponseType.decode(networkStatusResponseType);
    }

    private char[] networkRequestID = new char[1];

    private boolean hasNetworkRequestID;

    public char[] networkRequestID()
    {
        if (!hasNetworkRequestID)
        {
            throw new IllegalArgumentException("No value for optional field: NetworkRequestID");
        }

        return networkRequestID;
    }

    public boolean hasNetworkRequestID()
    {
        return hasNetworkRequestID;
    }


    private int networkRequestIDOffset;

    private int networkRequestIDLength;

    public int networkRequestIDLength()
    {
        if (!hasNetworkRequestID)
        {
            throw new IllegalArgumentException("No value for optional field: NetworkRequestID");
        }

        return networkRequestIDLength;
    }

    public String networkRequestIDAsString()
    {
        return hasNetworkRequestID ? new String(networkRequestID, 0, networkRequestIDLength) : null;
    }

    public void networkRequestID(final AsciiSequenceView view)
    {
        if (!hasNetworkRequestID)
        {
            throw new IllegalArgumentException("No value for optional field: NetworkRequestID");
        }

        view.wrap(buffer, networkRequestIDOffset, networkRequestIDLength);
    }


    private final CharArrayWrapper networkRequestIDWrapper = new CharArrayWrapper();
    private char[] networkResponseID = new char[1];

    public char[] networkResponseID()
    {
        return networkResponseID;
    }


    private int networkResponseIDOffset;

    private int networkResponseIDLength;

    public int networkResponseIDLength()
    {
        return networkResponseIDLength;
    }

    public String networkResponseIDAsString()
    {
        return new String(networkResponseID, 0, networkResponseIDLength);
    }

    public void networkResponseID(final AsciiSequenceView view)
    {
        view.wrap(buffer, networkResponseIDOffset, networkResponseIDLength);
    }


    private final CharArrayWrapper networkResponseIDWrapper = new CharArrayWrapper();
    private char[] lastNetworkResponseID = new char[1];

    private boolean hasLastNetworkResponseID;

    public char[] lastNetworkResponseID()
    {
        if (!hasLastNetworkResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: LastNetworkResponseID");
        }

        return lastNetworkResponseID;
    }

    public boolean hasLastNetworkResponseID()
    {
        return hasLastNetworkResponseID;
    }


    private int lastNetworkResponseIDOffset;

    private int lastNetworkResponseIDLength;

    public int lastNetworkResponseIDLength()
    {
        if (!hasLastNetworkResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: LastNetworkResponseID");
        }

        return lastNetworkResponseIDLength;
    }

    public String lastNetworkResponseIDAsString()
    {
        return hasLastNetworkResponseID ? new String(lastNetworkResponseID, 0, lastNetworkResponseIDLength) : null;
    }

    public void lastNetworkResponseID(final AsciiSequenceView view)
    {
        if (!hasLastNetworkResponseID)
        {
            throw new IllegalArgumentException("No value for optional field: LastNetworkResponseID");
        }

        view.wrap(buffer, lastNetworkResponseIDOffset, lastNetworkResponseIDLength);
    }


    private final CharArrayWrapper lastNetworkResponseIDWrapper = new CharArrayWrapper();


    private CompIDsGroupDecoder compIDsGroup = null;
    public CompIDsGroupDecoder compIDsGroup()
    {
        return compIDsGroup;
    }

    private int noCompIDsGroupCounter = MISSING_INT;

    private boolean hasNoCompIDsGroupCounter;

    public int noCompIDsGroupCounter()
    {
        if (!hasNoCompIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoCompIDsGroupCounter");
        }

        return noCompIDsGroupCounter;
    }

    public boolean hasNoCompIDsGroupCounter()
    {
        return hasNoCompIDsGroupCounter;
    }




    private CompIDsGroupIterator compIDsGroupIterator = new CompIDsGroupIterator(this);
    public CompIDsGroupIterator compIDsGroupIterator()
    {
        return compIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode NetworkCounterpartySystemStatusResponse
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
            case Constants.NETWORK_STATUS_RESPONSE_TYPE:
                networkStatusResponseType = getInt(buffer, valueOffset, endOfField, 937, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NETWORK_REQUEST_ID:
                hasNetworkRequestID = true;
                networkRequestID = buffer.getChars(networkRequestID, valueOffset, valueLength);
                networkRequestIDOffset = valueOffset;
                networkRequestIDLength = valueLength;
                break;

            case Constants.NETWORK_RESPONSE_ID:
                networkResponseID = buffer.getChars(networkResponseID, valueOffset, valueLength);
                networkResponseIDOffset = valueOffset;
                networkResponseIDLength = valueLength;
                break;

            case Constants.LAST_NETWORK_RESPONSE_ID:
                hasLastNetworkResponseID = true;
                lastNetworkResponseID = buffer.getChars(lastNetworkResponseID, valueOffset, valueLength);
                lastNetworkResponseIDOffset = valueOffset;
                lastNetworkResponseIDLength = valueLength;
                break;

            case Constants.NO_COMP_IDS_GROUP_COUNTER:
                hasNoCompIDsGroupCounter = true;
                noCompIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 936, CODEC_VALIDATION_ENABLED);
                if (compIDsGroup == null)
                {
                    compIDsGroup = new CompIDsGroupDecoder(trailer, messageFields);
                }
                CompIDsGroupDecoder compIDsGroupCurrent = compIDsGroup;
                position = endOfField + 1;
                final int noCompIDsGroupCounter = this.noCompIDsGroupCounter;
                for (int i = 0; i < noCompIDsGroupCounter && position < end; i++)
                {
                    if (compIDsGroupCurrent != null)
                    {
                        position += compIDsGroupCurrent.decode(buffer, position, end - position);
                        compIDsGroupCurrent = compIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (compIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetNetworkStatusResponseType();
        this.resetNetworkRequestID();
        this.resetNetworkResponseID();
        this.resetLastNetworkResponseID();
        this.resetCompIDsGroup();
    }

    public void resetNetworkStatusResponseType()
    {
        networkStatusResponseType = MISSING_INT;
    }

    public void resetNetworkRequestID()
    {
        hasNetworkRequestID = false;
    }

    public void resetNetworkResponseID()
    {
        networkResponseIDOffset = 0;
        networkResponseIDLength = 0;
    }

    public void resetLastNetworkResponseID()
    {
        hasLastNetworkResponseID = false;
    }

    public void resetCompIDsGroup()
    {
        for (final CompIDsGroupDecoder compIDsGroupDecoder : compIDsGroupIterator.iterator())
        {
            compIDsGroupDecoder.reset();
            if (compIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noCompIDsGroupCounter = MISSING_INT;
        hasNoCompIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"NetworkCounterpartySystemStatusResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"NetworkStatusResponseType\": \"");
        builder.append(networkStatusResponseType);
        builder.append("\",\n");

        if (hasNetworkRequestID())
        {
            indent(builder, level);
            builder.append("\"NetworkRequestID\": \"");
            builder.append(this.networkRequestID(), 0, networkRequestIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"NetworkResponseID\": \"");
        builder.append(this.networkResponseID(), 0, networkResponseIDLength());
        builder.append("\",\n");

        if (hasLastNetworkResponseID())
        {
            indent(builder, level);
            builder.append("\"LastNetworkResponseID\": \"");
            builder.append(this.lastNetworkResponseID(), 0, lastNetworkResponseIDLength());
            builder.append("\",\n");
        }

        if (hasNoCompIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"CompIDsGroup\": [\n");
            CompIDsGroupDecoder compIDsGroup = this.compIDsGroup;
            for (int i = 0, size = this.noCompIDsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                compIDsGroup.appendTo(builder, level + 1);
                if (compIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                compIDsGroup = compIDsGroup.next();            }
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
    public NetworkCounterpartySystemStatusResponseEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NetworkCounterpartySystemStatusResponseEncoder)encoder);
    }

    public NetworkCounterpartySystemStatusResponseEncoder toEncoder(final NetworkCounterpartySystemStatusResponseEncoder encoder)
    {
        encoder.reset();
        encoder.networkStatusResponseType(this.networkStatusResponseType());
        if (hasNetworkRequestID())
        {
            encoder.networkRequestID(this.networkRequestID(), 0, networkRequestIDLength());
        }

        encoder.networkResponseID(this.networkResponseID(), 0, networkResponseIDLength());
        if (hasLastNetworkResponseID())
        {
            encoder.lastNetworkResponseID(this.lastNetworkResponseID(), 0, lastNetworkResponseIDLength());
        }


        final CompIDStatGrpEncoder compIDStatGrp = encoder.compIDStatGrp();        if (hasNoCompIDsGroupCounter)
        {
            final int size = this.noCompIDsGroupCounter;
            CompIDsGroupDecoder compIDsGroup = this.compIDsGroup;
            CompIDsGroupEncoder compIDsGroupEncoder = compIDStatGrp.compIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (compIDsGroup != null)
                {
                    compIDsGroup.toEncoder(compIDsGroupEncoder);
                    compIDsGroup = compIDsGroup.next();
                    compIDsGroupEncoder = compIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
