public interface Calc {
    int action(int a, int b);
}

class Simple implements Calc {


    @Override
    public int action(int a, int b) {
        return 0;
    }
}
