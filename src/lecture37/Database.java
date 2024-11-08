package lecture37;

public class Database {
    public static void main(String[] args) {
        System.out.println(MySQL.Fields.Dev.devName);
        System.out.println(MySQL.Fields.Dev.devPass);

        MySQL.Fields mysqlRef = new MySQL.Fields();

        MySQL.Fields.QA qaRef = mysqlRef.new QA();
        System.out.println(qaRef.qaName);
        System.out.println(MySQL.Fields.QA.qaPass);


        MySQL.Fields musqlProdRef = new MySQL.Fields();
        MySQL.Fields.Prod prodRef = musqlProdRef.new Prod();
        System.out.println(prodRef.prodName);
        System.out.println(prodRef.prodPass);


    }
}
