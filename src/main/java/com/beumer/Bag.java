package com.beumer;

import java.util.Objects;

public class Bag {

  String iataCode;
  String screeningResult;

  public Bag(String iataCode, String screeningResult){
    this.iataCode = iataCode;
    this.screeningResult = screeningResult;
  }


  public String getIataCode() {
    return iataCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Bag bag = (Bag) o;
    return Objects.equals(iataCode, bag.iataCode) && Objects.equals(screeningResult, bag.screeningResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iataCode, screeningResult);
  }
}
