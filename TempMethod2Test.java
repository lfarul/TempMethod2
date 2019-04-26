import org.junit.Test;

public class TempMethod2Test {
     
    @Test
    
    public void testTemperature(){
        
        TempMethod2 c = new TempMethod2();
        
        c.dockerBuildImage();
        c.dockerHubPush();
        c.isPositive(25);   
    }
}
