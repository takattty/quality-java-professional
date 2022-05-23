package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String date = "abcccbaabcc";

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < date.length(); i++) {
            char ch = date.charAt(i);
            if (i>0 && ch == date.charAt(i-1)) {
                continue;
            }
            builder.append(ch);
        }
        String result = builder.toString();
        System.out.println(date);
        System.out.println(result);
    }
}
