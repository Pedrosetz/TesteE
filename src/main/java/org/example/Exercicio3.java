package org.example;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

class Faturamento {
    public int dia;
    public double valor;
}

public class Exercicio3 {
    public static void main(String[] args) {
        String arquivoJson = "C:\\Users\\pheen\\AppData\\Roaming\\JetBrains\\IdeaIC2023.3\\scratches\\scratch.json";

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            List<Faturamento> faturamentos = objectMapper.readValue(new File(arquivoJson), new TypeReference<List<Faturamento>>(){});

            double[] valores = new double[faturamentos.size()];
            int index = 0;
            double somaFaturamento = 0;
            int diasComFaturamento = 0;

            for (Faturamento f : faturamentos) {
                if (f.valor > 0) {
                    valores[index++] = f.valor;
                    somaFaturamento += f.valor;
                    diasComFaturamento++;
                }
            }

            double mediaMensal = diasComFaturamento > 0 ? somaFaturamento / diasComFaturamento : 0;

            double menorFaturamento = Double.MAX_VALUE;
            double maiorFaturamento = Double.MIN_VALUE;

            for (double valor : valores) {
                if (valor > 0) {
                    if (valor < menorFaturamento) {
                        menorFaturamento = valor;
                    }
                    if (valor > maiorFaturamento) {
                        maiorFaturamento = valor;
                    }
                }
            }

            int diasAcimaDaMedia = 0;
            for (Faturamento f : faturamentos) {
                if (f.valor > mediaMensal) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + menorFaturamento);
            System.out.println("Maior valor de faturamento: " + maiorFaturamento);
            System.out.println("Media mensal: " + mediaMensal);
            System.out.println("Numero de dias com faturamento maior que a media mensal: " + diasAcimaDaMedia);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
