import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class RectangleTest {


    @Test
    void getareaofrectangle() {
        //assignement
        int  length=10, breadth=10;
        int expectedArea=100;

        //act
        Rectangl obj=new Rectangl();
       int actual=obj.getArea(length,breadth);

//       Assert
        assertEquals(expectedArea,actual);
    }

    @Test
    void TestifBothSidesOfrectangearezero() {
        int  length=0, breadth=0;
        int expectedArea=0;

        //act
        Rectangl obj=new Rectangl();
        int actual=obj.getArea(length,breadth);

//       Assert
        assertEquals(expectedArea,actual);
    }

    @Test
    void TestiflengthSidesOfrectangearezer0() {
        int  length=0, breadth=10;
        int expectedArea=0;

        //act
        Rectangl obj=new Rectangl();
        int actual=obj.getArea(length,breadth);

//       Assert
        assertEquals(expectedArea,actual);
    }



    //Getperimeter given the length and breadth


    @Test
    void Givenlength_10AndBreadth_10ThenPerimeteris40() {
        int  length=10, breadth=10;
        int expectedArea=40;

        //act
        Rectangl obj=new Rectangl();
        int actual=obj.getPerimeter(length,breadth);

//       Assert
        assertEquals(expectedArea,actual);
    }
}
