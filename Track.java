public class Track {

    boolean trainOn; // if train is on track
    int id, // the track id so that we know which one 
    hobos; // how many hobos on the current track
    public Track (int x) {
        id = x;
        trainOn = false;
        hobos = 0;
    }
    

    //set hobos to number
    public void setHobos(int hobos) {
        this.hobos = hobos;
    }

    //
    public void setTrainOn(boolean trainOn) {
        this.trainOn = trainOn;
    }

    public int getHobos() {
        return hobos;
    }

    public int getId() {
        return id;
    }

}