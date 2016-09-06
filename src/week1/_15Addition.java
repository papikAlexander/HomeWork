package week1;

/**
 * Created by Alexander on 06.09.2016.
 */
public class _15Addition {
    public static void main(String[] args){
        int areaCircle = 256;
        int areaSquare = 144;

        double sideSquare = Math.sqrt(areaSquare);
        double diagonalSquare = Math.sqrt(sideSquare * sideSquare * 2);

        double radiusCircle = Math.sqrt(areaCircle / 3.14);

        if (radiusCircle <= sideSquare / 2){
            System.out.println("a) Circle in the square ");
        } else if(radiusCircle >= diagonalSquare / 2){
            System.out.println("b) Square in the circle");
        } else{
            System.out.println("Not a) and b)");
        }
    }
}
