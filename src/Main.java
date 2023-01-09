public class Main {
    public static void main(String[] args) {
        // Charmander!
    FireType charmander = new FireType("Charmander", "Fire", 1, 95, 30, "chaaaaaar", "scratch", "Ember", "Flamethrower");
    charmander.specialAttack1();
    charmander.specialAttack2();

    //Squirtle
        WaterType squirtle = new WaterType("squirtle", "water", 2, 76, 23, "squirtlesquirt", "pounce", "bubbles", "surf");
        squirtle.specialAttack1();
        squirtle.specialAttack2();
        squirtle.levelUp();

        // Bulbasaur

        GrassType bulbasaur = new GrassType("bulbasaur", "grass", 4, 88, 30, "bulba","headbutt","vine whip", "razor leaf");
        bulbasaur.specialAttack1();
        bulbasaur.specialAttack2();
        bulbasaur.levelUp();

        // Pikachu
        ElectricType pikachu = new ElectricType("Pikachu", "electric", 6, 98, 55, "pikapika", "quick attack", "thunder shock", "thunderbolt");
        pikachu.specialAttack1();
        pikachu.specialAttack2();
        pikachu.levelUp();



    }


}
