package com.divelog;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
      Dive dive = new Dive("Elphinstone Reef", new Date(20161128), 40, 35);
      String site = dive.getDiveSite();
      int time = dive.getDiveTime();
      int depth = dive.getMaxDepth();

      System.out.printf("Your last dive was at %s, lasted for %d minutes and your max depth was " +
          "%d meters.", site, time, depth);
    }
}
