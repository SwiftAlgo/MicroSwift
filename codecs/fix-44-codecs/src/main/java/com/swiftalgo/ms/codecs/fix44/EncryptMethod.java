/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum EncryptMethod implements IntRepresentable
{
    NONE_OTHER(0),
    PKCS(1),
    DES(2),
    PKCS_DES(3),
    PGP_DES(4),
    PGP_DES_MD5(5),
    PEM_DES_MD5(6),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    EncryptMethod(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(14);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static EncryptMethod decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NONE_OTHER;
        case 1: return PKCS;
        case 2: return DES;
        case 3: return PKCS_DES;
        case 4: return PGP_DES;
        case 5: return PGP_DES_MD5;
        case 6: return PEM_DES_MD5;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
