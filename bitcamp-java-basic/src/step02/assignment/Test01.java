package step02.assignment;

class Test01{
   public static void main(String[] args) {

      java.io.InputStream keyboard = System.in;
      java.util.Scanner sc = new java.util.Scanner(keyboard);
      System.out.println("이름을 입력하시오.");
      String name = sc.nextLine();
      String[] sArr = {"국어", "영어", "수학"};
      int[] iArr = new int[3];
      int total, avg;
      for(int i=0; i<3; i++){
         System.out.println(sArr[i] + "점수를 입력하시오.");
         iArr[i] = sc.nextInt();
      }
      total = iArr[0]+iArr[1]+iArr[2];
      avg = total/iArr.length;
      System.out.println("------------------------------------");

      System.out.println(name + " " +iArr[0] +" "+iArr[1] +" "+iArr[2] +" "+total+" "+avg);
   
      
   }
}
