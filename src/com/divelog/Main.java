package com.divelog;

import com.divelog.model.Dive;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Dive dive = new Dive("Elphinstone Reef", new Date(1480329953000L), 40, 35);
      String site = dive.getDiveSite();
      String date = dive.getDiveDate().toString();
      int time = dive.getDiveTime();
      int depth = dive.getMaxDepth();

      System.out.printf("Your last dive was at %s, on %s, lasted for %d minutes and your max " +
          "depth" +
          " was " +
          "%d meters.%n", site, date, time, depth);
      System.out.println(dive.toString());
    }
}
