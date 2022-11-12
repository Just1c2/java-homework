public class App extends father {
    static int a = 5;
    static int b = 4;
    public App() {}
    public static void main(String[] args) {
        App obj = new App();
        TestAbtractMethod obj2 = new TestAbtractMethod();
        System.out.println(obj.tong2so(a, b));
        obj2.test();
    }
}
