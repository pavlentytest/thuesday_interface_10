public class Main {
    public static void main(String[] args) {

        Test test = new Test();

        Base base = new Base();
        base.doBase();

        Base.doBase();
        Base.counter++;

        Base base1 = new Base();
        System.out.println(base1.counter);
        base1.counter++;

        Main.main();

        Math.abs();

        Calc calc = new Calc();
        Calc calc1 = (a, b) -> a*b;
        System.out.println(calc1.action(3,4));


        int a = 100;
        Integer b = 200;
        a = b;
        b = a;
        String str = "123";
        int x = Integer.parseInt(str);

        String result = Integer.toString(a); // "100"

        // int => Integer
        // char => Character
        // double => Double
        // boolean => Boolean


    }
}