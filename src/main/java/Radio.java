public class Radio {
    private int currentStation;
    private int currentSound;

    public void nextStation() {
        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;

    }

    public void increaseSound() {
        if (currentSound < 10) {
            currentSound = currentSound + 1;
        }
    }

    public void DecreaseSound() {
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
        if (currentSound > 10) {
            return;
        }
        this.currentSound = currentSound;
    }
}