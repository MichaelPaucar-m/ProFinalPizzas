package sys.modelo;
// Generated 18/09/2023 01:17:15 PM by Hibernate Tools 4.3.1



/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private String usuarioNombre;
     private String usuarioPass;

    public Usuario() {
    }

    public Usuario(String usuarioNombre, String usuarioPass) {
       this.usuarioNombre = usuarioNombre;
       this.usuarioPass = usuarioPass;
    }
   
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }
    public String getUsuarioNombre() {
        return this.usuarioNombre;
    }
    
    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }
    public String getUsuarioPass() {
        return this.usuarioPass;
    }
    
    public void setUsuarioPass(String usuarioPass) {
        this.usuarioPass = usuarioPass;
    }




}


