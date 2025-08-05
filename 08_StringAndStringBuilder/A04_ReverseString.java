public class A04_ReverseString {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("aabcc");


        //1
//        StringBuilder result = new StringBuilder("");

//        for (int i = sb.length()-1; i>=0; i--) {
//            result.append(sb.charAt(i));
//        }
//        System.out.println(result);


        // 2
        int start = 0;
        int end = sb.length()-1;
        while (start<end){
            char temp = sb.charAt(end);
            sb.setCharAt(end,sb.charAt(start));
            sb.setCharAt(start,temp);
            start++;
            end--;
        }

        System.out.println(sb);


//        System.out.println(sb.reverse());
    }
}
