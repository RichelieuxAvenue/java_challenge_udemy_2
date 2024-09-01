public class Main {
    public static void main(String[]args){
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int finalscore = score;
        if(gameOver){
            finalscore += (levelCompleted*bonus);
            System.out.printf("Your final score is: %d\n", finalscore);
        }

    }
}
