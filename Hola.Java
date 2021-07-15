public class Actividad3 {

    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        int contamina = 0, auto= 25;
        int[] valores = new int [auto];
        double total = 0;

        for (int i = 1; i <= auto; i++) {
            System.out.println("Digite cantidad de contaminacion del auto " + i + ":");
            contamina = ent.nextInt();


        int max = valores [0];
        int min = valores[0];
        for(int a = 1; a <= auto; a++){
        if (valores[a]< min) {
            min = valores[a];
             }
        else if(valores[a] > max){
            max = valores[a];
        }

        }
        System.out.println("El carro que mas contamino es :" + max);
        System.out.println("El Carro que menos contamino es :" + min);
        }
    }
} 
