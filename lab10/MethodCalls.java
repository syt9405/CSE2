public class MethodCalls{
    public static void main(String []  arg){
        int a=784,b=22,c;
        c=addDigit(a,3);
        System.out.println("Add 3 to "+a+" to get "+c);
        c=addDigit(addDigit(c,4),5);
        System.out.println("Add 3, 4, and 5 to "+a+" to get "+c);
        System.out.println("Add 3 to -98 to get: "+addDigit(-98,3));
        c=join(a,b);
        System.out.println("Join "+a+" to "+b+" to get "+c);
        System.out.println("Join 87, 42, and 83 to get "+join(87, join(42,83)));
        System.out.println("Join -9 and -90 to get "+join(-9,-90));
    }
    
    public static int addDigit(int a, int n1){
        int aAbsolutValue = Math. abs (a);
        int aLength = String.valueOf(aAbsolutValue).length() ;
        int x;
        if (a<0){
            x = (-1)*( n1 * ((int)Math.pow(10,aLength)) + aAbsolutValue );
        }
        else{
            x = n1*((int)(Math.pow(10,aLength))) + a;
        }
        return x;
    }

    public static int join(int a, int b){
        int bAbsolutValue = Math.abs(b);
        int bLength = String.valueOf(bAbsolutValue).length();
        int y;
        if( a>0 && b>0 ){
            y = a*((int)Math.pow(10,bLength))+b;
        }
        else if(a<0 && b<0){
            y = (-1)*(a*((int)Math.pow(10,bLength))+b);
        }
        else{
            int aAbsolutValue = Math.abs(a);
            y = (-1)*(aAbsolutValue*((int)Math.pow(10,bLength))+bAbsolutValue);
        }
    return y;
    }
}

/*
Add 3 to 784 to get 3784
Add 3, 4, and 5 to 784 to get 543784
Add 3 to -98 to get: -398
Join 784 to 22 to get 78422
Join 87, 42, and 83 to get 874283
Join -9 and -90 to get 990
*/
