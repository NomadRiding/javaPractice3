public class Game {
private Character hero;
private Character villain;

    public Game(Character hero, Character villain ){
       this.hero = hero;
       this.villain = villain;
    }

    public void start(){
        while(hero.getHealth() > 0 && villain.getHealth() > 0){
            hero.attack(villain);
            if (villain.getHealth() > 0) {
                villain.attack(hero);
            }
        }
        if (hero.getHealth() <= 0) {
            System.out.println(hero.getName() + " has been defeated!");
        }else System.out.println(villain.getName() + " has been destroyed!");

    }
}
