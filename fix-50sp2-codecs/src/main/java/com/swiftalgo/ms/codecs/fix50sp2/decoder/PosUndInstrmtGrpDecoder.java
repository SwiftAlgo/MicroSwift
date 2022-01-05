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
import com.swiftalgo.ms.codecs.fix50sp2.builder.PosUndInstrmtGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PosUndInstrmtGrpEncoder.UnderlyingsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingAmountEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingAmountEncoder.UnderlyingAmountsGroupEncoder;

public interface PosUndInstrmtGrpDecoder 
{



public class UnderlyingsGroupDecoder extends CommonDecoderImpl implements UnderlyingInstrumentDecoder, UnderlyingAmountDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(144);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.UNDERLYING_SYMBOL);
            GROUP_FIELDS.add(Constants.UNDERLYING_SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRODUCT);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_F_I_CODE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_MATURITY_TIME);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUPON_PAYMENT_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_RESTRUCTURING_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SENIORITY);
            GROUP_FIELDS.add(Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING);
            GROUP_FIELDS.add(Constants.UNDERLYING_ATTACHMENT_POINT);
            GROUP_FIELDS.add(Constants.UNDERLYING_DETACHMENT_POINT);
            GROUP_FIELDS.add(Constants.UNDERLYING_ISSUE_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPURCHASE_TERM);
            GROUP_FIELDS.add(Constants.UNDERLYING_REPURCHASE_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_FACTOR);
            GROUP_FIELDS.add(Constants.UNDERLYING_CREDIT_RATING);
            GROUP_FIELDS.add(Constants.UNDERLYING_INSTR_REGISTRY);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUNTRY_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LOCALE_OF_ISSUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_REDEMPTION_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_STRIKE_CURRENCY);
            GROUP_FIELDS.add(Constants.UNDERLYING_OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER);
            GROUP_FIELDS.add(Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT);
            GROUP_FIELDS.add(Constants.UNDERLYING_FLOW_SCHEDULE_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.UNDERLYING_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_TIME_UNIT);
            GROUP_FIELDS.add(Constants.UNDERLYING_EXERCISE_STYLE);
            GROUP_FIELDS.add(Constants.UNDERLYING_COUPON_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ISSUER);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_ISSUER);
            GROUP_FIELDS.add(Constants.UNDERLYING_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN);
            GROUP_FIELDS.add(Constants.ENCODED_UNDERLYING_SECURITY_DESC);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_P_PROGRAM);
            GROUP_FIELDS.add(Constants.UNDERLYING_C_P_REG_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ALLOCATION_PERCENT);
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENCY);
            GROUP_FIELDS.add(Constants.UNDERLYING_QTY);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTLEMENT_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CASH_AMOUNT);
            GROUP_FIELDS.add(Constants.UNDERLYING_CASH_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_PX);
            GROUP_FIELDS.add(Constants.UNDERLYING_DIRTY_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_START_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_CURRENT_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_END_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_ADJUSTED_QUANTITY);
            GROUP_FIELDS.add(Constants.UNDERLYING_F_X_RATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_F_X_RATE_CALC);
            GROUP_FIELDS.add(Constants.UNDERLYING_CAP_VALUE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_METHOD);
            GROUP_FIELDS.add(Constants.UNDERLYING_PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_DELIVERY_AMOUNT);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_SETTL_PRICE_TYPE);
            ALL_GROUP_FIELDS.add(Constants.UNDERLYING_DELIVERY_AMOUNT);
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
        if (hasUnderlyingSettlementType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingSettlementType.isValid(underlyingSettlementType()))
        {
            invalidTagId = 975;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnderlyingCashType)
        {
        underlyingCashTypeWrapper.wrap(this.underlyingCashType(), underlyingCashTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingCashType.isValid(underlyingCashTypeWrapper))
        {
            invalidTagId = 974;
            rejectReason = 5;
            return false;
        }
        }

        if (hasUnderlyingFXRateCalc)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !UnderlyingFXRateCalc.isValid(underlyingFXRateCalc()))
        {
            invalidTagId = 1046;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingSecurityAltIDGroupIterator iterator = underlyingSecurityAltIDGroupIterator.iterator();
                for (final UnderlyingSecurityAltIDGroupDecoder group : iterator)
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
                    invalidTagId = 457;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUnderlyingStipsGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingStipsGroupIterator iterator = underlyingStipsGroupIterator.iterator();
                for (final UnderlyingStipsGroupDecoder group : iterator)
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
                    invalidTagId = 887;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            {
                int count = 0;
                final UndlyInstrumentPartiesGroupIterator iterator = undlyInstrumentPartiesGroupIterator.iterator();
                for (final UndlyInstrumentPartiesGroupDecoder group : iterator)
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
                    invalidTagId = 1058;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoUnderlyingAmountsGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingAmountsGroupIterator iterator = underlyingAmountsGroupIterator.iterator();
                for (final UnderlyingAmountsGroupDecoder group : iterator)
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
                    invalidTagId = 984;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public UnderlyingsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private UnderlyingsGroupDecoder next = null;

    public UnderlyingsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(10);


    private char[] underlyingSymbol = new char[1];

    private boolean hasUnderlyingSymbol;

    public char[] underlyingSymbol()
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        return underlyingSymbol;
    }

    public boolean hasUnderlyingSymbol()
    {
        return hasUnderlyingSymbol;
    }


    private int underlyingSymbolOffset;

    private int underlyingSymbolLength;

    public int underlyingSymbolLength()
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        return underlyingSymbolLength;
    }

    public String underlyingSymbolAsString()
    {
        return hasUnderlyingSymbol ? new String(underlyingSymbol, 0, underlyingSymbolLength) : null;
    }

    public void underlyingSymbol(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbol");
        }

        view.wrap(buffer, underlyingSymbolOffset, underlyingSymbolLength);
    }


    private char[] underlyingSymbolSfx = new char[1];

    private boolean hasUnderlyingSymbolSfx;

    public char[] underlyingSymbolSfx()
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        return underlyingSymbolSfx;
    }

    public boolean hasUnderlyingSymbolSfx()
    {
        return hasUnderlyingSymbolSfx;
    }


    private int underlyingSymbolSfxOffset;

    private int underlyingSymbolSfxLength;

    public int underlyingSymbolSfxLength()
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        return underlyingSymbolSfxLength;
    }

    public String underlyingSymbolSfxAsString()
    {
        return hasUnderlyingSymbolSfx ? new String(underlyingSymbolSfx, 0, underlyingSymbolSfxLength) : null;
    }

    public void underlyingSymbolSfx(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSymbolSfx");
        }

        view.wrap(buffer, underlyingSymbolSfxOffset, underlyingSymbolSfxLength);
    }


    private char[] underlyingSecurityID = new char[1];

    private boolean hasUnderlyingSecurityID;

    public char[] underlyingSecurityID()
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        return underlyingSecurityID;
    }

    public boolean hasUnderlyingSecurityID()
    {
        return hasUnderlyingSecurityID;
    }


    private int underlyingSecurityIDOffset;

    private int underlyingSecurityIDLength;

    public int underlyingSecurityIDLength()
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        return underlyingSecurityIDLength;
    }

    public String underlyingSecurityIDAsString()
    {
        return hasUnderlyingSecurityID ? new String(underlyingSecurityID, 0, underlyingSecurityIDLength) : null;
    }

    public void underlyingSecurityID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityID");
        }

        view.wrap(buffer, underlyingSecurityIDOffset, underlyingSecurityIDLength);
    }


    private char[] underlyingSecurityIDSource = new char[1];

    private boolean hasUnderlyingSecurityIDSource;

    public char[] underlyingSecurityIDSource()
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        return underlyingSecurityIDSource;
    }

    public boolean hasUnderlyingSecurityIDSource()
    {
        return hasUnderlyingSecurityIDSource;
    }


    private int underlyingSecurityIDSourceOffset;

    private int underlyingSecurityIDSourceLength;

    public int underlyingSecurityIDSourceLength()
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        return underlyingSecurityIDSourceLength;
    }

    public String underlyingSecurityIDSourceAsString()
    {
        return hasUnderlyingSecurityIDSource ? new String(underlyingSecurityIDSource, 0, underlyingSecurityIDSourceLength) : null;
    }

    public void underlyingSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityIDSource");
        }

        view.wrap(buffer, underlyingSecurityIDSourceOffset, underlyingSecurityIDSourceLength);
    }




    private UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = null;
    public UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup()
    {
        return underlyingSecurityAltIDGroup;
    }

    private int noUnderlyingSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingSecurityAltIDGroupCounter;

    public int noUnderlyingSecurityAltIDGroupCounter()
    {
        if (!hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingSecurityAltIDGroupCounter");
        }

        return noUnderlyingSecurityAltIDGroupCounter;
    }

    public boolean hasNoUnderlyingSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingSecurityAltIDGroupCounter;
    }




    private UnderlyingSecurityAltIDGroupIterator underlyingSecurityAltIDGroupIterator = new UnderlyingSecurityAltIDGroupIterator(this);
    public UnderlyingSecurityAltIDGroupIterator underlyingSecurityAltIDGroupIterator()
    {
        return underlyingSecurityAltIDGroupIterator.iterator();
    }


    private int underlyingProduct = MISSING_INT;

    private boolean hasUnderlyingProduct;

    public int underlyingProduct()
    {
        if (!hasUnderlyingProduct)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingProduct");
        }

        return underlyingProduct;
    }

    public boolean hasUnderlyingProduct()
    {
        return hasUnderlyingProduct;
    }



    private char[] underlyingCFICode = new char[1];

    private boolean hasUnderlyingCFICode;

    public char[] underlyingCFICode()
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        return underlyingCFICode;
    }

    public boolean hasUnderlyingCFICode()
    {
        return hasUnderlyingCFICode;
    }


    private int underlyingCFICodeOffset;

    private int underlyingCFICodeLength;

    public int underlyingCFICodeLength()
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        return underlyingCFICodeLength;
    }

    public String underlyingCFICodeAsString()
    {
        return hasUnderlyingCFICode ? new String(underlyingCFICode, 0, underlyingCFICodeLength) : null;
    }

    public void underlyingCFICode(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCFICode");
        }

        view.wrap(buffer, underlyingCFICodeOffset, underlyingCFICodeLength);
    }


    private char[] underlyingSecurityType = new char[1];

    private boolean hasUnderlyingSecurityType;

    public char[] underlyingSecurityType()
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        return underlyingSecurityType;
    }

    public boolean hasUnderlyingSecurityType()
    {
        return hasUnderlyingSecurityType;
    }


    private int underlyingSecurityTypeOffset;

    private int underlyingSecurityTypeLength;

    public int underlyingSecurityTypeLength()
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        return underlyingSecurityTypeLength;
    }

    public String underlyingSecurityTypeAsString()
    {
        return hasUnderlyingSecurityType ? new String(underlyingSecurityType, 0, underlyingSecurityTypeLength) : null;
    }

    public void underlyingSecurityType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityType");
        }

        view.wrap(buffer, underlyingSecurityTypeOffset, underlyingSecurityTypeLength);
    }


    private char[] underlyingSecuritySubType = new char[1];

    private boolean hasUnderlyingSecuritySubType;

    public char[] underlyingSecuritySubType()
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        return underlyingSecuritySubType;
    }

    public boolean hasUnderlyingSecuritySubType()
    {
        return hasUnderlyingSecuritySubType;
    }


    private int underlyingSecuritySubTypeOffset;

    private int underlyingSecuritySubTypeLength;

    public int underlyingSecuritySubTypeLength()
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        return underlyingSecuritySubTypeLength;
    }

    public String underlyingSecuritySubTypeAsString()
    {
        return hasUnderlyingSecuritySubType ? new String(underlyingSecuritySubType, 0, underlyingSecuritySubTypeLength) : null;
    }

    public void underlyingSecuritySubType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecuritySubType");
        }

        view.wrap(buffer, underlyingSecuritySubTypeOffset, underlyingSecuritySubTypeLength);
    }


    private byte[] underlyingMaturityMonthYear = new byte[8];

    private boolean hasUnderlyingMaturityMonthYear;

    public byte[] underlyingMaturityMonthYear()
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        return underlyingMaturityMonthYear;
    }

    public boolean hasUnderlyingMaturityMonthYear()
    {
        return hasUnderlyingMaturityMonthYear;
    }


    private int underlyingMaturityMonthYearOffset;

    private int underlyingMaturityMonthYearLength;

    public int underlyingMaturityMonthYearLength()
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        return underlyingMaturityMonthYearLength;
    }

    public String underlyingMaturityMonthYearAsString()
    {
        return hasUnderlyingMaturityMonthYear ? new String(underlyingMaturityMonthYear, 0, underlyingMaturityMonthYearLength) : null;
    }

    public void underlyingMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityMonthYear");
        }

        view.wrap(buffer, underlyingMaturityMonthYearOffset, underlyingMaturityMonthYearLength);
    }


    private byte[] underlyingMaturityDate = new byte[8];

    private boolean hasUnderlyingMaturityDate;

    public byte[] underlyingMaturityDate()
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        return underlyingMaturityDate;
    }

    public boolean hasUnderlyingMaturityDate()
    {
        return hasUnderlyingMaturityDate;
    }


    private int underlyingMaturityDateOffset;

    private int underlyingMaturityDateLength;

    public int underlyingMaturityDateLength()
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        return underlyingMaturityDateLength;
    }

    public String underlyingMaturityDateAsString()
    {
        return hasUnderlyingMaturityDate ? new String(underlyingMaturityDate, 0, underlyingMaturityDateLength) : null;
    }

    public void underlyingMaturityDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityDate");
        }

        view.wrap(buffer, underlyingMaturityDateOffset, underlyingMaturityDateLength);
    }


    private byte[] underlyingMaturityTime = new byte[19];

    private boolean hasUnderlyingMaturityTime;

    public byte[] underlyingMaturityTime()
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        return underlyingMaturityTime;
    }

    public boolean hasUnderlyingMaturityTime()
    {
        return hasUnderlyingMaturityTime;
    }


    private int underlyingMaturityTimeOffset;

    private int underlyingMaturityTimeLength;

    public int underlyingMaturityTimeLength()
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        return underlyingMaturityTimeLength;
    }

    public String underlyingMaturityTimeAsString()
    {
        return hasUnderlyingMaturityTime ? new String(underlyingMaturityTime, 0, underlyingMaturityTimeLength) : null;
    }

    public void underlyingMaturityTime(final AsciiSequenceView view)
    {
        if (!hasUnderlyingMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingMaturityTime");
        }

        view.wrap(buffer, underlyingMaturityTimeOffset, underlyingMaturityTimeLength);
    }


    private byte[] underlyingCouponPaymentDate = new byte[8];

    private boolean hasUnderlyingCouponPaymentDate;

    public byte[] underlyingCouponPaymentDate()
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        return underlyingCouponPaymentDate;
    }

    public boolean hasUnderlyingCouponPaymentDate()
    {
        return hasUnderlyingCouponPaymentDate;
    }


    private int underlyingCouponPaymentDateOffset;

    private int underlyingCouponPaymentDateLength;

    public int underlyingCouponPaymentDateLength()
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        return underlyingCouponPaymentDateLength;
    }

    public String underlyingCouponPaymentDateAsString()
    {
        return hasUnderlyingCouponPaymentDate ? new String(underlyingCouponPaymentDate, 0, underlyingCouponPaymentDateLength) : null;
    }

    public void underlyingCouponPaymentDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCouponPaymentDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponPaymentDate");
        }

        view.wrap(buffer, underlyingCouponPaymentDateOffset, underlyingCouponPaymentDateLength);
    }


    private char[] underlyingRestructuringType = new char[1];

    private boolean hasUnderlyingRestructuringType;

    public char[] underlyingRestructuringType()
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        return underlyingRestructuringType;
    }

    public boolean hasUnderlyingRestructuringType()
    {
        return hasUnderlyingRestructuringType;
    }


    private int underlyingRestructuringTypeOffset;

    private int underlyingRestructuringTypeLength;

    public int underlyingRestructuringTypeLength()
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        return underlyingRestructuringTypeLength;
    }

    public String underlyingRestructuringTypeAsString()
    {
        return hasUnderlyingRestructuringType ? new String(underlyingRestructuringType, 0, underlyingRestructuringTypeLength) : null;
    }

    public void underlyingRestructuringType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRestructuringType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRestructuringType");
        }

        view.wrap(buffer, underlyingRestructuringTypeOffset, underlyingRestructuringTypeLength);
    }


    private char[] underlyingSeniority = new char[1];

    private boolean hasUnderlyingSeniority;

    public char[] underlyingSeniority()
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        return underlyingSeniority;
    }

    public boolean hasUnderlyingSeniority()
    {
        return hasUnderlyingSeniority;
    }


    private int underlyingSeniorityOffset;

    private int underlyingSeniorityLength;

    public int underlyingSeniorityLength()
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        return underlyingSeniorityLength;
    }

    public String underlyingSeniorityAsString()
    {
        return hasUnderlyingSeniority ? new String(underlyingSeniority, 0, underlyingSeniorityLength) : null;
    }

    public void underlyingSeniority(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSeniority)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSeniority");
        }

        view.wrap(buffer, underlyingSeniorityOffset, underlyingSeniorityLength);
    }


    private DecimalFloat underlyingNotionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingNotionalPercentageOutstanding;

    public DecimalFloat underlyingNotionalPercentageOutstanding()
    {
        if (!hasUnderlyingNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingNotionalPercentageOutstanding");
        }

        return underlyingNotionalPercentageOutstanding;
    }

    public boolean hasUnderlyingNotionalPercentageOutstanding()
    {
        return hasUnderlyingNotionalPercentageOutstanding;
    }



    private DecimalFloat underlyingOriginalNotionalPercentageOutstanding = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingOriginalNotionalPercentageOutstanding;

    public DecimalFloat underlyingOriginalNotionalPercentageOutstanding()
    {
        if (!hasUnderlyingOriginalNotionalPercentageOutstanding)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingOriginalNotionalPercentageOutstanding");
        }

        return underlyingOriginalNotionalPercentageOutstanding;
    }

    public boolean hasUnderlyingOriginalNotionalPercentageOutstanding()
    {
        return hasUnderlyingOriginalNotionalPercentageOutstanding;
    }



    private DecimalFloat underlyingAttachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAttachmentPoint;

    public DecimalFloat underlyingAttachmentPoint()
    {
        if (!hasUnderlyingAttachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAttachmentPoint");
        }

        return underlyingAttachmentPoint;
    }

    public boolean hasUnderlyingAttachmentPoint()
    {
        return hasUnderlyingAttachmentPoint;
    }



    private DecimalFloat underlyingDetachmentPoint = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingDetachmentPoint;

    public DecimalFloat underlyingDetachmentPoint()
    {
        if (!hasUnderlyingDetachmentPoint)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingDetachmentPoint");
        }

        return underlyingDetachmentPoint;
    }

    public boolean hasUnderlyingDetachmentPoint()
    {
        return hasUnderlyingDetachmentPoint;
    }



    private byte[] underlyingIssueDate = new byte[8];

    private boolean hasUnderlyingIssueDate;

    public byte[] underlyingIssueDate()
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        return underlyingIssueDate;
    }

    public boolean hasUnderlyingIssueDate()
    {
        return hasUnderlyingIssueDate;
    }


    private int underlyingIssueDateOffset;

    private int underlyingIssueDateLength;

    public int underlyingIssueDateLength()
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        return underlyingIssueDateLength;
    }

    public String underlyingIssueDateAsString()
    {
        return hasUnderlyingIssueDate ? new String(underlyingIssueDate, 0, underlyingIssueDateLength) : null;
    }

    public void underlyingIssueDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingIssueDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssueDate");
        }

        view.wrap(buffer, underlyingIssueDateOffset, underlyingIssueDateLength);
    }


    private char[] underlyingRepoCollateralSecurityType = new char[1];

    private boolean hasUnderlyingRepoCollateralSecurityType;

    public char[] underlyingRepoCollateralSecurityType()
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        return underlyingRepoCollateralSecurityType;
    }

    public boolean hasUnderlyingRepoCollateralSecurityType()
    {
        return hasUnderlyingRepoCollateralSecurityType;
    }


    private int underlyingRepoCollateralSecurityTypeOffset;

    private int underlyingRepoCollateralSecurityTypeLength;

    public int underlyingRepoCollateralSecurityTypeLength()
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        return underlyingRepoCollateralSecurityTypeLength;
    }

    public String underlyingRepoCollateralSecurityTypeAsString()
    {
        return hasUnderlyingRepoCollateralSecurityType ? new String(underlyingRepoCollateralSecurityType, 0, underlyingRepoCollateralSecurityTypeLength) : null;
    }

    public void underlyingRepoCollateralSecurityType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRepoCollateralSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepoCollateralSecurityType");
        }

        view.wrap(buffer, underlyingRepoCollateralSecurityTypeOffset, underlyingRepoCollateralSecurityTypeLength);
    }


    private int underlyingRepurchaseTerm = MISSING_INT;

    private boolean hasUnderlyingRepurchaseTerm;

    public int underlyingRepurchaseTerm()
    {
        if (!hasUnderlyingRepurchaseTerm)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepurchaseTerm");
        }

        return underlyingRepurchaseTerm;
    }

    public boolean hasUnderlyingRepurchaseTerm()
    {
        return hasUnderlyingRepurchaseTerm;
    }



    private DecimalFloat underlyingRepurchaseRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingRepurchaseRate;

    public DecimalFloat underlyingRepurchaseRate()
    {
        if (!hasUnderlyingRepurchaseRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRepurchaseRate");
        }

        return underlyingRepurchaseRate;
    }

    public boolean hasUnderlyingRepurchaseRate()
    {
        return hasUnderlyingRepurchaseRate;
    }



    private DecimalFloat underlyingFactor = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingFactor;

    public DecimalFloat underlyingFactor()
    {
        if (!hasUnderlyingFactor)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFactor");
        }

        return underlyingFactor;
    }

    public boolean hasUnderlyingFactor()
    {
        return hasUnderlyingFactor;
    }



    private char[] underlyingCreditRating = new char[1];

    private boolean hasUnderlyingCreditRating;

    public char[] underlyingCreditRating()
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        return underlyingCreditRating;
    }

    public boolean hasUnderlyingCreditRating()
    {
        return hasUnderlyingCreditRating;
    }


    private int underlyingCreditRatingOffset;

    private int underlyingCreditRatingLength;

    public int underlyingCreditRatingLength()
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        return underlyingCreditRatingLength;
    }

    public String underlyingCreditRatingAsString()
    {
        return hasUnderlyingCreditRating ? new String(underlyingCreditRating, 0, underlyingCreditRatingLength) : null;
    }

    public void underlyingCreditRating(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCreditRating)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCreditRating");
        }

        view.wrap(buffer, underlyingCreditRatingOffset, underlyingCreditRatingLength);
    }


    private char[] underlyingInstrRegistry = new char[1];

    private boolean hasUnderlyingInstrRegistry;

    public char[] underlyingInstrRegistry()
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        return underlyingInstrRegistry;
    }

    public boolean hasUnderlyingInstrRegistry()
    {
        return hasUnderlyingInstrRegistry;
    }


    private int underlyingInstrRegistryOffset;

    private int underlyingInstrRegistryLength;

    public int underlyingInstrRegistryLength()
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        return underlyingInstrRegistryLength;
    }

    public String underlyingInstrRegistryAsString()
    {
        return hasUnderlyingInstrRegistry ? new String(underlyingInstrRegistry, 0, underlyingInstrRegistryLength) : null;
    }

    public void underlyingInstrRegistry(final AsciiSequenceView view)
    {
        if (!hasUnderlyingInstrRegistry)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingInstrRegistry");
        }

        view.wrap(buffer, underlyingInstrRegistryOffset, underlyingInstrRegistryLength);
    }


    private char[] underlyingCountryOfIssue = new char[1];

    private boolean hasUnderlyingCountryOfIssue;

    public char[] underlyingCountryOfIssue()
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        return underlyingCountryOfIssue;
    }

    public boolean hasUnderlyingCountryOfIssue()
    {
        return hasUnderlyingCountryOfIssue;
    }


    private int underlyingCountryOfIssueOffset;

    private int underlyingCountryOfIssueLength;

    public int underlyingCountryOfIssueLength()
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        return underlyingCountryOfIssueLength;
    }

    public String underlyingCountryOfIssueAsString()
    {
        return hasUnderlyingCountryOfIssue ? new String(underlyingCountryOfIssue, 0, underlyingCountryOfIssueLength) : null;
    }

    public void underlyingCountryOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCountryOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCountryOfIssue");
        }

        view.wrap(buffer, underlyingCountryOfIssueOffset, underlyingCountryOfIssueLength);
    }


    private char[] underlyingStateOrProvinceOfIssue = new char[1];

    private boolean hasUnderlyingStateOrProvinceOfIssue;

    public char[] underlyingStateOrProvinceOfIssue()
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        return underlyingStateOrProvinceOfIssue;
    }

    public boolean hasUnderlyingStateOrProvinceOfIssue()
    {
        return hasUnderlyingStateOrProvinceOfIssue;
    }


    private int underlyingStateOrProvinceOfIssueOffset;

    private int underlyingStateOrProvinceOfIssueLength;

    public int underlyingStateOrProvinceOfIssueLength()
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        return underlyingStateOrProvinceOfIssueLength;
    }

    public String underlyingStateOrProvinceOfIssueAsString()
    {
        return hasUnderlyingStateOrProvinceOfIssue ? new String(underlyingStateOrProvinceOfIssue, 0, underlyingStateOrProvinceOfIssueLength) : null;
    }

    public void underlyingStateOrProvinceOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStateOrProvinceOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStateOrProvinceOfIssue");
        }

        view.wrap(buffer, underlyingStateOrProvinceOfIssueOffset, underlyingStateOrProvinceOfIssueLength);
    }


    private char[] underlyingLocaleOfIssue = new char[1];

    private boolean hasUnderlyingLocaleOfIssue;

    public char[] underlyingLocaleOfIssue()
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        return underlyingLocaleOfIssue;
    }

    public boolean hasUnderlyingLocaleOfIssue()
    {
        return hasUnderlyingLocaleOfIssue;
    }


    private int underlyingLocaleOfIssueOffset;

    private int underlyingLocaleOfIssueLength;

    public int underlyingLocaleOfIssueLength()
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        return underlyingLocaleOfIssueLength;
    }

    public String underlyingLocaleOfIssueAsString()
    {
        return hasUnderlyingLocaleOfIssue ? new String(underlyingLocaleOfIssue, 0, underlyingLocaleOfIssueLength) : null;
    }

    public void underlyingLocaleOfIssue(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLocaleOfIssue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLocaleOfIssue");
        }

        view.wrap(buffer, underlyingLocaleOfIssueOffset, underlyingLocaleOfIssueLength);
    }


    private byte[] underlyingRedemptionDate = new byte[8];

    private boolean hasUnderlyingRedemptionDate;

    public byte[] underlyingRedemptionDate()
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        return underlyingRedemptionDate;
    }

    public boolean hasUnderlyingRedemptionDate()
    {
        return hasUnderlyingRedemptionDate;
    }


    private int underlyingRedemptionDateOffset;

    private int underlyingRedemptionDateLength;

    public int underlyingRedemptionDateLength()
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        return underlyingRedemptionDateLength;
    }

    public String underlyingRedemptionDateAsString()
    {
        return hasUnderlyingRedemptionDate ? new String(underlyingRedemptionDate, 0, underlyingRedemptionDateLength) : null;
    }

    public void underlyingRedemptionDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingRedemptionDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingRedemptionDate");
        }

        view.wrap(buffer, underlyingRedemptionDateOffset, underlyingRedemptionDateLength);
    }


    private DecimalFloat underlyingStrikePrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingStrikePrice;

    public DecimalFloat underlyingStrikePrice()
    {
        if (!hasUnderlyingStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikePrice");
        }

        return underlyingStrikePrice;
    }

    public boolean hasUnderlyingStrikePrice()
    {
        return hasUnderlyingStrikePrice;
    }



    private char[] underlyingStrikeCurrency = new char[1];

    private boolean hasUnderlyingStrikeCurrency;

    public char[] underlyingStrikeCurrency()
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        return underlyingStrikeCurrency;
    }

    public boolean hasUnderlyingStrikeCurrency()
    {
        return hasUnderlyingStrikeCurrency;
    }


    private int underlyingStrikeCurrencyOffset;

    private int underlyingStrikeCurrencyLength;

    public int underlyingStrikeCurrencyLength()
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        return underlyingStrikeCurrencyLength;
    }

    public String underlyingStrikeCurrencyAsString()
    {
        return hasUnderlyingStrikeCurrency ? new String(underlyingStrikeCurrency, 0, underlyingStrikeCurrencyLength) : null;
    }

    public void underlyingStrikeCurrency(final AsciiSequenceView view)
    {
        if (!hasUnderlyingStrikeCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStrikeCurrency");
        }

        view.wrap(buffer, underlyingStrikeCurrencyOffset, underlyingStrikeCurrencyLength);
    }


    private char underlyingOptAttribute = MISSING_CHAR;

    private boolean hasUnderlyingOptAttribute;

    public char underlyingOptAttribute()
    {
        if (!hasUnderlyingOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingOptAttribute");
        }

        return underlyingOptAttribute;
    }

    public boolean hasUnderlyingOptAttribute()
    {
        return hasUnderlyingOptAttribute;
    }



    private DecimalFloat underlyingContractMultiplier = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingContractMultiplier;

    public DecimalFloat underlyingContractMultiplier()
    {
        if (!hasUnderlyingContractMultiplier)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingContractMultiplier");
        }

        return underlyingContractMultiplier;
    }

    public boolean hasUnderlyingContractMultiplier()
    {
        return hasUnderlyingContractMultiplier;
    }



    private int underlyingContractMultiplierUnit = MISSING_INT;

    private boolean hasUnderlyingContractMultiplierUnit;

    public int underlyingContractMultiplierUnit()
    {
        if (!hasUnderlyingContractMultiplierUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingContractMultiplierUnit");
        }

        return underlyingContractMultiplierUnit;
    }

    public boolean hasUnderlyingContractMultiplierUnit()
    {
        return hasUnderlyingContractMultiplierUnit;
    }



    private int underlyingFlowScheduleType = MISSING_INT;

    private boolean hasUnderlyingFlowScheduleType;

    public int underlyingFlowScheduleType()
    {
        if (!hasUnderlyingFlowScheduleType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFlowScheduleType");
        }

        return underlyingFlowScheduleType;
    }

    public boolean hasUnderlyingFlowScheduleType()
    {
        return hasUnderlyingFlowScheduleType;
    }



    private char[] underlyingUnitOfMeasure = new char[1];

    private boolean hasUnderlyingUnitOfMeasure;

    public char[] underlyingUnitOfMeasure()
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        return underlyingUnitOfMeasure;
    }

    public boolean hasUnderlyingUnitOfMeasure()
    {
        return hasUnderlyingUnitOfMeasure;
    }


    private int underlyingUnitOfMeasureOffset;

    private int underlyingUnitOfMeasureLength;

    public int underlyingUnitOfMeasureLength()
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        return underlyingUnitOfMeasureLength;
    }

    public String underlyingUnitOfMeasureAsString()
    {
        return hasUnderlyingUnitOfMeasure ? new String(underlyingUnitOfMeasure, 0, underlyingUnitOfMeasureLength) : null;
    }

    public void underlyingUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasUnderlyingUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasure");
        }

        view.wrap(buffer, underlyingUnitOfMeasureOffset, underlyingUnitOfMeasureLength);
    }


    private DecimalFloat underlyingUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingUnitOfMeasureQty;

    public DecimalFloat underlyingUnitOfMeasureQty()
    {
        if (!hasUnderlyingUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingUnitOfMeasureQty");
        }

        return underlyingUnitOfMeasureQty;
    }

    public boolean hasUnderlyingUnitOfMeasureQty()
    {
        return hasUnderlyingUnitOfMeasureQty;
    }



    private char[] underlyingPriceUnitOfMeasure = new char[1];

    private boolean hasUnderlyingPriceUnitOfMeasure;

    public char[] underlyingPriceUnitOfMeasure()
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        return underlyingPriceUnitOfMeasure;
    }

    public boolean hasUnderlyingPriceUnitOfMeasure()
    {
        return hasUnderlyingPriceUnitOfMeasure;
    }


    private int underlyingPriceUnitOfMeasureOffset;

    private int underlyingPriceUnitOfMeasureLength;

    public int underlyingPriceUnitOfMeasureLength()
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        return underlyingPriceUnitOfMeasureLength;
    }

    public String underlyingPriceUnitOfMeasureAsString()
    {
        return hasUnderlyingPriceUnitOfMeasure ? new String(underlyingPriceUnitOfMeasure, 0, underlyingPriceUnitOfMeasureLength) : null;
    }

    public void underlyingPriceUnitOfMeasure(final AsciiSequenceView view)
    {
        if (!hasUnderlyingPriceUnitOfMeasure)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasure");
        }

        view.wrap(buffer, underlyingPriceUnitOfMeasureOffset, underlyingPriceUnitOfMeasureLength);
    }


    private DecimalFloat underlyingPriceUnitOfMeasureQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingPriceUnitOfMeasureQty;

    public DecimalFloat underlyingPriceUnitOfMeasureQty()
    {
        if (!hasUnderlyingPriceUnitOfMeasureQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPriceUnitOfMeasureQty");
        }

        return underlyingPriceUnitOfMeasureQty;
    }

    public boolean hasUnderlyingPriceUnitOfMeasureQty()
    {
        return hasUnderlyingPriceUnitOfMeasureQty;
    }



    private char[] underlyingTimeUnit = new char[1];

    private boolean hasUnderlyingTimeUnit;

    public char[] underlyingTimeUnit()
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        return underlyingTimeUnit;
    }

    public boolean hasUnderlyingTimeUnit()
    {
        return hasUnderlyingTimeUnit;
    }


    private int underlyingTimeUnitOffset;

    private int underlyingTimeUnitLength;

    public int underlyingTimeUnitLength()
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        return underlyingTimeUnitLength;
    }

    public String underlyingTimeUnitAsString()
    {
        return hasUnderlyingTimeUnit ? new String(underlyingTimeUnit, 0, underlyingTimeUnitLength) : null;
    }

    public void underlyingTimeUnit(final AsciiSequenceView view)
    {
        if (!hasUnderlyingTimeUnit)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingTimeUnit");
        }

        view.wrap(buffer, underlyingTimeUnitOffset, underlyingTimeUnitLength);
    }


    private int underlyingExerciseStyle = MISSING_INT;

    private boolean hasUnderlyingExerciseStyle;

    public int underlyingExerciseStyle()
    {
        if (!hasUnderlyingExerciseStyle)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingExerciseStyle");
        }

        return underlyingExerciseStyle;
    }

    public boolean hasUnderlyingExerciseStyle()
    {
        return hasUnderlyingExerciseStyle;
    }



    private DecimalFloat underlyingCouponRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCouponRate;

    public DecimalFloat underlyingCouponRate()
    {
        if (!hasUnderlyingCouponRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCouponRate");
        }

        return underlyingCouponRate;
    }

    public boolean hasUnderlyingCouponRate()
    {
        return hasUnderlyingCouponRate;
    }



    private char[] underlyingSecurityExchange = new char[1];

    private boolean hasUnderlyingSecurityExchange;

    public char[] underlyingSecurityExchange()
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        return underlyingSecurityExchange;
    }

    public boolean hasUnderlyingSecurityExchange()
    {
        return hasUnderlyingSecurityExchange;
    }


    private int underlyingSecurityExchangeOffset;

    private int underlyingSecurityExchangeLength;

    public int underlyingSecurityExchangeLength()
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        return underlyingSecurityExchangeLength;
    }

    public String underlyingSecurityExchangeAsString()
    {
        return hasUnderlyingSecurityExchange ? new String(underlyingSecurityExchange, 0, underlyingSecurityExchangeLength) : null;
    }

    public void underlyingSecurityExchange(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityExchange");
        }

        view.wrap(buffer, underlyingSecurityExchangeOffset, underlyingSecurityExchangeLength);
    }


    private char[] underlyingIssuer = new char[1];

    private boolean hasUnderlyingIssuer;

    public char[] underlyingIssuer()
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        return underlyingIssuer;
    }

    public boolean hasUnderlyingIssuer()
    {
        return hasUnderlyingIssuer;
    }


    private int underlyingIssuerOffset;

    private int underlyingIssuerLength;

    public int underlyingIssuerLength()
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        return underlyingIssuerLength;
    }

    public String underlyingIssuerAsString()
    {
        return hasUnderlyingIssuer ? new String(underlyingIssuer, 0, underlyingIssuerLength) : null;
    }

    public void underlyingIssuer(final AsciiSequenceView view)
    {
        if (!hasUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingIssuer");
        }

        view.wrap(buffer, underlyingIssuerOffset, underlyingIssuerLength);
    }


    private int encodedUnderlyingIssuerLen = MISSING_INT;

    private boolean hasEncodedUnderlyingIssuerLen;

    public int encodedUnderlyingIssuerLen()
    {
        if (!hasEncodedUnderlyingIssuerLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingIssuerLen");
        }

        return encodedUnderlyingIssuerLen;
    }

    public boolean hasEncodedUnderlyingIssuerLen()
    {
        return hasEncodedUnderlyingIssuerLen;
    }



    private byte[] encodedUnderlyingIssuer = new byte[1];

    private boolean hasEncodedUnderlyingIssuer;

    public byte[] encodedUnderlyingIssuer()
    {
        if (!hasEncodedUnderlyingIssuer)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingIssuer");
        }

        return encodedUnderlyingIssuer;
    }

    public boolean hasEncodedUnderlyingIssuer()
    {
        return hasEncodedUnderlyingIssuer;
    }



    private char[] underlyingSecurityDesc = new char[1];

    private boolean hasUnderlyingSecurityDesc;

    public char[] underlyingSecurityDesc()
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        return underlyingSecurityDesc;
    }

    public boolean hasUnderlyingSecurityDesc()
    {
        return hasUnderlyingSecurityDesc;
    }


    private int underlyingSecurityDescOffset;

    private int underlyingSecurityDescLength;

    public int underlyingSecurityDescLength()
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        return underlyingSecurityDescLength;
    }

    public String underlyingSecurityDescAsString()
    {
        return hasUnderlyingSecurityDesc ? new String(underlyingSecurityDesc, 0, underlyingSecurityDescLength) : null;
    }

    public void underlyingSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSecurityDesc");
        }

        view.wrap(buffer, underlyingSecurityDescOffset, underlyingSecurityDescLength);
    }


    private int encodedUnderlyingSecurityDescLen = MISSING_INT;

    private boolean hasEncodedUnderlyingSecurityDescLen;

    public int encodedUnderlyingSecurityDescLen()
    {
        if (!hasEncodedUnderlyingSecurityDescLen)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingSecurityDescLen");
        }

        return encodedUnderlyingSecurityDescLen;
    }

    public boolean hasEncodedUnderlyingSecurityDescLen()
    {
        return hasEncodedUnderlyingSecurityDescLen;
    }



    private byte[] encodedUnderlyingSecurityDesc = new byte[1];

    private boolean hasEncodedUnderlyingSecurityDesc;

    public byte[] encodedUnderlyingSecurityDesc()
    {
        if (!hasEncodedUnderlyingSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: EncodedUnderlyingSecurityDesc");
        }

        return encodedUnderlyingSecurityDesc;
    }

    public boolean hasEncodedUnderlyingSecurityDesc()
    {
        return hasEncodedUnderlyingSecurityDesc;
    }



    private char[] underlyingCPProgram = new char[1];

    private boolean hasUnderlyingCPProgram;

    public char[] underlyingCPProgram()
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        return underlyingCPProgram;
    }

    public boolean hasUnderlyingCPProgram()
    {
        return hasUnderlyingCPProgram;
    }


    private int underlyingCPProgramOffset;

    private int underlyingCPProgramLength;

    public int underlyingCPProgramLength()
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        return underlyingCPProgramLength;
    }

    public String underlyingCPProgramAsString()
    {
        return hasUnderlyingCPProgram ? new String(underlyingCPProgram, 0, underlyingCPProgramLength) : null;
    }

    public void underlyingCPProgram(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCPProgram)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPProgram");
        }

        view.wrap(buffer, underlyingCPProgramOffset, underlyingCPProgramLength);
    }


    private char[] underlyingCPRegType = new char[1];

    private boolean hasUnderlyingCPRegType;

    public char[] underlyingCPRegType()
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        return underlyingCPRegType;
    }

    public boolean hasUnderlyingCPRegType()
    {
        return hasUnderlyingCPRegType;
    }


    private int underlyingCPRegTypeOffset;

    private int underlyingCPRegTypeLength;

    public int underlyingCPRegTypeLength()
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        return underlyingCPRegTypeLength;
    }

    public String underlyingCPRegTypeAsString()
    {
        return hasUnderlyingCPRegType ? new String(underlyingCPRegType, 0, underlyingCPRegTypeLength) : null;
    }

    public void underlyingCPRegType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCPRegType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCPRegType");
        }

        view.wrap(buffer, underlyingCPRegTypeOffset, underlyingCPRegTypeLength);
    }


    private DecimalFloat underlyingAllocationPercent = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAllocationPercent;

    public DecimalFloat underlyingAllocationPercent()
    {
        if (!hasUnderlyingAllocationPercent)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAllocationPercent");
        }

        return underlyingAllocationPercent;
    }

    public boolean hasUnderlyingAllocationPercent()
    {
        return hasUnderlyingAllocationPercent;
    }



    private char[] underlyingCurrency = new char[1];

    private boolean hasUnderlyingCurrency;

    public char[] underlyingCurrency()
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        return underlyingCurrency;
    }

    public boolean hasUnderlyingCurrency()
    {
        return hasUnderlyingCurrency;
    }


    private int underlyingCurrencyOffset;

    private int underlyingCurrencyLength;

    public int underlyingCurrencyLength()
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        return underlyingCurrencyLength;
    }

    public String underlyingCurrencyAsString()
    {
        return hasUnderlyingCurrency ? new String(underlyingCurrency, 0, underlyingCurrencyLength) : null;
    }

    public void underlyingCurrency(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCurrency)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrency");
        }

        view.wrap(buffer, underlyingCurrencyOffset, underlyingCurrencyLength);
    }


    private DecimalFloat underlyingQty = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingQty;

    public DecimalFloat underlyingQty()
    {
        if (!hasUnderlyingQty)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingQty");
        }

        return underlyingQty;
    }

    public boolean hasUnderlyingQty()
    {
        return hasUnderlyingQty;
    }



    private int underlyingSettlementType = MISSING_INT;

    private boolean hasUnderlyingSettlementType;

    public int underlyingSettlementType()
    {
        if (!hasUnderlyingSettlementType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlementType");
        }

        return underlyingSettlementType;
    }

    public boolean hasUnderlyingSettlementType()
    {
        return hasUnderlyingSettlementType;
    }



    private final CharArrayWrapper underlyingSettlementTypeWrapper = new CharArrayWrapper();
    public UnderlyingSettlementType underlyingSettlementTypeAsEnum()
    {
        if (!hasUnderlyingSettlementType)
 return UnderlyingSettlementType.NULL_VAL;
        return UnderlyingSettlementType.decode(underlyingSettlementType);
    }

    private DecimalFloat underlyingCashAmount = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCashAmount;

    public DecimalFloat underlyingCashAmount()
    {
        if (!hasUnderlyingCashAmount)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashAmount");
        }

        return underlyingCashAmount;
    }

    public boolean hasUnderlyingCashAmount()
    {
        return hasUnderlyingCashAmount;
    }



    private char[] underlyingCashType = new char[1];

    private boolean hasUnderlyingCashType;

    public char[] underlyingCashType()
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        return underlyingCashType;
    }

    public boolean hasUnderlyingCashType()
    {
        return hasUnderlyingCashType;
    }


    private int underlyingCashTypeOffset;

    private int underlyingCashTypeLength;

    public int underlyingCashTypeLength()
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        return underlyingCashTypeLength;
    }

    public String underlyingCashTypeAsString()
    {
        return hasUnderlyingCashType ? new String(underlyingCashType, 0, underlyingCashTypeLength) : null;
    }

    public void underlyingCashType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingCashType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCashType");
        }

        view.wrap(buffer, underlyingCashTypeOffset, underlyingCashTypeLength);
    }


    private final CharArrayWrapper underlyingCashTypeWrapper = new CharArrayWrapper();
    public UnderlyingCashType underlyingCashTypeAsEnum()
    {
        if (!hasUnderlyingCashType)
 return UnderlyingCashType.NULL_VAL;
        underlyingCashTypeWrapper.wrap(this.underlyingCashType(), underlyingCashTypeLength);
        return UnderlyingCashType.decode(underlyingCashTypeWrapper);
    }

    private DecimalFloat underlyingPx = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingPx;

    public DecimalFloat underlyingPx()
    {
        if (!hasUnderlyingPx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPx");
        }

        return underlyingPx;
    }

    public boolean hasUnderlyingPx()
    {
        return hasUnderlyingPx;
    }



    private DecimalFloat underlyingDirtyPrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingDirtyPrice;

    public DecimalFloat underlyingDirtyPrice()
    {
        if (!hasUnderlyingDirtyPrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingDirtyPrice");
        }

        return underlyingDirtyPrice;
    }

    public boolean hasUnderlyingDirtyPrice()
    {
        return hasUnderlyingDirtyPrice;
    }



    private DecimalFloat underlyingEndPrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingEndPrice;

    public DecimalFloat underlyingEndPrice()
    {
        if (!hasUnderlyingEndPrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingEndPrice");
        }

        return underlyingEndPrice;
    }

    public boolean hasUnderlyingEndPrice()
    {
        return hasUnderlyingEndPrice;
    }



    private DecimalFloat underlyingStartValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingStartValue;

    public DecimalFloat underlyingStartValue()
    {
        if (!hasUnderlyingStartValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingStartValue");
        }

        return underlyingStartValue;
    }

    public boolean hasUnderlyingStartValue()
    {
        return hasUnderlyingStartValue;
    }



    private DecimalFloat underlyingCurrentValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCurrentValue;

    public DecimalFloat underlyingCurrentValue()
    {
        if (!hasUnderlyingCurrentValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCurrentValue");
        }

        return underlyingCurrentValue;
    }

    public boolean hasUnderlyingCurrentValue()
    {
        return hasUnderlyingCurrentValue;
    }



    private DecimalFloat underlyingEndValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingEndValue;

    public DecimalFloat underlyingEndValue()
    {
        if (!hasUnderlyingEndValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingEndValue");
        }

        return underlyingEndValue;
    }

    public boolean hasUnderlyingEndValue()
    {
        return hasUnderlyingEndValue;
    }





    private UnderlyingStipsGroupDecoder underlyingStipsGroup = null;
    public UnderlyingStipsGroupDecoder underlyingStipsGroup()
    {
        return underlyingStipsGroup;
    }

    private int noUnderlyingStipsGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingStipsGroupCounter;

    public int noUnderlyingStipsGroupCounter()
    {
        if (!hasNoUnderlyingStipsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingStipsGroupCounter");
        }

        return noUnderlyingStipsGroupCounter;
    }

    public boolean hasNoUnderlyingStipsGroupCounter()
    {
        return hasNoUnderlyingStipsGroupCounter;
    }




    private UnderlyingStipsGroupIterator underlyingStipsGroupIterator = new UnderlyingStipsGroupIterator(this);
    public UnderlyingStipsGroupIterator underlyingStipsGroupIterator()
    {
        return underlyingStipsGroupIterator.iterator();
    }


    private DecimalFloat underlyingAdjustedQuantity = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingAdjustedQuantity;

    public DecimalFloat underlyingAdjustedQuantity()
    {
        if (!hasUnderlyingAdjustedQuantity)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingAdjustedQuantity");
        }

        return underlyingAdjustedQuantity;
    }

    public boolean hasUnderlyingAdjustedQuantity()
    {
        return hasUnderlyingAdjustedQuantity;
    }



    private DecimalFloat underlyingFXRate = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingFXRate;

    public DecimalFloat underlyingFXRate()
    {
        if (!hasUnderlyingFXRate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFXRate");
        }

        return underlyingFXRate;
    }

    public boolean hasUnderlyingFXRate()
    {
        return hasUnderlyingFXRate;
    }



    private char underlyingFXRateCalc = MISSING_CHAR;

    private boolean hasUnderlyingFXRateCalc;

    public char underlyingFXRateCalc()
    {
        if (!hasUnderlyingFXRateCalc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingFXRateCalc");
        }

        return underlyingFXRateCalc;
    }

    public boolean hasUnderlyingFXRateCalc()
    {
        return hasUnderlyingFXRateCalc;
    }



    private final CharArrayWrapper underlyingFXRateCalcWrapper = new CharArrayWrapper();
    public UnderlyingFXRateCalc underlyingFXRateCalcAsEnum()
    {
        if (!hasUnderlyingFXRateCalc)
 return UnderlyingFXRateCalc.NULL_VAL;
        return UnderlyingFXRateCalc.decode(underlyingFXRateCalc);
    }

    private DecimalFloat underlyingCapValue = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingCapValue;

    public DecimalFloat underlyingCapValue()
    {
        if (!hasUnderlyingCapValue)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingCapValue");
        }

        return underlyingCapValue;
    }

    public boolean hasUnderlyingCapValue()
    {
        return hasUnderlyingCapValue;
    }





    private UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = null;
    public UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup()
    {
        return undlyInstrumentPartiesGroup;
    }

    private int noUndlyInstrumentPartiesGroupCounter = MISSING_INT;

    private boolean hasNoUndlyInstrumentPartiesGroupCounter;

    public int noUndlyInstrumentPartiesGroupCounter()
    {
        if (!hasNoUndlyInstrumentPartiesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUndlyInstrumentPartiesGroupCounter");
        }

        return noUndlyInstrumentPartiesGroupCounter;
    }

    public boolean hasNoUndlyInstrumentPartiesGroupCounter()
    {
        return hasNoUndlyInstrumentPartiesGroupCounter;
    }




    private UndlyInstrumentPartiesGroupIterator undlyInstrumentPartiesGroupIterator = new UndlyInstrumentPartiesGroupIterator(this);
    public UndlyInstrumentPartiesGroupIterator undlyInstrumentPartiesGroupIterator()
    {
        return undlyInstrumentPartiesGroupIterator.iterator();
    }


    private char[] underlyingSettlMethod = new char[1];

    private boolean hasUnderlyingSettlMethod;

    public char[] underlyingSettlMethod()
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        return underlyingSettlMethod;
    }

    public boolean hasUnderlyingSettlMethod()
    {
        return hasUnderlyingSettlMethod;
    }


    private int underlyingSettlMethodOffset;

    private int underlyingSettlMethodLength;

    public int underlyingSettlMethodLength()
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        return underlyingSettlMethodLength;
    }

    public String underlyingSettlMethodAsString()
    {
        return hasUnderlyingSettlMethod ? new String(underlyingSettlMethod, 0, underlyingSettlMethodLength) : null;
    }

    public void underlyingSettlMethod(final AsciiSequenceView view)
    {
        if (!hasUnderlyingSettlMethod)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlMethod");
        }

        view.wrap(buffer, underlyingSettlMethodOffset, underlyingSettlMethodLength);
    }


    private int underlyingPutOrCall = MISSING_INT;

    private boolean hasUnderlyingPutOrCall;

    public int underlyingPutOrCall()
    {
        if (!hasUnderlyingPutOrCall)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingPutOrCall");
        }

        return underlyingPutOrCall;
    }

    public boolean hasUnderlyingPutOrCall()
    {
        return hasUnderlyingPutOrCall;
    }




    private DecimalFloat underlyingSettlPrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingSettlPrice;

    public DecimalFloat underlyingSettlPrice()
    {
        if (!hasUnderlyingSettlPrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlPrice");
        }

        return underlyingSettlPrice;
    }

    public boolean hasUnderlyingSettlPrice()
    {
        return hasUnderlyingSettlPrice;
    }



    private int underlyingSettlPriceType = MISSING_INT;

    private boolean hasUnderlyingSettlPriceType;

    public int underlyingSettlPriceType()
    {
        if (!hasUnderlyingSettlPriceType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingSettlPriceType");
        }

        return underlyingSettlPriceType;
    }

    public boolean hasUnderlyingSettlPriceType()
    {
        return hasUnderlyingSettlPriceType;
    }



    private DecimalFloat underlyingDeliveryAmount = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingDeliveryAmount;

    public DecimalFloat underlyingDeliveryAmount()
    {
        if (!hasUnderlyingDeliveryAmount)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingDeliveryAmount");
        }

        return underlyingDeliveryAmount;
    }

    public boolean hasUnderlyingDeliveryAmount()
    {
        return hasUnderlyingDeliveryAmount;
    }





    private UnderlyingAmountsGroupDecoder underlyingAmountsGroup = null;
    public UnderlyingAmountsGroupDecoder underlyingAmountsGroup()
    {
        return underlyingAmountsGroup;
    }

    private int noUnderlyingAmountsGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingAmountsGroupCounter;

    public int noUnderlyingAmountsGroupCounter()
    {
        if (!hasNoUnderlyingAmountsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingAmountsGroupCounter");
        }

        return noUnderlyingAmountsGroupCounter;
    }

    public boolean hasNoUnderlyingAmountsGroupCounter()
    {
        return hasNoUnderlyingAmountsGroupCounter;
    }




    private UnderlyingAmountsGroupIterator underlyingAmountsGroupIterator = new UnderlyingAmountsGroupIterator(this);
    public UnderlyingAmountsGroupIterator underlyingAmountsGroupIterator()
    {
        return underlyingAmountsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode UnderlyingsGroup
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
                    next = new UnderlyingsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_SYMBOL:
                hasUnderlyingSymbol = true;
                underlyingSymbol = buffer.getChars(underlyingSymbol, valueOffset, valueLength);
                underlyingSymbolOffset = valueOffset;
                underlyingSymbolLength = valueLength;
                break;

            case Constants.UNDERLYING_SYMBOL_SFX:
                hasUnderlyingSymbolSfx = true;
                underlyingSymbolSfx = buffer.getChars(underlyingSymbolSfx, valueOffset, valueLength);
                underlyingSymbolSfxOffset = valueOffset;
                underlyingSymbolSfxLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_ID:
                hasUnderlyingSecurityID = true;
                underlyingSecurityID = buffer.getChars(underlyingSecurityID, valueOffset, valueLength);
                underlyingSecurityIDOffset = valueOffset;
                underlyingSecurityIDLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_ID_SOURCE:
                hasUnderlyingSecurityIDSource = true;
                underlyingSecurityIDSource = buffer.getChars(underlyingSecurityIDSource, valueOffset, valueLength);
                underlyingSecurityIDSourceOffset = valueOffset;
                underlyingSecurityIDSourceLength = valueLength;
                break;

            case Constants.NO_UNDERLYING_SECURITY_ALT_ID:
                hasNoUnderlyingSecurityAltIDGroupCounter = true;
                noUnderlyingSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 457, CODEC_VALIDATION_ENABLED);
                if (underlyingSecurityAltIDGroup == null)
                {
                    underlyingSecurityAltIDGroup = new UnderlyingSecurityAltIDGroupDecoder(trailer, messageFields);
                }
                UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroupCurrent = underlyingSecurityAltIDGroup;
                position = endOfField + 1;
                final int noUnderlyingSecurityAltIDGroupCounter = this.noUnderlyingSecurityAltIDGroupCounter;
                for (int i = 0; i < noUnderlyingSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (underlyingSecurityAltIDGroupCurrent != null)
                    {
                        position += underlyingSecurityAltIDGroupCurrent.decode(buffer, position, end - position);
                        underlyingSecurityAltIDGroupCurrent = underlyingSecurityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingSecurityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_PRODUCT:
                hasUnderlyingProduct = true;
                underlyingProduct = getInt(buffer, valueOffset, endOfField, 462, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_C_F_I_CODE:
                hasUnderlyingCFICode = true;
                underlyingCFICode = buffer.getChars(underlyingCFICode, valueOffset, valueLength);
                underlyingCFICodeOffset = valueOffset;
                underlyingCFICodeLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_TYPE:
                hasUnderlyingSecurityType = true;
                underlyingSecurityType = buffer.getChars(underlyingSecurityType, valueOffset, valueLength);
                underlyingSecurityTypeOffset = valueOffset;
                underlyingSecurityTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_SECURITY_SUB_TYPE:
                hasUnderlyingSecuritySubType = true;
                underlyingSecuritySubType = buffer.getChars(underlyingSecuritySubType, valueOffset, valueLength);
                underlyingSecuritySubTypeOffset = valueOffset;
                underlyingSecuritySubTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_MONTH_YEAR:
                hasUnderlyingMaturityMonthYear = true;
                underlyingMaturityMonthYear = buffer.getBytes(underlyingMaturityMonthYear, valueOffset, valueLength);
                underlyingMaturityMonthYearOffset = valueOffset;
                underlyingMaturityMonthYearLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_DATE:
                hasUnderlyingMaturityDate = true;
                underlyingMaturityDate = buffer.getBytes(underlyingMaturityDate, valueOffset, valueLength);
                underlyingMaturityDateOffset = valueOffset;
                underlyingMaturityDateLength = valueLength;
                break;

            case Constants.UNDERLYING_MATURITY_TIME:
                hasUnderlyingMaturityTime = true;
                underlyingMaturityTime = buffer.getBytes(underlyingMaturityTime, valueOffset, valueLength);
                underlyingMaturityTimeOffset = valueOffset;
                underlyingMaturityTimeLength = valueLength;
                break;

            case Constants.UNDERLYING_COUPON_PAYMENT_DATE:
                hasUnderlyingCouponPaymentDate = true;
                underlyingCouponPaymentDate = buffer.getBytes(underlyingCouponPaymentDate, valueOffset, valueLength);
                underlyingCouponPaymentDateOffset = valueOffset;
                underlyingCouponPaymentDateLength = valueLength;
                break;

            case Constants.UNDERLYING_RESTRUCTURING_TYPE:
                hasUnderlyingRestructuringType = true;
                underlyingRestructuringType = buffer.getChars(underlyingRestructuringType, valueOffset, valueLength);
                underlyingRestructuringTypeOffset = valueOffset;
                underlyingRestructuringTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_SENIORITY:
                hasUnderlyingSeniority = true;
                underlyingSeniority = buffer.getChars(underlyingSeniority, valueOffset, valueLength);
                underlyingSeniorityOffset = valueOffset;
                underlyingSeniorityLength = valueLength;
                break;

            case Constants.UNDERLYING_NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasUnderlyingNotionalPercentageOutstanding = true;
                underlyingNotionalPercentageOutstanding = getFloat(buffer, underlyingNotionalPercentageOutstanding, valueOffset, valueLength, 1455, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ORIGINAL_NOTIONAL_PERCENTAGE_OUTSTANDING:
                hasUnderlyingOriginalNotionalPercentageOutstanding = true;
                underlyingOriginalNotionalPercentageOutstanding = getFloat(buffer, underlyingOriginalNotionalPercentageOutstanding, valueOffset, valueLength, 1456, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ATTACHMENT_POINT:
                hasUnderlyingAttachmentPoint = true;
                underlyingAttachmentPoint = getFloat(buffer, underlyingAttachmentPoint, valueOffset, valueLength, 1459, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_DETACHMENT_POINT:
                hasUnderlyingDetachmentPoint = true;
                underlyingDetachmentPoint = getFloat(buffer, underlyingDetachmentPoint, valueOffset, valueLength, 1460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_ISSUE_DATE:
                hasUnderlyingIssueDate = true;
                underlyingIssueDate = buffer.getBytes(underlyingIssueDate, valueOffset, valueLength);
                underlyingIssueDateOffset = valueOffset;
                underlyingIssueDateLength = valueLength;
                break;

            case Constants.UNDERLYING_REPO_COLLATERAL_SECURITY_TYPE:
                hasUnderlyingRepoCollateralSecurityType = true;
                underlyingRepoCollateralSecurityType = buffer.getChars(underlyingRepoCollateralSecurityType, valueOffset, valueLength);
                underlyingRepoCollateralSecurityTypeOffset = valueOffset;
                underlyingRepoCollateralSecurityTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_REPURCHASE_TERM:
                hasUnderlyingRepurchaseTerm = true;
                underlyingRepurchaseTerm = getInt(buffer, valueOffset, endOfField, 244, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_REPURCHASE_RATE:
                hasUnderlyingRepurchaseRate = true;
                underlyingRepurchaseRate = getFloat(buffer, underlyingRepurchaseRate, valueOffset, valueLength, 245, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_FACTOR:
                hasUnderlyingFactor = true;
                underlyingFactor = getFloat(buffer, underlyingFactor, valueOffset, valueLength, 246, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CREDIT_RATING:
                hasUnderlyingCreditRating = true;
                underlyingCreditRating = buffer.getChars(underlyingCreditRating, valueOffset, valueLength);
                underlyingCreditRatingOffset = valueOffset;
                underlyingCreditRatingLength = valueLength;
                break;

            case Constants.UNDERLYING_INSTR_REGISTRY:
                hasUnderlyingInstrRegistry = true;
                underlyingInstrRegistry = buffer.getChars(underlyingInstrRegistry, valueOffset, valueLength);
                underlyingInstrRegistryOffset = valueOffset;
                underlyingInstrRegistryLength = valueLength;
                break;

            case Constants.UNDERLYING_COUNTRY_OF_ISSUE:
                hasUnderlyingCountryOfIssue = true;
                underlyingCountryOfIssue = buffer.getChars(underlyingCountryOfIssue, valueOffset, valueLength);
                underlyingCountryOfIssueOffset = valueOffset;
                underlyingCountryOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_STATE_OR_PROVINCE_OF_ISSUE:
                hasUnderlyingStateOrProvinceOfIssue = true;
                underlyingStateOrProvinceOfIssue = buffer.getChars(underlyingStateOrProvinceOfIssue, valueOffset, valueLength);
                underlyingStateOrProvinceOfIssueOffset = valueOffset;
                underlyingStateOrProvinceOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_LOCALE_OF_ISSUE:
                hasUnderlyingLocaleOfIssue = true;
                underlyingLocaleOfIssue = buffer.getChars(underlyingLocaleOfIssue, valueOffset, valueLength);
                underlyingLocaleOfIssueOffset = valueOffset;
                underlyingLocaleOfIssueLength = valueLength;
                break;

            case Constants.UNDERLYING_REDEMPTION_DATE:
                hasUnderlyingRedemptionDate = true;
                underlyingRedemptionDate = buffer.getBytes(underlyingRedemptionDate, valueOffset, valueLength);
                underlyingRedemptionDateOffset = valueOffset;
                underlyingRedemptionDateLength = valueLength;
                break;

            case Constants.UNDERLYING_STRIKE_PRICE:
                hasUnderlyingStrikePrice = true;
                underlyingStrikePrice = getFloat(buffer, underlyingStrikePrice, valueOffset, valueLength, 316, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_STRIKE_CURRENCY:
                hasUnderlyingStrikeCurrency = true;
                underlyingStrikeCurrency = buffer.getChars(underlyingStrikeCurrency, valueOffset, valueLength);
                underlyingStrikeCurrencyOffset = valueOffset;
                underlyingStrikeCurrencyLength = valueLength;
                break;

            case Constants.UNDERLYING_OPT_ATTRIBUTE:
                hasUnderlyingOptAttribute = true;
                underlyingOptAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_CONTRACT_MULTIPLIER:
                hasUnderlyingContractMultiplier = true;
                underlyingContractMultiplier = getFloat(buffer, underlyingContractMultiplier, valueOffset, valueLength, 436, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CONTRACT_MULTIPLIER_UNIT:
                hasUnderlyingContractMultiplierUnit = true;
                underlyingContractMultiplierUnit = getInt(buffer, valueOffset, endOfField, 1437, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_FLOW_SCHEDULE_TYPE:
                hasUnderlyingFlowScheduleType = true;
                underlyingFlowScheduleType = getInt(buffer, valueOffset, endOfField, 1441, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_UNIT_OF_MEASURE:
                hasUnderlyingUnitOfMeasure = true;
                underlyingUnitOfMeasure = buffer.getChars(underlyingUnitOfMeasure, valueOffset, valueLength);
                underlyingUnitOfMeasureOffset = valueOffset;
                underlyingUnitOfMeasureLength = valueLength;
                break;

            case Constants.UNDERLYING_UNIT_OF_MEASURE_QTY:
                hasUnderlyingUnitOfMeasureQty = true;
                underlyingUnitOfMeasureQty = getFloat(buffer, underlyingUnitOfMeasureQty, valueOffset, valueLength, 1423, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE:
                hasUnderlyingPriceUnitOfMeasure = true;
                underlyingPriceUnitOfMeasure = buffer.getChars(underlyingPriceUnitOfMeasure, valueOffset, valueLength);
                underlyingPriceUnitOfMeasureOffset = valueOffset;
                underlyingPriceUnitOfMeasureLength = valueLength;
                break;

            case Constants.UNDERLYING_PRICE_UNIT_OF_MEASURE_QTY:
                hasUnderlyingPriceUnitOfMeasureQty = true;
                underlyingPriceUnitOfMeasureQty = getFloat(buffer, underlyingPriceUnitOfMeasureQty, valueOffset, valueLength, 1425, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_TIME_UNIT:
                hasUnderlyingTimeUnit = true;
                underlyingTimeUnit = buffer.getChars(underlyingTimeUnit, valueOffset, valueLength);
                underlyingTimeUnitOffset = valueOffset;
                underlyingTimeUnitLength = valueLength;
                break;

            case Constants.UNDERLYING_EXERCISE_STYLE:
                hasUnderlyingExerciseStyle = true;
                underlyingExerciseStyle = getInt(buffer, valueOffset, endOfField, 1419, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_COUPON_RATE:
                hasUnderlyingCouponRate = true;
                underlyingCouponRate = getFloat(buffer, underlyingCouponRate, valueOffset, valueLength, 435, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SECURITY_EXCHANGE:
                hasUnderlyingSecurityExchange = true;
                underlyingSecurityExchange = buffer.getChars(underlyingSecurityExchange, valueOffset, valueLength);
                underlyingSecurityExchangeOffset = valueOffset;
                underlyingSecurityExchangeLength = valueLength;
                break;

            case Constants.UNDERLYING_ISSUER:
                hasUnderlyingIssuer = true;
                underlyingIssuer = buffer.getChars(underlyingIssuer, valueOffset, valueLength);
                underlyingIssuerOffset = valueOffset;
                underlyingIssuerLength = valueLength;
                break;

            case Constants.ENCODED_UNDERLYING_ISSUER_LEN:
                hasEncodedUnderlyingIssuerLen = true;
                encodedUnderlyingIssuerLen = getInt(buffer, valueOffset, endOfField, 362, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_UNDERLYING_ISSUER:
                hasEncodedUnderlyingIssuer = true;
                encodedUnderlyingIssuer = buffer.getBytes(encodedUnderlyingIssuer, valueOffset, encodedUnderlyingIssuerLen);
                endOfField = valueOffset + encodedUnderlyingIssuerLen;
                break;

            case Constants.UNDERLYING_SECURITY_DESC:
                hasUnderlyingSecurityDesc = true;
                underlyingSecurityDesc = buffer.getChars(underlyingSecurityDesc, valueOffset, valueLength);
                underlyingSecurityDescOffset = valueOffset;
                underlyingSecurityDescLength = valueLength;
                break;

            case Constants.ENCODED_UNDERLYING_SECURITY_DESC_LEN:
                hasEncodedUnderlyingSecurityDescLen = true;
                encodedUnderlyingSecurityDescLen = getInt(buffer, valueOffset, endOfField, 364, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.ENCODED_UNDERLYING_SECURITY_DESC:
                hasEncodedUnderlyingSecurityDesc = true;
                encodedUnderlyingSecurityDesc = buffer.getBytes(encodedUnderlyingSecurityDesc, valueOffset, encodedUnderlyingSecurityDescLen);
                endOfField = valueOffset + encodedUnderlyingSecurityDescLen;
                break;

            case Constants.UNDERLYING_C_P_PROGRAM:
                hasUnderlyingCPProgram = true;
                underlyingCPProgram = buffer.getChars(underlyingCPProgram, valueOffset, valueLength);
                underlyingCPProgramOffset = valueOffset;
                underlyingCPProgramLength = valueLength;
                break;

            case Constants.UNDERLYING_C_P_REG_TYPE:
                hasUnderlyingCPRegType = true;
                underlyingCPRegType = buffer.getChars(underlyingCPRegType, valueOffset, valueLength);
                underlyingCPRegTypeOffset = valueOffset;
                underlyingCPRegTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_ALLOCATION_PERCENT:
                hasUnderlyingAllocationPercent = true;
                underlyingAllocationPercent = getFloat(buffer, underlyingAllocationPercent, valueOffset, valueLength, 972, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CURRENCY:
                hasUnderlyingCurrency = true;
                underlyingCurrency = buffer.getChars(underlyingCurrency, valueOffset, valueLength);
                underlyingCurrencyOffset = valueOffset;
                underlyingCurrencyLength = valueLength;
                break;

            case Constants.UNDERLYING_QTY:
                hasUnderlyingQty = true;
                underlyingQty = getFloat(buffer, underlyingQty, valueOffset, valueLength, 879, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SETTLEMENT_TYPE:
                hasUnderlyingSettlementType = true;
                underlyingSettlementType = getInt(buffer, valueOffset, endOfField, 975, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CASH_AMOUNT:
                hasUnderlyingCashAmount = true;
                underlyingCashAmount = getFloat(buffer, underlyingCashAmount, valueOffset, valueLength, 973, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CASH_TYPE:
                hasUnderlyingCashType = true;
                underlyingCashType = buffer.getChars(underlyingCashType, valueOffset, valueLength);
                underlyingCashTypeOffset = valueOffset;
                underlyingCashTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_PX:
                hasUnderlyingPx = true;
                underlyingPx = getFloat(buffer, underlyingPx, valueOffset, valueLength, 810, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_DIRTY_PRICE:
                hasUnderlyingDirtyPrice = true;
                underlyingDirtyPrice = getFloat(buffer, underlyingDirtyPrice, valueOffset, valueLength, 882, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_END_PRICE:
                hasUnderlyingEndPrice = true;
                underlyingEndPrice = getFloat(buffer, underlyingEndPrice, valueOffset, valueLength, 883, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_START_VALUE:
                hasUnderlyingStartValue = true;
                underlyingStartValue = getFloat(buffer, underlyingStartValue, valueOffset, valueLength, 884, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_CURRENT_VALUE:
                hasUnderlyingCurrentValue = true;
                underlyingCurrentValue = getFloat(buffer, underlyingCurrentValue, valueOffset, valueLength, 885, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_END_VALUE:
                hasUnderlyingEndValue = true;
                underlyingEndValue = getFloat(buffer, underlyingEndValue, valueOffset, valueLength, 886, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDERLYING_STIPS:
                hasNoUnderlyingStipsGroupCounter = true;
                noUnderlyingStipsGroupCounter = getInt(buffer, valueOffset, endOfField, 887, CODEC_VALIDATION_ENABLED);
                if (underlyingStipsGroup == null)
                {
                    underlyingStipsGroup = new UnderlyingStipsGroupDecoder(trailer, messageFields);
                }
                UnderlyingStipsGroupDecoder underlyingStipsGroupCurrent = underlyingStipsGroup;
                position = endOfField + 1;
                final int noUnderlyingStipsGroupCounter = this.noUnderlyingStipsGroupCounter;
                for (int i = 0; i < noUnderlyingStipsGroupCounter && position < end; i++)
                {
                    if (underlyingStipsGroupCurrent != null)
                    {
                        position += underlyingStipsGroupCurrent.decode(buffer, position, end - position);
                        underlyingStipsGroupCurrent = underlyingStipsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingStipsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_ADJUSTED_QUANTITY:
                hasUnderlyingAdjustedQuantity = true;
                underlyingAdjustedQuantity = getFloat(buffer, underlyingAdjustedQuantity, valueOffset, valueLength, 1044, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_F_X_RATE:
                hasUnderlyingFXRate = true;
                underlyingFXRate = getFloat(buffer, underlyingFXRate, valueOffset, valueLength, 1045, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_F_X_RATE_CALC:
                hasUnderlyingFXRateCalc = true;
                underlyingFXRateCalc = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_CAP_VALUE:
                hasUnderlyingCapValue = true;
                underlyingCapValue = getFloat(buffer, underlyingCapValue, valueOffset, valueLength, 1038, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDLY_INSTRUMENT_PARTIES:
                hasNoUndlyInstrumentPartiesGroupCounter = true;
                noUndlyInstrumentPartiesGroupCounter = getInt(buffer, valueOffset, endOfField, 1058, CODEC_VALIDATION_ENABLED);
                if (undlyInstrumentPartiesGroup == null)
                {
                    undlyInstrumentPartiesGroup = new UndlyInstrumentPartiesGroupDecoder(trailer, messageFields);
                }
                UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroupCurrent = undlyInstrumentPartiesGroup;
                position = endOfField + 1;
                final int noUndlyInstrumentPartiesGroupCounter = this.noUndlyInstrumentPartiesGroupCounter;
                for (int i = 0; i < noUndlyInstrumentPartiesGroupCounter && position < end; i++)
                {
                    if (undlyInstrumentPartiesGroupCurrent != null)
                    {
                        position += undlyInstrumentPartiesGroupCurrent.decode(buffer, position, end - position);
                        undlyInstrumentPartiesGroupCurrent = undlyInstrumentPartiesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (undlyInstrumentPartiesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_SETTL_METHOD:
                hasUnderlyingSettlMethod = true;
                underlyingSettlMethod = buffer.getChars(underlyingSettlMethod, valueOffset, valueLength);
                underlyingSettlMethodOffset = valueOffset;
                underlyingSettlMethodLength = valueLength;
                break;

            case Constants.UNDERLYING_PUT_OR_CALL:
                hasUnderlyingPutOrCall = true;
                underlyingPutOrCall = getInt(buffer, valueOffset, endOfField, 315, CODEC_VALIDATION_ENABLED);
                break;


            case Constants.UNDERLYING_SETTL_PRICE:
                hasUnderlyingSettlPrice = true;
                underlyingSettlPrice = getFloat(buffer, underlyingSettlPrice, valueOffset, valueLength, 732, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_SETTL_PRICE_TYPE:
                hasUnderlyingSettlPriceType = true;
                underlyingSettlPriceType = getInt(buffer, valueOffset, endOfField, 733, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_DELIVERY_AMOUNT:
                hasUnderlyingDeliveryAmount = true;
                underlyingDeliveryAmount = getFloat(buffer, underlyingDeliveryAmount, valueOffset, valueLength, 1037, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.NO_UNDERLYING_AMOUNTS:
                hasNoUnderlyingAmountsGroupCounter = true;
                noUnderlyingAmountsGroupCounter = getInt(buffer, valueOffset, endOfField, 984, CODEC_VALIDATION_ENABLED);
                if (underlyingAmountsGroup == null)
                {
                    underlyingAmountsGroup = new UnderlyingAmountsGroupDecoder(trailer, messageFields);
                }
                UnderlyingAmountsGroupDecoder underlyingAmountsGroupCurrent = underlyingAmountsGroup;
                position = endOfField + 1;
                final int noUnderlyingAmountsGroupCounter = this.noUnderlyingAmountsGroupCounter;
                for (int i = 0; i < noUnderlyingAmountsGroupCounter && position < end; i++)
                {
                    if (underlyingAmountsGroupCurrent != null)
                    {
                        position += underlyingAmountsGroupCurrent.decode(buffer, position, end - position);
                        underlyingAmountsGroupCurrent = underlyingAmountsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingAmountsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetUnderlyingSettlPrice();
        this.resetUnderlyingSettlPriceType();
        this.resetUnderlyingDeliveryAmount();
        this.resetUnderlyingSymbol();
        this.resetUnderlyingSymbolSfx();
        this.resetUnderlyingSecurityID();
        this.resetUnderlyingSecurityIDSource();
        this.resetUnderlyingProduct();
        this.resetUnderlyingCFICode();
        this.resetUnderlyingSecurityType();
        this.resetUnderlyingSecuritySubType();
        this.resetUnderlyingMaturityMonthYear();
        this.resetUnderlyingMaturityDate();
        this.resetUnderlyingMaturityTime();
        this.resetUnderlyingCouponPaymentDate();
        this.resetUnderlyingRestructuringType();
        this.resetUnderlyingSeniority();
        this.resetUnderlyingNotionalPercentageOutstanding();
        this.resetUnderlyingOriginalNotionalPercentageOutstanding();
        this.resetUnderlyingAttachmentPoint();
        this.resetUnderlyingDetachmentPoint();
        this.resetUnderlyingIssueDate();
        this.resetUnderlyingRepoCollateralSecurityType();
        this.resetUnderlyingRepurchaseTerm();
        this.resetUnderlyingRepurchaseRate();
        this.resetUnderlyingFactor();
        this.resetUnderlyingCreditRating();
        this.resetUnderlyingInstrRegistry();
        this.resetUnderlyingCountryOfIssue();
        this.resetUnderlyingStateOrProvinceOfIssue();
        this.resetUnderlyingLocaleOfIssue();
        this.resetUnderlyingRedemptionDate();
        this.resetUnderlyingStrikePrice();
        this.resetUnderlyingStrikeCurrency();
        this.resetUnderlyingOptAttribute();
        this.resetUnderlyingContractMultiplier();
        this.resetUnderlyingContractMultiplierUnit();
        this.resetUnderlyingFlowScheduleType();
        this.resetUnderlyingUnitOfMeasure();
        this.resetUnderlyingUnitOfMeasureQty();
        this.resetUnderlyingPriceUnitOfMeasure();
        this.resetUnderlyingPriceUnitOfMeasureQty();
        this.resetUnderlyingTimeUnit();
        this.resetUnderlyingExerciseStyle();
        this.resetUnderlyingCouponRate();
        this.resetUnderlyingSecurityExchange();
        this.resetUnderlyingIssuer();
        this.resetEncodedUnderlyingIssuerLen();
        this.resetEncodedUnderlyingIssuer();
        this.resetUnderlyingSecurityDesc();
        this.resetEncodedUnderlyingSecurityDescLen();
        this.resetEncodedUnderlyingSecurityDesc();
        this.resetUnderlyingCPProgram();
        this.resetUnderlyingCPRegType();
        this.resetUnderlyingAllocationPercent();
        this.resetUnderlyingCurrency();
        this.resetUnderlyingQty();
        this.resetUnderlyingSettlementType();
        this.resetUnderlyingCashAmount();
        this.resetUnderlyingCashType();
        this.resetUnderlyingPx();
        this.resetUnderlyingDirtyPrice();
        this.resetUnderlyingEndPrice();
        this.resetUnderlyingStartValue();
        this.resetUnderlyingCurrentValue();
        this.resetUnderlyingEndValue();
        this.resetUnderlyingAdjustedQuantity();
        this.resetUnderlyingFXRate();
        this.resetUnderlyingFXRateCalc();
        this.resetUnderlyingCapValue();
        this.resetUnderlyingSettlMethod();
        this.resetUnderlyingPutOrCall();
        this.resetUnderlyingSecurityAltIDGroup();
        this.resetUnderlyingStipsGroup();
        this.resetUndlyInstrumentPartiesGroup();
        this.resetUnderlyingAmountsGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingSettlPrice()
    {
        hasUnderlyingSettlPrice = false;
    }

    public void resetUnderlyingSettlPriceType()
    {
        hasUnderlyingSettlPriceType = false;
    }

    public void resetUnderlyingDeliveryAmount()
    {
        hasUnderlyingDeliveryAmount = false;
    }

    public void resetUnderlyingSymbol()
    {
        hasUnderlyingSymbol = false;
    }

    public void resetUnderlyingSymbolSfx()
    {
        hasUnderlyingSymbolSfx = false;
    }

    public void resetUnderlyingSecurityID()
    {
        hasUnderlyingSecurityID = false;
    }

    public void resetUnderlyingSecurityIDSource()
    {
        hasUnderlyingSecurityIDSource = false;
    }

    public void resetUnderlyingProduct()
    {
        hasUnderlyingProduct = false;
    }

    public void resetUnderlyingCFICode()
    {
        hasUnderlyingCFICode = false;
    }

    public void resetUnderlyingSecurityType()
    {
        hasUnderlyingSecurityType = false;
    }

    public void resetUnderlyingSecuritySubType()
    {
        hasUnderlyingSecuritySubType = false;
    }

    public void resetUnderlyingMaturityMonthYear()
    {
        hasUnderlyingMaturityMonthYear = false;
    }

    public void resetUnderlyingMaturityDate()
    {
        hasUnderlyingMaturityDate = false;
    }

    public void resetUnderlyingMaturityTime()
    {
        hasUnderlyingMaturityTime = false;
    }

    public void resetUnderlyingCouponPaymentDate()
    {
        hasUnderlyingCouponPaymentDate = false;
    }

    public void resetUnderlyingRestructuringType()
    {
        hasUnderlyingRestructuringType = false;
    }

    public void resetUnderlyingSeniority()
    {
        hasUnderlyingSeniority = false;
    }

    public void resetUnderlyingNotionalPercentageOutstanding()
    {
        hasUnderlyingNotionalPercentageOutstanding = false;
    }

    public void resetUnderlyingOriginalNotionalPercentageOutstanding()
    {
        hasUnderlyingOriginalNotionalPercentageOutstanding = false;
    }

    public void resetUnderlyingAttachmentPoint()
    {
        hasUnderlyingAttachmentPoint = false;
    }

    public void resetUnderlyingDetachmentPoint()
    {
        hasUnderlyingDetachmentPoint = false;
    }

    public void resetUnderlyingIssueDate()
    {
        hasUnderlyingIssueDate = false;
    }

    public void resetUnderlyingRepoCollateralSecurityType()
    {
        hasUnderlyingRepoCollateralSecurityType = false;
    }

    public void resetUnderlyingRepurchaseTerm()
    {
        hasUnderlyingRepurchaseTerm = false;
    }

    public void resetUnderlyingRepurchaseRate()
    {
        hasUnderlyingRepurchaseRate = false;
    }

    public void resetUnderlyingFactor()
    {
        hasUnderlyingFactor = false;
    }

    public void resetUnderlyingCreditRating()
    {
        hasUnderlyingCreditRating = false;
    }

    public void resetUnderlyingInstrRegistry()
    {
        hasUnderlyingInstrRegistry = false;
    }

    public void resetUnderlyingCountryOfIssue()
    {
        hasUnderlyingCountryOfIssue = false;
    }

    public void resetUnderlyingStateOrProvinceOfIssue()
    {
        hasUnderlyingStateOrProvinceOfIssue = false;
    }

    public void resetUnderlyingLocaleOfIssue()
    {
        hasUnderlyingLocaleOfIssue = false;
    }

    public void resetUnderlyingRedemptionDate()
    {
        hasUnderlyingRedemptionDate = false;
    }

    public void resetUnderlyingStrikePrice()
    {
        hasUnderlyingStrikePrice = false;
    }

    public void resetUnderlyingStrikeCurrency()
    {
        hasUnderlyingStrikeCurrency = false;
    }

    public void resetUnderlyingOptAttribute()
    {
        hasUnderlyingOptAttribute = false;
    }

    public void resetUnderlyingContractMultiplier()
    {
        hasUnderlyingContractMultiplier = false;
    }

    public void resetUnderlyingContractMultiplierUnit()
    {
        hasUnderlyingContractMultiplierUnit = false;
    }

    public void resetUnderlyingFlowScheduleType()
    {
        hasUnderlyingFlowScheduleType = false;
    }

    public void resetUnderlyingUnitOfMeasure()
    {
        hasUnderlyingUnitOfMeasure = false;
    }

    public void resetUnderlyingUnitOfMeasureQty()
    {
        hasUnderlyingUnitOfMeasureQty = false;
    }

    public void resetUnderlyingPriceUnitOfMeasure()
    {
        hasUnderlyingPriceUnitOfMeasure = false;
    }

    public void resetUnderlyingPriceUnitOfMeasureQty()
    {
        hasUnderlyingPriceUnitOfMeasureQty = false;
    }

    public void resetUnderlyingTimeUnit()
    {
        hasUnderlyingTimeUnit = false;
    }

    public void resetUnderlyingExerciseStyle()
    {
        hasUnderlyingExerciseStyle = false;
    }

    public void resetUnderlyingCouponRate()
    {
        hasUnderlyingCouponRate = false;
    }

    public void resetUnderlyingSecurityExchange()
    {
        hasUnderlyingSecurityExchange = false;
    }

    public void resetUnderlyingIssuer()
    {
        hasUnderlyingIssuer = false;
    }

    public void resetEncodedUnderlyingIssuerLen()
    {
        hasEncodedUnderlyingIssuerLen = false;
    }

    public void resetEncodedUnderlyingIssuer()
    {
        hasEncodedUnderlyingIssuer = false;
    }

    public void resetUnderlyingSecurityDesc()
    {
        hasUnderlyingSecurityDesc = false;
    }

    public void resetEncodedUnderlyingSecurityDescLen()
    {
        hasEncodedUnderlyingSecurityDescLen = false;
    }

    public void resetEncodedUnderlyingSecurityDesc()
    {
        hasEncodedUnderlyingSecurityDesc = false;
    }

    public void resetUnderlyingCPProgram()
    {
        hasUnderlyingCPProgram = false;
    }

    public void resetUnderlyingCPRegType()
    {
        hasUnderlyingCPRegType = false;
    }

    public void resetUnderlyingAllocationPercent()
    {
        hasUnderlyingAllocationPercent = false;
    }

    public void resetUnderlyingCurrency()
    {
        hasUnderlyingCurrency = false;
    }

    public void resetUnderlyingQty()
    {
        hasUnderlyingQty = false;
    }

    public void resetUnderlyingSettlementType()
    {
        hasUnderlyingSettlementType = false;
    }

    public void resetUnderlyingCashAmount()
    {
        hasUnderlyingCashAmount = false;
    }

    public void resetUnderlyingCashType()
    {
        hasUnderlyingCashType = false;
    }

    public void resetUnderlyingPx()
    {
        hasUnderlyingPx = false;
    }

    public void resetUnderlyingDirtyPrice()
    {
        hasUnderlyingDirtyPrice = false;
    }

    public void resetUnderlyingEndPrice()
    {
        hasUnderlyingEndPrice = false;
    }

    public void resetUnderlyingStartValue()
    {
        hasUnderlyingStartValue = false;
    }

    public void resetUnderlyingCurrentValue()
    {
        hasUnderlyingCurrentValue = false;
    }

    public void resetUnderlyingEndValue()
    {
        hasUnderlyingEndValue = false;
    }

    public void resetUnderlyingAdjustedQuantity()
    {
        hasUnderlyingAdjustedQuantity = false;
    }

    public void resetUnderlyingFXRate()
    {
        hasUnderlyingFXRate = false;
    }

    public void resetUnderlyingFXRateCalc()
    {
        hasUnderlyingFXRateCalc = false;
    }

    public void resetUnderlyingCapValue()
    {
        hasUnderlyingCapValue = false;
    }

    public void resetUnderlyingSettlMethod()
    {
        hasUnderlyingSettlMethod = false;
    }

    public void resetUnderlyingPutOrCall()
    {
        hasUnderlyingPutOrCall = false;
    }

    public void resetUnderlyingSecurityAltIDGroup()
    {
        for (final UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroupDecoder : underlyingSecurityAltIDGroupIterator.iterator())
        {
            underlyingSecurityAltIDGroupDecoder.reset();
            if (underlyingSecurityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingSecurityAltIDGroupCounter = MISSING_INT;
        hasNoUnderlyingSecurityAltIDGroupCounter = false;
    }

    public void resetUnderlyingStipsGroup()
    {
        for (final UnderlyingStipsGroupDecoder underlyingStipsGroupDecoder : underlyingStipsGroupIterator.iterator())
        {
            underlyingStipsGroupDecoder.reset();
            if (underlyingStipsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingStipsGroupCounter = MISSING_INT;
        hasNoUnderlyingStipsGroupCounter = false;
    }

    public void resetUndlyInstrumentPartiesGroup()
    {
        for (final UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroupDecoder : undlyInstrumentPartiesGroupIterator.iterator())
        {
            undlyInstrumentPartiesGroupDecoder.reset();
            if (undlyInstrumentPartiesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUndlyInstrumentPartiesGroupCounter = MISSING_INT;
        hasNoUndlyInstrumentPartiesGroupCounter = false;
    }

    public void resetUnderlyingAmountsGroup()
    {
        for (final UnderlyingAmountsGroupDecoder underlyingAmountsGroupDecoder : underlyingAmountsGroupIterator.iterator())
        {
            underlyingAmountsGroupDecoder.reset();
            if (underlyingAmountsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingAmountsGroupCounter = MISSING_INT;
        hasNoUnderlyingAmountsGroupCounter = false;
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
        builder.append("\"MessageName\": \"UnderlyingsGroup\",\n");
        if (hasUnderlyingSymbol())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbol\": \"");
            builder.append(this.underlyingSymbol(), 0, underlyingSymbolLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSymbolSfx\": \"");
            builder.append(this.underlyingSymbolSfx(), 0, underlyingSymbolSfxLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityID\": \"");
            builder.append(this.underlyingSecurityID(), 0, underlyingSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityIDSource\": \"");
            builder.append(this.underlyingSecurityIDSource(), 0, underlyingSecurityIDSourceLength());
            builder.append("\",\n");
        }

    if (hasNoUnderlyingSecurityAltIDGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingSecurityAltIDGroup\": [\n");
        UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
        for (int i = 0, size = this.noUnderlyingSecurityAltIDGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingSecurityAltIDGroup.appendTo(builder, level + 1);            if (underlyingSecurityAltIDGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingProduct())
        {
            indent(builder, level);
            builder.append("\"UnderlyingProduct\": \"");
            builder.append(underlyingProduct);
            builder.append("\",\n");
        }

        if (hasUnderlyingCFICode())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCFICode\": \"");
            builder.append(this.underlyingCFICode(), 0, underlyingCFICodeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityType\": \"");
            builder.append(this.underlyingSecurityType(), 0, underlyingSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecuritySubType\": \"");
            builder.append(this.underlyingSecuritySubType(), 0, underlyingSecuritySubTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityMonthYear\": \"");
            appendData(builder, underlyingMaturityMonthYear, underlyingMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityDate\": \"");
            appendData(builder, underlyingMaturityDate, underlyingMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingMaturityTime())
        {
            indent(builder, level);
            builder.append("\"UnderlyingMaturityTime\": \"");
            appendData(builder, underlyingMaturityTime, underlyingMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponPaymentDate\": \"");
            appendData(builder, underlyingCouponPaymentDate, underlyingCouponPaymentDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRestructuringType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRestructuringType\": \"");
            builder.append(this.underlyingRestructuringType(), 0, underlyingRestructuringTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingSeniority())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSeniority\": \"");
            builder.append(this.underlyingSeniority(), 0, underlyingSeniorityLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"UnderlyingNotionalPercentageOutstanding\": \"");
            underlyingNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingOriginalNotionalPercentageOutstanding())
        {
            indent(builder, level);
            builder.append("\"UnderlyingOriginalNotionalPercentageOutstanding\": \"");
            underlyingOriginalNotionalPercentageOutstanding.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingAttachmentPoint())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAttachmentPoint\": \"");
            underlyingAttachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingDetachmentPoint())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDetachmentPoint\": \"");
            underlyingDetachmentPoint.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingIssueDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssueDate\": \"");
            appendData(builder, underlyingIssueDate, underlyingIssueDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepoCollateralSecurityType\": \"");
            builder.append(this.underlyingRepoCollateralSecurityType(), 0, underlyingRepoCollateralSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseTerm\": \"");
            builder.append(underlyingRepurchaseTerm);
            builder.append("\",\n");
        }

        if (hasUnderlyingRepurchaseRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRepurchaseRate\": \"");
            underlyingRepurchaseRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFactor())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFactor\": \"");
            underlyingFactor.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCreditRating())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCreditRating\": \"");
            builder.append(this.underlyingCreditRating(), 0, underlyingCreditRatingLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingInstrRegistry())
        {
            indent(builder, level);
            builder.append("\"UnderlyingInstrRegistry\": \"");
            builder.append(this.underlyingInstrRegistry(), 0, underlyingInstrRegistryLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingCountryOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCountryOfIssue\": \"");
            builder.append(this.underlyingCountryOfIssue(), 0, underlyingCountryOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStateOrProvinceOfIssue\": \"");
            builder.append(this.underlyingStateOrProvinceOfIssue(), 0, underlyingStateOrProvinceOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLocaleOfIssue\": \"");
            builder.append(this.underlyingLocaleOfIssue(), 0, underlyingLocaleOfIssueLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingRedemptionDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingRedemptionDate\": \"");
            appendData(builder, underlyingRedemptionDate, underlyingRedemptionDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikePrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikePrice\": \"");
            underlyingStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStrikeCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStrikeCurrency\": \"");
            builder.append(this.underlyingStrikeCurrency(), 0, underlyingStrikeCurrencyLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingOptAttribute())
        {
            indent(builder, level);
            builder.append("\"UnderlyingOptAttribute\": \"");
            builder.append(underlyingOptAttribute);
            builder.append("\",\n");
        }

        if (hasUnderlyingContractMultiplier())
        {
            indent(builder, level);
            builder.append("\"UnderlyingContractMultiplier\": \"");
            underlyingContractMultiplier.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingContractMultiplierUnit())
        {
            indent(builder, level);
            builder.append("\"UnderlyingContractMultiplierUnit\": \"");
            builder.append(underlyingContractMultiplierUnit);
            builder.append("\",\n");
        }

        if (hasUnderlyingFlowScheduleType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFlowScheduleType\": \"");
            builder.append(underlyingFlowScheduleType);
            builder.append("\",\n");
        }

        if (hasUnderlyingUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnderlyingUnitOfMeasure\": \"");
            builder.append(this.underlyingUnitOfMeasure(), 0, underlyingUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingUnitOfMeasureQty\": \"");
            underlyingUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceUnitOfMeasure())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceUnitOfMeasure\": \"");
            builder.append(this.underlyingPriceUnitOfMeasure(), 0, underlyingPriceUnitOfMeasureLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPriceUnitOfMeasureQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPriceUnitOfMeasureQty\": \"");
            underlyingPriceUnitOfMeasureQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingTimeUnit())
        {
            indent(builder, level);
            builder.append("\"UnderlyingTimeUnit\": \"");
            builder.append(this.underlyingTimeUnit(), 0, underlyingTimeUnitLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingExerciseStyle())
        {
            indent(builder, level);
            builder.append("\"UnderlyingExerciseStyle\": \"");
            builder.append(underlyingExerciseStyle);
            builder.append("\",\n");
        }

        if (hasUnderlyingCouponRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCouponRate\": \"");
            underlyingCouponRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityExchange\": \"");
            builder.append(this.underlyingSecurityExchange(), 0, underlyingSecurityExchangeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"UnderlyingIssuer\": \"");
            builder.append(this.underlyingIssuer(), 0, underlyingIssuerLength());
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuerLen\": \"");
            builder.append(encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingIssuer())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingIssuer\": \"");
            appendData(builder, encodedUnderlyingIssuer, encodedUnderlyingIssuerLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSecurityDesc\": \"");
            builder.append(this.underlyingSecurityDesc(), 0, underlyingSecurityDescLength());
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDescLen\": \"");
            builder.append(encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"EncodedUnderlyingSecurityDesc\": \"");
            appendData(builder, encodedUnderlyingSecurityDesc, encodedUnderlyingSecurityDescLen);
            builder.append("\",\n");
        }

        if (hasUnderlyingCPProgram())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPProgram\": \"");
            builder.append(this.underlyingCPProgram(), 0, underlyingCPProgramLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingCPRegType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCPRegType\": \"");
            builder.append(this.underlyingCPRegType(), 0, underlyingCPRegTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingAllocationPercent())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAllocationPercent\": \"");
            underlyingAllocationPercent.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrency())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrency\": \"");
            builder.append(this.underlyingCurrency(), 0, underlyingCurrencyLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingQty())
        {
            indent(builder, level);
            builder.append("\"UnderlyingQty\": \"");
            underlyingQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlementType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlementType\": \"");
            builder.append(underlyingSettlementType);
            builder.append("\",\n");
        }

        if (hasUnderlyingCashAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCashAmount\": \"");
            underlyingCashAmount.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCashType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCashType\": \"");
            builder.append(this.underlyingCashType(), 0, underlyingCashTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPx\": \"");
            underlyingPx.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingDirtyPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDirtyPrice\": \"");
            underlyingDirtyPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndPrice\": \"");
            underlyingEndPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingStartValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingStartValue\": \"");
            underlyingStartValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingCurrentValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCurrentValue\": \"");
            underlyingCurrentValue.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingEndValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingEndValue\": \"");
            underlyingEndValue.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoUnderlyingStipsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingStipsGroup\": [\n");
        UnderlyingStipsGroupDecoder underlyingStipsGroup = this.underlyingStipsGroup;
        for (int i = 0, size = this.noUnderlyingStipsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingStipsGroup.appendTo(builder, level + 1);            if (underlyingStipsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingStipsGroup = underlyingStipsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingAdjustedQuantity())
        {
            indent(builder, level);
            builder.append("\"UnderlyingAdjustedQuantity\": \"");
            underlyingAdjustedQuantity.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFXRate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFXRate\": \"");
            underlyingFXRate.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingFXRateCalc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingFXRateCalc\": \"");
            builder.append(underlyingFXRateCalc);
            builder.append("\",\n");
        }

        if (hasUnderlyingCapValue())
        {
            indent(builder, level);
            builder.append("\"UnderlyingCapValue\": \"");
            underlyingCapValue.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoUndlyInstrumentPartiesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UndlyInstrumentPartiesGroup\": [\n");
        UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
        for (int i = 0, size = this.noUndlyInstrumentPartiesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            undlyInstrumentPartiesGroup.appendTo(builder, level + 1);            if (undlyInstrumentPartiesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingSettlMethod())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlMethod\": \"");
            builder.append(this.underlyingSettlMethod(), 0, underlyingSettlMethodLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingPutOrCall\": \"");
            builder.append(underlyingPutOrCall);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlPrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPrice\": \"");
            underlyingSettlPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingSettlPriceType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingSettlPriceType\": \"");
            builder.append(underlyingSettlPriceType);
            builder.append("\",\n");
        }

        if (hasUnderlyingDeliveryAmount())
        {
            indent(builder, level);
            builder.append("\"UnderlyingDeliveryAmount\": \"");
            underlyingDeliveryAmount.appendTo(builder);
            builder.append("\",\n");
        }

    if (hasNoUnderlyingAmountsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingAmountsGroup\": [\n");
        UnderlyingAmountsGroupDecoder underlyingAmountsGroup = this.underlyingAmountsGroup;
        for (int i = 0, size = this.noUnderlyingAmountsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingAmountsGroup.appendTo(builder, level + 1);            if (underlyingAmountsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingAmountsGroup = underlyingAmountsGroup.next();        }
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
    public UnderlyingsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((UnderlyingsGroupEncoder)encoder);
    }

    public UnderlyingsGroupEncoder toEncoder(final UnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        final UnderlyingInstrumentEncoder underlyingInstrument = encoder.underlyingInstrument();        if (hasUnderlyingSymbol())
        {
            underlyingInstrument.underlyingSymbol(this.underlyingSymbol(), 0, underlyingSymbolLength());
        }

        if (hasUnderlyingSymbolSfx())
        {
            underlyingInstrument.underlyingSymbolSfx(this.underlyingSymbolSfx(), 0, underlyingSymbolSfxLength());
        }

        if (hasUnderlyingSecurityID())
        {
            underlyingInstrument.underlyingSecurityID(this.underlyingSecurityID(), 0, underlyingSecurityIDLength());
        }

        if (hasUnderlyingSecurityIDSource())
        {
            underlyingInstrument.underlyingSecurityIDSource(this.underlyingSecurityIDSource(), 0, underlyingSecurityIDSourceLength());
        }


        final UndSecAltIDGrpEncoder undSecAltIDGrp = underlyingInstrument.undSecAltIDGrp();        if (hasNoUnderlyingSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingSecurityAltIDGroupCounter;
            UnderlyingSecurityAltIDGroupDecoder underlyingSecurityAltIDGroup = this.underlyingSecurityAltIDGroup;
            UnderlyingSecurityAltIDGroupEncoder underlyingSecurityAltIDGroupEncoder = undSecAltIDGrp.underlyingSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingSecurityAltIDGroup != null)
                {
                    underlyingSecurityAltIDGroup.toEncoder(underlyingSecurityAltIDGroupEncoder);
                    underlyingSecurityAltIDGroup = underlyingSecurityAltIDGroup.next();
                    underlyingSecurityAltIDGroupEncoder = underlyingSecurityAltIDGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingProduct())
        {
            underlyingInstrument.underlyingProduct(this.underlyingProduct());
        }

        if (hasUnderlyingCFICode())
        {
            underlyingInstrument.underlyingCFICode(this.underlyingCFICode(), 0, underlyingCFICodeLength());
        }

        if (hasUnderlyingSecurityType())
        {
            underlyingInstrument.underlyingSecurityType(this.underlyingSecurityType(), 0, underlyingSecurityTypeLength());
        }

        if (hasUnderlyingSecuritySubType())
        {
            underlyingInstrument.underlyingSecuritySubType(this.underlyingSecuritySubType(), 0, underlyingSecuritySubTypeLength());
        }

        if (hasUnderlyingMaturityMonthYear())
        {
            underlyingInstrument.underlyingMaturityMonthYearAsCopy(this.underlyingMaturityMonthYear(), 0, underlyingMaturityMonthYearLength());
        }

        if (hasUnderlyingMaturityDate())
        {
            underlyingInstrument.underlyingMaturityDateAsCopy(this.underlyingMaturityDate(), 0, underlyingMaturityDateLength());
        }

        if (hasUnderlyingMaturityTime())
        {
            underlyingInstrument.underlyingMaturityTimeAsCopy(this.underlyingMaturityTime(), 0, underlyingMaturityTimeLength());
        }

        if (hasUnderlyingCouponPaymentDate())
        {
            underlyingInstrument.underlyingCouponPaymentDateAsCopy(this.underlyingCouponPaymentDate(), 0, underlyingCouponPaymentDateLength());
        }

        if (hasUnderlyingRestructuringType())
        {
            underlyingInstrument.underlyingRestructuringType(this.underlyingRestructuringType(), 0, underlyingRestructuringTypeLength());
        }

        if (hasUnderlyingSeniority())
        {
            underlyingInstrument.underlyingSeniority(this.underlyingSeniority(), 0, underlyingSeniorityLength());
        }

        if (hasUnderlyingNotionalPercentageOutstanding())
        {
            underlyingInstrument.underlyingNotionalPercentageOutstanding(this.underlyingNotionalPercentageOutstanding());
        }

        if (hasUnderlyingOriginalNotionalPercentageOutstanding())
        {
            underlyingInstrument.underlyingOriginalNotionalPercentageOutstanding(this.underlyingOriginalNotionalPercentageOutstanding());
        }

        if (hasUnderlyingAttachmentPoint())
        {
            underlyingInstrument.underlyingAttachmentPoint(this.underlyingAttachmentPoint());
        }

        if (hasUnderlyingDetachmentPoint())
        {
            underlyingInstrument.underlyingDetachmentPoint(this.underlyingDetachmentPoint());
        }

        if (hasUnderlyingIssueDate())
        {
            underlyingInstrument.underlyingIssueDateAsCopy(this.underlyingIssueDate(), 0, underlyingIssueDateLength());
        }

        if (hasUnderlyingRepoCollateralSecurityType())
        {
            underlyingInstrument.underlyingRepoCollateralSecurityType(this.underlyingRepoCollateralSecurityType(), 0, underlyingRepoCollateralSecurityTypeLength());
        }

        if (hasUnderlyingRepurchaseTerm())
        {
            underlyingInstrument.underlyingRepurchaseTerm(this.underlyingRepurchaseTerm());
        }

        if (hasUnderlyingRepurchaseRate())
        {
            underlyingInstrument.underlyingRepurchaseRate(this.underlyingRepurchaseRate());
        }

        if (hasUnderlyingFactor())
        {
            underlyingInstrument.underlyingFactor(this.underlyingFactor());
        }

        if (hasUnderlyingCreditRating())
        {
            underlyingInstrument.underlyingCreditRating(this.underlyingCreditRating(), 0, underlyingCreditRatingLength());
        }

        if (hasUnderlyingInstrRegistry())
        {
            underlyingInstrument.underlyingInstrRegistry(this.underlyingInstrRegistry(), 0, underlyingInstrRegistryLength());
        }

        if (hasUnderlyingCountryOfIssue())
        {
            underlyingInstrument.underlyingCountryOfIssue(this.underlyingCountryOfIssue(), 0, underlyingCountryOfIssueLength());
        }

        if (hasUnderlyingStateOrProvinceOfIssue())
        {
            underlyingInstrument.underlyingStateOrProvinceOfIssue(this.underlyingStateOrProvinceOfIssue(), 0, underlyingStateOrProvinceOfIssueLength());
        }

        if (hasUnderlyingLocaleOfIssue())
        {
            underlyingInstrument.underlyingLocaleOfIssue(this.underlyingLocaleOfIssue(), 0, underlyingLocaleOfIssueLength());
        }

        if (hasUnderlyingRedemptionDate())
        {
            underlyingInstrument.underlyingRedemptionDateAsCopy(this.underlyingRedemptionDate(), 0, underlyingRedemptionDateLength());
        }

        if (hasUnderlyingStrikePrice())
        {
            underlyingInstrument.underlyingStrikePrice(this.underlyingStrikePrice());
        }

        if (hasUnderlyingStrikeCurrency())
        {
            underlyingInstrument.underlyingStrikeCurrency(this.underlyingStrikeCurrency(), 0, underlyingStrikeCurrencyLength());
        }

        if (hasUnderlyingOptAttribute())
        {
            underlyingInstrument.underlyingOptAttribute(this.underlyingOptAttribute());
        }

        if (hasUnderlyingContractMultiplier())
        {
            underlyingInstrument.underlyingContractMultiplier(this.underlyingContractMultiplier());
        }

        if (hasUnderlyingContractMultiplierUnit())
        {
            underlyingInstrument.underlyingContractMultiplierUnit(this.underlyingContractMultiplierUnit());
        }

        if (hasUnderlyingFlowScheduleType())
        {
            underlyingInstrument.underlyingFlowScheduleType(this.underlyingFlowScheduleType());
        }

        if (hasUnderlyingUnitOfMeasure())
        {
            underlyingInstrument.underlyingUnitOfMeasure(this.underlyingUnitOfMeasure(), 0, underlyingUnitOfMeasureLength());
        }

        if (hasUnderlyingUnitOfMeasureQty())
        {
            underlyingInstrument.underlyingUnitOfMeasureQty(this.underlyingUnitOfMeasureQty());
        }

        if (hasUnderlyingPriceUnitOfMeasure())
        {
            underlyingInstrument.underlyingPriceUnitOfMeasure(this.underlyingPriceUnitOfMeasure(), 0, underlyingPriceUnitOfMeasureLength());
        }

        if (hasUnderlyingPriceUnitOfMeasureQty())
        {
            underlyingInstrument.underlyingPriceUnitOfMeasureQty(this.underlyingPriceUnitOfMeasureQty());
        }

        if (hasUnderlyingTimeUnit())
        {
            underlyingInstrument.underlyingTimeUnit(this.underlyingTimeUnit(), 0, underlyingTimeUnitLength());
        }

        if (hasUnderlyingExerciseStyle())
        {
            underlyingInstrument.underlyingExerciseStyle(this.underlyingExerciseStyle());
        }

        if (hasUnderlyingCouponRate())
        {
            underlyingInstrument.underlyingCouponRate(this.underlyingCouponRate());
        }

        if (hasUnderlyingSecurityExchange())
        {
            underlyingInstrument.underlyingSecurityExchange(this.underlyingSecurityExchange(), 0, underlyingSecurityExchangeLength());
        }

        if (hasUnderlyingIssuer())
        {
            underlyingInstrument.underlyingIssuer(this.underlyingIssuer(), 0, underlyingIssuerLength());
        }

        if (hasEncodedUnderlyingIssuerLen())
        {
            underlyingInstrument.encodedUnderlyingIssuerLen(this.encodedUnderlyingIssuerLen());
        }

        if (hasEncodedUnderlyingIssuer())
        {
            underlyingInstrument.encodedUnderlyingIssuerAsCopy(this.encodedUnderlyingIssuer(), 0, encodedUnderlyingIssuerLen());
            underlyingInstrument.encodedUnderlyingIssuerLen(this.encodedUnderlyingIssuerLen());
        }

        if (hasUnderlyingSecurityDesc())
        {
            underlyingInstrument.underlyingSecurityDesc(this.underlyingSecurityDesc(), 0, underlyingSecurityDescLength());
        }

        if (hasEncodedUnderlyingSecurityDescLen())
        {
            underlyingInstrument.encodedUnderlyingSecurityDescLen(this.encodedUnderlyingSecurityDescLen());
        }

        if (hasEncodedUnderlyingSecurityDesc())
        {
            underlyingInstrument.encodedUnderlyingSecurityDescAsCopy(this.encodedUnderlyingSecurityDesc(), 0, encodedUnderlyingSecurityDescLen());
            underlyingInstrument.encodedUnderlyingSecurityDescLen(this.encodedUnderlyingSecurityDescLen());
        }

        if (hasUnderlyingCPProgram())
        {
            underlyingInstrument.underlyingCPProgram(this.underlyingCPProgram(), 0, underlyingCPProgramLength());
        }

        if (hasUnderlyingCPRegType())
        {
            underlyingInstrument.underlyingCPRegType(this.underlyingCPRegType(), 0, underlyingCPRegTypeLength());
        }

        if (hasUnderlyingAllocationPercent())
        {
            underlyingInstrument.underlyingAllocationPercent(this.underlyingAllocationPercent());
        }

        if (hasUnderlyingCurrency())
        {
            underlyingInstrument.underlyingCurrency(this.underlyingCurrency(), 0, underlyingCurrencyLength());
        }

        if (hasUnderlyingQty())
        {
            underlyingInstrument.underlyingQty(this.underlyingQty());
        }

        if (hasUnderlyingSettlementType())
        {
            underlyingInstrument.underlyingSettlementType(this.underlyingSettlementType());
        }

        if (hasUnderlyingCashAmount())
        {
            underlyingInstrument.underlyingCashAmount(this.underlyingCashAmount());
        }

        if (hasUnderlyingCashType())
        {
            underlyingInstrument.underlyingCashType(this.underlyingCashType(), 0, underlyingCashTypeLength());
        }

        if (hasUnderlyingPx())
        {
            underlyingInstrument.underlyingPx(this.underlyingPx());
        }

        if (hasUnderlyingDirtyPrice())
        {
            underlyingInstrument.underlyingDirtyPrice(this.underlyingDirtyPrice());
        }

        if (hasUnderlyingEndPrice())
        {
            underlyingInstrument.underlyingEndPrice(this.underlyingEndPrice());
        }

        if (hasUnderlyingStartValue())
        {
            underlyingInstrument.underlyingStartValue(this.underlyingStartValue());
        }

        if (hasUnderlyingCurrentValue())
        {
            underlyingInstrument.underlyingCurrentValue(this.underlyingCurrentValue());
        }

        if (hasUnderlyingEndValue())
        {
            underlyingInstrument.underlyingEndValue(this.underlyingEndValue());
        }


        final UnderlyingStipulationsEncoder underlyingStipulations = underlyingInstrument.underlyingStipulations();        if (hasNoUnderlyingStipsGroupCounter)
        {
            final int size = this.noUnderlyingStipsGroupCounter;
            UnderlyingStipsGroupDecoder underlyingStipsGroup = this.underlyingStipsGroup;
            UnderlyingStipsGroupEncoder underlyingStipsGroupEncoder = underlyingStipulations.underlyingStipsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingStipsGroup != null)
                {
                    underlyingStipsGroup.toEncoder(underlyingStipsGroupEncoder);
                    underlyingStipsGroup = underlyingStipsGroup.next();
                    underlyingStipsGroupEncoder = underlyingStipsGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingAdjustedQuantity())
        {
            underlyingInstrument.underlyingAdjustedQuantity(this.underlyingAdjustedQuantity());
        }

        if (hasUnderlyingFXRate())
        {
            underlyingInstrument.underlyingFXRate(this.underlyingFXRate());
        }

        if (hasUnderlyingFXRateCalc())
        {
            underlyingInstrument.underlyingFXRateCalc(this.underlyingFXRateCalc());
        }

        if (hasUnderlyingCapValue())
        {
            underlyingInstrument.underlyingCapValue(this.underlyingCapValue());
        }


        final UndlyInstrumentPartiesEncoder undlyInstrumentParties = underlyingInstrument.undlyInstrumentParties();        if (hasNoUndlyInstrumentPartiesGroupCounter)
        {
            final int size = this.noUndlyInstrumentPartiesGroupCounter;
            UndlyInstrumentPartiesGroupDecoder undlyInstrumentPartiesGroup = this.undlyInstrumentPartiesGroup;
            UndlyInstrumentPartiesGroupEncoder undlyInstrumentPartiesGroupEncoder = undlyInstrumentParties.undlyInstrumentPartiesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (undlyInstrumentPartiesGroup != null)
                {
                    undlyInstrumentPartiesGroup.toEncoder(undlyInstrumentPartiesGroupEncoder);
                    undlyInstrumentPartiesGroup = undlyInstrumentPartiesGroup.next();
                    undlyInstrumentPartiesGroupEncoder = undlyInstrumentPartiesGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingSettlMethod())
        {
            underlyingInstrument.underlyingSettlMethod(this.underlyingSettlMethod(), 0, underlyingSettlMethodLength());
        }

        if (hasUnderlyingPutOrCall())
        {
            underlyingInstrument.underlyingPutOrCall(this.underlyingPutOrCall());
        }


        if (hasUnderlyingSettlPrice())
        {
            encoder.underlyingSettlPrice(this.underlyingSettlPrice());
        }

        if (hasUnderlyingSettlPriceType())
        {
            encoder.underlyingSettlPriceType(this.underlyingSettlPriceType());
        }

        if (hasUnderlyingDeliveryAmount())
        {
            encoder.underlyingDeliveryAmount(this.underlyingDeliveryAmount());
        }


        final UnderlyingAmountEncoder underlyingAmount = encoder.underlyingAmount();        if (hasNoUnderlyingAmountsGroupCounter)
        {
            final int size = this.noUnderlyingAmountsGroupCounter;
            UnderlyingAmountsGroupDecoder underlyingAmountsGroup = this.underlyingAmountsGroup;
            UnderlyingAmountsGroupEncoder underlyingAmountsGroupEncoder = underlyingAmount.underlyingAmountsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingAmountsGroup != null)
                {
                    underlyingAmountsGroup.toEncoder(underlyingAmountsGroupEncoder);
                    underlyingAmountsGroup = underlyingAmountsGroup.next();
                    underlyingAmountsGroupEncoder = underlyingAmountsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
    public class UnderlyingsGroupIterator implements Iterable<UnderlyingsGroupDecoder>, java.util.Iterator<UnderlyingsGroupDecoder>
    {
        private final PosUndInstrmtGrpDecoder parent;
        private int remainder;
        private UnderlyingsGroupDecoder current;

        public UnderlyingsGroupIterator(final PosUndInstrmtGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public UnderlyingsGroupDecoder next()
        {
            remainder--;
            final UnderlyingsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoUnderlyingsGroupCounter() ? parent.noUnderlyingsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.underlyingsGroup();
        }
        public UnderlyingsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public UnderlyingsGroupIterator underlyingsGroupIterator();
    public int noUnderlyingsGroupCounter();
    public boolean hasNoUnderlyingsGroupCounter();
    public UnderlyingsGroupDecoder underlyingsGroup();

}
