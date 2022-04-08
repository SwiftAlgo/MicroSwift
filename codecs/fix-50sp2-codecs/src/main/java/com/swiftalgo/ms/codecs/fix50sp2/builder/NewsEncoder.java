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

    private static final int newsIDHeaderLength = 5;
    private static final byte[] newsIDHeader = new byte[] {49, 52, 55, 50, (byte) '='};

    private static final int newsCategoryHeaderLength = 5;
    private static final byte[] newsCategoryHeader = new byte[] {49, 52, 55, 51, (byte) '='};

    private static final int languageCodeHeaderLength = 5;
    private static final byte[] languageCodeHeader = new byte[] {49, 52, 55, 52, (byte) '='};

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

    private static final int marketIDHeaderLength = 5;
    private static final byte[] marketIDHeader = new byte[] {49, 51, 48, 49, (byte) '='};

    private static final int marketSegmentIDHeaderLength = 5;
    private static final byte[] marketSegmentIDHeader = new byte[] {49, 51, 48, 48, (byte) '='};

    private static final int uRLLinkHeaderLength = 4;
    private static final byte[] uRLLinkHeader = new byte[] {49, 52, 57, (byte) '='};

    private static final int rawDataLengthHeaderLength = 3;
    private static final byte[] rawDataLengthHeader = new byte[] {57, 53, (byte) '='};

    private static final int rawDataHeaderLength = 3;
    private static final byte[] rawDataHeader = new byte[] {57, 54, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer newsID = new UnsafeBuffer();

    private int newsIDOffset = 0;

    private int newsIDLength = 0;

    public NewsEncoder newsID(final DirectBuffer value, final int offset, final int length)
    {
        newsID.wrap(value);
        newsIDOffset = offset;
        newsIDLength = length;
        return this;
    }

    public NewsEncoder newsID(final DirectBuffer value, final int length)
    {
        return newsID(value, 0, length);
    }

    public NewsEncoder newsID(final DirectBuffer value)
    {
        return newsID(value, 0, value.capacity());
    }

    public NewsEncoder newsID(final byte[] value, final int offset, final int length)
    {
        newsID.wrap(value);
        newsIDOffset = offset;
        newsIDLength = length;
        return this;
    }

    public NewsEncoder newsIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(newsID, value, offset, length);
        newsIDOffset = offset;
        newsIDLength = length;
        return this;
    }

    public NewsEncoder newsID(final byte[] value, final int length)
    {
        return newsID(value, 0, length);
    }

    public NewsEncoder newsID(final byte[] value)
    {
        return newsID(value, 0, value.length);
    }

    public boolean hasNewsID()
    {
        return newsIDLength > 0;
    }

    public MutableDirectBuffer newsID()
    {
        return newsID;
    }

    public String newsIDAsString()
    {
        return newsID.getStringWithoutLengthAscii(newsIDOffset, newsIDLength);
    }

    public NewsEncoder newsID(final CharSequence value)
    {
        toBytes(value, newsID);
        newsIDOffset = 0;
        newsIDLength = value.length();
        return this;
    }

    public NewsEncoder newsID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            newsID.wrap(buffer);
            newsIDOffset = value.offset();
            newsIDLength = value.length();
        }
        return this;
    }

    public NewsEncoder newsID(final char[] value)
    {
        return newsID(value, 0, value.length);
    }

    public NewsEncoder newsID(final char[] value, final int length)
    {
        return newsID(value, 0, length);
    }

    public NewsEncoder newsID(final char[] value, final int offset, final int length)
    {
        toBytes(value, newsID, offset, length);
        newsIDOffset = 0;
        newsIDLength = length;
        return this;
    }

    private final NewsRefGrpEncoder newsRefGrp = new NewsRefGrpEncoder();
    public NewsRefGrpEncoder newsRefGrp()
    {
        return newsRefGrp;
    }

    private int newsCategory;

    private boolean hasNewsCategory;

    public boolean hasNewsCategory()
    {
        return hasNewsCategory;
    }

    public NewsEncoder newsCategory(int value)
    {
        newsCategory = value;
        hasNewsCategory = true;
        return this;
    }

    public int newsCategory()
    {
        return newsCategory;
    }

    public NewsEncoder newsCategory(NewsCategory value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NewsCategory.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: newsCategory Value: " + value );
            }
            if (value == NewsCategory.NULL_VAL)
            {
                return this;
            }
        }
        return newsCategory(value.representation());
    }

    private final MutableDirectBuffer languageCode = new UnsafeBuffer();

    private int languageCodeOffset = 0;

    private int languageCodeLength = 0;

    public NewsEncoder languageCode(final DirectBuffer value, final int offset, final int length)
    {
        languageCode.wrap(value);
        languageCodeOffset = offset;
        languageCodeLength = length;
        return this;
    }

    public NewsEncoder languageCode(final DirectBuffer value, final int length)
    {
        return languageCode(value, 0, length);
    }

    public NewsEncoder languageCode(final DirectBuffer value)
    {
        return languageCode(value, 0, value.capacity());
    }

    public NewsEncoder languageCode(final byte[] value, final int offset, final int length)
    {
        languageCode.wrap(value);
        languageCodeOffset = offset;
        languageCodeLength = length;
        return this;
    }

    public NewsEncoder languageCodeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(languageCode, value, offset, length);
        languageCodeOffset = offset;
        languageCodeLength = length;
        return this;
    }

    public NewsEncoder languageCode(final byte[] value, final int length)
    {
        return languageCode(value, 0, length);
    }

    public NewsEncoder languageCode(final byte[] value)
    {
        return languageCode(value, 0, value.length);
    }

    public boolean hasLanguageCode()
    {
        return languageCodeLength > 0;
    }

    public MutableDirectBuffer languageCode()
    {
        return languageCode;
    }

    public String languageCodeAsString()
    {
        return languageCode.getStringWithoutLengthAscii(languageCodeOffset, languageCodeLength);
    }

    public NewsEncoder languageCode(final CharSequence value)
    {
        toBytes(value, languageCode);
        languageCodeOffset = 0;
        languageCodeLength = value.length();
        return this;
    }

    public NewsEncoder languageCode(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            languageCode.wrap(buffer);
            languageCodeOffset = value.offset();
            languageCodeLength = value.length();
        }
        return this;
    }

    public NewsEncoder languageCode(final char[] value)
    {
        return languageCode(value, 0, value.length);
    }

    public NewsEncoder languageCode(final char[] value, final int length)
    {
        return languageCode(value, 0, length);
    }

    public NewsEncoder languageCode(final char[] value, final int offset, final int length)
    {
        toBytes(value, languageCode, offset, length);
        languageCodeOffset = 0;
        languageCodeLength = length;
        return this;
    }

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

    private final RoutingGrpEncoder routingGrp = new RoutingGrpEncoder();
    public RoutingGrpEncoder routingGrp()
    {
        return routingGrp;
    }

    private final MutableDirectBuffer marketID = new UnsafeBuffer();

    private int marketIDOffset = 0;

    private int marketIDLength = 0;

    public NewsEncoder marketID(final DirectBuffer value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public NewsEncoder marketID(final DirectBuffer value, final int length)
    {
        return marketID(value, 0, length);
    }

    public NewsEncoder marketID(final DirectBuffer value)
    {
        return marketID(value, 0, value.capacity());
    }

    public NewsEncoder marketID(final byte[] value, final int offset, final int length)
    {
        marketID.wrap(value);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public NewsEncoder marketIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketID, value, offset, length);
        marketIDOffset = offset;
        marketIDLength = length;
        return this;
    }

    public NewsEncoder marketID(final byte[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public NewsEncoder marketID(final byte[] value)
    {
        return marketID(value, 0, value.length);
    }

    public boolean hasMarketID()
    {
        return marketIDLength > 0;
    }

    public MutableDirectBuffer marketID()
    {
        return marketID;
    }

    public String marketIDAsString()
    {
        return marketID.getStringWithoutLengthAscii(marketIDOffset, marketIDLength);
    }

    public NewsEncoder marketID(final CharSequence value)
    {
        toBytes(value, marketID);
        marketIDOffset = 0;
        marketIDLength = value.length();
        return this;
    }

    public NewsEncoder marketID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketID.wrap(buffer);
            marketIDOffset = value.offset();
            marketIDLength = value.length();
        }
        return this;
    }

    public NewsEncoder marketID(final char[] value)
    {
        return marketID(value, 0, value.length);
    }

    public NewsEncoder marketID(final char[] value, final int length)
    {
        return marketID(value, 0, length);
    }

    public NewsEncoder marketID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketID, offset, length);
        marketIDOffset = 0;
        marketIDLength = length;
        return this;
    }

    private final MutableDirectBuffer marketSegmentID = new UnsafeBuffer();

    private int marketSegmentIDOffset = 0;

    private int marketSegmentIDLength = 0;

    public NewsEncoder marketSegmentID(final DirectBuffer value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public NewsEncoder marketSegmentID(final DirectBuffer value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public NewsEncoder marketSegmentID(final DirectBuffer value)
    {
        return marketSegmentID(value, 0, value.capacity());
    }

    public NewsEncoder marketSegmentID(final byte[] value, final int offset, final int length)
    {
        marketSegmentID.wrap(value);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public NewsEncoder marketSegmentIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(marketSegmentID, value, offset, length);
        marketSegmentIDOffset = offset;
        marketSegmentIDLength = length;
        return this;
    }

    public NewsEncoder marketSegmentID(final byte[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public NewsEncoder marketSegmentID(final byte[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public boolean hasMarketSegmentID()
    {
        return marketSegmentIDLength > 0;
    }

    public MutableDirectBuffer marketSegmentID()
    {
        return marketSegmentID;
    }

    public String marketSegmentIDAsString()
    {
        return marketSegmentID.getStringWithoutLengthAscii(marketSegmentIDOffset, marketSegmentIDLength);
    }

    public NewsEncoder marketSegmentID(final CharSequence value)
    {
        toBytes(value, marketSegmentID);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = value.length();
        return this;
    }

    public NewsEncoder marketSegmentID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            marketSegmentID.wrap(buffer);
            marketSegmentIDOffset = value.offset();
            marketSegmentIDLength = value.length();
        }
        return this;
    }

    public NewsEncoder marketSegmentID(final char[] value)
    {
        return marketSegmentID(value, 0, value.length);
    }

    public NewsEncoder marketSegmentID(final char[] value, final int length)
    {
        return marketSegmentID(value, 0, length);
    }

    public NewsEncoder marketSegmentID(final char[] value, final int offset, final int length)
    {
        toBytes(value, marketSegmentID, offset, length);
        marketSegmentIDOffset = 0;
        marketSegmentIDLength = length;
        return this;
    }

    private final InstrmtGrpEncoder instrmtGrp = new InstrmtGrpEncoder();
    public InstrmtGrpEncoder instrmtGrp()
    {
        return instrmtGrp;
    }

    private final InstrmtLegGrpEncoder instrmtLegGrp = new InstrmtLegGrpEncoder();
    public InstrmtLegGrpEncoder instrmtLegGrp()
    {
        return instrmtLegGrp;
    }

    private final UndInstrmtGrpEncoder undInstrmtGrp = new UndInstrmtGrpEncoder();
    public UndInstrmtGrpEncoder undInstrmtGrp()
    {
        return undInstrmtGrp;
    }

    private final LinesOfTextGrpEncoder linesOfTextGrp = new LinesOfTextGrpEncoder();
    public LinesOfTextGrpEncoder linesOfTextGrp()
    {
        return linesOfTextGrp;
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

            position += applicationSequenceControl.encode(buffer, position);

        if (newsIDLength > 0)
        {
            buffer.putBytes(position, newsIDHeader, 0, newsIDHeaderLength);
            position += newsIDHeaderLength;
            buffer.putBytes(position, newsID, newsIDOffset, newsIDLength);
            position += newsIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += newsRefGrp.encode(buffer, position);

        if (hasNewsCategory)
        {
            buffer.putBytes(position, newsCategoryHeader, 0, newsCategoryHeaderLength);
            position += newsCategoryHeaderLength;
            position += buffer.putIntAscii(position, newsCategory);
            buffer.putSeparator(position);
            position++;
        }

        if (languageCodeLength > 0)
        {
            buffer.putBytes(position, languageCodeHeader, 0, languageCodeHeaderLength);
            position += languageCodeHeaderLength;
            buffer.putBytes(position, languageCode, languageCodeOffset, languageCodeLength);
            position += languageCodeLength;
            buffer.putSeparator(position);
            position++;
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

            position += routingGrp.encode(buffer, position);

        if (marketIDLength > 0)
        {
            buffer.putBytes(position, marketIDHeader, 0, marketIDHeaderLength);
            position += marketIDHeaderLength;
            buffer.putBytes(position, marketID, marketIDOffset, marketIDLength);
            position += marketIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (marketSegmentIDLength > 0)
        {
            buffer.putBytes(position, marketSegmentIDHeader, 0, marketSegmentIDHeaderLength);
            position += marketSegmentIDHeaderLength;
            buffer.putBytes(position, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            position += marketSegmentIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += instrmtGrp.encode(buffer, position);

            position += instrmtLegGrp.encode(buffer, position);

            position += undInstrmtGrp.encode(buffer, position);

            position += linesOfTextGrp.encode(buffer, position);

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
        this.resetNewsID();
        this.resetNewsCategory();
        this.resetLanguageCode();
        this.resetOrigTime();
        this.resetUrgency();
        this.resetHeadline();
        this.resetEncodedHeadlineLen();
        this.resetEncodedHeadline();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetURLLink();
        this.resetRawDataLength();
        this.resetRawData();
        applicationSequenceControl.reset();
        newsRefGrp.reset();
        routingGrp.reset();
        instrmtGrp.reset();
        instrmtLegGrp.reset();
        undInstrmtGrp.reset();
        linesOfTextGrp.reset();
    }

    public void resetNewsID()
    {
        newsIDLength = 0;
    }

    public void resetNewsCategory()
    {
        hasNewsCategory = false;
    }

    public void resetLanguageCode()
    {
        languageCodeLength = 0;
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

    public void resetMarketID()
    {
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        marketSegmentIDLength = 0;
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
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNewsID())
        {
            indent(builder, level);
            builder.append("\"NewsID\": \"");
            appendBuffer(builder, newsID, newsIDOffset, newsIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"NewsRefGrp\": ");
    newsRefGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasNewsCategory())
        {
            indent(builder, level);
            builder.append("\"NewsCategory\": \"");
            builder.append(newsCategory);
            builder.append("\",\n");
        }

        if (hasLanguageCode())
        {
            indent(builder, level);
            builder.append("\"LanguageCode\": \"");
            appendBuffer(builder, languageCode, languageCodeOffset, languageCodeLength);
            builder.append("\",\n");
        }

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

    indent(builder, level);
    builder.append("\"RoutingGrp\": ");
    routingGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            appendBuffer(builder, marketID, marketIDOffset, marketIDLength);
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            appendBuffer(builder, marketSegmentID, marketSegmentIDOffset, marketSegmentIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"InstrmtGrp\": ");
    instrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtLegGrp\": ");
    instrmtLegGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"UndInstrmtGrp\": ");
    undInstrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"LinesOfTextGrp\": ");
    linesOfTextGrp.appendTo(builder, level + 1);
    builder.append("\n");

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

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasNewsID())
        {
            encoder.newsIDAsCopy(newsID.byteArray(), 0, newsIDLength);
        }


        newsRefGrp.copyTo(encoder.newsRefGrp());
        if (hasNewsCategory())
        {
            encoder.newsCategory(this.newsCategory());
        }

        if (hasLanguageCode())
        {
            encoder.languageCodeAsCopy(languageCode.byteArray(), 0, languageCodeLength);
        }

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


        routingGrp.copyTo(encoder.routingGrp());
        if (hasMarketID())
        {
            encoder.marketIDAsCopy(marketID.byteArray(), 0, marketIDLength);
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentIDAsCopy(marketSegmentID.byteArray(), 0, marketSegmentIDLength);
        }


        instrmtGrp.copyTo(encoder.instrmtGrp());

        instrmtLegGrp.copyTo(encoder.instrmtLegGrp());

        undInstrmtGrp.copyTo(encoder.undInstrmtGrp());

        linesOfTextGrp.copyTo(encoder.linesOfTextGrp());
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
