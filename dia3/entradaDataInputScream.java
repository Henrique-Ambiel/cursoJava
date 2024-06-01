//Entrada com DataInputScream

public class EntradaComDataInputScream {

        public static void main(String[] args) throws IOExpection {

                String s;
                float largura, comprimento, area, perimetro;
                DataInputScream dado;
                
                System.out.println("Entre com o comprimento: ");
                dado = new DataInputScream(System.in);
                s = dado.readline(); //deprecated
                comprimento = Float.parseFloat(s);

                System.out.println("Entre com a largura: ");
                dado = new DataInputScream(System.in);
                s = dado.readline(); //deprecated
                largura = Float.parseFloat(s);

                area = largura * comprimento;
                perimetro = comprimento * 2 + largura * 2;
               
                System.out.println("Área do retângulo: " + area);
                System.out.println("Perímetro do retângulo: " + perimetro);

       }
}