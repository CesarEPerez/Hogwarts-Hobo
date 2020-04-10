import java.util.Random;

public class Character {
    
    int lives;
    int onTrack;
    int maxTracks;
    boolean alive;
    Random rand = new Random();

    public Character(int maxTracks) {
        lives = 3;
<<<<<<< HEAD
        onTrack = trackNum;
=======
        onTrack = rand.nextInt(maxTracks);
        this.maxTracks = maxTracks;
>>>>>>> d549f27c5be5cfd464dfc702bb405d6327cd99e5
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
<<<<<<< HEAD
            if (this.onTrack == maxTracks) {
                this.onTrack = maxTracks;
            } else {
                this.onTrack = maxTracks;
=======
            if (self.getTrack() == maxTracks) {
                self.setTrack(self.getTrack() - 1);
            } else {
                self.setTrack(self.getTrack() + 1);
>>>>>>> d549f27c5be5cfd464dfc702bb405d6327cd99e5
            }
        }
    }

    public int getTrack() {
        return onTrack;
    }

    public void setTrack(int trackNum) {
        onTrack = trackNum;
    }

    public changeTrackRandom() {
        this.onTrack = rand.nextInt(maxTracks);
    }
}