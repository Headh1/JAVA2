package extends1.ex;

public class ShopMain {
    public static void main(String[] args) {
        Book book = new Book("java" , 10000 , "han","12345");
        Album album = new Album("album1",15000,"kim");
        Movie movie = new Movie("movie1",18000,"dire1","actor1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 합계 : "+ sum);
    }
}
