import java.util.Random;

public class BattleSystem{
    static Player player;
    static Enemy enemy;
    public static void battle(){
    while (true) {
        System.out.println("The enemy's health is " + enemy.hp);
    }
}

}






/*static Player player;
    private Random random = new Random();
    private Sword sword = new Sword();
    private Bow bow = new Bow();

    public void attackBow() {
        int randomNumber = random.nextInt(101);

        if (randomNumber > 70) {
            System.out.println("The shot landed!");
            dealDamage(new Player(), new Monster(), bow.bowAttackValue);
        } else {
            System.out.println("The shot missed...");
        }
    }

    public void attackClub() {
        dealDamage(new Player(), new Monster(), sword.swordAttackValue);
    }

    public void dealDamage(Player player, Monster monster, int damage) {
        monster.setEnemyHp(monster.getEnemyHp() - damage);
        System.out.println("Monster took " + damage + " damage.");
        System.out.println("The monster's health is: " + monster.getEnemyHp());
        
        if (monster.getEnemyHp() <= 0) {
            System.out.println("Monster is defeated!");
            endBattle();
        }
    }

    public void takeDamage(Player player, int damage) {
        player.setPlayerHp(player.getPlayerHp() - damage);
        System.out.println("You took " + damage + " damage.");
        System.out.println("Your current health is: " + player.getPlayerHp());
        
        if (player.getPlayerHp() <= 0) {
            System.out.println("You Died!");
        }
    }

    public void endBattle(){
        Player player = new Player();
        player.setPlayerHp(player.getPlayerHp()*player.reputation);
    }

    
*/