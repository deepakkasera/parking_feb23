package com.scaler.parkinglot.controllers;

import com.scaler.parkinglot.dto.GenerateTicketRequestDto;
import com.scaler.parkinglot.dto.GenerateTicketResponseDto;
import com.scaler.parkinglot.models.Gate;
import com.scaler.parkinglot.models.Operator;
import com.scaler.parkinglot.models.Ticket;
import com.scaler.parkinglot.models.Vehicle;

public class TicketController {

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) {
        return null;
    }
}

// Issues with generateTicket method :

// 1. If we add more params in the input, then the current users will start failing.
// 2. Models are the internal details of my system, and we might not want to expose them to the external world.
// 3. Client will have to make lot of GET calls to create the vehicle and other objects.

// DTO -> Data Transfer Objects.
// request -> RequestDTO
// response -> responseDTO


