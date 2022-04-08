/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MoneyLaunderingStatus implements CharRepresentable
{
    PASSED('Y'),
    NOT_CHECKED('N'),
    EXEMPT_BELOW_THE_LIMIT('1'),
    EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION('2'),
    EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MoneyLaunderingStatus(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add('Y');
        intSet.add('N');
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MoneyLaunderingStatus decode(final int representation)
    {
        switch(representation)
        {
        case 'Y': return PASSED;
        case 'N': return NOT_CHECKED;
        case '1': return EXEMPT_BELOW_THE_LIMIT;
        case '2': return EXEMPT_CLIENT_MONEY_TYPE_EXEMPTION;
        case '3': return EXEMPT_AUTHORISED_CREDIT_OR_FINANCIAL_INSTITUTION;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
