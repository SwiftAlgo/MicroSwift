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


public class EmailEncoder implements Encoder
{
    public long messageType()
    {
        return 67L;
    }

    public EmailEncoder()
    {
        header.msgType("C");
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

    private static final int emailThreadIDHeaderLength = 4;
    private static final byte[] emailThreadIDHeader = new byte[] {49, 54, 52, (byte) '='};

    private static final int emailTypeHeaderLength = 3;
    private static final byte[] emailTypeHeader = new byte[] {57, 52, (byte) '='};

    private static final int origTimeHeaderLength = 3;
    private static final byte[] origTimeHeader = new byte[] {52, 50, (byte) '='};

    private static final int subjectHeaderLength = 4;
    private static final byte[] subjectHeader = new byte[] {49, 52, 55, (byte) '='};

    private static final int encodedSubjectLenHeaderLength = 4;
    private static final byte[] encodedSubjectLenHeader = new byte[] {51, 53, 54, (byte) '='};

    private static final int encodedSubjectHeaderLength = 4;
    private static final byte[] encodedSubjectHeader = new byte[] {51, 53, 55, (byte) '='};

    private static final int noRoutingIDsGroupCounterHeaderLength = 4;
    private static final byte[] noRoutingIDsGroupCounterHeader = new byte[] {50, 49, 53, (byte) '='};

    private static final int noRelatedSymGroupCounterHeaderLength = 4;
    private static final byte[] noRelatedSymGroupCounterHeader = new byte[] {49, 52, 54, (byte) '='};

    private static final int noUnderlyingsGroupCounterHeaderLength = 4;
    private static final byte[] noUnderlyingsGroupCounterHeader = new byte[] {55, 49, 49, (byte) '='};

    private static final int noLegsGroupCounterHeaderLength = 4;
    private static final byte[] noLegsGroupCounterHeader = new byte[] {53, 53, 53, (byte) '='};

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

    private static final int noLinesOfTextGroupCounterHeaderLength = 3;
    private static final byte[] noLinesOfTextGroupCounterHeader = new byte[] {51, 51, (byte) '='};

    private static final int rawDataLengthHeaderLength = 3;
    private static final byte[] rawDataLengthHeader = new byte[] {57, 53, (byte) '='};

    private static final int rawDataHeaderLength = 3;
    private static final byte[] rawDataHeader = new byte[] {57, 54, (byte) '='};

    private final MutableDirectBuffer emailThreadID = new UnsafeBuffer();

    private int emailThreadIDOffset = 0;

    private int emailThreadIDLength = 0;

    public EmailEncoder emailThreadID(final DirectBuffer value, final int offset, final int length)
    {
        emailThreadID.wrap(value);
        emailThreadIDOffset = offset;
        emailThreadIDLength = length;
        return this;
    }

    public EmailEncoder emailThreadID(final DirectBuffer value, final int length)
    {
        return emailThreadID(value, 0, length);
    }

    public EmailEncoder emailThreadID(final DirectBuffer value)
    {
        return emailThreadID(value, 0, value.capacity());
    }

    public EmailEncoder emailThreadID(final byte[] value, final int offset, final int length)
    {
        emailThreadID.wrap(value);
        emailThreadIDOffset = offset;
        emailThreadIDLength = length;
        return this;
    }

    public EmailEncoder emailThreadIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(emailThreadID, value, offset, length);
        emailThreadIDOffset = offset;
        emailThreadIDLength = length;
        return this;
    }

    public EmailEncoder emailThreadID(final byte[] value, final int length)
    {
        return emailThreadID(value, 0, length);
    }

    public EmailEncoder emailThreadID(final byte[] value)
    {
        return emailThreadID(value, 0, value.length);
    }

    public boolean hasEmailThreadID()
    {
        return emailThreadIDLength > 0;
    }

    public MutableDirectBuffer emailThreadID()
    {
        return emailThreadID;
    }

    public String emailThreadIDAsString()
    {
        return emailThreadID.getStringWithoutLengthAscii(emailThreadIDOffset, emailThreadIDLength);
    }

