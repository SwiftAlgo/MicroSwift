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


public class ListStatusEncoder implements Encoder
{
    public long messageType()
    {
        return 78L;
    }

    public ListStatusEncoder()
    {
        header.msgType("N");
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

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int listStatusTypeHeaderLength = 4;
    private static final byte[] listStatusTypeHeader = new byte[] {52, 50, 57, (byte) '='};

    private static final int noRptsHeaderLength = 3;
    private static final byte[] noRptsHeader = new byte[] {56, 50, (byte) '='};

    private static final int listOrderStatusHeaderLength = 4;
    private static final byte[] listOrderStatusHeader = new byte[] {52, 51, 49, (byte) '='};

    private static final int contingencyTypeHeaderLength = 5;
    private static final byte[] contingencyTypeHeader = new byte[] {49, 51, 56, 53, (byte) '='};

    private static final int listRejectReasonHeaderLength = 5;
    private static final byte[] listRejectReasonHeader = new byte[] {49, 51, 56, 54, (byte) '='};

    private static final int rptSeqHeaderLength = 3;
    private static final byte[] rptSeqHeader = new byte[] {56, 51, (byte) '='};

    private static final int listStatusTextHeaderLength = 4;
    private static final byte[] listStatusTextHeader = new byte[] {52, 52, 52, (byte) '='};

    private static final int encodedListStatusTextLenHeaderLength = 4;
    private static final byte[] encodedListStatusTextLenHeader = new byte[] {52, 52, 53, (byte) '='};

    private static final int encodedListStatusTextHeaderLength = 4;
    private static final byte[] encodedListStatusTextHeader = new byte[] {52, 52, 54, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int totNoOrdersHeaderLength = 3;
    private static final byte[] totNoOrdersHeader = new byte[] {54, 56, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public ListStatusEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ListStatusEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public ListStatusEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public ListStatusEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ListStatusEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public ListStatusEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public ListStatusEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    public MutableDirectBuffer listID()
    {
        return listID;
    }

    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    public ListStatusEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public ListStatusEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    public ListStatusEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public ListStatusEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public ListStatusEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private int listStatusType;

    private boolean hasListStatusType;

    public boolean hasListStatusType()
    {
        return hasListStatusType;
    }

    public ListStatusEncoder listStatusType(int value)
    {
        listStatusType = value;
        hasListStatusType = true;
        return this;
    }

    public int listStatusType()
    {
        return listStatusType;
    }

    public ListStatusEncoder listStatusType(ListStatusType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ListStatusType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: listStatusType Value: " + value );
            }
            if (value == ListStatusType.NULL_VAL)
            {
                return this;
            }
        }
        return listStatusType(value.representation());
    }

    private int noRpts;

    private boolean hasNoRpts;

    public boolean hasNoRpts()
    {
        return hasNoRpts;
    }

    public ListStatusEncoder noRpts(int value)
    {
        noRpts = value;
        hasNoRpts = true;
        return this;
    }

    public int noRpts()
    {
        return noRpts;
    }

    private int listOrderStatus;

    private boolean hasListOrderStatus;

    public boolean hasListOrderStatus()
    {
        return hasListOrderStatus;
    }

    public ListStatusEncoder listOrderStatus(int value)
    {
        listOrderStatus = value;
        hasListOrderStatus = true;
        return this;
    }

    public int listOrderStatus()
    {
        return listOrderStatus;
    }

    public ListStatusEncoder listOrderStatus(ListOrderStatus value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ListOrderStatus.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: listOrderStatus Value: " + value );
            }
            if (value == ListOrderStatus.NULL_VAL)
            {
                return this;
            }
        }
        return listOrderStatus(value.representation());
    }

    private int contingencyType;

    private boolean hasContingencyType;

    public boolean hasContingencyType()
    {
        return hasContingencyType;
    }

    public ListStatusEncoder contingencyType(int value)
    {
        contingencyType = value;
        hasContingencyType = true;
        return this;
    }

    public int contingencyType()
    {
        return contingencyType;
    }

    public ListStatusEncoder contingencyType(ContingencyType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ContingencyType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: contingencyType Value: " + value );
            }
            if (value == ContingencyType.NULL_VAL)
            {
                return this;
            }
        }
        return contingencyType(value.representation());
    }

    private int listRejectReason;

    private boolean hasListRejectReason;

    public boolean hasListRejectReason()
    {
        return hasListRejectReason;
    }

    public ListStatusEncoder listRejectReason(int value)
    {
        listRejectReason = value;
        hasListRejectReason = true;
        return this;
    }

    public int listRejectReason()
    {
        return listRejectReason;
    }

    public ListStatusEncoder listRejectReason(ListRejectReason value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == ListRejectReason.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: listRejectReason Value: " + value );
            }
            if (value == ListRejectReason.NULL_VAL)
            {
                return this;
            }
        }
        return listRejectReason(value.representation());
    }

    private int rptSeq;

    private boolean hasRptSeq;

    public boolean hasRptSeq()
    {
        return hasRptSeq;
    }

    public ListStatusEncoder rptSeq(int value)
    {
        rptSeq = value;
        hasRptSeq = true;
        return this;
    }

    public int rptSeq()
    {
        return rptSeq;
    }

    private final MutableDirectBuffer listStatusText = new UnsafeBuffer();

    private int listStatusTextOffset = 0;

    private int listStatusTextLength = 0;

    public ListStatusEncoder listStatusText(final DirectBuffer value, final int offset, final int length)
    {
        listStatusText.wrap(value);
        listStatusTextOffset = offset;
        listStatusTextLength = length;
        return this;
    }

    public ListStatusEncoder listStatusText(final DirectBuffer value, final int length)
    {
        return listStatusText(value, 0, length);
    }

    public ListStatusEncoder listStatusText(final DirectBuffer value)
    {
        return listStatusText(value, 0, value.capacity());
    }

    public ListStatusEncoder listStatusText(final byte[] value, final int offset, final int length)
    {
        listStatusText.wrap(value);
        listStatusTextOffset = offset;
        listStatusTextLength = length;
        return this;
    }

    public ListStatusEncoder listStatusTextAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listStatusText, value, offset, length);
        listStatusTextOffset = offset;
        listStatusTextLength = length;
        return this;
    }

    public ListStatusEncoder listStatusText(final byte[] value, final int length)
    {
        return listStatusText(value, 0, length);
    }

    public ListStatusEncoder listStatusText(final byte[] value)
    {
        return listStatusText(value, 0, value.length);
    }

    public boolean hasListStatusText()
    {
        return listStatusTextLength > 0;
    }

    public MutableDirectBuffer listStatusText()
    {
        return listStatusText;
    }

    public String listStatusTextAsString()
    {
        return listStatusText.getStringWithoutLengthAscii(listStatusTextOffset, listStatusTextLength);
    }

    public ListStatusEncoder listStatusText(final CharSequence value)
    {
        toBytes(value, listStatusText);
        listStatusTextOffset = 0;
        listStatusTextLength = value.length();
        return this;
    }

    public ListStatusEncoder listStatusText(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listStatusText.wrap(buffer);
            listStatusTextOffset = value.offset();
            listStatusTextLength = value.length();
        }
        return this;
    }

    public ListStatusEncoder listStatusText(final char[] value)
    {
        return listStatusText(value, 0, value.length);
    }

    public ListStatusEncoder listStatusText(final char[] value, final int length)
    {
        return listStatusText(value, 0, length);
    }

    public ListStatusEncoder listStatusText(final char[] value, final int offset, final int length)
    {
        toBytes(value, listStatusText, offset, length);
        listStatusTextOffset = 0;
        listStatusTextLength = length;
        return this;
    }

    private int encodedListStatusTextLen;

    private boolean hasEncodedListStatusTextLen;

    public boolean hasEncodedListStatusTextLen()
    {
        return hasEncodedListStatusTextLen;
    }

    public ListStatusEncoder encodedListStatusTextLen(int value)
    {
        encodedListStatusTextLen = value;
        hasEncodedListStatusTextLen = true;
        return this;
    }

    public int encodedListStatusTextLen()
    {
        return encodedListStatusTextLen;
    }

    private byte[] encodedListStatusText;

    private boolean hasEncodedListStatusText;

    public boolean hasEncodedListStatusText()
    {
        return hasEncodedListStatusText;
    }

    public ListStatusEncoder encodedListStatusText(byte[] value)
    {
        encodedListStatusText = value;
        hasEncodedListStatusText = true;
        return this;
    }

    public byte[] encodedListStatusText()
    {
        return encodedListStatusText;
    }

    public ListStatusEncoder encodedListStatusTextAsCopy(final byte[] value, final int offset, final int length)
    {
        encodedListStatusText = copyInto(encodedListStatusText, value, offset, length);
        hasEncodedListStatusText = true;
        return this;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public ListStatusEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ListStatusEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ListStatusEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public ListStatusEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ListStatusEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public ListStatusEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public ListStatusEncoder transactTime(final byte[] value)
    {
        return transactTime(value, 0, value.length);
    }

    public boolean hasTransactTime()
    {
        return transactTimeLength > 0;
    }

    public MutableDirectBuffer transactTime()
    {
        return transactTime;
    }

    public String transactTimeAsString()
    {
        return transactTime.getStringWithoutLengthAscii(transactTimeOffset, transactTimeLength);
    }

    private int totNoOrders;

    private boolean hasTotNoOrders;

    public boolean hasTotNoOrders()
    {
        return hasTotNoOrders;
    }

    public ListStatusEncoder totNoOrders(int value)
    {
        totNoOrders = value;
        hasTotNoOrders = true;
        return this;
    }

    public int totNoOrders()
    {
        return totNoOrders;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public ListStatusEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }

    private final OrdListStatGrpEncoder ordListStatGrp = new OrdListStatGrpEncoder();
    public OrdListStatGrpEncoder ordListStatGrp()
    {
        return ordListStatGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ListID");
        }

        if (hasListStatusType)
        {
            buffer.putBytes(position, listStatusTypeHeader, 0, listStatusTypeHeaderLength);
            position += listStatusTypeHeaderLength;
            position += buffer.putIntAscii(position, listStatusType);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ListStatusType");
        }

        if (hasNoRpts)
        {
            buffer.putBytes(position, noRptsHeader, 0, noRptsHeaderLength);
            position += noRptsHeaderLength;
            position += buffer.putIntAscii(position, noRpts);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: NoRpts");
        }

        if (hasListOrderStatus)
        {
            buffer.putBytes(position, listOrderStatusHeader, 0, listOrderStatusHeaderLength);
            position += listOrderStatusHeaderLength;
            position += buffer.putIntAscii(position, listOrderStatus);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: ListOrderStatus");
        }

        if (hasContingencyType)
        {
            buffer.putBytes(position, contingencyTypeHeader, 0, contingencyTypeHeaderLength);
            position += contingencyTypeHeaderLength;
            position += buffer.putIntAscii(position, contingencyType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasListRejectReason)
        {
            buffer.putBytes(position, listRejectReasonHeader, 0, listRejectReasonHeaderLength);
            position += listRejectReasonHeaderLength;
            position += buffer.putIntAscii(position, listRejectReason);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRptSeq)
        {
            buffer.putBytes(position, rptSeqHeader, 0, rptSeqHeaderLength);
            position += rptSeqHeaderLength;
            position += buffer.putIntAscii(position, rptSeq);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: RptSeq");
        }

        if (listStatusTextLength > 0)
        {
            buffer.putBytes(position, listStatusTextHeader, 0, listStatusTextHeaderLength);
            position += listStatusTextHeaderLength;
            buffer.putBytes(position, listStatusText, listStatusTextOffset, listStatusTextLength);
            position += listStatusTextLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedListStatusTextLen)
        {
            buffer.putBytes(position, encodedListStatusTextLenHeader, 0, encodedListStatusTextLenHeaderLength);
            position += encodedListStatusTextLenHeaderLength;
            position += buffer.putIntAscii(position, encodedListStatusTextLen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasEncodedListStatusText)
        {
            buffer.putBytes(position, encodedListStatusTextHeader, 0, encodedListStatusTextHeaderLength);
            position += encodedListStatusTextHeaderLength;
            buffer.putBytes(position, encodedListStatusText);
            position += encodedListStatusText.length;
            buffer.putSeparator(position);
            position++;
        }

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoOrders)
        {
            buffer.putBytes(position, totNoOrdersHeader, 0, totNoOrdersHeaderLength);
            position += totNoOrdersHeaderLength;
            position += buffer.putIntAscii(position, totNoOrders);
            buffer.putSeparator(position);
            position++;
        }
        else if (CODEC_VALIDATION_ENABLED)
        {
            throw new EncodingException("Missing Field: TotNoOrders");
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

            position += ordListStatGrp.encode(buffer, position);
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
        this.resetListID();
        this.resetListStatusType();
        this.resetNoRpts();
        this.resetListOrderStatus();
        this.resetContingencyType();
        this.resetListRejectReason();
        this.resetRptSeq();
        this.resetListStatusText();
        this.resetEncodedListStatusTextLen();
        this.resetEncodedListStatusText();
        this.resetTransactTime();
        this.resetTotNoOrders();
        this.resetLastFragment();
        ordListStatGrp.reset();
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetListStatusType()
    {
        hasListStatusType = false;
    }

    public void resetNoRpts()
    {
        hasNoRpts = false;
    }

    public void resetListOrderStatus()
    {
        hasListOrderStatus = false;
    }

    public void resetContingencyType()
    {
        hasContingencyType = false;
    }

    public void resetListRejectReason()
    {
        hasListRejectReason = false;
    }

    public void resetRptSeq()
    {
        hasRptSeq = false;
    }

    public void resetListStatusText()
    {
        listStatusTextLength = 0;
    }

    public void resetEncodedListStatusTextLen()
    {
        hasEncodedListStatusTextLen = false;
    }

    public void resetEncodedListStatusText()
    {
        hasEncodedListStatusText = false;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTotNoOrders()
    {
        hasTotNoOrders = false;
    }

    public void resetLastFragment()
    {
        hasLastFragment = false;
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
        builder.append("\"MessageName\": \"ListStatus\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasListStatusType())
        {
            indent(builder, level);
            builder.append("\"ListStatusType\": \"");
            builder.append(listStatusType);
            builder.append("\",\n");
        }

        if (hasNoRpts())
        {
            indent(builder, level);
            builder.append("\"NoRpts\": \"");
            builder.append(noRpts);
            builder.append("\",\n");
        }

        if (hasListOrderStatus())
        {
            indent(builder, level);
            builder.append("\"ListOrderStatus\": \"");
            builder.append(listOrderStatus);
            builder.append("\",\n");
        }

        if (hasContingencyType())
        {
            indent(builder, level);
            builder.append("\"ContingencyType\": \"");
            builder.append(contingencyType);
            builder.append("\",\n");
        }

        if (hasListRejectReason())
        {
            indent(builder, level);
            builder.append("\"ListRejectReason\": \"");
            builder.append(listRejectReason);
            builder.append("\",\n");
        }

        if (hasRptSeq())
        {
            indent(builder, level);
            builder.append("\"RptSeq\": \"");
            builder.append(rptSeq);
            builder.append("\",\n");
        }

        if (hasListStatusText())
        {
            indent(builder, level);
            builder.append("\"ListStatusText\": \"");
            appendBuffer(builder, listStatusText, listStatusTextOffset, listStatusTextLength);
            builder.append("\",\n");
        }

        if (hasEncodedListStatusTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedListStatusTextLen\": \"");
            builder.append(encodedListStatusTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedListStatusText())
        {
            indent(builder, level);
            builder.append("\"EncodedListStatusText\": \"");
            appendData(builder, encodedListStatusText, encodedListStatusTextLen);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasTotNoOrders())
        {
            indent(builder, level);
            builder.append("\"TotNoOrders\": \"");
            builder.append(totNoOrders);
            builder.append("\",\n");
        }

        if (hasLastFragment())
        {
            indent(builder, level);
            builder.append("\"LastFragment\": \"");
            builder.append(lastFragment);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"OrdListStatGrp\": ");
    ordListStatGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public ListStatusEncoder copyTo(final Encoder encoder)
    {
        return copyTo((ListStatusEncoder)encoder);
    }

    public ListStatusEncoder copyTo(final ListStatusEncoder encoder)
    {
        encoder.reset();
        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasListStatusType())
        {
            encoder.listStatusType(this.listStatusType());
        }

        if (hasNoRpts())
        {
            encoder.noRpts(this.noRpts());
        }

        if (hasListOrderStatus())
        {
            encoder.listOrderStatus(this.listOrderStatus());
        }

        if (hasContingencyType())
        {
            encoder.contingencyType(this.contingencyType());
        }

        if (hasListRejectReason())
        {
            encoder.listRejectReason(this.listRejectReason());
        }

        if (hasRptSeq())
        {
            encoder.rptSeq(this.rptSeq());
        }

        if (hasListStatusText())
        {
            encoder.listStatusTextAsCopy(listStatusText.byteArray(), 0, listStatusTextLength);
        }

        if (hasEncodedListStatusTextLen())
        {
            encoder.encodedListStatusTextLen(this.encodedListStatusTextLen());
        }

        if (hasEncodedListStatusText())
        {
            encoder.encodedListStatusTextAsCopy(this.encodedListStatusText(), 0, encodedListStatusTextLen());
            encoder.encodedListStatusTextLen(encodedListStatusTextLen());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTotNoOrders())
        {
            encoder.totNoOrders(this.totNoOrders());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        ordListStatGrp.copyTo(encoder.ordListStatGrp());        return encoder;
    }

}
