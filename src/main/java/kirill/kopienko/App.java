package kirill.kopienko;

import kirill.kopienko.dao.*;
import kirill.kopienko.entities.*;
import kirill.kopienko.utils.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
    public static void main( String[] args ) {
        Customer customer = createCustomer();
    }

    public static Customer createCustomer() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Store store = DAORepo.storeDAO.getItems(0, 1).get(0);

            City city = DAORepo.cityDAO.getByName("Acua");

            Address address = new Address();
            address.setAddress("Vernadsky ave, 98/4");
            address.setPhone("7-000-001-01-01");
            address.setCity(city);
            address.setDistrict("UZAO");
            DAORepo.addressDAO.save(address);

            Customer customer = new Customer();
            customer.setActive(true);
            customer.setAddress(address);
            customer.setEmail("test@gmail.com");
            customer.setFirstName("NameExmpl");
            customer.setLastName("LastNameExmpl");
            customer.setStore(store);
            DAORepo.customerDAO.save(customer);

            transaction.commit();
            return customer;
        }
    }
}
