import java.util.ArrayList;

import java.util.List;

public class TestPreparadorBebidasV2 {
    public static void main(String[] args) {

        System.out.println("\n~~~~~~~~~~~~~~~~~~Panta de Juliana Bernal~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Configuracion 1 cafetera con licuadora");
        List<EquipoCocina> equipos1 = new ArrayList<>();
        equipos1.add(new Cafetera());
        equipos1.add(new Licuadora());

        PreparadorBebidasV2 preparador = new PreparadorBebidasV2(equipos1);

        preparador.prepararDesayuno();
        preparador.apagarTodo();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~Planta de Pedro Saravia~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Configuracion 2 cafetera con licudora");
        List<EquipoCocina> equipos2 = new ArrayList<>();
        equipos2.add(new MaquinaTe());
        equipos2.add(new Exprimidor());

        PreparadorBebidasV2 preparador2 = new PreparadorBebidasV2(equipos2);
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();

        System.out.println("\n~~~~~~~~~~~~~~~~~~~Darwin Noriega~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Configuracion 3 cafetera con licudora");
        List<EquipoCocina> equipos3 = new ArrayList<>();
        equipos2.add(new Licuadora());
        equipos2.add(new Exprimidor());

        PreparadorBebidasV2 preparador3 = new PreparadorBebidasV2(equipos3);
        preparador2.prepararDesayuno();
        preparador2.apagarTodo();
    }





}
