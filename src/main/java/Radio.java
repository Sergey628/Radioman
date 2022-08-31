public class Radio {
    private int currentStation;
    private int currentSound;
    private int stationsCount;

    public Radio () {
        this.stationsCount = 10;
    }

    public Radio (int stationsCount) {
        this.stationsCount = stationsCount;
    }

    public void nextStation() {
        if (currentStation < stationsCount-1) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = stationsCount;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > stationsCount) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void increaseSound() {
        if (currentSound < 100) {
            currentSound = currentSound + 1;
        }
    }

    public void decreaseSound() {
        if (currentSound > 0) {
            currentSound = currentSound - 1;
        }
    }


    public int getCurrentSound() {
        return currentSound;
    }


    public void setCurrentSound(int currentSound) {
        if (currentSound < 0) {
            return;
        }
        if (currentSound > 100) {
            return;
        }
        this.currentSound = currentSound;
    }
}