package tr.salkan.code.java.pure.examples.equalsVSreferance;

public class StringCompareExample {

    public static void main(String[] args) {

        String name = new String("Hakan");
        String name2 = new String("Hakan");

        String surname = "Candan";
        String surname2 = "Candan";

        String str = "MerhabaSerdar";
        final String isim = "Serdar";   //constant
        String str2 = "Merhaba" + isim;

        String str3 = "MerhabaSerdar";
        String isim2 = "Serdar";
        String str4 = "Merhaba" + isim2;


        String str5 = "MerhabaSerdar";
        String str6 = "Merhaba" + getStrValue();

        String str7 = "Selam";
        String str8 = new String("Selam");

        if(name == name2)
        {
            System.out.println("name == name2 ");   //false
        }

        if(name.equals(name2))
        {
            System.out.println("name equals name2 ");   //true
        }

        System.out.println("---------------------");

        if(surname == surname2)
        {
            System.out.println("surname == surname2 ");  //true
        }

        if(surname.equals(surname2))
        {
            System.out.println("surname equals surname2 "); //true
        }

        System.out.println("---------------------");

        if(str == str2)
        {
            System.out.println("str == str2 ");  //true
        }

        System.out.println("---------------------");

        if(str3 == str4)
        {
            System.out.println("str3 == str4 ");  //false
        }

        System.out.println("---------------------");

        if(str5 == str6)
        {
            System.out.println("str5 == str6 ");  //false
        }

        System.out.println("---------------------");

        if(str7 == str8)
        {
            System.out.println("str7 == str8 ");  //false
        }

        if(str7 == str8.intern())           //intern
        {
            System.out.println("str7 == str8 intern ");  //true
        }
    }

    public static String getStrValue() {
        return "Serdar";
    }
}
