package com.divelog.model;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
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

  public void exportLogBookTo(String fileName) {
    try (
        FileOutputStream fos = new FileOutputStream(fileName);
        PrintWriter writer = new PrintWriter(fos)
    ) {
      for ( Dive dive : mLoggedDives ) {
        // print out all dive data to a file.
        writer.printf("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s, %s%n",
            dive.getDiveNumber(),
            dive.getDiveDate(),
            dive.getDiveSite(),
            dive.getDiveTime(),
            dive.getMaxDepth(),
            dive.getBottomTemp(),
            dive.getVisibility(),
            dive.getWaterType(),
            dive.getWeightsUsed(),
            dive.getGasType(),
            dive.getPressureIn(),
            dive.getPressureOut(),
            dive.getComments());
      }

    } catch ( IOException ioe ) {
      System.out.printf("Problem saving %s.%n", fileName);
      ioe.printStackTrace();
    }
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
