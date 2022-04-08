/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix44.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.TrailerEncoder;
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
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix44.*;


public class NewsEncoder implements Encoder
{
    public long messageType()
    {
        return 66L;
    }

    public NewsEncoder()
    {
        header.msgType("B");
    }

    private final TrailerEncoder trailer = new TrailerEncoder();

    public TrailerEncoder trailer()
    {
        return trailer;
    }

    private final HeaderEncoder header = new HeaderEncoder();

    public HeaderEncoder header()
    {
        return header;
    }

    private static final int origTimeHeaderLength = 3;
    private static final byte[] origTimeHeader = new byte[] {52, 50, (byte) '='};

    private static final int urgencyHeaderLength = 3;
    private static final byte[] urgencyHeader = new byte[] {54, 49, (byte) '='};

    private static final int headlineHeaderLength = 4;
    private static final byte[] headlineHeader = new byte[] {49, 52, 56, (byte) '='};

    private static final int encodedHeadlineLenHeaderLength = 4;
    private static final byte[] encodedHeadlineLenHeader = new byte[] {51, 53, 56, (byte) '='};

    private static final int encodedHeadlineHeaderLength = 4;
    private static final byte[] encodedHeadlineHeader = new byte[] {51, 53, 57, (byte) '='};

    private static final int noRoutingIDsGroupCounterHeaderLength = 4;
    private static final byte[] noRoutingIDsGroupCounterHeader = new byte[] {50, 49, 53, (byte) '='};

    private static final int noRelatedSymGroupCounterHeaderLength = 4;
    private static final byte[] noRelatedSymGroupCounterHeader = new byte[] {49, 52, 54, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLinesOfTextGroupCounterHeaderLength = 3;
    private static final byte[] noLinesOfTextGroupCounterHeader = new byte[] {51, 51, (byte) '='};

    private static final int uRLLinkHeaderLength = 4;
    private static final byte[] uRLLinkHeader = new byte[] {49, 52, 57, (byte) '='};

    private static final int rawDataLengthHeaderLength = 3;
    private static final byte[] rawDataLengthHeader = new byte[] {57, 53, (byte) '='};

    private static final int rawDataHeaderLength = 3;
    private static final byte[] rawDataHeader = new byte[] {57, 54, (byte) '='};

    private final MutableDirectBuffer origTime = new UnsafeBuffer();

    private int origTimeOffset = 0;

    private int origTimeLength = 0;

    public NewsEncoder origTime(final DirectBuffer value, final int offset, final int length)
    {
        origTime.wrap(value);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public NewsEncoder origTime(final DirectBuffer value, final int length)
    {
        return origTime(value, 0, length);
    }

    public NewsEncoder origTime(final DirectBuffer value)
    {
        return origTime(value, 0, value.capacity());
    }

    public NewsEncoder origTime(final byte[] value, final int offset, final int length)
    {
        origTime.wrap(value);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public NewsEncoder origTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTime, value, offset, length);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public NewsEncoder origTime(final byte[] value, final int length)
    {
        return origTime(value, 0, length);
    }

    public NewsEncoder origTime(final byte[] value)
    {
        return origTime(value, 0, value.length);
    }

    public boolean hasOrigTime()
    {
        return origTimeLength > 0;
    }

    public MutableDirectBuffer origTime()
    {
        return origTime;
    }

    public String origTimeAsString()
    {
        return origTime.getStringWithoutLengthAscii(origTimeOffset, origTimeLength);
    }

    private char urgency;

    private boolean hasUrgency;

    public boolean hasUrgency()
    {
        return hasUrgency;
    }

    public NewsEncoder urgency(char value)
    {
        urgency = value;
        hasUrgency = true;
        return this;
    }

    public char urgency()
    {
        return urgency;
    }

    public NewsEncoder urgency(Urgency value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Urgency.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: urgency Value: " + value );
            }
            if (value == Urgency.NULL_VAL)
            {
                return this;
            }
        }
        return urgency(value.representation());
    }

    private final MutableDirectBuffer headline = new UnsafeBuffer();

    private int headlineOffset = 0;

    private int headlineLength = 0;

    public NewsEncoder headline(final DirectBuffer value, final int offset, final int length)
    {
        headline.wrap(value);
        headlineOffset = offset;
        headlineLength = length;
        return this;
    }

    public NewsEncoder headline(final DirectBuffer value, final int length)
    {
        return headline(value, 0, length);
    }

    public NewsEncoder headline(final DirectBuffer value)
    {
        return headline(value, 0, value.capacity());
    }

    public NewsEncoder headline(final byte[] value, final int offset, final int length)
    {
        headline.wrap(value);
        headlineOffset = offset;
        headlineLength = length;
        return this;
    }

