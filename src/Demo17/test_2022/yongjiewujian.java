package Demo17.test_2022;

public class yongjiewujian extends game{
    String name="ÓÀ½ÙÎŞ¼ä";
    @Override
    public void play() {
        System.out.println("playing the ÓÀ½ÙÎŞ¼ä");
    }

    @Override
    public void start() {
        System.out.println("Ñ¡ÁË»ğÄĞ");
    }

    @Override
    public void end() {
        System.out.println("Å­»ğ·ÙÉí");
    }

    public void attack(String p){
        switch (p){
            case "À«µ¶":
                System.out.println("×ó¼üĞîÁ¦´óĞı·ç");
                break;
            case "Ì«µ¶":
                System.out.println("ÊÉ»êÕ¶+¾ªÀ×Ê®½Ù");
                break;
            case "Ë«½Ú¹÷":
                System.out.println("»¢Ğ¥ÁúÅÚgogogo");
                break;
            default:
                System.out.println("Äãµ¶Ã»ÁË");
        }

    }
}
