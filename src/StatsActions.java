class StatsActions{
    class Player {
        private String name;
        private int hp = 100;
        private int lvl = 1;
        private int reputation;
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
            randomNumber = random.nextInt(101); // 70% chance of the Bow attack landing

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
    class Monster extends NPC {
        private String name;
        private int hp;
        private int lvl;
        public int getEnemyHp() {
            return hp;
            }
        public void setEnemyHp(int newHp) {
            this.hp = newHp;
        }        
        public void attack() {
            randomAttack = random.nextInt(25);
            takeDamage(randomAttack);
        }
    }
    
    // NPC class
    class NPC {
        public void talk() {
            // implementation
        }
    
        private boolean passive;
    }
    
    // Environment class
    class Environment {
        public void changeScene() {
            // implementation
        }
    }
    
    // Sword class
    class Sword {
        private int swordAttackValue=30;
        private int accuracy = 100;
    }
    
    // Bow class
    class Bow {
        private int bowAttackValue=60;
        private int accuracy = 70;
    }
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
}