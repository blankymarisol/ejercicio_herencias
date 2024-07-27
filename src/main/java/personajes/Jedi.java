package personajes;

public class Jedi extends Personaje {

    public Jedi(String nombre) {
        super(nombre);
    }

    @Override
    public void usarFuerza(){
        System.out.println(getNombre()+" esta usando la fuerza del bien");
    }
}
