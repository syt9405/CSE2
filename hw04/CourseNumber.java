//Yutong Song
//9/20/2014
// HW04 CourseNumber 
// Program #3. The semester during which a course is offered at Lehigh is given by a 6 digit number. The first four digits give the year, and the last two digits give the semester: 10 spring, 20 summer 1, 30 summer 2, and 40 fall. Write a program that reads in a 6 digit number, makes sure that it adheres to the above description, and then prints out the semester and year. Save your program as CourseNumber.java.

import java.util.Scanner;

// define a class
public class CourseNumber {
    // define the main method
    public static void main(String[]args) {
        Scanner myScanner = new Scanner (System.in);                                                  
        
        System.out.print("Enter a six digit number giving the course semester- ");
        double nValue = myScanner.nextDouble();
        
        int nSemester = (int)(nValue % 100);                                                        // seperate the last two digits from the six digit number as the semester 
        int nYear = (int)((int)(nValue/100)%10000);                                                 // seperate the first four digits from the six digit number as the year
        
        if (nValue < 186510 || nValue > 201440){                                                    // check if the six digits number is inside the range
            System.out.println("The number was outside the range [186510,201440]");
        }
        else {                                                                                      // if the six digits number is inside the range, then match the last two digits with semsters
            if (nSemester == 10 ){                                                                  // 10 spring 
                System.out.println("The course was offered in the Spring semester of " + nYear);
            }
            else if (nSemester == 20){                                                              // 20 summer 1 
                System.out.println("The course was offered in the Summer 1 semester of " + nYear);
            }
            else if (nSemester == 30){                                                              // 30 summer 2    
            System.out.println("The course was offered in the Summer 2 semester of " + nYear);
            }
            else if (nSemester == 40){                                                              // 40 fall
                System.out.println("The course was offered in the Fall semester of " + nYear);
            }
            else {                                                                                  // other numbers are not valid 
                System.out.println(nSemester + " is not a legitimate semester");
                return;
            }
            return;
        }
    } 
}