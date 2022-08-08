package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
 
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("Descrição Curso Javascript");
        curso2.setCargaHoraria(10);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria Java");
        mentoria.setData(LocalDate.now());

        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp I'm Developing in Java");
        bootcamp.setDescricao("Descrição Bootcamp I'm Developing in Java");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devClara = new Dev();
        devClara.setNome("Clara");
        devClara.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Clara: " + devClara.getConteudosInscritos());
        devClara.progredir();
        devClara.progredir();
        System.out.println("\nAtualização:");
        System.out.println("Conteúdos Inscritos de Clara: " + devClara.getConteudosInscritos());
        System.out.println("Contéudos Concluidos de Clara: " + devClara.getConteudosConcluidos());
        System.out.println("Total de XP: " + devClara.calcularTotalXp());

        System.out.println("-----------------------------------");

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Eduardo: " + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        System.out.println("\nAtualização:");
        System.out.println("Conteúdos Inscritos de Eduardo: " + devEduardo.getConteudosInscritos());
        System.out.println("Contéudos Concluidos de Eduardo: " + devEduardo.getConteudosConcluidos());
        System.out.println("Total de XP: " + devEduardo.calcularTotalXp());

    }
} 