package kirill.kopienko;

import kirill.kopienko.dao.*;
import kirill.kopienko.entities.*;
import org.hibernate.Session;


public class App {
    private static final DAORepo daoRepo = new DAORepo();
    public static void main(String[] args) {
        Customer customer = createCustomer();
    }

    private static Customer createCustomer() {
        try (Session session = daoRepo.getSessionFactory().getCurrentSession()) {
            session.beginTransaction();

            Store store = daoRepo.getStoreDAO().getItems(0, 1).get(0);

            City city = daoRepo.getCityDAO().getByName("Acua");

            Address address = new Address();
            address.setAddress("Vernadsky ave, 98/4");
            address.setPhone("7-000-001-01-01");
            address.setCity(city);
            address.setDistrict("UZAO");
            daoRepo.getAddressDAO().create(address);

            Customer customer = new Customer();
            customer.setActive(true);
            customer.setAddress(address);
            customer.setEmail("test@gmail.com");
            customer.setFirstName("NameExmpl");
            customer.setLastName("LastNameExmpl");
            customer.setStore(store);
            daoRepo.getCustomerDAO().create(customer);

            session.getTransaction().commit();
            return customer;
        }
    }
}