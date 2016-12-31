package com.divelog.model;

import java.util.ArrayList;

public class LogBook {
  private ArrayList<Dive> mLoggedDives;

  public LogBook() {
    mLoggedDives = new ArrayList<>();
  }

  public void addDive(Dive dive) {
    mLoggedDives.add(dive);
    int diveNumber = mLoggedDives.size();
    dive.setDiveNumber(diveNumber);
    System.out.printf("Dive was added! You have made %d dives. Good job!", diveNumber);
  }

  public int getNumberOfDives() {
    return mLoggedDives.size();
  }
}
