/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2.decoder;

import org.agrona.AsciiNumberFormatException;
import org.agrona.MutableDirectBuffer;
import org.agrona.AsciiSequenceView;
import static uk.co.real_logic.artio.dictionary.generation.CodecUtil.*;
import static uk.co.real_logic.artio.dictionary.SessionConstants.*;
import uk.co.real_logic.artio.builder.Decoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.HeaderDecoder;
import com.swiftalgo.ms.codecs.fix50sp2.decoder.TrailerDecoder;
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
import com.swiftalgo.ms.codecs.fix50sp2.builder.RegistrationInstructionsEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PartiesEncoder.PartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.PtysSubGrpEncoder.PartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDtlsGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDtlsGrpEncoder.RegistDtlsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NestedPartiesEncoder.NestedPartyIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.NstdPtysSubGrpEncoder.NestedPartySubIDsGroupEncoder;
import com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDistInstGrpEncoder;
import static com.swiftalgo.ms.codecs.fix50sp2.builder.RgstDistInstGrpEncoder.DistribInstsGroupEncoder;


public class RegistrationInstructionsDecoder extends CommonDecoderImpl implements PartiesDecoder, RgstDtlsGrpDecoder, RgstDistInstGrpDecoder, MessageDecoder
{
    public final IntHashSet REQUIRED_FIELDS = new IntHashSet(6);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            REQUIRED_FIELDS.add(Constants.REGIST_ID);
            REQUIRED_FIELDS.add(Constants.REGIST_TRANS_TYPE);
            REQUIRED_FIELDS.add(Constants.REGIST_REF_ID);
        }
    }

    public final IntHashSet GROUP_FIELDS = new IntHashSet(18);

    {
        if (CODEC_VALIDATION_ENABLED)
        {
            GROUP_FIELDS.add(Constants.REGIST_ID);
            GROUP_FIELDS.add(Constants.REGIST_TRANS_TYPE);
            GROUP_FIELDS.add(Constants.REGIST_REF_ID);
            GROUP_FIELDS.add(Constants.CL_ORD_ID);
            GROUP_FIELDS.add(Constants.ACCOUNT);
            GROUP_FIELDS.add(Constants.ACCT_ID_SOURCE);
            GROUP_FIELDS.add(Constants.REGIST_ACCT_TYPE);
            GROUP_FIELDS.add(Constants.TAX_ADVANTAGE_TYPE);
            GROUP_FIELDS.add(Constants.OWNERSHIP_TYPE);
        }
    }

    private final IntHashSet alreadyVisitedFields = new IntHashSet(18);

    private final IntHashSet unknownFields = new IntHashSet(10);

    private final IntHashSet missingRequiredFields = new IntHashSet(6);

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
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !RegistTransType.isValid(registTransType()))
        {
            invalidTagId = 514;
            rejectReason = 5;
            return false;
        }

        if (hasAcctIDSource)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !AcctIDSource.isValid(acctIDSource()))
        {
            invalidTagId = 660;
            rejectReason = 5;
            return false;
        }
        }

        if (hasTaxAdvantageType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !TaxAdvantageType.isValid(taxAdvantageType()))
        {
            invalidTagId = 495;
            rejectReason = 5;
            return false;
        }
        }

        if (hasOwnershipType)
        {
        if (CODEC_REJECT_UNKNOWN_ENUM_VALUE_ENABLED && !OwnershipType.isValid(ownershipType()))
        {
            invalidTagId = 517;
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

        if (hasNoRegistDtlsGroupCounter)
        {
            {
                int count = 0;
                final RegistDtlsGroupIterator iterator = registDtlsGroupIterator.iterator();
                for (final RegistDtlsGroupDecoder group : iterator)
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
                    invalidTagId = 473;
                    rejectReason = 16;
                    return false;
                }
            }
        }

        if (hasNoDistribInstsGroupCounter)
        {
            {
                int count = 0;
                final DistribInstsGroupIterator iterator = distribInstsGroupIterator.iterator();
                for (final DistribInstsGroupDecoder group : iterator)
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
                    invalidTagId = 510;
                    rejectReason = 16;
                    return false;
                }
            }
        }
        return true;
    }

    public static final long MESSAGE_TYPE = 111L;

    public static final String MESSAGE_TYPE_AS_STRING = "o";

    public static final char[] MESSAGE_TYPE_CHARS = MESSAGE_TYPE_AS_STRING.toCharArray();

    public static final byte[] MESSAGE_TYPE_BYTES = MESSAGE_TYPE_AS_STRING.getBytes(US_ASCII);

    public final IntHashSet messageFields = new IntHashSet(144);

    {
        messageFields.add(Constants.BEGIN_STRING);
        messageFields.add(Constants.BODY_LENGTH);
        messageFields.add(Constants.MSG_TYPE);
        messageFields.add(Constants.APPL_VER_ID);
        messageFields.add(Constants.APPL_EXT_ID);
        messageFields.add(Constants.CSTM_APPL_VER_ID);
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
        messageFields.add(Constants.REGIST_ID);
        messageFields.add(Constants.REGIST_TRANS_TYPE);
        messageFields.add(Constants.REGIST_REF_ID);
        messageFields.add(Constants.CL_ORD_ID);
        messageFields.add(Constants.NO_PARTY_IDS);
        messageFields.add(Constants.PARTY_ID);
        messageFields.add(Constants.PARTY_ID_SOURCE);
        messageFields.add(Constants.PARTY_ROLE);
        messageFields.add(Constants.NO_PARTY_SUB_IDS);
        messageFields.add(Constants.PARTY_SUB_ID);
        messageFields.add(Constants.PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.ACCOUNT);
        messageFields.add(Constants.ACCT_ID_SOURCE);
        messageFields.add(Constants.REGIST_ACCT_TYPE);
        messageFields.add(Constants.TAX_ADVANTAGE_TYPE);
        messageFields.add(Constants.OWNERSHIP_TYPE);
        messageFields.add(Constants.NO_REGIST_DTLS);
        messageFields.add(Constants.REGIST_DTLS);
        messageFields.add(Constants.REGIST_EMAIL);
        messageFields.add(Constants.MAILING_DTLS);
        messageFields.add(Constants.MAILING_INST);
        messageFields.add(Constants.NO_NESTED_PARTY_IDS);
        messageFields.add(Constants.NESTED_PARTY_ID);
        messageFields.add(Constants.NESTED_PARTY_ID_SOURCE);
        messageFields.add(Constants.NESTED_PARTY_ROLE);
        messageFields.add(Constants.NO_NESTED_PARTY_SUB_IDS);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID);
        messageFields.add(Constants.NESTED_PARTY_SUB_ID_TYPE);
        messageFields.add(Constants.OWNER_TYPE);
        messageFields.add(Constants.DATE_OF_BIRTH);
        messageFields.add(Constants.INVESTOR_COUNTRY_OF_RESIDENCE);
        messageFields.add(Constants.NO_DISTRIB_INSTS);
        messageFields.add(Constants.DISTRIB_PAYMENT_METHOD);
        messageFields.add(Constants.DISTRIB_PERCENTAGE);
        messageFields.add(Constants.CASH_DISTRIB_CURR);
        messageFields.add(Constants.CASH_DISTRIB_AGENT_NAME);
        messageFields.add(Constants.CASH_DISTRIB_AGENT_CODE);
        messageFields.add(Constants.CASH_DISTRIB_AGENT_ACCT_NUMBER);
        messageFields.add(Constants.CASH_DISTRIB_PAY_REF);
        messageFields.add(Constants.CASH_DISTRIB_AGENT_ACCT_NAME);
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

    private char[] registID = new char[1];

    public char[] registID()
    {
        return registID;
    }


    private int registIDOffset;

    private int registIDLength;

    public int registIDLength()
    {
        return registIDLength;
    }

    public String registIDAsString()
    {
        return new String(registID, 0, registIDLength);
    }

    public void registID(final AsciiSequenceView view)
    {
        view.wrap(buffer, registIDOffset, registIDLength);
    }


    private char registTransType = MISSING_CHAR;

    public char registTransType()
    {
        return registTransType;
    }



    private final CharArrayWrapper registTransTypeWrapper = new CharArrayWrapper();
    public RegistTransType registTransTypeAsEnum()
    {
        return RegistTransType.decode(registTransType);
    }

    private char[] registRefID = new char[1];

    public char[] registRefID()
    {
        return registRefID;
    }


    private int registRefIDOffset;

    private int registRefIDLength;

    public int registRefIDLength()
    {
        return registRefIDLength;
    }

    public String registRefIDAsString()
    {
        return new String(registRefID, 0, registRefIDLength);
    }

    public void registRefID(final AsciiSequenceView view)
    {
        view.wrap(buffer, registRefIDOffset, registRefIDLength);
    }


    private char[] clOrdID = new char[1];

    private boolean hasClOrdID;

    public char[] clOrdID()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdID;
    }

    public boolean hasClOrdID()
    {
        return hasClOrdID;
    }


    private int clOrdIDOffset;

    private int clOrdIDLength;

    public int clOrdIDLength()
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        return clOrdIDLength;
    }

    public String clOrdIDAsString()
    {
        return hasClOrdID ? new String(clOrdID, 0, clOrdIDLength) : null;
    }

    public void clOrdID(final AsciiSequenceView view)
    {
        if (!hasClOrdID)
        {
            throw new IllegalArgumentException("No value for optional field: ClOrdID");
        }

        view.wrap(buffer, clOrdIDOffset, clOrdIDLength);
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


    private char[] account = new char[1];

    private boolean hasAccount;

    public char[] account()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return account;
    }

    public boolean hasAccount()
    {
        return hasAccount;
    }


    private int accountOffset;

    private int accountLength;

    public int accountLength()
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        return accountLength;
    }

    public String accountAsString()
    {
        return hasAccount ? new String(account, 0, accountLength) : null;
    }

    public void account(final AsciiSequenceView view)
    {
        if (!hasAccount)
        {
            throw new IllegalArgumentException("No value for optional field: Account");
        }

        view.wrap(buffer, accountOffset, accountLength);
    }


    private int acctIDSource = MISSING_INT;

    private boolean hasAcctIDSource;

    public int acctIDSource()
    {
        if (!hasAcctIDSource)
        {
            throw new IllegalArgumentException("No value for optional field: AcctIDSource");
        }

        return acctIDSource;
    }

    public boolean hasAcctIDSource()
    {
        return hasAcctIDSource;
    }



    private final CharArrayWrapper acctIDSourceWrapper = new CharArrayWrapper();
    public AcctIDSource acctIDSourceAsEnum()
    {
        if (!hasAcctIDSource)
 return AcctIDSource.NULL_VAL;
        return AcctIDSource.decode(acctIDSource);
    }

    private char[] registAcctType = new char[1];

    private boolean hasRegistAcctType;

    public char[] registAcctType()
    {
        if (!hasRegistAcctType)
        {
            throw new IllegalArgumentException("No value for optional field: RegistAcctType");
        }

        return registAcctType;
    }

    public boolean hasRegistAcctType()
    {
        return hasRegistAcctType;
    }


    private int registAcctTypeOffset;

    private int registAcctTypeLength;

    public int registAcctTypeLength()
    {
        if (!hasRegistAcctType)
        {
            throw new IllegalArgumentException("No value for optional field: RegistAcctType");
        }

        return registAcctTypeLength;
    }

    public String registAcctTypeAsString()
    {
        return hasRegistAcctType ? new String(registAcctType, 0, registAcctTypeLength) : null;
    }

    public void registAcctType(final AsciiSequenceView view)
    {
        if (!hasRegistAcctType)
        {
            throw new IllegalArgumentException("No value for optional field: RegistAcctType");
        }

        view.wrap(buffer, registAcctTypeOffset, registAcctTypeLength);
    }


    private int taxAdvantageType = MISSING_INT;

    private boolean hasTaxAdvantageType;

    public int taxAdvantageType()
    {
        if (!hasTaxAdvantageType)
        {
            throw new IllegalArgumentException("No value for optional field: TaxAdvantageType");
        }

        return taxAdvantageType;
    }

    public boolean hasTaxAdvantageType()
    {
        return hasTaxAdvantageType;
    }



    private final CharArrayWrapper taxAdvantageTypeWrapper = new CharArrayWrapper();
    public TaxAdvantageType taxAdvantageTypeAsEnum()
    {
        if (!hasTaxAdvantageType)
 return TaxAdvantageType.NULL_VAL;
        return TaxAdvantageType.decode(taxAdvantageType);
    }

    private char ownershipType = MISSING_CHAR;

    private boolean hasOwnershipType;

    public char ownershipType()
    {
        if (!hasOwnershipType)
        {
            throw new IllegalArgumentException("No value for optional field: OwnershipType");
        }

        return ownershipType;
    }

    public boolean hasOwnershipType()
    {
        return hasOwnershipType;
    }



    private final CharArrayWrapper ownershipTypeWrapper = new CharArrayWrapper();
    public OwnershipType ownershipTypeAsEnum()
    {
        if (!hasOwnershipType)
 return OwnershipType.NULL_VAL;
        return OwnershipType.decode(ownershipType);
    }



    private RegistDtlsGroupDecoder registDtlsGroup = null;
    public RegistDtlsGroupDecoder registDtlsGroup()
    {
        return registDtlsGroup;
    }

    private int noRegistDtlsGroupCounter = MISSING_INT;

    private boolean hasNoRegistDtlsGroupCounter;

    public int noRegistDtlsGroupCounter()
    {
        if (!hasNoRegistDtlsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoRegistDtlsGroupCounter");
        }

        return noRegistDtlsGroupCounter;
    }

    public boolean hasNoRegistDtlsGroupCounter()
    {
        return hasNoRegistDtlsGroupCounter;
    }




    private RegistDtlsGroupIterator registDtlsGroupIterator = new RegistDtlsGroupIterator(this);
    public RegistDtlsGroupIterator registDtlsGroupIterator()
    {
        return registDtlsGroupIterator.iterator();
    }




    private DistribInstsGroupDecoder distribInstsGroup = null;
    public DistribInstsGroupDecoder distribInstsGroup()
    {
        return distribInstsGroup;
    }

    private int noDistribInstsGroupCounter = MISSING_INT;

    private boolean hasNoDistribInstsGroupCounter;

    public int noDistribInstsGroupCounter()
    {
        if (!hasNoDistribInstsGroupCounter)
        {
            throw new IllegalArgumentException("No value for optional field: NoDistribInstsGroupCounter");
        }

        return noDistribInstsGroupCounter;
    }

    public boolean hasNoDistribInstsGroupCounter()
    {
        return hasNoDistribInstsGroupCounter;
    }




    private DistribInstsGroupIterator distribInstsGroupIterator = new DistribInstsGroupIterator(this);
    public DistribInstsGroupIterator distribInstsGroupIterator()
    {
        return distribInstsGroupIterator.iterator();
    }


    public int decode(final AsciiBuffer buffer, final int offset, final int length)
    {
        // Decode RegistrationInstructions
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
            case Constants.REGIST_ID:
                registID = buffer.getChars(registID, valueOffset, valueLength);
                registIDOffset = valueOffset;
                registIDLength = valueLength;
                break;

            case Constants.REGIST_TRANS_TYPE:
                registTransType = buffer.getChar(valueOffset);
                break;

            case Constants.REGIST_REF_ID:
                registRefID = buffer.getChars(registRefID, valueOffset, valueLength);
                registRefIDOffset = valueOffset;
                registRefIDLength = valueLength;
                break;

            case Constants.CL_ORD_ID:
                hasClOrdID = true;
                clOrdID = buffer.getChars(clOrdID, valueOffset, valueLength);
                clOrdIDOffset = valueOffset;
                clOrdIDLength = valueLength;
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


            case Constants.ACCOUNT:
                hasAccount = true;
                account = buffer.getChars(account, valueOffset, valueLength);
                accountOffset = valueOffset;
                accountLength = valueLength;
                break;

            case Constants.ACCT_ID_SOURCE:
                hasAcctIDSource = true;
                acctIDSource = getInt(buffer, valueOffset, endOfField, 660, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.REGIST_ACCT_TYPE:
                hasRegistAcctType = true;
                registAcctType = buffer.getChars(registAcctType, valueOffset, valueLength);
                registAcctTypeOffset = valueOffset;
                registAcctTypeLength = valueLength;
                break;

            case Constants.TAX_ADVANTAGE_TYPE:
                hasTaxAdvantageType = true;
                taxAdvantageType = getInt(buffer, valueOffset, endOfField, 495, CODEC_VALIDATION_ENABLED);
                break;

            case Constants.OWNERSHIP_TYPE:
                hasOwnershipType = true;
                ownershipType = buffer.getChar(valueOffset);
                break;

            case Constants.NO_REGIST_DTLS:
                hasNoRegistDtlsGroupCounter = true;
                noRegistDtlsGroupCounter = getInt(buffer, valueOffset, endOfField, 473, CODEC_VALIDATION_ENABLED);
                if (registDtlsGroup == null)
                {
                    registDtlsGroup = new RegistDtlsGroupDecoder(trailer, messageFields);
                }
                RegistDtlsGroupDecoder registDtlsGroupCurrent = registDtlsGroup;
                position = endOfField + 1;
                final int noRegistDtlsGroupCounter = this.noRegistDtlsGroupCounter;
                for (int i = 0; i < noRegistDtlsGroupCounter && position < end; i++)
                {
                    if (registDtlsGroupCurrent != null)
                    {
                        position += registDtlsGroupCurrent.decode(buffer, position, end - position);
                        registDtlsGroupCurrent = registDtlsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (registDtlsGroup.ALL_GROUP_FIELDS.contains(checkTag))
                        {
                            invalidTagId = tag;
                            rejectReason = 16;
                            return position;
                        }
                    }
                }
                break;


            case Constants.NO_DISTRIB_INSTS:
                hasNoDistribInstsGroupCounter = true;
                noDistribInstsGroupCounter = getInt(buffer, valueOffset, endOfField, 510, CODEC_VALIDATION_ENABLED);
                if (distribInstsGroup == null)
                {
                    distribInstsGroup = new DistribInstsGroupDecoder(trailer, messageFields);
                }
                DistribInstsGroupDecoder distribInstsGroupCurrent = distribInstsGroup;
                position = endOfField + 1;
                final int noDistribInstsGroupCounter = this.noDistribInstsGroupCounter;
                for (int i = 0; i < noDistribInstsGroupCounter && position < end; i++)
                {
                    if (distribInstsGroupCurrent != null)
                    {
                        position += distribInstsGroupCurrent.decode(buffer, position, end - position);
                        distribInstsGroupCurrent = distribInstsGroupCurrent.next();
                    }
                }
                if (CODEC_VALIDATION_ENABLED)
                {
                    final int checkEqualsPosition = buffer.scan(position, end, '=');
                    if (checkEqualsPosition != AsciiBuffer.UNKNOWN_INDEX)
                    {
                        final int checkTag = buffer.getInt(position, checkEqualsPosition);
                        if (distribInstsGroup.ALL_GROUP_FIELDS.contains(checkTag))
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
        this.resetRegistID();
        this.resetRegistTransType();
        this.resetRegistRefID();
        this.resetClOrdID();
        this.resetAccount();
        this.resetAcctIDSource();
        this.resetRegistAcctType();
        this.resetTaxAdvantageType();
        this.resetOwnershipType();
        this.resetPartyIDsGroup();
        this.resetRegistDtlsGroup();
        this.resetDistribInstsGroup();
    }

    public void resetRegistID()
    {
        registIDOffset = 0;
        registIDLength = 0;
    }

    public void resetRegistTransType()
    {
        registTransType = MISSING_CHAR;
    }

    public void resetRegistRefID()
    {
        registRefIDOffset = 0;
        registRefIDLength = 0;
    }

    public void resetClOrdID()
    {
        hasClOrdID = false;
    }

    public void resetAccount()
    {
        hasAccount = false;
    }

    public void resetAcctIDSource()
    {
        hasAcctIDSource = false;
    }

    public void resetRegistAcctType()
    {
        hasRegistAcctType = false;
    }

    public void resetTaxAdvantageType()
    {
        hasTaxAdvantageType = false;
    }

    public void resetOwnershipType()
    {
        hasOwnershipType = false;
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

    public void resetRegistDtlsGroup()
    {
        for (final RegistDtlsGroupDecoder registDtlsGroupDecoder : registDtlsGroupIterator.iterator())
        {
            registDtlsGroupDecoder.reset();
            if (registDtlsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noRegistDtlsGroupCounter = MISSING_INT;
        hasNoRegistDtlsGroupCounter = false;
    }

    public void resetDistribInstsGroup()
    {
        for (final DistribInstsGroupDecoder distribInstsGroupDecoder : distribInstsGroupIterator.iterator())
        {
            distribInstsGroupDecoder.reset();
            if (distribInstsGroupDecoder.next() == null)
            {
                break;
            }
        }
        noDistribInstsGroupCounter = MISSING_INT;
        hasNoDistribInstsGroupCounter = false;
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
        builder.append("\"MessageName\": \"RegistrationInstructions\",\n");
        builder.append("  \"header\": ");
        header.appendTo(builder, level + 1);
        builder.append("\n");
        indent(builder, level);
        builder.append("\"RegistID\": \"");
        builder.append(this.registID(), 0, registIDLength());
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"RegistTransType\": \"");
        builder.append(registTransType);
        builder.append("\",\n");

        indent(builder, level);
        builder.append("\"RegistRefID\": \"");
        builder.append(this.registRefID(), 0, registRefIDLength());
        builder.append("\",\n");

        if (hasClOrdID())
        {
            indent(builder, level);
            builder.append("\"ClOrdID\": \"");
            builder.append(this.clOrdID(), 0, clOrdIDLength());
            builder.append("\",\n");
        }

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

        if (hasAccount())
        {
            indent(builder, level);
            builder.append("\"Account\": \"");
            builder.append(this.account(), 0, accountLength());
            builder.append("\",\n");
        }

        if (hasAcctIDSource())
        {
            indent(builder, level);
            builder.append("\"AcctIDSource\": \"");
            builder.append(acctIDSource);
            builder.append("\",\n");
        }

        if (hasRegistAcctType())
        {
            indent(builder, level);
            builder.append("\"RegistAcctType\": \"");
            builder.append(this.registAcctType(), 0, registAcctTypeLength());
            builder.append("\",\n");
        }

        if (hasTaxAdvantageType())
        {
            indent(builder, level);
            builder.append("\"TaxAdvantageType\": \"");
            builder.append(taxAdvantageType);
            builder.append("\",\n");
        }

        if (hasOwnershipType())
        {
            indent(builder, level);
            builder.append("\"OwnershipType\": \"");
            builder.append(ownershipType);
            builder.append("\",\n");
        }

    if (hasNoRegistDtlsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"RegistDtlsGroup\": [\n");
        RegistDtlsGroupDecoder registDtlsGroup = this.registDtlsGroup;
        for (int i = 0, size = this.noRegistDtlsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            registDtlsGroup.appendTo(builder, level + 1);            if (registDtlsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            registDtlsGroup = registDtlsGroup.next();        }
        indent(builder, level);
        builder.append("],\n");
    }

    if (hasNoDistribInstsGroupCounter)
    {
        indent(builder, level);
        builder.append("\"DistribInstsGroup\": [\n");
        DistribInstsGroupDecoder distribInstsGroup = this.distribInstsGroup;
        for (int i = 0, size = this.noDistribInstsGroupCounter; i < size; i++)
        {
            indent(builder, level);
            distribInstsGroup.appendTo(builder, level + 1);            if (distribInstsGroup.next() != null)
            {
                builder.append(',');
            }
            builder.append('\n');
            distribInstsGroup = distribInstsGroup.next();        }
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
    public RegistrationInstructionsEncoder toEncoder(final Encoder encoder)
    {
        return toEncoder((RegistrationInstructionsEncoder)encoder);
    }

    public RegistrationInstructionsEncoder toEncoder(final RegistrationInstructionsEncoder encoder)
    {
        encoder.reset();
        encoder.registID(this.registID(), 0, registIDLength());
        encoder.registTransType(this.registTransType());
        encoder.registRefID(this.registRefID(), 0, registRefIDLength());
        if (hasClOrdID())
        {
            encoder.clOrdID(this.clOrdID(), 0, clOrdIDLength());
        }


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


        if (hasAccount())
        {
            encoder.account(this.account(), 0, accountLength());
        }

        if (hasAcctIDSource())
        {
            encoder.acctIDSource(this.acctIDSource());
        }

        if (hasRegistAcctType())
        {
            encoder.registAcctType(this.registAcctType(), 0, registAcctTypeLength());
        }

        if (hasTaxAdvantageType())
        {
            encoder.taxAdvantageType(this.taxAdvantageType());
        }

        if (hasOwnershipType())
        {
            encoder.ownershipType(this.ownershipType());
        }


        final RgstDtlsGrpEncoder rgstDtlsGrp = encoder.rgstDtlsGrp();        if (hasNoRegistDtlsGroupCounter)
        {
            final int size = this.noRegistDtlsGroupCounter;
            RegistDtlsGroupDecoder registDtlsGroup = this.registDtlsGroup;
            RegistDtlsGroupEncoder registDtlsGroupEncoder = rgstDtlsGrp.registDtlsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (registDtlsGroup != null)
                {
                    registDtlsGroup.toEncoder(registDtlsGroupEncoder);
                    registDtlsGroup = registDtlsGroup.next();
                    registDtlsGroupEncoder = registDtlsGroupEncoder.next();
                }
            }
        }



        final RgstDistInstGrpEncoder rgstDistInstGrp = encoder.rgstDistInstGrp();        if (hasNoDistribInstsGroupCounter)
        {
            final int size = this.noDistribInstsGroupCounter;
            DistribInstsGroupDecoder distribInstsGroup = this.distribInstsGroup;
            DistribInstsGroupEncoder distribInstsGroupEncoder = rgstDistInstGrp.distribInstsGroup(size);
            for (int i = 0; i < size; i++)
            {
                if (distribInstsGroup != null)
                {
                    distribInstsGroup.toEncoder(distribInstsGroupEncoder);
                    distribInstsGroup = distribInstsGroup.next();
                    distribInstsGroupEncoder = distribInstsGroupEncoder.next();
                }
            }
        }

        return encoder;
    }

}
