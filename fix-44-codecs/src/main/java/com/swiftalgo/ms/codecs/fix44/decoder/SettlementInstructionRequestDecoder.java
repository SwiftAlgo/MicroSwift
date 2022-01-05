/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix44.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix44.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix44.builder.SettlementInstructionRequestEncoder;
import com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder;
import static com.swiftalgo.ms.codecs.fix44.builder.PartiesEncoder.PartyIDsGroupEncoder.PartySubIDsGroupEncoder;


public class SettlementInstructionRequestDecoder extends CommonDecoderImpl implements PartiesDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(4);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.SETTL_INST_REQ_ID);
            REQUIRED_FIELDS.add(Constants.TRANSACT_TIME);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(28);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.SETTL_INST_REQ_ID);
            GROUP_FIELDS.add(Constants.TRANSACT_TIME);
            GROUP_FIELDS.add(Constants.ALLOC_ACCOUNT);
            GROUP_FIELDS.add(Constants.ALLOC_ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.SIDE);
            GROUP_FIELDS.add(Constants.PRODUCT);
            GROUP_FIELDS.add(Constants.SECURITY_TYPE);
            GROUP_FIELDS.add(Constants.C_F_I_CODE);
            GROUP_FIELDS.add(Constants.EFFECTIVE_TIME);
            GROUP_FIELDS.add(Constants.EXPIRE_TIME);
            GROUP_FIELDS.add(Constants.LAST_UPDATE_TIME);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_TYPE);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_NAME);
            GROUP_FIELDS.add(Constants.STAND_INST_DB_ID);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(28);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(4);

    public boolean validate()
    {
        if (rejectReason != Decoder.NO_ERROR)
        {
            return false;
        }
        final IntIterator missingFieldsIterator = missingRequiredFields.iterator();
        final IntIterator unknownFieldsIterator = unknownFields.iterator();
        if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED && unknownFieldsIterator.hasNext())
        {
            invalidTagId = unknownFieldsIterator.nextValue();
            rejectReason = Constants.ALL_FIELDS.contains(invalidTagId) ? 2 : 0;
            return false;
        }
        if (!header.validate())
        {
            invalidTagId = header.invalidTagId();
            rejectReason = header.rejectReason();
            return false;
        }
        else if (!trailer.validate())
        {
            invalidTagId = trailer.invalidTagId();
            rejectReason = trailer.rejectReason();
            return false;
        }
        if (missingFieldsIterator.hasNext())
        {
            invalidTagId = missingFieldsIterator.nextValue();
            rejectReason = 1;
            return false;
        }
        if (hasSide)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Side.isValid(side()))
        {
            invalidTagId = 54;
            rejectReason = 5;
            return false;
        }
        }

        if (hasProduct)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !Product.isValid(product()))
        {
            invalidTagId = 460;
            rejectReason = 5;
            return false;
        }
        }

        if (hasSecurityType)
        {
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !SecurityType.isValid(securityTypeWrapper))
        {
            invalidTagId = 167;
            rejectReason = 5;
            return false;
        }
        }

        if (hasStandInstDbType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !StandInstDbType.isValid(standInstDbType()))
        {
            invalidTagId = 169;
            rejectReason = 5;
            return false;
        }
        }
        if (hasNoPartyIDsGroupCounter)
        {
            {
                int count = 0;
                final PartyIDsGroupIterator iterator = partyIDsGroupIterator.iterator();
                for (final PartyIDsGroupDecoder group : iterator)
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
                    invalidTagId = 453;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 22081L;

    public static final String MESSAGE_TYPE_AS_STRING = "AV";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(100);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.SENDER_COMP_ID);
        messageFields.add(Constants.TARGET_COMP_ID);
        messageFields.add(Constants.ON_BEHALF_OF_COMP_ID);
        messageFields.add(Constants.DELIVER_TO_COMP_ID);
        messageFields.add(Constants.SECURE_DATA_LEN);
        messageFields.add(Constants.SECURE_DATA);
        messageFields.add(Constants.MSG_SEQ_NUM);
        messageFields.add(Constants.SENDER_SUB_ID);
        messageFields.add(Constants.SENDER_LOCATION_ID);
        messageFields.add(Constants.TARGET_SUB_ID);
        messageFields.add(Constants.TARGET_LOCATION_ID);
        messageFields.add(Constants.ON_BEHALF_OF_SUB_ID);
        messageFields.add(Constants.ON_BEHALF_OF_LOCATION_ID);
        messageFields.add(Constants.DELIVER_TO_SUB_ID);
        messageFields.add(Constants.DELIVER_TO_LOCATION_ID);
        messageFields.add(Constants.POSS_DUP_FLAG);
        messageFields.add(Constants.POSS_RESEND);
        messageFields.add(Constants.SENDING_TIME);
        messageFields.add(Constants.ORIG_SENDING_TIME);
        messageFields.add(Constants.XML_DATA_LEN);
        messageFields.add(Constants.XML_DATA);
        messageFields.add(Constants.MESSAGE_ENCODING);
        messageFields.add(Constants.LAST_MSG_SEQ_NUM_PROCESSED);
        messageFields.add(Constants.SETTL_INST_REQ_ID);
        messageFields.add(Constants.TRANSACT_TIME);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ALLOC_ACCOUNT);
        messageFields.add(Constants.ALLOC_ACCT_ID_SOURCE);
        messageFields.add(Constants.SIDE);
        messageFields.add(Constants.PRODUCT);
        messageFields.add(Constants.SECURITY_TYPE);
        messageFields.add(Constants.C_F_I_CODE);
        messageFields.add(Constants.EFFECTIVE_TIME);
        messageFields.add(Constants.EXPIRE_TIME);
        messageFields.add(Constants.LAST_UPDATE_TIME);
        messageFields.add(Constants.STAND_INST_DB_TYPE);
        messageFields.add(Constants.STAND_INST_DB_NAME);
        messageFields.add(Constants.STAND_INST_DB_ID);
        messageFields.add(Constants.SIGNATURE_LENGTH);
        messageFields.add(Constants.SIGNATURE);
        messageFields.add(Constants.CHECK_SUM);
    }

    private final TrailerDecoder trailer = new TrailerDecoder();

    public TrailerDecoder trailer()
    {
        return trailer;
    }

    private final HeaderDecoder header = new HeaderDecoder(trailer);

    public HeaderDecoder header()
    {
        return header;
    }

    private char[] settlInstReqID = new char[1];

    public char[] settlInstReqID()
    {
        return settlInstReqID;
    }


    private int settlInstReqIDOffset;

    private int settlInstReqIDLength;

    public int settlInstReqIDLength()
    {
        return settlInstReqIDLength;
    }

    public String settlInstReqIDAsString()
    {
        return new String(settlInstReqID, 0, settlInstReqIDLength);
    }

    public void settlInstReqID(final AsciiSequenceView view)
    {
        view.wrap(buffer, settlInstReqIDOffset, settlInstReqIDLength);
    }


    private byte[] transactTime = new byte[24];

    public byte[] transactTime()
    {
        return transactTime;
    }


    private int transactTimeOffset;

    private int transactTimeLength;

    public int transactTimeLength()
    {
        return transactTimeLength;
    }

    public String transactTimeAsString()
    {
        return new String(transactTime, 0, transactTimeLength);
    }

    public void transactTime(final AsciiSequenceView view)
    {
        view.wrap(buffer, transactTimeOffset, transactTimeLength);
    }




    private PartyIDsGroupDecoder partyIDsGroup = null;
    public PartyIDsGroupDecoder partyIDsGroup()
    {
        return partyIDsGroup;
    }

    private int noPartyIDsGroupCounter = MISSING_INT;

    private boolean hasNoPartyIDsGroupCounter;

    public int noPartyIDsGroupCounter()
    {
        if (!hasNoPartyIDsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoPartyIDsGroupCounter");
        }

        return noPartyIDsGroupCounter;
    }

    public boolean hasNoPartyIDsGroupCounter()
    {
        return hasNoPartyIDsGroupCounter;
    }




    private PartyIDsGroupIterator partyIDsGroupIterator = new PartyIDsGroupIterator(this);
    public PartyIDsGroupIterator partyIDsGroupIterator()
    {
        return partyIDsGroupIterator.iterator();
    }


    private char[] allocAccount = new char[1];

    private boolean hasAllocAccount;

    public char[] allocAccount()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccount;
    }

    public boolean hasAllocAccount()
    {
        return hasAllocAccount;
    }


    private int allocAccountOffset;

    private int allocAccountLength;

    public int allocAccountLength()
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        return allocAccountLength;
    }

    public String allocAccountAsString()
    {
        return hasAllocAccount ? new String(allocAccount, 0, allocAccountLength) : null;
    }

    public void allocAccount(final AsciiSequenceView view)
    {
        if (!hasAllocAccount)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAccount");
        }

        view.wrap(buffer, allocAccountOffset, allocAccountLength);
    }


    private int allocAcctIDSource = MISSING_INT;

    private boolean hasAllocAcctIDSource;

    public int allocAcctIDSource()
    {
        if (!hasAllocAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AllocAcctIDSource");
        }

        return allocAcctIDSource;
    }

    public boolean hasAllocAcctIDSource()
    {
        return hasAllocAcctIDSource;
    }



    private char side = MISSING_CHAR;

    private boolean hasSide;

    public char side()
    {
        if (!hasSide)
        {
            throw new IllegalArgumentException("No value for optional field: Side");
        }

        return side;
    }

    public boolean hasSide()
    {
        return hasSide;
    }



    private final CharArrayWrapper sideWrapper = new CharArrayWrapper();
    public Side sideAsEnum()
    {
        if (!hasSide)
 return Side.NULL_VAL;
        return Side.decode(side);
    }

    private int product = MISSING_INT;

    private boolean hasProduct;

    public int product()
    {
        if (!hasProduct)
        {
            throw new IllegalArgumentException("No value for optional field: Product");
        }

        return product;
    }

    public boolean hasProduct()
    {
        return hasProduct;
    }



    private final CharArrayWrapper productWrapper = new CharArrayWrapper();
    public Product productAsEnum()
    {
        if (!hasProduct)
 return Product.NULL_VAL;
        return Product.decode(product);
    }

    private char[] securityType = new char[1];

    private boolean hasSecurityType;

    public char[] securityType()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityType;
    }

    public boolean hasSecurityType()
    {
        return hasSecurityType;
    }


    private int securityTypeOffset;

    private int securityTypeLength;

    public int securityTypeLength()
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        return securityTypeLength;
    }

    public String securityTypeAsString()
    {
        return hasSecurityType ? new String(securityType, 0, securityTypeLength) : null;
    }

    public void securityType(final AsciiSequenceView view)
    {
        if (!hasSecurityType)
        {
            throw new IllegalArgumentException("No value for optional field: SecurityType");
        }

        view.wrap(buffer, securityTypeOffset, securityTypeLength);
    }


    private final CharArrayWrapper securityTypeWrapper = new CharArrayWrapper();
    public SecurityType securityTypeAsEnum()
    {
        if (!hasSecurityType)
 return SecurityType.NULL_VAL;
        securityTypeWrapper.wrap(this.securityType(), securityTypeLength);
        return SecurityType.decode(securityTypeWrapper);
    }

    private char[] cFICode = new char[1];

    private boolean hasCFICode;

    public char[] cFICode()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICode;
    }

    public boolean hasCFICode()
    {
        return hasCFICode;
    }


    private int cFICodeOffset;

    private int cFICodeLength;

    public int cFICodeLength()
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        return cFICodeLength;
    }

    public String cFICodeAsString()
    {
        return hasCFICode ? new String(cFICode, 0, cFICodeLength) : null;
    }

    public void cFICode(final AsciiSequenceView view)
    {
        if (!hasCFICode)
        {
            throw new IllegalArgumentException("No value for optional field: CFICode");
        }

        view.wrap(buffer, cFICodeOffset, cFICodeLength);
    }


    private byte[] effectiveTime = new byte[24];

    private boolean hasEffectiveTime;

    public byte[] effectiveTime()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTime;
    }

    public boolean hasEffectiveTime()
    {
        return hasEffectiveTime;
    }


    private int effectiveTimeOffset;

    private int effectiveTimeLength;

    public int effectiveTimeLength()
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        return effectiveTimeLength;
    }

    public String effectiveTimeAsString()
    {
        return hasEffectiveTime ? new String(effectiveTime, 0, effectiveTimeLength) : null;
    }

    public void effectiveTime(final AsciiSequenceView view)
    {
        if (!hasEffectiveTime)
        {
            throw new IllegalArgumentException("No value for optional field: EffectiveTime");
        }

        view.wrap(buffer, effectiveTimeOffset, effectiveTimeLength);
    }


    private byte[] expireTime = new byte[24];

    private boolean hasExpireTime;

    public byte[] expireTime()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTime;
    }

    public boolean hasExpireTime()
    {
        return hasExpireTime;
    }


    private int expireTimeOffset;

    private int expireTimeLength;

    public int expireTimeLength()
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        return expireTimeLength;
    }

    public String expireTimeAsString()
    {
        return hasExpireTime ? new String(expireTime, 0, expireTimeLength) : null;
    }

    public void expireTime(final AsciiSequenceView view)
    {
        if (!hasExpireTime)
        {
            throw new IllegalArgumentException("No value for optional field: ExpireTime");
        }

        view.wrap(buffer, expireTimeOffset, expireTimeLength);
    }


    private byte[] lastUpdateTime = new byte[24];

    private boolean hasLastUpdateTime;

    public byte[] lastUpdateTime()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTime;
    }

    public boolean hasLastUpdateTime()
    {
        return hasLastUpdateTime;
    }


    private int lastUpdateTimeOffset;

    private int lastUpdateTimeLength;

    public int lastUpdateTimeLength()
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        return lastUpdateTimeLength;
    }

    public String lastUpdateTimeAsString()
    {
        return hasLastUpdateTime ? new String(lastUpdateTime, 0, lastUpdateTimeLength) : null;
    }

    public void lastUpdateTime(final AsciiSequenceView view)
    {
        if (!hasLastUpdateTime)
        {
            throw new IllegalArgumentException("No value for optional field: LastUpdateTime");
        }

        view.wrap(buffer, lastUpdateTimeOffset, lastUpdateTimeLength);
    }


    private int standInstDbType = MISSING_INT;

    private boolean hasStandInstDbType;

    public int standInstDbType()
    {
        if (!hasStandInstDbType)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbType");
        }

        return standInstDbType;
    }

    public boolean hasStandInstDbType()
    {
        return hasStandInstDbType;
    }



    private final CharArrayWrapper standInstDbTypeWrapper = new CharArrayWrapper();
    public StandInstDbType standInstDbTypeAsEnum()
    {
        if (!hasStandInstDbType)
 return StandInstDbType.NULL_VAL;
        return StandInstDbType.decode(standInstDbType);
    }

    private char[] standInstDbName = new char[1];

    private boolean hasStandInstDbName;

    public char[] standInstDbName()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbName;
    }

    public boolean hasStandInstDbName()
    {
        return hasStandInstDbName;
    }


    private int standInstDbNameOffset;

    private int standInstDbNameLength;

    public int standInstDbNameLength()
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        return standInstDbNameLength;
    }

    public String standInstDbNameAsString()
    {
        return hasStandInstDbName ? new String(standInstDbName, 0, standInstDbNameLength) : null;
    }

    public void standInstDbName(final AsciiSequenceView view)
    {
        if (!hasStandInstDbName)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbName");
        }

        view.wrap(buffer, standInstDbNameOffset, standInstDbNameLength);
    }


    private char[] standInstDbID = new char[1];

    private boolean hasStandInstDbID;

    public char[] standInstDbID()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbID;
    }

    public boolean hasStandInstDbID()
    {
        return hasStandInstDbID;
    }


    private int standInstDbIDOffset;

    private int standInstDbIDLength;

    public int standInstDbIDLength()
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        return standInstDbIDLength;
    }

    public String standInstDbIDAsString()
    {
        return hasStandInstDbID ? new String(standInstDbID, 0, standInstDbIDLength) : null;
    }

    public void standInstDbID(final AsciiSequenceView view)
    {
        if (!hasStandInstDbID)
        {
            throw new IllegalArgumentException("No value for optional field: StandInstDbID");
        }

        view.wrap(buffer, standInstDbIDOffset, standInstDbIDLength);
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode SettlementInstructionRequest
        int seenFieldCount = 0;
        if (CODEC_VALIDATION_ENABLED)
        {
            missingRequiredFields.copy(REQUIRED_FIELDS);
            alreadyVisitedFields.clear();
        }
        this.buffer = buffer;
        final int end = offset + length;
        int position = offset;
        position += header.decode(buffer, position, length);
        int tag;

        while (position < end)
        {
            final int equalsPosition = buffer.scan(position, end, '=');
            if (equalsPosition == AsciiBuffer.UNKNOWN_INDEX)
            {
               return position;
            }
            tag = buffer.getInt(position, equalsPosition);
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
                if (!alreadyVisitedFields.add(tag))
                {
                    invalidTagId = tag;
                    rejectReason = 13;
                }
                missingRequiredFields.remove(tag);
                seenFieldCount++;
            }

            switch (tag)
            {
            case Constants.SETTL_INST_REQ_ID:
                settlInstReqID = buffer.getChars(settlInstReqID, valueOffset, valueLength);
                settlInstReqIDOffset = valueOffset;
                settlInstReqIDLength = valueLength;
                break;

            case Constants.TRANSACT_TIME:
                transactTime = buffer.getBytes(transactTime, valueOffset, valueLength);
                transactTimeOffset = valueOffset;
                transactTimeLength = valueLength;
                break;

            case Constants.NO_PARTY_IDS:
                hasNoPartyIDsGroupCounter = true;
                noPartyIDsGroupCounter = getInt(buffer, valueOffset, endOfField, 453, CODEC_VALIDATION_ENABLED);
                if (partyIDsGroup == null)
                {
                    partyIDsGroup = new PartyIDsGroupDecoder(trailer, messageFields);
                }
                PartyIDsGroupDecoder partyIDsGroupCurrent = partyIDsGroup;
                position = endOfField + 1;
                final int noPartyIDsGroupCounter = this.noPartyIDsGroupCounter;
                for (int i = 0; i < noPartyIDsGroupCounter && position < end; i++)
                {
                    if (partyIDsGroupCurrent != null)
                    {
                        position += partyIDsGroupCurrent.decode(buffer, position, end - position);
                        partyIDsGroupCurrent = partyIDsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (partyIDsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.ALLOC_ACCOUNT:
                hasAllocAccount = true;
                allocAccount = buffer.getChars(allocAccount, valueOffset, valueLength);
                allocAccountOffset = valueOffset;
                allocAccountLength = valueLength;
                break;

            case Constants.ALLOC_ACCT_ID_SOURCE:
                hasAllocAcctIDSource = true;
                allocAcctIDSource = getInt(buffer, valueOffset, endOfField, 661, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SIDE:
                hasSide = true;
                side = buffer.getChar(valueOffset);
                break;

            case Constants.PRODUCT:
                hasProduct = true;
                product = getInt(buffer, valueOffset, endOfField, 460, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.SECURITY_TYPE:
                hasSecurityType = true;
                securityType = buffer.getChars(securityType, valueOffset, valueLength);
                securityTypeOffset = valueOffset;
                securityTypeLength = valueLength;
                break;

            case Constants.C_F_I_CODE:
                hasCFICode = true;
                cFICode = buffer.getChars(cFICode, valueOffset, valueLength);
                cFICodeOffset = valueOffset;
                cFICodeLength = valueLength;
                break;

            case Constants.EFFECTIVE_TIME:
                hasEffectiveTime = true;
                effectiveTime = buffer.getBytes(effectiveTime, valueOffset, valueLength);
                effectiveTimeOffset = valueOffset;
                effectiveTimeLength = valueLength;
                break;

            case Constants.EXPIRE_TIME:
                hasExpireTime = true;
                expireTime = buffer.getBytes(expireTime, valueOffset, valueLength);
                expireTimeOffset = valueOffset;
                expireTimeLength = valueLength;
                break;

            case Constants.LAST_UPDATE_TIME:
                hasLastUpdateTime = true;
                lastUpdateTime = buffer.getBytes(lastUpdateTime, valueOffset, valueLength);
                lastUpdateTimeOffset = valueOffset;
                lastUpdateTimeLength = valueLength;
                break;

            case Constants.STAND_INST_DB_TYPE:
                hasStandInstDbType = true;
                standInstDbType = getInt(buffer, valueOffset, endOfField, 169, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.STAND_INST_DB_NAME:
                hasStandInstDbName = true;
                standInstDbName = buffer.getChars(standInstDbName, valueOffset, valueLength);
                standInstDbNameOffset = valueOffset;
                standInstDbNameLength = valueLength;
                break;

            case Constants.STAND_INST_DB_ID:
                hasStandInstDbID = true;
                standInstDbID = buffer.getChars(standInstDbID, valueOffset, valueLength);
                standInstDbIDOffset = valueOffset;
                standInstDbIDLength = valueLength;
                break;

            default:
                if (!CODEC_REJECT_UNKNOWN_FIELD_ENABLED)
                {
                    alreadyVisitedFields.remove(tag);
                }
                else
                {
                    if (!(trailer.REQUIRED_FIELDS.contains(tag)))
                    {
                        unknownFields.add(tag);
                    }
                }
                if (CODEC_REJECT_UNKNOWN_FIELD_ENABLED || (trailer.REQUIRED_FIELDS.contains(tag)))
                {
                    position += trailer.decode(buffer, position, end - position);
                    return position - offset;
                }

            }

            if (position < (endOfField + 1))
            {
                position = endOfField + 1;
            }
        }
        position += trailer.decode(buffer, position, end - position);
        return position - offset;
    }

    public void reset()
    {
        header.reset();
        trailer.reset();
        resetMessage();
        buffer = null;
        if (CODEC_VALIDATION_ENABLED)
        {
            invalidTagId = Decoder.NO_ERROR;
            rejectReason = Decoder.NO_ERROR;
            missingRequiredFields.clear();
            unknownFields.clear();
            alreadyVisitedFields.clear();
        }
    }

    public void resetMessage()
    {
        this.resetSettlInstReqID();
        this.resetTransactTime();
        this.resetAllocAccount();
        this.resetAllocAcctIDSource();
        this.resetSide();
        this.resetProduct();
        this.resetSecurityType();
        this.resetCFICode();
        this.resetEffectiveTime();
        this.resetExpireTime();
        this.resetLastUpdateTime();
        this.resetStandInstDbType();
        this.resetStandInstDbName();
        this.resetStandInstDbID();
        this.resetPartyIDsGroup();
    }

    public void resetSettlInstReqID()
    {
        settlInstReqIDOffset = 0;
        settlInstReqIDLength = 0;
    }

    public void resetTransactTime()
    {
    }

    public void resetAllocAccount()
    {
        hasAllocAccount = false;
    }

    public void resetAllocAcctIDSource()
    {
        hasAllocAcctIDSource = false;
    }

    public void resetSide()
    {
        hasSide = false;
    }

    public void resetProduct()
    {
        hasProduct = false;
    }

    public void resetSecurityType()
    {
        hasSecurityType = false;
    }

    public void resetCFICode()
    {
        hasCFICode = false;
    }

    public void resetEffectiveTime()
    {
        hasEffectiveTime = false;
    }

    public void resetExpireTime()
    {
        hasExpireTime = false;
    }

    public void resetLastUpdateTime()
    {
        hasLastUpdateTime = false;
    }

    public void resetStandInstDbType()
    {
        hasStandInstDbType = false;
    }

    public void resetStandInstDbName()
    {
        hasStandInstDbName = false;
    }

    public void resetStandInstDbID()
    {
        hasStandInstDbID = false;
    }

    public void resetPartyIDsGroup()
    {
        for (final PartyIDsGroupDecoder partyIDsGroupDecoder : partyIDsGroupIterator.iterator())
        {
            partyIDsGroupDecoder.reset();
            if (partyIDsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noPartyIDsGroupCounter = MISSING_INT;
        hasNoPartyIDsGroupCounter = false;
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
        builder.append("\"MessageName\": \"SettlementInstructionRequest\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"SettlInstReqID\": \"");
        builder.append(this.settlInstReqID(), 0, settlInstReqIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"TransactTime\": \"");
        appendData(builder, transactTime, transactTimeLength);
        builder.append("\",\n");

    if (hasNoPartyIDsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"PartyIDsGroup\": [\n");
        PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
        for (int i = 0, size = this.noPartyIDsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            partyIDsGroup.appendTo(builder, level + 1);            if (partyIDsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            partyIDsGroup = partyIDsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

        if (hasAllocAccount())
        {
            indent(builder, level);
            builder.append("\"AllocAccount\": \"");
            builder.append(this.allocAccount(), 0, allocAccountLength());
            builder.append("\",\n");
        }

        if (hasAllocAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AllocAcctIDSource\": \"");
            builder.append(allocAcctIDSource);
            builder.append("\",\n");
        }

        if (hasSide())
        {
            indent(builder, level);
            builder.append("\"Side\": \"");
            builder.append(side);
            builder.append("\",\n");
        }

        if (hasProduct())
        {
            indent(builder, level);
            builder.append("\"Product\": \"");
            builder.append(product);
            builder.append("\",\n");
        }

        if (hasSecurityType())
        {
            indent(builder, level);
            builder.append("\"SecurityType\": \"");
            builder.append(this.securityType(), 0, securityTypeLength());
            builder.append("\",\n");
        }

        if (hasCFICode())
        {
            indent(builder, level);
            builder.append("\"CFICode\": \"");
            builder.append(this.cFICode(), 0, cFICodeLength());
            builder.append("\",\n");
        }

        if (hasEffectiveTime())
        {
            indent(builder, level);
            builder.append("\"EffectiveTime\": \"");
            appendData(builder, effectiveTime, effectiveTimeLength);
            builder.append("\",\n");
        }

        if (hasExpireTime())
        {
            indent(builder, level);
            builder.append("\"ExpireTime\": \"");
            appendData(builder, expireTime, expireTimeLength);
            builder.append("\",\n");
        }

        if (hasLastUpdateTime())
        {
            indent(builder, level);
            builder.append("\"LastUpdateTime\": \"");
            appendData(builder, lastUpdateTime, lastUpdateTimeLength);
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
            builder.append(this.standInstDbName(), 0, standInstDbNameLength());
            builder.append("\",\n");
        }

        if (hasStandInstDbID())
        {
            indent(builder, level);
            builder.append("\"StandInstDbID\": \"");
            builder.append(this.standInstDbID(), 0, standInstDbIDLength());
            builder.append("\",\n");
        }
        indent(builder, level - 1);
        builder.append("}");
        return builder;
    }

    /**
     * {@inheritDoc}
     */
    public SettlementInstructionRequestEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((SettlementInstructionRequestEncoder)encoder);
    }

    public SettlementInstructionRequestEncoder toEncoder(final SettlementInstructionRequestEncoder encoder)
    {
        encoder.reset();
        encoder.settlInstReqID(this.settlInstReqID(), 0, settlInstReqIDLength());
        encoder.transactTimeAsCopy(this.transactTime(), 0, transactTimeLength());

        final PartiesEncoder parties = encoder.parties();        if (hasNoPartyIDsGroupCounter)
        {
            final int size = this.noPartyIDsGroupCounter;
            PartyIDsGroupDecoder partyIDsGroup = this.partyIDsGroup;
            PartyIDsGroupEncoder partyIDsGroupEncoder = parties.partyIDsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (partyIDsGroup != null)
                {
                    partyIDsGroup.toEncoder(partyIDsGroupEncoder);
                    partyIDsGroup = partyIDsGroup.next();
                    partyIDsGroupEncoder = partyIDsGroupEncoder.next();
                }
            }
        }


        if (hasAllocAccount())
        {
            encoder.allocAccount(this.allocAccount(), 0, allocAccountLength());
        }

        if (hasAllocAcctIDSource())
        {
            encoder.allocAcctIDSource(this.allocAcctIDSource());
        }

        if (hasSide())
        {
            encoder.side(this.side());
        }

        if (hasProduct())
        {
            encoder.product(this.product());
        }

        if (hasSecurityType())
        {
            encoder.securityType(this.securityType(), 0, securityTypeLength());
        }

        if (hasCFICode())
        {
            encoder.cFICode(this.cFICode(), 0, cFICodeLength());
        }

        if (hasEffectiveTime())
        {
            encoder.effectiveTimeAsCopy(this.effectiveTime(), 0, effectiveTimeLength());
        }

        if (hasExpireTime())
        {
            encoder.expireTimeAsCopy(this.expireTime(), 0, expireTimeLength());
        }

        if (hasLastUpdateTime())
        {
            encoder.lastUpdateTimeAsCopy(this.lastUpdateTime(), 0, lastUpdateTimeLength());
        }

        if (hasStandInstDbType())
        {
            encoder.standInstDbType(this.standInstDbType());
        }

        if (hasStandInstDbName())
        {
            encoder.standInstDbName(this.standInstDbName(), 0, standInstDbNameLength());
        }

        if (hasStandInstDbID())
        {
            encoder.standInstDbID(this.standInstDbID(), 0, standInstDbIDLength());
        }
        return encoder;
    }

}
