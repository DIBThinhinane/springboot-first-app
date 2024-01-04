package com.example.springbootfirstapp.repository;

import com.example.springbootfirstapp.entity.Equipment;
import com.example.springbootfirstapp.entity.MeetingRoom;
import com.example.springbootfirstapp.enums.MeetingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<MeetingRoom, String> {


    @Query("SELECT m FROM MeetingRoom m WHERE (m.capacity * 0.7) <= :numberOfPersons AND m.nom NOT IN (SELECT mr.nom " +
            "FROM Reservation r " +
            "JOIN MeetingRoom mr ON r.name = mr.meetingRoom " +
            "WHERE r.date = :date " +
            "AND NOT DAYOFWEEK(r.date) IN (1, 7) " + // 1-> samedi 7-> dimanche
            "AND r.startHour >= 8 " +
            "AND r.endHour >= 20 " +
            "AND ( (r.startHour >= :startHour AND r.startHour < :endHour) " +
            "OR (r.endHour > :startHour AND r.endHour <= :endHour) " +
            "OR (r.endHour <= :startHour AND r.endHour >= :endHour)))")
    List<MeetingRoom> getAvailableMeetingRoom(Date date, Integer startHour, Integer endHour, Integer numberOfPersons, MeetingType meetingType);


}
