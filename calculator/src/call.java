import static org.junit.assert.*;
import org.junit.test;
public class call{
    @test
    public void call pass(){
        int a=1;
        int b=5;
        assertTrue(a + b ==6);
    }
    @test
    public void call fail() {
        int a = 1;
        int b = 5;
        assertTrue(a + b == 9);
    }
}