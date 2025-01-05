package com.XX.LLD.PRACTICE.StatePattern.DesignATM.User;

import com.XX.LLD.PRACTICE.StatePattern.DesignATM.Card;

public class User {

    Card card;
    UserBankAmount userBankAmount;

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
