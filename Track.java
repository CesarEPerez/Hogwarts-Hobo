public class Track {

    boolean trainOn; // if train is on track
    int id, // the track id so that we know which one 
    hobos; // how many hobos on the current track
    
    public Track (final int x) {
        id = x;
        trainOn = false;
        hobos = 0;
    }

    // set hobos to number
    public void setHobos(final int hobos) {
        this.hobos = hobos;
    }

    //
    public void setTrainOn(final boolean trainOn) {
        this.trainOn = trainOn;
    }

    public int getHobos() {
        return hobos;
    }

    public int getId() {
        return id;
    }

}