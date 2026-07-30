public class Metodos {

    public static Integer quantidadeVogais(String frase){
        Integer vogais = 0;

        for (int i = 0;i <= frase.length()-1;i++){
            char letra = frase.charAt(i);
            String letraConvertida = String.valueOf(letra);

            if (
                    letraConvertida.equalsIgnoreCase("a")
                            ||letraConvertida.equalsIgnoreCase("e")
                            ||letraConvertida.equalsIgnoreCase("i")
                            ||letraConvertida.equalsIgnoreCase("o")
                            ||letraConvertida.equalsIgnoreCase("u")){
                vogais++;
            }
        }
        return vogais;
    }
}
