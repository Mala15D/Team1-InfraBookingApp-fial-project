package com.infrabookingapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infrabookingapp.entity.Room;

@Repository
public interface RoomDAO extends JpaRepository<Room, String> {

}
