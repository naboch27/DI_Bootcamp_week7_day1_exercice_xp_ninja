/**
 * Entreprise
 */
public class Entreprise extends Client{

    private String dateCreation;

    public Entreprise(String name) {
        super(name);
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }
    

   

    @Override
    public String call() {
        return "Client [name=" + name + "]"+"Entreprise [dateCreation=" + dateCreation + "]";
    }

    
    
}