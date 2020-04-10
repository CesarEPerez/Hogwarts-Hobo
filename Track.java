import java.util.Random;

public class Track {

    boolean trainOn; // if train is on track
    int id;
    int lastTrainTime;
    int interTrainTime;
    Random rand = new Random();
    
    public Track (int id, int interTrainTime) {
        this.id = id;
        this.trainOn = false;
        this.lastTrainTime = rand.nextInt(5);
        this.interTrainTime = interTrainTime;
    }

    //
    public void setTrainOn(boolean trainOn) {
        this.trainOn = trainOn;
    }

    public int getId() {
        return id;
    }

    public void spawnNextTrain(int currentTime) {
        if (currentTime - this.lastTrainTime >= this.interTrainTime) this.setTrainOn(true);
        else this.setTrainOn(false);
    }

}