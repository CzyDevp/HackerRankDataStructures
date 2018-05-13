    public class TestOverriding {
        public static void main(String str[]){
            Test t =new Fest();
            t.tests();
        }
    }
    class Test{
        synchronized void tests(){
            System.out.println("test");
        }
    }
    class Fest extends Test{
        void tests(){
            System.out.println("ok");
        }
    }