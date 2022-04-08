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


public class SecurityTradingRulesEncoder
{
    private final BaseTradingRulesEncoder baseTradingRules = new BaseTradingRulesEncoder();
    public BaseTradingRulesEncoder baseTradingRules()
    {
        return baseTradingRules;
    }

    private final TradingSessionRulesGrpEncoder tradingSessionRulesGrp = new TradingSessionRulesGrpEncoder();
    public TradingSessionRulesGrpEncoder tradingSessionRulesGrp()
    {
        return tradingSessionRulesGrp;
    }

    private final NestedInstrumentAttributeEncoder nestedInstrumentAttribute = new NestedInstrumentAttributeEncoder();
    public NestedInstrumentAttributeEncoder nestedInstrumentAttribute()
    {
        return nestedInstrumentAttribute;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

            position += baseTradingRules.encode(buffer, position);

            position += tradingSessionRulesGrp.encode(buffer, position);

            position += nestedInstrumentAttribute.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        baseTradingRules.reset();
        tradingSessionRulesGrp.reset();
        nestedInstrumentAttribute.reset();
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
        builder.append("\"MessageName\": \"SecurityTradingRules\",\n");
    indent(builder, level);
    builder.append("\"BaseTradingRules\": ");
    baseTradingRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TradingSessionRulesGrp\": ");
    tradingSessionRulesGrp.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"NestedInstrumentAttribute\": ");
    nestedInstrumentAttribute.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SecurityTradingRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SecurityTradingRulesEncoder)encoder);
    }

    public SecurityTradingRulesEncoder copyTo(final SecurityTradingRulesEncoder encoder)
    {
        encoder.reset();

        baseTradingRules.copyTo(encoder.baseTradingRules());

        tradingSessionRulesGrp.copyTo(encoder.tradingSessionRulesGrp());

        nestedInstrumentAttribute.copyTo(encoder.nestedInstrumentAttribute());        return encoder;
    }

}
