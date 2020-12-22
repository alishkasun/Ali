package gic4;

public class Workers {

    private static final int CURRENT_YEAR = 2020;

    private String fio;
    private String post;
    private String phone;
    private float salary;
    private int year;

    Workers(String fio,
            String post,
            String phone,
            float salary,
            int year){
        this.year = year;
        this.fio = fio;
        this.post = post;
        this.phone = phone;
        this.salary = salary;
    }

    int getAge() {
        return CURRENT_YEAR - year;
    }
    int getSalary() {
        return (int) salary;
    }


    String getFio() {
        return fio;
    }


    String getPost() {
        return post;
    }

    String getPhone() {
        return phone;
    }

    String getFullInfo() {
        return  this.fio + " " +
                this.getAge() + " лет " +
                this.post + " номер " +
                this.phone + " Должность " +
                this.getSalary() + " руб";
    }
}
