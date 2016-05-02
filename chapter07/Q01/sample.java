class PrintString{
  PrintString(){
    System.out.println("PrintString class");
  }
  void printStr(int x){
    System.out.println("数値は"+x);
  }
}
public class sample{
    public static void main(String[] args){
      PrintString pStr=new PrintString();
      pStr.printStr(1);
    }
}
