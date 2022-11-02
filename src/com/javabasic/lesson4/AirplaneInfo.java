package com.javabasic.lesson4;

public class AirplaneInfo {

    public static void main(String[] args) {
        System.out.println(printAirplaneInfo(
                "Jet",
                "F-22 Raptor"
        ));

        System.out.println(printAirplaneInfo(
                "Airliner",
                "Airbus 737",
                120
        ));

        System.out.println(printAirplaneInfo(
                "Airliner",
                "Boeing 777",
                180,
                28
        ));
    }

    public static String printAirplaneInfo(
            String airplaneName,
            String airplaneType
    ){
        return String.format(
                "Plane name: %s, Plane type: %s",
                airplaneName, airplaneType
        );

    }

    public static String printAirplaneInfo(
            String airplaneName,
            String airplaneType,
            int airplaneEconomySeats
    ){
        return String.format(
                "Plane name: %s, Plane type: %s, Economy seats is: %s",
                airplaneName, airplaneType, airplaneEconomySeats
        );

    }

    public static String printAirplaneInfo(
            String airplaneName,
            String airplaneType,
            int airplaneEconomySeats,
            int airplaneBusinessSeats
    ){
        return String.format(
                "Plane name: %s, Plane type: %s, Economy seats is: %s, Business seats is: %s",
                airplaneName, airplaneType, airplaneEconomySeats, airplaneBusinessSeats
        );

    }
}
