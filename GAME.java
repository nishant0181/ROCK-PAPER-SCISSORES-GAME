import java.util.Scanner;
import java.util.Random;

public class GAME {
    public static void main(String[] args) {


        System.out.println("WELCOME TO R&P&S !!!!");
        Random random = new Random();
        int com = random.nextInt(3);

        Scanner scan = new Scanner(System.in);
        System.out.println("ROCK =0 \nPAPER=1\nscissors=2");
        System.out.print("ENTER YOUR CHOICE HERE : ");
        int me = scan.nextInt();



        switch (me){
            case 0:
                System.out.println("YOUR CHOICE IS: ROCK ");
                break;
            case 1:
                System.out.println("YOUR CHOICE IS: PAPER ");
                break;
            case 2:
                System.out.println("YOUR CHOICE IS: scissors ");
                break;
        }


        switch (com){
            case 0:
                System.out.println("COMPUTER CHOICE IS: ROCK ");
                break;
            case 1:
                System.out.println("COMPUTER CHOICE IS: PAPER ");
                break;
            case 2:
                System.out.println("COMPUTER CHOICE IS: scissors ");
                break;
        }



        if(me==0 && com==0){
            System.out.println("MATCH IS TIE.!");
        }
        else if(me==0 && com==1){
            System.out.println("COM WIN!!");
        }
        else if(me==0 && com==2){
            System.out.println("YOU WIN!!");
        }
        else if(me==1 && com==0){
            System.out.println("YOU WIN!!");
        }
        else if(me==2 && com==0){
            System.out.println("COM WIN!!");
        }
        else if(me==2 && com==1){
            System.out.println("YOU WIN!!");
        }
        else if(me==1 && com==2){
            System.out.println("COM WIN!!");
        }
        else {
            System.out.println("PLEASE ENTER BETWEEN 1,2 or 3 !!!");
        }




    }
}
