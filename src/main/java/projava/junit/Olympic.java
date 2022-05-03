package projava.junit;

/**
 * 渡された西暦が夏季近代オリンピック開催年であるかどうか判定する
 * @param year 西暦年
 * @return 夏季オリンピックであればtrue
 * @throws IllegalArgumentException まだオリンピックが開催されていない年を入力した場合
 */

public class Olympic {
    public boolean isSummerOlympicYear(int year) throws IllegalArgumentException {
        if(2032 < year) {
            throw new IllegalArgumentException("2032年までをサポートしています。入力：" + year);
        }
        return year % 4 == 0;
    }
}
