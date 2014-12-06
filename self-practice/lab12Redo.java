
public class lab12Redo{
   public static void main(String [] arg){
    double x[]={2.3, 3, 4, -2.1, 82, 23},
      y[]={2.3, 3, 4, -2.1, 82, 23},
      z[]={2.3, 13, 14},
      w[]={2.3, 13, 14, 12}, 
      v[],
      u[]={2.3, 12, 14};
    v=addArrays(x,y);
    System.out.println(display(x)+" \n  + " + display(y) + "\n   = " +display(v));
    System.out.println(display(x)+" \n  + " + display(z) + "\n   = " 
                         +display(addArrays(x,z)));
    System.out.println("It is " + equals(x,y)+" that "+display(x)+
                       " == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " == "+display(z));

  }

    public static String display(double [] x){
        String out = "{";
        for (int i=0; i<(x.length - 1); i++){
            out += x[i] + ", ";
        }
        out += x[x.length-1] + "}";
        return out;
    } 
     
     
    public static boolean equals(double [] x, double [] y){
        boolean a;
        if(x.length == y.length){
            for (int i=0; i<x.length; i++){
                if (x[i] == y[i]){
                    continue;
                }
                else{
                    a = false;
                    return a;
                }
            }
            a = true;
        }
        else{
            a = false;
        }
        return a;
    }
     
     
     public static double [] addArrays(double [] x, double [] y){
         int n =0;
         if (x.length > y.length){
             n = x.length;}
         else{
             n = y.length;
         }     
         double [] sum = new double [n];

         if (x.length > y.length){
             for (int i=0; i<y.length; i++){
                 sum[i] += x[i] + y[i];
             }
             for (int i=0; i<(x.length - y.length); i++){
                 sum[i + y.length] = x[i + y.length];
             }
         }
         else{
             for (int i=0; i<x.length; i++){
                 sum[i] += x[i] + y[i];
             }
             for (int i=0; i<(y.length - x.length); i++){
                 sum[i] += y[i+x.length];
             }
         }
         return sum;
     }
     
     
     
     
     
     
     
     
   }