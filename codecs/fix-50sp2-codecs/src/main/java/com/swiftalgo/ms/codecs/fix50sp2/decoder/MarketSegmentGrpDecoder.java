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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketSegmentGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketSegmentGrpEncoder.MarketSegmentsGroupEncoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StrikeRulesEncoder.StrikeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MaturityRulesEncoder.MaturityRulesGroupEncoder;

public interface MarketSegmentGrpDecoder 
{



public class MarketSegmentsGroupDecoder extends CommonDecoderImpl implements SecurityTradingRulesDecoder, StrikeRulesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(32);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.PRICE_LIMIT_TYPE);
            GROUP_FIELDS.add(Constants.LOW_LIMIT_PRICE);
            GROUP_FIELDS.add(Constants.HIGH_LIMIT_PRICE);
            GROUP_FIELDS.add(Constants.TRADING_REFERENCE_PRICE);
            GROUP_FIELDS.add(Constants.EXPIRATION_CYCLE);
            GROUP_FIELDS.add(Constants.MIN_TRADE_VOL);
            GROUP_FIELDS.add(Constants.MAX_TRADE_VOL);
            GROUP_FIELDS.add(Constants.MAX_PRICE_VARIATION);
            GROUP_FIELDS.add(Constants.IMPLIED_MARKET_INDICATOR);
            GROUP_FIELDS.add(Constants.TRADING_CURRENCY);
            GROUP_FIELDS.add(Constants.ROUND_LOT);
            GROUP_FIELDS.add(Constants.MULTILEG_MODEL);
            GROUP_FIELDS.add(Constants.MULTILEG_PRICE_METHOD);
            GROUP_FIELDS.add(Constants.PRICE_TYPE);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.MARKET_ID);
            ALL_GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasPriceLimitType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PriceLimitType.isValid(priceLimitType()))
        {
            invalidTagId = 1306;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExpirationCycle)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExpirationCycle.isValid(expirationCycle()))
        {
            invalidTagId = 827;
            rejectReason = 5;
            return false;
        }
        }

        if (hasImpliedMarketIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ImpliedMarketIndicator.isValid(impliedMarketIndicator()))
        {
            invalidTagId = 1144;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMultilegModel)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MultilegModel.isValid(multilegModel()))
        {
            invalidTagId = 1377;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMultilegPriceMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MultilegPriceMethod.isValid(multilegPriceMethod()))
        {
            invalidTagId = 1378;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPriceType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PriceType.isValid(priceType()))
        {
            invalidTagId = 423;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoTickRulesGroupCounter)
        {
            {
                int count = 0;
                final TickRulesGroupIterator iterator = tickRulesGroupIterator.iterator();
                for (final TickRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1205;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoLotTypeRulesGroupCounter)
        {
            {
                int count = 0;
                final LotTypeRulesGroupIterator iterator = lotTypeRulesGroupIterator.iterator();
                for (final LotTypeRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1234;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoTradingSessionRulesGroupCounter)
        {
            {
                int count = 0;
                final TradingSessionRulesGroupIterator iterator = tradingSessionRulesGroupIterator.iterator();
                for (final TradingSessionRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1309;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoNestedInstrAttribGroupCounter)
        {
            {
                int count = 0;
                final NestedInstrAttribGroupIterator iterator = nestedInstrAttribGroupIterator.iterator();
                for (final NestedInstrAttribGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1312;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoStrikeRulesGroupCounter)
        {
            {
                int count = 0;
                final StrikeRulesGroupIterator iterator = strikeRulesGroupIterator.iterator();
                for (final StrikeRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1201;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MarketSegmentsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MarketSegmentsGroupDecoder next = null;

    public MarketSegmentsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(8);

    private char[] marketID = new char[1];

    private boolean hasMarketID;

    public char[] marketID()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketID;
    }

    public boolean hasMarketID()
    {
        return hasMarketID;
    }


    private int marketIDOffset;

    private int marketIDLength;

    public int marketIDLength()
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        return marketIDLength;
    }

    public String marketIDAsString()
    {
        return hasMarketID ? new String(marketID, 0, marketIDLength) : null;
    }

    public void marketID(final AsciiSequenceView view)
    {
        if (!hasMarketID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketID");
        }

        view.wrap(buffer, marketIDOffset, marketIDLength);
    }


    private char[] marketSegmentID = new char[1];

    private boolean hasMarketSegmentID;

    public char[] marketSegmentID()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentID;
    }

    public boolean hasMarketSegmentID()
    {
        return hasMarketSegmentID;
    }


    private int marketSegmentIDOffset;

    private int marketSegmentIDLength;

    public int marketSegmentIDLength()
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        return marketSegmentIDLength;
    }

    public String marketSegmentIDAsString()
    {
        return hasMarketSegmentID ? new String(marketSegmentID, 0, marketSegmentIDLength) : null;
    }

    public void marketSegmentID(final AsciiSequenceView view)
    {
        if (!hasMarketSegmentID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentID");
        }

        view.wrap(buffer, marketSegmentIDOffset, marketSegmentIDLength);
    }


    private final CharArrayWrapper marketSegmentIDWrapper = new CharArrayWrapper();




    private TickRulesGroupDecoder tickRulesGroup = null;
    public TickRulesGroupDecoder tickRulesGroup()
    {
        return tickRulesGroup;
    }

    private int noTickRulesGroupCounter = MISSING_INT;

    private boolean hasNoTickRulesGroupCounter;

    public int noTickRulesGroupCounter()
    {
        if (!hasNoTickRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTickRulesGroupCounter");
        }

        return noTickRulesGroupCounter;
    }

    public boolean hasNoTickRulesGroupCounter()
    {
        return hasNoTickRulesGroupCounter;
    }




    private TickRulesGroupIterator tickRulesGroupIterator = new TickRulesGroupIterator(this);
    public TickRulesGroupIterator tickRulesGroupIterator()
    {
        return tickRulesGroupIterator.iterator();
    }




    private LotTypeRulesGroupDecoder lotTypeRulesGroup = null;
    public LotTypeRulesGroupDecoder lotTypeRulesGroup()
    {
        return lotTypeRulesGroup;
    }

    private int noLotTypeRulesGroupCounter = MISSING_INT;

    private boolean hasNoLotTypeRulesGroupCounter;

    public int noLotTypeRulesGroupCounter()
    {
        if (!hasNoLotTypeRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoLotTypeRulesGroupCounter");
        }

        return noLotTypeRulesGroupCounter;
    }

    public boolean hasNoLotTypeRulesGroupCounter()
    {
        return hasNoLotTypeRulesGroupCounter;
    }




    private LotTypeRulesGroupIterator lotTypeRulesGroupIterator = new LotTypeRulesGroupIterator(this);
    public LotTypeRulesGroupIterator lotTypeRulesGroupIterator()
    {
        return lotTypeRulesGroupIterator.iterator();
    }



    private int priceLimitType = MISSING_INT;

    private boolean hasPriceLimitType;

    public int priceLimitType()
    {
        if (!hasPriceLimitType)
        {
            throw new IllegalArgumentException("No value for optional field: PriceLimitType");
        }

        return priceLimitType;
    }

    public boolean hasPriceLimitType()
    {
        return hasPriceLimitType;
    }



    private final CharArrayWrapper priceLimitTypeWrapper = new CharArrayWrapper();
    public PriceLimitType priceLimitTypeAsEnum()
    {
        if (!hasPriceLimitType)
 return PriceLimitType.NULL_VAL;
        return PriceLimitType.decode(priceLimitType);
    }

    private DecimalFloat lowLimitPrice = DecimalFloat.newNaNValue();

    private boolean hasLowLimitPrice;

    public DecimalFloat lowLimitPrice()
    {
        if (!hasLowLimitPrice)
        {
            throw new IllegalArgumentException("No value for optional field: LowLimitPrice");
        }

        return lowLimitPrice;
    }

    public boolean hasLowLimitPrice()
    {
        return hasLowLimitPrice;
    }



    private DecimalFloat highLimitPrice = DecimalFloat.newNaNValue();

    private boolean hasHighLimitPrice;

    public DecimalFloat highLimitPrice()
    {
        if (!hasHighLimitPrice)
        {
            throw new IllegalArgumentException("No value for optional field: HighLimitPrice");
        }

        return highLimitPrice;
    }

    public boolean hasHighLimitPrice()
    {
        return hasHighLimitPrice;
    }



    private DecimalFloat tradingReferencePrice = DecimalFloat.newNaNValue();

    private boolean hasTradingReferencePrice;

    public DecimalFloat tradingReferencePrice()
    {
        if (!hasTradingReferencePrice)
        {
            throw new IllegalArgumentException("No value for optional field: TradingReferencePrice");
        }

        return tradingReferencePrice;
    }

    public boolean hasTradingReferencePrice()
    {
        return hasTradingReferencePrice;
    }




    private int expirationCycle = MISSING_INT;

    private boolean hasExpirationCycle;

    public int expirationCycle()
    {
        if (!hasExpirationCycle)
        {
            throw new IllegalArgumentException("No value for optional field: ExpirationCycle");
        }

        return expirationCycle;
    }

    public boolean hasExpirationCycle()
    {
        return hasExpirationCycle;
    }



    private final CharArrayWrapper expirationCycleWrapper = new CharArrayWrapper();
    public ExpirationCycle expirationCycleAsEnum()
    {
        if (!hasExpirationCycle)
 return ExpirationCycle.NULL_VAL;
        return ExpirationCycle.decode(expirationCycle);
    }

    private DecimalFloat minTradeVol = DecimalFloat.newNaNValue();

    private boolean hasMinTradeVol;

    public DecimalFloat minTradeVol()
    {
        if (!hasMinTradeVol)
        {
            throw new IllegalArgumentException("No value for optional field: MinTradeVol");
        }

        return minTradeVol;
    }

    public boolean hasMinTradeVol()
    {
        return hasMinTradeVol;
    }



    private DecimalFloat maxTradeVol = DecimalFloat.newNaNValue();

    private boolean hasMaxTradeVol;

    public DecimalFloat maxTradeVol()
    {
        if (!hasMaxTradeVol)
        {
            throw new IllegalArgumentException("No value for optional field: MaxTradeVol");
        }

        return maxTradeVol;
    }

    public boolean hasMaxTradeVol()
    {
        return hasMaxTradeVol;
    }



    private DecimalFloat maxPriceVariation = DecimalFloat.newNaNValue();

    private boolean hasMaxPriceVariation;

    public DecimalFloat maxPriceVariation()
    {
        if (!hasMaxPriceVariation)
        {
            throw new IllegalArgumentException("No value for optional field: MaxPriceVariation");
        }

        return maxPriceVariation;
    }

    public boolean hasMaxPriceVariation()
    {
        return hasMaxPriceVariation;
    }



    private int impliedMarketIndicator = MISSING_INT;

    private boolean hasImpliedMarketIndicator;

    public int impliedMarketIndicator()
    {
        if (!hasImpliedMarketIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ImpliedMarketIndicator");
        }

        return impliedMarketIndicator;
    }

    public boolean hasImpliedMarketIndicator()
    {
        return hasImpliedMarketIndicator;
    }



    private final CharArrayWrapper impliedMarketIndicatorWrapper = new CharArrayWrapper();
    public ImpliedMarketIndicator impliedMarketIndicatorAsEnum()
    {
        if (!hasImpliedMarketIndicator)
 return ImpliedMarketIndicator.NULL_VAL;
        return ImpliedMarketIndicator.decode(impliedMarketIndicator);
    }

    private char[] tradingCurrency = new char[1];

    private boolean hasTradingCurrency;

    public char[] tradingCurrency()
    {
        if (!hasTradingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: TradingCurrency");
        }

        return tradingCurrency;
    }

    public boolean hasTradingCurrency()
    {
        return hasTradingCurrency;
    }


    private int tradingCurrencyOffset;

    private int tradingCurrencyLength;

    public int tradingCurrencyLength()
    {
        if (!hasTradingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: TradingCurrency");
        }

        return tradingCurrencyLength;
    }

    public String tradingCurrencyAsString()
    {
        return hasTradingCurrency ? new String(tradingCurrency, 0, tradingCurrencyLength) : null;
    }

    public void tradingCurrency(final AsciiSequenceView view)
    {
        if (!hasTradingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: TradingCurrency");
        }

        view.wrap(buffer, tradingCurrencyOffset, tradingCurrencyLength);
    }


    private DecimalFloat roundLot = DecimalFloat.newNaNValue();

    private boolean hasRoundLot;

    public DecimalFloat roundLot()
    {
        if (!hasRoundLot)
        {
            throw new IllegalArgumentException("No value for optional field: RoundLot");
        }

        return roundLot;
    }

    public boolean hasRoundLot()
    {
        return hasRoundLot;
    }



    private int multilegModel = MISSING_INT;

    private boolean hasMultilegModel;

    public int multilegModel()
    {
        if (!hasMultilegModel)
        {
            throw new IllegalArgumentException("No value for optional field: MultilegModel");
        }

        return multilegModel;
    }

    public boolean hasMultilegModel()
    {
        return hasMultilegModel;
    }



    private final CharArrayWrapper multilegModelWrapper = new CharArrayWrapper();
    public MultilegModel multilegModelAsEnum()
    {
        if (!hasMultilegModel)
 return MultilegModel.NULL_VAL;
        return MultilegModel.decode(multilegModel);
    }

    private int multilegPriceMethod = MISSING_INT;

    private boolean hasMultilegPriceMethod;

    public int multilegPriceMethod()
    {
        if (!hasMultilegPriceMethod)
        {
            throw new IllegalArgumentException("No value for optional field: MultilegPriceMethod");
        }

        return multilegPriceMethod;
    }

    public boolean hasMultilegPriceMethod()
    {
        return hasMultilegPriceMethod;
    }



    private final CharArrayWrapper multilegPriceMethodWrapper = new CharArrayWrapper();
    public MultilegPriceMethod multilegPriceMethodAsEnum()
    {
        if (!hasMultilegPriceMethod)
 return MultilegPriceMethod.NULL_VAL;
        return MultilegPriceMethod.decode(multilegPriceMethod);
    }

    private int priceType = MISSING_INT;

    private boolean hasPriceType;

    public int priceType()
    {
        if (!hasPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: PriceType");
        }

        return priceType;
    }

    public boolean hasPriceType()
    {
        return hasPriceType;
    }



    private final CharArrayWrapper priceTypeWrapper = new CharArrayWrapper();
    public PriceType priceTypeAsEnum()
    {
        if (!hasPriceType)
 return PriceType.NULL_VAL;
        return PriceType.decode(priceType);
    }




    private TradingSessionRulesGroupDecoder tradingSessionRulesGroup = null;
    public TradingSessionRulesGroupDecoder tradingSessionRulesGroup()
    {
        return tradingSessionRulesGroup;
    }

    private int noTradingSessionRulesGroupCounter = MISSING_INT;

    private boolean hasNoTradingSessionRulesGroupCounter;

    public int noTradingSessionRulesGroupCounter()
    {
        if (!hasNoTradingSessionRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTradingSessionRulesGroupCounter");
        }

        return noTradingSessionRulesGroupCounter;
    }

    public boolean hasNoTradingSessionRulesGroupCounter()
    {
        return hasNoTradingSessionRulesGroupCounter;
    }




    private TradingSessionRulesGroupIterator tradingSessionRulesGroupIterator = new TradingSessionRulesGroupIterator(this);
    public TradingSessionRulesGroupIterator tradingSessionRulesGroupIterator()
    {
        return tradingSessionRulesGroupIterator.iterator();
    }




    private NestedInstrAttribGroupDecoder nestedInstrAttribGroup = null;
    public NestedInstrAttribGroupDecoder nestedInstrAttribGroup()
    {
        return nestedInstrAttribGroup;
    }

    private int noNestedInstrAttribGroupCounter = MISSING_INT;

    private boolean hasNoNestedInstrAttribGroupCounter;

    public int noNestedInstrAttribGroupCounter()
    {
        if (!hasNoNestedInstrAttribGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedInstrAttribGroupCounter");
        }

        return noNestedInstrAttribGroupCounter;
    }

    public boolean hasNoNestedInstrAttribGroupCounter()
    {
        return hasNoNestedInstrAttribGroupCounter;
    }




    private NestedInstrAttribGroupIterator nestedInstrAttribGroupIterator = new NestedInstrAttribGroupIterator(this);
    public NestedInstrAttribGroupIterator nestedInstrAttribGroupIterator()
    {
        return nestedInstrAttribGroupIterator.iterator();
    }





    private StrikeRulesGroupDecoder strikeRulesGroup = null;
    public StrikeRulesGroupDecoder strikeRulesGroup()
    {
        return strikeRulesGroup;
    }

    private int noStrikeRulesGroupCounter = MISSING_INT;

    private boolean hasNoStrikeRulesGroupCounter;

    public int noStrikeRulesGroupCounter()
    {
        if (!hasNoStrikeRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoStrikeRulesGroupCounter");
        }

        return noStrikeRulesGroupCounter;
    }

    public boolean hasNoStrikeRulesGroupCounter()
    {
        return hasNoStrikeRulesGroupCounter;
    }




    private StrikeRulesGroupIterator strikeRulesGroupIterator = new StrikeRulesGroupIterator(this);
    public StrikeRulesGroupIterator strikeRulesGroupIterator()
    {
        return strikeRulesGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MarketSegmentsGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new MarketSegmentsGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.MARKET_ID:
                hasMarketID = true;
                marketID = buffer.getChars(marketID, valueOffset, valueLength);
                marketIDOffset = valueOffset;
                marketIDLength = valueLength;
                break;

            case Constants.MARKET_SEGMENT_ID:
                hasMarketSegmentID = true;
                marketSegmentID = buffer.getChars(marketSegmentID, valueOffset, valueLength);
                marketSegmentIDOffset = valueOffset;
                marketSegmentIDLength = valueLength;
                break;

            case Constants.NO_TICK_RULES_GROUP_COUNTER:
                hasNoTickRulesGroupCounter = true;
                noTickRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1205, CODEC_VALIDATION_ENABLED);
                if (tickRulesGroup == null)
                {
                    tickRulesGroup = new TickRulesGroupDecoder(trailer, messageFields);
                }
                TickRulesGroupDecoder tickRulesGroupCurrent = tickRulesGroup;
                position = endOfField + 1;
                final int noTickRulesGroupCounter = this.noTickRulesGroupCounter;
                for (int i = 0; i < noTickRulesGroupCounter && position < end; i++)
                {
                    if (tickRulesGroupCurrent != null)
                    {
                        position += tickRulesGroupCurrent.decode(buffer, position, end - position);
                        tickRulesGroupCurrent = tickRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (tickRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_LOT_TYPE_RULES_GROUP_COUNTER:
                hasNoLotTypeRulesGroupCounter = true;
                noLotTypeRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1234, CODEC_VALIDATION_ENABLED);
                if (lotTypeRulesGroup == null)
                {
                    lotTypeRulesGroup = new LotTypeRulesGroupDecoder(trailer, messageFields);
                }
                LotTypeRulesGroupDecoder lotTypeRulesGroupCurrent = lotTypeRulesGroup;
                position = endOfField + 1;
                final int noLotTypeRulesGroupCounter = this.noLotTypeRulesGroupCounter;
                for (int i = 0; i < noLotTypeRulesGroupCounter && position < end; i++)
                {
                    if (lotTypeRulesGroupCurrent != null)
                    {
                        position += lotTypeRulesGroupCurrent.decode(buffer, position, end - position);
                        lotTypeRulesGroupCurrent = lotTypeRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (lotTypeRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.PRICE_LIMIT_TYPE:
                hasPriceLimitType = true;
                priceLimitType = getInt(buffer, valueOffset, endOfField, 1306, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LOW_LIMIT_PRICE:
                hasLowLimitPrice = true;
                lowLimitPrice = getFloat(buffer, lowLimitPrice, valueOffset, valueLength, 1148, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.HIGH_LIMIT_PRICE:
                hasHighLimitPrice = true;
                highLimitPrice = getFloat(buffer, highLimitPrice, valueOffset, valueLength, 1149, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADING_REFERENCE_PRICE:
                hasTradingReferencePrice = true;
                tradingReferencePrice = getFloat(buffer, tradingReferencePrice, valueOffset, valueLength, 1150, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.EXPIRATION_CYCLE:
                hasExpirationCycle = true;
                expirationCycle = getInt(buffer, valueOffset, endOfField, 827, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MIN_TRADE_VOL:
                hasMinTradeVol = true;
                minTradeVol = getFloat(buffer, minTradeVol, valueOffset, valueLength, 562, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MAX_TRADE_VOL:
                hasMaxTradeVol = true;
                maxTradeVol = getFloat(buffer, maxTradeVol, valueOffset, valueLength, 1140, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MAX_PRICE_VARIATION:
                hasMaxPriceVariation = true;
                maxPriceVariation = getFloat(buffer, maxPriceVariation, valueOffset, valueLength, 1143, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.IMPLIED_MARKET_INDICATOR:
                hasImpliedMarketIndicator = true;
                impliedMarketIndicator = getInt(buffer, valueOffset, endOfField, 1144, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADING_CURRENCY:
                hasTradingCurrency = true;
                tradingCurrency = buffer.getChars(tradingCurrency, valueOffset, valueLength);
                tradingCurrencyOffset = valueOffset;
                tradingCurrencyLength = valueLength;
                break;

            case Constants.ROUND_LOT:
                hasRoundLot = true;
                roundLot = getFloat(buffer, roundLot, valueOffset, valueLength, 561, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MULTILEG_MODEL:
                hasMultilegModel = true;
                multilegModel = getInt(buffer, valueOffset, endOfField, 1377, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MULTILEG_PRICE_METHOD:
                hasMultilegPriceMethod = true;
                multilegPriceMethod = getInt(buffer, valueOffset, endOfField, 1378, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE_TYPE:
                hasPriceType = true;
                priceType = getInt(buffer, valueOffset, endOfField, 423, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.NO_TRADING_SESSION_RULES_GROUP_COUNTER:
                hasNoTradingSessionRulesGroupCounter = true;
                noTradingSessionRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1309, CODEC_VALIDATION_ENABLED);
                if (tradingSessionRulesGroup == null)
                {
                    tradingSessionRulesGroup = new TradingSessionRulesGroupDecoder(trailer, messageFields);
                }
                TradingSessionRulesGroupDecoder tradingSessionRulesGroupCurrent = tradingSessionRulesGroup;
                position = endOfField + 1;
                final int noTradingSessionRulesGroupCounter = this.noTradingSessionRulesGroupCounter;
                for (int i = 0; i < noTradingSessionRulesGroupCounter && position < end; i++)
                {
                    if (tradingSessionRulesGroupCurrent != null)
                    {
                        position += tradingSessionRulesGroupCurrent.decode(buffer, position, end - position);
                        tradingSessionRulesGroupCurrent = tradingSessionRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (tradingSessionRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_NESTED_INSTR_ATTRIB_GROUP_COUNTER:
                hasNoNestedInstrAttribGroupCounter = true;
                noNestedInstrAttribGroupCounter = getInt(buffer, valueOffset, endOfField, 1312, CODEC_VALIDATION_ENABLED);
                if (nestedInstrAttribGroup == null)
                {
                    nestedInstrAttribGroup = new NestedInstrAttribGroupDecoder(trailer, messageFields);
                }
                NestedInstrAttribGroupDecoder nestedInstrAttribGroupCurrent = nestedInstrAttribGroup;
                position = endOfField + 1;
                final int noNestedInstrAttribGroupCounter = this.noNestedInstrAttribGroupCounter;
                for (int i = 0; i < noNestedInstrAttribGroupCounter && position < end; i++)
                {
                    if (nestedInstrAttribGroupCurrent != null)
                    {
                        position += nestedInstrAttribGroupCurrent.decode(buffer, position, end - position);
                        nestedInstrAttribGroupCurrent = nestedInstrAttribGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedInstrAttribGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            case Constants.NO_STRIKE_RULES_GROUP_COUNTER:
                hasNoStrikeRulesGroupCounter = true;
                noStrikeRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1201, CODEC_VALIDATION_ENABLED);
                if (strikeRulesGroup == null)
                {
                    strikeRulesGroup = new StrikeRulesGroupDecoder(trailer, messageFields);
                }
                StrikeRulesGroupDecoder strikeRulesGroupCurrent = strikeRulesGroup;
                position = endOfField + 1;
                final int noStrikeRulesGroupCounter = this.noStrikeRulesGroupCounter;
                for (int i = 0; i < noStrikeRulesGroupCounter && position < end; i++)
                {
                    if (strikeRulesGroupCurrent != null)
                    {
                        position += strikeRulesGroupCurrent.decode(buffer, position, end - position);
                        strikeRulesGroupCurrent = strikeRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (strikeRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetExpirationCycle();
        this.resetMinTradeVol();
        this.resetMaxTradeVol();
        this.resetMaxPriceVariation();
        this.resetImpliedMarketIndicator();
        this.resetTradingCurrency();
        this.resetRoundLot();
        this.resetMultilegModel();
        this.resetMultilegPriceMethod();
        this.resetPriceType();
        this.resetTickRulesGroup();
        this.resetLotTypeRulesGroup();
        this.resetPriceLimitType();
        this.resetLowLimitPrice();
        this.resetHighLimitPrice();
        this.resetTradingReferencePrice();
        this.resetTradingSessionRulesGroup();
        this.resetNestedInstrAttribGroup();
        this.resetStrikeRulesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetExpirationCycle()
    {
        hasExpirationCycle = false;
    }

    public void resetMinTradeVol()
    {
        hasMinTradeVol = false;
    }

    public void resetMaxTradeVol()
    {
        hasMaxTradeVol = false;
    }

    public void resetMaxPriceVariation()
    {
        hasMaxPriceVariation = false;
    }

    public void resetImpliedMarketIndicator()
    {
        hasImpliedMarketIndicator = false;
    }

    public void resetTradingCurrency()
    {
        hasTradingCurrency = false;
    }

    public void resetRoundLot()
    {
        hasRoundLot = false;
    }

    public void resetMultilegModel()
    {
        hasMultilegModel = false;
    }

    public void resetMultilegPriceMethod()
    {
        hasMultilegPriceMethod = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetTickRulesGroup()
    {
        for (final TickRulesGroupDecoder tickRulesGroupDecoder : tickRulesGroupIterator.iterator())
        {
            tickRulesGroupDecoder.reset();
            if (tickRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTickRulesGroupCounter = MISSING_INT;
        hasNoTickRulesGroupCounter = false;
    }

    public void resetLotTypeRulesGroup()
    {
        for (final LotTypeRulesGroupDecoder lotTypeRulesGroupDecoder : lotTypeRulesGroupIterator.iterator())
        {
            lotTypeRulesGroupDecoder.reset();
            if (lotTypeRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noLotTypeRulesGroupCounter = MISSING_INT;
        hasNoLotTypeRulesGroupCounter = false;
    }

    public void resetPriceLimitType()
    {
        hasPriceLimitType = false;
    }

    public void resetLowLimitPrice()
    {
        hasLowLimitPrice = false;
    }

    public void resetHighLimitPrice()
    {
        hasHighLimitPrice = false;
    }

    public void resetTradingReferencePrice()
    {
        hasTradingReferencePrice = false;
    }

    public void resetTradingSessionRulesGroup()
    {
        for (final TradingSessionRulesGroupDecoder tradingSessionRulesGroupDecoder : tradingSessionRulesGroupIterator.iterator())
        {
            tradingSessionRulesGroupDecoder.reset();
            if (tradingSessionRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTradingSessionRulesGroupCounter = MISSING_INT;
        hasNoTradingSessionRulesGroupCounter = false;
    }

    public void resetNestedInstrAttribGroup()
    {
        for (final NestedInstrAttribGroupDecoder nestedInstrAttribGroupDecoder : nestedInstrAttribGroupIterator.iterator())
        {
            nestedInstrAttribGroupDecoder.reset();
            if (nestedInstrAttribGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedInstrAttribGroupCounter = MISSING_INT;
        hasNoNestedInstrAttribGroupCounter = false;
    }

    public void resetStrikeRulesGroup()
    {
        for (final StrikeRulesGroupDecoder strikeRulesGroupDecoder : strikeRulesGroupIterator.iterator())
        {
            strikeRulesGroupDecoder.reset();
            if (strikeRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noStrikeRulesGroupCounter = MISSING_INT;
        hasNoStrikeRulesGroupCounter = false;
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
        builder.append("\"MessageName\": \"MarketSegmentsGroup\",\n");
        if (hasMarketID())
        {
            indent(builder, level);
            builder.append("\"MarketID\": \"");
            builder.append(this.marketID(), 0, marketIDLength());
            builder.append("\",\n");
        }

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            builder.append(this.marketSegmentID(), 0, marketSegmentIDLength());
            builder.append("\",\n");
        }

        if (hasNoTickRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TickRulesGroup\": [\n");
            TickRulesGroupDecoder tickRulesGroup = this.tickRulesGroup;
            for (int i = 0, size = this.noTickRulesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                tickRulesGroup.appendTo(builder, level + 1);
                if (tickRulesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                tickRulesGroup = tickRulesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoLotTypeRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"LotTypeRulesGroup\": [\n");
            LotTypeRulesGroupDecoder lotTypeRulesGroup = this.lotTypeRulesGroup;
            for (int i = 0, size = this.noLotTypeRulesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                lotTypeRulesGroup.appendTo(builder, level + 1);
                if (lotTypeRulesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                lotTypeRulesGroup = lotTypeRulesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasPriceLimitType())
        {
            indent(builder, level);
            builder.append("\"PriceLimitType\": \"");
            builder.append(priceLimitType);
            builder.append("\",\n");
        }

        if (hasLowLimitPrice())
        {
            indent(builder, level);
            builder.append("\"LowLimitPrice\": \"");
            lowLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasHighLimitPrice())
        {
            indent(builder, level);
            builder.append("\"HighLimitPrice\": \"");
            highLimitPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTradingReferencePrice())
        {
            indent(builder, level);
            builder.append("\"TradingReferencePrice\": \"");
            tradingReferencePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExpirationCycle())
        {
            indent(builder, level);
            builder.append("\"ExpirationCycle\": \"");
            builder.append(expirationCycle);
            builder.append("\",\n");
        }

        if (hasMinTradeVol())
        {
            indent(builder, level);
            builder.append("\"MinTradeVol\": \"");
            minTradeVol.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxTradeVol())
        {
            indent(builder, level);
            builder.append("\"MaxTradeVol\": \"");
            maxTradeVol.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMaxPriceVariation())
        {
            indent(builder, level);
            builder.append("\"MaxPriceVariation\": \"");
            maxPriceVariation.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasImpliedMarketIndicator())
        {
            indent(builder, level);
            builder.append("\"ImpliedMarketIndicator\": \"");
            builder.append(impliedMarketIndicator);
            builder.append("\",\n");
        }

        if (hasTradingCurrency())
        {
            indent(builder, level);
            builder.append("\"TradingCurrency\": \"");
            builder.append(this.tradingCurrency(), 0, tradingCurrencyLength());
            builder.append("\",\n");
        }

        if (hasRoundLot())
        {
            indent(builder, level);
            builder.append("\"RoundLot\": \"");
            roundLot.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMultilegModel())
        {
            indent(builder, level);
            builder.append("\"MultilegModel\": \"");
            builder.append(multilegModel);
            builder.append("\",\n");
        }

        if (hasMultilegPriceMethod())
        {
            indent(builder, level);
            builder.append("\"MultilegPriceMethod\": \"");
            builder.append(multilegPriceMethod);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasNoTradingSessionRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"TradingSessionRulesGroup\": [\n");
            TradingSessionRulesGroupDecoder tradingSessionRulesGroup = this.tradingSessionRulesGroup;
            for (int i = 0, size = this.noTradingSessionRulesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                tradingSessionRulesGroup.appendTo(builder, level + 1);
                if (tradingSessionRulesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                tradingSessionRulesGroup = tradingSessionRulesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoNestedInstrAttribGroupCounter)
        {
            indent(builder, level);
            builder.append("\"NestedInstrAttribGroup\": [\n");
            NestedInstrAttribGroupDecoder nestedInstrAttribGroup = this.nestedInstrAttribGroup;
            for (int i = 0, size = this.noNestedInstrAttribGroupCounter; i < size; i++)
            {
                indent(builder, level);
                nestedInstrAttribGroup.appendTo(builder, level + 1);
                if (nestedInstrAttribGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                nestedInstrAttribGroup = nestedInstrAttribGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoStrikeRulesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StrikeRulesGroup\": [\n");
            StrikeRulesGroupDecoder strikeRulesGroup = this.strikeRulesGroup;
            for (int i = 0, size = this.noStrikeRulesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                strikeRulesGroup.appendTo(builder, level + 1);
                if (strikeRulesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                strikeRulesGroup = strikeRulesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public MarketSegmentGrpEncoder.MarketSegmentsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketSegmentGrpEncoder.MarketSegmentsGroupEncoder)encoder);
    }

    public MarketSegmentGrpEncoder.MarketSegmentsGroupEncoder toEncoder(final MarketSegmentGrpEncoder.MarketSegmentsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }


        final SecurityTradingRulesEncoder securityTradingRules = encoder.securityTradingRules();
        final BaseTradingRulesEncoder baseTradingRules = securityTradingRules.baseTradingRules();
        final TickRulesEncoder tickRules = baseTradingRules.tickRules();        if (hasNoTickRulesGroupCounter)
        {
            final int size = this.noTickRulesGroupCounter;
            TickRulesGroupDecoder tickRulesGroup = this.tickRulesGroup;
            TickRulesGroupEncoder tickRulesGroupEncoder = tickRules.tickRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tickRulesGroup != null)
                {
                    tickRulesGroup.toEncoder(tickRulesGroupEncoder);
                    tickRulesGroup = tickRulesGroup.next();
                    tickRulesGroupEncoder = tickRulesGroupEncoder.next();
                }
            }
        }



        final LotTypeRulesEncoder lotTypeRules = baseTradingRules.lotTypeRules();        if (hasNoLotTypeRulesGroupCounter)
        {
            final int size = this.noLotTypeRulesGroupCounter;
            LotTypeRulesGroupDecoder lotTypeRulesGroup = this.lotTypeRulesGroup;
            LotTypeRulesGroupEncoder lotTypeRulesGroupEncoder = lotTypeRules.lotTypeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (lotTypeRulesGroup != null)
                {
                    lotTypeRulesGroup.toEncoder(lotTypeRulesGroupEncoder);
                    lotTypeRulesGroup = lotTypeRulesGroup.next();
                    lotTypeRulesGroupEncoder = lotTypeRulesGroupEncoder.next();
                }
            }
        }



        final PriceLimitsEncoder priceLimits = baseTradingRules.priceLimits();        if (hasPriceLimitType())
        {
            priceLimits.priceLimitType(this.priceLimitType());
        }

        if (hasLowLimitPrice())
        {
            priceLimits.lowLimitPrice(this.lowLimitPrice());
        }

        if (hasHighLimitPrice())
        {
            priceLimits.highLimitPrice(this.highLimitPrice());
        }

        if (hasTradingReferencePrice())
        {
            priceLimits.tradingReferencePrice(this.tradingReferencePrice());
        }


        if (hasExpirationCycle())
        {
            baseTradingRules.expirationCycle(this.expirationCycle());
        }

        if (hasMinTradeVol())
        {
            baseTradingRules.minTradeVol(this.minTradeVol());
        }

        if (hasMaxTradeVol())
        {
            baseTradingRules.maxTradeVol(this.maxTradeVol());
        }

        if (hasMaxPriceVariation())
        {
            baseTradingRules.maxPriceVariation(this.maxPriceVariation());
        }

        if (hasImpliedMarketIndicator())
        {
            baseTradingRules.impliedMarketIndicator(this.impliedMarketIndicator());
        }

        if (hasTradingCurrency())
        {
            baseTradingRules.tradingCurrency(this.tradingCurrency(), 0, tradingCurrencyLength());
        }

        if (hasRoundLot())
        {
            baseTradingRules.roundLot(this.roundLot());
        }

        if (hasMultilegModel())
        {
            baseTradingRules.multilegModel(this.multilegModel());
        }

        if (hasMultilegPriceMethod())
        {
            baseTradingRules.multilegPriceMethod(this.multilegPriceMethod());
        }

        if (hasPriceType())
        {
            baseTradingRules.priceType(this.priceType());
        }



        final TradingSessionRulesGrpEncoder tradingSessionRulesGrp = securityTradingRules.tradingSessionRulesGrp();        if (hasNoTradingSessionRulesGroupCounter)
        {
            final int size = this.noTradingSessionRulesGroupCounter;
            TradingSessionRulesGroupDecoder tradingSessionRulesGroup = this.tradingSessionRulesGroup;
            TradingSessionRulesGroupEncoder tradingSessionRulesGroupEncoder = tradingSessionRulesGrp.tradingSessionRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (tradingSessionRulesGroup != null)
                {
                    tradingSessionRulesGroup.toEncoder(tradingSessionRulesGroupEncoder);
                    tradingSessionRulesGroup = tradingSessionRulesGroup.next();
                    tradingSessionRulesGroupEncoder = tradingSessionRulesGroupEncoder.next();
                }
            }
        }



        final NestedInstrumentAttributeEncoder nestedInstrumentAttribute = securityTradingRules.nestedInstrumentAttribute();        if (hasNoNestedInstrAttribGroupCounter)
        {
            final int size = this.noNestedInstrAttribGroupCounter;
            NestedInstrAttribGroupDecoder nestedInstrAttribGroup = this.nestedInstrAttribGroup;
            NestedInstrAttribGroupEncoder nestedInstrAttribGroupEncoder = nestedInstrumentAttribute.nestedInstrAttribGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedInstrAttribGroup != null)
                {
                    nestedInstrAttribGroup.toEncoder(nestedInstrAttribGroupEncoder);
                    nestedInstrAttribGroup = nestedInstrAttribGroup.next();
                    nestedInstrAttribGroupEncoder = nestedInstrAttribGroupEncoder.next();
                }
            }
        }




        final StrikeRulesEncoder strikeRules = encoder.strikeRules();        if (hasNoStrikeRulesGroupCounter)
        {
            final int size = this.noStrikeRulesGroupCounter;
            StrikeRulesGroupDecoder strikeRulesGroup = this.strikeRulesGroup;
            StrikeRulesGroupEncoder strikeRulesGroupEncoder = strikeRules.strikeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (strikeRulesGroup != null)
                {
                    strikeRulesGroup.toEncoder(strikeRulesGroupEncoder);
                    strikeRulesGroup = strikeRulesGroup.next();
                    strikeRulesGroupEncoder = strikeRulesGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class MarketSegmentsGroupIterator implements Iterable<MarketSegmentsGroupDecoder>, java.util.Iterator<MarketSegmentsGroupDecoder>
    {
        private final MarketSegmentGrpDecoder parent;
        private int remainder;
        private MarketSegmentsGroupDecoder current;

        public MarketSegmentsGroupIterator(final MarketSegmentGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public MarketSegmentsGroupDecoder next()
        {
            remainder--;
            final MarketSegmentsGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoMarketSegmentsGroupCounter() ? parent.noMarketSegmentsGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.marketSegmentsGroup();
        }

        public MarketSegmentsGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public MarketSegmentsGroupIterator marketSegmentsGroupIterator();
    public int noMarketSegmentsGroupCounter();
    public boolean hasNoMarketSegmentsGroupCounter();
    public MarketSegmentsGroupDecoder marketSegmentsGroup();

}
