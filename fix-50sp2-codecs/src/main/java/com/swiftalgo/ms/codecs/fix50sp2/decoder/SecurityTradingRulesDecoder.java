/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
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
import uk.co.real_logic.artio.builder.Encoder;
import uk.co.real_logic.artio.builder.CommonDecoderImpl;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.BaseTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder.TickRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder.LotTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PriceLimitsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder.TradingSessionRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder.OrdTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder.TimeInForceRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder.ExecInstRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder.MatchRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder.MDFeedTypesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedInstrumentAttributeEncoder.NestedInstrAttribGroupEncoder;

public interface SecurityTradingRulesDecoder  extends BaseTradingRulesDecoder, TickRulesDecoder, LotTypeRulesDecoder, PriceLimitsDecoder, TradingSessionRulesGrpDecoder, NestedInstrumentAttributeDecoder
{


}
