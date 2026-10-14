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
        System.out.println("SOLID INVERTED RIGHT ANGLE TRIANGLE");
        for (int iri = 1; iri <= 5; iri++) {
            for (int irj = 1; irj <= 5 - iri + 1; irj++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        System.out.println("SOLID PYRAMID");
        for (int pyi = 1; pyi <= 5; pyi++) {
            for(int pyj = 1; pyj <= 5 - pyi; pyj++) {
                System.out.print("  ");
            }
            for (int pyj = 1; pyj <= 2*pyi -1; pyj++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("SOLID INVERTED PYRAMID");
        for (int ipi = 1; ipi <= 4; ipi++) {
            for (int ipj = 1; ipj <= ipi - 1; ipj++) {
                System.out.print("  ");
            }
            for (int ipj = 1; ipj <= 2 * 4 - 2 * ipi + 1; ipj++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("SOLID HOLO RECTANGLE");
        for (int hri = 1; hri <= 4; hri++) {
            for (int hrj = 1; hrj <= 6; hrj++) {
                if (hri == 1 || hri == 4) {
                    System.out.print(" * ");
                } else if (hri == 2 || hri == 3) {
                    if (hrj == 1 || hrj == 6) {
                        System.out.print(" * ");
                    } else {
                        System.out.print("   ");
                    }
                }
            }
            System.out.println();
        }

////        second way
//        System.out.println("HOLLOW RECTANGLE");
//        for (int hri = 1; hri <= 4; hri++) {
//            for (int hrj = 1; hrj <= 6; hrj++) {
//                if (hri == 1 || hri == 4 || hrj == 1 || hrj == 6) {
//                    System.out.print(" * ");
//                } else {
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();
//        }


        // this is the see carefull while go in for loop
        System.out.println("HOLLOW RIGHT ANGLED TRIANGLE");
        for (int hrai = 1; hrai <= 5; hrai++) {
            if (hrai == 1 || hrai == 2 || hrai == 5) {
                for (int hraj = 1; hraj <= hrai; hraj++) {
                    System.out.print("* ");
                }
            } else {
                    // for printing first start
                    System.out.print("* ");
                    //  for printing spaces
                    for (int rhaj = 1; rhaj <= hrai - 2; rhaj++) {
                        System.out.print("  ");
                    }
                    // for printing second start
                    System.out.print("* ");
            }
            System.out.println();
        }





    }
}