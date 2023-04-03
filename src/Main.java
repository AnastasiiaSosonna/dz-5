public class Main {
    public static void main(String[] args) {
        int a=7;
        int b=9;
        int c=8;
        int d=10;

        int sum1=a+b;
        int sum2=c+d;

        String sum1OrSum2 = sum1>sum2 ? "True" : "False";
        System.out.println(sum1OrSum2);

        sum1++;
        sum2=sum2-2;
        String sum1NewOrSum2New = sum1>sum2 ? "True" : "False";
        System.out.println(sum1NewOrSum2New);

        String res = sum1%2==0||sum2%2==0 ? "True" : "False";
        System.out.println(res);
    }
}