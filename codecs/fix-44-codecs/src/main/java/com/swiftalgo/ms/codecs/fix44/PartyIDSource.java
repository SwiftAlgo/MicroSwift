/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum PartyIDSource implements CharRepresentable
{
    BIC('B'),
    GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER('C'),
    PROPRIETARY_CUSTOM_CODE('D'),
    ISO_COUNTRY_CODE('E'),
    SETTLEMENT_ENTITY_LOCATION('F'),
    MIC('G'),
    CSD_PARTICIPANT_MEMBER_CODE('H'),
    KOREAN_INVESTOR_ID('1'),
    TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID('2'),
    TAIWANESE_TRADING_ACCOUNT('3'),
    MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER('4'),
    CHINESE_B_SHARE('5'),
    UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER('6'),
    US_SOCIAL_SECURITY_NUMBER('7'),
    US_EMPLOYER_IDENTIFICATION_NUMBER('8'),
    AUSTRALIAN_BUSINESS_NUMBER('9'),
    AUSTRALIAN_TAX_FILE_NUMBER('A'),
    DIRECTED_BROKER('I'),
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
        intSet.add('B');
        intSet.add('C');
        intSet.add('D');
        intSet.add('E');
        intSet.add('F');
        intSet.add('G');
        intSet.add('H');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
        intSet.add('4');
        intSet.add('5');
        intSet.add('6');
        intSet.add('7');
        intSet.add('8');
        intSet.add('9');
        intSet.add('A');
        intSet.add('I');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static PartyIDSource decode(final int representation)
    {
        switch(representation)
        {
        case 'B': return BIC;
        case 'C': return GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER;
        case 'D': return PROPRIETARY_CUSTOM_CODE;
        case 'E': return ISO_COUNTRY_CODE;
        case 'F': return SETTLEMENT_ENTITY_LOCATION;
        case 'G': return MIC;
        case 'H': return CSD_PARTICIPANT_MEMBER_CODE;
        case '1': return KOREAN_INVESTOR_ID;
        case '2': return TAIWANESE_QUALIFIED_FOREIGN_INVESTOR_ID_QFII_FID;
        case '3': return TAIWANESE_TRADING_ACCOUNT;
        case '4': return MALAYSIAN_CENTRAL_DEPOSITORY_NUMBER;
        case '5': return CHINESE_B_SHARE;
        case '6': return UK_NATIONAL_INSURANCE_OR_PENSION_NUMBER;
        case '7': return US_SOCIAL_SECURITY_NUMBER;
        case '8': return US_EMPLOYER_IDENTIFICATION_NUMBER;
        case '9': return AUSTRALIAN_BUSINESS_NUMBER;
        case 'A': return AUSTRALIAN_TAX_FILE_NUMBER;
        case 'I': return DIRECTED_BROKER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
