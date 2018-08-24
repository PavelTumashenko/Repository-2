package package1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NewTest 
{
    @Test
    public void NameIsVisible()
    {
        App app = new App();
    	assertTrue(app.searchValeryKharlamov());
    }
}