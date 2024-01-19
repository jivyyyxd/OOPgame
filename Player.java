public class Player {
    //ATRIBUT
    String nama;
    int speed;
    int healthPoin;
    int damage;

    void run(String namaHero, String namaEnemy, int speed){
        System.out.println(namaHero+" is running away from "+namaEnemy);
        System.out.println("Speed "+speed);
    }

    boolean IsDead(){
        if(healthPoin <= 0) return true;
        return false;
    }

    void match(String namaEnemy, String namaHero){
        System.out.println("===============================");
        System.out.println(namaEnemy+" is matched with "+namaHero);
        System.out.println("===============================");
    }

    void displayTextATT(String namaHero, String namaEnemy, String namaSenjata, String namaSenjata2){
        System.out.println(namaEnemy+" attacked "+namaHero+" with "+namaSenjata);
        System.out.println("BUT "+namaHero+" FLICKED ON "+namaEnemy+" AND LAND HIS SHOT WITH THE "+namaSenjata2);
        System.out.println("===============================");
    }

    void Stats(String nama, String namaSenjata, int damage){
        System.out.println(nama+"'s stats");
        System.out.println("Senjata : "+ namaSenjata);
        System.out.println("Damage : "+ damage);
        System.out.println();
    }

}
