package House;

public class House {
    public static final int MAX_BED_ROOMS = 10;
    public static final int MAX_REST_ROOMS = 10;
    private int indexBedRoom ;
    private int indexRestRoom;
    private Kitchen kitchen;// kitchen es un atributo "del tipo" kitchen
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private RestRoom[] restRooms = new RestRoom[MAX_REST_ROOMS]; //[] arreglo que se le genera espacio
    private BedRoom[] bedRooms = new BedRoom[MAX_BED_ROOMS];
    private Yard yard;

    public House() //inicializar siempre en el constructor
    {
        indexBedRoom = 0;
        indexRestRoom = 0;
    }
    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }
    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }
    public void setKitchen(Kitchen kitchen) { //siempre va a ser void
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }
    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }
    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public Yard getYard() {
        return yard;
    }
    public void setYard(Yard yard) {
        this.yard = yard;
    }

    //Creacion de Metodos
    //Sobre carga

    public void addRoom(BedRoom bedRoom){

        bedRooms[indexBedRoom] = bedRoom;

        indexBedRoom++;
    }

    public void addRoom(RestRoom restRoom){
        restRooms[indexRestRoom] = restRoom;

        indexRestRoom++;

    }

}
