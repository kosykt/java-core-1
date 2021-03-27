public class App {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Ivanov", 123);
        phonebook.add("Petrov", 456);
        phonebook.add("Sidorov", 789);

        phonebook.get("Ivanov");
    }
}
