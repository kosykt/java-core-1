import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
//    что-то не то
//    class NumList{
//        private List<Integer> numList;
//
//        public NumList(){
//            numList = new ArrayList<>();
//        }
//
//        public void addNum(Integer num){
//            numList.add(num);
//        }
//
//        public int getNum(){
//            return numList.get();
//        }
//    }

    private Map<String, Integer> phonebook;

    public PhoneBook(){
        phonebook = new HashMap<>();
    }
//                                  List?Map?
//              add(String name, список телефонов)
    public void add(String name, Integer number){
        phonebook.put(name, number);
    }
//      работает но не показывает дубликаты Value
    public void get(String name){
        if (phonebook.get(name) == null){
            System.out.println(name + " отсутсвует в списке");
        }else {
            System.out.println(name + " : " + phonebook.get(name));
        }
    }
}