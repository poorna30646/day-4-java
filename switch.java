import java.util.*;
class vote
{
public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int flg=0;
    if(a>=18)
    flg=1;
    switch (flg){
        case 0:
        System.out.println("not eligible");
        break;
        case 1:
        System.out.println("eligible");
        break;
    }
}
}