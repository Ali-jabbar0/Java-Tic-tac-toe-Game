package Game;
import java.util.Random;

public class Computer {
    int num;


    public void computerMove(char[][] game,int numbr){
        switch (numbr){
            case  1:
                game[0][0]='O';
                break;
            case 2:
                game[0][1]='O';
                break;
            case 3:
                game[0][2]='O';
                break;
            case 4:
                game[1][0]='O';
                break;
            case 5:
                game[1][1]='O';
                break;
            case 6:
                game[1][2]='O';
                break;
            case 7:
                game[2][0]='O';
                break;
            case 8:
                game[2][1]='O';
                break;
            case 9:
                game[2][2]='O';
                break;
            default:
                System.out.println("np");
        }
    }

    public  boolean isValid(char[][] game,int numbr){


        switch (numbr){
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
                return false;


        }
        return false;
    }
    public  void Check(char[][] game){





        while (true){
            Random random=new Random();
            num=random.nextInt(9)+1;
            System.out.println("RANDOM IS: "+num);
            if(isValid(game,num)==true){
                break;}
        }
        computerMove(game,num);

    }}
