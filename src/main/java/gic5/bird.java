package gic5;

public class bird extends animal{

    bird(String name, float Jump, float Run, float Swim) {
        super("Птица", name, Jump, Run, Swim);
    }
    @Override
    protected int swim(float distance) {
        return animal.SWIM_NONE;
    }
}