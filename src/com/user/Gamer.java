package com.user;

import com.cards.Card;
import com.security.password.Password;
import com.security.password.recovery.PasswordRecovery;
import com.user.email.Email;

import java.util.ArrayList;

public class Gamer {
    private long ID;
    private String username;
    private Password password;
    private String nickname;
    private Email email;
    private PasswordRecovery recoveryQuestion;
    private long level;
    private long HP;
    private long XP;
    private long coinAmount;
    private ArrayList<Card> cards;




}
