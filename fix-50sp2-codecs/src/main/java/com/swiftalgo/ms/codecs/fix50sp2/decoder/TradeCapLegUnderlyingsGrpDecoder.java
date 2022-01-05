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
import com.swiftalgo.ms.codecs.fix50sp2.builder.TradeCapLegUnderlyingsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.TradeCapLegUnderlyingsGrpEncoder.OfLegUnderlyingsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegInstrumentEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.UnderlyingLegSecurityAltIDGrpEncoder.UnderlyingLegSecurityAltIDGroupEncoder;

public interface TradeCapLegUnderlyingsGrpDecoder 
{



public class OfLegUnderlyingsGroupDecoder extends CommonDecoderImpl implements UnderlyingLegInstrumentDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(30);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SYMBOL);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SYMBOL_SFX);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ID);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_ID_SOURCE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_C_F_I_CODE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_SUB_TYPE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_MONTH_YEAR);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_DATE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_MATURITY_TIME);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_STRIKE_PRICE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_OPT_ATTRIBUTE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_PUT_OR_CALL);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_EXCHANGE);
            GROUP_FIELDS.add(Constants.UNDERLYING_LEG_SECURITY_DESC);
        }
    }

    public final IntHashSet ALL_GROUP_FIELDS = new IntHashSet(0);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
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
        if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            {
                int count = 0;
                final UnderlyingLegSecurityAltIDGroupIterator iterator = underlyingLegSecurityAltIDGroupIterator.iterator();
                for (final UnderlyingLegSecurityAltIDGroupDecoder group : iterator)
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
                    invalidTagId = 1334;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    private final TrailerDecoder trailer;
    private final IntHashSet messageFields;
    public OfLegUnderlyingsGroupDecoder(final TrailerDecoder trailer, final IntHashSet messageFields)
    {
        this.trailer = trailer;
        this.messageFields = messageFields;
    }

    private OfLegUnderlyingsGroupDecoder next = null;

    public OfLegUnderlyingsGroupDecoder next()
    {
        return next;
    }

    private IntHashSet seenFields = new IntHashSet(2);


    private char[] underlyingLegSymbol = new char[1];

    private boolean hasUnderlyingLegSymbol;

    public char[] underlyingLegSymbol()
    {
        if (!hasUnderlyingLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbol");
        }

        return underlyingLegSymbol;
    }

    public boolean hasUnderlyingLegSymbol()
    {
        return hasUnderlyingLegSymbol;
    }


    private int underlyingLegSymbolOffset;

    private int underlyingLegSymbolLength;

    public int underlyingLegSymbolLength()
    {
        if (!hasUnderlyingLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbol");
        }

        return underlyingLegSymbolLength;
    }

    public String underlyingLegSymbolAsString()
    {
        return hasUnderlyingLegSymbol ? new String(underlyingLegSymbol, 0, underlyingLegSymbolLength) : null;
    }

    public void underlyingLegSymbol(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSymbol)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbol");
        }

        view.wrap(buffer, underlyingLegSymbolOffset, underlyingLegSymbolLength);
    }


    private char[] underlyingLegSymbolSfx = new char[1];

    private boolean hasUnderlyingLegSymbolSfx;

    public char[] underlyingLegSymbolSfx()
    {
        if (!hasUnderlyingLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbolSfx");
        }

        return underlyingLegSymbolSfx;
    }

    public boolean hasUnderlyingLegSymbolSfx()
    {
        return hasUnderlyingLegSymbolSfx;
    }


    private int underlyingLegSymbolSfxOffset;

    private int underlyingLegSymbolSfxLength;

    public int underlyingLegSymbolSfxLength()
    {
        if (!hasUnderlyingLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbolSfx");
        }

        return underlyingLegSymbolSfxLength;
    }

    public String underlyingLegSymbolSfxAsString()
    {
        return hasUnderlyingLegSymbolSfx ? new String(underlyingLegSymbolSfx, 0, underlyingLegSymbolSfxLength) : null;
    }

    public void underlyingLegSymbolSfx(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSymbolSfx)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSymbolSfx");
        }

        view.wrap(buffer, underlyingLegSymbolSfxOffset, underlyingLegSymbolSfxLength);
    }


    private char[] underlyingLegSecurityID = new char[1];

    private boolean hasUnderlyingLegSecurityID;

    public char[] underlyingLegSecurityID()
    {
        if (!hasUnderlyingLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityID");
        }

        return underlyingLegSecurityID;
    }

    public boolean hasUnderlyingLegSecurityID()
    {
        return hasUnderlyingLegSecurityID;
    }


    private int underlyingLegSecurityIDOffset;

    private int underlyingLegSecurityIDLength;

    public int underlyingLegSecurityIDLength()
    {
        if (!hasUnderlyingLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityID");
        }

        return underlyingLegSecurityIDLength;
    }

    public String underlyingLegSecurityIDAsString()
    {
        return hasUnderlyingLegSecurityID ? new String(underlyingLegSecurityID, 0, underlyingLegSecurityIDLength) : null;
    }

    public void underlyingLegSecurityID(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityID)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityID");
        }

        view.wrap(buffer, underlyingLegSecurityIDOffset, underlyingLegSecurityIDLength);
    }


    private char[] underlyingLegSecurityIDSource = new char[1];

    private boolean hasUnderlyingLegSecurityIDSource;

    public char[] underlyingLegSecurityIDSource()
    {
        if (!hasUnderlyingLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityIDSource");
        }

        return underlyingLegSecurityIDSource;
    }

    public boolean hasUnderlyingLegSecurityIDSource()
    {
        return hasUnderlyingLegSecurityIDSource;
    }


    private int underlyingLegSecurityIDSourceOffset;

    private int underlyingLegSecurityIDSourceLength;

    public int underlyingLegSecurityIDSourceLength()
    {
        if (!hasUnderlyingLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityIDSource");
        }

        return underlyingLegSecurityIDSourceLength;
    }

    public String underlyingLegSecurityIDSourceAsString()
    {
        return hasUnderlyingLegSecurityIDSource ? new String(underlyingLegSecurityIDSource, 0, underlyingLegSecurityIDSourceLength) : null;
    }

    public void underlyingLegSecurityIDSource(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityIDSource");
        }

        view.wrap(buffer, underlyingLegSecurityIDSourceOffset, underlyingLegSecurityIDSourceLength);
    }




    private UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroup = null;
    public UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroup()
    {
        return underlyingLegSecurityAltIDGroup;
    }

    private int noUnderlyingLegSecurityAltIDGroupCounter = MISSING_INT;

    private boolean hasNoUnderlyingLegSecurityAltIDGroupCounter;

    public int noUnderlyingLegSecurityAltIDGroupCounter()
    {
        if (!hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoUnderlyingLegSecurityAltIDGroupCounter");
        }

        return noUnderlyingLegSecurityAltIDGroupCounter;
    }

    public boolean hasNoUnderlyingLegSecurityAltIDGroupCounter()
    {
        return hasNoUnderlyingLegSecurityAltIDGroupCounter;
    }




    private UnderlyingLegSecurityAltIDGroupIterator underlyingLegSecurityAltIDGroupIterator = new UnderlyingLegSecurityAltIDGroupIterator(this);
    public UnderlyingLegSecurityAltIDGroupIterator underlyingLegSecurityAltIDGroupIterator()
    {
        return underlyingLegSecurityAltIDGroupIterator.iterator();
    }


    private char[] underlyingLegCFICode = new char[1];

    private boolean hasUnderlyingLegCFICode;

    public char[] underlyingLegCFICode()
    {
        if (!hasUnderlyingLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegCFICode");
        }

        return underlyingLegCFICode;
    }

    public boolean hasUnderlyingLegCFICode()
    {
        return hasUnderlyingLegCFICode;
    }


    private int underlyingLegCFICodeOffset;

    private int underlyingLegCFICodeLength;

    public int underlyingLegCFICodeLength()
    {
        if (!hasUnderlyingLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegCFICode");
        }

        return underlyingLegCFICodeLength;
    }

    public String underlyingLegCFICodeAsString()
    {
        return hasUnderlyingLegCFICode ? new String(underlyingLegCFICode, 0, underlyingLegCFICodeLength) : null;
    }

    public void underlyingLegCFICode(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegCFICode");
        }

        view.wrap(buffer, underlyingLegCFICodeOffset, underlyingLegCFICodeLength);
    }


    private char[] underlyingLegSecurityType = new char[1];

    private boolean hasUnderlyingLegSecurityType;

    public char[] underlyingLegSecurityType()
    {
        if (!hasUnderlyingLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityType");
        }

        return underlyingLegSecurityType;
    }

    public boolean hasUnderlyingLegSecurityType()
    {
        return hasUnderlyingLegSecurityType;
    }


    private int underlyingLegSecurityTypeOffset;

    private int underlyingLegSecurityTypeLength;

    public int underlyingLegSecurityTypeLength()
    {
        if (!hasUnderlyingLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityType");
        }

        return underlyingLegSecurityTypeLength;
    }

    public String underlyingLegSecurityTypeAsString()
    {
        return hasUnderlyingLegSecurityType ? new String(underlyingLegSecurityType, 0, underlyingLegSecurityTypeLength) : null;
    }

    public void underlyingLegSecurityType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityType");
        }

        view.wrap(buffer, underlyingLegSecurityTypeOffset, underlyingLegSecurityTypeLength);
    }


    private char[] underlyingLegSecuritySubType = new char[1];

    private boolean hasUnderlyingLegSecuritySubType;

    public char[] underlyingLegSecuritySubType()
    {
        if (!hasUnderlyingLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecuritySubType");
        }

        return underlyingLegSecuritySubType;
    }

    public boolean hasUnderlyingLegSecuritySubType()
    {
        return hasUnderlyingLegSecuritySubType;
    }


    private int underlyingLegSecuritySubTypeOffset;

    private int underlyingLegSecuritySubTypeLength;

    public int underlyingLegSecuritySubTypeLength()
    {
        if (!hasUnderlyingLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecuritySubType");
        }

        return underlyingLegSecuritySubTypeLength;
    }

    public String underlyingLegSecuritySubTypeAsString()
    {
        return hasUnderlyingLegSecuritySubType ? new String(underlyingLegSecuritySubType, 0, underlyingLegSecuritySubTypeLength) : null;
    }

    public void underlyingLegSecuritySubType(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecuritySubType)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecuritySubType");
        }

        view.wrap(buffer, underlyingLegSecuritySubTypeOffset, underlyingLegSecuritySubTypeLength);
    }


    private byte[] underlyingLegMaturityMonthYear = new byte[8];

    private boolean hasUnderlyingLegMaturityMonthYear;

    public byte[] underlyingLegMaturityMonthYear()
    {
        if (!hasUnderlyingLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityMonthYear");
        }

        return underlyingLegMaturityMonthYear;
    }

    public boolean hasUnderlyingLegMaturityMonthYear()
    {
        return hasUnderlyingLegMaturityMonthYear;
    }


    private int underlyingLegMaturityMonthYearOffset;

    private int underlyingLegMaturityMonthYearLength;

    public int underlyingLegMaturityMonthYearLength()
    {
        if (!hasUnderlyingLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityMonthYear");
        }

        return underlyingLegMaturityMonthYearLength;
    }

    public String underlyingLegMaturityMonthYearAsString()
    {
        return hasUnderlyingLegMaturityMonthYear ? new String(underlyingLegMaturityMonthYear, 0, underlyingLegMaturityMonthYearLength) : null;
    }

    public void underlyingLegMaturityMonthYear(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegMaturityMonthYear)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityMonthYear");
        }

        view.wrap(buffer, underlyingLegMaturityMonthYearOffset, underlyingLegMaturityMonthYearLength);
    }


    private byte[] underlyingLegMaturityDate = new byte[8];

    private boolean hasUnderlyingLegMaturityDate;

    public byte[] underlyingLegMaturityDate()
    {
        if (!hasUnderlyingLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityDate");
        }

        return underlyingLegMaturityDate;
    }

    public boolean hasUnderlyingLegMaturityDate()
    {
        return hasUnderlyingLegMaturityDate;
    }


    private int underlyingLegMaturityDateOffset;

    private int underlyingLegMaturityDateLength;

    public int underlyingLegMaturityDateLength()
    {
        if (!hasUnderlyingLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityDate");
        }

        return underlyingLegMaturityDateLength;
    }

    public String underlyingLegMaturityDateAsString()
    {
        return hasUnderlyingLegMaturityDate ? new String(underlyingLegMaturityDate, 0, underlyingLegMaturityDateLength) : null;
    }

    public void underlyingLegMaturityDate(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegMaturityDate)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityDate");
        }

        view.wrap(buffer, underlyingLegMaturityDateOffset, underlyingLegMaturityDateLength);
    }


    private byte[] underlyingLegMaturityTime = new byte[19];

    private boolean hasUnderlyingLegMaturityTime;

    public byte[] underlyingLegMaturityTime()
    {
        if (!hasUnderlyingLegMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityTime");
        }

        return underlyingLegMaturityTime;
    }

    public boolean hasUnderlyingLegMaturityTime()
    {
        return hasUnderlyingLegMaturityTime;
    }


    private int underlyingLegMaturityTimeOffset;

    private int underlyingLegMaturityTimeLength;

    public int underlyingLegMaturityTimeLength()
    {
        if (!hasUnderlyingLegMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityTime");
        }

        return underlyingLegMaturityTimeLength;
    }

    public String underlyingLegMaturityTimeAsString()
    {
        return hasUnderlyingLegMaturityTime ? new String(underlyingLegMaturityTime, 0, underlyingLegMaturityTimeLength) : null;
    }

    public void underlyingLegMaturityTime(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegMaturityTime)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegMaturityTime");
        }

        view.wrap(buffer, underlyingLegMaturityTimeOffset, underlyingLegMaturityTimeLength);
    }


    private DecimalFloat underlyingLegStrikePrice = DecimalFloat.newNaNValue();

    private boolean hasUnderlyingLegStrikePrice;

    public DecimalFloat underlyingLegStrikePrice()
    {
        if (!hasUnderlyingLegStrikePrice)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegStrikePrice");
        }

        return underlyingLegStrikePrice;
    }

    public boolean hasUnderlyingLegStrikePrice()
    {
        return hasUnderlyingLegStrikePrice;
    }



    private char underlyingLegOptAttribute = MISSING_CHAR;

    private boolean hasUnderlyingLegOptAttribute;

    public char underlyingLegOptAttribute()
    {
        if (!hasUnderlyingLegOptAttribute)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegOptAttribute");
        }

        return underlyingLegOptAttribute;
    }

    public boolean hasUnderlyingLegOptAttribute()
    {
        return hasUnderlyingLegOptAttribute;
    }



    private int underlyingLegPutOrCall = MISSING_INT;

    private boolean hasUnderlyingLegPutOrCall;

    public int underlyingLegPutOrCall()
    {
        if (!hasUnderlyingLegPutOrCall)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegPutOrCall");
        }

        return underlyingLegPutOrCall;
    }

    public boolean hasUnderlyingLegPutOrCall()
    {
        return hasUnderlyingLegPutOrCall;
    }



    private char[] underlyingLegSecurityExchange = new char[1];

    private boolean hasUnderlyingLegSecurityExchange;

    public char[] underlyingLegSecurityExchange()
    {
        if (!hasUnderlyingLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityExchange");
        }

        return underlyingLegSecurityExchange;
    }

    public boolean hasUnderlyingLegSecurityExchange()
    {
        return hasUnderlyingLegSecurityExchange;
    }


    private int underlyingLegSecurityExchangeOffset;

    private int underlyingLegSecurityExchangeLength;

    public int underlyingLegSecurityExchangeLength()
    {
        if (!hasUnderlyingLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityExchange");
        }

        return underlyingLegSecurityExchangeLength;
    }

    public String underlyingLegSecurityExchangeAsString()
    {
        return hasUnderlyingLegSecurityExchange ? new String(underlyingLegSecurityExchange, 0, underlyingLegSecurityExchangeLength) : null;
    }

    public void underlyingLegSecurityExchange(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityExchange)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityExchange");
        }

        view.wrap(buffer, underlyingLegSecurityExchangeOffset, underlyingLegSecurityExchangeLength);
    }


    private char[] underlyingLegSecurityDesc = new char[1];

    private boolean hasUnderlyingLegSecurityDesc;

    public char[] underlyingLegSecurityDesc()
    {
        if (!hasUnderlyingLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityDesc");
        }

        return underlyingLegSecurityDesc;
    }

    public boolean hasUnderlyingLegSecurityDesc()
    {
        return hasUnderlyingLegSecurityDesc;
    }


    private int underlyingLegSecurityDescOffset;

    private int underlyingLegSecurityDescLength;

    public int underlyingLegSecurityDescLength()
    {
        if (!hasUnderlyingLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityDesc");
        }

        return underlyingLegSecurityDescLength;
    }

    public String underlyingLegSecurityDescAsString()
    {
        return hasUnderlyingLegSecurityDesc ? new String(underlyingLegSecurityDesc, 0, underlyingLegSecurityDescLength) : null;
    }

    public void underlyingLegSecurityDesc(final AsciiSequenceView view)
    {
        if (!hasUnderlyingLegSecurityDesc)
        {
            throw new IllegalArgumentException("No value for optional field: UnderlyingLegSecurityDesc");
        }

        view.wrap(buffer, underlyingLegSecurityDescOffset, underlyingLegSecurityDescLength);
    }



    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode OfLegUnderlyingsGroup
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
                    next = new OfLegUnderlyingsGroupDecoder(trailer, messageFields);
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
            case Constants.UNDERLYING_LEG_SYMBOL:
                hasUnderlyingLegSymbol = true;
                underlyingLegSymbol = buffer.getChars(underlyingLegSymbol, valueOffset, valueLength);
                underlyingLegSymbolOffset = valueOffset;
                underlyingLegSymbolLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SYMBOL_SFX:
                hasUnderlyingLegSymbolSfx = true;
                underlyingLegSymbolSfx = buffer.getChars(underlyingLegSymbolSfx, valueOffset, valueLength);
                underlyingLegSymbolSfxOffset = valueOffset;
                underlyingLegSymbolSfxLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_ID:
                hasUnderlyingLegSecurityID = true;
                underlyingLegSecurityID = buffer.getChars(underlyingLegSecurityID, valueOffset, valueLength);
                underlyingLegSecurityIDOffset = valueOffset;
                underlyingLegSecurityIDLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_ID_SOURCE:
                hasUnderlyingLegSecurityIDSource = true;
                underlyingLegSecurityIDSource = buffer.getChars(underlyingLegSecurityIDSource, valueOffset, valueLength);
                underlyingLegSecurityIDSourceOffset = valueOffset;
                underlyingLegSecurityIDSourceLength = valueLength;
                break;

            case Constants.NO_UNDERLYING_LEG_SECURITY_ALT_ID:
                hasNoUnderlyingLegSecurityAltIDGroupCounter = true;
                noUnderlyingLegSecurityAltIDGroupCounter = getInt(buffer, valueOffset, endOfField, 1334, CODEC_VALIDATION_ENABLED);
                if (underlyingLegSecurityAltIDGroup == null)
                {
                    underlyingLegSecurityAltIDGroup = new UnderlyingLegSecurityAltIDGroupDecoder(trailer, messageFields);
                }
                UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroupCurrent = underlyingLegSecurityAltIDGroup;
                position = endOfField + 1;
                final int noUnderlyingLegSecurityAltIDGroupCounter = this.noUnderlyingLegSecurityAltIDGroupCounter;
                for (int i = 0; i < noUnderlyingLegSecurityAltIDGroupCounter && position < end; i++)
                {
                    if (underlyingLegSecurityAltIDGroupCurrent != null)
                    {
                        position += underlyingLegSecurityAltIDGroupCurrent.decode(buffer, position, end - position);
                        underlyingLegSecurityAltIDGroupCurrent = underlyingLegSecurityAltIDGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (underlyingLegSecurityAltIDGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.UNDERLYING_LEG_C_F_I_CODE:
                hasUnderlyingLegCFICode = true;
                underlyingLegCFICode = buffer.getChars(underlyingLegCFICode, valueOffset, valueLength);
                underlyingLegCFICodeOffset = valueOffset;
                underlyingLegCFICodeLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_TYPE:
                hasUnderlyingLegSecurityType = true;
                underlyingLegSecurityType = buffer.getChars(underlyingLegSecurityType, valueOffset, valueLength);
                underlyingLegSecurityTypeOffset = valueOffset;
                underlyingLegSecurityTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_SUB_TYPE:
                hasUnderlyingLegSecuritySubType = true;
                underlyingLegSecuritySubType = buffer.getChars(underlyingLegSecuritySubType, valueOffset, valueLength);
                underlyingLegSecuritySubTypeOffset = valueOffset;
                underlyingLegSecuritySubTypeLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_MATURITY_MONTH_YEAR:
                hasUnderlyingLegMaturityMonthYear = true;
                underlyingLegMaturityMonthYear = buffer.getBytes(underlyingLegMaturityMonthYear, valueOffset, valueLength);
                underlyingLegMaturityMonthYearOffset = valueOffset;
                underlyingLegMaturityMonthYearLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_MATURITY_DATE:
                hasUnderlyingLegMaturityDate = true;
                underlyingLegMaturityDate = buffer.getBytes(underlyingLegMaturityDate, valueOffset, valueLength);
                underlyingLegMaturityDateOffset = valueOffset;
                underlyingLegMaturityDateLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_MATURITY_TIME:
                hasUnderlyingLegMaturityTime = true;
                underlyingLegMaturityTime = buffer.getBytes(underlyingLegMaturityTime, valueOffset, valueLength);
                underlyingLegMaturityTimeOffset = valueOffset;
                underlyingLegMaturityTimeLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_STRIKE_PRICE:
                hasUnderlyingLegStrikePrice = true;
                underlyingLegStrikePrice = getFloat(buffer, underlyingLegStrikePrice, valueOffset, valueLength, 1340, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_LEG_OPT_ATTRIBUTE:
                hasUnderlyingLegOptAttribute = true;
                underlyingLegOptAttribute = buffer.getChar(valueOffset);
                break;

            case Constants.UNDERLYING_LEG_PUT_OR_CALL:
                hasUnderlyingLegPutOrCall = true;
                underlyingLegPutOrCall = getInt(buffer, valueOffset, endOfField, 1343, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.UNDERLYING_LEG_SECURITY_EXCHANGE:
                hasUnderlyingLegSecurityExchange = true;
                underlyingLegSecurityExchange = buffer.getChars(underlyingLegSecurityExchange, valueOffset, valueLength);
                underlyingLegSecurityExchangeOffset = valueOffset;
                underlyingLegSecurityExchangeLength = valueLength;
                break;

            case Constants.UNDERLYING_LEG_SECURITY_DESC:
                hasUnderlyingLegSecurityDesc = true;
                underlyingLegSecurityDesc = buffer.getChars(underlyingLegSecurityDesc, valueOffset, valueLength);
                underlyingLegSecurityDescOffset = valueOffset;
                underlyingLegSecurityDescLength = valueLength;
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
        this.resetUnderlyingLegSymbol();
        this.resetUnderlyingLegSymbolSfx();
        this.resetUnderlyingLegSecurityID();
        this.resetUnderlyingLegSecurityIDSource();
        this.resetUnderlyingLegCFICode();
        this.resetUnderlyingLegSecurityType();
        this.resetUnderlyingLegSecuritySubType();
        this.resetUnderlyingLegMaturityMonthYear();
        this.resetUnderlyingLegMaturityDate();
        this.resetUnderlyingLegMaturityTime();
        this.resetUnderlyingLegStrikePrice();
        this.resetUnderlyingLegOptAttribute();
        this.resetUnderlyingLegPutOrCall();
        this.resetUnderlyingLegSecurityExchange();
        this.resetUnderlyingLegSecurityDesc();
        this.resetUnderlyingLegSecurityAltIDGroup();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
        }
    }

    public void resetUnderlyingLegSymbol()
    {
        hasUnderlyingLegSymbol = false;
    }

    public void resetUnderlyingLegSymbolSfx()
    {
        hasUnderlyingLegSymbolSfx = false;
    }

    public void resetUnderlyingLegSecurityID()
    {
        hasUnderlyingLegSecurityID = false;
    }

    public void resetUnderlyingLegSecurityIDSource()
    {
        hasUnderlyingLegSecurityIDSource = false;
    }

    public void resetUnderlyingLegCFICode()
    {
        hasUnderlyingLegCFICode = false;
    }

    public void resetUnderlyingLegSecurityType()
    {
        hasUnderlyingLegSecurityType = false;
    }

    public void resetUnderlyingLegSecuritySubType()
    {
        hasUnderlyingLegSecuritySubType = false;
    }

    public void resetUnderlyingLegMaturityMonthYear()
    {
        hasUnderlyingLegMaturityMonthYear = false;
    }

    public void resetUnderlyingLegMaturityDate()
    {
        hasUnderlyingLegMaturityDate = false;
    }

    public void resetUnderlyingLegMaturityTime()
    {
        hasUnderlyingLegMaturityTime = false;
    }

    public void resetUnderlyingLegStrikePrice()
    {
        hasUnderlyingLegStrikePrice = false;
    }

    public void resetUnderlyingLegOptAttribute()
    {
        hasUnderlyingLegOptAttribute = false;
    }

    public void resetUnderlyingLegPutOrCall()
    {
        hasUnderlyingLegPutOrCall = false;
    }

    public void resetUnderlyingLegSecurityExchange()
    {
        hasUnderlyingLegSecurityExchange = false;
    }

    public void resetUnderlyingLegSecurityDesc()
    {
        hasUnderlyingLegSecurityDesc = false;
    }

    public void resetUnderlyingLegSecurityAltIDGroup()
    {
        for (final UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroupDecoder : underlyingLegSecurityAltIDGroupIterator.iterator())
        {
            underlyingLegSecurityAltIDGroupDecoder.reset();
            if (underlyingLegSecurityAltIDGroupDecoder.next() == null)
            {
                break;
            }
        }
        noUnderlyingLegSecurityAltIDGroupCounter = MISSING_INT;
        hasNoUnderlyingLegSecurityAltIDGroupCounter = false;
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
        builder.append("\"MessageName\": \"OfLegUnderlyingsGroup\",\n");
        if (hasUnderlyingLegSymbol())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSymbol\": \"");
            builder.append(this.underlyingLegSymbol(), 0, underlyingLegSymbolLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSymbolSfx())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSymbolSfx\": \"");
            builder.append(this.underlyingLegSymbolSfx(), 0, underlyingLegSymbolSfxLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityID())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityID\": \"");
            builder.append(this.underlyingLegSecurityID(), 0, underlyingLegSecurityIDLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityIDSource())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityIDSource\": \"");
            builder.append(this.underlyingLegSecurityIDSource(), 0, underlyingLegSecurityIDSourceLength());
            builder.append("\",\n");
        }

    if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
    {
        indent(builder, level);
        builder.append("\"UnderlyingLegSecurityAltIDGroup\": [\n");
        UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroup = this.underlyingLegSecurityAltIDGroup;
        for (int i = 0, size = this.noUnderlyingLegSecurityAltIDGroupCounter; i < size; i++)
        {
            indent(builder, level);
            underlyingLegSecurityAltIDGroup.appendTo(builder, level + 1);            if (underlyingLegSecurityAltIDGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            underlyingLegSecurityAltIDGroup = underlyingLegSecurityAltIDGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasUnderlyingLegCFICode())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegCFICode\": \"");
            builder.append(this.underlyingLegCFICode(), 0, underlyingLegCFICodeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityType\": \"");
            builder.append(this.underlyingLegSecurityType(), 0, underlyingLegSecurityTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecuritySubType())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecuritySubType\": \"");
            builder.append(this.underlyingLegSecuritySubType(), 0, underlyingLegSecuritySubTypeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityMonthYear())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityMonthYear\": \"");
            appendData(builder, underlyingLegMaturityMonthYear, underlyingLegMaturityMonthYearLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityDate())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityDate\": \"");
            appendData(builder, underlyingLegMaturityDate, underlyingLegMaturityDateLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegMaturityTime())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegMaturityTime\": \"");
            appendData(builder, underlyingLegMaturityTime, underlyingLegMaturityTimeLength);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegStrikePrice())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegStrikePrice\": \"");
            underlyingLegStrikePrice.appendTo(builder);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegOptAttribute())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegOptAttribute\": \"");
            builder.append(underlyingLegOptAttribute);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegPutOrCall())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegPutOrCall\": \"");
            builder.append(underlyingLegPutOrCall);
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityExchange())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityExchange\": \"");
            builder.append(this.underlyingLegSecurityExchange(), 0, underlyingLegSecurityExchangeLength());
            builder.append("\",\n");
        }

        if (hasUnderlyingLegSecurityDesc())
        {
            indent(builder, level);
            builder.append("\"UnderlyingLegSecurityDesc\": \"");
            builder.append(this.underlyingLegSecurityDesc(), 0, underlyingLegSecurityDescLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public OfLegUnderlyingsGroupEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((OfLegUnderlyingsGroupEncoder)encoder);
    }

    public OfLegUnderlyingsGroupEncoder toEncoder(final OfLegUnderlyingsGroupEncoder encoder)
    {
        encoder.reset();

        final UnderlyingLegInstrumentEncoder underlyingLegInstrument = encoder.underlyingLegInstrument();        if (hasUnderlyingLegSymbol())
        {
            underlyingLegInstrument.underlyingLegSymbol(this.underlyingLegSymbol(), 0, underlyingLegSymbolLength());
        }

        if (hasUnderlyingLegSymbolSfx())
        {
            underlyingLegInstrument.underlyingLegSymbolSfx(this.underlyingLegSymbolSfx(), 0, underlyingLegSymbolSfxLength());
        }

        if (hasUnderlyingLegSecurityID())
        {
            underlyingLegInstrument.underlyingLegSecurityID(this.underlyingLegSecurityID(), 0, underlyingLegSecurityIDLength());
        }

        if (hasUnderlyingLegSecurityIDSource())
        {
            underlyingLegInstrument.underlyingLegSecurityIDSource(this.underlyingLegSecurityIDSource(), 0, underlyingLegSecurityIDSourceLength());
        }


        final UnderlyingLegSecurityAltIDGrpEncoder underlyingLegSecurityAltIDGrp = underlyingLegInstrument.underlyingLegSecurityAltIDGrp();        if (hasNoUnderlyingLegSecurityAltIDGroupCounter)
        {
            final int size = this.noUnderlyingLegSecurityAltIDGroupCounter;
            UnderlyingLegSecurityAltIDGroupDecoder underlyingLegSecurityAltIDGroup = this.underlyingLegSecurityAltIDGroup;
            UnderlyingLegSecurityAltIDGroupEncoder underlyingLegSecurityAltIDGroupEncoder = underlyingLegSecurityAltIDGrp.underlyingLegSecurityAltIDGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (underlyingLegSecurityAltIDGroup != null)
                {
                    underlyingLegSecurityAltIDGroup.toEncoder(underlyingLegSecurityAltIDGroupEncoder);
                    underlyingLegSecurityAltIDGroup = underlyingLegSecurityAltIDGroup.next();
                    underlyingLegSecurityAltIDGroupEncoder = underlyingLegSecurityAltIDGroupEncoder.next();
                }
            }
        }


        if (hasUnderlyingLegCFICode())
        {
            underlyingLegInstrument.underlyingLegCFICode(this.underlyingLegCFICode(), 0, underlyingLegCFICodeLength());
        }

        if (hasUnderlyingLegSecurityType())
        {
            underlyingLegInstrument.underlyingLegSecurityType(this.underlyingLegSecurityType(), 0, underlyingLegSecurityTypeLength());
        }

        if (hasUnderlyingLegSecuritySubType())
        {
            underlyingLegInstrument.underlyingLegSecuritySubType(this.underlyingLegSecuritySubType(), 0, underlyingLegSecuritySubTypeLength());
        }

        if (hasUnderlyingLegMaturityMonthYear())
        {
            underlyingLegInstrument.underlyingLegMaturityMonthYearAsCopy(this.underlyingLegMaturityMonthYear(), 0, underlyingLegMaturityMonthYearLength());
        }

        if (hasUnderlyingLegMaturityDate())
        {
            underlyingLegInstrument.underlyingLegMaturityDateAsCopy(this.underlyingLegMaturityDate(), 0, underlyingLegMaturityDateLength());
        }

        if (hasUnderlyingLegMaturityTime())
        {
            underlyingLegInstrument.underlyingLegMaturityTimeAsCopy(this.underlyingLegMaturityTime(), 0, underlyingLegMaturityTimeLength());
        }

        if (hasUnderlyingLegStrikePrice())
        {
            underlyingLegInstrument.underlyingLegStrikePrice(this.underlyingLegStrikePrice());
        }

        if (hasUnderlyingLegOptAttribute())
        {
            underlyingLegInstrument.underlyingLegOptAttribute(this.underlyingLegOptAttribute());
        }

        if (hasUnderlyingLegPutOrCall())
        {
            underlyingLegInstrument.underlyingLegPutOrCall(this.underlyingLegPutOrCall());
        }

        if (hasUnderlyingLegSecurityExchange())
        {
            underlyingLegInstrument.underlyingLegSecurityExchange(this.underlyingLegSecurityExchange(), 0, underlyingLegSecurityExchangeLength());
        }

        if (hasUnderlyingLegSecurityDesc())
        {
            underlyingLegInstrument.underlyingLegSecurityDesc(this.underlyingLegSecurityDesc(), 0, underlyingLegSecurityDescLength());
        }

        return encoder;
    }

}
    public class OfLegUnderlyingsGroupIterator implements Iterable<OfLegUnderlyingsGroupDecoder>, java.util.Iterator<OfLegUnderlyingsGroupDecoder>
    {
        private final TradeCapLegUnderlyingsGrpDecoder parent;
        private int remainder;
        private OfLegUnderlyingsGroupDecoder current;

        public OfLegUnderlyingsGroupIterator(final TradeCapLegUnderlyingsGrpDecoder parent)
        {
            this.parent = parent;
        }

        public boolean hasNext()
        {
            return remainder > 0 && current != null;
        }
        public OfLegUnderlyingsGroupDecoder next()
        {
            remainder--;
            final OfLegUnderlyingsGroupDecoder value = current;
            current = current.next();
            return value;
        }
        public int numberFieldValue()
        {
            return parent.hasNoOfLegUnderlyingsGroupCounter() ? parent.noOfLegUnderlyingsGroupCounter() : 0;
        }
        public void reset()
        {
            remainder = numberFieldValue();
            current = parent.ofLegUnderlyingsGroup();
        }
        public OfLegUnderlyingsGroupIterator iterator()
        {
            reset();
            return this;
        }
    }

public OfLegUnderlyingsGroupIterator ofLegUnderlyingsGroupIterator();
    public int noOfLegUnderlyingsGroupCounter();
    public boolean hasNoOfLegUnderlyingsGroupCounter();
    public OfLegUnderlyingsGroupDecoder ofLegUnderlyingsGroup();

}
