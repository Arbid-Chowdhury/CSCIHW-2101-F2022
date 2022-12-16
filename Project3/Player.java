package Project3;

public class Player {
    private int lives;

    // make a Player object with no parameter (default lives = 5)
    public void player() {
        Player player = new Player();
        player.lives = 5;
    }
    // make a player object with lives parameter
    public void player(int lives) {
        Player player = new Player();
        player.lives = lives;
    }
    // make a method to get the lives 
    // return lives (int)
    public int getLives() {
        return lives;
    }
    public void setLives(int lives) {
        this.lives = lives;
    }
    // make a death method to subtract a life from the lives total (void)
    public void death() {
        lives--;
    }
    
}
