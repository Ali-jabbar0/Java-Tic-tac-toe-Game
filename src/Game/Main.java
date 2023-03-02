package Game;
public class Main {


    public static void main(String[] args) {
        String answer = null;
        char [][] game= {{' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}
        };



        while (true) {



            User user = new User();
            user.Check(game);
            CheckWinLose(game);
            if (GameOver(game)==true){
                break;
            }
            gameBoard(game);
            Computer computer = new Computer();
            computer.Check(game);
            gameBoard(game);
            CheckWinLose(game);

        }




    }
    public static void gameBoard(char[][] board) {
        System.out.println(board[0][0]+"|"+ board[0][1]+"|"+ board[0][2]);
        System.out.println("-+-+-");
        System.out.println(board[1][0]+"|"+ board[1][1]+"|"+ board[1][2]);
        System.out.println("-+-+-");
        System.out.println(board[2][0]+"|"+ board[2][1]+"|"+ board[2][2]);

    }
    public static boolean GameOver(char [][] game){
        for (int i=0; i<game.length; i++){
            for (int j=0; j<game[i].length; j++){
                if (game[i][j]==' '){
                    return false;
                }
            }
        }
        gameBoard(game);
        System.out.println("Game is tie");
        return true;

    }
    public static void CheckWinLose(char [][] game){
        if ((game[0][0] == 'X' && game[1][0] == 'X' && game[2][0] == 'X')
                || (game[0][0] == 'X' && game[1][1] == 'X' && game[2][2] == 'X')
                || (game[0][2] == 'X' && game[1][1] == 'X' && game[2][0] == 'X')
                || (game[0][1] == 'X' && game[1][1] == 'X' && game[2][1] == 'X')
                || (game[0][2] == 'X' && game[1][2] == 'X' && game[2][2] == 'X')
                || (game[2][0] == 'X' && game[2][1] == 'X' && game[2][2] == 'X')
                || (game[0][0] == 'X' && game[0][1] == 'X' && game[0][2] == 'X')
                || (game[1][0] == 'X' && game[1][1] == 'X' && game[1][2] == 'X')
        ) {
            System.out.println("You win ");
            System.exit(0);


        } else if ((game[0][0] == 'O' && game[1][0] == 'O' && game[2][0] == 'O')
                || (game[0][0] == 'O' && game[1][1] == 'O' && game[2][2] == 'O')
                || (game[0][2] == 'O' && game[1][1] == 'O' && game[2][0] == 'O')
                || (game[0][1] == 'O' && game[1][1] == 'O' && game[2][1] == 'O')
                || (game[0][2] == 'O' && game[1][2] == 'O' && game[2][2] == 'O')
                || (game[2][0] == 'O' && game[2][1] == 'O' && game[2][2] == 'O')
                || (game[0][0] == 'O' && game[0][1] == 'O' && game[0][2] == 'O')
                || (game[1][0] == 'O' && game[1][1] == 'O' && game[1][2] == 'O')
        ) {
            System.out.println("You Lose ");
            System.exit(0);


        }
    }



}

