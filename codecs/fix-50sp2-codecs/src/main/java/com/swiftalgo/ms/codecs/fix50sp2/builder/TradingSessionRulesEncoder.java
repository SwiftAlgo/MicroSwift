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


public class TradingSessionRulesEncoder
{
    private final OrdTypeRulesEncoder ordTypeRules = new OrdTypeRulesEncoder();
    public OrdTypeRulesEncoder ordTypeRules()
    {
        return ordTypeRules;
    }

    private final TimeInForceRulesEncoder timeInForceRules = new TimeInForceRulesEncoder();
    public TimeInForceRulesEncoder timeInForceRules()
    {
        return timeInForceRules;
    }

    private final ExecInstRulesEncoder execInstRules = new ExecInstRulesEncoder();
    public ExecInstRulesEncoder execInstRules()
    {
        return execInstRules;
    }

    private final MatchRulesEncoder matchRules = new MatchRulesEncoder();
    public MatchRulesEncoder matchRules()
    {
        return matchRules;
    }

    private final MarketDataFeedTypesEncoder marketDataFeedTypes = new MarketDataFeedTypesEncoder();
    public MarketDataFeedTypesEncoder marketDataFeedTypes()
    {
        return marketDataFeedTypes;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

            position += ordTypeRules.encode(buffer, position);

            position += timeInForceRules.encode(buffer, position);

            position += execInstRules.encode(buffer, position);

            position += matchRules.encode(buffer, position);

            position += marketDataFeedTypes.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        ordTypeRules.reset();
        timeInForceRules.reset();
        execInstRules.reset();
        matchRules.reset();
        marketDataFeedTypes.reset();
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
        builder.append("\"MessageName\": \"TradingSessionRules\",\n");
    indent(builder, level);
    builder.append("\"OrdTypeRules\": ");
    ordTypeRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"TimeInForceRules\": ");
    timeInForceRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"ExecInstRules\": ");
    execInstRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"MatchRules\": ");
    matchRules.appendTo(builder, level + 1);
    builder.append("\n");

    indent(builder, level);
    builder.append("\"MarketDataFeedTypes\": ");
    marketDataFeedTypes.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionRulesEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TradingSessionRulesEncoder)encoder);
    }

    public TradingSessionRulesEncoder copyTo(final TradingSessionRulesEncoder encoder)
    {
        encoder.reset();

        ordTypeRules.copyTo(encoder.ordTypeRules());

        timeInForceRules.copyTo(encoder.timeInForceRules());

        execInstRules.copyTo(encoder.execInstRules());

        matchRules.copyTo(encoder.matchRules());

        marketDataFeedTypes.copyTo(encoder.marketDataFeedTypes());        return encoder;
    }

}
