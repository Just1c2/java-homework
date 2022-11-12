public class ValueTypeAndReferenceType {
    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 10;

        Integer c = 1000;
        Integer d = 1000;

        boolean compare1 = a == b;
        boolean compare2 = c == d;

        System.out.println(compare1);
        System.out.println(compare2);
    }
}
