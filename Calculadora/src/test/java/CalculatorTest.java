import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test(expected = IllegalStateException.class)
    public void whenTryToAccesTheCalculatorContructor_ShouldGetAnException() throws IllegalStateException{
        Calculator calculator = new Calculator();
    }

    @Test
    public void whenAdd5and3_shouldReturn8(){
        int x=5;
        int y=3;
        int additionResult = Calculator.sum(x,y);
        Assert.assertEquals(8,additionResult);
    }

    @Test
    public void whenAdd2and2_shouldReturn4(){
        int x=2;
        int y=2;
        int additionResult = Calculator.sum(x,y);
        Assert.assertEquals(4,additionResult);
    }

    @Test
    public void whensubtract5and3_shouldReturn2(){
        int x=5;
        int y=3;
        int subtractionResult = Calculator.subtraction(x,y);
        Assert.assertEquals(2,subtractionResult);
    }

    @Test
    public void whenMultiply3and5_shouldReturn15(){
        int x=3;
        int y=5;
        int multiplicationResult = Calculator.multiplication(x,y);
        Assert.assertEquals(15,multiplicationResult);
    }

    @Test(expected = IllegalStateException.class)
    public void whenDivede0by0_shouldReturnAnError()throws IllegalStateException{
        int divisionResult = Calculator.division(0,0);
    }

    @Test
    public void whenDivide5by5_shouldReturn1(){
        int divisionResult =Calculator.division(5,5);
        Assert.assertEquals(1,divisionResult);
    }

    @Test
    public  void whenAdd2point0And2point9_ShouldReturn4point9(){
        double x = 2.0;
        double y = 2.9;
        double additionResult = Calculator.sum(x,y);
        Assert.assertEquals(4.9,additionResult,0.000001);
    }
}
