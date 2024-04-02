import java.util.Random;

class StatsActions{
    class Player {
        private int hp = 100;
        public int reputation=1;

        public int getPlayerHp() {    
            return hp;
        }

        public void setPlayerHp(int newHp) {
            this.hp = newHp;
        }
    }

    class Monster{
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

    class NPC {
        private Player player = new Player();

        public void talk() {
            switch(player.reputation){
                case 1: 
                    System.out.println("What do you want? Leave me alone, I'm working.");
                    break;
                case 2:
                    System.out.println("Thanks for your hard work!");
                    break;
                case 3:
                    System.out.println("Thank you again! Take these weapons for your troubles!");
                    bow.bowAttackValue = 80;
                    sword.swordAttackValue = 50;
                    break;
                case 4:
                    System.out.println("Thank you again! Now I can return back to my peaceful life!");
                    break;
            }
        }
    }

    class Sword {
        public int swordAttackValue=30;
    }

    class Bow {
        public int bowAttackValue=60;
    }

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
}