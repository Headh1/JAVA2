package class1.ex1;

import class1.ex1.MovieReview;

public class MovieReviewMain {
    public static void main(String[] args) {
        MovieReview review1 = new MovieReview();
        review1.title = "인턴";
        review1.review = "재미있음";

        MovieReview review2 = new MovieReview();
        review2.title = "미드나잇인파리";
        review2.review = "나도경험해보고싶다";

        MovieReview[] reviews = {review1 , review2};

        for (MovieReview r : reviews) {
            System.out.println("제목:"+r.title + " 내용:"+r.review);
        }

        }
    }
