package gic5;

public class horse extends animal{

    horse(String name, float Jump, float Run, float Swim) {
        super("Лошадь", name, Jump, Run, Swim);
    }
    @Override
    protected int swim(float distance) {
        return animal.SWIM_NONE;
    }
}