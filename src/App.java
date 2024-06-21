import java.math.BigInteger;

public class App {
    public static void main(String[] args) throws Exception {

        Estado estado1 = new Estado(new BigInteger("1"),"Sao Paulo" );
        estado1.setid(BigInteger.valueOf(1));

        Estado estado2 = new Estado(new BigInteger("1"), "São Paulo");
        
        System.out.println(estado1);
        
        System.out.println(estado2);

        System.out.println(estado1.equals(estado2));
        
        
        //  Estado estado2 = new Estado();
         Municipio municipio1 = new Municipio( null, "Nova canaa", null, estado1);
         municipio1.setNome("Nova canaa");
         System.out.println(estado1.toString());
 
        

        
    }
}
