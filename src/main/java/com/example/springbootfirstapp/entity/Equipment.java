package com.example.springbootfirstapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Equipment {

    @Id
    private String name;
    @ManyToOne
    @JoinColumn(name = "room_id")
    private MeetingRoom meetingRoom;
}
