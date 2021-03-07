public class Worker {
    private String name;
    private String position;
    private String email;
    private int phoneNumber;
    private int salary;
    private int age;

    Worker(String name, String position, String email, int phoneNumber, int salary, int age){
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    void printW() {
        if (this.age > 40) {
            System.out.println("Имя:" + name + ", должность:" + position + ", email:" + email + ", номер телефона:" + phoneNumber + ", зарплата:" + salary + ", возраст:" + age);
        }
    }
}

