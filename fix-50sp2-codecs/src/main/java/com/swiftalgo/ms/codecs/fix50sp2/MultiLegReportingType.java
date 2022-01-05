/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.CharRepresentable;
public enum MultiLegReportingType implements CharRepresentable
{
    SINGLE_SECURITY('1'),
    INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY('2'),
    MULTI_LEG_SECURITY('3'),
    NULL_VAL(''),
    ARTIO_UNKNOWN('');

    private final char representation;

    MultiLegReportingType(final char representation)
    {
         this.representation = representation;
    }

    public final char representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add('1');
        intSet.add('2');
        intSet.add('3');
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static MultiLegReportingType decode(final int representation)
    {
        switch(representation)
        {
        case '1': return SINGLE_SECURITY;
        case '2': return INDIVIDUAL_LEG_OF_A_MULTI_LEG_SECURITY;
        case '3': return MULTI_LEG_SECURITY;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
