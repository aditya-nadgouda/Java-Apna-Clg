public class A03_ClearBit {
// clear bit = make bit "Zero" / "0"
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << pos;

        int notBitMask = ~bitmask;

        int result = notBitMask & n;

        System.out.println(result);


    }
}
