public class Game{
    public static void main(String[] args) {
        //BUAT OBJEK
        Player Hero = new Player();
        Player Enemy = new Player();

        Hero.match("Jinggg", "f0rsakeN");
        Hero.run("f0rsakeN","Jinggg", 100);

        Hero.displayTextATT("f0rsakeN", "Jinggg", "Phantom", "Operator");

        Hero.Stats("f0rsakeN", "Operator", 150);
        Enemy.Stats("Jinggg", "Phantom", 140);

        if(Enemy.IsDead()){
        System.out.println("Hero Win !!!");
        }
    }    
}