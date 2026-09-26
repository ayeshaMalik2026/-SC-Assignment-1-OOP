public class Task4Test {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", "Robert C. Martin");
        Member member1 = new Member("Alice");
        Member member2 = new Member("Bob");

        // First attempt - succeeds
        member1.borrowBook(book1);

        // Second attempt on same book - fails gracefully
        member2.borrowBook(book1);
    }
}