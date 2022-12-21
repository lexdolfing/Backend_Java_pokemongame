public class ElectricType extends Pokemon {
    private String electricAttack1;
    private String electricAttack2;
    public ElectricType(String name, String type, int level, int hp, int xp, String sound, String attack, String electricAttack1, String electricAttack2){
        super(name,type,level,hp,xp,sound,attack);
        this.electricAttack1 = electricAttack1;
        this.electricAttack2 = electricAttack2;

    }
    public void specialAttack1(){
        System.out.println(getName() + " does special attack: " + electricAttack1);

    }

    public String specialAttack2(){
        System.out.println(getName() + " does special attack: " + electricAttack2);
        return electricAttack2;

    }
    @Override
    public int increaseXP(int xp){
        xp = xp + 30;
        System.out.println("Because of special attack " +getName() + "gains 30 xp and has now " + xp + "xp");
        return xp;
    }
}
