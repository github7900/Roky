class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}

class User {
    private String name;
    private int age;

    public User(String name, int age) throws AgeException {
        this.name = name;
        if (age < 0 || age > 120) {
            throw new AgeException("Invalid age");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        try {
            User user1 = new User("John Doe", 25);
            System.out.println("User Name: " + user1.getName());
            System.out.println("User Age: " + user1.getAge());

            User user2 = new User("Jane Smith", 150);  // Invalid age
            System.out.println("User Name: " + user2.getName());
            System.out.println("User Age: " + user2.getAge());
        } catch (AgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
