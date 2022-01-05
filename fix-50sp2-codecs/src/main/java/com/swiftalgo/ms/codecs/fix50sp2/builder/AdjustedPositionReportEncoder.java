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


public class AdjustedPositionReportEncoder implements Encoder
{
    public long messageType()
    {
        return 19522L;
    }

    public AdjustedPositionReportEncoder()
    {
        header.msgType("BL");
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

    private static final int posMaintRptIDHeaderLength = 4;
    private static final byte[] posMaintRptIDHeader = new byte[] {55, 50, 49, (byte) '='};

    private static final int posReqTypeHeaderLength = 4;
    private static final byte[] posReqTypeHeader = new byte[] {55, 50, 52, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int settlSessIDHeaderLength = 4;
    private static final byte[] settlSessIDHeader = new byte[] {55, 49, 54, (byte) '='};

    private static final int posMaintRptRefIDHeaderLength = 4;
    private static final byte[] posMaintRptRefIDHeader = new byte[] {55, 49, 52, (byte) '='};

    private static final int settlPriceHeaderLength = 4;
    private static final byte[] settlPriceHeader = new byte[] {55, 51, 48, (byte) '='};

    private static final int priorSettlPriceHeaderLength = 4;
    private static final byte[] priorSettlPriceHeader = new byte[] {55, 51, 52, (byte) '='};

    private final MutableDirectBuffer posMaintRptID = new UnsafeBuffer();

    private int posMaintRptIDOffset = 0;

    private int posMaintRptIDLength = 0;

    public AdjustedPositionReportEncoder posMaintRptID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptID(final DirectBuffer value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptID(final DirectBuffer value)
    {
        return posMaintRptID(value, 0, value.capacity());
    }

    public AdjustedPositionReportEncoder posMaintRptID(final byte[] value, final int offset, final int length)
    {
        posMaintRptID.wrap(value);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posMaintRptID, value, offset, length);
        posMaintRptIDOffset = offset;
        posMaintRptIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptID(final byte[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptID(final byte[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public boolean hasPosMaintRptID()
    {
        return posMaintRptIDLength > 0;
    }

    public MutableDirectBuffer posMaintRptID()
    {
        return posMaintRptID;
    }

    public String posMaintRptIDAsString()
    {
        return posMaintRptID.getStringWithoutLengthAscii(posMaintRptIDOffset, posMaintRptIDLength);
    }

    public AdjustedPositionReportEncoder posMaintRptID(final CharSequence value)
    {
        toBytes(value, posMaintRptID);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = value.length();
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptID.wrap(buffer);
            posMaintRptIDOffset = value.offset();
            posMaintRptIDLength = value.length();
        }
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptID(final char[] value)
    {
        return posMaintRptID(value, 0, value.length);
    }

    public AdjustedPositionReportEncoder posMaintRptID(final char[] value, final int length)
    {
        return posMaintRptID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posMaintRptID, offset, length);
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = length;
        return this;
    }

    private int posReqType;

    private boolean hasPosReqType;

    public boolean hasPosReqType()
    {
        return hasPosReqType;
    }

    public AdjustedPositionReportEncoder posReqType(int value)
    {
        posReqType = value;
        hasPosReqType = true;
        return this;
    }

    public int posReqType()
    {
        return posReqType;
    }

    public AdjustedPositionReportEncoder posReqType(PosReqType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == PosReqType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: posReqType Value: " + value );
            }
            if (value == PosReqType.NULL_VAL)
            {
                return this;
            }
        }
        return posReqType(value.representation());
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public AdjustedPositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public AdjustedPositionReportEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public AdjustedPositionReportEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public AdjustedPositionReportEncoder clearingBusinessDate(final byte[] value)
    {
        return clearingBusinessDate(value, 0, value.length);
    }

    public boolean hasClearingBusinessDate()
    {
        return clearingBusinessDateLength > 0;
    }

    public MutableDirectBuffer clearingBusinessDate()
    {
        return clearingBusinessDate;
    }

    public String clearingBusinessDateAsString()
    {
        return clearingBusinessDate.getStringWithoutLengthAscii(clearingBusinessDateOffset, clearingBusinessDateLength);
    }

    private final MutableDirectBuffer settlSessID = new UnsafeBuffer();

    private int settlSessIDOffset = 0;

    private int settlSessIDLength = 0;

    public AdjustedPositionReportEncoder settlSessID(final DirectBuffer value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder settlSessID(final DirectBuffer value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AdjustedPositionReportEncoder settlSessID(final DirectBuffer value)
    {
        return settlSessID(value, 0, value.capacity());
    }

    public AdjustedPositionReportEncoder settlSessID(final byte[] value, final int offset, final int length)
    {
        settlSessID.wrap(value);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder settlSessIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlSessID, value, offset, length);
        settlSessIDOffset = offset;
        settlSessIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder settlSessID(final byte[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AdjustedPositionReportEncoder settlSessID(final byte[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public boolean hasSettlSessID()
    {
        return settlSessIDLength > 0;
    }

    public MutableDirectBuffer settlSessID()
    {
        return settlSessID;
    }

    public String settlSessIDAsString()
    {
        return settlSessID.getStringWithoutLengthAscii(settlSessIDOffset, settlSessIDLength);
    }

    public AdjustedPositionReportEncoder settlSessID(final CharSequence value)
    {
        toBytes(value, settlSessID);
        settlSessIDOffset = 0;
        settlSessIDLength = value.length();
        return this;
    }

    public AdjustedPositionReportEncoder settlSessID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlSessID.wrap(buffer);
            settlSessIDOffset = value.offset();
            settlSessIDLength = value.length();
        }
        return this;
    }

    public AdjustedPositionReportEncoder settlSessID(final char[] value)
    {
        return settlSessID(value, 0, value.length);
    }

    public AdjustedPositionReportEncoder settlSessID(final char[] value, final int length)
    {
        return settlSessID(value, 0, length);
    }

    public AdjustedPositionReportEncoder settlSessID(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlSessID, offset, length);
        settlSessIDOffset = 0;
        settlSessIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder settlSessID(SettlSessID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlSessID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlSessID Value: " + value );
            }
            if (value == SettlSessID.NULL_VAL)
            {
                return this;
            }
        }
        return settlSessID(value.representation());
    }

    private final MutableDirectBuffer posMaintRptRefID = new UnsafeBuffer();

    private int posMaintRptRefIDOffset = 0;

    private int posMaintRptRefIDLength = 0;

    public AdjustedPositionReportEncoder posMaintRptRefID(final DirectBuffer value, final int offset, final int length)
    {
        posMaintRptRefID.wrap(value);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final DirectBuffer value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final DirectBuffer value)
    {
        return posMaintRptRefID(value, 0, value.capacity());
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final byte[] value, final int offset, final int length)
    {
        posMaintRptRefID.wrap(value);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptRefIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(posMaintRptRefID, value, offset, length);
        posMaintRptRefIDOffset = offset;
        posMaintRptRefIDLength = length;
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final byte[] value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final byte[] value)
    {
        return posMaintRptRefID(value, 0, value.length);
    }

    public boolean hasPosMaintRptRefID()
    {
        return posMaintRptRefIDLength > 0;
    }

    public MutableDirectBuffer posMaintRptRefID()
    {
        return posMaintRptRefID;
    }

    public String posMaintRptRefIDAsString()
    {
        return posMaintRptRefID.getStringWithoutLengthAscii(posMaintRptRefIDOffset, posMaintRptRefIDLength);
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final CharSequence value)
    {
        toBytes(value, posMaintRptRefID);
        posMaintRptRefIDOffset = 0;
        posMaintRptRefIDLength = value.length();
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            posMaintRptRefID.wrap(buffer);
            posMaintRptRefIDOffset = value.offset();
            posMaintRptRefIDLength = value.length();
        }
        return this;
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final char[] value)
    {
        return posMaintRptRefID(value, 0, value.length);
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final char[] value, final int length)
    {
        return posMaintRptRefID(value, 0, length);
    }

    public AdjustedPositionReportEncoder posMaintRptRefID(final char[] value, final int offset, final int length)
    {
        toBytes(value, posMaintRptRefID, offset, length);
        posMaintRptRefIDOffset = 0;
        posMaintRptRefIDLength = length;
        return this;
    }

    private final PartiesEncoder parties = new PartiesEncoder();
    public PartiesEncoder parties()
    {
        return parties;
    }

    private final PositionQtyEncoder positionQty = new PositionQtyEncoder();
    public PositionQtyEncoder positionQty()
    {
        return positionQty;
    }

    private final InstrmtGrpEncoder instrmtGrp = new InstrmtGrpEncoder();
    public InstrmtGrpEncoder instrmtGrp()
    {
        return instrmtGrp;
    }

    private final DecimalFloat settlPrice = new DecimalFloat();

    private boolean hasSettlPrice;

    public boolean hasSettlPrice()
    {
        return hasSettlPrice;
    }

    public AdjustedPositionReportEncoder settlPrice(DecimalFloat value)
    {
        settlPrice.set(value);
        hasSettlPrice = true;
        return this;
    }

    public AdjustedPositionReportEncoder settlPrice(long value, int scale)
    {
        settlPrice.set(value, scale);
        hasSettlPrice = true;
        return this;
    }

    public DecimalFloat settlPrice()
    {
        return settlPrice;
    }

    private final DecimalFloat priorSettlPrice = new DecimalFloat();

    private boolean hasPriorSettlPrice;

    public boolean hasPriorSettlPrice()
    {
        return hasPriorSettlPrice;
    }

    public AdjustedPositionReportEncoder priorSettlPrice(DecimalFloat value)
    {
        priorSettlPrice.set(value);
        hasPriorSettlPrice = true;
        return this;
    }

    public AdjustedPositionReportEncoder priorSettlPrice(long value, int scale)
    {
        priorSettlPrice.set(value, scale);
        hasPriorSettlPrice = true;
        return this;
    }

    public DecimalFloat priorSettlPrice()
    {
        return priorSettlPrice;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (posMaintRptIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptIDHeader, 0, posMaintRptIDHeaderLength);
            position += posMaintRptIDHeaderLength;
            buffer.putBytes(position, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            position += posMaintRptIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: PosMaintRptID");
        }

        if (hasPosReqType)
        {
            buffer.putBytes(position, posReqTypeHeader, 0, posReqTypeHeaderLength);
            position += posReqTypeHeaderLength;
            position += buffer.putIntAscii(position, posReqType);
            buffer.putSeparator(position);
            position++;
        }

        if (clearingBusinessDateLength > 0)
        {
            buffer.putBytes(position, clearingBusinessDateHeader, 0, clearingBusinessDateHeaderLength);
            position += clearingBusinessDateHeaderLength;
            buffer.putBytes(position, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            position += clearingBusinessDateLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ClearingBusinessDate");
        }

        if (settlSessIDLength > 0)
        {
            buffer.putBytes(position, settlSessIDHeader, 0, settlSessIDHeaderLength);
            position += settlSessIDHeaderLength;
            buffer.putBytes(position, settlSessID, settlSessIDOffset, settlSessIDLength);
            position += settlSessIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (posMaintRptRefIDLength > 0)
        {
            buffer.putBytes(position, posMaintRptRefIDHeader, 0, posMaintRptRefIDHeaderLength);
            position += posMaintRptRefIDHeaderLength;
            buffer.putBytes(position, posMaintRptRefID, posMaintRptRefIDOffset, posMaintRptRefIDLength);
            position += posMaintRptRefIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += parties.encode(buffer, position);

            position += positionQty.encode(buffer, position);

            position += instrmtGrp.encode(buffer, position);

        if (hasSettlPrice)
        {
            buffer.putBytes(position, settlPriceHeader, 0, settlPriceHeaderLength);
            position += settlPriceHeaderLength;
            position += buffer.putFloatAscii(position, settlPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasPriorSettlPrice)
        {
            buffer.putBytes(position, priorSettlPriceHeader, 0, priorSettlPriceHeaderLength);
            position += priorSettlPriceHeaderLength;
            position += buffer.putFloatAscii(position, priorSettlPrice);
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
        this.resetPosMaintRptID();
        this.resetPosReqType();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetPosMaintRptRefID();
        this.resetSettlPrice();
        this.resetPriorSettlPrice();
        parties.reset();
        positionQty.reset();
        instrmtGrp.reset();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDLength = 0;
    }

    public void resetPosReqType()
    {
        hasPosReqType = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetSettlSessID()
    {
        settlSessIDLength = 0;
    }

    public void resetPosMaintRptRefID()
    {
        posMaintRptRefIDLength = 0;
    }

    public void resetSettlPrice()
    {
        hasSettlPrice = false;
    }

    public void resetPriorSettlPrice()
    {
        hasPriorSettlPrice = false;
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
        builder.append("\"MessageName\": \"AdjustedPositionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasPosMaintRptID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptID\": \"");
            appendBuffer(builder, posMaintRptID, posMaintRptIDOffset, posMaintRptIDLength);
            builder.append("\",\n");
        }

        if (hasPosReqType())
        {
            indent(builder, level);
            builder.append("\"PosReqType\": \"");
            builder.append(posReqType);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            appendBuffer(builder, settlSessID, settlSessIDOffset, settlSessIDLength);
            builder.append("\",\n");
        }

        if (hasPosMaintRptRefID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptRefID\": \"");
            appendBuffer(builder, posMaintRptRefID, posMaintRptRefIDOffset, posMaintRptRefIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"Parties\": ");
    parties.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"PositionQty\": ");
    positionQty.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"InstrmtGrp\": ");
    instrmtGrp.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSettlPrice())
        {
            indent(builder, level);
            builder.append("\"SettlPrice\": \"");
            settlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriorSettlPrice())
        {
            indent(builder, level);
            builder.append("\"PriorSettlPrice\": \"");
            priorSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AdjustedPositionReportEncoder copyTo(final Encoder encoder)
    {
        return copyTo((AdjustedPositionReportEncoder)encoder);
    }

    public AdjustedPositionReportEncoder copyTo(final AdjustedPositionReportEncoder encoder)
    {
        encoder.reset();
        if (hasPosMaintRptID())
        {
            encoder.posMaintRptIDAsCopy(posMaintRptID.byteArray(), 0, posMaintRptIDLength);
        }

        if (hasPosReqType())
        {
            encoder.posReqType(this.posReqType());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }

        if (hasSettlSessID())
        {
            encoder.settlSessIDAsCopy(settlSessID.byteArray(), 0, settlSessIDLength);
        }

        if (hasPosMaintRptRefID())
        {
            encoder.posMaintRptRefIDAsCopy(posMaintRptRefID.byteArray(), 0, posMaintRptRefIDLength);
        }


        parties.copyTo(encoder.parties());

        positionQty.copyTo(encoder.positionQty());

        instrmtGrp.copyTo(encoder.instrmtGrp());
        if (hasSettlPrice())
        {
            encoder.settlPrice(this.settlPrice());
        }

        if (hasPriorSettlPrice())
        {
            encoder.priorSettlPrice(this.priorSettlPrice());
        }
        return encoder;
    }

}
