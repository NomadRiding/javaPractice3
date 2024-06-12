import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Character hero = new Character("hero", 40, 20, 75);
        Character villain = new Character("villain", 40, 20, 75);
        Game game = new Game(hero, villain);
        game.start();
    int i = 1;
        while (i < 5){
        System.out.println(i); i++;
    }
    }

}

