import java.util.Arrays;

public class lima {
    public static void main(String args[]){
        String[] number= {"5","13","7","5","9","20","9","5","14"};
        System.out.println(Arrays.toString(number));
        System.out.println("2 pasang:");
        for (int i=0; i<number.length; i++){
            for (int j=i+1; j<number.length; j++){
                if (number[i].equals(number[j])){
                    System.out.print("[" + number[i]+ "," +number[j]+ "]");
                }
            }
        }
    }
}
