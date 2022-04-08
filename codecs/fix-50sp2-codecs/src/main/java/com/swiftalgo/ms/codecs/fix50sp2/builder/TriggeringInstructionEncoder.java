/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.builder;

import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Encoder;
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
import org.agrona.DirectBuffer;
import org.agrona.MutableDirectBuffer;
import org.agrona.concurrent.UnsafeBuffer;
import org.agrona.AsciiSequenceView;
import static java.nio.charset.StandardCharsets.US_ASCII;
import static uk.co.real_logic.artio.builder.Validation.CODEC_VALIDATION_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownField.CODEC_REJECT_UNKNOWN_FIELD_ENABLED;
import static uk.co.real_logic.artio.builder.RejectUnknownEnumValue.CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED;
import com.swiftalgo.ms.codecs.fix50sp2.*;


public class TriggeringInstructionEncoder
{
    private static final int triggerTypeHeaderLength = 5;
    private static final byte[] triggerTypeHeader = new byte[] {49, 49, 48, 48, (byte) '='};

    private static final int triggerActionHeaderLength = 5;
    private static final byte[] triggerActionHeader = new byte[] {49, 49, 48, 49, (byte) '='};

    private static final int triggerPriceHeaderLength = 5;
    private static final byte[] triggerPriceHeader = new byte[] {49, 49, 48, 50, (byte) '='};

    private static final int triggerSymbolHeaderLength = 5;
    private static final byte[] triggerSymbolHeader = new byte[] {49, 49, 48, 51, (byte) '='};

    private static final int triggerSecurityIDHeaderLength = 5;
    private static final byte[] triggerSecurityIDHeader = new byte[] {49, 49, 48, 52, (byte) '='};

    private static final int triggerSecurityIDSourceHeaderLength = 5;
    private static final byte[] triggerSecurityIDSourceHeader = new byte[] {49, 49, 48, 53, (byte) '='};

    private static final int triggerSecurityDescHeaderLength = 5;
    private static final byte[] triggerSecurityDescHeader = new byte[] {49, 49, 48, 54, (byte) '='};

    private static final int triggerPriceTypeHeaderLength = 5;
    private static final byte[] triggerPriceTypeHeader = new byte[] {49, 49, 48, 55, (byte) '='};

    private static final int triggerPriceTypeScopeHeaderLength = 5;
    private static final byte[] triggerPriceTypeScopeHeader = new byte[] {49, 49, 48, 56, (byte) '='};

    private static final int triggerPriceDirectionHeaderLength = 5;
    private static final byte[] triggerPriceDirectionHeader = new byte[] {49, 49, 48, 57, (byte) '='};

    private static final int triggerNewPriceHeaderLength = 5;
    private static final byte[] triggerNewPriceHeader = new byte[] {49, 49, 49, 48, (byte) '='};

    private static final int triggerOrderTypeHeaderLength = 5;
    private static final byte[] triggerOrderTypeHeader = new byte[] {49, 49, 49, 49, (byte) '='};

    private static final int triggerNewQtyHeaderLength = 5;
    private static final byte[] triggerNewQtyHeader = new byte[] {49, 49, 49, 50, (byte) '='};

    private static final int triggerTradingSessionIDHeaderLength = 5;
    private static final byte[] triggerTradingSessionIDHeader = new byte[] {49, 49, 49, 51, (byte) '='};

    private static final int triggerTradingSessionSubIDHeaderLength = 5;
    private static final byte[] triggerTradingSessionSubIDHeader = new byte[] {49, 49, 49, 52, (byte) '='};

    private char triggerType;

    private boolean hasTriggerType;

    public boolean hasTriggerType()
    {
        return hasTriggerType;
    }

    public TriggeringInstructionEncoder triggerType(char value)
    {
        triggerType = value;
        hasTriggerType = true;
        return this;
    }

    public char triggerType()
    {
        return triggerType;
    }

