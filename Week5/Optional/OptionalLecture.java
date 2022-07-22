import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalLecture {

    public static void main(String[] args) {
        // The Problem
        WorkOrder workOrderFromSomewhereElse = getWorkOrderFromSomewhereElse();

        if (workOrderFromSomewhereElse != null && workOrderFromSomewhereElse.getCustomer() != null
                && workOrderFromSomewhereElse.getCustomer().getLocation() != null
                && workOrderFromSomewhereElse.getCustomer().getLocation().getAddress() != null) {
            sendThankYouNote(workOrderFromSomewhereElse.getCustomer().getLocation().getAddress());
        }

        // How can we make this code less painful?
        Optional<WorkOrder> workOrderOptional = Optional.ofNullable(getWorkOrderFromSomewhereElse());
        // This "wraps" the return value from getWorkOrderFromSomewhereElse() in an
        // Optional object
        // Maybe that wrapped value is null, maybe it isn't.

        // How can we send a thank you note only if the address is not null?

        // How can we throw an Exception if the address is null?

        // How can we send a thank you note to ourselves if the address is null?

        // Let's combine Streams and Optionals!

        Random random = new Random();
        List<Integer> randomIntsBetweenNegativeMillionAndPositiveMillion = Stream
                .iterate(0, s -> random.nextInt(-1_000_000, 1_000_000))
                .limit(100)
                .collect(Collectors.toList());
        // System.out.println(randomIntsBetweenNegativeMillionAndPositiveMillion);

        // How can I get just any individual negative number?




        // What does this code do?
        String r = randomIntsBetweenNegativeMillionAndPositiveMillion.stream().filter(i -> i < 0)
                .filter(i -> i % 2 == 0)
                .map(i -> Math.pow(i, 3))
                .filter(i -> i > 20)
                .map(i -> String.valueOf(i))
                .filter(Predicate.not(s -> s.startsWith("1")))
                .findFirst()
                .orElse("30.0");


        
        // What does this code do?
        int result = Optional.ofNullable(getIntegerList()).stream().flatMapToInt(list -> list.stream().mapToInt(i -> i)).sum();

    }

    private static WorkOrder getWorkOrderFromSomewhereElse() {
        return new WorkOrder(1L, null);
    }

    private static void sendThankYouNote(Address address) {
        // just an example
    }

    private static List<Integer> getIntegerList() {
        return Arrays.asList(1, 2, 3);
    }
}

class WorkOrder {
    private Long id;
    private Customer customer;

    public WorkOrder(Long id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

}

class Customer {
    private String name;
    private String number;
    private Location location;

    public Customer(String name, String number, Location location) {
        this.name = name;
        this.number = number;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public Location getLocation() {
        return location;
    }

}

class Location {
    private String number;
    private Address address;

    public Location(String number, Address address) {
        this.number = number;
        this.address = address;
    }

    public String getNumber() {
        return number;
    }

    public Address getAddress() {
        return address;
    }

}

class Address {
    private String line1;

    public Address(String line1) {
        this.line1 = line1;
    }

    public String getLine1() {
        return line1;
    }

}
