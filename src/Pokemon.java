public abstract class Pokemon {
    private String name;
    private String type;
    private int level;
    private int hp;
    private int xp;
    private String sound;
    private String attack;




    public Pokemon(String name, String type, int level, int hp, int xp, String sound, String attack){
        this.name = name;
        this.type = type;
        this.level = level;
        this.hp = hp;
        this.xp=xp;
        this.sound=sound;
    }

    public int levelUp(){
        level = level++;
        System.out.println(getName() +  " increases to level: " + level);
        return level;
    }

    public abstract int increaseXP(int xp);

    public String getName(){
        return name;
    }
    public String getType() {
        return type;
    }

    public int getLevel(){
        return level;
    }

    public int getXp(){
        return xp;
    }

    public void setAttack(String attack) {
        this.attack = attack;
    }

    public void setHp(int hp){
        this.hp = hp;
    }
}
