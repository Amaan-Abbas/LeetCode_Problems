import OuterClass.InnerNestedClass;

class OuterClass {
    static class InnerNestedClass {
        void display() {
            System.out.println("This is a static inner nested class");
        }
    }
}

class OuterClass2 {
    class NonStaticInnerNestedClass {
        void display() {
            System.out.println("This is a non static inner class!");
        }
    }
}


public class bookSysteem {
    // private String name;

    // // bookSysteem() {
    // //     this.name = "amaan";
    // // }

    // public bookSysteem setname(String name) {
    //     this.name = name;
    //     return this;
    // }

    // public static void main(String[] args) {
    //     bookSysteem obj = new bookSysteem();

    //     System.out.println(obj.setname("Amaan").toString());
    // }

    public static void main(String[] args) {
        OuterClass.InnerNestedClass obj = new OuterClass.InnerNestedClass();
        obj.display();

        OuterClass2 ob = new OuterClass2();
        OuterClass2.NonStaticInnerNestedClass ob1 = ob.new NonStaticInnerNestedClass();
        ob1.display();
    }
    
}
