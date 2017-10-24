public class QuineProgram {

     public static void main(String[] args){
      String f = "public class QuineProgram { "
        + "public static void main(String[] args)"
        + "{ String f =%c%s%1$c;"
        + " System.out.printf(f,34,f);}} ";
      System.out.printf(f, 34, f);
     }

}
