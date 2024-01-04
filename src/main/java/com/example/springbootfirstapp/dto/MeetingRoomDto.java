package com.example.springbootfirstapp.dto;


import com.example.springbootfirstapp.entity.Equipment;
import com.example.springbootfirstapp.enums.RoomState;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MeetingRoomDto {

    private String roomName;
    private Integer capacity;
    private RoomState state;
    private List<Equipment> equipmentList;
}
