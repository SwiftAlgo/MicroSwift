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
import com.swiftalgo.ms.codecs.fix50sp2.builder.BaseTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder.TickRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder.LotTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PriceLimitsEncoder;

public interface BaseTradingRulesDecoder  extends TickRulesDecoder, LotTypeRulesDecoder, PriceLimitsDecoder
{

    public int expirationCycle();
    public boolean hasExpirationCycle();
    public ExpirationCycle expirationCycleAsEnum();
    public DecimalFloat minTradeVol();
    public boolean hasMinTradeVol();
    public DecimalFloat maxTradeVol();
    public boolean hasMaxTradeVol();
    public DecimalFloat maxPriceVariation();
    public boolean hasMaxPriceVariation();
    public int impliedMarketIndicator();
    public boolean hasImpliedMarketIndicator();
    public ImpliedMarketIndicator impliedMarketIndicatorAsEnum();
    public char[] tradingCurrency();
    public boolean hasTradingCurrency();
    public int tradingCurrencyLength();
    public void tradingCurrency(AsciiSequenceView view);
    public DecimalFloat roundLot();
    public boolean hasRoundLot();
    public int multilegModel();
    public boolean hasMultilegModel();
    public MultilegModel multilegModelAsEnum();
    public int multilegPriceMethod();
    public boolean hasMultilegPriceMethod();
    public MultilegPriceMethod multilegPriceMethodAsEnum();
    public int priceType();
    public boolean hasPriceType();
    public PriceType priceTypeAsEnum();

}
