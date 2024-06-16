import java.util.Scanner;

public class AdventurersGuild{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        
        System.out.println("How many adventurers are going to be registered: ");
        int numAdv = in.nextInt();
        Adventurers[] adventurers = new Adventurers[numAdv];

        for( int i = 0; i < numAdv; i++){
            adventurers[i] = new Adventurers();
            adventurers[i].advenRank();
            adventurers[i].advClass();
            adventurers[i].showAdv();
            

        }
        // for(Adventurers adven : adventurers) {
        //     System.out.println(adven);
        // }
        System.out.println(adventurers[0].showAdv());
        System.out.println(adventurers[1].showAdv());

       
        
       
        


    }
}