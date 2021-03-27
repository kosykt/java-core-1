import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    private Map<String, Integer> phonebook;

    public PhoneBook(){
        phonebook = new HashMap<>();
    }

    public void add(String name, Integer number){
        phonebook.put(name, number);
    }

    public void get(String name){
        System.out.println(phonebook.get(name));

    }
}