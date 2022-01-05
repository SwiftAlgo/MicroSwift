/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum TickRuleType implements IntRepresentable
{
    REGULAR(0),
    VARIABLE(1),
    FIXED(2),
    TRADED_AS_A_SPREAD_LEG(3),
    SETTLED_AS_A_SPREAD_LEG(4),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    TickRuleType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(10);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static TickRuleType decode(final int representation)
    {
        switch(representation)
        {
        case 0: return REGULAR;
        case 1: return VARIABLE;
        case 2: return FIXED;
        case 3: return TRADED_AS_A_SPREAD_LEG;
        case 4: return SETTLED_AS_A_SPREAD_LEG;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
