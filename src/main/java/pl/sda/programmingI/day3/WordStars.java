package pl.sda.programmingI.day3;

public class WordStars {

    public static void main(String[] args) {
        wordInStars(5,5,1);
    }
    public static void wordInStars(int height, int width, int distance){
        for(int i = 0; i<=height; i++){
            if(i <height){
                System.out.println("*");
            }
            for(int j = 0; j<=width;j++){
                 if(i==height){
                     System.out.print("*");
                 }
            }
        }
    }
}
