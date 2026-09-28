
package Deneme;
import tr.edu.istiklal.Stock;

public class Deneme {
    
    public static void main(String[] args){
        Stock st = new Stock("ORCL", "Oracle Corporation");

        st.setPreviousClosingPrice(34.5);
        st.setCurrentPrice(34.35);

        System.out.println( st.getSymbol());
        System.out.println( st.getName());
        System.out.println( st.getPreviousClosingPrice());
        System.out.println( st.getCurrentPrice());
        System.out.println( st.getChangePercent());
    }
}
  

