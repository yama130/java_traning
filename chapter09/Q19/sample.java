import java.io.*;
public class sample{
  public static void main(String[] args){
    try{
      int i=1;
      FileWriter out=new FileWriter("cdata.dat");
      FileOutputStream b_out=new FileOutputStream("bdata.dat");
      out.write(String.valueOf(i));
      out.close();
      b_out.write(i);
      b_out.close();

    }catch(IOException e){
      System.out.println("入出力エラー");
    }
  }
}
