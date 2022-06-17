import static UI.UIMenu.showMenu;


public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor();
        myDoctor.name = "Alejandro Rodriguez";
        myDoctor.showName();
        myDoctor.showId();
        System.out.println();


        Doctor myDoctosAnn = new Doctor();
        myDoctor.showId();

        showMenu();
    }
}
