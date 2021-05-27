public class ProductValidator {
    public boolean isValid(Product product){
        //yapıcı bloglar new ile çalışır
○
        if (product.price>0 && !product.name.isEmpty()){
            return true;
        }else {
            return false;

        }
    }
}