    public NewsEncoder headlineAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(headline, value, offset, length);
        headlineOffset = offset;
        headlineLength = length;
        return this;
    }

    public NewsEncoder headline(final byte[] value, final int length)
    {
        return headline(value, 0, length);
    }

    public NewsEncoder headline(final byte[] value)
    {
        return headline(value, 0, value.length);
    }

    public boolean hasHeadline()
    {
        return headlineLength > 0;
    }

    public MutableDirectBuffer headline()
    {
        return headline;
    }

    public String headlineAsString()
    {
        return headline.getStringWithoutLengthAscii(headlineOffset, headlineLength);
    }

    public NewsEncoder headline(final CharSequence value)
    {
        toBytes(value, headline);
        headlineOffset = 0;
        headlineLength = value.length();
        return this;
    }

    public NewsEncoder headline(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            headline.wrap(buffer);
            headlineOffset = value.offset();
            headlineLength = value.length();
        }
        return this;
    }

    public NewsEncoder headline(final char[] value)
    {
        return headline(value, 0, value.length);
    }

    public NewsEncoder headline(final char[] value, final int length)
    {
        return headline(value, 0, length);
    }

    public NewsEncoder headline(final char[] value, final int offset, final int length)
    {
        toBytes(value, headline, offset, length);
        headlineOffset = 0;
        headlineLength = length;
        return this;
    }

    private int encodedHeadlineLen;

    private boolean hasEncodedHeadlineLen;

    public boolean hasEncodedHeadlineLen()
    {
        return hasEncodedHeadlineLen;
    }

    public NewsEncoder encodedHeadlineLen(int value)
    {
        encodedHeadlineLen = value;
        hasEncodedHeadlineLen = true;
        return this;
    }

    public int encodedHeadlineLen()
    {
        return encodedHeadlineLen;
    }

    private byte[] encodedHeadline;

    private boolean hasEncodedHeadline;

    public boolean hasEncodedHeadline()
    {
        return hasEncodedHeadline;
    }

    public NewsEncoder encodedHeadline(byte[] value)
    {
        encodedHeadline = value;
        hasEncodedHeadline = true;
        return this;
    }

    public byte[] encodedHeadline()
    {
        return encodedHeadline;
    }

    public NewsEncoder encodedHeadlineAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedHeadline = copyInto(encodedHeadline, value, offset, length);
        hasEncodedHeadline = true;
        return this;
    }



public static class RoutingIDsGroupEncoder
{
    private RoutingIDsGroupEncoder next = null;

    public RoutingIDsGroupEncoder next()
    {
        if (next == null)
        {
            next = new RoutingIDsGroupEncoder();
        }
        return next;
    }

    private static final int routingTypeHeaderLength = 4;
    private static final byte[] routingTypeHeader = new byte[] {50, 49, 54, (byte) '='};

    private static final int routingIDHeaderLength = 4;
    private static final byte[] routingIDHeader = new byte[] {50, 49, 55, (byte) '='};

    private int routingType;

    private boolean hasRoutingType;

    public boolean hasRoutingType()
    {
        return hasRoutingType;
    }

    public RoutingIDsGroupEncoder routingType(int value)
    {
        routingType = value;
        hasRoutingType = true;
        return this;
    }

    public int routingType()
    {
        return routingType;
    }

