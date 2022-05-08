package projava;

public class FormattedUse {
    public static void main(String[] args) {
        String result1 = Formatted.formmat(String.valueOf(120));
        System.out.printf("入力：　%d", 120);
        System.out.println();
        System.out.println(result1);

        String result2 = Formatted.formmat(String.valueOf(120000000));
        System.out.printf("入力：　%d", 120000000);
        System.out.println();
        System.out.println(result2);

        String result3 = Formatted.formmat(String.valueOf(1200000000));
        System.out.printf("入力：　%d", 1200000000);
        System.out.println();
        System.out.println(result3);
    }
}
