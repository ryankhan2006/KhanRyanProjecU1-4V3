import java.lang.String;
import java.text.DecimalFormat;
/**
 * The PokemonCardSeller class represents a simulation of the store. A simulation includes the Pokemon cards Pikachu, Charizard, Squirtle, Mewtwo, Bulbasaur, Raichu, and Snorlax. It also includes the net total of what cards the user wants to purchase.
 */
public class PokemonCardSeller {
    private int charizard;
    private int squirtle;
    private int pikachu;
    private int mewtwo;
    private int bulbasaur;
    private int snorlax;
    private int raichu;
    /**
     * This is used to round the costs of the items.
     */
    DecimalFormat df = new DecimalFormat("0.00");
    /**
     * Constructor for the PokemonCardSeller class. This creates a new instance of a Simulation with or without the parameters below.
     */
    public PokemonCardSeller() {

    }
    public PokemonCardSeller(int charizard, int squirtle, int pikachu, int mewtwo, int bulbasaur, int snorlax, int raichu) {
        this.charizard = charizard;
        this.squirtle = squirtle;
        this.pikachu = pikachu;
        this.mewtwo = mewtwo;
        this.bulbasaur = bulbasaur;
        this.snorlax = snorlax;
        this.raichu = raichu;
    }
    /**
     * methodRun method for the PokemonCardSeller class. This method will return false if the user input is no, or return true if the user input is yes.
     * @param input is a string representing the user's input about if the simulation is going to run or not.
     * @return returns true if the user enters yes to continue, returns false if user does not want the program to run.
     */
    public boolean methodRun(String input) {
        String input2 = input.toLowerCase();
        if (input2.indexOf("yes") != -1) {
            return true;
        } else {
            return false;
        }
    }
/**
 * randomOutput method will generate a random number so the user will be granted a random amount of pokemon cards for one specific type (0-10 cards)
 * @param random1 an integer that represents if the user wishes to get a random number of pokemon cards. User must enter -911 to generate a random number.
 * @return returns a random number from 0 to 10.
 */
public int randomOutput(int random1) {
    int random2 = 0;
    if (random1 == -911) {
        random2 = (int) (Math.random() * 10);
    } else {
        random2 = random1;
    }
    return random2;
}
    /**
     * verifyPositive method will verify if the number is a positive integer.
     * @param amount an integer that represents the user input for the amount of cards the user wants to buy.
     * @return returns true if the user input is positive, returns false if it is not positive (negative).
     */
    public boolean verifyPositive(int amount) {
        if (amount >= 0) {
            return true;
        } else {
            return false;
        }
    }

}
