public class MaquinaTe implements EquipoCocina {

    private boolean encendida = false;
    private int velocidad = 1;
    private String tipoDeTe;


    @Override
    public void encender() {
        encendida = true;
        System.out.println("Maquina de Te encendida, calentando agua.");

    }

    @Override
    public void apagar() {
        encendida = false;
        System.out.println("Maquina de Te apagada.");

    }

    @Override
    public void preparar() {
        if (encendida) {
            System.out.println("Preparando té con intensidad:  " +
                    velocidad + ".");
        }

    }

    @Override
    public void ajustarIntensidad() {
        if (encendida && velocidad < 8) {
            velocidad++;
            System.out.println("Velocidad de la maquina de Té: " +
                    velocidad);
        }

    }

    public void tipoDeTe(String tipoDeTe){
        if(tipoDeTe.equals("frio")){
            tipoDeTe = "frio";
            System.out.println("Tipo de Te frio.");
        }else {
            tipoDeTe = "caliente";
            System.out.println("Tipo de Te caliente");
        }



    }
}
