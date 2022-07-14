import org.junit.Assert;
import org.junit.jupiter.api.Test;
public class XspeeditTest {
    
    @Test
    public void packaging() {

        String packages = new Xspeedit().packageArticles("163841689525773");
        Assert.assertEquals(packages, "163/8/41/6/8/9/52/5/7/73");
    }
}