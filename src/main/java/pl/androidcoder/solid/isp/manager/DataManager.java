package pl.androidcoder.solid.isp.manager;

import java.util.List;

/**
 * Created by Mateusz on 2018-04-08.
 */
public interface DataManager {

    User getUser(int userId);

    User saveUser(User user);

    List<User> findUserByName(String name);

    Invoice getInvoice(String invoiceNumber);

    List<Invoice> findInvoiceByUser(User user);

    List<Invoice> fingInvoiceByOrder(Order order);
}
