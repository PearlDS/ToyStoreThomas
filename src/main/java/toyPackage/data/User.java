package toyPackage.data;

import javax.persistence.*;

@Entity
public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private String userName;
    private String passWord;
    @OneToOne
    private ShoppingCart shoppingCart;

    public User() {
    }

    public User(String userName, String passWord, ShoppingCart shoppingCart) {
        this.userName = userName;
        this.passWord = passWord;
        this.shoppingCart = shoppingCart;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
}
