package Oct09;

public class InterviewQCompareNames {
    public static void main(String[] args) {
//        String name1 = " Firstname lastname "; // " Jack Ma "
//        String name2 = " Lastname, firstname"; // " Ma, jack"
        String name1 = " Jack Ma ";
        String name2 = " Ma, jack";

        System.out.println(compareNames(name1, name2));

    }

    public static boolean compareNames(String name1, String name2) {
        System.out.println("name 1 => " + normalizeName(name1));
        System.out.println("name 2 => " + normalizeName(name2));
        return normalizeName(name1).equals(normalizeName(name2));
    }


    public static String normalizeName(String name) {
        if (name.contains(",")) {
            String[] names = name.toLowerCase().split(",");
            return names[1].trim() + " " + names[0].trim();
        }
        return name.toLowerCase().trim();
    }

}
