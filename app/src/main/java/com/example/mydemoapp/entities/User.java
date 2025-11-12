package com.example.mydemoapp.entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Objects;

/**
 * POJO User
 * @author Nat Chelonis
 * @since 12 - Nov - 2025
 */
@Entity(tableName = "user")
public class User {

    @PrimaryKey(autoGenerate = true)
    private int userID;
    private String username;
    private String password;
    private boolean isAdmin;
    private boolean isPremium;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        isAdmin = false;
        isPremium = false;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return userID == user.userID && isAdmin == user.isAdmin && isPremium == user.isPremium && Objects.equals(username, user.username) && Objects.equals(password, user.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userID, username, password, isAdmin, isPremium);
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }
}
