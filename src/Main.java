public class Main {
    public static void main(String[] args) {
    Empresa gordosOtakus = new Empresa();
    gordosOtakus.agregarVendedor("12","Juan","Lopez","Alberti 2432","24/04/2005",24000);
    gordosOtakus.agregarAdministrador("00001","Franco","Ferro","General Roca 2728","11/10/2002","Informatica");

        System.out.println("Es "+gordosOtakus.sueldosApagar());

    }

}
