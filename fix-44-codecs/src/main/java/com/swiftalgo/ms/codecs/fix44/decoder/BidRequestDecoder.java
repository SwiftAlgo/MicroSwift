/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.BidRequestEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.BidRequestEncoder.BidDescriptorsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.BidRequestEncoder.BidComponentsGroupEncoder;


public class BidRequestDecoder extends CommonDecoderImpl implements MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(12);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.CLIENT_BID_ID);
            REQUIRED_FIELDS.add(Constants.BID_REQUEST_TRANS_TYPE);
            REQUIRED_FIELDS.add(Constants.TOT_NO_RELATED_SYM);
            REQUIRED_FIELDS.add(Constants.BID_TYPE);
            REQUIRED_FIELDS.add(Constants.BID_TRADE_TYPE);
            REQUIRED_FIELDS.add(Constants.BASIS_PX_TYPE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(54);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.BID_ID);
            GROUP_FIELDS.add(Constants.CLIENT_BID_ID);
            GROUP_FIELDS.add(Constants.BID_REQUEST_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.LIST_NAME);
            GROUP_FIELDS.add(Constants.TOT_NO_RELATED_SYM);
            GROUP_FIELDS.add(Constants.BID_TYPE);
            GROUP_FIELDS.add(Constants.NUM_TICKETS);
            GROUP_FIELDS.add(Constants.CURRENCY);
            GROUP_FIELDS.add(Constants.SIDE_VALUE1);
            GROUP_FIELDS.add(Constants.SIDE_VALUE2);
            GROUP_FIELDS.add(Constants.LIQUIDITY_IND_TYPE);
            GROUP_FIELDS.add(Constants.WT_AVERAGE_LIQUIDITY);
            GROUP_FIELDS.add(Constants.EXCHANGE_FOR_PHYSICAL);
            GROUP_FIELDS.add(Constants.OUT_MAIN_CNTRY_U_INDEX);
            GROUP_FIELDS.add(Constants.CROSS_PERCENT);
            GROUP_FIELDS.add(Constants.PROG_RPT_REQS);
            GROUP_FIELDS.add(Constants.PROG_PERIOD_INTERVAL);
            GROUP_FIELDS.add(Constants.INC_TAX_IND);
            GROUP_FIELDS.add(Constants.FOREX_REQ);
            GROUP_FIELDS.add(Constants.NUM_BIDDERS);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.BID_TRADE_TYPE);
            GROUP_FIELDS.add(Constants.BASIS_PX_TYPE);
            GROUP_FIELDS.add(Constants.STRIKE_TIME);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(54);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(12);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidRequestTransType.isValid(bidRequestTransType()))
        {
            invalidTagId = 374;
            rejectReason = 5;
            return false;
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidType.isValid(bidType()))
        {
            invalidTagId = 394;
            rejectReason = 5;
            return false;
        }

        if (hasLiquidityIndType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !LiquidityIndType.isValid(liquidityIndType()))
        {
            invalidTagId = 409;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProgRptReqs)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ProgRptReqs.isValid(progRptReqs()))
        {
            invalidTagId = 414;
            rejectReason = 5;
            return false;
        }
        }

        if (hasIncTaxInd)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !IncTaxInd.isValid(incTaxInd()))
        {
            invalidTagId = 416;
            rejectReason = 5;
            return false;
        }
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidTradeType.isValid(bidTradeType()))
        {
            invalidTagId = 418;
            rejectReason = 5;
            return false;
        }

        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BasisPxType.isValid(basisPxType()))
        {
            invalidTagId = 419;
            rejectReason = 5;
            return false;
        }
        if (hasNoBidDescriptorsGroupCounter)
        {
            {
                int count = 0;
                final BidDescriptorsGroupIterator iterator = bidDescriptorsGroupIterator.iterator();
                for (final BidDescriptorsGroupDecoder group : iterator)
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
                    invalidTagId = 398;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoBidComponentsGroupCounter)
        {
            {
                int count = 0;
                final BidComponentsGroupIterator iterator = bidComponentsGroupIterator.iterator();
                for (final BidComponentsGroupDecoder group : iterator)
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
                    invalidTagId = 420;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 107L;

    public static final String MESSAGE_TYPE_AS_STRING = "k";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(156);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
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
        messageFields.add(Constants.BID_ID);
        messageFields.add(Constants.CLIENT_BID_ID);
        messageFields.add(Constants.BID_REQUEST_TRANS_TYPE);
        messageFields.add(Constants.LIST_NAME);
        messageFields.add(Constants.TOT_NO_RELATED_SYM);
        messageFields.add(Constants.BID_TYPE);
        messageFields.add(Constants.NUM_TICKETS);
        messageFields.add(Constants.CURRENCY);
        messageFields.add(Constants.SIDE_VALUE1);
        messageFields.add(Constants.SIDE_VALUE2);
        messageFields.add(Constants.NO_BID_DESCRIPTORS);
        messageFields.add(Constants.BID_DESCRIPTOR_TYPE);
        messageFields.add(Constants.BID_DESCRIPTOR);
        messageFields.add(Constants.SIDE_VALUE_IND);
        messageFields.add(Constants.LIQUIDITY_VALUE);
        messageFields.add(Constants.LIQUIDITY_NUM_SECURITIES);
        messageFields.add(Constants.LIQUIDITY_PCT_LOW);
        messageFields.add(Constants.LIQUIDITY_PCT_HIGH);
        messageFields.add(Constants.E_F_P_TRACKING_ERROR);
        messageFields.add(Constants.FAIR_VALUE);
        messageFields.add(Constants.OUTSIDE_INDEX_PCT);
        messageFields.add(Constants.VALUE_OF_FUTURES);
        messageFields.add(Constants.NO_BID_COMPONENTS);
        messageFields.add(Constants.LIST_ID);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.TRADING_SESSION_ID);
        messageFields.add(Constants.TRADING_SESSION_SUB_ID);
        messageFields.add(Constants.NET_GROSS_IND);
        messageFields.add(Constants.SETTL_TYPE);
        messageFields.add(Constants.SETTL_DATE);
        messageFields.add(Constants.ACCOUNT);
        messageFields.add(Constants.ACCT_ID_SOURCE);
        messageFields.add(Constants.LIQUIDITY_IND_TYPE);
        messageFields.add(Constants.WT_AVERAGE_LIQUIDITY);
        messageFields.add(Constants.EXCHANGE_FOR_PHYSICAL);
        messageFields.add(Constants.OUT_MAIN_CNTRY_U_INDEX);
        messageFields.add(Constants.CROSS_PERCENT);
        messageFields.add(Constants.PROG_RPT_REQS);
        messageFields.add(Constants.PROG_PERIOD_INTERVAL);
        messageFields.add(Constants.INC_TAX_IND);
        messageFields.add(Constants.FOREX_REQ);
        messageFields.add(Constants.NUM_BIDDERS);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.BID_TRADE_TYPE);
        messageFields.add(Constants.BASIS_PX_TYPE);
        messageFields.add(Constants.STRIKE_TIME);
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

    private char[] bidID = new char[1];

    private boolean hasBidID;

    public char[] bidID()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidID;
    }

    public boolean hasBidID()
    {
        return hasBidID;
    }


    private int bidIDOffset;

    private int bidIDLength;

    public int bidIDLength()
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        return bidIDLength;
    }

    public String bidIDAsString()
    {
        return hasBidID ? new String(bidID, 0, bidIDLength) : null;
    }

    public void bidID(final AsciiSequenceView view)
    {
        if (!hasBidID)
        {
            throw new IllegalArgumentException("No value for optional field: BidID");
        }

        view.wrap(buffer, bidIDOffset, bidIDLength);
    }


    private char[] clientBidID = new char[1];

    public char[] clientBidID()
    {
        return clientBidID;
    }


    private int clientBidIDOffset;

    private int clientBidIDLength;

    public int clientBidIDLength()
    {
        return clientBidIDLength;
    }

    public String clientBidIDAsString()
    {
        return new String(clientBidID, 0, clientBidIDLength);
    }

    public void clientBidID(final AsciiSequenceView view)
    {
        view.wrap(buffer, clientBidIDOffset, clientBidIDLength);
    }


    private char bidRequestTransType = MISSING_CHAR;

    public char bidRequestTransType()
    {
        return bidRequestTransType;
    }



    private final CharArrayWrapper bidRequestTransTypeWrapper = new CharArrayWrapper();
    public BidRequestTransType bidRequestTransTypeAsEnum()
    {
        return BidRequestTransType.decode(bidRequestTransType);
    }

    private char[] listName = new char[1];

    private boolean hasListName;

    public char[] listName()
    {
        if (!hasListName)
        {
            throw new IllegalArgumentException("No value for optional field: ListName");
        }

        return listName;
    }

    public boolean hasListName()
    {
        return hasListName;
    }


    private int listNameOffset;

    private int listNameLength;

    public int listNameLength()
    {
        if (!hasListName)
        {
            throw new IllegalArgumentException("No value for optional field: ListName");
        }

        return listNameLength;
    }

    public String listNameAsString()
    {
        return hasListName ? new String(listName, 0, listNameLength) : null;
    }

    public void listName(final AsciiSequenceView view)
    {
        if (!hasListName)
        {
            throw new IllegalArgumentException("No value for optional field: ListName");
        }

        view.wrap(buffer, listNameOffset, listNameLength);
    }


    private int totNoRelatedSym = MISSING_INT;

    public int totNoRelatedSym()
    {
        return totNoRelatedSym;
    }



    private int bidType = MISSING_INT;

    public int bidType()
    {
        return bidType;
    }



    private final CharArrayWrapper bidTypeWrapper = new CharArrayWrapper();
    public BidType bidTypeAsEnum()
    {
        return BidType.decode(bidType);
    }

    private int numTickets = MISSING_INT;

    private boolean hasNumTickets;

    public int numTickets()
    {
        if (!hasNumTickets)
        {
            throw new IllegalArgumentException("No value for optional field: NumTickets");
        }

        return numTickets;
    }

    public boolean hasNumTickets()
    {
        return hasNumTickets;
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


    private DecimalFloat sideValue1 = DecimalFloat.newNaNValue();

    private boolean hasSideValue1;

    public DecimalFloat sideValue1()
    {
        if (!hasSideValue1)
        {
            throw new IllegalArgumentException("No value for optional field: SideValue1");
        }

        return sideValue1;
    }

    public boolean hasSideValue1()
    {
        return hasSideValue1;
    }



    private DecimalFloat sideValue2 = DecimalFloat.newNaNValue();

    private boolean hasSideValue2;

    public DecimalFloat sideValue2()
    {
        if (!hasSideValue2)
        {
            throw new IllegalArgumentException("No value for optional field: SideValue2");
        }

        return sideValue2;
    }

    public boolean hasSideValue2()
    {
        return hasSideValue2;
    }





public class BidDescriptorsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(22);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.BID_DESCRIPTOR_TYPE);
            ALL_GROUP_FIELDS.add(Constants.BID_DESCRIPTOR);
            ALL_GROUP_FIELDS.add(Constants.SIDE_VALUE_IND);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_VALUE);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_NUM_SECURITIES);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_PCT_LOW);
            ALL_GROUP_FIELDS.add(Constants.LIQUIDITY_PCT_HIGH);
            ALL_GROUP_FIELDS.add(Constants.E_F_P_TRACKING_ERROR);
            ALL_GROUP_FIELDS.add(Constants.FAIR_VALUE);
            ALL_GROUP_FIELDS.add(Constants.OUTSIDE_INDEX_PCT);
            ALL_GROUP_FIELDS.add(Constants.VALUE_OF_FUTURES);
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
        if (hasBidDescriptorType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !BidDescriptorType.isValid(bidDescriptorType()))
        {
            invalidTagId = 399;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSideValueInd)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SideValueInd.isValid(sideValueInd()))
        {
            invalidTagId = 401;
            rejectReason = 5;
            return false;
        }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public BidDescriptorsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private BidDescriptorsGroupDecoder next = null;

    public BidDescriptorsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(22);

    private int bidDescriptorType = MISSING_INT;

    private boolean hasBidDescriptorType;

    public int bidDescriptorType()
    {
        if (!hasBidDescriptorType)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptorType");
        }

        return bidDescriptorType;
    }

    public boolean hasBidDescriptorType()
    {
        return hasBidDescriptorType;
    }



    private final CharArrayWrapper bidDescriptorTypeWrapper = new CharArrayWrapper();
    public BidDescriptorType bidDescriptorTypeAsEnum()
    {
        if (!hasBidDescriptorType)
 return BidDescriptorType.NULL_VAL;
        return BidDescriptorType.decode(bidDescriptorType);
    }

    private char[] bidDescriptor = new char[1];

    private boolean hasBidDescriptor;

    public char[] bidDescriptor()
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        return bidDescriptor;
    }

    public boolean hasBidDescriptor()
    {
        return hasBidDescriptor;
    }


    private int bidDescriptorOffset;

    private int bidDescriptorLength;

    public int bidDescriptorLength()
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        return bidDescriptorLength;
    }

    public String bidDescriptorAsString()
    {
        return hasBidDescriptor ? new String(bidDescriptor, 0, bidDescriptorLength) : null;
    }

    public void bidDescriptor(final AsciiSequenceView view)
    {
        if (!hasBidDescriptor)
        {
            throw new IllegalArgumentException("No value for optional field: BidDescriptor");
        }

        view.wrap(buffer, bidDescriptorOffset, bidDescriptorLength);
    }


    private int sideValueInd = MISSING_INT;

    private boolean hasSideValueInd;

    public int sideValueInd()
    {
        if (!hasSideValueInd)
        {
            throw new IllegalArgumentException("No value for optional field: SideValueInd");
        }

        return sideValueInd;
    }

    public boolean hasSideValueInd()
    {
        return hasSideValueInd;
    }



    private final CharArrayWrapper sideValueIndWrapper = new CharArrayWrapper();
    public SideValueInd sideValueIndAsEnum()
    {
        if (!hasSideValueInd)
 return SideValueInd.NULL_VAL;
        return SideValueInd.decode(sideValueInd);
    }

    private DecimalFloat liquidityValue = DecimalFloat.newNaNValue();

    private boolean hasLiquidityValue;

    public DecimalFloat liquidityValue()
    {
        if (!hasLiquidityValue)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityValue");
        }

        return liquidityValue;
    }

    public boolean hasLiquidityValue()
    {
        return hasLiquidityValue;
    }



    private int liquidityNumSecurities = MISSING_INT;

    private boolean hasLiquidityNumSecurities;

    public int liquidityNumSecurities()
    {
        if (!hasLiquidityNumSecurities)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityNumSecurities");
        }

        return liquidityNumSecurities;
    }

    public boolean hasLiquidityNumSecurities()
    {
        return hasLiquidityNumSecurities;
    }



    private DecimalFloat liquidityPctLow = DecimalFloat.newNaNValue();

    private boolean hasLiquidityPctLow;

    public DecimalFloat liquidityPctLow()
    {
        if (!hasLiquidityPctLow)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityPctLow");
        }

        return liquidityPctLow;
    }

    public boolean hasLiquidityPctLow()
    {
        return hasLiquidityPctLow;
    }



    private DecimalFloat liquidityPctHigh = DecimalFloat.newNaNValue();

    private boolean hasLiquidityPctHigh;

    public DecimalFloat liquidityPctHigh()
    {
        if (!hasLiquidityPctHigh)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityPctHigh");
        }

        return liquidityPctHigh;
    }

    public boolean hasLiquidityPctHigh()
    {
        return hasLiquidityPctHigh;
    }



    private DecimalFloat eFPTrackingError = DecimalFloat.newNaNValue();

    private boolean hasEFPTrackingError;

    public DecimalFloat eFPTrackingError()
    {
        if (!hasEFPTrackingError)
        {
            throw new IllegalArgumentException("No value for optional field: EFPTrackingError");
        }

        return eFPTrackingError;
    }

    public boolean hasEFPTrackingError()
    {
        return hasEFPTrackingError;
    }



    private DecimalFloat fairValue = DecimalFloat.newNaNValue();

    private boolean hasFairValue;

    public DecimalFloat fairValue()
    {
        if (!hasFairValue)
        {
            throw new IllegalArgumentException("No value for optional field: FairValue");
        }

        return fairValue;
    }

    public boolean hasFairValue()
    {
        return hasFairValue;
    }



    private DecimalFloat outsideIndexPct = DecimalFloat.newNaNValue();

    private boolean hasOutsideIndexPct;

    public DecimalFloat outsideIndexPct()
    {
        if (!hasOutsideIndexPct)
        {
            throw new IllegalArgumentException("No value for optional field: OutsideIndexPct");
        }

        return outsideIndexPct;
    }

    public boolean hasOutsideIndexPct()
    {
        return hasOutsideIndexPct;
    }



    private DecimalFloat valueOfFutures = DecimalFloat.newNaNValue();

    private boolean hasValueOfFutures;

    public DecimalFloat valueOfFutures()
    {
        if (!hasValueOfFutures)
        {
            throw new IllegalArgumentException("No value for optional field: ValueOfFutures");
        }

        return valueOfFutures;
    }

    public boolean hasValueOfFutures()
    {
        return hasValueOfFutures;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode BidDescriptorsGroup
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
                    next = new BidDescriptorsGroupDecoder(trailer, messageFields);
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
            case Constants.BID_DESCRIPTOR_TYPE:
                hasBidDescriptorType = true;
                bidDescriptorType = getInt(buffer, valueOffset, endOfField, 399, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BID_DESCRIPTOR:
                hasBidDescriptor = true;
                bidDescriptor = buffer.getChars(bidDescriptor, valueOffset, valueLength);
                bidDescriptorOffset = valueOffset;
                bidDescriptorLength = valueLength;
                break;

            case Constants.SIDE_VALUE_IND:
                hasSideValueInd = true;
                sideValueInd = getInt(buffer, valueOffset, endOfField, 401, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_VALUE:
                hasLiquidityValue = true;
                liquidityValue = getFloat(buffer, liquidityValue, valueOffset, valueLength, 404, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_NUM_SECURITIES:
                hasLiquidityNumSecurities = true;
                liquidityNumSecurities = getInt(buffer, valueOffset, endOfField, 441, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_PCT_LOW:
                hasLiquidityPctLow = true;
                liquidityPctLow = getFloat(buffer, liquidityPctLow, valueOffset, valueLength, 402, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.LIQUIDITY_PCT_HIGH:
                hasLiquidityPctHigh = true;
                liquidityPctHigh = getFloat(buffer, liquidityPctHigh, valueOffset, valueLength, 403, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.E_F_P_TRACKING_ERROR:
                hasEFPTrackingError = true;
                eFPTrackingError = getFloat(buffer, eFPTrackingError, valueOffset, valueLength, 405, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FAIR_VALUE:
                hasFairValue = true;
                fairValue = getFloat(buffer, fairValue, valueOffset, valueLength, 406, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OUTSIDE_INDEX_PCT:
                hasOutsideIndexPct = true;
                outsideIndexPct = getFloat(buffer, outsideIndexPct, valueOffset, valueLength, 407, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.VALUE_OF_FUTURES:
                hasValueOfFutures = true;
                valueOfFutures = getFloat(buffer, valueOfFutures, valueOffset, valueLength, 408, CODEC_VALIDATION_ENABLED);
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
        this.resetBidDescriptorType();
        this.resetBidDescriptor();
        this.resetSideValueInd();
        this.resetLiquidityValue();
        this.resetLiquidityNumSecurities();
        this.resetLiquidityPctLow();
        this.resetLiquidityPctHigh();
        this.resetEFPTrackingError();
        this.resetFairValue();
        this.resetOutsideIndexPct();
        this.resetValueOfFutures();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetBidDescriptorType()
    {
        hasBidDescriptorType = false;
    }

    public void resetBidDescriptor()
    {
        hasBidDescriptor = false;
    }

    public void resetSideValueInd()
    {
        hasSideValueInd = false;
    }

    public void resetLiquidityValue()
    {
        hasLiquidityValue = false;
    }

    public void resetLiquidityNumSecurities()
    {
        hasLiquidityNumSecurities = false;
    }

    public void resetLiquidityPctLow()
    {
        hasLiquidityPctLow = false;
    }

    public void resetLiquidityPctHigh()
    {
        hasLiquidityPctHigh = false;
    }

    public void resetEFPTrackingError()
    {
        hasEFPTrackingError = false;
    }

    public void resetFairValue()
    {
        hasFairValue = false;
    }

    public void resetOutsideIndexPct()
    {
        hasOutsideIndexPct = false;
    }

    public void resetValueOfFutures()
    {
        hasValueOfFutures = false;
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
        builder.append("\"MessageName\": \"BidDescriptorsGroup\",\n");
        if (hasBidDescriptorType())
        {
            indent(builder, level);
            builder.append("\"BidDescriptorType\": \"");
            builder.append(bidDescriptorType);
            builder.append("\",\n");
        }

        if (hasBidDescriptor())
        {
            indent(builder, level);
            builder.append("\"BidDescriptor\": \"");
            builder.append(this.bidDescriptor(), 0, bidDescriptorLength());
            builder.append("\",\n");
        }

        if (hasSideValueInd())
        {
            indent(builder, level);
            builder.append("\"SideValueInd\": \"");
            builder.append(sideValueInd);
            builder.append("\",\n");
        }

        if (hasLiquidityValue())
        {
            indent(builder, level);
            builder.append("\"LiquidityValue\": \"");
            liquidityValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLiquidityNumSecurities())
        {
            indent(builder, level);
            builder.append("\"LiquidityNumSecurities\": \"");
            builder.append(liquidityNumSecurities);
            builder.append("\",\n");
        }

        if (hasLiquidityPctLow())
        {
            indent(builder, level);
            builder.append("\"LiquidityPctLow\": \"");
            liquidityPctLow.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasLiquidityPctHigh())
        {
            indent(builder, level);
            builder.append("\"LiquidityPctHigh\": \"");
            liquidityPctHigh.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasEFPTrackingError())
        {
            indent(builder, level);
            builder.append("\"EFPTrackingError\": \"");
            eFPTrackingError.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasFairValue())
        {
            indent(builder, level);
            builder.append("\"FairValue\": \"");
            fairValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasOutsideIndexPct())
        {
            indent(builder, level);
            builder.append("\"OutsideIndexPct\": \"");
            outsideIndexPct.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasValueOfFutures())
        {
            indent(builder, level);
            builder.append("\"ValueOfFutures\": \"");
            valueOfFutures.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidDescriptorsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((BidDescriptorsGroupEncoder)encoder);
    }

    public BidDescriptorsGroupEncoder toEncoder(final BidDescriptorsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasBidDescriptorType())
        {
            encoder.bidDescriptorType(this.bidDescriptorType());
        }

        if (hasBidDescriptor())
        {
            encoder.bidDescriptor(this.bidDescriptor(), 0, bidDescriptorLength());
        }

        if (hasSideValueInd())
        {
            encoder.sideValueInd(this.sideValueInd());
        }

        if (hasLiquidityValue())
        {
            encoder.liquidityValue(this.liquidityValue());
        }

        if (hasLiquidityNumSecurities())
        {
            encoder.liquidityNumSecurities(this.liquidityNumSecurities());
        }

        if (hasLiquidityPctLow())
        {
            encoder.liquidityPctLow(this.liquidityPctLow());
        }

        if (hasLiquidityPctHigh())
        {
            encoder.liquidityPctHigh(this.liquidityPctHigh());
        }

        if (hasEFPTrackingError())
        {
            encoder.eFPTrackingError(this.eFPTrackingError());
        }

        if (hasFairValue())
        {
            encoder.fairValue(this.fairValue());
        }

        if (hasOutsideIndexPct())
        {
            encoder.outsideIndexPct(this.outsideIndexPct());
        }

        if (hasValueOfFutures())
        {
            encoder.valueOfFutures(this.valueOfFutures());
        }
        return encoder;
    }

}
    public class BidDescriptorsGroupIterator implements Iterable<BidDescriptorsGroupDecoder>, java.util.Iterator<BidDescriptorsGroupDecoder>
    {
        private final BidRequestDecoder parent;
        private int remainder;
        private BidDescriptorsGroupDecoder current;

        public BidDescriptorsGroupIterator(final BidRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public BidDescriptorsGroupDecoder next()
        {
            remainder--;
            final BidDescriptorsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoBidDescriptorsGroupCounter() ? parent.noBidDescriptorsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.bidDescriptorsGroup();
        }
        public BidDescriptorsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }


    private BidDescriptorsGroupDecoder bidDescriptorsGroup = null;
    public BidDescriptorsGroupDecoder bidDescriptorsGroup()
    {
        return bidDescriptorsGroup;
    }

    private int noBidDescriptorsGroupCounter = MISSING_INT;

    private boolean hasNoBidDescriptorsGroupCounter;

    public int noBidDescriptorsGroupCounter()
    {
        if (!hasNoBidDescriptorsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoBidDescriptorsGroupCounter");
        }

        return noBidDescriptorsGroupCounter;
    }

    public boolean hasNoBidDescriptorsGroupCounter()
    {
        return hasNoBidDescriptorsGroupCounter;
    }




    private BidDescriptorsGroupIterator bidDescriptorsGroupIterator = new BidDescriptorsGroupIterator(this);
    public BidDescriptorsGroupIterator bidDescriptorsGroupIterator()
    {
        return bidDescriptorsGroupIterator.iterator();
    }



public class BidComponentsGroupDecoder extends CommonDecoderImpl
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(18);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.LIST_ID);
            ALL_GROUP_FIELDS.add(Constants.SIDE);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
            ALL_GROUP_FIELDS.add(Constants.NET_GROSS_IND);
            ALL_GROUP_FIELDS.add(Constants.SETTL_TYPE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_DATE);
            ALL_GROUP_FIELDS.add(Constants.ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
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
        if (hasSide)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
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

        if (hasSettlType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlType.isValid(settlType()))
        {
            invalidTagId = 63;
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
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public BidComponentsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private BidComponentsGroupDecoder next = null;

    public BidComponentsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(18);

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


    private char side = MISSING_CHAR;

    private boolean hasSide;

    public char side()
    {
        if (!hasSide)
        {
            throw new IllegalArgumentException("No value for optional field: Side");
        }

        return side;
    }

    public boolean hasSide()
    {
        return hasSide;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        if (!hasSide)
 return Side.NULL_VAL;
        return Side.decode(side);
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

    private char settlType = MISSING_CHAR;

    private boolean hasSettlType;

    public char settlType()
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



    private final CharArrayWrapper settlTypeWrapper = new CharArrayWrapper();
    public SettlType settlTypeAsEnum()
    {
        if (!hasSettlType)
 return SettlType.NULL_VAL;
        return SettlType.decode(settlType);
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

    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode BidComponentsGroup
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
                    next = new BidComponentsGroupDecoder(trailer, messageFields);
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
            case Constants.LIST_ID:
                hasListID = true;
                listID = buffer.getChars(listID, valueOffset, valueLength);
                listIDOffset = valueOffset;
                listIDLength = valueLength;
                break;

            case Constants.SIDE:
                hasSide = true;
                side = buffer.getChar(valueOffset);
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

            case Constants.NET_GROSS_IND:
                hasNetGrossInd = true;
                netGrossInd = getInt(buffer, valueOffset, endOfField, 430, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_TYPE:
                hasSettlType = true;
                settlType = buffer.getChar(valueOffset);
                break;

            case Constants.SETTL_DATE:
                hasSettlDate = true;
                settlDate = buffer.getBytes(settlDate, valueOffset, valueLength);
                settlDateOffset = valueOffset;
                settlDateLength = valueLength;
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
        this.resetListID();
        this.resetSide();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetNetGrossInd();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetAccount();
        this.resetAcctIDSource();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetListID()
    {
        hasListID = false;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSettlType()
    {
        hasSettlType = false;
    }

    public void resetSettlDate()
    {
        hasSettlDate = false;
    }

    public void resetAccount()
    {
        hasAccount = false;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
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
        builder.append("\"MessageName\": \"BidComponentsGroup\",\n");
        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            builder.append(this.listID(), 0, listIDLength());
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
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

        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            builder.append(settlType);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendData(builder, settlDate, settlDateLength);
            builder.append("\",\n");
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidComponentsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((BidComponentsGroupEncoder)encoder);
    }

    public BidComponentsGroupEncoder toEncoder(final BidComponentsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasListID())
        {
            encoder.listID(this.listID(), 0, listIDLength());
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }

        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSettlType())
        {
            encoder.settlType(this.settlType());
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(this.settlDate(), 0, settlDateLength());
        }

        if (hasAccount())
        {
            encoder.account(this.account(), 0, accountLength());
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }
        return encoder;
    }

}
    public class BidComponentsGroupIterator implements Iterable<BidComponentsGroupDecoder>, java.util.Iterator<BidComponentsGroupDecoder>
    {
        private final BidRequestDecoder parent;
        private int remainder;
        private BidComponentsGroupDecoder current;

        public BidComponentsGroupIterator(final BidRequestDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public BidComponentsGroupDecoder next()
        {
            remainder--;
            final BidComponentsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoBidComponentsGroupCounter() ? parent.noBidComponentsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.bidComponentsGroup();
        }
        public BidComponentsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }


    private BidComponentsGroupDecoder bidComponentsGroup = null;
    public BidComponentsGroupDecoder bidComponentsGroup()
    {
        return bidComponentsGroup;
    }

    private int noBidComponentsGroupCounter = MISSING_INT;

    private boolean hasNoBidComponentsGroupCounter;

    public int noBidComponentsGroupCounter()
    {
        if (!hasNoBidComponentsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoBidComponentsGroupCounter");
        }

        return noBidComponentsGroupCounter;
    }

    public boolean hasNoBidComponentsGroupCounter()
    {
        return hasNoBidComponentsGroupCounter;
    }




    private BidComponentsGroupIterator bidComponentsGroupIterator = new BidComponentsGroupIterator(this);
    public BidComponentsGroupIterator bidComponentsGroupIterator()
    {
        return bidComponentsGroupIterator.iterator();
    }

    private int liquidityIndType = MISSING_INT;

    private boolean hasLiquidityIndType;

    public int liquidityIndType()
    {
        if (!hasLiquidityIndType)
        {
            throw new IllegalArgumentException("No value for optional field: LiquidityIndType");
        }

        return liquidityIndType;
    }

    public boolean hasLiquidityIndType()
    {
        return hasLiquidityIndType;
    }



    private final CharArrayWrapper liquidityIndTypeWrapper = new CharArrayWrapper();
    public LiquidityIndType liquidityIndTypeAsEnum()
    {
        if (!hasLiquidityIndType)
 return LiquidityIndType.NULL_VAL;
        return LiquidityIndType.decode(liquidityIndType);
    }

    private DecimalFloat wtAverageLiquidity = DecimalFloat.newNaNValue();

    private boolean hasWtAverageLiquidity;

    public DecimalFloat wtAverageLiquidity()
    {
        if (!hasWtAverageLiquidity)
        {
            throw new IllegalArgumentException("No value for optional field: WtAverageLiquidity");
        }

        return wtAverageLiquidity;
    }

    public boolean hasWtAverageLiquidity()
    {
        return hasWtAverageLiquidity;
    }



    private boolean exchangeForPhysical;

    private boolean hasExchangeForPhysical;

    public boolean exchangeForPhysical()
    {
        if (!hasExchangeForPhysical)
        {
            throw new IllegalArgumentException("No value for optional field: ExchangeForPhysical");
        }

        return exchangeForPhysical;
    }

    public boolean hasExchangeForPhysical()
    {
        return hasExchangeForPhysical;
    }



    private DecimalFloat outMainCntryUIndex = DecimalFloat.newNaNValue();

    private boolean hasOutMainCntryUIndex;

    public DecimalFloat outMainCntryUIndex()
    {
        if (!hasOutMainCntryUIndex)
        {
            throw new IllegalArgumentException("No value for optional field: OutMainCntryUIndex");
        }

        return outMainCntryUIndex;
    }

    public boolean hasOutMainCntryUIndex()
    {
        return hasOutMainCntryUIndex;
    }



    private DecimalFloat crossPercent = DecimalFloat.newNaNValue();

    private boolean hasCrossPercent;

    public DecimalFloat crossPercent()
    {
        if (!hasCrossPercent)
        {
            throw new IllegalArgumentException("No value for optional field: CrossPercent");
        }

        return crossPercent;
    }

    public boolean hasCrossPercent()
    {
        return hasCrossPercent;
    }



    private int progRptReqs = MISSING_INT;

    private boolean hasProgRptReqs;

    public int progRptReqs()
    {
        if (!hasProgRptReqs)
        {
            throw new IllegalArgumentException("No value for optional field: ProgRptReqs");
        }

        return progRptReqs;
    }

    public boolean hasProgRptReqs()
    {
        return hasProgRptReqs;
    }



    private final CharArrayWrapper progRptReqsWrapper = new CharArrayWrapper();
    public ProgRptReqs progRptReqsAsEnum()
    {
        if (!hasProgRptReqs)
 return ProgRptReqs.NULL_VAL;
        return ProgRptReqs.decode(progRptReqs);
    }

    private int progPeriodInterval = MISSING_INT;

    private boolean hasProgPeriodInterval;

    public int progPeriodInterval()
    {
        if (!hasProgPeriodInterval)
        {
            throw new IllegalArgumentException("No value for optional field: ProgPeriodInterval");
        }

        return progPeriodInterval;
    }

    public boolean hasProgPeriodInterval()
    {
        return hasProgPeriodInterval;
    }



    private int incTaxInd = MISSING_INT;

    private boolean hasIncTaxInd;

    public int incTaxInd()
    {
        if (!hasIncTaxInd)
        {
            throw new IllegalArgumentException("No value for optional field: IncTaxInd");
        }

        return incTaxInd;
    }

    public boolean hasIncTaxInd()
    {
        return hasIncTaxInd;
    }



    private final CharArrayWrapper incTaxIndWrapper = new CharArrayWrapper();
    public IncTaxInd incTaxIndAsEnum()
    {
        if (!hasIncTaxInd)
 return IncTaxInd.NULL_VAL;
        return IncTaxInd.decode(incTaxInd);
    }

    private boolean forexReq;

    private boolean hasForexReq;

    public boolean forexReq()
    {
        if (!hasForexReq)
        {
            throw new IllegalArgumentException("No value for optional field: ForexReq");
        }

        return forexReq;
    }

    public boolean hasForexReq()
    {
        return hasForexReq;
    }



    private int numBidders = MISSING_INT;

    private boolean hasNumBidders;

    public int numBidders()
    {
        if (!hasNumBidders)
        {
            throw new IllegalArgumentException("No value for optional field: NumBidders");
        }

        return numBidders;
    }

    public boolean hasNumBidders()
    {
        return hasNumBidders;
    }



    private byte[] tradeDate = new byte[8];

    private boolean hasTradeDate;

    public byte[] tradeDate()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDate;
    }

    public boolean hasTradeDate()
    {
        return hasTradeDate;
    }


    private int tradeDateOffset;

    private int tradeDateLength;

    public int tradeDateLength()
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        return tradeDateLength;
    }

    public String tradeDateAsString()
    {
        return hasTradeDate ? new String(tradeDate, 0, tradeDateLength) : null;
    }

    public void tradeDate(final AsciiSequenceView view)
    {
        if (!hasTradeDate)
        {
            throw new IllegalArgumentException("No value for optional field: TradeDate");
        }

        view.wrap(buffer, tradeDateOffset, tradeDateLength);
    }


    private char bidTradeType = MISSING_CHAR;

    public char bidTradeType()
    {
        return bidTradeType;
    }



    private final CharArrayWrapper bidTradeTypeWrapper = new CharArrayWrapper();
    public BidTradeType bidTradeTypeAsEnum()
    {
        return BidTradeType.decode(bidTradeType);
    }

    private char basisPxType = MISSING_CHAR;

    public char basisPxType()
    {
        return basisPxType;
    }



    private final CharArrayWrapper basisPxTypeWrapper = new CharArrayWrapper();
    public BasisPxType basisPxTypeAsEnum()
    {
        return BasisPxType.decode(basisPxType);
    }

    private byte[] strikeTime = new byte[24];

    private boolean hasStrikeTime;

    public byte[] strikeTime()
    {
        if (!hasStrikeTime)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeTime");
        }

        return strikeTime;
    }

    public boolean hasStrikeTime()
    {
        return hasStrikeTime;
    }


    private int strikeTimeOffset;

    private int strikeTimeLength;

    public int strikeTimeLength()
    {
        if (!hasStrikeTime)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeTime");
        }

        return strikeTimeLength;
    }

    public String strikeTimeAsString()
    {
        return hasStrikeTime ? new String(strikeTime, 0, strikeTimeLength) : null;
    }

    public void strikeTime(final AsciiSequenceView view)
    {
        if (!hasStrikeTime)
        {
            throw new IllegalArgumentException("No value for optional field: StrikeTime");
        }

        view.wrap(buffer, strikeTimeOffset, strikeTimeLength);
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
        // Decode BidRequest
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
            case Constants.BID_ID:
                hasBidID = true;
                bidID = buffer.getChars(bidID, valueOffset, valueLength);
                bidIDOffset = valueOffset;
                bidIDLength = valueLength;
                break;

            case Constants.CLIENT_BID_ID:
                clientBidID = buffer.getChars(clientBidID, valueOffset, valueLength);
                clientBidIDOffset = valueOffset;
                clientBidIDLength = valueLength;
                break;

            case Constants.BID_REQUEST_TRANS_TYPE:
                bidRequestTransType = buffer.getChar(valueOffset);
                break;

            case Constants.LIST_NAME:
                hasListName = true;
                listName = buffer.getChars(listName, valueOffset, valueLength);
                listNameOffset = valueOffset;
                listNameLength = valueLength;
                break;

            case Constants.TOT_NO_RELATED_SYM:
                totNoRelatedSym = getInt(buffer, valueOffset, endOfField, 393, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.BID_TYPE:
                bidType = getInt(buffer, valueOffset, endOfField, 394, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NUM_TICKETS:
                hasNumTickets = true;
                numTickets = getInt(buffer, valueOffset, endOfField, 395, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CURRENCY:
                hasCurrency = true;
                currency = buffer.getChars(currency, valueOffset, valueLength);
                currencyOffset = valueOffset;
                currencyLength = valueLength;
                break;

            case Constants.SIDE_VALUE1:
                hasSideValue1 = true;
                sideValue1 = getFloat(buffer, sideValue1, valueOffset, valueLength, 396, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE_VALUE2:
                hasSideValue2 = true;
                sideValue2 = getFloat(buffer, sideValue2, valueOffset, valueLength, 397, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_BID_DESCRIPTORS:
                hasNoBidDescriptorsGroupCounter = true;
                noBidDescriptorsGroupCounter = getInt(buffer, valueOffset, endOfField, 398, CODEC_VALIDATION_ENABLED);
                if (bidDescriptorsGroup == null)
                {
                    bidDescriptorsGroup = new BidDescriptorsGroupDecoder(trailer, messageFields);
                }
                BidDescriptorsGroupDecoder bidDescriptorsGroupCurrent = bidDescriptorsGroup;
                position = endOfField + 1;
                final int noBidDescriptorsGroupCounter = this.noBidDescriptorsGroupCounter;
                for (int i = 0; i < noBidDescriptorsGroupCounter && position < end; i++)
                {
                    if (bidDescriptorsGroupCurrent != null)
                    {
                        position += bidDescriptorsGroupCurrent.decode(buffer, position, end - position);
                        bidDescriptorsGroupCurrent = bidDescriptorsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (bidDescriptorsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;

            case Constants.NO_BID_COMPONENTS:
                hasNoBidComponentsGroupCounter = true;
                noBidComponentsGroupCounter = getInt(buffer, valueOffset, endOfField, 420, CODEC_VALIDATION_ENABLED);
                if (bidComponentsGroup == null)
                {
                    bidComponentsGroup = new BidComponentsGroupDecoder(trailer, messageFields);
                }
                BidComponentsGroupDecoder bidComponentsGroupCurrent = bidComponentsGroup;
                position = endOfField + 1;
                final int noBidComponentsGroupCounter = this.noBidComponentsGroupCounter;
                for (int i = 0; i < noBidComponentsGroupCounter && position < end; i++)
                {
                    if (bidComponentsGroupCurrent != null)
                    {
                        position += bidComponentsGroupCurrent.decode(buffer, position, end - position);
                        bidComponentsGroupCurrent = bidComponentsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (bidComponentsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;

            case Constants.LIQUIDITY_IND_TYPE:
                hasLiquidityIndType = true;
                liquidityIndType = getInt(buffer, valueOffset, endOfField, 409, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.WT_AVERAGE_LIQUIDITY:
                hasWtAverageLiquidity = true;
                wtAverageLiquidity = getFloat(buffer, wtAverageLiquidity, valueOffset, valueLength, 410, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.EXCHANGE_FOR_PHYSICAL:
                hasExchangeForPhysical = true;
                exchangeForPhysical = buffer.getBoolean(valueOffset);
                break;

            case Constants.OUT_MAIN_CNTRY_U_INDEX:
                hasOutMainCntryUIndex = true;
                outMainCntryUIndex = getFloat(buffer, outMainCntryUIndex, valueOffset, valueLength, 412, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CROSS_PERCENT:
                hasCrossPercent = true;
                crossPercent = getFloat(buffer, crossPercent, valueOffset, valueLength, 413, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PROG_RPT_REQS:
                hasProgRptReqs = true;
                progRptReqs = getInt(buffer, valueOffset, endOfField, 414, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PROG_PERIOD_INTERVAL:
                hasProgPeriodInterval = true;
                progPeriodInterval = getInt(buffer, valueOffset, endOfField, 415, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.INC_TAX_IND:
                hasIncTaxInd = true;
                incTaxInd = getInt(buffer, valueOffset, endOfField, 416, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.FOREX_REQ:
                hasForexReq = true;
                forexReq = buffer.getBoolean(valueOffset);
                break;

            case Constants.NUM_BIDDERS:
                hasNumBidders = true;
                numBidders = getInt(buffer, valueOffset, endOfField, 417, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.BID_TRADE_TYPE:
                bidTradeType = buffer.getChar(valueOffset);
                break;

            case Constants.BASIS_PX_TYPE:
                basisPxType = buffer.getChar(valueOffset);
                break;

            case Constants.STRIKE_TIME:
                hasStrikeTime = true;
                strikeTime = buffer.getBytes(strikeTime, valueOffset, valueLength);
                strikeTimeOffset = valueOffset;
                strikeTimeLength = valueLength;
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
        this.resetBidID();
        this.resetClientBidID();
        this.resetBidRequestTransType();
        this.resetListName();
        this.resetTotNoRelatedSym();
        this.resetBidType();
        this.resetNumTickets();
        this.resetCurrency();
        this.resetSideValue1();
        this.resetSideValue2();
        this.resetLiquidityIndType();
        this.resetWtAverageLiquidity();
        this.resetExchangeForPhysical();
        this.resetOutMainCntryUIndex();
        this.resetCrossPercent();
        this.resetProgRptReqs();
        this.resetProgPeriodInterval();
        this.resetIncTaxInd();
        this.resetForexReq();
        this.resetNumBidders();
        this.resetTradeDate();
        this.resetBidTradeType();
        this.resetBasisPxType();
        this.resetStrikeTime();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetBidDescriptorsGroup();
        this.resetBidComponentsGroup();
    }

    public void resetBidID()
    {
        hasBidID = false;
    }

    public void resetClientBidID()
    {
        clientBidIDOffset = 0;
        clientBidIDLength = 0;
    }

    public void resetBidRequestTransType()
    {
        bidRequestTransType = MISSING_CHAR;
    }

    public void resetListName()
    {
        hasListName = false;
    }

    public void resetTotNoRelatedSym()
    {
        totNoRelatedSym = MISSING_INT;
    }

    public void resetBidType()
    {
        bidType = MISSING_INT;
    }

    public void resetNumTickets()
    {
        hasNumTickets = false;
    }

    public void resetCurrency()
    {
        hasCurrency = false;
    }

    public void resetSideValue1()
    {
        hasSideValue1 = false;
    }

    public void resetSideValue2()
    {
        hasSideValue2 = false;
    }

    public void resetLiquidityIndType()
    {
        hasLiquidityIndType = false;
    }

    public void resetWtAverageLiquidity()
    {
        hasWtAverageLiquidity = false;
    }

    public void resetExchangeForPhysical()
    {
        hasExchangeForPhysical = false;
    }

    public void resetOutMainCntryUIndex()
    {
        hasOutMainCntryUIndex = false;
    }

    public void resetCrossPercent()
    {
        hasCrossPercent = false;
    }

    public void resetProgRptReqs()
    {
        hasProgRptReqs = false;
    }

    public void resetProgPeriodInterval()
    {
        hasProgPeriodInterval = false;
    }

    public void resetIncTaxInd()
    {
        hasIncTaxInd = false;
    }

    public void resetForexReq()
    {
        hasForexReq = false;
    }

    public void resetNumBidders()
    {
        hasNumBidders = false;
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetBidTradeType()
    {
        bidTradeType = MISSING_CHAR;
    }

    public void resetBasisPxType()
    {
        basisPxType = MISSING_CHAR;
    }

    public void resetStrikeTime()
    {
        hasStrikeTime = false;
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

    public void resetBidDescriptorsGroup()
    {
        for (final BidDescriptorsGroupDecoder bidDescriptorsGroupDecoder : bidDescriptorsGroupIterator.iterator())
        {
            bidDescriptorsGroupDecoder.reset();
            if (bidDescriptorsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noBidDescriptorsGroupCounter = MISSING_INT;
        hasNoBidDescriptorsGroupCounter = false;
    }

    public void resetBidComponentsGroup()
    {
        for (final BidComponentsGroupDecoder bidComponentsGroupDecoder : bidComponentsGroupIterator.iterator())
        {
            bidComponentsGroupDecoder.reset();
            if (bidComponentsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noBidComponentsGroupCounter = MISSING_INT;
        hasNoBidComponentsGroupCounter = false;
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
        builder.append("\"MessageName\": \"BidRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        if (hasBidID())
        {
            indent(builder, level);
            builder.append("\"BidID\": \"");
            builder.append(this.bidID(), 0, bidIDLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"ClientBidID\": \"");
        builder.append(this.clientBidID(), 0, clientBidIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"BidRequestTransType\": \"");
        builder.append(bidRequestTransType);
        builder.append("\",\n");

        if (hasListName())
        {
            indent(builder, level);
            builder.append("\"ListName\": \"");
            builder.append(this.listName(), 0, listNameLength());
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"TotNoRelatedSym\": \"");
        builder.append(totNoRelatedSym);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"BidType\": \"");
        builder.append(bidType);
        builder.append("\",\n");

        if (hasNumTickets())
        {
            indent(builder, level);
            builder.append("\"NumTickets\": \"");
            builder.append(numTickets);
            builder.append("\",\n");
        }

        if (hasCurrency())
        {
            indent(builder, level);
            builder.append("\"Currency\": \"");
            builder.append(this.currency(), 0, currencyLength());
            builder.append("\",\n");
        }

        if (hasSideValue1())
        {
            indent(builder, level);
            builder.append("\"SideValue1\": \"");
            sideValue1.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSideValue2())
        {
            indent(builder, level);
            builder.append("\"SideValue2\": \"");
            sideValue2.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoBidDescriptorsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"BidDescriptorsGroup\": [\n");
        BidDescriptorsGroupDecoder bidDescriptorsGroup = this.bidDescriptorsGroup;
        for (int i = 0, size = this.noBidDescriptorsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            bidDescriptorsGroup.appendTo(builder, level + 1);            if (bidDescriptorsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            bidDescriptorsGroup = bidDescriptorsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoBidComponentsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"BidComponentsGroup\": [\n");
        BidComponentsGroupDecoder bidComponentsGroup = this.bidComponentsGroup;
        for (int i = 0, size = this.noBidComponentsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            bidComponentsGroup.appendTo(builder, level + 1);            if (bidComponentsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            bidComponentsGroup = bidComponentsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasLiquidityIndType())
        {
            indent(builder, level);
            builder.append("\"LiquidityIndType\": \"");
            builder.append(liquidityIndType);
            builder.append("\",\n");
        }

        if (hasWtAverageLiquidity())
        {
            indent(builder, level);
            builder.append("\"WtAverageLiquidity\": \"");
            wtAverageLiquidity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasExchangeForPhysical())
        {
            indent(builder, level);
            builder.append("\"ExchangeForPhysical\": \"");
            builder.append(exchangeForPhysical);
            builder.append("\",\n");
        }

        if (hasOutMainCntryUIndex())
        {
            indent(builder, level);
            builder.append("\"OutMainCntryUIndex\": \"");
            outMainCntryUIndex.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasCrossPercent())
        {
            indent(builder, level);
            builder.append("\"CrossPercent\": \"");
            crossPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasProgRptReqs())
        {
            indent(builder, level);
            builder.append("\"ProgRptReqs\": \"");
            builder.append(progRptReqs);
            builder.append("\",\n");
        }

        if (hasProgPeriodInterval())
        {
            indent(builder, level);
            builder.append("\"ProgPeriodInterval\": \"");
            builder.append(progPeriodInterval);
            builder.append("\",\n");
        }

        if (hasIncTaxInd())
        {
            indent(builder, level);
            builder.append("\"IncTaxInd\": \"");
            builder.append(incTaxInd);
            builder.append("\",\n");
        }

        if (hasForexReq())
        {
            indent(builder, level);
            builder.append("\"ForexReq\": \"");
            builder.append(forexReq);
            builder.append("\",\n");
        }

        if (hasNumBidders())
        {
            indent(builder, level);
            builder.append("\"NumBidders\": \"");
            builder.append(numBidders);
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"BidTradeType\": \"");
        builder.append(bidTradeType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"BasisPxType\": \"");
        builder.append(basisPxType);
        builder.append("\",\n");

        if (hasStrikeTime())
        {
            indent(builder, level);
            builder.append("\"StrikeTime\": \"");
            appendData(builder, strikeTime, strikeTimeLength);
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
    public BidRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((BidRequestEncoder)encoder);
    }

    public BidRequestEncoder toEncoder(final BidRequestEncoder encoder)
    {
        encoder.reset();
        if (hasBidID())
        {
            encoder.bidID(this.bidID(), 0, bidIDLength());
        }

        encoder.clientBidID(this.clientBidID(), 0, clientBidIDLength());
        encoder.bidRequestTransType(this.bidRequestTransType());
        if (hasListName())
        {
            encoder.listName(this.listName(), 0, listNameLength());
        }

        encoder.totNoRelatedSym(this.totNoRelatedSym());
        encoder.bidType(this.bidType());
        if (hasNumTickets())
        {
            encoder.numTickets(this.numTickets());
        }

        if (hasCurrency())
        {
            encoder.currency(this.currency(), 0, currencyLength());
        }

        if (hasSideValue1())
        {
            encoder.sideValue1(this.sideValue1());
        }

        if (hasSideValue2())
        {
            encoder.sideValue2(this.sideValue2());
        }

        if (hasNoBidDescriptorsGroupCounter)
        {
            final int size = this.noBidDescriptorsGroupCounter;
            BidDescriptorsGroupDecoder bidDescriptorsGroup = this.bidDescriptorsGroup;
            BidDescriptorsGroupEncoder bidDescriptorsGroupEncoder = encoder.bidDescriptorsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidDescriptorsGroup != null)
                {
                    bidDescriptorsGroup.toEncoder(bidDescriptorsGroupEncoder);
                    bidDescriptorsGroup = bidDescriptorsGroup.next();
                    bidDescriptorsGroupEncoder = bidDescriptorsGroupEncoder.next();
                }
            }
        }

        if (hasNoBidComponentsGroupCounter)
        {
            final int size = this.noBidComponentsGroupCounter;
            BidComponentsGroupDecoder bidComponentsGroup = this.bidComponentsGroup;
            BidComponentsGroupEncoder bidComponentsGroupEncoder = encoder.bidComponentsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidComponentsGroup != null)
                {
                    bidComponentsGroup.toEncoder(bidComponentsGroupEncoder);
                    bidComponentsGroup = bidComponentsGroup.next();
                    bidComponentsGroupEncoder = bidComponentsGroupEncoder.next();
                }
            }
        }

        if (hasLiquidityIndType())
        {
            encoder.liquidityIndType(this.liquidityIndType());
        }

        if (hasWtAverageLiquidity())
        {
            encoder.wtAverageLiquidity(this.wtAverageLiquidity());
        }

        if (hasExchangeForPhysical())
        {
            encoder.exchangeForPhysical(this.exchangeForPhysical());
        }

        if (hasOutMainCntryUIndex())
        {
            encoder.outMainCntryUIndex(this.outMainCntryUIndex());
        }

        if (hasCrossPercent())
        {
            encoder.crossPercent(this.crossPercent());
        }

        if (hasProgRptReqs())
        {
            encoder.progRptReqs(this.progRptReqs());
        }

        if (hasProgPeriodInterval())
        {
            encoder.progPeriodInterval(this.progPeriodInterval());
        }

        if (hasIncTaxInd())
        {
            encoder.incTaxInd(this.incTaxInd());
        }

        if (hasForexReq())
        {
            encoder.forexReq(this.forexReq());
        }

        if (hasNumBidders())
        {
            encoder.numBidders(this.numBidders());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        encoder.bidTradeType(this.bidTradeType());
        encoder.basisPxType(this.basisPxType());
        if (hasStrikeTime())
        {
            encoder.strikeTimeAsCopy(this.strikeTime(), 0, strikeTimeLength());
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
