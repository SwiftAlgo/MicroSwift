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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TriggeringInstructionEncoder;

public interface TriggeringInstructionDecoder 
{

    public char triggerType();
    public boolean hasTriggerType();
    public TriggerType triggerTypeAsEnum();
    public char triggerAction();
    public boolean hasTriggerAction();
    public TriggerAction triggerActionAsEnum();
    public DecimalFloat triggerPrice();
    public boolean hasTriggerPrice();
    public char[] triggerSymbol();
    public boolean hasTriggerSymbol();
    public int triggerSymbolLength();
    public void triggerSymbol(AsciiSequenceView view);
    public char[] triggerSecurityID();
    public boolean hasTriggerSecurityID();
    public int triggerSecurityIDLength();
    public void triggerSecurityID(AsciiSequenceView view);
    public char[] triggerSecurityIDSource();
    public boolean hasTriggerSecurityIDSource();
    public int triggerSecurityIDSourceLength();
    public void triggerSecurityIDSource(AsciiSequenceView view);
    public char[] triggerSecurityDesc();
    public boolean hasTriggerSecurityDesc();
    public int triggerSecurityDescLength();
    public void triggerSecurityDesc(AsciiSequenceView view);
    public char triggerPriceType();
    public boolean hasTriggerPriceType();
    public TriggerPriceType triggerPriceTypeAsEnum();
    public char triggerPriceTypeScope();
    public boolean hasTriggerPriceTypeScope();
    public TriggerPriceTypeScope triggerPriceTypeScopeAsEnum();
    public char triggerPriceDirection();
    public boolean hasTriggerPriceDirection();
    public TriggerPriceDirection triggerPriceDirectionAsEnum();
    public DecimalFloat triggerNewPrice();
    public boolean hasTriggerNewPrice();
    public char triggerOrderType();
    public boolean hasTriggerOrderType();
    public TriggerOrderType triggerOrderTypeAsEnum();
    public DecimalFloat triggerNewQty();
    public boolean hasTriggerNewQty();
    public char[] triggerTradingSessionID();
    public boolean hasTriggerTradingSessionID();
    public int triggerTradingSessionIDLength();
    public void triggerTradingSessionID(AsciiSequenceView view);
    public char[] triggerTradingSessionSubID();
    public boolean hasTriggerTradingSessionSubID();
    public int triggerTradingSessionSubIDLength();
    public void triggerTradingSessionSubID(AsciiSequenceView view);

}
