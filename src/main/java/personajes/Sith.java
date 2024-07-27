package personajes;

public class Sith extends Personaje {

    public Sith(String nombre) {
        super(nombre);
    }

    @Override
    public void usarFuerza(){
        System.out.println(getNombre()+" esta usando la fuerza del lado oscuro");
    }
}
