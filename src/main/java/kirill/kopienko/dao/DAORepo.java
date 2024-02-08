package kirill.kopienko.dao;

import kirill.kopienko.entities.*;

public class DAORepo {
    public static final ActorDAO actorDAO = new ActorDAO(Actor.class);
    public static final AddressDAO addressDAO = new AddressDAO(Address.class);
    public static final CategoryDAO categoryDAO = new CategoryDAO(Category.class);
    public static final CityDAO cityDAO = new CityDAO(City.class);
    public static final CountryDAO countryDAO = new CountryDAO(Country.class);
    public static final CustomerDAO customerDAO = new CustomerDAO(Customer.class);
    public static final FilmDAO filmDAO = new FilmDAO(Film.class);
    public static final FilmTextDAO filmTextDAO = new FilmTextDAO(FilmText.class);
    public static final InventoryDAO inventoryDAO = new InventoryDAO(Inventory.class);
    public static final LanguageDAO languageDAO = new LanguageDAO(Language.class);
    public static final PaymentDAO paymentDAO = new PaymentDAO(Payment.class);
    public static final RentalDAO rentalDAO = new RentalDAO(Rental.class);
    public static final StaffDAO staffDAO = new StaffDAO(Staff.class);
    public static final StoreDAO storeDAO = new StoreDAO(Store.class);

    private DAORepo() {}
}
