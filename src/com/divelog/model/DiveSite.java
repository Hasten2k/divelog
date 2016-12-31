package com.divelog.model;

public class DiveSite {
  private String mName;
  private String mCountry;
  private Double mLatitude;
  private Double mLongitude;

  public DiveSite( String name, String country ) {
    mName = name;
    mCountry = country;
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
