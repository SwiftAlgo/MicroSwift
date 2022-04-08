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
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlInstructionsDataEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.DlvyInstGrpEncoder.DlvyInstGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPartiesEncoder.SettlPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.SettlPtysSubGrpEncoder.SettlPartySubIDsGroupEncoder;

public interface SettlInstructionsDataDecoder  extends DlvyInstGrpDecoder
{

    public int settlDeliveryType();
    public boolean hasSettlDeliveryType();
    public SettlDeliveryType settlDeliveryTypeAsEnum();
    public int standInstDbType();
    public boolean hasStandInstDbType();
    public StandInstDbType standInstDbTypeAsEnum();
    public char[] standInstDbName();
    public boolean hasStandInstDbName();
    public int standInstDbNameLength();
    public void standInstDbName(AsciiSequenceView view);
    public char[] standInstDbID();
    public boolean hasStandInstDbID();
    public int standInstDbIDLength();
    public void standInstDbID(AsciiSequenceView view);

}
