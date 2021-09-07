import Yatzy.YtzyCatogrecy;
import no.kristiana.Ytzy.YtzyGame;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YtzyTest {
    @Test
    void shoudScoreOnce(){
        assertEquals(4,new YtzyGame().score(YtzyCatogrecy.ONSE,new int[] { 1, 1, 2, 1, 1}));
    }

}
