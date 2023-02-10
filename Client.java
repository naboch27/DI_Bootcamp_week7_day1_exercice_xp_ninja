/**
 * Client
 */
public class Client {

    protected String name;

    public Client() {
    }

    public Client(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String call() {
        return "Client [name=" + name + "]";
    }

    
    

}