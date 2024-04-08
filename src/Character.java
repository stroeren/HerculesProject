public abstract class Character {
    public String name;
    public int hp, maxHP;

    public Character(String name, int maxHP){
        this.name = name;
        this.maxHP = maxHP;
        this.hp = maxHP;
    }
}
