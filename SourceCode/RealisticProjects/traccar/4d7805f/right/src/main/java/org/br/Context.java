package org.br;

public class Context {
    public void Context(){

    }

    public static TripsConfig initTripsConfig() {
        return new TripsConfig(
                500,
                300 * 1000,
                300 * 1000,
                true,
                3600 * 1000,
                true);
    }

    public String getFinal(){
        return initTripsConfig().toString();
    }
}
