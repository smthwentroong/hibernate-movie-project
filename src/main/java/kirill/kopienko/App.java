package kirill.kopienko;

import kirill.kopienko.dao.*;
import kirill.kopienko.entities.*;
import kirill.kopienko.utils.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class App 
{
    public static final ActorDAO actorDAO;
    public static final AddressDAO addressDAO;
    public static final CategoryDAO categoryDAO;
    public static final CityDAO cityDAO;
    public static final CountryDAO countryDAO;
    public static final CustomerDAO customerDAO;
    public static final FilmDAO filmDAO;
    public static final FilmTextDAO filmTextDAO;
    public static final InventoryDAO inventoryDAO;
    public static final LanguageDAO languageDAO;
    public static final PaymentDAO paymentDAO;
    public static final RentalDAO rentalDAO;
    public static final StaffDAO staffDAO;
    public static final StoreDAO storeDAO;

    static {
        actorDAO = new ActorDAO(Actor.class);
        addressDAO = new AddressDAO(Address.class);
        categoryDAO = new CategoryDAO(Category.class);
        cityDAO = new CityDAO(City.class);
        countryDAO = new CountryDAO(Country.class);
        customerDAO = new CustomerDAO(Customer.class);
        filmDAO = new FilmDAO(Film.class);
        filmTextDAO = new FilmTextDAO(FilmText.class);
        inventoryDAO = new InventoryDAO(Inventory.class);
        languageDAO = new LanguageDAO(Language.class);
        paymentDAO = new PaymentDAO(Payment.class);
        rentalDAO = new RentalDAO(Rental.class);
        staffDAO = new StaffDAO(Staff.class);
        storeDAO = new StoreDAO(Store.class);
    }
    public static void main( String[] args ) {

    }

    public static Customer createCustomer() {
        try (Session session = MySessionFactory.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            Store store = storeDAO.getItems(0, 1).get(0);

            City city = cityDAO.getByName("Acua");

            Address address = new Address();
            address.setAddress("Vernadsky ave, 98/4");
            address.setPhone("7-000-001-01-01");
            address.setCity(city);
            address.setDistrict("UZAO");
            addressDAO.save(address);

            Customer customer = new Customer();
            customer.setActive(true);
            customer.setAddress(address);
            customer.setEmail("test@gmail.com");
            customer.setFirstName("NameExmpl");
            customer.setLastName("LastNameExmpl");
            customer.setStore(store);

            transaction.commit();
            return customer;
        }
    }
}
