import com.thinkinginjava.part4.controlconstruction.IfElse2;
import org.junit.Assert;

/**
 * Created by Alex on 30.09.2018.
 */
public class Test {

    public final int TEST_VAL = 2;
    public final int TARGET = 4;
    public final int BEGIN = 1;
    public final int END = 12;
    public final int TARGET_2 = -3;


    @org.junit.Test
    public void test() throws Exception {
        Assert.assertEquals(-1, IfElse2.test2(TEST_VAL, TARGET, BEGIN,END));
        Assert.assertEquals(1, IfElse2.test2(TEST_VAL, TARGET_2, BEGIN,END));

    }
}
