package nomina.app;

import dominio.*;


public class NominaApp {

    public static void main(String[] args) {

        Nomina nomina = new Nomina();

        Directo juan = new Directo("Juan", 5360000);
        Vendedor julian = new Vendedor("Julian", 2450000, 55510000);
        FreeLance johanna = new FreeLance("Johanna", 76000, 85);
        Vendedor carolina = new Vendedor("Carolina", 990000, 62487000);
        Promotor pedro = new Promotor("Pedro", 1500, 250, 48);
        Directo david = new Directo("David", 2895000);
        FreeLance gustavo = new FreeLance("Gustavo", 52500, 60);

        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(carolina);
        nomina.getEmpleados().add(pedro);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);

        nomina.calcularNomina();
        System.out.println("\n");
        nomina.listarPromotores();
        nomina.listarFreeLancers();
        nomina.listarDirectos();


    }
}
