/*Edited by: Matt Brown
Date: 2/23/22
*/
public class TemperatureDriver {
        private FahrenheitTemperature fahT1;
        private FahrenheitTemperature fahT2;
        private CelsiusTemperature celT1;
        private CelsiusTemperature celT2;

    /**
     * creating class objects for testing
     */
    public TemperatureDriver(){
            fahT1 = new FahrenheitTemperature(50);
            fahT2 = new FahrenheitTemperature(80, true);
            celT1 = new CelsiusTemperature(20);
            celT2 = new CelsiusTemperature(50,true);
        }

    /**
     * Demonstrate InFahrenheit method
     */
    public void demInFah(){
            double str1 = fahT1.inFahrenheit();
            double str2 = fahT2.inFahrenheit();
            double str3 = celT1.inFahrenheit();
            double str4 = celT2.inFahrenheit();
            System.out.println("Expected: 50° Fahrenheit");
            System.out.println("Actual: " + str1 + "° Fahrenheit");
            System.out.println("Expected: 176° Fahrenheit");
            System.out.println("Actual: " + str2 + "° Fahrenheit");
            System.out.println("Expected: 68° Fahrenheit");
            System.out.println("Actual: " + str3+ "° Fahrenheit");
            System.out.println("Expected: 50° Fahrenheit");
            System.out.println("Actual: " + str4 + "° Fahrenheit");
        }
    /**
     * Demonstrate InCelsius method
     */
        public void demInCels(){
            double str1 = fahT1.inCelsius();
            double str2 = fahT2.inCelsius();
            double str3 = celT1.inCelsius();
            double str4 = celT2.inCelsius();
            System.out.println("Expected: 10° Celsius");
            System.out.println("Actual: " + str1 + "° Celsius");
            System.out.println("Expected: 80° Celsius");
            System.out.println("Actual: " + str2 + "° Celsius");
            System.out.println("Expected: 20° Celsius");
            System.out.println("Actual: " + str3+ "°Celsius");
            System.out.println("Expected: 10°Celsius");
            System.out.println("Actual: " + str4 + "°Celsius");
        }
    /**
     * Demonstrate InKelvin method
     */
        public void demInKelvin(){
            double str1 = fahT1.inKelvin();
            double str2 = fahT2.inKelvin();
            double str3 = celT1.inKelvin();
            double str4 = celT2.inKelvin();
            System.out.println("Expected: 283.15° Kelvin");
            System.out.println("Actual: " + str1 + "° Kelvin");
            System.out.println("Expected: 353.15° Kelvin");
            System.out.println("Actual: " + str2 + "° Kelvin");
            System.out.println("Expected: 293.15° Kelvin");
            System.out.println("Actual: " + str3+ "°Kelvin");
            System.out.println("Expected: 283.15°Kelvin");
            System.out.println("Actual: " + str4 + "°Kelvin");
        }
    /**
     * Demonstrate IsFreezing() method
     */
        public void demIsFreezing(){
            boolean str1 = fahT1.isFreezing();
            boolean str2 = fahT2.isFreezing();
            boolean str3 = celT1.isFreezing();
            boolean str4 = celT2.isFreezing();
            System.out.println("Expected: False");
            System.out.println("Actual: " + str1);
            System.out.println("Expected: False");
            System.out.println("Actual: " + str2);
            System.out.println("Expected: False");
            System.out.println("Actual: " + str3);
            System.out.println("Expected: False");
            System.out.println("Actual: " + str4);
        }
}
