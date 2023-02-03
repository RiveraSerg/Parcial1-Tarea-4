package House;

import House.Rooms.*;

public class House {
    public static final int MAX_REST_ROOMS = 10;
    public static final int MAX_BED_ROOMS = 10;
    int indexBedRooms = 0;
    int indexRestRooms = 0;
    Kitchen kitchen;
    DiningRoom diningRoom;
    LivingRoom livingRoom;
    RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS];
    BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    Yard yard;

    public void addRoom(BedRoom bedRooms) {
        if(indexBedRooms<MAX_BED_ROOMS){
            bedRooms = new BedRoom();
            indexBedRooms++;
        }
    }
    public void addRoom(RestRoom restRooms) {
        if(indexRestRooms<MAX_REST_ROOMS){
            restRooms = new RestRoom();
            indexRestRooms++;
        }
    }
}
