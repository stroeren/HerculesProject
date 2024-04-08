import java.util.Random;
static Player player;
public class Enemy extends Character {
    private Random random = new Random();
    public Enemy(String name, int maxHP) {
        super(name, maxHP);
    }
    public void attack() {
        int randomAttack = random.nextInt(25);
        takeDamage(player, randomAttack*player.reputation);
    }

}   
