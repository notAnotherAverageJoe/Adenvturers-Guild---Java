import java.util.Scanner;

public class Adventurers {
    private String firstName;
    private String lastName;
    private String rank;
    private int entryFee;
    private String classSpec;

    Scanner in = new Scanner(System.in);

    public Adventurers(){
        System.out.println("Adventurers first name: ");
       this.firstName = in.nextLine();
       System.out.println("Adventurers last name: ");
       this.lastName = in.nextLine();

    }

    public void advenRank () {
        
            System.out.println("Enter Adventurer's rank: 'S' for S tier, 'A' for A tier, 'B' for B tier, 'C' for C tier, 'D' for D tier, 'E' for E tier, 'F' for F tier");
            this.rank = in.nextLine().toUpperCase(); // Store the rank input and convert to uppercase
    
            switch (rank) {
                case "S":
                    this.entryFee = 100;
                    System.out.println("Amazing, an S rank Adventurer! Pleasure to have you here!\nWith that said, it does cost more for such a high-ranking individual to sign up. It costs: $" + this.entryFee);
                    break;
                case "A":
                    this.entryFee = 85;
                    System.out.println("An A rank Adventurer! Truly astonishing. I am sure an adventurer of your status will have no issue paying the registration fee. It will cost you: $" + this.entryFee);
                    break;
                case "B":
                    this.entryFee = 70;
                    System.out.println("A B rank Adventurer! Welcome aboard. The registration fee for B tier adventurers is: $" + this.entryFee);
                    break;
                case "C":
                    this.entryFee = 55;
                    System.out.println("A C rank Adventurer! Welcome to the guild. The registration fee for C tier adventurers is: $" + this.entryFee);
                    break;
                case "D":
                    this.entryFee = 40;
                    System.out.println("A D rank Adventurer! Glad to have you here. The registration fee for D tier adventurers is: $" + this.entryFee);
                    break;
                case "E":
                    this.entryFee = 25;
                    System.out.println("An E rank Adventurer! Your journey starts here. The registration fee for E tier adventurers is: $" + this.entryFee);
                    break;
                case "F":
                    this.entryFee = 10;
                    System.out.println("An F rank Adventurer! Every adventurer begins somewhere. The registration fee for F tier adventurers is: $" + this.entryFee);
                    break;
                default:
                    System.out.println("Invalid rank entered. Please enter one of: S, A, B, C, D, E, F");
                    
            }
        }

        public void advClass () {
            System.out.println("Please enter the Adventurers class: ");
            this.classSpec = in.nextLine();
        }

    public String showAdv(){
        return ("Welcome to the Adventurers Guild " +
         firstName + " " 
         + lastName +
         " The " + rank+ " ranked" +" "+ classSpec  );
    }




}
