package myapp

class OrderItem {
    String quantity
    Float total
    static belongsTo = [order: Order, product: Product]
    
    static constraints = {
    }
}
