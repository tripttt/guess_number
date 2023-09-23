import java.io.*;
import java.util.Random;
class winner
{
    String name;
}
public class guess_num {
    InputStreamReader read = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(read);
    Random random = new Random();
    int n=0;
    int num=0;
    int s=0;
    int w=0;
    boolean c = true;
    public void gen()throws IOException
    {
        int i;
        //System.out.println("Enter a number:- ");
        InputStreamReader read = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(read);
        System.out.println("Enter a number:- ");

        while(c==true)
        {
            num = random.nextInt(100);
            n = Integer.parseInt(br.readLine());
            if(num==n)
            {
                s = s+1;
            }
            if(s==10)
            {
                System.out.println("You won");
                System.out.println("Score is:- 10");
                w = w+1;
                break;
            }
            if(w==1)
            {
                winner win = new winner();
                win.name = br.readLine();
                System.out.println(win.name);
            }
            System.out.println("Score is:- "+s);
            System.out.println("Number is:- "+num);
        }
        }

    public static void main(String[] args)throws IOException {
        guess_num ob1 = new guess_num();
        ob1.gen();
        winner win = new winner();
    }
}
