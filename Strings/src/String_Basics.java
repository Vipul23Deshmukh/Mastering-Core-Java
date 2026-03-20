public class String_Basics {
    public static void main(String[] args) {
        String s="Vipul";
        s.concat("Deshmukh");//String are Imuttable so they cannot be changed
        //Because concat() creates a new object, original remains unchanged.

        //correct way
        s=s.concat(" Deshmukh");
        System.out.println(s);



        String s1="IamImmortal";
        s1.length();
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        System.out.println(s1.substring(3,10));


        String a="LULU";
        String b="LULU";

        System.out.println(a==b);//true
        System.out.println(a.equals(b));//true


        String a1=new String("LULU");
        String b1= new String("LULU");

        System.out.println(a1==b1);//false
        System.out.println(a1.equals(b1));//true

        //== → compares reference
        //equals() → compares content


        System.out.println("======================================================================");
        System.out.println();
        System.out.println();


        StringBuilder sb=new StringBuilder("Vipul");
        sb.append("Deshmukh");
        System.out.println(sb);


    }
}
