

public class InterfacesCode {
    public static void main(String[] args) {
        OrderRepository orderRepository = new SQLOrderRepository();
        CustomerAlertService customerAlertService = null; // TODO
        OrderService orderService = new OrderService(orderRepository, customerAlertService);
        orderService.createOrder(new CreateOrderDTO());
    }
}

class OrderService {
    private OrderRepository orderRepository;
    private CustomerAlertService customerAlertService;
    
    public OrderService(OrderRepository orderRepository, CustomerAlertService customerAlertService) {
        this.orderRepository = orderRepository;
        this.customerAlertService = customerAlertService;
    }

    public void createOrder(CreateOrderDTO dto) {
        this.orderRepository.save(dto);
        this.customerAlertService.sendAlert(dto.getCustomer());
    }
}

interface CustomerAlertService {
    void sendAlert(Customer customer);
}



//-----NOT IMPORTANT STUFF DOWN BELOW------//

class CreateOrderDTO {
    // Not very important
    // Just represents the incoming information from the client about the order
    private Customer customer;

    public CreateOrderDTO() {
        this.customer = new Customer();
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    
}

class Customer {
    private String name;
    private String phone;
    private String emailAddress;
    private String ediLocation;
    public Customer() {
        this.name = "Tire Brothers";
        this.phone = "555-5555";
        this.emailAddress = "craig@tirebros.com";
        this.ediLocation = "edi_location";
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmailAddress() {
        return emailAddress;
    }
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
    public String getEdiLocation() {
        return ediLocation;
    }
    public void setEdiLocation(String ediLocation) {
        this.ediLocation = ediLocation;
    }
    
}

interface OrderRepository {
    void save(CreateOrderDTO dto);
}

class SQLOrderRepository implements OrderRepository {

    @Override
    public void save(CreateOrderDTO dto) {
        // really not important        
    }

}