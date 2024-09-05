package org.example;

import java.util.HashMap;
import java.util.Map;

public class Exercicio4 {
    public static void main(String[] args) {
        Map<String, Double> faturamentosDosEstados = new HashMap<>();
        faturamentosDosEstados.put("SP", 67836.43);
        faturamentosDosEstados.put("RJ", 36678.66);
        faturamentosDosEstados.put("MG", 29229.88);
        faturamentosDosEstados.put("ES", 27165.48);
        faturamentosDosEstados.put("Outros", 19849.53);

        double valorTotal = faturamentosDosEstados.values().stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("Percentual de representação por estado: ");
        for (Map.Entry<String, Double> entry : faturamentosDosEstados.entrySet()) {
            String estado = entry.getKey();
            Double valor = entry.getValue();
            Double percentual = (valor / valorTotal) * 100;
            System.out.printf("%s: %.2f%%\n", estado, percentual);
        }
    }
}
