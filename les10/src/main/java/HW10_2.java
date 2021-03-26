public class HW10_2 {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add(1111, "Ivanov");
        phonebook.add(2222, "Vasilev");
        phonebook.add(3333, "Petrov");
        phonebook.add(4444, "Sidorov");
        phonebook.add(5555, "Mikhailov");
        phonebook.add(1324, "Ivanov");

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Trump");
    }
}
