public class Character {
    
    int lives, onTrack, maxTracks;
    boolean alive;

    public Character(int trackNum, int maxTracks) {
        lives = 3;
        onTrack = trackNum;
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
            if (this.onTrack == maxTracks) {
                this.onTrack = maxTracks;
            } else {
                this.onTrack = maxTracks;
            }
        }
    }

    public int getTrack() {
        return onTrack;
    }

    public void setTrack(int trackNum) {
        onTrack = trackNum;
    }
}