import java.util.HashMap;
class sample{
  public static void main(String[] args){
    HashMap<String,String>map=new HashMap<String,String>();
    map.put("りんご","apple");
    //キーチェック
    if(map.containsKey("りんご")){
      System.out.println(map.get("りんご"));
    }else{
      System.out.println("キーなし");
    }
  }
}
