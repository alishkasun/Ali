package gic5;

class Cat extends animal {

    Cat(String name, float Jump, float Run, float Swim) {
        super("Кот", name, Jump, Run, Swim);
    }

    @Override
    protected int swim(float distance) {
        return animal.SWIM_NONE;
    }
}