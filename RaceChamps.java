

import java.util.*;
public class RaceChamps {
    
    public static void main(String[] args) {
        
     
        String r1;
        String r2;
        String r3;
        String r4;
        
        int rm1;
        int rm2;
        int rm3;
        int rm4;
        
        String fp="";
        String sp="";
        String tp="";
        String lp="";
      
        
        Scanner scan = new Scanner (System.in);
        RaceWinners res = new RaceWinners();
        
        //Runner 1 data
        System.out.println("Please enter the name of runner #1:");
        r1 = scan.nextLine();
       
        System.out.println("Please enter " + r1+"'s" + " finish time (in minutes):");
        rm1 = scan.nextInt();
        
        while (rm1<=0) {
            System.out.println("ERROR Please Enter Valid Time");
            System.out.println("");
            System.out.println("Please enter " + r1+"'s" + " finish time (in minutes):");
            rm1 = scan.nextInt();
           }
        scan.nextLine();
        //Runner 2 data
        System.out.println("Please enter the name of runner #2:");
        r2 = scan.nextLine();
        
        System.out.println("Please enter " + r2+"'s" + " finish time (in minutes):");
        rm2 = scan.nextInt();
        
        while (rm2<=0) {
            System.out.println("ERROR Please Enter Valid Time");
            System.out.println("");
            System.out.println("Please enter " + r2+"'s" + " finish time (in minutes):");
            rm2 = scan.nextInt();
           }
        scan.nextLine();
        //Runner 3 data
        System.out.println("Please enter the name of runner #3:");
        r3 = scan.nextLine();
        
        System.out.println("Please enter " + r3+"'s" + " finish time (in minutes):");
        rm3 = scan.nextInt();
        
        while (rm3<=0) {
            System.out.println("ERROR Please Enter Valid Time");
            System.out.println("");
            System.out.println("Please enter " + r3+"'s" + " finish time (in minutes):");
            rm3 = scan.nextInt();
           }
        scan.nextLine();
        //Runner 4 data
        System.out.println("Please enter the name of runner #4:");
        r4 = scan.nextLine();
        
        System.out.println("Please enter " + r4+"'s" + " finish time (in minutes):");
        rm4 = scan.nextInt();
        
        while (rm4<=0) {
            System.out.println("ERROR Please Enter Valid Time");
            System.out.println("");
            System.out.println("Please enter " + r4+"'s" + " finish time (in minutes):");
            rm4 = scan.nextInt();
           }
 // first place 
         if(rm1 > rm2 && rm1 > rm3 && rm1 > rm4){
             fp = r1;
           }
           
         if(rm2 > rm1 && rm2 > rm3 && rm2 > rm4){
             fp = r2;
           }
           
         if(rm3 > rm1 && rm3 > rm2 && rm3 > rm4){
             fp = r3;
           }
           
         if(rm4 > rm1 && rm4 > rm2 && rm4 > rm3){
             fp = r4;
           }
           
//second place
        if(rm1 > rm2 && rm1 > rm3 && rm1 < rm4){
             sp = r1;
           }
           
        if(rm1 > rm2 && rm1 < rm3 && rm1 > rm4){
             sp = r1;
           }
        
       if(rm1 < rm2 && rm1 > rm3 && rm1 > rm4){
             sp = r1;
           }
       
            if(rm2 > rm1 && rm2 > rm3 && rm2 < rm4){
             sp = r2;
           }
           
        if(rm2 > rm1 && rm2 < rm3 && rm2 > rm4){
             sp = r2;
           }
        
       if(rm2 < rm1 && rm2 > rm3 && rm2 > rm4){
             sp = r2;
           }
           
            if(rm3 > rm2 && rm3 > rm1 && rm3 < rm4){
             sp = r3;
           }
           
        if(rm3 > rm2 && rm3 < rm1 && rm3 > rm4){
             sp = r3;
           }
        
       if(rm3 < rm2 && rm1 > rm1 && rm3 > rm4){
             sp = r3;
           }
      
            if(rm4 > rm2 && rm4 > rm3 && rm4 < rm1){
             sp = r4;
           }
           
        if(rm4 > rm2 && rm4 < rm3 && rm4 > rm1){
             sp = r4;
           }
        
       if(rm4 < rm2 && rm4 > rm3 && rm4 > rm1){
             sp = r4;
           }
           
   //last place
           if(rm1 < rm2 && rm1 < rm3 && rm1 < rm4){
             lp = r1;
           }
           
         if(rm2 < rm1 && rm2 < rm3 && rm2 < rm4){
             lp = r2;
           }
           
         if(rm3 < rm1 && rm3 < rm2 && rm3 < rm4){
             lp = r3;
           }
           
         if(rm4 < rm1 && rm4 < rm2 && rm4 < rm3){
             lp = r4;
           }
   // third place
           if(fp != r1 && sp != r1 && lp != r1){
               tp = r1;
            }
            
             if(fp != r2 && sp != r2 && lp != r2){
               tp = r2;
            }
            
             if(fp != r3 && sp != r3 && lp != r3){
               tp = r3;
            }
         
             if(fp != r4 && sp != r4 && lp != r4){
               tp = r4;
            }
   //results        
           System.out.println("Gold Medal Winner: " + fp);
           System.out.println("Silver Medal Winner: " + sp);
           System.out.println("Bronze Medal Winner: " + tp);
    }

}
