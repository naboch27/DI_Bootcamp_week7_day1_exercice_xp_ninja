/**
 * Particulier
 */
public class Particulier extends Client {

    private String dateNaissance;

    public Particulier(String name) {
        super(name);
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String call() {
        return "Client [name=" + name + "]"+"Entreprise [dateNaissance=" + dateNaissance + "]";
    }

    
}