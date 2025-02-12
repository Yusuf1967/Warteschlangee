public class Kunde {
    private Kunde nachfolger;
    public String name;


    public Kunde(String pName){
        this.name = pName;
    }

    public void setNachfolger(Kunde pKunde) {
        nachfolger = pKunde;
    }

    public Kunde getNachfolger() {
        return nachfolger;
    }

    public void setName(String pName){
        name= pName;
    }

    public String getName(){
        return name;
    }

}