    public RoutingIDsGroupEncoder routingType(RoutingType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == RoutingType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: routingType Value: " + value );
            }
            if (value == RoutingType.NULL_VAL)
            {
                return this;
            }
        }
        return routingType(value.representation());
    }

    private final MutableDirectBuffer routingID = new UnsafeBuffer();

    private int routingIDOffset = 0;

    private int routingIDLength = 0;

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final DirectBuffer value)
    {
        return routingID(value, 0, value.capacity());
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int offset, final int length)
    {
        routingID.wrap(value);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(routingID, value, offset, length);
        routingIDOffset = offset;
        routingIDLength = length;
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final byte[] value)
    {
        return routingID(value, 0, value.length);
    }

    public boolean hasRoutingID()
    {
        return routingIDLength > 0;
    }

    public MutableDirectBuffer routingID()
    {
        return routingID;
    }

    public String routingIDAsString()
    {
        return routingID.getStringWithoutLengthAscii(routingIDOffset, routingIDLength);
    }

    public RoutingIDsGroupEncoder routingID(final CharSequence value)
    {
        toBytes(value, routingID);
        routingIDOffset = 0;
        routingIDLength = value.length();
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            routingID.wrap(buffer);
            routingIDOffset = value.offset();
            routingIDLength = value.length();
        }
        return this;
    }

    public RoutingIDsGroupEncoder routingID(final char[] value)
    {
        return routingID(value, 0, value.length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int length)
    {
        return routingID(value, 0, length);
    }

    public RoutingIDsGroupEncoder routingID(final char[] value, final int offset, final int length)
    {
        toBytes(value, routingID, offset, length);
        routingIDOffset = 0;
        routingIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (hasRoutingType)
        {
            buffer.putBytes(position, routingTypeHeader, 0, routingTypeHeaderLength);
            position += routingTypeHeaderLength;
            position += buffer.putIntAscii(position, routingType);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDLength > 0)
        {
            buffer.putBytes(position, routingIDHeader, 0, routingIDHeaderLength);
            position += routingIDHeaderLength;
            buffer.putBytes(position, routingID, routingIDOffset, routingIDLength);
            position += routingIDLength;
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetRoutingType();
        this.resetRoutingID();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetRoutingType()
    {
        hasRoutingType = false;
    }

    public void resetRoutingID()
    {
        routingIDLength = 0;
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
        builder.append("\"MessageName\": \"RoutingIDsGroup\",\n");
        if (hasRoutingType())
        {
            indent(builder, level);
            builder.append("\"RoutingType\": \"");
            builder.append(routingType);
            builder.append("\",\n");
        }

        if (hasRoutingID())
        {
            indent(builder, level);
            builder.append("\"RoutingID\": \"");
            appendBuffer(builder, routingID, routingIDOffset, routingIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RoutingIDsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RoutingIDsGroupEncoder)encoder);
    }

    public RoutingIDsGroupEncoder copyTo(final RoutingIDsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasRoutingType())
        {
            encoder.routingType(this.routingType());
        }

        if (hasRoutingID())
        {
            encoder.routingIDAsCopy(routingID.byteArray(), 0, routingIDLength);
        }
        return encoder;
    }

}
    private int noRoutingIDsGroupCounter;

    private boolean hasNoRoutingIDsGroupCounter;

    public boolean hasNoRoutingIDsGroupCounter()
    {
        return hasNoRoutingIDsGroupCounter;
    }

    public NewsEncoder noRoutingIDsGroupCounter(int value)
    {
        noRoutingIDsGroupCounter = value;
        hasNoRoutingIDsGroupCounter = true;
        return this;
    }

    public int noRoutingIDsGroupCounter()
    {
        return noRoutingIDsGroupCounter;
    }


    private RoutingIDsGroupEncoder routingIDsGroup = null;

    public RoutingIDsGroupEncoder routingIDsGroup(final int numberOfElements)
    {
        hasNoRoutingIDsGroupCounter = true;
        noRoutingIDsGroupCounter = numberOfElements;
        if (routingIDsGroup == null)
        {
            routingIDsGroup = new RoutingIDsGroupEncoder();
        }
        return routingIDsGroup;
    }



public static class RelatedSymGroupEncoder
{
    private RelatedSymGroupEncoder next = null;

    public RelatedSymGroupEncoder next()
    {
        if (next == null)
        {
            next = new RelatedSymGroupEncoder();
        }
        return next;
    }

    private final InstrumentEncoder instrument = new InstrumentEncoder();
    public InstrumentEncoder instrument()
    {
        return instrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"RelatedSymGroup\",\n");
    indent(builder, level);
    builder.append("\"Instrument\": ");
    instrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public RelatedSymGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((RelatedSymGroupEncoder)encoder);
    }

    public RelatedSymGroupEncoder copyTo(final RelatedSymGroupEncoder encoder)
    {
        encoder.reset();

        instrument.copyTo(encoder.instrument());        return encoder;
    }

}
    private int noRelatedSymGroupCounter;

    private boolean hasNoRelatedSymGroupCounter;

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }

    public NewsEncoder noRelatedSymGroupCounter(int value)
    {
        noRelatedSymGroupCounter = value;
        hasNoRelatedSymGroupCounter = true;
        return this;
    }

    public int noRelatedSymGroupCounter()
    {
        return noRelatedSymGroupCounter;
    }


    private RelatedSymGroupEncoder relatedSymGroup = null;

    public RelatedSymGroupEncoder relatedSymGroup(final int numberOfElements)
    {
        hasNoRelatedSymGroupCounter = true;
        noRelatedSymGroupCounter = numberOfElements;
        if (relatedSymGroup == null)
        {
            relatedSymGroup = new RelatedSymGroupEncoder();
        }
        return relatedSymGroup;
    }



public static class LegsGroupEncoder
{
    private LegsGroupEncoder next = null;

    public LegsGroupEncoder next()
    {
        if (next == null)
        {
            next = new LegsGroupEncoder();
        }
        return next;
    }

