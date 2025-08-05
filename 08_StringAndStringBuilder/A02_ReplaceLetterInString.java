public class A02_ReplaceLetterInString {

    public static void main(String[] args) {
        String str = "abceoieppe";
        String result = " ";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'e'){
                result = result+'i';
            }
            else {
                result = result+str.charAt(i);
            }
        }

        System.out.println(result);
    }
}
