import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String user = "Zé Pequeno";
        float saldo = 1500.00F;
        int categoria = 0;
        int produto = 0;
        float vlrproduto = 0;

        categorias(saldo, categoria, produto);
}
    public static float validasaldo (float saldo, float vlrproduto){
        if (saldo-vlrproduto < 0){
            System.out.println("Saldo insuficiente");
            return saldo;
        }else{
            saldo -= vlrproduto;
            return saldo;
        }
    }
    public static int categorias (float saldo, int categoria, int produto){
        System.out.println("Categorias: Digite o código da categoria desejada " + "\n" +
                            "Saldo: " + saldo + "\n" +
                            "Armas: 1" + "\n" +
                            "Capacetes: 2" + "\n" +
                            "Coletes: 3" + "\n" +
                            "Snipers: 4" + "\n" +
                            "Granadas: 5" + "\n");
        Scanner scan = new Scanner(System.in);
        categoria = scan.nextInt();

        switch (categoria){
            case 1: armas(saldo, produto, categoria);
            case 2: capacetes(saldo,produto, categoria);
            case 3: coletes(saldo, produto, categoria);
            case 4: snipers(saldo, produto, categoria);
            case 5: granadas(saldo, produto, categoria);
        }

        return 0;
    }
    public static int armas (float saldo, int produto, int categoria){
        System.out.println("Produtos: Digite o código do produto desejado " + "\n" +
                "Saldo: " + saldo + "\n" +
                "MA16: 1" + " Valor: " + "1000.00" + "\n" +
                "M4A1: 2" + " Valor: " +"900.00" + "\n" +
                "AK-47: 3" + " Valor: " +"800.00" + "\n" +
                "FAMAS: 4" + " Valor: " +"700.00" + "\n" +
                "AUG-A1: 5" + " Valor: " +"600.00" + "\n");

        Scanner scan = new Scanner(System.in);
        produto = scan.nextInt();
        categoria = 0;
        float vlrproduto;
        switch (produto){
            case 1:;
                vlrproduto = 1000.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 2:
                vlrproduto = 900.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 3:
                vlrproduto = 800.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 4:
                vlrproduto = 700.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 5:
                vlrproduto = 600.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            default:
                return categorias(saldo, categoria, produto);
        }
    }
    public static int capacetes (float saldo, int produto, int categoria) {
        System.out.println("Produtos: Digite o código do produto desejado " + "\n" +
                "Saldo: " + saldo + "\n" +
                "Cap 1: 1" + " Valor: " + "1000.00" + "\n" +
                "Cap 2: 2" + " Valor: " + "900.00" + "\n" +
                "Cap 3: 3" + " Valor: " + "800.00" + "\n" +
                "Cap 4: 4" + " Valor: " + "700.00" + "\n" +
                "Cap 5: 5" + " Valor: " + "600.00" + "\n");

        Scanner scan = new Scanner(System.in);
        produto = scan.nextInt();
        categoria = 0;
        float vlrproduto;
        switch (produto) {
            case 1:
                vlrproduto = 1000.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 2:
                vlrproduto = 900.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 3:
                vlrproduto = 800.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 4:
                vlrproduto = 700.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 5:
                vlrproduto = 600.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            default:
                return categorias(saldo, categoria, produto);
        }
    }
    public static int coletes (float saldo, int produto, int categoria) {
            System.out.println("Produtos: Digite o código do produto desejado " + "\n" +
                    "Saldo: " + saldo + "\n" +
                    "Col 1: 1" + " Valor: " + "1000.00" + "\n" +
                    "Col 2: 2" + " Valor: " + "900.00" + "\n" +
                    "Col 3: 3" + " Valor: " + "800.00" + "\n" +
                    "Col 4: 4" + " Valor: " + "700.00" + "\n" +
                    "Col 5: 5" + " Valor: " + "600.00" + "\n");

            Scanner scan = new Scanner(System.in);
            produto = scan.nextInt();
            categoria = 0;
            float vlrproduto;
            switch (produto) {
                case 1:
                    vlrproduto = 1000.00F;
                    saldo = validasaldo(saldo, vlrproduto);
                    return categorias(saldo, categoria, produto);
                case 2:
                    vlrproduto = 900.00F;
                    saldo = validasaldo(saldo, vlrproduto);
                    return categorias(saldo, categoria, produto);
                case 3:
                    vlrproduto = 800.00F;
                    saldo = validasaldo(saldo, vlrproduto);
                    return categorias(saldo, categoria, produto);
                case 4:
                    vlrproduto = 700.00F;
                    saldo = validasaldo(saldo, vlrproduto);
                    return categorias(saldo, categoria, produto);
                case 5:
                    vlrproduto = 600.00F;
                    saldo = validasaldo(saldo, vlrproduto);
                    return categorias(saldo, categoria, produto);
                default:
                    return categorias(saldo, categoria, produto);
            }
        }
    public static int snipers (float saldo, int produto, int categoria) {
        System.out.println("Produtos: Digite o código do produto desejado " + "\n" +
                "Saldo: " + saldo + "\n" +
                "Sniper 1: 1" + " Valor: " + "1000.00" + "\n" +
                "Sniper 2: 2" + " Valor: " + "900.00" + "\n" +
                "Sniper 3: 3" + " Valor: " + "800.00" + "\n" +
                "Sniper 4: 4" + " Valor: " + "700.00" + "\n" +
                "Sniper 5: 5" + " Valor: " + "600.00" + "\n");

        Scanner scan = new Scanner(System.in);
        produto = scan.nextInt();
        categoria = 0;
        float vlrproduto;
        switch (produto) {
            case 1:
                vlrproduto = 1000.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 2:
                vlrproduto = 900.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 3:
                vlrproduto = 800.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 4:
                vlrproduto = 700.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 5:
                vlrproduto = 600.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            default:
                return categorias(saldo, categoria, produto);
        }
    }
    public static int granadas (float saldo, int produto, int categoria) {
        System.out.println("Produtos: Digite o código do produto desejado " + "\n" +
                "Saldo: " + saldo + "\n" +
                "Granada 1: 1" + " Valor: " + "1000.00" + "\n" +
                "Granada 2: 2" + " Valor: " + "900.00" + "\n" +
                "Granada 3: 3" + " Valor: " + "800.00" + "\n" +
                "Granada 4: 4" + " Valor: " + "700.00" + "\n" +
                "Granada 5: 5" + " Valor: " + "600.00" + "\n");

        Scanner scan = new Scanner(System.in);
        produto = scan.nextInt();
        categoria = 0;
        float vlrproduto;
        switch (produto) {
            case 1:
                vlrproduto = 1000.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 2:
                vlrproduto = 900.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 3:
                vlrproduto = 800.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 4:
                vlrproduto = 700.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            case 5:
                vlrproduto = 600.00F;
                saldo = validasaldo(saldo, vlrproduto);
                return categorias(saldo, categoria, produto);
            default:
                return categorias(saldo, categoria, produto);
        }
    }
}
