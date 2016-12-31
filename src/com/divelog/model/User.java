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

  public void setFirstName( String firstName ) {
    mFirstName = firstName;
  }

  public void setLastName( String lastName ) {
    mLastName = lastName;
  }

  public void setEmail( String email ) {
    mEmail = email;
  }

  public void setNumberOfDives( int numberOfDives ) {
    mNumberOfDives = numberOfDives;
  }

  public void setDiveSitesVisited( int diveSitesVisited ) {
    mDiveSitesVisited = diveSitesVisited;
  }

  public String getUserName() {
    return mUserName;
  }

  public String getFirstName() {
    return mFirstName;
  }

  public String getLastName() {
    return mLastName;
  }

  public String getEmail() {
    return mEmail;
  }

  public LogBook getLogBook() {
    return mLogBook;
  }

  public int getNumberOfDives() {
    return mNumberOfDives;
  }

  public int getDiveSitesVisited() {
    return mDiveSitesVisited;
  }
}
