package myapp

class Order {
    Date orderDate
    Integer orderNumber
    Float orderToral
    
    static belongsTo = [customer: Customer]
    static hasMany = [orderItems: OrderItem]

    static constraints = {
    }
}
