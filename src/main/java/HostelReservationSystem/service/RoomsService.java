package HostelReservationSystem.service;

import HostelReservationSystem.entity.Rooms;
import HostelReservationSystem.repository.RoomsRepository;
import jdk.dynalink.linker.LinkerServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author malisahin
 * @since 12/1/2023
 */
@Service
public class RoomsService {
    private final RoomsRepository roomsRepository;
    @Autowired
    public RoomsService(RoomsRepository roomsRepository){
        this.roomsRepository=roomsRepository;
    }
    public List<Rooms> getAllRooms(){
        return roomsRepository.findAll();
    }
}
