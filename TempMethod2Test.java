package tempmethod2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class TempMethod2Test {
     
    @Test
    
    public void testTemperature(){
        
        TempMethod2 c = new TempMethod2();
        
        c.dockerBuildImage();
        c.dockerHubPush();
        c.isPositive(25);   
    }
}
