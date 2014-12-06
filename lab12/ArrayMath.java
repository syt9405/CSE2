public class ArrayMath{
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
                       " \n == "+display(y));
    System.out.println("It is " + equals(z,w)+" that "+display(z)+
                       " \n == "+display(w));
    System.out.println("It is " + equals(u,z)+" that "+display(u)+
                       " \n == "+display(z));

  }
  
  public static String display(double [] x){
    String out="{";
    for(int j=0;j<x.length;j++){
      if(j>0){
        out+=", ";
      }
      out+=x[j];
    }
    return out+"}";
  }
  
  
    public static double [] addArrays(double [] a, double [] b){
        int n=0;
        
        if (a.length < b.length) {n = b.length;}
        else {n = a.length;}
        double [] result = new double [n];


        if (a.length > b.length){
            for (int i=0; i<b.length; i++){
              result[i] = a[i] + b[i];}
            for (int j=0; j<(a.length - b.length); j++){
              result[j + b.length] = a[j + b.length] ;}
        }
        else{
            for (int i=0; i<a.length; i++){
              result[i] = a[i] + b[i];}
            for (int j=0; j<(b.length - a.length); j++){
              result[j + a.length] = a[j + a.length] ;}
        }
    return result;
  }
  
  public static boolean equals(double [] a, double [] b){
      boolean x;
      if (a.length == b.length){
        for (int i=0; i<a.length; i++){
          if (a[i]==b[i]){
              continue;
          }
          else{
          x = false;
          return x;
          }
        }
        x = true;
      }
      else{
          x = false;
      }
      return x;
  }
}
