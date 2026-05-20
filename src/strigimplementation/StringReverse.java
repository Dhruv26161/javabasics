package strigimplementation;

public class StringReverse {
    static void main(String[] args) {
        String s="dhruv";
        char arr[]=s.toCharArray();
        for (int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]);
        }
    }
}
