public class patterns {
    static void main() {

//        solid square
        System.out.println("SOLID SQUARE");
        for(int sqi = 1; sqi <= 4; sqi++) {
            for (int sqj = 1; sqj <= 5; sqj++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

//        right-angled triangle
        System.out.println("SOLID RIGHT ANGLE TRIANGLE");
        for (int ri = 1; ri <= 5; ri++) {
            for (int rj = 1; rj <= ri; rj++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

//        solid rhombus
        System.out.println("SOLID RHOMBUS");
        for (int rhoi = 1; rhoi <= 5; rhoi++) {
            for (int rhoj = 1; rhoj <= 5-rhoi; rhoj++) {
                System.out.print("  ");
            }
            for (int rhoj = 1; rhoj <= 5; rhoj++) {
                System.out.print("* ");
            }
            System.out.println();
        }

//        inverted right angle triangle
        System.out.println("inverted right angle triangle");
        for (int iri = 1; iri <= 5; iri++) {
            for (int irj = 1; irj <= 5 - iri + 1; irj++) {
                System.out.print(" * ");
            }
            System.out.println();
        }









    }
}
