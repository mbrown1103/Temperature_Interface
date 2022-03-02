/*Edited by: Matt Brown
Date: 2/23/22
*/
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TemperatureTest {

  private Temperature cTemp1;
  private Temperature fTemp1;
  
  private Temperature cTemp2;
  private Temperature fTemp2;

  @Before
  public void init() {
    cTemp1 = new CelsiusTemperature(100);
    fTemp1 = new FahrenheitTemperature(100, true);
	
	fTemp2 = new FahrenheitTemperature(50);
	cTemp2 = new CelsiusTemperature(50, true);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testForInvalidFTemp() {
    new FahrenheitTemperature(-1000);
  }
  
  @Test(expected = IllegalArgumentException.class)
  public void testForInvalidCTemp() {
    new CelsiusTemperature(-1000);
  }

  @Test
  public void testObservers() {
    assertEquals(100, cTemp1.inCelsius(), 0.001);
    assertEquals(212, cTemp1.inFahrenheit(), 0.001);
    assertEquals(373.15, cTemp1.inKelvin(), 0.001);
	
	assertEquals(100, fTemp1.inCelsius(), 0.001);
	assertEquals(212, fTemp1.inFahrenheit(), 0.001);
	assertEquals(373.15, fTemp1.inKelvin(), 0.001);
	
	assertEquals(10, cTemp2.inCelsius(), 0.001);
	assertEquals(50, cTemp2.inFahrenheit(), 0.001);
	assertEquals(283.15, cTemp2.inKelvin(), 0.001);
	
	assertEquals(10, fTemp2.inCelsius(), 0.001);
	assertEquals(50, fTemp2.inFahrenheit(), 0.001);
	assertEquals(283.15, fTemp2.inKelvin(), 0.001);
  }

  @Test
  public void testInFahrenheit() {
    assertEquals(212, fTemp1.inFahrenheit(), 0.001);
  }
 
  @Test
  public void testToString() {
    assertEquals("100.0° Celsius", cTemp1.toString());
    assertEquals("212.0° Fahrenheit", fTemp1.toString());
  }
  
  @Test
  public void testEquals() {
	  
	  Temperature cTemp3 = new CelsiusTemperature(100);
	  Temperature fTemp3 = new FahrenheitTemperature(50);

      assertEquals(cTemp3, cTemp1);
      assertNotEquals(cTemp3, cTemp2);

      assertEquals(fTemp3, fTemp2);
      assertNotEquals(fTemp3, fTemp1);
	  
  }
    /**
     * Testing static method Temp2Kelvin
     */
    @Test
    public void testTemp2Kelvin(){
      assertEquals(317.15,TempImp.temp2Kelvin(44,"C"),.1111);
      assertEquals(279.8166667,TempImp.temp2Kelvin(44,"F"),.1111);
    }
    /**
     * Testing static Temp2Cels method.
     */
    @Test
    public void testTemp2Cels(){
      assertEquals(-6.6666667,TempImp.temp2Cel(20,true),.1111);
      assertEquals(20,TempImp.temp2Cel(20,false),.1111);
    }
    /**
     * Testing static Temp2Fah method
     */
  @Test
  public void testTemp2Fah(){
      assertEquals(86, TempImp.temp2Fah(30,true),.1111);
      assertEquals(66,TempImp.temp2Fah(66,false),.111);
  }
    /**
     * Additional testing for newly created method
     */
  @Test
    public void testisFreezing(){
      Temperature ftemp = new FahrenheitTemperature(0);
      Temperature ctemp = new CelsiusTemperature(-2);
      assertTrue(ftemp.isFreezing());
      assertTrue(ctemp.isFreezing());
  }

    /**
     * Additional test for Extension static method
     */
  @Test
    public void testTemp2Rankine(){
      assertEquals(509.67,TempImp.Temp2Rankine(10,"C"),.1111);
      assertEquals(528.67,TempImp.Temp2Rankine(69,"F"),.1111);
  }
    /**
     * Additional test for Extension static method
     */
  @Test
    public void testTemp2Reaumur(){
      assertEquals(1.6,TempImp.Temp2Reaumur(2,"C"),.111);
      assertEquals(5.333,TempImp.Temp2Reaumur(44,"F"),.11111);

  }

  /**
   * Additional test for Extension method inReaumur part of child classes Fahrenheit and Celsius temp.
   */
  @Test
  public void testInReaumur(){
    FahrenheitTemperature fah5 = new FahrenheitTemperature(40,true);
    CelsiusTemperature cel5 = new CelsiusTemperature(40,true);
    assertEquals(32 ,fah5.inReaumur(),.0000001);
    assertEquals(3.5555556 ,cel5.inReaumur(),.0000001);
  }
  /**
   * Additional test for Extension method inRankine part of child classes Fahrenheit and Celsius temp.
   */
  @Test
  public void testInRankine(){
    FahrenheitTemperature fah5 = new FahrenheitTemperature(40,true);
    CelsiusTemperature cel5 = new CelsiusTemperature(40,true);
    assertEquals(563.67 ,fah5.inRankine(),.0000001);
    assertEquals(499.67 ,cel5.inRankine(),.0000001);
  }
  /*Add additional tests for methods you added or tests that were left out below this line.*/
  
}
