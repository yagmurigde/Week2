import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[] list= {10,20,20,10,10,20,5,20};
        Arrays.sort(list);
        int counter=0;

        for (int i=0; i< list.length; i++){
            counter=0;
            if (i==0) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        counter++;
                    }
                }
                System.out.println(list[i]+ " sayısı "+counter+" kez tekrar etti");
            }

            //to make sure we dont count same indices more than once
            else if (list[i] != list[i-1]){
                for (int j=0; j< list.length;j++){
                    if (list[i] == list[j]) {
                        counter++;
                    }
                }
                System.out.println(list[i]+ " sayısı "+counter+" kez tekrar etti");
            }
        }
    }
}