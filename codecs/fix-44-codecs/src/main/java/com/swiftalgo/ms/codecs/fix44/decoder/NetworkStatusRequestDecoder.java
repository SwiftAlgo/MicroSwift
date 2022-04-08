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
import com.swiftalgo.ms.codecs.fix44.builder.NetworkStatusRequestEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.NetworkStatusRequestEncoder.CompIDsGroupEncoder;


public class NetworkStatusRequestDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.NETWORK_REQUEST_TYPE);
            REQUIRED_FIELDS.add(Constants.NETWORK_REQUEST_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.NETWORK_REQUEST_TYPE);
            GROUP_FIELDS.add(Constants.NETWORK_REQUEST_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(4);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !NetworkRequestType.isValid(networkRequestType()))
        {
            invalidTagId = 935;
            rejectReason = 5;
            return false;
        }
        if (hasNoCompIDsGroupCounter)
        {
            {
                int count = 0;
                final CompIDsGroupIterator iterator = compIDsGroupIterator.iterator();
                for (final CompIDsGroupDecoder group : iterator)
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
                    invalidTagId = 936;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 17218L;

    public static final String MESSAGE_TYPE_AS_STRING = "BC";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(72);

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
        messageFields.add(Constants.NETWORK_REQUEST_TYPE);
        messageFields.add(Constants.NETWORK_REQUEST_ID);
        messageFields.add(Constants.NO_COMP_IDS_GROUP_COUNTER);
        messageFields.add(Constants.REF_COMP_ID);
        messageFields.add(Constants.REF_SUB_ID);
        messageFields.add(Constants.LOCATION_ID);
        messageFields.add(Constants.DESK_ID);
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

    private int networkRequestType = MISSING_INT;

    public int networkRequestType()
    {
        return networkRequestType;
    }



    private final CharArrayWrapper networkRequestTypeWrapper = new CharArrayWrapper();
    public NetworkRequestType networkRequestTypeAsEnum()
    {
        return NetworkRequestType.decode(networkRequestType);
    }

    private char[] networkRequestID = new char[1];

    public char[] networkRequestID()
    {
        return networkRequestID;
    }


    private int networkRequestIDOffset;

    private int networkRequestIDLength;

    public int networkRequestIDLength()
    {
        return networkRequestIDLength;
    }

    public String networkRequestIDAsString()
    {
        return new String(networkRequestID, 0, networkRequestIDLength);
    }

    public void networkRequestID(final AsciiSequenceView view)
    {
        view.wrap(buffer, networkRequestIDOffset, networkRequestIDLength);
    }


    private final CharArrayWrapper networkRequestIDWrapper = new CharArrayWrapper();


public class CompIDsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(8);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.REF_COMP_ID);
            ALL_GROUP_FIELDS.add(Constants.REF_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.LOCATION_ID);
            ALL_GROUP_FIELDS.add(Constants.DESK_ID);
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public CompIDsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private CompIDsGroupDecoder next = null;

    public CompIDsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] refCompID = new char[1];

    private boolean hasRefCompID;

    public char[] refCompID()
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        return refCompID;
    }

    public boolean hasRefCompID()
    {
        return hasRefCompID;
    }


    private int refCompIDOffset;

    private int refCompIDLength;

    public int refCompIDLength()
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        return refCompIDLength;
    }

    public String refCompIDAsString()
    {
        return hasRefCompID ? new String(refCompID, 0, refCompIDLength) : null;
    }

    public void refCompID(final AsciiSequenceView view)
    {
        if (!hasRefCompID)
        {
            throw new IllegalArgumentException("No value for optional field: RefCompID");
        }

        view.wrap(buffer, refCompIDOffset, refCompIDLength);
    }


    private final CharArrayWrapper refCompIDWrapper = new CharArrayWrapper();
    private char[] refSubID = new char[1];

    private boolean hasRefSubID;

    public char[] refSubID()
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        return refSubID;
    }

    public boolean hasRefSubID()
    {
        return hasRefSubID;
    }


    private int refSubIDOffset;

    private int refSubIDLength;

    public int refSubIDLength()
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        return refSubIDLength;
    }

    public String refSubIDAsString()
    {
        return hasRefSubID ? new String(refSubID, 0, refSubIDLength) : null;
    }

    public void refSubID(final AsciiSequenceView view)
    {
        if (!hasRefSubID)
        {
            throw new IllegalArgumentException("No value for optional field: RefSubID");
        }

        view.wrap(buffer, refSubIDOffset, refSubIDLength);
    }


    private final CharArrayWrapper refSubIDWrapper = new CharArrayWrapper();
    private char[] locationID = new char[1];

    private boolean hasLocationID;

    public char[] locationID()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationID;
    }

    public boolean hasLocationID()
    {
        return hasLocationID;
    }


    private int locationIDOffset;

    private int locationIDLength;

    public int locationIDLength()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationIDLength;
    }

    public String locationIDAsString()
    {
        return hasLocationID ? new String(locationID, 0, locationIDLength) : null;
    }

    public void locationID(final AsciiSequenceView view)
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        view.wrap(buffer, locationIDOffset, locationIDLength);
    }


    private final CharArrayWrapper locationIDWrapper = new CharArrayWrapper();
    private char[] deskID = new char[1];

    private boolean hasDeskID;

    public char[] deskID()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskID;
    }

    public boolean hasDeskID()
    {
        return hasDeskID;
    }


    private int deskIDOffset;

    private int deskIDLength;

    public int deskIDLength()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskIDLength;
    }

    public String deskIDAsString()
    {
        return hasDeskID ? new String(deskID, 0, deskIDLength) : null;
    }

    public void deskID(final AsciiSequenceView view)
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        view.wrap(buffer, deskIDOffset, deskIDLength);
    }


    private final CharArrayWrapper deskIDWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode CompIDsGroup
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
                    next = new CompIDsGroupDecoder(trailer, messageFields);
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
            case Constants.REF_COMP_ID:
                hasRefCompID = true;
                refCompID = buffer.getChars(refCompID, valueOffset, valueLength);
                refCompIDOffset = valueOffset;
                refCompIDLength = valueLength;
                break;

            case Constants.REF_SUB_ID:
                hasRefSubID = true;
                refSubID = buffer.getChars(refSubID, valueOffset, valueLength);
                refSubIDOffset = valueOffset;
                refSubIDLength = valueLength;
                break;

            case Constants.LOCATION_ID:
                hasLocationID = true;
                locationID = buffer.getChars(locationID, valueOffset, valueLength);
                locationIDOffset = valueOffset;
                locationIDLength = valueLength;
                break;

            case Constants.DESK_ID:
                hasDeskID = true;
                deskID = buffer.getChars(deskID, valueOffset, valueLength);
                deskIDOffset = valueOffset;
                deskIDLength = valueLength;
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
        this.resetRefCompID();
        this.resetRefSubID();
        this.resetLocationID();
        this.resetDeskID();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetRefCompID()
    {
        hasRefCompID = false;
    }

    public void resetRefSubID()
    {
        hasRefSubID = false;
    }

    public void resetLocationID()
    {
        hasLocationID = false;
    }

    public void resetDeskID()
    {
        hasDeskID = false;
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
        builder.append("\"MessageName\": \"CompIDsGroup\",\n");
        if (hasRefCompID())
        {
            indent(builder, level);
            builder.append("\"RefCompID\": \"");
            builder.append(this.refCompID(), 0, refCompIDLength());
            builder.append("\",\n");
        }

        if (hasRefSubID())
        {
            indent(builder, level);
            builder.append("\"RefSubID\": \"");
            builder.append(this.refSubID(), 0, refSubIDLength());
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            builder.append(this.locationID(), 0, locationIDLength());
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            builder.append(this.deskID(), 0, deskIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NetworkStatusRequestEncoder.CompIDsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NetworkStatusRequestEncoder.CompIDsGroupEncoder)encoder);
    }

    public NetworkStatusRequestEncoder.CompIDsGroupEncoder toEncoder(final NetworkStatusRequestEncoder.CompIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRefCompID())
        {
            encoder.refCompID(this.refCompID(), 0, refCompIDLength());
        }

        if (hasRefSubID())
        {
            encoder.refSubID(this.refSubID(), 0, refSubIDLength());
        }

        if (hasLocationID())
        {
            encoder.locationID(this.locationID(), 0, locationIDLength());
        }

        if (hasDeskID())
        {
            encoder.deskID(this.deskID(), 0, deskIDLength());
        }
        return encoder;
    }

}
    public class CompIDsGroupIterator implements Iterable<CompIDsGroupDecoder>, java.util.Iterator<CompIDsGroupDecoder>
    {
        private final NetworkStatusRequestDecoder parent;
        private int remainder;
        private CompIDsGroupDecoder current;

        public CompIDsGroupIterator(final NetworkStatusRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public CompIDsGroupDecoder next()
        {
            remainder--;
            final CompIDsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoCompIDsGroupCounter() ? parent.noCompIDsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.compIDsGroup();
        }

        public CompIDsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }


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
        // Decode NetworkStatusRequest
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
            case Constants.NETWORK_REQUEST_TYPE:
                networkRequestType = getInt(buffer, valueOffset, endOfField, 935, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NETWORK_REQUEST_ID:
                networkRequestID = buffer.getChars(networkRequestID, valueOffset, valueLength);
                networkRequestIDOffset = valueOffset;
                networkRequestIDLength = valueLength;
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
        this.resetNetworkRequestType();
        this.resetNetworkRequestID();
        this.resetCompIDsGroup();
    }

    public void resetNetworkRequestType()
    {
        networkRequestType = MISSING_INT;
    }

    public void resetNetworkRequestID()
    {
        networkRequestIDOffset = 0;
        networkRequestIDLength = 0;
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
        builder.append("\"MessageName\": \"NetworkStatusRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"NetworkRequestType\": \"");
        builder.append(networkRequestType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"NetworkRequestID\": \"");
        builder.append(this.networkRequestID(), 0, networkRequestIDLength());
        builder.append("\",\n");

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
    public NetworkStatusRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((NetworkStatusRequestEncoder)encoder);
    }

    public NetworkStatusRequestEncoder toEncoder(final NetworkStatusRequestEncoder encoder)
    {
        encoder.reset();
        encoder.networkRequestType(this.networkRequestType());
        encoder.networkRequestID(this.networkRequestID(), 0, networkRequestIDLength());
        if (hasNoCompIDsGroupCounter)
        {
            final int size = this.noCompIDsGroupCounter;
            CompIDsGroupDecoder compIDsGroup = this.compIDsGroup;
            CompIDsGroupEncoder compIDsGroupEncoder = encoder.compIDsGroup(size);
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
