package DiziMaxMin;

import java.util.Arrays;

public class ArraysThings {


    void minMax(int[] liste){

        int min = liste[0];
        int max = liste[0];
        
        for(int i : liste){

            if (i<min) {
                min = i;
            }
            if(i>max){
                max = i;
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: " + min);

    }

    void nearNumber(int[] liste, int number){

        int büyEnNumFark = ((liste[0]-number) < 0 ? -(liste[0]-number) : (liste[0]-number));
        int kücEnNumFark = ((liste[0]-number) < 0 ? -(liste[0]-number) : (liste[0]-number));
        int büyEnNum = liste[0];
        int kücEnNum = liste[0];
         

        for(int i : liste){
            if(i< number){
                int fark = number-i;
                if(fark< kücEnNumFark){
                    kücEnNumFark = fark;
                    kücEnNum = i;
                } 
            }

            if(i>number){
                int fark2 = i - number;
                if(fark2<büyEnNumFark){
                    büyEnNumFark = fark2;
                    büyEnNum = i;
                }

            }
        }

        System.out.println("Dizi: " + Arrays.toString(liste));
        System.out.println("Girilen sayı: " + number);
        System.out.println("Girilen sayıdan küçük en yakın sayı: " + kücEnNum);
        System.out.println("Girilen sayıdan büyük en yakın sayı: " + büyEnNum);
        
    }
    
}
