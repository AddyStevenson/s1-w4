public class StringExamples{
    public void testIndexOf(){
      String s = "Long Life";
      int index = s.indexOf("ong");
      // index = s.indexOf("L");
      // index = s.indexOf("zzzz");
      // index = s.indexOf("");
      System.out.println(index);
    }
  
    public void testSubstring(){
          String x = "Little Baby L";
          String e = x.substring(1);
          String f = x.substring(6);
          String g = x.substring(3,9);
          String h = x.substring(0,1);
          String i = x.substring(13);
          //String j = x.substring(14);
          int n = x.length();
          System.out.println(e);
          System.out.println(f);
          System.out.println(g);
          System.out.println(h);
          System.out.println(i);
          System.out.println(n);

    } 
  }