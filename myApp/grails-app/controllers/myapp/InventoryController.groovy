package myapp

class InventoryController {

    def index() { 
        render "Olá Mundo!"
    }
    
    def edit() {
        def productName = "Java Como Programar"
        def price = "80"
        [product: productName, price: price]
    }
    
    def list() {
        def allProducts = Product.list()
        [allProducts:allProducts]
    }
}
