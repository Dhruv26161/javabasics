package basicprograms.whileloop;

public class SumOfDigit {
    static void main(String[] args) {
        int n=548759621,sum=0,remainder;
        while(n!=0){
            remainder=n%10;
            sum=sum+remainder;
            n=n/10;
        }
        System.out.println(sum);
    }
}
