import linkedin_java.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    @Test
    public void personAttribute_firstName(){
        Person p=new Person("Ron", "Freeman",37);
        assertEquals("Ron",p.getFirstName());
    }
}
