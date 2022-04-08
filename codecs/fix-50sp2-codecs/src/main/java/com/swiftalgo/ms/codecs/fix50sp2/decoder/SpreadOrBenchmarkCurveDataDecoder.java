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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SpreadOrBenchmarkCurveDataEncoder;

public interface SpreadOrBenchmarkCurveDataDecoder 
{

    public DecimalFloat spread();
    public boolean hasSpread();
    public char[] benchmarkCurveCurrency();
    public boolean hasBenchmarkCurveCurrency();
    public int benchmarkCurveCurrencyLength();
    public void benchmarkCurveCurrency(AsciiSequenceView view);
    public char[] benchmarkCurveName();
    public boolean hasBenchmarkCurveName();
    public int benchmarkCurveNameLength();
    public BenchmarkCurveName benchmarkCurveNameAsEnum();
    public void benchmarkCurveName(AsciiSequenceView view);
    public char[] benchmarkCurvePoint();
    public boolean hasBenchmarkCurvePoint();
    public int benchmarkCurvePointLength();
    public void benchmarkCurvePoint(AsciiSequenceView view);
    public DecimalFloat benchmarkPrice();
    public boolean hasBenchmarkPrice();
    public int benchmarkPriceType();
    public boolean hasBenchmarkPriceType();
    public char[] benchmarkSecurityID();
    public boolean hasBenchmarkSecurityID();
    public int benchmarkSecurityIDLength();
    public void benchmarkSecurityID(AsciiSequenceView view);
    public char[] benchmarkSecurityIDSource();
    public boolean hasBenchmarkSecurityIDSource();
    public int benchmarkSecurityIDSourceLength();
    public void benchmarkSecurityIDSource(AsciiSequenceView view);

}
