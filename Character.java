public class Character {
    
    int lives, onTrack;

    public Character(int trackNum) {
        lives = 3;
        onTrack = trackNum/2;
    }

    public getLives() {
        return lives;
    }

    public loseLife() {
        lives -= 1;
    }

    public getTrack() {
        return onTrack;
    }

    public setTrack(int trackNum) {
        onTrack = trackNum;
    }

}