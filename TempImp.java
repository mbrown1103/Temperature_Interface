/*Edited by: Matt Brown
Date: 2/23/22
*/
public abstract class TempImp implements Temperature{
    /**
     * protected variables tempC and tempF representing two different temperature fields: Fahrenheit and Celsius
     */
    protected double tempC;
    protected double tempF;

    /**
     *
     * @param temp temperature
     * @param convert true or false which determines whether the temp will be converted. Assuming temp is already in Fahrenheit if false
     * @return returns converted temperature to Fah or returns just the temp if already in Fahrenheit
     */
    public static double temp2Fah(double temp,boolean convert){
        if (convert){
            return temp * (9.0/5.0) + 32;
        }return temp;
    }
    /**
     *
     * @param temp temperature
     * @param convert true or false which determine whether the temp will be converted. Assuming temp is already in Celsius if false
     * @return returns converted temperature to Cel or returns just the temp if already in Celsius
     */
    public static double temp2Cel(double temp,boolean convert){
        if (convert){
            return (temp - 32.0) * (5.00 / 9.0);
        }return temp;
    }
    /**
     *
     * @param temp temperature
     * @param celsOrfah tells methods whether to handle the temperature as Fahrenheit or Celsius. "C" is Celsius. "F" is Fahrenheit.
     * @return returns temperature to Kelvin
     */
    public static double temp2Kelvin(double temp,String celsOrfah){
        if (celsOrfah=="C"){
            return temp - ABS_ZERO_C;
        }else if(celsOrfah=="F"){
            return (temp - 32) * 5/9 + 273.15;
        }return -1;
    }
    /**
     * EXTENSION
     * @param temp temperature
     * @param celOrfah string determining whether or not temp will be read in Celsius or Fahrenheit.
     * @return returns converted temp to Rankine
     */
    public static double Temp2Rankine(double temp,String celOrfah){
        if (celOrfah == "C"){
            return temp * 1.8 + 32 + 459.67;
        }else if(celOrfah=="F"){
            return temp + 459.67;
        }
        return 1;//filler code to make work
    }
    /**
     * EXTENSION
     * @param temp temperature
     * @param celOrfah string determining whether the temp will be read in Celsius or Fahrenheit.
     * @return returns converted temp to Reaumur temp.
     */
    public static double Temp2Reaumur(double temp, String celOrfah){
        if(celOrfah == "C"){
            return temp*.8;
        }else if(celOrfah == "F"){
            return (temp-32.0)/2.25;
        }
        return 1;//filler code to make work
    }
}
