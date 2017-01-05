package com.divelog.model;

public class DiveSite {
  private String mName;
  private String mCountry;
  private Double mLatitude;
  private Double mLongitude;
  private int mTotalDivesAtSite;

  // TODO: Add dive transport options
  // Off Shore dive
  // Shore Dive
  private String mDiveTransport;
  // TODO: Add options for dive type
    // Open Water
    // Cave
    // Wreck
    // Wall
    // Other
  private String mDiveType;

  // TODO: Add options for salinity
    // Fresh water
    // Brackish water
    // Salt Water
  private String mWaterSalinity;

  private String mCoverPhoto;
  private String mComments;

  public DiveSite( String name, String country ) {
    mName = name;
    mCountry = country;
  }

  @Override
  public String toString() {
    return "DiveSite{" +
        "Name: " + mName +
        ", Country: " + mCountry +
        '}';
  }

  public String getName() {
    return mName;
  }

  public void setName( String name ) {
    mName = name;
  }

  public String getCountry() {
    return mCountry;
  }

  public void setCountry( String country ) {
    mCountry = country;
  }

  public Double getLatitude() {
    return mLatitude;
  }

  public void setLatitude( Double latitude ) {
    mLatitude = latitude;
  }

  public Double getLongitude() {
    return mLongitude;
  }

  public void setLongitude( Double longitude ) {
    mLongitude = longitude;
  }
}
