public class Main {
    
    public static void main(String[] args) {
        
        Entreprise entreprise =new Entreprise("mouhamed");

        Particulier particulier =new Particulier("coulibaly ETS");

        entreprise.setDateCreation("01/01/2000");

        particulier.setDateNaissance("01/01/2020");

        System.out.println(entreprise.call());

        System.out.println(particulier.call());

    }
}
