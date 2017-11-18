/**
 * @auhor Anntonio Latela
 */

package Worksheet_1.ex;

import java.util.HashMap;

public class One {

    private String octResult = "";
    private String HexResult = "";
    private String binResult = "";

    /**
     *
     * @param i
     * @return
     */

    private String getOct(int i){
        int rest = i%8;
        int div = (i/8);

        if (div>0){
            getOct(div);
            octResult += rest;
        } else {
            octResult += rest;
        }
        return String.valueOf(octResult);
    }

    /**
     *
     * @param i
     * @return binResult
     */
    private String getBin(int i){
        int rest = i%2;
        int div = (i/2);

        if (div>0){
            getBin(div);
            binResult += (rest);
        } else {
            binResult += (rest);
        }
        return binResult;
    }

    /**
     *
     * @param mod
     * @return
     */
    private String getMod(int mod){
        switch (mod) {
            case 10:
                return ("A");
            case 11:
                return ("B");
            case 12:
                return ("C");
            case 13:
                return ("D");
            case 14:
                return ("E");
            case 15:
                return ("F");
            default:
                return (String.valueOf(mod));
        }
    }

    /**
     *
     * @param i
     * @return
     */
    private String getHex(int i){
        int rest = i%16;
        int div = (i/16);
        if (div>0){
            getHex(div);
            HexResult += (getMod(rest));
        } else {
            HexResult += (getMod(rest));
        }
        return HexResult;
    }

    /**
     *
     * @param i
     * @return
     */
    public HashMap int2Boh(int i){
        HashMap<String, String> ret = new HashMap<String, String>();
        ret.put("0d", String.valueOf(i));
        ret.put("0o", getOct(i));
        ret.put("0x", getHex(i));
        ret.put("0b", getBin(i));

        return ret;

    }

}
