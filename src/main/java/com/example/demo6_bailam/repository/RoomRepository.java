package com.example.demo6_bailam.repository;

import com.example.demo6_bailam.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
public List<Room> findAllByDetailContaining(String keyword);
}
