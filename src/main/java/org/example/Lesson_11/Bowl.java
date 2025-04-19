package org.example.Lesson_11;

public class Bowl {
    protected final  int bowlSize;
    protected int fullBowlThisMoment;


    public Bowl(int bowlSize) {
        this.bowlSize = bowlSize;
    }

    public boolean getFeed(int oneCatEats) {
        if (this.fullBowlThisMoment >= oneCatEats) {
            this.fullBowlThisMoment -= oneCatEats;
            return true;
        }
        return false;
    }

    public void fillBowl(int fullBowlThisMoment){
        if (bowlSize - this.fullBowlThisMoment >= fullBowlThisMoment){
            this.fullBowlThisMoment += fullBowlThisMoment;
        } else {
            this.fullBowlThisMoment = bowlSize;
        }
    }

    public void fillBowl(){
        this.fullBowlThisMoment = bowlSize;
    }
}
