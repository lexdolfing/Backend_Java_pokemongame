public class GrassType extends Pokemon {
    private String grassAttack1;
    private String grassAttack2;

    public GrassType(String name, String type, int level, int hp, int xp, String sound, String attack, String grassAttack1, String grassAttack2){
        super(name,type,level,hp,xp,sound,attack);
        this.grassAttack1 = grassAttack1;
        this.grassAttack2 = grassAttack2;

    }
    public void specialAttack1(){
        System.out.println(getName() + " does special attack: " + grassAttack1);

    }

    public void specialAttack2(){
        System.out.println(getName() + " does special attack: " + grassAttack2);


    }
    @Override
    public int increaseXP(int xp){
        xp = xp + 30;
        System.out.println("Because of special attack " +getName() + "gains 30 xp and has now " + xp + "xp");
        return xp;
    }
}
