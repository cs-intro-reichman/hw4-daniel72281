public class Primes {
    public static void main(String[] args){
        int N = Integer.parseInt(args[0]);
        System.out.println("Prime numbers up to " + N + ":");

        boolean[] boolarr = new boolean[N+1];

        for (int index = 2; index <= boolarr.length-1 ; index++){
            boolarr[index]=true;
        }
        int index = 3;
        
        while (index <= boolarr.length-1) {
            for (int p = 2; p<= boolarr.length-1 & p!=index; p++ )
            if(index % p == 0 ){
                boolarr[index]=false;
            }
            index++;
            
        }    
               
        for (int i = 0; i <= boolarr.length-1; i++) {
            if(boolarr[i]==true){
            System.out.println(i);
            }

        
        }
        int count = 0;
        int g = 0;
        while (g <= boolarr.length-1) {
            if (boolarr[g]==true){
                count++;
             }
             g++;
        }
        double total = N;
        double calc = count/total*100;
        int perc = (int) calc;
       System.out.println("There are " + count + " primes between 2 and " + N + " (" + perc + "% are primes)");
            
            
        
    }}