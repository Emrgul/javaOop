public class CustomerManager {

    ICustomerDal iCustomerDal;


    public CustomerManager(ICustomerDal iCustomerDal){
        this.iCustomerDal=iCustomerDal;
    }

    public void add(){
        // iş katmanı

        iCustomerDal.add();
    }
}
