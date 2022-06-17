public class Doctor {
    static int id = 0;       // Autoincrementado
    String name;
    String speciality;

    Doctor() {
        System.out.println("Construyendo un objeto Doctor");
        id++;
    }

    Doctor(String name) {
        System.out.println("nombre asignado es ".concat(name));
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public  void showId(){
        System.out.println("ID Doctor: ".concat(Integer.toString(id)));
    }

}
