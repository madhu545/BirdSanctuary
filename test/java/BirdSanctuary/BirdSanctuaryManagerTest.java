package BirdSanctuary;
import static org.junit.Assert.assertEquals;
import BirdSanctuary.BirdSanctuaryManager;
import org.junit.Test;



public class BirdSanctuaryManagerTest
{
    @Test
    void givenAddBird_WhenProper_ReturnsTrue() {
        BirdSanctuaryManager bird = new BirdSanctuaryManager();
        int result = bird.getAllCount();
        assertEquals(10,result);
    }
}
