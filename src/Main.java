public class Main {
    public static void main(String[] args) {

        Planeta p1 = new Planeta(
                "TIERRA",
                1,
                5.9736E24,
                1.08321E12,
                12742,
                150000000,
                true,
                1,
                1.0f
        );

        Planeta p2 = new Planeta(
                "JÚPITER",
                1,
                1.899E27,
                1.4313E15,
                139820,
                750000000,
                true,
                12,
                0.8F
        );

        p1.mostrarPlaneta();
        System.out.println();
        p2.mostrarPlaneta();

    }
}
