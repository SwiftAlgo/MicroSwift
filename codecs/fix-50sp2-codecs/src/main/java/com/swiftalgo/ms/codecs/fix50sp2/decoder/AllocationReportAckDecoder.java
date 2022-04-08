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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocationReportAckEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocAckGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AllocAckGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;


public class AllocationReportAckDecoder extends CommonDecoderImpl implements PartiesDecoder, AllocAckGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(2);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.ALLOC_REPORT_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(38);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ALLOC_REPORT_ID);
            GROUP_FIELDS.add(Constants.ALLOC_ID);
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.AVG_PX_INDICATOR);
            GROUP_FIELDS.add(Constants.QUANTITY);
            GROUP_FIELDS.add(Constants.ALLOC_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.SECONDARY_ALLOC_ID);
            GROUP_FIELDS.add(Constants.TRADE_DATE);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.ALLOC_STATUS);
            GROUP_FIELDS.add(Constants.ALLOC_REJ_CODE);
            GROUP_FIELDS.add(Constants.ALLOC_REPORT_TYPE);
            GROUP_FIELDS.add(Constants.ALLOC_INTERMED_REQ_TYPE);
            GROUP_FIELDS.add(Constants.MATCH_STATUS);
            GROUP_FIELDS.add(Constants.PRODUCT);
            GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_TEXT);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(38);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(2);

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
        if (hasAvgPxIndicator)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AvgPxIndicator.isValid(avgPxIndicator()))
        {
            invalidTagId = 819;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocTransType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocTransType.isValid(allocTransType()))
        {
            invalidTagId = 71;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocStatus.isValid(allocStatus()))
        {
            invalidTagId = 87;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocRejCode)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocRejCode.isValid(allocRejCode()))
        {
            invalidTagId = 88;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocReportType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocReportType.isValid(allocReportType()))
        {
            invalidTagId = 794;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocIntermedReqType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocIntermedReqType.isValid(allocIntermedReqType()))
        {
            invalidTagId = 808;
            rejectReason = 5;
            return false;
        }
        }

        if (hasMatchStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MatchStatus.isValid(matchStatus()))
        {
            invalidTagId = 573;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProduct)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Product.isValid(product()))
        {
            invalidTagId = 460;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityType)
        {
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityType.isValid(securityTypeWrapper))
        {
            invalidTagId = 167;
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
        return true;
    }

    public static final long MESSAGE_TYPE = 21569L;

    public static final String MESSAGE_TYPE_AS_STRING = "AT";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(158);

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
        messageFields.add(Constants.ALLOC_REPORT_ID);
        messageFields.add(Constants.ALLOC_ID);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.AVG_PX_INDICATOR);
        messageFields.add(Constants.QUANTITY);
        messageFields.add(Constants.ALLOC_TRANS_TYPE);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.SECONDARY_ALLOC_ID);
        messageFields.add(Constants.TRADE_DATE);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.ALLOC_STATUS);
        messageFields.add(Constants.ALLOC_REJ_CODE);
        messageFields.add(Constants.ALLOC_REPORT_TYPE);
        messageFields.add(Constants.ALLOC_INTERMED_REQ_TYPE);
        messageFields.add(Constants.MATCH_STATUS);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.TEXT);
        messageFields.add(Constants.ENCODED_TEXT_LEN);
        messageFields.add(Constants.ENCODED_TEXT);
        messageFields.add(Constants.NO_ALLOCS_GROUP_COUNTER);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.ALLOC_PRICE);
        messageFields.add(Constants.ALLOC_POSITION_EFFECT);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_REJ_CODE);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ALLOC_TEXT);
        messageFields.add(Constants.ENCODED_ALLOC_TEXT_LEN);
        messageFields.add(Constants.ENCODED_ALLOC_TEXT);
        messageFields.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
        messageFields.add(Constants.ALLOC_CUSTOMER_CAPACITY);
        messageFields.add(Constants.INDIVIDUAL_ALLOC_TYPE);
        messageFields.add(Constants.ALLOC_QTY);
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

    private char[] allocReportID = new char[1];

    public char[] allocReportID()
    {
        return allocReportID;
    }


    private int allocReportIDOffset;

    private int allocReportIDLength;

    public int allocReportIDLength()
    {
        return allocReportIDLength;
    }

    public String allocReportIDAsString()
    {
        return new String(allocReportID, 0, allocReportIDLength);
    }

    public void allocReportID(final AsciiSequenceView view)
    {
        view.wrap(buffer, allocReportIDOffset, allocReportIDLength);
    }


    private final CharArrayWrapper allocReportIDWrapper = new CharArrayWrapper();
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
    private byte[] clearingBusinessDate = new byte[8];

    private boolean hasClearingBusinessDate;

    public byte[] clearingBusinessDate()
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        return clearingBusinessDate;
    }

    public boolean hasClearingBusinessDate()
    {
        return hasClearingBusinessDate;
    }


    private int clearingBusinessDateOffset;

    private int clearingBusinessDateLength;

    public int clearingBusinessDateLength()
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        return clearingBusinessDateLength;
    }

    public String clearingBusinessDateAsString()
    {
        return hasClearingBusinessDate ? new String(clearingBusinessDate, 0, clearingBusinessDateLength) : null;
    }

    public void clearingBusinessDate(final AsciiSequenceView view)
    {
        if (!hasClearingBusinessDate)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingBusinessDate");
        }

        view.wrap(buffer, clearingBusinessDateOffset, clearingBusinessDateLength);
    }


    private int avgPxIndicator = MISSING_INT;

    private boolean hasAvgPxIndicator;

    public int avgPxIndicator()
    {
        if (!hasAvgPxIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: AvgPxIndicator");
        }

        return avgPxIndicator;
    }

    public boolean hasAvgPxIndicator()
    {
        return hasAvgPxIndicator;
    }



    private final CharArrayWrapper avgPxIndicatorWrapper = new CharArrayWrapper();
    public AvgPxIndicator avgPxIndicatorAsEnum()
    {
        if (!hasAvgPxIndicator)
 return AvgPxIndicator.NULL_VAL;
        return AvgPxIndicator.decode(avgPxIndicator);
    }

    private DecimalFloat quantity = DecimalFloat.newNaNValue();

    private boolean hasQuantity;

    public DecimalFloat quantity()
    {
        if (!hasQuantity)
        {
            throw new IllegalArgumentException("No value for optional field: Quantity");
        }

        return quantity;
    }

    public boolean hasQuantity()
    {
        return hasQuantity;
    }



    private char allocTransType = MISSING_CHAR;

    private boolean hasAllocTransType;

    public char allocTransType()
    {
        if (!hasAllocTransType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocTransType");
        }

        return allocTransType;
    }

    public boolean hasAllocTransType()
    {
        return hasAllocTransType;
    }



    private final CharArrayWrapper allocTransTypeWrapper = new CharArrayWrapper();
    public AllocTransType allocTransTypeAsEnum()
    {
        if (!hasAllocTransType)
 return AllocTransType.NULL_VAL;
        return AllocTransType.decode(allocTransType);
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


    private char[] secondaryAllocID = new char[1];

    private boolean hasSecondaryAllocID;

    public char[] secondaryAllocID()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocID;
    }

    public boolean hasSecondaryAllocID()
    {
        return hasSecondaryAllocID;
    }


    private int secondaryAllocIDOffset;

    private int secondaryAllocIDLength;

    public int secondaryAllocIDLength()
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        return secondaryAllocIDLength;
    }

    public String secondaryAllocIDAsString()
    {
        return hasSecondaryAllocID ? new String(secondaryAllocID, 0, secondaryAllocIDLength) : null;
    }

    public void secondaryAllocID(final AsciiSequenceView view)
    {
        if (!hasSecondaryAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryAllocID");
        }

        view.wrap(buffer, secondaryAllocIDOffset, secondaryAllocIDLength);
    }


    private final CharArrayWrapper secondaryAllocIDWrapper = new CharArrayWrapper();
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


    private int allocStatus = MISSING_INT;

    private boolean hasAllocStatus;

    public int allocStatus()
    {
        if (!hasAllocStatus)
        {
            throw new IllegalArgumentException("No value for optional field: AllocStatus");
        }

        return allocStatus;
    }

    public boolean hasAllocStatus()
    {
        return hasAllocStatus;
    }



    private final CharArrayWrapper allocStatusWrapper = new CharArrayWrapper();
    public AllocStatus allocStatusAsEnum()
    {
        if (!hasAllocStatus)
 return AllocStatus.NULL_VAL;
        return AllocStatus.decode(allocStatus);
    }

    private int allocRejCode = MISSING_INT;

    private boolean hasAllocRejCode;

    public int allocRejCode()
    {
        if (!hasAllocRejCode)
        {
            throw new IllegalArgumentException("No value for optional field: AllocRejCode");
        }

        return allocRejCode;
    }

    public boolean hasAllocRejCode()
    {
        return hasAllocRejCode;
    }



    private final CharArrayWrapper allocRejCodeWrapper = new CharArrayWrapper();
    public AllocRejCode allocRejCodeAsEnum()
    {
        if (!hasAllocRejCode)
 return AllocRejCode.NULL_VAL;
        return AllocRejCode.decode(allocRejCode);
    }

    private int allocReportType = MISSING_INT;

    private boolean hasAllocReportType;

    public int allocReportType()
    {
        if (!hasAllocReportType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocReportType");
        }

        return allocReportType;
    }

    public boolean hasAllocReportType()
    {
        return hasAllocReportType;
    }



    private final CharArrayWrapper allocReportTypeWrapper = new CharArrayWrapper();
    public AllocReportType allocReportTypeAsEnum()
    {
        if (!hasAllocReportType)
 return AllocReportType.NULL_VAL;
        return AllocReportType.decode(allocReportType);
    }

    private int allocIntermedReqType = MISSING_INT;

    private boolean hasAllocIntermedReqType;

    public int allocIntermedReqType()
    {
        if (!hasAllocIntermedReqType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocIntermedReqType");
        }

        return allocIntermedReqType;
    }

    public boolean hasAllocIntermedReqType()
    {
        return hasAllocIntermedReqType;
    }



    private final CharArrayWrapper allocIntermedReqTypeWrapper = new CharArrayWrapper();
    public AllocIntermedReqType allocIntermedReqTypeAsEnum()
    {
        if (!hasAllocIntermedReqType)
 return AllocIntermedReqType.NULL_VAL;
        return AllocIntermedReqType.decode(allocIntermedReqType);
    }

    private char matchStatus = MISSING_CHAR;

    private boolean hasMatchStatus;

    public char matchStatus()
    {
        if (!hasMatchStatus)
        {
            throw new IllegalArgumentException("No value for optional field: MatchStatus");
        }

        return matchStatus;
    }

    public boolean hasMatchStatus()
    {
        return hasMatchStatus;
    }



    private final CharArrayWrapper matchStatusWrapper = new CharArrayWrapper();
    public MatchStatus matchStatusAsEnum()
    {
        if (!hasMatchStatus)
 return MatchStatus.NULL_VAL;
        return MatchStatus.decode(matchStatus);
    }

    private int product = MISSING_INT;

    private boolean hasProduct;

    public int product()
    {
        if (!hasProduct)
        {
            throw new IllegalArgumentException("No value for optional field: Product");
        }

        return product;
    }

    public boolean hasProduct()
    {
        return hasProduct;
    }



    private final CharArrayWrapper productWrapper = new CharArrayWrapper();
    public Product productAsEnum()
    {
        if (!hasProduct)
 return Product.NULL_VAL;
        return Product.decode(product);
    }

    private char[] securityType = new char[1];

    private boolean hasSecurityType;

    public char[] securityType()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityType;
    }

    public boolean hasSecurityType()
    {
        return hasSecurityType;
    }


    private int securityTypeOffset;

    private int securityTypeLength;

    public int securityTypeLength()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityTypeLength;
    }

    public String securityTypeAsString()
    {
        return hasSecurityType ? new String(securityType, 0, securityTypeLength) : null;
    }

    public void securityType(final AsciiSequenceView view)
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        view.wrap(buffer, securityTypeOffset, securityTypeLength);
    }


    private final CharArrayWrapper securityTypeWrapper = new CharArrayWrapper();
    public SecurityType securityTypeAsEnum()
    {
        if (!hasSecurityType)
 return SecurityType.NULL_VAL;
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        return SecurityType.decode(securityTypeWrapper);
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


    private final CharArrayWrapper textWrapper = new CharArrayWrapper();
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


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AllocationReportAck
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
            case Constants.ALLOC_REPORT_ID:
                allocReportID = buffer.getChars(allocReportID, valueOffset, valueLength);
                allocReportIDOffset = valueOffset;
                allocReportIDLength = valueLength;
                break;

            case Constants.ALLOC_ID:
                hasAllocID = true;
                allocID = buffer.getChars(allocID, valueOffset, valueLength);
                allocIDOffset = valueOffset;
                allocIDLength = valueLength;
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                hasClearingBusinessDate = true;
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
                break;

            case Constants.AVG_PX_INDICATOR:
                hasAvgPxIndicator = true;
                avgPxIndicator = getInt(buffer, valueOffset, endOfField, 819, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.QUANTITY:
                hasQuantity = true;
                quantity = getFloat(buffer, quantity, valueOffset, valueLength, 53, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_TRANS_TYPE:
                hasAllocTransType = true;
                allocTransType = buffer.getChar(valueOffset);
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


            case Constants.SECONDARY_ALLOC_ID:
                hasSecondaryAllocID = true;
                secondaryAllocID = buffer.getChars(secondaryAllocID, valueOffset, valueLength);
                secondaryAllocIDOffset = valueOffset;
                secondaryAllocIDLength = valueLength;
                break;

            case Constants.TRADE_DATE:
                hasTradeDate = true;
                tradeDate = buffer.getBytes(tradeDate, valueOffset, valueLength);
                tradeDateOffset = valueOffset;
                tradeDateLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                hasTransactTime = true;
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.ALLOC_STATUS:
                hasAllocStatus = true;
                allocStatus = getInt(buffer, valueOffset, endOfField, 87, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_REJ_CODE:
                hasAllocRejCode = true;
                allocRejCode = getInt(buffer, valueOffset, endOfField, 88, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_REPORT_TYPE:
                hasAllocReportType = true;
                allocReportType = getInt(buffer, valueOffset, endOfField, 794, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_INTERMED_REQ_TYPE:
                hasAllocIntermedReqType = true;
                allocIntermedReqType = getInt(buffer, valueOffset, endOfField, 808, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MATCH_STATUS:
                hasMatchStatus = true;
                matchStatus = buffer.getChar(valueOffset);
                break;

            case Constants.PRODUCT:
                hasProduct = true;
                product = getInt(buffer, valueOffset, endOfField, 460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_TYPE:
                hasSecurityType = true;
                securityType = buffer.getChars(securityType, valueOffset, valueLength);
                securityTypeOffset = valueOffset;
                securityTypeLength = valueLength;
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
        this.resetAllocReportID();
        this.resetAllocID();
        this.resetClearingBusinessDate();
        this.resetAvgPxIndicator();
        this.resetQuantity();
        this.resetAllocTransType();
        this.resetSecondaryAllocID();
        this.resetTradeDate();
        this.resetTransactTime();
        this.resetAllocStatus();
        this.resetAllocRejCode();
        this.resetAllocReportType();
        this.resetAllocIntermedReqType();
        this.resetMatchStatus();
        this.resetProduct();
        this.resetSecurityType();
        this.resetText();
        this.resetEncodedTextLen();
        this.resetEncodedText();
        this.resetPartyIDsGroup();
        this.resetAllocsGroup();
    }

    public void resetAllocReportID()
    {
        allocReportIDOffset = 0;
        allocReportIDLength = 0;
    }

    public void resetAllocID()
    {
        hasAllocID = false;
    }

    public void resetClearingBusinessDate()
    {
        hasClearingBusinessDate = false;
    }

    public void resetAvgPxIndicator()
    {
        hasAvgPxIndicator = false;
    }

    public void resetQuantity()
    {
        hasQuantity = false;
    }

    public void resetAllocTransType()
    {
        hasAllocTransType = false;
    }

    public void resetSecondaryAllocID()
    {
        hasSecondaryAllocID = false;
    }

    public void resetTradeDate()
    {
        hasTradeDate = false;
    }

    public void resetTransactTime()
    {
        hasTransactTime = false;
    }

    public void resetAllocStatus()
    {
        hasAllocStatus = false;
    }

    public void resetAllocRejCode()
    {
        hasAllocRejCode = false;
    }

    public void resetAllocReportType()
    {
        hasAllocReportType = false;
    }

    public void resetAllocIntermedReqType()
    {
        hasAllocIntermedReqType = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        hasSecurityType = false;
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
        builder.append("\"MessageName\": \"AllocationReportAck\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"AllocReportID\": \"");
        builder.append(this.allocReportID(), 0, allocReportIDLength());
        builder.append("\",\n");

        if (hasAllocID())
        {
            indent(builder, level);
            builder.append("\"AllocID\": \"");
            builder.append(this.allocID(), 0, allocIDLength());
            builder.append("\",\n");
        }

        if (hasClearingBusinessDate())
        {
            indent(builder, level);
            builder.append("\"ClearingBusinessDate\": \"");
            appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
            builder.append("\",\n");
        }

        if (hasAvgPxIndicator())
        {
            indent(builder, level);
            builder.append("\"AvgPxIndicator\": \"");
            builder.append(avgPxIndicator);
            builder.append("\",\n");
        }

        if (hasQuantity())
        {
            indent(builder, level);
            builder.append("\"Quantity\": \"");
            quantity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocTransType())
        {
            indent(builder, level);
            builder.append("\"AllocTransType\": \"");
            builder.append(allocTransType);
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

        if (hasSecondaryAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryAllocID\": \"");
            builder.append(this.secondaryAllocID(), 0, secondaryAllocIDLength());
            builder.append("\",\n");
        }

        if (hasTradeDate())
        {
            indent(builder, level);
            builder.append("\"TradeDate\": \"");
            appendData(builder, tradeDate, tradeDateLength);
            builder.append("\",\n");
        }

        if (hasTransactTime())
        {
            indent(builder, level);
            builder.append("\"TransactTime\": \"");
            appendData(builder, transactTime, transactTimeLength);
            builder.append("\",\n");
        }

        if (hasAllocStatus())
        {
            indent(builder, level);
            builder.append("\"AllocStatus\": \"");
            builder.append(allocStatus);
            builder.append("\",\n");
        }

        if (hasAllocRejCode())
        {
            indent(builder, level);
            builder.append("\"AllocRejCode\": \"");
            builder.append(allocRejCode);
            builder.append("\",\n");
        }

        if (hasAllocReportType())
        {
            indent(builder, level);
            builder.append("\"AllocReportType\": \"");
            builder.append(allocReportType);
            builder.append("\",\n");
        }

        if (hasAllocIntermedReqType())
        {
            indent(builder, level);
            builder.append("\"AllocIntermedReqType\": \"");
            builder.append(allocIntermedReqType);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            builder.append(this.securityType(), 0, securityTypeLength());
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
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AllocationReportAckEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AllocationReportAckEncoder)encoder);
    }

    public AllocationReportAckEncoder toEncoder(final AllocationReportAckEncoder encoder)
    {
        encoder.reset();
        encoder.allocReportID(this.allocReportID(), 0, allocReportIDLength());
        if (hasAllocID())
        {
            encoder.allocID(this.allocID(), 0, allocIDLength());
        }

        if (hasClearingBusinessDate())
        {
            encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        }

        if (hasAvgPxIndicator())
        {
            encoder.avgPxIndicator(this.avgPxIndicator());
        }

        if (hasQuantity())
        {
            encoder.quantity(this.quantity());
        }

        if (hasAllocTransType())
        {
            encoder.allocTransType(this.allocTransType());
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


        if (hasSecondaryAllocID())
        {
            encoder.secondaryAllocID(this.secondaryAllocID(), 0, secondaryAllocIDLength());
        }

        if (hasTradeDate())
        {
            encoder.tradeDateAsCopy(this.tradeDate(), 0, tradeDateLength());
        }

        if (hasTransactTime())
        {
            encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());
        }

        if (hasAllocStatus())
        {
            encoder.allocStatus(this.allocStatus());
        }

        if (hasAllocRejCode())
        {
            encoder.allocRejCode(this.allocRejCode());
        }

        if (hasAllocReportType())
        {
            encoder.allocReportType(this.allocReportType());
        }

        if (hasAllocIntermedReqType())
        {
            encoder.allocIntermedReqType(this.allocIntermedReqType());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityType(this.securityType(), 0, securityTypeLength());
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


        final AllocAckGrpEncoder allocAckGrp = encoder.allocAckGrp();        if (hasNoAllocsGroupCounter)
        {
            final int size = this.noAllocsGroupCounter;
            AllocsGroupDecoder allocsGroup = this.allocsGroup;
            AllocsGroupEncoder allocsGroupEncoder = allocAckGrp.allocsGroup(size);
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

        return encoder;
    }

}
