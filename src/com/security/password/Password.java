package com.security.password;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Password {
    private String encryptedPassword;

    // Constructor that encrypts the input password
    public Password(String plainTextPassword) {
        if (isValid(plainTextPassword)) {
            this.encryptedPassword = encrypt(plainTextPassword);
        } else {
            throw new IllegalArgumentException("Password does not meet security requirements.");
        }
    }

    // Getter for the encrypted password
    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    // Encryption method (hashing using SHA-256)
    private String encrypt(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(plainText.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error in encryption", e);
        }
    }

    // Validate password (example: at least 8 characters)
    public boolean isValid(String password) {
        return password.length() >= 8; // Add more criteria as needed
    }

    // Hash function for additional use (e.g., storing password securely)
    public static String hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(input.getBytes());
            return Base64.getEncoder().encodeToString(hash);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error in hashing", e);
        }
    }
}
