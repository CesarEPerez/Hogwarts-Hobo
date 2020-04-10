import java.util.Random;

public class Character {
    
    int lives;
    int onTrack;
    int maxTracks;
    boolean alive;
    Random rand = new Random();

    public Character(int maxTracks) {
        lives = 3;
        onTrack = rand.nextInt(maxTracks);
        this.maxTracks = maxTracks;
        alive = true;
    }

    public int getLives() {
        return lives;
    }

    public void loseLife() {
        lives -= 1;
        if (lives == 0) {
            alive = false;
        } else {
            if (getTrack() == this.maxTracks) {
                setTrack(getTrack() - 1);
            } else {
                setTrack(getTrack() + 1);
            }
        }
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