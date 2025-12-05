public class RepositorioEnMemoria implements IRepositorio {

    private Object[] memoria = new Object[10];

    @Override
    public void guardar(Object data) {
        for (int i = 0; i < memoria.length; i++) {
            if (memoria[i] == null) {
                memoria[i] = data;
                System.out.println("Memoria - Guardado en posición " + i + ": " + data);
                return;
            }
        }
        System.out.println("Memoria - ERROR: No hay espacio disponible.");
    }

    @Override
    public Object leer(String id) {
        int index = Integer.parseInt(id);
        if (index >= 0 && index < memoria.length) {
            System.out.println("Memoria - Leyendo posición " + id);
            return memoria[index];
        }
        System.out.println("Memoria - ERROR: ID fuera de rango.");
        return null;
    }

    @Override
    public void eliminar(String id) {
        int index = Integer.parseInt(id);
        if (index >= 0 && index < memoria.length) {
            memoria[index] = null;
            System.out.println("Memoria - Eliminado en posición " + id);
        } else {
            System.out.println("Memoria - ERROR: ID fuera de rango.");
        }
    }
}
