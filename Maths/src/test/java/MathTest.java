import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class MathTest {

    Scanner sc = new Scanner(System.in);
    int a= sc.nextInt();
    int b= sc.nextInt();
    @Test
    public void addresult(){
        final int expected= 10;
        final int actual= MathFunc.add(a,b);
        assertEquals("Test case passed!",actual,expected);


        }
    @Test
    public void mulresult(){
        final int expected= 30;
        final int actual=MathFunc.multiply(a,b);
        assertEquals("Test case failed!",actual,expected);
    }
    @Test
    public void multi() {
        final int expected= 90;
        final int actual=MathFunc.multiply(a,b);
        assertEquals("Test Case failed!",actual,expected);
    }


}

