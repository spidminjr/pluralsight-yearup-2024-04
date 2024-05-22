package com.pluralsight.models.cards.facecards.builders;

import com.pluralsight.models.cards.facecards.FaceCardDeck;

public class DeckBuilder
{
    // private so no-one can create an instance
    private DeckBuilder(){}

    public static FaceCardDeck buildDeck()
    {
        return new FaceCardDeck(
                SuitBuilder.buildSpades(),
                SuitBuilder.buildHearts(),
                SuitBuilder.buildClubs(),
                SuitBuilder.buildDiamonds()
            );
    }
}
