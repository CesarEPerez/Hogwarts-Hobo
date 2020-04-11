import java.util.Random;

public class Character {
    
    int lives;
    int onTrack;
    int maxTracks;
    boolean alive;
    Random rand = new Random();
    int id;

    public Character(int maxTracks, int id) {
        lives = 3;
        onTrack = rand.nextInt(maxTracks);
        this.maxTracks = maxTracks;
        alive = true;
        this.id = id;
    }

    public int getLives() {
        return lives;
    }

    public int getID() { return this.id; }

    public boolean isAlive() { return alive; }

    public void loseLife() {
        lives -= 1;
        System.out.println("Hobo " + id + " took damage! Health: "+lives);
        if (lives == 0) alive = false;
    }

    public int getTrack() {
        return onTrack;
    }

    public void setTrack(int trackNum) {
        onTrack = trackNum;
    }

    public void changeTrackRandom() {
        int probability = rand.nextInt(10);
        if (probability < 4) this.onTrack = rand.nextInt(maxTracks);
    }
}