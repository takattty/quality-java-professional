package projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckFloat {
    enum FloatState {
        START, INT, FRAC_START, FRAC, ZERO
    }

    // Pattern.compileで正規表現を解析
    // 文字列を解釈する家庭を管理するMatcherオブジェクト
    // Macherオブジェクトに対してMatchesメソッドで、文字列が正規表現に適合するかを判定
    static Pattern pat = Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
    static boolean regCheck(String data) {
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
    static boolean check(String data) {
        var state = FloatState.START;

        for (char ch : data.toCharArray()) {
            switch (state) {
                case START: {
                    if (ch == '0') {
                        state = FloatState.ZERO;
                        break;
                    } else if (ch >= '1' && ch <= '9') {
                        state = FloatState.INT;
                        break;
                    } else {
                        return false;
                    }
                }

                case ZERO: {
                    if (ch == '.') {
                        state = FloatState.FRAC_START;
                        break;
                    } else {
                        return false;
                    }
                }

                case INT: {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.INT;
                        break;
                    } else if (ch == '.') {
                        state = FloatState.FRAC_START;
                        break;
                    } else {
                        return false;
                    }
                }

                case FRAC_START: {
                    if (ch >= '0' && ch <= '9') {
                        state = FloatState.FRAC;
                        break;
                    } else {
                        return false;
                    }
                }
            }
        }

        switch (state) {
            case ZERO:
            case INT:
            case FRAC:
                return true;
            default:
                return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(check(""));
        System.out.println(check("0123"));
        System.out.println(check(".12"));
        System.out.println(check("12."));
        System.out.println(check("1.2.3"));
        System.out.println(check("1..3"));
        System.out.println(check("0"));
        System.out.println(check("12"));
        System.out.println(check("12.3"));
        System.out.println(check("0.3"));
        System.out.println(check("12.30"));
        System.out.println();
        System.out.println(regCheck(""));
        System.out.println(regCheck("0123"));
        System.out.println(regCheck(".12"));
        System.out.println(regCheck("12."));
        System.out.println(regCheck("1.2.3"));
        System.out.println(regCheck("1..3"));
        System.out.println(regCheck("0"));
        System.out.println(regCheck("12"));
        System.out.println(regCheck("12.3"));
        System.out.println(regCheck("0.3"));
        System.out.println(regCheck("12.30"));
    }
}
