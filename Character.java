public class Character {
    
    int lives, onTrack, maxTracks;
    boolean alive;

    public Character(int trackNum, int maxTracks) {
        lives = 3;
        onTrack = trackNum/2;
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
                self.setTrack(self.getTrack() - 1)    
            } else {
                self.setTrack(self.getTrack() + 1)
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