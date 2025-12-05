import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IRepositorio repo;
        String action;
        String sqlAction;
        System.out.println("Bienvenido al sistema de repositorios!");
        String Option = null;
        do {
            System.out.println("Seleccione el tipo de repositorio:\n1. Repositorio en Memoria\n2. Repositorio SQL\n3. Salir");
            Option = sc.nextLine();
            switch (Option) {
                case "1":
                    repo = new RepositorioEnMemoria();
                    do {
                        System.out.println("Selecciona una acción:\n1. Guardar\n2. Leer\n3. Eliminar\n4. Salir");
                         action = sc.nextLine();
                        switch (action) {
                            case "1":
                                System.out.println("Ingresa el dato a guardar:");
                                String data = sc.nextLine();
                                repo.guardar(data);
                                break;
                            case "2":
                                System.out.println("Ingresa el ID a leer:");
                                String readId = sc.nextLine();
                                Object readData = repo.leer(readId);
                                System.out.println("Dato leído: " + readData);
                                break;
                            case "3":
                                System.out.println("Ingresa el ID a eliminar:");
                                String deleteId = sc.nextLine();
                                repo.eliminar(deleteId);
                                break;
                            case "4":
                                System.out.println("Saliendo del repositorio en memoria.");
                                break;
                            default:
                                System.out.println("Acción no válida.");
                        }
                    } while (action != "4");
                    break;
                case "2":
                    repo = new RepositorioSQL();
                    do {
                        System.out.println("Selecciona una acción:\n1. Guardar\n2. Leer\n3. Eliminar \n4. Salir");
                         sqlAction = sc.nextLine();
                        switch (sqlAction) {
                            case "1":
                                System.out.println("Ingresa el dato a guardar:");
                                String sqlData = sc.nextLine();
                                repo.guardar(sqlData);
                                break;
                            case "2":
                                System.out.println("Ingresa el ID a leer:");
                                String sqlReadId = sc.nextLine();
                                Object sqlReadData = repo.leer(sqlReadId);
                                System.out.println("Dato leído: " + sqlReadData);
                                break;
                            case "3":
                                System.out.println("Ingresa el ID a eliminar:");
                                String sqlDeleteId = sc.nextLine();
                                repo.eliminar(sqlDeleteId);
                                break;
                            case "4":
                                System.out.println("Saliendo del repositorio SQL.");
                                break;
                            default:
                                System.out.println("Acción no válida.");
                        }
                    } while (sqlAction != "4");
                    break;
                case "3":
                    System.out.println("Saliendo del sistema. Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
            }
        } while (!Option.equals("3"));

    }
}