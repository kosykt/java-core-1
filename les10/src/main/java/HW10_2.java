public class HW10_2 {

    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Ivanov", 123);
//        перезаписывает value?
        phonebook.add("Ivanov", 555);
        phonebook.add("Vasilev", 456);
        phonebook.add("Petrov", 789);
        phonebook.add("Sidorov", 987);
        phonebook.add("Mikhailov", 654);

        phonebook.get("Ivanov");
        phonebook.get("Petrov");
        phonebook.get("Sidorov");
        phonebook.get("Trump");
    }
}
