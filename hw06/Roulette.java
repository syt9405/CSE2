
//hw06
//roulette gamble problrm

public class Roulette{
    public static void main(String[]args){
        int nWinning=0;                                        //total number of winning games
        int nProfit=0;                                         //number of times that earning a profit
        int nLosing=0;                                         //number of times that losing money
        int nLossEverything=0;                                 //number of losing everything
        int nEarning=0;                                        //total earning 
        
        int nRound=1;                                          //number of round
        while(nRound<1001){                                    //make 1000 rounds of spining 100 times
        int nSpin=1;                                           //number of spins
            while(nSpin<101){                                  //spining 100 times
            int rNumber = (int)(Math.random()*39);             //the number that appeared 
            int mNumber = (int)(Math.random()*39);             //the number that I chose

                
                if (mNumber==rNumber){                         //if two numbers match, new earning amount equals the old earning plus $36
                    nEarning = 36 + nEarning;
                    nWinning++;                                //number of wining increases by 1
                    }
                else{
                    nLosing++;                                 //otherwise, number of losing increases by 1
                }
            nSpin++;
            }
            if(nWinning>=3){                                   //if the number of winning is greater than 3, we eran profit
                nProfit++;                                     //the number of eanring profit increase by 1
            }
            else if(nWinning==0){
                nLossEverything++;                             //if number of wining equals 0, then the number of loss everything increase by 1
            }
            
        nRound++;                                              //the number of rounds increases by 1
        }
        System.out.println("the number of times I lose everything is " + nLossEverything);
        System.out.println("the number of times leaving with a profit is "+nProfit);
        System.out.println("The total winnings is "+nEarning);
    }
}