    private final InstrumentLegEncoder instrumentLeg = new InstrumentLegEncoder();
    public InstrumentLegEncoder instrumentLeg()
    {
        return instrumentLeg;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += instrumentLeg.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        instrumentLeg.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"LegsGroup\",\n");
    indent(builder, level);
    builder.append("\"InstrumentLeg\": ");
    instrumentLeg.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public LegsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LegsGroupEncoder)encoder);
    }

    public LegsGroupEncoder copyTo(final LegsGroupEncoder encoder)
    {
        encoder.reset();

        instrumentLeg.copyTo(encoder.instrumentLeg());        return encoder;
    }

}
    private int noLegsGroupCounter;

    private boolean hasNoLegsGroupCounter;

    public boolean hasNoLegsGroupCounter()
    {
        return hasNoLegsGroupCounter;
    }

    public NewsEncoder noLegsGroupCounter(int value)
    {
        noLegsGroupCounter = value;
        hasNoLegsGroupCounter = true;
        return this;
    }

    public int noLegsGroupCounter()
    {
        return noLegsGroupCounter;
    }


    private LegsGroupEncoder legsGroup = null;

    public LegsGroupEncoder legsGroup(final int numberOfElements)
    {
        hasNoLegsGroupCounter = true;
        noLegsGroupCounter = numberOfElements;
        if (legsGroup == null)
        {
            legsGroup = new LegsGroupEncoder();
        }
        return legsGroup;
    }



public static class UnderlyingsGroupEncoder
{
    private UnderlyingsGroupEncoder next = null;

    public UnderlyingsGroupEncoder next()
    {
        if (next == null)
        {
            next = new UnderlyingsGroupEncoder();
        }
        return next;
    }

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

            position += underlyingInstrument.encode(buffer, position);
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        underlyingInstrument.reset();
        if (next != null)        {
            next.reset();
        }
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public UnderlyingsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder copyTo(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        underlyingInstrument.copyTo(encoder.underlyingInstrument());        return encoder;
    }

}
    private int noUnderlyingsGroupCounter;

    private boolean hasNoUnderlyingsGroupCounter;

    public boolean hasNoUnderlyingsGroupCounter()
    {
        return hasNoUnderlyingsGroupCounter;
    }

    public NewsEncoder noUnderlyingsGroupCounter(int value)
    {
        noUnderlyingsGroupCounter = value;
        hasNoUnderlyingsGroupCounter = true;
        return this;
    }

    public int noUnderlyingsGroupCounter()
    {
        return noUnderlyingsGroupCounter;
    }


    private UnderlyingsGroupEncoder underlyingsGroup = null;

    public UnderlyingsGroupEncoder underlyingsGroup(final int numberOfElements)
    {
        hasNoUnderlyingsGroupCounter = true;
        noUnderlyingsGroupCounter = numberOfElements;
        if (underlyingsGroup == null)
        {
            underlyingsGroup = new UnderlyingsGroupEncoder();
        }
        return underlyingsGroup;
    }



public static class LinesOfTextGroupEncoder
{
    private LinesOfTextGroupEncoder next = null;

    public LinesOfTextGroupEncoder next()
    {
        if (next == null)
        {
            next = new LinesOfTextGroupEncoder();
        }
        return next;
    }

    private static final int textHeaderLength = 3;
    private static final byte[] textHeader = new byte[] {53, 56, (byte) '='};

    private static final int encodedTextLenHeaderLength = 4;
    private static final byte[] encodedTextLenHeader = new byte[] {51, 53, 52, (byte) '='};

    private static final int encodedTextHeaderLength = 4;
    private static final byte[] encodedTextHeader = new byte[] {51, 53, 53, (byte) '='};

    private final MutableDirectBuffer text = new UnsafeBuffer();

    private int textOffset = 0;

    private int textLength = 0;

    public LinesOfTextGroupEncoder text(final DirectBuffer value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder text(final DirectBuffer value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final DirectBuffer value)
    {
        return text(value, 0, value.capacity());
    }

    public LinesOfTextGroupEncoder text(final byte[] value, final int offset, final int length)
    {
        text.wrap(value);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder textAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(text, value, offset, length);
        textOffset = offset;
        textLength = length;
        return this;
    }

    public LinesOfTextGroupEncoder text(final byte[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final byte[] value)
    {
        return text(value, 0, value.length);
    }

    public boolean hasText()
    {
        return textLength > 0;
    }

    public MutableDirectBuffer text()
    {
        return text;
    }

    public String textAsString()
    {
        return text.getStringWithoutLengthAscii(textOffset, textLength);
    }

    public LinesOfTextGroupEncoder text(final CharSequence value)
    {
        toBytes(value, text);
        textOffset = 0;
        textLength = value.length();
        return this;
    }

    public LinesOfTextGroupEncoder text(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            text.wrap(buffer);
            textOffset = value.offset();
            textLength = value.length();
        }
        return this;
    }

    public LinesOfTextGroupEncoder text(final char[] value)
    {
        return text(value, 0, value.length);
    }

    public LinesOfTextGroupEncoder text(final char[] value, final int length)
    {
        return text(value, 0, length);
    }

    public LinesOfTextGroupEncoder text(final char[] value, final int offset, final int length)
    {
        toBytes(value, text, offset, length);
        textOffset = 0;
        textLength = length;
        return this;
    }

    private int encodedTextLen;

    private boolean hasEncodedTextLen;

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }

