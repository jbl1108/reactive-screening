package com.beumer;

import io.smallrye.mutiny.Uni;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.Duration;

@Path("/hello")
public class GreetingResource {

  private final ScreeningDevice screeningDevice;

  public GreetingResource() {
    screeningDevice = new ScreeningDevice();
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Uni<String> hello() {
    return Uni.createFrom().item("Hello from RESTEasy Reactive");
  }

  @GET
  @Produces(MediaType.TEXT_PLAIN)
  public Uni<String> screenBag() {
    return screeningDevice.screenBag("0123456789").onItem().delayIt().by(Duration.ofSeconds(1)).map(bag -> bag.screeningResult);

  }
}