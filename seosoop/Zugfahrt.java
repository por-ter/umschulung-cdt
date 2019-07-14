package seosoop;

public class Zugfahrt {

    private int abfahrtStd;
    private int abfahrtMin;

    public void setAbfahrtStd(int std) {
        if (std >= 0 && std <= 23) {
            this.abfahrtStd = std;
        }
    }

    public int getAbfahrtStd() {
        return this.abfahrtStd;
    }

    public void setAbfahrtMin(int abfahrtMin) {
        if (abfahrtMin < 0) {
            abfahrtMin = 0;
        } else if (abfahrtMin > 59) {
            abfahrtMin = 59;
            this.abfahrtMin = abfahrtMin;
        } else {
            this.abfahrtMin = abfahrtMin;
        }
    }

    public int getAbfahrtMin() {
        return abfahrtMin;
    }
}
