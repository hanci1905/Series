import java.util.Arrays;

public class Frequency {
    

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1, 8, 8};
        int[] duplicate = new int[list.length];
        int startIndex = -1;
        for (int i = 0; i < list.length; i++) {
            int count=1;
            for (int j = i+1; j < list.length; j++) {

                    if ((list[i] == list[j])) {
                        count++;
                       duplicate[j]=startIndex;


                    }
                }
            if(duplicate[i]!=startIndex)
                duplicate[i]=count;
            }


        for(int i = 0; i < duplicate.length; i++){
            if(duplicate[i] != startIndex)
                System.out.println("    " + list[i] + "    |    " + duplicate[i]);
        }
        System.out.println("----------------------------------------");
    }
}
