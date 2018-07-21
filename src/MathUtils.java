import java.util.Calendar;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

class extenme{
    protected int abc(){
        return Integer.parseInt(null);
    }
}

public class MathUtils  extends  extenme{
    /*@Override
    private int abc(){
        return Integer.parseInt(null);
    }*/
    public static char[] reverseArray(char[] array) {
        array = new StringBuilder(new String(array)).reverse().toString().toCharArray();
        return array;
       // throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Integer a = Integer.valueOf(1);
        Integer b = a;
        a+=1;
        System.out.println(a +" "+ b );
        Set<String> set  = new LinkedHashSet<String>();
        set.add("3");

        set.add("1");
        set.add("3");
        //Boolean b = new Boolean("false");
       // Character c = new Character("c");
        Integer i = new Integer(1);
        Double d = new Double("10.45");
        //System.out.println(b);
        for(String str:set){
            System.out.println(str+"-");
        }
       // System.out.println(Math.floor(10.99));
       // System.out.println(args);
        //System.out.println(args[1]);
        char[] input = {'H','e','l','l','o'};
        System.out.println(reverseArray(input));
        StringBuilder  sb = new StringBuilder("buffering");
        sb.replace(2,7,"BUFFER");
        sb.delete(2,4);
        String s = sb.substring(1,5);
        System.out.println(s);
        Locale locale = new Locale("th","TH");
        Locale locale1 = new Locale.Builder().setLanguage("en").setRegion("GB").build();
       getme();
    }
    static void getme(){
        Calendar calendar = Calendar.getInstance();
        calendar.set(2000,Calendar.AUGUST,30);
        calendar.roll(Calendar.MONTH,7);
        System.out.println(calendar.get(Calendar.DATE) + " "+ calendar.get(Calendar.MONTH)+" "+ calendar.get(Calendar.YEAR));
        calendar.add(Calendar.MONTH,11);
        System.out.println(calendar.get(Calendar.DATE) + " "+ calendar.get(Calendar.MONTH)+" "+ calendar.get(Calendar.YEAR));
         int a = 1000000000;
        System.out.println(a);
        boolean b =false;
        int n= 5;
        System.out.println(b|| n==5);
        System.out.println(b = true && n==5);
        System.out.println(b);
    }
}