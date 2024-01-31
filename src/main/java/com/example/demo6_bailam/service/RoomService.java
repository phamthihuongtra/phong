package com.example.demo6_bailam.service;

import com.example.demo6_bailam.model.Room;
import com.example.demo6_bailam.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {
    @Autowired
    private RoomRepository roomRepository;

    public List<Room> getAllListRoom() {
        return (List<Room>) roomRepository.findAll();
    }
    public void createRoom(Room phongRoom) {
        roomRepository.save(phongRoom);
    }
    public Room findById(int id) {
        return roomRepository.findById(id).get();
    }
    public void updateRoom(Room phongRoom) {
        Room phongRoom1 = findById(phongRoom.getId());
        if (phongRoom1 != null) {
            phongRoom1.setDetail(phongRoom.getDetail());
            phongRoom1.setPrice(phongRoom.getPrice());
            phongRoom1.setName(phongRoom.getName());
            phongRoom1.setStatus(phongRoom.getStatus());
            phongRoom1.setNumberBed(phongRoom.getNumberBed());
            phongRoom1.setNumberOfPerson(phongRoom.getNumberOfPerson());

            roomRepository.save(phongRoom1);
        }
    }
    public void deleteById(int id) {
        roomRepository.deleteById(id);
    }
    public List<Room> searchWithKeyword(String keyword) {
        return roomRepository.findAllByDetailContaining(keyword);
    }
}
