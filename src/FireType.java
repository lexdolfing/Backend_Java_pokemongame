public class FireType extends Pokemon {

    private String fireAttack1;
    private String fireAttack2;

    public FireType(String name, String type, int level, int hp, int xp, String sound, String attack, String fireAttack1, String fireAttack2){
        super(name,type,level,hp,xp,sound,attack);
        this.fireAttack1 = fireAttack1;
        this.fireAttack2 = fireAttack2;

    }
    public void specialAttack1(){
        System.out.println(getName() + " does special attack: " + fireAttack1);

    }

    public void specialAttack2(){
        System.out.println(getName() + " does special attack: " + fireAttack2);
        increaseXP(getXp());


    }
    @Override
    public int increaseXP(int xp){
        xp = xp + 30;
        System.out.println("Because of special attack " +getName() + "gains 30 xp and has now " + xp + "xp");
        return xp;
    }


}
