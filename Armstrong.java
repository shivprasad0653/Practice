
public class Armstrong {

public static void main(String[] args) {

    int copynum = 1;

    while (copynum <= 1000) {
        int sum = 0;
        int num = copynum;

        while (num > 0) {
            int d = num % 10;
            sum += d * d * d;
            num /= 10;
        }

        if (copynum == sum) {
            System.out.println(copynum + " is an Armstrong number");
        }

        copynum++;
    }

}
}

