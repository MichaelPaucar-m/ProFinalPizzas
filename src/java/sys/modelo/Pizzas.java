package sys.modelo;
// Generated 18/09/2023 01:17:15 PM by Hibernate Tools 4.3.1



/**
 * Pizzas generated by hbm2java
 */
public class Pizzas  implements java.io.Serializable {


     private Integer idPizzas;
     private String pizzasNombre;
     private Integer pizzaPrecio;
     private String pizzaIngredientes;

    public Pizzas() {
    }

    public Pizzas(String pizzasNombre, Integer pizzaPrecio, String pizzaIngredientes) {
       this.pizzasNombre = pizzasNombre;
       this.pizzaPrecio = pizzaPrecio;
       this.pizzaIngredientes = pizzaIngredientes;
    }
   
    public Integer getIdPizzas() {
        return this.idPizzas;
    }
    
    public void setIdPizzas(Integer idPizzas) {
        this.idPizzas = idPizzas;
    }
    public String getPizzasNombre() {
        return this.pizzasNombre;
    }
    
    public void setPizzasNombre(String pizzasNombre) {
        this.pizzasNombre = pizzasNombre;
    }
    public Integer getPizzaPrecio() {
        return this.pizzaPrecio;
    }
    
    public void setPizzaPrecio(Integer pizzaPrecio) {
        this.pizzaPrecio = pizzaPrecio;
    }
    public String getPizzaIngredientes() {
        return this.pizzaIngredientes;
    }
    
    public void setPizzaIngredientes(String pizzaIngredientes) {
        this.pizzaIngredientes = pizzaIngredientes;
    }




}


