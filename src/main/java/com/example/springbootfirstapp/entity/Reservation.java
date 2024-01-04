package com.example.springbootfirstapp.entity;

import com.example.springbootfirstapp.enums.MeetingType;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

import static jakarta.persistence.EnumType.STRING;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Reservation {
    @Id
    private Integer id;
    private Integer startHour;
    private Integer endHour;
//    private Date reservationDate;
    @Enumerated(STRING)
    private MeetingType meetingType;
    private MeetingRoom meetingRoom;
    private List<Equipment> addedEquipmentList;

}
