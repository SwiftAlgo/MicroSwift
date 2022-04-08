/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.HeaderEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrailerEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.*;


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

    private static final int orderIDHeaderLength = 3;
    private static final byte[] orderIDHeader = new byte[] {51, 55, (byte) '='};

    private static final int clOrdIDHeaderLength = 3;
    private static final byte[] clOrdIDHeader = new byte[] {49, 49, (byte) '='};

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

    private final RoutingGrpEncoder routingGrp = new RoutingGrpEncoder();
    public RoutingGrpEncoder routingGrp()
    {
        return routingGrp;
    }

    private final InstrmtGrpEncoder instrmtGrp = new InstrmtGrpEncoder();
    public InstrmtGrpEncoder instrmtGrp()
    {
        return instrmtGrp;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
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

    private final LinesOfTextGrpEncoder linesOfTextGrp = new LinesOfTextGrpEncoder();
    public LinesOfTextGrpEncoder linesOfTextGrp()
    {
        return linesOfTextGrp;
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

            position += routingGrp.encode(buffer, position);

            position += instrmtGrp.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

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

            position += linesOfTextGrp.encode(buffer, position);

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
        routingGrp.reset();
        instrmtGrp.reset();
        undInstrmtGrp.reset();
        instrmtLegGrp.reset();
        linesOfTextGrp.reset();
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

    indent(builder, level);
    builder.append("\"RoutingGrp\": ");
    routingGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtGrp\": ");
    instrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

    indent(builder, level);
    builder.append("\"LinesOfTextGrp\": ");
    linesOfTextGrp.appendTo(builder, level + 1);
    builder.append("\n");

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


        routingGrp.copyTo(encoder.routingGrp());

        instrmtGrp.copyTo(encoder.instrmtGrp());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());
        if (hasOrderID())
        {
            encoder.orderIDAsCopy(orderID.byteArray(), 0, orderIDLength);
        }

        if (hasClOrdID())
        {
            encoder.clOrdIDAsCopy(clOrdID.byteArray(), 0, clOrdIDLength);
        }


        linesOfTextGrp.copyTo(encoder.linesOfTextGrp());
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
