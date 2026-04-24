public class KontaktMitIfElse {
    public static String gruss(String sprache, String name){
        String formel;
        if(sprache.equals("Deutsch")){
            formel = "Hallo";
        } else {
            formel = "Helloooo";
        }
        return formel + " " + name + " !";
    }
}
