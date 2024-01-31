package com.example.demo6_bailam.controller;

import com.example.demo6_bailam.model.Room;
import com.example.demo6_bailam.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;

    @GetMapping()
    public String showAllRooms (Model model){
        List<Room> rooms = roomService.getAllListRoom();
        model.addAttribute("rooms", rooms);
        return "list";
    }
    @GetMapping("/add-room")
    public String showAddRoomForm(Model model) {
        Room phongRoom = new Room();
        model.addAttribute("room", phongRoom);

        return "create";
    }
    @GetMapping("/edit/{id}")
    public String showEditRoomForm(@PathVariable int id, Model model) {
        model.addAttribute("room",roomService.findById(id));
        return "edit";
    }
    @GetMapping("/seach")
    public String showEditRoomFrom(@RequestParam("keyword") String keyword, Model model) {
        model.addAttribute("rooms", roomService.searchWithKeyword(keyword));
        return "list";
    }
    @PostMapping("/create")
    public String creatRoom(@ModelAttribute Room phongRoom) {
        roomService.createRoom(phongRoom);

        return "redirect:/rooms";
    }
    @PostMapping("/update")
    public String updateRoom(@ModelAttribute Room phongRoom) {
        roomService.updateRoom(phongRoom);

        return "redirect:/rooms";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        roomService.deleteById(id);
        return "redirect:/rooms";
    }

}
