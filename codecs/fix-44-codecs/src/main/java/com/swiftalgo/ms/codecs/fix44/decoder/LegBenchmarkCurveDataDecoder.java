/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

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
import com.swiftalgo.ms.codecs.fix44.*;
import com.swiftalgo.ms.codecs.fix44.builder.LegBenchmarkCurveDataEncoder;

public interface LegBenchmarkCurveDataDecoder 
{

    public char[] legBenchmarkCurveCurrency();
    public boolean hasLegBenchmarkCurveCurrency();
    public int legBenchmarkCurveCurrencyLength();
    public void legBenchmarkCurveCurrency(AsciiSequenceView view);
    public char[] legBenchmarkCurveName();
    public boolean hasLegBenchmarkCurveName();
    public int legBenchmarkCurveNameLength();
    public void legBenchmarkCurveName(AsciiSequenceView view);
    public char[] legBenchmarkCurvePoint();
    public boolean hasLegBenchmarkCurvePoint();
    public int legBenchmarkCurvePointLength();
    public void legBenchmarkCurvePoint(AsciiSequenceView view);
    public DecimalFloat legBenchmarkPrice();
    public boolean hasLegBenchmarkPrice();
    public int legBenchmarkPriceType();
    public boolean hasLegBenchmarkPriceType();

}
