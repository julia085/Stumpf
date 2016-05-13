/**
 * Created by Administrator on 12.05.2016.
 */
public class Stumpf {

        public static void main(String[] args) {

            double[] eins = {3, 2, 256};
            double[] zwei = new double[eins.length + 6];

           // System.out.println("Länge erste Array: " + eins.length);
           // System.out.println("Länge zweite Array: " + zwei.length);

            zwei[0] = Math.sqrt(eins[2]);
            zwei[1] = eins[0] % eins[1];
            zwei[2] = eins[0] / eins[1];
            zwei[3] = eins[1] / eins[0];
            zwei[4] = Long.MAX_VALUE;
            zwei[5] = Double.MAX_VALUE;
            zwei[6] = Double.MAX_VALUE * 1.1;
            zwei[7] = Math.log(1);
            zwei[8] = -1.0/0.0;

            for(int i=0; i < zwei.length; i++ ) {
                System.out.println(zwei[i]);
            }

        }

}
