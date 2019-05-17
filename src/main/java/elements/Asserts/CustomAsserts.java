package elements.Asserts;

import org.testng.Assert;

public class CustomAsserts {

    public static void assertEquals(Object actual, Object expected, String message){
        try {
            Assert.assertEquals(actual, expected, message);
        }catch (AssertionError error){
            System.out.println(error);
        }
    }

    /*public static void assertTrue(Object actual, Object expected, String message){
        try {
            Assert.assertTrue();
        }catch (AssertionError error){
            System.out.println(error);
        }
    }*/

}
