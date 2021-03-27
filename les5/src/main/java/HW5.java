import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HW5 {

    private static class Worker {
        private String name;
        private String position;
        private String email;
        private int phoneNumber;
        private int salary;
        private int age;

        public Worker(String name, String position, String email, int phoneNumber, int salary, int age){
            this.name = name;
            this.position = position;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }
    }

    public static void main(String[] args) {

        List<Worker> workerList = new ArrayList<>(Arrays.asList(
                new Worker ("Ivanov Ivan", "Engineer", "ivan@mailbox.com", 8999000, 30000, 30),
                new Worker ("Petov Roman", "Engineer", "roman@mailbox.com", 8999111, 40000, 20),
                new Worker ("Sidorov Ilia", "Engineer", "ilia@mailbox.com", 8999222, 50000, 50),
                new Worker ("Vasilev Konstantin", "Engineer", "konstantin@mailbox.com", 8999333, 50000, 60),
                new Worker ("Borisov Petr", "Engineer", "petr@mailbox.com", 8999444, 60000, 25)
        ));

        List<String> old = workerList.stream()
                .filter(n -> n.age > 40)
                .map(p -> p.name)
                .collect(Collectors.toList());

        System.out.println(old);
    }
}
