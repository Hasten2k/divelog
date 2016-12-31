package com.divelog.model;

public class User {
  private String mUserName;
  private String mFirstName;
  private String mLastName;
  private String mEmail;
  private LogBook mLogBook;
  private int mNumberOfDives;
  private int mDiveSitesVisited;

  public User( String userName, String firstName, String lastName, String email) {
    mUserName = userName;
    mFirstName = firstName;
    mLastName = lastName;
    mEmail = email;
    mLogBook = new LogBook();
  }
}
