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

    public getLives() {
        return lives;
    }

    public loseLife() {
        lives -= 1;
        if (lives == 0) {
            alive = false;
        } else {
            if (self.getTrack() == maxTracks) {
                self.setTrack(self.getTrack() - 1);
            } else {
                self.setTrack(self.getTrack() + 1);
            }
        }
    }

    public getTrack() {
        return onTrack;
    }

    public setTrack(int trackNum) {
        onTrack = trackNum;
    }
}