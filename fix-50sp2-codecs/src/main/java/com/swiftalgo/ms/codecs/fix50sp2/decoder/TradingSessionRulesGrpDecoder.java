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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesGrpEncoder.TradingSessionRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradingSessionRulesEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.OrdTypeRulesEncoder.OrdTypeRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TimeInForceRulesEncoder.TimeInForceRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.ExecInstRulesEncoder.ExecInstRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MatchRulesEncoder.MatchRulesGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.MarketDataFeedTypesEncoder.MDFeedTypesGroupEncoder;

public interface TradingSessionRulesGrpDecoder 
{



public class TradingSessionRulesGroupDecoder extends CommonDecoderImpl implements TradingSessionRulesDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_ID);
            ALL_GROUP_FIELDS.add(Constants.TRADING_SESSION_SUB_ID);
        }
    }

    private final IntHashSet missingRequiredFields = new IntHashSet(0);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasTradingSessionID)
        {
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionID.isValid(tradingSessionIDWrapper))
        {
            invalidTagId = 336;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTradingSessionSubID)
        {
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TradingSessionSubID.isValid(tradingSessionSubIDWrapper))
        {
            invalidTagId = 625;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoOrdTypeRulesGroupCounter)
        {
            {
                int count = 0;
                final OrdTypeRulesGroupIterator iterator = ordTypeRulesGroupIterator.iterator();
                for (final OrdTypeRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1237;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoTimeInForceRulesGroupCounter)
        {
            {
                int count = 0;
                final TimeInForceRulesGroupIterator iterator = timeInForceRulesGroupIterator.iterator();
                for (final TimeInForceRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1239;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoExecInstRulesGroupCounter)
        {
            {
                int count = 0;
                final ExecInstRulesGroupIterator iterator = execInstRulesGroupIterator.iterator();
                for (final ExecInstRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1232;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoMatchRulesGroupCounter)
        {
            {
                int count = 0;
                final MatchRulesGroupIterator iterator = matchRulesGroupIterator.iterator();
                for (final MatchRulesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1235;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoMDFeedTypesGroupCounter)
        {
            {
                int count = 0;
                final MDFeedTypesGroupIterator iterator = mDFeedTypesGroupIterator.iterator();
                for (final MDFeedTypesGroupDecoder group : iterator)
                {
                    count++;                    if (!group.validate())
                    {
                        invalidTagId = group.invalidTagId();
                        rejectReason = group.rejectReason();
                        return false;
                    }
                }
                if (count != iterator.numberFieldValue())
                {
                    invalidTagId = 1141;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public TradingSessionRulesGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private TradingSessionRulesGroupDecoder next = null;

    public TradingSessionRulesGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(6);

    private char[] tradingSessionID = new char[1];

    private boolean hasTradingSessionID;

    public char[] tradingSessionID()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionID;
    }

    public boolean hasTradingSessionID()
    {
        return hasTradingSessionID;
    }


    private int tradingSessionIDOffset;

    private int tradingSessionIDLength;

    public int tradingSessionIDLength()
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        return tradingSessionIDLength;
    }

    public String tradingSessionIDAsString()
    {
        return hasTradingSessionID ? new String(tradingSessionID, 0, tradingSessionIDLength) : null;
    }

    public void tradingSessionID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionID");
        }

        view.wrap(buffer, tradingSessionIDOffset, tradingSessionIDLength);
    }


    private final CharArrayWrapper tradingSessionIDWrapper = new CharArrayWrapper();
    public TradingSessionID tradingSessionIDAsEnum()
    {
        if (!hasTradingSessionID)
 return TradingSessionID.NULL_VAL;
        tradingSessionIDWrapper.wrap(this.tradingSessionID(), tradingSessionIDLength);
        return TradingSessionID.decode(tradingSessionIDWrapper);
    }

    private char[] tradingSessionSubID = new char[1];

    private boolean hasTradingSessionSubID;

    public char[] tradingSessionSubID()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubID;
    }

    public boolean hasTradingSessionSubID()
    {
        return hasTradingSessionSubID;
    }


    private int tradingSessionSubIDOffset;

    private int tradingSessionSubIDLength;

    public int tradingSessionSubIDLength()
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        return tradingSessionSubIDLength;
    }

    public String tradingSessionSubIDAsString()
    {
        return hasTradingSessionSubID ? new String(tradingSessionSubID, 0, tradingSessionSubIDLength) : null;
    }

    public void tradingSessionSubID(final AsciiSequenceView view)
    {
        if (!hasTradingSessionSubID)
        {
            throw new IllegalArgumentException("No value for optional field: TradingSessionSubID");
        }

        view.wrap(buffer, tradingSessionSubIDOffset, tradingSessionSubIDLength);
    }


    private final CharArrayWrapper tradingSessionSubIDWrapper = new CharArrayWrapper();
    public TradingSessionSubID tradingSessionSubIDAsEnum()
    {
        if (!hasTradingSessionSubID)
 return TradingSessionSubID.NULL_VAL;
        tradingSessionSubIDWrapper.wrap(this.tradingSessionSubID(), tradingSessionSubIDLength);
        return TradingSessionSubID.decode(tradingSessionSubIDWrapper);
    }




    private OrdTypeRulesGroupDecoder ordTypeRulesGroup = null;
    public OrdTypeRulesGroupDecoder ordTypeRulesGroup()
    {
        return ordTypeRulesGroup;
    }

    private int noOrdTypeRulesGroupCounter = MISSING_INT;

    private boolean hasNoOrdTypeRulesGroupCounter;

    public int noOrdTypeRulesGroupCounter()
    {
        if (!hasNoOrdTypeRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoOrdTypeRulesGroupCounter");
        }

        return noOrdTypeRulesGroupCounter;
    }

    public boolean hasNoOrdTypeRulesGroupCounter()
    {
        return hasNoOrdTypeRulesGroupCounter;
    }




    private OrdTypeRulesGroupIterator ordTypeRulesGroupIterator = new OrdTypeRulesGroupIterator(this);
    public OrdTypeRulesGroupIterator ordTypeRulesGroupIterator()
    {
        return ordTypeRulesGroupIterator.iterator();
    }




    private TimeInForceRulesGroupDecoder timeInForceRulesGroup = null;
    public TimeInForceRulesGroupDecoder timeInForceRulesGroup()
    {
        return timeInForceRulesGroup;
    }

    private int noTimeInForceRulesGroupCounter = MISSING_INT;

    private boolean hasNoTimeInForceRulesGroupCounter;

    public int noTimeInForceRulesGroupCounter()
    {
        if (!hasNoTimeInForceRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoTimeInForceRulesGroupCounter");
        }

        return noTimeInForceRulesGroupCounter;
    }

    public boolean hasNoTimeInForceRulesGroupCounter()
    {
        return hasNoTimeInForceRulesGroupCounter;
    }




    private TimeInForceRulesGroupIterator timeInForceRulesGroupIterator = new TimeInForceRulesGroupIterator(this);
    public TimeInForceRulesGroupIterator timeInForceRulesGroupIterator()
    {
        return timeInForceRulesGroupIterator.iterator();
    }




    private ExecInstRulesGroupDecoder execInstRulesGroup = null;
    public ExecInstRulesGroupDecoder execInstRulesGroup()
    {
        return execInstRulesGroup;
    }

    private int noExecInstRulesGroupCounter = MISSING_INT;

    private boolean hasNoExecInstRulesGroupCounter;

    public int noExecInstRulesGroupCounter()
    {
        if (!hasNoExecInstRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoExecInstRulesGroupCounter");
        }

        return noExecInstRulesGroupCounter;
    }

    public boolean hasNoExecInstRulesGroupCounter()
    {
        return hasNoExecInstRulesGroupCounter;
    }




    private ExecInstRulesGroupIterator execInstRulesGroupIterator = new ExecInstRulesGroupIterator(this);
    public ExecInstRulesGroupIterator execInstRulesGroupIterator()
    {
        return execInstRulesGroupIterator.iterator();
    }




    private MatchRulesGroupDecoder matchRulesGroup = null;
    public MatchRulesGroupDecoder matchRulesGroup()
    {
        return matchRulesGroup;
    }

    private int noMatchRulesGroupCounter = MISSING_INT;

    private boolean hasNoMatchRulesGroupCounter;

    public int noMatchRulesGroupCounter()
    {
        if (!hasNoMatchRulesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMatchRulesGroupCounter");
        }

        return noMatchRulesGroupCounter;
    }

    public boolean hasNoMatchRulesGroupCounter()
    {
        return hasNoMatchRulesGroupCounter;
    }




    private MatchRulesGroupIterator matchRulesGroupIterator = new MatchRulesGroupIterator(this);
    public MatchRulesGroupIterator matchRulesGroupIterator()
    {
        return matchRulesGroupIterator.iterator();
    }




    private MDFeedTypesGroupDecoder mDFeedTypesGroup = null;
    public MDFeedTypesGroupDecoder mDFeedTypesGroup()
    {
        return mDFeedTypesGroup;
    }

    private int noMDFeedTypesGroupCounter = MISSING_INT;

    private boolean hasNoMDFeedTypesGroupCounter;

    public int noMDFeedTypesGroupCounter()
    {
        if (!hasNoMDFeedTypesGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoMDFeedTypesGroupCounter");
        }

        return noMDFeedTypesGroupCounter;
    }

    public boolean hasNoMDFeedTypesGroupCounter()
    {
        return hasNoMDFeedTypesGroupCounter;
    }




    private MDFeedTypesGroupIterator mDFeedTypesGroupIterator = new MDFeedTypesGroupIterator(this);
    public MDFeedTypesGroupIterator mDFeedTypesGroupIterator()
    {
        return mDFeedTypesGroupIterator.iterator();
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode TradingSessionRulesGroup
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        seenFields.clear();
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
            if (!seenFields.add(tag))
            {
                if (next == null)
                {
                    next = new TradingSessionRulesGroupDecoder(trailer, messageFields);
                }
                return position - offset;
            }
            final int valueOffset = equalsPosition + 1;
            int endOfField = buffer.scan(valueOffset, end, START_OF_HEADER);
            if (endOfField == AsciiBuffer.UNKNOWN_INDEX || equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
                rejectReason = 5;
                break;
            }
            final int valueLength = endOfField - valueOffset;
            if (CODEC_VALIDATION_ENABLED)
            {
                if (tag <= 0)
                {
                    invalidTagId = tag;
                    rejectReason = 0;
                }
                else if (valueLength == 0)
                {
                    invalidTagId = tag;
                    rejectReason = 4;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.TRADING_SESSION_ID:
                hasTradingSessionID = true;
                tradingSessionID = buffer.getChars(tradingSessionID, valueOffset, valueLength);
                tradingSessionIDOffset = valueOffset;
                tradingSessionIDLength = valueLength;
                break;

            case Constants.TRADING_SESSION_SUB_ID:
                hasTradingSessionSubID = true;
                tradingSessionSubID = buffer.getChars(tradingSessionSubID, valueOffset, valueLength);
                tradingSessionSubIDOffset = valueOffset;
                tradingSessionSubIDLength = valueLength;
                break;

            case Constants.NO_ORD_TYPE_RULES:
                hasNoOrdTypeRulesGroupCounter = true;
                noOrdTypeRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1237, CODEC_VALIDATION_ENABLED);
                if (ordTypeRulesGroup == null)
                {
                    ordTypeRulesGroup = new OrdTypeRulesGroupDecoder(trailer, messageFields);
                }
                OrdTypeRulesGroupDecoder ordTypeRulesGroupCurrent = ordTypeRulesGroup;
                position = endOfField + 1;
                final int noOrdTypeRulesGroupCounter = this.noOrdTypeRulesGroupCounter;
                for (int i = 0; i < noOrdTypeRulesGroupCounter && position < end; i++)
                {
                    if (ordTypeRulesGroupCurrent != null)
                    {
                        position += ordTypeRulesGroupCurrent.decode(buffer, position, end - position);
                        ordTypeRulesGroupCurrent = ordTypeRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (ordTypeRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_TIME_IN_FORCE_RULES:
                hasNoTimeInForceRulesGroupCounter = true;
                noTimeInForceRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1239, CODEC_VALIDATION_ENABLED);
                if (timeInForceRulesGroup == null)
                {
                    timeInForceRulesGroup = new TimeInForceRulesGroupDecoder(trailer, messageFields);
                }
                TimeInForceRulesGroupDecoder timeInForceRulesGroupCurrent = timeInForceRulesGroup;
                position = endOfField + 1;
                final int noTimeInForceRulesGroupCounter = this.noTimeInForceRulesGroupCounter;
                for (int i = 0; i < noTimeInForceRulesGroupCounter && position < end; i++)
                {
                    if (timeInForceRulesGroupCurrent != null)
                    {
                        position += timeInForceRulesGroupCurrent.decode(buffer, position, end - position);
                        timeInForceRulesGroupCurrent = timeInForceRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (timeInForceRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_EXEC_INST_RULES:
                hasNoExecInstRulesGroupCounter = true;
                noExecInstRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1232, CODEC_VALIDATION_ENABLED);
                if (execInstRulesGroup == null)
                {
                    execInstRulesGroup = new ExecInstRulesGroupDecoder(trailer, messageFields);
                }
                ExecInstRulesGroupDecoder execInstRulesGroupCurrent = execInstRulesGroup;
                position = endOfField + 1;
                final int noExecInstRulesGroupCounter = this.noExecInstRulesGroupCounter;
                for (int i = 0; i < noExecInstRulesGroupCounter && position < end; i++)
                {
                    if (execInstRulesGroupCurrent != null)
                    {
                        position += execInstRulesGroupCurrent.decode(buffer, position, end - position);
                        execInstRulesGroupCurrent = execInstRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (execInstRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_MATCH_RULES:
                hasNoMatchRulesGroupCounter = true;
                noMatchRulesGroupCounter = getInt(buffer, valueOffset, endOfField, 1235, CODEC_VALIDATION_ENABLED);
                if (matchRulesGroup == null)
                {
                    matchRulesGroup = new MatchRulesGroupDecoder(trailer, messageFields);
                }
                MatchRulesGroupDecoder matchRulesGroupCurrent = matchRulesGroup;
                position = endOfField + 1;
                final int noMatchRulesGroupCounter = this.noMatchRulesGroupCounter;
                for (int i = 0; i < noMatchRulesGroupCounter && position < end; i++)
                {
                    if (matchRulesGroupCurrent != null)
                    {
                        position += matchRulesGroupCurrent.decode(buffer, position, end - position);
                        matchRulesGroupCurrent = matchRulesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (matchRulesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_M_D_FEED_TYPES:
                hasNoMDFeedTypesGroupCounter = true;
                noMDFeedTypesGroupCounter = getInt(buffer, valueOffset, endOfField, 1141, CODEC_VALIDATION_ENABLED);
                if (mDFeedTypesGroup == null)
                {
                    mDFeedTypesGroup = new MDFeedTypesGroupDecoder(trailer, messageFields);
                }
                MDFeedTypesGroupDecoder mDFeedTypesGroupCurrent = mDFeedTypesGroup;
                position = endOfField + 1;
                final int noMDFeedTypesGroupCounter = this.noMDFeedTypesGroupCounter;
                for (int i = 0; i < noMDFeedTypesGroupCounter && position < end; i++)
                {
                    if (mDFeedTypesGroupCurrent != null)
                    {
                        position += mDFeedTypesGroupCurrent.decode(buffer, position, end - position);
                        mDFeedTypesGroupCurrent = mDFeedTypesGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (mDFeedTypesGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;



            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    seenFields.remove(tag);
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag) || messageFields.contains(tag)))
                {
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        return position - offset;
    }

    public void reset()
    {
        this.resetTradingSessionID();
        this.resetTradingSessionSubID();
        this.resetOrdTypeRulesGroup();
        this.resetTimeInForceRulesGroup();
        this.resetExecInstRulesGroup();
        this.resetMatchRulesGroup();
        this.resetMDFeedTypesGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetTradingSessionID()
    {
        hasTradingSessionID = false;
    }

    public void resetTradingSessionSubID()
    {
        hasTradingSessionSubID = false;
    }

    public void resetOrdTypeRulesGroup()
    {
        for (final OrdTypeRulesGroupDecoder ordTypeRulesGroupDecoder : ordTypeRulesGroupIterator.iterator())
        {
            ordTypeRulesGroupDecoder.reset();
            if (ordTypeRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noOrdTypeRulesGroupCounter = MISSING_INT;
        hasNoOrdTypeRulesGroupCounter = false;
    }

    public void resetTimeInForceRulesGroup()
    {
        for (final TimeInForceRulesGroupDecoder timeInForceRulesGroupDecoder : timeInForceRulesGroupIterator.iterator())
        {
            timeInForceRulesGroupDecoder.reset();
            if (timeInForceRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noTimeInForceRulesGroupCounter = MISSING_INT;
        hasNoTimeInForceRulesGroupCounter = false;
    }

    public void resetExecInstRulesGroup()
    {
        for (final ExecInstRulesGroupDecoder execInstRulesGroupDecoder : execInstRulesGroupIterator.iterator())
        {
            execInstRulesGroupDecoder.reset();
            if (execInstRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noExecInstRulesGroupCounter = MISSING_INT;
        hasNoExecInstRulesGroupCounter = false;
    }

    public void resetMatchRulesGroup()
    {
        for (final MatchRulesGroupDecoder matchRulesGroupDecoder : matchRulesGroupIterator.iterator())
        {
            matchRulesGroupDecoder.reset();
            if (matchRulesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMatchRulesGroupCounter = MISSING_INT;
        hasNoMatchRulesGroupCounter = false;
    }

    public void resetMDFeedTypesGroup()
    {
        for (final MDFeedTypesGroupDecoder mDFeedTypesGroupDecoder : mDFeedTypesGroupIterator.iterator())
        {
            mDFeedTypesGroupDecoder.reset();
            if (mDFeedTypesGroupDecoder.next() == null)
            {
                break;
            }
        }
        noMDFeedTypesGroupCounter = MISSING_INT;
        hasNoMDFeedTypesGroupCounter = false;
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
        builder.append("\"MessageName\": \"TradingSessionRulesGroup\",\n");
        if (hasTradingSessionID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionID\": \"");
            builder.append(this.tradingSessionID(), 0, tradingSessionIDLength());
            builder.append("\",\n");
        }

        if (hasTradingSessionSubID())
        {
            indent(builder, level);
            builder.append("\"TradingSessionSubID\": \"");
            builder.append(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
            builder.append("\",\n");
        }

    if (hasNoOrdTypeRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"OrdTypeRulesGroup\": [\n");
        OrdTypeRulesGroupDecoder ordTypeRulesGroup = this.ordTypeRulesGroup;
        for (int i = 0, size = this.noOrdTypeRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            ordTypeRulesGroup.appendTo(builder, level + 1);            if (ordTypeRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            ordTypeRulesGroup = ordTypeRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoTimeInForceRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"TimeInForceRulesGroup\": [\n");
        TimeInForceRulesGroupDecoder timeInForceRulesGroup = this.timeInForceRulesGroup;
        for (int i = 0, size = this.noTimeInForceRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            timeInForceRulesGroup.appendTo(builder, level + 1);            if (timeInForceRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            timeInForceRulesGroup = timeInForceRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoExecInstRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"ExecInstRulesGroup\": [\n");
        ExecInstRulesGroupDecoder execInstRulesGroup = this.execInstRulesGroup;
        for (int i = 0, size = this.noExecInstRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            execInstRulesGroup.appendTo(builder, level + 1);            if (execInstRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            execInstRulesGroup = execInstRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoMatchRulesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MatchRulesGroup\": [\n");
        MatchRulesGroupDecoder matchRulesGroup = this.matchRulesGroup;
        for (int i = 0, size = this.noMatchRulesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            matchRulesGroup.appendTo(builder, level + 1);            if (matchRulesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            matchRulesGroup = matchRulesGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoMDFeedTypesGroupCounter)
    {
        indent(builder, level);
        builder.append("\"MDFeedTypesGroup\": [\n");
        MDFeedTypesGroupDecoder mDFeedTypesGroup = this.mDFeedTypesGroup;
        for (int i = 0, size = this.noMDFeedTypesGroupCounter; i < size; i++)
        {
            indent(builder, level);
            mDFeedTypesGroup.appendTo(builder, level + 1);            if (mDFeedTypesGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            mDFeedTypesGroup = mDFeedTypesGroup.next();        }
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
    public TradingSessionRulesGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((TradingSessionRulesGroupEncoder)encoder);
    }

    public TradingSessionRulesGroupEncoder toEncoder(final TradingSessionRulesGroupEncoder encoder)
    {
        encoder.reset();
        if (hasTradingSessionID())
        {
            encoder.tradingSessionID(this.tradingSessionID(), 0, tradingSessionIDLength());
        }

        if (hasTradingSessionSubID())
        {
            encoder.tradingSessionSubID(this.tradingSessionSubID(), 0, tradingSessionSubIDLength());
        }


        final TradingSessionRulesEncoder tradingSessionRules = encoder.tradingSessionRules();
        final OrdTypeRulesEncoder ordTypeRules = tradingSessionRules.ordTypeRules();        if (hasNoOrdTypeRulesGroupCounter)
        {
            final int size = this.noOrdTypeRulesGroupCounter;
            OrdTypeRulesGroupDecoder ordTypeRulesGroup = this.ordTypeRulesGroup;
            OrdTypeRulesGroupEncoder ordTypeRulesGroupEncoder = ordTypeRules.ordTypeRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (ordTypeRulesGroup != null)
                {
                    ordTypeRulesGroup.toEncoder(ordTypeRulesGroupEncoder);
                    ordTypeRulesGroup = ordTypeRulesGroup.next();
                    ordTypeRulesGroupEncoder = ordTypeRulesGroupEncoder.next();
                }
            }
        }



        final TimeInForceRulesEncoder timeInForceRules = tradingSessionRules.timeInForceRules();        if (hasNoTimeInForceRulesGroupCounter)
        {
            final int size = this.noTimeInForceRulesGroupCounter;
            TimeInForceRulesGroupDecoder timeInForceRulesGroup = this.timeInForceRulesGroup;
            TimeInForceRulesGroupEncoder timeInForceRulesGroupEncoder = timeInForceRules.timeInForceRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (timeInForceRulesGroup != null)
                {
                    timeInForceRulesGroup.toEncoder(timeInForceRulesGroupEncoder);
                    timeInForceRulesGroup = timeInForceRulesGroup.next();
                    timeInForceRulesGroupEncoder = timeInForceRulesGroupEncoder.next();
                }
            }
        }



        final ExecInstRulesEncoder execInstRules = tradingSessionRules.execInstRules();        if (hasNoExecInstRulesGroupCounter)
        {
            final int size = this.noExecInstRulesGroupCounter;
            ExecInstRulesGroupDecoder execInstRulesGroup = this.execInstRulesGroup;
            ExecInstRulesGroupEncoder execInstRulesGroupEncoder = execInstRules.execInstRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (execInstRulesGroup != null)
                {
                    execInstRulesGroup.toEncoder(execInstRulesGroupEncoder);
                    execInstRulesGroup = execInstRulesGroup.next();
                    execInstRulesGroupEncoder = execInstRulesGroupEncoder.next();
                }
            }
        }



        final MatchRulesEncoder matchRules = tradingSessionRules.matchRules();        if (hasNoMatchRulesGroupCounter)
        {
            final int size = this.noMatchRulesGroupCounter;
            MatchRulesGroupDecoder matchRulesGroup = this.matchRulesGroup;
            MatchRulesGroupEncoder matchRulesGroupEncoder = matchRules.matchRulesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (matchRulesGroup != null)
                {
                    matchRulesGroup.toEncoder(matchRulesGroupEncoder);
                    matchRulesGroup = matchRulesGroup.next();
                    matchRulesGroupEncoder = matchRulesGroupEncoder.next();
                }
            }
        }



        final MarketDataFeedTypesEncoder marketDataFeedTypes = tradingSessionRules.marketDataFeedTypes();        if (hasNoMDFeedTypesGroupCounter)
        {
            final int size = this.noMDFeedTypesGroupCounter;
            MDFeedTypesGroupDecoder mDFeedTypesGroup = this.mDFeedTypesGroup;
            MDFeedTypesGroupEncoder mDFeedTypesGroupEncoder = marketDataFeedTypes.mDFeedTypesGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (mDFeedTypesGroup != null)
                {
                    mDFeedTypesGroup.toEncoder(mDFeedTypesGroupEncoder);
                    mDFeedTypesGroup = mDFeedTypesGroup.next();
                    mDFeedTypesGroupEncoder = mDFeedTypesGroupEncoder.next();
                }
            }
        }


        return encoder;
    }

}
    public class TradingSessionRulesGroupIterator implements Iterable<TradingSessionRulesGroupDecoder>, java.util.Iterator<TradingSessionRulesGroupDecoder>
    {
        private final TradingSessionRulesGrpDecoder parent;
        private int remainder;
        private TradingSessionRulesGroupDecoder current;

        public TradingSessionRulesGroupIterator(final TradingSessionRulesGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public TradingSessionRulesGroupDecoder next()
        {
            remainder--;
            final TradingSessionRulesGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoTradingSessionRulesGroupCounter() ? parent.noTradingSessionRulesGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.tradingSessionRulesGroup();
        }
        public TradingSessionRulesGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public TradingSessionRulesGroupIterator tradingSessionRulesGroupIterator();
    public int noTradingSessionRulesGroupCounter();
    public boolean hasNoTradingSessionRulesGroupCounter();
    public TradingSessionRulesGroupDecoder tradingSessionRulesGroup();

}
