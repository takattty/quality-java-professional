package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // 下の文字列の重複を無くし、その結果を返す
        // 結果: abcbabc;
        String data = "abcccbaabcc";

        StringBuilder sb = new StringBuilder();
        sb.append(data.charAt(0));
        for (int i = 1; i < data.length(); i++) {
            char ch = data.charAt(i);
            if(ch != data.charAt(i - 1)) {
                sb.append(data.charAt(i));
            }
        }
        System.out.println(sb);

    }
}
