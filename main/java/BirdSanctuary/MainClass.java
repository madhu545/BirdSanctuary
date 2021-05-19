package BirdSanctuary;

    public class MainClass {
        public static void main(String args[]) {
            BirdSanctuaryManager birdSanctuaryManager = new BirdSanctuaryManager();

            Parrot parrot = new Parrot("p1");
            Parrot parrot1 = new Parrot("p2");
            Parrot parrot2 = new Parrot("p3");
            Parrot parrot3 = new Parrot("p4");
            Parrot parrot4 = new Parrot("p5");
            Parrot parrot5 = new Parrot("p6");
            Duck duck = new Duck("d1");
            Penguin penguin = new Penguin("pg");
            Crow crow = new Crow("c");
            Crow crow1 = new Crow("c1");

            birdSanctuaryManager.add(parrot);
            birdSanctuaryManager.add(parrot1);
            birdSanctuaryManager.add(parrot2);
            birdSanctuaryManager.add(parrot3);
            birdSanctuaryManager.add(parrot4);
            birdSanctuaryManager.add(parrot5);
            birdSanctuaryManager.add(duck);
            birdSanctuaryManager.add(penguin);
            birdSanctuaryManager.add(crow);
            birdSanctuaryManager.add(crow1);

            System.out.println("Total Count: " + birdSanctuaryManager.getAllCount());

            birdSanctuaryManager.print();

            System.out.println("parrot count :" + parrot.getCount());
            System.out.println("duck count :" + duck.getCount());
            System.out.println("penguin count :" + penguin.getCount());
            System.out.println("Crow count :" + crow.getCount());
        }
    }