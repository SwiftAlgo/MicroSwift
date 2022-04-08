/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum AcctIDSource implements IntRepresentable
{
    BIC(1),
    SID_CODE(2),
    TFM(3),
    OMGEO(4),
    DTCC_CODE(5),
    OTHER(99),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    AcctIDSource(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(12);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(99);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static AcctIDSource decode(final int representation)
    {
        switch(representation)
        {
        case 1: return BIC;
        case 2: return SID_CODE;
        case 3: return TFM;
        case 4: return OMGEO;
        case 5: return DTCC_CODE;
        case 99: return OTHER;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
