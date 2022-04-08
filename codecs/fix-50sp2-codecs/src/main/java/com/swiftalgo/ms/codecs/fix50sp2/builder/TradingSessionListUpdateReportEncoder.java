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


public class TradingSessionListUpdateReportEncoder implements Encoder
{
    public long messageType()
    {
        return 21314L;
    }

    public TradingSessionListUpdateReportEncoder()
    {
        header.msgType("BS");
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

    private static final int tradSesReqIDHeaderLength = 4;
    private static final byte[] tradSesReqIDHeader = new byte[] {51, 51, 53, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private final MutableDirectBuffer tradSesReqID = new UnsafeBuffer();

    private int tradSesReqIDOffset = 0;

    private int tradSesReqIDLength = 0;

    public TradingSessionListUpdateReportEncoder tradSesReqID(final DirectBuffer value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final DirectBuffer value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final DirectBuffer value)
    {
        return tradSesReqID(value, 0, value.capacity());
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final byte[] value, final int offset, final int length)
    {
        tradSesReqID.wrap(value);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionListUpdateReportEncoder tradSesReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradSesReqID, value, offset, length);
        tradSesReqIDOffset = offset;
        tradSesReqIDLength = length;
        return this;
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final byte[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final byte[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public boolean hasTradSesReqID()
    {
        return tradSesReqIDLength > 0;
    }

    public MutableDirectBuffer tradSesReqID()
    {
        return tradSesReqID;
    }

    public String tradSesReqIDAsString()
    {
        return tradSesReqID.getStringWithoutLengthAscii(tradSesReqIDOffset, tradSesReqIDLength);
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final CharSequence value)
    {
        toBytes(value, tradSesReqID);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = value.length();
        return this;
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradSesReqID.wrap(buffer);
            tradSesReqIDOffset = value.offset();
            tradSesReqIDLength = value.length();
        }
        return this;
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final char[] value)
    {
        return tradSesReqID(value, 0, value.length);
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final char[] value, final int length)
    {
        return tradSesReqID(value, 0, length);
    }

    public TradingSessionListUpdateReportEncoder tradSesReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradSesReqID, offset, length);
        tradSesReqIDOffset = 0;
        tradSesReqIDLength = length;
        return this;
    }

    private final TrdSessLstGrpEncoder trdSessLstGrp = new TrdSessLstGrpEncoder();
    public TrdSessLstGrpEncoder trdSessLstGrp()
    {
        return trdSessLstGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (tradSesReqIDLength > 0)
        {
            buffer.putBytes(position, tradSesReqIDHeader, 0, tradSesReqIDHeaderLength);
            position += tradSesReqIDHeaderLength;
            buffer.putBytes(position, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
            position += tradSesReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += trdSessLstGrp.encode(buffer, position);
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
        this.resetTradSesReqID();
        applicationSequenceControl.reset();
        trdSessLstGrp.reset();
    }

    public void resetTradSesReqID()
    {
        tradSesReqIDLength = 0;
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
        builder.append("\"MessageName\": \"TradingSessionListUpdateReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTradSesReqID())
        {
            indent(builder, level);
            builder.append("\"TradSesReqID\": \"");
            appendBuffer(builder, tradSesReqID, tradSesReqIDOffset, tradSesReqIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"TrdSessLstGrp\": ");
    trdSessLstGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionListUpdateReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionListUpdateReportEncoder)encoder);
    }

    public TradingSessionListUpdateReportEncoder copyTo(final TradingSessionListUpdateReportEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasTradSesReqID())
        {
            encoder.tradSesReqIDAsCopy(tradSesReqID.byteArray(), 0, tradSesReqIDLength);
        }


        trdSessLstGrp.copyTo(encoder.trdSessLstGrp());        return encoder;
    }

}
