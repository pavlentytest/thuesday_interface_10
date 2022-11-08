public abstract class Test {
    abstract void toDo();
    void makeSound() {
        System.out.println("Sound!");
    }
}
class Base extends Test {

    public static int counter = 0;

    public static void doBase() {
        System.out.println("doBase()");
    }
    @Override
    void toDo() {

    }
}
