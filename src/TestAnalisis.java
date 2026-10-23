

public class TestAnalisis {
    public static void main(String[] args) {
        EquipoCocina cafetera = new Cafetera();
        EquipoCocina licuadora = new Licuadora();

        PreparadorBebidas preparador1 = new PreparadorBebidas(cafetera,licuadora);
        preparador1.prepararDesayuno();
        preparador1.apagarTodo();


    }


}
