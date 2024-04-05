import java.util.Random;

public class Monster{
    private int hp=70;
    private Random random = new Random();
    private Player player = new Player();

    public int getEnemyHp() {
        return hp;
    }

    public void setEnemyHp(int newHp) {
        this.hp = newHp;
    }        

    public void attack() {
        int randomAttack = random.nextInt(25);
        takeDamage(player, randomAttack*player.reputation);
    }
}