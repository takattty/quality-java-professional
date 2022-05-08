package projava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Formatted {
    public static String formmat(String number) {
        String result = "";
        List<String> list = new ArrayList<>();
        int index = 1;

        for (int i = number.length()-1; i >= 0; i--) {
            if (index == 4) {
                list.add(",");
                index = 1;
            }
            list.add(String.valueOf(number.charAt(i)));
            index++;
        }

        Collections.reverse(list);
        result = String.join("", list);

        return result;
    }
}
