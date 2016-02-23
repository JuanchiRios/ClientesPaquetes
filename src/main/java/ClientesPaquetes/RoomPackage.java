package ClientesPaquetes;

public class RoomPackage implements PackageType {
	private int roomsQuantity;
	private double roomPrice;
	
	public RoomPackage(int aRoomsQuantity,double aRoomPrice) {
		roomsQuantity = aRoomsQuantity;
		roomPrice = aRoomPrice;
	}
	
	public double getBasePrice(Client aClient){
		return roomPrice * roomsQuantity;
	}

}
