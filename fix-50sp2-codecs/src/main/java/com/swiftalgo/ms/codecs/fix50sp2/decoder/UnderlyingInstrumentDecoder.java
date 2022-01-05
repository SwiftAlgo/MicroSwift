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
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndSecAltIDGrpEncoder.UnderlyingSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingStipulationsEncoder.UnderlyingStipsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPartiesEncoder.UndlyInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UndlyInstrumentPtysSubGrpEncoder.UndlyInstrumentPartySubIDsGroupEncoder;

public interface UnderlyingInstrumentDecoder  extends UndSecAltIDGrpDecoder, UnderlyingStipulationsDecoder, UndlyInstrumentPartiesDecoder
{

    public char[] underlyingSymbol();
    public boolean hasUnderlyingSymbol();
    public int underlyingSymbolLength();
    public void underlyingSymbol(AsciiSequenceView view);
    public char[] underlyingSymbolSfx();
    public boolean hasUnderlyingSymbolSfx();
    public int underlyingSymbolSfxLength();
    public void underlyingSymbolSfx(AsciiSequenceView view);
    public char[] underlyingSecurityID();
    public boolean hasUnderlyingSecurityID();
    public int underlyingSecurityIDLength();
    public void underlyingSecurityID(AsciiSequenceView view);
    public char[] underlyingSecurityIDSource();
    public boolean hasUnderlyingSecurityIDSource();
    public int underlyingSecurityIDSourceLength();
    public void underlyingSecurityIDSource(AsciiSequenceView view);
    public int underlyingProduct();
    public boolean hasUnderlyingProduct();
    public char[] underlyingCFICode();
    public boolean hasUnderlyingCFICode();
    public int underlyingCFICodeLength();
    public void underlyingCFICode(AsciiSequenceView view);
    public char[] underlyingSecurityType();
    public boolean hasUnderlyingSecurityType();
    public int underlyingSecurityTypeLength();
    public void underlyingSecurityType(AsciiSequenceView view);
    public char[] underlyingSecuritySubType();
    public boolean hasUnderlyingSecuritySubType();
    public int underlyingSecuritySubTypeLength();
    public void underlyingSecuritySubType(AsciiSequenceView view);
    public byte[] underlyingMaturityMonthYear();
    public boolean hasUnderlyingMaturityMonthYear();
    public int underlyingMaturityMonthYearLength();
    public void underlyingMaturityMonthYear(AsciiSequenceView view);
    public byte[] underlyingMaturityDate();
    public boolean hasUnderlyingMaturityDate();
    public int underlyingMaturityDateLength();
    public void underlyingMaturityDate(AsciiSequenceView view);
    public byte[] underlyingMaturityTime();
    public boolean hasUnderlyingMaturityTime();
    public int underlyingMaturityTimeLength();
    public void underlyingMaturityTime(AsciiSequenceView view);
    public byte[] underlyingCouponPaymentDate();
    public boolean hasUnderlyingCouponPaymentDate();
    public int underlyingCouponPaymentDateLength();
    public void underlyingCouponPaymentDate(AsciiSequenceView view);
    public char[] underlyingRestructuringType();
    public boolean hasUnderlyingRestructuringType();
    public int underlyingRestructuringTypeLength();
    public void underlyingRestructuringType(AsciiSequenceView view);
    public char[] underlyingSeniority();
    public boolean hasUnderlyingSeniority();
    public int underlyingSeniorityLength();
    public void underlyingSeniority(AsciiSequenceView view);
    public DecimalFloat underlyingNotionalPercentageOutstanding();
    public boolean hasUnderlyingNotionalPercentageOutstanding();
    public DecimalFloat underlyingOriginalNotionalPercentageOutstanding();
    public boolean hasUnderlyingOriginalNotionalPercentageOutstanding();
    public DecimalFloat underlyingAttachmentPoint();
    public boolean hasUnderlyingAttachmentPoint();
    public DecimalFloat underlyingDetachmentPoint();
    public boolean hasUnderlyingDetachmentPoint();
    public byte[] underlyingIssueDate();
    public boolean hasUnderlyingIssueDate();
    public int underlyingIssueDateLength();
    public void underlyingIssueDate(AsciiSequenceView view);
    public char[] underlyingRepoCollateralSecurityType();
    public boolean hasUnderlyingRepoCollateralSecurityType();
    public int underlyingRepoCollateralSecurityTypeLength();
    public void underlyingRepoCollateralSecurityType(AsciiSequenceView view);
    public int underlyingRepurchaseTerm();
    public boolean hasUnderlyingRepurchaseTerm();
    public DecimalFloat underlyingRepurchaseRate();
    public boolean hasUnderlyingRepurchaseRate();
    public DecimalFloat underlyingFactor();
    public boolean hasUnderlyingFactor();
    public char[] underlyingCreditRating();
    public boolean hasUnderlyingCreditRating();
    public int underlyingCreditRatingLength();
    public void underlyingCreditRating(AsciiSequenceView view);
    public char[] underlyingInstrRegistry();
    public boolean hasUnderlyingInstrRegistry();
    public int underlyingInstrRegistryLength();
    public void underlyingInstrRegistry(AsciiSequenceView view);
    public char[] underlyingCountryOfIssue();
    public boolean hasUnderlyingCountryOfIssue();
    public int underlyingCountryOfIssueLength();
    public void underlyingCountryOfIssue(AsciiSequenceView view);
    public char[] underlyingStateOrProvinceOfIssue();
    public boolean hasUnderlyingStateOrProvinceOfIssue();
    public int underlyingStateOrProvinceOfIssueLength();
    public void underlyingStateOrProvinceOfIssue(AsciiSequenceView view);
    public char[] underlyingLocaleOfIssue();
    public boolean hasUnderlyingLocaleOfIssue();
    public int underlyingLocaleOfIssueLength();
    public void underlyingLocaleOfIssue(AsciiSequenceView view);
    public byte[] underlyingRedemptionDate();
    public boolean hasUnderlyingRedemptionDate();
    public int underlyingRedemptionDateLength();
    public void underlyingRedemptionDate(AsciiSequenceView view);
    public DecimalFloat underlyingStrikePrice();
    public boolean hasUnderlyingStrikePrice();
    public char[] underlyingStrikeCurrency();
    public boolean hasUnderlyingStrikeCurrency();
    public int underlyingStrikeCurrencyLength();
    public void underlyingStrikeCurrency(AsciiSequenceView view);
    public char underlyingOptAttribute();
    public boolean hasUnderlyingOptAttribute();
    public DecimalFloat underlyingContractMultiplier();
    public boolean hasUnderlyingContractMultiplier();
    public int underlyingContractMultiplierUnit();
    public boolean hasUnderlyingContractMultiplierUnit();
    public int underlyingFlowScheduleType();
    public boolean hasUnderlyingFlowScheduleType();
    public char[] underlyingUnitOfMeasure();
    public boolean hasUnderlyingUnitOfMeasure();
    public int underlyingUnitOfMeasureLength();
    public void underlyingUnitOfMeasure(AsciiSequenceView view);
    public DecimalFloat underlyingUnitOfMeasureQty();
    public boolean hasUnderlyingUnitOfMeasureQty();
    public char[] underlyingPriceUnitOfMeasure();
    public boolean hasUnderlyingPriceUnitOfMeasure();
    public int underlyingPriceUnitOfMeasureLength();
    public void underlyingPriceUnitOfMeasure(AsciiSequenceView view);
    public DecimalFloat underlyingPriceUnitOfMeasureQty();
    public boolean hasUnderlyingPriceUnitOfMeasureQty();
    public char[] underlyingTimeUnit();
    public boolean hasUnderlyingTimeUnit();
    public int underlyingTimeUnitLength();
    public void underlyingTimeUnit(AsciiSequenceView view);
    public int underlyingExerciseStyle();
    public boolean hasUnderlyingExerciseStyle();
    public DecimalFloat underlyingCouponRate();
    public boolean hasUnderlyingCouponRate();
    public char[] underlyingSecurityExchange();
    public boolean hasUnderlyingSecurityExchange();
    public int underlyingSecurityExchangeLength();
    public void underlyingSecurityExchange(AsciiSequenceView view);
    public char[] underlyingIssuer();
    public boolean hasUnderlyingIssuer();
    public int underlyingIssuerLength();
    public void underlyingIssuer(AsciiSequenceView view);
    public int encodedUnderlyingIssuerLen();
    public boolean hasEncodedUnderlyingIssuerLen();
    public byte[] encodedUnderlyingIssuer();
    public boolean hasEncodedUnderlyingIssuer();
    public char[] underlyingSecurityDesc();
    public boolean hasUnderlyingSecurityDesc();
    public int underlyingSecurityDescLength();
    public void underlyingSecurityDesc(AsciiSequenceView view);
    public int encodedUnderlyingSecurityDescLen();
    public boolean hasEncodedUnderlyingSecurityDescLen();
    public byte[] encodedUnderlyingSecurityDesc();
    public boolean hasEncodedUnderlyingSecurityDesc();
    public char[] underlyingCPProgram();
    public boolean hasUnderlyingCPProgram();
    public int underlyingCPProgramLength();
    public void underlyingCPProgram(AsciiSequenceView view);
    public char[] underlyingCPRegType();
    public boolean hasUnderlyingCPRegType();
    public int underlyingCPRegTypeLength();
    public void underlyingCPRegType(AsciiSequenceView view);
    public DecimalFloat underlyingAllocationPercent();
    public boolean hasUnderlyingAllocationPercent();
    public char[] underlyingCurrency();
    public boolean hasUnderlyingCurrency();
    public int underlyingCurrencyLength();
    public void underlyingCurrency(AsciiSequenceView view);
    public DecimalFloat underlyingQty();
    public boolean hasUnderlyingQty();
    public int underlyingSettlementType();
    public boolean hasUnderlyingSettlementType();
    public UnderlyingSettlementType underlyingSettlementTypeAsEnum();
    public DecimalFloat underlyingCashAmount();
    public boolean hasUnderlyingCashAmount();
    public char[] underlyingCashType();
    public boolean hasUnderlyingCashType();
    public int underlyingCashTypeLength();
    public UnderlyingCashType underlyingCashTypeAsEnum();
    public void underlyingCashType(AsciiSequenceView view);
    public DecimalFloat underlyingPx();
    public boolean hasUnderlyingPx();
    public DecimalFloat underlyingDirtyPrice();
    public boolean hasUnderlyingDirtyPrice();
    public DecimalFloat underlyingEndPrice();
    public boolean hasUnderlyingEndPrice();
    public DecimalFloat underlyingStartValue();
    public boolean hasUnderlyingStartValue();
    public DecimalFloat underlyingCurrentValue();
    public boolean hasUnderlyingCurrentValue();
    public DecimalFloat underlyingEndValue();
    public boolean hasUnderlyingEndValue();
    public DecimalFloat underlyingAdjustedQuantity();
    public boolean hasUnderlyingAdjustedQuantity();
    public DecimalFloat underlyingFXRate();
    public boolean hasUnderlyingFXRate();
    public char underlyingFXRateCalc();
    public boolean hasUnderlyingFXRateCalc();
    public UnderlyingFXRateCalc underlyingFXRateCalcAsEnum();
    public DecimalFloat underlyingCapValue();
    public boolean hasUnderlyingCapValue();
    public char[] underlyingSettlMethod();
    public boolean hasUnderlyingSettlMethod();
    public int underlyingSettlMethodLength();
    public void underlyingSettlMethod(AsciiSequenceView view);
    public int underlyingPutOrCall();
    public boolean hasUnderlyingPutOrCall();

}