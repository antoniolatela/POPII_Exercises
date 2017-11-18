package Worksheet_1;

import Worksheet_1.ex.*;
import java.util.*;


public class WS_1 extends Int2HexOctBin{

        public static void main (String s[]){
/*        WS_1 one = new WS_1();
        HashMap <String, String>hm = one.int2Boh(Integer.parseInt(s[0]));
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry kv = (Map.Entry)iter.next();
            System.out.println(kv.getKey() + " : " + kv.getValue());
        }
*/

        WorkSheet_One ws1 = new WorkSheet_One();
        String ss = (ws1.printUnicode("नमस्कार"));
            System.out.println(ss);

        }

}
