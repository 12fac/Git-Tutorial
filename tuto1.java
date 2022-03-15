public class tuto1 {

  public static void main(String[] args) {

    System.out.println( addVal( 5, 6 ) );
    System.out.println( minusVal( 5, 6 ) );
    System.out.println( multipleVal( 5, 6 ) );
    System.out.println( divVal( 5, 6 ) );


  }

  public static long addVal(long a, long b){
    return a + b;
  }

  public static long minusVal(long a, long b){
    return a - b;
  }

  public static long multipleVal(long a, long b){
    return a * b;
  }

  public static long divVal(long a, long b){
    return a / b;
  }

}
