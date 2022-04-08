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


public class DerivativeSecurityListEncoder implements Encoder
{
    public long messageType()
    {
        return 16705L;
    }

    public DerivativeSecurityListEncoder()
    {
        header.msgType("AA");
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

    private static final int securityReportIDHeaderLength = 4;
    private static final byte[] securityReportIDHeader = new byte[] {57, 54, 52, (byte) '='};

    private static final int securityReqIDHeaderLength = 4;
    private static final byte[] securityReqIDHeader = new byte[] {51, 50, 48, (byte) '='};

    private static final int securityResponseIDHeaderLength = 4;
    private static final byte[] securityResponseIDHeader = new byte[] {51, 50, 50, (byte) '='};

    private static final int securityRequestResultHeaderLength = 4;
    private static final byte[] securityRequestResultHeader = new byte[] {53, 54, 48, (byte) '='};

    private static final int clearingBusinessDateHeaderLength = 4;
    private static final byte[] clearingBusinessDateHeader = new byte[] {55, 49, 53, (byte) '='};

    private static final int transactTimeHeaderLength = 3;
    private static final byte[] transactTimeHeader = new byte[] {54, 48, (byte) '='};

    private static final int totNoRelatedSymHeaderLength = 4;
    private static final byte[] totNoRelatedSymHeader = new byte[] {51, 57, 51, (byte) '='};

    private static final int lastFragmentHeaderLength = 4;
    private static final byte[] lastFragmentHeader = new byte[] {56, 57, 51, (byte) '='};

    private final ApplicationSequenceControlEncoder applicationSequenceControl = new ApplicationSequenceControlEncoder();
    public ApplicationSequenceControlEncoder applicationSequenceControl()
    {
        return applicationSequenceControl;
    }

    private int securityReportID;

    private boolean hasSecurityReportID;

    public boolean hasSecurityReportID()
    {
        return hasSecurityReportID;
    }

    public DerivativeSecurityListEncoder securityReportID(int value)
    {
        securityReportID = value;
        hasSecurityReportID = true;
        return this;
    }

    public int securityReportID()
    {
        return securityReportID;
    }

    private final MutableDirectBuffer securityReqID = new UnsafeBuffer();

    private int securityReqIDOffset = 0;

    private int securityReqIDLength = 0;

    public DerivativeSecurityListEncoder securityReqID(final DirectBuffer value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityReqID(final DirectBuffer value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityReqID(final DirectBuffer value)
    {
        return securityReqID(value, 0, value.capacity());
    }

    public DerivativeSecurityListEncoder securityReqID(final byte[] value, final int offset, final int length)
    {
        securityReqID.wrap(value);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityReqIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityReqID, value, offset, length);
        securityReqIDOffset = offset;
        securityReqIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityReqID(final byte[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityReqID(final byte[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public boolean hasSecurityReqID()
    {
        return securityReqIDLength > 0;
    }

    public MutableDirectBuffer securityReqID()
    {
        return securityReqID;
    }

    public String securityReqIDAsString()
    {
        return securityReqID.getStringWithoutLengthAscii(securityReqIDOffset, securityReqIDLength);
    }

    public DerivativeSecurityListEncoder securityReqID(final CharSequence value)
    {
        toBytes(value, securityReqID);
        securityReqIDOffset = 0;
        securityReqIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListEncoder securityReqID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityReqID.wrap(buffer);
            securityReqIDOffset = value.offset();
            securityReqIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListEncoder securityReqID(final char[] value)
    {
        return securityReqID(value, 0, value.length);
    }

    public DerivativeSecurityListEncoder securityReqID(final char[] value, final int length)
    {
        return securityReqID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityReqID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityReqID, offset, length);
        securityReqIDOffset = 0;
        securityReqIDLength = length;
        return this;
    }

    private final MutableDirectBuffer securityResponseID = new UnsafeBuffer();

    private int securityResponseIDOffset = 0;

    private int securityResponseIDLength = 0;

    public DerivativeSecurityListEncoder securityResponseID(final DirectBuffer value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityResponseID(final DirectBuffer value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityResponseID(final DirectBuffer value)
    {
        return securityResponseID(value, 0, value.capacity());
    }

    public DerivativeSecurityListEncoder securityResponseID(final byte[] value, final int offset, final int length)
    {
        securityResponseID.wrap(value);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityResponseIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(securityResponseID, value, offset, length);
        securityResponseIDOffset = offset;
        securityResponseIDLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder securityResponseID(final byte[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityResponseID(final byte[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public boolean hasSecurityResponseID()
    {
        return securityResponseIDLength > 0;
    }

    public MutableDirectBuffer securityResponseID()
    {
        return securityResponseID;
    }

    public String securityResponseIDAsString()
    {
        return securityResponseID.getStringWithoutLengthAscii(securityResponseIDOffset, securityResponseIDLength);
    }

    public DerivativeSecurityListEncoder securityResponseID(final CharSequence value)
    {
        toBytes(value, securityResponseID);
        securityResponseIDOffset = 0;
        securityResponseIDLength = value.length();
        return this;
    }

    public DerivativeSecurityListEncoder securityResponseID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            securityResponseID.wrap(buffer);
            securityResponseIDOffset = value.offset();
            securityResponseIDLength = value.length();
        }
        return this;
    }

    public DerivativeSecurityListEncoder securityResponseID(final char[] value)
    {
        return securityResponseID(value, 0, value.length);
    }

    public DerivativeSecurityListEncoder securityResponseID(final char[] value, final int length)
    {
        return securityResponseID(value, 0, length);
    }

    public DerivativeSecurityListEncoder securityResponseID(final char[] value, final int offset, final int length)
    {
        toBytes(value, securityResponseID, offset, length);
        securityResponseIDOffset = 0;
        securityResponseIDLength = length;
        return this;
    }

    private int securityRequestResult;

    private boolean hasSecurityRequestResult;

    public boolean hasSecurityRequestResult()
    {
        return hasSecurityRequestResult;
    }

    public DerivativeSecurityListEncoder securityRequestResult(int value)
    {
        securityRequestResult = value;
        hasSecurityRequestResult = true;
        return this;
    }

    public int securityRequestResult()
    {
        return securityRequestResult;
    }

    public DerivativeSecurityListEncoder securityRequestResult(SecurityRequestResult value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SecurityRequestResult.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: securityRequestResult Value: " + value );
            }
            if (value == SecurityRequestResult.NULL_VAL)
            {
                return this;
            }
        }
        return securityRequestResult(value.representation());
    }

    private final MutableDirectBuffer clearingBusinessDate = new UnsafeBuffer();

    private int clearingBusinessDateOffset = 0;

    private int clearingBusinessDateLength = 0;

    public DerivativeSecurityListEncoder clearingBusinessDate(final DirectBuffer value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder clearingBusinessDate(final DirectBuffer value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public DerivativeSecurityListEncoder clearingBusinessDate(final DirectBuffer value)
    {
        return clearingBusinessDate(value, 0, value.capacity());
    }

    public DerivativeSecurityListEncoder clearingBusinessDate(final byte[] value, final int offset, final int length)
    {
        clearingBusinessDate.wrap(value);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder clearingBusinessDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(clearingBusinessDate, value, offset, length);
        clearingBusinessDateOffset = offset;
        clearingBusinessDateLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder clearingBusinessDate(final byte[] value, final int length)
    {
        return clearingBusinessDate(value, 0, length);
    }

    public DerivativeSecurityListEncoder clearingBusinessDate(final byte[] value)
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

    private final UnderlyingInstrumentEncoder underlyingInstrument = new UnderlyingInstrumentEncoder();
    public UnderlyingInstrumentEncoder underlyingInstrument()
    {
        return underlyingInstrument;
    }

    private final DerivativeSecurityDefinitionEncoder derivativeSecurityDefinition = new DerivativeSecurityDefinitionEncoder();
    public DerivativeSecurityDefinitionEncoder derivativeSecurityDefinition()
    {
        return derivativeSecurityDefinition;
    }

    private final MutableDirectBuffer transactTime = new UnsafeBuffer();

    private int transactTimeOffset = 0;

    private int transactTimeLength = 0;

    public DerivativeSecurityListEncoder transactTime(final DirectBuffer value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder transactTime(final DirectBuffer value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public DerivativeSecurityListEncoder transactTime(final DirectBuffer value)
    {
        return transactTime(value, 0, value.capacity());
    }

    public DerivativeSecurityListEncoder transactTime(final byte[] value, final int offset, final int length)
    {
        transactTime.wrap(value);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder transactTimeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(transactTime, value, offset, length);
        transactTimeOffset = offset;
        transactTimeLength = length;
        return this;
    }

    public DerivativeSecurityListEncoder transactTime(final byte[] value, final int length)
    {
        return transactTime(value, 0, length);
    }

    public DerivativeSecurityListEncoder transactTime(final byte[] value)
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

    private int totNoRelatedSym;

    private boolean hasTotNoRelatedSym;

    public boolean hasTotNoRelatedSym()
    {
        return hasTotNoRelatedSym;
    }

    public DerivativeSecurityListEncoder totNoRelatedSym(int value)
    {
        totNoRelatedSym = value;
        hasTotNoRelatedSym = true;
        return this;
    }

    public int totNoRelatedSym()
    {
        return totNoRelatedSym;
    }

    private boolean lastFragment;

    private boolean hasLastFragment;

    public boolean hasLastFragment()
    {
        return hasLastFragment;
    }

    public DerivativeSecurityListEncoder lastFragment(boolean value)
    {
        lastFragment = value;
        hasLastFragment = true;
        return this;
    }

    public boolean lastFragment()
    {
        return lastFragment;
    }

    private final RelSymDerivSecGrpEncoder relSymDerivSecGrp = new RelSymDerivSecGrpEncoder();
    public RelSymDerivSecGrpEncoder relSymDerivSecGrp()
    {
        return relSymDerivSecGrp;
    }

    public long encode(final MutableAsciiBuffer buffer, final int offset)
    {
        final long startMessageResult = header.startMessage(buffer, offset);
        final int bodyStart = Encoder.offset(startMessageResult);
        int position = bodyStart + Encoder.length(startMessageResult);

            position += applicationSequenceControl.encode(buffer, position);

        if (hasSecurityReportID)
        {
            buffer.putBytes(position, securityReportIDHeader, 0, securityReportIDHeaderLength);
            position += securityReportIDHeaderLength;
            position += buffer.putIntAscii(position, securityReportID);
            buffer.putSeparator(position);
            position++;
        }

        if (securityReqIDLength > 0)
        {
            buffer.putBytes(position, securityReqIDHeader, 0, securityReqIDHeaderLength);
            position += securityReqIDHeaderLength;
            buffer.putBytes(position, securityReqID, securityReqIDOffset, securityReqIDLength);
            position += securityReqIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (securityResponseIDLength > 0)
        {
            buffer.putBytes(position, securityResponseIDHeader, 0, securityResponseIDHeaderLength);
            position += securityResponseIDHeaderLength;
            buffer.putBytes(position, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            position += securityResponseIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecurityRequestResult)
        {
            buffer.putBytes(position, securityRequestResultHeader, 0, securityRequestResultHeaderLength);
            position += securityRequestResultHeaderLength;
            position += buffer.putIntAscii(position, securityRequestResult);
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

            position += underlyingInstrument.encode(buffer, position);

            position += derivativeSecurityDefinition.encode(buffer, position);

        if (transactTimeLength > 0)
        {
            buffer.putBytes(position, transactTimeHeader, 0, transactTimeHeaderLength);
            position += transactTimeHeaderLength;
            buffer.putBytes(position, transactTime, transactTimeOffset, transactTimeLength);
            position += transactTimeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTotNoRelatedSym)
        {
            buffer.putBytes(position, totNoRelatedSymHeader, 0, totNoRelatedSymHeaderLength);
            position += totNoRelatedSymHeaderLength;
            position += buffer.putIntAscii(position, totNoRelatedSym);
            buffer.putSeparator(position);
            position++;
        }

        if (hasLastFragment)
        {
            buffer.putBytes(position, lastFragmentHeader, 0, lastFragmentHeaderLength);
            position += lastFragmentHeaderLength;
            position += buffer.putBooleanAscii(position, lastFragment);
            buffer.putSeparator(position);
            position++;
        }

            position += relSymDerivSecGrp.encode(buffer, position);
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
        this.resetSecurityReportID();
        this.resetSecurityReqID();
        this.resetSecurityResponseID();
        this.resetSecurityRequestResult();
        this.resetClearingBusinessDate();
        this.resetTransactTime();
        this.resetTotNoRelatedSym();
        this.resetLastFragment();
        applicationSequenceControl.reset();
        underlyingInstrument.reset();
        derivativeSecurityDefinition.reset();
        relSymDerivSecGrp.reset();
    }

    public void resetSecurityReportID()
    {
        hasSecurityReportID = false;
    }

    public void resetSecurityReqID()
    {
        securityReqIDLength = 0;
    }

    public void resetSecurityResponseID()
    {
        securityResponseIDLength = 0;
    }

    public void resetSecurityRequestResult()
    {
        hasSecurityRequestResult = false;
    }

    public void resetClearingBusinessDate()
    {
        clearingBusinessDateLength = 0;
    }

    public void resetTransactTime()
    {
        transactTimeLength = 0;
    }

    public void resetTotNoRelatedSym()
    {
        hasTotNoRelatedSym = false;
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
        builder.append("\"MessageName\": \"DerivativeSecurityList\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
    indent(builder, level);
    builder.append("\"ApplicationSequenceControl\": ");
    applicationSequenceControl.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasSecurityReportID())
        {
            indent(builder, level);
            builder.append("\"SecurityReportID\": \"");
            builder.append(securityReportID);
            builder.append("\",\n");
        }

        if (hasSecurityReqID())
        {
            indent(builder, level);
            builder.append("\"SecurityReqID\": \"");
            appendBuffer(builder, securityReqID, securityReqIDOffset, securityReqIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityResponseID())
        {
            indent(builder, level);
            builder.append("\"SecurityResponseID\": \"");
            appendBuffer(builder, securityResponseID, securityResponseIDOffset, securityResponseIDLength);
            builder.append("\",\n");
        }

        if (hasSecurityRequestResult())
        {
            indent(builder, level);
            builder.append("\"SecurityRequestResult\": \"");
            builder.append(securityRequestResult);
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendBuffer(builder, clearingBusinessDate, clearingBusinessDateOffset, clearingBusinessDateLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"UnderlyingInstrument\": ");
    underlyingInstrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DerivativeSecurityDefinition\": ");
    derivativeSecurityDefinition.appendTo(builder, level + 1);
    builder.append("\n");

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendBuffer(builder, transactTime, transactTimeOffset, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasTotNoRelatedSym())
        {
            indent(builder, level);
            builder.append("\"TotNoRelatedSym\": \"");
            builder.append(totNoRelatedSym);
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
    builder.append("\"RelSymDerivSecGrp\": ");
    relSymDerivSecGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityListEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityListEncoder)encoder);
    }

    public DerivativeSecurityListEncoder copyTo(final DerivativeSecurityListEncoder encoder)
    {
        encoder.reset();

        applicationSequenceControl.copyTo(encoder.applicationSequenceControl());
        if (hasSecurityReportID())
        {
            encoder.securityReportID(this.securityReportID());
        }

        if (hasSecurityReqID())
        {
            encoder.securityReqIDAsCopy(securityReqID.byteArray(), 0, securityReqIDLength);
        }

        if (hasSecurityResponseID())
        {
            encoder.securityResponseIDAsCopy(securityResponseID.byteArray(), 0, securityResponseIDLength);
        }

        if (hasSecurityRequestResult())
        {
            encoder.securityRequestResult(this.securityRequestResult());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(clearingBusinessDate.byteArray(), 0, clearingBusinessDateLength);
        }


        underlyingInstrument.copyTo(encoder.underlyingInstrument());

        derivativeSecurityDefinition.copyTo(encoder.derivativeSecurityDefinition());
        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(transactTime.byteArray(), 0, transactTimeLength);
        }

        if (hasTotNoRelatedSym())
        {
            encoder.totNoRelatedSym(this.totNoRelatedSym());
        }

        if (hasLastFragment())
        {
            encoder.lastFragment(this.lastFragment());
        }


        relSymDerivSecGrp.copyTo(encoder.relSymDerivSecGrp());        return encoder;
    }

}
