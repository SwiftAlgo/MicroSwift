/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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


public class DerivativeSecurityDefinitionEncoder
{
    private final DerivativeInstrumentEncoder derivativeInstrument = new DerivativeInstrumentEncoder();
    public DerivativeInstrumentEncoder derivativeInstrument()
    {
        return derivativeInstrument;
    }

    private final DerivativeInstrumentAttributeEncoder derivativeInstrumentAttribute = new DerivativeInstrumentAttributeEncoder();
    public DerivativeInstrumentAttributeEncoder derivativeInstrumentAttribute()
    {
        return derivativeInstrumentAttribute;
    }

    private final MarketSegmentGrpEncoder marketSegmentGrp = new MarketSegmentGrpEncoder();
    public MarketSegmentGrpEncoder marketSegmentGrp()
    {
        return marketSegmentGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

            position += derivativeInstrument.encode(buffer, position);

            position += derivativeInstrumentAttribute.encode(buffer, position);

            position += marketSegmentGrp.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        derivativeInstrument.reset();
        derivativeInstrumentAttribute.reset();
        marketSegmentGrp.reset();
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
        builder.append("\"MessageName\": \"DerivativeSecurityDefinition\",\n");
    indent(builder, level);
    builder.append("\"DerivativeInstrument\": ");
    derivativeInstrument.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"DerivativeInstrumentAttribute\": ");
    derivativeInstrumentAttribute.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"MarketSegmentGrp\": ");
    marketSegmentGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DerivativeSecurityDefinitionEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DerivativeSecurityDefinitionEncoder)encoder);
    }

    public DerivativeSecurityDefinitionEncoder copyTo(final DerivativeSecurityDefinitionEncoder encoder)
    {
        encoder.reset();

        derivativeInstrument.copyTo(encoder.derivativeInstrument());

        derivativeInstrumentAttribute.copyTo(encoder.derivativeInstrumentAttribute());

        marketSegmentGrp.copyTo(encoder.marketSegmentGrp());        return encoder;
    }

}
