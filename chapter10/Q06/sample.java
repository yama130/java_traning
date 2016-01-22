package p_calc;
class Calc{
  int sum(int i ,int j){
    return i+j;
  }
}

public class sample{
  public static void main(String[] args){
    Calc calc=new Calc();
    System.out.println(calc.sum(1,2));
  }
}
