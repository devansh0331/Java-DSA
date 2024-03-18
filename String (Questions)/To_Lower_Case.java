public class To_Lower_Case {
    public static void main(String[] args) {
        String s = "Hello";

        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s) {

        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char) (arr[i] - 'A' + 'a');
            }
        }
        return new String(arr);
    }
}
