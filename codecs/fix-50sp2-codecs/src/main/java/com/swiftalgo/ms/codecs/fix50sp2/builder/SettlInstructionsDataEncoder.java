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


public class SettlInstructionsDataEncoder
{
    private static final int settlDeliveryTypeHeaderLength = 4;
    private static final byte[] settlDeliveryTypeHeader = new byte[] {49, 55, 50, (byte) '='};

    private static final int standInstDbTypeHeaderLength = 4;
    private static final byte[] standInstDbTypeHeader = new byte[] {49, 54, 57, (byte) '='};

    private static final int standInstDbNameHeaderLength = 4;
    private static final byte[] standInstDbNameHeader = new byte[] {49, 55, 48, (byte) '='};

    private static final int standInstDbIDHeaderLength = 4;
    private static final byte[] standInstDbIDHeader = new byte[] {49, 55, 49, (byte) '='};

    private int settlDeliveryType;

    private boolean hasSettlDeliveryType;

    public boolean hasSettlDeliveryType()
    {
        return hasSettlDeliveryType;
    }

    public SettlInstructionsDataEncoder settlDeliveryType(int value)
    {
        settlDeliveryType = value;
        hasSettlDeliveryType = true;
        return this;
    }

    public int settlDeliveryType()
    {
        return settlDeliveryType;
    }

