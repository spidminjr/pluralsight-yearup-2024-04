import com.pluralsight.models.cards.facecards.FaceCard;
import com.pluralsight.models.cards.facecards.builders.CardBuilder;
import com.pluralsight.models.cards.facecards.cards.King;
import com.pluralsight.models.cards.facecards.constants.Suits;
import com.pluralsight.models.games.BlackJack;
import com.pluralsight.models.hands.BlackJackHand;
import com.pluralsight.models.players.BlackJackPlayer;
import com.pluralsight.models.players.Player;
import com.pluralsight.ui.UserOutput;

public class Samples
{
    public static void main(String[] args)
    {
        King king = new King(Suits.SPADES);

        FaceCard q = CardBuilder.QUEEN_DIAMONDS();
        FaceCard k = CardBuilder.KING_DIAMONDS();
    }

    public static void demo()
    {
        Player<BlackJackHand> player = new Player<>("Gregor", new BlackJackHand());
        player.deal(CardBuilder.QUEEN_DIAMONDS());
        player.deal(CardBuilder.TWO_CLUBS());
        player.deal(CardBuilder.EIGHT_SPADES());
        player.deal(CardBuilder.THREE_SPADES());
        player.deal(CardBuilder.ACE_HEARTS());
        player.deal(CardBuilder.ACE_SPADES());
        player.deal(CardBuilder.TWO_DIAMONDS());

        UserOutput.showHand(player);
    }



    public void run()
    {
        BlackJack game = new BlackJack();

        BlackJackPlayer gary = new BlackJackPlayer("Gary");
        BlackJackPlayer sarah = new BlackJackPlayer("Sarah");
        BlackJackPlayer steph = new BlackJackPlayer("Steph");

        game.join(gary);
        game.join(sarah);
        game.join(steph);

        game.dealPlayersIn();

        for (int i = 0; i < 5; i++)
        {
            for(Player player : game.getPlayers())
            {
                BlackJackHand hand = (BlackJackHand) player.showHand();
                if(!hand.isBust() && hand.getValue() + 6 < 21)
                {
                    game.hit(player);
                }
            }
        }

        for(Player player : game.getPlayers())
        {
            UserOutput.showHand(player);
        }

        // declares winner
        game.endGame();

        UserOutput.winner(game.getWinner());
    }
}
