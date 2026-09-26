public class Member {
    private String name;

    public Member(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Delegates borrowing responsibility to the Book object and checks result
    public void borrowBook(Book book) {
        if (book.borrowBook()) {
            System.out.println(name + " successfully borrowed: " + book.getTitle());
        } else {
            System.out.println("Transaction Failed: '" + book.getTitle() + "' is currently checked out.");
        }
    }
}
