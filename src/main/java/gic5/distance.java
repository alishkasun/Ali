package gic5;

public class distance {

    public static void main(String[] args) {
        Cat cat = new Cat("Кай", 2,200, 0);
        dog dog = new dog("Рэкс", 0.5f, 500, 10);
        horse horse = new horse("Стрела", 3, 1500,100);
        bird bird = new bird("Гоша", 0.2f,5 ,0);

        animal[] arr = {cat, dog, horse, bird};
        float toJump = 2.1f;
        float toRun = 350;
        float toSwim = 11;

        for (int i = 0; i < arr.length; i++) {
            String nameString = arr[i].getType() + " " + arr[i].getName() + " умеет ";

            String eventName = String.format("прыгать на %.2f м. А хочет на ", arr[i].getJump());
            String eventResult = (arr[i].jump(toJump)) ? " удалось" : "не удалось";
            System.out.println(nameString + eventName + toJump + " и " + eventResult);

            eventName = String.format("бегать %.2f м. А хочет на ", arr[i].getRun());
            eventResult = arr[i].run(toRun) ? " удалось" : "не удалось";
            System.out.println(nameString + eventName + toRun + " и " + eventResult);

            int swimResult = arr[i].swim(toSwim);
            eventName = String.format("плавать %.2f м. А хочет на ", arr[i].getSwim());
            eventResult = (swimResult == animal.SWIM_OK) ? " удалось" : "не удалось";
            if (swimResult == animal.SWIM_NONE)
                eventResult = " потому что не умеет";
            System.out.println(nameString + eventName + toSwim + "и" + eventResult);
        }
    }
}
