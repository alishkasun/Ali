package gic4;

public class hw4 {
    public static void main(String[] args) {
        Workers mainWorkers = new Workers("Капишена Алина Игревна", "инженер",
                "89874954555", 50000, 1970);

        System.out.println(mainWorkers.getFio() + " " + mainWorkers.getPost() + ".");

        Workers[] workers = {
                mainWorkers,
                new Workers("Капишен Андрей Александрович", "директор",
                        "98541256599", 100000, 1980),
                new Workers("Светлана Дерисовна Забияка", "бухгалтер",
                        "89584152633", 90000, 1980),
                new Workers("Кирилл Антонович Кух", "водитель",
                        "89584152633", 40000, 1965),
                new Workers("Арина Александровна Шпак", "секретарь",
                        "89584152633", 35000, 1990),
                new Workers("Арина Алексеевна Сидорова", "завхоз",
                        "89584152633", 35000, 1995)

        };
        for (int i = 0; i < workers.length; i++)
            if (workers[i].getAge() > 40) {
                System.out.println(workers[i].getFullInfo());

            }
        System.out.println("-------------------------------");
        for (int i = 0; i < workers.length; i++)
            System.out.println(workers[i].getFullInfo());

    }

}