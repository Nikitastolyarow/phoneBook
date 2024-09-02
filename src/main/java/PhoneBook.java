import java.util.HashMap;

public class PhoneBook {
    public HashMap<String, Long> namesAndNumber = new HashMap<>();

    public int add(String name, long number) {
        if (!namesAndNumber.containsKey(name)) {
            namesAndNumber.put(name, number);
        }
        return namesAndNumber.size();
    }
}