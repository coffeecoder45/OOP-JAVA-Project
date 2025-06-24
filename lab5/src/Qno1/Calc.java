package Qno1;

public class Calc implements Num{
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int diff(int x, int y) {
        return x-y;
    }
}
