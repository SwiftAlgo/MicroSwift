/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PartyIDSource implements CharRepresentable
{
    UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER('6'),
    KOREAN_INVESTOR_ID('1'),
    DIRECTED_BROKER_THREE_CHARACTER_ACRONYM_AS_DEFINED_IN_ISITC_ETC_BEST_PRACTICE_GUIDELINES_DOCUMENT('I'),
    BIC('B'),
    US_SOCIAL_SECURITY_NUMBER('7'),
    TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID('2'),
    GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER('C'),
    US_EMPLOYER_OR_TAX_ID_NUMBER('8'),
    TAIWANESE_TRADING_ACCT('3'),
    PROPRIETARY_CUSTOM_CODE('D'),
    AUSTRALIAN_BUSINESS_NUMBER('9'),
    MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER('4'),
    ISO_COUNTRY_CODE('E'),
    AUSTRALIAN_TAX_FILE_NUMBER('A'),
    CHINESE_INVESTOR_ID('5'),
    SETTLEMENT_ENTITY_LOCATION('F'),
    MIC('G'),
    CSD_PARTICIPANT_MEMBER_CODE('H'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    PartyIDSource(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(36);
        static
    {
        intSet.add('6');
        intSet.add('1');
        intSet.add('I');
        intSet.add('B');
        intSet.add('7');
        intSet.add('2');
        intSet.add('C');
        intSet.add('8');
        intSet.add('3');
        intSet.add('D');
        intSet.add('9');
        intSet.add('4');
        intSet.add('E');
        intSet.add('A');
        intSet.add('5');
        intSet.add('F');
        intSet.add('G');
        intSet.add('H');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PartyIDSource decode(final int representation)
    {
        switch(representation)
        {
        case '6': return UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER;
        case '1': return KOREAN_INVESTOR_ID;
        case 'I': return DIRECTED_BROKER_THREE_CHARACTER_ACRONYM_AS_DEFINED_IN_ISITC_ETC_BEST_PRACTICE_GUIDELINES_DOCUMENT;
        case 'B': return BIC;
        case '7': return US_SOCIAL_SECURITY_NUMBER;
        case '2': return TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID;
        case 'C': return GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER;
        case '8': return US_EMPLOYER_OR_TAX_ID_NUMBER;
        case '3': return TAIWANESE_TRADING_ACCT;
        case 'D': return PROPRIETARY_CUSTOM_CODE;
        case '9': return AUSTRALIAN_BUSINESS_NUMBER;
        case '4': return MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER;
        case 'E': return ISO_COUNTRY_CODE;
        case 'A': return AUSTRALIAN_TAX_FILE_NUMBER;
        case '5': return CHINESE_INVESTOR_ID;
        case 'F': return SETTLEMENT_ENTITY_LOCATION;
        case 'G': return MIC;
        case 'H': return CSD_PARTICIPANT_MEMBER_CODE;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
