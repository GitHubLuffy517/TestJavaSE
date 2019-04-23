package com.hotel;

public class Hotel {
    private Room rooms[][]=new Room[5][10];
    public Room[][] getRooms() {
        initRoom(rooms);
        return rooms;
    }
    public void initRoom(Room rooms[][]) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || i == 1) {
                    Room room = new Room((i + 1) * 100 + (j + 1),"单人间",false);
                    rooms[i][j] =room;
                } else if (i == 2 || i == 3) {
                    Room room = new Room((i + 1) * 100 + (j + 1),"双人间",false);
                    rooms[i][j] = room;
                } else {
                    Room room = new Room((i + 1) * 100 + (j + 1),"豪华间",false);
                    rooms[i][j] = room;
                }
            }
        }
    }


}
