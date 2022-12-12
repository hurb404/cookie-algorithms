public class Main {
    public static void main(String[] args) {
        String[] bakers = {"John", "Paul", "George", "Ringo"};

        double[] radius = {3.5584302, 3.3372846, 6.2506404, 6.5101266, 11.14195, 11.390633, 6.059219, 7.6198936,
                3.9559102, 3.4897966, 4.5877743, 2.248942, 7.120556, 6.951386, 11.004293, 7.1984434, 9.842939,
                7.457286, 9.302006, 7.696409, 5.4018016, 11.887546, 2.7521315, 4.373297, 6.0638437, 7.357659,
                11.443289, 7.1183267, 2.3706598, 7.025098, 3.5888352, 6.2036247, 7.4295087, 9.359634, 2.9891124,
                6.570728, 2.4398787, 4.773993, 5.81896, 4.5945573, 7.5137663, 9.412766, 6.1099596, 3.8038797,
                2.379256, 7.6564374, 6.155718, 3.5557556, 10.42908, 11.703279, 2.237558, 2.4271913, 10.079432,
                2.1654994, 8.103827, 11.773896, 2.986606, 8.709292, 5.5016556, 8.468887, 5.4336114, 4.664557,
                8.624363, 4.0089073, 8.405487, 6.5435023, 4.8764486, 7.9818673, 2.4366434, 5.3837914, 9.052624,
                11.122608, 4.308504, 5.6483006, 9.465668, 8.927265, 5.829394, 2.4781418, 9.234173, 3.9097304,
                7.125972, 4.84781, 11.755752, 9.209787, 2.6573784, 10.581849, 8.15082, 10.325139, 2.227027, 6.263224,
                4.37937, 5.444001, 8.966121, 7.327901, 3.9274898, 9.187386, 4.107233, 9.662329, 6.957028, 3.7982924};

        int[] chips = {28, 48, 72, 32, 4, 117, 122, 173, 147, 173, 192, 15, 91, 145, 146, 86, 190, 103, 111, 175, 119,
                107, 16, 26, 196, 96, 20, 175, 111, 156, 79, 151, 57, 43, 2, 92, 21, 140, 189, 85, 69, 44, 7, 126, 149,
                93, 24, 46, 168, 1, 39, 171, 84, 185, 88, 105, 114, 162, 30, 111, 158, 119, 3, 55, 2, 106, 50, 168, 28,
                99, 32, 63, 148, 191, 138, 20, 191, 123, 73, 170, 102, 102, 29, 55, 197, 157, 156, 186, 39, 137, 93, 62,
                191, 31, 181, 156, 70, 135, 8, 81};

        System.out.println(WhoCookedIt(73));
        System.out.println(WhoCookedIt(40));
        System.out.println(WhoCookedIt(13));

        System.out.println();
        System.out.println();

        System.out.println("Least chips:");
        System.out.println(LeastChips(chips));

        System.out.println();
        System.out.println();

        System.out.println("Most chips:");
        System.out.println(MostChips(chips));

        System.out.println();
        System.out.println();

        System.out.println("Find largest cookie:");
        System.out.println(FindLargestCookie(radius));

        System.out.println();
        System.out.println();

        System.out.println("Average radius:");
        System.out.println(AvgRadius(radius));

        System.out.println();
        System.out.println();

        System.out.println("Best cookie:");
        BestCookie(chips, radius);

        System.out.println();
        System.out.println();

        System.out.println("Most chips:");
        MostChipsTotal(chips);
    }

    public static String WhoCookedIt(int index) {
        if (index % 4 == 0) {
            return "John";
        } else if (index % 4 == 1) {
            return "Paul";
        } else if (index % 4 == 2) {
            return "George";
        } else if (index % 4 == 3) {
            return "Ringo";
        } else {
            return "";
        }
    }

    public static int LeastChips(int[] chips) {
        int leastch = 1000000000;
        int index = 0;

        for (int i = 0; i < chips.length; i++) {
            if (chips[i] < leastch) {
                leastch = chips[i];
                index = i;
            }
        }

        if (index % 4 == 0) {
            System.out.println("John");;
        } else if (index % 4 == 1) {
            System.out.println("Paul");;
        } else if (index % 4 == 2) {
            System.out.println("George");;
        } else if (index % 4 == 3) {
            System.out.println("Ringo");;
        }

        System.out.println(chips[index]);
        return index;
    }

    public static int MostChips(int[] chips) {
        int mostch = 0;
        int index = 0;

        for (int i = 0; i < chips.length; i++) {
            if (chips[i] > mostch) {
                mostch = chips[i];
                index = i;
            }
        }

        if (index % 4 == 0) {
            System.out.println("John");;
        } else if (index % 4 == 1) {
            System.out.println("Paul");;
        } else if (index % 4 == 2) {
            System.out.println("George");;
        } else if (index % 4 == 3) {
            System.out.println("Ringo");;
        }

        System.out.println(chips[index]);
        return index;
    }

    public static int FindLargestCookie(double[] sizes) {
        double largestc = 0;
        int index = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i] > largestc) {
                largestc = sizes[i];
                index = i;
            }
        }

        if (index % 4 == 0) {
            System.out.println("John");;
        } else if (index % 4 == 1) {
            System.out.println("Paul");;
        } else if (index % 4 == 2) {
            System.out.println("George");;
        } else if (index % 4 == 3) {
            System.out.println("Ringo");;
        }

        return index;
    }

    public static double AvgRadius(double[] sizes) {
        double total = 0;
        int denominator = sizes.length;

        for (int i = 0; i < sizes.length; i++) {
            total = total + sizes[i];
        }

        return (total/denominator);
    }

    public static double ChipDensity(int amtChips, double radius) {
        return amtChips/radius;
    }

    public static int BestCookie(int[] chips, double[] radius) {
        int index = -2;
        double bestDensity = -1;

        for (int i = 0; i < chips.length; i++) {
            if (ChipDensity(chips[i], radius[i]) > bestDensity) {
                bestDensity = ChipDensity(chips[i], radius[i]);
                index = i;
            }
        }

        System.out.println(index);

        if (index % 4 == 0) {
            System.out.println("John");;
        } else if (index % 4 == 1) {
            System.out.println("Paul");;
        } else if (index % 4 == 2) {
            System.out.println("George");;
        } else if (index % 4 == 3) {
            System.out.println("Ringo");;
        }

        return index;
    }

    public static int MostChipsTotal(int[] chips) {
        int johnTotal = 0;
        int paulTotal = 0;
        int georgeTotal = 0;
        int ringoTotal = 0;

        for (int i = 0; i < chips.length; i++) {
            if (i % 4 == 0) {
                johnTotal = johnTotal + chips[i];
            } else if (i % 4 == 1) {
                paulTotal = paulTotal + chips[i];
            } else if (i % 4 == 2) {
                georgeTotal = georgeTotal + chips[i];
            } else if (i % 4 == 3) {
                ringoTotal = ringoTotal + chips[i];
            }
        }

        int[] totals = {johnTotal, paulTotal, georgeTotal, ringoTotal};
        int totalsMax = -1;
        int index = 0;

        for (int i = 0; i < totals.length; i++) {
            if (totals[i] > totalsMax) {
                totalsMax = totals[i];
                index = i;
            }
        }

        System.out.println(totalsMax);

        if (index % 4 == 0) {
            System.out.println("John");;
        } else if (index % 4 == 1) {
            System.out.println("Paul");;
        } else if (index % 4 == 2) {
            System.out.println("George");;
        } else if (index % 4 == 3) {
            System.out.println("Ringo");;
        }

        return totalsMax;
    }
}
