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


public class DisplayInstructionEncoder
{
    private static final int displayQtyHeaderLength = 5;
    private static final byte[] displayQtyHeader = new byte[] {49, 49, 51, 56, (byte) '='};

    private static final int secondaryDisplayQtyHeaderLength = 5;
    private static final byte[] secondaryDisplayQtyHeader = new byte[] {49, 48, 56, 50, (byte) '='};

    private static final int displayWhenHeaderLength = 5;
    private static final byte[] displayWhenHeader = new byte[] {49, 48, 56, 51, (byte) '='};

    private static final int displayMethodHeaderLength = 5;
    private static final byte[] displayMethodHeader = new byte[] {49, 48, 56, 52, (byte) '='};

    private static final int displayLowQtyHeaderLength = 5;
    private static final byte[] displayLowQtyHeader = new byte[] {49, 48, 56, 53, (byte) '='};

    private static final int displayHighQtyHeaderLength = 5;
    private static final byte[] displayHighQtyHeader = new byte[] {49, 48, 56, 54, (byte) '='};

    private static final int displayMinIncrHeaderLength = 5;
    private static final byte[] displayMinIncrHeader = new byte[] {49, 48, 56, 55, (byte) '='};

    private static final int refreshQtyHeaderLength = 5;
    private static final byte[] refreshQtyHeader = new byte[] {49, 48, 56, 56, (byte) '='};

    private final DecimalFloat displayQty = new DecimalFloat();

    private boolean hasDisplayQty;

    public boolean hasDisplayQty()
    {
        return hasDisplayQty;
    }

    public DisplayInstructionEncoder displayQty(DecimalFloat value)
    {
        displayQty.set(value);
        hasDisplayQty = true;
        return this;
    }

    public DisplayInstructionEncoder displayQty(long value, int scale)
    {
        displayQty.set(value, scale);
        hasDisplayQty = true;
        return this;
    }

    public DecimalFloat displayQty()
    {
        return displayQty;
    }

    private final DecimalFloat secondaryDisplayQty = new DecimalFloat();

    private boolean hasSecondaryDisplayQty;

    public boolean hasSecondaryDisplayQty()
    {
        return hasSecondaryDisplayQty;
    }

    public DisplayInstructionEncoder secondaryDisplayQty(DecimalFloat value)
    {
        secondaryDisplayQty.set(value);
        hasSecondaryDisplayQty = true;
        return this;
    }

    public DisplayInstructionEncoder secondaryDisplayQty(long value, int scale)
    {
        secondaryDisplayQty.set(value, scale);
        hasSecondaryDisplayQty = true;
        return this;
    }

    public DecimalFloat secondaryDisplayQty()
    {
        return secondaryDisplayQty;
    }

    private char displayWhen;

    private boolean hasDisplayWhen;

    public boolean hasDisplayWhen()
    {
        return hasDisplayWhen;
    }

    public DisplayInstructionEncoder displayWhen(char value)
    {
        displayWhen = value;
        hasDisplayWhen = true;
        return this;
    }

    public char displayWhen()
    {
        return displayWhen;
    }