    public TriggeringInstructionEncoder triggerType(TriggerType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerType Value: " + value );
            }
            if (value == TriggerType.NULL_VAL)
            {
                return this;
            }
        }
        return triggerType(value.representation());
    }

    private char triggerAction;

    private boolean hasTriggerAction;

    public boolean hasTriggerAction()
    {
        return hasTriggerAction;
    }

    public TriggeringInstructionEncoder triggerAction(char value)
    {
        triggerAction = value;
        hasTriggerAction = true;
        return this;
    }

    public char triggerAction()
    {
        return triggerAction;
    }

    public TriggeringInstructionEncoder triggerAction(TriggerAction value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerAction.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerAction Value: " + value );
            }
            if (value == TriggerAction.NULL_VAL)
            {
                return this;
            }
        }
        return triggerAction(value.representation());
    }

    private final DecimalFloat triggerPrice = new DecimalFloat();

    private boolean hasTriggerPrice;

    public boolean hasTriggerPrice()
    {
        return hasTriggerPrice;
    }

    public TriggeringInstructionEncoder triggerPrice(DecimalFloat value)
    {
        triggerPrice.set(value);
        hasTriggerPrice = true;
        return this;
    }

    public TriggeringInstructionEncoder triggerPrice(long value, int scale)
    {
        triggerPrice.set(value, scale);
        hasTriggerPrice = true;
        return this;
    }

    public DecimalFloat triggerPrice()
    {
        return triggerPrice;
    }

    private final MutableDirectBuffer triggerSymbol = new UnsafeBuffer();

    private int triggerSymbolOffset = 0;

    private int triggerSymbolLength = 0;

    public TriggeringInstructionEncoder triggerSymbol(final DirectBuffer value, final int offset, final int length)
    {
        triggerSymbol.wrap(value);
        triggerSymbolOffset = offset;
        triggerSymbolLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSymbol(final DirectBuffer value, final int length)
    {
        return triggerSymbol(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSymbol(final DirectBuffer value)
    {
        return triggerSymbol(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerSymbol(final byte[] value, final int offset, final int length)
    {
        triggerSymbol.wrap(value);
        triggerSymbolOffset = offset;
        triggerSymbolLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSymbolAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerSymbol, value, offset, length);
        triggerSymbolOffset = offset;
        triggerSymbolLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSymbol(final byte[] value, final int length)
    {
        return triggerSymbol(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSymbol(final byte[] value)
    {
        return triggerSymbol(value, 0, value.length);
    }

    public boolean hasTriggerSymbol()
    {
        return triggerSymbolLength > 0;
    }

    public MutableDirectBuffer triggerSymbol()
    {
        return triggerSymbol;
    }

    public String triggerSymbolAsString()
    {
        return triggerSymbol.getStringWithoutLengthAscii(triggerSymbolOffset, triggerSymbolLength);
    }

    public TriggeringInstructionEncoder triggerSymbol(final CharSequence value)
    {
        toBytes(value, triggerSymbol);
        triggerSymbolOffset = 0;
        triggerSymbolLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerSymbol(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerSymbol.wrap(buffer);
            triggerSymbolOffset = value.offset();
            triggerSymbolLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerSymbol(final char[] value)
    {
        return triggerSymbol(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerSymbol(final char[] value, final int length)
    {
        return triggerSymbol(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSymbol(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerSymbol, offset, length);
        triggerSymbolOffset = 0;
        triggerSymbolLength = length;
        return this;
    }

    private final MutableDirectBuffer triggerSecurityID = new UnsafeBuffer();

    private int triggerSecurityIDOffset = 0;

    private int triggerSecurityIDLength = 0;

    public TriggeringInstructionEncoder triggerSecurityID(final DirectBuffer value, final int offset, final int length)
    {
        triggerSecurityID.wrap(value);
        triggerSecurityIDOffset = offset;
        triggerSecurityIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityID(final DirectBuffer value, final int length)
    {
        return triggerSecurityID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityID(final DirectBuffer value)
    {
        return triggerSecurityID(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerSecurityID(final byte[] value, final int offset, final int length)
    {
        triggerSecurityID.wrap(value);
        triggerSecurityIDOffset = offset;
        triggerSecurityIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerSecurityID, value, offset, length);
        triggerSecurityIDOffset = offset;
        triggerSecurityIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityID(final byte[] value, final int length)
    {
        return triggerSecurityID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityID(final byte[] value)
    {
        return triggerSecurityID(value, 0, value.length);
    }

    public boolean hasTriggerSecurityID()
    {
        return triggerSecurityIDLength > 0;
    }

    public MutableDirectBuffer triggerSecurityID()
    {
        return triggerSecurityID;
    }

    public String triggerSecurityIDAsString()
    {
        return triggerSecurityID.getStringWithoutLengthAscii(triggerSecurityIDOffset, triggerSecurityIDLength);
    }

    public TriggeringInstructionEncoder triggerSecurityID(final CharSequence value)
    {
        toBytes(value, triggerSecurityID);
        triggerSecurityIDOffset = 0;
        triggerSecurityIDLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerSecurityID.wrap(buffer);
            triggerSecurityIDOffset = value.offset();
            triggerSecurityIDLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityID(final char[] value)
    {
        return triggerSecurityID(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerSecurityID(final char[] value, final int length)
    {
        return triggerSecurityID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityID(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerSecurityID, offset, length);
        triggerSecurityIDOffset = 0;
        triggerSecurityIDLength = length;
        return this;
    }

    private final MutableDirectBuffer triggerSecurityIDSource = new UnsafeBuffer();

    private int triggerSecurityIDSourceOffset = 0;

    private int triggerSecurityIDSourceLength = 0;

    public TriggeringInstructionEncoder triggerSecurityIDSource(final DirectBuffer value, final int offset, final int length)
    {
        triggerSecurityIDSource.wrap(value);
        triggerSecurityIDSourceOffset = offset;
        triggerSecurityIDSourceLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final DirectBuffer value, final int length)
    {
        return triggerSecurityIDSource(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final DirectBuffer value)
    {
        return triggerSecurityIDSource(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final byte[] value, final int offset, final int length)
    {
        triggerSecurityIDSource.wrap(value);
        triggerSecurityIDSourceOffset = offset;
        triggerSecurityIDSourceLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDSourceAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerSecurityIDSource, value, offset, length);
        triggerSecurityIDSourceOffset = offset;
        triggerSecurityIDSourceLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final byte[] value, final int length)
    {
        return triggerSecurityIDSource(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final byte[] value)
    {
        return triggerSecurityIDSource(value, 0, value.length);
    }

    public boolean hasTriggerSecurityIDSource()
    {
        return triggerSecurityIDSourceLength > 0;
    }

    public MutableDirectBuffer triggerSecurityIDSource()
    {
        return triggerSecurityIDSource;
    }

    public String triggerSecurityIDSourceAsString()
    {
        return triggerSecurityIDSource.getStringWithoutLengthAscii(triggerSecurityIDSourceOffset, triggerSecurityIDSourceLength);
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final CharSequence value)
    {
        toBytes(value, triggerSecurityIDSource);
        triggerSecurityIDSourceOffset = 0;
        triggerSecurityIDSourceLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerSecurityIDSource.wrap(buffer);
            triggerSecurityIDSourceOffset = value.offset();
            triggerSecurityIDSourceLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final char[] value)
    {
        return triggerSecurityIDSource(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final char[] value, final int length)
    {
        return triggerSecurityIDSource(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityIDSource(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerSecurityIDSource, offset, length);
        triggerSecurityIDSourceOffset = 0;
        triggerSecurityIDSourceLength = length;
        return this;
    }

    private final MutableDirectBuffer triggerSecurityDesc = new UnsafeBuffer();

    private int triggerSecurityDescOffset = 0;

    private int triggerSecurityDescLength = 0;

    public TriggeringInstructionEncoder triggerSecurityDesc(final DirectBuffer value, final int offset, final int length)
    {
        triggerSecurityDesc.wrap(value);
        triggerSecurityDescOffset = offset;
        triggerSecurityDescLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final DirectBuffer value, final int length)
    {
        return triggerSecurityDesc(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final DirectBuffer value)
    {
        return triggerSecurityDesc(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final byte[] value, final int offset, final int length)
    {
        triggerSecurityDesc.wrap(value);
        triggerSecurityDescOffset = offset;
        triggerSecurityDescLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityDescAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerSecurityDesc, value, offset, length);
        triggerSecurityDescOffset = offset;
        triggerSecurityDescLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final byte[] value, final int length)
    {
        return triggerSecurityDesc(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final byte[] value)
    {
        return triggerSecurityDesc(value, 0, value.length);
    }

    public boolean hasTriggerSecurityDesc()
    {
        return triggerSecurityDescLength > 0;
    }

    public MutableDirectBuffer triggerSecurityDesc()
    {
        return triggerSecurityDesc;
    }

    public String triggerSecurityDescAsString()
    {
        return triggerSecurityDesc.getStringWithoutLengthAscii(triggerSecurityDescOffset, triggerSecurityDescLength);
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final CharSequence value)
    {
        toBytes(value, triggerSecurityDesc);
        triggerSecurityDescOffset = 0;
        triggerSecurityDescLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerSecurityDesc.wrap(buffer);
            triggerSecurityDescOffset = value.offset();
            triggerSecurityDescLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final char[] value)
    {
        return triggerSecurityDesc(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final char[] value, final int length)
    {
        return triggerSecurityDesc(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerSecurityDesc(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerSecurityDesc, offset, length);
        triggerSecurityDescOffset = 0;
        triggerSecurityDescLength = length;
        return this;
    }

    private char triggerPriceType;

    private boolean hasTriggerPriceType;

    public boolean hasTriggerPriceType()
    {
        return hasTriggerPriceType;
    }

    public TriggeringInstructionEncoder triggerPriceType(char value)
    {
        triggerPriceType = value;
        hasTriggerPriceType = true;
        return this;
    }

    public char triggerPriceType()
    {
        return triggerPriceType;
    }

    public TriggeringInstructionEncoder triggerPriceType(TriggerPriceType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerPriceType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerPriceType Value: " + value );
            }
            if (value == TriggerPriceType.NULL_VAL)
            {
                return this;
            }
        }
        return triggerPriceType(value.representation());
    }

    private char triggerPriceTypeScope;

    private boolean hasTriggerPriceTypeScope;

    public boolean hasTriggerPriceTypeScope()
    {
        return hasTriggerPriceTypeScope;
    }

    public TriggeringInstructionEncoder triggerPriceTypeScope(char value)
    {
        triggerPriceTypeScope = value;
        hasTriggerPriceTypeScope = true;
        return this;
    }

    public char triggerPriceTypeScope()
    {
        return triggerPriceTypeScope;
    }

    public TriggeringInstructionEncoder triggerPriceTypeScope(TriggerPriceTypeScope value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerPriceTypeScope.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerPriceTypeScope Value: " + value );
            }
            if (value == TriggerPriceTypeScope.NULL_VAL)
            {
                return this;
            }
        }
        return triggerPriceTypeScope(value.representation());
    }

    private char triggerPriceDirection;

    private boolean hasTriggerPriceDirection;

    public boolean hasTriggerPriceDirection()
    {
        return hasTriggerPriceDirection;
    }

    public TriggeringInstructionEncoder triggerPriceDirection(char value)
    {
        triggerPriceDirection = value;
        hasTriggerPriceDirection = true;
        return this;
    }

    public char triggerPriceDirection()
    {
        return triggerPriceDirection;
    }

    public TriggeringInstructionEncoder triggerPriceDirection(TriggerPriceDirection value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerPriceDirection.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerPriceDirection Value: " + value );
            }
            if (value == TriggerPriceDirection.NULL_VAL)
            {
                return this;
            }
        }
        return triggerPriceDirection(value.representation());
    }

    private final DecimalFloat triggerNewPrice = new DecimalFloat();

    private boolean hasTriggerNewPrice;

    public boolean hasTriggerNewPrice()
    {
        return hasTriggerNewPrice;
    }

    public TriggeringInstructionEncoder triggerNewPrice(DecimalFloat value)
    {
        triggerNewPrice.set(value);
        hasTriggerNewPrice = true;
        return this;
    }

    public TriggeringInstructionEncoder triggerNewPrice(long value, int scale)
    {
        triggerNewPrice.set(value, scale);
        hasTriggerNewPrice = true;
        return this;
    }

    public DecimalFloat triggerNewPrice()
    {
        return triggerNewPrice;
    }

    private char triggerOrderType;

    private boolean hasTriggerOrderType;

    public boolean hasTriggerOrderType()
    {
        return hasTriggerOrderType;
    }

    public TriggeringInstructionEncoder triggerOrderType(char value)
    {
        triggerOrderType = value;
        hasTriggerOrderType = true;
        return this;
    }

    public char triggerOrderType()
    {
        return triggerOrderType;
    }

    public TriggeringInstructionEncoder triggerOrderType(TriggerOrderType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TriggerOrderType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: triggerOrderType Value: " + value );
            }
            if (value == TriggerOrderType.NULL_VAL)
            {
                return this;
            }
        }
        return triggerOrderType(value.representation());
    }

    private final DecimalFloat triggerNewQty = new DecimalFloat();

    private boolean hasTriggerNewQty;

    public boolean hasTriggerNewQty()
    {
        return hasTriggerNewQty;
    }

    public TriggeringInstructionEncoder triggerNewQty(DecimalFloat value)
    {
        triggerNewQty.set(value);
        hasTriggerNewQty = true;
        return this;
    }

    public TriggeringInstructionEncoder triggerNewQty(long value, int scale)
    {
        triggerNewQty.set(value, scale);
        hasTriggerNewQty = true;
        return this;
    }

    public DecimalFloat triggerNewQty()
    {
        return triggerNewQty;
    }

    private final MutableDirectBuffer triggerTradingSessionID = new UnsafeBuffer();

    private int triggerTradingSessionIDOffset = 0;

    private int triggerTradingSessionIDLength = 0;

    public TriggeringInstructionEncoder triggerTradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        triggerTradingSessionID.wrap(value);
        triggerTradingSessionIDOffset = offset;
        triggerTradingSessionIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final DirectBuffer value, final int length)
    {
        return triggerTradingSessionID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final DirectBuffer value)
    {
        return triggerTradingSessionID(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final byte[] value, final int offset, final int length)
    {
        triggerTradingSessionID.wrap(value);
        triggerTradingSessionIDOffset = offset;
        triggerTradingSessionIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerTradingSessionID, value, offset, length);
        triggerTradingSessionIDOffset = offset;
        triggerTradingSessionIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final byte[] value, final int length)
    {
        return triggerTradingSessionID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final byte[] value)
    {
        return triggerTradingSessionID(value, 0, value.length);
    }

    public boolean hasTriggerTradingSessionID()
    {
        return triggerTradingSessionIDLength > 0;
    }

    public MutableDirectBuffer triggerTradingSessionID()
    {
        return triggerTradingSessionID;
    }

    public String triggerTradingSessionIDAsString()
    {
        return triggerTradingSessionID.getStringWithoutLengthAscii(triggerTradingSessionIDOffset, triggerTradingSessionIDLength);
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final CharSequence value)
    {
        toBytes(value, triggerTradingSessionID);
        triggerTradingSessionIDOffset = 0;
        triggerTradingSessionIDLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerTradingSessionID.wrap(buffer);
            triggerTradingSessionIDOffset = value.offset();
            triggerTradingSessionIDLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final char[] value)
    {
        return triggerTradingSessionID(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final char[] value, final int length)
    {
        return triggerTradingSessionID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerTradingSessionID, offset, length);
        triggerTradingSessionIDOffset = 0;
        triggerTradingSessionIDLength = length;
        return this;
    }

    private final MutableDirectBuffer triggerTradingSessionSubID = new UnsafeBuffer();

    private int triggerTradingSessionSubIDOffset = 0;

    private int triggerTradingSessionSubIDLength = 0;

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        triggerTradingSessionSubID.wrap(value);
        triggerTradingSessionSubIDOffset = offset;
        triggerTradingSessionSubIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final DirectBuffer value, final int length)
    {
        return triggerTradingSessionSubID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final DirectBuffer value)
    {
        return triggerTradingSessionSubID(value, 0, value.capacity());
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        triggerTradingSessionSubID.wrap(value);
        triggerTradingSessionSubIDOffset = offset;
        triggerTradingSessionSubIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(triggerTradingSessionSubID, value, offset, length);
        triggerTradingSessionSubIDOffset = offset;
        triggerTradingSessionSubIDLength = length;
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final byte[] value, final int length)
    {
        return triggerTradingSessionSubID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final byte[] value)
    {
        return triggerTradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTriggerTradingSessionSubID()
    {
        return triggerTradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer triggerTradingSessionSubID()
    {
        return triggerTradingSessionSubID;
    }

    public String triggerTradingSessionSubIDAsString()
    {
        return triggerTradingSessionSubID.getStringWithoutLengthAscii(triggerTradingSessionSubIDOffset, triggerTradingSessionSubIDLength);
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final CharSequence value)
    {
        toBytes(value, triggerTradingSessionSubID);
        triggerTradingSessionSubIDOffset = 0;
        triggerTradingSessionSubIDLength = value.length();
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            triggerTradingSessionSubID.wrap(buffer);
            triggerTradingSessionSubIDOffset = value.offset();
            triggerTradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final char[] value)
    {
        return triggerTradingSessionSubID(value, 0, value.length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final char[] value, final int length)
    {
        return triggerTradingSessionSubID(value, 0, length);
    }

    public TriggeringInstructionEncoder triggerTradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, triggerTradingSessionSubID, offset, length);
        triggerTradingSessionSubIDOffset = 0;
        triggerTradingSessionSubIDLength = length;
        return this;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasTriggerType)
        {
            buffer.putBytes(position, triggerTypeHeader, 0, triggerTypeHeaderLength);
            position += triggerTypeHeaderLength;
            position += buffer.putCharAscii(position, triggerType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerAction)
        {
            buffer.putBytes(position, triggerActionHeader, 0, triggerActionHeaderLength);
            position += triggerActionHeaderLength;
            position += buffer.putCharAscii(position, triggerAction);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerPrice)
        {
            buffer.putBytes(position, triggerPriceHeader, 0, triggerPriceHeaderLength);
            position += triggerPriceHeaderLength;
            position += buffer.putFloatAscii(position, triggerPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (triggerSymbolLength > 0)
        {
            buffer.putBytes(position, triggerSymbolHeader, 0, triggerSymbolHeaderLength);
            position += triggerSymbolHeaderLength;
            buffer.putBytes(position, triggerSymbol, triggerSymbolOffset, triggerSymbolLength);
            position += triggerSymbolLength;
            buffer.putSeparator(position);
            position++;
        }

        if (triggerSecurityIDLength > 0)
        {
            buffer.putBytes(position, triggerSecurityIDHeader, 0, triggerSecurityIDHeaderLength);
            position += triggerSecurityIDHeaderLength;
            buffer.putBytes(position, triggerSecurityID, triggerSecurityIDOffset, triggerSecurityIDLength);
            position += triggerSecurityIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (triggerSecurityIDSourceLength > 0)
        {
            buffer.putBytes(position, triggerSecurityIDSourceHeader, 0, triggerSecurityIDSourceHeaderLength);
            position += triggerSecurityIDSourceHeaderLength;
            buffer.putBytes(position, triggerSecurityIDSource, triggerSecurityIDSourceOffset, triggerSecurityIDSourceLength);
            position += triggerSecurityIDSourceLength;
            buffer.putSeparator(position);
            position++;
        }

        if (triggerSecurityDescLength > 0)
        {
            buffer.putBytes(position, triggerSecurityDescHeader, 0, triggerSecurityDescHeaderLength);
            position += triggerSecurityDescHeaderLength;
            buffer.putBytes(position, triggerSecurityDesc, triggerSecurityDescOffset, triggerSecurityDescLength);
            position += triggerSecurityDescLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerPriceType)
        {
            buffer.putBytes(position, triggerPriceTypeHeader, 0, triggerPriceTypeHeaderLength);
            position += triggerPriceTypeHeaderLength;
            position += buffer.putCharAscii(position, triggerPriceType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerPriceTypeScope)
        {
            buffer.putBytes(position, triggerPriceTypeScopeHeader, 0, triggerPriceTypeScopeHeaderLength);
            position += triggerPriceTypeScopeHeaderLength;
            position += buffer.putCharAscii(position, triggerPriceTypeScope);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerPriceDirection)
        {
            buffer.putBytes(position, triggerPriceDirectionHeader, 0, triggerPriceDirectionHeaderLength);
            position += triggerPriceDirectionHeaderLength;
            position += buffer.putCharAscii(position, triggerPriceDirection);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerNewPrice)
        {
            buffer.putBytes(position, triggerNewPriceHeader, 0, triggerNewPriceHeaderLength);
            position += triggerNewPriceHeaderLength;
            position += buffer.putFloatAscii(position, triggerNewPrice);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerOrderType)
        {
            buffer.putBytes(position, triggerOrderTypeHeader, 0, triggerOrderTypeHeaderLength);
            position += triggerOrderTypeHeaderLength;
            position += buffer.putCharAscii(position, triggerOrderType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasTriggerNewQty)
        {
            buffer.putBytes(position, triggerNewQtyHeader, 0, triggerNewQtyHeaderLength);
            position += triggerNewQtyHeaderLength;
            position += buffer.putFloatAscii(position, triggerNewQty);
            buffer.putSeparator(position);
            position++;
        }

        if (triggerTradingSessionIDLength > 0)
        {
            buffer.putBytes(position, triggerTradingSessionIDHeader, 0, triggerTradingSessionIDHeaderLength);
            position += triggerTradingSessionIDHeaderLength;
            buffer.putBytes(position, triggerTradingSessionID, triggerTradingSessionIDOffset, triggerTradingSessionIDLength);
            position += triggerTradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (triggerTradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, triggerTradingSessionSubIDHeader, 0, triggerTradingSessionSubIDHeaderLength);
            position += triggerTradingSessionSubIDHeaderLength;
            buffer.putBytes(position, triggerTradingSessionSubID, triggerTradingSessionSubIDOffset, triggerTradingSessionSubIDLength);
            position += triggerTradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTriggerType();
        this.resetTriggerAction();
        this.resetTriggerPrice();
        this.resetTriggerSymbol();
        this.resetTriggerSecurityID();
        this.resetTriggerSecurityIDSource();
        this.resetTriggerSecurityDesc();
        this.resetTriggerPriceType();
        this.resetTriggerPriceTypeScope();
        this.resetTriggerPriceDirection();
        this.resetTriggerNewPrice();
        this.resetTriggerOrderType();
        this.resetTriggerNewQty();
        this.resetTriggerTradingSessionID();
        this.resetTriggerTradingSessionSubID();
    }

    public void resetTriggerType()
    {
        hasTriggerType = false;
    }

    public void resetTriggerAction()
    {
        hasTriggerAction = false;
    }

    public void resetTriggerPrice()
    {
        hasTriggerPrice = false;
    }

    public void resetTriggerSymbol()
    {
        triggerSymbolLength = 0;
    }

    public void resetTriggerSecurityID()
    {
        triggerSecurityIDLength = 0;
    }

    public void resetTriggerSecurityIDSource()
    {
        triggerSecurityIDSourceLength = 0;
    }

    public void resetTriggerSecurityDesc()
    {
        triggerSecurityDescLength = 0;
    }

    public void resetTriggerPriceType()
    {
        hasTriggerPriceType = false;
    }

    public void resetTriggerPriceTypeScope()
    {
        hasTriggerPriceTypeScope = false;
    }

    public void resetTriggerPriceDirection()
    {
        hasTriggerPriceDirection = false;
    }

    public void resetTriggerNewPrice()
    {
        hasTriggerNewPrice = false;
    }

    public void resetTriggerOrderType()
    {
        hasTriggerOrderType = false;
    }

    public void resetTriggerNewQty()
    {
        hasTriggerNewQty = false;
    }

    public void resetTriggerTradingSessionID()
    {
        triggerTradingSessionIDLength = 0;
    }

    public void resetTriggerTradingSessionSubID()
    {
        triggerTradingSessionSubIDLength = 0;
    }

    public String toString()
    {
        return appendTo(new StringBuilder()).toString();
    }

    public StringBuilder appendTo(final StringBuilder builder)
    {
        return appendTo(builder, 1);
    }

    public StringBuilder appendTo(final StringBuilder builder, final int level)
    {
        builder.append("{\n");        indent(builder, level);
        builder.append("\"MessageName\": \"TriggeringInstruction\",\n");
        if (hasTriggerType())
        {
            indent(builder, level);
            builder.append("\"TriggerType\": \"");
            builder.append(triggerType);
            builder.append("\",\n");
        }

        if (hasTriggerAction())
        {
            indent(builder, level);
            builder.append("\"TriggerAction\": \"");
            builder.append(triggerAction);
            builder.append("\",\n");
        }

        if (hasTriggerPrice())
        {
            indent(builder, level);
            builder.append("\"TriggerPrice\": \"");
            triggerPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerSymbol())
        {
            indent(builder, level);
            builder.append("\"TriggerSymbol\": \"");
            appendBuffer(builder, triggerSymbol, triggerSymbolOffset, triggerSymbolLength);
            builder.append("\",\n");
        }

        if (hasTriggerSecurityID())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityID\": \"");
            appendBuffer(builder, triggerSecurityID, triggerSecurityIDOffset, triggerSecurityIDLength);
            builder.append("\",\n");
        }

        if (hasTriggerSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityIDSource\": \"");
            appendBuffer(builder, triggerSecurityIDSource, triggerSecurityIDSourceOffset, triggerSecurityIDSourceLength);
            builder.append("\",\n");
        }

        if (hasTriggerSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"TriggerSecurityDesc\": \"");
            appendBuffer(builder, triggerSecurityDesc, triggerSecurityDescOffset, triggerSecurityDescLength);
            builder.append("\",\n");
        }

        if (hasTriggerPriceType())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceType\": \"");
            builder.append(triggerPriceType);
            builder.append("\",\n");
        }

        if (hasTriggerPriceTypeScope())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceTypeScope\": \"");
            builder.append(triggerPriceTypeScope);
            builder.append("\",\n");
        }

        if (hasTriggerPriceDirection())
        {
            indent(builder, level);
            builder.append("\"TriggerPriceDirection\": \"");
            builder.append(triggerPriceDirection);
            builder.append("\",\n");
        }

        if (hasTriggerNewPrice())
        {
            indent(builder, level);
            builder.append("\"TriggerNewPrice\": \"");
            triggerNewPrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerOrderType())
        {
            indent(builder, level);
            builder.append("\"TriggerOrderType\": \"");
            builder.append(triggerOrderType);
            builder.append("\",\n");
        }

        if (hasTriggerNewQty())
        {
            indent(builder, level);
            builder.append("\"TriggerNewQty\": \"");
            triggerNewQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasTriggerTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TriggerTradingSessionID\": \"");
            appendBuffer(builder, triggerTradingSessionID, triggerTradingSessionIDOffset, triggerTradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTriggerTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TriggerTradingSessionSubID\": \"");
            appendBuffer(builder, triggerTradingSessionSubID, triggerTradingSessionSubIDOffset, triggerTradingSessionSubIDLength);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public TriggeringInstructionEncoder copyTo(final Encoder encoder)
    {
        return copyTo((TriggeringInstructionEncoder)encoder);
    }

    public TriggeringInstructionEncoder copyTo(final TriggeringInstructionEncoder encoder)
    {
        encoder.reset();
        if (hasTriggerType())
        {
            encoder.triggerType(this.triggerType());
        }

        if (hasTriggerAction())
        {
            encoder.triggerAction(this.triggerAction());
        }

        if (hasTriggerPrice())
        {
            encoder.triggerPrice(this.triggerPrice());
        }

        if (hasTriggerSymbol())
        {
            encoder.triggerSymbolAsCopy(triggerSymbol.byteArray(), 0, triggerSymbolLength);
        }

        if (hasTriggerSecurityID())
        {
            encoder.triggerSecurityIDAsCopy(triggerSecurityID.byteArray(), 0, triggerSecurityIDLength);
        }

        if (hasTriggerSecurityIDSource())
        {
            encoder.triggerSecurityIDSourceAsCopy(triggerSecurityIDSource.byteArray(), 0, triggerSecurityIDSourceLength);
        }

        if (hasTriggerSecurityDesc())
        {
            encoder.triggerSecurityDescAsCopy(triggerSecurityDesc.byteArray(), 0, triggerSecurityDescLength);
        }

        if (hasTriggerPriceType())
        {
            encoder.triggerPriceType(this.triggerPriceType());
        }

        if (hasTriggerPriceTypeScope())
        {
            encoder.triggerPriceTypeScope(this.triggerPriceTypeScope());
        }

        if (hasTriggerPriceDirection())
        {
            encoder.triggerPriceDirection(this.triggerPriceDirection());
        }

        if (hasTriggerNewPrice())
        {
            encoder.triggerNewPrice(this.triggerNewPrice());
        }

        if (hasTriggerOrderType())
        {
            encoder.triggerOrderType(this.triggerOrderType());
        }

        if (hasTriggerNewQty())
        {
            encoder.triggerNewQty(this.triggerNewQty());
        }

        if (hasTriggerTradingSessionID())
        {
            encoder.triggerTradingSessionIDAsCopy(triggerTradingSessionID.byteArray(), 0, triggerTradingSessionIDLength);
        }

        if (hasTriggerTradingSessionSubID())
        {
            encoder.triggerTradingSessionSubIDAsCopy(triggerTradingSessionSubID.byteArray(), 0, triggerTradingSessionSubIDLength);
        }
        return encoder;
    }

}
