package ExamenProg2;
public class Hotel extends Location implements Reviewable {
    private String contact;
    private List<Review> reviews;
    private List<Room> rooms;

    public Hotel(String name, double latitude, double longitude, String description, String contact) {
        super(name, latitude, longitude, description);
        this.contact = contact;
        this.reviews = new ArrayList<>();
        this.rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public List<Room> getRooms() {
        return rooms;
    }

    @Override
    public void addReview(Review review) {
        reviews.add(review);
    }

    @Override
    public List<Review> getAllReviews() {
        return reviews;
    }
}
