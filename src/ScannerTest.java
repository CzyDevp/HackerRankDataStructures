import java.util.Scanner;  
class ScannerTest{  
 public static void main(String args[]){  
   Scanner sc=new Scanner(System.in);  
   System.out.println("Enter your Mobile");
   int mobile=sc.nextInt();
   sc.nextLine();
   System.out.println("Enter your name");  
   String name=sc.next();
   System.out.println("Mobile:"+mobile+" name:"+name);
   System.out.println("Enter value for str1");
   String str1=sc.next();
   System.out.println("str1 is "+str1);
   System.out.println("Enter value for str2");
   String str2=sc.next();
   System.out.println("str2 is "+str2);
   sc.close();  
 }  
}   