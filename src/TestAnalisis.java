package src;

public class TestAnalisis {
    public static void main(String[] args) {
        PreparadorBebidas preparador1 = new PreparadorBebidas();
        preparador1.prepararDesayuno();

        preparador1.apagarTodo();

        System.out.println("El problema identificado: El constructor de la clase PreparadorBebidas instanica 2 objetos para poder ejecutar los metodos.\n " +
                "Esto hace que la clase sea rígida y limitada a los objetos que fueron instanciados en el constructor");
    }


}
