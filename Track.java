public class Track {

    boolean trainOn; // if train is on track
    int id;
    
    public Track (int id) {
        this.id = id;
        trainOn = false;
    }

    //
    public void setTrainOn(boolean trainOn) {
        this.trainOn = trainOn;
    }

    public int getId() {
        return id;
    }

}