public class WaterType extends Pokemon {
    private String waterAttack1;
    private String waterAttack2;

    public WaterType(String name, String type, int level, int hp, int xp, String sound, String attack, String waterAttack1, String waterAttack2){
        super(name,type,level,hp,xp,sound,attack);
        this.waterAttack1 = waterAttack1;
        this.waterAttack2 = waterAttack2;

    }
    public void specialAttack1(){
        System.out.println(getName() + " does special attack: " + waterAttack1);

    }

    public void specialAttack2(){
        System.out.println(getName() + " does special attack: " + waterAttack2);


    }
    @Override
    public int increaseXP(int xp){
        xp = xp + 30;
        System.out.println("Because of special attack " +getName() + "gains 30 xp and has now " + xp + "xp");
        return xp;
    }
}
