package model;

/**
 * @author Eloisa e Maria Eduarda
 */
public class ModelAmizade {
    
    private int          id;
    private ModelUsuario usuario;
    private ModelUsuario amigo;

    public ModelAmizade() {}

    public ModelAmizade(ModelUsuario usuario, ModelUsuario amigo) {
//        this.id = id;
        this.usuario = usuario;
        this.amigo = amigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ModelUsuario getUsuario() {
        return usuario;
    }

    public void setUsuario(ModelUsuario usuario) {
        this.usuario = usuario;
    }

    public ModelUsuario getAmigo() {
        return amigo;
    }

    public void setAmigo(ModelUsuario amigo) {
        this.amigo = amigo;
    }
}
