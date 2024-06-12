import java.util.Random;

public class Character {
    private String name;
    private int health;
    private int attackPower;
    private int attackSuccessRate;

    public Character(String name, int health, int attackPower, int attackSuccessRate){
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.attackSuccessRate = attackSuccessRate;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }


        public void takeDamage(int damage){
            this.health -= damage;
            if (health < 0) System.out.println("Oh dear... You fall into the eternal nap");
            else System.out.println(name + " now has " + health + " remaining!");
        }



        public void attack(Character opponent){
            Random random = new Random();
            int chance = random.nextInt(100);

            if (chance < this.attackSuccessRate){
                System.out.println(this.name + " attacks " + opponent.getName() +  " dealing " + attackPower + " damage." );
                opponent.takeDamage(this.attackPower);
            }else System.out.println(this.name + " missed the attack!");
        }

}