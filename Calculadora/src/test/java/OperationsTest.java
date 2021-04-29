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

    @Test
    public void mustReturn1When2DividedBy2(){
        //Arrange
        int x=2, y=2;
        //Act
        double result = Operation.divide(x, y);
        //Assert
        Assert.assertEquals(1.0, result, 0.01);
    }

    @Test
    public void mustReturn2point5When5DividedBy2(){
        double x = 5, y = 2;

        double result = Operation.divide(x, y);
        System.out.println(result);
        Assert.assertEquals(2.5, result, 0.01);
    }

    @Test
    public void mustReturn2point5When1point0AddedTo1point5(){
        double x = 1.0, y = 1.5;

        double result = Operation.add(x, y);

        Assert.assertEquals(2.5, result, 0.01);
    }

    @Test
    public void mustReturnMinus1point5WhenMinus2point5AddedTo1point0(){
        double x = -2.5, y = 1.0;

        double result = Operation.add(x, y);

        Assert.assertEquals(-1.5, result, 0.01);
    }


}
