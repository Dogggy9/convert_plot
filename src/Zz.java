public class Zz {
    int level;
    int temp;
    int level30;

    public Zz(final int level, final int temp) {
        this.level = level;
        this.temp = temp;
    }

    public double getPlot30() {
        return ((level - getLevel30()) * 0.0004 + (temp - 30) * 0.0005);
    }

    int getLevel30() {
        return level30;
    }
}
