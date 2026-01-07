package pr2.interfaces.uebersetzer;

public class Translator{

    public static void main(String[] args) {
        if(args.length <= 1) {
            System.out.println("Geben Sie bitte eine Sprache ein!");
        }
        else if(args.length > 1 && args[1].toLowerCase().equals("englisch")){
            UebersetzerDeutschEnglisch ude = new UebersetzerDeutschEnglisch();
            System.out.println(ude.uebersetze(args[2]));
        }
        else if(args.length > 1 && args[1].toLowerCase().equals("spanisch")){
            UebersetzerDeutschSpanisch uds = new UebersetzerDeutschSpanisch();
           System.out.println(uds.uebersetze(args[2])); 
        }
        else {
            System.out.println("unbekannte Sprache");
            System.out.println(args[1]);
        }
    }
}
