public class FibonasiSeries{
    public static void main(String[] args) {
        int num =7;
        int a=0;
        int b=1;
        int c;

        for (int i=0; i<num; i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}