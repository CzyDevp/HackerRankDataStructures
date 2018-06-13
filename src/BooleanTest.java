class BooleanTest{
    public static void main(String args[]){
        int x = 3;
        boolean isDefect = false;
        //String name = "Nav";
        do{
            x++;
            if(isDefect=true)   //return true always if block executes
                System.out.print("A");
            else
                System.out.print("B");
        }
        while(x <= 5);
    }
}