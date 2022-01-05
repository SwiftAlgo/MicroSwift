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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TrdSessLstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TrdSessLstGrpEncoder.TradingSessionsGroupEncoder;
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

public interface TrdSessLstGrpDecoder 
{



public class TradingSessionsGroupDecoder extends CommonDecoderImpl implements TradingSessionRulesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.TRADING_SESSION_ID);
            REQUIRED_FIELDS.add(Constants.TRAD_SES_STATUS);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(44);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            GROUP_FIELDS.add(Constants.TRAD_SES_UPDATE_ACTION);
            GROUP_FIELDS.add(Constants.SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_DESC);
            GROUP_FIELDS.add(Constants.TRAD_SES_METHOD);
            GROUP_FIELDS.add(Constants.TRAD_SES_MODE);
            GROUP_FIELDS.add(Constants.UNSOLICITED_INDICATOR);
            GROUP_FIELDS.add(Constants.TRAD_SES_STATUS);
            GROUP_FIELDS.add(Constants.TRAD_SES_STATUS_REJ_REASON);
            GROUP_FIELDS.add(Constants.TRAD_SES_START_TIME);
            GROUP_FIELDS.add(Constants.TRAD_SES_OPEN_TIME);
            GROUP_FIELDS.add(Constants.TRAD_SES_PRE_CLOSE_TIME);
            GROUP_FIELDS.add(Constants.TRAD_SES_CLOSE_TIME);
            GROUP_FIELDS.add(Constants.TRAD_SES_END_TIME);
            GROUP_FIELDS.add(Constants.TOTAL_VOLUME_TRADED);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(44);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_UPDATE_ACTION);
            ALL_GROUP_FIELDS.add(Constants.SECURITY_EXCHANGE);
            ALL_GROUP_FIELDS.add(Constants.MARKET_ID);
            ALL_GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_DESC);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_METHOD);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_MODE);
            ALL_GROUP_FIELDS.add(Constants.UNSOLICITED_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_STATUS);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_STATUS_REJ_REASON);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_START_TIME);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_OPEN_TIME);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_PRE_CLOSE_TIME);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_CLOSE_TIME);
            ALL_GROUP_FIELDS.add(Constants.TRAD_SES_END_TIME);
            ALL_GROUP_FIELDS.add(Constants.TOTAL_VOLUME_TRADED);
            ALL_GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            ALL_GROUP_FIELDS.add(Constants.TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

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
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
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

        if (hasTradSesMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesMethod.isValid(tradSesMethod()))
        {
            invalidTagId = 338;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradSesMode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesMode.isValid(tradSesMode()))
        {
            invalidTagId = 339;
            rejectReason = 5;
            return false;
        }
        }


        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesStatus.isValid(tradSesStatus()))
        {
            invalidTagId = 340;
            rejectReason = 5;
            return false;
        }

        if (hasTradSesStatusRejReason)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradSesStatusRejReason.isValid(tradSesStatusRejReason()))
        {
            invalidTagId = 567;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoOrdTypeRulesGroupCounter)
        {
            {
                int count = 0;
                final OrdTypeRulesGroupIterator iterator = ordTypeRulesGroupIterator.iterator();
                for (final OrdTypeRulesGroupDecoder group : iterator)
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
                    invalidTagId = 1237;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoTimeInForceRulesGroupCounter)
        {
            {
                int count = 0;
                final TimeInForceRulesGroupIterator iterator = timeInForceRulesGroupIterator.iterator();
                for (final TimeInForceRulesGroupDecoder group : iterator)
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
                    invalidTagId = 1239;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoExecInstRulesGroupCounter)
        {
            {
                int count = 0;
                final ExecInstRulesGroupIterator iterator = execInstRulesGroupIterator.iterator();
                for (final ExecInstRulesGroupDecoder group : iterator)
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
                    invalidTagId = 1232;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoMatchRulesGroupCounter)
        {
            {
                int count = 0;
                final MatchRulesGroupIterator iterator = matchRulesGroupIterator.iterator();
                for (final MatchRulesGroupDecoder group : iterator)
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
                    invalidTagId = 1235;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoMDFeedTypesGroupCounter)
        {
            {
                int count = 0;
                final MDFeedTypesGroupIterator iterator = mDFeedTypesGroupIterator.iterator();
                for (final MDFeedTypesGroupDecoder group : iterator)
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
                    invalidTagId = 1141;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public TradingSessionsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TradingSessionsGroupDecoder next = null;

    public TradingSessionsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(46);

    private char[] tradingSessionID = new char[1];

    public char[] tradingSessionID()
    {
        return tradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return new String(tradingSessionID, 0, tradingSessionIDLength);
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
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

    private char tradSesUpdateAction = MISSING_CHAR;

    private boolean hasTradSesUpdateAction;

    public char tradSesUpdateAction()
    {
        if (!hasTradSesUpdateAction)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesUpdateAction");
        }

        return tradSesUpdateAction;
    }

    public boolean hasTradSesUpdateAction()
    {
        return hasTradSesUpdateAction;
    }



    private char[] securityExchange = new char[1];

    private boolean hasSecurityExchange;

    public char[] securityExchange()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchange;
    }

    public boolean hasSecurityExchange()
    {
        return hasSecurityExchange;
    }


    private int securityExchangeOffset;

    private int securityExchangeLength;

    public int securityExchangeLength()
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        return securityExchangeLength;
    }

    public String securityExchangeAsString()
    {
        return hasSecurityExchange ? new String(securityExchange, 0, securityExchangeLength) : null;
    }

    public void securityExchange(final AsciiSequenceView view)
    {
        if (!hasSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityExchange");
        }

        view.wrap(buffer, securityExchangeOffset, securityExchangeLength);
    }


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


    private char[] tradingSessionDesc = new char[1];

    private boolean hasTradingSessionDesc;

    public char[] tradingSessionDesc()
    {
        if (!hasTradingSessionDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionDesc");
        }

        return tradingSessionDesc;
    }

    public boolean hasTradingSessionDesc()
    {
        return hasTradingSessionDesc;
    }


    private int tradingSessionDescOffset;

    private int tradingSessionDescLength;

    public int tradingSessionDescLength()
    {
        if (!hasTradingSessionDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionDesc");
        }

        return tradingSessionDescLength;
    }

    public String tradingSessionDescAsString()
    {
        return hasTradingSessionDesc ? new String(tradingSessionDesc, 0, tradingSessionDescLength) : null;
    }

    public void tradingSessionDesc(final AsciiSequenceView view)
    {
        if (!hasTradingSessionDesc)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionDesc");
        }

        view.wrap(buffer, tradingSessionDescOffset, tradingSessionDescLength);
    }


    private int tradSesMethod = MISSING_INT;

    private boolean hasTradSesMethod;

    public int tradSesMethod()
    {
        if (!hasTradSesMethod)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesMethod");
        }

        return tradSesMethod;
    }

    public boolean hasTradSesMethod()
    {
        return hasTradSesMethod;
    }



    private final CharArrayWrapper tradSesMethodWrapper = new CharArrayWrapper();
    public TradSesMethod tradSesMethodAsEnum()
    {
        if (!hasTradSesMethod)
 return TradSesMethod.NULL_VAL;
        return TradSesMethod.decode(tradSesMethod);
    }

    private int tradSesMode = MISSING_INT;

    private boolean hasTradSesMode;

    public int tradSesMode()
    {
        if (!hasTradSesMode)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesMode");
        }

        return tradSesMode;
    }

    public boolean hasTradSesMode()
    {
        return hasTradSesMode;
    }



    private final CharArrayWrapper tradSesModeWrapper = new CharArrayWrapper();
    public TradSesMode tradSesModeAsEnum()
    {
        if (!hasTradSesMode)
 return TradSesMode.NULL_VAL;
        return TradSesMode.decode(tradSesMode);
    }

    private boolean unsolicitedIndicator;

    private boolean hasUnsolicitedIndicator;

    public boolean unsolicitedIndicator()
    {
        if (!hasUnsolicitedIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: UnsolicitedIndicator");
        }

        return unsolicitedIndicator;
    }

    public boolean hasUnsolicitedIndicator()
    {
        return hasUnsolicitedIndicator;
    }



    private int tradSesStatus = MISSING_INT;

    public int tradSesStatus()
    {
        return tradSesStatus;
    }



    private final CharArrayWrapper tradSesStatusWrapper = new CharArrayWrapper();
    public TradSesStatus tradSesStatusAsEnum()
    {
        return TradSesStatus.decode(tradSesStatus);
    }

    private int tradSesStatusRejReason = MISSING_INT;

    private boolean hasTradSesStatusRejReason;

    public int tradSesStatusRejReason()
    {
        if (!hasTradSesStatusRejReason)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStatusRejReason");
        }

        return tradSesStatusRejReason;
    }

    public boolean hasTradSesStatusRejReason()
    {
        return hasTradSesStatusRejReason;
    }



    private final CharArrayWrapper tradSesStatusRejReasonWrapper = new CharArrayWrapper();
    public TradSesStatusRejReason tradSesStatusRejReasonAsEnum()
    {
        if (!hasTradSesStatusRejReason)
 return TradSesStatusRejReason.NULL_VAL;
        return TradSesStatusRejReason.decode(tradSesStatusRejReason);
    }

    private byte[] tradSesStartTime = new byte[24];

    private boolean hasTradSesStartTime;

    public byte[] tradSesStartTime()
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        return tradSesStartTime;
    }

    public boolean hasTradSesStartTime()
    {
        return hasTradSesStartTime;
    }


    private int tradSesStartTimeOffset;

    private int tradSesStartTimeLength;

    public int tradSesStartTimeLength()
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        return tradSesStartTimeLength;
    }

    public String tradSesStartTimeAsString()
    {
        return hasTradSesStartTime ? new String(tradSesStartTime, 0, tradSesStartTimeLength) : null;
    }

    public void tradSesStartTime(final AsciiSequenceView view)
    {
        if (!hasTradSesStartTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesStartTime");
        }

        view.wrap(buffer, tradSesStartTimeOffset, tradSesStartTimeLength);
    }


    private byte[] tradSesOpenTime = new byte[24];

    private boolean hasTradSesOpenTime;

    public byte[] tradSesOpenTime()
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        return tradSesOpenTime;
    }

    public boolean hasTradSesOpenTime()
    {
        return hasTradSesOpenTime;
    }


    private int tradSesOpenTimeOffset;

    private int tradSesOpenTimeLength;

    public int tradSesOpenTimeLength()
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        return tradSesOpenTimeLength;
    }

    public String tradSesOpenTimeAsString()
    {
        return hasTradSesOpenTime ? new String(tradSesOpenTime, 0, tradSesOpenTimeLength) : null;
    }

    public void tradSesOpenTime(final AsciiSequenceView view)
    {
        if (!hasTradSesOpenTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesOpenTime");
        }

        view.wrap(buffer, tradSesOpenTimeOffset, tradSesOpenTimeLength);
    }


    private byte[] tradSesPreCloseTime = new byte[24];

    private boolean hasTradSesPreCloseTime;

    public byte[] tradSesPreCloseTime()
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        return tradSesPreCloseTime;
    }

    public boolean hasTradSesPreCloseTime()
    {
        return hasTradSesPreCloseTime;
    }


    private int tradSesPreCloseTimeOffset;

    private int tradSesPreCloseTimeLength;

    public int tradSesPreCloseTimeLength()
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        return tradSesPreCloseTimeLength;
    }

    public String tradSesPreCloseTimeAsString()
    {
        return hasTradSesPreCloseTime ? new String(tradSesPreCloseTime, 0, tradSesPreCloseTimeLength) : null;
    }

    public void tradSesPreCloseTime(final AsciiSequenceView view)
    {
        if (!hasTradSesPreCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesPreCloseTime");
        }

        view.wrap(buffer, tradSesPreCloseTimeOffset, tradSesPreCloseTimeLength);
    }


    private byte[] tradSesCloseTime = new byte[24];

    private boolean hasTradSesCloseTime;

    public byte[] tradSesCloseTime()
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        return tradSesCloseTime;
    }

    public boolean hasTradSesCloseTime()
    {
        return hasTradSesCloseTime;
    }


    private int tradSesCloseTimeOffset;

    private int tradSesCloseTimeLength;

    public int tradSesCloseTimeLength()
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        return tradSesCloseTimeLength;
    }

    public String tradSesCloseTimeAsString()
    {
        return hasTradSesCloseTime ? new String(tradSesCloseTime, 0, tradSesCloseTimeLength) : null;
    }

    public void tradSesCloseTime(final AsciiSequenceView view)
    {
        if (!hasTradSesCloseTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesCloseTime");
        }

        view.wrap(buffer, tradSesCloseTimeOffset, tradSesCloseTimeLength);
    }


    private byte[] tradSesEndTime = new byte[24];

    private boolean hasTradSesEndTime;

    public byte[] tradSesEndTime()
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        return tradSesEndTime;
    }

    public boolean hasTradSesEndTime()
    {
        return hasTradSesEndTime;
    }


    private int tradSesEndTimeOffset;

    private int tradSesEndTimeLength;

    public int tradSesEndTimeLength()
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        return tradSesEndTimeLength;
    }

    public String tradSesEndTimeAsString()
    {
        return hasTradSesEndTime ? new String(tradSesEndTime, 0, tradSesEndTimeLength) : null;
    }

    public void tradSesEndTime(final AsciiSequenceView view)
    {
        if (!hasTradSesEndTime)
        {
            throw new IllegalArgumentException("No value for optional field: TradSesEndTime");
        }

        view.wrap(buffer, tradSesEndTimeOffset, tradSesEndTimeLength);
    }


    private DecimalFloat totalVolumeTraded = DecimalFloat.newNaNValue();

    private boolean hasTotalVolumeTraded;

    public DecimalFloat totalVolumeTraded()
    {
        if (!hasTotalVolumeTraded)
        {
            throw new IllegalArgumentException("No value for optional field: TotalVolumeTraded");
        }

        return totalVolumeTraded;
    }

    public boolean hasTotalVolumeTraded()
    {
        return hasTotalVolumeTraded;
    }






    private OrdTypeRulesGroupDecoder ordTypeRulesGroup = null;
    public OrdTypeRulesGroupDecoder ordTypeRulesGroup()
    {
        return ordTypeRulesGroup;
    }

    private int noOrdTypeRulesGroupCounter = MISSING_INT;

    private boolean hasNoOrdTypeRulesGroupCounter;

    public int noOrdTypeRulesGroupCounter()
    {
        if (!hasNoOrdTypeRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoOrdTypeRulesGroupCounter");
        }

        return noOrdTypeRulesGroupCounter;
    }

    public boolean hasNoOrdTypeRulesGroupCounter()
    {
        return hasNoOrdTypeRulesGroupCounter;
    }




    private OrdTypeRulesGroupIterator ordTypeRulesGroupIterator = new OrdTypeRulesGroupIterator(this);
    public OrdTypeRulesGroupIterator ordTypeRulesGroupIterator()
    {
        return ordTypeRulesGroupIterator.iterator();
    }




    private TimeInForceRulesGroupDecoder timeInForceRulesGroup = null;
    public TimeInForceRulesGroupDecoder timeInForceRulesGroup()
    {
        return timeInForceRulesGroup;
    }

    private int noTimeInForceRulesGroupCounter = MISSING_INT;

    private boolean hasNoTimeInForceRulesGroupCounter;

    public int noTimeInForceRulesGroupCounter()
    {
        if (!hasNoTimeInForceRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTimeInForceRulesGroupCounter");
        }

        return noTimeInForceRulesGroupCounter;
    }

    public boolean hasNoTimeInForceRulesGroupCounter()
    {
        return hasNoTimeInForceRulesGroupCounter;
    }




    private TimeInForceRulesGroupIterator timeInForceRulesGroupIterator = new TimeInForceRulesGroupIterator(this);
    public TimeInForceRulesGroupIterator timeInForceRulesGroupIterator()
    {
        return timeInForceRulesGroupIterator.iterator();
    }




    private ExecInstRulesGroupDecoder execInstRulesGroup = null;
    public ExecInstRulesGroupDecoder execInstRulesGroup()
    {
        return execInstRulesGroup;
    }

    private int noExecInstRulesGroupCounter = MISSING_INT;

    private boolean hasNoExecInstRulesGroupCounter;

    public int noExecInstRulesGroupCounter()
    {
        if (!hasNoExecInstRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoExecInstRulesGroupCounter");
        }

        return noExecInstRulesGroupCounter;
    }

    public boolean hasNoExecInstRulesGroupCounter()
    {
        return hasNoExecInstRulesGroupCounter;
    }




    private ExecInstRulesGroupIterator execInstRulesGroupIterator = new ExecInstRulesGroupIterator(this);
    public ExecInstRulesGroupIterator execInstRulesGroupIterator()
    {
        return execInstRulesGroupIterator.iterator();
    }




    private MatchRulesGroupDecoder matchRulesGroup = null;
    public MatchRulesGroupDecoder matchRulesGroup()
    {
        return matchRulesGroup;
    }

    private int noMatchRulesGroupCounter = MISSING_INT;

    private boolean hasNoMatchRulesGroupCounter;

    public int noMatchRulesGroupCounter()
    {
        if (!hasNoMatchRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMatchRulesGroupCounter");
        }

        return noMatchRulesGroupCounter;
    }

    public boolean hasNoMatchRulesGroupCounter()
    {
        return hasNoMatchRulesGroupCounter;
    }




    private MatchRulesGroupIterator matchRulesGroupIterator = new MatchRulesGroupIterator(this);
    public MatchRulesGroupIterator matchRulesGroupIterator()
    {
        return matchRulesGroupIterator.iterator();
    }




    private MDFeedTypesGroupDecoder mDFeedTypesGroup = null;
    public MDFeedTypesGroupDecoder mDFeedTypesGroup()
    {
        return mDFeedTypesGroup;
    }

    private int noMDFeedTypesGroupCounter = MISSING_INT;

    private boolean hasNoMDFeedTypesGroupCounter;

    public int noMDFeedTypesGroupCounter()
    {
        if (!hasNoMDFeedTypesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMDFeedTypesGroupCounter");
        }

        return noMDFeedTypesGroupCounter;
    }

    public boolean hasNoMDFeedTypesGroupCounter()
    {
        return hasNoMDFeedTypesGroupCounter;
    }




    private MDFeedTypesGroupIterator mDFeedTypesGroupIterator = new MDFeedTypesGroupIterator(this);
    public MDFeedTypesGroupIterator mDFeedTypesGroupIterator()
    {
        return mDFeedTypesGroupIterator.iterator();
    }



    private byte[] transactTime = new byte[24];

    private boolean hasTransactTime;

    public byte[] transactTime()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTime;
    }

    public boolean hasTransactTime()
    {
        return hasTransactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return hasTransactTime ? new String(transactTime, 0, transactTimeLength) : null;
    }

    public void transactTime(final AsciiSequenceView view)
    {
        if (!hasTransactTime)
        {
            throw new IllegalArgumentException("No value for optional field: TransactTime");
        }

        view.wrap(buffer, transactTimeOffset, transactTimeLength);
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



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionsGroup
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
                    next = new TradingSessionsGroupDecoder(trailer, messageFields);
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
            case Constants.TRADING_SESSION_ID:
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

            case Constants.TRAD_SES_UPDATE_ACTION:
                hasTradSesUpdateAction = true;
                tradSesUpdateAction = buffer.getChar(valueOffset);
                break;

            case Constants.SECURITY_EXCHANGE:
                hasSecurityExchange = true;
                securityExchange = buffer.getChars(securityExchange, valueOffset, valueLength);
                securityExchangeOffset = valueOffset;
                securityExchangeLength = valueLength;
                break;

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

            case Constants.TRADING_SESSION_DESC:
                hasTradingSessionDesc = true;
                tradingSessionDesc = buffer.getChars(tradingSessionDesc, valueOffset, valueLength);
                tradingSessionDescOffset = valueOffset;
                tradingSessionDescLength = valueLength;
                break;

            case Constants.TRAD_SES_METHOD:
                hasTradSesMethod = true;
                tradSesMethod = getInt(buffer, valueOffset, endOfField, 338, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_MODE:
                hasTradSesMode = true;
                tradSesMode = getInt(buffer, valueOffset, endOfField, 339, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNSOLICITED_INDICATOR:
                hasUnsolicitedIndicator = true;
                unsolicitedIndicator = buffer.getBoolean(valueOffset);
                break;

            case Constants.TRAD_SES_STATUS:
                tradSesStatus = getInt(buffer, valueOffset, endOfField, 340, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_STATUS_REJ_REASON:
                hasTradSesStatusRejReason = true;
                tradSesStatusRejReason = getInt(buffer, valueOffset, endOfField, 567, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRAD_SES_START_TIME:
                hasTradSesStartTime = true;
                tradSesStartTime = buffer.getBytes(tradSesStartTime, valueOffset, valueLength);
                tradSesStartTimeOffset = valueOffset;
                tradSesStartTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_OPEN_TIME:
                hasTradSesOpenTime = true;
                tradSesOpenTime = buffer.getBytes(tradSesOpenTime, valueOffset, valueLength);
                tradSesOpenTimeOffset = valueOffset;
                tradSesOpenTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_PRE_CLOSE_TIME:
                hasTradSesPreCloseTime = true;
                tradSesPreCloseTime = buffer.getBytes(tradSesPreCloseTime, valueOffset, valueLength);
                tradSesPreCloseTimeOffset = valueOffset;
                tradSesPreCloseTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_CLOSE_TIME:
                hasTradSesCloseTime = true;
                tradSesCloseTime = buffer.getBytes(tradSesCloseTime, valueOffset, valueLength);
                tradSesCloseTimeOffset = valueOffset;
                tradSesCloseTimeLength = valueLength;
                break;

            case Constants.TRAD_SES_END_TIME:
                hasTradSesEndTime = true;
                tradSesEndTime = buffer.getBytes(tradSesEndTime, valueOffset, valueLength);
                tradSesEndTimeOffset = valueOffset;
                tradSesEndTimeLength = valueLength;
                break;

            case Constants.TOTAL_VOLUME_TRADED:
                hasTotalVolumeTraded = true;
                totalVolumeTraded = getFloat(buffer, totalVolumeTraded, valueOffset, valueLength, 387, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_ORD_TYPE_RULES:
                hasNoOrdTypeRulesGroupCounter = true;
                noOrdTypeRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1237, CODEC_VALIDATION_ENABLED);
                if (ordTypeRulesGroup == null)
                {
                    ordTypeRulesGroup = new OrdTypeRulesGroupDecoder(trailer, messageFields);
                }
                OrdTypeRulesGroupDecoder ordTypeRulesGroupCurrent = ordTypeRulesGroup;
                position = endOfField + 1;
                final int noOrdTypeRulesGroupCounter = this.noOrdTypeRulesGroupCounter;
                for (int i = 0; i < noOrdTypeRulesGroupCounter && position < end; i++)
                {
                    if (ordTypeRulesGroupCurrent != null)
                    {
                        position += ordTypeRulesGroupCurrent.decode(buffer, position, end - position);
                        ordTypeRulesGroupCurrent = ordTypeRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (ordTypeRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_TIME_IN_FORCE_RULES:
                hasNoTimeInForceRulesGroupCounter = true;
                noTimeInForceRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1239, CODEC_VALIDATION_ENABLED);
                if (timeInForceRulesGroup == null)
                {
                    timeInForceRulesGroup = new TimeInForceRulesGroupDecoder(trailer, messageFields);
                }
                TimeInForceRulesGroupDecoder timeInForceRulesGroupCurrent = timeInForceRulesGroup;
                position = endOfField + 1;
                final int noTimeInForceRulesGroupCounter = this.noTimeInForceRulesGroupCounter;
                for (int i = 0; i < noTimeInForceRulesGroupCounter && position < end; i++)
                {
                    if (timeInForceRulesGroupCurrent != null)
                    {
                        position += timeInForceRulesGroupCurrent.decode(buffer, position, end - position);
                        timeInForceRulesGroupCurrent = timeInForceRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (timeInForceRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_EXEC_INST_RULES:
                hasNoExecInstRulesGroupCounter = true;
                noExecInstRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1232, CODEC_VALIDATION_ENABLED);
                if (execInstRulesGroup == null)
                {
                    execInstRulesGroup = new ExecInstRulesGroupDecoder(trailer, messageFields);
                }
                ExecInstRulesGroupDecoder execInstRulesGroupCurrent = execInstRulesGroup;
                position = endOfField + 1;
                final int noExecInstRulesGroupCounter = this.noExecInstRulesGroupCounter;
                for (int i = 0; i < noExecInstRulesGroupCounter && position < end; i++)
                {
                    if (execInstRulesGroupCurrent != null)
                    {
                        position += execInstRulesGroupCurrent.decode(buffer, position, end - position);
                        execInstRulesGroupCurrent = execInstRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (execInstRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_MATCH_RULES:
                hasNoMatchRulesGroupCounter = true;
                noMatchRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1235, CODEC_VALIDATION_ENABLED);
                if (matchRulesGroup == null)
                {
                    matchRulesGroup = new MatchRulesGroupDecoder(trailer, messageFields);
                }
                MatchRulesGroupDecoder matchRulesGroupCurrent = matchRulesGroup;
                position = endOfField + 1;
                final int noMatchRulesGroupCounter = this.noMatchRulesGroupCounter;
                for (int i = 0; i < noMatchRulesGroupCounter && position < end; i++)
                {
                    if (matchRulesGroupCurrent != null)
                    {
                        position += matchRulesGroupCurrent.decode(buffer, position, end - position);
                        matchRulesGroupCurrent = matchRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (matchRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_M_D_FEED_TYPES:
                hasNoMDFeedTypesGroupCounter = true;
                noMDFeedTypesGroupCounter = getInt(buffer, valueOffset, endOfField, 1141, CODEC_VALIDATION_ENABLED);
                if (mDFeedTypesGroup == null)
                {
                    mDFeedTypesGroup = new MDFeedTypesGroupDecoder(trailer, messageFields);
                }
                MDFeedTypesGroupDecoder mDFeedTypesGroupCurrent = mDFeedTypesGroup;
                position = endOfField + 1;
                final int noMDFeedTypesGroupCounter = this.noMDFeedTypesGroupCounter;
                for (int i = 0; i < noMDFeedTypesGroupCounter && position < end; i++)
                {
                    if (mDFeedTypesGroupCurrent != null)
                    {
                        position += mDFeedTypesGroupCurrent.decode(buffer, position, end - position);
                        mDFeedTypesGroupCurrent = mDFeedTypesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (mDFeedTypesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
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
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetTradSesUpdateAction();
        this.resetSecurityExchange();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetTradingSessionDesc();
        this.resetTradSesMethod();
        this.resetTradSesMode();
        this.resetUnsolicitedIndicator();
        this.resetTradSesStatus();
        this.resetTradSesStatusRejReason();
        this.resetTradSesStartTime();
        this.resetTradSesOpenTime();
        this.resetTradSesPreCloseTime();
        this.resetTradSesCloseTime();
        this.resetTradSesEndTime();
        this.resetTotalVolumeTraded();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetOrdTypeRulesGroup();
        this.resetTimeInForceRulesGroup();
        this.resetExecInstRulesGroup();
        this.resetMatchRulesGroup();
        this.resetMDFeedTypesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetTradSesUpdateAction()
    {
        hasTradSesUpdateAction = false;
    }

    public void resetSecurityExchange()
    {
        hasSecurityExchange = false;
    }

    public void resetMarketID()
    {
        hasMarketID = false;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetTradingSessionDesc()
    {
        hasTradingSessionDesc = false;
    }

    public void resetTradSesMethod()
    {
        hasTradSesMethod = false;
    }

    public void resetTradSesMode()
    {
        hasTradSesMode = false;
    }

    public void resetUnsolicitedIndicator()
    {
        hasUnsolicitedIndicator = false;
    }

    public void resetTradSesStatus()
    {
        tradSesStatus = MISSING_INT;
    }

    public void resetTradSesStatusRejReason()
    {
        hasTradSesStatusRejReason = false;
    }

    public void resetTradSesStartTime()
    {
        hasTradSesStartTime = false;
    }

    public void resetTradSesOpenTime()
    {
        hasTradSesOpenTime = false;
    }

    public void resetTradSesPreCloseTime()
    {
        hasTradSesPreCloseTime = false;
    }

    public void resetTradSesCloseTime()
    {
        hasTradSesCloseTime = false;
    }

    public void resetTradSesEndTime()
    {
        hasTradSesEndTime = false;
    }

    public void resetTotalVolumeTraded()
    {
        hasTotalVolumeTraded = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
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

    public void resetOrdTypeRulesGroup()
    {
        for (final OrdTypeRulesGroupDecoder ordTypeRulesGroupDecoder : ordTypeRulesGroupIterator.iterator())
        {
            ordTypeRulesGroupDecoder.reset();
            if (ordTypeRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noOrdTypeRulesGroupCounter = MISSING_INT;
        hasNoOrdTypeRulesGroupCounter = false;
    }

    public void resetTimeInForceRulesGroup()
    {
        for (final TimeInForceRulesGroupDecoder timeInForceRulesGroupDecoder : timeInForceRulesGroupIterator.iterator())
        {
            timeInForceRulesGroupDecoder.reset();
            if (timeInForceRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTimeInForceRulesGroupCounter = MISSING_INT;
        hasNoTimeInForceRulesGroupCounter = false;
    }

    public void resetExecInstRulesGroup()
    {
        for (final ExecInstRulesGroupDecoder execInstRulesGroupDecoder : execInstRulesGroupIterator.iterator())
        {
            execInstRulesGroupDecoder.reset();
            if (execInstRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noExecInstRulesGroupCounter = MISSING_INT;
        hasNoExecInstRulesGroupCounter = false;
    }

    public void resetMatchRulesGroup()
    {
        for (final MatchRulesGroupDecoder matchRulesGroupDecoder : matchRulesGroupIterator.iterator())
        {
            matchRulesGroupDecoder.reset();
            if (matchRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMatchRulesGroupCounter = MISSING_INT;
        hasNoMatchRulesGroupCounter = false;
    }

    public void resetMDFeedTypesGroup()
    {
        for (final MDFeedTypesGroupDecoder mDFeedTypesGroupDecoder : mDFeedTypesGroupIterator.iterator())
        {
            mDFeedTypesGroupDecoder.reset();
            if (mDFeedTypesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMDFeedTypesGroupCounter = MISSING_INT;
        hasNoMDFeedTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradingSessionsGroup\",\n");
        indent(builder, level);
        builder.append("\"TradingSessionID\": \"");
        builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
        builder.append("\",\n");

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

        if (hasTradSesUpdateAction())
        {
            indent(builder, level);
            builder.append("\"TradSesUpdateAction\": \"");
            builder.append(tradSesUpdateAction);
            builder.append("\",\n");
        }

        if (hasSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"SecurityExchange\": \"");
            builder.append(this.securityExchange(), 0, securityExchangeLength());
            builder.append("\",\n");
        }

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

        if (hasTradingSessionDesc())
        {
            indent(builder, level);
            builder.append("\"TradingSessionDesc\": \"");
            builder.append(this.tradingSessionDesc(), 0, tradingSessionDescLength());
            builder.append("\",\n");
        }

        if (hasTradSesMethod())
        {
            indent(builder, level);
            builder.append("\"TradSesMethod\": \"");
            builder.append(tradSesMethod);
            builder.append("\",\n");
        }

        if (hasTradSesMode())
        {
            indent(builder, level);
            builder.append("\"TradSesMode\": \"");
            builder.append(tradSesMode);
            builder.append("\",\n");
        }

        if (hasUnsolicitedIndicator())
        {
            indent(builder, level);
            builder.append("\"UnsolicitedIndicator\": \"");
            builder.append(unsolicitedIndicator);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TradSesStatus\": \"");
        builder.append(tradSesStatus);
        builder.append("\",\n");

        if (hasTradSesStatusRejReason())
        {
            indent(builder, level);
            builder.append("\"TradSesStatusRejReason\": \"");
            builder.append(tradSesStatusRejReason);
            builder.append("\",\n");
        }

        if (hasTradSesStartTime())
        {
            indent(builder, level);
            builder.append("\"TradSesStartTime\": \"");
            appendData(builder, tradSesStartTime, tradSesStartTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesOpenTime())
        {
            indent(builder, level);
            builder.append("\"TradSesOpenTime\": \"");
            appendData(builder, tradSesOpenTime, tradSesOpenTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesPreCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesPreCloseTime\": \"");
            appendData(builder, tradSesPreCloseTime, tradSesPreCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesCloseTime())
        {
            indent(builder, level);
            builder.append("\"TradSesCloseTime\": \"");
            appendData(builder, tradSesCloseTime, tradSesCloseTimeLength);
            builder.append("\",\n");
        }

        if (hasTradSesEndTime())
        {
            indent(builder, level);
            builder.append("\"TradSesEndTime\": \"");
            appendData(builder, tradSesEndTime, tradSesEndTimeLength);
            builder.append("\",\n");
        }

        if (hasTotalVolumeTraded())
        {
            indent(builder, level);
            builder.append("\"TotalVolumeTraded\": \"");
            totalVolumeTraded.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoOrdTypeRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"OrdTypeRulesGroup\": [\n");
        OrdTypeRulesGroupDecoder ordTypeRulesGroup = this.ordTypeRulesGroup;
        for (int i = 0, size = this.noOrdTypeRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            ordTypeRulesGroup.appendTo(builder, level + 1);            if (ordTypeRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            ordTypeRulesGroup = ordTypeRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoTimeInForceRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"TimeInForceRulesGroup\": [\n");
        TimeInForceRulesGroupDecoder timeInForceRulesGroup = this.timeInForceRulesGroup;
        for (int i = 0, size = this.noTimeInForceRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            timeInForceRulesGroup.appendTo(builder, level + 1);            if (timeInForceRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            timeInForceRulesGroup = timeInForceRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoExecInstRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"ExecInstRulesGroup\": [\n");
        ExecInstRulesGroupDecoder execInstRulesGroup = this.execInstRulesGroup;
        for (int i = 0, size = this.noExecInstRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            execInstRulesGroup.appendTo(builder, level + 1);            if (execInstRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            execInstRulesGroup = execInstRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoMatchRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MatchRulesGroup\": [\n");
        MatchRulesGroupDecoder matchRulesGroup = this.matchRulesGroup;
        for (int i = 0, size = this.noMatchRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            matchRulesGroup.appendTo(builder, level + 1);            if (matchRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            matchRulesGroup = matchRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoMDFeedTypesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MDFeedTypesGroup\": [\n");
        MDFeedTypesGroupDecoder mDFeedTypesGroup = this.mDFeedTypesGroup;
        for (int i = 0, size = this.noMDFeedTypesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            mDFeedTypesGroup.appendTo(builder, level + 1);            if (mDFeedTypesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            mDFeedTypesGroup = mDFeedTypesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TradingSessionsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradingSessionsGroupEncoder)encoder);
    }

    public TradingSessionsGroupEncoder toEncoder(final TradingSessionsGroupEncoder encoder)
    {
        encoder.reset();
        encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasTradSesUpdateAction())
        {
            encoder.tradSesUpdateAction(this.tradSesUpdateAction());
        }

        if (hasSecurityExchange())
        {
            encoder.securityExchange(this.securityExchange(), 0, securityExchangeLength());
        }

        if (hasMarketID())
        {
            encoder.marketID(this.marketID(), 0, marketIDLength());
        }

        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }

        if (hasTradingSessionDesc())
        {
            encoder.tradingSessionDesc(this.tradingSessionDesc(), 0, tradingSessionDescLength());
        }

        if (hasTradSesMethod())
        {
            encoder.tradSesMethod(this.tradSesMethod());
        }

        if (hasTradSesMode())
        {
            encoder.tradSesMode(this.tradSesMode());
        }

        if (hasUnsolicitedIndicator())
        {
            encoder.unsolicitedIndicator(this.unsolicitedIndicator());
        }

        encoder.tradSesStatus(this.tradSesStatus());
        if (hasTradSesStatusRejReason())
        {
            encoder.tradSesStatusRejReason(this.tradSesStatusRejReason());
        }

        if (hasTradSesStartTime())
        {
            encoder.tradSesStartTimeAsCopy(this.tradSesStartTime(), 0, tradSesStartTimeLength());
        }

        if (hasTradSesOpenTime())
        {
            encoder.tradSesOpenTimeAsCopy(this.tradSesOpenTime(), 0, tradSesOpenTimeLength());
        }

        if (hasTradSesPreCloseTime())
        {
            encoder.tradSesPreCloseTimeAsCopy(this.tradSesPreCloseTime(), 0, tradSesPreCloseTimeLength());
        }

        if (hasTradSesCloseTime())
        {
            encoder.tradSesCloseTimeAsCopy(this.tradSesCloseTime(), 0, tradSesCloseTimeLength());
        }

        if (hasTradSesEndTime())
        {
            encoder.tradSesEndTimeAsCopy(this.tradSesEndTime(), 0, tradSesEndTimeLength());
        }

        if (hasTotalVolumeTraded())
        {
            encoder.totalVolumeTraded(this.totalVolumeTraded());
        }


        final TradingSessionRulesEncoder tradingSessionRules = encoder.tradingSessionRules();
        final OrdTypeRulesEncoder ordTypeRules = tradingSessionRules.ordTypeRules();        if (hasNoOrdTypeRulesGroupCounter)
        {
            final int size = this.noOrdTypeRulesGroupCounter;
            OrdTypeRulesGroupDecoder ordTypeRulesGroup = this.ordTypeRulesGroup;
            OrdTypeRulesGroupEncoder ordTypeRulesGroupEncoder = ordTypeRules.ordTypeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordTypeRulesGroup != null)
                {
                    ordTypeRulesGroup.toEncoder(ordTypeRulesGroupEncoder);
                    ordTypeRulesGroup = ordTypeRulesGroup.next();
                    ordTypeRulesGroupEncoder = ordTypeRulesGroupEncoder.next();
                }
            }
        }



        final TimeInForceRulesEncoder timeInForceRules = tradingSessionRules.timeInForceRules();        if (hasNoTimeInForceRulesGroupCounter)
        {
            final int size = this.noTimeInForceRulesGroupCounter;
            TimeInForceRulesGroupDecoder timeInForceRulesGroup = this.timeInForceRulesGroup;
            TimeInForceRulesGroupEncoder timeInForceRulesGroupEncoder = timeInForceRules.timeInForceRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (timeInForceRulesGroup != null)
                {
                    timeInForceRulesGroup.toEncoder(timeInForceRulesGroupEncoder);
                    timeInForceRulesGroup = timeInForceRulesGroup.next();
                    timeInForceRulesGroupEncoder = timeInForceRulesGroupEncoder.next();
                }
            }
        }



        final ExecInstRulesEncoder execInstRules = tradingSessionRules.execInstRules();        if (hasNoExecInstRulesGroupCounter)
        {
            final int size = this.noExecInstRulesGroupCounter;
            ExecInstRulesGroupDecoder execInstRulesGroup = this.execInstRulesGroup;
            ExecInstRulesGroupEncoder execInstRulesGroupEncoder = execInstRules.execInstRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execInstRulesGroup != null)
                {
                    execInstRulesGroup.toEncoder(execInstRulesGroupEncoder);
                    execInstRulesGroup = execInstRulesGroup.next();
                    execInstRulesGroupEncoder = execInstRulesGroupEncoder.next();
                }
            }
        }



        final MatchRulesEncoder matchRules = tradingSessionRules.matchRules();        if (hasNoMatchRulesGroupCounter)
        {
            final int size = this.noMatchRulesGroupCounter;
            MatchRulesGroupDecoder matchRulesGroup = this.matchRulesGroup;
            MatchRulesGroupEncoder matchRulesGroupEncoder = matchRules.matchRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (matchRulesGroup != null)
                {
                    matchRulesGroup.toEncoder(matchRulesGroupEncoder);
                    matchRulesGroup = matchRulesGroup.next();
                    matchRulesGroupEncoder = matchRulesGroupEncoder.next();
                }
            }
        }



        final MarketDataFeedTypesEncoder marketDataFeedTypes = tradingSessionRules.marketDataFeedTypes();        if (hasNoMDFeedTypesGroupCounter)
        {
            final int size = this.noMDFeedTypesGroupCounter;
            MDFeedTypesGroupDecoder mDFeedTypesGroup = this.mDFeedTypesGroup;
            MDFeedTypesGroupEncoder mDFeedTypesGroupEncoder = marketDataFeedTypes.mDFeedTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDFeedTypesGroup != null)
                {
                    mDFeedTypesGroup.toEncoder(mDFeedTypesGroupEncoder);
                    mDFeedTypesGroup = mDFeedTypesGroup.next();
                    mDFeedTypesGroupEncoder = mDFeedTypesGroupEncoder.next();
                }
            }
        }



        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
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
        return encoder;
    }

}
    public class TradingSessionsGroupIterator implements Iterable<TradingSessionsGroupDecoder>, java.util.Iterator<TradingSessionsGroupDecoder>
    {
        private final TrdSessLstGrpDecoder parent;
        private int remainder;
        private TradingSessionsGroupDecoder current;

        public TradingSessionsGroupIterator(final TrdSessLstGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public TradingSessionsGroupDecoder next()
        {
            remainder--;
            final TradingSessionsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoTradingSessionsGroupCounter() ? parent.noTradingSessionsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.tradingSessionsGroup();
        }
        public TradingSessionsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public TradingSessionsGroupIterator tradingSessionsGroupIterator();
    public int noTradingSessionsGroupCounter();
    public boolean hasNoTradingSessionsGroupCounter();
    public TradingSessionsGroupDecoder tradingSessionsGroup();

}
