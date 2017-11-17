package Worksheet_1;

import Worksheet_1.ex.*;
import java.util.*;


public class WS_1 extends One{

    public static void main (String s[]){
/*
        WS_1 one = new WS_1();
        HashMap <String, String>hm = one.int2Boh(126);
        Iterator iter = hm.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry kv = (Map.Entry)iter.next();
            System.out.println(kv.getKey() + " : " + kv.getValue());
        }
*/
        Two two = new Two();
        System.out.println(two.getMax());
    }

}
