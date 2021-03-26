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
        if (phonebook.get(name) == null){
            System.out.println(name + " отсутсвует в списке");
        }else {
            System.out.println(name + " : " + phonebook.get(name));
        }
    }
}
