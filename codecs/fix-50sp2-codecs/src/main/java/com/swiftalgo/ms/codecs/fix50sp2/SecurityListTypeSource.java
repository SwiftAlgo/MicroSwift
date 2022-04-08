/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum SecurityListTypeSource implements IntRepresentable
{
    ICB_PUBLISHED_BY_DOW_JONES_AND_FTSE_WWW_ICBENCHMARK_COM(1),
    NAICS_WWW_CENSUS_GOV_NAICS_OR_WWW_NAICS_COM_(2),
    GICS_PUBLISHED_BY_STANDARDS_POOR(3),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    SecurityListTypeSource(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static SecurityListTypeSource decode(final int representation)
    {
        switch(representation)
        {
        case 1: return ICB_PUBLISHED_BY_DOW_JONES_AND_FTSE_WWW_ICBENCHMARK_COM;
        case 2: return NAICS_WWW_CENSUS_GOV_NAICS_OR_WWW_NAICS_COM_;
        case 3: return GICS_PUBLISHED_BY_STANDARDS_POOR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
