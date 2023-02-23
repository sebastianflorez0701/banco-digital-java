
public class ControleBonificacion {

    private double suma;

    public void registrar(Funcionario e) {
        this.suma += e.getBonificacion();
        System.out.println("La suma en bonificaciones hasta el momento es:  " + this.suma);
    }

    public double getSuma() {
        return suma;
    }
}
