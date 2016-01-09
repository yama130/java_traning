import java.io.*;
public class sample{
  public static void main(String[] args){
    try{
      int i;
      FileInputStream in=new FileInputStream("a.jpg");
      FileOutputStream out =new FileOutputStream("b.jpg");
      while((i=in.read())!=-1)
        out.write(i);
      in.close();
      out.close();

    }catch(IOException e){
      System.out.println("入力エラー");
    }
  }
}
