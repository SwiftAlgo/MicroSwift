/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder.SecurityAltIDGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.InstrumentEncoder.EventsGroupEncoder;

public interface InstrumentDecoder 
{

    public char[] symbol();
    public int symbolLength();
    public void symbol(AsciiSequenceView view);
    public char[] symbolSfx();
    public boolean hasSymbolSfx();
    public int symbolSfxLength();
    public SymbolSfx symbolSfxAsEnum();
    public void symbolSfx(AsciiSequenceView view);
    public char[] securityID();
    public boolean hasSecurityID();
    public int securityIDLength();
    public void securityID(AsciiSequenceView view);
    public char[] securityIDSource();
    public boolean hasSecurityIDSource();
    public int securityIDSourceLength();
    public SecurityIDSource securityIDSourceAsEnum();
    public void securityIDSource(AsciiSequenceView view);


public class SecurityAltIDGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.SECURITY_ALT_ID);
            ALL_GROUP_FIELDS.add(Constants.SECURITY_ALT_ID_SOURCE);
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
    public SecurityAltIDGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SecurityAltIDGroupDecoder next = null;

    public SecurityAltIDGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(4);

    private char[] securityAltID = new char[1];

    private boolean hasSecurityAltID;

    public char[] securityAltID()
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        return securityAltID;
    }

    public boolean hasSecurityAltID()
    {
        return hasSecurityAltID;
    }


    private int securityAltIDOffset;

    private int securityAltIDLength;

    public int securityAltIDLength()
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        return securityAltIDLength;
    }

    public String securityAltIDAsString()
    {
        return hasSecurityAltID ? new String(securityAltID, 0, securityAltIDLength) : null;
    }

    public void securityAltID(final AsciiSequenceView view)
    {
        if (!hasSecurityAltID)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltID");
        }

        view.wrap(buffer, securityAltIDOffset, securityAltIDLength);
    }


    private final CharArrayWrapper securityAltIDWrapper = new CharArrayWrapper();
    private char[] securityAltIDSource = new char[1];

    private boolean hasSecurityAltIDSource;

    public char[] securityAltIDSource()
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        return securityAltIDSource;
    }

    public boolean hasSecurityAltIDSource()
    {
        return hasSecurityAltIDSource;
    }


    private int securityAltIDSourceOffset;

    private int securityAltIDSourceLength;

    public int securityAltIDSourceLength()
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        return securityAltIDSourceLength;
    }

    public String securityAltIDSourceAsString()
    {
        return hasSecurityAltIDSource ? new String(securityAltIDSource, 0, securityAltIDSourceLength) : null;
    }

    public void securityAltIDSource(final AsciiSequenceView view)
    {
        if (!hasSecurityAltIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityAltIDSource");
        }

        view.wrap(buffer, securityAltIDSourceOffset, securityAltIDSourceLength);
    }


    private final CharArrayWrapper securityAltIDSourceWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SecurityAltIDGroup
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
                    next = new SecurityAltIDGroupDecoder(trailer, messageFields);
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
            case Constants.SECURITY_ALT_ID:
                hasSecurityAltID = true;
                securityAltID = buffer.getChars(securityAltID, valueOffset, valueLength);
                securityAltIDOffset = valueOffset;
                securityAltIDLength = valueLength;
                break;

            case Constants.SECURITY_ALT_ID_SOURCE:
                hasSecurityAltIDSource = true;
                securityAltIDSource = buffer.getChars(securityAltIDSource, valueOffset, valueLength);
                securityAltIDSourceOffset = valueOffset;
                securityAltIDSourceLength = valueLength;
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
        this.resetSecurityAltID();
        this.resetSecurityAltIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSecurityAltID()
    {
        hasSecurityAltID = false;
    }

    public void resetSecurityAltIDSource()
    {
        hasSecurityAltIDSource = false;
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
        builder.append("\"MessageName\": \"SecurityAltIDGroup\",\n");
        if (hasSecurityAltID())
        {
            indent(builder, level);
            builder.append("\"SecurityAltID\": \"");
            builder.append(this.securityAltID(), 0, securityAltIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityAltIDSource())
        {
            indent(builder, level);
            builder.append("\"SecurityAltIDSource\": \"");
            builder.append(this.securityAltIDSource(), 0, securityAltIDSourceLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentEncoder.SecurityAltIDGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((InstrumentEncoder.SecurityAltIDGroupEncoder)encoder);
    }

    public InstrumentEncoder.SecurityAltIDGroupEncoder toEncoder(final InstrumentEncoder.SecurityAltIDGroupEncoder encoder)
    {
        encoder.reset();
        if (hasSecurityAltID())
        {
            encoder.securityAltID(this.securityAltID(), 0, securityAltIDLength());
        }

        if (hasSecurityAltIDSource())
        {
            encoder.securityAltIDSource(this.securityAltIDSource(), 0, securityAltIDSourceLength());
        }
        return encoder;
    }

}
    public class SecurityAltIDGroupIterator implements Iterable<SecurityAltIDGroupDecoder>, java.util.Iterator<SecurityAltIDGroupDecoder>
    {
        private final InstrumentDecoder parent;
        private int remainder;
        private SecurityAltIDGroupDecoder current;

        public SecurityAltIDGroupIterator(final InstrumentDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public SecurityAltIDGroupDecoder next()
        {
            remainder--;
            final SecurityAltIDGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoSecurityAltIDGroupCounter() ? parent.noSecurityAltIDGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.securityAltIDGroup();
        }

        public SecurityAltIDGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public SecurityAltIDGroupIterator securityAltIDGroupIterator();
    public int noSecurityAltIDGroupCounter();
    public boolean hasNoSecurityAltIDGroupCounter();
    public SecurityAltIDGroupDecoder securityAltIDGroup();
    public int product();
    public boolean hasProduct();
    public Product productAsEnum();
    public char[] cFICode();
    public boolean hasCFICode();
    public int cFICodeLength();
    public void cFICode(AsciiSequenceView view);
    public char[] securityType();
    public boolean hasSecurityType();
    public int securityTypeLength();
    public SecurityType securityTypeAsEnum();
    public void securityType(AsciiSequenceView view);
    public char[] securitySubType();
    public boolean hasSecuritySubType();
    public int securitySubTypeLength();
    public void securitySubType(AsciiSequenceView view);
    public byte[] maturityMonthYear();
    public boolean hasMaturityMonthYear();
    public int maturityMonthYearLength();
    public void maturityMonthYear(AsciiSequenceView view);
    public byte[] maturityDate();
    public boolean hasMaturityDate();
    public int maturityDateLength();
    public void maturityDate(AsciiSequenceView view);
    public int putOrCall();
    public boolean hasPutOrCall();
    public PutOrCall putOrCallAsEnum();
    public byte[] couponPaymentDate();
    public boolean hasCouponPaymentDate();
    public int couponPaymentDateLength();
    public void couponPaymentDate(AsciiSequenceView view);
    public byte[] issueDate();
    public boolean hasIssueDate();
    public int issueDateLength();
    public void issueDate(AsciiSequenceView view);
    public char[] repoCollateralSecurityType();
    public boolean hasRepoCollateralSecurityType();
    public int repoCollateralSecurityTypeLength();
    public void repoCollateralSecurityType(AsciiSequenceView view);
    public int repurchaseTerm();
    public boolean hasRepurchaseTerm();
    public DecimalFloat repurchaseRate();
    public boolean hasRepurchaseRate();
    public DecimalFloat factor();
    public boolean hasFactor();
    public char[] creditRating();
    public boolean hasCreditRating();
    public int creditRatingLength();
    public void creditRating(AsciiSequenceView view);
    public char[] instrRegistry();
    public boolean hasInstrRegistry();
    public int instrRegistryLength();
    public void instrRegistry(AsciiSequenceView view);
    public char[] countryOfIssue();
    public boolean hasCountryOfIssue();
    public int countryOfIssueLength();
    public void countryOfIssue(AsciiSequenceView view);
    public char[] stateOrProvinceOfIssue();
    public boolean hasStateOrProvinceOfIssue();
    public int stateOrProvinceOfIssueLength();
    public void stateOrProvinceOfIssue(AsciiSequenceView view);
    public char[] localeOfIssue();
    public boolean hasLocaleOfIssue();
    public int localeOfIssueLength();
    public void localeOfIssue(AsciiSequenceView view);
    public byte[] redemptionDate();
    public boolean hasRedemptionDate();
    public int redemptionDateLength();
    public void redemptionDate(AsciiSequenceView view);
    public DecimalFloat strikePrice();
    public boolean hasStrikePrice();
    public char[] strikeCurrency();
    public boolean hasStrikeCurrency();
    public int strikeCurrencyLength();
    public void strikeCurrency(AsciiSequenceView view);
    public char optAttribute();
    public boolean hasOptAttribute();
    public DecimalFloat contractMultiplier();
    public boolean hasContractMultiplier();
    public DecimalFloat couponRate();
    public boolean hasCouponRate();
    public char[] securityExchange();
    public boolean hasSecurityExchange();
    public int securityExchangeLength();
    public void securityExchange(AsciiSequenceView view);
    public char[] issuer();
    public boolean hasIssuer();
    public int issuerLength();
    public void issuer(AsciiSequenceView view);
    public int encodedIssuerLen();
    public boolean hasEncodedIssuerLen();
    public byte[] encodedIssuer();
    public boolean hasEncodedIssuer();
    public char[] securityDesc();
    public boolean hasSecurityDesc();
    public int securityDescLength();
    public void securityDesc(AsciiSequenceView view);
    public int encodedSecurityDescLen();
    public boolean hasEncodedSecurityDescLen();
    public byte[] encodedSecurityDesc();
    public boolean hasEncodedSecurityDesc();
    public char[] pool();
    public boolean hasPool();
    public int poolLength();
    public void pool(AsciiSequenceView view);
    public byte[] contractSettlMonth();
    public boolean hasContractSettlMonth();
    public int contractSettlMonthLength();
    public void contractSettlMonth(AsciiSequenceView view);
    public int cPProgram();
    public boolean hasCPProgram();
    public char[] cPRegType();
    public boolean hasCPRegType();
    public int cPRegTypeLength();
    public void cPRegType(AsciiSequenceView view);


public class EventsGroupDecoder extends CommonDecoderImpl
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
            ALL_GROUP_FIELDS.add(Constants.EVENT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.EVENT_DATE);
            ALL_GROUP_FIELDS.add(Constants.EVENT_PX);
            ALL_GROUP_FIELDS.add(Constants.EVENT_TEXT);
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
        if (hasEventType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !EventType.isValid(eventType()))
        {
            invalidTagId = 865;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public EventsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private EventsGroupDecoder next = null;

    public EventsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private int eventType = MISSING_INT;

    private boolean hasEventType;

    public int eventType()
    {
        if (!hasEventType)
        {
            throw new IllegalArgumentException("No value for optional field: EventType");
        }

        return eventType;
    }

    public boolean hasEventType()
    {
        return hasEventType;
    }



    private final CharArrayWrapper eventTypeWrapper = new CharArrayWrapper();
    public EventType eventTypeAsEnum()
    {
        if (!hasEventType)
 return EventType.NULL_VAL;
        return EventType.decode(eventType);
    }

    private byte[] eventDate = new byte[8];

    private boolean hasEventDate;

    public byte[] eventDate()
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        return eventDate;
    }

    public boolean hasEventDate()
    {
        return hasEventDate;
    }


    private int eventDateOffset;

    private int eventDateLength;

    public int eventDateLength()
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        return eventDateLength;
    }

    public String eventDateAsString()
    {
        return hasEventDate ? new String(eventDate, 0, eventDateLength) : null;
    }

    public void eventDate(final AsciiSequenceView view)
    {
        if (!hasEventDate)
        {
            throw new IllegalArgumentException("No value for optional field: EventDate");
        }

        view.wrap(buffer, eventDateOffset, eventDateLength);
    }


    private DecimalFloat eventPx = DecimalFloat.newNaNValue();

    private boolean hasEventPx;

    public DecimalFloat eventPx()
    {
        if (!hasEventPx)
        {
            throw new IllegalArgumentException("No value for optional field: EventPx");
        }

        return eventPx;
    }

    public boolean hasEventPx()
    {
        return hasEventPx;
    }



    private char[] eventText = new char[1];

    private boolean hasEventText;

    public char[] eventText()
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        return eventText;
    }

    public boolean hasEventText()
    {
        return hasEventText;
    }


    private int eventTextOffset;

    private int eventTextLength;

    public int eventTextLength()
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        return eventTextLength;
    }

    public String eventTextAsString()
    {
        return hasEventText ? new String(eventText, 0, eventTextLength) : null;
    }

    public void eventText(final AsciiSequenceView view)
    {
        if (!hasEventText)
        {
            throw new IllegalArgumentException("No value for optional field: EventText");
        }

        view.wrap(buffer, eventTextOffset, eventTextLength);
    }


    private final CharArrayWrapper eventTextWrapper = new CharArrayWrapper();
    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode EventsGroup
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
                    next = new EventsGroupDecoder(trailer, messageFields);
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
            case Constants.EVENT_TYPE:
                hasEventType = true;
                eventType = getInt(buffer, valueOffset, endOfField, 865, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EVENT_DATE:
                hasEventDate = true;
                eventDate = buffer.getBytes(eventDate, valueOffset, valueLength);
                eventDateOffset = valueOffset;
                eventDateLength = valueLength;
                break;

            case Constants.EVENT_PX:
                hasEventPx = true;
                eventPx = getFloat(buffer, eventPx, valueOffset, valueLength, 867, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EVENT_TEXT:
                hasEventText = true;
                eventText = buffer.getChars(eventText, valueOffset, valueLength);
                eventTextOffset = valueOffset;
                eventTextLength = valueLength;
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
        this.resetEventType();
        this.resetEventDate();
        this.resetEventPx();
        this.resetEventText();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetEventType()
    {
        hasEventType = false;
    }

    public void resetEventDate()
    {
        hasEventDate = false;
    }

    public void resetEventPx()
    {
        hasEventPx = false;
    }

    public void resetEventText()
    {
        hasEventText = false;
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
        builder.append("\"MessageName\": \"EventsGroup\",\n");
        if (hasEventType())
        {
            indent(builder, level);
            builder.append("\"EventType\": \"");
            builder.append(eventType);
            builder.append("\",\n");
        }

        if (hasEventDate())
        {
            indent(builder, level);
            builder.append("\"EventDate\": \"");
            appendData(builder, eventDate, eventDateLength);
            builder.append("\",\n");
        }

        if (hasEventPx())
        {
            indent(builder, level);
            builder.append("\"EventPx\": \"");
            eventPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEventText())
        {
            indent(builder, level);
            builder.append("\"EventText\": \"");
            builder.append(this.eventText(), 0, eventTextLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public InstrumentEncoder.EventsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((InstrumentEncoder.EventsGroupEncoder)encoder);
    }

    public InstrumentEncoder.EventsGroupEncoder toEncoder(final InstrumentEncoder.EventsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasEventType())
        {
            encoder.eventType(this.eventType());
        }

        if (hasEventDate())
        {
            encoder.eventDateAsCopy(this.eventDate(), 0, eventDateLength());
        }

        if (hasEventPx())
        {
            encoder.eventPx(this.eventPx());
        }

        if (hasEventText())
        {
            encoder.eventText(this.eventText(), 0, eventTextLength());
        }
        return encoder;
    }

}
    public class EventsGroupIterator implements Iterable<EventsGroupDecoder>, java.util.Iterator<EventsGroupDecoder>
    {
        private final InstrumentDecoder parent;
        private int remainder;
        private EventsGroupDecoder current;

        public EventsGroupIterator(final InstrumentDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public EventsGroupDecoder next()
        {
            remainder--;
            final EventsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoEventsGroupCounter() ? parent.noEventsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.eventsGroup();
        }

        public EventsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public EventsGroupIterator eventsGroupIterator();
    public int noEventsGroupCounter();
    public boolean hasNoEventsGroupCounter();
    public EventsGroupDecoder eventsGroup();
    public byte[] datedDate();
    public boolean hasDatedDate();
    public int datedDateLength();
    public void datedDate(AsciiSequenceView view);
    public byte[] interestAccrualDate();
    public boolean hasInterestAccrualDate();
    public int interestAccrualDateLength();
    public void interestAccrualDate(AsciiSequenceView view);

}
