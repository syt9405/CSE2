//Yutong Song 
// 9/5/2014
//Arithmetic Java Program
//

// define a class
public class Arithmetic{
    
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
    
    totalSockCost$=nSocks*sockCost$*100;       // total cost of socks
    totalSockTax$=taxPercent*totalSockCost$*100; //total cost of socks with tax
   
    totalGlassCost$=nGlasses*glassCost$*100;      // total cost of glasses
    totalGlassTax$=taxPercent*totalGlassCost$*100;  // total cost of glasses with tax
   
    totalEnvelopeCost$=nEnvelopes*envelopeCost$*100;   // total cost of envelopes
    totalEnvelopeTax$=taxPercent*totalEnvelopeCost$*100; //total cost of envelopes with tax
   
    totalPurchase$=totalEnvelopeCost$+totalGlassCost$+totalSockCost$*100;  // total purchases without tax
    totalPaid$=taxPercent*totalSockCost$+taxPercent*totalGlassCost$+taxPercent*totalEnvelopeCost$*100;  
    // total paid for this transaction, including sales tax
    
 int a = (int)totalSockCost$;
 int b = (int)totalSockTax$;
 int c = (int)totalGlassCost$;
 int d = (int)totalGlassTax$;
 int e = (int)totalEnvelopeCost$;
 int f = (int)totalEnvelopeTax$;
 int g = (int)totalPurchase$;
 int h = (int)totalPaid$;

System.out.println("They bought 3 items, as socks, drinking glasses, and envelopes.");
// print out Total cost of each kind of item; sales tax for that total cost  
System.out.println("The number of pairs of socks is 3 and the cost per pair is $2.58 .");
System.out.println("The total cost (before tax) of socks is $"+(a/100.0)+" and the sales tax for total socks is $"+(b/100.0)+ " .");
// glasses
System.out.println("the number of drinking glasses is 6 and the cost per glass is $2.29 .");
System.out.println("The total cost (before tax) of glasses is $"+(c/100.0)+" and the sales tax for total glasses is $"+(d/100.0)+ " .");
// envelopes
System.out.println("The number of envelopes is 1 and the cost per envelope is $3.25 .");
System.out.println("The total cost of (before tax) envelopes is $"+(e/100.0)+" and the sales tax for total envelopes is $"+(f/100.0)+ " .");
 
// Total cost of purchases (before tax)
System.out.println("The total purchases before tax is $"+(g/100.0)+" .");

// Total actually paid for this transaction, including sales tax. 

System.out.println("The total acually paid for this transaction (including sales tax) is $"+(h/100.0)+" .");

    }
}
