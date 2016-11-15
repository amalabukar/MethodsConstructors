package com.company;
//stores information about Spotify user credentials
/**
 * Created by amalabukar on 11/14/16.
 */
public class Spotify {
    private String username;
    private int age;
    private int yearActivated;
    private boolean isPremiumUser;

    public Spotify() {
        username = "Amal";

    }

    public Spotify(String u) {
        if (isAUser(u)) {
            username = u;
        }
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String u) {
        if (isAUser(u)) {
            username = u;
        }
    }

    public static boolean isAUser(String name) {
        return name.contains("") && !name.isEmpty()
                && name.length() <= 20;

    }

    public int getAge () {
        return age;
    }
    public void setAge (int a) {
        if (a<17) {
            age = a;}}
    public boolean isPremiumUser (){
     return isPremiumUser;
    }
public void setPremiumUser (boolean premiumUser) {
    isPremiumUser = premiumUser;
}

}
