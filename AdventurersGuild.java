import java.util.Scanner;

public class AdventurersGuild{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {


        
        System.out.println("How many adventurers are going to be registered: ");
        int numAdv = in.nextInt();
        Race[] adventurers = new Race[numAdv];

        for( int i = 0; i < numAdv; i++){
            adventurers[i] = new Race();
            adventurers[i].advenRank();
            adventurers[i].advClass();
            adventurers[i].showAdv();
            adventurers[i].getRaceDetails();

            

        }
       // showAdv is from the Adventurer class
        System.out.println(adventurers[0].showAdv());
        // race details is a child of the adventurer class.
        System.out.println(adventurers[0].getRaceDetails());

        

       






















        // Adventurers[] adventurers = new Adventurers[numAdv];

        // for( int i = 0; i < numAdv; i++){
        //     adventurers[i] = new Adventurers();
        //     adventurers[i].advenRank();
        //     adventurers[i].advClass();
        //     adventurers[i].showAdv();

            

        // }
       
        // System.out.println(adventurers[0].showAdv());
        // System.out.println(adventurers[1].showAdv());

       
        
       
        


    }
}