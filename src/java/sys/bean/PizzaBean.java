/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sys.bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import javax.faces.bean.ViewScoped;
import sys.dao.PizzaDAO;
import sys.impl.PizzaDAOImpl;
import sys.modelo.Pizzas;

/**
 *
 * @author pc
 */ 
@ManagedBean
@Named(value = "pizzaBean")
@ViewScoped
public class PizzaBean {
    
    private Pizzas pizza = null;
    private List <Pizzas> pizzas = null; 
    

    
    public PizzaBean() {
    }  
    public List<Pizzas> getPizzas() {
        
        PizzaDAO datos = new PizzaDAOImpl();
        this.pizzas = datos.select();
        return pizzas;
    } 
    public void preparePizzas() {
        this.pizza = new Pizzas();
    } 
    
    public void insertPizzas(){
        PizzaDAO datos = new PizzaDAOImpl();
        datos.insert(pizza);
        
    }
    public void updatePizzas(){
        PizzaDAO datos = new PizzaDAOImpl();
        datos.update(pizza);
        this.pizza = new Pizzas();
    }
    public void deletePizzas(){
        PizzaDAO datos = new PizzaDAOImpl();
        datos.delete(pizza);
        this.pizza = new Pizzas();
    }

    public Pizzas getPizza() {
        return pizza;
    }

    public void setPizza(Pizzas pizza) {
        this.pizza = pizza;
    }

    

    public void setPizzas(List<Pizzas> pizzas) {
        this.pizzas = pizzas;
    }
    
    
    
    
}
