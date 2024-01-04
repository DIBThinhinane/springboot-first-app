package com.example.springbootfirstapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class MeetingRoom {

    @Id
    private String name;
    private Integer capacity;
    private Boolean isReserved;
    @OneToMany(mappedBy = "room")
    private List<Equipment> equipmentList;

    private Integer getMaxCapacity(Integer percentage){
        return Integer.valueOf(this.getCapacity()*percentage/100);
    }
}
