public class HW5 {

    public static void main(String[] args) {
        Worker[] workersArray = new Worker[6];
        workersArray[0] = new Worker("Ivanov Ivan", "Engineer", "ivan@mailbox.com", 8999000, 30000, 30);
        workersArray[1] = new Worker("Petov Roman", "Engineer", "roman@mailbox.com", 8999111, 40000, 20);
        workersArray[2] = new Worker("Sidorov Ilia", "Engineer", "ilia@mailbox.com", 8999222, 50000, 50);
        workersArray[3] = new Worker("Vasilev Konstantin", "Engineer", "konstantin@mailbox.com", 8999333, 50000, 60);
        workersArray[4] = new Worker("Borisov Petr", "Engineer", "petr@mailbox.com", 8999444, 60000, 25);
        workersArray[5] = workersArray[4];
    }
}
