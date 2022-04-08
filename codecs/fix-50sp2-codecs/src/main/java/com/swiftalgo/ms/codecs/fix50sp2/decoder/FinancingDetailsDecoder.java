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
import com.swiftalgo.ms.codecs.fix50sp2.builder.FinancingDetailsEncoder;

public interface FinancingDetailsDecoder 
{

    public char[] agreementDesc();
    public boolean hasAgreementDesc();
    public int agreementDescLength();
    public void agreementDesc(AsciiSequenceView view);
    public char[] agreementID();
    public boolean hasAgreementID();
    public int agreementIDLength();
    public void agreementID(AsciiSequenceView view);
    public byte[] agreementDate();
    public boolean hasAgreementDate();
    public int agreementDateLength();
    public void agreementDate(AsciiSequenceView view);
    public char[] agreementCurrency();
    public boolean hasAgreementCurrency();
    public int agreementCurrencyLength();
    public void agreementCurrency(AsciiSequenceView view);
    public int terminationType();
    public boolean hasTerminationType();
    public TerminationType terminationTypeAsEnum();
    public byte[] startDate();
    public boolean hasStartDate();
    public int startDateLength();
    public void startDate(AsciiSequenceView view);
    public byte[] endDate();
    public boolean hasEndDate();
    public int endDateLength();
    public void endDate(AsciiSequenceView view);
    public int deliveryType();
    public boolean hasDeliveryType();
    public DeliveryType deliveryTypeAsEnum();
    public DecimalFloat marginRatio();
    public boolean hasMarginRatio();

}
