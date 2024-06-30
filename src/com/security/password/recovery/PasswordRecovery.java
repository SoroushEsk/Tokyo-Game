package com.security.password.recovery;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class PasswordRecovery {
    private Question question;
    private String answer;

}
