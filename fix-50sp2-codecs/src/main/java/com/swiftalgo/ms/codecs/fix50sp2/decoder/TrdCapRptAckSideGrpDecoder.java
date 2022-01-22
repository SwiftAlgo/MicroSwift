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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapRptAckSideGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdCapRptAckSideGrpEncoder.SidesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder.ClearingInstructionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ContAmtGrpEncoder.ContAmtsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.StipulationsEncoder.StipulationsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder.MiscFeesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlDetailsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlDetailsEncoder.SettlDetailsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdAllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedParties2Encoder.Nested2PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtys2SubGrpEncoder.Nested2PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradeReportOrderDetailEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrderQtyDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DisplayInstructionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SideTrdRegTSEncoder.SideTrdRegTSGroupEncoder;

public interface TrdCapRptAckSideGrpDecoder 
{



public class SidesGroupDecoder extends CommonDecoderImpl implements PartiesDecoder, ClrInstGrpDecoder, CommissionDataDecoder, ContAmtGrpDecoder, StipulationsDecoder, MiscFeesGrpDecoder, SettlDetailsDecoder, TrdAllocGrpDecoder, TradeReportOrderDetailDecoder, SideTrdRegTSDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.SIDE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(182);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SIDE);
            GROUP_FIELDS.add(Constants.SIDE_EXEC_ID);
            GROUP_FIELDS.add(Constants.ORDER_DELAY);
            GROUP_FIELDS.add(Constants.ORDER_DELAY_UNIT);
            GROUP_FIELDS.add(Constants.ACCOUNT);
            GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.ACCOUNT_TYPE);
            GROUP_FIELDS.add(Constants.PROCESS_CODE);
            GROUP_FIELDS.add(Constants.ODD_LOT);
            GROUP_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
            GROUP_FIELDS.add(Constants.TRADE_INPUT_DEVICE);
            GROUP_FIELDS.add(Constants.COMPLIANCE_ID);
            GROUP_FIELDS.add(Constants.SOLICITED_FLAG);
            GROUP_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.TIME_BRACKET);
            GROUP_FIELDS.add(Constants.NET_GROSS_IND);
            GROUP_FIELDS.add(Constants.SIDE_CURRENCY);
            GROUP_FIELDS.add(Constants.SIDE_SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.COMMISSION);
            GROUP_FIELDS.add(Constants.COMM_TYPE);
            GROUP_FIELDS.add(Constants.COMM_CURRENCY);
            GROUP_FIELDS.add(Constants.FUND_RENEW_WAIV);
            GROUP_FIELDS.add(Constants.NUM_DAYS_INTEREST);
            GROUP_FIELDS.add(Constants.EX_DATE);
            GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_RATE);
            GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.INTEREST_AT_MATURITY);
            GROUP_FIELDS.add(Constants.END_ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.START_CASH);
            GROUP_FIELDS.add(Constants.END_CASH);
            GROUP_FIELDS.add(Constants.CONCESSION);
            GROUP_FIELDS.add(Constants.TOTAL_TAKEDOWN);
            GROUP_FIELDS.add(Constants.NET_MONEY);
            GROUP_FIELDS.add(Constants.SETTL_CURR_AMT);
            GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
            GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
            GROUP_FIELDS.add(Constants.POSITION_EFFECT);
            GROUP_FIELDS.add(Constants.SIDE_MULTI_LEG_REPORTING_TYPE);
            GROUP_FIELDS.add(Constants.EXCHANGE_RULE);
            GROUP_FIELDS.add(Constants.TRADE_ALLOC_INDICATOR);
            GROUP_FIELDS.add(Constants.PREALLOC_METHOD);
            GROUP_FIELDS.add(Constants.ALLOC_ID);
            GROUP_FIELDS.add(Constants.SIDE_GROSS_TRADE_AMT);
            GROUP_FIELDS.add(Constants.AGGRESSOR_INDICATOR);
            GROUP_FIELDS.add(Constants.SIDE_LAST_QTY);
            GROUP_FIELDS.add(Constants.SIDE_TRADE_REPORT_ID);
            GROUP_FIELDS.add(Constants.SIDE_FILL_STATION_CD);
            GROUP_FIELDS.add(Constants.SIDE_REASON_CD);
            GROUP_FIELDS.add(Constants.RPT_SEQ);
            GROUP_FIELDS.add(Constants.SIDE_TRD_SUB_TYP);
            GROUP_FIELDS.add(Constants.ORDER_CATEGORY);
            GROUP_FIELDS.add(Constants.ORDER_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_ORDER_ID);
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.SECONDARY_CL_ORD_ID);
            GROUP_FIELDS.add(Constants.LIST_ID);
            GROUP_FIELDS.add(Constants.REF_ORDER_ID);
            GROUP_FIELDS.add(Constants.REF_ORDER_ID_SOURCE);
            GROUP_FIELDS.add(Constants.REF_ORD_ID_REASON);
            GROUP_FIELDS.add(Constants.ORD_TYPE);
            GROUP_FIELDS.add(Constants.PRICE);
            GROUP_FIELDS.add(Constants.STOP_PX);
            GROUP_FIELDS.add(Constants.EXEC_INST);
            GROUP_FIELDS.add(Constants.ORD_STATUS);
            GROUP_FIELDS.add(Constants.ORDER_QTY);
            GROUP_FIELDS.add(Constants.CASH_ORDER_QTY);
            GROUP_FIELDS.add(Constants.ORDER_PERCENT);
            GROUP_FIELDS.add(Constants.ROUNDING_DIRECTION);
            GROUP_FIELDS.add(Constants.ROUNDING_MODULUS);
            GROUP_FIELDS.add(Constants.LEAVES_QTY);
            GROUP_FIELDS.add(Constants.CUM_QTY);
            GROUP_FIELDS.add(Constants.TIME_IN_FORCE);
            GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            GROUP_FIELDS.add(Constants.DISPLAY_QTY);
            GROUP_FIELDS.add(Constants.SECONDARY_DISPLAY_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_WHEN);
            GROUP_FIELDS.add(Constants.DISPLAY_METHOD);
            GROUP_FIELDS.add(Constants.DISPLAY_LOW_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_HIGH_QTY);
            GROUP_FIELDS.add(Constants.DISPLAY_MIN_INCR);
            GROUP_FIELDS.add(Constants.REFRESH_QTY);
            GROUP_FIELDS.add(Constants.ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.ORDER_RESTRICTIONS);
            GROUP_FIELDS.add(Constants.BOOKING_TYPE);
            GROUP_FIELDS.add(Constants.ORIG_CUST_ORDER_CAPACITY);
            GROUP_FIELDS.add(Constants.ORDER_INPUT_DEVICE);
            GROUP_FIELDS.add(Constants.LOT_TYPE);
            GROUP_FIELDS.add(Constants.TRANS_BKD_TIME);
            GROUP_FIELDS.add(Constants.ORIG_ORD_MOD_TIME);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(98);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.SIDE);
            ALL_GROUP_FIELDS.add(Constants.SIDE_EXEC_ID);
            ALL_GROUP_FIELDS.add(Constants.ORDER_DELAY);
            ALL_GROUP_FIELDS.add(Constants.ORDER_DELAY_UNIT);
            ALL_GROUP_FIELDS.add(Constants.ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.ACCOUNT_TYPE);
            ALL_GROUP_FIELDS.add(Constants.PROCESS_CODE);
            ALL_GROUP_FIELDS.add(Constants.ODD_LOT);
            ALL_GROUP_FIELDS.add(Constants.TRADE_INPUT_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.TRADE_INPUT_DEVICE);
            ALL_GROUP_FIELDS.add(Constants.COMPLIANCE_ID);
            ALL_GROUP_FIELDS.add(Constants.SOLICITED_FLAG);
            ALL_GROUP_FIELDS.add(Constants.CUST_ORDER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.TIME_BRACKET);
            ALL_GROUP_FIELDS.add(Constants.NET_GROSS_IND);
            ALL_GROUP_FIELDS.add(Constants.SIDE_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.SIDE_SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.NUM_DAYS_INTEREST);
            ALL_GROUP_FIELDS.add(Constants.EX_DATE);
            ALL_GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_RATE);
            ALL_GROUP_FIELDS.add(Constants.ACCRUED_INTEREST_AMT);
            ALL_GROUP_FIELDS.add(Constants.INTEREST_AT_MATURITY);
            ALL_GROUP_FIELDS.add(Constants.END_ACCRUED_INTEREST_AMT);
            ALL_GROUP_FIELDS.add(Constants.START_CASH);
            ALL_GROUP_FIELDS.add(Constants.END_CASH);
            ALL_GROUP_FIELDS.add(Constants.CONCESSION);
            ALL_GROUP_FIELDS.add(Constants.TOTAL_TAKEDOWN);
            ALL_GROUP_FIELDS.add(Constants.NET_MONEY);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_AMT);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
            ALL_GROUP_FIELDS.add(Constants.POSITION_EFFECT);
            ALL_GROUP_FIELDS.add(Constants.SIDE_MULTI_LEG_REPORTING_TYPE);
            ALL_GROUP_FIELDS.add(Constants.EXCHANGE_RULE);
            ALL_GROUP_FIELDS.add(Constants.TRADE_ALLOC_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.PREALLOC_METHOD);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.SIDE_GROSS_TRADE_AMT);
            ALL_GROUP_FIELDS.add(Constants.AGGRESSOR_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.SIDE_LAST_QTY);
            ALL_GROUP_FIELDS.add(Constants.SIDE_TRADE_REPORT_ID);
            ALL_GROUP_FIELDS.add(Constants.SIDE_FILL_STATION_CD);
            ALL_GROUP_FIELDS.add(Constants.SIDE_REASON_CD);
            ALL_GROUP_FIELDS.add(Constants.RPT_SEQ);
            ALL_GROUP_FIELDS.add(Constants.SIDE_TRD_SUB_TYP);
            ALL_GROUP_FIELDS.add(Constants.ORDER_CATEGORY);
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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
            rejectReason = 5;
            return false;
        }

        if (hasOrderDelayUnit)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderDelayUnit.isValid(orderDelayUnit()))
        {
            invalidTagId = 1429;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAcctIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AcctIDSource.isValid(acctIDSource()))
        {
            invalidTagId = 660;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAccountType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AccountType.isValid(accountType()))
        {
            invalidTagId = 581;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProcessCode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ProcessCode.isValid(processCode()))
        {
            invalidTagId = 81;
            rejectReason = 5;
            return false;
        }
        }



        if (hasCustOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CustOrderCapacity.isValid(custOrderCapacity()))
        {
            invalidTagId = 582;
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

        if (hasNetGrossInd)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !NetGrossInd.isValid(netGrossInd()))
        {
            invalidTagId = 430;
            rejectReason = 5;
            return false;
        }
        }

        if (hasCommType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !CommType.isValid(commType()))
        {
            invalidTagId = 13;
            rejectReason = 5;
            return false;
        }
        }

        if (hasFundRenewWaiv)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !FundRenewWaiv.isValid(fundRenewWaiv()))
        {
            invalidTagId = 497;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlCurrFxRateCalc)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlCurrFxRateCalc.isValid(settlCurrFxRateCalc()))
        {
            invalidTagId = 156;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPositionEffect)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PositionEffect.isValid(positionEffect()))
        {
            invalidTagId = 77;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSideMultiLegReportingType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SideMultiLegReportingType.isValid(sideMultiLegReportingType()))
        {
            invalidTagId = 752;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradeAllocIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradeAllocIndicator.isValid(tradeAllocIndicator()))
        {
            invalidTagId = 826;
            rejectReason = 5;
            return false;
        }
        }

        if (hasPreallocMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PreallocMethod.isValid(preallocMethod()))
        {
            invalidTagId = 591;
            rejectReason = 5;
            return false;
        }
        }


        if (hasOrderCategory)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderCategory.isValid(orderCategory()))
        {
            invalidTagId = 1115;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRefOrderIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RefOrderIDSource.isValid(refOrderIDSource()))
        {
            invalidTagId = 1081;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRefOrdIDReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RefOrdIDReason.isValid(refOrdIDReason()))
        {
            invalidTagId = 1431;
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

        if (hasOrdStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrdStatus.isValid(ordStatus()))
        {
            invalidTagId = 39;
            rejectReason = 5;
            return false;
        }
        }

        if (hasRoundingDirection)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RoundingDirection.isValid(roundingDirection()))
        {
            invalidTagId = 468;
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

        if (hasDisplayWhen)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DisplayWhen.isValid(displayWhen()))
        {
            invalidTagId = 1083;
            rejectReason = 5;
            return false;
        }
        }

        if (hasDisplayMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !DisplayMethod.isValid(displayMethod()))
        {
            invalidTagId = 1084;
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

        if (hasOrderRestrictions)
        {
          int orderRestrictionsOffset = 0;
          for (int i = 0; i < orderRestrictionsLength; i++)
          {
              if (this.orderRestrictions()[i] == ' ')
              {
                  orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, i - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
                  orderRestrictionsOffset = i + 1;
              }
          }
          orderRestrictionsWrapper.wrap(this.orderRestrictions(), orderRestrictionsOffset, orderRestrictionsLength - orderRestrictionsOffset);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrderRestrictions.isValid(orderRestrictionsWrapper))
        {
            invalidTagId = 529;
            rejectReason = 5;
            return false;
        }
        }

        if (hasBookingType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BookingType.isValid(bookingType()))
        {
            invalidTagId = 775;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOrigCustOrderCapacity)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OrigCustOrderCapacity.isValid(origCustOrderCapacity()))
        {
            invalidTagId = 1432;
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

        if (hasNoClearingInstructionsGroupCounter)
        {
            {
                int count = 0;
                final ClearingInstructionsGroupIterator iterator = clearingInstructionsGroupIterator.iterator();
                for (final ClearingInstructionsGroupDecoder group : iterator)
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
                    invalidTagId = 576;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoContAmtsGroupCounter)
        {
            {
                int count = 0;
                final ContAmtsGroupIterator iterator = contAmtsGroupIterator.iterator();
                for (final ContAmtsGroupDecoder group : iterator)
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
                    invalidTagId = 518;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoStipulationsGroupCounter)
        {
            {
                int count = 0;
                final StipulationsGroupIterator iterator = stipulationsGroupIterator.iterator();
                for (final StipulationsGroupDecoder group : iterator)
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
                    invalidTagId = 232;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoMiscFeesGroupCounter)
        {
            {
                int count = 0;
                final MiscFeesGroupIterator iterator = miscFeesGroupIterator.iterator();
                for (final MiscFeesGroupDecoder group : iterator)
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
                    invalidTagId = 136;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoSettlDetailsGroupCounter)
        {
            {
                int count = 0;
                final SettlDetailsGroupIterator iterator = settlDetailsGroupIterator.iterator();
                for (final SettlDetailsGroupDecoder group : iterator)
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
                    invalidTagId = 1158;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoAllocsGroupCounter)
        {
            {
                int count = 0;
                final AllocsGroupIterator iterator = allocsGroupIterator.iterator();
                for (final AllocsGroupDecoder group : iterator)
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
                    invalidTagId = 78;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoSideTrdRegTSGroupCounter)
        {
            {
                int count = 0;
                final SideTrdRegTSGroupIterator iterator = sideTrdRegTSGroupIterator.iterator();
                for (final SideTrdRegTSGroupDecoder group : iterator)
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
                    invalidTagId = 1016;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public SidesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private SidesGroupDecoder next = null;

    public SidesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(118);

    private char side = MISSING_CHAR;

    public char side()
    {
        return side;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        return Side.decode(side);
    }

    private char[] sideExecID = new char[1];

    private boolean hasSideExecID;

    public char[] sideExecID()
    {
        if (!hasSideExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SideExecID");
        }

        return sideExecID;
    }

    public boolean hasSideExecID()
    {
        return hasSideExecID;
    }


    private int sideExecIDOffset;

    private int sideExecIDLength;

    public int sideExecIDLength()
    {
        if (!hasSideExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SideExecID");
        }

        return sideExecIDLength;
    }

    public String sideExecIDAsString()
    {
        return hasSideExecID ? new String(sideExecID, 0, sideExecIDLength) : null;
    }

    public void sideExecID(final AsciiSequenceView view)
    {
        if (!hasSideExecID)
        {
            throw new IllegalArgumentException("No value for optional field: SideExecID");
        }

        view.wrap(buffer, sideExecIDOffset, sideExecIDLength);
    }


    private final CharArrayWrapper sideExecIDWrapper = new CharArrayWrapper();
    private int orderDelay = MISSING_INT;

    private boolean hasOrderDelay;

    public int orderDelay()
    {
        if (!hasOrderDelay)
        {
            throw new IllegalArgumentException("No value for optional field: OrderDelay");
        }

        return orderDelay;
    }

    public boolean hasOrderDelay()
    {
        return hasOrderDelay;
    }



    private int orderDelayUnit = MISSING_INT;

    private boolean hasOrderDelayUnit;

    public int orderDelayUnit()
    {
        if (!hasOrderDelayUnit)
        {
            throw new IllegalArgumentException("No value for optional field: OrderDelayUnit");
        }

        return orderDelayUnit;
    }

    public boolean hasOrderDelayUnit()
    {
        return hasOrderDelayUnit;
    }



    private final CharArrayWrapper orderDelayUnitWrapper = new CharArrayWrapper();
    public OrderDelayUnit orderDelayUnitAsEnum()
    {
        if (!hasOrderDelayUnit)
 return OrderDelayUnit.NULL_VAL;
        return OrderDelayUnit.decode(orderDelayUnit);
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


    private char[] account = new char[1];

    private boolean hasAccount;

    public char[] account()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return account;
    }

    public boolean hasAccount()
    {
        return hasAccount;
    }


    private int accountOffset;

    private int accountLength;

    public int accountLength()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return accountLength;
    }

    public String accountAsString()
    {
        return hasAccount ? new String(account, 0, accountLength) : null;
    }

    public void account(final AsciiSequenceView view)
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        view.wrap(buffer, accountOffset, accountLength);
    }


    private final CharArrayWrapper accountWrapper = new CharArrayWrapper();
    private int acctIDSource = MISSING_INT;

    private boolean hasAcctIDSource;

    public int acctIDSource()
    {
        if (!hasAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AcctIDSource");
        }

        return acctIDSource;
    }

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }



    private final CharArrayWrapper acctIDSourceWrapper = new CharArrayWrapper();
    public AcctIDSource acctIDSourceAsEnum()
    {
        if (!hasAcctIDSource)
 return AcctIDSource.NULL_VAL;
        return AcctIDSource.decode(acctIDSource);
    }

    private int accountType = MISSING_INT;

    private boolean hasAccountType;

    public int accountType()
    {
        if (!hasAccountType)
        {
            throw new IllegalArgumentException("No value for optional field: AccountType");
        }

        return accountType;
    }

    public boolean hasAccountType()
    {
        return hasAccountType;
    }



    private final CharArrayWrapper accountTypeWrapper = new CharArrayWrapper();
    public AccountType accountTypeAsEnum()
    {
        if (!hasAccountType)
 return AccountType.NULL_VAL;
        return AccountType.decode(accountType);
    }

    private char processCode = MISSING_CHAR;

    private boolean hasProcessCode;

    public char processCode()
    {
        if (!hasProcessCode)
        {
            throw new IllegalArgumentException("No value for optional field: ProcessCode");
        }

        return processCode;
    }

    public boolean hasProcessCode()
    {
        return hasProcessCode;
    }



    private final CharArrayWrapper processCodeWrapper = new CharArrayWrapper();
    public ProcessCode processCodeAsEnum()
    {
        if (!hasProcessCode)
 return ProcessCode.NULL_VAL;
        return ProcessCode.decode(processCode);
    }

    private boolean oddLot;

    private boolean hasOddLot;

    public boolean oddLot()
    {
        if (!hasOddLot)
        {
            throw new IllegalArgumentException("No value for optional field: OddLot");
        }

        return oddLot;
    }

    public boolean hasOddLot()
    {
        return hasOddLot;
    }





    private ClearingInstructionsGroupDecoder clearingInstructionsGroup = null;
    public ClearingInstructionsGroupDecoder clearingInstructionsGroup()
    {
        return clearingInstructionsGroup;
    }

    private int noClearingInstructionsGroupCounter = MISSING_INT;

    private boolean hasNoClearingInstructionsGroupCounter;

    public int noClearingInstructionsGroupCounter()
    {
        if (!hasNoClearingInstructionsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoClearingInstructionsGroupCounter");
        }

        return noClearingInstructionsGroupCounter;
    }

    public boolean hasNoClearingInstructionsGroupCounter()
    {
        return hasNoClearingInstructionsGroupCounter;
    }




    private ClearingInstructionsGroupIterator clearingInstructionsGroupIterator = new ClearingInstructionsGroupIterator(this);
    public ClearingInstructionsGroupIterator clearingInstructionsGroupIterator()
    {
        return clearingInstructionsGroupIterator.iterator();
    }


    private char[] tradeInputSource = new char[1];

    private boolean hasTradeInputSource;

    public char[] tradeInputSource()
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        return tradeInputSource;
    }

    public boolean hasTradeInputSource()
    {
        return hasTradeInputSource;
    }


    private int tradeInputSourceOffset;

    private int tradeInputSourceLength;

    public int tradeInputSourceLength()
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        return tradeInputSourceLength;
    }

    public String tradeInputSourceAsString()
    {
        return hasTradeInputSource ? new String(tradeInputSource, 0, tradeInputSourceLength) : null;
    }

    public void tradeInputSource(final AsciiSequenceView view)
    {
        if (!hasTradeInputSource)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputSource");
        }

        view.wrap(buffer, tradeInputSourceOffset, tradeInputSourceLength);
    }


    private final CharArrayWrapper tradeInputSourceWrapper = new CharArrayWrapper();
    private char[] tradeInputDevice = new char[1];

    private boolean hasTradeInputDevice;

    public char[] tradeInputDevice()
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        return tradeInputDevice;
    }

    public boolean hasTradeInputDevice()
    {
        return hasTradeInputDevice;
    }


    private int tradeInputDeviceOffset;

    private int tradeInputDeviceLength;

    public int tradeInputDeviceLength()
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        return tradeInputDeviceLength;
    }

    public String tradeInputDeviceAsString()
    {
        return hasTradeInputDevice ? new String(tradeInputDevice, 0, tradeInputDeviceLength) : null;
    }

    public void tradeInputDevice(final AsciiSequenceView view)
    {
        if (!hasTradeInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: TradeInputDevice");
        }

        view.wrap(buffer, tradeInputDeviceOffset, tradeInputDeviceLength);
    }


    private final CharArrayWrapper tradeInputDeviceWrapper = new CharArrayWrapper();
    private char[] complianceID = new char[1];

    private boolean hasComplianceID;

    public char[] complianceID()
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        return complianceID;
    }

    public boolean hasComplianceID()
    {
        return hasComplianceID;
    }


    private int complianceIDOffset;

    private int complianceIDLength;

    public int complianceIDLength()
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        return complianceIDLength;
    }

    public String complianceIDAsString()
    {
        return hasComplianceID ? new String(complianceID, 0, complianceIDLength) : null;
    }

    public void complianceID(final AsciiSequenceView view)
    {
        if (!hasComplianceID)
        {
            throw new IllegalArgumentException("No value for optional field: ComplianceID");
        }

        view.wrap(buffer, complianceIDOffset, complianceIDLength);
    }


    private final CharArrayWrapper complianceIDWrapper = new CharArrayWrapper();
    private boolean solicitedFlag;

    private boolean hasSolicitedFlag;

    public boolean solicitedFlag()
    {
        if (!hasSolicitedFlag)
        {
            throw new IllegalArgumentException("No value for optional field: SolicitedFlag");
        }

        return solicitedFlag;
    }

    public boolean hasSolicitedFlag()
    {
        return hasSolicitedFlag;
    }



    private int custOrderCapacity = MISSING_INT;

    private boolean hasCustOrderCapacity;

    public int custOrderCapacity()
    {
        if (!hasCustOrderCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: CustOrderCapacity");
        }

        return custOrderCapacity;
    }

    public boolean hasCustOrderCapacity()
    {
        return hasCustOrderCapacity;
    }



    private final CharArrayWrapper custOrderCapacityWrapper = new CharArrayWrapper();
    public CustOrderCapacity custOrderCapacityAsEnum()
    {
        if (!hasCustOrderCapacity)
 return CustOrderCapacity.NULL_VAL;
        return CustOrderCapacity.decode(custOrderCapacity);
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

    private char[] timeBracket = new char[1];

    private boolean hasTimeBracket;

    public char[] timeBracket()
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        return timeBracket;
    }

    public boolean hasTimeBracket()
    {
        return hasTimeBracket;
    }


    private int timeBracketOffset;

    private int timeBracketLength;

    public int timeBracketLength()
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        return timeBracketLength;
    }

    public String timeBracketAsString()
    {
        return hasTimeBracket ? new String(timeBracket, 0, timeBracketLength) : null;
    }

    public void timeBracket(final AsciiSequenceView view)
    {
        if (!hasTimeBracket)
        {
            throw new IllegalArgumentException("No value for optional field: TimeBracket");
        }

        view.wrap(buffer, timeBracketOffset, timeBracketLength);
    }


    private final CharArrayWrapper timeBracketWrapper = new CharArrayWrapper();
    private int netGrossInd = MISSING_INT;

    private boolean hasNetGrossInd;

    public int netGrossInd()
    {
        if (!hasNetGrossInd)
        {
            throw new IllegalArgumentException("No value for optional field: NetGrossInd");
        }

        return netGrossInd;
    }

    public boolean hasNetGrossInd()
    {
        return hasNetGrossInd;
    }



    private final CharArrayWrapper netGrossIndWrapper = new CharArrayWrapper();
    public NetGrossInd netGrossIndAsEnum()
    {
        if (!hasNetGrossInd)
 return NetGrossInd.NULL_VAL;
        return NetGrossInd.decode(netGrossInd);
    }

    private char[] sideCurrency = new char[1];

    private boolean hasSideCurrency;

    public char[] sideCurrency()
    {
        if (!hasSideCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideCurrency");
        }

        return sideCurrency;
    }

    public boolean hasSideCurrency()
    {
        return hasSideCurrency;
    }


    private int sideCurrencyOffset;

    private int sideCurrencyLength;

    public int sideCurrencyLength()
    {
        if (!hasSideCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideCurrency");
        }

        return sideCurrencyLength;
    }

    public String sideCurrencyAsString()
    {
        return hasSideCurrency ? new String(sideCurrency, 0, sideCurrencyLength) : null;
    }

    public void sideCurrency(final AsciiSequenceView view)
    {
        if (!hasSideCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideCurrency");
        }

        view.wrap(buffer, sideCurrencyOffset, sideCurrencyLength);
    }


    private char[] sideSettlCurrency = new char[1];

    private boolean hasSideSettlCurrency;

    public char[] sideSettlCurrency()
    {
        if (!hasSideSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideSettlCurrency");
        }

        return sideSettlCurrency;
    }

    public boolean hasSideSettlCurrency()
    {
        return hasSideSettlCurrency;
    }


    private int sideSettlCurrencyOffset;

    private int sideSettlCurrencyLength;

    public int sideSettlCurrencyLength()
    {
        if (!hasSideSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideSettlCurrency");
        }

        return sideSettlCurrencyLength;
    }

    public String sideSettlCurrencyAsString()
    {
        return hasSideSettlCurrency ? new String(sideSettlCurrency, 0, sideSettlCurrencyLength) : null;
    }

    public void sideSettlCurrency(final AsciiSequenceView view)
    {
        if (!hasSideSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: SideSettlCurrency");
        }

        view.wrap(buffer, sideSettlCurrencyOffset, sideSettlCurrencyLength);
    }



    private DecimalFloat commission = DecimalFloat.newNaNValue();

    private boolean hasCommission;

    public DecimalFloat commission()
    {
        if (!hasCommission)
        {
            throw new IllegalArgumentException("No value for optional field: Commission");
        }

        return commission;
    }

    public boolean hasCommission()
    {
        return hasCommission;
    }



    private char commType = MISSING_CHAR;

    private boolean hasCommType;

    public char commType()
    {
        if (!hasCommType)
        {
            throw new IllegalArgumentException("No value for optional field: CommType");
        }

        return commType;
    }

    public boolean hasCommType()
    {
        return hasCommType;
    }



    private final CharArrayWrapper commTypeWrapper = new CharArrayWrapper();
    public CommType commTypeAsEnum()
    {
        if (!hasCommType)
 return CommType.NULL_VAL;
        return CommType.decode(commType);
    }

    private char[] commCurrency = new char[1];

    private boolean hasCommCurrency;

    public char[] commCurrency()
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        return commCurrency;
    }

    public boolean hasCommCurrency()
    {
        return hasCommCurrency;
    }


    private int commCurrencyOffset;

    private int commCurrencyLength;

    public int commCurrencyLength()
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        return commCurrencyLength;
    }

    public String commCurrencyAsString()
    {
        return hasCommCurrency ? new String(commCurrency, 0, commCurrencyLength) : null;
    }

    public void commCurrency(final AsciiSequenceView view)
    {
        if (!hasCommCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: CommCurrency");
        }

        view.wrap(buffer, commCurrencyOffset, commCurrencyLength);
    }


    private char fundRenewWaiv = MISSING_CHAR;

    private boolean hasFundRenewWaiv;

    public char fundRenewWaiv()
    {
        if (!hasFundRenewWaiv)
        {
            throw new IllegalArgumentException("No value for optional field: FundRenewWaiv");
        }

        return fundRenewWaiv;
    }

    public boolean hasFundRenewWaiv()
    {
        return hasFundRenewWaiv;
    }



    private final CharArrayWrapper fundRenewWaivWrapper = new CharArrayWrapper();
    public FundRenewWaiv fundRenewWaivAsEnum()
    {
        if (!hasFundRenewWaiv)
 return FundRenewWaiv.NULL_VAL;
        return FundRenewWaiv.decode(fundRenewWaiv);
    }


    private int numDaysInterest = MISSING_INT;

    private boolean hasNumDaysInterest;

    public int numDaysInterest()
    {
        if (!hasNumDaysInterest)
        {
            throw new IllegalArgumentException("No value for optional field: NumDaysInterest");
        }

        return numDaysInterest;
    }

    public boolean hasNumDaysInterest()
    {
        return hasNumDaysInterest;
    }



    private byte[] exDate = new byte[8];

    private boolean hasExDate;

    public byte[] exDate()
    {
        if (!hasExDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExDate");
        }

        return exDate;
    }

    public boolean hasExDate()
    {
        return hasExDate;
    }


    private int exDateOffset;

    private int exDateLength;

    public int exDateLength()
    {
        if (!hasExDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExDate");
        }

        return exDateLength;
    }

    public String exDateAsString()
    {
        return hasExDate ? new String(exDate, 0, exDateLength) : null;
    }

    public void exDate(final AsciiSequenceView view)
    {
        if (!hasExDate)
        {
            throw new IllegalArgumentException("No value for optional field: ExDate");
        }

        view.wrap(buffer, exDateOffset, exDateLength);
    }


    private DecimalFloat accruedInterestRate = DecimalFloat.newNaNValue();

    private boolean hasAccruedInterestRate;

    public DecimalFloat accruedInterestRate()
    {
        if (!hasAccruedInterestRate)
        {
            throw new IllegalArgumentException("No value for optional field: AccruedInterestRate");
        }

        return accruedInterestRate;
    }

    public boolean hasAccruedInterestRate()
    {
        return hasAccruedInterestRate;
    }



    private DecimalFloat accruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasAccruedInterestAmt;

    public DecimalFloat accruedInterestAmt()
    {
        if (!hasAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: AccruedInterestAmt");
        }

        return accruedInterestAmt;
    }

    public boolean hasAccruedInterestAmt()
    {
        return hasAccruedInterestAmt;
    }



    private DecimalFloat interestAtMaturity = DecimalFloat.newNaNValue();

    private boolean hasInterestAtMaturity;

    public DecimalFloat interestAtMaturity()
    {
        if (!hasInterestAtMaturity)
        {
            throw new IllegalArgumentException("No value for optional field: InterestAtMaturity");
        }

        return interestAtMaturity;
    }

    public boolean hasInterestAtMaturity()
    {
        return hasInterestAtMaturity;
    }



    private DecimalFloat endAccruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasEndAccruedInterestAmt;

    public DecimalFloat endAccruedInterestAmt()
    {
        if (!hasEndAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: EndAccruedInterestAmt");
        }

        return endAccruedInterestAmt;
    }

    public boolean hasEndAccruedInterestAmt()
    {
        return hasEndAccruedInterestAmt;
    }



    private DecimalFloat startCash = DecimalFloat.newNaNValue();

    private boolean hasStartCash;

    public DecimalFloat startCash()
    {
        if (!hasStartCash)
        {
            throw new IllegalArgumentException("No value for optional field: StartCash");
        }

        return startCash;
    }

    public boolean hasStartCash()
    {
        return hasStartCash;
    }



    private DecimalFloat endCash = DecimalFloat.newNaNValue();

    private boolean hasEndCash;

    public DecimalFloat endCash()
    {
        if (!hasEndCash)
        {
            throw new IllegalArgumentException("No value for optional field: EndCash");
        }

        return endCash;
    }

    public boolean hasEndCash()
    {
        return hasEndCash;
    }



    private DecimalFloat concession = DecimalFloat.newNaNValue();

    private boolean hasConcession;

    public DecimalFloat concession()
    {
        if (!hasConcession)
        {
            throw new IllegalArgumentException("No value for optional field: Concession");
        }

        return concession;
    }

    public boolean hasConcession()
    {
        return hasConcession;
    }



    private DecimalFloat totalTakedown = DecimalFloat.newNaNValue();

    private boolean hasTotalTakedown;

    public DecimalFloat totalTakedown()
    {
        if (!hasTotalTakedown)
        {
            throw new IllegalArgumentException("No value for optional field: TotalTakedown");
        }

        return totalTakedown;
    }

    public boolean hasTotalTakedown()
    {
        return hasTotalTakedown;
    }



    private DecimalFloat netMoney = DecimalFloat.newNaNValue();

    private boolean hasNetMoney;

    public DecimalFloat netMoney()
    {
        if (!hasNetMoney)
        {
            throw new IllegalArgumentException("No value for optional field: NetMoney");
        }

        return netMoney;
    }

    public boolean hasNetMoney()
    {
        return hasNetMoney;
    }



    private DecimalFloat settlCurrAmt = DecimalFloat.newNaNValue();

    private boolean hasSettlCurrAmt;

    public DecimalFloat settlCurrAmt()
    {
        if (!hasSettlCurrAmt)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrAmt");
        }

        return settlCurrAmt;
    }

    public boolean hasSettlCurrAmt()
    {
        return hasSettlCurrAmt;
    }



    private DecimalFloat settlCurrFxRate = DecimalFloat.newNaNValue();

    private boolean hasSettlCurrFxRate;

    public DecimalFloat settlCurrFxRate()
    {
        if (!hasSettlCurrFxRate)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrFxRate");
        }

        return settlCurrFxRate;
    }

    public boolean hasSettlCurrFxRate()
    {
        return hasSettlCurrFxRate;
    }



    private char settlCurrFxRateCalc = MISSING_CHAR;

    private boolean hasSettlCurrFxRateCalc;

    public char settlCurrFxRateCalc()
    {
        if (!hasSettlCurrFxRateCalc)
        {
            throw new IllegalArgumentException("No value for optional field: SettlCurrFxRateCalc");
        }

        return settlCurrFxRateCalc;
    }

    public boolean hasSettlCurrFxRateCalc()
    {
        return hasSettlCurrFxRateCalc;
    }



    private final CharArrayWrapper settlCurrFxRateCalcWrapper = new CharArrayWrapper();
    public SettlCurrFxRateCalc settlCurrFxRateCalcAsEnum()
    {
        if (!hasSettlCurrFxRateCalc)
 return SettlCurrFxRateCalc.NULL_VAL;
        return SettlCurrFxRateCalc.decode(settlCurrFxRateCalc);
    }

    private char positionEffect = MISSING_CHAR;

    private boolean hasPositionEffect;

    public char positionEffect()
    {
        if (!hasPositionEffect)
        {
            throw new IllegalArgumentException("No value for optional field: PositionEffect");
        }

        return positionEffect;
    }

    public boolean hasPositionEffect()
    {
        return hasPositionEffect;
    }



    private final CharArrayWrapper positionEffectWrapper = new CharArrayWrapper();
    public PositionEffect positionEffectAsEnum()
    {
        if (!hasPositionEffect)
 return PositionEffect.NULL_VAL;
        return PositionEffect.decode(positionEffect);
    }

    private int sideMultiLegReportingType = MISSING_INT;

    private boolean hasSideMultiLegReportingType;

    public int sideMultiLegReportingType()
    {
        if (!hasSideMultiLegReportingType)
        {
            throw new IllegalArgumentException("No value for optional field: SideMultiLegReportingType");
        }

        return sideMultiLegReportingType;
    }

    public boolean hasSideMultiLegReportingType()
    {
        return hasSideMultiLegReportingType;
    }



    private final CharArrayWrapper sideMultiLegReportingTypeWrapper = new CharArrayWrapper();
    public SideMultiLegReportingType sideMultiLegReportingTypeAsEnum()
    {
        if (!hasSideMultiLegReportingType)
 return SideMultiLegReportingType.NULL_VAL;
        return SideMultiLegReportingType.decode(sideMultiLegReportingType);
    }



    private ContAmtsGroupDecoder contAmtsGroup = null;
    public ContAmtsGroupDecoder contAmtsGroup()
    {
        return contAmtsGroup;
    }

    private int noContAmtsGroupCounter = MISSING_INT;

    private boolean hasNoContAmtsGroupCounter;

    public int noContAmtsGroupCounter()
    {
        if (!hasNoContAmtsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoContAmtsGroupCounter");
        }

        return noContAmtsGroupCounter;
    }

    public boolean hasNoContAmtsGroupCounter()
    {
        return hasNoContAmtsGroupCounter;
    }




    private ContAmtsGroupIterator contAmtsGroupIterator = new ContAmtsGroupIterator(this);
    public ContAmtsGroupIterator contAmtsGroupIterator()
    {
        return contAmtsGroupIterator.iterator();
    }




    private StipulationsGroupDecoder stipulationsGroup = null;
    public StipulationsGroupDecoder stipulationsGroup()
    {
        return stipulationsGroup;
    }

    private int noStipulationsGroupCounter = MISSING_INT;

    private boolean hasNoStipulationsGroupCounter;

    public int noStipulationsGroupCounter()
    {
        if (!hasNoStipulationsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoStipulationsGroupCounter");
        }

        return noStipulationsGroupCounter;
    }

    public boolean hasNoStipulationsGroupCounter()
    {
        return hasNoStipulationsGroupCounter;
    }




    private StipulationsGroupIterator stipulationsGroupIterator = new StipulationsGroupIterator(this);
    public StipulationsGroupIterator stipulationsGroupIterator()
    {
        return stipulationsGroupIterator.iterator();
    }




    private MiscFeesGroupDecoder miscFeesGroup = null;
    public MiscFeesGroupDecoder miscFeesGroup()
    {
        return miscFeesGroup;
    }

    private int noMiscFeesGroupCounter = MISSING_INT;

    private boolean hasNoMiscFeesGroupCounter;

    public int noMiscFeesGroupCounter()
    {
        if (!hasNoMiscFeesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMiscFeesGroupCounter");
        }

        return noMiscFeesGroupCounter;
    }

    public boolean hasNoMiscFeesGroupCounter()
    {
        return hasNoMiscFeesGroupCounter;
    }




    private MiscFeesGroupIterator miscFeesGroupIterator = new MiscFeesGroupIterator(this);
    public MiscFeesGroupIterator miscFeesGroupIterator()
    {
        return miscFeesGroupIterator.iterator();
    }


    private char[] exchangeRule = new char[1];

    private boolean hasExchangeRule;

    public char[] exchangeRule()
    {
        if (!hasExchangeRule)
        {
            throw new IllegalArgumentException("No value for optional field: ExchangeRule");
        }

        return exchangeRule;
    }

    public boolean hasExchangeRule()
    {
        return hasExchangeRule;
    }


    private int exchangeRuleOffset;

    private int exchangeRuleLength;

    public int exchangeRuleLength()
    {
        if (!hasExchangeRule)
        {
            throw new IllegalArgumentException("No value for optional field: ExchangeRule");
        }

        return exchangeRuleLength;
    }

    public String exchangeRuleAsString()
    {
        return hasExchangeRule ? new String(exchangeRule, 0, exchangeRuleLength) : null;
    }

    public void exchangeRule(final AsciiSequenceView view)
    {
        if (!hasExchangeRule)
        {
            throw new IllegalArgumentException("No value for optional field: ExchangeRule");
        }

        view.wrap(buffer, exchangeRuleOffset, exchangeRuleLength);
    }


    private final CharArrayWrapper exchangeRuleWrapper = new CharArrayWrapper();


    private SettlDetailsGroupDecoder settlDetailsGroup = null;
    public SettlDetailsGroupDecoder settlDetailsGroup()
    {
        return settlDetailsGroup;
    }

    private int noSettlDetailsGroupCounter = MISSING_INT;

    private boolean hasNoSettlDetailsGroupCounter;

    public int noSettlDetailsGroupCounter()
    {
        if (!hasNoSettlDetailsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSettlDetailsGroupCounter");
        }

        return noSettlDetailsGroupCounter;
    }

    public boolean hasNoSettlDetailsGroupCounter()
    {
        return hasNoSettlDetailsGroupCounter;
    }




    private SettlDetailsGroupIterator settlDetailsGroupIterator = new SettlDetailsGroupIterator(this);
    public SettlDetailsGroupIterator settlDetailsGroupIterator()
    {
        return settlDetailsGroupIterator.iterator();
    }


    private int tradeAllocIndicator = MISSING_INT;

    private boolean hasTradeAllocIndicator;

    public int tradeAllocIndicator()
    {
        if (!hasTradeAllocIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: TradeAllocIndicator");
        }

        return tradeAllocIndicator;
    }

    public boolean hasTradeAllocIndicator()
    {
        return hasTradeAllocIndicator;
    }



    private final CharArrayWrapper tradeAllocIndicatorWrapper = new CharArrayWrapper();
    public TradeAllocIndicator tradeAllocIndicatorAsEnum()
    {
        if (!hasTradeAllocIndicator)
 return TradeAllocIndicator.NULL_VAL;
        return TradeAllocIndicator.decode(tradeAllocIndicator);
    }

    private char preallocMethod = MISSING_CHAR;

    private boolean hasPreallocMethod;

    public char preallocMethod()
    {
        if (!hasPreallocMethod)
        {
            throw new IllegalArgumentException("No value for optional field: PreallocMethod");
        }

        return preallocMethod;
    }

    public boolean hasPreallocMethod()
    {
        return hasPreallocMethod;
    }



    private final CharArrayWrapper preallocMethodWrapper = new CharArrayWrapper();
    public PreallocMethod preallocMethodAsEnum()
    {
        if (!hasPreallocMethod)
 return PreallocMethod.NULL_VAL;
        return PreallocMethod.decode(preallocMethod);
    }

    private char[] allocID = new char[1];

    private boolean hasAllocID;

    public char[] allocID()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocID;
    }

    public boolean hasAllocID()
    {
        return hasAllocID;
    }


    private int allocIDOffset;

    private int allocIDLength;

    public int allocIDLength()
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        return allocIDLength;
    }

    public String allocIDAsString()
    {
        return hasAllocID ? new String(allocID, 0, allocIDLength) : null;
    }

    public void allocID(final AsciiSequenceView view)
    {
        if (!hasAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: AllocID");
        }

        view.wrap(buffer, allocIDOffset, allocIDLength);
    }


    private final CharArrayWrapper allocIDWrapper = new CharArrayWrapper();


    private AllocsGroupDecoder allocsGroup = null;
    public AllocsGroupDecoder allocsGroup()
    {
        return allocsGroup;
    }

    private int noAllocsGroupCounter = MISSING_INT;

    private boolean hasNoAllocsGroupCounter;

    public int noAllocsGroupCounter()
    {
        if (!hasNoAllocsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoAllocsGroupCounter");
        }

        return noAllocsGroupCounter;
    }

    public boolean hasNoAllocsGroupCounter()
    {
        return hasNoAllocsGroupCounter;
    }




    private AllocsGroupIterator allocsGroupIterator = new AllocsGroupIterator(this);
    public AllocsGroupIterator allocsGroupIterator()
    {
        return allocsGroupIterator.iterator();
    }


    private DecimalFloat sideGrossTradeAmt = DecimalFloat.newNaNValue();

    private boolean hasSideGrossTradeAmt;

    public DecimalFloat sideGrossTradeAmt()
    {
        if (!hasSideGrossTradeAmt)
        {
            throw new IllegalArgumentException("No value for optional field: SideGrossTradeAmt");
        }

        return sideGrossTradeAmt;
    }

    public boolean hasSideGrossTradeAmt()
    {
        return hasSideGrossTradeAmt;
    }



    private boolean aggressorIndicator;

    private boolean hasAggressorIndicator;

    public boolean aggressorIndicator()
    {
        if (!hasAggressorIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AggressorIndicator");
        }

        return aggressorIndicator;
    }

    public boolean hasAggressorIndicator()
    {
        return hasAggressorIndicator;
    }



    private int sideLastQty = MISSING_INT;

    private boolean hasSideLastQty;

    public int sideLastQty()
    {
        if (!hasSideLastQty)
        {
            throw new IllegalArgumentException("No value for optional field: SideLastQty");
        }

        return sideLastQty;
    }

    public boolean hasSideLastQty()
    {
        return hasSideLastQty;
    }



    private char[] sideTradeReportID = new char[1];

    private boolean hasSideTradeReportID;

    public char[] sideTradeReportID()
    {
        if (!hasSideTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SideTradeReportID");
        }

        return sideTradeReportID;
    }

    public boolean hasSideTradeReportID()
    {
        return hasSideTradeReportID;
    }


    private int sideTradeReportIDOffset;

    private int sideTradeReportIDLength;

    public int sideTradeReportIDLength()
    {
        if (!hasSideTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SideTradeReportID");
        }

        return sideTradeReportIDLength;
    }

    public String sideTradeReportIDAsString()
    {
        return hasSideTradeReportID ? new String(sideTradeReportID, 0, sideTradeReportIDLength) : null;
    }

    public void sideTradeReportID(final AsciiSequenceView view)
    {
        if (!hasSideTradeReportID)
        {
            throw new IllegalArgumentException("No value for optional field: SideTradeReportID");
        }

        view.wrap(buffer, sideTradeReportIDOffset, sideTradeReportIDLength);
    }


    private final CharArrayWrapper sideTradeReportIDWrapper = new CharArrayWrapper();
    private char[] sideFillStationCd = new char[1];

    private boolean hasSideFillStationCd;

    public char[] sideFillStationCd()
    {
        if (!hasSideFillStationCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideFillStationCd");
        }

        return sideFillStationCd;
    }

    public boolean hasSideFillStationCd()
    {
        return hasSideFillStationCd;
    }


    private int sideFillStationCdOffset;

    private int sideFillStationCdLength;

    public int sideFillStationCdLength()
    {
        if (!hasSideFillStationCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideFillStationCd");
        }

        return sideFillStationCdLength;
    }

    public String sideFillStationCdAsString()
    {
        return hasSideFillStationCd ? new String(sideFillStationCd, 0, sideFillStationCdLength) : null;
    }

    public void sideFillStationCd(final AsciiSequenceView view)
    {
        if (!hasSideFillStationCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideFillStationCd");
        }

        view.wrap(buffer, sideFillStationCdOffset, sideFillStationCdLength);
    }


    private final CharArrayWrapper sideFillStationCdWrapper = new CharArrayWrapper();
    private char[] sideReasonCd = new char[1];

    private boolean hasSideReasonCd;

    public char[] sideReasonCd()
    {
        if (!hasSideReasonCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideReasonCd");
        }

        return sideReasonCd;
    }

    public boolean hasSideReasonCd()
    {
        return hasSideReasonCd;
    }


    private int sideReasonCdOffset;

    private int sideReasonCdLength;

    public int sideReasonCdLength()
    {
        if (!hasSideReasonCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideReasonCd");
        }

        return sideReasonCdLength;
    }

    public String sideReasonCdAsString()
    {
        return hasSideReasonCd ? new String(sideReasonCd, 0, sideReasonCdLength) : null;
    }

    public void sideReasonCd(final AsciiSequenceView view)
    {
        if (!hasSideReasonCd)
        {
            throw new IllegalArgumentException("No value for optional field: SideReasonCd");
        }

        view.wrap(buffer, sideReasonCdOffset, sideReasonCdLength);
    }


    private final CharArrayWrapper sideReasonCdWrapper = new CharArrayWrapper();
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



    private int sideTrdSubTyp = MISSING_INT;

    private boolean hasSideTrdSubTyp;

    public int sideTrdSubTyp()
    {
        if (!hasSideTrdSubTyp)
        {
            throw new IllegalArgumentException("No value for optional field: SideTrdSubTyp");
        }

        return sideTrdSubTyp;
    }

    public boolean hasSideTrdSubTyp()
    {
        return hasSideTrdSubTyp;
    }



    private char orderCategory = MISSING_CHAR;

    private boolean hasOrderCategory;

    public char orderCategory()
    {
        if (!hasOrderCategory)
        {
            throw new IllegalArgumentException("No value for optional field: OrderCategory");
        }

        return orderCategory;
    }

    public boolean hasOrderCategory()
    {
        return hasOrderCategory;
    }



    private final CharArrayWrapper orderCategoryWrapper = new CharArrayWrapper();
    public OrderCategory orderCategoryAsEnum()
    {
        if (!hasOrderCategory)
 return OrderCategory.NULL_VAL;
        return OrderCategory.decode(orderCategory);
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


    private final CharArrayWrapper orderIDWrapper = new CharArrayWrapper();
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


    private final CharArrayWrapper secondaryOrderIDWrapper = new CharArrayWrapper();
    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
    }


    private final CharArrayWrapper clOrdIDWrapper = new CharArrayWrapper();
    private char[] secondaryClOrdID = new char[1];

    private boolean hasSecondaryClOrdID;

    public char[] secondaryClOrdID()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdID;
    }

    public boolean hasSecondaryClOrdID()
    {
        return hasSecondaryClOrdID;
    }


    private int secondaryClOrdIDOffset;

    private int secondaryClOrdIDLength;

    public int secondaryClOrdIDLength()
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        return secondaryClOrdIDLength;
    }

    public String secondaryClOrdIDAsString()
    {
        return hasSecondaryClOrdID ? new String(secondaryClOrdID, 0, secondaryClOrdIDLength) : null;
    }

    public void secondaryClOrdID(final AsciiSequenceView view)
    {
        if (!hasSecondaryClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryClOrdID");
        }

        view.wrap(buffer, secondaryClOrdIDOffset, secondaryClOrdIDLength);
    }


    private final CharArrayWrapper secondaryClOrdIDWrapper = new CharArrayWrapper();
    private char[] listID = new char[1];

    private boolean hasListID;

    public char[] listID()
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        return listID;
    }

    public boolean hasListID()
    {
        return hasListID;
    }


    private int listIDOffset;

    private int listIDLength;

    public int listIDLength()
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        return listIDLength;
    }

    public String listIDAsString()
    {
        return hasListID ? new String(listID, 0, listIDLength) : null;
    }

    public void listID(final AsciiSequenceView view)
    {
        if (!hasListID)
        {
            throw new IllegalArgumentException("No value for optional field: ListID");
        }

        view.wrap(buffer, listIDOffset, listIDLength);
    }


    private final CharArrayWrapper listIDWrapper = new CharArrayWrapper();
    private char[] refOrderID = new char[1];

    private boolean hasRefOrderID;

    public char[] refOrderID()
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        return refOrderID;
    }

    public boolean hasRefOrderID()
    {
        return hasRefOrderID;
    }


    private int refOrderIDOffset;

    private int refOrderIDLength;

    public int refOrderIDLength()
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        return refOrderIDLength;
    }

    public String refOrderIDAsString()
    {
        return hasRefOrderID ? new String(refOrderID, 0, refOrderIDLength) : null;
    }

    public void refOrderID(final AsciiSequenceView view)
    {
        if (!hasRefOrderID)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderID");
        }

        view.wrap(buffer, refOrderIDOffset, refOrderIDLength);
    }


    private final CharArrayWrapper refOrderIDWrapper = new CharArrayWrapper();
    private char refOrderIDSource = MISSING_CHAR;

    private boolean hasRefOrderIDSource;

    public char refOrderIDSource()
    {
        if (!hasRefOrderIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrderIDSource");
        }

        return refOrderIDSource;
    }

    public boolean hasRefOrderIDSource()
    {
        return hasRefOrderIDSource;
    }



    private final CharArrayWrapper refOrderIDSourceWrapper = new CharArrayWrapper();
    public RefOrderIDSource refOrderIDSourceAsEnum()
    {
        if (!hasRefOrderIDSource)
 return RefOrderIDSource.NULL_VAL;
        return RefOrderIDSource.decode(refOrderIDSource);
    }

    private int refOrdIDReason = MISSING_INT;

    private boolean hasRefOrdIDReason;

    public int refOrdIDReason()
    {
        if (!hasRefOrdIDReason)
        {
            throw new IllegalArgumentException("No value for optional field: RefOrdIDReason");
        }

        return refOrdIDReason;
    }

    public boolean hasRefOrdIDReason()
    {
        return hasRefOrdIDReason;
    }



    private final CharArrayWrapper refOrdIDReasonWrapper = new CharArrayWrapper();
    public RefOrdIDReason refOrdIDReasonAsEnum()
    {
        if (!hasRefOrdIDReason)
 return RefOrdIDReason.NULL_VAL;
        return RefOrdIDReason.decode(refOrdIDReason);
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

    private DecimalFloat price = DecimalFloat.newNaNValue();

    private boolean hasPrice;

    public DecimalFloat price()
    {
        if (!hasPrice)
        {
            throw new IllegalArgumentException("No value for optional field: Price");
        }

        return price;
    }

    public boolean hasPrice()
    {
        return hasPrice;
    }



    private DecimalFloat stopPx = DecimalFloat.newNaNValue();

    private boolean hasStopPx;

    public DecimalFloat stopPx()
    {
        if (!hasStopPx)
        {
            throw new IllegalArgumentException("No value for optional field: StopPx");
        }

        return stopPx;
    }

    public boolean hasStopPx()
    {
        return hasStopPx;
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
    private char ordStatus = MISSING_CHAR;

    private boolean hasOrdStatus;

    public char ordStatus()
    {
        if (!hasOrdStatus)
        {
            throw new IllegalArgumentException("No value for optional field: OrdStatus");
        }

        return ordStatus;
    }

    public boolean hasOrdStatus()
    {
        return hasOrdStatus;
    }



    private final CharArrayWrapper ordStatusWrapper = new CharArrayWrapper();
    public OrdStatus ordStatusAsEnum()
    {
        if (!hasOrdStatus)
 return OrdStatus.NULL_VAL;
        return OrdStatus.decode(ordStatus);
    }


    private DecimalFloat orderQty = DecimalFloat.newNaNValue();

    private boolean hasOrderQty;

    public DecimalFloat orderQty()
    {
        if (!hasOrderQty)
        {
            throw new IllegalArgumentException("No value for optional field: OrderQty");
        }

        return orderQty;
    }

    public boolean hasOrderQty()
    {
        return hasOrderQty;
    }



    private DecimalFloat cashOrderQty = DecimalFloat.newNaNValue();

    private boolean hasCashOrderQty;

    public DecimalFloat cashOrderQty()
    {
        if (!hasCashOrderQty)
        {
            throw new IllegalArgumentException("No value for optional field: CashOrderQty");
        }

        return cashOrderQty;
    }

    public boolean hasCashOrderQty()
    {
        return hasCashOrderQty;
    }



    private DecimalFloat orderPercent = DecimalFloat.newNaNValue();

    private boolean hasOrderPercent;

    public DecimalFloat orderPercent()
    {
        if (!hasOrderPercent)
        {
            throw new IllegalArgumentException("No value for optional field: OrderPercent");
        }

        return orderPercent;
    }

    public boolean hasOrderPercent()
    {
        return hasOrderPercent;
    }



    private char roundingDirection = MISSING_CHAR;

    private boolean hasRoundingDirection;

    public char roundingDirection()
    {
        if (!hasRoundingDirection)
        {
            throw new IllegalArgumentException("No value for optional field: RoundingDirection");
        }

        return roundingDirection;
    }

    public boolean hasRoundingDirection()
    {
        return hasRoundingDirection;
    }



    private final CharArrayWrapper roundingDirectionWrapper = new CharArrayWrapper();
    public RoundingDirection roundingDirectionAsEnum()
    {
        if (!hasRoundingDirection)
 return RoundingDirection.NULL_VAL;
        return RoundingDirection.decode(roundingDirection);
    }

    private DecimalFloat roundingModulus = DecimalFloat.newNaNValue();

    private boolean hasRoundingModulus;

    public DecimalFloat roundingModulus()
    {
        if (!hasRoundingModulus)
        {
            throw new IllegalArgumentException("No value for optional field: RoundingModulus");
        }

        return roundingModulus;
    }

    public boolean hasRoundingModulus()
    {
        return hasRoundingModulus;
    }




    private DecimalFloat leavesQty = DecimalFloat.newNaNValue();

    private boolean hasLeavesQty;

    public DecimalFloat leavesQty()
    {
        if (!hasLeavesQty)
        {
            throw new IllegalArgumentException("No value for optional field: LeavesQty");
        }

        return leavesQty;
    }

    public boolean hasLeavesQty()
    {
        return hasLeavesQty;
    }



    private DecimalFloat cumQty = DecimalFloat.newNaNValue();

    private boolean hasCumQty;

    public DecimalFloat cumQty()
    {
        if (!hasCumQty)
        {
            throw new IllegalArgumentException("No value for optional field: CumQty");
        }

        return cumQty;
    }

    public boolean hasCumQty()
    {
        return hasCumQty;
    }



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



    private DecimalFloat displayQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayQty;

    public DecimalFloat displayQty()
    {
        if (!hasDisplayQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayQty");
        }

        return displayQty;
    }

    public boolean hasDisplayQty()
    {
        return hasDisplayQty;
    }



    private DecimalFloat secondaryDisplayQty = DecimalFloat.newNaNValue();

    private boolean hasSecondaryDisplayQty;

    public DecimalFloat secondaryDisplayQty()
    {
        if (!hasSecondaryDisplayQty)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryDisplayQty");
        }

        return secondaryDisplayQty;
    }

    public boolean hasSecondaryDisplayQty()
    {
        return hasSecondaryDisplayQty;
    }



    private char displayWhen = MISSING_CHAR;

    private boolean hasDisplayWhen;

    public char displayWhen()
    {
        if (!hasDisplayWhen)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayWhen");
        }

        return displayWhen;
    }

    public boolean hasDisplayWhen()
    {
        return hasDisplayWhen;
    }



    private final CharArrayWrapper displayWhenWrapper = new CharArrayWrapper();
    public DisplayWhen displayWhenAsEnum()
    {
        if (!hasDisplayWhen)
 return DisplayWhen.NULL_VAL;
        return DisplayWhen.decode(displayWhen);
    }

    private char displayMethod = MISSING_CHAR;

    private boolean hasDisplayMethod;

    public char displayMethod()
    {
        if (!hasDisplayMethod)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayMethod");
        }

        return displayMethod;
    }

    public boolean hasDisplayMethod()
    {
        return hasDisplayMethod;
    }



    private final CharArrayWrapper displayMethodWrapper = new CharArrayWrapper();
    public DisplayMethod displayMethodAsEnum()
    {
        if (!hasDisplayMethod)
 return DisplayMethod.NULL_VAL;
        return DisplayMethod.decode(displayMethod);
    }

    private DecimalFloat displayLowQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayLowQty;

    public DecimalFloat displayLowQty()
    {
        if (!hasDisplayLowQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayLowQty");
        }

        return displayLowQty;
    }

    public boolean hasDisplayLowQty()
    {
        return hasDisplayLowQty;
    }



    private DecimalFloat displayHighQty = DecimalFloat.newNaNValue();

    private boolean hasDisplayHighQty;

    public DecimalFloat displayHighQty()
    {
        if (!hasDisplayHighQty)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayHighQty");
        }

        return displayHighQty;
    }

    public boolean hasDisplayHighQty()
    {
        return hasDisplayHighQty;
    }



    private DecimalFloat displayMinIncr = DecimalFloat.newNaNValue();

    private boolean hasDisplayMinIncr;

    public DecimalFloat displayMinIncr()
    {
        if (!hasDisplayMinIncr)
        {
            throw new IllegalArgumentException("No value for optional field: DisplayMinIncr");
        }

        return displayMinIncr;
    }

    public boolean hasDisplayMinIncr()
    {
        return hasDisplayMinIncr;
    }



    private DecimalFloat refreshQty = DecimalFloat.newNaNValue();

    private boolean hasRefreshQty;

    public DecimalFloat refreshQty()
    {
        if (!hasRefreshQty)
        {
            throw new IllegalArgumentException("No value for optional field: RefreshQty");
        }

        return refreshQty;
    }

    public boolean hasRefreshQty()
    {
        return hasRefreshQty;
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

    private char[] orderRestrictions = new char[1];

    private boolean hasOrderRestrictions;

    public char[] orderRestrictions()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictions;
    }

    public boolean hasOrderRestrictions()
    {
        return hasOrderRestrictions;
    }


    private int orderRestrictionsOffset;

    private int orderRestrictionsLength;

    public int orderRestrictionsLength()
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        return orderRestrictionsLength;
    }

    public String orderRestrictionsAsString()
    {
        return hasOrderRestrictions ? new String(orderRestrictions, 0, orderRestrictionsLength) : null;
    }

    public void orderRestrictions(final AsciiSequenceView view)
    {
        if (!hasOrderRestrictions)
        {
            throw new IllegalArgumentException("No value for optional field: OrderRestrictions");
        }

        view.wrap(buffer, orderRestrictionsOffset, orderRestrictionsLength);
    }


    private final CharArrayWrapper orderRestrictionsWrapper = new CharArrayWrapper();
    private int bookingType = MISSING_INT;

    private boolean hasBookingType;

    public int bookingType()
    {
        if (!hasBookingType)
        {
            throw new IllegalArgumentException("No value for optional field: BookingType");
        }

        return bookingType;
    }

    public boolean hasBookingType()
    {
        return hasBookingType;
    }



    private final CharArrayWrapper bookingTypeWrapper = new CharArrayWrapper();
    public BookingType bookingTypeAsEnum()
    {
        if (!hasBookingType)
 return BookingType.NULL_VAL;
        return BookingType.decode(bookingType);
    }

    private int origCustOrderCapacity = MISSING_INT;

    private boolean hasOrigCustOrderCapacity;

    public int origCustOrderCapacity()
    {
        if (!hasOrigCustOrderCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: OrigCustOrderCapacity");
        }

        return origCustOrderCapacity;
    }

    public boolean hasOrigCustOrderCapacity()
    {
        return hasOrigCustOrderCapacity;
    }



    private final CharArrayWrapper origCustOrderCapacityWrapper = new CharArrayWrapper();
    public OrigCustOrderCapacity origCustOrderCapacityAsEnum()
    {
        if (!hasOrigCustOrderCapacity)
 return OrigCustOrderCapacity.NULL_VAL;
        return OrigCustOrderCapacity.decode(origCustOrderCapacity);
    }

    private char[] orderInputDevice = new char[1];

    private boolean hasOrderInputDevice;

    public char[] orderInputDevice()
    {
        if (!hasOrderInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: OrderInputDevice");
        }

        return orderInputDevice;
    }

    public boolean hasOrderInputDevice()
    {
        return hasOrderInputDevice;
    }


    private int orderInputDeviceOffset;

    private int orderInputDeviceLength;

    public int orderInputDeviceLength()
    {
        if (!hasOrderInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: OrderInputDevice");
        }

        return orderInputDeviceLength;
    }

    public String orderInputDeviceAsString()
    {
        return hasOrderInputDevice ? new String(orderInputDevice, 0, orderInputDeviceLength) : null;
    }

    public void orderInputDevice(final AsciiSequenceView view)
    {
        if (!hasOrderInputDevice)
        {
            throw new IllegalArgumentException("No value for optional field: OrderInputDevice");
        }

        view.wrap(buffer, orderInputDeviceOffset, orderInputDeviceLength);
    }


    private final CharArrayWrapper orderInputDeviceWrapper = new CharArrayWrapper();
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

    private byte[] transBkdTime = new byte[24];

    private boolean hasTransBkdTime;

    public byte[] transBkdTime()
    {
        if (!hasTransBkdTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransBkdTime");
        }

        return transBkdTime;
    }

    public boolean hasTransBkdTime()
    {
        return hasTransBkdTime;
    }


    private int transBkdTimeOffset;

    private int transBkdTimeLength;

    public int transBkdTimeLength()
    {
        if (!hasTransBkdTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransBkdTime");
        }

        return transBkdTimeLength;
    }

    public String transBkdTimeAsString()
    {
        return hasTransBkdTime ? new String(transBkdTime, 0, transBkdTimeLength) : null;
    }

    public void transBkdTime(final AsciiSequenceView view)
    {
        if (!hasTransBkdTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransBkdTime");
        }

        view.wrap(buffer, transBkdTimeOffset, transBkdTimeLength);
    }


    private byte[] origOrdModTime = new byte[24];

    private boolean hasOrigOrdModTime;

    public byte[] origOrdModTime()
    {
        if (!hasOrigOrdModTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigOrdModTime");
        }

        return origOrdModTime;
    }

    public boolean hasOrigOrdModTime()
    {
        return hasOrigOrdModTime;
    }


    private int origOrdModTimeOffset;

    private int origOrdModTimeLength;

    public int origOrdModTimeLength()
    {
        if (!hasOrigOrdModTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigOrdModTime");
        }

        return origOrdModTimeLength;
    }

    public String origOrdModTimeAsString()
    {
        return hasOrigOrdModTime ? new String(origOrdModTime, 0, origOrdModTimeLength) : null;
    }

    public void origOrdModTime(final AsciiSequenceView view)
    {
        if (!hasOrigOrdModTime)
        {
            throw new IllegalArgumentException("No value for optional field: OrigOrdModTime");
        }

        view.wrap(buffer, origOrdModTimeOffset, origOrdModTimeLength);
    }





    private SideTrdRegTSGroupDecoder sideTrdRegTSGroup = null;
    public SideTrdRegTSGroupDecoder sideTrdRegTSGroup()
    {
        return sideTrdRegTSGroup;
    }

    private int noSideTrdRegTSGroupCounter = MISSING_INT;

    private boolean hasNoSideTrdRegTSGroupCounter;

    public int noSideTrdRegTSGroupCounter()
    {
        if (!hasNoSideTrdRegTSGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoSideTrdRegTSGroupCounter");
        }

        return noSideTrdRegTSGroupCounter;
    }

    public boolean hasNoSideTrdRegTSGroupCounter()
    {
        return hasNoSideTrdRegTSGroupCounter;
    }




    private SideTrdRegTSGroupIterator sideTrdRegTSGroupIterator = new SideTrdRegTSGroupIterator(this);
    public SideTrdRegTSGroupIterator sideTrdRegTSGroupIterator()
    {
        return sideTrdRegTSGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SidesGroup
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
                    next = new SidesGroupDecoder(trailer, messageFields);
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
            case Constants.SIDE:
                side = buffer.getChar(valueOffset);
                break;

            case Constants.SIDE_EXEC_ID:
                hasSideExecID = true;
                sideExecID = buffer.getChars(sideExecID, valueOffset, valueLength);
                sideExecIDOffset = valueOffset;
                sideExecIDLength = valueLength;
                break;

            case Constants.ORDER_DELAY:
                hasOrderDelay = true;
                orderDelay = getInt(buffer, valueOffset, endOfField, 1428, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_DELAY_UNIT:
                hasOrderDelayUnit = true;
                orderDelayUnit = getInt(buffer, valueOffset, endOfField, 1429, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_PARTY_IDS_GROUP_COUNTER:
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


            case Constants.ACCOUNT:
                hasAccount = true;
                account = buffer.getChars(account, valueOffset, valueLength);
                accountOffset = valueOffset;
                accountLength = valueLength;
                break;

            case Constants.ACCT_ID_SOURCE:
                hasAcctIDSource = true;
                acctIDSource = getInt(buffer, valueOffset, endOfField, 660, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ACCOUNT_TYPE:
                hasAccountType = true;
                accountType = getInt(buffer, valueOffset, endOfField, 581, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PROCESS_CODE:
                hasProcessCode = true;
                processCode = buffer.getChar(valueOffset);
                break;

            case Constants.ODD_LOT:
                hasOddLot = true;
                oddLot = buffer.getBoolean(valueOffset);
                break;

            case Constants.NO_CLEARING_INSTRUCTIONS_GROUP_COUNTER:
                hasNoClearingInstructionsGroupCounter = true;
                noClearingInstructionsGroupCounter = getInt(buffer, valueOffset, endOfField, 576, CODEC_VALIDATION_ENABLED);
                if (clearingInstructionsGroup == null)
                {
                    clearingInstructionsGroup = new ClearingInstructionsGroupDecoder(trailer, messageFields);
                }
                ClearingInstructionsGroupDecoder clearingInstructionsGroupCurrent = clearingInstructionsGroup;
                position = endOfField + 1;
                final int noClearingInstructionsGroupCounter = this.noClearingInstructionsGroupCounter;
                for (int i = 0; i < noClearingInstructionsGroupCounter && position < end; i++)
                {
                    if (clearingInstructionsGroupCurrent != null)
                    {
                        position += clearingInstructionsGroupCurrent.decode(buffer, position, end - position);
                        clearingInstructionsGroupCurrent = clearingInstructionsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (clearingInstructionsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.TRADE_INPUT_SOURCE:
                hasTradeInputSource = true;
                tradeInputSource = buffer.getChars(tradeInputSource, valueOffset, valueLength);
                tradeInputSourceOffset = valueOffset;
                tradeInputSourceLength = valueLength;
                break;

            case Constants.TRADE_INPUT_DEVICE:
                hasTradeInputDevice = true;
                tradeInputDevice = buffer.getChars(tradeInputDevice, valueOffset, valueLength);
                tradeInputDeviceOffset = valueOffset;
                tradeInputDeviceLength = valueLength;
                break;

            case Constants.COMPLIANCE_ID:
                hasComplianceID = true;
                complianceID = buffer.getChars(complianceID, valueOffset, valueLength);
                complianceIDOffset = valueOffset;
                complianceIDLength = valueLength;
                break;

            case Constants.SOLICITED_FLAG:
                hasSolicitedFlag = true;
                solicitedFlag = buffer.getBoolean(valueOffset);
                break;

            case Constants.CUST_ORDER_CAPACITY:
                hasCustOrderCapacity = true;
                custOrderCapacity = getInt(buffer, valueOffset, endOfField, 582, CODEC_VALIDATION_ENABLED);
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

            case Constants.TIME_BRACKET:
                hasTimeBracket = true;
                timeBracket = buffer.getChars(timeBracket, valueOffset, valueLength);
                timeBracketOffset = valueOffset;
                timeBracketLength = valueLength;
                break;

            case Constants.NET_GROSS_IND:
                hasNetGrossInd = true;
                netGrossInd = getInt(buffer, valueOffset, endOfField, 430, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE_CURRENCY:
                hasSideCurrency = true;
                sideCurrency = buffer.getChars(sideCurrency, valueOffset, valueLength);
                sideCurrencyOffset = valueOffset;
                sideCurrencyLength = valueLength;
                break;

            case Constants.SIDE_SETTL_CURRENCY:
                hasSideSettlCurrency = true;
                sideSettlCurrency = buffer.getChars(sideSettlCurrency, valueOffset, valueLength);
                sideSettlCurrencyOffset = valueOffset;
                sideSettlCurrencyLength = valueLength;
                break;

            case Constants.COMMISSION:
                hasCommission = true;
                commission = getFloat(buffer, commission, valueOffset, valueLength, 12, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.COMM_TYPE:
                hasCommType = true;
                commType = buffer.getChar(valueOffset);
                break;

            case Constants.COMM_CURRENCY:
                hasCommCurrency = true;
                commCurrency = buffer.getChars(commCurrency, valueOffset, valueLength);
                commCurrencyOffset = valueOffset;
                commCurrencyLength = valueLength;
                break;

            case Constants.FUND_RENEW_WAIV:
                hasFundRenewWaiv = true;
                fundRenewWaiv = buffer.getChar(valueOffset);
                break;


            case Constants.NUM_DAYS_INTEREST:
                hasNumDaysInterest = true;
                numDaysInterest = getInt(buffer, valueOffset, endOfField, 157, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EX_DATE:
                hasExDate = true;
                exDate = buffer.getBytes(exDate, valueOffset, valueLength);
                exDateOffset = valueOffset;
                exDateLength = valueLength;
                break;

            case Constants.ACCRUED_INTEREST_RATE:
                hasAccruedInterestRate = true;
                accruedInterestRate = getFloat(buffer, accruedInterestRate, valueOffset, valueLength, 158, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ACCRUED_INTEREST_AMT:
                hasAccruedInterestAmt = true;
                accruedInterestAmt = getFloat(buffer, accruedInterestAmt, valueOffset, valueLength, 159, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.INTEREST_AT_MATURITY:
                hasInterestAtMaturity = true;
                interestAtMaturity = getFloat(buffer, interestAtMaturity, valueOffset, valueLength, 738, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_ACCRUED_INTEREST_AMT:
                hasEndAccruedInterestAmt = true;
                endAccruedInterestAmt = getFloat(buffer, endAccruedInterestAmt, valueOffset, valueLength, 920, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.START_CASH:
                hasStartCash = true;
                startCash = getFloat(buffer, startCash, valueOffset, valueLength, 921, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.END_CASH:
                hasEndCash = true;
                endCash = getFloat(buffer, endCash, valueOffset, valueLength, 922, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CONCESSION:
                hasConcession = true;
                concession = getFloat(buffer, concession, valueOffset, valueLength, 238, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TOTAL_TAKEDOWN:
                hasTotalTakedown = true;
                totalTakedown = getFloat(buffer, totalTakedown, valueOffset, valueLength, 237, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NET_MONEY:
                hasNetMoney = true;
                netMoney = getFloat(buffer, netMoney, valueOffset, valueLength, 118, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURR_AMT:
                hasSettlCurrAmt = true;
                settlCurrAmt = getFloat(buffer, settlCurrAmt, valueOffset, valueLength, 119, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURR_FX_RATE:
                hasSettlCurrFxRate = true;
                settlCurrFxRate = getFloat(buffer, settlCurrFxRate, valueOffset, valueLength, 155, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURR_FX_RATE_CALC:
                hasSettlCurrFxRateCalc = true;
                settlCurrFxRateCalc = buffer.getChar(valueOffset);
                break;

            case Constants.POSITION_EFFECT:
                hasPositionEffect = true;
                positionEffect = buffer.getChar(valueOffset);
                break;

            case Constants.SIDE_MULTI_LEG_REPORTING_TYPE:
                hasSideMultiLegReportingType = true;
                sideMultiLegReportingType = getInt(buffer, valueOffset, endOfField, 752, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_CONT_AMTS_GROUP_COUNTER:
                hasNoContAmtsGroupCounter = true;
                noContAmtsGroupCounter = getInt(buffer, valueOffset, endOfField, 518, CODEC_VALIDATION_ENABLED);
                if (contAmtsGroup == null)
                {
                    contAmtsGroup = new ContAmtsGroupDecoder(trailer, messageFields);
                }
                ContAmtsGroupDecoder contAmtsGroupCurrent = contAmtsGroup;
                position = endOfField + 1;
                final int noContAmtsGroupCounter = this.noContAmtsGroupCounter;
                for (int i = 0; i < noContAmtsGroupCounter && position < end; i++)
                {
                    if (contAmtsGroupCurrent != null)
                    {
                        position += contAmtsGroupCurrent.decode(buffer, position, end - position);
                        contAmtsGroupCurrent = contAmtsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (contAmtsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_STIPULATIONS_GROUP_COUNTER:
                hasNoStipulationsGroupCounter = true;
                noStipulationsGroupCounter = getInt(buffer, valueOffset, endOfField, 232, CODEC_VALIDATION_ENABLED);
                if (stipulationsGroup == null)
                {
                    stipulationsGroup = new StipulationsGroupDecoder(trailer, messageFields);
                }
                StipulationsGroupDecoder stipulationsGroupCurrent = stipulationsGroup;
                position = endOfField + 1;
                final int noStipulationsGroupCounter = this.noStipulationsGroupCounter;
                for (int i = 0; i < noStipulationsGroupCounter && position < end; i++)
                {
                    if (stipulationsGroupCurrent != null)
                    {
                        position += stipulationsGroupCurrent.decode(buffer, position, end - position);
                        stipulationsGroupCurrent = stipulationsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (stipulationsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_MISC_FEES_GROUP_COUNTER:
                hasNoMiscFeesGroupCounter = true;
                noMiscFeesGroupCounter = getInt(buffer, valueOffset, endOfField, 136, CODEC_VALIDATION_ENABLED);
                if (miscFeesGroup == null)
                {
                    miscFeesGroup = new MiscFeesGroupDecoder(trailer, messageFields);
                }
                MiscFeesGroupDecoder miscFeesGroupCurrent = miscFeesGroup;
                position = endOfField + 1;
                final int noMiscFeesGroupCounter = this.noMiscFeesGroupCounter;
                for (int i = 0; i < noMiscFeesGroupCounter && position < end; i++)
                {
                    if (miscFeesGroupCurrent != null)
                    {
                        position += miscFeesGroupCurrent.decode(buffer, position, end - position);
                        miscFeesGroupCurrent = miscFeesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (miscFeesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.EXCHANGE_RULE:
                hasExchangeRule = true;
                exchangeRule = buffer.getChars(exchangeRule, valueOffset, valueLength);
                exchangeRuleOffset = valueOffset;
                exchangeRuleLength = valueLength;
                break;

            case Constants.NO_SETTL_DETAILS_GROUP_COUNTER:
                hasNoSettlDetailsGroupCounter = true;
                noSettlDetailsGroupCounter = getInt(buffer, valueOffset, endOfField, 1158, CODEC_VALIDATION_ENABLED);
                if (settlDetailsGroup == null)
                {
                    settlDetailsGroup = new SettlDetailsGroupDecoder(trailer, messageFields);
                }
                SettlDetailsGroupDecoder settlDetailsGroupCurrent = settlDetailsGroup;
                position = endOfField + 1;
                final int noSettlDetailsGroupCounter = this.noSettlDetailsGroupCounter;
                for (int i = 0; i < noSettlDetailsGroupCounter && position < end; i++)
                {
                    if (settlDetailsGroupCurrent != null)
                    {
                        position += settlDetailsGroupCurrent.decode(buffer, position, end - position);
                        settlDetailsGroupCurrent = settlDetailsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (settlDetailsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.TRADE_ALLOC_INDICATOR:
                hasTradeAllocIndicator = true;
                tradeAllocIndicator = getInt(buffer, valueOffset, endOfField, 826, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PREALLOC_METHOD:
                hasPreallocMethod = true;
                preallocMethod = buffer.getChar(valueOffset);
                break;

            case Constants.ALLOC_ID:
                hasAllocID = true;
                allocID = buffer.getChars(allocID, valueOffset, valueLength);
                allocIDOffset = valueOffset;
                allocIDLength = valueLength;
                break;

            case Constants.NO_ALLOCS_GROUP_COUNTER:
                hasNoAllocsGroupCounter = true;
                noAllocsGroupCounter = getInt(buffer, valueOffset, endOfField, 78, CODEC_VALIDATION_ENABLED);
                if (allocsGroup == null)
                {
                    allocsGroup = new AllocsGroupDecoder(trailer, messageFields);
                }
                AllocsGroupDecoder allocsGroupCurrent = allocsGroup;
                position = endOfField + 1;
                final int noAllocsGroupCounter = this.noAllocsGroupCounter;
                for (int i = 0; i < noAllocsGroupCounter && position < end; i++)
                {
                    if (allocsGroupCurrent != null)
                    {
                        position += allocsGroupCurrent.decode(buffer, position, end - position);
                        allocsGroupCurrent = allocsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (allocsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.SIDE_GROSS_TRADE_AMT:
                hasSideGrossTradeAmt = true;
                sideGrossTradeAmt = getFloat(buffer, sideGrossTradeAmt, valueOffset, valueLength, 1072, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.AGGRESSOR_INDICATOR:
                hasAggressorIndicator = true;
                aggressorIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.SIDE_LAST_QTY:
                hasSideLastQty = true;
                sideLastQty = getInt(buffer, valueOffset, endOfField, 1009, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE_TRADE_REPORT_ID:
                hasSideTradeReportID = true;
                sideTradeReportID = buffer.getChars(sideTradeReportID, valueOffset, valueLength);
                sideTradeReportIDOffset = valueOffset;
                sideTradeReportIDLength = valueLength;
                break;

            case Constants.SIDE_FILL_STATION_CD:
                hasSideFillStationCd = true;
                sideFillStationCd = buffer.getChars(sideFillStationCd, valueOffset, valueLength);
                sideFillStationCdOffset = valueOffset;
                sideFillStationCdLength = valueLength;
                break;

            case Constants.SIDE_REASON_CD:
                hasSideReasonCd = true;
                sideReasonCd = buffer.getChars(sideReasonCd, valueOffset, valueLength);
                sideReasonCdOffset = valueOffset;
                sideReasonCdLength = valueLength;
                break;

            case Constants.RPT_SEQ:
                hasRptSeq = true;
                rptSeq = getInt(buffer, valueOffset, endOfField, 83, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE_TRD_SUB_TYP:
                hasSideTrdSubTyp = true;
                sideTrdSubTyp = getInt(buffer, valueOffset, endOfField, 1008, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_CATEGORY:
                hasOrderCategory = true;
                orderCategory = buffer.getChar(valueOffset);
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

            case Constants.CL_ORD_ID:
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
                break;

            case Constants.SECONDARY_CL_ORD_ID:
                hasSecondaryClOrdID = true;
                secondaryClOrdID = buffer.getChars(secondaryClOrdID, valueOffset, valueLength);
                secondaryClOrdIDOffset = valueOffset;
                secondaryClOrdIDLength = valueLength;
                break;

            case Constants.LIST_ID:
                hasListID = true;
                listID = buffer.getChars(listID, valueOffset, valueLength);
                listIDOffset = valueOffset;
                listIDLength = valueLength;
                break;

            case Constants.REF_ORDER_ID:
                hasRefOrderID = true;
                refOrderID = buffer.getChars(refOrderID, valueOffset, valueLength);
                refOrderIDOffset = valueOffset;
                refOrderIDLength = valueLength;
                break;

            case Constants.REF_ORDER_ID_SOURCE:
                hasRefOrderIDSource = true;
                refOrderIDSource = buffer.getChar(valueOffset);
                break;

            case Constants.REF_ORD_ID_REASON:
                hasRefOrdIDReason = true;
                refOrdIDReason = getInt(buffer, valueOffset, endOfField, 1431, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORD_TYPE:
                hasOrdType = true;
                ordType = buffer.getChar(valueOffset);
                break;

            case Constants.PRICE:
                hasPrice = true;
                price = getFloat(buffer, price, valueOffset, valueLength, 44, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STOP_PX:
                hasStopPx = true;
                stopPx = getFloat(buffer, stopPx, valueOffset, valueLength, 99, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EXEC_INST:
                hasExecInst = true;
                execInst = buffer.getChars(execInst, valueOffset, valueLength);
                execInstOffset = valueOffset;
                execInstLength = valueLength;
                break;

            case Constants.ORD_STATUS:
                hasOrdStatus = true;
                ordStatus = buffer.getChar(valueOffset);
                break;

            case Constants.ORDER_QTY:
                hasOrderQty = true;
                orderQty = getFloat(buffer, orderQty, valueOffset, valueLength, 38, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CASH_ORDER_QTY:
                hasCashOrderQty = true;
                cashOrderQty = getFloat(buffer, cashOrderQty, valueOffset, valueLength, 152, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_PERCENT:
                hasOrderPercent = true;
                orderPercent = getFloat(buffer, orderPercent, valueOffset, valueLength, 516, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ROUNDING_DIRECTION:
                hasRoundingDirection = true;
                roundingDirection = buffer.getChar(valueOffset);
                break;

            case Constants.ROUNDING_MODULUS:
                hasRoundingModulus = true;
                roundingModulus = getFloat(buffer, roundingModulus, valueOffset, valueLength, 469, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.LEAVES_QTY:
                hasLeavesQty = true;
                leavesQty = getFloat(buffer, leavesQty, valueOffset, valueLength, 151, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CUM_QTY:
                hasCumQty = true;
                cumQty = getFloat(buffer, cumQty, valueOffset, valueLength, 14, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TIME_IN_FORCE:
                hasTimeInForce = true;
                timeInForce = buffer.getChar(valueOffset);
                break;

            case Constants.EXPIRE_TIME:
                hasExpireTime = true;
                expireTime = buffer.getBytes(expireTime, valueOffset, valueLength);
                expireTimeOffset = valueOffset;
                expireTimeLength = valueLength;
                break;

            case Constants.DISPLAY_QTY:
                hasDisplayQty = true;
                displayQty = getFloat(buffer, displayQty, valueOffset, valueLength, 1138, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECONDARY_DISPLAY_QTY:
                hasSecondaryDisplayQty = true;
                secondaryDisplayQty = getFloat(buffer, secondaryDisplayQty, valueOffset, valueLength, 1082, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_WHEN:
                hasDisplayWhen = true;
                displayWhen = buffer.getChar(valueOffset);
                break;

            case Constants.DISPLAY_METHOD:
                hasDisplayMethod = true;
                displayMethod = buffer.getChar(valueOffset);
                break;

            case Constants.DISPLAY_LOW_QTY:
                hasDisplayLowQty = true;
                displayLowQty = getFloat(buffer, displayLowQty, valueOffset, valueLength, 1085, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_HIGH_QTY:
                hasDisplayHighQty = true;
                displayHighQty = getFloat(buffer, displayHighQty, valueOffset, valueLength, 1086, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.DISPLAY_MIN_INCR:
                hasDisplayMinIncr = true;
                displayMinIncr = getFloat(buffer, displayMinIncr, valueOffset, valueLength, 1087, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REFRESH_QTY:
                hasRefreshQty = true;
                refreshQty = getFloat(buffer, refreshQty, valueOffset, valueLength, 1088, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.ORDER_CAPACITY:
                hasOrderCapacity = true;
                orderCapacity = buffer.getChar(valueOffset);
                break;

            case Constants.ORDER_RESTRICTIONS:
                hasOrderRestrictions = true;
                orderRestrictions = buffer.getChars(orderRestrictions, valueOffset, valueLength);
                orderRestrictionsOffset = valueOffset;
                orderRestrictionsLength = valueLength;
                break;

            case Constants.BOOKING_TYPE:
                hasBookingType = true;
                bookingType = getInt(buffer, valueOffset, endOfField, 775, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORIG_CUST_ORDER_CAPACITY:
                hasOrigCustOrderCapacity = true;
                origCustOrderCapacity = getInt(buffer, valueOffset, endOfField, 1432, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ORDER_INPUT_DEVICE:
                hasOrderInputDevice = true;
                orderInputDevice = buffer.getChars(orderInputDevice, valueOffset, valueLength);
                orderInputDeviceOffset = valueOffset;
                orderInputDeviceLength = valueLength;
                break;

            case Constants.LOT_TYPE:
                hasLotType = true;
                lotType = buffer.getChar(valueOffset);
                break;

            case Constants.TRANS_BKD_TIME:
                hasTransBkdTime = true;
                transBkdTime = buffer.getBytes(transBkdTime, valueOffset, valueLength);
                transBkdTimeOffset = valueOffset;
                transBkdTimeLength = valueLength;
                break;

            case Constants.ORIG_ORD_MOD_TIME:
                hasOrigOrdModTime = true;
                origOrdModTime = buffer.getBytes(origOrdModTime, valueOffset, valueLength);
                origOrdModTimeOffset = valueOffset;
                origOrdModTimeLength = valueLength;
                break;


            case Constants.NO_SIDE_TRD_REG_T_S_GROUP_COUNTER:
                hasNoSideTrdRegTSGroupCounter = true;
                noSideTrdRegTSGroupCounter = getInt(buffer, valueOffset, endOfField, 1016, CODEC_VALIDATION_ENABLED);
                if (sideTrdRegTSGroup == null)
                {
                    sideTrdRegTSGroup = new SideTrdRegTSGroupDecoder(trailer, messageFields);
                }
                SideTrdRegTSGroupDecoder sideTrdRegTSGroupCurrent = sideTrdRegTSGroup;
                position = endOfField + 1;
                final int noSideTrdRegTSGroupCounter = this.noSideTrdRegTSGroupCounter;
                for (int i = 0; i < noSideTrdRegTSGroupCounter && position < end; i++)
                {
                    if (sideTrdRegTSGroupCurrent != null)
                    {
                        position += sideTrdRegTSGroupCurrent.decode(buffer, position, end - position);
                        sideTrdRegTSGroupCurrent = sideTrdRegTSGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (sideTrdRegTSGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetSide();
        this.resetSideExecID();
        this.resetOrderDelay();
        this.resetOrderDelayUnit();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetAccountType();
        this.resetProcessCode();
        this.resetOddLot();
        this.resetTradeInputSource();
        this.resetTradeInputDevice();
        this.resetComplianceID();
        this.resetSolicitedFlag();
        this.resetCustOrderCapacity();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTimeBracket();
        this.resetNetGrossInd();
        this.resetSideCurrency();
        this.resetSideSettlCurrency();
        this.resetNumDaysInterest();
        this.resetExDate();
        this.resetAccruedInterestRate();
        this.resetAccruedInterestAmt();
        this.resetInterestAtMaturity();
        this.resetEndAccruedInterestAmt();
        this.resetStartCash();
        this.resetEndCash();
        this.resetConcession();
        this.resetTotalTakedown();
        this.resetNetMoney();
        this.resetSettlCurrAmt();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetPositionEffect();
        this.resetSideMultiLegReportingType();
        this.resetExchangeRule();
        this.resetTradeAllocIndicator();
        this.resetPreallocMethod();
        this.resetAllocID();
        this.resetSideGrossTradeAmt();
        this.resetAggressorIndicator();
        this.resetSideLastQty();
        this.resetSideTradeReportID();
        this.resetSideFillStationCd();
        this.resetSideReasonCd();
        this.resetRptSeq();
        this.resetSideTrdSubTyp();
        this.resetOrderCategory();
        this.resetPartyIDsGroup();
        this.resetClearingInstructionsGroup();
        this.resetCommission();
        this.resetCommType();
        this.resetCommCurrency();
        this.resetFundRenewWaiv();
        this.resetContAmtsGroup();
        this.resetStipulationsGroup();
        this.resetMiscFeesGroup();
        this.resetSettlDetailsGroup();
        this.resetAllocsGroup();
        this.resetOrderID();
        this.resetSecondaryOrderID();
        this.resetClOrdID();
        this.resetSecondaryClOrdID();
        this.resetListID();
        this.resetRefOrderID();
        this.resetRefOrderIDSource();
        this.resetRefOrdIDReason();
        this.resetOrdType();
        this.resetPrice();
        this.resetStopPx();
        this.resetExecInst();
        this.resetOrdStatus();
        this.resetLeavesQty();
        this.resetCumQty();
        this.resetTimeInForce();
        this.resetExpireTime();
        this.resetOrderCapacity();
        this.resetOrderRestrictions();
        this.resetBookingType();
        this.resetOrigCustOrderCapacity();
        this.resetOrderInputDevice();
        this.resetLotType();
        this.resetTransBkdTime();
        this.resetOrigOrdModTime();
        this.resetOrderQty();
        this.resetCashOrderQty();
        this.resetOrderPercent();
        this.resetRoundingDirection();
        this.resetRoundingModulus();
        this.resetDisplayQty();
        this.resetSecondaryDisplayQty();
        this.resetDisplayWhen();
        this.resetDisplayMethod();
        this.resetDisplayLowQty();
        this.resetDisplayHighQty();
        this.resetDisplayMinIncr();
        this.resetRefreshQty();
        this.resetSideTrdRegTSGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetSide()
    {
        side = MISSING_CHAR;
    }

    public void resetSideExecID()
    {
        hasSideExecID = false;
    }

    public void resetOrderDelay()
    {
        hasOrderDelay = false;
    }

    public void resetOrderDelayUnit()
    {
        hasOrderDelayUnit = false;
    }

    public void resetAccount()
    {
        hasAccount = false;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetAccountType()
    {
        hasAccountType = false;
    }

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetOddLot()
    {
        hasOddLot = false;
    }

    public void resetTradeInputSource()
    {
        hasTradeInputSource = false;
    }

    public void resetTradeInputDevice()
    {
        hasTradeInputDevice = false;
    }

    public void resetComplianceID()
    {
        hasComplianceID = false;
    }

    public void resetSolicitedFlag()
    {
        hasSolicitedFlag = false;
    }

    public void resetCustOrderCapacity()
    {
        hasCustOrderCapacity = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetTimeBracket()
    {
        hasTimeBracket = false;
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSideCurrency()
    {
        hasSideCurrency = false;
    }

    public void resetSideSettlCurrency()
    {
        hasSideSettlCurrency = false;
    }

    public void resetNumDaysInterest()
    {
        hasNumDaysInterest = false;
    }

    public void resetExDate()
    {
        hasExDate = false;
    }

    public void resetAccruedInterestRate()
    {
        hasAccruedInterestRate = false;
    }

    public void resetAccruedInterestAmt()
    {
        hasAccruedInterestAmt = false;
    }

    public void resetInterestAtMaturity()
    {
        hasInterestAtMaturity = false;
    }

    public void resetEndAccruedInterestAmt()
    {
        hasEndAccruedInterestAmt = false;
    }

    public void resetStartCash()
    {
        hasStartCash = false;
    }

    public void resetEndCash()
    {
        hasEndCash = false;
    }

    public void resetConcession()
    {
        hasConcession = false;
    }

    public void resetTotalTakedown()
    {
        hasTotalTakedown = false;
    }

    public void resetNetMoney()
    {
        hasNetMoney = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetPositionEffect()
    {
        hasPositionEffect = false;
    }

    public void resetSideMultiLegReportingType()
    {
        hasSideMultiLegReportingType = false;
    }

    public void resetExchangeRule()
    {
        hasExchangeRule = false;
    }

    public void resetTradeAllocIndicator()
    {
        hasTradeAllocIndicator = false;
    }

    public void resetPreallocMethod()
    {
        hasPreallocMethod = false;
    }

    public void resetAllocID()
    {
        hasAllocID = false;
    }

    public void resetSideGrossTradeAmt()
    {
        hasSideGrossTradeAmt = false;
    }

    public void resetAggressorIndicator()
    {
        hasAggressorIndicator = false;
    }

    public void resetSideLastQty()
    {
        hasSideLastQty = false;
    }

    public void resetSideTradeReportID()
    {
        hasSideTradeReportID = false;
    }

    public void resetSideFillStationCd()
    {
        hasSideFillStationCd = false;
    }

    public void resetSideReasonCd()
    {
        hasSideReasonCd = false;
    }

    public void resetRptSeq()
    {
        hasRptSeq = false;
    }

    public void resetSideTrdSubTyp()
    {
        hasSideTrdSubTyp = false;
    }

    public void resetOrderCategory()
    {
        hasOrderCategory = false;
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

    public void resetClearingInstructionsGroup()
    {
        for (final ClearingInstructionsGroupDecoder clearingInstructionsGroupDecoder : clearingInstructionsGroupIterator.iterator())
        {
            clearingInstructionsGroupDecoder.reset();
            if (clearingInstructionsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noClearingInstructionsGroupCounter = MISSING_INT;
        hasNoClearingInstructionsGroupCounter = false;
    }

    public void resetCommission()
    {
        hasCommission = false;
    }

    public void resetCommType()
    {
        hasCommType = false;
    }

    public void resetCommCurrency()
    {
        hasCommCurrency = false;
    }

    public void resetFundRenewWaiv()
    {
        hasFundRenewWaiv = false;
    }

    public void resetContAmtsGroup()
    {
        for (final ContAmtsGroupDecoder contAmtsGroupDecoder : contAmtsGroupIterator.iterator())
        {
            contAmtsGroupDecoder.reset();
            if (contAmtsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noContAmtsGroupCounter = MISSING_INT;
        hasNoContAmtsGroupCounter = false;
    }

    public void resetStipulationsGroup()
    {
        for (final StipulationsGroupDecoder stipulationsGroupDecoder : stipulationsGroupIterator.iterator())
        {
            stipulationsGroupDecoder.reset();
            if (stipulationsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noStipulationsGroupCounter = MISSING_INT;
        hasNoStipulationsGroupCounter = false;
    }

    public void resetMiscFeesGroup()
    {
        for (final MiscFeesGroupDecoder miscFeesGroupDecoder : miscFeesGroupIterator.iterator())
        {
            miscFeesGroupDecoder.reset();
            if (miscFeesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMiscFeesGroupCounter = MISSING_INT;
        hasNoMiscFeesGroupCounter = false;
    }

    public void resetSettlDetailsGroup()
    {
        for (final SettlDetailsGroupDecoder settlDetailsGroupDecoder : settlDetailsGroupIterator.iterator())
        {
            settlDetailsGroupDecoder.reset();
            if (settlDetailsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSettlDetailsGroupCounter = MISSING_INT;
        hasNoSettlDetailsGroupCounter = false;
    }

    public void resetAllocsGroup()
    {
        for (final AllocsGroupDecoder allocsGroupDecoder : allocsGroupIterator.iterator())
        {
            allocsGroupDecoder.reset();
            if (allocsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noAllocsGroupCounter = MISSING_INT;
        hasNoAllocsGroupCounter = false;
    }

    public void resetOrderID()
    {
        hasOrderID = false;
    }

    public void resetSecondaryOrderID()
    {
        hasSecondaryOrderID = false;
    }

    public void resetClOrdID()
    {
        hasClOrdID = false;
    }

    public void resetSecondaryClOrdID()
    {
        hasSecondaryClOrdID = false;
    }

    public void resetListID()
    {
        hasListID = false;
    }

    public void resetRefOrderID()
    {
        hasRefOrderID = false;
    }

    public void resetRefOrderIDSource()
    {
        hasRefOrderIDSource = false;
    }

    public void resetRefOrdIDReason()
    {
        hasRefOrdIDReason = false;
    }

    public void resetOrdType()
    {
        hasOrdType = false;
    }

    public void resetPrice()
    {
        hasPrice = false;
    }

    public void resetStopPx()
    {
        hasStopPx = false;
    }

    public void resetExecInst()
    {
        hasExecInst = false;
    }

    public void resetOrdStatus()
    {
        hasOrdStatus = false;
    }

    public void resetLeavesQty()
    {
        hasLeavesQty = false;
    }

    public void resetCumQty()
    {
        hasCumQty = false;
    }

    public void resetTimeInForce()
    {
        hasTimeInForce = false;
    }

    public void resetExpireTime()
    {
        hasExpireTime = false;
    }

    public void resetOrderCapacity()
    {
        hasOrderCapacity = false;
    }

    public void resetOrderRestrictions()
    {
        hasOrderRestrictions = false;
    }

    public void resetBookingType()
    {
        hasBookingType = false;
    }

    public void resetOrigCustOrderCapacity()
    {
        hasOrigCustOrderCapacity = false;
    }

    public void resetOrderInputDevice()
    {
        hasOrderInputDevice = false;
    }

    public void resetLotType()
    {
        hasLotType = false;
    }

    public void resetTransBkdTime()
    {
        hasTransBkdTime = false;
    }

    public void resetOrigOrdModTime()
    {
        hasOrigOrdModTime = false;
    }

    public void resetOrderQty()
    {
        hasOrderQty = false;
    }

    public void resetCashOrderQty()
    {
        hasCashOrderQty = false;
    }

    public void resetOrderPercent()
    {
        hasOrderPercent = false;
    }

    public void resetRoundingDirection()
    {
        hasRoundingDirection = false;
    }

    public void resetRoundingModulus()
    {
        hasRoundingModulus = false;
    }

    public void resetDisplayQty()
    {
        hasDisplayQty = false;
    }

    public void resetSecondaryDisplayQty()
    {
        hasSecondaryDisplayQty = false;
    }

    public void resetDisplayWhen()
    {
        hasDisplayWhen = false;
    }

    public void resetDisplayMethod()
    {
        hasDisplayMethod = false;
    }

    public void resetDisplayLowQty()
    {
        hasDisplayLowQty = false;
    }

    public void resetDisplayHighQty()
    {
        hasDisplayHighQty = false;
    }

    public void resetDisplayMinIncr()
    {
        hasDisplayMinIncr = false;
    }

    public void resetRefreshQty()
    {
        hasRefreshQty = false;
    }

    public void resetSideTrdRegTSGroup()
    {
        for (final SideTrdRegTSGroupDecoder sideTrdRegTSGroupDecoder : sideTrdRegTSGroupIterator.iterator())
        {
            sideTrdRegTSGroupDecoder.reset();
            if (sideTrdRegTSGroupDecoder.next() == null)
            {
                break;
            }
        }
        noSideTrdRegTSGroupCounter = MISSING_INT;
        hasNoSideTrdRegTSGroupCounter = false;
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
        builder.append("\"MessageName\": \"SidesGroup\",\n");
        indent(builder, level);
        builder.append("\"Side\": \"");
        builder.append(side);
        builder.append("\",\n");

        if (hasSideExecID())
        {
            indent(builder, level);
            builder.append("\"SideExecID\": \"");
            builder.append(this.sideExecID(), 0, sideExecIDLength());
            builder.append("\",\n");
        }

        if (hasOrderDelay())
        {
            indent(builder, level);
            builder.append("\"OrderDelay\": \"");
            builder.append(orderDelay);
            builder.append("\",\n");
        }

        if (hasOrderDelayUnit())
        {
            indent(builder, level);
            builder.append("\"OrderDelayUnit\": \"");
            builder.append(orderDelayUnit);
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
                partyIDsGroup.appendTo(builder, level + 1);
                if (partyIDsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                partyIDsGroup = partyIDsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            builder.append(this.account(), 0, accountLength());
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasAccountType())
        {
            indent(builder, level);
            builder.append("\"AccountType\": \"");
            builder.append(accountType);
            builder.append("\",\n");
        }

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasOddLot())
        {
            indent(builder, level);
            builder.append("\"OddLot\": \"");
            builder.append(oddLot);
            builder.append("\",\n");
        }

        if (hasNoClearingInstructionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ClearingInstructionsGroup\": [\n");
            ClearingInstructionsGroupDecoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            for (int i = 0, size = this.noClearingInstructionsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                clearingInstructionsGroup.appendTo(builder, level + 1);
                if (clearingInstructionsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                clearingInstructionsGroup = clearingInstructionsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTradeInputSource())
        {
            indent(builder, level);
            builder.append("\"TradeInputSource\": \"");
            builder.append(this.tradeInputSource(), 0, tradeInputSourceLength());
            builder.append("\",\n");
        }

        if (hasTradeInputDevice())
        {
            indent(builder, level);
            builder.append("\"TradeInputDevice\": \"");
            builder.append(this.tradeInputDevice(), 0, tradeInputDeviceLength());
            builder.append("\",\n");
        }

        if (hasComplianceID())
        {
            indent(builder, level);
            builder.append("\"ComplianceID\": \"");
            builder.append(this.complianceID(), 0, complianceIDLength());
            builder.append("\",\n");
        }

        if (hasSolicitedFlag())
        {
            indent(builder, level);
            builder.append("\"SolicitedFlag\": \"");
            builder.append(solicitedFlag);
            builder.append("\",\n");
        }

        if (hasCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"CustOrderCapacity\": \"");
            builder.append(custOrderCapacity);
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

        if (hasTimeBracket())
        {
            indent(builder, level);
            builder.append("\"TimeBracket\": \"");
            builder.append(this.timeBracket(), 0, timeBracketLength());
            builder.append("\",\n");
        }

        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSideCurrency())
        {
            indent(builder, level);
            builder.append("\"SideCurrency\": \"");
            builder.append(this.sideCurrency(), 0, sideCurrencyLength());
            builder.append("\",\n");
        }

        if (hasSideSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SideSettlCurrency\": \"");
            builder.append(this.sideSettlCurrency(), 0, sideSettlCurrencyLength());
            builder.append("\",\n");
        }

        if (hasCommission())
        {
            indent(builder, level);
            builder.append("\"Commission\": \"");
            commission.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCommType())
        {
            indent(builder, level);
            builder.append("\"CommType\": \"");
            builder.append(commType);
            builder.append("\",\n");
        }

        if (hasCommCurrency())
        {
            indent(builder, level);
            builder.append("\"CommCurrency\": \"");
            builder.append(this.commCurrency(), 0, commCurrencyLength());
            builder.append("\",\n");
        }

        if (hasFundRenewWaiv())
        {
            indent(builder, level);
            builder.append("\"FundRenewWaiv\": \"");
            builder.append(fundRenewWaiv);
            builder.append("\",\n");
        }

        if (hasNumDaysInterest())
        {
            indent(builder, level);
            builder.append("\"NumDaysInterest\": \"");
            builder.append(numDaysInterest);
            builder.append("\",\n");
        }

        if (hasExDate())
        {
            indent(builder, level);
            builder.append("\"ExDate\": \"");
            appendData(builder, exDate, exDateLength);
            builder.append("\",\n");
        }

        if (hasAccruedInterestRate())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestRate\": \"");
            accruedInterestRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AccruedInterestAmt\": \"");
            accruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"InterestAtMaturity\": \"");
            interestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"EndAccruedInterestAmt\": \"");
            endAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStartCash())
        {
            indent(builder, level);
            builder.append("\"StartCash\": \"");
            startCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEndCash())
        {
            indent(builder, level);
            builder.append("\"EndCash\": \"");
            endCash.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasConcession())
        {
            indent(builder, level);
            builder.append("\"Concession\": \"");
            concession.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTotalTakedown())
        {
            indent(builder, level);
            builder.append("\"TotalTakedown\": \"");
            totalTakedown.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasNetMoney())
        {
            indent(builder, level);
            builder.append("\"NetMoney\": \"");
            netMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRate())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRate\": \"");
            settlCurrFxRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrFxRateCalc())
        {
            indent(builder, level);
            builder.append("\"SettlCurrFxRateCalc\": \"");
            builder.append(settlCurrFxRateCalc);
            builder.append("\",\n");
        }

        if (hasPositionEffect())
        {
            indent(builder, level);
            builder.append("\"PositionEffect\": \"");
            builder.append(positionEffect);
            builder.append("\",\n");
        }

        if (hasSideMultiLegReportingType())
        {
            indent(builder, level);
            builder.append("\"SideMultiLegReportingType\": \"");
            builder.append(sideMultiLegReportingType);
            builder.append("\",\n");
        }

        if (hasNoContAmtsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"ContAmtsGroup\": [\n");
            ContAmtsGroupDecoder contAmtsGroup = this.contAmtsGroup;
            for (int i = 0, size = this.noContAmtsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                contAmtsGroup.appendTo(builder, level + 1);
                if (contAmtsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                contAmtsGroup = contAmtsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoStipulationsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"StipulationsGroup\": [\n");
            StipulationsGroupDecoder stipulationsGroup = this.stipulationsGroup;
            for (int i = 0, size = this.noStipulationsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                stipulationsGroup.appendTo(builder, level + 1);
                if (stipulationsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                stipulationsGroup = stipulationsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoMiscFeesGroupCounter)
        {
            indent(builder, level);
            builder.append("\"MiscFeesGroup\": [\n");
            MiscFeesGroupDecoder miscFeesGroup = this.miscFeesGroup;
            for (int i = 0, size = this.noMiscFeesGroupCounter; i < size; i++)
            {
                indent(builder, level);
                miscFeesGroup.appendTo(builder, level + 1);
                if (miscFeesGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                miscFeesGroup = miscFeesGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasExchangeRule())
        {
            indent(builder, level);
            builder.append("\"ExchangeRule\": \"");
            builder.append(this.exchangeRule(), 0, exchangeRuleLength());
            builder.append("\",\n");
        }

        if (hasNoSettlDetailsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SettlDetailsGroup\": [\n");
            SettlDetailsGroupDecoder settlDetailsGroup = this.settlDetailsGroup;
            for (int i = 0, size = this.noSettlDetailsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                settlDetailsGroup.appendTo(builder, level + 1);
                if (settlDetailsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                settlDetailsGroup = settlDetailsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasTradeAllocIndicator())
        {
            indent(builder, level);
            builder.append("\"TradeAllocIndicator\": \"");
            builder.append(tradeAllocIndicator);
            builder.append("\",\n");
        }

        if (hasPreallocMethod())
        {
            indent(builder, level);
            builder.append("\"PreallocMethod\": \"");
            builder.append(preallocMethod);
            builder.append("\",\n");
        }

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            builder.append(this.allocID(), 0, allocIDLength());
            builder.append("\",\n");
        }

        if (hasNoAllocsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"AllocsGroup\": [\n");
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            for (int i = 0, size = this.noAllocsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                allocsGroup.appendTo(builder, level + 1);
                if (allocsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                allocsGroup = allocsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasSideGrossTradeAmt())
        {
            indent(builder, level);
            builder.append("\"SideGrossTradeAmt\": \"");
            sideGrossTradeAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAggressorIndicator())
        {
            indent(builder, level);
            builder.append("\"AggressorIndicator\": \"");
            builder.append(aggressorIndicator);
            builder.append("\",\n");
        }

        if (hasSideLastQty())
        {
            indent(builder, level);
            builder.append("\"SideLastQty\": \"");
            builder.append(sideLastQty);
            builder.append("\",\n");
        }

        if (hasSideTradeReportID())
        {
            indent(builder, level);
            builder.append("\"SideTradeReportID\": \"");
            builder.append(this.sideTradeReportID(), 0, sideTradeReportIDLength());
            builder.append("\",\n");
        }

        if (hasSideFillStationCd())
        {
            indent(builder, level);
            builder.append("\"SideFillStationCd\": \"");
            builder.append(this.sideFillStationCd(), 0, sideFillStationCdLength());
            builder.append("\",\n");
        }

        if (hasSideReasonCd())
        {
            indent(builder, level);
            builder.append("\"SideReasonCd\": \"");
            builder.append(this.sideReasonCd(), 0, sideReasonCdLength());
            builder.append("\",\n");
        }

        if (hasRptSeq())
        {
            indent(builder, level);
            builder.append("\"RptSeq\": \"");
            builder.append(rptSeq);
            builder.append("\",\n");
        }

        if (hasSideTrdSubTyp())
        {
            indent(builder, level);
            builder.append("\"SideTrdSubTyp\": \"");
            builder.append(sideTrdSubTyp);
            builder.append("\",\n");
        }

        if (hasOrderCategory())
        {
            indent(builder, level);
            builder.append("\"OrderCategory\": \"");
            builder.append(orderCategory);
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

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

        if (hasSecondaryClOrdID())
        {
            indent(builder, level);
            builder.append("\"SecondaryClOrdID\": \"");
            builder.append(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
            builder.append("\",\n");
        }

        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            builder.append(this.listID(), 0, listIDLength());
            builder.append("\",\n");
        }

        if (hasRefOrderID())
        {
            indent(builder, level);
            builder.append("\"RefOrderID\": \"");
            builder.append(this.refOrderID(), 0, refOrderIDLength());
            builder.append("\",\n");
        }

        if (hasRefOrderIDSource())
        {
            indent(builder, level);
            builder.append("\"RefOrderIDSource\": \"");
            builder.append(refOrderIDSource);
            builder.append("\",\n");
        }

        if (hasRefOrdIDReason())
        {
            indent(builder, level);
            builder.append("\"RefOrdIDReason\": \"");
            builder.append(refOrdIDReason);
            builder.append("\",\n");
        }

        if (hasOrdType())
        {
            indent(builder, level);
            builder.append("\"OrdType\": \"");
            builder.append(ordType);
            builder.append("\",\n");
        }

        if (hasPrice())
        {
            indent(builder, level);
            builder.append("\"Price\": \"");
            price.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasStopPx())
        {
            indent(builder, level);
            builder.append("\"StopPx\": \"");
            stopPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExecInst())
        {
            indent(builder, level);
            builder.append("\"ExecInst\": \"");
            builder.append(this.execInst(), 0, execInstLength());
            builder.append("\",\n");
        }

        if (hasOrdStatus())
        {
            indent(builder, level);
            builder.append("\"OrdStatus\": \"");
            builder.append(ordStatus);
            builder.append("\",\n");
        }

        if (hasOrderQty())
        {
            indent(builder, level);
            builder.append("\"OrderQty\": \"");
            orderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCashOrderQty())
        {
            indent(builder, level);
            builder.append("\"CashOrderQty\": \"");
            cashOrderQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderPercent())
        {
            indent(builder, level);
            builder.append("\"OrderPercent\": \"");
            orderPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRoundingDirection())
        {
            indent(builder, level);
            builder.append("\"RoundingDirection\": \"");
            builder.append(roundingDirection);
            builder.append("\",\n");
        }

        if (hasRoundingModulus())
        {
            indent(builder, level);
            builder.append("\"RoundingModulus\": \"");
            roundingModulus.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLeavesQty())
        {
            indent(builder, level);
            builder.append("\"LeavesQty\": \"");
            leavesQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCumQty())
        {
            indent(builder, level);
            builder.append("\"CumQty\": \"");
            cumQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTimeInForce())
        {
            indent(builder, level);
            builder.append("\"TimeInForce\": \"");
            builder.append(timeInForce);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendData(builder, expireTime, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasDisplayQty())
        {
            indent(builder, level);
            builder.append("\"DisplayQty\": \"");
            displayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecondaryDisplayQty())
        {
            indent(builder, level);
            builder.append("\"SecondaryDisplayQty\": \"");
            secondaryDisplayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayWhen())
        {
            indent(builder, level);
            builder.append("\"DisplayWhen\": \"");
            builder.append(displayWhen);
            builder.append("\",\n");
        }

        if (hasDisplayMethod())
        {
            indent(builder, level);
            builder.append("\"DisplayMethod\": \"");
            builder.append(displayMethod);
            builder.append("\",\n");
        }

        if (hasDisplayLowQty())
        {
            indent(builder, level);
            builder.append("\"DisplayLowQty\": \"");
            displayLowQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayHighQty())
        {
            indent(builder, level);
            builder.append("\"DisplayHighQty\": \"");
            displayHighQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayMinIncr())
        {
            indent(builder, level);
            builder.append("\"DisplayMinIncr\": \"");
            displayMinIncr.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRefreshQty())
        {
            indent(builder, level);
            builder.append("\"RefreshQty\": \"");
            refreshQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrderCapacity\": \"");
            builder.append(orderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderRestrictions())
        {
            indent(builder, level);
            builder.append("\"OrderRestrictions\": \"");
            builder.append(this.orderRestrictions(), 0, orderRestrictionsLength());
            builder.append("\",\n");
        }

        if (hasBookingType())
        {
            indent(builder, level);
            builder.append("\"BookingType\": \"");
            builder.append(bookingType);
            builder.append("\",\n");
        }

        if (hasOrigCustOrderCapacity())
        {
            indent(builder, level);
            builder.append("\"OrigCustOrderCapacity\": \"");
            builder.append(origCustOrderCapacity);
            builder.append("\",\n");
        }

        if (hasOrderInputDevice())
        {
            indent(builder, level);
            builder.append("\"OrderInputDevice\": \"");
            builder.append(this.orderInputDevice(), 0, orderInputDeviceLength());
            builder.append("\",\n");
        }

        if (hasLotType())
        {
            indent(builder, level);
            builder.append("\"LotType\": \"");
            builder.append(lotType);
            builder.append("\",\n");
        }

        if (hasTransBkdTime())
        {
            indent(builder, level);
            builder.append("\"TransBkdTime\": \"");
            appendData(builder, transBkdTime, transBkdTimeLength);
            builder.append("\",\n");
        }

        if (hasOrigOrdModTime())
        {
            indent(builder, level);
            builder.append("\"OrigOrdModTime\": \"");
            appendData(builder, origOrdModTime, origOrdModTimeLength);
            builder.append("\",\n");
        }

        if (hasNoSideTrdRegTSGroupCounter)
        {
            indent(builder, level);
            builder.append("\"SideTrdRegTSGroup\": [\n");
            SideTrdRegTSGroupDecoder sideTrdRegTSGroup = this.sideTrdRegTSGroup;
            for (int i = 0, size = this.noSideTrdRegTSGroupCounter; i < size; i++)
            {
                indent(builder, level);
                sideTrdRegTSGroup.appendTo(builder, level + 1);
                if (sideTrdRegTSGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                sideTrdRegTSGroup = sideTrdRegTSGroup.next();            }
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
    public TrdCapRptAckSideGrpEncoder.SidesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TrdCapRptAckSideGrpEncoder.SidesGroupEncoder)encoder);
    }

    public TrdCapRptAckSideGrpEncoder.SidesGroupEncoder toEncoder(final TrdCapRptAckSideGrpEncoder.SidesGroupEncoder encoder)
    {
        encoder.reset();
        encoder.side(this.side());
        if (hasSideExecID())
        {
            encoder.sideExecID(this.sideExecID(), 0, sideExecIDLength());
        }

        if (hasOrderDelay())
        {
            encoder.orderDelay(this.orderDelay());
        }

        if (hasOrderDelayUnit())
        {
            encoder.orderDelayUnit(this.orderDelayUnit());
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


        if (hasAccount())
        {
            encoder.account(this.account(), 0, accountLength());
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasAccountType())
        {
            encoder.accountType(this.accountType());
        }

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasOddLot())
        {
            encoder.oddLot(this.oddLot());
        }


        final ClrInstGrpEncoder clrInstGrp = encoder.clrInstGrp();        if (hasNoClearingInstructionsGroupCounter)
        {
            final int size = this.noClearingInstructionsGroupCounter;
            ClearingInstructionsGroupDecoder clearingInstructionsGroup = this.clearingInstructionsGroup;
            ClearingInstructionsGroupEncoder clearingInstructionsGroupEncoder = clrInstGrp.clearingInstructionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (clearingInstructionsGroup != null)
                {
                    clearingInstructionsGroup.toEncoder(clearingInstructionsGroupEncoder);
                    clearingInstructionsGroup = clearingInstructionsGroup.next();
                    clearingInstructionsGroupEncoder = clearingInstructionsGroupEncoder.next();
                }
            }
        }


        if (hasTradeInputSource())
        {
            encoder.tradeInputSource(this.tradeInputSource(), 0, tradeInputSourceLength());
        }

        if (hasTradeInputDevice())
        {
            encoder.tradeInputDevice(this.tradeInputDevice(), 0, tradeInputDeviceLength());
        }

        if (hasComplianceID())
        {
            encoder.complianceID(this.complianceID(), 0, complianceIDLength());
        }

        if (hasSolicitedFlag())
        {
            encoder.solicitedFlag(this.solicitedFlag());
        }

        if (hasCustOrderCapacity())
        {
            encoder.custOrderCapacity(this.custOrderCapacity());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasTimeBracket())
        {
            encoder.timeBracket(this.timeBracket(), 0, timeBracketLength());
        }

        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSideCurrency())
        {
            encoder.sideCurrency(this.sideCurrency(), 0, sideCurrencyLength());
        }

        if (hasSideSettlCurrency())
        {
            encoder.sideSettlCurrency(this.sideSettlCurrency(), 0, sideSettlCurrencyLength());
        }


        final CommissionDataEncoder commissionData = encoder.commissionData();        if (hasCommission())
        {
            commissionData.commission(this.commission());
        }

        if (hasCommType())
        {
            commissionData.commType(this.commType());
        }

        if (hasCommCurrency())
        {
            commissionData.commCurrency(this.commCurrency(), 0, commCurrencyLength());
        }

        if (hasFundRenewWaiv())
        {
            commissionData.fundRenewWaiv(this.fundRenewWaiv());
        }


        if (hasNumDaysInterest())
        {
            encoder.numDaysInterest(this.numDaysInterest());
        }

        if (hasExDate())
        {
            encoder.exDateAsCopy(this.exDate(), 0, exDateLength());
        }

        if (hasAccruedInterestRate())
        {
            encoder.accruedInterestRate(this.accruedInterestRate());
        }

        if (hasAccruedInterestAmt())
        {
            encoder.accruedInterestAmt(this.accruedInterestAmt());
        }

        if (hasInterestAtMaturity())
        {
            encoder.interestAtMaturity(this.interestAtMaturity());
        }

        if (hasEndAccruedInterestAmt())
        {
            encoder.endAccruedInterestAmt(this.endAccruedInterestAmt());
        }

        if (hasStartCash())
        {
            encoder.startCash(this.startCash());
        }

        if (hasEndCash())
        {
            encoder.endCash(this.endCash());
        }

        if (hasConcession())
        {
            encoder.concession(this.concession());
        }

        if (hasTotalTakedown())
        {
            encoder.totalTakedown(this.totalTakedown());
        }

        if (hasNetMoney())
        {
            encoder.netMoney(this.netMoney());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasPositionEffect())
        {
            encoder.positionEffect(this.positionEffect());
        }

        if (hasSideMultiLegReportingType())
        {
            encoder.sideMultiLegReportingType(this.sideMultiLegReportingType());
        }


        final ContAmtGrpEncoder contAmtGrp = encoder.contAmtGrp();        if (hasNoContAmtsGroupCounter)
        {
            final int size = this.noContAmtsGroupCounter;
            ContAmtsGroupDecoder contAmtsGroup = this.contAmtsGroup;
            ContAmtsGroupEncoder contAmtsGroupEncoder = contAmtGrp.contAmtsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (contAmtsGroup != null)
                {
                    contAmtsGroup.toEncoder(contAmtsGroupEncoder);
                    contAmtsGroup = contAmtsGroup.next();
                    contAmtsGroupEncoder = contAmtsGroupEncoder.next();
                }
            }
        }



        final StipulationsEncoder stipulations = encoder.stipulations();        if (hasNoStipulationsGroupCounter)
        {
            final int size = this.noStipulationsGroupCounter;
            StipulationsGroupDecoder stipulationsGroup = this.stipulationsGroup;
            StipulationsGroupEncoder stipulationsGroupEncoder = stipulations.stipulationsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (stipulationsGroup != null)
                {
                    stipulationsGroup.toEncoder(stipulationsGroupEncoder);
                    stipulationsGroup = stipulationsGroup.next();
                    stipulationsGroupEncoder = stipulationsGroupEncoder.next();
                }
            }
        }



        final MiscFeesGrpEncoder miscFeesGrp = encoder.miscFeesGrp();        if (hasNoMiscFeesGroupCounter)
        {
            final int size = this.noMiscFeesGroupCounter;
            MiscFeesGroupDecoder miscFeesGroup = this.miscFeesGroup;
            MiscFeesGroupEncoder miscFeesGroupEncoder = miscFeesGrp.miscFeesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (miscFeesGroup != null)
                {
                    miscFeesGroup.toEncoder(miscFeesGroupEncoder);
                    miscFeesGroup = miscFeesGroup.next();
                    miscFeesGroupEncoder = miscFeesGroupEncoder.next();
                }
            }
        }


        if (hasExchangeRule())
        {
            encoder.exchangeRule(this.exchangeRule(), 0, exchangeRuleLength());
        }


        final SettlDetailsEncoder settlDetails = encoder.settlDetails();        if (hasNoSettlDetailsGroupCounter)
        {
            final int size = this.noSettlDetailsGroupCounter;
            SettlDetailsGroupDecoder settlDetailsGroup = this.settlDetailsGroup;
            SettlDetailsGroupEncoder settlDetailsGroupEncoder = settlDetails.settlDetailsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (settlDetailsGroup != null)
                {
                    settlDetailsGroup.toEncoder(settlDetailsGroupEncoder);
                    settlDetailsGroup = settlDetailsGroup.next();
                    settlDetailsGroupEncoder = settlDetailsGroupEncoder.next();
                }
            }
        }


        if (hasTradeAllocIndicator())
        {
            encoder.tradeAllocIndicator(this.tradeAllocIndicator());
        }

        if (hasPreallocMethod())
        {
            encoder.preallocMethod(this.preallocMethod());
        }

        if (hasAllocID())
        {
            encoder.allocID(this.allocID(), 0, allocIDLength());
        }


        final TrdAllocGrpEncoder trdAllocGrp = encoder.trdAllocGrp();        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = trdAllocGrp.allocsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (allocsGroup != null)
                {
                    allocsGroup.toEncoder(allocsGroupEncoder);
                    allocsGroup = allocsGroup.next();
                    allocsGroupEncoder = allocsGroupEncoder.next();
                }
            }
        }


        if (hasSideGrossTradeAmt())
        {
            encoder.sideGrossTradeAmt(this.sideGrossTradeAmt());
        }

        if (hasAggressorIndicator())
        {
            encoder.aggressorIndicator(this.aggressorIndicator());
        }

        if (hasSideLastQty())
        {
            encoder.sideLastQty(this.sideLastQty());
        }

        if (hasSideTradeReportID())
        {
            encoder.sideTradeReportID(this.sideTradeReportID(), 0, sideTradeReportIDLength());
        }

        if (hasSideFillStationCd())
        {
            encoder.sideFillStationCd(this.sideFillStationCd(), 0, sideFillStationCdLength());
        }

        if (hasSideReasonCd())
        {
            encoder.sideReasonCd(this.sideReasonCd(), 0, sideReasonCdLength());
        }

        if (hasRptSeq())
        {
            encoder.rptSeq(this.rptSeq());
        }

        if (hasSideTrdSubTyp())
        {
            encoder.sideTrdSubTyp(this.sideTrdSubTyp());
        }

        if (hasOrderCategory())
        {
            encoder.orderCategory(this.orderCategory());
        }


        final TradeReportOrderDetailEncoder tradeReportOrderDetail = encoder.tradeReportOrderDetail();        if (hasOrderID())
        {
            tradeReportOrderDetail.orderID(this.orderID(), 0, orderIDLength());
        }

        if (hasSecondaryOrderID())
        {
            tradeReportOrderDetail.secondaryOrderID(this.secondaryOrderID(), 0, secondaryOrderIDLength());
        }

        if (hasClOrdID())
        {
            tradeReportOrderDetail.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }

        if (hasSecondaryClOrdID())
        {
            tradeReportOrderDetail.secondaryClOrdID(this.secondaryClOrdID(), 0, secondaryClOrdIDLength());
        }

        if (hasListID())
        {
            tradeReportOrderDetail.listID(this.listID(), 0, listIDLength());
        }

        if (hasRefOrderID())
        {
            tradeReportOrderDetail.refOrderID(this.refOrderID(), 0, refOrderIDLength());
        }

        if (hasRefOrderIDSource())
        {
            tradeReportOrderDetail.refOrderIDSource(this.refOrderIDSource());
        }

        if (hasRefOrdIDReason())
        {
            tradeReportOrderDetail.refOrdIDReason(this.refOrdIDReason());
        }

        if (hasOrdType())
        {
            tradeReportOrderDetail.ordType(this.ordType());
        }

        if (hasPrice())
        {
            tradeReportOrderDetail.price(this.price());
        }

        if (hasStopPx())
        {
            tradeReportOrderDetail.stopPx(this.stopPx());
        }

        if (hasExecInst())
        {
            tradeReportOrderDetail.execInst(this.execInst(), 0, execInstLength());
        }

        if (hasOrdStatus())
        {
            tradeReportOrderDetail.ordStatus(this.ordStatus());
        }


        final OrderQtyDataEncoder orderQtyData = tradeReportOrderDetail.orderQtyData();        if (hasOrderQty())
        {
            orderQtyData.orderQty(this.orderQty());
        }

        if (hasCashOrderQty())
        {
            orderQtyData.cashOrderQty(this.cashOrderQty());
        }

        if (hasOrderPercent())
        {
            orderQtyData.orderPercent(this.orderPercent());
        }

        if (hasRoundingDirection())
        {
            orderQtyData.roundingDirection(this.roundingDirection());
        }

        if (hasRoundingModulus())
        {
            orderQtyData.roundingModulus(this.roundingModulus());
        }


        if (hasLeavesQty())
        {
            tradeReportOrderDetail.leavesQty(this.leavesQty());
        }

        if (hasCumQty())
        {
            tradeReportOrderDetail.cumQty(this.cumQty());
        }

        if (hasTimeInForce())
        {
            tradeReportOrderDetail.timeInForce(this.timeInForce());
        }

        if (hasExpireTime())
        {
            tradeReportOrderDetail.expireTimeAsCopy(this.expireTime(), 0, expireTimeLength());
        }


        final DisplayInstructionEncoder displayInstruction = tradeReportOrderDetail.displayInstruction();        if (hasDisplayQty())
        {
            displayInstruction.displayQty(this.displayQty());
        }

        if (hasSecondaryDisplayQty())
        {
            displayInstruction.secondaryDisplayQty(this.secondaryDisplayQty());
        }

        if (hasDisplayWhen())
        {
            displayInstruction.displayWhen(this.displayWhen());
        }

        if (hasDisplayMethod())
        {
            displayInstruction.displayMethod(this.displayMethod());
        }

        if (hasDisplayLowQty())
        {
            displayInstruction.displayLowQty(this.displayLowQty());
        }

        if (hasDisplayHighQty())
        {
            displayInstruction.displayHighQty(this.displayHighQty());
        }

        if (hasDisplayMinIncr())
        {
            displayInstruction.displayMinIncr(this.displayMinIncr());
        }

        if (hasRefreshQty())
        {
            displayInstruction.refreshQty(this.refreshQty());
        }


        if (hasOrderCapacity())
        {
            tradeReportOrderDetail.orderCapacity(this.orderCapacity());
        }

        if (hasOrderRestrictions())
        {
            tradeReportOrderDetail.orderRestrictions(this.orderRestrictions(), 0, orderRestrictionsLength());
        }

        if (hasBookingType())
        {
            tradeReportOrderDetail.bookingType(this.bookingType());
        }

        if (hasOrigCustOrderCapacity())
        {
            tradeReportOrderDetail.origCustOrderCapacity(this.origCustOrderCapacity());
        }

        if (hasOrderInputDevice())
        {
            tradeReportOrderDetail.orderInputDevice(this.orderInputDevice(), 0, orderInputDeviceLength());
        }

        if (hasLotType())
        {
            tradeReportOrderDetail.lotType(this.lotType());
        }

        if (hasTransBkdTime())
        {
            tradeReportOrderDetail.transBkdTimeAsCopy(this.transBkdTime(), 0, transBkdTimeLength());
        }

        if (hasOrigOrdModTime())
        {
            tradeReportOrderDetail.origOrdModTimeAsCopy(this.origOrdModTime(), 0, origOrdModTimeLength());
        }



        final SideTrdRegTSEncoder sideTrdRegTS = encoder.sideTrdRegTS();        if (hasNoSideTrdRegTSGroupCounter)
        {
            final int size = this.noSideTrdRegTSGroupCounter;
            SideTrdRegTSGroupDecoder sideTrdRegTSGroup = this.sideTrdRegTSGroup;
            SideTrdRegTSGroupEncoder sideTrdRegTSGroupEncoder = sideTrdRegTS.sideTrdRegTSGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (sideTrdRegTSGroup != null)
                {
                    sideTrdRegTSGroup.toEncoder(sideTrdRegTSGroupEncoder);
                    sideTrdRegTSGroup = sideTrdRegTSGroup.next();
                    sideTrdRegTSGroupEncoder = sideTrdRegTSGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class SidesGroupIterator implements Iterable<SidesGroupDecoder>, java.util.Iterator<SidesGroupDecoder>
    {
        private final TrdCapRptAckSideGrpDecoder parent;
        private int remainder;
        private SidesGroupDecoder current;

        public SidesGroupIterator(final TrdCapRptAckSideGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }

        public SidesGroupDecoder next()
        {
            remainder--;
            final SidesGroupDecoder value = current;
            current = current.next();
            return value;
        }

        public int numberFieldValue()
        {
            return parent.hasNoSidesGroupCounter() ? parent.noSidesGroupCounter() : 0;
        }

        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.sidesGroup();
        }

        public SidesGroupIterator iterator()
        {
            reset();
            return this;
        }

    }

    public SidesGroupIterator sidesGroupIterator();
    public int noSidesGroupCounter();
    public boolean hasNoSidesGroupCounter();
    public SidesGroupDecoder sidesGroup();

}
