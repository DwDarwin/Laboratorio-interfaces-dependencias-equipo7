public class Exprimidor implements EquipoCocina{

    private boolean encendida = false;
    private int velocidad = 1;

    @Override
    public void encender() {
        encendida = true;
        System.out.println("Exprimidor encendido.");
    }
    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Exprimidor apagado.");
    }
    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Exprimiendo frutas a velocidad " +
                    velocidad + ".");
        }
    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && velocidad < 5) {
            velocidad++;
            System.out.println("Velocidad del exprimidor: " +
                    velocidad);
        }
    }
}