    public LinesOfTextGroupEncoder encodedTextLen(int value)
    {
        encodedTextLen = value;
        hasEncodedTextLen = true;
        return this;
    }

    public int encodedTextLen()
    {
        return encodedTextLen;
    }

    private byte[] encodedText;

    private boolean hasEncodedText;

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }

    public LinesOfTextGroupEncoder encodedText(byte[] value)
    {
        encodedText = value;
        hasEncodedText = true;
        return this;
    }

    public byte[] encodedText()
    {
        return encodedText;
    }

    public LinesOfTextGroupEncoder encodedTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedText = copyInto(encodedText, value, offset, length);
        hasEncodedText = true;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (textLength > 0)
        {
            buffer.putBytes(position, textHeader, 0, textHeaderLength);
            position += textHeaderLength;
            buffer.putBytes(position, text, textOffset, textLength);
            position += textLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Text");
        }

        if (hasEncodedTextLen)
        {
            buffer.putBytes(position, encodedTextLenHeader, 0, encodedTextLenHeaderLength);
            position += encodedTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedText)
        {
            buffer.putBytes(position, encodedTextHeader, 0, encodedTextHeaderLength);
            position += encodedTextHeaderLength;
            buffer.putBytes(position, encodedText);
            position += encodedText.length;
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetText()
    {
        textLength = 0;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
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
        builder.append("\"MessageName\": \"LinesOfTextGroup\",\n");
        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            appendBuffer(builder, text, textOffset, textLength);
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
    public LinesOfTextGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((LinesOfTextGroupEncoder)encoder);
    }

    public LinesOfTextGroupEncoder copyTo(final LinesOfTextGroupEncoder encoder)
    {
        encoder.reset();
        if (hasText())
        {
            encoder.textAsCopy(text.byteArray(), 0, textLength);
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(encodedTextLen());
        }
        return encoder;
    }

}
    private int noLinesOfTextGroupCounter;

    private boolean hasNoLinesOfTextGroupCounter;

    public boolean hasNoLinesOfTextGroupCounter()
    {
        return hasNoLinesOfTextGroupCounter;
    }

    public NewsEncoder noLinesOfTextGroupCounter(int value)
    {
        noLinesOfTextGroupCounter = value;
        hasNoLinesOfTextGroupCounter = true;
        return this;
    }

    public int noLinesOfTextGroupCounter()
    {
        return noLinesOfTextGroupCounter;
    }


    private LinesOfTextGroupEncoder linesOfTextGroup = null;

    public LinesOfTextGroupEncoder linesOfTextGroup(final int numberOfElements)
    {
        hasNoLinesOfTextGroupCounter = true;
        noLinesOfTextGroupCounter = numberOfElements;
        if (linesOfTextGroup == null)
        {
            linesOfTextGroup = new LinesOfTextGroupEncoder();
        }
        return linesOfTextGroup;
    }

    private final MutableDirectBuffer uRLLink = new UnsafeBuffer();

    private int uRLLinkOffset = 0;

    private int uRLLinkLength = 0;

    public NewsEncoder uRLLink(final DirectBuffer value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public NewsEncoder uRLLink(final DirectBuffer value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public NewsEncoder uRLLink(final DirectBuffer value)
    {
        return uRLLink(value, 0, value.capacity());
    }

    public NewsEncoder uRLLink(final byte[] value, final int offset, final int length)
    {
        uRLLink.wrap(value);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public NewsEncoder uRLLinkAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(uRLLink, value, offset, length);
        uRLLinkOffset = offset;
        uRLLinkLength = length;
        return this;
    }

    public NewsEncoder uRLLink(final byte[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public NewsEncoder uRLLink(final byte[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public boolean hasURLLink()
    {
        return uRLLinkLength > 0;
    }

    public MutableDirectBuffer uRLLink()
    {
        return uRLLink;
    }

    public String uRLLinkAsString()
    {
        return uRLLink.getStringWithoutLengthAscii(uRLLinkOffset, uRLLinkLength);
    }

    public NewsEncoder uRLLink(final CharSequence value)
    {
        toBytes(value, uRLLink);
        uRLLinkOffset = 0;
        uRLLinkLength = value.length();
        return this;
    }

    public NewsEncoder uRLLink(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            uRLLink.wrap(buffer);
            uRLLinkOffset = value.offset();
            uRLLinkLength = value.length();
        }
        return this;
    }

    public NewsEncoder uRLLink(final char[] value)
    {
        return uRLLink(value, 0, value.length);
    }

    public NewsEncoder uRLLink(final char[] value, final int length)
    {
        return uRLLink(value, 0, length);
    }

    public NewsEncoder uRLLink(final char[] value, final int offset, final int length)
    {
        toBytes(value, uRLLink, offset, length);
        uRLLinkOffset = 0;
        uRLLinkLength = length;
        return this;
    }

    private int rawDataLength;

    private boolean hasRawDataLength;

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }

    public NewsEncoder rawDataLength(int value)
    {
        rawDataLength = value;
        hasRawDataLength = true;
        return this;
    }

    public int rawDataLength()
    {
        return rawDataLength;
    }

    private byte[] rawData;

    private boolean hasRawData;

    public boolean hasRawData()
    {
        return hasRawData;
    }

    public NewsEncoder rawData(byte[] value)
    {
        rawData = value;
        hasRawData = true;
        return this;
    }

    public byte[] rawData()
    {
        return rawData;
    }

    public NewsEncoder rawDataAsCopy(final byte[] value, final int offset, final int length)
    {
        rawData = copyInto(rawData, value, offset, length);
        hasRawData = true;
        return this;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (origTimeLength > 0)
        {
            buffer.putBytes(position, origTimeHeader, 0, origTimeHeaderLength);
            position += origTimeHeaderLength;
            buffer.putBytes(position, origTime, origTimeOffset, origTimeLength);
            position += origTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasUrgency)
        {
            buffer.putBytes(position, urgencyHeader, 0, urgencyHeaderLength);
            position += urgencyHeaderLength;
            position += buffer.putCharAscii(position, urgency);
            buffer.putSeparator(position);
            position++;
        }

        if (headlineLength > 0)
        {
            buffer.putBytes(position, headlineHeader, 0, headlineHeaderLength);
            position += headlineHeaderLength;
            buffer.putBytes(position, headline, headlineOffset, headlineLength);
            position += headlineLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Headline");
        }

        if (hasEncodedHeadlineLen)
        {
            buffer.putBytes(position, encodedHeadlineLenHeader, 0, encodedHeadlineLenHeaderLength);
            position += encodedHeadlineLenHeaderLength;
            position += buffer.putIntAscii(position, encodedHeadlineLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedHeadline)
        {
            buffer.putBytes(position, encodedHeadlineHeader, 0, encodedHeadlineHeaderLength);
            position += encodedHeadlineHeaderLength;
            buffer.putBytes(position, encodedHeadline);
            position += encodedHeadline.length;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            buffer.putBytes(position, noRoutingIDsGroupCounterHeader, 0, noRoutingIDsGroupCounterHeaderLength);
            position += noRoutingIDsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRoutingIDsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (routingIDsGroup != null)
        {
            position += routingIDsGroup.encode(buffer, position, noRoutingIDsGroupCounter);
        }


        if (hasNoRelatedSymGroupCounter)
        {
            buffer.putBytes(position, noRelatedSymGroupCounterHeader, 0, noRelatedSymGroupCounterHeaderLength);
            position += noRelatedSymGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noRelatedSymGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (relatedSymGroup != null)
        {
            position += relatedSymGroup.encode(buffer, position, noRelatedSymGroupCounter);
        }


        if (hasNoLegsGroupCounter)
        {
            buffer.putBytes(position, noLegsGroupCounterHeader, 0, noLegsGroupCounterHeaderLength);
            position += noLegsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLegsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (legsGroup != null)
        {
            position += legsGroup.encode(buffer, position, noLegsGroupCounter);
        }


        if (hasNoUnderlyingsGroupCounter)
        {
            buffer.putBytes(position, noUnderlyingsGroupCounterHeader, 0, noUnderlyingsGroupCounterHeaderLength);
            position += noUnderlyingsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noUnderlyingsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (underlyingsGroup != null)
        {
            position += underlyingsGroup.encode(buffer, position, noUnderlyingsGroupCounter);
        }


        if (hasNoLinesOfTextGroupCounter)
        {
            buffer.putBytes(position, noLinesOfTextGroupCounterHeader, 0, noLinesOfTextGroupCounterHeaderLength);
            position += noLinesOfTextGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noLinesOfTextGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (linesOfTextGroup != null)
        {
            position += linesOfTextGroup.encode(buffer, position, noLinesOfTextGroupCounter);
        }


        if (uRLLinkLength > 0)
        {
            buffer.putBytes(position, uRLLinkHeader, 0, uRLLinkHeaderLength);
            position += uRLLinkHeaderLength;
            buffer.putBytes(position, uRLLink, uRLLinkOffset, uRLLinkLength);
            position += uRLLinkLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasRawDataLength)
        {
            buffer.putBytes(position, rawDataLengthHeader, 0, rawDataLengthHeaderLength);
            position += rawDataLengthHeaderLength;
            position += buffer.putIntAscii(position, rawDataLength);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRawData)
        {
            buffer.putBytes(position, rawDataHeader, 0, rawDataHeaderLength);
            position += rawDataHeaderLength;
            buffer.putBytes(position, rawData);
            position += rawData.length;
            buffer.putSeparator(position);
            position++;
        }
        position += trailer.startTrailer(buffer, position);

        final int messageStart = header.finishHeader(buffer, bodyStart, position - bodyStart);
        return trailer.finishMessage(buffer, messageStart, position);
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
    }

    public void resetMessage()
    {
        this.resetOrigTime();
        this.resetUrgency();
        this.resetHeadline();
        this.resetEncodedHeadlineLen();
        this.resetEncodedHeadline();
        this.resetURLLink();
        this.resetRawDataLength();
        this.resetRawData();
        this.resetRoutingIDsGroup();
        this.resetRelatedSymGroup();
        this.resetLegsGroup();
        this.resetUnderlyingsGroup();
        this.resetLinesOfTextGroup();
    }

    public void resetOrigTime()
    {
        origTimeLength = 0;
    }

    public void resetUrgency()
    {
        hasUrgency = false;
    }

    public void resetHeadline()
    {
        headlineLength = 0;
    }

    public void resetEncodedHeadlineLen()
    {
        hasEncodedHeadlineLen = false;
    }

    public void resetEncodedHeadline()
    {
        hasEncodedHeadline = false;
    }

    public void resetURLLink()
    {
        uRLLinkLength = 0;
    }

    public void resetRawDataLength()
    {
        hasRawDataLength = false;
    }

    public void resetRawData()
    {
        hasRawData = false;
    }

    public void resetRoutingIDsGroup()
    {
        if (routingIDsGroup != null)
        {
            routingIDsGroup.reset();
        }
        noRoutingIDsGroupCounter = 0;
        hasNoRoutingIDsGroupCounter = false;
    }

    public void resetRelatedSymGroup()
    {
        if (relatedSymGroup != null)
        {
            relatedSymGroup.reset();
        }
        noRelatedSymGroupCounter = 0;
        hasNoRelatedSymGroupCounter = false;
    }

    public void resetLegsGroup()
    {
        if (legsGroup != null)
        {
            legsGroup.reset();
        }
        noLegsGroupCounter = 0;
        hasNoLegsGroupCounter = false;
    }

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
    }

    public void resetLinesOfTextGroup()
    {
        if (linesOfTextGroup != null)
        {
            linesOfTextGroup.reset();
        }
        noLinesOfTextGroupCounter = 0;
        hasNoLinesOfTextGroupCounter = false;
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
        builder.append("\"MessageName\": \"News\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasOrigTime())
        {
            indent(builder, level);
            builder.append("\"OrigTime\": \"");
            appendBuffer(builder, origTime, origTimeOffset, origTimeLength);
            builder.append("\",\n");
        }

        if (hasUrgency())
        {
            indent(builder, level);
            builder.append("\"Urgency\": \"");
            builder.append(urgency);
            builder.append("\",\n");
        }

        if (hasHeadline())
        {
            indent(builder, level);
            builder.append("\"Headline\": \"");
            appendBuffer(builder, headline, headlineOffset, headlineLength);
            builder.append("\",\n");
        }

        if (hasEncodedHeadlineLen())
        {
            indent(builder, level);
            builder.append("\"EncodedHeadlineLen\": \"");
            builder.append(encodedHeadlineLen);
            builder.append("\",\n");
        }

        if (hasEncodedHeadline())
        {
            indent(builder, level);
            builder.append("\"EncodedHeadline\": \"");
            appendData(builder, encodedHeadline, encodedHeadlineLen);
            builder.append("\",\n");
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RoutingIDsGroup\": [\n");
            final int noRoutingIDsGroupCounter = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            for (int i = 0; i < noRoutingIDsGroupCounter; i++)
            {
                indent(builder, level);
                routingIDsGroup.appendTo(builder, level + 1);
                if (i < (noRoutingIDsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                routingIDsGroup = routingIDsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoRelatedSymGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RelatedSymGroup\": [\n");
            final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            for (int i = 0; i < noRelatedSymGroupCounter; i++)
            {
                indent(builder, level);
                relatedSymGroup.appendTo(builder, level + 1);
                if (i < (noRelatedSymGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                relatedSymGroup = relatedSymGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoLegsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LegsGroup\": [\n");
            final int noLegsGroupCounter = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            for (int i = 0; i < noLegsGroupCounter; i++)
            {
                indent(builder, level);
                legsGroup.appendTo(builder, level + 1);
                if (i < (noLegsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                legsGroup = legsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"UnderlyingsGroup\": [\n");
            final int noUnderlyingsGroupCounter = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            for (int i = 0; i < noUnderlyingsGroupCounter; i++)
            {
                indent(builder, level);
                underlyingsGroup.appendTo(builder, level + 1);
                if (i < (noUnderlyingsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                underlyingsGroup = underlyingsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoLinesOfTextGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LinesOfTextGroup\": [\n");
            final int noLinesOfTextGroupCounter = this.noLinesOfTextGroupCounter;
            LinesOfTextGroupEncoder linesOfTextGroup = this.linesOfTextGroup;
            for (int i = 0; i < noLinesOfTextGroupCounter; i++)
            {
                indent(builder, level);
                linesOfTextGroup.appendTo(builder, level + 1);
                if (i < (noLinesOfTextGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                linesOfTextGroup = linesOfTextGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasURLLink())
        {
            indent(builder, level);
            builder.append("\"URLLink\": \"");
            appendBuffer(builder, uRLLink, uRLLinkOffset, uRLLinkLength);
            builder.append("\",\n");
        }

        if (hasRawDataLength())
        {
            indent(builder, level);
            builder.append("\"RawDataLength\": \"");
            builder.append(rawDataLength);
            builder.append("\",\n");
        }

        if (hasRawData())
        {
            indent(builder, level);
            builder.append("\"RawData\": \"");
            appendData(builder, rawData, rawDataLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public NewsEncoder copyTo(final Encoder encoder)
    {
        return copyTo((NewsEncoder)encoder);
    }

    public NewsEncoder copyTo(final NewsEncoder encoder)
    {
        encoder.reset();
        if (hasOrigTime())
        {
            encoder.origTimeAsCopy(origTime.byteArray(), 0, origTimeLength);
        }

        if (hasUrgency())
        {
            encoder.urgency(this.urgency());
        }

        if (hasHeadline())
        {
            encoder.headlineAsCopy(headline.byteArray(), 0, headlineLength);
        }

        if (hasEncodedHeadlineLen())
        {
            encoder.encodedHeadlineLen(this.encodedHeadlineLen());
        }

        if (hasEncodedHeadline())
        {
            encoder.encodedHeadlineAsCopy(this.encodedHeadline(), 0, encodedHeadlineLen());
            encoder.encodedHeadlineLen(encodedHeadlineLen());
        }

        if (hasNoRoutingIDsGroupCounter)
        {
            final int size = this.noRoutingIDsGroupCounter;
            RoutingIDsGroupEncoder routingIDsGroup = this.routingIDsGroup;
            RoutingIDsGroupEncoder routingIDsGroupEncoder = encoder.routingIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (routingIDsGroup != null)
                {
                    routingIDsGroup.copyTo(routingIDsGroupEncoder);
                    routingIDsGroup = routingIDsGroup.next();
                    routingIDsGroupEncoder = routingIDsGroupEncoder.next();
                }
            }
        }

        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupEncoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = encoder.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.copyTo(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
        }

        if (hasNoLegsGroupCounter)
        {
            final int size = this.noLegsGroupCounter;
            LegsGroupEncoder legsGroup = this.legsGroup;
            LegsGroupEncoder legsGroupEncoder = encoder.legsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (legsGroup != null)
                {
                    legsGroup.copyTo(legsGroupEncoder);
                    legsGroup = legsGroup.next();
                    legsGroupEncoder = legsGroupEncoder.next();
                }
            }
        }

        if (hasNoUnderlyingsGroupCounter)
        {
            final int size = this.noUnderlyingsGroupCounter;
            UnderlyingsGroupEncoder underlyingsGroup = this.underlyingsGroup;
            UnderlyingsGroupEncoder underlyingsGroupEncoder = encoder.underlyingsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingsGroup != null)
                {
                    underlyingsGroup.copyTo(underlyingsGroupEncoder);
                    underlyingsGroup = underlyingsGroup.next();
                    underlyingsGroupEncoder = underlyingsGroupEncoder.next();
                }
            }
        }

        if (hasNoLinesOfTextGroupCounter)
        {
            final int size = this.noLinesOfTextGroupCounter;
            LinesOfTextGroupEncoder linesOfTextGroup = this.linesOfTextGroup;
            LinesOfTextGroupEncoder linesOfTextGroupEncoder = encoder.linesOfTextGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (linesOfTextGroup != null)
                {
                    linesOfTextGroup.copyTo(linesOfTextGroupEncoder);
                    linesOfTextGroup = linesOfTextGroup.next();
                    linesOfTextGroupEncoder = linesOfTextGroupEncoder.next();
                }
            }
        }

        if (hasURLLink())
        {
            encoder.uRLLinkAsCopy(uRLLink.byteArray(), 0, uRLLinkLength);
        }

        if (hasRawDataLength())
        {
            encoder.rawDataLength(this.rawDataLength());
        }

        if (hasRawData())
        {
            encoder.rawDataAsCopy(this.rawData(), 0, rawDataLength());
            encoder.rawDataLength(rawDataLength());
        }
        return encoder;
    }

}
