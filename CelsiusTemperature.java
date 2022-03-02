/*Edited by: Matt Brown
Date: 2/23/22
*/
public class CelsiusTemperature extends  TempImp{
    /*
    Determines whether the temp is in Fahrenheit for second constructor
     */
    private Boolean isFar;

    /**
     *
     * @param tempC temperature in Celsius.
     */
    public CelsiusTemperature(double tempC){
        if (tempC < ABS_ZERO_C){
            throw new IllegalArgumentException ("Below absolute freezing in Celsius please re-enter!");
        }
        this.tempC = tempC;
        tempF = tempC;
        tempF = TempImp.temp2Fah(tempC,true);
    }
    /**
     *
     * @param tempF temperature in Fahrenheit.
     * @param isFar boolean t/f return whether it is in Celsius.
     */
    public CelsiusTemperature(double tempF,boolean isFar){
        if (tempF < ABS_ZERO_F){
            throw new IllegalArgumentException ("Below absolute freezing in Fahrenheit please re-enter!");
        }
        this.tempF = tempF;
        tempC = tempF;
        tempC= TempImp.temp2Cel(tempF,true);

    }
    /**
     *
     * @return returns temperature in Fahrenheit
     */
    public double inFahrenheit(){
        return tempC * (9.0/5.0) + 32;
    }
    /**
     *
     * @return returns Celsius temp.
     */
    public double inCelsius(){
        return tempC;
    }
    /**
     *
     * @return returns temperature in Kelvin
     */
    public double inKelvin(){
        return tempC - ABS_ZERO_C;
    }

    /**
     * EXTENSION
     * @return returns Celsius temp in Rankine.
     */
    public double inRankine(){
        return tempC * 1.8 + 32 + 459.67;
    }
    /**
     * EXTENSION
     * @return returns Celsius temp in Reaumur
     */
    public double inReaumur(){
        return tempC*.8;
    }
    /**
     *
     * @return returns toString method string when printed.
     */
    @Override
    public String toString() {
        //TODO: implement me.
//        String str = (tempF);
        String str = String.format("%.1f", tempC);
        return (str + "° Celsius");
    }
    /**
     *
     * @param celObj CelsiusTemperature class object
     * @return returns true or false if objects are equal or not.
     */
    @Override
    public boolean equals(Object celObj){
        if (celObj.equals(tempC)){
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
        if (tempC<0) {
            return true;
        }

        return false;
    }
}
