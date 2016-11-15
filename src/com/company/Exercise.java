package com.company;
// information about user's exercise regiments
/**
 * Created by amalabukar on 11/14/16.
 */
public class Exercise {
   private String attendsGym;
   private  int gymVisits;
   private boolean diets;
    private boolean isJogs;


public Exercise() {
    attendsGym = "Lifetime";
}

public Exercise (String m) {
    if (isMember(m)) {
        attendsGym = m;
    }}
public String getAttendsGym() {
    return attendsGym;
}
public void setAttendsGym (String m) {
    if(isMember (m)) {
        attendsGym= m;}}

    public boolean isMember (String name) { return attendsGym.contains("") && !attendsGym.isEmpty() && attendsGym. length() <=20;
    }
public int getGymVisits() {
    return gymVisits;
}
public void setGymVisits (int v) {
    if(v>0){
        gymVisits= v;

    }
}
public boolean isJogs () {
    return isJogs;
}

public void setJogs (boolean jogs) {
    isJogs = jogs;
}
}











