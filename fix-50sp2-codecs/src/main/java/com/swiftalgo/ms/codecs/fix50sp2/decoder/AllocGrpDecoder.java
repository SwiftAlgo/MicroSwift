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
import com.swiftalgo.ms.codecs.fix50sp2.builder.AllocGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.AllocGrpEncoder.AllocsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.CommissionDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MiscFeesGrpEncoder.MiscFeesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ClrInstGrpEncoder.ClearingInstructionsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstructionsDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder.DlvyInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;

public interface AllocGrpDecoder 
{



public class AllocsGroupDecoder extends CommonDecoderImpl implements NestedPartiesDecoder, CommissionDataDecoder, MiscFeesGrpDecoder, ClrInstGrpDecoder, SettlInstructionsDataDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(74);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.MATCH_STATUS);
            GROUP_FIELDS.add(Constants.ALLOC_PRICE);
            GROUP_FIELDS.add(Constants.ALLOC_QTY);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.PROCESS_CODE);
            GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            GROUP_FIELDS.add(Constants.ALLOC_METHOD);
            GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            GROUP_FIELDS.add(Constants.ALLOC_POSITION_EFFECT);
            GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_TYPE);
            GROUP_FIELDS.add(Constants.NOTIFY_BROKER_OF_CREDIT);
            GROUP_FIELDS.add(Constants.ALLOC_HANDL_INST);
            GROUP_FIELDS.add(Constants.ALLOC_TEXT);
            GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
            GROUP_FIELDS.add(Constants.COMMISSION);
            GROUP_FIELDS.add(Constants.COMM_TYPE);
            GROUP_FIELDS.add(Constants.COMM_CURRENCY);
            GROUP_FIELDS.add(Constants.FUND_RENEW_WAIV);
            GROUP_FIELDS.add(Constants.ALLOC_AVG_PX);
            GROUP_FIELDS.add(Constants.ALLOC_NET_MONEY);
            GROUP_FIELDS.add(Constants.SETTL_CURR_AMT);
            GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURR_AMT);
            GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
            GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
            GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
            GROUP_FIELDS.add(Constants.ALLOC_ACCRUED_INTEREST_AMT);
            GROUP_FIELDS.add(Constants.ALLOC_INTEREST_AT_MATURITY);
            GROUP_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
            GROUP_FIELDS.add(Constants.ALLOC_SETTL_INST_TYPE);
            GROUP_FIELDS.add(Constants.SETTL_DELIVERY_TYPE);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_TYPE);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_NAME);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_ID);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(58);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            ALL_GROUP_FIELDS.add(Constants.MATCH_STATUS);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_PRICE);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_QTY);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.PROCESS_CODE);
            ALL_GROUP_FIELDS.add(Constants.SECONDARY_INDIVIDUAL_ALLOC_ID);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_METHOD);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_CUSTOMER_CAPACITY);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_POSITION_EFFECT);
            ALL_GROUP_FIELDS.add(Constants.INDIVIDUAL_ALLOC_TYPE);
            ALL_GROUP_FIELDS.add(Constants.NOTIFY_BROKER_OF_CREDIT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_HANDL_INST);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_TEXT);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT_LEN);
            ALL_GROUP_FIELDS.add(Constants.ENCODED_ALLOC_TEXT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_AVG_PX);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_NET_MONEY);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_AMT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURR_AMT);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_SETTL_CURRENCY);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE);
            ALL_GROUP_FIELDS.add(Constants.SETTL_CURR_FX_RATE_CALC);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_ACCRUED_INTEREST_AMT);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_INTEREST_AT_MATURITY);
            ALL_GROUP_FIELDS.add(Constants.CLEARING_FEE_INDICATOR);
            ALL_GROUP_FIELDS.add(Constants.ALLOC_SETTL_INST_TYPE);
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
        if (hasMatchStatus)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !MatchStatus.isValid(matchStatus()))
        {
            invalidTagId = 573;
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

        if (hasAllocMethod)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocMethod.isValid(allocMethod()))
        {
            invalidTagId = 1002;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocPositionEffect)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocPositionEffect.isValid(allocPositionEffect()))
        {
            invalidTagId = 1047;
            rejectReason = 5;
            return false;
        }
        }

        if (hasIndividualAllocType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !IndividualAllocType.isValid(individualAllocType()))
        {
            invalidTagId = 992;
            rejectReason = 5;
            return false;
        }
        }


        if (hasAllocHandlInst)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocHandlInst.isValid(allocHandlInst()))
        {
            invalidTagId = 209;
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

        if (hasClearingFeeIndicator)
        {
        clearingFeeIndicatorWrapper.wrap(this.clearingFeeIndicator(), clearingFeeIndicatorLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !ClearingFeeIndicator.isValid(clearingFeeIndicatorWrapper))
        {
            invalidTagId = 635;
            rejectReason = 5;
            return false;
        }
        }

        if (hasAllocSettlInstType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AllocSettlInstType.isValid(allocSettlInstType()))
        {
            invalidTagId = 780;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSettlDeliveryType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SettlDeliveryType.isValid(settlDeliveryType()))
        {
            invalidTagId = 172;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStandInstDbType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StandInstDbType.isValid(standInstDbType()))
        {
            invalidTagId = 169;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoNestedPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final NestedPartyIDsGroupIterator iterator = nestedPartyIDsGroupIterator.iterator();
                for (final NestedPartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 539;
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

        if (hasNoDlvyInstGroupCounter)
        {
            {
                int count = 0;
                final DlvyInstGroupIterator iterator = dlvyInstGroupIterator.iterator();
                for (final DlvyInstGroupDecoder group : iterator)
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
                    invalidTagId = 85;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public AllocsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private AllocsGroupDecoder next = null;

    public AllocsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(68);

    private char[] allocAccount = new char[1];

    private boolean hasAllocAccount;

    public char[] allocAccount()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccount;
    }

    public boolean hasAllocAccount()
    {
        return hasAllocAccount;
    }


    private int allocAccountOffset;

    private int allocAccountLength;

    public int allocAccountLength()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccountLength;
    }

    public String allocAccountAsString()
    {
        return hasAllocAccount ? new String(allocAccount, 0, allocAccountLength) : null;
    }

    public void allocAccount(final AsciiSequenceView view)
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        view.wrap(buffer, allocAccountOffset, allocAccountLength);
    }


    private int allocAcctIDSource = MISSING_INT;

    private boolean hasAllocAcctIDSource;

    public int allocAcctIDSource()
    {
        if (!hasAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAcctIDSource");
        }

        return allocAcctIDSource;
    }

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
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

    private DecimalFloat allocPrice = DecimalFloat.newNaNValue();

    private boolean hasAllocPrice;

    public DecimalFloat allocPrice()
    {
        if (!hasAllocPrice)
        {
            throw new IllegalArgumentException("No value for optional field: AllocPrice");
        }

        return allocPrice;
    }

    public boolean hasAllocPrice()
    {
        return hasAllocPrice;
    }



    private DecimalFloat allocQty = DecimalFloat.newNaNValue();

    private boolean hasAllocQty;

    public DecimalFloat allocQty()
    {
        if (!hasAllocQty)
        {
            throw new IllegalArgumentException("No value for optional field: AllocQty");
        }

        return allocQty;
    }

    public boolean hasAllocQty()
    {
        return hasAllocQty;
    }



    private char[] individualAllocID = new char[1];

    private boolean hasIndividualAllocID;

    public char[] individualAllocID()
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        return individualAllocID;
    }

    public boolean hasIndividualAllocID()
    {
        return hasIndividualAllocID;
    }


    private int individualAllocIDOffset;

    private int individualAllocIDLength;

    public int individualAllocIDLength()
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        return individualAllocIDLength;
    }

    public String individualAllocIDAsString()
    {
        return hasIndividualAllocID ? new String(individualAllocID, 0, individualAllocIDLength) : null;
    }

    public void individualAllocID(final AsciiSequenceView view)
    {
        if (!hasIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocID");
        }

        view.wrap(buffer, individualAllocIDOffset, individualAllocIDLength);
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

    private char[] secondaryIndividualAllocID = new char[1];

    private boolean hasSecondaryIndividualAllocID;

    public char[] secondaryIndividualAllocID()
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        return secondaryIndividualAllocID;
    }

    public boolean hasSecondaryIndividualAllocID()
    {
        return hasSecondaryIndividualAllocID;
    }


    private int secondaryIndividualAllocIDOffset;

    private int secondaryIndividualAllocIDLength;

    public int secondaryIndividualAllocIDLength()
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        return secondaryIndividualAllocIDLength;
    }

    public String secondaryIndividualAllocIDAsString()
    {
        return hasSecondaryIndividualAllocID ? new String(secondaryIndividualAllocID, 0, secondaryIndividualAllocIDLength) : null;
    }

    public void secondaryIndividualAllocID(final AsciiSequenceView view)
    {
        if (!hasSecondaryIndividualAllocID)
        {
            throw new IllegalArgumentException("No value for optional field: SecondaryIndividualAllocID");
        }

        view.wrap(buffer, secondaryIndividualAllocIDOffset, secondaryIndividualAllocIDLength);
    }


    private int allocMethod = MISSING_INT;

    private boolean hasAllocMethod;

    public int allocMethod()
    {
        if (!hasAllocMethod)
        {
            throw new IllegalArgumentException("No value for optional field: AllocMethod");
        }

        return allocMethod;
    }

    public boolean hasAllocMethod()
    {
        return hasAllocMethod;
    }



    private final CharArrayWrapper allocMethodWrapper = new CharArrayWrapper();
    public AllocMethod allocMethodAsEnum()
    {
        if (!hasAllocMethod)
 return AllocMethod.NULL_VAL;
        return AllocMethod.decode(allocMethod);
    }

    private char[] allocCustomerCapacity = new char[1];

    private boolean hasAllocCustomerCapacity;

    public char[] allocCustomerCapacity()
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        return allocCustomerCapacity;
    }

    public boolean hasAllocCustomerCapacity()
    {
        return hasAllocCustomerCapacity;
    }


    private int allocCustomerCapacityOffset;

    private int allocCustomerCapacityLength;

    public int allocCustomerCapacityLength()
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        return allocCustomerCapacityLength;
    }

    public String allocCustomerCapacityAsString()
    {
        return hasAllocCustomerCapacity ? new String(allocCustomerCapacity, 0, allocCustomerCapacityLength) : null;
    }

    public void allocCustomerCapacity(final AsciiSequenceView view)
    {
        if (!hasAllocCustomerCapacity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocCustomerCapacity");
        }

        view.wrap(buffer, allocCustomerCapacityOffset, allocCustomerCapacityLength);
    }


    private char allocPositionEffect = MISSING_CHAR;

    private boolean hasAllocPositionEffect;

    public char allocPositionEffect()
    {
        if (!hasAllocPositionEffect)
        {
            throw new IllegalArgumentException("No value for optional field: AllocPositionEffect");
        }

        return allocPositionEffect;
    }

    public boolean hasAllocPositionEffect()
    {
        return hasAllocPositionEffect;
    }



    private final CharArrayWrapper allocPositionEffectWrapper = new CharArrayWrapper();
    public AllocPositionEffect allocPositionEffectAsEnum()
    {
        if (!hasAllocPositionEffect)
 return AllocPositionEffect.NULL_VAL;
        return AllocPositionEffect.decode(allocPositionEffect);
    }

    private int individualAllocType = MISSING_INT;

    private boolean hasIndividualAllocType;

    public int individualAllocType()
    {
        if (!hasIndividualAllocType)
        {
            throw new IllegalArgumentException("No value for optional field: IndividualAllocType");
        }

        return individualAllocType;
    }

    public boolean hasIndividualAllocType()
    {
        return hasIndividualAllocType;
    }



    private final CharArrayWrapper individualAllocTypeWrapper = new CharArrayWrapper();
    public IndividualAllocType individualAllocTypeAsEnum()
    {
        if (!hasIndividualAllocType)
 return IndividualAllocType.NULL_VAL;
        return IndividualAllocType.decode(individualAllocType);
    }



    private NestedPartyIDsGroupDecoder nestedPartyIDsGroup = null;
    public NestedPartyIDsGroupDecoder nestedPartyIDsGroup()
    {
        return nestedPartyIDsGroup;
    }

    private int noNestedPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoNestedPartyIDsGroupCounter;

    public int noNestedPartyIDsGroupCounter()
    {
        if (!hasNoNestedPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoNestedPartyIDsGroupCounter");
        }

        return noNestedPartyIDsGroupCounter;
    }

    public boolean hasNoNestedPartyIDsGroupCounter()
    {
        return hasNoNestedPartyIDsGroupCounter;
    }




    private NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator = new NestedPartyIDsGroupIterator(this);
    public NestedPartyIDsGroupIterator nestedPartyIDsGroupIterator()
    {
        return nestedPartyIDsGroupIterator.iterator();
    }


    private boolean notifyBrokerOfCredit;

    private boolean hasNotifyBrokerOfCredit;

    public boolean notifyBrokerOfCredit()
    {
        if (!hasNotifyBrokerOfCredit)
        {
            throw new IllegalArgumentException("No value for optional field: NotifyBrokerOfCredit");
        }

        return notifyBrokerOfCredit;
    }

    public boolean hasNotifyBrokerOfCredit()
    {
        return hasNotifyBrokerOfCredit;
    }



    private int allocHandlInst = MISSING_INT;

    private boolean hasAllocHandlInst;

    public int allocHandlInst()
    {
        if (!hasAllocHandlInst)
        {
            throw new IllegalArgumentException("No value for optional field: AllocHandlInst");
        }

        return allocHandlInst;
    }

    public boolean hasAllocHandlInst()
    {
        return hasAllocHandlInst;
    }



    private final CharArrayWrapper allocHandlInstWrapper = new CharArrayWrapper();
    public AllocHandlInst allocHandlInstAsEnum()
    {
        if (!hasAllocHandlInst)
 return AllocHandlInst.NULL_VAL;
        return AllocHandlInst.decode(allocHandlInst);
    }

    private char[] allocText = new char[1];

    private boolean hasAllocText;

    public char[] allocText()
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        return allocText;
    }

    public boolean hasAllocText()
    {
        return hasAllocText;
    }


    private int allocTextOffset;

    private int allocTextLength;

    public int allocTextLength()
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        return allocTextLength;
    }

    public String allocTextAsString()
    {
        return hasAllocText ? new String(allocText, 0, allocTextLength) : null;
    }

    public void allocText(final AsciiSequenceView view)
    {
        if (!hasAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: AllocText");
        }

        view.wrap(buffer, allocTextOffset, allocTextLength);
    }


    private int encodedAllocTextLen = MISSING_INT;

    private boolean hasEncodedAllocTextLen;

    public int encodedAllocTextLen()
    {
        if (!hasEncodedAllocTextLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedAllocTextLen");
        }

        return encodedAllocTextLen;
    }

    public boolean hasEncodedAllocTextLen()
    {
        return hasEncodedAllocTextLen;
    }



    private byte[] encodedAllocText = new byte[1];

    private boolean hasEncodedAllocText;

    public byte[] encodedAllocText()
    {
        if (!hasEncodedAllocText)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedAllocText");
        }

        return encodedAllocText;
    }

    public boolean hasEncodedAllocText()
    {
        return hasEncodedAllocText;
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


    private DecimalFloat allocAvgPx = DecimalFloat.newNaNValue();

    private boolean hasAllocAvgPx;

    public DecimalFloat allocAvgPx()
    {
        if (!hasAllocAvgPx)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAvgPx");
        }

        return allocAvgPx;
    }

    public boolean hasAllocAvgPx()
    {
        return hasAllocAvgPx;
    }



    private DecimalFloat allocNetMoney = DecimalFloat.newNaNValue();

    private boolean hasAllocNetMoney;

    public DecimalFloat allocNetMoney()
    {
        if (!hasAllocNetMoney)
        {
            throw new IllegalArgumentException("No value for optional field: AllocNetMoney");
        }

        return allocNetMoney;
    }

    public boolean hasAllocNetMoney()
    {
        return hasAllocNetMoney;
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



    private DecimalFloat allocSettlCurrAmt = DecimalFloat.newNaNValue();

    private boolean hasAllocSettlCurrAmt;

    public DecimalFloat allocSettlCurrAmt()
    {
        if (!hasAllocSettlCurrAmt)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrAmt");
        }

        return allocSettlCurrAmt;
    }

    public boolean hasAllocSettlCurrAmt()
    {
        return hasAllocSettlCurrAmt;
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


    private char[] allocSettlCurrency = new char[1];

    private boolean hasAllocSettlCurrency;

    public char[] allocSettlCurrency()
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        return allocSettlCurrency;
    }

    public boolean hasAllocSettlCurrency()
    {
        return hasAllocSettlCurrency;
    }


    private int allocSettlCurrencyOffset;

    private int allocSettlCurrencyLength;

    public int allocSettlCurrencyLength()
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        return allocSettlCurrencyLength;
    }

    public String allocSettlCurrencyAsString()
    {
        return hasAllocSettlCurrency ? new String(allocSettlCurrency, 0, allocSettlCurrencyLength) : null;
    }

    public void allocSettlCurrency(final AsciiSequenceView view)
    {
        if (!hasAllocSettlCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlCurrency");
        }

        view.wrap(buffer, allocSettlCurrencyOffset, allocSettlCurrencyLength);
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

    private DecimalFloat allocAccruedInterestAmt = DecimalFloat.newNaNValue();

    private boolean hasAllocAccruedInterestAmt;

    public DecimalFloat allocAccruedInterestAmt()
    {
        if (!hasAllocAccruedInterestAmt)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccruedInterestAmt");
        }

        return allocAccruedInterestAmt;
    }

    public boolean hasAllocAccruedInterestAmt()
    {
        return hasAllocAccruedInterestAmt;
    }



    private DecimalFloat allocInterestAtMaturity = DecimalFloat.newNaNValue();

    private boolean hasAllocInterestAtMaturity;

    public DecimalFloat allocInterestAtMaturity()
    {
        if (!hasAllocInterestAtMaturity)
        {
            throw new IllegalArgumentException("No value for optional field: AllocInterestAtMaturity");
        }

        return allocInterestAtMaturity;
    }

    public boolean hasAllocInterestAtMaturity()
    {
        return hasAllocInterestAtMaturity;
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


    private char[] clearingFeeIndicator = new char[1];

    private boolean hasClearingFeeIndicator;

    public char[] clearingFeeIndicator()
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        return clearingFeeIndicator;
    }

    public boolean hasClearingFeeIndicator()
    {
        return hasClearingFeeIndicator;
    }


    private int clearingFeeIndicatorOffset;

    private int clearingFeeIndicatorLength;

    public int clearingFeeIndicatorLength()
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        return clearingFeeIndicatorLength;
    }

    public String clearingFeeIndicatorAsString()
    {
        return hasClearingFeeIndicator ? new String(clearingFeeIndicator, 0, clearingFeeIndicatorLength) : null;
    }

    public void clearingFeeIndicator(final AsciiSequenceView view)
    {
        if (!hasClearingFeeIndicator)
        {
            throw new IllegalArgumentException("No value for optional field: ClearingFeeIndicator");
        }

        view.wrap(buffer, clearingFeeIndicatorOffset, clearingFeeIndicatorLength);
    }


    private final CharArrayWrapper clearingFeeIndicatorWrapper = new CharArrayWrapper();
    public ClearingFeeIndicator clearingFeeIndicatorAsEnum()
    {
        if (!hasClearingFeeIndicator)
 return ClearingFeeIndicator.NULL_VAL;
        clearingFeeIndicatorWrapper.wrap(this.clearingFeeIndicator(), clearingFeeIndicatorLength);
        return ClearingFeeIndicator.decode(clearingFeeIndicatorWrapper);
    }

    private int allocSettlInstType = MISSING_INT;

    private boolean hasAllocSettlInstType;

    public int allocSettlInstType()
    {
        if (!hasAllocSettlInstType)
        {
            throw new IllegalArgumentException("No value for optional field: AllocSettlInstType");
        }

        return allocSettlInstType;
    }

    public boolean hasAllocSettlInstType()
    {
        return hasAllocSettlInstType;
    }



    private final CharArrayWrapper allocSettlInstTypeWrapper = new CharArrayWrapper();
    public AllocSettlInstType allocSettlInstTypeAsEnum()
    {
        if (!hasAllocSettlInstType)
 return AllocSettlInstType.NULL_VAL;
        return AllocSettlInstType.decode(allocSettlInstType);
    }


    private int settlDeliveryType = MISSING_INT;

    private boolean hasSettlDeliveryType;

    public int settlDeliveryType()
    {
        if (!hasSettlDeliveryType)
        {
            throw new IllegalArgumentException("No value for optional field: SettlDeliveryType");
        }

        return settlDeliveryType;
    }

    public boolean hasSettlDeliveryType()
    {
        return hasSettlDeliveryType;
    }



    private final CharArrayWrapper settlDeliveryTypeWrapper = new CharArrayWrapper();
    public SettlDeliveryType settlDeliveryTypeAsEnum()
    {
        if (!hasSettlDeliveryType)
 return SettlDeliveryType.NULL_VAL;
        return SettlDeliveryType.decode(settlDeliveryType);
    }

    private int standInstDbType = MISSING_INT;

    private boolean hasStandInstDbType;

    public int standInstDbType()
    {
        if (!hasStandInstDbType)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbType");
        }

        return standInstDbType;
    }

    public boolean hasStandInstDbType()
    {
        return hasStandInstDbType;
    }



    private final CharArrayWrapper standInstDbTypeWrapper = new CharArrayWrapper();
    public StandInstDbType standInstDbTypeAsEnum()
    {
        if (!hasStandInstDbType)
 return StandInstDbType.NULL_VAL;
        return StandInstDbType.decode(standInstDbType);
    }

    private char[] standInstDbName = new char[1];

    private boolean hasStandInstDbName;

    public char[] standInstDbName()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbName;
    }

    public boolean hasStandInstDbName()
    {
        return hasStandInstDbName;
    }


    private int standInstDbNameOffset;

    private int standInstDbNameLength;

    public int standInstDbNameLength()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbNameLength;
    }

    public String standInstDbNameAsString()
    {
        return hasStandInstDbName ? new String(standInstDbName, 0, standInstDbNameLength) : null;
    }

    public void standInstDbName(final AsciiSequenceView view)
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        view.wrap(buffer, standInstDbNameOffset, standInstDbNameLength);
    }


    private char[] standInstDbID = new char[1];

    private boolean hasStandInstDbID;

    public char[] standInstDbID()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbID;
    }

    public boolean hasStandInstDbID()
    {
        return hasStandInstDbID;
    }


    private int standInstDbIDOffset;

    private int standInstDbIDLength;

    public int standInstDbIDLength()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbIDLength;
    }

    public String standInstDbIDAsString()
    {
        return hasStandInstDbID ? new String(standInstDbID, 0, standInstDbIDLength) : null;
    }

    public void standInstDbID(final AsciiSequenceView view)
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        view.wrap(buffer, standInstDbIDOffset, standInstDbIDLength);
    }




    private DlvyInstGroupDecoder dlvyInstGroup = null;
    public DlvyInstGroupDecoder dlvyInstGroup()
    {
        return dlvyInstGroup;
    }

    private int noDlvyInstGroupCounter = MISSING_INT;

    private boolean hasNoDlvyInstGroupCounter;

    public int noDlvyInstGroupCounter()
    {
        if (!hasNoDlvyInstGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDlvyInstGroupCounter");
        }

        return noDlvyInstGroupCounter;
    }

    public boolean hasNoDlvyInstGroupCounter()
    {
        return hasNoDlvyInstGroupCounter;
    }




    private DlvyInstGroupIterator dlvyInstGroupIterator = new DlvyInstGroupIterator(this);
    public DlvyInstGroupIterator dlvyInstGroupIterator()
    {
        return dlvyInstGroupIterator.iterator();
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode AllocsGroup
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
                    next = new AllocsGroupDecoder(trailer, messageFields);
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
            case Constants.ALLOC_ACCOUNT:
                hasAllocAccount = true;
                allocAccount = buffer.getChars(allocAccount, valueOffset, valueLength);
                allocAccountOffset = valueOffset;
                allocAccountLength = valueLength;
                break;

            case Constants.ALLOC_ACCT_ID_SOURCE:
                hasAllocAcctIDSource = true;
                allocAcctIDSource = getInt(buffer, valueOffset, endOfField, 661, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.MATCH_STATUS:
                hasMatchStatus = true;
                matchStatus = buffer.getChar(valueOffset);
                break;

            case Constants.ALLOC_PRICE:
                hasAllocPrice = true;
                allocPrice = getFloat(buffer, allocPrice, valueOffset, valueLength, 366, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_QTY:
                hasAllocQty = true;
                allocQty = getFloat(buffer, allocQty, valueOffset, valueLength, 80, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.INDIVIDUAL_ALLOC_ID:
                hasIndividualAllocID = true;
                individualAllocID = buffer.getChars(individualAllocID, valueOffset, valueLength);
                individualAllocIDOffset = valueOffset;
                individualAllocIDLength = valueLength;
                break;

            case Constants.PROCESS_CODE:
                hasProcessCode = true;
                processCode = buffer.getChar(valueOffset);
                break;

            case Constants.SECONDARY_INDIVIDUAL_ALLOC_ID:
                hasSecondaryIndividualAllocID = true;
                secondaryIndividualAllocID = buffer.getChars(secondaryIndividualAllocID, valueOffset, valueLength);
                secondaryIndividualAllocIDOffset = valueOffset;
                secondaryIndividualAllocIDLength = valueLength;
                break;

            case Constants.ALLOC_METHOD:
                hasAllocMethod = true;
                allocMethod = getInt(buffer, valueOffset, endOfField, 1002, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_CUSTOMER_CAPACITY:
                hasAllocCustomerCapacity = true;
                allocCustomerCapacity = buffer.getChars(allocCustomerCapacity, valueOffset, valueLength);
                allocCustomerCapacityOffset = valueOffset;
                allocCustomerCapacityLength = valueLength;
                break;

            case Constants.ALLOC_POSITION_EFFECT:
                hasAllocPositionEffect = true;
                allocPositionEffect = buffer.getChar(valueOffset);
                break;

            case Constants.INDIVIDUAL_ALLOC_TYPE:
                hasIndividualAllocType = true;
                individualAllocType = getInt(buffer, valueOffset, endOfField, 992, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_NESTED_PARTY_IDS:
                hasNoNestedPartyIDsGroupCounter = true;
                noNestedPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 539, CODEC_VALIDATION_ENABLED);
                if (nestedPartyIDsGroup == null)
                {
                    nestedPartyIDsGroup = new NestedPartyIDsGroupDecoder(trailer, messageFields);
                }
                NestedPartyIDsGroupDecoder nestedPartyIDsGroupCurrent = nestedPartyIDsGroup;
                position = endOfField + 1;
                final int noNestedPartyIDsGroupCounter = this.noNestedPartyIDsGroupCounter;
                for (int i = 0; i < noNestedPartyIDsGroupCounter && position < end; i++)
                {
                    if (nestedPartyIDsGroupCurrent != null)
                    {
                        position += nestedPartyIDsGroupCurrent.decode(buffer, position, end - position);
                        nestedPartyIDsGroupCurrent = nestedPartyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (nestedPartyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NOTIFY_BROKER_OF_CREDIT:
                hasNotifyBrokerOfCredit = true;
                notifyBrokerOfCredit = buffer.getBoolean(valueOffset);
                break;

            case Constants.ALLOC_HANDL_INST:
                hasAllocHandlInst = true;
                allocHandlInst = getInt(buffer, valueOffset, endOfField, 209, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_TEXT:
                hasAllocText = true;
                allocText = buffer.getChars(allocText, valueOffset, valueLength);
                allocTextOffset = valueOffset;
                allocTextLength = valueLength;
                break;

            case Constants.ENCODED_ALLOC_TEXT_LEN:
                hasEncodedAllocTextLen = true;
                encodedAllocTextLen = getInt(buffer, valueOffset, endOfField, 360, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_ALLOC_TEXT:
                hasEncodedAllocText = true;
                encodedAllocText = buffer.getBytes(encodedAllocText, valueOffset, encodedAllocTextLen);
                endOfField = valueOffset + encodedAllocTextLen;
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


            case Constants.ALLOC_AVG_PX:
                hasAllocAvgPx = true;
                allocAvgPx = getFloat(buffer, allocAvgPx, valueOffset, valueLength, 153, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_NET_MONEY:
                hasAllocNetMoney = true;
                allocNetMoney = getFloat(buffer, allocNetMoney, valueOffset, valueLength, 154, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURR_AMT:
                hasSettlCurrAmt = true;
                settlCurrAmt = getFloat(buffer, settlCurrAmt, valueOffset, valueLength, 119, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_SETTL_CURR_AMT:
                hasAllocSettlCurrAmt = true;
                allocSettlCurrAmt = getFloat(buffer, allocSettlCurrAmt, valueOffset, valueLength, 737, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURRENCY:
                hasSettlCurrency = true;
                settlCurrency = buffer.getChars(settlCurrency, valueOffset, valueLength);
                settlCurrencyOffset = valueOffset;
                settlCurrencyLength = valueLength;
                break;

            case Constants.ALLOC_SETTL_CURRENCY:
                hasAllocSettlCurrency = true;
                allocSettlCurrency = buffer.getChars(allocSettlCurrency, valueOffset, valueLength);
                allocSettlCurrencyOffset = valueOffset;
                allocSettlCurrencyLength = valueLength;
                break;

            case Constants.SETTL_CURR_FX_RATE:
                hasSettlCurrFxRate = true;
                settlCurrFxRate = getFloat(buffer, settlCurrFxRate, valueOffset, valueLength, 155, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_CURR_FX_RATE_CALC:
                hasSettlCurrFxRateCalc = true;
                settlCurrFxRateCalc = buffer.getChar(valueOffset);
                break;

            case Constants.ALLOC_ACCRUED_INTEREST_AMT:
                hasAllocAccruedInterestAmt = true;
                allocAccruedInterestAmt = getFloat(buffer, allocAccruedInterestAmt, valueOffset, valueLength, 742, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ALLOC_INTEREST_AT_MATURITY:
                hasAllocInterestAtMaturity = true;
                allocInterestAtMaturity = getFloat(buffer, allocInterestAtMaturity, valueOffset, valueLength, 741, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_MISC_FEES:
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


            case Constants.NO_CLEARING_INSTRUCTIONS:
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


            case Constants.CLEARING_FEE_INDICATOR:
                hasClearingFeeIndicator = true;
                clearingFeeIndicator = buffer.getChars(clearingFeeIndicator, valueOffset, valueLength);
                clearingFeeIndicatorOffset = valueOffset;
                clearingFeeIndicatorLength = valueLength;
                break;

            case Constants.ALLOC_SETTL_INST_TYPE:
                hasAllocSettlInstType = true;
                allocSettlInstType = getInt(buffer, valueOffset, endOfField, 780, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SETTL_DELIVERY_TYPE:
                hasSettlDeliveryType = true;
                settlDeliveryType = getInt(buffer, valueOffset, endOfField, 172, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STAND_INST_DB_TYPE:
                hasStandInstDbType = true;
                standInstDbType = getInt(buffer, valueOffset, endOfField, 169, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STAND_INST_DB_NAME:
                hasStandInstDbName = true;
                standInstDbName = buffer.getChars(standInstDbName, valueOffset, valueLength);
                standInstDbNameOffset = valueOffset;
                standInstDbNameLength = valueLength;
                break;

            case Constants.STAND_INST_DB_ID:
                hasStandInstDbID = true;
                standInstDbID = buffer.getChars(standInstDbID, valueOffset, valueLength);
                standInstDbIDOffset = valueOffset;
                standInstDbIDLength = valueLength;
                break;

            case Constants.NO_DLVY_INST:
                hasNoDlvyInstGroupCounter = true;
                noDlvyInstGroupCounter = getInt(buffer, valueOffset, endOfField, 85, CODEC_VALIDATION_ENABLED);
                if (dlvyInstGroup == null)
                {
                    dlvyInstGroup = new DlvyInstGroupDecoder(trailer, messageFields);
                }
                DlvyInstGroupDecoder dlvyInstGroupCurrent = dlvyInstGroup;
                position = endOfField + 1;
                final int noDlvyInstGroupCounter = this.noDlvyInstGroupCounter;
                for (int i = 0; i < noDlvyInstGroupCounter && position < end; i++)
                {
                    if (dlvyInstGroupCurrent != null)
                    {
                        position += dlvyInstGroupCurrent.decode(buffer, position, end - position);
                        dlvyInstGroupCurrent = dlvyInstGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (dlvyInstGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetMatchStatus();
        this.resetAllocPrice();
        this.resetAllocQty();
        this.resetIndividualAllocID();
        this.resetProcessCode();
        this.resetSecondaryIndividualAllocID();
        this.resetAllocMethod();
        this.resetAllocCustomerCapacity();
        this.resetAllocPositionEffect();
        this.resetIndividualAllocType();
        this.resetNotifyBrokerOfCredit();
        this.resetAllocHandlInst();
        this.resetAllocText();
        this.resetEncodedAllocTextLen();
        this.resetEncodedAllocText();
        this.resetAllocAvgPx();
        this.resetAllocNetMoney();
        this.resetSettlCurrAmt();
        this.resetAllocSettlCurrAmt();
        this.resetSettlCurrency();
        this.resetAllocSettlCurrency();
        this.resetSettlCurrFxRate();
        this.resetSettlCurrFxRateCalc();
        this.resetAllocAccruedInterestAmt();
        this.resetAllocInterestAtMaturity();
        this.resetClearingFeeIndicator();
        this.resetAllocSettlInstType();
        this.resetNestedPartyIDsGroup();
        this.resetCommission();
        this.resetCommType();
        this.resetCommCurrency();
        this.resetFundRenewWaiv();
        this.resetMiscFeesGroup();
        this.resetClearingInstructionsGroup();
        this.resetSettlDeliveryType();
        this.resetStandInstDbType();
        this.resetStandInstDbName();
        this.resetStandInstDbID();
        this.resetDlvyInstGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetAllocAccount()
    {
        hasAllocAccount = false;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetMatchStatus()
    {
        hasMatchStatus = false;
    }

    public void resetAllocPrice()
    {
        hasAllocPrice = false;
    }

    public void resetAllocQty()
    {
        hasAllocQty = false;
    }

    public void resetIndividualAllocID()
    {
        hasIndividualAllocID = false;
    }

    public void resetProcessCode()
    {
        hasProcessCode = false;
    }

    public void resetSecondaryIndividualAllocID()
    {
        hasSecondaryIndividualAllocID = false;
    }

    public void resetAllocMethod()
    {
        hasAllocMethod = false;
    }

    public void resetAllocCustomerCapacity()
    {
        hasAllocCustomerCapacity = false;
    }

    public void resetAllocPositionEffect()
    {
        hasAllocPositionEffect = false;
    }

    public void resetIndividualAllocType()
    {
        hasIndividualAllocType = false;
    }

    public void resetNotifyBrokerOfCredit()
    {
        hasNotifyBrokerOfCredit = false;
    }

    public void resetAllocHandlInst()
    {
        hasAllocHandlInst = false;
    }

    public void resetAllocText()
    {
        hasAllocText = false;
    }

    public void resetEncodedAllocTextLen()
    {
        hasEncodedAllocTextLen = false;
    }

    public void resetEncodedAllocText()
    {
        hasEncodedAllocText = false;
    }

    public void resetAllocAvgPx()
    {
        hasAllocAvgPx = false;
    }

    public void resetAllocNetMoney()
    {
        hasAllocNetMoney = false;
    }

    public void resetSettlCurrAmt()
    {
        hasSettlCurrAmt = false;
    }

    public void resetAllocSettlCurrAmt()
    {
        hasAllocSettlCurrAmt = false;
    }

    public void resetSettlCurrency()
    {
        hasSettlCurrency = false;
    }

    public void resetAllocSettlCurrency()
    {
        hasAllocSettlCurrency = false;
    }

    public void resetSettlCurrFxRate()
    {
        hasSettlCurrFxRate = false;
    }

    public void resetSettlCurrFxRateCalc()
    {
        hasSettlCurrFxRateCalc = false;
    }

    public void resetAllocAccruedInterestAmt()
    {
        hasAllocAccruedInterestAmt = false;
    }

    public void resetAllocInterestAtMaturity()
    {
        hasAllocInterestAtMaturity = false;
    }

    public void resetClearingFeeIndicator()
    {
        hasClearingFeeIndicator = false;
    }

    public void resetAllocSettlInstType()
    {
        hasAllocSettlInstType = false;
    }

    public void resetNestedPartyIDsGroup()
    {
        for (final NestedPartyIDsGroupDecoder nestedPartyIDsGroupDecoder : nestedPartyIDsGroupIterator.iterator())
        {
            nestedPartyIDsGroupDecoder.reset();
            if (nestedPartyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noNestedPartyIDsGroupCounter = MISSING_INT;
        hasNoNestedPartyIDsGroupCounter = false;
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

    public void resetSettlDeliveryType()
    {
        hasSettlDeliveryType = false;
    }

    public void resetStandInstDbType()
    {
        hasStandInstDbType = false;
    }

    public void resetStandInstDbName()
    {
        hasStandInstDbName = false;
    }

    public void resetStandInstDbID()
    {
        hasStandInstDbID = false;
    }

    public void resetDlvyInstGroup()
    {
        for (final DlvyInstGroupDecoder dlvyInstGroupDecoder : dlvyInstGroupIterator.iterator())
        {
            dlvyInstGroupDecoder.reset();
            if (dlvyInstGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDlvyInstGroupCounter = MISSING_INT;
        hasNoDlvyInstGroupCounter = false;
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
        builder.append("\"MessageName\": \"AllocsGroup\",\n");
        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            builder.append(this.allocAccount(), 0, allocAccountLength());
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

        if (hasMatchStatus())
        {
            indent(builder, level);
            builder.append("\"MatchStatus\": \"");
            builder.append(matchStatus);
            builder.append("\",\n");
        }

        if (hasAllocPrice())
        {
            indent(builder, level);
            builder.append("\"AllocPrice\": \"");
            allocPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocQty())
        {
            indent(builder, level);
            builder.append("\"AllocQty\": \"");
            allocQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocID\": \"");
            builder.append(this.individualAllocID(), 0, individualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasProcessCode())
        {
            indent(builder, level);
            builder.append("\"ProcessCode\": \"");
            builder.append(processCode);
            builder.append("\",\n");
        }

        if (hasSecondaryIndividualAllocID())
        {
            indent(builder, level);
            builder.append("\"SecondaryIndividualAllocID\": \"");
            builder.append(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
            builder.append("\",\n");
        }

        if (hasAllocMethod())
        {
            indent(builder, level);
            builder.append("\"AllocMethod\": \"");
            builder.append(allocMethod);
            builder.append("\",\n");
        }

        if (hasAllocCustomerCapacity())
        {
            indent(builder, level);
            builder.append("\"AllocCustomerCapacity\": \"");
            builder.append(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
            builder.append("\",\n");
        }

        if (hasAllocPositionEffect())
        {
            indent(builder, level);
            builder.append("\"AllocPositionEffect\": \"");
            builder.append(allocPositionEffect);
            builder.append("\",\n");
        }

        if (hasIndividualAllocType())
        {
            indent(builder, level);
            builder.append("\"IndividualAllocType\": \"");
            builder.append(individualAllocType);
            builder.append("\",\n");
        }

    if (hasNoNestedPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"NestedPartyIDsGroup\": [\n");
        NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
        for (int i = 0, size = this.noNestedPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            nestedPartyIDsGroup.appendTo(builder, level + 1);            if (nestedPartyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            nestedPartyIDsGroup = nestedPartyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasNotifyBrokerOfCredit())
        {
            indent(builder, level);
            builder.append("\"NotifyBrokerOfCredit\": \"");
            builder.append(notifyBrokerOfCredit);
            builder.append("\",\n");
        }

        if (hasAllocHandlInst())
        {
            indent(builder, level);
            builder.append("\"AllocHandlInst\": \"");
            builder.append(allocHandlInst);
            builder.append("\",\n");
        }

        if (hasAllocText())
        {
            indent(builder, level);
            builder.append("\"AllocText\": \"");
            builder.append(this.allocText(), 0, allocTextLength());
            builder.append("\",\n");
        }

        if (hasEncodedAllocTextLen())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocTextLen\": \"");
            builder.append(encodedAllocTextLen);
            builder.append("\",\n");
        }

        if (hasEncodedAllocText())
        {
            indent(builder, level);
            builder.append("\"EncodedAllocText\": \"");
            appendData(builder, encodedAllocText, encodedAllocTextLen);
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

        if (hasAllocAvgPx())
        {
            indent(builder, level);
            builder.append("\"AllocAvgPx\": \"");
            allocAvgPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocNetMoney())
        {
            indent(builder, level);
            builder.append("\"AllocNetMoney\": \"");
            allocNetMoney.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"SettlCurrAmt\": \"");
            settlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrAmt())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrAmt\": \"");
            allocSettlCurrAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"SettlCurrency\": \"");
            builder.append(this.settlCurrency(), 0, settlCurrencyLength());
            builder.append("\",\n");
        }

        if (hasAllocSettlCurrency())
        {
            indent(builder, level);
            builder.append("\"AllocSettlCurrency\": \"");
            builder.append(this.allocSettlCurrency(), 0, allocSettlCurrencyLength());
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

        if (hasAllocAccruedInterestAmt())
        {
            indent(builder, level);
            builder.append("\"AllocAccruedInterestAmt\": \"");
            allocAccruedInterestAmt.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasAllocInterestAtMaturity())
        {
            indent(builder, level);
            builder.append("\"AllocInterestAtMaturity\": \"");
            allocInterestAtMaturity.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoMiscFeesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MiscFeesGroup\": [\n");
        MiscFeesGroupDecoder miscFeesGroup = this.miscFeesGroup;
        for (int i = 0, size = this.noMiscFeesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            miscFeesGroup.appendTo(builder, level + 1);            if (miscFeesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            miscFeesGroup = miscFeesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoClearingInstructionsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"ClearingInstructionsGroup\": [\n");
        ClearingInstructionsGroupDecoder clearingInstructionsGroup = this.clearingInstructionsGroup;
        for (int i = 0, size = this.noClearingInstructionsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            clearingInstructionsGroup.appendTo(builder, level + 1);            if (clearingInstructionsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            clearingInstructionsGroup = clearingInstructionsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasClearingFeeIndicator())
        {
            indent(builder, level);
            builder.append("\"ClearingFeeIndicator\": \"");
            builder.append(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
            builder.append("\",\n");
        }

        if (hasAllocSettlInstType())
        {
            indent(builder, level);
            builder.append("\"AllocSettlInstType\": \"");
            builder.append(allocSettlInstType);
            builder.append("\",\n");
        }

        if (hasSettlDeliveryType())
        {
            indent(builder, level);
            builder.append("\"SettlDeliveryType\": \"");
            builder.append(settlDeliveryType);
            builder.append("\",\n");
        }

        if (hasStandInstDbType())
        {
            indent(builder, level);
            builder.append("\"StandInstDbType\": \"");
            builder.append(standInstDbType);
            builder.append("\",\n");
        }

        if (hasStandInstDbName())
        {
            indent(builder, level);
            builder.append("\"StandInstDbName\": \"");
            builder.append(this.standInstDbName(), 0, standInstDbNameLength());
            builder.append("\",\n");
        }

        if (hasStandInstDbID())
        {
            indent(builder, level);
            builder.append("\"StandInstDbID\": \"");
            builder.append(this.standInstDbID(), 0, standInstDbIDLength());
            builder.append("\",\n");
        }

    if (hasNoDlvyInstGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DlvyInstGroup\": [\n");
        DlvyInstGroupDecoder dlvyInstGroup = this.dlvyInstGroup;
        for (int i = 0, size = this.noDlvyInstGroupCounter; i < size; i++)
        {
            indent(builder, level);
            dlvyInstGroup.appendTo(builder, level + 1);            if (dlvyInstGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            dlvyInstGroup = dlvyInstGroup.next();        }
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
    public AllocsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((AllocsGroupEncoder)encoder);
    }

    public AllocsGroupEncoder toEncoder(final AllocsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasAllocAccount())
        {
            encoder.allocAccount(this.allocAccount(), 0, allocAccountLength());
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasMatchStatus())
        {
            encoder.matchStatus(this.matchStatus());
        }

        if (hasAllocPrice())
        {
            encoder.allocPrice(this.allocPrice());
        }

        if (hasAllocQty())
        {
            encoder.allocQty(this.allocQty());
        }

        if (hasIndividualAllocID())
        {
            encoder.individualAllocID(this.individualAllocID(), 0, individualAllocIDLength());
        }

        if (hasProcessCode())
        {
            encoder.processCode(this.processCode());
        }

        if (hasSecondaryIndividualAllocID())
        {
            encoder.secondaryIndividualAllocID(this.secondaryIndividualAllocID(), 0, secondaryIndividualAllocIDLength());
        }

        if (hasAllocMethod())
        {
            encoder.allocMethod(this.allocMethod());
        }

        if (hasAllocCustomerCapacity())
        {
            encoder.allocCustomerCapacity(this.allocCustomerCapacity(), 0, allocCustomerCapacityLength());
        }

        if (hasAllocPositionEffect())
        {
            encoder.allocPositionEffect(this.allocPositionEffect());
        }

        if (hasIndividualAllocType())
        {
            encoder.individualAllocType(this.individualAllocType());
        }


        final NestedPartiesEncoder nestedParties = encoder.nestedParties();        if (hasNoNestedPartyIDsGroupCounter)
        {
            final int size = this.noNestedPartyIDsGroupCounter;
            NestedPartyIDsGroupDecoder nestedPartyIDsGroup = this.nestedPartyIDsGroup;
            NestedPartyIDsGroupEncoder nestedPartyIDsGroupEncoder = nestedParties.nestedPartyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (nestedPartyIDsGroup != null)
                {
                    nestedPartyIDsGroup.toEncoder(nestedPartyIDsGroupEncoder);
                    nestedPartyIDsGroup = nestedPartyIDsGroup.next();
                    nestedPartyIDsGroupEncoder = nestedPartyIDsGroupEncoder.next();
                }
            }
        }


        if (hasNotifyBrokerOfCredit())
        {
            encoder.notifyBrokerOfCredit(this.notifyBrokerOfCredit());
        }

        if (hasAllocHandlInst())
        {
            encoder.allocHandlInst(this.allocHandlInst());
        }

        if (hasAllocText())
        {
            encoder.allocText(this.allocText(), 0, allocTextLength());
        }

        if (hasEncodedAllocTextLen())
        {
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
        }

        if (hasEncodedAllocText())
        {
            encoder.encodedAllocTextAsCopy(this.encodedAllocText(), 0, encodedAllocTextLen());
            encoder.encodedAllocTextLen(this.encodedAllocTextLen());
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


        if (hasAllocAvgPx())
        {
            encoder.allocAvgPx(this.allocAvgPx());
        }

        if (hasAllocNetMoney())
        {
            encoder.allocNetMoney(this.allocNetMoney());
        }

        if (hasSettlCurrAmt())
        {
            encoder.settlCurrAmt(this.settlCurrAmt());
        }

        if (hasAllocSettlCurrAmt())
        {
            encoder.allocSettlCurrAmt(this.allocSettlCurrAmt());
        }

        if (hasSettlCurrency())
        {
            encoder.settlCurrency(this.settlCurrency(), 0, settlCurrencyLength());
        }

        if (hasAllocSettlCurrency())
        {
            encoder.allocSettlCurrency(this.allocSettlCurrency(), 0, allocSettlCurrencyLength());
        }

        if (hasSettlCurrFxRate())
        {
            encoder.settlCurrFxRate(this.settlCurrFxRate());
        }

        if (hasSettlCurrFxRateCalc())
        {
            encoder.settlCurrFxRateCalc(this.settlCurrFxRateCalc());
        }

        if (hasAllocAccruedInterestAmt())
        {
            encoder.allocAccruedInterestAmt(this.allocAccruedInterestAmt());
        }

        if (hasAllocInterestAtMaturity())
        {
            encoder.allocInterestAtMaturity(this.allocInterestAtMaturity());
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


        if (hasClearingFeeIndicator())
        {
            encoder.clearingFeeIndicator(this.clearingFeeIndicator(), 0, clearingFeeIndicatorLength());
        }

        if (hasAllocSettlInstType())
        {
            encoder.allocSettlInstType(this.allocSettlInstType());
        }


        final SettlInstructionsDataEncoder settlInstructionsData = encoder.settlInstructionsData();        if (hasSettlDeliveryType())
        {
            settlInstructionsData.settlDeliveryType(this.settlDeliveryType());
        }

        if (hasStandInstDbType())
        {
            settlInstructionsData.standInstDbType(this.standInstDbType());
        }

        if (hasStandInstDbName())
        {
            settlInstructionsData.standInstDbName(this.standInstDbName(), 0, standInstDbNameLength());
        }

        if (hasStandInstDbID())
        {
            settlInstructionsData.standInstDbID(this.standInstDbID(), 0, standInstDbIDLength());
        }


        final DlvyInstGrpEncoder dlvyInstGrp = settlInstructionsData.dlvyInstGrp();        if (hasNoDlvyInstGroupCounter)
        {
            final int size = this.noDlvyInstGroupCounter;
            DlvyInstGroupDecoder dlvyInstGroup = this.dlvyInstGroup;
            DlvyInstGroupEncoder dlvyInstGroupEncoder = dlvyInstGrp.dlvyInstGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (dlvyInstGroup != null)
                {
                    dlvyInstGroup.toEncoder(dlvyInstGroupEncoder);
                    dlvyInstGroup = dlvyInstGroup.next();
                    dlvyInstGroupEncoder = dlvyInstGroupEncoder.next();
                }
            }
        }


        return encoder;
    }

}
    public class AllocsGroupIterator implements Iterable<AllocsGroupDecoder>, java.util.Iterator<AllocsGroupDecoder>
    {
        private final AllocGrpDecoder parent;
        private int remainder;
        private AllocsGroupDecoder current;

        public AllocsGroupIterator(final AllocGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public AllocsGroupDecoder next()
        {
            remainder--;
            final AllocsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoAllocsGroupCounter() ? parent.noAllocsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.allocsGroup();
        }
        public AllocsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public AllocsGroupIterator allocsGroupIterator();
    public int noAllocsGroupCounter();
    public boolean hasNoAllocsGroupCounter();
    public AllocsGroupDecoder allocsGroup();

}
