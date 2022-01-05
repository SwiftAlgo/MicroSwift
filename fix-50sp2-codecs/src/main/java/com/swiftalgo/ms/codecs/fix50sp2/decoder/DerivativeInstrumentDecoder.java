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
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityAltIDGrpEncoder.DerivativeSecurityAltIDGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeSecurityXMLEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeEventsGrpEncoder.DerivativeEventsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartiesEncoder.DerivativeInstrumentPartiesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DerivativeInstrumentPartySubIDsGrpEncoder.DerivativeInstrumentPartySubIDsGroupEncoder;

public interface DerivativeInstrumentDecoder  extends DerivativeSecurityAltIDGrpDecoder, DerivativeSecurityXMLDecoder, DerivativeEventsGrpDecoder, DerivativeInstrumentPartiesDecoder
{

    public char[] derivativeSymbol();
    public boolean hasDerivativeSymbol();
    public int derivativeSymbolLength();
    public void derivativeSymbol(AsciiSequenceView view);
    public char[] derivativeSymbolSfx();
    public boolean hasDerivativeSymbolSfx();
    public int derivativeSymbolSfxLength();
    public void derivativeSymbolSfx(AsciiSequenceView view);
    public char[] derivativeSecurityID();
    public boolean hasDerivativeSecurityID();
    public int derivativeSecurityIDLength();
    public void derivativeSecurityID(AsciiSequenceView view);
    public char[] derivativeSecurityIDSource();
    public boolean hasDerivativeSecurityIDSource();
    public int derivativeSecurityIDSourceLength();
    public void derivativeSecurityIDSource(AsciiSequenceView view);
    public int derivativeProduct();
    public boolean hasDerivativeProduct();
    public char[] derivativeProductComplex();
    public boolean hasDerivativeProductComplex();
    public int derivativeProductComplexLength();
    public void derivativeProductComplex(AsciiSequenceView view);
    public boolean derivFlexProductEligibilityIndicator();
    public boolean hasDerivFlexProductEligibilityIndicator();
    public char[] derivativeSecurityGroup();
    public boolean hasDerivativeSecurityGroup();
    public int derivativeSecurityGroupLength();
    public void derivativeSecurityGroup(AsciiSequenceView view);
    public char[] derivativeCFICode();
    public boolean hasDerivativeCFICode();
    public int derivativeCFICodeLength();
    public void derivativeCFICode(AsciiSequenceView view);
    public char[] derivativeSecurityType();
    public boolean hasDerivativeSecurityType();
    public int derivativeSecurityTypeLength();
    public void derivativeSecurityType(AsciiSequenceView view);
    public char[] derivativeSecuritySubType();
    public boolean hasDerivativeSecuritySubType();
    public int derivativeSecuritySubTypeLength();
    public void derivativeSecuritySubType(AsciiSequenceView view);
    public byte[] derivativeMaturityMonthYear();
    public boolean hasDerivativeMaturityMonthYear();
    public int derivativeMaturityMonthYearLength();
    public void derivativeMaturityMonthYear(AsciiSequenceView view);
    public byte[] derivativeMaturityDate();
    public boolean hasDerivativeMaturityDate();
    public int derivativeMaturityDateLength();
    public void derivativeMaturityDate(AsciiSequenceView view);
    public byte[] derivativeMaturityTime();
    public boolean hasDerivativeMaturityTime();
    public int derivativeMaturityTimeLength();
    public void derivativeMaturityTime(AsciiSequenceView view);
    public char[] derivativeSettleOnOpenFlag();
    public boolean hasDerivativeSettleOnOpenFlag();
    public int derivativeSettleOnOpenFlagLength();
    public void derivativeSettleOnOpenFlag(AsciiSequenceView view);
    public char derivativeInstrmtAssignmentMethod();
    public boolean hasDerivativeInstrmtAssignmentMethod();
    public char[] derivativeSecurityStatus();
    public boolean hasDerivativeSecurityStatus();
    public int derivativeSecurityStatusLength();
    public void derivativeSecurityStatus(AsciiSequenceView view);
    public byte[] derivativeIssueDate();
    public boolean hasDerivativeIssueDate();
    public int derivativeIssueDateLength();
    public void derivativeIssueDate(AsciiSequenceView view);
    public char[] derivativeInstrRegistry();
    public boolean hasDerivativeInstrRegistry();
    public int derivativeInstrRegistryLength();
    public void derivativeInstrRegistry(AsciiSequenceView view);
    public char[] derivativeCountryOfIssue();
    public boolean hasDerivativeCountryOfIssue();
    public int derivativeCountryOfIssueLength();
    public void derivativeCountryOfIssue(AsciiSequenceView view);
    public char[] derivativeStateOrProvinceOfIssue();
    public boolean hasDerivativeStateOrProvinceOfIssue();
    public int derivativeStateOrProvinceOfIssueLength();
    public void derivativeStateOrProvinceOfIssue(AsciiSequenceView view);
    public char[] derivativeLocaleOfIssue();
    public boolean hasDerivativeLocaleOfIssue();
    public int derivativeLocaleOfIssueLength();
    public void derivativeLocaleOfIssue(AsciiSequenceView view);
    public DecimalFloat derivativeStrikePrice();
    public boolean hasDerivativeStrikePrice();
    public char[] derivativeStrikeCurrency();
    public boolean hasDerivativeStrikeCurrency();
    public int derivativeStrikeCurrencyLength();
    public void derivativeStrikeCurrency(AsciiSequenceView view);
    public DecimalFloat derivativeStrikeMultiplier();
    public boolean hasDerivativeStrikeMultiplier();
    public DecimalFloat derivativeStrikeValue();
    public boolean hasDerivativeStrikeValue();
    public char derivativeOptAttribute();
    public boolean hasDerivativeOptAttribute();
    public DecimalFloat derivativeContractMultiplier();
    public boolean hasDerivativeContractMultiplier();
    public int derivativeContractMultiplierUnit();
    public boolean hasDerivativeContractMultiplierUnit();
    public int derivativeFlowScheduleType();
    public boolean hasDerivativeFlowScheduleType();
    public DecimalFloat derivativeMinPriceIncrement();
    public boolean hasDerivativeMinPriceIncrement();
    public DecimalFloat derivativeMinPriceIncrementAmount();
    public boolean hasDerivativeMinPriceIncrementAmount();
    public char[] derivativeUnitOfMeasure();
    public boolean hasDerivativeUnitOfMeasure();
    public int derivativeUnitOfMeasureLength();
    public void derivativeUnitOfMeasure(AsciiSequenceView view);
    public DecimalFloat derivativeUnitOfMeasureQty();
    public boolean hasDerivativeUnitOfMeasureQty();
    public char[] derivativePriceUnitOfMeasure();
    public boolean hasDerivativePriceUnitOfMeasure();
    public int derivativePriceUnitOfMeasureLength();
    public void derivativePriceUnitOfMeasure(AsciiSequenceView view);
    public DecimalFloat derivativePriceUnitOfMeasureQty();
    public boolean hasDerivativePriceUnitOfMeasureQty();
    public char derivativeSettlMethod();
    public boolean hasDerivativeSettlMethod();
    public char[] derivativePriceQuoteMethod();
    public boolean hasDerivativePriceQuoteMethod();
    public int derivativePriceQuoteMethodLength();
    public void derivativePriceQuoteMethod(AsciiSequenceView view);
    public char[] derivativeValuationMethod();
    public boolean hasDerivativeValuationMethod();
    public int derivativeValuationMethodLength();
    public void derivativeValuationMethod(AsciiSequenceView view);
    public int derivativeListMethod();
    public boolean hasDerivativeListMethod();
    public DecimalFloat derivativeCapPrice();
    public boolean hasDerivativeCapPrice();
    public DecimalFloat derivativeFloorPrice();
    public boolean hasDerivativeFloorPrice();
    public int derivativePutOrCall();
    public boolean hasDerivativePutOrCall();
    public char derivativeExerciseStyle();
    public boolean hasDerivativeExerciseStyle();
    public DecimalFloat derivativeOptPayAmount();
    public boolean hasDerivativeOptPayAmount();
    public char[] derivativeTimeUnit();
    public boolean hasDerivativeTimeUnit();
    public int derivativeTimeUnitLength();
    public void derivativeTimeUnit(AsciiSequenceView view);
    public char[] derivativeSecurityExchange();
    public boolean hasDerivativeSecurityExchange();
    public int derivativeSecurityExchangeLength();
    public void derivativeSecurityExchange(AsciiSequenceView view);
    public int derivativePositionLimit();
    public boolean hasDerivativePositionLimit();
    public int derivativeNTPositionLimit();
    public boolean hasDerivativeNTPositionLimit();
    public char[] derivativeIssuer();
    public boolean hasDerivativeIssuer();
    public int derivativeIssuerLength();
    public void derivativeIssuer(AsciiSequenceView view);
    public int derivativeEncodedIssuerLen();
    public boolean hasDerivativeEncodedIssuerLen();
    public byte[] derivativeEncodedIssuer();
    public boolean hasDerivativeEncodedIssuer();
    public char[] derivativeSecurityDesc();
    public boolean hasDerivativeSecurityDesc();
    public int derivativeSecurityDescLength();
    public void derivativeSecurityDesc(AsciiSequenceView view);
    public int derivativeEncodedSecurityDescLen();
    public boolean hasDerivativeEncodedSecurityDescLen();
    public byte[] derivativeEncodedSecurityDesc();
    public boolean hasDerivativeEncodedSecurityDesc();
    public byte[] derivativeContractSettlMonth();
    public boolean hasDerivativeContractSettlMonth();
    public int derivativeContractSettlMonthLength();
    public void derivativeContractSettlMonth(AsciiSequenceView view);

}
