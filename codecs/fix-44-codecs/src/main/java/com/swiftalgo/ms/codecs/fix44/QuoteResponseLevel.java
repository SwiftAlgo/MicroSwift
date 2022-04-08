/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix44;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum QuoteResponseLevel implements IntRepresentable
{
    NO_ACKNOWLEDGEMENT(0),
    ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES(1),
    ACKNOWLEDGE_EACH_QUOTE_MESSAGES(2),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    QuoteResponseLevel(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(6);
        static
    {
        intSet.add(0);
        intSet.add(1);
        intSet.add(2);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static QuoteResponseLevel decode(final int representation)
    {
        switch(representation)
        {
        case 0: return NO_ACKNOWLEDGEMENT;
        case 1: return ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES;
        case 2: return ACKNOWLEDGE_EACH_QUOTE_MESSAGES;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
