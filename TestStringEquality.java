public class TestStringEquality {
 static public void main(String[] args) {
         String x = new String("ABCDE");
         String y = new String("ABCDE");
         String m= new String("Ben");
         m=new String("Juma");
         System.out.println("m==m "+(m==m));
         System.out.println("x = " + x);
         System.out.println("y = " + y);
         System.out.println("(x == y) = " + (x == y));
         System.out.println("x.equals(y) = " + x.equals(y));
         }
 }