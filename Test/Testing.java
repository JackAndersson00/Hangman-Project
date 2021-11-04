import org.junit.jupiter.api.Test;
import com.company.HangGame;
import com.company.HangLoad; //incase of future tests.
import com.company.HangPic; //incase of future tests.
import com.company.HangWord; //incase of future tests.
import com.company.Main; //incase of future tests.
import static org.junit.jupiter.api.Assertions.*;


public class Testing {
    @Test
    public void testCategoryStatusAnimals(){
        String result = HangGame.CategoryStatus(1);
        assertEquals("Animals", result);
    }
    @Test
    public void testCategoryStatusPeople(){
        String result = HangGame.CategoryStatus(2);
        assertEquals("People", result);
    }
    @Test
    public void testCategoryStatusPlaces(){
        String result = HangGame.CategoryStatus(3);
        assertEquals("Places", result);
    }
    @Test
    public void testCategoryStatusChaos(){
        String result = HangGame.CategoryStatus(4);
        assertEquals("Chaos", result);
    }
    @Test
    public void testCategoryStatusNotAnimals(){
        String result = HangGame.CategoryStatus(2);
        assertNotEquals("Animals", result);
    }

}
