/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDefinitionEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ApplicationSequenceControlEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.BaseTradingRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TickRulesEncoder.TickRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.LotTypeRulesEncoder.LotTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PriceLimitsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder.OrdTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder.TimeInForceRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder.ExecInstRulesGroupEncoder;


public class MarketDefinitionDecoder extends CommonDecoderImpl implements ApplicationSequenceControlDecoder, BaseTradingRulesDecoder, OrdTypeRulesDecoder, TimeInForceRulesDecoder, ExecInstRulesDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.MARKET_REPORT_ID);
            REQUIRED_FIELDS.add(Constants.MARKET_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(62);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.APPL_ID);
            GROUP_FIELDS.add(Constants.APPL_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_LAST_SEQ_NUM);
            GROUP_FIELDS.add(Constants.APPL_RESEND_FLAG);
            GROUP_FIELDS.add(Constants.MARKET_REPORT_ID);
            GROUP_FIELDS.add(Constants.MARKET_REQ_ID);
            GROUP_FIELDS.add(Constants.MARKET_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_ID);
            GROUP_FIELDS.add(Constants.MARKET_SEGMENT_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_MKT_SEGM_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_MKT_SEGM_DESC);
            GROUP_FIELDS.add(Constants.PARENT_MKT_SEGM_ID);
            GROUP_FIELDS.add(Constants.CURRENCY);
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
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(62);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        final IntIterator unknownFieldsIterator = unknownFields.iterator();
        if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED && unknownFieldsIterator.hasNext())
        {
            invalidTagId = unknownFieldsIterator.nextValue();
            rejectReason = Constants.ALL_FIELDS.contains(invalidTagId) ? 2 : 0;
            return false;
        }
        if (!header.validate())
        {
            invalidTagId = header.invalidTagId();
            rejectReason = header.rejectReason();
            return false;
        }
        else if (!trailer.validate())
        {
            invalidTagId = trailer.invalidTagId();
            rejectReason = trailer.rejectReason();
            return false;
        }
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
        return true;
    }

    public static final long MESSAGE_TYPE = 21826L;

    public static final String MESSAGE_TYPE_AS_STRING = "BU";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(154);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.APPL_VER_ID);
        messageFields.add(Constants.APPL_EXT_ID);
        messageFields.add(Constants.CSTM_APPL_VER_ID);
        messageFields.add(Constants.SENDER_COMP_ID);
        messageFields.add(Constants.TARGET_COMP_ID);
        messageFields.add(Constants.ON_BEHALF_OF_COMP_ID);
        messageFields.add(Constants.DELIVER_TO_COMP_ID);
        messageFields.add(Constants.SECURE_DATA_LEN);
        messageFields.add(Constants.SECURE_DATA);
        messageFields.add(Constants.MSG_SEQ_NUM);
        messageFields.add(Constants.SENDER_SUB_ID);
        messageFields.add(Constants.SENDER_LOCATION_ID);
        messageFields.add(Constants.TARGET_SUB_ID);
        messageFields.add(Constants.TARGET_LOCATION_ID);
        messageFields.add(Constants.ON_BEHALF_OF_SUB_ID);
        messageFields.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        messageFields.add(Constants.DELIVER_TO_SUB_ID);
        messageFields.add(Constants.DELIVER_TO_LOCATION_ID);
        messageFields.add(Constants.POSS_DUP_FLAG);
        messageFields.add(Constants.POSS_RESEND);
        messageFields.add(Constants.SENDING_TIME);
        messageFields.add(Constants.ORIG_SENDING_TIME);
        messageFields.add(Constants.XML_DATA_LEN);
        messageFields.add(Constants.XML_DATA);
        messageFields.add(Constants.MESSAGE_ENCODING);
        messageFields.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        messageFields.add(Constants.APPL_ID);
        messageFields.add(Constants.APPL_SEQ_NUM);
        messageFields.add(Constants.APPL_LAST_SEQ_NUM);
        messageFields.add(Constants.APPL_RESEND_FLAG);
        messageFields.add(Constants.MARKET_REPORT_ID);
        messageFields.add(Constants.MARKET_REQ_ID);
        messageFields.add(Constants.MARKET_ID);
        messageFields.add(Constants.MARKET_SEGMENT_ID);
        messageFields.add(Constants.MARKET_SEGMENT_DESC);
        messageFields.add(Constants.ENCODED_MKT_SEGM_DESC_LEN);
        messageFields.add(Constants.ENCODED_MKT_SEGM_DESC);
        messageFields.add(Constants.PARENT_MKT_SEGM_ID);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.NO_TICK_RULES);
        messageFields.add(Constants.START_TICK_PRICE_RANGE);
        messageFields.add(Constants.END_TICK_PRICE_RANGE);
        messageFields.add(Constants.TICK_INCREMENT);
        messageFields.add(Constants.TICK_RULE_TYPE);
        messageFields.add(Constants.NO_LOT_TYPE_RULES);
        messageFields.add(Constants.LOT_TYPE);
        messageFields.add(Constants.MIN_LOT_SIZE);
        messageFields.add(Constants.PRICE_LIMIT_TYPE);
        messageFields.add(Constants.LOW_LIMIT_PRICE);
        messageFields.add(Constants.HIGH_LIMIT_PRICE);
        messageFields.add(Constants.TRADING_REFERENCE_PRICE);
        messageFields.add(Constants.EXPIRATION_CYCLE);
        messageFields.add(Constants.MIN_TRADE_VOL);
        messageFields.add(Constants.MAX_TRADE_VOL);
        messageFields.add(Constants.MAX_PRICE_VARIATION);
        messageFields.add(Constants.IMPLIED_MARKET_INDICATOR);
        messageFields.add(Constants.TRADING_CURRENCY);
        messageFields.add(Constants.ROUND_LOT);
        messageFields.add(Constants.MULTILEG_MODEL);
        messageFields.add(Constants.MULTILEG_PRICE_METHOD);
        messageFields.add(Constants.PRICE_TYPE);
        messageFields.add(Constants.NO_ORD_TYPE_RULES);
        messageFields.add(Constants.ORD_TYPE);
        messageFields.add(Constants.NO_TIME_IN_FORCE_RULES);
        messageFields.add(Constants.TIME_IN_FORCE);
        messageFields.add(Constants.NO_EXEC_INST_RULES);
        messageFields.add(Constants.EXEC_INST_VALUE);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.SIGNATURE_LENGTH);
        messageFields.add(Constants.SIGNATURE);
        messageFields.add(Constants.CHECK_SUM);
    }

    private final TrailerDecoder trailer = new TrailerDecoder();

    public TrailerDecoder trailer()
    {
        return trailer;
    }

    private final HeaderDecoder header = new HeaderDecoder(trailer);

    public HeaderDecoder header()
    {
        return header;
    }


    private char[] applID = new char[1];

    private boolean hasApplID;

    public char[] applID()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applID;
    }

    public boolean hasApplID()
    {
        return hasApplID;
    }


    private int applIDOffset;

    private int applIDLength;

    public int applIDLength()
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        return applIDLength;
    }

    public String applIDAsString()
    {
        return hasApplID ? new String(applID, 0, applIDLength) : null;
    }

    public void applID(final AsciiSequenceView view)
    {
        if (!hasApplID)
        {
            throw new IllegalArgumentException("No value for optional field: ApplID");
        }

        view.wrap(buffer, applIDOffset, applIDLength);
    }


    private int applSeqNum = MISSING_INT;

    private boolean hasApplSeqNum;

    public int applSeqNum()
    {
        if (!hasApplSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplSeqNum");
        }

        return applSeqNum;
    }

    public boolean hasApplSeqNum()
    {
        return hasApplSeqNum;
    }



    private int applLastSeqNum = MISSING_INT;

    private boolean hasApplLastSeqNum;

    public int applLastSeqNum()
    {
        if (!hasApplLastSeqNum)
        {
            throw new IllegalArgumentException("No value for optional field: ApplLastSeqNum");
        }

        return applLastSeqNum;
    }

    public boolean hasApplLastSeqNum()
    {
        return hasApplLastSeqNum;
    }



    private boolean applResendFlag;

    private boolean hasApplResendFlag;

    public boolean applResendFlag()
    {
        if (!hasApplResendFlag)
        {
            throw new IllegalArgumentException("No value for optional field: ApplResendFlag");
        }

        return applResendFlag;
    }

    public boolean hasApplResendFlag()
    {
        return hasApplResendFlag;
    }




    private char[] marketReportID = new char[1];

    public char[] marketReportID()
    {
        return marketReportID;
    }


    private int marketReportIDOffset;

    private int marketReportIDLength;

    public int marketReportIDLength()
    {
        return marketReportIDLength;
    }

    public String marketReportIDAsString()
    {
        return new String(marketReportID, 0, marketReportIDLength);
    }

    public void marketReportID(final AsciiSequenceView view)
    {
        view.wrap(buffer, marketReportIDOffset, marketReportIDLength);
    }


    private char[] marketReqID = new char[1];

    private boolean hasMarketReqID;

    public char[] marketReqID()
    {
        if (!hasMarketReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketReqID");
        }

        return marketReqID;
    }

    public boolean hasMarketReqID()
    {
        return hasMarketReqID;
    }


    private int marketReqIDOffset;

    private int marketReqIDLength;

    public int marketReqIDLength()
    {
        if (!hasMarketReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketReqID");
        }

        return marketReqIDLength;
    }

    public String marketReqIDAsString()
    {
        return hasMarketReqID ? new String(marketReqID, 0, marketReqIDLength) : null;
    }

    public void marketReqID(final AsciiSequenceView view)
    {
        if (!hasMarketReqID)
        {
            throw new IllegalArgumentException("No value for optional field: MarketReqID");
        }

        view.wrap(buffer, marketReqIDOffset, marketReqIDLength);
    }


    private char[] marketID = new char[1];

    public char[] marketID()
    {
        return marketID;
    }


    private int marketIDOffset;

    private int marketIDLength;

    public int marketIDLength()
    {
        return marketIDLength;
    }

    public String marketIDAsString()
    {
        return new String(marketID, 0, marketIDLength);
    }

    public void marketID(final AsciiSequenceView view)
    {
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


    private char[] marketSegmentDesc = new char[1];

    private boolean hasMarketSegmentDesc;

    public char[] marketSegmentDesc()
    {
        if (!hasMarketSegmentDesc)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentDesc");
        }

        return marketSegmentDesc;
    }

    public boolean hasMarketSegmentDesc()
    {
        return hasMarketSegmentDesc;
    }


    private int marketSegmentDescOffset;

    private int marketSegmentDescLength;

    public int marketSegmentDescLength()
    {
        if (!hasMarketSegmentDesc)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentDesc");
        }

        return marketSegmentDescLength;
    }

    public String marketSegmentDescAsString()
    {
        return hasMarketSegmentDesc ? new String(marketSegmentDesc, 0, marketSegmentDescLength) : null;
    }

    public void marketSegmentDesc(final AsciiSequenceView view)
    {
        if (!hasMarketSegmentDesc)
        {
            throw new IllegalArgumentException("No value for optional field: MarketSegmentDesc");
        }

        view.wrap(buffer, marketSegmentDescOffset, marketSegmentDescLength);
    }


    private int encodedMktSegmDescLen = MISSING_INT;

    private boolean hasEncodedMktSegmDescLen;

    public int encodedMktSegmDescLen()
    {
        if (!hasEncodedMktSegmDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedMktSegmDescLen");
        }

        return encodedMktSegmDescLen;
    }

    public boolean hasEncodedMktSegmDescLen()
    {
        return hasEncodedMktSegmDescLen;
    }



    private byte[] encodedMktSegmDesc = new byte[1];

    private boolean hasEncodedMktSegmDesc;

    public byte[] encodedMktSegmDesc()
    {
        if (!hasEncodedMktSegmDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedMktSegmDesc");
        }

        return encodedMktSegmDesc;
    }

    public boolean hasEncodedMktSegmDesc()
    {
        return hasEncodedMktSegmDesc;
    }



    private char[] parentMktSegmID = new char[1];

    private boolean hasParentMktSegmID;

    public char[] parentMktSegmID()
    {
        if (!hasParentMktSegmID)
        {
            throw new IllegalArgumentException("No value for optional field: ParentMktSegmID");
        }

        return parentMktSegmID;
    }

    public boolean hasParentMktSegmID()
    {
        return hasParentMktSegmID;
    }


    private int parentMktSegmIDOffset;

    private int parentMktSegmIDLength;

    public int parentMktSegmIDLength()
    {
        if (!hasParentMktSegmID)
        {
            throw new IllegalArgumentException("No value for optional field: ParentMktSegmID");
        }

        return parentMktSegmIDLength;
    }

    public String parentMktSegmIDAsString()
    {
        return hasParentMktSegmID ? new String(parentMktSegmID, 0, parentMktSegmIDLength) : null;
    }

    public void parentMktSegmID(final AsciiSequenceView view)
    {
        if (!hasParentMktSegmID)
        {
            throw new IllegalArgumentException("No value for optional field: ParentMktSegmID");
        }

        view.wrap(buffer, parentMktSegmIDOffset, parentMktSegmIDLength);
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
        // Decode MarketDefinition
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        position += header.decode(buffer, position, length);
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.APPL_ID:
                hasApplID = true;
                applID = buffer.getChars(applID, valueOffset, valueLength);
                applIDOffset = valueOffset;
                applIDLength = valueLength;
                break;

            case Constants.APPL_SEQ_NUM:
                hasApplSeqNum = true;
                applSeqNum = getInt(buffer, valueOffset, endOfField, 1181, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_LAST_SEQ_NUM:
                hasApplLastSeqNum = true;
                applLastSeqNum = getInt(buffer, valueOffset, endOfField, 1350, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.APPL_RESEND_FLAG:
                hasApplResendFlag = true;
                applResendFlag = buffer.getBoolean(valueOffset);
                break;


            case Constants.MARKET_REPORT_ID:
                marketReportID = buffer.getChars(marketReportID, valueOffset, valueLength);
                marketReportIDOffset = valueOffset;
                marketReportIDLength = valueLength;
                break;

            case Constants.MARKET_REQ_ID:
                hasMarketReqID = true;
                marketReqID = buffer.getChars(marketReqID, valueOffset, valueLength);
                marketReqIDOffset = valueOffset;
                marketReqIDLength = valueLength;
                break;

            case Constants.MARKET_ID:
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

            case Constants.MARKET_SEGMENT_DESC:
                hasMarketSegmentDesc = true;
                marketSegmentDesc = buffer.getChars(marketSegmentDesc, valueOffset, valueLength);
                marketSegmentDescOffset = valueOffset;
                marketSegmentDescLength = valueLength;
                break;

            case Constants.ENCODED_MKT_SEGM_DESC_LEN:
                hasEncodedMktSegmDescLen = true;
                encodedMktSegmDescLen = getInt(buffer, valueOffset, endOfField, 1397, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_MKT_SEGM_DESC:
                hasEncodedMktSegmDesc = true;
                encodedMktSegmDesc = buffer.getBytes(encodedMktSegmDesc, valueOffset, encodedMktSegmDescLen);
                endOfField = valueOffset + encodedMktSegmDescLen;
                break;

            case Constants.PARENT_MKT_SEGM_ID:
                hasParentMktSegmID = true;
                parentMktSegmID = buffer.getChars(parentMktSegmID, valueOffset, valueLength);
                parentMktSegmIDOffset = valueOffset;
                parentMktSegmIDLength = valueLength;
                break;

            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.NO_TICK_RULES:
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


            case Constants.NO_LOT_TYPE_RULES:
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
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!(trailer.REQUIRED_FIELDS.contains(tag)))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag)))
                {
                    position += trailer.decode(buffer, position, end - position);
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        position += trailer.decode(buffer, position, end - position);
        return position - offset;
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
    }

    public void resetMessage()
    {
        this.resetMarketReportID();
        this.resetMarketReqID();
        this.resetMarketID();
        this.resetMarketSegmentID();
        this.resetMarketSegmentDesc();
        this.resetEncodedMktSegmDescLen();
        this.resetEncodedMktSegmDesc();
        this.resetParentMktSegmID();
        this.resetCurrency();
        this.resetTransactTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetApplID();
        this.resetApplSeqNum();
        this.resetApplLastSeqNum();
        this.resetApplResendFlag();
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
        this.resetOrdTypeRulesGroup();
        this.resetTimeInForceRulesGroup();
        this.resetExecInstRulesGroup();
    }

    public void resetMarketReportID()
    {
        marketReportIDOffset = 0;
        marketReportIDLength = 0;
    }

    public void resetMarketReqID()
    {
        hasMarketReqID = false;
    }

    public void resetMarketID()
    {
        marketIDOffset = 0;
        marketIDLength = 0;
    }

    public void resetMarketSegmentID()
    {
        hasMarketSegmentID = false;
    }

    public void resetMarketSegmentDesc()
    {
        hasMarketSegmentDesc = false;
    }

    public void resetEncodedMktSegmDescLen()
    {
        hasEncodedMktSegmDescLen = false;
    }

    public void resetEncodedMktSegmDesc()
    {
        hasEncodedMktSegmDesc = false;
    }

    public void resetParentMktSegmID()
    {
        hasParentMktSegmID = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
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

    public void resetApplID()
    {
        hasApplID = false;
    }

    public void resetApplSeqNum()
    {
        hasApplSeqNum = false;
    }

    public void resetApplLastSeqNum()
    {
        hasApplLastSeqNum = false;
    }

    public void resetApplResendFlag()
    {
        hasApplResendFlag = false;
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
        builder.append("\"MessageName\": \"MarketDefinition\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasApplID())
        {
            indent(builder, level);
            builder.append("\"ApplID\": \"");
            builder.append(this.applID(), 0, applIDLength());
            builder.append("\",\n");
        }

        if (hasApplSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplSeqNum\": \"");
            builder.append(applSeqNum);
            builder.append("\",\n");
        }

        if (hasApplLastSeqNum())
        {
            indent(builder, level);
            builder.append("\"ApplLastSeqNum\": \"");
            builder.append(applLastSeqNum);
            builder.append("\",\n");
        }

        if (hasApplResendFlag())
        {
            indent(builder, level);
            builder.append("\"ApplResendFlag\": \"");
            builder.append(applResendFlag);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"MarketReportID\": \"");
        builder.append(this.marketReportID(), 0, marketReportIDLength());
        builder.append("\",\n");

        if (hasMarketReqID())
        {
            indent(builder, level);
            builder.append("\"MarketReqID\": \"");
            builder.append(this.marketReqID(), 0, marketReqIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"MarketID\": \"");
        builder.append(this.marketID(), 0, marketIDLength());
        builder.append("\",\n");

        if (hasMarketSegmentID())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentID\": \"");
            builder.append(this.marketSegmentID(), 0, marketSegmentIDLength());
            builder.append("\",\n");
        }

        if (hasMarketSegmentDesc())
        {
            indent(builder, level);
            builder.append("\"MarketSegmentDesc\": \"");
            builder.append(this.marketSegmentDesc(), 0, marketSegmentDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedMktSegmDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedMktSegmDescLen\": \"");
            builder.append(encodedMktSegmDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedMktSegmDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedMktSegmDesc\": \"");
            appendData(builder, encodedMktSegmDesc, encodedMktSegmDescLen);
            builder.append("\",\n");
        }

        if (hasParentMktSegmID())
        {
            indent(builder, level);
            builder.append("\"ParentMktSegmID\": \"");
            builder.append(this.parentMktSegmID(), 0, parentMktSegmIDLength());
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
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
            tickRulesGroup.appendTo(builder, level + 1);            if (tickRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            tickRulesGroup = tickRulesGroup.next();        }
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
            lotTypeRulesGroup.appendTo(builder, level + 1);            if (lotTypeRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            lotTypeRulesGroup = lotTypeRulesGroup.next();        }
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
    public MarketDefinitionEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((MarketDefinitionEncoder)encoder);
    }

    public MarketDefinitionEncoder toEncoder(final MarketDefinitionEncoder encoder)
    {
        encoder.reset();

        final ApplicationSequenceControlEncoder applicationSequenceControl = encoder.applicationSequenceControl();        if (hasApplID())
        {
            applicationSequenceControl.applID(this.applID(), 0, applIDLength());
        }

        if (hasApplSeqNum())
        {
            applicationSequenceControl.applSeqNum(this.applSeqNum());
        }

        if (hasApplLastSeqNum())
        {
            applicationSequenceControl.applLastSeqNum(this.applLastSeqNum());
        }

        if (hasApplResendFlag())
        {
            applicationSequenceControl.applResendFlag(this.applResendFlag());
        }


        encoder.marketReportID(this.marketReportID(), 0, marketReportIDLength());
        if (hasMarketReqID())
        {
            encoder.marketReqID(this.marketReqID(), 0, marketReqIDLength());
        }

        encoder.marketID(this.marketID(), 0, marketIDLength());
        if (hasMarketSegmentID())
        {
            encoder.marketSegmentID(this.marketSegmentID(), 0, marketSegmentIDLength());
        }

        if (hasMarketSegmentDesc())
        {
            encoder.marketSegmentDesc(this.marketSegmentDesc(), 0, marketSegmentDescLength());
        }

        if (hasEncodedMktSegmDescLen())
        {
            encoder.encodedMktSegmDescLen(this.encodedMktSegmDescLen());
        }

        if (hasEncodedMktSegmDesc())
        {
            encoder.encodedMktSegmDescAsCopy(this.encodedMktSegmDesc(), 0, encodedMktSegmDescLen());
            encoder.encodedMktSegmDescLen(this.encodedMktSegmDescLen());
        }

        if (hasParentMktSegmID())
        {
            encoder.parentMktSegmID(this.parentMktSegmID(), 0, parentMktSegmIDLength());
        }

        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }


        final BaseTradingRulesEncoder baseTradingRules = encoder.baseTradingRules();
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



        final OrdTypeRulesEncoder ordTypeRules = encoder.ordTypeRules();        if (hasNoOrdTypeRulesGroupCounter)
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



        final TimeInForceRulesEncoder timeInForceRules = encoder.timeInForceRules();        if (hasNoTimeInForceRulesGroupCounter)
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



        final ExecInstRulesEncoder execInstRules = encoder.execInstRules();        if (hasNoExecInstRulesGroupCounter)
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
