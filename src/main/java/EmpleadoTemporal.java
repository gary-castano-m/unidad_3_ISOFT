public class EmpleadoTemporal extends Empleado {

    private String fechaFinContrato;

    public EmpleadoTemporal(String nombre,
                            String documento,
                            double salarioBase,
                            int aniosEmpresa,
                            String fechaFinContrato) {

        super(nombre, documento, salarioBase, aniosEmpresa);

        this.fechaFinContrato = fechaFinContrato;
    }

    @Override
    public double calcularSalarioBruto() {

        return salarioBase;
    }

    @Override
    public double calcularBeneficios() {

        return 0;
    }
}
