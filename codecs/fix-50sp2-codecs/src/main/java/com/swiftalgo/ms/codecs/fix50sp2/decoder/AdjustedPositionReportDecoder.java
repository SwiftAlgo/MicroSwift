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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AdjustedPositionReportEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PositionQtyEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PositionQtyEncoder.PositionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrmtGrpEncoder.RelatedSymGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SecAltIDGrpEncoder.SecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SecurityXMLEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.EvntGrpEncoder.EventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPartiesEncoder.InstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.InstrumentPtysSubGrpEncoder.InstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventsEncoder.ComplexEventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventDatesEncoder.ComplexEventDatesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ComplexEventTimesEncoder.ComplexEventTimesGroupEncoder;


public class AdjustedPositionReportDecoder extends CommonDecoderImpl implements PartiesDecoder, PositionQtyDecoder, InstrmtGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.POS_MAINT_RPT_ID);
            REQUIRED_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(14);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.POS_MAINT_RPT_ID);
            GROUP_FIELDS.add(Constants.POS_REQ_TYPE);
            GROUP_FIELDS.add(Constants.CLEARING_BUSINESS_DATE);
            GROUP_FIELDS.add(Constants.SETTL_SESS_ID);
            GROUP_FIELDS.add(Constants.POS_MAINT_RPT_REF_ID);
            GROUP_FIELDS.add(Constants.SETTL_PRICE);
            GROUP_FIELDS.add(Constants.PRIOR_SETTL_PRICE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(14);

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
        if (hasPosReqType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !PosReqType.isValid(posReqType()))
        {
            invalidTagId = 724;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlSessID)
        {
        settlSessIDWrapper.wrap(this.settlSessID(), settlSessIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlSessID.isValid(settlSessIDWrapper))
        {
            invalidTagId = 716;
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

        if (hasNoPositionsGroupCounter)
        {
            {
                int count = 0;
                final PositionsGroupIterator iterator = positionsGroupIterator.iterator();
                for (final PositionsGroupDecoder group : iterator)
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
                    invalidTagId = 702;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoRelatedSymGroupCounter)
        {
            {
                int count = 0;
                final RelatedSymGroupIterator iterator = relatedSymGroupIterator.iterator();
                for (final RelatedSymGroupDecoder group : iterator)
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
                    invalidTagId = 146;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 19522L;

    public static final String MESSAGE_TYPE_AS_STRING = "BL";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(348);

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
        messageFields.add(Constants.POS_MAINT_RPT_ID);
        messageFields.add(Constants.POS_REQ_TYPE);
        messageFields.add(Constants.CLEARING_BUSINESS_DATE);
        messageFields.add(Constants.SETTL_SESS_ID);
        messageFields.add(Constants.POS_MAINT_RPT_REF_ID);
        messageFields.add(Constants.NO_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_POSITIONS_GROUP_COUNTER);
        messageFields.add(Constants.POS_TYPE);
        messageFields.add(Constants.LONG_QTY);
        messageFields.add(Constants.SHORT_QTY);
        messageFields.add(Constants.POS_QTY_STATUS);
        messageFields.add(Constants.QUANTITY_DATE);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_RELATED_SYM_GROUP_COUNTER);
        messageFields.add(Constants.SYMBOL);
        messageFields.add(Constants.SYMBOL_SFX);
        messageFields.add(Constants.SECURITY_ID);
        messageFields.add(Constants.SECURITY_ID_SOURCE);
        messageFields.add(Constants.NO_SECURITY_ALT_ID_GROUP_COUNTER);
        messageFields.add(Constants.SECURITY_ALT_ID);
        messageFields.add(Constants.SECURITY_ALT_ID_SOURCE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.PRODUCT_COMPLEX);
        messageFields.add(Constants.SECURITY_GROUP);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.SECURITY_SUB_TYPE);
        messageFields.add(Constants.MATURITY_MONTH_YEAR);
        messageFields.add(Constants.MATURITY_DATE);
        messageFields.add(Constants.MATURITY_TIME);
        messageFields.add(Constants.SETTLE_ON_OPEN_FLAG);
        messageFields.add(Constants.INSTRMT_ASSIGNMENT_METHOD);
        messageFields.add(Constants.SECURITY_STATUS);
        messageFields.add(Constants.COUPON_PAYMENT_DATE);
        messageFields.add(Constants.RESTRUCTURING_TYPE);
        messageFields.add(Constants.SENIORITY);
        messageFields.add(Constants.NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
        messageFields.add(Constants.ATTACHMENT_POINT);
        messageFields.add(Constants.DETACHMENT_POINT);
        messageFields.add(Constants.ISSUE_DATE);
        messageFields.add(Constants.REPO_COLLATERAL_SECURITY_TYPE);
        messageFields.add(Constants.REPURCHASE_TERM);
        messageFields.add(Constants.REPURCHASE_RATE);
        messageFields.add(Constants.FACTOR);
        messageFields.add(Constants.CREDIT_RATING);
        messageFields.add(Constants.INSTR_REGISTRY);
        messageFields.add(Constants.COUNTRY_OF_ISSUE);
        messageFields.add(Constants.STATE_OR_PROVINCE_OF_ISSUE);
        messageFields.add(Constants.LOCALE_OF_ISSUE);
        messageFields.add(Constants.REDEMPTION_DATE);
        messageFields.add(Constants.STRIKE_PRICE);
        messageFields.add(Constants.STRIKE_CURRENCY);
        messageFields.add(Constants.STRIKE_MULTIPLIER);
        messageFields.add(Constants.STRIKE_VALUE);
        messageFields.add(Constants.STRIKE_PRICE_DETERMINATION_METHOD);
        messageFields.add(Constants.STRIKE_PRICE_BOUNDARY_METHOD);
        messageFields.add(Constants.STRIKE_PRICE_BOUNDARY_PRECISION);
        messageFields.add(Constants.UNDERLYING_PRICE_DETERMINATION_METHOD);
        messageFields.add(Constants.OPT_ATTRIBUTE);
        messageFields.add(Constants.CONTRACT_MULTIPLIER);
        messageFields.add(Constants.CONTRACT_MULTIPLIER_UNIT);
        messageFields.add(Constants.FLOW_SCHEDULE_TYPE);
        messageFields.add(Constants.MIN_PRICE_INCREMENT);
        messageFields.add(Constants.MIN_PRICE_INCREMENT_AMOUNT);
        messageFields.add(Constants.UNIT_OF_MEASURE);
        messageFields.add(Constants.UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.PRICE_UNIT_OF_MEASURE);
        messageFields.add(Constants.PRICE_UNIT_OF_MEASURE_QTY);
        messageFields.add(Constants.SETTL_METHOD);
        messageFields.add(Constants.EXERCISE_STYLE);
        messageFields.add(Constants.OPT_PAYOUT_TYPE);
        messageFields.add(Constants.OPT_PAYOUT_AMOUNT);
        messageFields.add(Constants.PRICE_QUOTE_METHOD);
        messageFields.add(Constants.VALUATION_METHOD);
        messageFields.add(Constants.LIST_METHOD);
        messageFields.add(Constants.CAP_PRICE);
        messageFields.add(Constants.FLOOR_PRICE);
        messageFields.add(Constants.PUT_OR_CALL);
        messageFields.add(Constants.FLEXIBLE_INDICATOR);
        messageFields.add(Constants.FLEX_PRODUCT_ELIGIBILITY_INDICATOR);
        messageFields.add(Constants.TIME_UNIT);
        messageFields.add(Constants.COUPON_RATE);
        messageFields.add(Constants.SECURITY_EXCHANGE);
        messageFields.add(Constants.POSITION_LIMIT);
        messageFields.add(Constants.N_T_POSITION_LIMIT);
        messageFields.add(Constants.ISSUER);
        messageFields.add(Constants.ENCODED_ISSUER_LEN);
        messageFields.add(Constants.ENCODED_ISSUER);
        messageFields.add(Constants.SECURITY_DESC);
        messageFields.add(Constants.ENCODED_SECURITY_DESC_LEN);
        messageFields.add(Constants.ENCODED_SECURITY_DESC);
        messageFields.add(Constants.SECURITY_X_M_L_LEN);
        messageFields.add(Constants.SECURITY_X_M_L);
        messageFields.add(Constants.SECURITY_X_M_L_SCHEMA);
        messageFields.add(Constants.POOL);
        messageFields.add(Constants.CONTRACT_SETTL_MONTH);
        messageFields.add(Constants.C_P_PROGRAM);
        messageFields.add(Constants.C_P_REG_TYPE);
        messageFields.add(Constants.NO_EVENTS_GROUP_COUNTER);
        messageFields.add(Constants.EVENT_TYPE);
        messageFields.add(Constants.EVENT_DATE);
        messageFields.add(Constants.EVENT_TIME);
        messageFields.add(Constants.EVENT_PX);
        messageFields.add(Constants.EVENT_TEXT);
        messageFields.add(Constants.DATED_DATE);
        messageFields.add(Constants.INTEREST_ACCRUAL_DATE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTIES_GROUP_COUNTER);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_ID_SOURCE);
        messageFields.add(Constants.INSTRUMENT_PARTY_ROLE);
        messageFields.add(Constants.NO_INSTRUMENT_PARTY_SUB_IDS_GROUP_COUNTER);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID);
        messageFields.add(Constants.INSTRUMENT_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.NO_COMPLEX_EVENTS_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_TYPE);
        messageFields.add(Constants.COMPLEX_OPT_PAYOUT_AMOUNT);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_METHOD);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_BOUNDARY_PRECISION);
        messageFields.add(Constants.COMPLEX_EVENT_PRICE_TIME_TYPE);
        messageFields.add(Constants.COMPLEX_EVENT_CONDITION);
        messageFields.add(Constants.NO_COMPLEX_EVENT_DATES_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_START_DATE);
        messageFields.add(Constants.COMPLEX_EVENT_END_DATE);
        messageFields.add(Constants.NO_COMPLEX_EVENT_TIMES_GROUP_COUNTER);
        messageFields.add(Constants.COMPLEX_EVENT_START_TIME);
        messageFields.add(Constants.COMPLEX_EVENT_END_TIME);
        messageFields.add(Constants.SETTL_PRICE);
        messageFields.add(Constants.PRIOR_SETTL_PRICE);
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

    private char[] posMaintRptID = new char[1];

    public char[] posMaintRptID()
    {
        return posMaintRptID;
    }


    private int posMaintRptIDOffset;

    private int posMaintRptIDLength;

    public int posMaintRptIDLength()
    {
        return posMaintRptIDLength;
    }

    public String posMaintRptIDAsString()
    {
        return new String(posMaintRptID, 0, posMaintRptIDLength);
    }

    public void posMaintRptID(final AsciiSequenceView view)
    {
        view.wrap(buffer, posMaintRptIDOffset, posMaintRptIDLength);
    }


    private final CharArrayWrapper posMaintRptIDWrapper = new CharArrayWrapper();
    private int posReqType = MISSING_INT;

    private boolean hasPosReqType;

    public int posReqType()
    {
        if (!hasPosReqType)
        {
            throw new IllegalArgumentException("No value for optional field: PosReqType");
        }

        return posReqType;
    }

    public boolean hasPosReqType()
    {
        return hasPosReqType;
    }



    private final CharArrayWrapper posReqTypeWrapper = new CharArrayWrapper();
    public PosReqType posReqTypeAsEnum()
    {
        if (!hasPosReqType)
 return PosReqType.NULL_VAL;
        return PosReqType.decode(posReqType);
    }

    private byte[] clearingBusinessDate = new byte[8];

    public byte[] clearingBusinessDate()
    {
        return clearingBusinessDate;
    }


    private int clearingBusinessDateOffset;

    private int clearingBusinessDateLength;

    public int clearingBusinessDateLength()
    {
        return clearingBusinessDateLength;
    }

    public String clearingBusinessDateAsString()
    {
        return new String(clearingBusinessDate, 0, clearingBusinessDateLength);
    }

    public void clearingBusinessDate(final AsciiSequenceView view)
    {
        view.wrap(buffer, clearingBusinessDateOffset, clearingBusinessDateLength);
    }


    private char[] settlSessID = new char[1];

    private boolean hasSettlSessID;

    public char[] settlSessID()
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        return settlSessID;
    }

    public boolean hasSettlSessID()
    {
        return hasSettlSessID;
    }


    private int settlSessIDOffset;

    private int settlSessIDLength;

    public int settlSessIDLength()
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        return settlSessIDLength;
    }

    public String settlSessIDAsString()
    {
        return hasSettlSessID ? new String(settlSessID, 0, settlSessIDLength) : null;
    }

    public void settlSessID(final AsciiSequenceView view)
    {
        if (!hasSettlSessID)
        {
            throw new IllegalArgumentException("No value for optional field: SettlSessID");
        }

        view.wrap(buffer, settlSessIDOffset, settlSessIDLength);
    }


    private final CharArrayWrapper settlSessIDWrapper = new CharArrayWrapper();
    public SettlSessID settlSessIDAsEnum()
    {
        if (!hasSettlSessID)
 return SettlSessID.NULL_VAL;
        settlSessIDWrapper.wrap(this.settlSessID(), settlSessIDLength);
        return SettlSessID.decode(settlSessIDWrapper);
    }

    private char[] posMaintRptRefID = new char[1];

    private boolean hasPosMaintRptRefID;

    public char[] posMaintRptRefID()
    {
        if (!hasPosMaintRptRefID)
        {
            throw new IllegalArgumentException("No value for optional field: PosMaintRptRefID");
        }

        return posMaintRptRefID;
    }

    public boolean hasPosMaintRptRefID()
    {
        return hasPosMaintRptRefID;
    }


    private int posMaintRptRefIDOffset;

    private int posMaintRptRefIDLength;

    public int posMaintRptRefIDLength()
    {
        if (!hasPosMaintRptRefID)
        {
            throw new IllegalArgumentException("No value for optional field: PosMaintRptRefID");
        }

        return posMaintRptRefIDLength;
    }

    public String posMaintRptRefIDAsString()
    {
        return hasPosMaintRptRefID ? new String(posMaintRptRefID, 0, posMaintRptRefIDLength) : null;
    }

    public void posMaintRptRefID(final AsciiSequenceView view)
    {
        if (!hasPosMaintRptRefID)
        {
            throw new IllegalArgumentException("No value for optional field: PosMaintRptRefID");
        }

        view.wrap(buffer, posMaintRptRefIDOffset, posMaintRptRefIDLength);
    }


    private final CharArrayWrapper posMaintRptRefIDWrapper = new CharArrayWrapper();


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




    private PositionsGroupDecoder positionsGroup = null;
    public PositionsGroupDecoder positionsGroup()
    {
        return positionsGroup;
    }

    private int noPositionsGroupCounter = MISSING_INT;

    private boolean hasNoPositionsGroupCounter;

    public int noPositionsGroupCounter()
    {
        if (!hasNoPositionsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPositionsGroupCounter");
        }

        return noPositionsGroupCounter;
    }

    public boolean hasNoPositionsGroupCounter()
    {
        return hasNoPositionsGroupCounter;
    }




    private PositionsGroupIterator positionsGroupIterator = new PositionsGroupIterator(this);
    public PositionsGroupIterator positionsGroupIterator()
    {
        return positionsGroupIterator.iterator();
    }




    private RelatedSymGroupDecoder relatedSymGroup = null;
    public RelatedSymGroupDecoder relatedSymGroup()
    {
        return relatedSymGroup;
    }

    private int noRelatedSymGroupCounter = MISSING_INT;

    private boolean hasNoRelatedSymGroupCounter;

    public int noRelatedSymGroupCounter()
    {
        if (!hasNoRelatedSymGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRelatedSymGroupCounter");
        }

        return noRelatedSymGroupCounter;
    }

    public boolean hasNoRelatedSymGroupCounter()
    {
        return hasNoRelatedSymGroupCounter;
    }




    private RelatedSymGroupIterator relatedSymGroupIterator = new RelatedSymGroupIterator(this);
    public RelatedSymGroupIterator relatedSymGroupIterator()
    {
        return relatedSymGroupIterator.iterator();
    }


    private DecimalFloat settlPrice = DecimalFloat.newNaNValue();

    private boolean hasSettlPrice;

    public DecimalFloat settlPrice()
    {
        if (!hasSettlPrice)
        {
            throw new IllegalArgumentException("No value for optional field: SettlPrice");
        }

        return settlPrice;
    }

    public boolean hasSettlPrice()
    {
        return hasSettlPrice;
    }



    private DecimalFloat priorSettlPrice = DecimalFloat.newNaNValue();

    private boolean hasPriorSettlPrice;

    public DecimalFloat priorSettlPrice()
    {
        if (!hasPriorSettlPrice)
        {
            throw new IllegalArgumentException("No value for optional field: PriorSettlPrice");
        }

        return priorSettlPrice;
    }

    public boolean hasPriorSettlPrice()
    {
        return hasPriorSettlPrice;
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AdjustedPositionReport
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
            case Constants.POS_MAINT_RPT_ID:
                posMaintRptID = buffer.getChars(posMaintRptID, valueOffset, valueLength);
                posMaintRptIDOffset = valueOffset;
                posMaintRptIDLength = valueLength;
                break;

            case Constants.POS_REQ_TYPE:
                hasPosReqType = true;
                posReqType = getInt(buffer, valueOffset, endOfField, 724, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.CLEARING_BUSINESS_DATE:
                clearingBusinessDate = buffer.getBytes(clearingBusinessDate, valueOffset, valueLength);
                clearingBusinessDateOffset = valueOffset;
                clearingBusinessDateLength = valueLength;
                break;

            case Constants.SETTL_SESS_ID:
                hasSettlSessID = true;
                settlSessID = buffer.getChars(settlSessID, valueOffset, valueLength);
                settlSessIDOffset = valueOffset;
                settlSessIDLength = valueLength;
                break;

            case Constants.POS_MAINT_RPT_REF_ID:
                hasPosMaintRptRefID = true;
                posMaintRptRefID = buffer.getChars(posMaintRptRefID, valueOffset, valueLength);
                posMaintRptRefIDOffset = valueOffset;
                posMaintRptRefIDLength = valueLength;
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


            case Constants.NO_POSITIONS_GROUP_COUNTER:
                hasNoPositionsGroupCounter = true;
                noPositionsGroupCounter = getInt(buffer, valueOffset, endOfField, 702, CODEC_VALIDATION_ENABLED);
                if (positionsGroup == null)
                {
                    positionsGroup = new PositionsGroupDecoder(trailer, messageFields);
                }
                PositionsGroupDecoder positionsGroupCurrent = positionsGroup;
                position = endOfField + 1;
                final int noPositionsGroupCounter = this.noPositionsGroupCounter;
                for (int i = 0; i < noPositionsGroupCounter && position < end; i++)
                {
                    if (positionsGroupCurrent != null)
                    {
                        position += positionsGroupCurrent.decode(buffer, position, end - position);
                        positionsGroupCurrent = positionsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (positionsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_RELATED_SYM_GROUP_COUNTER:
                hasNoRelatedSymGroupCounter = true;
                noRelatedSymGroupCounter = getInt(buffer, valueOffset, endOfField, 146, CODEC_VALIDATION_ENABLED);
                if (relatedSymGroup == null)
                {
                    relatedSymGroup = new RelatedSymGroupDecoder(trailer, messageFields);
                }
                RelatedSymGroupDecoder relatedSymGroupCurrent = relatedSymGroup;
                position = endOfField + 1;
                final int noRelatedSymGroupCounter = this.noRelatedSymGroupCounter;
                for (int i = 0; i < noRelatedSymGroupCounter && position < end; i++)
                {
                    if (relatedSymGroupCurrent != null)
                    {
                        position += relatedSymGroupCurrent.decode(buffer, position, end - position);
                        relatedSymGroupCurrent = relatedSymGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (relatedSymGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.SETTL_PRICE:
                hasSettlPrice = true;
                settlPrice = getFloat(buffer, settlPrice, valueOffset, valueLength, 730, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.PRIOR_SETTL_PRICE:
                hasPriorSettlPrice = true;
                priorSettlPrice = getFloat(buffer, priorSettlPrice, valueOffset, valueLength, 734, CODEC_VALIDATION_ENABLED);
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
        this.resetPosMaintRptID();
        this.resetPosReqType();
        this.resetClearingBusinessDate();
        this.resetSettlSessID();
        this.resetPosMaintRptRefID();
        this.resetSettlPrice();
        this.resetPriorSettlPrice();
        this.resetPartyIDsGroup();
        this.resetPositionsGroup();
        this.resetRelatedSymGroup();
    }

    public void resetPosMaintRptID()
    {
        posMaintRptIDOffset = 0;
        posMaintRptIDLength = 0;
    }

    public void resetPosReqType()
    {
        hasPosReqType = false;
    }

    public void resetClearingBusinessDate()
    {
    }

    public void resetSettlSessID()
    {
        hasSettlSessID = false;
    }

    public void resetPosMaintRptRefID()
    {
        hasPosMaintRptRefID = false;
    }

    public void resetSettlPrice()
    {
        hasSettlPrice = false;
    }

    public void resetPriorSettlPrice()
    {
        hasPriorSettlPrice = false;
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

    public void resetPositionsGroup()
    {
        for (final PositionsGroupDecoder positionsGroupDecoder : positionsGroupIterator.iterator())
        {
            positionsGroupDecoder.reset();
            if (positionsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPositionsGroupCounter = MISSING_INT;
        hasNoPositionsGroupCounter = false;
    }

    public void resetRelatedSymGroup()
    {
        for (final RelatedSymGroupDecoder relatedSymGroupDecoder : relatedSymGroupIterator.iterator())
        {
            relatedSymGroupDecoder.reset();
            if (relatedSymGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRelatedSymGroupCounter = MISSING_INT;
        hasNoRelatedSymGroupCounter = false;
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
        builder.append("\"MessageName\": \"AdjustedPositionReport\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"PosMaintRptID\": \"");
        builder.append(this.posMaintRptID(), 0, posMaintRptIDLength());
        builder.append("\",\n");

        if (hasPosReqType())
        {
            indent(builder, level);
            builder.append("\"PosReqType\": \"");
            builder.append(posReqType);
            builder.append("\",\n");
        }

        indent(builder, level);
        builder.append("\"ClearingBusinessDate\": \"");
        appendData(builder, clearingBusinessDate, clearingBusinessDateLength);
        builder.append("\",\n");

        if (hasSettlSessID())
        {
            indent(builder, level);
            builder.append("\"SettlSessID\": \"");
            builder.append(this.settlSessID(), 0, settlSessIDLength());
            builder.append("\",\n");
        }

        if (hasPosMaintRptRefID())
        {
            indent(builder, level);
            builder.append("\"PosMaintRptRefID\": \"");
            builder.append(this.posMaintRptRefID(), 0, posMaintRptRefIDLength());
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

        if (hasNoPositionsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"PositionsGroup\": [\n");
            PositionsGroupDecoder positionsGroup = this.positionsGroup;
            for (int i = 0, size = this.noPositionsGroupCounter; i < size; i++)
            {
                indent(builder, level);
                positionsGroup.appendTo(builder, level + 1);
                if (positionsGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                positionsGroup = positionsGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasNoRelatedSymGroupCounter)
        {
            indent(builder, level);
            builder.append("\"RelatedSymGroup\": [\n");
            RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
            for (int i = 0, size = this.noRelatedSymGroupCounter; i < size; i++)
            {
                indent(builder, level);
                relatedSymGroup.appendTo(builder, level + 1);
                if (relatedSymGroup.next() != null)
                {
                    builder.append(',');
                }
                builder.append('\n');
                relatedSymGroup = relatedSymGroup.next();            }
            indent(builder, level);
            builder.append("],\n");
        }

        if (hasSettlPrice())
        {
            indent(builder, level);
            builder.append("\"SettlPrice\": \"");
            settlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasPriorSettlPrice())
        {
            indent(builder, level);
            builder.append("\"PriorSettlPrice\": \"");
            priorSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public AdjustedPositionReportEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AdjustedPositionReportEncoder)encoder);
    }

    public AdjustedPositionReportEncoder toEncoder(final AdjustedPositionReportEncoder encoder)
    {
        encoder.reset();
        encoder.posMaintRptID(this.posMaintRptID(), 0, posMaintRptIDLength());
        if (hasPosReqType())
        {
            encoder.posReqType(this.posReqType());
        }

        encoder.clearingBusinessDateAsCopy(this.clearingBusinessDate(), 0, clearingBusinessDateLength());
        if (hasSettlSessID())
        {
            encoder.settlSessID(this.settlSessID(), 0, settlSessIDLength());
        }

        if (hasPosMaintRptRefID())
        {
            encoder.posMaintRptRefID(this.posMaintRptRefID(), 0, posMaintRptRefIDLength());
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



        final PositionQtyEncoder positionQty = encoder.positionQty();        if (hasNoPositionsGroupCounter)
        {
            final int size = this.noPositionsGroupCounter;
            PositionsGroupDecoder positionsGroup = this.positionsGroup;
            PositionsGroupEncoder positionsGroupEncoder = positionQty.positionsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (positionsGroup != null)
                {
                    positionsGroup.toEncoder(positionsGroupEncoder);
                    positionsGroup = positionsGroup.next();
                    positionsGroupEncoder = positionsGroupEncoder.next();
                }
            }
        }



        final InstrmtGrpEncoder instrmtGrp = encoder.instrmtGrp();        if (hasNoRelatedSymGroupCounter)
        {
            final int size = this.noRelatedSymGroupCounter;
            RelatedSymGroupDecoder relatedSymGroup = this.relatedSymGroup;
            RelatedSymGroupEncoder relatedSymGroupEncoder = instrmtGrp.relatedSymGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (relatedSymGroup != null)
                {
                    relatedSymGroup.toEncoder(relatedSymGroupEncoder);
                    relatedSymGroup = relatedSymGroup.next();
                    relatedSymGroupEncoder = relatedSymGroupEncoder.next();
                }
            }
        }


        if (hasSettlPrice())
        {
            encoder.settlPrice(this.settlPrice());
        }

        if (hasPriorSettlPrice())
        {
            encoder.priorSettlPrice(this.priorSettlPrice());
        }
        return encoder;
    }

}
