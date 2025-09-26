public class A02_SetBit {

    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        int setbit = bitmask | n;
        System.out.println(setbit);


    }


}
