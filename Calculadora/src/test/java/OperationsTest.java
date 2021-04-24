import org.junit.Test;
import org.junit.Assert;


public class OperationsTest {


    @Test
    public void mustReturn4WhenAdd2Plus2(){
        //Arrange
        int x=2;
        int y=2;

        //Act
        int result = Operation.add(x, y);

        //Assert
        Assert.assertEquals(4, result);
    }
    @Test
    public void mustReturn2When2Minus4(){
        int x=4;
        int y=2;

        //Act
        int result = Operation.substract(x, y);

        //Assert
        Assert.assertEquals(2, result);
    }


}
