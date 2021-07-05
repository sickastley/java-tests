class abc {

    void lulu() {
        System.out.println("lulu fuction");
    }

    void polo() {
        System.out.println("polo function");
    }

    void main() {
        System.out.println("Nakli main function");
    }

    public static void main(String baburaw[]) {

        abc ob = new abc();

        ob.lulu();
        ob.polo();
        ob.main();

    /* Wrong way to make a new object
        abc.lulu();
        abc.polo();
        abc.main();

        */
    }
}