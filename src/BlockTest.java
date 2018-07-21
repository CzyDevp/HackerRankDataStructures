public class BlockTest {
    private static int count =0;
    static {
        System.out.println("Count is: Block1");
        count=10;
    }
    private int[] data;
    {
        System.out.println("Block2: ");
        data = new int[count];
        for(int i=0;i<count;i++){
            data[i]=i;
        }
    }
    public static void main(String[] args){
        System.out.println("Count: "+count);
        System.out.println("Before first new:");
        BlockTest test1 = new BlockTest();
        System.out.println("Before second new:");
        BlockTest test2 = new BlockTest();

    }
}
