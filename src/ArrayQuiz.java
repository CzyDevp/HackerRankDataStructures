public class ArrayQuiz
{
    public static void main(String[] args)
    {
        int[] arrA = {3, 5, 0, 1, 6, 4, 2};
        int[] arrB = {2, 6, 5, 4, 3, 1, 0};
        int[] arrC = {6, 1, 4, 0, 5, 3, 2};
        System.out.print(arrA[(arrC = arrB)[(arrA = arrC)[4]]]); //6
        System.out.println(arrA[4]);//3

        //2D quiz
        String[] names[] = {
                {"Mike", "David", "Emma"},  //1st row
                new String[3], //2nd row
                null,//3rd row
                {"Brandon", "Emily", "Bruce", null}, //4th row
                null}; //5th row
            System.out.println(names[3][2]);    //Bruce

    }
}