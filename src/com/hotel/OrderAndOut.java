package com.hotel;

public class OrderAndOut {
    Hotel hotel = new Hotel();
    Room rooms[][] = hotel.getRooms();

    public static void main(String[] args) {
        OrderAndOut orderAndOut = new OrderAndOut();
        orderAndOut.getAll();
        orderAndOut.OrderAndOutRoom(101, 0);
        orderAndOut.getAll();
        orderAndOut.OrderAndOutRoom(101, 1);
        orderAndOut.getAll();
    }

    public void getAll() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("第" + (i + 1) + "层：");
            System.out.println("---------------------");
            for (int j = 0; j < rooms[0].length; j++) {
                System.out.println(rooms[i][j].getId() + " " + rooms[i][j].getType() + " " + rooms[i][j].getUse());
            }
            System.out.println("---------------------");
        }
    }

    public void OrderAndOutRoom(int id, int flag) {
        int j = id % 100;
        int i = id / 100;
        if (flag == 0) {
            rooms[i-1][j-1].setUse(true);
            return;
        } else {
            rooms[i-1][j-1].setUse(false);
            return;

        }
    }

}
