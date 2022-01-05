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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MDFullGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MDFullGrpEncoder.MDEntriesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RateSourceEncoder.RateSourcesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecSizesGrpEncoder.OfSecSizesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;

public interface MDFullGrpDecoder 
{



public class MDEntriesGroupDecoder extends CommonDecoderImpl implements YieldDataDecoder, SpreadOrBenchmarkCurveDataDecoder, RateSourceDecoder, SecSizesGrpDecoder, PartiesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.M_D_ENTRY_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(142);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.M_D_ENTRY_TYPE);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_ID);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_PX);
            GROUP_FIELDS.add(Constants.PRICE_TYPE);
            GROUP_FIELDS.add(Constants.YIELD_TYPE);
            GROUP_FIELDS.add(Constants.YIELD);
            GROUP_FIELDS.add(Constants.YIELD_CALC_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE);
            GROUP_FIELDS.add(Constants.YIELD_REDEMPTION_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.SPREAD);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_CURRENCY);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_NAME);
            GROUP_FIELDS.add(Constants.BENCHMARK_CURVE_POINT);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE);
            GROUP_FIELDS.add(Constants.BENCHMARK_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID);
            GROUP_FIELDS.add(Constants.BENCHMARK_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ORD_TYPE);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_SIZE);
            GROUP_FIELDS.add(Constants.LOT_TYPE);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_DATE);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_TIME);
            GROUP_FIELDS.add(Constants.TICK_DIRECTION);
            GROUP_FIELDS.add(Constants.M_D_MKT);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.SECURITY_TRADING_STATUS);
            GROUP_FIELDS.add(Constants.HALT_REASON);
            GROUP_FIELDS.add(Constants.QUOTE_CONDITION);
            GROUP_FIELDS.add(Constants.TRADE_CONDITION);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_ORIGINATOR);
            GROUP_FIELDS.add(Constants.LOCATION_ID);
            GROUP_FIELDS.add(Constants.DESK_ID);
            GROUP_FIELDS.add(Constants.OPEN_CLOSE_SETTL_FLAG);
            GROUP_FIELDS.add(Constants.TIME_IN_FORCE);
            GROUP_FIELDS.add(Constants.EXPIRE_DATE);
            GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            GROUP_FIELDS.add(Constants.MIN_QTY);
            GROUP_FIELDS.add(Constants.EXEC_INST);
            GROUP_FIELDS.add(Constants.SELLER_DAYS);
            GROUP_FIELDS.add(Constants.ORDER_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_ORDER_ID);
            GROUP_FIELDS.add(Constants.QUOTE_ENTRY_ID);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_BUYER);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_SELLER);
            GROUP_FIELDS.add(Constants.NUMBER_OF_ORDERS);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_POSITION_NO);
            GROUP_FIELDS.add(Constants.SCOPE);
            GROUP_FIELDS.add(Constants.PRICE_DELTA);
            GROUP_FIELDS.add(Constants.TRD_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            GROUP_FIELDS.add(Constants.M_D_PRICE_LEVEL);
            GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.M_D_ORIGIN_TYPE);
            GROUP_FIELDS.add(Constants.HIGH_PX);
            GROUP_FIELDS.add(Constants.LOW_PX);
            GROUP_FIELDS.add(Constants.FIRST_PX);
            GROUP_FIELDS.add(Constants.LAST_PX);
            GROUP_FIELDS.add(Constants.TRADE_VOLUME);
            GROUP_FIELDS.add(Constants.SETTL_TYPE);
            GROUP_FIELDS.add(Constants.SETTL_DATE);
            GROUP_FIELDS.add(Constants.M_D_QUOTE_TYPE);
            GROUP_FIELDS.add(Constants.RPT_SEQ);
            GROUP_FIELDS.add(Constants.DEALING_CAPACITY);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_SPOT_RATE);
            GROUP_FIELDS.add(Constants.M_D_ENTRY_FORWARD_POINTS);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(114);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_TYPE);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_ID);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_PX);
            ALL_GROUP_FIELDS.add(Constants.PRICE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.ORD_TYPE);
            ALL_GROUP_FIELDS.add(Constants.CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_SIZE);
            ALL_GROUP_FIELDS.add(Constants.LOT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_DATE);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_TIME);
            ALL_GROUP_FIELDS.add(Constants.TICK_DIRECTION);
            ALL_GROUP_FIELDS.add(Constants.M_D_MKT);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.SECURITY_TRADING_STATUS);
            ALL_GROUP_FIELDS.add(Constants.HALT_REASON);
            ALL_GROUP_FIELDS.add(Constants.QUOTE_CONDITION);
            ALL_GROUP_FIELDS.add(Constants.TRADE_CONDITION);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_ORIGINATOR);
            ALL_GROUP_FIELDS.add(Constants.LOCATION_ID);
            ALL_GROUP_FIELDS.add(Constants.DESK_ID);
            ALL_GROUP_FIELDS.add(Constants.OPEN_CLOSE_SETTL_FLAG);
            ALL_GROUP_FIELDS.add(Constants.TIME_IN_FORCE);
            ALL_GROUP_FIELDS.add(Constants.EXPIRE_DATE);
            ALL_GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            ALL_GROUP_FIELDS.add(Constants.MIN_QTY);
            ALL_GROUP_FIELDS.add(Constants.EXEC_INST);
            ALL_GROUP_FIELDS.add(Constants.SELLER_DAYS);
            ALL_GROUP_FIELDS.add(Constants.ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_ORDER_ID);
            ALL_GROUP_FIELDS.add(Constants.QUOTE_ENTRY_ID);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_BUYER);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_SELLER);
            ALL_GROUP_FIELDS.add(Constants.NUMBER_OF_ORDERS);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_POSITION_NO);
            ALL_GROUP_FIELDS.add(Constants.SCOPE);
            ALL_GROUP_FIELDS.add(Constants.PRICE_DELTA);
            ALL_GROUP_FIELDS.add(Constants.TRD_TYPE);
            ALL_GROUP_FIELDS.add(Constants.TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT);
            ALL_GROUP_FIELDS.add(Constants.M_D_PRICE_LEVEL);
            ALL_GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.M_D_ORIGIN_TYPE);
            ALL_GROUP_FIELDS.add(Constants.HIGH_PX);
            ALL_GROUP_FIELDS.add(Constants.LOW_PX);
            ALL_GROUP_FIELDS.add(Constants.FIRST_PX);
            ALL_GROUP_FIELDS.add(Constants.LAST_PX);
            ALL_GROUP_FIELDS.add(Constants.TRADE_VOLUME);
            ALL_GROUP_FIELDS.add(Constants.SETTL_TYPE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_DATE);
            ALL_GROUP_FIELDS.add(Constants.M_D_QUOTE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.RPT_SEQ);
            ALL_GROUP_FIELDS.add(Constants.DEALING_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_SPOT_RATE);
            ALL_GROUP_FIELDS.add(Constants.M_D_ENTRY_FORWARD_POINTS);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(2);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDEntryType.isValid(mDEntryType()))
        {
            invalidTagId = 269;
            rejectReason = 5;
            return false;
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

        if (hasYieldType)
        {
        yieldTypeWrapper.wrap(this.yieldType(), yieldTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !YieldType.isValid(yieldTypeWrapper))
        {
            invalidTagId = 235;
            rejectReason = 5;
            return false;
        }
        }

        if (hasBenchmarkCurveName)
        {
        benchmarkCurveNameWrapper.wrap(this.benchmarkCurveName(), benchmarkCurveNameLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BenchmarkCurveName.isValid(benchmarkCurveNameWrapper))
        {
            invalidTagId = 221;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrdType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrdType.isValid(ordType()))
        {
            invalidTagId = 40;
            rejectReason = 5;
            return false;
        }
        }

        if (hasLotType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !LotType.isValid(lotType()))
        {
            invalidTagId = 1093;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTickDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TickDirection.isValid(tickDirection()))
        {
            invalidTagId = 274;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionID)
        {
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionSubID)
        {
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionSubID.isValid(tradingSessionSubIDWrapper))
        {
            invalidTagId = 625;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityTradingStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityTradingStatus.isValid(securityTradingStatus()))
        {
            invalidTagId = 326;
            rejectReason = 5;
            return false;
        }
        }

        if (hasHaltReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !HaltReason.isValid(haltReason()))
        {
            invalidTagId = 327;
            rejectReason = 5;
            return false;
        }
        }

        if (hasQuoteCondition)
        {
          int quoteConditionOffset = 0;
          for (int i = 0; i < quoteConditionLength; i++)
          {
              if (this.quoteCondition()[i] == ' ')
              {
                  quoteConditionWrapper.wrap(this.quoteCondition(), quoteConditionOffset, i - quoteConditionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteCondition.isValid(quoteConditionWrapper))
        {
            invalidTagId = 276;
            rejectReason = 5;
            return false;
        }
                  quoteConditionOffset = i + 1;
              }
          }
          quoteConditionWrapper.wrap(this.quoteCondition(), quoteConditionOffset, quoteConditionLength - quoteConditionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !QuoteCondition.isValid(quoteConditionWrapper))
        {
            invalidTagId = 276;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradeCondition)
        {
          int tradeConditionOffset = 0;
          for (int i = 0; i < tradeConditionLength; i++)
          {
              if (this.tradeCondition()[i] == ' ')
              {
                  tradeConditionWrapper.wrap(this.tradeCondition(), tradeConditionOffset, i - tradeConditionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeCondition.isValid(tradeConditionWrapper))
        {
            invalidTagId = 277;
            rejectReason = 5;
            return false;
        }
                  tradeConditionOffset = i + 1;
              }
          }
          tradeConditionWrapper.wrap(this.tradeCondition(), tradeConditionOffset, tradeConditionLength - tradeConditionOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeCondition.isValid(tradeConditionWrapper))
        {
            invalidTagId = 277;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOpenCloseSettlFlag)
        {
          int openCloseSettlFlagOffset = 0;
          for (int i = 0; i < openCloseSettlFlagLength; i++)
          {
              if (this.openCloseSettlFlag()[i] == ' ')
              {
                  openCloseSettlFlagWrapper.wrap(this.openCloseSettlFlag(), openCloseSettlFlagOffset, i - openCloseSettlFlagOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OpenCloseSettlFlag.isValid(openCloseSettlFlagWrapper))
        {
            invalidTagId = 286;
            rejectReason = 5;
            return false;
        }
                  openCloseSettlFlagOffset = i + 1;
              }
          }
          openCloseSettlFlagWrapper.wrap(this.openCloseSettlFlag(), openCloseSettlFlagOffset, openCloseSettlFlagLength - openCloseSettlFlagOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OpenCloseSettlFlag.isValid(openCloseSettlFlagWrapper))
        {
            invalidTagId = 286;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTimeInForce)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TimeInForce.isValid(timeInForce()))
        {
            invalidTagId = 59;
            rejectReason = 5;
            return false;
        }
        }

        if (hasExecInst)
        {
          int execInstOffset = 0;
          for (int i = 0; i < execInstLength; i++)
          {
              if (this.execInst()[i] == ' ')
              {
                  execInstWrapper.wrap(this.execInst(), execInstOffset, i - execInstOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecInst.isValid(execInstWrapper))
        {
            invalidTagId = 18;
            rejectReason = 5;
            return false;
        }
                  execInstOffset = i + 1;
              }
          }
          execInstWrapper.wrap(this.execInst(), execInstOffset, execInstLength - execInstOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ExecInst.isValid(execInstWrapper))
        {
            invalidTagId = 18;
            rejectReason = 5;
            return false;
        }
        }

        if (hasScope)
        {
          int scopeOffset = 0;
          for (int i = 0; i < scopeLength; i++)
          {
              if (this.scope()[i] == ' ')
              {
                  scopeWrapper.wrap(this.scope(), scopeOffset, i - scopeOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Scope.isValid(scopeWrapper))
        {
            invalidTagId = 546;
            rejectReason = 5;
            return false;
        }
                  scopeOffset = i + 1;
              }
          }
          scopeWrapper.wrap(this.scope(), scopeOffset, scopeLength - scopeOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Scope.isValid(scopeWrapper))
        {
            invalidTagId = 546;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTrdType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TrdType.isValid(trdType()))
        {
            invalidTagId = 828;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderCapacity.isValid(orderCapacity()))
        {
            invalidTagId = 528;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMDOriginType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDOriginType.isValid(mDOriginType()))
        {
            invalidTagId = 1024;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlType)
        {
        settlTypeWrapper.wrap(this.settlType(), settlTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlType.isValid(settlTypeWrapper))
        {
            invalidTagId = 63;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMDQuoteType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MDQuoteType.isValid(mDQuoteType()))
        {
            invalidTagId = 1070;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDealingCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DealingCapacity.isValid(dealingCapacity()))
        {
            invalidTagId = 1048;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoRateSourcesGroupCounter)
        {
            {
                int count = 0;
                final RateSourcesGroupIterator iterator = rateSourcesGroupIterator.iterator();
                for (final RateSourcesGroupDecoder group : iterator)
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
                    invalidTagId = 1445;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoOfSecSizesGroupCounter)
        {
            {
                int count = 0;
                final OfSecSizesGroupIterator iterator = ofSecSizesGroupIterator.iterator();
                for (final OfSecSizesGroupDecoder group : iterator)
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
                    invalidTagId = 1177;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final PartyIDsGroupIterator iterator = partyIDsGroupIterator.iterator();
                for (final PartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 453;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public MDEntriesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private MDEntriesGroupDecoder next = null;

    public MDEntriesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(124);

    private char mDEntryType = MISSING_CHAR;

    public char mDEntryType()
    {
        return mDEntryType;
    }



    private final CharArrayWrapper mDEntryTypeWrapper = new CharArrayWrapper();
    public MDEntryType mDEntryTypeAsEnum()
    {
        return MDEntryType.decode(mDEntryType);
    }

    private char[] mDEntryID = new char[1];

    private boolean hasMDEntryID;

    public char[] mDEntryID()
    {
        if (!hasMDEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryID");
        }

        return mDEntryID;
    }

    public boolean hasMDEntryID()
    {
        return hasMDEntryID;
    }


    private int mDEntryIDOffset;

    private int mDEntryIDLength;

    public int mDEntryIDLength()
    {
        if (!hasMDEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryID");
        }

        return mDEntryIDLength;
    }

    public String mDEntryIDAsString()
    {
        return hasMDEntryID ? new String(mDEntryID, 0, mDEntryIDLength) : null;
    }

    public void mDEntryID(final AsciiSequenceView view)
    {
        if (!hasMDEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryID");
        }

        view.wrap(buffer, mDEntryIDOffset, mDEntryIDLength);
    }


    private DecimalFloat mDEntryPx = DecimalFloat.newNaNValue();

    private boolean hasMDEntryPx;

    public DecimalFloat mDEntryPx()
    {
        if (!hasMDEntryPx)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryPx");
        }

        return mDEntryPx;
    }

    public boolean hasMDEntryPx()
    {
        return hasMDEntryPx;
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


    private char[] yieldType = new char[1];

    private boolean hasYieldType;

    public char[] yieldType()
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        return yieldType;
    }

    public boolean hasYieldType()
    {
        return hasYieldType;
    }


    private int yieldTypeOffset;

    private int yieldTypeLength;

    public int yieldTypeLength()
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        return yieldTypeLength;
    }

    public String yieldTypeAsString()
    {
        return hasYieldType ? new String(yieldType, 0, yieldTypeLength) : null;
    }

    public void yieldType(final AsciiSequenceView view)
    {
        if (!hasYieldType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldType");
        }

        view.wrap(buffer, yieldTypeOffset, yieldTypeLength);
    }


    private final CharArrayWrapper yieldTypeWrapper = new CharArrayWrapper();
    public YieldType yieldTypeAsEnum()
    {
        if (!hasYieldType)
 return YieldType.NULL_VAL;
        yieldTypeWrapper.wrap(this.yieldType(), yieldTypeLength);
        return YieldType.decode(yieldTypeWrapper);
    }

    private DecimalFloat yield = DecimalFloat.newNaNValue();

    private boolean hasYield;

    public DecimalFloat yield()
    {
        if (!hasYield)
        {
            throw new IllegalArgumentException("No value for optional field: Yield");
        }

        return yield;
    }

    public boolean hasYield()
    {
        return hasYield;
    }



    private byte[] yieldCalcDate = new byte[8];

    private boolean hasYieldCalcDate;

    public byte[] yieldCalcDate()
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        return yieldCalcDate;
    }

    public boolean hasYieldCalcDate()
    {
        return hasYieldCalcDate;
    }


    private int yieldCalcDateOffset;

    private int yieldCalcDateLength;

    public int yieldCalcDateLength()
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        return yieldCalcDateLength;
    }

    public String yieldCalcDateAsString()
    {
        return hasYieldCalcDate ? new String(yieldCalcDate, 0, yieldCalcDateLength) : null;
    }

    public void yieldCalcDate(final AsciiSequenceView view)
    {
        if (!hasYieldCalcDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldCalcDate");
        }

        view.wrap(buffer, yieldCalcDateOffset, yieldCalcDateLength);
    }


    private byte[] yieldRedemptionDate = new byte[8];

    private boolean hasYieldRedemptionDate;

    public byte[] yieldRedemptionDate()
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        return yieldRedemptionDate;
    }

    public boolean hasYieldRedemptionDate()
    {
        return hasYieldRedemptionDate;
    }


    private int yieldRedemptionDateOffset;

    private int yieldRedemptionDateLength;

    public int yieldRedemptionDateLength()
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        return yieldRedemptionDateLength;
    }

    public String yieldRedemptionDateAsString()
    {
        return hasYieldRedemptionDate ? new String(yieldRedemptionDate, 0, yieldRedemptionDateLength) : null;
    }

    public void yieldRedemptionDate(final AsciiSequenceView view)
    {
        if (!hasYieldRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionDate");
        }

        view.wrap(buffer, yieldRedemptionDateOffset, yieldRedemptionDateLength);
    }


    private DecimalFloat yieldRedemptionPrice = DecimalFloat.newNaNValue();

    private boolean hasYieldRedemptionPrice;

    public DecimalFloat yieldRedemptionPrice()
    {
        if (!hasYieldRedemptionPrice)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionPrice");
        }

        return yieldRedemptionPrice;
    }

    public boolean hasYieldRedemptionPrice()
    {
        return hasYieldRedemptionPrice;
    }



    private int yieldRedemptionPriceType = MISSING_INT;

    private boolean hasYieldRedemptionPriceType;

    public int yieldRedemptionPriceType()
    {
        if (!hasYieldRedemptionPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: YieldRedemptionPriceType");
        }

        return yieldRedemptionPriceType;
    }

    public boolean hasYieldRedemptionPriceType()
    {
        return hasYieldRedemptionPriceType;
    }





    private DecimalFloat spread = DecimalFloat.newNaNValue();

    private boolean hasSpread;

    public DecimalFloat spread()
    {
        if (!hasSpread)
        {
            throw new IllegalArgumentException("No value for optional field: Spread");
        }

        return spread;
    }

    public boolean hasSpread()
    {
        return hasSpread;
    }



    private char[] benchmarkCurveCurrency = new char[1];

    private boolean hasBenchmarkCurveCurrency;

    public char[] benchmarkCurveCurrency()
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        return benchmarkCurveCurrency;
    }

    public boolean hasBenchmarkCurveCurrency()
    {
        return hasBenchmarkCurveCurrency;
    }


    private int benchmarkCurveCurrencyOffset;

    private int benchmarkCurveCurrencyLength;

    public int benchmarkCurveCurrencyLength()
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        return benchmarkCurveCurrencyLength;
    }

    public String benchmarkCurveCurrencyAsString()
    {
        return hasBenchmarkCurveCurrency ? new String(benchmarkCurveCurrency, 0, benchmarkCurveCurrencyLength) : null;
    }

    public void benchmarkCurveCurrency(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurveCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveCurrency");
        }

        view.wrap(buffer, benchmarkCurveCurrencyOffset, benchmarkCurveCurrencyLength);
    }


    private char[] benchmarkCurveName = new char[1];

    private boolean hasBenchmarkCurveName;

    public char[] benchmarkCurveName()
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        return benchmarkCurveName;
    }

    public boolean hasBenchmarkCurveName()
    {
        return hasBenchmarkCurveName;
    }


    private int benchmarkCurveNameOffset;

    private int benchmarkCurveNameLength;

    public int benchmarkCurveNameLength()
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        return benchmarkCurveNameLength;
    }

    public String benchmarkCurveNameAsString()
    {
        return hasBenchmarkCurveName ? new String(benchmarkCurveName, 0, benchmarkCurveNameLength) : null;
    }

    public void benchmarkCurveName(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurveName)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurveName");
        }

        view.wrap(buffer, benchmarkCurveNameOffset, benchmarkCurveNameLength);
    }


    private final CharArrayWrapper benchmarkCurveNameWrapper = new CharArrayWrapper();
    public BenchmarkCurveName benchmarkCurveNameAsEnum()
    {
        if (!hasBenchmarkCurveName)
 return BenchmarkCurveName.NULL_VAL;
        benchmarkCurveNameWrapper.wrap(this.benchmarkCurveName(), benchmarkCurveNameLength);
        return BenchmarkCurveName.decode(benchmarkCurveNameWrapper);
    }

    private char[] benchmarkCurvePoint = new char[1];

    private boolean hasBenchmarkCurvePoint;

    public char[] benchmarkCurvePoint()
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        return benchmarkCurvePoint;
    }

    public boolean hasBenchmarkCurvePoint()
    {
        return hasBenchmarkCurvePoint;
    }


    private int benchmarkCurvePointOffset;

    private int benchmarkCurvePointLength;

    public int benchmarkCurvePointLength()
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        return benchmarkCurvePointLength;
    }

    public String benchmarkCurvePointAsString()
    {
        return hasBenchmarkCurvePoint ? new String(benchmarkCurvePoint, 0, benchmarkCurvePointLength) : null;
    }

    public void benchmarkCurvePoint(final AsciiSequenceView view)
    {
        if (!hasBenchmarkCurvePoint)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkCurvePoint");
        }

        view.wrap(buffer, benchmarkCurvePointOffset, benchmarkCurvePointLength);
    }


    private DecimalFloat benchmarkPrice = DecimalFloat.newNaNValue();

    private boolean hasBenchmarkPrice;

    public DecimalFloat benchmarkPrice()
    {
        if (!hasBenchmarkPrice)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkPrice");
        }

        return benchmarkPrice;
    }

    public boolean hasBenchmarkPrice()
    {
        return hasBenchmarkPrice;
    }



    private int benchmarkPriceType = MISSING_INT;

    private boolean hasBenchmarkPriceType;

    public int benchmarkPriceType()
    {
        if (!hasBenchmarkPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkPriceType");
        }

        return benchmarkPriceType;
    }

    public boolean hasBenchmarkPriceType()
    {
        return hasBenchmarkPriceType;
    }



    private char[] benchmarkSecurityID = new char[1];

    private boolean hasBenchmarkSecurityID;

    public char[] benchmarkSecurityID()
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        return benchmarkSecurityID;
    }

    public boolean hasBenchmarkSecurityID()
    {
        return hasBenchmarkSecurityID;
    }


    private int benchmarkSecurityIDOffset;

    private int benchmarkSecurityIDLength;

    public int benchmarkSecurityIDLength()
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        return benchmarkSecurityIDLength;
    }

    public String benchmarkSecurityIDAsString()
    {
        return hasBenchmarkSecurityID ? new String(benchmarkSecurityID, 0, benchmarkSecurityIDLength) : null;
    }

    public void benchmarkSecurityID(final AsciiSequenceView view)
    {
        if (!hasBenchmarkSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityID");
        }

        view.wrap(buffer, benchmarkSecurityIDOffset, benchmarkSecurityIDLength);
    }


    private char[] benchmarkSecurityIDSource = new char[1];

    private boolean hasBenchmarkSecurityIDSource;

    public char[] benchmarkSecurityIDSource()
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        return benchmarkSecurityIDSource;
    }

    public boolean hasBenchmarkSecurityIDSource()
    {
        return hasBenchmarkSecurityIDSource;
    }


    private int benchmarkSecurityIDSourceOffset;

    private int benchmarkSecurityIDSourceLength;

    public int benchmarkSecurityIDSourceLength()
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        return benchmarkSecurityIDSourceLength;
    }

    public String benchmarkSecurityIDSourceAsString()
    {
        return hasBenchmarkSecurityIDSource ? new String(benchmarkSecurityIDSource, 0, benchmarkSecurityIDSourceLength) : null;
    }

    public void benchmarkSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasBenchmarkSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: BenchmarkSecurityIDSource");
        }

        view.wrap(buffer, benchmarkSecurityIDSourceOffset, benchmarkSecurityIDSourceLength);
    }



    private char ordType = MISSING_CHAR;

    private boolean hasOrdType;

    public char ordType()
    {
        if (!hasOrdType)
        {
            throw new IllegalArgumentException("No value for optional field: OrdType");
        }

        return ordType;
    }

    public boolean hasOrdType()
    {
        return hasOrdType;
    }



    private final CharArrayWrapper ordTypeWrapper = new CharArrayWrapper();
    public OrdType ordTypeAsEnum()
    {
        if (!hasOrdType)
 return OrdType.NULL_VAL;
        return OrdType.decode(ordType);
    }

    private char[] currency = new char[1];

    private boolean hasCurrency;

    public char[] currency()
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        return currency;
    }

    public boolean hasCurrency()
    {
        return hasCurrency;
    }


    private int currencyOffset;

    private int currencyLength;

    public int currencyLength()
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        return currencyLength;
    }

    public String currencyAsString()
    {
        return hasCurrency ? new String(currency, 0, currencyLength) : null;
    }

    public void currency(final AsciiSequenceView view)
    {
        if (!hasCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: Currency");
        }

        view.wrap(buffer, currencyOffset, currencyLength);
    }


    private char[] settlCurrency = new char[1];

    private boolean hasSettlCurrency;

    public char[] settlCurrency()
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        return settlCurrency;
    }

    public boolean hasSettlCurrency()
    {
        return hasSettlCurrency;
    }


    private int settlCurrencyOffset;

    private int settlCurrencyLength;

    public int settlCurrencyLength()
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        return settlCurrencyLength;
    }

    public String settlCurrencyAsString()
    {
        return hasSettlCurrency ? new String(settlCurrency, 0, settlCurrencyLength) : null;
    }

    public void settlCurrency(final AsciiSequenceView view)
    {
        if (!hasSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrency");
        }

        view.wrap(buffer, settlCurrencyOffset, settlCurrencyLength);
    }




    private RateSourcesGroupDecoder rateSourcesGroup = null;
    public RateSourcesGroupDecoder rateSourcesGroup()
    {
        return rateSourcesGroup;
    }

    private int noRateSourcesGroupCounter = MISSING_INT;

    private boolean hasNoRateSourcesGroupCounter;

    public int noRateSourcesGroupCounter()
    {
        if (!hasNoRateSourcesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRateSourcesGroupCounter");
        }

        return noRateSourcesGroupCounter;
    }

    public boolean hasNoRateSourcesGroupCounter()
    {
        return hasNoRateSourcesGroupCounter;
    }




    private RateSourcesGroupIterator rateSourcesGroupIterator = new RateSourcesGroupIterator(this);
    public RateSourcesGroupIterator rateSourcesGroupIterator()
    {
        return rateSourcesGroupIterator.iterator();
    }


    private DecimalFloat mDEntrySize = DecimalFloat.newNaNValue();

    private boolean hasMDEntrySize;

    public DecimalFloat mDEntrySize()
    {
        if (!hasMDEntrySize)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntrySize");
        }

        return mDEntrySize;
    }

    public boolean hasMDEntrySize()
    {
        return hasMDEntrySize;
    }





    private OfSecSizesGroupDecoder ofSecSizesGroup = null;
    public OfSecSizesGroupDecoder ofSecSizesGroup()
    {
        return ofSecSizesGroup;
    }

    private int noOfSecSizesGroupCounter = MISSING_INT;

    private boolean hasNoOfSecSizesGroupCounter;

    public int noOfSecSizesGroupCounter()
    {
        if (!hasNoOfSecSizesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoOfSecSizesGroupCounter");
        }

        return noOfSecSizesGroupCounter;
    }

    public boolean hasNoOfSecSizesGroupCounter()
    {
        return hasNoOfSecSizesGroupCounter;
    }




    private OfSecSizesGroupIterator ofSecSizesGroupIterator = new OfSecSizesGroupIterator(this);
    public OfSecSizesGroupIterator ofSecSizesGroupIterator()
    {
        return ofSecSizesGroupIterator.iterator();
    }


    private char lotType = MISSING_CHAR;

    private boolean hasLotType;

    public char lotType()
    {
        if (!hasLotType)
        {
            throw new IllegalArgumentException("No value for optional field: LotType");
        }

        return lotType;
    }

    public boolean hasLotType()
    {
        return hasLotType;
    }



    private final CharArrayWrapper lotTypeWrapper = new CharArrayWrapper();
    public LotType lotTypeAsEnum()
    {
        if (!hasLotType)
 return LotType.NULL_VAL;
        return LotType.decode(lotType);
    }

    private byte[] mDEntryDate = new byte[8];

    private boolean hasMDEntryDate;

    public byte[] mDEntryDate()
    {
        if (!hasMDEntryDate)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryDate");
        }

        return mDEntryDate;
    }

    public boolean hasMDEntryDate()
    {
        return hasMDEntryDate;
    }


    private int mDEntryDateOffset;

    private int mDEntryDateLength;

    public int mDEntryDateLength()
    {
        if (!hasMDEntryDate)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryDate");
        }

        return mDEntryDateLength;
    }

    public String mDEntryDateAsString()
    {
        return hasMDEntryDate ? new String(mDEntryDate, 0, mDEntryDateLength) : null;
    }

    public void mDEntryDate(final AsciiSequenceView view)
    {
        if (!hasMDEntryDate)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryDate");
        }

        view.wrap(buffer, mDEntryDateOffset, mDEntryDateLength);
    }


    private byte[] mDEntryTime = new byte[12];

    private boolean hasMDEntryTime;

    public byte[] mDEntryTime()
    {
        if (!hasMDEntryTime)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryTime");
        }

        return mDEntryTime;
    }

    public boolean hasMDEntryTime()
    {
        return hasMDEntryTime;
    }


    private int mDEntryTimeOffset;

    private int mDEntryTimeLength;

    public int mDEntryTimeLength()
    {
        if (!hasMDEntryTime)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryTime");
        }

        return mDEntryTimeLength;
    }

    public String mDEntryTimeAsString()
    {
        return hasMDEntryTime ? new String(mDEntryTime, 0, mDEntryTimeLength) : null;
    }

    public void mDEntryTime(final AsciiSequenceView view)
    {
        if (!hasMDEntryTime)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryTime");
        }

        view.wrap(buffer, mDEntryTimeOffset, mDEntryTimeLength);
    }


    private char tickDirection = MISSING_CHAR;

    private boolean hasTickDirection;

    public char tickDirection()
    {
        if (!hasTickDirection)
        {
            throw new IllegalArgumentException("No value for optional field: TickDirection");
        }

        return tickDirection;
    }

    public boolean hasTickDirection()
    {
        return hasTickDirection;
    }



    private final CharArrayWrapper tickDirectionWrapper = new CharArrayWrapper();
    public TickDirection tickDirectionAsEnum()
    {
        if (!hasTickDirection)
 return TickDirection.NULL_VAL;
        return TickDirection.decode(tickDirection);
    }

    private char[] mDMkt = new char[1];

    private boolean hasMDMkt;

    public char[] mDMkt()
    {
        if (!hasMDMkt)
        {
            throw new IllegalArgumentException("No value for optional field: MDMkt");
        }

        return mDMkt;
    }

    public boolean hasMDMkt()
    {
        return hasMDMkt;
    }


    private int mDMktOffset;

    private int mDMktLength;

    public int mDMktLength()
    {
        if (!hasMDMkt)
        {
            throw new IllegalArgumentException("No value for optional field: MDMkt");
        }

        return mDMktLength;
    }

    public String mDMktAsString()
    {
        return hasMDMkt ? new String(mDMkt, 0, mDMktLength) : null;
    }

    public void mDMkt(final AsciiSequenceView view)
    {
        if (!hasMDMkt)
        {
            throw new IllegalArgumentException("No value for optional field: MDMkt");
        }

        view.wrap(buffer, mDMktOffset, mDMktLength);
    }


    private char[] tradingSessionID = new char[1];

    private boolean hasTradingSessionID;

    public char[] tradingSessionID()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionID;
    }

    public boolean hasTradingSessionID()
    {
        return hasTradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return hasTradingSessionID ? new String(tradingSessionID, 0, tradingSessionIDLength) : null;
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
        if (!hasTradingSessionID)
 return TradingSessionID.NULL_VAL;
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        return TradingSessionID.decode(tradingSessionIDWrapper);
    }

    private char[] tradingSessionSubID = new char[1];

    private boolean hasTradingSessionSubID;

    public char[] tradingSessionSubID()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubID;
    }

    public boolean hasTradingSessionSubID()
    {
        return hasTradingSessionSubID;
    }


    private int tradingSessionSubIDOffset;

    private int tradingSessionSubIDLength;

    public int tradingSessionSubIDLength()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubIDLength;
    }

    public String tradingSessionSubIDAsString()
    {
        return hasTradingSessionSubID ? new String(tradingSessionSubID, 0, tradingSessionSubIDLength) : null;
    }

    public void tradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        view.wrap(buffer, tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }


    private final CharArrayWrapper tradingSessionSubIDWrapper = new CharArrayWrapper();
    public TradingSessionSubID tradingSessionSubIDAsEnum()
    {
        if (!hasTradingSessionSubID)
 return TradingSessionSubID.NULL_VAL;
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        return TradingSessionSubID.decode(tradingSessionSubIDWrapper);
    }

    private int securityTradingStatus = MISSING_INT;

    private boolean hasSecurityTradingStatus;

    public int securityTradingStatus()
    {
        if (!hasSecurityTradingStatus)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityTradingStatus");
        }

        return securityTradingStatus;
    }

    public boolean hasSecurityTradingStatus()
    {
        return hasSecurityTradingStatus;
    }



    private final CharArrayWrapper securityTradingStatusWrapper = new CharArrayWrapper();
    public SecurityTradingStatus securityTradingStatusAsEnum()
    {
        if (!hasSecurityTradingStatus)
 return SecurityTradingStatus.NULL_VAL;
        return SecurityTradingStatus.decode(securityTradingStatus);
    }

    private int haltReason = MISSING_INT;

    private boolean hasHaltReason;

    public int haltReason()
    {
        if (!hasHaltReason)
        {
            throw new IllegalArgumentException("No value for optional field: HaltReason");
        }

        return haltReason;
    }

    public boolean hasHaltReason()
    {
        return hasHaltReason;
    }



    private final CharArrayWrapper haltReasonWrapper = new CharArrayWrapper();
    public HaltReason haltReasonAsEnum()
    {
        if (!hasHaltReason)
 return HaltReason.NULL_VAL;
        return HaltReason.decode(haltReason);
    }

    private char[] quoteCondition = new char[1];

    private boolean hasQuoteCondition;

    public char[] quoteCondition()
    {
        if (!hasQuoteCondition)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteCondition");
        }

        return quoteCondition;
    }

    public boolean hasQuoteCondition()
    {
        return hasQuoteCondition;
    }


    private int quoteConditionOffset;

    private int quoteConditionLength;

    public int quoteConditionLength()
    {
        if (!hasQuoteCondition)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteCondition");
        }

        return quoteConditionLength;
    }

    public String quoteConditionAsString()
    {
        return hasQuoteCondition ? new String(quoteCondition, 0, quoteConditionLength) : null;
    }

    public void quoteCondition(final AsciiSequenceView view)
    {
        if (!hasQuoteCondition)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteCondition");
        }

        view.wrap(buffer, quoteConditionOffset, quoteConditionLength);
    }


    private final CharArrayWrapper quoteConditionWrapper = new CharArrayWrapper();
    private char[] tradeCondition = new char[1];

    private boolean hasTradeCondition;

    public char[] tradeCondition()
    {
        if (!hasTradeCondition)
        {
            throw new IllegalArgumentException("No value for optional field: TradeCondition");
        }

        return tradeCondition;
    }

    public boolean hasTradeCondition()
    {
        return hasTradeCondition;
    }


    private int tradeConditionOffset;

    private int tradeConditionLength;

    public int tradeConditionLength()
    {
        if (!hasTradeCondition)
        {
            throw new IllegalArgumentException("No value for optional field: TradeCondition");
        }

        return tradeConditionLength;
    }

    public String tradeConditionAsString()
    {
        return hasTradeCondition ? new String(tradeCondition, 0, tradeConditionLength) : null;
    }

    public void tradeCondition(final AsciiSequenceView view)
    {
        if (!hasTradeCondition)
        {
            throw new IllegalArgumentException("No value for optional field: TradeCondition");
        }

        view.wrap(buffer, tradeConditionOffset, tradeConditionLength);
    }


    private final CharArrayWrapper tradeConditionWrapper = new CharArrayWrapper();
    private char[] mDEntryOriginator = new char[1];

    private boolean hasMDEntryOriginator;

    public char[] mDEntryOriginator()
    {
        if (!hasMDEntryOriginator)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryOriginator");
        }

        return mDEntryOriginator;
    }

    public boolean hasMDEntryOriginator()
    {
        return hasMDEntryOriginator;
    }


    private int mDEntryOriginatorOffset;

    private int mDEntryOriginatorLength;

    public int mDEntryOriginatorLength()
    {
        if (!hasMDEntryOriginator)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryOriginator");
        }

        return mDEntryOriginatorLength;
    }

    public String mDEntryOriginatorAsString()
    {
        return hasMDEntryOriginator ? new String(mDEntryOriginator, 0, mDEntryOriginatorLength) : null;
    }

    public void mDEntryOriginator(final AsciiSequenceView view)
    {
        if (!hasMDEntryOriginator)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryOriginator");
        }

        view.wrap(buffer, mDEntryOriginatorOffset, mDEntryOriginatorLength);
    }


    private char[] locationID = new char[1];

    private boolean hasLocationID;

    public char[] locationID()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationID;
    }

    public boolean hasLocationID()
    {
        return hasLocationID;
    }


    private int locationIDOffset;

    private int locationIDLength;

    public int locationIDLength()
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        return locationIDLength;
    }

    public String locationIDAsString()
    {
        return hasLocationID ? new String(locationID, 0, locationIDLength) : null;
    }

    public void locationID(final AsciiSequenceView view)
    {
        if (!hasLocationID)
        {
            throw new IllegalArgumentException("No value for optional field: LocationID");
        }

        view.wrap(buffer, locationIDOffset, locationIDLength);
    }


    private char[] deskID = new char[1];

    private boolean hasDeskID;

    public char[] deskID()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskID;
    }

    public boolean hasDeskID()
    {
        return hasDeskID;
    }


    private int deskIDOffset;

    private int deskIDLength;

    public int deskIDLength()
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        return deskIDLength;
    }

    public String deskIDAsString()
    {
        return hasDeskID ? new String(deskID, 0, deskIDLength) : null;
    }

    public void deskID(final AsciiSequenceView view)
    {
        if (!hasDeskID)
        {
            throw new IllegalArgumentException("No value for optional field: DeskID");
        }

        view.wrap(buffer, deskIDOffset, deskIDLength);
    }


    private char[] openCloseSettlFlag = new char[1];

    private boolean hasOpenCloseSettlFlag;

    public char[] openCloseSettlFlag()
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        return openCloseSettlFlag;
    }

    public boolean hasOpenCloseSettlFlag()
    {
        return hasOpenCloseSettlFlag;
    }


    private int openCloseSettlFlagOffset;

    private int openCloseSettlFlagLength;

    public int openCloseSettlFlagLength()
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        return openCloseSettlFlagLength;
    }

    public String openCloseSettlFlagAsString()
    {
        return hasOpenCloseSettlFlag ? new String(openCloseSettlFlag, 0, openCloseSettlFlagLength) : null;
    }

    public void openCloseSettlFlag(final AsciiSequenceView view)
    {
        if (!hasOpenCloseSettlFlag)
        {
            throw new IllegalArgumentException("No value for optional field: OpenCloseSettlFlag");
        }

        view.wrap(buffer, openCloseSettlFlagOffset, openCloseSettlFlagLength);
    }


    private final CharArrayWrapper openCloseSettlFlagWrapper = new CharArrayWrapper();
    private char timeInForce = MISSING_CHAR;

    private boolean hasTimeInForce;

    public char timeInForce()
    {
        if (!hasTimeInForce)
        {
            throw new IllegalArgumentException("No value for optional field: TimeInForce");
        }

        return timeInForce;
    }

    public boolean hasTimeInForce()
    {
        return hasTimeInForce;
    }



    private final CharArrayWrapper timeInForceWrapper = new CharArrayWrapper();
    public TimeInForce timeInForceAsEnum()
    {
        if (!hasTimeInForce)
 return TimeInForce.NULL_VAL;
        return TimeInForce.decode(timeInForce);
    }

    private byte[] expireDate = new byte[8];

    private boolean hasExpireDate;

    public byte[] expireDate()
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        return expireDate;
    }

    public boolean hasExpireDate()
    {
        return hasExpireDate;
    }


    private int expireDateOffset;

    private int expireDateLength;

    public int expireDateLength()
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        return expireDateLength;
    }

    public String expireDateAsString()
    {
        return hasExpireDate ? new String(expireDate, 0, expireDateLength) : null;
    }

    public void expireDate(final AsciiSequenceView view)
    {
        if (!hasExpireDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireDate");
        }

        view.wrap(buffer, expireDateOffset, expireDateLength);
    }


    private byte[] expireTime = new byte[24];

    private boolean hasExpireTime;

    public byte[] expireTime()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTime;
    }

    public boolean hasExpireTime()
    {
        return hasExpireTime;
    }


    private int expireTimeOffset;

    private int expireTimeLength;

    public int expireTimeLength()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTimeLength;
    }

    public String expireTimeAsString()
    {
        return hasExpireTime ? new String(expireTime, 0, expireTimeLength) : null;
    }

    public void expireTime(final AsciiSequenceView view)
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        view.wrap(buffer, expireTimeOffset, expireTimeLength);
    }


    private DecimalFloat minQty = DecimalFloat.newNaNValue();

    private boolean hasMinQty;

    public DecimalFloat minQty()
    {
        if (!hasMinQty)
        {
            throw new IllegalArgumentException("No value for optional field: MinQty");
        }

        return minQty;
    }

    public boolean hasMinQty()
    {
        return hasMinQty;
    }



    private char[] execInst = new char[1];

    private boolean hasExecInst;

    public char[] execInst()
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        return execInst;
    }

    public boolean hasExecInst()
    {
        return hasExecInst;
    }


    private int execInstOffset;

    private int execInstLength;

    public int execInstLength()
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        return execInstLength;
    }

    public String execInstAsString()
    {
        return hasExecInst ? new String(execInst, 0, execInstLength) : null;
    }

    public void execInst(final AsciiSequenceView view)
    {
        if (!hasExecInst)
        {
            throw new IllegalArgumentException("No value for optional field: ExecInst");
        }

        view.wrap(buffer, execInstOffset, execInstLength);
    }


    private final CharArrayWrapper execInstWrapper = new CharArrayWrapper();
    private int sellerDays = MISSING_INT;

    private boolean hasSellerDays;

    public int sellerDays()
    {
        if (!hasSellerDays)
        {
            throw new IllegalArgumentException("No value for optional field: SellerDays");
        }

        return sellerDays;
    }

    public boolean hasSellerDays()
    {
        return hasSellerDays;
    }



    private char[] orderID = new char[1];

    private boolean hasOrderID;

    public char[] orderID()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderID;
    }

    public boolean hasOrderID()
    {
        return hasOrderID;
    }


    private int orderIDOffset;

    private int orderIDLength;

    public int orderIDLength()
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        return orderIDLength;
    }

    public String orderIDAsString()
    {
        return hasOrderID ? new String(orderID, 0, orderIDLength) : null;
    }

    public void orderID(final AsciiSequenceView view)
    {
        if (!hasOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: OrderID");
        }

        view.wrap(buffer, orderIDOffset, orderIDLength);
    }


    private char[] secondaryOrderID = new char[1];

    private boolean hasSecondaryOrderID;

    public char[] secondaryOrderID()
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        return secondaryOrderID;
    }

    public boolean hasSecondaryOrderID()
    {
        return hasSecondaryOrderID;
    }


    private int secondaryOrderIDOffset;

    private int secondaryOrderIDLength;

    public int secondaryOrderIDLength()
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        return secondaryOrderIDLength;
    }

    public String secondaryOrderIDAsString()
    {
        return hasSecondaryOrderID ? new String(secondaryOrderID, 0, secondaryOrderIDLength) : null;
    }

    public void secondaryOrderID(final AsciiSequenceView view)
    {
        if (!hasSecondaryOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryOrderID");
        }

        view.wrap(buffer, secondaryOrderIDOffset, secondaryOrderIDLength);
    }


    private char[] quoteEntryID = new char[1];

    private boolean hasQuoteEntryID;

    public char[] quoteEntryID()
    {
        if (!hasQuoteEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteEntryID");
        }

        return quoteEntryID;
    }

    public boolean hasQuoteEntryID()
    {
        return hasQuoteEntryID;
    }


    private int quoteEntryIDOffset;

    private int quoteEntryIDLength;

    public int quoteEntryIDLength()
    {
        if (!hasQuoteEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteEntryID");
        }

        return quoteEntryIDLength;
    }

    public String quoteEntryIDAsString()
    {
        return hasQuoteEntryID ? new String(quoteEntryID, 0, quoteEntryIDLength) : null;
    }

    public void quoteEntryID(final AsciiSequenceView view)
    {
        if (!hasQuoteEntryID)
        {
            throw new IllegalArgumentException("No value for optional field: QuoteEntryID");
        }

        view.wrap(buffer, quoteEntryIDOffset, quoteEntryIDLength);
    }


    private char[] mDEntryBuyer = new char[1];

    private boolean hasMDEntryBuyer;

    public char[] mDEntryBuyer()
    {
        if (!hasMDEntryBuyer)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryBuyer");
        }

        return mDEntryBuyer;
    }

    public boolean hasMDEntryBuyer()
    {
        return hasMDEntryBuyer;
    }


    private int mDEntryBuyerOffset;

    private int mDEntryBuyerLength;

    public int mDEntryBuyerLength()
    {
        if (!hasMDEntryBuyer)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryBuyer");
        }

        return mDEntryBuyerLength;
    }

    public String mDEntryBuyerAsString()
    {
        return hasMDEntryBuyer ? new String(mDEntryBuyer, 0, mDEntryBuyerLength) : null;
    }

    public void mDEntryBuyer(final AsciiSequenceView view)
    {
        if (!hasMDEntryBuyer)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryBuyer");
        }

        view.wrap(buffer, mDEntryBuyerOffset, mDEntryBuyerLength);
    }


    private char[] mDEntrySeller = new char[1];

    private boolean hasMDEntrySeller;

    public char[] mDEntrySeller()
    {
        if (!hasMDEntrySeller)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntrySeller");
        }

        return mDEntrySeller;
    }

    public boolean hasMDEntrySeller()
    {
        return hasMDEntrySeller;
    }


    private int mDEntrySellerOffset;

    private int mDEntrySellerLength;

    public int mDEntrySellerLength()
    {
        if (!hasMDEntrySeller)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntrySeller");
        }

        return mDEntrySellerLength;
    }

    public String mDEntrySellerAsString()
    {
        return hasMDEntrySeller ? new String(mDEntrySeller, 0, mDEntrySellerLength) : null;
    }

    public void mDEntrySeller(final AsciiSequenceView view)
    {
        if (!hasMDEntrySeller)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntrySeller");
        }

        view.wrap(buffer, mDEntrySellerOffset, mDEntrySellerLength);
    }


    private int numberOfOrders = MISSING_INT;

    private boolean hasNumberOfOrders;

    public int numberOfOrders()
    {
        if (!hasNumberOfOrders)
        {
            throw new IllegalArgumentException("No value for optional field: NumberOfOrders");
        }

        return numberOfOrders;
    }

    public boolean hasNumberOfOrders()
    {
        return hasNumberOfOrders;
    }



    private int mDEntryPositionNo = MISSING_INT;

    private boolean hasMDEntryPositionNo;

    public int mDEntryPositionNo()
    {
        if (!hasMDEntryPositionNo)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryPositionNo");
        }

        return mDEntryPositionNo;
    }

    public boolean hasMDEntryPositionNo()
    {
        return hasMDEntryPositionNo;
    }



    private char[] scope = new char[1];

    private boolean hasScope;

    public char[] scope()
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        return scope;
    }

    public boolean hasScope()
    {
        return hasScope;
    }


    private int scopeOffset;

    private int scopeLength;

    public int scopeLength()
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        return scopeLength;
    }

    public String scopeAsString()
    {
        return hasScope ? new String(scope, 0, scopeLength) : null;
    }

    public void scope(final AsciiSequenceView view)
    {
        if (!hasScope)
        {
            throw new IllegalArgumentException("No value for optional field: Scope");
        }

        view.wrap(buffer, scopeOffset, scopeLength);
    }


    private final CharArrayWrapper scopeWrapper = new CharArrayWrapper();
    private DecimalFloat priceDelta = DecimalFloat.newNaNValue();

    private boolean hasPriceDelta;

    public DecimalFloat priceDelta()
    {
        if (!hasPriceDelta)
        {
            throw new IllegalArgumentException("No value for optional field: PriceDelta");
        }

        return priceDelta;
    }

    public boolean hasPriceDelta()
    {
        return hasPriceDelta;
    }



    private int trdType = MISSING_INT;

    private boolean hasTrdType;

    public int trdType()
    {
        if (!hasTrdType)
        {
            throw new IllegalArgumentException("No value for optional field: TrdType");
        }

        return trdType;
    }

    public boolean hasTrdType()
    {
        return hasTrdType;
    }



    private final CharArrayWrapper trdTypeWrapper = new CharArrayWrapper();
    public TrdType trdTypeAsEnum()
    {
        if (!hasTrdType)
 return TrdType.NULL_VAL;
        return TrdType.decode(trdType);
    }

    private char[] text = new char[1];

    private boolean hasText;

    public char[] text()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return text;
    }

    public boolean hasText()
    {
        return hasText;
    }


    private int textOffset;

    private int textLength;

    public int textLength()
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        return textLength;
    }

    public String textAsString()
    {
        return hasText ? new String(text, 0, textLength) : null;
    }

    public void text(final AsciiSequenceView view)
    {
        if (!hasText)
        {
            throw new IllegalArgumentException("No value for optional field: Text");
        }

        view.wrap(buffer, textOffset, textLength);
    }


    private int encodedTextLen = MISSING_INT;

    private boolean hasEncodedTextLen;

    public int encodedTextLen()
    {
        if (!hasEncodedTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedTextLen");
        }

        return encodedTextLen;
    }

    public boolean hasEncodedTextLen()
    {
        return hasEncodedTextLen;
    }



    private byte[] encodedText = new byte[1];

    private boolean hasEncodedText;

    public byte[] encodedText()
    {
        if (!hasEncodedText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedText");
        }

        return encodedText;
    }

    public boolean hasEncodedText()
    {
        return hasEncodedText;
    }



    private int mDPriceLevel = MISSING_INT;

    private boolean hasMDPriceLevel;

    public int mDPriceLevel()
    {
        if (!hasMDPriceLevel)
        {
            throw new IllegalArgumentException("No value for optional field: MDPriceLevel");
        }

        return mDPriceLevel;
    }

    public boolean hasMDPriceLevel()
    {
        return hasMDPriceLevel;
    }



    private char orderCapacity = MISSING_CHAR;

    private boolean hasOrderCapacity;

    public char orderCapacity()
    {
        if (!hasOrderCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: OrderCapacity");
        }

        return orderCapacity;
    }

    public boolean hasOrderCapacity()
    {
        return hasOrderCapacity;
    }



    private final CharArrayWrapper orderCapacityWrapper = new CharArrayWrapper();
    public OrderCapacity orderCapacityAsEnum()
    {
        if (!hasOrderCapacity)
 return OrderCapacity.NULL_VAL;
        return OrderCapacity.decode(orderCapacity);
    }

    private int mDOriginType = MISSING_INT;

    private boolean hasMDOriginType;

    public int mDOriginType()
    {
        if (!hasMDOriginType)
        {
            throw new IllegalArgumentException("No value for optional field: MDOriginType");
        }

        return mDOriginType;
    }

    public boolean hasMDOriginType()
    {
        return hasMDOriginType;
    }



    private final CharArrayWrapper mDOriginTypeWrapper = new CharArrayWrapper();
    public MDOriginType mDOriginTypeAsEnum()
    {
        if (!hasMDOriginType)
 return MDOriginType.NULL_VAL;
        return MDOriginType.decode(mDOriginType);
    }

    private DecimalFloat highPx = DecimalFloat.newNaNValue();

    private boolean hasHighPx;

    public DecimalFloat highPx()
    {
        if (!hasHighPx)
        {
            throw new IllegalArgumentException("No value for optional field: HighPx");
        }

        return highPx;
    }

    public boolean hasHighPx()
    {
        return hasHighPx;
    }



    private DecimalFloat lowPx = DecimalFloat.newNaNValue();

    private boolean hasLowPx;

    public DecimalFloat lowPx()
    {
        if (!hasLowPx)
        {
            throw new IllegalArgumentException("No value for optional field: LowPx");
        }

        return lowPx;
    }

    public boolean hasLowPx()
    {
        return hasLowPx;
    }



    private DecimalFloat firstPx = DecimalFloat.newNaNValue();

    private boolean hasFirstPx;

    public DecimalFloat firstPx()
    {
        if (!hasFirstPx)
        {
            throw new IllegalArgumentException("No value for optional field: FirstPx");
        }

        return firstPx;
    }

    public boolean hasFirstPx()
    {
        return hasFirstPx;
    }



    private DecimalFloat lastPx = DecimalFloat.newNaNValue();

    private boolean hasLastPx;

    public DecimalFloat lastPx()
    {
        if (!hasLastPx)
        {
            throw new IllegalArgumentException("No value for optional field: LastPx");
        }

        return lastPx;
    }

    public boolean hasLastPx()
    {
        return hasLastPx;
    }



    private DecimalFloat tradeVolume = DecimalFloat.newNaNValue();

    private boolean hasTradeVolume;

    public DecimalFloat tradeVolume()
    {
        if (!hasTradeVolume)
        {
            throw new IllegalArgumentException("No value for optional field: TradeVolume");
        }

        return tradeVolume;
    }

    public boolean hasTradeVolume()
    {
        return hasTradeVolume;
    }



    private char[] settlType = new char[1];

    private boolean hasSettlType;

    public char[] settlType()
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        return settlType;
    }

    public boolean hasSettlType()
    {
        return hasSettlType;
    }


    private int settlTypeOffset;

    private int settlTypeLength;

    public int settlTypeLength()
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        return settlTypeLength;
    }

    public String settlTypeAsString()
    {
        return hasSettlType ? new String(settlType, 0, settlTypeLength) : null;
    }

    public void settlType(final AsciiSequenceView view)
    {
        if (!hasSettlType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlType");
        }

        view.wrap(buffer, settlTypeOffset, settlTypeLength);
    }


    private final CharArrayWrapper settlTypeWrapper = new CharArrayWrapper();
    public SettlType settlTypeAsEnum()
    {
        if (!hasSettlType)
 return SettlType.NULL_VAL;
        settlTypeWrapper.wrap(this.settlType(), settlTypeLength);
        return SettlType.decode(settlTypeWrapper);
    }

    private byte[] settlDate = new byte[8];

    private boolean hasSettlDate;

    public byte[] settlDate()
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        return settlDate;
    }

    public boolean hasSettlDate()
    {
        return hasSettlDate;
    }


    private int settlDateOffset;

    private int settlDateLength;

    public int settlDateLength()
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        return settlDateLength;
    }

    public String settlDateAsString()
    {
        return hasSettlDate ? new String(settlDate, 0, settlDateLength) : null;
    }

    public void settlDate(final AsciiSequenceView view)
    {
        if (!hasSettlDate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDate");
        }

        view.wrap(buffer, settlDateOffset, settlDateLength);
    }


    private int mDQuoteType = MISSING_INT;

    private boolean hasMDQuoteType;

    public int mDQuoteType()
    {
        if (!hasMDQuoteType)
        {
            throw new IllegalArgumentException("No value for optional field: MDQuoteType");
        }

        return mDQuoteType;
    }

    public boolean hasMDQuoteType()
    {
        return hasMDQuoteType;
    }



    private final CharArrayWrapper mDQuoteTypeWrapper = new CharArrayWrapper();
    public MDQuoteType mDQuoteTypeAsEnum()
    {
        if (!hasMDQuoteType)
 return MDQuoteType.NULL_VAL;
        return MDQuoteType.decode(mDQuoteType);
    }

    private int rptSeq = MISSING_INT;

    private boolean hasRptSeq;

    public int rptSeq()
    {
        if (!hasRptSeq)
        {
            throw new IllegalArgumentException("No value for optional field: RptSeq");
        }

        return rptSeq;
    }

    public boolean hasRptSeq()
    {
        return hasRptSeq;
    }



    private char dealingCapacity = MISSING_CHAR;

    private boolean hasDealingCapacity;

    public char dealingCapacity()
    {
        if (!hasDealingCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: DealingCapacity");
        }

        return dealingCapacity;
    }

    public boolean hasDealingCapacity()
    {
        return hasDealingCapacity;
    }



    private final CharArrayWrapper dealingCapacityWrapper = new CharArrayWrapper();
    public DealingCapacity dealingCapacityAsEnum()
    {
        if (!hasDealingCapacity)
 return DealingCapacity.NULL_VAL;
        return DealingCapacity.decode(dealingCapacity);
    }

    private DecimalFloat mDEntrySpotRate = DecimalFloat.newNaNValue();

    private boolean hasMDEntrySpotRate;

    public DecimalFloat mDEntrySpotRate()
    {
        if (!hasMDEntrySpotRate)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntrySpotRate");
        }

        return mDEntrySpotRate;
    }

    public boolean hasMDEntrySpotRate()
    {
        return hasMDEntrySpotRate;
    }



    private DecimalFloat mDEntryForwardPoints = DecimalFloat.newNaNValue();

    private boolean hasMDEntryForwardPoints;

    public DecimalFloat mDEntryForwardPoints()
    {
        if (!hasMDEntryForwardPoints)
        {
            throw new IllegalArgumentException("No value for optional field: MDEntryForwardPoints");
        }

        return mDEntryForwardPoints;
    }

    public boolean hasMDEntryForwardPoints()
    {
        return hasMDEntryForwardPoints;
    }





    private PartyIDsGroupDecoder partyIDsGroup = null;
    public PartyIDsGroupDecoder partyIDsGroup()
    {
        return partyIDsGroup;
    }

    private int noPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoPartyIDsGroupCounter;

    public int noPartyIDsGroupCounter()
    {
        if (!hasNoPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPartyIDsGroupCounter");
        }

        return noPartyIDsGroupCounter;
    }

    public boolean hasNoPartyIDsGroupCounter()
    {
        return hasNoPartyIDsGroupCounter;
    }




    private PartyIDsGroupIterator partyIDsGroupIterator = new PartyIDsGroupIterator(this);
    public PartyIDsGroupIterator partyIDsGroupIterator()
    {
        return partyIDsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode MDEntriesGroup
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
                    next = new MDEntriesGroupDecoder(trailer, messageFields);
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
            case Constants.M_D_ENTRY_TYPE:
                mDEntryType = buffer.getChar(valueOffset);
                break;

            case Constants.M_D_ENTRY_ID:
                hasMDEntryID = true;
                mDEntryID = buffer.getChars(mDEntryID, valueOffset, valueLength);
                mDEntryIDOffset = valueOffset;
                mDEntryIDLength = valueLength;
                break;

            case Constants.M_D_ENTRY_PX:
                hasMDEntryPx = true;
                mDEntryPx = getFloat(buffer, mDEntryPx, valueOffset, valueLength, 270, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRICE_TYPE:
                hasPriceType = true;
                priceType = getInt(buffer, valueOffset, endOfField, 423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.YIELD_TYPE:
                hasYieldType = true;
                yieldType = buffer.getChars(yieldType, valueOffset, valueLength);
                yieldTypeOffset = valueOffset;
                yieldTypeLength = valueLength;
                break;

            case Constants.YIELD:
                hasYield = true;
                yield = getFloat(buffer, yield, valueOffset, valueLength, 236, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.YIELD_CALC_DATE:
                hasYieldCalcDate = true;
                yieldCalcDate = buffer.getBytes(yieldCalcDate, valueOffset, valueLength);
                yieldCalcDateOffset = valueOffset;
                yieldCalcDateLength = valueLength;
                break;

            case Constants.YIELD_REDEMPTION_DATE:
                hasYieldRedemptionDate = true;
                yieldRedemptionDate = buffer.getBytes(yieldRedemptionDate, valueOffset, valueLength);
                yieldRedemptionDateOffset = valueOffset;
                yieldRedemptionDateLength = valueLength;
                break;

            case Constants.YIELD_REDEMPTION_PRICE:
                hasYieldRedemptionPrice = true;
                yieldRedemptionPrice = getFloat(buffer, yieldRedemptionPrice, valueOffset, valueLength, 697, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.YIELD_REDEMPTION_PRICE_TYPE:
                hasYieldRedemptionPriceType = true;
                yieldRedemptionPriceType = getInt(buffer, valueOffset, endOfField, 698, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.SPREAD:
                hasSpread = true;
                spread = getFloat(buffer, spread, valueOffset, valueLength, 218, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_CURVE_CURRENCY:
                hasBenchmarkCurveCurrency = true;
                benchmarkCurveCurrency = buffer.getChars(benchmarkCurveCurrency, valueOffset, valueLength);
                benchmarkCurveCurrencyOffset = valueOffset;
                benchmarkCurveCurrencyLength = valueLength;
                break;

            case Constants.BENCHMARK_CURVE_NAME:
                hasBenchmarkCurveName = true;
                benchmarkCurveName = buffer.getChars(benchmarkCurveName, valueOffset, valueLength);
                benchmarkCurveNameOffset = valueOffset;
                benchmarkCurveNameLength = valueLength;
                break;

            case Constants.BENCHMARK_CURVE_POINT:
                hasBenchmarkCurvePoint = true;
                benchmarkCurvePoint = buffer.getChars(benchmarkCurvePoint, valueOffset, valueLength);
                benchmarkCurvePointOffset = valueOffset;
                benchmarkCurvePointLength = valueLength;
                break;

            case Constants.BENCHMARK_PRICE:
                hasBenchmarkPrice = true;
                benchmarkPrice = getFloat(buffer, benchmarkPrice, valueOffset, valueLength, 662, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_PRICE_TYPE:
                hasBenchmarkPriceType = true;
                benchmarkPriceType = getInt(buffer, valueOffset, endOfField, 663, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BENCHMARK_SECURITY_ID:
                hasBenchmarkSecurityID = true;
                benchmarkSecurityID = buffer.getChars(benchmarkSecurityID, valueOffset, valueLength);
                benchmarkSecurityIDOffset = valueOffset;
                benchmarkSecurityIDLength = valueLength;
                break;

            case Constants.BENCHMARK_SECURITY_ID_SOURCE:
                hasBenchmarkSecurityIDSource = true;
                benchmarkSecurityIDSource = buffer.getChars(benchmarkSecurityIDSource, valueOffset, valueLength);
                benchmarkSecurityIDSourceOffset = valueOffset;
                benchmarkSecurityIDSourceLength = valueLength;
                break;


            case Constants.ORD_TYPE:
                hasOrdType = true;
                ordType = buffer.getChar(valueOffset);
                break;

            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.SETTL_CURRENCY:
                hasSettlCurrency = true;
                settlCurrency = buffer.getChars(settlCurrency, valueOffset, valueLength);
                settlCurrencyOffset = valueOffset;
                settlCurrencyLength = valueLength;
                break;

            case Constants.NO_RATE_SOURCES:
                hasNoRateSourcesGroupCounter = true;
                noRateSourcesGroupCounter = getInt(buffer, valueOffset, endOfField, 1445, CODEC_VALIDATION_ENABLED);
                if (rateSourcesGroup == null)
                {
                    rateSourcesGroup = new RateSourcesGroupDecoder(trailer, messageFields);
                }
                RateSourcesGroupDecoder rateSourcesGroupCurrent = rateSourcesGroup;
                position = endOfField + 1;
                final int noRateSourcesGroupCounter = this.noRateSourcesGroupCounter;
                for (int i = 0; i < noRateSourcesGroupCounter && position < end; i++)
                {
                    if (rateSourcesGroupCurrent != null)
                    {
                        position += rateSourcesGroupCurrent.decode(buffer, position, end - position);
                        rateSourcesGroupCurrent = rateSourcesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (rateSourcesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.M_D_ENTRY_SIZE:
                hasMDEntrySize = true;
                mDEntrySize = getFloat(buffer, mDEntrySize, valueOffset, valueLength, 271, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_OF_SEC_SIZES:
                hasNoOfSecSizesGroupCounter = true;
                noOfSecSizesGroupCounter = getInt(buffer, valueOffset, endOfField, 1177, CODEC_VALIDATION_ENABLED);
                if (ofSecSizesGroup == null)
                {
                    ofSecSizesGroup = new OfSecSizesGroupDecoder(trailer, messageFields);
                }
                OfSecSizesGroupDecoder ofSecSizesGroupCurrent = ofSecSizesGroup;
                position = endOfField + 1;
                final int noOfSecSizesGroupCounter = this.noOfSecSizesGroupCounter;
                for (int i = 0; i < noOfSecSizesGroupCounter && position < end; i++)
                {
                    if (ofSecSizesGroupCurrent != null)
                    {
                        position += ofSecSizesGroupCurrent.decode(buffer, position, end - position);
                        ofSecSizesGroupCurrent = ofSecSizesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (ofSecSizesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.LOT_TYPE:
                hasLotType = true;
                lotType = buffer.getChar(valueOffset);
                break;

            case Constants.M_D_ENTRY_DATE:
                hasMDEntryDate = true;
                mDEntryDate = buffer.getBytes(mDEntryDate, valueOffset, valueLength);
                mDEntryDateOffset = valueOffset;
                mDEntryDateLength = valueLength;
                break;

            case Constants.M_D_ENTRY_TIME:
                hasMDEntryTime = true;
                mDEntryTime = buffer.getBytes(mDEntryTime, valueOffset, valueLength);
                mDEntryTimeOffset = valueOffset;
                mDEntryTimeLength = valueLength;
                break;

            case Constants.TICK_DIRECTION:
                hasTickDirection = true;
                tickDirection = buffer.getChar(valueOffset);
                break;

            case Constants.M_D_MKT:
                hasMDMkt = true;
                mDMkt = buffer.getChars(mDMkt, valueOffset, valueLength);
                mDMktOffset = valueOffset;
                mDMktLength = valueLength;
                break;

            case Constants.TRADING_SESSION_ID:
                hasTradingSessionID = true;
                tradingSessionID = buffer.getChars(tradingSessionID, valueOffset, valueLength);
                tradingSessionIDOffset = valueOffset;
                tradingSessionIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_SUB_ID:
                hasTradingSessionSubID = true;
                tradingSessionSubID = buffer.getChars(tradingSessionSubID, valueOffset, valueLength);
                tradingSessionSubIDOffset = valueOffset;
                tradingSessionSubIDLength = valueLength;
                break;

            case Constants.SECURITY_TRADING_STATUS:
                hasSecurityTradingStatus = true;
                securityTradingStatus = getInt(buffer, valueOffset, endOfField, 326, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.HALT_REASON:
                hasHaltReason = true;
                haltReason = getInt(buffer, valueOffset, endOfField, 327, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUOTE_CONDITION:
                hasQuoteCondition = true;
                quoteCondition = buffer.getChars(quoteCondition, valueOffset, valueLength);
                quoteConditionOffset = valueOffset;
                quoteConditionLength = valueLength;
                break;

            case Constants.TRADE_CONDITION:
                hasTradeCondition = true;
                tradeCondition = buffer.getChars(tradeCondition, valueOffset, valueLength);
                tradeConditionOffset = valueOffset;
                tradeConditionLength = valueLength;
                break;

            case Constants.M_D_ENTRY_ORIGINATOR:
                hasMDEntryOriginator = true;
                mDEntryOriginator = buffer.getChars(mDEntryOriginator, valueOffset, valueLength);
                mDEntryOriginatorOffset = valueOffset;
                mDEntryOriginatorLength = valueLength;
                break;

            case Constants.LOCATION_ID:
                hasLocationID = true;
                locationID = buffer.getChars(locationID, valueOffset, valueLength);
                locationIDOffset = valueOffset;
                locationIDLength = valueLength;
                break;

            case Constants.DESK_ID:
                hasDeskID = true;
                deskID = buffer.getChars(deskID, valueOffset, valueLength);
                deskIDOffset = valueOffset;
                deskIDLength = valueLength;
                break;

            case Constants.OPEN_CLOSE_SETTL_FLAG:
                hasOpenCloseSettlFlag = true;
                openCloseSettlFlag = buffer.getChars(openCloseSettlFlag, valueOffset, valueLength);
                openCloseSettlFlagOffset = valueOffset;
                openCloseSettlFlagLength = valueLength;
                break;

            case Constants.TIME_IN_FORCE:
                hasTimeInForce = true;
                timeInForce = buffer.getChar(valueOffset);
                break;

            case Constants.EXPIRE_DATE:
                hasExpireDate = true;
                expireDate = buffer.getBytes(expireDate, valueOffset, valueLength);
                expireDateOffset = valueOffset;
                expireDateLength = valueLength;
                break;

            case Constants.EXPIRE_TIME:
                hasExpireTime = true;
                expireTime = buffer.getBytes(expireTime, valueOffset, valueLength);
                expireTimeOffset = valueOffset;
                expireTimeLength = valueLength;
                break;

            case Constants.MIN_QTY:
                hasMinQty = true;
                minQty = getFloat(buffer, minQty, valueOffset, valueLength, 110, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EXEC_INST:
                hasExecInst = true;
                execInst = buffer.getChars(execInst, valueOffset, valueLength);
                execInstOffset = valueOffset;
                execInstLength = valueLength;
                break;

            case Constants.SELLER_DAYS:
                hasSellerDays = true;
                sellerDays = getInt(buffer, valueOffset, endOfField, 287, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_ID:
                hasOrderID = true;
                orderID = buffer.getChars(orderID, valueOffset, valueLength);
                orderIDOffset = valueOffset;
                orderIDLength = valueLength;
                break;

            case Constants.SECONDARY_ORDER_ID:
                hasSecondaryOrderID = true;
                secondaryOrderID = buffer.getChars(secondaryOrderID, valueOffset, valueLength);
                secondaryOrderIDOffset = valueOffset;
                secondaryOrderIDLength = valueLength;
                break;

            case Constants.QUOTE_ENTRY_ID:
                hasQuoteEntryID = true;
                quoteEntryID = buffer.getChars(quoteEntryID, valueOffset, valueLength);
                quoteEntryIDOffset = valueOffset;
                quoteEntryIDLength = valueLength;
                break;

            case Constants.M_D_ENTRY_BUYER:
                hasMDEntryBuyer = true;
                mDEntryBuyer = buffer.getChars(mDEntryBuyer, valueOffset, valueLength);
                mDEntryBuyerOffset = valueOffset;
                mDEntryBuyerLength = valueLength;
                break;

            case Constants.M_D_ENTRY_SELLER:
                hasMDEntrySeller = true;
                mDEntrySeller = buffer.getChars(mDEntrySeller, valueOffset, valueLength);
                mDEntrySellerOffset = valueOffset;
                mDEntrySellerLength = valueLength;
                break;

            case Constants.NUMBER_OF_ORDERS:
                hasNumberOfOrders = true;
                numberOfOrders = getInt(buffer, valueOffset, endOfField, 346, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_ENTRY_POSITION_NO:
                hasMDEntryPositionNo = true;
                mDEntryPositionNo = getInt(buffer, valueOffset, endOfField, 290, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SCOPE:
                hasScope = true;
                scope = buffer.getChars(scope, valueOffset, valueLength);
                scopeOffset = valueOffset;
                scopeLength = valueLength;
                break;

            case Constants.PRICE_DELTA:
                hasPriceDelta = true;
                priceDelta = getFloat(buffer, priceDelta, valueOffset, valueLength, 811, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRD_TYPE:
                hasTrdType = true;
                trdType = getInt(buffer, valueOffset, endOfField, 828, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TEXT:
                hasText = true;
                text = buffer.getChars(text, valueOffset, valueLength);
                textOffset = valueOffset;
                textLength = valueLength;
                break;

            case Constants.ENCODED_TEXT_LEN:
                hasEncodedTextLen = true;
                encodedTextLen = getInt(buffer, valueOffset, endOfField, 354, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_TEXT:
                hasEncodedText = true;
                encodedText = buffer.getBytes(encodedText, valueOffset, encodedTextLen);
                endOfField = valueOffset + encodedTextLen;
                break;

            case Constants.M_D_PRICE_LEVEL:
                hasMDPriceLevel = true;
                mDPriceLevel = getInt(buffer, valueOffset, endOfField, 1023, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_CAPACITY:
                hasOrderCapacity = true;
                orderCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.M_D_ORIGIN_TYPE:
                hasMDOriginType = true;
                mDOriginType = getInt(buffer, valueOffset, endOfField, 1024, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.HIGH_PX:
                hasHighPx = true;
                highPx = getFloat(buffer, highPx, valueOffset, valueLength, 332, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LOW_PX:
                hasLowPx = true;
                lowPx = getFloat(buffer, lowPx, valueOffset, valueLength, 333, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FIRST_PX:
                hasFirstPx = true;
                firstPx = getFloat(buffer, firstPx, valueOffset, valueLength, 1025, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LAST_PX:
                hasLastPx = true;
                lastPx = getFloat(buffer, lastPx, valueOffset, valueLength, 31, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_VOLUME:
                hasTradeVolume = true;
                tradeVolume = getFloat(buffer, tradeVolume, valueOffset, valueLength, 1020, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_TYPE:
                hasSettlType = true;
                settlType = buffer.getChars(settlType, valueOffset, valueLength);
                settlTypeOffset = valueOffset;
                settlTypeLength = valueLength;
                break;

            case Constants.SETTL_DATE:
                hasSettlDate = true;
                settlDate = buffer.getBytes(settlDate, valueOffset, valueLength);
                settlDateOffset = valueOffset;
                settlDateLength = valueLength;
                break;

            case Constants.M_D_QUOTE_TYPE:
                hasMDQuoteType = true;
                mDQuoteType = getInt(buffer, valueOffset, endOfField, 1070, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.RPT_SEQ:
                hasRptSeq = true;
                rptSeq = getInt(buffer, valueOffset, endOfField, 83, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DEALING_CAPACITY:
                hasDealingCapacity = true;
                dealingCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.M_D_ENTRY_SPOT_RATE:
                hasMDEntrySpotRate = true;
                mDEntrySpotRate = getFloat(buffer, mDEntrySpotRate, valueOffset, valueLength, 1026, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.M_D_ENTRY_FORWARD_POINTS:
                hasMDEntryForwardPoints = true;
                mDEntryForwardPoints = getFloat(buffer, mDEntryForwardPoints, valueOffset, valueLength, 1027, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_PARTY_IDS:
                hasNoPartyIDsGroupCounter = true;
                noPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 453, CODEC_VALIDATION_ENABLED);
                if (partyIDsGroup == null)
                {
                    partyIDsGroup = new PartyIDsGroupDecoder(trailer, messageFields);
                }
                PartyIDsGroupDecoder partyIDsGroupCurrent = partyIDsGroup;
                position = endOfField + 1;
                final int noPartyIDsGroupCounter = this.noPartyIDsGroupCounter;
                for (int i = 0; i < noPartyIDsGroupCounter && position < end; i++)
                {
                    if (partyIDsGroupCurrent != null)
                    {
                        position += partyIDsGroupCurrent.decode(buffer, position, end - position);
                        partyIDsGroupCurrent = partyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (partyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetMDEntryType();
        this.resetMDEntryID();
        this.resetMDEntryPx();
        this.resetPriceType();
        this.resetOrdType();
        this.resetCurrency();
        this.resetSettlCurrency();
        this.resetMDEntrySize();
        this.resetLotType();
        this.resetMDEntryDate();
        this.resetMDEntryTime();
        this.resetTickDirection();
        this.resetMDMkt();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetSecurityTradingStatus();
        this.resetHaltReason();
        this.resetQuoteCondition();
        this.resetTradeCondition();
        this.resetMDEntryOriginator();
        this.resetLocationID();
        this.resetDeskID();
        this.resetOpenCloseSettlFlag();
        this.resetTimeInForce();
        this.resetExpireDate();
        this.resetExpireTime();
        this.resetMinQty();
        this.resetExecInst();
        this.resetSellerDays();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetQuoteEntryID();
        this.resetMDEntryBuyer();
        this.resetMDEntrySeller();
        this.resetNumberOfOrders();
        this.resetMDEntryPositionNo();
        this.resetScope();
        this.resetPriceDelta();
        this.resetTrdType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetMDPriceLevel();
        this.resetOrderCapacity();
        this.resetMDOriginType();
        this.resetHighPx();
        this.resetLowPx();
        this.resetFirstPx();
        this.resetLastPx();
        this.resetTradeVolume();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetMDQuoteType();
        this.resetRptSeq();
        this.resetDealingCapacity();
        this.resetMDEntrySpotRate();
        this.resetMDEntryForwardPoints();
        this.resetYieldType();
        this.resetYield();
        this.resetYieldCalcDate();
        this.resetYieldRedemptionDate();
        this.resetYieldRedemptionPrice();
        this.resetYieldRedemptionPriceType();
        this.resetSpread();
        this.resetBenchmarkCurveCurrency();
        this.resetBenchmarkCurveName();
        this.resetBenchmarkCurvePoint();
        this.resetBenchmarkPrice();
        this.resetBenchmarkPriceType();
        this.resetBenchmarkSecurityID();
        this.resetBenchmarkSecurityIDSource();
        this.resetRateSourcesGroup();
        this.resetOfSecSizesGroup();
        this.resetPartyIDsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetMDEntryType()
    {
        mDEntryType = MISSING_CHAR;
    }

    public void resetMDEntryID()
    {
        hasMDEntryID = false;
    }

    public void resetMDEntryPx()
    {
        hasMDEntryPx = false;
    }

    public void resetPriceType()
    {
        hasPriceType = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
    }

    public void resetSettlCurrency()
    {
        hasSettlCurrency = false;
    }

    public void resetMDEntrySize()
    {
        hasMDEntrySize = false;
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetMDEntryDate()
    {
        hasMDEntryDate = false;
    }

    public void resetMDEntryTime()
    {
        hasMDEntryTime = false;
    }

    public void resetTickDirection()
    {
        hasTickDirection = false;
    }

    public void resetMDMkt()
    {
        hasMDMkt = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetSecurityTradingStatus()
    {
        hasSecurityTradingStatus = false;
    }

    public void resetHaltReason()
    {
        hasHaltReason = false;
    }

    public void resetQuoteCondition()
    {
        hasQuoteCondition = false;
    }

    public void resetTradeCondition()
    {
        hasTradeCondition = false;
    }

    public void resetMDEntryOriginator()
    {
        hasMDEntryOriginator = false;
    }

    public void resetLocationID()
    {
        hasLocationID = false;
    }

    public void resetDeskID()
    {
        hasDeskID = false;
    }

    public void resetOpenCloseSettlFlag()
    {
        hasOpenCloseSettlFlag = false;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetExpireDate()
    {
        hasExpireDate = false;
    }

    public void resetExpireTime()
    {
        hasExpireTime = false;
    }

    public void resetMinQty()
    {
        hasMinQty = false;
    }

    public void resetExecInst()
    {
        hasExecInst = false;
    }

    public void resetSellerDays()
    {
        hasSellerDays = false;
    }

    public void resetOrderID()
    {
        hasOrderID = false;
    }

    public void resetSecondaryOrderID()
    {
        hasSecondaryOrderID = false;
    }

    public void resetQuoteEntryID()
    {
        hasQuoteEntryID = false;
    }

    public void resetMDEntryBuyer()
    {
        hasMDEntryBuyer = false;
    }

    public void resetMDEntrySeller()
    {
        hasMDEntrySeller = false;
    }

    public void resetNumberOfOrders()
    {
        hasNumberOfOrders = false;
    }

    public void resetMDEntryPositionNo()
    {
        hasMDEntryPositionNo = false;
    }

    public void resetScope()
    {
        hasScope = false;
    }

    public void resetPriceDelta()
    {
        hasPriceDelta = false;
    }

    public void resetTrdType()
    {
        hasTrdType = false;
    }

    public void resetText()
    {
        hasText = false;
    }

    public void resetEncodedTextLen()
    {
        hasEncodedTextLen = false;
    }

    public void resetEncodedText()
    {
        hasEncodedText = false;
    }

    public void resetMDPriceLevel()
    {
        hasMDPriceLevel = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetMDOriginType()
    {
        hasMDOriginType = false;
    }

    public void resetHighPx()
    {
        hasHighPx = false;
    }

    public void resetLowPx()
    {
        hasLowPx = false;
    }

    public void resetFirstPx()
    {
        hasFirstPx = false;
    }

    public void resetLastPx()
    {
        hasLastPx = false;
    }

    public void resetTradeVolume()
    {
        hasTradeVolume = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        hasSettlDate = false;
    }

    public void resetMDQuoteType()
    {
        hasMDQuoteType = false;
    }

    public void resetRptSeq()
    {
        hasRptSeq = false;
    }

    public void resetDealingCapacity()
    {
        hasDealingCapacity = false;
    }

    public void resetMDEntrySpotRate()
    {
        hasMDEntrySpotRate = false;
    }

    public void resetMDEntryForwardPoints()
    {
        hasMDEntryForwardPoints = false;
    }

    public void resetYieldType()
    {
        hasYieldType = false;
    }

    public void resetYield()
    {
        hasYield = false;
    }

    public void resetYieldCalcDate()
    {
        hasYieldCalcDate = false;
    }

    public void resetYieldRedemptionDate()
    {
        hasYieldRedemptionDate = false;
    }

    public void resetYieldRedemptionPrice()
    {
        hasYieldRedemptionPrice = false;
    }

    public void resetYieldRedemptionPriceType()
    {
        hasYieldRedemptionPriceType = false;
    }

    public void resetSpread()
    {
        hasSpread = false;
    }

    public void resetBenchmarkCurveCurrency()
    {
        hasBenchmarkCurveCurrency = false;
    }

    public void resetBenchmarkCurveName()
    {
        hasBenchmarkCurveName = false;
    }

    public void resetBenchmarkCurvePoint()
    {
        hasBenchmarkCurvePoint = false;
    }

    public void resetBenchmarkPrice()
    {
        hasBenchmarkPrice = false;
    }

    public void resetBenchmarkPriceType()
    {
        hasBenchmarkPriceType = false;
    }

    public void resetBenchmarkSecurityID()
    {
        hasBenchmarkSecurityID = false;
    }

    public void resetBenchmarkSecurityIDSource()
    {
        hasBenchmarkSecurityIDSource = false;
    }

    public void resetRateSourcesGroup()
    {
        for (final RateSourcesGroupDecoder rateSourcesGroupDecoder : rateSourcesGroupIterator.iterator())
        {
            rateSourcesGroupDecoder.reset();
            if (rateSourcesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRateSourcesGroupCounter = MISSING_INT;
        hasNoRateSourcesGroupCounter = false;
    }

    public void resetOfSecSizesGroup()
    {
        for (final OfSecSizesGroupDecoder ofSecSizesGroupDecoder : ofSecSizesGroupIterator.iterator())
        {
            ofSecSizesGroupDecoder.reset();
            if (ofSecSizesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noOfSecSizesGroupCounter = MISSING_INT;
        hasNoOfSecSizesGroupCounter = false;
    }

    public void resetPartyIDsGroup()
    {
        for (final PartyIDsGroupDecoder partyIDsGroupDecoder : partyIDsGroupIterator.iterator())
        {
            partyIDsGroupDecoder.reset();
            if (partyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPartyIDsGroupCounter = MISSING_INT;
        hasNoPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"MDEntriesGroup\",\n");
        indent(builder, level);
        builder.append("\"MDEntryType\": \"");
        builder.append(mDEntryType);
        builder.append("\",\n");

        if (hasMDEntryID())
        {
            indent(builder, level);
            builder.append("\"MDEntryID\": \"");
            builder.append(this.mDEntryID(), 0, mDEntryIDLength());
            builder.append("\",\n");
        }

        if (hasMDEntryPx())
        {
            indent(builder, level);
            builder.append("\"MDEntryPx\": \"");
            mDEntryPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriceType())
        {
            indent(builder, level);
            builder.append("\"PriceType\": \"");
            builder.append(priceType);
            builder.append("\",\n");
        }

        if (hasYieldType())
        {
            indent(builder, level);
            builder.append("\"YieldType\": \"");
            builder.append(this.yieldType(), 0, yieldTypeLength());
            builder.append("\",\n");
        }

        if (hasYield())
        {
            indent(builder, level);
            builder.append("\"Yield\": \"");
            yield.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldCalcDate())
        {
            indent(builder, level);
            builder.append("\"YieldCalcDate\": \"");
            appendData(builder, yieldCalcDate, yieldCalcDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionDate\": \"");
            appendData(builder, yieldRedemptionDate, yieldRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPrice())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPrice\": \"");
            yieldRedemptionPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasYieldRedemptionPriceType())
        {
            indent(builder, level);
            builder.append("\"YieldRedemptionPriceType\": \"");
            builder.append(yieldRedemptionPriceType);
            builder.append("\",\n");
        }

        if (hasSpread())
        {
            indent(builder, level);
            builder.append("\"Spread\": \"");
            spread.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBenchmarkCurveCurrency())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurveCurrency\": \"");
            builder.append(this.benchmarkCurveCurrency(), 0, benchmarkCurveCurrencyLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkCurveName())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurveName\": \"");
            builder.append(this.benchmarkCurveName(), 0, benchmarkCurveNameLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkCurvePoint())
        {
            indent(builder, level);
            builder.append("\"BenchmarkCurvePoint\": \"");
            builder.append(this.benchmarkCurvePoint(), 0, benchmarkCurvePointLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkPrice())
        {
            indent(builder, level);
            builder.append("\"BenchmarkPrice\": \"");
            benchmarkPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasBenchmarkPriceType())
        {
            indent(builder, level);
            builder.append("\"BenchmarkPriceType\": \"");
            builder.append(benchmarkPriceType);
            builder.append("\",\n");
        }

        if (hasBenchmarkSecurityID())
        {
            indent(builder, level);
            builder.append("\"BenchmarkSecurityID\": \"");
            builder.append(this.benchmarkSecurityID(), 0, benchmarkSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasBenchmarkSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"BenchmarkSecurityIDSource\": \"");
            builder.append(this.benchmarkSecurityIDSource(), 0, benchmarkSecurityIDSourceLength());
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            builder.append(this.settlCurrency(), 0, settlCurrencyLength());
            builder.append("\",\n");
        }

    if (hasNoRateSourcesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"RateSourcesGroup\": [\n");
        RateSourcesGroupDecoder rateSourcesGroup = this.rateSourcesGroup;
        for (int i = 0, size = this.noRateSourcesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            rateSourcesGroup.appendTo(builder, level + 1);            if (rateSourcesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            rateSourcesGroup = rateSourcesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasMDEntrySize())
        {
            indent(builder, level);
            builder.append("\"MDEntrySize\": \"");
            mDEntrySize.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoOfSecSizesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"OfSecSizesGroup\": [\n");
        OfSecSizesGroupDecoder ofSecSizesGroup = this.ofSecSizesGroup;
        for (int i = 0, size = this.noOfSecSizesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            ofSecSizesGroup.appendTo(builder, level + 1);            if (ofSecSizesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            ofSecSizesGroup = ofSecSizesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasMDEntryDate())
        {
            indent(builder, level);
            builder.append("\"MDEntryDate\": \"");
            appendData(builder, mDEntryDate, mDEntryDateLength);
            builder.append("\",\n");
        }

        if (hasMDEntryTime())
        {
            indent(builder, level);
            builder.append("\"MDEntryTime\": \"");
            appendData(builder, mDEntryTime, mDEntryTimeLength);
            builder.append("\",\n");
        }

        if (hasTickDirection())
        {
            indent(builder, level);
            builder.append("\"TickDirection\": \"");
            builder.append(tickDirection);
            builder.append("\",\n");
        }

        if (hasMDMkt())
        {
            indent(builder, level);
            builder.append("\"MDMkt\": \"");
            builder.append(this.mDMkt(), 0, mDMktLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasSecurityTradingStatus())
        {
            indent(builder, level);
            builder.append("\"SecurityTradingStatus\": \"");
            builder.append(securityTradingStatus);
            builder.append("\",\n");
        }

        if (hasHaltReason())
        {
            indent(builder, level);
            builder.append("\"HaltReason\": \"");
            builder.append(haltReason);
            builder.append("\",\n");
        }

        if (hasQuoteCondition())
        {
            indent(builder, level);
            builder.append("\"QuoteCondition\": \"");
            builder.append(this.quoteCondition(), 0, quoteConditionLength());
            builder.append("\",\n");
        }

        if (hasTradeCondition())
        {
            indent(builder, level);
            builder.append("\"TradeCondition\": \"");
            builder.append(this.tradeCondition(), 0, tradeConditionLength());
            builder.append("\",\n");
        }

        if (hasMDEntryOriginator())
        {
            indent(builder, level);
            builder.append("\"MDEntryOriginator\": \"");
            builder.append(this.mDEntryOriginator(), 0, mDEntryOriginatorLength());
            builder.append("\",\n");
        }

        if (hasLocationID())
        {
            indent(builder, level);
            builder.append("\"LocationID\": \"");
            builder.append(this.locationID(), 0, locationIDLength());
            builder.append("\",\n");
        }

        if (hasDeskID())
        {
            indent(builder, level);
            builder.append("\"DeskID\": \"");
            builder.append(this.deskID(), 0, deskIDLength());
            builder.append("\",\n");
        }

        if (hasOpenCloseSettlFlag())
        {
            indent(builder, level);
            builder.append("\"OpenCloseSettlFlag\": \"");
            builder.append(this.openCloseSettlFlag(), 0, openCloseSettlFlagLength());
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasExpireDate())
        {
            indent(builder, level);
            builder.append("\"ExpireDate\": \"");
            appendData(builder, expireDate, expireDateLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendData(builder, expireTime, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasMinQty())
        {
            indent(builder, level);
            builder.append("\"MinQty\": \"");
            minQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            builder.append(this.execInst(), 0, execInstLength());
            builder.append("\",\n");
        }

        if (hasSellerDays())
        {
            indent(builder, level);
            builder.append("\"SellerDays\": \"");
            builder.append(sellerDays);
            builder.append("\",\n");
        }

        if (hasOrderID())
        {
            indent(builder, level);
            builder.append("\"OrderID\": \"");
            builder.append(this.orderID(), 0, orderIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryOrderID())
        {
            indent(builder, level);
            builder.append("\"SecondaryOrderID\": \"");
            builder.append(this.secondaryOrderID(), 0, secondaryOrderIDLength());
            builder.append("\",\n");
        }

        if (hasQuoteEntryID())
        {
            indent(builder, level);
            builder.append("\"QuoteEntryID\": \"");
            builder.append(this.quoteEntryID(), 0, quoteEntryIDLength());
            builder.append("\",\n");
        }

        if (hasMDEntryBuyer())
        {
            indent(builder, level);
            builder.append("\"MDEntryBuyer\": \"");
            builder.append(this.mDEntryBuyer(), 0, mDEntryBuyerLength());
            builder.append("\",\n");
        }

        if (hasMDEntrySeller())
        {
            indent(builder, level);
            builder.append("\"MDEntrySeller\": \"");
            builder.append(this.mDEntrySeller(), 0, mDEntrySellerLength());
            builder.append("\",\n");
        }

        if (hasNumberOfOrders())
        {
            indent(builder, level);
            builder.append("\"NumberOfOrders\": \"");
            builder.append(numberOfOrders);
            builder.append("\",\n");
        }

        if (hasMDEntryPositionNo())
        {
            indent(builder, level);
            builder.append("\"MDEntryPositionNo\": \"");
            builder.append(mDEntryPositionNo);
            builder.append("\",\n");
        }

        if (hasScope())
        {
            indent(builder, level);
            builder.append("\"Scope\": \"");
            builder.append(this.scope(), 0, scopeLength());
            builder.append("\",\n");
        }

        if (hasPriceDelta())
        {
            indent(builder, level);
            builder.append("\"PriceDelta\": \"");
            priceDelta.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTrdType())
        {
            indent(builder, level);
            builder.append("\"TrdType\": \"");
            builder.append(trdType);
            builder.append("\",\n");
        }

        if (hasText())
        {
            indent(builder, level);
            builder.append("\"Text\": \"");
            builder.append(this.text(), 0, textLength());
            builder.append("\",\n");
        }

        if (hasEncodedTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedTextLen\": \"");
            builder.append(encodedTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedText())
        {
            indent(builder, level);
            builder.append("\"EncodedText\": \"");
            appendData(builder, encodedText, encodedTextLen);
            builder.append("\",\n");
        }

        if (hasMDPriceLevel())
        {
            indent(builder, level);
            builder.append("\"MDPriceLevel\": \"");
            builder.append(mDPriceLevel);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasMDOriginType())
        {
            indent(builder, level);
            builder.append("\"MDOriginType\": \"");
            builder.append(mDOriginType);
            builder.append("\",\n");
        }

        if (hasHighPx())
        {
            indent(builder, level);
            builder.append("\"HighPx\": \"");
            highPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLowPx())
        {
            indent(builder, level);
            builder.append("\"LowPx\": \"");
            lowPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFirstPx())
        {
            indent(builder, level);
            builder.append("\"FirstPx\": \"");
            firstPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLastPx())
        {
            indent(builder, level);
            builder.append("\"LastPx\": \"");
            lastPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTradeVolume())
        {
            indent(builder, level);
            builder.append("\"TradeVolume\": \"");
            tradeVolume.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(this.settlType(), 0, settlTypeLength());
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendData(builder, settlDate, settlDateLength);
            builder.append("\",\n");
        }

        if (hasMDQuoteType())
        {
            indent(builder, level);
            builder.append("\"MDQuoteType\": \"");
            builder.append(mDQuoteType);
            builder.append("\",\n");
        }

        if (hasRptSeq())
        {
            indent(builder, level);
            builder.append("\"RptSeq\": \"");
            builder.append(rptSeq);
            builder.append("\",\n");
        }

        if (hasDealingCapacity())
        {
            indent(builder, level);
            builder.append("\"DealingCapacity\": \"");
            builder.append(dealingCapacity);
            builder.append("\",\n");
        }

        if (hasMDEntrySpotRate())
        {
            indent(builder, level);
            builder.append("\"MDEntrySpotRate\": \"");
            mDEntrySpotRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasMDEntryForwardPoints())
        {
            indent(builder, level);
            builder.append("\"MDEntryForwardPoints\": \"");
            mDEntryForwardPoints.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"PartyIDsGroup\": [\n");
        PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
        for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            partyIDsGroup.appendTo(builder, level + 1);            if (partyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            partyIDsGroup = partyIDsGroup.next();        }
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
    public MDEntriesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MDEntriesGroupEncoder)encoder);
    }

    public MDEntriesGroupEncoder toEncoder(final MDEntriesGroupEncoder encoder)
    {
        encoder.reset();
        encoder.mDEntryType(this.mDEntryType());
        if (hasMDEntryID())
        {
            encoder.mDEntryID(this.mDEntryID(), 0, mDEntryIDLength());
        }

        if (hasMDEntryPx())
        {
            encoder.mDEntryPx(this.mDEntryPx());
        }

        if (hasPriceType())
        {
            encoder.priceType(this.priceType());
        }


        final YieldDataEncoder yieldData = encoder.yieldData();        if (hasYieldType())
        {
            yieldData.yieldType(this.yieldType(), 0, yieldTypeLength());
        }

        if (hasYield())
        {
            yieldData.yield(this.yield());
        }

        if (hasYieldCalcDate())
        {
            yieldData.yieldCalcDateAsCopy(this.yieldCalcDate(), 0, yieldCalcDateLength());
        }

        if (hasYieldRedemptionDate())
        {
            yieldData.yieldRedemptionDateAsCopy(this.yieldRedemptionDate(), 0, yieldRedemptionDateLength());
        }

        if (hasYieldRedemptionPrice())
        {
            yieldData.yieldRedemptionPrice(this.yieldRedemptionPrice());
        }

        if (hasYieldRedemptionPriceType())
        {
            yieldData.yieldRedemptionPriceType(this.yieldRedemptionPriceType());
        }



        final SpreadOrBenchmarkCurveDataEncoder spreadOrBenchmarkCurveData = encoder.spreadOrBenchmarkCurveData();        if (hasSpread())
        {
            spreadOrBenchmarkCurveData.spread(this.spread());
        }

        if (hasBenchmarkCurveCurrency())
        {
            spreadOrBenchmarkCurveData.benchmarkCurveCurrency(this.benchmarkCurveCurrency(), 0, benchmarkCurveCurrencyLength());
        }

        if (hasBenchmarkCurveName())
        {
            spreadOrBenchmarkCurveData.benchmarkCurveName(this.benchmarkCurveName(), 0, benchmarkCurveNameLength());
        }

        if (hasBenchmarkCurvePoint())
        {
            spreadOrBenchmarkCurveData.benchmarkCurvePoint(this.benchmarkCurvePoint(), 0, benchmarkCurvePointLength());
        }

        if (hasBenchmarkPrice())
        {
            spreadOrBenchmarkCurveData.benchmarkPrice(this.benchmarkPrice());
        }

        if (hasBenchmarkPriceType())
        {
            spreadOrBenchmarkCurveData.benchmarkPriceType(this.benchmarkPriceType());
        }

        if (hasBenchmarkSecurityID())
        {
            spreadOrBenchmarkCurveData.benchmarkSecurityID(this.benchmarkSecurityID(), 0, benchmarkSecurityIDLength());
        }

        if (hasBenchmarkSecurityIDSource())
        {
            spreadOrBenchmarkCurveData.benchmarkSecurityIDSource(this.benchmarkSecurityIDSource(), 0, benchmarkSecurityIDSourceLength());
        }


        if (hasOrdType())
        {
            encoder.ordType(this.ordType());
        }

        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrency(this.settlCurrency(), 0, settlCurrencyLength());
        }


        final RateSourceEncoder rateSource = encoder.rateSource();        if (hasNoRateSourcesGroupCounter)
        {
            final int size = this.noRateSourcesGroupCounter;
            RateSourcesGroupDecoder rateSourcesGroup = this.rateSourcesGroup;
            RateSourcesGroupEncoder rateSourcesGroupEncoder = rateSource.rateSourcesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (rateSourcesGroup != null)
                {
                    rateSourcesGroup.toEncoder(rateSourcesGroupEncoder);
                    rateSourcesGroup = rateSourcesGroup.next();
                    rateSourcesGroupEncoder = rateSourcesGroupEncoder.next();
                }
            }
        }


        if (hasMDEntrySize())
        {
            encoder.mDEntrySize(this.mDEntrySize());
        }


        final SecSizesGrpEncoder secSizesGrp = encoder.secSizesGrp();        if (hasNoOfSecSizesGroupCounter)
        {
            final int size = this.noOfSecSizesGroupCounter;
            OfSecSizesGroupDecoder ofSecSizesGroup = this.ofSecSizesGroup;
            OfSecSizesGroupEncoder ofSecSizesGroupEncoder = secSizesGrp.ofSecSizesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ofSecSizesGroup != null)
                {
                    ofSecSizesGroup.toEncoder(ofSecSizesGroupEncoder);
                    ofSecSizesGroup = ofSecSizesGroup.next();
                    ofSecSizesGroupEncoder = ofSecSizesGroupEncoder.next();
                }
            }
        }


        if (hasLotType())
        {
            encoder.lotType(this.lotType());
        }

        if (hasMDEntryDate())
        {
            encoder.mDEntryDateAsCopy(this.mDEntryDate(), 0, mDEntryDateLength());
        }

        if (hasMDEntryTime())
        {
            encoder.mDEntryTimeAsCopy(this.mDEntryTime(), 0, mDEntryTimeLength());
        }

        if (hasTickDirection())
        {
            encoder.tickDirection(this.tickDirection());
        }

        if (hasMDMkt())
        {
            encoder.mDMkt(this.mDMkt(), 0, mDMktLength());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasSecurityTradingStatus())
        {
            encoder.securityTradingStatus(this.securityTradingStatus());
        }

        if (hasHaltReason())
        {
            encoder.haltReason(this.haltReason());
        }

        if (hasQuoteCondition())
        {
            encoder.quoteCondition(this.quoteCondition(), 0, quoteConditionLength());
        }

        if (hasTradeCondition())
        {
            encoder.tradeCondition(this.tradeCondition(), 0, tradeConditionLength());
        }

        if (hasMDEntryOriginator())
        {
            encoder.mDEntryOriginator(this.mDEntryOriginator(), 0, mDEntryOriginatorLength());
        }

        if (hasLocationID())
        {
            encoder.locationID(this.locationID(), 0, locationIDLength());
        }

        if (hasDeskID())
        {
            encoder.deskID(this.deskID(), 0, deskIDLength());
        }

        if (hasOpenCloseSettlFlag())
        {
            encoder.openCloseSettlFlag(this.openCloseSettlFlag(), 0, openCloseSettlFlagLength());
        }

        if (hasTimeInForce())
        {
            encoder.timeInForce(this.timeInForce());
        }

        if (hasExpireDate())
        {
            encoder.expireDateAsCopy(this.expireDate(), 0, expireDateLength());
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(this.expireTime(), 0, expireTimeLength());
        }

        if (hasMinQty())
        {
            encoder.minQty(this.minQty());
        }

        if (hasExecInst())
        {
            encoder.execInst(this.execInst(), 0, execInstLength());
        }

        if (hasSellerDays())
        {
            encoder.sellerDays(this.sellerDays());
        }

        if (hasOrderID())
        {
            encoder.orderID(this.orderID(), 0, orderIDLength());
        }

        if (hasSecondaryOrderID())
        {
            encoder.secondaryOrderID(this.secondaryOrderID(), 0, secondaryOrderIDLength());
        }

        if (hasQuoteEntryID())
        {
            encoder.quoteEntryID(this.quoteEntryID(), 0, quoteEntryIDLength());
        }

        if (hasMDEntryBuyer())
        {
            encoder.mDEntryBuyer(this.mDEntryBuyer(), 0, mDEntryBuyerLength());
        }

        if (hasMDEntrySeller())
        {
            encoder.mDEntrySeller(this.mDEntrySeller(), 0, mDEntrySellerLength());
        }

        if (hasNumberOfOrders())
        {
            encoder.numberOfOrders(this.numberOfOrders());
        }

        if (hasMDEntryPositionNo())
        {
            encoder.mDEntryPositionNo(this.mDEntryPositionNo());
        }

        if (hasScope())
        {
            encoder.scope(this.scope(), 0, scopeLength());
        }

        if (hasPriceDelta())
        {
            encoder.priceDelta(this.priceDelta());
        }

        if (hasTrdType())
        {
            encoder.trdType(this.trdType());
        }

        if (hasText())
        {
            encoder.text(this.text(), 0, textLength());
        }

        if (hasEncodedTextLen())
        {
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasEncodedText())
        {
            encoder.encodedTextAsCopy(this.encodedText(), 0, encodedTextLen());
            encoder.encodedTextLen(this.encodedTextLen());
        }

        if (hasMDPriceLevel())
        {
            encoder.mDPriceLevel(this.mDPriceLevel());
        }

        if (hasOrderCapacity())
        {
            encoder.orderCapacity(this.orderCapacity());
        }

        if (hasMDOriginType())
        {
            encoder.mDOriginType(this.mDOriginType());
        }

        if (hasHighPx())
        {
            encoder.highPx(this.highPx());
        }

        if (hasLowPx())
        {
            encoder.lowPx(this.lowPx());
        }

        if (hasFirstPx())
        {
            encoder.firstPx(this.firstPx());
        }

        if (hasLastPx())
        {
            encoder.lastPx(this.lastPx());
        }

        if (hasTradeVolume())
        {
            encoder.tradeVolume(this.tradeVolume());
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType(), 0, settlTypeLength());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(this.settlDate(), 0, settlDateLength());
        }

        if (hasMDQuoteType())
        {
            encoder.mDQuoteType(this.mDQuoteType());
        }

        if (hasRptSeq())
        {
            encoder.rptSeq(this.rptSeq());
        }

        if (hasDealingCapacity())
        {
            encoder.dealingCapacity(this.dealingCapacity());
        }

        if (hasMDEntrySpotRate())
        {
            encoder.mDEntrySpotRate(this.mDEntrySpotRate());
        }

        if (hasMDEntryForwardPoints())
        {
            encoder.mDEntryForwardPoints(this.mDEntryForwardPoints());
        }


        final PartiesEncoder parties = encoder.parties();        if (hasNoPartyIDsGroupCounter)
        {
            final int size = this.noPartyIDsGroupCounter;
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            PartyIDsGroupEncoder partyIDsGroupEncoder = parties.partyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partyIDsGroup != null)
                {
                    partyIDsGroup.toEncoder(partyIDsGroupEncoder);
                    partyIDsGroup = partyIDsGroup.next();
                    partyIDsGroupEncoder = partyIDsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class MDEntriesGroupIterator implements Iterable<MDEntriesGroupDecoder>, java.util.Iterator<MDEntriesGroupDecoder>
    {
        private final MDFullGrpDecoder parent;
        private int remainder;
        private MDEntriesGroupDecoder current;

        public MDEntriesGroupIterator(final MDFullGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public MDEntriesGroupDecoder next()
        {
            remainder--;
            final MDEntriesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoMDEntriesGroupCounter() ? parent.noMDEntriesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.mDEntriesGroup();
        }
        public MDEntriesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public MDEntriesGroupIterator mDEntriesGroupIterator();
    public int noMDEntriesGroupCounter();
    public boolean hasNoMDEntriesGroupCounter();
    public MDEntriesGroupDecoder mDEntriesGroup();

}
