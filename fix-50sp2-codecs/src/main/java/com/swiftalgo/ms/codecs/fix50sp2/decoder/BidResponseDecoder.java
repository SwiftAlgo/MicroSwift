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
import com.swiftalgo.ms.codecs.fix50sp2.builder.BidResponseEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.BidCompRspGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.BidCompRspGrpEncoder.BidComponentsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;


public class BidResponseDecoder extends CommonDecoderImpl implements BidCompRspGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.NO_BID_COMPONENTS_GROUP_COUNTER);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.BID_ID);
            GROUP_FIELDS.add(Constants.CLIENT_BID_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(4);

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
            final BidComponentsGroupIterator iterator = bidComponentsGroupIterator.iterator();
            for (final BidComponentsGroupDecoder group : iterator)
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
                invalidTagId = 420;
                rejectReason = 16;
                return false;
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 108L;

    public static final String MESSAGE_TYPE_AS_STRING = "l";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(106);

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
        messageFields.add(Constants.BID_ID);
        messageFields.add(Constants.CLIENT_BID_ID);
        messageFields.add(Constants.NO_BID_COMPONENTS_GROUP_COUNTER);
        messageFields.add(Constants.COMMISSION);
        messageFields.add(Constants.COMM_TYPE);
        messageFields.add(Constants.COMM_CURRENCY);
        messageFields.add(Constants.FUND_RENEW_WAIV);
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.COUNTRY);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.PRICE);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.FAIR_VALUE);
        messageFields.add(Constants.NET_GROSS_IND);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
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

    private char[] bidID = new char[1];

    private boolean hasBidID;

    public char[] bidID()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidID;
    }

    public boolean hasBidID()
    {
        return hasBidID;
    }


    private int bidIDOffset;

    private int bidIDLength;

    public int bidIDLength()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidIDLength;
    }

    public String bidIDAsString()
    {
        return hasBidID ? new String(bidID, 0, bidIDLength) : null;
    }

    public void bidID(final AsciiSequenceView view)
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        view.wrap(buffer, bidIDOffset, bidIDLength);
    }


    private final CharArrayWrapper bidIDWrapper = new CharArrayWrapper();
    private char[] clientBidID = new char[1];

    private boolean hasClientBidID;

    public char[] clientBidID()
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        return clientBidID;
    }

    public boolean hasClientBidID()
    {
        return hasClientBidID;
    }


    private int clientBidIDOffset;

    private int clientBidIDLength;

    public int clientBidIDLength()
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        return clientBidIDLength;
    }

    public String clientBidIDAsString()
    {
        return hasClientBidID ? new String(clientBidID, 0, clientBidIDLength) : null;
    }

    public void clientBidID(final AsciiSequenceView view)
    {
        if (!hasClientBidID)
        {
            throw new IllegalArgumentException("No value for optional field: ClientBidID");
        }

        view.wrap(buffer, clientBidIDOffset, clientBidIDLength);
    }


    private final CharArrayWrapper clientBidIDWrapper = new CharArrayWrapper();


    private BidComponentsGroupDecoder bidComponentsGroup = null;
    public BidComponentsGroupDecoder bidComponentsGroup()
    {
        return bidComponentsGroup;
    }

    private int noBidComponentsGroupCounter = MISSING_INT;

    private boolean hasNoBidComponentsGroupCounter;

    public int noBidComponentsGroupCounter()
    {
        if (!hasNoBidComponentsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoBidComponentsGroupCounter");
        }

        return noBidComponentsGroupCounter;
    }

    public boolean hasNoBidComponentsGroupCounter()
    {
        return hasNoBidComponentsGroupCounter;
    }




    private BidComponentsGroupIterator bidComponentsGroupIterator = new BidComponentsGroupIterator(this);
    public BidComponentsGroupIterator bidComponentsGroupIterator()
    {
        return bidComponentsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode BidResponse
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
            case Constants.BID_ID:
                hasBidID = true;
                bidID = buffer.getChars(bidID, valueOffset, valueLength);
                bidIDOffset = valueOffset;
                bidIDLength = valueLength;
                break;

            case Constants.CLIENT_BID_ID:
                hasClientBidID = true;
                clientBidID = buffer.getChars(clientBidID, valueOffset, valueLength);
                clientBidIDOffset = valueOffset;
                clientBidIDLength = valueLength;
                break;

            case Constants.NO_BID_COMPONENTS_GROUP_COUNTER:
                hasNoBidComponentsGroupCounter = true;
                noBidComponentsGroupCounter = getInt(buffer, valueOffset, endOfField, 420, CODEC_VALIDATION_ENABLED);
                if (bidComponentsGroup == null)
                {
                    bidComponentsGroup = new BidComponentsGroupDecoder(trailer, messageFields);
                }
                BidComponentsGroupDecoder bidComponentsGroupCurrent = bidComponentsGroup;
                position = endOfField + 1;
                final int noBidComponentsGroupCounter = this.noBidComponentsGroupCounter;
                for (int i = 0; i < noBidComponentsGroupCounter && position < end; i++)
                {
                    if (bidComponentsGroupCurrent != null)
                    {
                        position += bidComponentsGroupCurrent.decode(buffer, position, end - position);
                        bidComponentsGroupCurrent = bidComponentsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (bidComponentsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetBidID();
        this.resetClientBidID();
        this.resetBidComponentsGroup();
    }

    public void resetBidID()
    {
        hasBidID = false;
    }

    public void resetClientBidID()
    {
        hasClientBidID = false;
    }

    public void resetBidComponentsGroup()
    {
        for (final BidComponentsGroupDecoder bidComponentsGroupDecoder : bidComponentsGroupIterator.iterator())
        {
            bidComponentsGroupDecoder.reset();
            if (bidComponentsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noBidComponentsGroupCounter = MISSING_INT;
        hasNoBidComponentsGroupCounter = false;
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
        builder.append("\"MessageName\": \"BidResponse\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            builder.append(this.bidID(), 0, bidIDLength());
            builder.append("\",\n");
        }

        if (hasClientBidID())
        {
            indent(builder, level);
            builder.append("\"ClientBidID\": \"");
            builder.append(this.clientBidID(), 0, clientBidIDLength());
            builder.append("\",\n");
        }

        if (hasNoBidComponentsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"BidComponentsGroup\": [\n");
            BidComponentsGroupDecoder bidComponentsGroup = this.bidComponentsGroup;
            for (int i = 0, size = this.noBidComponentsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                bidComponentsGroup.appendTo(builder, level + 1);
                if (bidComponentsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                bidComponentsGroup = bidComponentsGroup.next();            }
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
    public BidResponseEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((BidResponseEncoder)encoder);
    }

    public BidResponseEncoder toEncoder(final BidResponseEncoder encoder)
    {
        encoder.reset();
        if (hasBidID())
        {
            encoder.bidID(this.bidID(), 0, bidIDLength());
        }

        if (hasClientBidID())
        {
            encoder.clientBidID(this.clientBidID(), 0, clientBidIDLength());
        }


        final BidCompRspGrpEncoder bidCompRspGrp = encoder.bidCompRspGrp();        if (hasNoBidComponentsGroupCounter)
        {
            final int size = this.noBidComponentsGroupCounter;
            BidComponentsGroupDecoder bidComponentsGroup = this.bidComponentsGroup;
            BidComponentsGroupEncoder bidComponentsGroupEncoder = bidCompRspGrp.bidComponentsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidComponentsGroup != null)
                {
                    bidComponentsGroup.toEncoder(bidComponentsGroupEncoder);
                    bidComponentsGroup = bidComponentsGroup.next();
                    bidComponentsGroupEncoder = bidComponentsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
