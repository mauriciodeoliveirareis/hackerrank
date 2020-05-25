public class TaumBday {

    public static long taumBday(long b, long w, long bc, long wc, long z) {
        if (bc > wc) {
            bc = Math.min(bc, wc + z);
        } else if (wc > bc){
           wc = Math.min(wc, bc + z);
        }
        return (bc * b ) + (wc * w);
    }
}
