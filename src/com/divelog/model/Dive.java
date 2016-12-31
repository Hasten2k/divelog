package com.divelog.model;

import java.util.Date;

public class Dive {
  private String  mDiveSite;
  private Date    mDiveDate;
  private int     mDiveTime;
  private int     mMaxDepth;
  private int     mBottomTemp;
  private int     mVisibility;
  private String  mWaterType;
  private int     mWeightsUsed;
  private String  mGasType;
  private int     mPressureIn;
  private int     mPressureOut;
  private String  mComments;

  public Dive( String diveSite, Date diveDate, int diveTime, int maxDepth ) {
    mDiveSite = diveSite;
    mDiveDate = diveDate;
    mDiveTime = diveTime;
    mMaxDepth = maxDepth;
  }

  @Override
  public String toString() {
    return "Dive{" +
        "mDiveSite='" + mDiveSite + '\'' +
        ", mDiveDate=" + mDiveDate +
        ", mDiveTime=" + mDiveTime +
        ", mMaxDepth=" + mMaxDepth +
        '}';
  }

  public String getDiveSite() {
    return mDiveSite;
  }

  public void setDiveSite( String diveSite ) {
    mDiveSite = diveSite;
  }

  public Date getDiveDate() {
    return mDiveDate;
  }

  public void setDiveDate( Date diveDate ) {
    mDiveDate = diveDate;
  }

  public Integer getDiveTime() {
    return mDiveTime;
  }

  public void setDiveTime( Integer diveTime ) {
    mDiveTime = diveTime;
  }

  public int getMaxDepth() {
    return mMaxDepth;
  }

  public void setMaxDepth( int maxDepth ) {
    mMaxDepth = maxDepth;
  }

  public int getBottomTemp() {
    return mBottomTemp;
  }

  public void setBottomTemp( int bottomTemp ) {
    mBottomTemp = bottomTemp;
  }

  public int getVisibility() {
    return mVisibility;
  }

  public void setVisibility( int visibility ) {
    mVisibility = visibility;
  }

  public String getWaterType() {
    return mWaterType;
  }

  public void setWaterType( String waterType ) {
    mWaterType = waterType;
  }

  public int getWeightsUsed() {
    return mWeightsUsed;
  }

  public void setWeightsUsed( int weightsUsed ) {
    mWeightsUsed = weightsUsed;
  }

  public String getGasType() {
    return mGasType;
  }

  public void setGasType( String gasType ) {
    mGasType = gasType;
  }

  public int getPressureIn() {
    return mPressureIn;
  }

  public void setPressureIn( int pressureIn ) {
    mPressureIn = pressureIn;
  }

  public int getPressureOut() {
    return mPressureOut;
  }

  public void setPressureOut( int pressureOut ) {
    mPressureOut = pressureOut;
  }

  public String getComments() {
    return mComments;
  }

  public void setComments( String comments ) {
    mComments = comments;
  }
}
