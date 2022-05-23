package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String date = "abcccbaabcc";

        StringBuilder builder = new StringBuilder();
        char prev = 0;
        for(char ch : date.toCharArray()) {
            if(ch == prev) {
                continue;
            }
            builder.append(ch);
            prev = ch;
        }
        String result = builder.toString();
        System.out.println(date);
        System.out.println(result);
    }
}
