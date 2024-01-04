package com.example.springbootfirstapp.dto;


import com.example.springbootfirstapp.entity.Equipment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchReservationDto {

    private String meetingRoomName;
    private Integer startHour;
    private Integer endHour;
    private Date date;
    private Integer capacity;
    private List<Equipment> equipmentList;
}
