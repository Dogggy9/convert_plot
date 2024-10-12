public class Main {
    public static void main(String[] args) {
        int level = 38;
        int temp = 26;
        double plot = 1.295;

        Zz431 zz431 = new Zz431(level, temp);
        System.out.println(zz431.getPlot30() + plot);

        Zz832 zz832 = new Zz832(level, temp);
        System.out.println(zz832.getPlot30() + plot);
    }
}