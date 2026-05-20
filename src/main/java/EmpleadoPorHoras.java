public class EmpleadoPorHoras extends Empleado {

    private int horasTrabajadas;
    private double tarifaHora;
    private boolean aceptaFondoAhorro;

    public EmpleadoPorHoras(String nombre,
                            String documento,
                            double salarioBase,
                            int aniosEmpresa,
                            int horasTrabajadas,
                            double tarifaHora,
                            boolean aceptaFondoAhorro) {

        super(nombre, documento, salarioBase, aniosEmpresa);

        if(horasTrabajadas < 0){
            throw new IllegalArgumentException(
                    "Las horas trabajadas no pueden ser negativas");
        }

        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.aceptaFondoAhorro = aceptaFondoAhorro;
    }

    @Override
    public double calcularSalarioBruto() {

        double salario;

        if(horasTrabajadas <= 40){

            salario = horasTrabajadas * tarifaHora;

        } else {

            int horasNormales = 40;
            int horasExtras = horasTrabajadas - 40;

            salario =
                    (horasNormales * tarifaHora)
                            +
                            (horasExtras * tarifaHora * 1.5);
        }

        return salario;
    }

    @Override
    public double calcularBeneficios() {

        double beneficio = 0;

        if(aniosEmpresa > 1 && aceptaFondoAhorro){

            beneficio = calcularSalarioBruto() * 0.02;
        }

        return beneficio;
    }
}