package projava;

public class FormattedUse {
    public static void main(String[] args) {
//        String result1 = Formatted.format(120);
//        System.out.printf("入力：　%d", 120);
//        System.out.println();
//        System.out.println(result1);
//
//        String result2 = Formatted.format(120000000);
//        System.out.printf("入力：　%d", 120000000);
//        System.out.println();
//        System.out.println(result2);
//
//        String result3 = Formatted.format(1200000000);
//        System.out.printf("入力：　%d", 1200000000);
//        System.out.println();
//        System.out.println(result3);

        Formatted instance = new Formatted("test%s");
        String result4 = instance.format(1200000000);
        System.out.printf("入力：　%d", 1200000000);
        System.out.println();
        System.out.println(result4);
    }
}
