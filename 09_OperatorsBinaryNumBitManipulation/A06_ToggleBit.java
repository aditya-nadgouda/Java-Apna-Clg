public class A06_ToggleBit {
//Write a program to toggle a bit a position = “pos” in a number “n”.
    public static void main(String[] args) {

        int num = 5;
        int pos = 2;
        int bitmask = 1 << pos;

        int result = num ^ bitmask;
        System.out.println(result);


    }
}
