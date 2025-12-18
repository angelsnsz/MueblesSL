package services;

import features.Client;
import java.util.List;
import repository.ClientRepository;

public class ClientService {

    private final ClientRepository repository;

    public ClientService() {
        this.repository = ClientRepository.getInstance();
    }

    public Client obtenerClientePorNif(String nif) {
        return repository.getClientByNif(nif);
    }

    public List<Client> obtenerTodosLosClientes() {
        // To be implemented
        return repository.getAllClients();
    }

    public void crearCliente(Client client) {
        // Implementar la lógica de creación, validar antes que el nif viene relleno.
        repository.addClient(client);
    }

    public void eliminarCliente(String nif) {
        // To be implemented
        repository.deleteClient(nif);
    }

    public void modificarCliente(Client client) {
        // To be implemented
        repository.updateClient(client);
    }
}