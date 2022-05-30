package projava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RefCheckFloat {
    static Pattern pat = Pattern.compile("(0|[1-9][0-9]*)(\\.[0-9]+)?");
    static boolean check(String data) {
        Matcher mat = pat.matcher(data);
        return mat.matches();
    }
}
