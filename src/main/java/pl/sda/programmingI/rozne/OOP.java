package pl.sda.programmingI.rozne;

import java.util.Random;

public class OOP {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Stach", 10, 2);
        Fighter fighter2 = new Fighter("Jach", 5, 4);

        String[] fighters = new String[]{fighter1.name, fighter2.name};
        Random random = new Random();
        int numb = random.nextInt(fighters.length);
        String firstAttacker = fighters[numb];
        System.out.println(declareWinner(fighter1, fighter2, fighter1.name));
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {

        String winner = "";
        if (firstAttacker.equals(fighter1.name)) {
            while (fighter1.health > 0 && fighter2.health > 0) {
                if(fighter1.health >0) {
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
                }
                if(fighter2.health>0){
                fighter1.health = fighter1.health - fighter2.damagePerAttack;
            }}
        } else {
            while (fighter1.health > 0 && fighter2.health > 0) {
                if(fighter2.health>0) {
                    fighter1.health = fighter1.health - fighter2.damagePerAttack;
                }
                    fighter2.health = fighter2.health - fighter1.damagePerAttack;
            }
        }
        if (fighter1.health <= 0) {
            winner = fighter2.name;
        } else if (fighter2.health <= 0) {
            winner = fighter1.name;
        }
        return "winner " + winner;
    }
}


