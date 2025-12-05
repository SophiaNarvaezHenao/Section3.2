public interface IRepositorio {
    void guardar(Object data);
    Object leer(String id);
    void eliminar(String id);
}
