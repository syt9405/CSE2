//Yutong Song 
// 9/5/2014
//HomeworkAssignment2 Java Program
//

// define a class
public class HomeworkAssignment2{
    
    // add main method
    public static void main(String[] args) {
    
    int nSocks=3;               // number of pairs of socks
    double sockCost$=2.58;      // cost per pair of socks ('$ is part of the vairanble name)
    
    int nGlasses=6;             // number of drinking glasses
    double glassCost$=2.29;     // cost per glass
    
    int nEnvelopes=1;           // number of boxes of envelopes
    double envelopeCost$=3.25;  // cost per box of envelopes
    
    double taxPercent=0.06;
    
    double totalSockCost$,       // total cost of socks
    totalGlassCost$,      // total cost of glasses
    totalEnvelopeCost$,   // total cost of envelopes
    totalSockTax$,
    totalGlassTax$,
    totalEnvelopeTax$,
    totalPurchase$,
    totalPaid$;
   
    
    // run the calculations
    
    totalSockCost$=nSocks*sockCost$;       // total cost of socks
    totalSockTax$=taxPercent*totalSockCost$; //total cost of socks with tax
   
    totalGlassCost$=nGlasses*glassCost$;      // total cost of glasses
    totalGlassTax$=taxPercent*totalGlassCost$;  // total cost of glasses with tax
   
    totalEnvelopeCost$=nEnvelopes*envelopeCost$;   // total cost of envelopes
    totalEnvelopeTax$=taxPercent*totalEnvelopeCost$; //total cost of envelopes with tax
   
    totalPurchase$=totalEnvelopeCost$+totalGlassCost$+totalSockCost$;  // total purchases without tax
    totalPaid$=taxPercent*totalSockCost$+taxPercent*totalGlassCost$+taxPercent*totalEnvelopeCost$;  
    // total paid for this transaction, including sales tax
    
 int a = (int)totalSockCost$;
 int b = (int)totalSockTax$;
 int c = (int)totalGlassCost$;
 int d = (int)totalGlassTax$;
 int e = (int)totalEnvelopeCost$;
 int f = (int)totalEnvelopeTax$;
 int g = (int)totalPurchase$;
 int h = (int)totalPaid$;
  
   
// print out Total cost of each kind of item; sales tax for that total cost
System.out.println("The total cost of socks is "+(100*a/100.0)+" and the sales tax for total socks is "+(100*b/100.0)+ "  .");
System.out.println("The total cost of glasses is "+(100*c/100.0)+" and the sales tax for total glasses is "+(100*d/100.0)+ " .");
System.out.println("The total cost of envelopes is "+(100*e/100.0)+" and the sales tax for total envelopes is "+(100*f/100.0)+ " .");
 
// Total cost of purchases (before tax)
System.out.println("The total purchases before tax is "+(100*g/100.0)+" .");

// Total actually paid for this transaction, including sales tax. 

System.out.println("Total acually paid for this transaction is "+(100*h/100.0)+" .");

    }
}
