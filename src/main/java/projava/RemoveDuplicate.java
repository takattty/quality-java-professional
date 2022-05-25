package projava;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // 下の文字列の重複を無くし、その結果を返す
        // 結果: abcbabc;
        String data = "abcccbaabcc";
        StringBuilder sb = new StringBuilder();

//        sb.append(data.charAt(0));
//        for (int i = 1; i < data.length(); i++) {
//            char ch = data.charAt(i);
//            if(ch != data.charAt(i - 1)) {
//                sb.append(data.charAt(i));
//            }
//        }
//        String strSb = sb.toString();
//        System.out.println(data);
//        System.out.println(sb);

        // 上の処理だとsb.appendが2回出てて綺麗じゃないな。
        // まとめたい。

        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (i > 0 && ch == data.charAt(i-1)) {
                continue;
            }
            sb.append(ch);
        }
        String strSb = sb.toString();
        System.out.println(data);
        System.out.println(strSb);

    }
}
