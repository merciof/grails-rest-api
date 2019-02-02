package myapp

class Customer {
    String firstName
    String lastName
    Long phone
    String email
    Integer totalPoints
    static hasMany  = [awards: Award, orders: Order]
    
    static constraints = {
    }
}
