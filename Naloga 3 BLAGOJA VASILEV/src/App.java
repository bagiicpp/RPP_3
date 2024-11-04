import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter room area: ");
        double roomArea = scanner.nextDouble();

        System.out.println("Enter tile height");
        double tileHeight = scanner.nextDouble();

        System.out.println("Enter tile width");
        double tileWidth = scanner.nextDouble();

        System.out.println("Enter number of tiles");
        int tileNumber = scanner.nextInt();

        double tileArea = tileHeight * tileWidth;
        double tilePackage = tileNumber * tileArea;

        System.out.println("The tiler would need: " + (int)((roomArea / tilePackage) * 1.15));
        System.out.println("One tile is " + tileArea + "m^2" + "\nCutting residue is 15%" + "\n");


        double largePackageArea = 16.56;
        double mediumPackageArea = 5.22;
        double smallPackageArea = 1.60;

        double roomAreaResidue = roomArea * 1.15;
        
        int largePackages = (int)(roomAreaResidue / largePackageArea); //6
        roomAreaResidue -= largePackages * largePackageArea;

        int mediumPackages = (int)(roomAreaResidue / mediumPackageArea);
        roomAreaResidue -= mediumPackages * mediumPackageArea;
        
        int smallPackages = (int)(roomAreaResidue  / smallPackageArea);
        smallPackages++;

        double leftover = (largePackages * largePackageArea + mediumPackages * mediumPackageArea + smallPackages * smallPackageArea);

        System.out.println("Number of large packages: " + (int)largePackages); //6
        System.out.println("Number of medium packages: " + (int)mediumPackages); //2 
        System.out.println("Number of small packages: " + (int)smallPackages + "\nleftover: " + (leftover - roomArea * 1.15)); //4
    }   
}
