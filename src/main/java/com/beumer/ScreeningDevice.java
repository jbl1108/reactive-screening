package com.beumer;

import io.smallrye.mutiny.Uni;

public class ScreeningDevice {

  Uni<Bag> screenBag(String iataCode){
    return Uni.createFrom().item(new Bag(iataCode,"CLEAR"));
  }


}
