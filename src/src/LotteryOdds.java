import java.util.*;





public class LotteryOdds
{
    public static void testOdds()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How Many numbers do you need to draw?");
        int k = in.nextInt();

        System.out.println("What's the highest number you can draw?");
        int n = in.nextInt();

        int lotteryOdds = 1;
        for(int i = 1; i <= k; i++)
            lotteryOdds = lotteryOdds * (n - i + 1)/i;

        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good Luck!");
    }

    public static void testArrays()
    {
        int[] a = new int[100];
        for(int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        for(int x : a)
            System.out.println(x);

        System.out.println(Arrays.toString(a));

        int[] result = new int[6];
        for(int j=0; j<result.length; j++)
        {
            int r = (int) (Math.random() * a.length);
            result[j] = a[r];
        }

        Arrays.sort(result);
        for(int x : result)
            System.out.println(x);
    }

    public static void test(){
        Date today = new Date();
        System.out.println(today.toString());
    }

    public static void main(String[] args)
    {
        test();
        //testArrays();

        //testOdds();

    }




}