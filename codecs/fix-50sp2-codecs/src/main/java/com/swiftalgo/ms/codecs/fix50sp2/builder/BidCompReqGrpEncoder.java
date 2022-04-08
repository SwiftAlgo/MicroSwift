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


public class BidCompReqGrpEncoder
{
    private static final int noBidComponentsGroupCounterHeaderLength = 4;
    private static final byte[] noBidComponentsGroupCounterHeader = new byte[] {52, 50, 48, (byte) '='};



public static class BidComponentsGroupEncoder
{
    private BidComponentsGroupEncoder next = null;

    public BidComponentsGroupEncoder next()
    {
        if (next == null)
        {
            next = new BidComponentsGroupEncoder();
        }
        return next;
    }

    private static final int listIDHeaderLength = 3;
    private static final byte[] listIDHeader = new byte[] {54, 54, (byte) '='};

    private static final int sideHeaderLength = 3;
    private static final byte[] sideHeader = new byte[] {53, 52, (byte) '='};

    private static final int tradingSessionIDHeaderLength = 4;
    private static final byte[] tradingSessionIDHeader = new byte[] {51, 51, 54, (byte) '='};

    private static final int tradingSessionSubIDHeaderLength = 4;
    private static final byte[] tradingSessionSubIDHeader = new byte[] {54, 50, 53, (byte) '='};

    private static final int netGrossIndHeaderLength = 4;
    private static final byte[] netGrossIndHeader = new byte[] {52, 51, 48, (byte) '='};

    private static final int settlTypeHeaderLength = 3;
    private static final byte[] settlTypeHeader = new byte[] {54, 51, (byte) '='};

    private static final int settlDateHeaderLength = 3;
    private static final byte[] settlDateHeader = new byte[] {54, 52, (byte) '='};

    private static final int accountHeaderLength = 2;
    private static final byte[] accountHeader = new byte[] {49, (byte) '='};

    private static final int acctIDSourceHeaderLength = 4;
    private static final byte[] acctIDSourceHeader = new byte[] {54, 54, 48, (byte) '='};

    private final MutableDirectBuffer listID = new UnsafeBuffer();

    private int listIDOffset = 0;

    private int listIDLength = 0;

