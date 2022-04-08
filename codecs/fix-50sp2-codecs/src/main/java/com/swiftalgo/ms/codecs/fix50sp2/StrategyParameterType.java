/* Generated Fix Gateway message codec */
package com.swiftalgo.ms.codecs.fix50sp2;

import uk.co.real_logic.artio.dictionary.CharArrayMap;
import uk.co.real_logic.artio.dictionary.CharArrayWrapper;
import org.agrona.collections.IntHashSet;
import java.util.Map;
import java.util.HashMap;
import uk.co.real_logic.artio.builder.IntRepresentable;
public enum StrategyParameterType implements IntRepresentable
{
    INT(1),
    LENGTH(2),
    NUMINGROUP(3),
    SEQNUM(4),
    TAGNUM(5),
    FLOAT(6),
    QTY(7),
    PRICE(8),
    PRICEOFFSET(9),
    AMT(10),
    PERCENTAGE(11),
    CHAR(12),
    BOOLEAN(13),
    STRING(14),
    MULTIPLECHARVALUE(15),
    CURRENCY(16),
    EXCHANGE(17),
    MONTHYEAR(18),
    UTCTIMESTAMP(19),
    UTCTIMEONLY(20),
    LOCALMKTDATE(21),
    UTCDATEONLY(22),
    DATA(23),
    MULTIPLESTRINGVALUE(24),
    COUNTRY(25),
    LANGUAGE(26),
    TZTIMEONLY(27),
    TZTIMESTAMP(28),
    TENOR(29),
    NULL_VAL(-2147483648),
    ARTIO_UNKNOWN(2147483647);

    private final int representation;

    StrategyParameterType(final int representation)
    {
         this.representation = representation;
    }

    public final int representation() { return representation; }

    private static final IntHashSet intSet = new IntHashSet(58);
        static
    {
        intSet.add(1);
        intSet.add(2);
        intSet.add(3);
        intSet.add(4);
        intSet.add(5);
        intSet.add(6);
        intSet.add(7);
        intSet.add(8);
        intSet.add(9);
        intSet.add(10);
        intSet.add(11);
        intSet.add(12);
        intSet.add(13);
        intSet.add(14);
        intSet.add(15);
        intSet.add(16);
        intSet.add(17);
        intSet.add(18);
        intSet.add(19);
        intSet.add(20);
        intSet.add(21);
        intSet.add(22);
        intSet.add(23);
        intSet.add(24);
        intSet.add(25);
        intSet.add(26);
        intSet.add(27);
        intSet.add(28);
        intSet.add(29);
    }



    public static boolean isValid(final int representation)
    {
        return intSet.contains(representation);
    }
    public static StrategyParameterType decode(final int representation)
    {
        switch(representation)
        {
        case 1: return INT;
        case 2: return LENGTH;
        case 3: return NUMINGROUP;
        case 4: return SEQNUM;
        case 5: return TAGNUM;
        case 6: return FLOAT;
        case 7: return QTY;
        case 8: return PRICE;
        case 9: return PRICEOFFSET;
        case 10: return AMT;
        case 11: return PERCENTAGE;
        case 12: return CHAR;
        case 13: return BOOLEAN;
        case 14: return STRING;
        case 15: return MULTIPLECHARVALUE;
        case 16: return CURRENCY;
        case 17: return EXCHANGE;
        case 18: return MONTHYEAR;
        case 19: return UTCTIMESTAMP;
        case 20: return UTCTIMEONLY;
        case 21: return LOCALMKTDATE;
        case 22: return UTCDATEONLY;
        case 23: return DATA;
        case 24: return MULTIPLESTRINGVALUE;
        case 25: return COUNTRY;
        case 26: return LANGUAGE;
        case 27: return TZTIMEONLY;
        case 28: return TZTIMESTAMP;
        case 29: return TENOR;
        default:
            return ARTIO_UNKNOWN;
        }
    }
}
