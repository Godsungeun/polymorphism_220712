public class PolymorphismEx {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.buyCoffee(new Americano()); //Coffee 타입의 Americano()를 넣음. 4000원, 아메리카노
        customer.buyCoffee(new CaffeLatte()); //Coffee 타입의 CaffeLatte()를 넣음. 4000원, 아메리카노

        System.out.println("현재 잔액은 " + customer.money + "원 입니다.");
    }
}
class Coffee {
    int price;
    public Coffee(int price){ // 생성자
        this.price = price;
    }
}
class Americano extends Coffee {
    public Americano() {
        super(4000);
    }
    public String toString() { //toString 이라는 메서드 정의
        return "아메리카노";
    }
};
class CaffeLatte extends Coffee {
    public CaffeLatte(){
        super(5000);
    }
    public String toString() {
        return "카페라떼";
    }
};

class Customer {
    int money = 50000;

    /*void buyCoffee(Americano americano) {
        money = money - americano.price; //Coffee 의 자손 타입이라 price를 쓸 수 있음
    }
    void buyCoffee(CaffeLatte caffeLatte){
        money = money - caffeLatte.price;
    }*/
    void buyCoffee(Coffee coffee){
        if (money < coffee.price){
            System.out.println("잔액이 부족합니다.");
        }
        money = money - coffee.price; //상위클래스인 Coffee의 타입을 매개변수로 전달받음
        System.out.println(coffee + "를 구입했습니다.");
    }
}