    public BidComponentsGroupEncoder listID(final DirectBuffer value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listID(final DirectBuffer value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final DirectBuffer value)
    {
        return listID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder listID(final byte[] value, final int offset, final int length)
    {
        listID.wrap(value);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(listID, value, offset, length);
        listIDOffset = offset;
        listIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder listID(final byte[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final byte[] value)
    {
        return listID(value, 0, value.length);
    }

    public boolean hasListID()
    {
        return listIDLength > 0;
    }

    public MutableDirectBuffer listID()
    {
        return listID;
    }

    public String listIDAsString()
    {
        return listID.getStringWithoutLengthAscii(listIDOffset, listIDLength);
    }

    public BidComponentsGroupEncoder listID(final CharSequence value)
    {
        toBytes(value, listID);
        listIDOffset = 0;
        listIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder listID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            listID.wrap(buffer);
            listIDOffset = value.offset();
            listIDLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder listID(final char[] value)
    {
        return listID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder listID(final char[] value, final int length)
    {
        return listID(value, 0, length);
    }

    public BidComponentsGroupEncoder listID(final char[] value, final int offset, final int length)
    {
        toBytes(value, listID, offset, length);
        listIDOffset = 0;
        listIDLength = length;
        return this;
    }

    private char side;

    private boolean hasSide;

    public boolean hasSide()
    {
        return hasSide;
    }

    public BidComponentsGroupEncoder side(char value)
    {
        side = value;
        hasSide = true;
        return this;
    }

    public char side()
    {
        return side;
    }

    public BidComponentsGroupEncoder side(Side value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == Side.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: side Value: " + value );
            }
            if (value == Side.NULL_VAL)
            {
                return this;
            }
        }
        return side(value.representation());
    }

    private final MutableDirectBuffer tradingSessionID = new UnsafeBuffer();

    private int tradingSessionIDOffset = 0;

    private int tradingSessionIDLength = 0;

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final DirectBuffer value)
    {
        return tradingSessionID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value, final int offset, final int length)
    {
        tradingSessionID.wrap(value);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionID, value, offset, length);
        tradingSessionIDOffset = offset;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final byte[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public boolean hasTradingSessionID()
    {
        return tradingSessionIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionID()
    {
        return tradingSessionID;
    }

    public String tradingSessionIDAsString()
    {
        return tradingSessionID.getStringWithoutLengthAscii(tradingSessionIDOffset, tradingSessionIDLength);
    }

    public BidComponentsGroupEncoder tradingSessionID(final CharSequence value)
    {
        toBytes(value, tradingSessionID);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionID.wrap(buffer);
            tradingSessionIDOffset = value.offset();
            tradingSessionIDLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(final char[] value)
    {
        return tradingSessionID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final char[] value, final int length)
    {
        return tradingSessionID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionID, offset, length);
        tradingSessionIDOffset = 0;
        tradingSessionIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionID(TradingSessionID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionID Value: " + value );
            }
            if (value == TradingSessionID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionID(value.representation());
    }

    private final MutableDirectBuffer tradingSessionSubID = new UnsafeBuffer();

    private int tradingSessionSubIDOffset = 0;

    private int tradingSessionSubIDLength = 0;

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final DirectBuffer value)
    {
        return tradingSessionSubID(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value, final int offset, final int length)
    {
        tradingSessionSubID.wrap(value);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubIDAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(tradingSessionSubID, value, offset, length);
        tradingSessionSubIDOffset = offset;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final byte[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public boolean hasTradingSessionSubID()
    {
        return tradingSessionSubIDLength > 0;
    }

    public MutableDirectBuffer tradingSessionSubID()
    {
        return tradingSessionSubID;
    }

    public String tradingSessionSubIDAsString()
    {
        return tradingSessionSubID.getStringWithoutLengthAscii(tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final CharSequence value)
    {
        toBytes(value, tradingSessionSubID);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            tradingSessionSubID.wrap(buffer);
            tradingSessionSubIDOffset = value.offset();
            tradingSessionSubIDLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value)
    {
        return tradingSessionSubID(value, 0, value.length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value, final int length)
    {
        return tradingSessionSubID(value, 0, length);
    }

    public BidComponentsGroupEncoder tradingSessionSubID(final char[] value, final int offset, final int length)
    {
        toBytes(value, tradingSessionSubID, offset, length);
        tradingSessionSubIDOffset = 0;
        tradingSessionSubIDLength = length;
        return this;
    }

    public BidComponentsGroupEncoder tradingSessionSubID(TradingSessionSubID value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == TradingSessionSubID.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: tradingSessionSubID Value: " + value );
            }
            if (value == TradingSessionSubID.NULL_VAL)
            {
                return this;
            }
        }
        return tradingSessionSubID(value.representation());
    }

    private int netGrossInd;

    private boolean hasNetGrossInd;

    public boolean hasNetGrossInd()
    {
        return hasNetGrossInd;
    }

    public BidComponentsGroupEncoder netGrossInd(int value)
    {
        netGrossInd = value;
        hasNetGrossInd = true;
        return this;
    }

    public int netGrossInd()
    {
        return netGrossInd;
    }

    public BidComponentsGroupEncoder netGrossInd(NetGrossInd value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == NetGrossInd.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: netGrossInd Value: " + value );
            }
            if (value == NetGrossInd.NULL_VAL)
            {
                return this;
            }
        }
        return netGrossInd(value.representation());
    }

    private final MutableDirectBuffer settlType = new UnsafeBuffer();

    private int settlTypeOffset = 0;

    private int settlTypeLength = 0;

    public BidComponentsGroupEncoder settlType(final DirectBuffer value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlType(final DirectBuffer value, final int length)
    {
        return settlType(value, 0, length);
    }

    public BidComponentsGroupEncoder settlType(final DirectBuffer value)
    {
        return settlType(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder settlType(final byte[] value, final int offset, final int length)
    {
        settlType.wrap(value);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlTypeAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlType, value, offset, length);
        settlTypeOffset = offset;
        settlTypeLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlType(final byte[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public BidComponentsGroupEncoder settlType(final byte[] value)
    {
        return settlType(value, 0, value.length);
    }

    public boolean hasSettlType()
    {
        return settlTypeLength > 0;
    }

    public MutableDirectBuffer settlType()
    {
        return settlType;
    }

    public String settlTypeAsString()
    {
        return settlType.getStringWithoutLengthAscii(settlTypeOffset, settlTypeLength);
    }

    public BidComponentsGroupEncoder settlType(final CharSequence value)
    {
        toBytes(value, settlType);
        settlTypeOffset = 0;
        settlTypeLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder settlType(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            settlType.wrap(buffer);
            settlTypeOffset = value.offset();
            settlTypeLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder settlType(final char[] value)
    {
        return settlType(value, 0, value.length);
    }

    public BidComponentsGroupEncoder settlType(final char[] value, final int length)
    {
        return settlType(value, 0, length);
    }

    public BidComponentsGroupEncoder settlType(final char[] value, final int offset, final int length)
    {
        toBytes(value, settlType, offset, length);
        settlTypeOffset = 0;
        settlTypeLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlType(SettlType value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == SettlType.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: settlType Value: " + value );
            }
            if (value == SettlType.NULL_VAL)
            {
                return this;
            }
        }
        return settlType(value.representation());
    }

    private final MutableDirectBuffer settlDate = new UnsafeBuffer();

    private int settlDateOffset = 0;

    private int settlDateLength = 0;

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public BidComponentsGroupEncoder settlDate(final DirectBuffer value)
    {
        return settlDate(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value, final int offset, final int length)
    {
        settlDate.wrap(value);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDateAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(settlDate, value, offset, length);
        settlDateOffset = offset;
        settlDateLength = length;
        return this;
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value, final int length)
    {
        return settlDate(value, 0, length);
    }

    public BidComponentsGroupEncoder settlDate(final byte[] value)
    {
        return settlDate(value, 0, value.length);
    }

    public boolean hasSettlDate()
    {
        return settlDateLength > 0;
    }

    public MutableDirectBuffer settlDate()
    {
        return settlDate;
    }

    public String settlDateAsString()
    {
        return settlDate.getStringWithoutLengthAscii(settlDateOffset, settlDateLength);
    }

    private final MutableDirectBuffer account = new UnsafeBuffer();

    private int accountOffset = 0;

    private int accountLength = 0;

    public BidComponentsGroupEncoder account(final DirectBuffer value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public BidComponentsGroupEncoder account(final DirectBuffer value, final int length)
    {
        return account(value, 0, length);
    }

    public BidComponentsGroupEncoder account(final DirectBuffer value)
    {
        return account(value, 0, value.capacity());
    }

    public BidComponentsGroupEncoder account(final byte[] value, final int offset, final int length)
    {
        account.wrap(value);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public BidComponentsGroupEncoder accountAsCopy(final byte[] value, final int offset, final int length)
    {
        copyInto(account, value, offset, length);
        accountOffset = offset;
        accountLength = length;
        return this;
    }

    public BidComponentsGroupEncoder account(final byte[] value, final int length)
    {
        return account(value, 0, length);
    }

    public BidComponentsGroupEncoder account(final byte[] value)
    {
        return account(value, 0, value.length);
    }

    public boolean hasAccount()
    {
        return accountLength > 0;
    }

    public MutableDirectBuffer account()
    {
        return account;
    }

    public String accountAsString()
    {
        return account.getStringWithoutLengthAscii(accountOffset, accountLength);
    }

    public BidComponentsGroupEncoder account(final CharSequence value)
    {
        toBytes(value, account);
        accountOffset = 0;
        accountLength = value.length();
        return this;
    }

    public BidComponentsGroupEncoder account(final AsciiSequenceView value)
    {
        final DirectBuffer buffer = value.buffer();
        if (buffer != null)
        {
            account.wrap(buffer);
            accountOffset = value.offset();
            accountLength = value.length();
        }
        return this;
    }

    public BidComponentsGroupEncoder account(final char[] value)
    {
        return account(value, 0, value.length);
    }

    public BidComponentsGroupEncoder account(final char[] value, final int length)
    {
        return account(value, 0, length);
    }

    public BidComponentsGroupEncoder account(final char[] value, final int offset, final int length)
    {
        toBytes(value, account, offset, length);
        accountOffset = 0;
        accountLength = length;
        return this;
    }

    private int acctIDSource;

    private boolean hasAcctIDSource;

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }

    public BidComponentsGroupEncoder acctIDSource(int value)
    {
        acctIDSource = value;
        hasAcctIDSource = true;
        return this;
    }

    public int acctIDSource()
    {
        return acctIDSource;
    }

    public BidComponentsGroupEncoder acctIDSource(AcctIDSource value)
    {
        if (CODEC_VALIDATION_ENABLED)
        {
            if (value == AcctIDSource.ARTIO_UNKNOWN)
            {
                throw new EncodingException("Invalid Value Field: acctIDSource Value: " + value );
            }
            if (value == AcctIDSource.NULL_VAL)
            {
                return this;
            }
        }
        return acctIDSource(value.representation());
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset, final int remainingElements)
    {
        if (remainingElements == 0)
        {
            return 0;
        }

        int position = offset;

        if (listIDLength > 0)
        {
            buffer.putBytes(position, listIDHeader, 0, listIDHeaderLength);
            position += listIDHeaderLength;
            buffer.putBytes(position, listID, listIDOffset, listIDLength);
            position += listIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasSide)
        {
            buffer.putBytes(position, sideHeader, 0, sideHeaderLength);
            position += sideHeaderLength;
            position += buffer.putCharAscii(position, side);
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionIDHeader, 0, tradingSessionIDHeaderLength);
            position += tradingSessionIDHeaderLength;
            buffer.putBytes(position, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            position += tradingSessionIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (tradingSessionSubIDLength > 0)
        {
            buffer.putBytes(position, tradingSessionSubIDHeader, 0, tradingSessionSubIDHeaderLength);
            position += tradingSessionSubIDHeaderLength;
            buffer.putBytes(position, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            position += tradingSessionSubIDLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasNetGrossInd)
        {
            buffer.putBytes(position, netGrossIndHeader, 0, netGrossIndHeaderLength);
            position += netGrossIndHeaderLength;
            position += buffer.putIntAscii(position, netGrossInd);
            buffer.putSeparator(position);
            position++;
        }

        if (settlTypeLength > 0)
        {
            buffer.putBytes(position, settlTypeHeader, 0, settlTypeHeaderLength);
            position += settlTypeHeaderLength;
            buffer.putBytes(position, settlType, settlTypeOffset, settlTypeLength);
            position += settlTypeLength;
            buffer.putSeparator(position);
            position++;
        }

        if (settlDateLength > 0)
        {
            buffer.putBytes(position, settlDateHeader, 0, settlDateHeaderLength);
            position += settlDateHeaderLength;
            buffer.putBytes(position, settlDate, settlDateOffset, settlDateLength);
            position += settlDateLength;
            buffer.putSeparator(position);
            position++;
        }

        if (accountLength > 0)
        {
            buffer.putBytes(position, accountHeader, 0, accountHeaderLength);
            position += accountHeaderLength;
            buffer.putBytes(position, account, accountOffset, accountLength);
            position += accountLength;
            buffer.putSeparator(position);
            position++;
        }

        if (hasAcctIDSource)
        {
            buffer.putBytes(position, acctIDSourceHeader, 0, acctIDSourceHeaderLength);
            position += acctIDSourceHeaderLength;
            position += buffer.putIntAscii(position, acctIDSource);
            buffer.putSeparator(position);
            position++;
        }
        if (next != null)
        {
            position += next.encode(buffer, position, remainingElements - 1);
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetListID();
        this.resetSide();
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetNetGrossInd();
        this.resetSettlType();
        this.resetSettlDate();
        this.resetAccount();
        this.resetAcctIDSource();
        if (next != null)        {
            next.reset();
        }
    }

    public void resetListID()
    {
        listIDLength = 0;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetTradingSessionID()
    {
        tradingSessionIDLength = 0;
    }

    public void resetTradingSessionSubID()
    {
        tradingSessionSubIDLength = 0;
    }

    public void resetNetGrossInd()
    {
        hasNetGrossInd = false;
    }

    public void resetSettlType()
    {
        settlTypeLength = 0;
    }

    public void resetSettlDate()
    {
        settlDateLength = 0;
    }

    public void resetAccount()
    {
        accountLength = 0;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
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
        builder.append("\"MessageName\": \"BidComponentsGroup\",\n");
        if (hasListID())
        {
            indent(builder, level);
            builder.append("\"ListID\": \"");
            appendBuffer(builder, listID, listIDOffset, listIDLength);
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            appendBuffer(builder, tradingSessionID, tradingSessionIDOffset, tradingSessionIDLength);
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            appendBuffer(builder, tradingSessionSubID, tradingSessionSubIDOffset, tradingSessionSubIDLength);
            builder.append("\",\n");
        }

        if (hasNetGrossInd())
        {
            indent(builder, level);
            builder.append("\"NetGrossInd\": \"");
            builder.append(netGrossInd);
            builder.append("\",\n");
        }

        if (hasSettlType())
        {
            indent(builder, level);
            builder.append("\"SettlType\": \"");
            appendBuffer(builder, settlType, settlTypeOffset, settlTypeLength);
            builder.append("\",\n");
        }

        if (hasSettlDate())
        {
            indent(builder, level);
            builder.append("\"SettlDate\": \"");
            appendBuffer(builder, settlDate, settlDateOffset, settlDateLength);
            builder.append("\",\n");
        }

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            appendBuffer(builder, account, accountOffset, accountLength);
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidComponentsGroupEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidComponentsGroupEncoder)encoder);
    }

    public BidComponentsGroupEncoder copyTo(final BidComponentsGroupEncoder encoder)
    {
        encoder.reset();
        if (hasListID())
        {
            encoder.listIDAsCopy(listID.byteArray(), 0, listIDLength);
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasTradingSessionID())
        {
            encoder.tradingSessionIDAsCopy(tradingSessionID.byteArray(), 0, tradingSessionIDLength);
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubIDAsCopy(tradingSessionSubID.byteArray(), 0, tradingSessionSubIDLength);
        }

        if (hasNetGrossInd())
        {
            encoder.netGrossInd(this.netGrossInd());
        }

        if (hasSettlType())
        {
            encoder.settlTypeAsCopy(settlType.byteArray(), 0, settlTypeLength);
        }

        if (hasSettlDate())
        {
            encoder.settlDateAsCopy(settlDate.byteArray(), 0, settlDateLength);
        }

        if (hasAccount())
        {
            encoder.accountAsCopy(account.byteArray(), 0, accountLength);
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }
        return encoder;
    }

}
    private int noBidComponentsGroupCounter;

    private boolean hasNoBidComponentsGroupCounter;

    public boolean hasNoBidComponentsGroupCounter()
    {
        return hasNoBidComponentsGroupCounter;
    }

    public BidCompReqGrpEncoder noBidComponentsGroupCounter(int value)
    {
        noBidComponentsGroupCounter = value;
        hasNoBidComponentsGroupCounter = true;
        return this;
    }

    public int noBidComponentsGroupCounter()
    {
        return noBidComponentsGroupCounter;
    }


    private BidComponentsGroupEncoder bidComponentsGroup = null;

    public BidComponentsGroupEncoder bidComponentsGroup(final int numberOfElements)
    {
        hasNoBidComponentsGroupCounter = true;
        noBidComponentsGroupCounter = numberOfElements;
        if (bidComponentsGroup == null)
        {
            bidComponentsGroup = new BidComponentsGroupEncoder();
        }
        return bidComponentsGroup;
    }

    public int encode(final MutableAsciiBuffer buffer, final int offset)
    {
        int position = offset;

        if (hasNoBidComponentsGroupCounter)
        {
            buffer.putBytes(position, noBidComponentsGroupCounterHeader, 0, noBidComponentsGroupCounterHeaderLength);
            position += noBidComponentsGroupCounterHeaderLength;
            position += buffer.putIntAscii(position, noBidComponentsGroupCounter);
            buffer.putSeparator(position);
            position++;
        }

        if (bidComponentsGroup != null)
        {
            position += bidComponentsGroup.encode(buffer, position, noBidComponentsGroupCounter);
        }

        return position - offset;
    }

    public void reset()
    {
        this.resetBidComponentsGroup();
    }

    public void resetBidComponentsGroup()
    {
        if (bidComponentsGroup != null)
        {
            bidComponentsGroup.reset();
        }
        noBidComponentsGroupCounter = 0;
        hasNoBidComponentsGroupCounter = false;
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
        builder.append("\"MessageName\": \"BidCompReqGrp\",\n");
        if (hasNoBidComponentsGroupCounter)
        {
            indent(builder, level);
            builder.append("\"BidComponentsGroup\": [\n");
            final int noBidComponentsGroupCounter = this.noBidComponentsGroupCounter;
            BidComponentsGroupEncoder bidComponentsGroup = this.bidComponentsGroup;
            for (int i = 0; i < noBidComponentsGroupCounter; i++)
            {
                indent(builder, level);
                bidComponentsGroup.appendTo(builder, level + 1);
                if (i < (noBidComponentsGroupCounter - 1))
                {
                    builder.append(',');
                }
                builder.append('\n');
                bidComponentsGroup = bidComponentsGroup.next();
            }
            indent(builder, level);
            builder.append("],\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public BidCompReqGrpEncoder copyTo(final Encoder encoder)
    {
        return copyTo((BidCompReqGrpEncoder)encoder);
    }

    public BidCompReqGrpEncoder copyTo(final BidCompReqGrpEncoder encoder)
    {
        encoder.reset();
        if (hasNoBidComponentsGroupCounter)
        {
            final int size = this.noBidComponentsGroupCounter;
            BidComponentsGroupEncoder bidComponentsGroup = this.bidComponentsGroup;
            BidComponentsGroupEncoder bidComponentsGroupEncoder = encoder.bidComponentsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (bidComponentsGroup != null)
                {
                    bidComponentsGroup.copyTo(bidComponentsGroupEncoder);
                    bidComponentsGroup = bidComponentsGroup.next();
                    bidComponentsGroupEncoder = bidComponentsGroupEncoder.next();
                }
            }
        }
        return encoder;
    }

}
