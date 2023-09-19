
package sys.dao;

import java.util.List;
import sys.modelo.Pizzas;


public interface PizzaDAO { 
    
    public List <Pizzas> select();
    public void insert (Pizzas pizza); 
    public void update(Pizzas pizza);
    public void delete (Pizzas pizza);
    
}
