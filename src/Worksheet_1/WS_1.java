package Worksheet_1;

public class WS_1 {

    private void getOct(int i){
        int rest = i%8;
        int div = (i/8);

        if (div>0){
            getOct(div);
            System.out.print(rest);
        } else {
            System.out.print(rest);
        }
    }

    private void getBin(int i){
        int rest = i%2;
        int div = (i/2);

        if (div>0){
            getBin(div);
            System.out.print(rest);
        } else {
            System.out.print(rest);
        }
    }

    private String printRest(int rest){
        switch (rest) {
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
                return (String.valueOf(rest));
        }
    }

    private void getHex(int i){
        //System.out.print(i);
        int rest = i%16;
        int div = (i/16);

        if (div>0){
            getHex(div);
            System.out.print(printRest(rest));
        } else {
            System.out.print(printRest(rest));
        }
    }

    public void int2Boh(int i){
        getOct(i);
        System.out.print(" ");
        getBin(i);
        System.out.print(" ");
        getHex(i);
    }

    public static void main (String s[]){
        WS_1 x = new WS_1();
        x.int2Boh(8889);
    }
}
