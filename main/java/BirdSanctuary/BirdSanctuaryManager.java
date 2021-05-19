package BirdSanctuary;
import java.util.HashSet;
import java.util.Set;

public class BirdSanctuaryManager {
    Set<Bird> birdList = new HashSet<>();

    public void add(Bird bird) {
        birdList.add(bird);
        bird.incrementCount();
    }

    public void remove(Bird bird) {
        birdList.remove((bird));
        bird.decrementCount();
    }

    public int getAllCount() {
        return birdList.size();
    }

    public void print() {
        for(Bird bird: birdList) {
            bird.eat();
            if(bird instanceof flyable) {
                ((flyable)bird).fly();
            }
            if(bird instanceof swimmable) {
                swimmable swimable = (swimmable)bird;
                swimable.swim();
                }
            }

        }
    }

