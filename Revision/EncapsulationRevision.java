package Revision;

class Books{
    private int pageNumber;
    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
       if(pageNumber > 0){

           this.pageNumber = pageNumber;
       }
       else System.out.println("Negative values are not allowed");
    }
    
}

public class EncapsulationRevision {
    public static void main(String[] args) {
        Books book1 = new Books();
        book1.setPageNumber(3);
        book1.setName("Book");
        System.out.println(book1.getName());
        System.out.println(book1.getPageNumber());
    }
}
