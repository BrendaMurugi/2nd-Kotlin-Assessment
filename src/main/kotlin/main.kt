fun main() {
    var one = CurrentAccount("12345678","Murugi",100.45)
    one.deposit(50.45)
    one.withdraw(20.9)
    one.details()

    var two = Savingsaccount("12345678","Murugi",100.45, 4)
    two.saveWithdraw(7)

    var pen = Product("Bic", 1.44, 25, "Other")
    var drug = Product("Panadol", 0.5, 10, "Hygiene")
    var food = Product("Rice", 100.4, 10000, "Groceries")
    var compiled = listOf(pen, drug, food)

    println(fruit("banana"))
}

//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”

class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Double) {
    fun deposit(amount:Double) {
        balance += amount
        println("New account balance is $balance.")
    }
    fun withdraw(amount: Double) {
        balance -= amount
        println("Account balance after withdraw is $balance.")
    }
    fun details() {
        println("Account number $accountNumber with balance $balance is operated by $accountName.")
    }
}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal

class Savingsaccount(var accountNumber:String, var accountName:String, var balance:Double, var withdrawals:Int) {
    fun saveWithdraw(times:Int) {
        if (times<withdrawals) {
            withdrawals++
            println("You can withdraw money from your savings account.")
        }
        else{
            println("Withdrawal request denied.")
        }
    }
}


//A product is represented by a data class with these attributes: name,
//weight, price, category. Category can either be groceries, hygiene or
//other. Write a function that takes in a product and uses a when
//statement to assign each product to a list based on its category

data class Product (var name:String, var weight:Double, var price:Int, var category:String)
fun add (product:Product): List<String> {
    var grocery = mutableListOf<String>()
    var hygiene = mutableListOf<String>()
    var other = mutableListOf<String>()
    when (product.category){
        "glocery" -> println(grocery.add(product.name))
        "hygiene" -> println(hygiene.add(product.name))
        "other" -> println(other.add(product.name))

    }
    return grocery
    return hygiene
    return other
}


//Write a function that given a string returns a string composed of only
//the characters in even indices. For example given “banana” it will return
//“bnn"

fun fruit(word:String):String {
        var bure = ""
        for (letter in word) {
            if (word.indexOf(letter)%2==0) {
                bure += letter
            }
        }
        return bure
    }
