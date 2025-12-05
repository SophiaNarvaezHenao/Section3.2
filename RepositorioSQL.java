public class RepositorioSQL implements IRepositorio {

    @Override
    public void guardar(Object data) {
        System.out.println("SQL - INSERT INTO tabla VALUES ('" + data + "')");
    }

    @Override
    public Object leer(String id) {
        System.out.println("SQL - SELECT * FROM tabla WHERE id = '" + id + "'");
        return "Fake SQL data for id " + id;
    }

    @Override
    public void eliminar(String id) {
        System.out.println("SQL - DELETE FROM tabla WHERE id = '" + id + "'");
    }
}
