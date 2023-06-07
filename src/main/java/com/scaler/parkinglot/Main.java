package com.scaler.parkinglot;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// Issues with generateTicket method :

// 1. If we add more params in the input, then the current users will start failing.
// 2. Models are the internal details of my system, and we might not want to expose them to the external world.
// 3. Client will have to make lot of GET calls to create the vehicle and other objects.

// DTO -> Data Transfer Objects.
// request -> RequestDTO
// response -> responseDTO