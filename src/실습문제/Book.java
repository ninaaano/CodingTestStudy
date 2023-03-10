package 실습문제;

public class Book {
    private String title;
    private int price;

    public Book() {
    }

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle() {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice() {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    class BookMgr {
        private Book[] booklist;

        public BookMgr() {
        }

        public BookMgr(Book[] booklist) {
            this.booklist = booklist;
        }

        public void printBookList() {
            for (int i = 0; i < booklist.length; i++) {
                System.out.println(booklist[i].getTitle());
            }
        }

        public void printTotalPrice() {
            int TotalPrice = 0;
            for (int i = 0; i < booklist.length; i++) {
                TotalPrice += booklist[i].getPrice();
            }
            System.out.println("전체 책 가격의 합 : " + TotalPrice);
        }
    }
}

/*
    public static void main(String[] args) {
        Book[] booklist = new Book[5];

        Book book1 = new Book("Java Program", 25000);
        Book book2 = new Book("JSP Program", 15000);
        Book book3 = new Book("SQL", 30000);
        Book book4 = new Book("JDBC", 28000);
        Book book5 = new Book();
        book5.setTitle("EJB");
        book5.setPrice(34000);

        booklist[0] = book1;
        booklist[1] = book2;
        booklist[2] = book3;
        booklist[3] = book4;
        booklist[4] = book5;

        Bookmgr mgr = new Bookmgr(booklist);

        System.out.println("===책 목록===");
        mgr.printBooklist();
        System.out.println("");

        System.out.println("===책 가격의 총합===");
        mgr.printTotalPrice();
    }
}

*/