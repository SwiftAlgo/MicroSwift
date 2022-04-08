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
import com.swiftalgo.ms.codecs.fix50sp2.builder.PegInstructionsEncoder;

public interface PegInstructionsDecoder 
{

    public DecimalFloat pegOffsetValue();
    public boolean hasPegOffsetValue();
    public int pegPriceType();
    public boolean hasPegPriceType();
    public PegPriceType pegPriceTypeAsEnum();
    public int pegMoveType();
    public boolean hasPegMoveType();
    public PegMoveType pegMoveTypeAsEnum();
    public int pegOffsetType();
    public boolean hasPegOffsetType();
    public PegOffsetType pegOffsetTypeAsEnum();
    public int pegLimitType();
    public boolean hasPegLimitType();
    public PegLimitType pegLimitTypeAsEnum();
    public int pegRoundDirection();
    public boolean hasPegRoundDirection();
    public PegRoundDirection pegRoundDirectionAsEnum();
    public int pegScope();
    public boolean hasPegScope();
    public PegScope pegScopeAsEnum();
    public char[] pegSecurityIDSource();
    public boolean hasPegSecurityIDSource();
    public int pegSecurityIDSourceLength();
    public void pegSecurityIDSource(AsciiSequenceView view);
    public char[] pegSecurityID();
    public boolean hasPegSecurityID();
    public int pegSecurityIDLength();
    public void pegSecurityID(AsciiSequenceView view);
    public char[] pegSymbol();
    public boolean hasPegSymbol();
    public int pegSymbolLength();
    public void pegSymbol(AsciiSequenceView view);
    public char[] pegSecurityDesc();
    public boolean hasPegSecurityDesc();
    public int pegSecurityDescLength();
    public void pegSecurityDesc(AsciiSequenceView view);

}
