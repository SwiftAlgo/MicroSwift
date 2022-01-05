/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum RespondentType implements IntRepresentable
{
    ALL_MARKET_PARTICIPANTS(1),
    SPECIFIED_MARKET_PARTICIPANTS(2),
    ALL_MARKET_MAKERS(3),
    PRIMARY_MARKET_MAKER(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    RespondentType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(8);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static RespondentType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ALL_MARKET_PARTICIPANTS;
        case 2: return SPECIFIED_MARKET_PARTICIPANTS;
        case 3: return ALL_MARKET_MAKERS;
        case 4: return PRIMARY_MARKET_MAKER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