    public DisplayInstructionEncoder displayWhen(DisplayWhen value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DisplayWhen.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: displayWhen Value: " + value );
            }
            if (value == DisplayWhen.NULL_VAL)
            {
                return this;
            }
        }
        return displayWhen(value.representation());
    }

    private char displayMethod;

    private boolean hasDisplayMethod;

    public boolean hasDisplayMethod()
    {
        return hasDisplayMethod;
    }

    public DisplayInstructionEncoder displayMethod(char value)
    {
        displayMethod = value;
        hasDisplayMethod = true;
        return this;
    }

    public char displayMethod()
    {
        return displayMethod;
    }

    public DisplayInstructionEncoder displayMethod(DisplayMethod value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == DisplayMethod.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: displayMethod Value: " + value );
            }
            if (value == DisplayMethod.NULL_VAL)
            {
                return this;
            }
        }
        return displayMethod(value.representation());
    }

    private final DecimalFloat displayLowQty = new DecimalFloat();

    private boolean hasDisplayLowQty;

    public boolean hasDisplayLowQty()
    {
        return hasDisplayLowQty;
    }

    public DisplayInstructionEncoder displayLowQty(DecimalFloat value)
    {
        displayLowQty.set(value);
        hasDisplayLowQty = true;
        return this;
    }

    public DisplayInstructionEncoder displayLowQty(long value, int scale)
    {
        displayLowQty.set(value, scale);
        hasDisplayLowQty = true;
        return this;
    }

    public DecimalFloat displayLowQty()
    {
        return displayLowQty;
    }

    private final DecimalFloat displayHighQty = new DecimalFloat();

    private boolean hasDisplayHighQty;

    public boolean hasDisplayHighQty()
    {
        return hasDisplayHighQty;
    }

    public DisplayInstructionEncoder displayHighQty(DecimalFloat value)
    {
        displayHighQty.set(value);
        hasDisplayHighQty = true;
        return this;
    }

    public DisplayInstructionEncoder displayHighQty(long value, int scale)
    {
        displayHighQty.set(value, scale);
        hasDisplayHighQty = true;
        return this;
    }

    public DecimalFloat displayHighQty()
    {
        return displayHighQty;
    }

    private final DecimalFloat displayMinIncr = new DecimalFloat();

    private boolean hasDisplayMinIncr;

    public boolean hasDisplayMinIncr()
    {
        return hasDisplayMinIncr;
    }

    public DisplayInstructionEncoder displayMinIncr(DecimalFloat value)
    {
        displayMinIncr.set(value);
        hasDisplayMinIncr = true;
        return this;
    }

    public DisplayInstructionEncoder displayMinIncr(long value, int scale)
    {
        displayMinIncr.set(value, scale);
        hasDisplayMinIncr = true;
        return this;
    }

    public DecimalFloat displayMinIncr()
    {
        return displayMinIncr;
    }

    private final DecimalFloat refreshQty = new DecimalFloat();

    private boolean hasRefreshQty;

    public boolean hasRefreshQty()
    {
        return hasRefreshQty;
    }

    public DisplayInstructionEncoder refreshQty(DecimalFloat value)
    {
        refreshQty.set(value);
        hasRefreshQty = true;
        return this;
    }

    public DisplayInstructionEncoder refreshQty(long value, int scale)
    {
        refreshQty.set(value, scale);
        hasRefreshQty = true;
        return this;
    }

    public DecimalFloat refreshQty()
    {
        return refreshQty;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasDisplayQty)
        {
            buffer.putBytes(position, displayQtyHeader, 0, displayQtyHeaderLength);
            position += displayQtyHeaderLength;
            position += buffer.putFloatAscii(position, displayQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasSecondaryDisplayQty)
        {
            buffer.putBytes(position, secondaryDisplayQtyHeader, 0, secondaryDisplayQtyHeaderLength);
            position += secondaryDisplayQtyHeaderLength;
            position += buffer.putFloatAscii(position, secondaryDisplayQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDisplayWhen)
        {
            buffer.putBytes(position, displayWhenHeader, 0, displayWhenHeaderLength);
            position += displayWhenHeaderLength;
            position += buffer.putCharAscii(position, displayWhen);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDisplayMethod)
        {
            buffer.putBytes(position, displayMethodHeader, 0, displayMethodHeaderLength);
            position += displayMethodHeaderLength;
            position += buffer.putCharAscii(position, displayMethod);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDisplayLowQty)
        {
            buffer.putBytes(position, displayLowQtyHeader, 0, displayLowQtyHeaderLength);
            position += displayLowQtyHeaderLength;
            position += buffer.putFloatAscii(position, displayLowQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDisplayHighQty)
        {
            buffer.putBytes(position, displayHighQtyHeader, 0, displayHighQtyHeaderLength);
            position += displayHighQtyHeaderLength;
            position += buffer.putFloatAscii(position, displayHighQty);
            buffer.putSeparator(position);
            position++;
        }

        if (hasDisplayMinIncr)
        {
            buffer.putBytes(position, displayMinIncrHeader, 0, displayMinIncrHeaderLength);
            position += displayMinIncrHeaderLength;
            position += buffer.putFloatAscii(position, displayMinIncr);
            buffer.putSeparator(position);
            position++;
        }

        if (hasRefreshQty)
        {
            buffer.putBytes(position, refreshQtyHeader, 0, refreshQtyHeaderLength);
            position += refreshQtyHeaderLength;
            position += buffer.putFloatAscii(position, refreshQty);
            buffer.putSeparator(position);
            position++;
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetDisplayQty();
        this.resetSecondaryDisplayQty();
        this.resetDisplayWhen();
        this.resetDisplayMethod();
        this.resetDisplayLowQty();
        this.resetDisplayHighQty();
        this.resetDisplayMinIncr();
        this.resetRefreshQty();
    }

    public void resetDisplayQty()
    {
        hasDisplayQty = false;
    }

    public void resetSecondaryDisplayQty()
    {
        hasSecondaryDisplayQty = false;
    }

    public void resetDisplayWhen()
    {
        hasDisplayWhen = false;
    }

    public void resetDisplayMethod()
    {
        hasDisplayMethod = false;
    }

    public void resetDisplayLowQty()
    {
        hasDisplayLowQty = false;
    }

    public void resetDisplayHighQty()
    {
        hasDisplayHighQty = false;
    }

    public void resetDisplayMinIncr()
    {
        hasDisplayMinIncr = false;
    }

    public void resetRefreshQty()
    {
        hasRefreshQty = false;
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
        builder.append("\"MessageName\": \"DisplayInstruction\",\n");
        if (hasDisplayQty())
        {
            indent(builder, level);
            builder.append("\"DisplayQty\": \"");
            displayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasSecondaryDisplayQty())
        {
            indent(builder, level);
            builder.append("\"SecondaryDisplayQty\": \"");
            secondaryDisplayQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayWhen())
        {
            indent(builder, level);
            builder.append("\"DisplayWhen\": \"");
            builder.append(displayWhen);
            builder.append("\",\n");
        }

        if (hasDisplayMethod())
        {
            indent(builder, level);
            builder.append("\"DisplayMethod\": \"");
            builder.append(displayMethod);
            builder.append("\",\n");
        }

        if (hasDisplayLowQty())
        {
            indent(builder, level);
            builder.append("\"DisplayLowQty\": \"");
            displayLowQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayHighQty())
        {
            indent(builder, level);
            builder.append("\"DisplayHighQty\": \"");
            displayHighQty.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasDisplayMinIncr())
        {
            indent(builder, level);
            builder.append("\"DisplayMinIncr\": \"");
            displayMinIncr.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasRefreshQty())
        {
            indent(builder, level);
            builder.append("\"RefreshQty\": \"");
            refreshQty.appendTo(builder);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public DisplayInstructionEncoder copyTo(final Encoder encoder)
    {
        return copyTo((DisplayInstructionEncoder)encoder);
    }

    public DisplayInstructionEncoder copyTo(final DisplayInstructionEncoder encoder)
    {
        encoder.reset();
        if (hasDisplayQty())
        {
            encoder.displayQty(this.displayQty());
        }

        if (hasSecondaryDisplayQty())
        {
            encoder.secondaryDisplayQty(this.secondaryDisplayQty());
        }

        if (hasDisplayWhen())
        {
            encoder.displayWhen(this.displayWhen());
        }

        if (hasDisplayMethod())
        {
            encoder.displayMethod(this.displayMethod());
        }

        if (hasDisplayLowQty())
        {
            encoder.displayLowQty(this.displayLowQty());
        }

        if (hasDisplayHighQty())
        {
            encoder.displayHighQty(this.displayHighQty());
        }

        if (hasDisplayMinIncr())
        {
            encoder.displayMinIncr(this.displayMinIncr());
        }

        if (hasRefreshQty())
        {
            encoder.refreshQty(this.refreshQty());
        }
        return encoder;
    }

}
