public class fun {
    public static void main(String arg[]){
      StringBuilder sb=new StringBuilder("Tony");
      System.out.println(sb);
    
      //char at index 0
      System.out.println(sb.charAt(0));

      //set char at index 0
      sb.setCharAt(0, 'm');
      System.out.println(sb);

      // insert char
       sb.insert(0, "s");
       System.out.println(sb);

       //dellet the extra 'n'

       sb.delete(2,3);
       System.out.println(sb);
       //print length
       System.out.println(sb.length());

       // append fun
       sb.append("n");
       System.out.println(sb);

       //reverse
       
    }

    
}
