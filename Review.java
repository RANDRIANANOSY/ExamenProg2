package ExamenProg2;

import java.time.LocalDate;

public class Review {
    private String userName;
    private String email;
    private int score;
    private String comment;
    private LocalDate date;

    public Review(String userName, String email, int score, String comment, LocalDate date) {
        this.userName = userName;
        this.email = email;
        this.score = score;
        this.comment = comment;
        this.date = date;
    }
}
