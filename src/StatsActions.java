class StatsActions{
    class Player {
        private int hp = 100;
        public int reputation=1;

        // Getter method for hp
        public int getPlayerHp() {    
        return hp;
        }
        // Setter method for hp (Updates the HP with the damage taken)
        public void setPlayerHp(int newHp) {
        this.hp = newHp;
    }
    }
        public void jump() {
            // implementation
        }
    
        public void moveRight() {
            // implementation
        }
    
        public void moveLeft() {
            // implementation
        }
    
        public void attackBow() {
            // implementation
            int randomNumber = random.nextInt(101); // 70% chance of the Bow attack landing

            // Check if the number is above 70
            if (randomNumber > 70) {
                System.out.println("The shot landed!");
                dealDamage(bowAttackValue);
            } else {
                System.out.println("The shot missed...");
            }
        }
    
        public void attackClub() {
            dealDamage(swordAttackValue);
        }
    
    // Monster class (NPC subclass)
    class Monster{
        private String name;
        private int hp=70;
        private int lvl;
        public int getEnemyHp() {
            return hp;
            }
        public void setEnemyHp(int newHp) {
            this.hp = newHp;
        }        
        public void attack() {
            randomAttack = random.nextInt(25);
            takeDamage(randomAttack*reputation);
        }
    }
    
    // NPC class
    class NPC {
        public void talk() {
            switch(reputation){
                case 1: 
                System.out.println("What do you want? Leave me alone, I'm working.");
                break;
                case 2:
                System.out.println("Thanks for your hard work!");
                break;
                case 3:
                System.out.println("Thank you again! Take these weapons for your troubles!");
                bowAttackValue = 80;
                swordAttackValue = 50;
                break;
                case 4:
                System.out.println("Thank you again! Now I can return back to my peaceful life!");
                break;
            }
            
        }
    }
    
    // Environment class
    class Environment {
        public void changeScene() {
            // implementation
        }
    }
    
    // Sword class
    class Sword {
        public int swordAttackValue=30;
        private int accuracy = 100; 
    }
    
    // Bow class
    class Bow {
        public int bowAttackValue=60;
        private int accuracy = 70;
    }

    public void dealDamage(Player player, Enemy enemy, int damage) {
        enemy.setEnemyHp(enemy.getEnemyHp() - damage);
        System.out.println("Monster took " + damage + " damage.");
        System.out.println("The monster's health is: " + enemy.getEnemyHp());
        
        if (enemy.getEnemyHp() <= 0) {
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
            /* This block of code is my old code, which was replaced by the one above. I just don't want to delete it in case the one above doesn't work.
    
    public void dealDamage(int damage) {
        Enemy enemy = new Enemy();
        enemy.setEnemyHp(hp -= damage);
        System.out.println("Monster took " + damage + " damage.");
        System.out.println("The monster's health is: " + enemy.getEnemyHp());
        
        if (enemy.getEnemyHp()<= 0) {
            System.out.println("Monster is defeated!");
        }
    }
    public void takeDamage(int damage) {
        Player player = new Player();
        player.setPlayerHp(hp -= damage);
        System.out.println("You took " + damage + " damage.");
        System.out.println("Your current health is: " + player.getPlayerHp());
        if (player.getPlayerHp() <= 0) {
            System.out.println("You Died!");
        }
    }
*/    
    public void endBattle(){
        Player player = new Player();
        player.setPlayerHp(hp*reputation);
    }
}