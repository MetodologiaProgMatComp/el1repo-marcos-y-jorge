public class TestAccount2 {
        public static void main(String[] args) {
            // Crear un objeto Customer2
            Customer2 customer = new Customer2(1, "John Doe", 'M');

            // Mostrar los detalles del cliente
            System.out.println("Detalles del Cliente:");
            System.out.println("ID: " + customer.getId());
            System.out.println("Nombre: " + customer.getName());
            System.out.println("Género: " + customer.getGender());
            System.out.println();

            // Crear una cuenta para el cliente
            Account2 account = new Account2(101, customer);

            // Mostrar los detalles de la cuenta
            System.out.println("Detalles de la Cuenta:");
            System.out.println("ID de la Cuenta: " + account.getId());
            System.out.println("Cliente: " + account.getCustomer2Name());
            System.out.println("Saldo: " + account.getBalance());
            System.out.println();

            // Depositar dinero en la cuenta
            account.deposit(1000);

            // Mostrar el saldo después del depósito
            System.out.println("Saldo después del depósito: " + account.getBalance());
            System.out.println();

            // Retirar dinero de la cuenta
            account.withdraw(500);

            // Mostrar el saldo después del retiro
            System.out.println("Saldo después del retiro: " + account.getBalance());
            System.out.println();

            // Intentar retirar más dinero del saldo actual
            account.withdraw(1000);

            // Mostrar el saldo después del intento de retiro
            System.out.println("Saldo después del intento de retiro: " + account.getBalance());
        }
    }
