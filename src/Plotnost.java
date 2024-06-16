public class Plotnost {
    public static void main(String[] args) {
        int level = 16;
        int temp = 36;
        float plot = 1.300f;
        float plot30 = (float) ((level - 40)*0.0004+(temp-30)*0.0005);
        System.out.println(plot30 + " " + (plot + plot30));
    }
}