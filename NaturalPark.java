package ExamenProg2;


public class NaturalPark extends Location implements Reviewable {
    private List<Hotel> nearbyHotels;
    private List<Review> reviews;

    public NaturalPark(String name, double latitude, double longitude, String description) {
        super(name, latitude, longitude, description);
        this.nearbyHotels = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

    public void addHotel(Hotel hotel) {
        nearbyHotels.add(hotel);
    }

    public List<Hotel> getNearbyHotels() {
        return nearbyHotels;
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
