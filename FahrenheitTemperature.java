/*Edited by: Matt Brown
Date: 2/23/22
*/
public class FahrenheitTemperature extends TempImp{
    /*
    Determines whether the temp is in Celsius for second constructor
     */
    private Boolean isCel;

    /**
     *
     * @param tempF temperature in Celsius.
     */
    public FahrenheitTemperature(double tempF){
        if (tempF < ABS_ZERO_F){
            throw new IllegalArgumentException ("Below absolute freezing in Fahrenheit please re-enter!");
        }
        this.tempF = tempF;
        tempC = tempF;
        tempC = TempImp.temp2Cel(tempF,true);
    }
    /**
     *
     * @param tempC temperature in Celsius.
     * @param isCel boolean t/f whether is in Celsius.
     */
    public FahrenheitTemperature(double tempC, boolean isCel){
        if (tempC < ABS_ZERO_C){
            throw new IllegalArgumentException ("Below absolute freezing in Celsius please re-enter!");
        }
        this.tempC = tempC;
        tempF = tempC;
        tempF = super.temp2Fah(tempC,true);
    }
    /**
     *
     * @return returns temperature in Fahrenheit
     */
    public double inFahrenheit() {
        return tempF;
    }
    /**
     *
     * @return return temperature in Celsius.
     */
    public double inCelsius(){
        return tempC;
    }
    /**
     *
     * @return returns temperature in Kelvin
     */
    public double inKelvin(){
        return (tempF - 32) * 5/9 + 273.15;
    }
    /**
     * EXTENSION
     * @return returns Fahrenheit temp to Rankine.
     */
    public double inRankine(){
        return tempF + 459.67;
    }
    /**
     * EXTENSION
     * @return returns Fahrenheit temp in Reaumur.
     */
    public double inReaumur(){
        return (tempF-32.0)/2.25;
    }
    /**
     *
     * @return return String of temperature in Fahrenheit.
     */
    @Override
    public String toString(){
        String str = String.format("%.1f",tempF);
        return (str+"° Fahrenheit");
    }

    /**
     *
     * @param fahObj FahrenheitTemperature class object
     * @return returns true or false if objects are equal or not.
     */
    @Override
    public boolean equals(Object fahObj){
        if (fahObj.equals(tempF)){
            return true;
        }else{
            return false;
        }
    }

    /**
     *
     * @return returns boolean true if temperature is freezing
     */
    public Boolean isFreezing(){
        if (tempF<32) {
            return true;
        }else {
            return false;
        }
    }


}
