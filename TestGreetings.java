public class TestGreetings {
    
    // main method;

    public static void main(String[] args) {
        Greetings greeterApp = new Greetings();
    
        String dateMessage = greeterApp.getCurrentDate();
        System.out.println(dateMessage);

        String myName = greeterApp.greetEnglish("Tiyarong");
        System.out.println(myName);
        

    }
}
