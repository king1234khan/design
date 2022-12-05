package SingletonDesignPattern;

public class Login {

    public void Goo(){
        
        Setting ob = factory.createInstance();
        ob.SetThems("Dark Mode...");
        System.out.println(ob.getThems());
        
  
    }
}
