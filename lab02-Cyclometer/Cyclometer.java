//Yutong Song 
// 9/5/2014
//Cyclometer Java Program
//
// first compile the program
//       javac Cyclometer.java
// run the program
//       java Cyclometer//

// define a class
public class Cyclometer{
    
// add main method
  public static void main(String[] args) {
    
//  our input data
int secsTripl=480;     // number of minutes of the first trip
int secsTrip2=3220;    // number of minutes of the second trip
int countsTrip1=1561;  // number of counts for the first trip
int countsTrip2=9037;  // number of counts for the second trip

// intermediate variables and output data
double wheelDiameter=27.0, //
PI=3.14159, //
feetPerMile=5280, //
inchesPerFoot=12,  //
secondsPerMinute=60; //
double distanceTripl, distanceTrip2, totalDistance; //

System.out.println("Trip 1 took "+
(secsTripl/secondsPerMinute)+" minutes and had "+
countsTrip1+" counts.");
System.out.println("Trip 2 took "+
(secsTrip2/secondsPerMinute)+" minutes and had "+
countsTrip2+" counts.");

// run the calculations; store the values. 
// calculating the distance of the first trip in miles
distanceTripl=countsTrip1*wheelDiameter*PI;
// above gives distance in inches
//for each count, a rotattion of the wheel travels the diameter in inches times PI
distanceTripl/=inchesPerFoot*feetPerMile; //gives distance in miles
distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
totalDistance=distanceTripl+distanceTrip2;

// print out the output data
System.out.println("Trip 1 was "+distanceTripl+" miles");
System.out.println("Trip 2 was "+distanceTrip2+" miles");
System.out.println("The total distance was "+totalDistance+" miles");



    }
}
