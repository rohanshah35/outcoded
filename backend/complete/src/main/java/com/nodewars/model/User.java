package com.nodewars.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "users")
public class User {
    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Column(name = "cognito_user_id")
    private String cognitoUserId;

    @Column(name = "profile_picture")
    private String profilePicture;

    @Column(name = "stats")
    private String stats;

    @Column(name = "preferred_username")
    private String preferredUsername;

    @Column(name = "preferred_language")
    private String preferredLanguage;

    @Transient
    private boolean isVerified; 

    public User(String email, String cognitoUserId, String username, String password, String stats, String preferredUsername, String preferredLanguage) {
        this.email = email;
        this.cognitoUserId = cognitoUserId;
        this.username = username;
        this.password = password;
        this.stats = stats;
        this.preferredUsername = preferredUsername;
        this.preferredLanguage = preferredLanguage;
    }

    public User(String email, String cognitoUserId, String username, String preferredUsername, Boolean isVerified) {
        this.email = email;
        this.cognitoUserId = cognitoUserId;
        this.username = username;
        this.preferredUsername = preferredUsername;
        this.isVerified = isVerified;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getCognitoUserId() {
        return cognitoUserId;
    }

    public void setCognitoUserId(String cognitoUserId) {
        this.cognitoUserId = cognitoUserId;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getStats() {
        return stats;
    }

    public void setStats(String stats) {
        this.stats = stats;
    }

    public String getPreferredUsername() {
        return preferredUsername;
    }

    public void setPreferredUsername(String preferredUsername) {
        this.preferredUsername = preferredUsername;
    }

    public String getPreferredLanguage() {
        return preferredLanguage;
    }

    public void setPreferredLanguage(String preferredUsername) {
        this.preferredUsername = preferredLanguage;
    }

    public boolean getIsVerified() {
        return isVerified;
    }

    public void setVerified(boolean isVerified) {
        this.isVerified = isVerified;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cognitoUserId='" + cognitoUserId + '\'' +
                ", profilePicture='" + profilePicture + '\'' +
                ", stats='" + stats + '\'' +
                ", preferredUsername='" + preferredUsername + '\'' +
                ", preferredLanguage='" + preferredLanguage + '\'' +
                ", isVerified=" + isVerified +
                '}';
    }
}
