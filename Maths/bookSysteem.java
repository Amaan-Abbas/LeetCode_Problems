public class bookSysteem {
    private String name;

    // bookSysteem() {
    //     this.name = "amaan";
    // }

    public bookSysteem setname(String name) {
        this.name = name;
        return this;
    }

    public static void main(String[] args) {
        bookSysteem obj = new bookSysteem();

        System.out.println(obj.setname("Amaan").toString());
    }
}