    public EmailEncoder emailThreadID(final CharSequence value)
    {
        toBytes(value, emailThreadID);
        emailThreadIDOffset = 0;
        emailThreadIDLength = value.length();
        return this;
    }

    public EmailEncoder emailThreadID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            emailThreadID.wrap(buffer);
            emailThreadIDOffset = value.offset();
            emailThreadIDLength = value.length();
        }
        return this;
    }

    public EmailEncoder emailThreadID(final char[] value)
    {
        return emailThreadID(value, 0, value.length);
    }

    public EmailEncoder emailThreadID(final char[] value, final int length)
    {
        return emailThreadID(value, 0, length);
    }

    public EmailEncoder emailThreadID(final char[] value, final int offset, final int length)
    {
        toBytes(value, emailThreadID, offset, length);
        emailThreadIDOffset = 0;
        emailThreadIDLength = length;
        return this;
    }

    private char emailType;

    private boolean hasEmailType;

    public boolean hasEmailType()
    {
        return hasEmailType;
    }

    public EmailEncoder emailType(char value)
    {
        emailType = value;
        hasEmailType = true;
        return this;
    }

    public char emailType()
    {
        return emailType;
    }

    public EmailEncoder emailType(EmailType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == EmailType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: emailType Value: " + value );
            }
            if (value == EmailType.NULL_VAL)
            {
                return this;
            }
        }
        return emailType(value.representation());
    }

    private final MutableDirectBuffer origTime = new UnsafeBuffer();

    private int origTimeOffset = 0;

    private int origTimeLength = 0;

    public EmailEncoder origTime(final DirectBuffer value, final int offset, final int length)
    {
        origTime.wrap(value);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public EmailEncoder origTime(final DirectBuffer value, final int length)
    {
        return origTime(value, 0, length);
    }

    public EmailEncoder origTime(final DirectBuffer value)
    {
        return origTime(value, 0, value.capacity());
    }

    public EmailEncoder origTime(final byte[] value, final int offset, final int length)
    {
        origTime.wrap(value);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public EmailEncoder origTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(origTime, value, offset, length);
        origTimeOffset = offset;
        origTimeLength = length;
        return this;
    }

    public EmailEncoder origTime(final byte[] value, final int length)
    {
        return origTime(value, 0, length);
    }

    public EmailEncoder origTime(final byte[] value)
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

    private final MutableDirectBuffer subject = new UnsafeBuffer();

    private int subjectOffset = 0;

    private int subjectLength = 0;

    public EmailEncoder subject(final DirectBuffer value, final int offset, final int length)
    {
        subject.wrap(value);
        subjectOffset = offset;
        subjectLength = length;
        return this;
    }

    public EmailEncoder subject(final DirectBuffer value, final int length)
    {
        return subject(value, 0, length);
    }

    public EmailEncoder subject(final DirectBuffer value)
    {
        return subject(value, 0, value.capacity());
    }

    public EmailEncoder subject(final byte[] value, final int offset, final int length)
    {
        subject.wrap(value);
        subjectOffset = offset;
        subjectLength = length;
        return this;
    }

    public EmailEncoder subjectAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(subject, value, offset, length);
        subjectOffset = offset;
        subjectLength = length;
        return this;
    }

    public EmailEncoder subject(final byte[] value, final int length)
    {
        return subject(value, 0, length);
    }

    public EmailEncoder subject(final byte[] value)
    {
        return subject(value, 0, value.length);
    }

    public boolean hasSubject()
    {
        return subjectLength > 0;
    }

    public MutableDirectBuffer subject()
    {
        return subject;
    }

    public String subjectAsString()
    {
        return subject.getStringWithoutLengthAscii(subjectOffset, subjectLength);
    }

    public EmailEncoder subject(final CharSequence value)
    {
        toBytes(value, subject);
        subjectOffset = 0;
        subjectLength = value.length();
        return this;
    }

    public EmailEncoder subject(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            subject.wrap(buffer);
            subjectOffset = value.offset();
            subjectLength = value.length();
        }
        return this;
    }

    public EmailEncoder subject(final char[] value)
    {
        return subject(value, 0, value.length);
    }

    public EmailEncoder subject(final char[] value, final int length)
    {
        return subject(value, 0, length);
    }

    public EmailEncoder subject(final char[] value, final int offset, final int length)
    {
        toBytes(value, subject, offset, length);
        subjectOffset = 0;
        subjectLength = length;
        return this;
    }

    private int encodedSubjectLen;

    private boolean hasEncodedSubjectLen;

    public boolean hasEncodedSubjectLen()
    {
        return hasEncodedSubjectLen;
    }

    public EmailEncoder encodedSubjectLen(int value)
    {
        encodedSubjectLen = value;
        hasEncodedSubjectLen = true;
        return this;
    }

    public int encodedSubjectLen()
    {
        return encodedSubjectLen;
    }

    private byte[] encodedSubject;

    private boolean hasEncodedSubject;

    public boolean hasEncodedSubject()
    {
        return hasEncodedSubject;
    }

    public EmailEncoder encodedSubject(byte[] value)
    {
        encodedSubject = value;
        hasEncodedSubject = true;
        return this;
    }

    public byte[] encodedSubject()
    {
        return encodedSubject;
    }

    public EmailEncoder encodedSubjectAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedSubject = copyInto(encodedSubject, value, offset, length);
        hasEncodedSubject = true;
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

    public EmailEncoder noRoutingIDsGroupCounter(int value)
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

    public EmailEncoder noRelatedSymGroupCounter(int value)
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

    public EmailEncoder noUnderlyingsGroupCounter(int value)
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

    public EmailEncoder noLegsGroupCounter(int value)
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

    private final MutableDirectBuffer orderID = new UnsafeBuffer();

    private int orderIDOffset = 0;

    private int orderIDLength = 0;

    public EmailEncoder orderID(final DirectBuffer value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public EmailEncoder orderID(final DirectBuffer value, final int length)
    {
        return orderID(value, 0, length);
    }

    public EmailEncoder orderID(final DirectBuffer value)
    {
        return orderID(value, 0, value.capacity());
    }

    public EmailEncoder orderID(final byte[] value, final int offset, final int length)
    {
        orderID.wrap(value);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public EmailEncoder orderIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(orderID, value, offset, length);
        orderIDOffset = offset;
        orderIDLength = length;
        return this;
    }

    public EmailEncoder orderID(final byte[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public EmailEncoder orderID(final byte[] value)
    {
        return orderID(value, 0, value.length);
    }

    public boolean hasOrderID()
    {
        return orderIDLength > 0;
    }

    public MutableDirectBuffer orderID()
    {
        return orderID;
    }

    public String orderIDAsString()
    {
        return orderID.getStringWithoutLengthAscii(orderIDOffset, orderIDLength);
    }

    public EmailEncoder orderID(final CharSequence value)
    {
        toBytes(value, orderID);
        orderIDOffset = 0;
        orderIDLength = value.length();
        return this;
    }

    public EmailEncoder orderID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            orderID.wrap(buffer);
            orderIDOffset = value.offset();
            orderIDLength = value.length();
        }
        return this;
    }

    public EmailEncoder orderID(final char[] value)
    {
        return orderID(value, 0, value.length);
    }

    public EmailEncoder orderID(final char[] value, final int length)
    {
        return orderID(value, 0, length);
    }

    public EmailEncoder orderID(final char[] value, final int offset, final int length)
    {
        toBytes(value, orderID, offset, length);
        orderIDOffset = 0;
        orderIDLength = length;
        return this;
    }

    private final MutableDirectBuffer clOrdID = new UnsafeBuffer();

    private int clOrdIDOffset = 0;

    private int clOrdIDLength = 0;

    public EmailEncoder clOrdID(final DirectBuffer value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public EmailEncoder clOrdID(final DirectBuffer value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public EmailEncoder clOrdID(final DirectBuffer value)
    {
        return clOrdID(value, 0, value.capacity());
    }

    public EmailEncoder clOrdID(final byte[] value, final int offset, final int length)
    {
        clOrdID.wrap(value);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public EmailEncoder clOrdIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clOrdID, value, offset, length);
        clOrdIDOffset = offset;
        clOrdIDLength = length;
        return this;
    }

    public EmailEncoder clOrdID(final byte[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public EmailEncoder clOrdID(final byte[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public boolean hasClOrdID()
    {
        return clOrdIDLength > 0;
    }

    public MutableDirectBuffer clOrdID()
    {
        return clOrdID;
    }

    public String clOrdIDAsString()
    {
        return clOrdID.getStringWithoutLengthAscii(clOrdIDOffset, clOrdIDLength);
    }

    public EmailEncoder clOrdID(final CharSequence value)
    {
        toBytes(value, clOrdID);
        clOrdIDOffset = 0;
        clOrdIDLength = value.length();
        return this;
    }

    public EmailEncoder clOrdID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            clOrdID.wrap(buffer);
            clOrdIDOffset = value.offset();
            clOrdIDLength = value.length();
        }
        return this;
    }

    public EmailEncoder clOrdID(final char[] value)
    {
        return clOrdID(value, 0, value.length);
    }

    public EmailEncoder clOrdID(final char[] value, final int length)
    {
        return clOrdID(value, 0, length);
    }

    public EmailEncoder clOrdID(final char[] value, final int offset, final int length)
    {
        toBytes(value, clOrdID, offset, length);
        clOrdIDOffset = 0;
        clOrdIDLength = length;
        return this;
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

    public EmailEncoder noLinesOfTextGroupCounter(int value)
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

    private int rawDataLength;

    private boolean hasRawDataLength;

    public boolean hasRawDataLength()
    {
        return hasRawDataLength;
    }

    public EmailEncoder rawDataLength(int value)
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

    public EmailEncoder rawData(byte[] value)
    {
        rawData = value;
        hasRawData = true;
        return this;
    }

    public byte[] rawData()
    {
        return rawData;
    }

    public EmailEncoder rawDataAsCopy(final byte[] value, final int offset, final int length)
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

        if (emailThreadIDLength > 0)
        {
            buffer.putBytes(position, emailThreadIDHeader, 0, emailThreadIDHeaderLength);
            position += emailThreadIDHeaderLength;
            buffer.putBytes(position, emailThreadID, emailThreadIDOffset, emailThreadIDLength);
            position += emailThreadIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: EmailThreadID");
        }

        if (hasEmailType)
        {
            buffer.putBytes(position, emailTypeHeader, 0, emailTypeHeaderLength);
            position += emailTypeHeaderLength;
            position += buffer.putCharAscii(position, emailType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: EmailType");
        }

        if (origTimeLength > 0)
        {
            buffer.putBytes(position, origTimeHeader, 0, origTimeHeaderLength);
            position += origTimeHeaderLength;
            buffer.putBytes(position, origTime, origTimeOffset, origTimeLength);
            position += origTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (subjectLength > 0)
        {
            buffer.putBytes(position, subjectHeader, 0, subjectHeaderLength);
            position += subjectHeaderLength;
            buffer.putBytes(position, subject, subjectOffset, subjectLength);
            position += subjectLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: Subject");
        }

        if (hasEncodedSubjectLen)
        {
            buffer.putBytes(position, encodedSubjectLenHeader, 0, encodedSubjectLenHeaderLength);
            position += encodedSubjectLenHeaderLength;
            position += buffer.putIntAscii(position, encodedSubjectLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedSubject)
        {
            buffer.putBytes(position, encodedSubjectHeader, 0, encodedSubjectHeaderLength);
            position += encodedSubjectHeaderLength;
            buffer.putBytes(position, encodedSubject);
            position += encodedSubject.length;
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


        if (orderIDLength > 0)
        {
            buffer.putBytes(position, orderIDHeader, 0, orderIDHeaderLength);
            position += orderIDHeaderLength;
            buffer.putBytes(position, orderID, orderIDOffset, orderIDLength);
            position += orderIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (clOrdIDLength > 0)
        {
            buffer.putBytes(position, clOrdIDHeader, 0, clOrdIDHeaderLength);
            position += clOrdIDHeaderLength;
            buffer.putBytes(position, clOrdID, clOrdIDOffset, clOrdIDLength);
            position += clOrdIDLength;
            buffer.putSeparator(position);
            position++;
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
        this.resetEmailThreadID();
        this.resetEmailType();
        this.resetOrigTime();
        this.resetSubject();
        this.resetEncodedSubjectLen();
        this.resetEncodedSubject();
        this.resetOrderID();
        this.resetClOrdID();
        this.resetRawDataLength();
        this.resetRawData();
        this.resetRoutingIDsGroup();
        this.resetRelatedSymGroup();
        this.resetUnderlyingsGroup();
        this.resetLegsGroup();
        this.resetLinesOfTextGroup();
    }

    public void resetEmailThreadID()
    {
        emailThreadIDLength = 0;
    }

    public void resetEmailType()
    {
        emailType = MISSING_CHAR;
    }

    public void resetOrigTime()
    {
        origTimeLength = 0;
    }

    public void resetSubject()
    {
        subjectLength = 0;
    }

    public void resetEncodedSubjectLen()
    {
        hasEncodedSubjectLen = false;
    }

    public void resetEncodedSubject()
    {
        hasEncodedSubject = false;
    }

    public void resetOrderID()
    {
        orderIDLength = 0;
    }

    public void resetClOrdID()
    {
        clOrdIDLength = 0;
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

    public void resetUnderlyingsGroup()
    {
        if (underlyingsGroup != null)
        {
            underlyingsGroup.reset();
        }
        noUnderlyingsGroupCounter = 0;
        hasNoUnderlyingsGroupCounter = false;
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
        builder.append("\"MessageName\": \"Email\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasEmailThreadID())
        {
            indent(builder, level);
            builder.append("\"EmailThreadID\": \"");
            appendBuffer(builder, emailThreadID, emailThreadIDOffset, emailThreadIDLength);
            builder.append("\",\n");
        }

        if (hasEmailType())
        {
            indent(builder, level);
            builder.append("\"EmailType\": \"");
            builder.append(emailType);
            builder.append("\",\n");
        }

        if (hasOrigTime())
        {
            indent(builder, level);
            builder.append("\"OrigTime\": \"");
            appendBuffer(builder, origTime, origTimeOffset, origTimeLength);
            builder.append("\",\n");
        }

        if (hasSubject())
        {
            indent(builder, level);
            builder.append("\"Subject\": \"");
            appendBuffer(builder, subject, subjectOffset, subjectLength);
            builder.append("\",\n");
        }

        if (hasEncodedSubjectLen())
        {
            indent(builder, level);
            builder.append("\"EncodedSubjectLen\": \"");
            builder.append(encodedSubjectLen);
            builder.append("\",\n");
        }

        if (hasEncodedSubject())
        {
            indent(builder, level);
            builder.append("\"EncodedSubject\": \"");
            appendData(builder, encodedSubject, encodedSubjectLen);
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

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            appendBuffer(builder, orderID, orderIDOffset, orderIDLength);
            builder.append("\",\n");
        }

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            appendBuffer(builder, clOrdID, clOrdIDOffset, clOrdIDLength);
            builder.append("\",\n");
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
    public EmailEncoder copyTo(final Encoder encoder)
    {
        return copyTo((EmailEncoder)encoder);
    }

    public EmailEncoder copyTo(final EmailEncoder encoder)
    {
        encoder.reset();
        if (hasEmailThreadID())
        {
            encoder.emailThreadIDAsCopy(emailThreadID.byteArray(), 0, emailThreadIDLength);
        }

        if (hasEmailType())
        {
            encoder.emailType(this.emailType());
        }

        if (hasOrigTime())
        {
            encoder.origTimeAsCopy(origTime.byteArray(), 0, origTimeLength);
        }

        if (hasSubject())
        {
            encoder.subjectAsCopy(subject.byteArray(), 0, subjectLength);
        }

        if (hasEncodedSubjectLen())
        {
            encoder.encodedSubjectLen(this.encodedSubjectLen());
        }

        if (hasEncodedSubject())
        {
            encoder.encodedSubjectAsCopy(this.encodedSubject(), 0, encodedSubjectLen());
            encoder.encodedSubjectLen(encodedSubjectLen());
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

        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
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
