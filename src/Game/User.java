package Game;
import java.util.Scanner;

public class User {
    Scanner sc=new Scanner(System.in);
    public  void user(char[][] game,int input ){

        switch (input){
            case  1:
                game[0][0]='X';
                break;
            case 2:
                game[0][1]='X';
                break;
            case 3:
                game[0][2]='X';
                break;
            case 4:
                game[1][0]='X';
                break;
            case 5:
                game[1][1]='X';
                break;
            case 6:
                game[1][2]='X';
                break;
            case 7:
                game[2][0]='X';
                break;
            case 8:
                game[2][1]='X';
                break;
            case 9:
                game[2][2]='X';
                break;



        }


    }
    public boolean isValid(char[][] game, int input){


        switch (input){
            case 1:
                if (game[0][0]==' '){

                    return true;}
                else {
                    break;
                }
            case 2:
                if (game[0][1]==' '){
                    return true;
                }
                else {break;}
            case 3:
                if (game[0][2]==' '){
                    return true;
                }
                else {break;}
            case 4:
                if (game[1][0]==' '){
                    return true;
                }
                else {break;}
            case 5:
                if (game[1][1]==' '){
                    return true;
                }
                else {break;}
            case 6:
                if (game[1][2]==' '){
                    return true;
                }
                else {break;}
            case 7:
                if (game[2][0]==' '){
                    return true;
                }else {break;}
            case 8:
                if (game[2][1]==' '){
                    return true;
                }else {break;}
            case 9:
                if (game[2][2]==' '){
                    return true;
                }else {break;}
            default:
                System.out.println();
                return false;


        }

        return false;
    }
    public  void Check(char[][] game){


        int input;


        while (true){
            System.out.println("Enter Location: ");
            input=sc.nextInt();
            System.out.println("Number IS: "+input);
            if(isValid(game,input)==true){
                break;}
            else {
                System.out.println("Invalid:Enter again");
            }}
        user(game,input);

    }

}

