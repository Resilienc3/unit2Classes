/**
* models a car with constant fuel efficiency and tracks how much fuel is left in its tank
* 
* @author Jalen
* @version -0.0
*/
public class Car
{
/** the efficiency measured in Miles per gallon (mpg) */
private double fuelEfficiency;

/** the Fuel, in gallons left in the tank */
private double fuelInTank;

/**
* Constructor for this Car that takes effeciency taken as parameter
*/
public Car(double efficiency)
{
    this.fuelEfficiency = efficiency;
    this.fuelInTank = 0;
}

/**
* adds the specified number of gallons of fuel to the tank
*
* @pre the specified # of gallons will not exceed tank capacity, #of values will not be
* negative
* 
* @param gallons # of gallons of fuel to add to the tank
* 
*/
public void addGas(double gallons)
{
    this.fuelInTank = this.fuelInTank + gallons;
    
}

/**
* reduces the fuel in the cars tank based on its efficiency and the number of miles traveled
*
* @pre miles is positive. specified number of miles will not consume more than the 
* amount of fuel in the tank
* 
* @param number of miles driven
* @return mo return
*/
public void drive(double miles)
{
    double gallonsBurned = miles/this.fuelEfficiency;
    this.fuelInTank = this.fuelInTank - gallonsBurned;
}

/**
* returns remaining amount of gas in the tank
* 
* 
* @return the # of galons of gas remaining in the tank
*/
public double getGasInTank()
{

   return this.fuelInTank;
}


}