public class EqualsIgnoreCaseString {
    public static void main(String[] args) {
        String string1 = "eli";
        String string2 = "eli";
        String string3 = "Eli";
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string2));
        System.out.println("Hasilnya:" + string1.equalsIgnoreCase(string3));
    }

}
