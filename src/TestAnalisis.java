

public class TestAnalisis {
    public static void main(String[] args) {
        System.out.println("Configuracion 1 cafetera+licudora");
        PreparadorBebidas preparador1=new PreparadorBebidas(new Cafetera(), new Licuadora());
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();
        System.out.println("------------------------------------------------");
        System.out.println("Configuracion 2 Maquina te+Exprimidor");
        PreparadorBebidas preparador2=new PreparadorBebidas(new MaquinaTe(),new Exprimidor());
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();
        System.out.println("------------------------------------------------");
        System.out.println("configuracion 3 cafetera+cafetera");
        PreparadorBebidas preparador3 =new PreparadorBebidas(new Cafetera(),new Cafetera());
        preparador3.prepararDesayuno();
        preparador3.apagarTodo();
    }


}
