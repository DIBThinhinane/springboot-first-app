package com.example.springbootfirstapp.service;

import com.example.springbootfirstapp.dto.MeetingRoomDto;
import com.example.springbootfirstapp.entity.Equipment;
import com.example.springbootfirstapp.entity.MeetingRoom;
import com.example.springbootfirstapp.repository.ReservationRepository;

import org.springframework.stereotype.Service;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }


    private MeetingRoomDto mapToMeetingRoomDto(MeetingRoom meetingRoom) {
        return MeetingRoomDto.builder()
                .roomName(meetingRoom.getName())
                .capacity(meetingRoom.getCapacity())
                .equipmentList(meetingRoom.getEquipmentList())
                .build();
    }



}
