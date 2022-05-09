package projava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Formatted {
    String text;

    Formatted(String text) {
        this.text = text;
    }
    public String format(int number) {
        System.out.println(this.text);
        String[] textArray = this.text.split("%");
        for(String element : textArray) {
            System.out.println(element);
        }

        String symbol = textArray[1];
        if (symbol.equals("s")) {
            System.out.println("数値が代入されます");
        } else if (symbol.equals("d")) {
            System.out.println("文字列が代入されます");
        } else {
            System.out.println("想定外の値が渡されました");
        }

        String strNumber = String.valueOf(number);
        String result;
        List<String> list = new ArrayList<>();
        int index = 1;

        for (int i = strNumber.length()-1; i >= 0; i--) {
            if (index == 4) {
                list.add(",");
                index = 1;
            }
            list.add(String.valueOf(strNumber.charAt(i)));
            index++;
        }

        Collections.reverse(list);
        result = String.join("", list);

        return result;
    }
}
