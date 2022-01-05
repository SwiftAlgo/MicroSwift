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
import com.swiftalgo.ms.codecs.fix44.builder.DiscretionInstructionsEncoder;

public interface DiscretionInstructionsDecoder 
{

    public char discretionInst();
    public boolean hasDiscretionInst();
    public DiscretionInst discretionInstAsEnum();
    public DecimalFloat discretionOffsetValue();
    public boolean hasDiscretionOffsetValue();
    public int discretionMoveType();
    public boolean hasDiscretionMoveType();
    public DiscretionMoveType discretionMoveTypeAsEnum();
    public int discretionOffsetType();
    public boolean hasDiscretionOffsetType();
    public DiscretionOffsetType discretionOffsetTypeAsEnum();
    public int discretionLimitType();
    public boolean hasDiscretionLimitType();
    public DiscretionLimitType discretionLimitTypeAsEnum();
    public int discretionRoundDirection();
    public boolean hasDiscretionRoundDirection();
    public DiscretionRoundDirection discretionRoundDirectionAsEnum();
    public int discretionScope();
    public boolean hasDiscretionScope();
    public DiscretionScope discretionScopeAsEnum();

}
