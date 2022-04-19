/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Henrique & Anderson
 * @since 28/06/17 13:48
 * @version 1.0 batata
 */
public class Aluno {

    private String nome;
    private String sexo;
    private int idade;
    private ArrayList<String> discCursadas;
    private double nota1;
    private double nota2;
    private double peso1;
    private double peso2;
    private int totalAulas;
    private double numeroPresencas;

    public Aluno() {
    }

    public Aluno(String nome, String sexo, int idade, ArrayList<String> discCursadas, double nota1, double nota2, double peso1, double peso2, int totalAulas, double numeroPresencas) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.discCursadas = discCursadas;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.peso1 = peso1;
        this.peso2 = peso2;
        this.totalAulas = totalAulas;
        this.numeroPresencas = numeroPresencas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public ArrayList<String> getDiscCursadas() {
        return discCursadas;
    }

    public void setDiscCursadas(ArrayList<String> discCursadas) {
        this.discCursadas = discCursadas;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getPeso1() {
        return peso1;
    }

    public void setPeso1(double peso1) {
        this.peso1 = peso1;
    }

    public double getPeso2() {
        return peso2;
    }

    public void setPeso2(double peso2) {
        this.peso2 = peso2;
    }

    public int getTotalAulas() {
        return totalAulas;
    }

    public void setTotalAulas(int totalAulas) {
        this.totalAulas = totalAulas;
    }

    public double getNumeroPresencas() {
        return numeroPresencas;
    }

    public void setNumeroPresencas(double numeroPresencas) {
        this.numeroPresencas = numeroPresencas;
    }

    /**
     *
     * @return calcula a frequencia do aluno
     * @author Henrique & Anderson
     * @since 28/06/17 13:48
     * @version 1.0 batata
     */
    private double calcularFrequencia() {
        return (100 * numeroPresencas) / totalAulas;

    }

    /**
     *
     * @return calcula a media do aluno
     * @author Henrique & Anderson
     * @since 28/06/17 13:48
     * @version 1.0 batata
     */
    private double calcularMediaAritmetica() {
        return (nota1 + nota2) / 2;
    }

    /**
     *
     * @return calcula a media ponderada do aluno
     * @author Henrique & Anderson
     * @since 28/06/17 13:48
     * @version 1.0 batata
     */
    private double calcularMediaPonderada() {
        return ((nota1 * peso1) + (nota2 * peso2)) / (peso1 + peso2);
    }

    /**
     *
     * @return verifica se o aluno foi aprovado
     * @author Henrique & Anderson
     * @since 28/06/17 13:48
     * @version 1.0 batata
     */
    private String verificarAprovacao() {

        if (calcularMediaAritmetica() >= 6 && calcularFrequencia() >= 75) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    /**
     *
     * @return verifica o conceito do aluno
     * @author Henrique & Anderson
     * @since 28/06/17 13:48
     * @version 1.0 batata
     */
    private String verificarConceito() {
        if (calcularMediaAritmetica() >= 9) {
            return "Conceito A";
        } else if (calcularMediaAritmetica() >= 7 && calcularMediaAritmetica() <= 8.9) {
            return "Conceito B";
        } else if (calcularMediaAritmetica() >= 6 && calcularMediaAritmetica() <= 6.9) {
            return "Conceito C";
        } else {
            return "Conceito D";
        }
    }

    @Override
    public String toString() {

        String x = "";
        for (int i = 0; i < discCursadas.size(); i++) {
            x = x + " " + discCursadas.get(i);

        }
        if (x.equals("")) {
            x = "Nenhum curso escolhido!";
        }

        return "\nNome: " + nome + "\n"
                + "Sexo: " + sexo + "\n"
                + "Idade: " + idade + "\n"
                + "Disciplinas cursadas: " + x + "\n"
                + "Nota 1: " + nota1 + "\n"
                + "Nota 2: " + nota2 + "\n"
                + "Peso 1: " + peso1 + "\n"
                + "Peso 2: " + peso2 + "\n"
                + "Total de aulas: " + totalAulas + "\n"
                + "Numero de presenças: " + numeroPresencas + "\n"
                + "Frequencia: " + calcularFrequencia() + "\n"
                + "Média aritmetica: " + calcularMediaAritmetica() + "\n"
                + "Média ponderada: " + calcularMediaPonderada() + "\n"
                + "Conclusão: " + verificarAprovacao() + "\n"
                + "Conceito do aluno: " + verificarConceito();
    }

}
