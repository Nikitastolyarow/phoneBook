import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        String name = "Nik";
        long number = 12345678L;
        PhoneBook phoneBook = new PhoneBook();
        int result = phoneBook.add(name,number);
        assertEquals(1,result);
    }
    @Test
    public void testFindByNumber(){
        String name = "Nik";
        long number = 12345678L;
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name,number);
        String result = phoneBook.findByNumber(number);
        assertEquals(name,result);
    }
    @Test
    public void testFindByName(){
        String name = "Nik";
        long number = 12345678L;
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add(name,number);
        Long result = phoneBook.FindByName(name);
        assertEquals(name,result);
    }
}
