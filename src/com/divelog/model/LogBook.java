package com.divelog.model;

import java.util.ArrayList;

public class LogBook {
  private ArrayList<Dive> mLoggedDives;

  public LogBook() {
    mLoggedDives = new ArrayList<>();
  }

  @Override
  public String toString() {
    return "Your LogBook contains " + getNumberOfDives() + " number of dives.";
  }

  public void addDive( Dive dive ) {
    mLoggedDives.add(dive);
    int diveNumber = mLoggedDives.size();
    dive.setDiveNumber(diveNumber);
    System.out.printf("Dive was added! You have made %d dives. Good job!%n", diveNumber);
  }

  public int getNumberOfDives() {
    return mLoggedDives.size();
  }
}
