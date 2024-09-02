import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    public HashMap<String, Long> namesAndNumber = new HashMap<>();

    public int add(String name, long number) {
        if (!namesAndNumber.containsKey(name)) {
            namesAndNumber.put(name, number);
        }
        return namesAndNumber.size();
    }
    public String findByNumber(Long number){
        return namesAndNumber.entrySet()
                .stream()
                .filter(s -> s.getValue().equals(number))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);
    }
    public Long findByName(String name){
        return namesAndNumber.get(name);
    }
}