    public SettlInstructionsDataEncoder settlDeliveryType(SettlDeliveryType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlDeliveryType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlDeliveryType Value: " + value );
            }
            if (value == SettlDeliveryType.NULL_VAL)
            {
                return this;
            }
        }
        return settlDeliveryType(value.representation());
    }

    private int standInstDbType;

    private boolean hasStandInstDbType;

    public boolean hasStandInstDbType()
    {
        return hasStandInstDbType;
    }

    public SettlInstructionsDataEncoder standInstDbType(int value)
    {
        standInstDbType = value;
        hasStandInstDbType = true;
        return this;
    }

    public int standInstDbType()
    {
        return standInstDbType;
    }

    public SettlInstructionsDataEncoder standInstDbType(StandInstDbType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == StandInstDbType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: standInstDbType Value: " + value );
            }
            if (value == StandInstDbType.NULL_VAL)
            {
                return this;
            }
        }
        return standInstDbType(value.representation());
    }

    private final MutableDirectBuffer standInstDbName = new UnsafeBuffer();

    private int standInstDbNameOffset = 0;

    private int standInstDbNameLength = 0;

    public SettlInstructionsDataEncoder standInstDbName(final DirectBuffer value, final int offset, final int length)
    {
        standInstDbName.wrap(value);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbName(final DirectBuffer value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbName(final DirectBuffer value)
    {
        return standInstDbName(value, 0, value.capacity());
    }

    public SettlInstructionsDataEncoder standInstDbName(final byte[] value, final int offset, final int length)
    {
        standInstDbName.wrap(value);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbNameAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(standInstDbName, value, offset, length);
        standInstDbNameOffset = offset;
        standInstDbNameLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbName(final byte[] value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbName(final byte[] value)
    {
        return standInstDbName(value, 0, value.length);
    }

    public boolean hasStandInstDbName()
    {
        return standInstDbNameLength > 0;
    }

    public MutableDirectBuffer standInstDbName()
    {
        return standInstDbName;
    }

    public String standInstDbNameAsString()
    {
        return standInstDbName.getStringWithoutLengthAscii(standInstDbNameOffset, standInstDbNameLength);
    }

    public SettlInstructionsDataEncoder standInstDbName(final CharSequence value)
    {
        toBytes(value, standInstDbName);
        standInstDbNameOffset = 0;
        standInstDbNameLength = value.length();
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbName(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            standInstDbName.wrap(buffer);
            standInstDbNameOffset = value.offset();
            standInstDbNameLength = value.length();
        }
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbName(final char[] value)
    {
        return standInstDbName(value, 0, value.length);
    }

    public SettlInstructionsDataEncoder standInstDbName(final char[] value, final int length)
    {
        return standInstDbName(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbName(final char[] value, final int offset, final int length)
    {
        toBytes(value, standInstDbName, offset, length);
        standInstDbNameOffset = 0;
        standInstDbNameLength = length;
        return this;
    }

    private final MutableDirectBuffer standInstDbID = new UnsafeBuffer();

    private int standInstDbIDOffset = 0;

    private int standInstDbIDLength = 0;

    public SettlInstructionsDataEncoder standInstDbID(final DirectBuffer value, final int offset, final int length)
    {
        standInstDbID.wrap(value);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbID(final DirectBuffer value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbID(final DirectBuffer value)
    {
        return standInstDbID(value, 0, value.capacity());
    }

    public SettlInstructionsDataEncoder standInstDbID(final byte[] value, final int offset, final int length)
    {
        standInstDbID.wrap(value);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(standInstDbID, value, offset, length);
        standInstDbIDOffset = offset;
        standInstDbIDLength = length;
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbID(final byte[] value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbID(final byte[] value)
    {
        return standInstDbID(value, 0, value.length);
    }

    public boolean hasStandInstDbID()
    {
        return standInstDbIDLength > 0;
    }

    public MutableDirectBuffer standInstDbID()
    {
        return standInstDbID;
    }

    public String standInstDbIDAsString()
    {
        return standInstDbID.getStringWithoutLengthAscii(standInstDbIDOffset, standInstDbIDLength);
    }

    public SettlInstructionsDataEncoder standInstDbID(final CharSequence value)
    {
        toBytes(value, standInstDbID);
        standInstDbIDOffset = 0;
        standInstDbIDLength = value.length();
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            standInstDbID.wrap(buffer);
            standInstDbIDOffset = value.offset();
            standInstDbIDLength = value.length();
        }
        return this;
    }

    public SettlInstructionsDataEncoder standInstDbID(final char[] value)
    {
        return standInstDbID(value, 0, value.length);
    }

    public SettlInstructionsDataEncoder standInstDbID(final char[] value, final int length)
    {
        return standInstDbID(value, 0, length);
    }

    public SettlInstructionsDataEncoder standInstDbID(final char[] value, final int offset, final int length)
    {
        toBytes(value, standInstDbID, offset, length);
        standInstDbIDOffset = 0;
        standInstDbIDLength = length;
        return this;
    }

    private final DlvyInstGrpEncoder dlvyInstGrp = new DlvyInstGrpEncoder();
    public DlvyInstGrpEncoder dlvyInstGrp()
    {
        return dlvyInstGrp;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasSettlDeliveryType)
        {
            buffer.putBytes(position, settlDeliveryTypeHeader, 0, settlDeliveryTypeHeaderLength);
            position += settlDeliveryTypeHeaderLength;
            position += buffer.putIntAscii(position, settlDeliveryType);
            buffer.putSeparator(position);
            position++;
        }

        if (hasStandInstDbType)
        {
            buffer.putBytes(position, standInstDbTypeHeader, 0, standInstDbTypeHeaderLength);
            position += standInstDbTypeHeaderLength;
            position += buffer.putIntAscii(position, standInstDbType);
            buffer.putSeparator(position);
            position++;
        }

        if (standInstDbNameLength > 0)
        {
            buffer.putBytes(position, standInstDbNameHeader, 0, standInstDbNameHeaderLength);
            position += standInstDbNameHeaderLength;
            buffer.putBytes(position, standInstDbName, standInstDbNameOffset, standInstDbNameLength);
            position += standInstDbNameLength;
            buffer.putSeparator(position);
            position++;
        }

        if (standInstDbIDLength > 0)
        {
            buffer.putBytes(position, standInstDbIDHeader, 0, standInstDbIDHeaderLength);
            position += standInstDbIDHeaderLength;
            buffer.putBytes(position, standInstDbID, standInstDbIDOffset, standInstDbIDLength);
            position += standInstDbIDLength;
            buffer.putSeparator(position);
            position++;
        }

            position += dlvyInstGrp.encode(buffer, position);
        return position - offset;
    }

    public void reset()
    {
        this.resetSettlDeliveryType();
        this.resetStandInstDbType();
        this.resetStandInstDbName();
        this.resetStandInstDbID();
        dlvyInstGrp.reset();
    }

    public void resetSettlDeliveryType()
    {
        hasSettlDeliveryType = false;
    }

    public void resetStandInstDbType()
    {
        hasStandInstDbType = false;
    }

    public void resetStandInstDbName()
    {
        standInstDbNameLength = 0;
    }

    public void resetStandInstDbID()
    {
        standInstDbIDLength = 0;
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
        builder.append("\"MessageName\": \"SettlInstructionsData\",\n");
        if (hasSettlDeliveryType())
        {
            indent(builder, level);
            builder.append("\"SettlDeliveryType\": \"");
            builder.append(settlDeliveryType);
            builder.append("\",\n");
        }

        if (hasStandInstDbType())
        {
            indent(builder, level);
            builder.append("\"StandInstDbType\": \"");
            builder.append(standInstDbType);
            builder.append("\",\n");
        }

        if (hasStandInstDbName())
        {
            indent(builder, level);
            builder.append("\"StandInstDbName\": \"");
            appendBuffer(builder, standInstDbName, standInstDbNameOffset, standInstDbNameLength);
            builder.append("\",\n");
        }

        if (hasStandInstDbID())
        {
            indent(builder, level);
            builder.append("\"StandInstDbID\": \"");
            appendBuffer(builder, standInstDbID, standInstDbIDOffset, standInstDbIDLength);
            builder.append("\",\n");
        }

    indent(builder, level);
    builder.append("\"DlvyInstGrp\": ");
    dlvyInstGrp.appendTo(builder, level + 1);
    builder.append("\n");
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlInstructionsDataEncoder copyTo(final Encoder encoder)
    {
        return copyTo((SettlInstructionsDataEncoder)encoder);
    }

    public SettlInstructionsDataEncoder copyTo(final SettlInstructionsDataEncoder encoder)
    {
        encoder.reset();
        if (hasSettlDeliveryType())
        {
            encoder.settlDeliveryType(this.settlDeliveryType());
        }

        if (hasStandInstDbType())
        {
            encoder.standInstDbType(this.standInstDbType());
        }

        if (hasStandInstDbName())
        {
            encoder.standInstDbNameAsCopy(standInstDbName.byteArray(), 0, standInstDbNameLength);
        }

        if (hasStandInstDbID())
        {
            encoder.standInstDbIDAsCopy(standInstDbID.byteArray(), 0, standInstDbIDLength);
        }


        dlvyInstGrp.copyTo(encoder.dlvyInstGrp());        return encoder;
    }

}
