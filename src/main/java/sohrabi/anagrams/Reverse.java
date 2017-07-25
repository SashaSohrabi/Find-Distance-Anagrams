public class Reverse {

    public static String reverse(String input) {

        char[] in = input.toCharArray();
        int begin = 0;
        int end = in.length - 1;
        char temp;
        while (end > begin) {
            temp = in[begin];
            in[begin] = in[end];
            in[end] = temp;
            end--;
            begin++;
        }
        String str = String.valueOf(in);
        String str2[] = str.split(" ");
        String finalStr = "";
        for (int i = str2.length - 1; i >= 0; i--) {
            finalStr += str2[i] + " ";
        }
        return finalStr;

    }

    public static void main(String[] arg) {
        String string = "мама мыла раму";
        System.out.println(reverse(string));
    }
}
