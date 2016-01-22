class test01{
  public static void main(String[] args){
    String value1="CodeIQ";
    String value2="CodeIQ";
    String value3=new String("CodeIQ");

    //int i=Integer.parseInt("123");
    //int j = Integer.parseInt("123.3");
//int k = (int)"123";
//int l = Integer.valueOf("123");
System.out.println(value1 == value2);
System.out.println(value2 == value3);
System.out.println(value1.equals(value3));
  }
}
