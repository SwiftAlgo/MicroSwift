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
import com.swiftalgo.ms.codecs.fix50sp2.builder.YieldDataEncoder;

public interface YieldDataDecoder 
{

    public char[] yieldType();
    public boolean hasYieldType();
    public int yieldTypeLength();
    public YieldType yieldTypeAsEnum();
    public void yieldType(AsciiSequenceView view);
    public DecimalFloat yield();
    public boolean hasYield();
    public byte[] yieldCalcDate();
    public boolean hasYieldCalcDate();
    public int yieldCalcDateLength();
    public void yieldCalcDate(AsciiSequenceView view);
    public byte[] yieldRedemptionDate();
    public boolean hasYieldRedemptionDate();
    public int yieldRedemptionDateLength();
    public void yieldRedemptionDate(AsciiSequenceView view);
    public DecimalFloat yieldRedemptionPrice();
    public boolean hasYieldRedemptionPrice();
    public int yieldRedemptionPriceType();
    public boolean hasYieldRedemptionPriceType();

}
